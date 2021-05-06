//Récuperer les div en var
var btnPopupInscription = document.getElementById('btnPopupInscription');
var btnPopupConnexion = document.getElementById('btnPopupConnexion');

var overlay = document.getElementById('overlay');

var inscription = document.getElementById('inscription');
var connexion = document.getElementById('connexion');


var btnCloseInscription = document.getElementById('btnCloseInscription');
var btnCloseConnexion = document.getElementById('btnCloseConnexion');

btnPopupInscription.addEventListener('click',openPopupInscription);
btnPopupConnexion.addEventListener('click',openPopupConnexion);

btnCloseInscription.addEventListener('click',closePopup);
btnCloseConnexion.addEventListener('click',closePopup);


function openPopupInscription(){
    overlay.style.display = 'block';
    inscription.style.display ='block';
    inscription.style.display ='flex';


}
function openPopupConnexion(){
    overlay.style.display = 'block';
    connexion.style.display='block';
    connexion.style.display ='flex';
}

function closePopup(){
    overlay.style.display = 'none';
}

