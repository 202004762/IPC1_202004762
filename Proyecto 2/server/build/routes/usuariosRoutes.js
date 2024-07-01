"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const todosUsuarios = [
    {
        Usuario: "IPC1",
        Password: "123"
    },
    {
        Usuario: "IPC2",
        Password: "456"
    },
    {
        Usuario: "IPC3",
        Password: "789"
    }
];
class UsuariosRoutes {
    constructor() {
        this.router = (0, express_1.Router)();
        this.config();
    }
    config() {
        this.router.get('/todos', (req, res) => {
            res.send(todosUsuarios);
        });
    }
}
const usuariosRoutes = new UsuariosRoutes();
exports.default = usuariosRoutes.router;
