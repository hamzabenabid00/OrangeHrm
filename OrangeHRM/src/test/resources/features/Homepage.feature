Feature: homepage verif menu

Scenario: acceder a chaque menu de la page dacceuil
Given utlisateur est connecter avec le bon user name el le bon password 
When utilisateur est cliquer sur le menu "Admin"
Then la page de  menu est affiche "Admin"

