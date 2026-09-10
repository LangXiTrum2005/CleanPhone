package com.bytedance.adsdk.ud.mml;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements mml {
    private final HttpURLConnection qdl;

    public qdl(HttpURLConnection httpURLConnection) {
        this.qdl = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.qdl.disconnect();
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public String lnr() {
        return this.qdl.getContentType();
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public String mml() {
        try {
            if (qdl()) {
                return null;
            }
            return "Unable to fetch " + this.qdl.getURL() + ". Failed with " + this.qdl.getResponseCode() + IOUtils.LINE_SEPARATOR_UNIX + qdl(this.qdl);
        } catch (IOException e2) {
            return e2.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public boolean qdl() {
        try {
            return this.qdl.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.ud.mml.mml
    public InputStream ud() throws IOException {
        return this.qdl.getInputStream();
    }

    private String qdl(HttpURLConnection httpURLConnection) throws IOException {
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
