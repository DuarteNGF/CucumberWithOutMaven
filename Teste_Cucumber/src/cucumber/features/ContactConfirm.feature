Feature: Testar o formulario de conctatos do OLX

  Scenario: Verificar se o formulario é validado sem erros
    Given Entrar no site do olx
    When Clicar no link dos ".//*[@id='lastwrapper']/div/div[2]/div[1]/div[3]/ul/li[4]/a/span"
    And Preencher o formulario
      | Fields       | Value                 |
      | ComoAjudar   | registo_conta         |
      | RegistoConta | como_criar_uma_conta  |
      | Descricao    | Ola eu Sou a Joana    |
      | Email        | joanabanana@joana.com |
      | Nome         | Eu sou a joana        |
    Then Validar a mensagem de sucesso "html/body/div[1]/div/span[2]"
    And Fechar o browser

  Scenario: Verificar o link de como funciona
    Given Entrar no site do olx
    When Clicar no link dos ".//*[@id='lastwrapper']/div/div[2]/div[1]/div[2]/ul/li[1]/a/span"
    Then Validar a mensagem de sucesso ".//*[@id='lastwrapper']/div/div[2]/div[1]/div[2]/ul/li[1]/a/span"
    And Fechar o browser
  #Scenario Outline: Verificar o link de como funciona
  #  Given Entrar no site do olx
  #  When Clicar no link dos <Link>
  #  Then Validar a mensagem de sucesso OLX <Title>
  #  And Fechar o browser
  #
  #  Examples: 
  #    | Link                                                               | Title |
  #    | ".//*[@id='lastwrapper']/div/div[2]/div[1]/div[3]/ul/li[4]/a/span" | "OLX"   |
  #    | ".//*[@id='lastwrapper']/div/div[2]/div[1]/div[2]/ul/li[1]/a/span" | "OLX"   |
