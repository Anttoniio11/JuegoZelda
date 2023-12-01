
package JuegoZelda;

public class Link extends Personaje implements Habilidad, HabilidadEspecial {
    
    public Link(String nombre) {
        super(nombre, 200, 20);
    }

    @Override
    public void usarHabilidad(Personaje objetivo) {
         System.out.println(this.nombre + " usa habilidad maestria en armas: Ataque de +30.");
        this.ataque = this.ataque + 10;
    }
    
    @Override
    public void usarHabilidadEspecial(Personaje objetivo) {
        System.out.println(this.nombre + " usa habilidad especial: Posion de curacion +40 de salud.");
        this.salud = this.salud + 40;
    }
    
}
