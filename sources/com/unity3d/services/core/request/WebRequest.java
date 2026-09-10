package com.unity3d.services.core.request;

import com.ironsource.X3;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebRequest {
    private ByteArrayOutputStream _baos;
    private byte[] _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private Map<String, List<String>> _headers;
    private IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private String _requestType;
    private int _responseCode;
    private Map<String, List<String>> _responseHeaders;
    private URL _url;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum RequestType {
        POST,
        GET,
        HEAD
    }

    public WebRequest(String str, String str2) throws MalformedURLException {
        this(str, str2, null);
    }

    private HttpURLConnection getHttpUrlConnectionWithHeaders() throws NetworkIOException, IllegalArgumentException {
        HttpURLConnection httpURLConnection;
        if (getUrl().toString().startsWith("https://")) {
            try {
                httpURLConnection = (HttpsURLConnection) getUrl().openConnection();
            } catch (IOException e10) {
                throw new NetworkIOException("Open HTTPS connection: " + e10.getMessage());
            }
        } else {
            if (!getUrl().toString().startsWith("http://")) {
                throw new IllegalArgumentException("Invalid url-protocol in url: " + getUrl().toString());
            }
            try {
                httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            } catch (IOException e11) {
                throw new NetworkIOException("Open HTTP connection: " + e11.getMessage());
            }
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(getConnectTimeout());
        httpURLConnection.setReadTimeout(getReadTimeout());
        try {
            httpURLConnection.setRequestMethod(getRequestType());
            if (getHeaders() != null && getHeaders().size() > 0) {
                for (String str : getHeaders().keySet()) {
                    for (String str2 : getHeaders().get(str)) {
                        DeviceLog.debug("Setting header: " + str + X3.j.f27830b + str2);
                        httpURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e12) {
            throw new NetworkIOException("Set Request Method: " + getRequestType() + ", " + e12.getMessage());
        }
    }

    public void cancel() {
        this._canceled = true;
    }

    public byte[] getBody() {
        return this._body;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public Map<String, List<String>> getHeaders() {
        return this._headers;
    }

    public String getQuery() {
        URL url = this._url;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public String getRequestType() {
        return this._requestType;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this._responseHeaders;
    }

    public URL getUrl() {
        return this._url;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public String makeRequest() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this._baos = byteArrayOutputStream;
        makeStreamRequest(byteArrayOutputStream);
        return this._baos.toString("UTF-8");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003c */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long makeStreamRequest(java.io.OutputStream r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.WebRequest.makeStreamRequest(java.io.OutputStream):long");
    }

    public void setBody(String str) {
        this._body = str.getBytes(StandardCharsets.UTF_8);
    }

    public void setConnectTimeout(int i10) {
        this._connectTimeout = i10;
    }

    public void setProgressListener(IWebRequestProgressListener iWebRequestProgressListener) {
        this._progressListener = iWebRequestProgressListener;
    }

    public void setReadTimeout(int i10) {
        this._readTimeout = i10;
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public void setBody(byte[] bArr) {
        this._body = bArr;
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map, int i10, int i11) throws MalformedURLException {
        this._responseCode = -1;
        this._contentLength = -1L;
        this._canceled = false;
        this._url = new URL(str);
        this._requestType = str2;
        this._headers = map;
        this._connectTimeout = i10;
        this._readTimeout = i11;
    }
}
