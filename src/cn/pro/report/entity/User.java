package cn.pro.report.entity;

public class User {
	private String id;
	private String cid;
	private String name;
	public User()
	{
		
	}
	public User(String id,String cid,String name)
	{
		this.id = id;
		this.cid = cid;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
