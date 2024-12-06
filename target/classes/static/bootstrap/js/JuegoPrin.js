document.querySelector('.jugador').addEventListener('click', function() {
    alert("¡Contenedor clickeado!");
});

function tirarDados() {
    const dado1 = Math.floor(Math.random() * 6) + 1;
    const dado2 = Math.floor(Math.random() * 6) + 1;
    const dado3 = Math.floor(Math.random() * 6) + 1;
    const dado4 = Math.floor(Math.random() * 6) + 1;
    const dado5 = Math.floor(Math.random() * 6) + 1;
    // Mostrar los números en los elementos correspondientes
    document.getElementById('dado1').textContent = dado1;
    document.getElementById('dado2').textContent = dado2;
    document.getElementById('dado3').textContent = dado3;
    document.getElementById('dado4').textContent = dado4;
    document.getElementById('dado5').textContent = dado5;
    // Calcular y mostrar el resultado
    const resultado = dado1 + dado2 + dado3 + dado4 + dado5;
    document.getElementById('resultado').textContent = resultado;
}