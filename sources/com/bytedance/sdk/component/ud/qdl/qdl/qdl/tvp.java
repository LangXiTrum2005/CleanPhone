package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import com.bytedance.sdk.component.ud.qdl.bjy;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends bjy {
    HttpURLConnection qdl;
    InputStream ud;

    public tvp(HttpURLConnection httpURLConnection) throws IOException {
        this.qdl = httpURLConnection;
        this.ud = new wd(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.ud.qdl.bjy, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.ud.close();
            this.qdl.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ud.qdl.bjy
    public InputStream lnr() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.bjy
    public byte[] mml() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i2 = this.ud.read(bArr);
                if (i2 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.ud.qdl.bjy
    public com.bytedance.sdk.component.ud.qdl.tvp mzz() {
        if (this.qdl.getContentType() != null) {
            return com.bytedance.sdk.component.ud.qdl.tvp.qdl(this.qdl.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.bjy
    public long qdl() {
        try {
            return this.qdl.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.ud.qdl.bjy
    public String ud() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.ud));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + IOUtils.LINE_SEPARATOR_UNIX);
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public tvp(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.qdl = httpURLConnection;
        this.ud = new wd(inputStream, httpURLConnection);
    }
}
