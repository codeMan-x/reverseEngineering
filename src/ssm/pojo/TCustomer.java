package ssm.pojo;

public class TCustomer {
    private Integer cid;

    private String custname;

    private String custlevel;

    private String custsource;

    private String custphone;

    private String custmobile;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public String getCustlevel() {
        return custlevel;
    }

    public void setCustlevel(String custlevel) {
        this.custlevel = custlevel == null ? null : custlevel.trim();
    }

    public String getCustsource() {
        return custsource;
    }

    public void setCustsource(String custsource) {
        this.custsource = custsource == null ? null : custsource.trim();
    }

    public String getCustphone() {
        return custphone;
    }

    public void setCustphone(String custphone) {
        this.custphone = custphone == null ? null : custphone.trim();
    }

    public String getCustmobile() {
        return custmobile;
    }

    public void setCustmobile(String custmobile) {
        this.custmobile = custmobile == null ? null : custmobile.trim();
    }
}