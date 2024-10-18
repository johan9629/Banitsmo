#language: es
Característica: Descargar documento CAC
  Como usuario de la banistmo
  Quiero poder descargar el documento de cuentas de ahorro comercial (CAC)
  Para poder visualizarlo en mi equipo de computo

  Escenario: Descargar documento CAC
    Dado que el usuario ingreso a banistmo
    Cuando descargue el documento al ingresar en el modulo de cuenta de ahorro comercial en la ruta empresas/Productos&servicios/depositos
    Entonces debe abrir una nueva ventana con el documento "Contrato Único de Productos y Servicios Bancarios"