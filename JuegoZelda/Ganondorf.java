
package JuegoZelda;

public class Ganondorf extends Personaje implements Habilidad, HabilidadEspecial {
    
    public Ganondorf(String nombre) {
        super(nombre, 250, 25);
    }

    @Override
    public void usarHabilidad(Personaje objetivo) {
        System.out.println(this.nombre + " usa habilidad de magia negra: Ataque de +20.");
        this.ataque = this.ataque + 20;
    }
    
    @Override
    public void usarHabilidadEspecial(Personaje objetivo) {
       System.out.println(this.nombre + " usa habilidad especial: Demonio Ganon 20 de salud, ataque de +20.");
       this.salud = this.salud + 20;
       this.ataque = this.ataque + 20;
    }
    
}
