
package JuegoZelda;

public class SkullKid extends Personaje implements Habilidad, HabilidadEspecial{
    
    public SkullKid(String nombre) {
        super(nombre, 150, 25);
    }

    @Override
    public void usarHabilidad(Personaje objetivo) {
        System.out.println(this.nombre + " usa habilidad tonada flauta magica: Ataque +20.");
        this.ataque = this.ataque + 20;
    }
    
    @Override
    public void usarHabilidadEspecial(Personaje objetivo) {
       System.out.println(this.nombre + " usa habilidad especial: Mascara Majora's Mask");
       System.out.println("Baile hipnotizador" + (this.ataque = this.ataque + 5));
       System.out.println("Baile hipnotizador" + (this.ataque = this.ataque + 5));
    }
    
}
