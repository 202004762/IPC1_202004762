import { request, response, Router } from "express";

const todosUsuarios= [
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

class UsuariosRoutes{

    public router: Router = Router();

    constructor(){
        this.config();
    }

    config(): void{
        this.router.get('/todos', (req, res)=>{
            res.send(todosUsuarios);
        });
    }

}

const usuariosRoutes = new UsuariosRoutes();
export default usuariosRoutes.router;