package DataDriven.DataDrivenTest;

public class Book {
    private String title;
    private String author;
    private String other;
    private String rajendra;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;

    @Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", other=" + other + ", rajendra=" + rajendra + ", a1="
				+ a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + ", a5=" + a5 + ", a6=" + a6 + ", price=" + price
				+ "]";
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getA5() {
		return a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	public String getA6() {
		return a6;
	}

	public void setA6(String a6) {
		this.a6 = a6;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getRajendra() {
		return rajendra;
	}

	public void setRajendra(String rajendra) {
		this.rajendra = rajendra;
	}

	private double price;
 
    public Book() {
    }
 
   


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
 
}