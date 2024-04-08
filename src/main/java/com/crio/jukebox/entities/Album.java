package com.crio.jukebox.entities;

public class Album extends BaseEntity{
    private final String name;

    //constructors
    public Album(String name){
        this.name = name;
    }

    public Album(String id, String name){
        this(name);
        this.id = id;
    }

     //Getters
     public String getName(){
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Album other = (Album) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Album [name=" + name + "]"; 
    }
    
}
