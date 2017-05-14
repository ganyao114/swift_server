package net.swiftos.feizhai.bean;

import java.io.Serializable;

/**
 * Created by ganyao on 2017/3/21.
 */
public class Result<T> implements Serializable {

    private int status;
    private String message;
    private T data;

    public Result(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}
