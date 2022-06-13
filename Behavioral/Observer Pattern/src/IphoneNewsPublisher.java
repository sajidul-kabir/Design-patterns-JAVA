import java.util.ArrayList;
import java.util.List;

public class IphoneNewsPublisher {
   private String mainState;
   private List<Observer>observers;

   IphoneNewsPublisher(){
       observers=new ArrayList<Observer>();
   }


    public String getNews(){
        return mainState;
    }
    public void setNews(String news){
    this.mainState=news;
    notifyALLSubcribers();
    }

    private void notifyALLSubcribers() {
       for (Observer observer:observers){
           observer.update();
       }
    }

    public void subscribe(Observer o){
        observers.add(o);
    }
    public void unSubscribe(Observer o){
        observers.remove(o);
    }

    public void getSubcribers(){
        observers.forEach(observer -> System.out.println(observer.getClass()));
    }
    }



