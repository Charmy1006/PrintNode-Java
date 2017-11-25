
public class PrintjobOptions {

	String paper;

	String dpi;

	String copies;
	


	public PrintjobOptions(String paper, String dpi, String copies) {
		super();
		this.paper = paper;
		this.dpi = dpi;
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "PrintjobOptions [paper=" + paper + ", dpi=" + dpi + ", copies=" + copies + "]";
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	public String getCopies() {
		return copies;
	}

	public void setCopies(String copies) {
		this.copies = copies;
	}

}
