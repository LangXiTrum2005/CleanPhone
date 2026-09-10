package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class e extends PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f10223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Charset f10224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f10225c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f10224b = null;
        this.f10223a = messageDigest;
        this.f10225c = aVar;
        if (messageDigest != null) {
            this.f10224b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        super.write(cArr, i2, i3);
        MessageDigest messageDigest = this.f10223a;
        if (messageDigest != null) {
            messageDigest.update(this.f10224b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i2) {
        super.write(i2);
        MessageDigest messageDigest = this.f10223a;
        if (messageDigest != null) {
            messageDigest.update((byte) i2);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i2, int i3) {
        super.write(str, i2, i3);
        if (this.f10223a != null) {
            a aVar = this.f10225c;
            if (aVar == null || aVar.a(str)) {
                this.f10223a.update(this.f10224b.encode(CharBuffer.wrap(str, i2, i3 + i2)).array());
            }
        }
    }
}
