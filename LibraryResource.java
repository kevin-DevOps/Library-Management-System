
/**
 * The is the parent class of all Library Resources
 */
public class LibraryResource {

    /**
     * name of a library resource, must be unique
     */
    public String resourceName;
    public String getResourceName(){
      return this.resourceName;
    }

    /**
     * unique id of a library resource
     */
    protected int resourceID;
		
		public int type;
    public int type(){
      return this.type;
    }
		
    /**
     *
     * @return gives the unique id of the resource
     */
    public int getResourceID() {
        return this.resourceID;
    }
}
