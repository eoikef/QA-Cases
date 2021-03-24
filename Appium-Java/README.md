run test: mvn clean test -Dcucumber.options="--tags @addiction" -Ddev.DEVICE=ANDROID -Denv.ENVIRONMENT=PRD

report: mvn allure:serve