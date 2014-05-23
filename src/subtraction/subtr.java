package subtraction;
/**
 * @author Anastasia
 */
public class subtr {
    private final int value;     
    
    public subtr(int v){
          value = v;          
    }
        public subtr sub(subtr v1){
        return new subtr (value-v1.getValue());
    }
    public int getValue(){
        return value;
    }
    @Override
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        subtr other = (subtr) obj;
        return value == other.value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.value;
        return hash;
    }
}
