 class GirlFriend1{
    private String Name;
    private int Height;
    private String Skin_colour;
    private String MotherLand;
    private String Hobby;
    public  GirlFriend1(String name,int height,String Skin_colour,String MotherLand,String hobby){
        this.Name = name;
        this.Height = height;
        this.Skin_colour = Skin_colour;
        this.MotherLand = MotherLand;
        this.Hobby = hobby;
    }
    public void printstr(String str1,String details){
        System.out.println("\""+str1+":\"\""+details+"\",");}
    public void printint(String str2,int numbers){
        System.out.println("\""+ str2+"：\""+numbers+",");
    }
    public String getName(){
        return this.Name;
    }
    public int getHeight(){
        return this.Height;
    }
    public String getSkin_colour(){
        return this.Skin_colour;
    }
    public String getMotherLand(){
        return this.MotherLand;
    }
    public String gethobby(){
        return this.Hobby;
    }
}
class printgf{
    static void GirlFriend1(){
        GirlFriend1 gf = new  GirlFriend1("Alice",165,"a_little_white","Japan","Love_me");
        gf.printstr("name",gf.getName());
        gf.printint("height",gf.getHeight());
        gf.printstr("Skin_colour",gf.getSkin_colour());
        gf.printstr("MotherLand",gf.getMotherLand());
        gf.printstr("hobby",gf.gethobby());
    }
    public static void main(String args[]){
        GirlFriend1();
    }
}