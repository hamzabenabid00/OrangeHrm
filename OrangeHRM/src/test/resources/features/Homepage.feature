Feature: homepage verif menu

Scenario Outline: acceder a chaque menu de la page dacceuil
Given utlisateur est connecter avec le bon user name el le bon password 
When utilisateur est cliquer sur le menu "<menu>"
Then la page de  menu est affiche "<menu>"

Examples:
|menu |
|Admin |
|PIM |
|Leave |
|Time |
|Recruitment |
|My Info |
|Performance |
|Dashboard |
|Directory |
|Maintenance |
|Claim |
|Buzz |

