package com.smile.pojo;

public class ApplyDO {
    private Integer id;

    private Integer userid;

    private String name;

    private String phone;

    private String idnumber;

    private Integer flag;

    private Integer banktype;

    private String bankname;

    private String bankcardno;

    private String bankcardusername;

    private Integer ischecked;

    private Byte ifsign;

    private Byte isenabled;

    private Byte isdeleted;

    private Long createtime;

    private Long updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getBanktype() {
        return banktype;
    }

    public void setBanktype(Integer banktype) {
        this.banktype = banktype;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankcardno() {
        return bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno == null ? null : bankcardno.trim();
    }

    public String getBankcardusername() {
        return bankcardusername;
    }

    public void setBankcardusername(String bankcardusername) {
        this.bankcardusername = bankcardusername == null ? null : bankcardusername.trim();
    }

    public Integer getIschecked() {
        return ischecked;
    }

    public void setIschecked(Integer ischecked) {
        this.ischecked = ischecked;
    }

    public Byte getIfsign() {
        return ifsign;
    }

    public void setIfsign(Byte ifsign) {
        this.ifsign = ifsign;
    }

    public Byte getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Byte isenabled) {
        this.isenabled = isenabled;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }
}