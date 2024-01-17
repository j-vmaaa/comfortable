package school.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName girls
 */
@Data
public class Girls implements Serializable {
    private Integer id;

    private String name;

    private String cup;

    private Integer cumInNum;

    private static final long serialVersionUID = 1L;
}