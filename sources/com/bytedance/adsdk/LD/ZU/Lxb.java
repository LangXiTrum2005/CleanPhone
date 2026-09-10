package com.bytedance.adsdk.LD.ZU;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Lxb implements ZU {
    private final HttpURLConnection Lxb;

    public Lxb(HttpURLConnection httpURLConnection) {
        this.Lxb = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.LD.ZU.ZU
    public InputStream LD() throws IOException {
        return this.Lxb.getInputStream();
    }

    @Override // com.bytedance.adsdk.LD.ZU.ZU
    public boolean Lxb() {
        try {
            return this.Lxb.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.LD.ZU.ZU
    public String ZU() {
        try {
            if (Lxb()) {
                return null;
            }
            return "Unable to fetch " + this.Lxb.getURL() + ". Failed with " + this.Lxb.getResponseCode() + "\n" + Lxb(this.Lxb);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Lxb.disconnect();
    }

    @Override // com.bytedance.adsdk.LD.ZU.ZU
    public String lk() {
        return this.Lxb.getContentType();
    }

    private String Lxb(HttpURLConnection httpURLConnection) throws IOException {
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
