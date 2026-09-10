package com.smartdigimkt.l0;

import android.text.TextUtils;
import com.smartdigimkt.h0.j;
import com.smartdigimkt.h0.l;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class a extends j<Void> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f36301n = "a";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f36302l;
    private File m;

    public a(File file, String str) {
        super(0, str);
        this.f36302l = file;
        this.m = new File(file + ".tmp");
    }

    @Override // com.smartdigimkt.h0.j
    public l<Void> a(com.smartdigimkt.n0.c cVar) {
        if (p()) {
            return l.a(new com.smartdigimkt.i0.a(-2, cVar));
        }
        if (!this.m.canRead() || this.m.length() <= 0) {
            return l.a(new com.smartdigimkt.i0.a(4, cVar));
        }
        return this.m.renameTo(this.f36302l) ? l.a(null, cVar) : l.a(new com.smartdigimkt.i0.a(4, cVar));
    }

    @Override // com.smartdigimkt.h0.j
    public int j() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.smartdigimkt.h0.j
    public byte[] a(com.smartdigimkt.n0.b bVar, com.smartdigimkt.h0.c cVar) throws Throwable {
        Throwable th;
        String strB = com.smartdigimkt.o0.d.b(bVar.b(), "Content-Length");
        long j = 0;
        long jLongValue = !TextUtils.isEmpty(strB) ? Long.valueOf(strB).longValue() : 0L;
        InputStream inputStream = null;
        if (jLongValue > 0 && this.f36302l.length() == jLongValue) {
            this.f36302l.renameTo(this.m);
            cVar.a(this, jLongValue, jLongValue);
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.m.getAbsolutePath(), "rw");
        randomAccessFile.setLength(0L);
        try {
            InputStream inputStreamA = bVar.a();
            try {
                InputStream gZIPInputStream = (!com.smartdigimkt.o0.d.b(bVar.b()) || (inputStreamA instanceof GZIPInputStream)) ? inputStreamA : new GZIPInputStream(inputStreamA);
                try {
                    byte[] bArr = new byte[6144];
                    while (true) {
                        int i2 = gZIPInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        randomAccessFile.write(bArr, 0, i2);
                        long j2 = ((long) i2) + j;
                        cVar.a(this, jLongValue, j2);
                        if (p()) {
                            cVar.b(this);
                            break;
                        }
                        j = j2;
                    }
                    try {
                        gZIPInputStream.close();
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    randomAccessFile.close();
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = gZIPInputStream;
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                            e3.getMessage();
                        }
                    }
                    randomAccessFile.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStreamA;
                if (inputStream != null) {
                    inputStream.close();
                }
                randomAccessFile.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
