package com.fwzg.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Result<T> {
    private  Integer code;
    private  String message;
    private  Long count;
    private  T  data;

    private Result(){}
    private Result(Integer code, String message, Long count, T data) {
        this.code = code;
        this.message = message;
        this.count = count;
        this.data = data;
    }

    public static Result<Object> success()
    {
        return new Result(0,"success",null,null);
    }
    public static Result<Object> success(String message)
    {
        return new Result(0,message,null,null);
    }
    public static Result<Object> success(Object data,Long count)
    {
        return new Result(0,"success",count,data);
    }
    public static Result<Object> fail()
    {
        return new Result(-1,"fail",null,null);
    }
    public static Result<Object> fail(String msg)
    {
        return new Result(-1,msg,null,null);
    }
}
