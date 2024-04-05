public class product implements  Comparable<product>{
    
    String name;
    int id;

    public product(String name, int id){
        this.name = name;
        this.id  = id;
    }

    @Override
    public String toString() {
        return "product [name=" + name + ", id=" + id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        product other = (product) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(product that) {
        return this.id - that.id;
    }

    
    
    
}
