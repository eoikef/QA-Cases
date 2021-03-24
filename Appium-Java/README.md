
# Appium
 É uma ferramenta open-source utilizada para automação de testes funcionais mobile em plataforma IOS e Android.
Utilizando page object com annotations, conseguimos automatizar ambas plataformas na mesma Screen, resolvendo problemas antigos de Screens duplicadas.

Para configurar seu device, edite o arquivo AndroidDevice.json com as suas capabilities.
Não esqueça de baixar todas dependencias do projeto através do Maven.


# Comandos 
### executar testes: mvn clean test -Dcucumber.options="--tags @addiction" -Ddev.DEVICE=ANDROID -Denv.ENVIRONMENT=PRD

### executar relatorio: mvn allure:serve