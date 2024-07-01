import { request, response, Router } from "express";


class IndexRouter{

    public router: Router = Router();

    constructor(){
        this.config();
    }

    config(): void{
        this.router.get('/hola', (req, res)=>{res.send("Hola mundo")});
    }

}

const indexRouter = new IndexRouter();
export default indexRouter.router;