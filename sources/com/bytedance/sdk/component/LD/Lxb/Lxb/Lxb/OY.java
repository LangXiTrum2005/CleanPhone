package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import com.bytedance.sdk.component.LD.Lxb.VVE;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends VVE {
    InputStream LD;
    HttpURLConnection Lxb;

    public OY(HttpURLConnection httpURLConnection) throws IOException {
        this.Lxb = httpURLConnection;
        this.LD = new lc(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.VVE
    public com.bytedance.sdk.component.LD.Lxb.QAg JXs() {
        if (this.Lxb.getContentType() != null) {
            return com.bytedance.sdk.component.LD.Lxb.QAg.Lxb(this.Lxb.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.VVE
    public String LD() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.LD));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.VVE
    public long Lxb() {
        try {
            return this.Lxb.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.VVE
    public byte[] ZU() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = this.LD.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.VVE, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.LD.close();
            this.Lxb.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.VVE
    public InputStream lk() {
        return this.LD;
    }

    public OY(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.Lxb = httpURLConnection;
        this.LD = new lc(inputStream, httpURLConnection);
    }
}
