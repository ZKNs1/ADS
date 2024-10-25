// src/components/Login.js
import React, { useState } from 'react';

const Login = () => {
  const [usuario, setUsuario] = useState('');
  const [senha, setSenha] = useState('');

  const handleLogin = () => {
    // Implementar lógica de autenticação
  };

  return (
    <div>
      <h2>Login</h2>
      <form onSubmit={handleLogin}>
        <label>Usuário:</label>
        <input type="text" value={usuario} onChange={(e) => setUsuario(e.target.value)} />
        <label>Senha:</label>
        <input type="password" value={senha} onChange={(e) => setSenha(e.target.value)} />
        <button type="submit">Entrar</button>
      </form>
      <a href="#">Esqueci a senha</a>
    </div>
  );
};

export default Login;
