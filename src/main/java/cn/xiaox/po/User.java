package cn.xiaox.po;

public class User {
    private Integer userId;

    private String userName;

    private String userNicheng;

    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNicheng() {
        return userNicheng;
    }

    public void setUserNicheng(String userNicheng) {
        this.userNicheng = userNicheng == null ? null : userNicheng.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	/**   
	 * <p>Title: toString</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userNicheng=" + userNicheng + ", password="
				+ password + "]";
	}
    
    
}