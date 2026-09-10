package com.bytedance.adsdk.lr.ka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements ka {
    private final HttpURLConnection ri;

    public ri(HttpURLConnection httpURLConnection) {
        this.ri = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.ri.disconnect();
    }

    @Override // com.bytedance.adsdk.lr.ka.ka
    public String ik() {
        return this.ri.getContentType();
    }

    @Override // com.bytedance.adsdk.lr.ka.ka
    public String ka() {
        try {
            if (ri()) {
                return null;
            }
            return "Unable to fetch " + this.ri.getURL() + ". Failed with " + this.ri.getResponseCode() + "\n" + ri(this.ri);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.lr.ka.ka
    public InputStream lr() throws IOException {
        return this.ri.getInputStream();
    }

    @Override // com.bytedance.adsdk.lr.ka.ka
    public boolean ri() {
        try {
            return this.ri.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    private String ri(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}
