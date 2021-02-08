package dp.exam.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class IObservable {
    public List<IObserver> figs = new ArrayList<>();

    public void add(IObserver o){
        System.out.println("added successfully to obs : u ll get notified once we have a new data!");
        this.figs.add(o);
    }
    public void remove(IObserver o){
        figs.remove(o);
    }
    public void notif(){
        for(IObserver o: figs){
            o.update();
        }
    }

    public abstract void ChangeState(int e, String cc, String cr);


}
