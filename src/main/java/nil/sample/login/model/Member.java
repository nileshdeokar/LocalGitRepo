package nil.sample.login.model;

import org.springframework.stereotype.Component;

@Component
public class Member {

	private String mobile_no;
	private String mobile_no_otp;
	
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getMobile_no_otp() {
		return mobile_no_otp;
	}
	public void setMobile_no_otp(String mobile_no_otp) {
		this.mobile_no_otp = mobile_no_otp;
	}
	
}
