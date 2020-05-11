package nil.sample.login.resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import nil.sample.login.model.Member;
import nil.sample.login.model.MemberResponse;

@RestController
public class LoginController {
	
	
	@PostMapping("/signup")
	public  ResponseEntity<nil.sample.login.model.MemberResponse> signup(@RequestBody Member member) {
		
		MemberResponse response = new MemberResponse();
		response.setM_id(151);
		response.setResponseStatus("SUCCESS");
		
		HttpHeaders header = new HttpHeaders();
		header.add("name", "Nilesh");
		
		return ResponseEntity
				.ok()
				.headers(header)
				.body(response);
	}

}
