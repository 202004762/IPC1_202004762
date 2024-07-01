import express, {Application} from 'express';
import morgan from 'morgan';
import cors from 'cors';
import indexroutes from './routes/indexroutes';
import jugadoresRoutes from './routes/jugadoresRoutes';
import usuarioRoutes from './routes/usuariosRoutes';


class Server{

    public app: Application;
    public puerto: string = "3000";
    

    constructor(){
        this.app = express();
        this.config();
        this.routes();
    }

    config(): void{
        this.app.set('port', 3000);
        this.app.use(morgan('dev'));
        this.app.use(cors());
        this.app.use(express.json());
        this.app.use(express.urlencoded({extended:false}));
    }

    routes(): void{
        this.app.use('/', indexroutes);
        this.app.use('/jugadores', jugadoresRoutes);
        this.app.use('/usuarios', usuarioRoutes);
    }

    start(): void{
        this.app.listen(this.app.get('port'), () =>{
            console.log('El servidor se esta ejuctando en el puerto', this.app.get('port'))
        });
    }

}

const server = new Server();
server.start();