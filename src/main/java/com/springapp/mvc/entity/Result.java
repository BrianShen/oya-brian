package com.springapp.mvc.entity;

import java.util.List;

/**
 * Created by yujing.zou on 2014/8/8.
 */
public class Result<T> {
    private Boolean isSuccess;
    private String msg;
    private T result;
    private List<T> results;

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

}
