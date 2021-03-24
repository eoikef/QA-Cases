# SeleniumWebdriver
 É uma ferramenta open-source utilizada para automação de testes funcionais web.

Certifique-se na primeira vez que executar o projeto de autorizar o prompt de segurança do MAC
Não esqueça de baixar todas dependencias do projeto através do Maven.


# Comandos 
### executar testes: mvn clean test -Dbrowser=CHROME_MAC -Dcucumber.options="--tags @FeatureLogin" -Denv.ENVIRONMENT=PRD

### executar relatorio: mvn allure:serve