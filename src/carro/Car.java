package carro;

/**
 *
 * @author Estudiante
 */
public class Car {
    private String marca;
    Wheel [] front;
    Wheel [] rear;
    Engire m;

    public Car(String marca, Wheel[] front, Wheel[] rear) {
        this.marca = marca;
        //Agregacion
        this.front = front;
        this.rear = rear;
        
        //Composicion
        this.m = new Engire ("Honda",11000);
        
        this.m.setAxle(rear);
        for(int i = 0;i< this.rear.length ; i++)
        this.rear[i].setAxle(m);
      
    }

    @Override
    public String toString() {
        return "Car{" + "marca=" + marca + ", front=" + front + ", rear=" + rear + ", m=" + m + '}';
    }
    
    
}

