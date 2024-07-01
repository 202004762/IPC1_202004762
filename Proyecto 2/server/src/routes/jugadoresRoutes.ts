import { request, response, Router } from "express";


const todosJugadores = [
    {
        id: 1,
        nombre: "Lionel", 
        apellido: "Messi", 
        seleccion: "Argentina",
        region: "CONMEBOL",
        imagen: "https://cdn.sofifa.net/players/158/023/23_120.png"
    },
    {
        id: 2,
        nombre: "Angel", 
        apellido: "Di Maria", 
        seleccion: "Argentina",
        region: "CONMEBOL",
        imagen: "https://cdn.sofifa.net/players/183/898/23_120.png"
    },
    {
        id: 3,
        nombre: "Lautaro", 
        apellido: "Martinez", 
        seleccion: "Argentina",
        region: "CONMEBOL",
        imagen: "https://cdn.sofifa.net/players/231/478/23_120.png"
    },
    {
        id: 4,
        nombre: "Giovani", 
        apellido: "Lo Celso", 
        seleccion: "Argentina",
        region: "CONMEBOL",
        imagen: "https://cdn.sofifa.net/players/226/226/23_120.png"
    },
    {
        id: 5,
        nombre: "Rodrigo", 
        apellido: "De Paul", 
        seleccion: "Argentina",
        region: "CONMEBOL",
        imagen: "https://cdn.sofifa.net/players/212/616/23_120.png"
    },
    {
        id: 6,
        nombre: "Ferran", 
        apellido: "Torres", 
        seleccion: "España",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/241/461/23_120.png"
    },
    {
        id: 7,
        nombre: "Alvaro", 
        apellido: "Morata", 
        seleccion: "España",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/201/153/23_120.png"
    },
    {
        id: 8,
        nombre: "Daniel", 
        apellido: "Carvajal", 
        seleccion: "España",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/204/963/23_120.png"
    },
    {
        id: 9,
        nombre: "Sergio", 
        apellido: "Busquets", 
        seleccion: "España",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/189/511/23_120.png"
    },
    {
        id: 10,
        nombre: "Jordi", 
        apellido: "Alba", 
        seleccion: "España",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/189/332/23_120.png"
    },
    {
        id: 11,
        nombre: "Cristiano", 
        apellido: "Ronaldo", 
        seleccion: "Portugal",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/020/801/23_120.png"
    },
    {
        id: 12,
        nombre: "Diego", 
        apellido: "Silva", 
        seleccion: "Portugal",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/224/458/23_120.png"
    },
    {
        id: 13,
        nombre: "Pepe", 
        apellido: "de Lima", 
        seleccion: "Portugal",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/120/533/23_120.png"
    },
    {
        id: 14,
        nombre: "Bernardo", 
        apellido: "Silva", 
        seleccion: "Portugal",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/218/667/23_120.png"
    },
    {
        id: 15,
        nombre: "João", 
        apellido: "Cancelo", 
        seleccion: "Portugal",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/210/514/23_120.png"
    },
    {
        id: 16,
        nombre: "Kylian", 
        apellido: "Mbappe", 
        seleccion: "Francia",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/231/747/23_120.png"
    },
    {
        id: 17,
        nombre: "Karim", 
        apellido: "Benzema", 
        seleccion: "Francia",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/165/153/23_120.png"
    },
    {
        id: 18,
        nombre: "Antoine", 
        apellido: "Griezmann", 
        seleccion: "Francia",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/194/765/23_120.png"
    },
    {
        id: 19,
        nombre: "Paul", 
        apellido: "Pogba", 
        seleccion: "Francia",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/195/864/23_120.png"
    },
    {
        id: 20,
        nombre: "Jules", 
        apellido: "Kounde", 
        seleccion: "Francia",
        region: "UEFA",
        imagen: "https://cdn.sofifa.net/players/241/486/23_120.png"
    },
];

class JugadoresRouter{

    public router: Router = Router();

    constructor(){
        this.config();
    }

    config(): void{
        this.router.get('/todos', (req, res)=>{
            res.send(todosJugadores);
        });

        this.router.get('/nombre/:nombre',(req, res)=>{
            const jugador = this.obtenerJugadorNombre(req.params.nombre);
            res.send(jugador);
        });

        this.router.get('/seleccion/:nombre',(req, res)=>{
            const jugador = this.obtenerJugadorSeleccion(req.params.nombre);
            res.send(jugador);
        });

        this.router.get('/region/:nombre',(req, res)=>{
            const jugador = this.obtenerJugadorRegion(req.params.nombre);
            res.send(jugador);
        });
    }

    obtenerJugadorNombre(nombreBuscado: any):any{
        return todosJugadores.find(dato=>dato.nombre==nombreBuscado);
    }

    obtenerJugadorSeleccion(nombreSeleccion: any):any{
        let tempo = [];
        for (const jugador of todosJugadores) {
            if(jugador.seleccion == nombreSeleccion){
                tempo.push(jugador);
            }
        }
        return tempo;
    }

    obtenerJugadorRegion(nombreRegion: any):any{
        let tempo = [];
        for (const jugador of todosJugadores) {
            if(jugador.region == nombreRegion){
                tempo.push(jugador);
            }
        }
        return tempo;
    }

    

}

const jugadoresRouter = new JugadoresRouter();
export default jugadoresRouter.router;