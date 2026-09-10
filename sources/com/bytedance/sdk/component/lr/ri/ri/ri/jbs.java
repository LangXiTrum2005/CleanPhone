package com.bytedance.sdk.component.lr.ri.ri.ri;

import com.bytedance.sdk.component.lr.ri.vr;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends vr {
    InputStream lr;
    HttpURLConnection ri;

    public jbs(HttpURLConnection httpURLConnection) throws IOException {
        this.ri = httpURLConnection;
        this.lr = new xha(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.lr.ri.vr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.lr.close();
            this.ri.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.lr.ri.vr
    public com.bytedance.sdk.component.lr.ri.jbs fi() {
        if (this.ri.getContentType() != null) {
            return com.bytedance.sdk.component.lr.ri.jbs.ri(this.ri.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lr.ri.vr
    public InputStream ik() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.lr.ri.vr
    public byte[] ka() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = this.lr.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.lr.ri.vr
    public String lr() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.lr));
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

    @Override // com.bytedance.sdk.component.lr.ri.vr
    public long ri() {
        try {
            return this.ri.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public jbs(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.ri = httpURLConnection;
        this.lr = new xha(inputStream, httpURLConnection);
    }
}
