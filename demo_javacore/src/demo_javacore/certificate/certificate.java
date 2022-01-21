package demo_javacore.certificate;

public class certificate {
	private int certificatedId;
	private String certificatedName;
	private String certificatedRank;
	private String certificatedDate;
	
	public certificate(int certificatedId, String certificatedName, String certificatedRank, String certificatedDate) {
		super();
		this.certificatedId = certificatedId;
		this.certificatedName = certificatedName;
		this.certificatedRank = certificatedRank;
		this.certificatedDate = certificatedDate;
	}
	
	public certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCertificatedId() {
		return certificatedId;
	}
	public void setCertificatedId(int certificatedId) {
		this.certificatedId = certificatedId;
	}
	public String getCertificatedName() {
		return certificatedName;
	}
	public void setCertificatedName(String certificatedName) {
		this.certificatedName = certificatedName;
	}
	public String getCertificatedRank() {
		return certificatedRank;
	}
	public void setCertificatedRank(String certificatedRank) {
		this.certificatedRank = certificatedRank;
	}
	public String getCertificatedDate() {
		return certificatedDate;
	}
	public void setCertificatedDate(String certificatedDate) {
		this.certificatedDate = certificatedDate;
	}
	@Override
	public String toString() {
		return "certificate [certificatedId=" + certificatedId + ", certificatedName=" + certificatedName
				+ ", certificatedRank=" + certificatedRank + ", certificatedDate=" + certificatedDate + "]";
	}
	
}
