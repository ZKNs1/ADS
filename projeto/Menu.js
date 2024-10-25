// src/components/Menu.js
import React from 'react';
import { Link } from 'react-router-dom';

const Menu = () => {
  return (
    <div>
      <header>
        <nav>
          <Link to="/dashboard">Dashboard</Link>
          <Link to="/relatorio">Relatórios</Link>
          <Link to="/menu">Menu</Link>
          <button onClick={() => {/* logout logic */}}>Logout</button>
        </nav>
      </header>
      <section>
        <h2>Visão Geral</h2>
        <div>
          {/* Mostrar visão de processos do dashboard */}
        </div>
        <h2>Relatórios Recentes</h2>
        <div>
          {/* Mostrar relatórios recentes */}
        </div>
        <h2>Acompanhamento de Produção</h2>
        <div>
          {/* Mostrar etapa atual da produção */}
        </div>
      </section>
    </div>
  );
};

export default Menu;
