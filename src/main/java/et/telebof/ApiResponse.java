package et.telebof;

import et.telebof.types.JsonSerializable;

public class ApiResponse extends JsonSerializable {
    public boolean ok;
    public String description;
    public int error_code;
    public Object result;
    public ResponseParameters parameters;

}

