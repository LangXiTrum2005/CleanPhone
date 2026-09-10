package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb implements xb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f21481b = Logger.getLogger(wb.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co.c f21482a = new co.c(2);

    /* JADX WARN: Multi-variable type inference failed */
    public final zb a(s10 s10Var, yw1 yw1Var) throws EOFException {
        int iA;
        long jLimit;
        zb dcVar;
        zb zbVar;
        long jD = s10Var.d();
        ByteBuffer byteBuffer = s10Var.f19758a;
        co.c cVar = this.f21482a;
        ((ByteBuffer) cVar.get()).rewind().limit(8);
        do {
            iA = s10Var.a((ByteBuffer) cVar.get());
            if (iA == 8) {
                ((ByteBuffer) cVar.get()).rewind();
                long jA = x10.a((ByteBuffer) cVar.get());
                if (jA < 8 && jA > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jA);
                    sb2.append("). Stop parsing!");
                    f21481b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) cVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jA == 1) {
                        ((ByteBuffer) cVar.get()).limit(16);
                        s10Var.a((ByteBuffer) cVar.get());
                        ((ByteBuffer) cVar.get()).position(8);
                        jLimit = x10.s((ByteBuffer) cVar.get()) - 16;
                    } else {
                        jLimit = jA == 0 ? ((long) byteBuffer.limit()) - s10Var.d() : jA - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) cVar.get()).limit(((ByteBuffer) cVar.get()).limit() + 16);
                        s10Var.a((ByteBuffer) cVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) cVar.get()).position() - 16; iPosition < ((ByteBuffer) cVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) cVar.get()).position() - 16)] = ((ByteBuffer) cVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j10 = jLimit;
                    if (yw1Var instanceof zb) {
                    }
                    if (!"moov".equals(str)) {
                        if ("mvhd".equals(str)) {
                            bc bcVar = new bc("mvhd");
                            bcVar.f12715n = 1.0d;
                            bcVar.f12716o = 1.0f;
                            bcVar.f12717p = cx1.f13293j;
                            zbVar = bcVar;
                        } else {
                            dcVar = new dc(str, 0);
                        }
                        ((ByteBuffer) cVar.get()).rewind();
                        zbVar.a(s10Var, (ByteBuffer) cVar.get(), j10, this);
                        return zbVar;
                    }
                    dcVar = new ac();
                    zbVar = dcVar;
                    ((ByteBuffer) cVar.get()).rewind();
                    zbVar.a(s10Var, (ByteBuffer) cVar.get(), j10, this);
                    return zbVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (iA >= 0);
        byteBuffer.position((int) jD);
        throw new EOFException();
    }
}
