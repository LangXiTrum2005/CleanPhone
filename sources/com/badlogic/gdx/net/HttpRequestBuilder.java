package com.badlogic.gdx.net;

import androidx.browser.trusted.sharing.ShareTarget;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.utils.Base64Coder;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Pools;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestBuilder {
    public static String baseUrl = "";
    public static int defaultTimeout = 1000;
    public static Json json = new Json();
    private Net.HttpRequest httpRequest;

    private void validate() {
        if (this.httpRequest == null) {
            throw new IllegalStateException("A new request has not been started yet. Call HttpRequestBuilder.newRequest() first.");
        }
    }

    public HttpRequestBuilder basicAuthentication(String str, String str2) {
        validate();
        Net.HttpRequest httpRequest = this.httpRequest;
        StringBuilder sb = new StringBuilder("Basic ");
        sb.append(Base64Coder.encodeString(str + ":" + str2));
        httpRequest.setHeader(HttpRequestHeader.Authorization, sb.toString());
        return this;
    }

    public Net.HttpRequest build() {
        validate();
        Net.HttpRequest httpRequest = this.httpRequest;
        this.httpRequest = null;
        return httpRequest;
    }

    public HttpRequestBuilder content(String str) {
        validate();
        this.httpRequest.setContent(str);
        return this;
    }

    public HttpRequestBuilder followRedirects(boolean z) {
        validate();
        this.httpRequest.setFollowRedirects(z);
        return this;
    }

    public HttpRequestBuilder formEncodedContent(Map<String, String> map) {
        validate();
        this.httpRequest.setHeader("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.httpRequest.setContent(HttpParametersUtils.convertHttpParameters(map));
        return this;
    }

    public HttpRequestBuilder header(String str, String str2) {
        validate();
        this.httpRequest.setHeader(str, str2);
        return this;
    }

    public HttpRequestBuilder includeCredentials(boolean z) {
        validate();
        this.httpRequest.setIncludeCredentials(z);
        return this;
    }

    public HttpRequestBuilder jsonContent(Object obj) {
        validate();
        this.httpRequest.setHeader("Content-Type", "application/json");
        this.httpRequest.setContent(json.toJson(obj));
        return this;
    }

    public HttpRequestBuilder method(String str) {
        validate();
        this.httpRequest.setMethod(str);
        return this;
    }

    public HttpRequestBuilder newRequest() {
        if (this.httpRequest != null) {
            throw new IllegalStateException("A new request has already been started. Call HttpRequestBuilder.build() first.");
        }
        Net.HttpRequest httpRequest = (Net.HttpRequest) Pools.obtain(Net.HttpRequest.class);
        this.httpRequest = httpRequest;
        httpRequest.setTimeOut(defaultTimeout);
        return this;
    }

    public HttpRequestBuilder timeout(int i) {
        validate();
        this.httpRequest.setTimeOut(i);
        return this;
    }

    public HttpRequestBuilder url(String str) {
        validate();
        this.httpRequest.setUrl(baseUrl + str);
        return this;
    }

    public HttpRequestBuilder content(InputStream inputStream, long j) {
        validate();
        this.httpRequest.setContent(inputStream, j);
        return this;
    }
}
