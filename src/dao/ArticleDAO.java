package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entities.Article;

public class ArticleDAO {
public Article ajouter(Article a){
 Connection connection = ConnectionBD.getConnection();
try {
 PreparedStatement ps= connection.prepareStatement
 ("INSERT INTO article(nomArticle,prixArticle,qteArticle) Values(?,?,?)");
 //Affectation premiere valeur du premier param�tre : nomArticle
 ps.setString(1,a.getNomArticle());
 //Affectation deuxi�me valeur du deuxi�me param�tre : prixArticle
 ps.setDouble(2, a.getPrixArticle());
 //Affectation troisi�me valeur du troisi�me param�tre : qteArticle
 ps.setDouble(3, a.getQteArticle());
 //Ex�cution de la requ�te SQL
 ps.executeUpdate();
 //R�cup�ration de l'idArticle depuis la base de donn�es
 PreparedStatement ps2= connection.prepareStatement
 ("Select Max(idArticle) AS CodeMAX from Article ");
 ResultSet rs=ps2.executeQuery();
 if (rs.next()){
 //Affectation de l'idArticle l'objet Article
 a.setIdArticle(rs.getInt("CodeMAX"));
 }
 ps.close();

 } catch (SQLException e) {
 // TODO Auto-generated catch block
	 e.printStackTrace();
 }
//R�sultat du retour
return a;

}
public List<Article> listerTous(){
 Connection connection = ConnectionBD.getConnection();
 List<Article> articles= new ArrayList<Article>();

try {
 PreparedStatement ps= connection.prepareStatement("Select * from Article");
 //Ex�cution de la requ�te SQL et r�cup�ration du r�sultat
 ResultSet rs=ps.executeQuery();
 while(rs.next()){
 Article a= new Article( );
 a.setIdArticle(rs.getInt("IdArticle"));
 a.setNomArticle(rs.getString("NomArticle"));
 a.setPrixArticle( rs.getDouble("PrixArticle"));
 a.setQteArticle(rs.getDouble("QteArticle"));
 articles.add(a);
 }
 ps.close();
 } catch (SQLException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }

//R�sultat du retour
return articles;

}
public List<Article> RechercheParMot(String mot){
 Connection connection = ConnectionBD.getConnection();
 List<Article> articles= new ArrayList<Article>();
try {
 PreparedStatement ps= connection.prepareStatement("Select * from Article  Where NomArticle like ?");
 //Affectation premiere valeur du premier param�tre : nomArticle
 ps.setString(1,"%"+mot+"%");
 //Ex�cution de la requ�te SQL et r�cup�ration du r�sultat
 ResultSet rs=ps.executeQuery();
 while(rs.next()){
 Article a= new Article( );
 a.setIdArticle(rs.getInt("IdArticle"));
 a.setNomArticle(rs.getString("NomArticle"));
 a.setPrixArticle( rs.getDouble("PrixArticle"));
 a.setQteArticle(rs.getDouble("QteArticle"));
 articles.add(a);
 }
 ps.close();
 } catch (SQLException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
//R�sultat du retour
return articles;

}
} 