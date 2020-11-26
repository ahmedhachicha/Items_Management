package entities;
import java.io.Serializable;
public class Article implements Serializable {
private static final long serialVersionUID = 1L;
int idArticle;
String nomArticle;
Double prixArticle;
Double qteArticle;
public Article() {
super();
}
public Article(String nomArticle, Double prixArticle, Double qteArticle) {
super();
this.nomArticle = nomArticle;
this.prixArticle = prixArticle;
this.qteArticle = qteArticle;
}
public int getIdArticle() {
return idArticle;
}
public void setIdArticle(int idArticle) {
this.idArticle = idArticle;
}
public String getNomArticle() {
return nomArticle;
}
public void setNomArticle(String nomArticle) {
this.nomArticle = nomArticle;
}
public Double getPrixArticle() {
return prixArticle;
}
public void setPrixArticle(Double prixArticle) {
this.prixArticle = prixArticle;
}
public Double getQteArticle() {
return qteArticle; 
}
public void setQteArticle(Double qteArticle) {
this.qteArticle = qteArticle;
}
}