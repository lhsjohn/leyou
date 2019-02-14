package vo;

import cn.lollipop.common.ExceptionConstant;
import lombok.Data;

@Data
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionConstant ec) {
        this.status = ec.getCode();
        this.message = ec.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
