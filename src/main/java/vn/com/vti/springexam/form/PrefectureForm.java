package vn.com.vti.springexam.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrefectureForm {
	@NotNull
	private Integer id;
	@NotBlank
	private String name;
	@NotNull
	private Integer population;
	
	private Integer section3Id;
	private Integer section8Id;

	
	private List<Integer> infrastructureList = new ArrayList<>();

	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date date;
}
