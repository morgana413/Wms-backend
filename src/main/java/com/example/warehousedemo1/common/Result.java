package com.example.warehousedemo1.common;

import lombok.Data;


@Data
public class Result {
    private int code;
    private String msg;
    private Object data;
    private Long total;

    public static Result SUCCESS(){
        return result(200,"成功",0L,null);
    }

    public static Result SUCCESS(Object data){
        return result(200,"成功",data,null);
    }

    public static Result SUCCESS(Object data,Long total){
        return result(200,"成功",data,total);
    }

    public static Result FAILURE(){
        return result(400,"失败",0L,null);
    }

    private static Result result(int code, String msg, Object data, Long total) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        result.setTotal(total);
        return result;
    }
}
