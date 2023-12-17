package App;

public class Course {
    private int courseId;
    private String cityFrom;
    private String cityTo;
    private String date;
    private String hour;
    
    public Course(int courseId, String cityFrom, String cityTo, String date, String hour) {
        this.courseId = courseId;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.date = date;
        this.hour = hour;
    }
    
     public Course(String cityFrom, String cityTo, String date, String hour) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.date = date;
        this.hour = hour;
    }
    
    public int getCourseId() {
        return this.courseId;
    }
    
    public String getcityFrom() {
        return cityFrom;
    }
    
    public String getCityTo() {
        return this.cityTo;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public String getHour() {
        return this.hour;
    }
    
    public Object[] toArray()
    {
        return new Object[]{this.cityFrom, this.cityTo, this.date, this.hour};
    }
}
