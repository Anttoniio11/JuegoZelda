
package JuegoZelda;

public class Sheik extends Personaje implements Habilidad, HabilidadEspecial{
    
     public Sheik(String nombre) {
        super(nombre, 180, 15);
    }

     @Override
    public void usarHabilidad(Personaje objetivo) {
        System.out.println(this.nombre + " usa habilidad flecha de luz: Ataque de +30.");
        this.ataque = this.ataque + 30;
    }
    
     @Override
    public void usarHabilidadEspecial(Personaje objetivo) {
        System.out.println(this.nombre + " usa habilidad especial: Melodia Requiem del Espiritu 40 de salud.");
        this.salud = this.salud + 40;
       
               
    }
    
}
