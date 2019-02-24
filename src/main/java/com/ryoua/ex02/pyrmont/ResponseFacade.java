package com.ryoua.ex02.pyrmont;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class ResponseFacade implements ServletResponse {

    ServletResponse response = null;

    public ResponseFacade(Response response) {
        this.response = response;
    }

    public String getCharacterEncoding() {
        return response.getCharacterEncoding();
    }

    public String getContentType() {
        return null;
    }

    public ServletOutputStream getOutputStream() throws IOException {
        return response.getOutputStream();
    }

    public PrintWriter getWriter() throws IOException {
        return response.getWriter();
    }

    public void setCharacterEncoding(String s) {

    }

    public void setContentLength(int i) {
        response.setContentLength(i);
    }

    public void setContentLengthLong(long l) {

    }

    public void setContentType(String s) {
        response.setContentType(s);
    }

    public void setBufferSize(int i) {
        response.setBufferSize(i);
    }

    public int getBufferSize() {
        return response.getBufferSize();
    }

    public void flushBuffer() throws IOException {
        response.flushBuffer();
    }

    public void resetBuffer() {
        response.resetBuffer();
    }

    public boolean isCommitted() {
        return response.isCommitted();
    }

    public void reset() {
        response.reset();
    }

    public void setLocale(Locale locale) {
        response.setLocale(locale);
    }

    public Locale getLocale() {
        return response.getLocale();
    }
}
