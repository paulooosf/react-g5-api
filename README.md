<h1 align="center" style="font-family:verdana;">Projeto de API RESTful</h1>
<h3 style="font-family:verdana;">O projeto foi desenvolvido visando uma Biblioteca, em que a API seria capaz de efetuar operações CRUD (Create, Read, Update e Delete)
 e efetuar validações de dados em um banco de dados, dessa vez sendo o banco H2.</h3>
<p></p>
<p style="font-family:verdana;"> Foram usadas as seguintes tecnologias:
<ul>
	<li style="font-family:verdana;">Spring</li>
	<li style="font-family:verdana;">Java JPA</li>
	<li style="font-family:verdana;">Hibernate</li>
	<li style="font-family:verdana;">Maven</li>
	<li style="font-family:verdana;">Banco H2 SQL</li>
</ul>
</p>
<h1 style="font-family:verdana;">Endpoints</h1>
<p style="font-family:verdana;">Para efetuar as requisições localmente, os endpoints são os seguintes:
<ul>
<h3 style="font-family:verdana;">Listar livros (GET):</h3>
<li style="font-family:verdana;">localhost:8080/livros/lista</li>
<h3 style="font-family:verdana;">Buscar livros (GET):</h3>
<li style="font-family:verdana;">localhost:8080/livros/buscar/{id}</li>
<h3 style="font-family:verdana;">Inserir livro (POST):</h3>
<li style="font-family:verdana;">localhost:8080/livros/inserir</dd>
<h3 style="font-family:verdana;">Alterar livro (PUT):</h3>
<li style="font-family:verdana;">localhost:8080/livros/alterar/{id}</li>
<h3 style="font-family:verdana;">Deletar livro (DELETE):</h3>
<li style="font-family:verdana;">localhost:8080/livros/deletar/{id}</li>
</ul>
<h1></h1>
<i style="font-family:verdana;">OBS: As requisições POST e PUT precisam passar um Json válido em seu corpo.</i>
<p></p>
<i style="font-family:verdana;">OBS²: Susbtituir {id} por uma ID específica de algum livro.</i>