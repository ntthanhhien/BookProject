package vn.com.vti.springexam.form;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfraForm {
	@NotNull
	private Integer id;
	
	@NotBlank
	private String name;
	
	@NotNull
	@DateTimeFormat(pattern = "yyy/MM/dd")
	private Date registDate;
}
