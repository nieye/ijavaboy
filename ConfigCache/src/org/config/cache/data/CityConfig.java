package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * �ǳ����ñ�
 * @author chenjie
 * 2012-12-11
 */
public class CityConfig implements IConfig {
	
	private Integer id; //������ID
	private String name; //�ǳ�����
	private Integer x; //�ǳ�����x
	private Integer y; //�ǳ�����y
	private Integer typeId; //�ǳ�����
	private Integer areaId; //����ID
	private Integer maxField; //�ǳ������ɽ������
	private Integer countryId; //�ǳ�������
	private Integer maxMonsterNum; //����ڸóǳصķ������������Ĺ�������
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.name = values.getString();
		this.x = values.getInt();
		this.y = values.getInt();
		this.typeId = values.getInt();
		this.areaId = values.getInt();
		this.maxField = values.getInt();
		this.countryId = values.getInt();
		this.maxMonsterNum = values.getInt();
		
	}
	
	
	@Override
	public String getKey() {

		return id+"";
	}


	public final String getName() {
		return name;
	}


	public final void setName(String name) {
		this.name = name;
	}


	public final Integer getX() {
		return x;
	}


	public final void setX(Integer x) {
		this.x = x;
	}


	public final Integer getY() {
		return y;
	}


	public final void setY(Integer y) {
		this.y = y;
	}


	public final Integer getAreaId() {
		return areaId;
	}


	public final void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}


	public final Integer getMaxField() {
		return maxField;
	}


	public final void setMaxField(Integer maxField) {
		this.maxField = maxField;
	}


	public final Integer getCountryId() {
		return countryId;
	}


	public final void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}


	public final Integer getMaxMonsterNum() {
		return maxMonsterNum;
	}


	public final void setMaxMonsterNum(Integer maxMonsterNum) {
		this.maxMonsterNum = maxMonsterNum;
	}


	public final void setId(Integer id) {
		this.id = id;
	}


	public final Integer getTypeId() {
		return typeId;
	}


	public final void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}


	public final Integer getId() {
		return id;
	}



}