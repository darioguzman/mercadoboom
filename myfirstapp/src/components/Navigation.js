import React, { Component } from 'react';


class Navigation extends Component {

    render(){
        return (
            <nav className="navbar navbar-dark bg-dark">
                <a href="#" className="text-white">
                    {this.props.titulo}
                    <span className="badge badge-pill badge-ligth ml-2">
                        {this.props.cant}
                    </span>
                </a>
            </nav>
        );
    };
}

export default Navigation;