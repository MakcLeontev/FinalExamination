package Animals;

import java.util.List;

public class Donkey extends PackAnimals {
    public Donkey(long id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(String birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public List<String> getCommands() {
        return super.getCommands();
    }

    @Override
    public void setCommands(List<String> commands) {
        super.setCommands(commands);
    }

    @Override
    public String toString() {
        return super.getId()+" Donkey" +
                " name='" + super.getName() + '\'' +
                ", birthday='" + super.getBirthday() + '\'';
    }
}
