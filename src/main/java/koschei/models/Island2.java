package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {

    private final Wood3 wood;

    @Autowired
    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "под дубом сундук зарыт, " + wood.toString();
    }
}
