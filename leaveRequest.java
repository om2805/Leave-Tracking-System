public class leaveRequest {
    private int reqId;
    private Employee emp;
    private String startDate;
    private String endDate;
    private String status;
    private String reason;

    public leaveRequest(String endDate, int reqId, Employee emp, String startDate, String reason) {
        this.endDate = endDate;
        this.reqId = reqId;
        this.emp = emp;
        this.startDate = startDate;
        this.status = "Pending";
        this.reason = reason;
    }
}
