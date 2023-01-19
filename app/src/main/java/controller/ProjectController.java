package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class ProjectController {
    public void save(Project projects){
        String sql = "INSERT INTO projects (name"
                + "description,"
                + "createdAt,"
                + "updatedAt) VALUES(?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            //Estabelecendo a conex�o com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement (sql);
            //Setando os valores do statement
            statement.setString(1, projects.getName());
            statement.setString(2, projects.getDescription());
            statement.setDate(3, new Date(projects.getCreatedAt().getTime()));
            statement.setDate(4, new Date(projects.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex){
            throw new RuntimeException("Erro ao salvar o projeto" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection, statement);
        }
    }
    
    public void update(Project project){
        String sql = "UPDATE projects SET "
                + "name = ?, "
                + "description = ?, "
                + "createdAt = ?, "
                + "updatedAt = ?, "
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            //Estabelecendo a conex�o com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement (sql);
            //Setando os valores do statement
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            //Executando a query
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o projeto" + ex.getMessage(), ex);
        }
    }
    
    public void removeById(int projectId) throws SQLException{
        String sql = "DELETE FROM projects WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Estabelecendo a conex�o com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement(sql);
            //Setando os valores do statement
            statement.setInt(1, projectId);
            //Executando a query
            statement.execute();
        } catch (Exception ex){
            throw new RuntimeException("Erro ao deletar o projeto" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection, statement);
        }
    }
    
    public List<Project> getAll(int idProject){
        
        String sql = "SELECT * FROM projects WHERE idProject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        //Lista de tarefas que ser� devolvida quando a chamada do m�todo acontecer
        List<Project> tasks = new ArrayList<Project>();
        
        try{
            //Estabelecendo a conex�o com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement (sql);
            //Setando os valores que corresponde ao filtro da busca
            statement.setInt(1, idProject);
            //Valor retornado pelo query
            resultSet = statement.executeQuery();
            
            //Enquanto houverem valores a serem percorridos no meu resultSet
            while(resultSet.next()){
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                tasks.add(project);
            }
        } catch (Exception ex){
            throw new RuntimeException("Erro ao inserir o projeto" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) connection, statement, resultSet);
        }
        //Lista de tarefas que foi criada e carregada do banco de dados
        return tasks;
    }
}
