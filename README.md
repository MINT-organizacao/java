# .JAR EXECUTÁVEL
Para criar um arquivo .jar é necessário fazer a configuração no pom.xml e adicionar um plugin nesse caso o "Maven Shade Plugin":
<h1>Exemplo Abaixo:</h1>

```
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.3.0</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                    <configuration>
                        <transformers>
                            <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                <mainClass>NOME_COMPLETO_DA_CLASSE</mainClass>
                            </transformer>
                        </transformers>
                        <filters>
                            <filter>
                                <artifact>*:*</artifact>
                                <excludes>
                                    <exclude>**/Log4j*.class</exclude>
                                    <exclude>**/META-INF/*.SF</exclude>
                                    <exclude>**/META-INF/*.DSA</exclude>
                                    <exclude>**/META-INF/*.RSA</exclude>
                                </excludes>
                            </filter>
                        </filters>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
Após isso ele vai gerar uma pasta chamada TARGET e dentro dela estará contida o nosso arquivo.jar
<br>
OBS: Alterar na tag "<mainClass" para o nome da classe por exemplo: "school.sptech.Main"
<h1>E como executar?</h1>
Precisamos rodar no terminal do intelliJ o seguinte comando:

```
java -jar <nome-do-arquivo-.jar>

```
Após isso os métodos do código e a lógica serão executados!
- Victor Vilefort 1CCOB

