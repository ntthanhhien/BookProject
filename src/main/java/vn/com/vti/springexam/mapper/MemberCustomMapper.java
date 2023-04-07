package vn.com.vti.springexam.mapper;

import java.util.List;

import vn.com.vti.springexam.entity.MemberCustomized;

public interface MemberCustomMapper {

	public List<MemberCustomized> selectByNamePart(String memberName);

}
