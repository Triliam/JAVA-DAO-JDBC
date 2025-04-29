##DAO (Data Access Object)
<br>

Objetos responsáveis por fazer acesso as respectivas entidades do banco. 

Cada objeto DAO é definido por uma Interface - garante acesso a qualquer gerenciador de banco de dados(MySQL, Oracle) ou tecnologias (JDBC, ORM).

Entidades: 
- Seller
- Department
  <br>

Para cada Entidade um objeto responsável pelo acesso a tabela no banco de dados:

- DepartmentDao (Interface)
  
    -insert;
  
    -update;
  
    -delete;
  
    -findById;
  
    -findAll.
  
- SellerDao (Interface)
  
    -insert;
  
    -update;
  
    -delete;
  
    -findById;
  
    -findAll.
  
DaoFactory: O programa depender apenas da interface (como SellerDao) e não conhecer a implementação concreta (como SellerDaoJDBC) está na aplicação do princípio da inversão de dependência (Dependency Inversion Principle), que faz parte dos princípios SOLID da programação orientada a objetos
<br>

Implementação:
- DepartmentDaoJDBC
- SellerDaoJDBC

