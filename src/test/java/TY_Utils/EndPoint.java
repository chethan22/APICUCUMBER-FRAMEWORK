package TY_Utils;

public enum EndPoint {

	List_of_user("/api/users?page=2"), Single_User("/api/users/2"), Single_User_Not_Found("/api/users/23"),
	List_Resource("/api/unknown");

	private String end;

	EndPoint(String end) {
		this.end = end;
	}

	public String getEndPoint() {
		return end;
	}

}
