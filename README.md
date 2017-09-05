# springmvchibernatejavabased

Just build the project deploy the war generated in the target folder and than just hit the 

localhost:8080/springmvchibernatejavabased/ = {IP+PORT}+/springmvchibernatejavabased/


you need a mysql db for this 
or you can change the configuration in ApplicationContextConfig  inside getHibernateProperties & getDataSource method.

Clone the project 

move to the directory where pom.xml exsist

run the clean build command "mvn clean install"

after successful build you can now see a target folder 

navigate to the target folder copy the generated .war file 


copy the generated .war file into the webapp folder of the tomcat.

start the tomcat and hit

localhost:8080/springmvchibernatejavabased/demo/returnjson