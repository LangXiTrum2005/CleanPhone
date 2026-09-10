package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class db extends dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected InputStream f2555a;
    protected OutputStream b;

    public db() {
        this.f2555a = null;
        this.b = null;
    }

    @Override // com.umeng.analytics.pro.dd
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.dd
    public void b() throws de {
    }

    @Override // com.umeng.analytics.pro.dd
    public void c() {
        InputStream inputStream = this.f2555a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f2555a = null;
        }
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.b = null;
        }
    }

    @Override // com.umeng.analytics.pro.dd
    public void d() throws de {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new de(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new de(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.dd
    public int a(byte[] bArr, int i, int i2) throws de {
        InputStream inputStream = this.f2555a;
        if (inputStream == null) {
            throw new de(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new de(4);
        } catch (IOException e) {
            throw new de(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.dd
    public void b(byte[] bArr, int i, int i2) throws de {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new de(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new de(0, e);
        }
    }

    public db(InputStream inputStream) {
        this.b = null;
        this.f2555a = inputStream;
    }

    public db(OutputStream outputStream) {
        this.f2555a = null;
        this.b = outputStream;
    }

    public db(InputStream inputStream, OutputStream outputStream) {
        this.f2555a = inputStream;
        this.b = outputStream;
    }
}
