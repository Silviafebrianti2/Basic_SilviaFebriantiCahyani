package condition2;

public class NestedSwitch {

    public String getSelection(int category, int choice) {
        String result;

        switch (category) {
            case 1: // Drinks
                switch (choice) {
                    case 1:
                        result = category + ", You selected: Tea";
                        break;
                    case 2:
                        result = category + ", You selected: Coffee";
                        break;
                    default:
                        result = category + ", Invalid drink choice";
                        break;
                }
                break;

            case 2: // Foods
                switch (choice) {
                    case 1:
                        result = category + ", You selected: Pizza";
                        break;
                    case 2:
                        result = category + ", You selected: Burger";
                        break;
                    default:
                        result = category + ", Invalid food choice";
                        break;
                }
                break;

            default:
                result = category + ", Invalid category";
                break;
        }

        return result;
    }
}
