package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f36790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f36791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f36792d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36789a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f36793e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f36791c = inflater;
        e eVarA = l.a(sVar);
        this.f36790b = eVarA;
        this.f36792d = new k(eVarA, inflater);
    }

    private void a(c cVar, long j10, long j11) {
        o oVar = cVar.f36778a;
        while (true) {
            long j12 = oVar.f36813c - oVar.f36812b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f36816f;
        }
        while (j11 > 0) {
            int i10 = (int) (((long) oVar.f36812b) + j10);
            int iMin = (int) Math.min(oVar.f36813c - i10, j11);
            this.f36793e.update(oVar.f36811a, i10, iMin);
            j11 -= (long) iMin;
            oVar = oVar.f36816f;
            j10 = 0;
        }
    }

    private void d() throws IOException {
        this.f36790b.e(10L);
        byte bF = this.f36790b.a().f(3L);
        boolean z10 = ((bF >> 1) & 1) == 1;
        if (z10) {
            a(this.f36790b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f36790b.readShort());
        this.f36790b.skip(8L);
        if (((bF >> 2) & 1) == 1) {
            this.f36790b.e(2L);
            if (z10) {
                a(this.f36790b.a(), 0L, 2L);
            }
            long jG = this.f36790b.a().g();
            this.f36790b.e(jG);
            if (z10) {
                a(this.f36790b.a(), 0L, jG);
            }
            this.f36790b.skip(jG);
        }
        if (((bF >> 3) & 1) == 1) {
            long jA = this.f36790b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f36790b.a(), 0L, jA + 1);
            }
            this.f36790b.skip(jA + 1);
        }
        if (((bF >> 4) & 1) == 1) {
            long jA2 = this.f36790b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f36790b.a(), 0L, jA2 + 1);
            }
            this.f36790b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f36790b.g(), (short) this.f36793e.getValue());
            this.f36793e.reset();
        }
    }

    private void h() throws IOException {
        a("CRC", this.f36790b.e(), (int) this.f36793e.getValue());
        a("ISIZE", this.f36790b.e(), (int) this.f36791c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        j jVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f36789a == 0) {
            d();
            this.f36789a = 1;
        }
        if (this.f36789a == 1) {
            long j11 = cVar.f36779b;
            long jB = this.f36792d.b(cVar, j10);
            if (jB != -1) {
                a(cVar, j11, jB);
                return jB;
            }
            jVar = this;
            jVar.f36789a = 2;
        } else {
            jVar = this;
        }
        if (jVar.f36789a == 2) {
            jVar.h();
            jVar.f36789a = 3;
            if (!jVar.f36790b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36792d.close();
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f36790b.b();
    }
}
