package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f36794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f36795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36797d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f36794a = eVar;
        this.f36795b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f36796c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f36795b.getRemaining();
        this.f36796c -= remaining;
        this.f36794a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
        }
        if (this.f36797d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f36795b.inflate(oVarB.f36811a, oVarB.f36813c, (int) Math.min(j10, 8192 - oVarB.f36813c));
                if (iInflate > 0) {
                    oVarB.f36813c += iInflate;
                    long j11 = iInflate;
                    cVar.f36779b += j11;
                    return j11;
                }
                if (!this.f36795b.finished() && !this.f36795b.needsDictionary()) {
                }
                h();
                if (oVarB.f36812b != oVarB.f36813c) {
                    return -1L;
                }
                cVar.f36778a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f36797d) {
            return;
        }
        this.f36795b.end();
        this.f36797d = true;
        this.f36794a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f36795b.needsInput()) {
            return false;
        }
        h();
        if (this.f36795b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f36794a.f()) {
            return true;
        }
        o oVar = this.f36794a.a().f36778a;
        int i10 = oVar.f36813c;
        int i11 = oVar.f36812b;
        int i12 = i10 - i11;
        this.f36796c = i12;
        this.f36795b.setInput(oVar.f36811a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f36794a.b();
    }
}
