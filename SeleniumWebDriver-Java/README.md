run test: mvn clean test -Dbrowser=CHROME_MAC -Dcucumber.options="--tags @FeatureLogin" -Denv.ENVIRONMENT=PRD


run report: mvn allure:serve