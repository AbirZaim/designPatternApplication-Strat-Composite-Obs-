package dp.exam.demo;

import java.util.List;

public abstract class IObservable {
    public List<IObserver> figs;

    public void add(IObserver o){
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
