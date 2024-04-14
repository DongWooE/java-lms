package nextstep.courses.domain;

public enum SessionStatus {

    PREPARING("준비중"),
    RECRUITING("모집중"),
    CLOSED("종료");

    private final String desc;

    SessionStatus(String desc) {
        this.desc = desc;
    }

    public boolean isRecruiting() {
        return this.equals(RECRUITING);
    }

    public String getDesc() {
        return desc;
    }
}
