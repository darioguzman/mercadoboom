import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Navigation from './components/Navigation';
import {tareas} from './task.json';

class App extends Component {
  
  constructor(){
    super();
    this.state = {
      tareas
    };
  }
  render() {
    
    const tareas = this.state.tareas.map((tarea,i) => {
      return (
        <div className="col-md-4">
          <div className="card mt-4">
            <div className="card-header">
              <h3>{tarea.titulo}</h3>
              <span className="badge badge-pill badge-danger ml-2" >
                {tarea.prioridad}
              </span>
            </div>
            <div className="card-body">
              <p>{tarea.descripcion}</p>
              <p><mark>{tarea.responsable}</mark></p>
            </div>
          </div>
        </div>
      )
    })

    return (
      <div className="App">
        <Navigation titulo="Tareas" cant={this.state.tareas.length}/>
        <img src={logo} className="App-logo" alt="logo" />

        <div className="container">
          <div className="row mt-4">
            { tareas }
          </div>
        </div>
      </div>
    );
  }
}

export default App;
