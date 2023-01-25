package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

public class TaskController {
    
    public void save(Task task){
        String sql = "INSERT INTO tasks (idProject,"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement (sql);
            //Setando os valores do statement
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao salvar a tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection, statement);
        }
    }
    
    public void update(Task task){
        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?, notes = ?, completed = ?, deadline = ?, createdAt = ?, updatedAt = ? WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement (sql);
            //Setando os valores do statement
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            //Executando a query
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + ex.getMessage(), ex);
        }
    }
    
    public void removeById(int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement(sql);
            //Setando os valores do statement
            statement.setInt(1, taskId);
            //Executando a query
            statement.execute();
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection, statement);
        }
    }
    
    public List<Task> getAll(int idProject){
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        //Lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Task> tasks = new ArrayList<>();
        
        try{
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement (sql);
            //Setando os valores que corresponde ao filtro da busca
            statement.setInt(1, idProject);
            //Valor retornado pelo query
            resultSet = statement.executeQuery();
            
            //Enquanto houverem valores a serem percorridos no meu resultSet
            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                tasks.add(task);
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao buscar a tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection, statement, resultSet);
        }
        //Lista de tarefas que foi criada e carregada do banco de dados
        return tasks;
    }
}