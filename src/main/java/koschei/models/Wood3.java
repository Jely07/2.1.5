package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private Rabbit4 rabbit;

    public Rabbit4 getRabbit() {
        return rabbit;
    }
    @Autowired
    public void setRabbit(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return "в сундуке — заяц, " + rabbit.toString();
    }
}
