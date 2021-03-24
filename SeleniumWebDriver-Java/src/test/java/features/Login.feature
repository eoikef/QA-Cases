# language: pt
@FeatureLogin
Funcionalidade: Login na aplicação

  @loginInvalido
  Cenário: Tentativa de login com email inválido
    Dado que estou na tela de login
    Quando faço login com email inválido
    Então vejo aviso de erro

  @loginValido @smoketest
  Cenário: Realizar login com email Válido
    Dado que estou na tela de login
    Quando faço login com email válido
    Então vejo a tela de My Account

  @logout
  Cenário: Realizar logout
    Dado que estou na tela de My Account
    Quando clico em Sign out
    Então vejo a tela de Login