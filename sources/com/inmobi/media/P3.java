package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes5.dex */
public final class P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q3 f23062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f23063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23064c;
    public final /* synthetic */ S3 d;

    public P3(S3 s3, Q3 q3) {
        this.d = s3;
        this.f23062a = q3;
        this.f23063b = q3.f23100c ? null : new boolean[s3.f23157h];
    }

    public final OutputStream a(int i2) {
        FileOutputStream fileOutputStream;
        O3 o3;
        synchronized (this.d) {
            try {
                Q3 q3 = this.f23062a;
                if (q3.d != this) {
                    throw new IllegalStateException();
                }
                if (!q3.f23100c) {
                    this.f23063b[i2] = true;
                }
                File fileB = q3.b(i2);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.d.f23153a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return S3.q;
                    }
                }
                o3 = new O3(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return o3;
    }

    public final void a(String str, int i2) throws Throwable {
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i2), Ge.f22852b);
            try {
                outputStreamWriter2.write(str);
                Ge.a(outputStreamWriter2);
            } catch (Throwable th) {
                th = th;
                outputStreamWriter = outputStreamWriter2;
                Ge.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
