package propertyexample;
 
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
 
public class PropertyExample {
     
    private ObjectProperty<String> value;
     
    public PropertyExample() {
        this.value = new SimpleObjectProperty<String>(this, "value");
    }
     
    public ObjectProperty<String> getValueProperty() {
        return this.value;
    }
     
    public final void setValue(String stringValue) {
        this.value.set(stringValue);
    }
     
    public final String getValue() {
        return this.value.get();
    }
     
    public static void main(String[] args) {
        final PropertyExample example = new PropertyExample();
         
        example.getValueProperty().addListener(new InvalidationListener() {
             
            @Override
            public void invalidated(Observable o) {
                ObjectProperty<String> property = (ObjectProperty<String>) o;
                System.out.println("current value: " + property.get());
            }
        });
         
        //assign String instance with a value of 'a' and fire InvalidationListener
        example.setValue(new String("a"));
        //assign String instance with a value of 'a' and fire InvalidationListener
        example.setValue(new String("a"));
    }
}