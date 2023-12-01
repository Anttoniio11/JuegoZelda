
package JuegoZelda;

public class PrincesaZelda extends Personaje implements Habilidad, HabilidadEspecial{
    
    public PrincesaZelda(String nombre) {
        super(nombre, 150, 30);
    }

    @Override
    public void usarHabilidad(Personaje objetivo) {
       System.out.println(this.nombre + " usa habilidad flecha de luz: Ataque de +20.");
        this.ataque = this.ataque + 20;
    }
    
    @Override
    public void usarHabilidadEspecial(Personaje objetivo) {
       System.out.println(this.nombre + " usa habilidad especial: Poderes magicos de la diosa Nayru 30 de salud, ataque de +30.");
       this.salud = this.salud + 30;
       this.ataque = this.ataque + 30;
       
    }
    
}
