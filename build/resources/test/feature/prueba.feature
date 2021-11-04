#languaje:es
  Feature: yo como usuario del servicio quiero cargar un archivo

    Scenario: Cargar archivo
      Given ingresar a la url
      When cargar archivo
      Then el archivo será cargado