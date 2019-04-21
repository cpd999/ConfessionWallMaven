package cn.xiaox.po;

public class Pin {
    private Integer pid;

    private String nid;

    private String uname;

    private String huifurei;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getHuifurei() {
        return huifurei;
    }

    public void setHuifurei(String huifurei) {
        this.huifurei = huifurei == null ? null : huifurei.trim();
    }

	/**   
	 * <p>Title: toString</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "Pin [pid=" + pid + ", nid=" + nid + ", uname=" + uname + ", huifurei=" + huifurei + "]";
	}
    
}