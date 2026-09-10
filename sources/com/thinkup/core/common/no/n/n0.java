package com.thinkup.core.common.no.n;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 implements oon {
    private static final byte m = 2;
    private static final byte m0 = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f42086n = 3;
    private static final byte o = 1;
    private static final byte o0 = 4;
    private static final byte om = 1;
    private static final byte on = 2;
    private static final byte oo = 0;
    private final oo mm;
    private final Inflater mn;
    private final no n0;
    private int mo = 0;
    private final CRC32 no = new CRC32();

    public n0(oon oonVar) {
        if (oonVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.mn = inflater;
        oo ooVarO = nm.o(oonVar);
        this.mm = ooVarO;
        this.n0 = new no(ooVarO, inflater);
    }

    private void m() throws IOException {
        this.mm.o(10L);
        byte bN = this.mm.n().n(3L);
        boolean z2 = ((bN >> 1) & 1) == 1;
        if (z2) {
            o(this.mm.n(), 0L, 10L);
        }
        o("ID1ID2", 8075, this.mm.n0());
        this.mm.mo(8L);
        if (((bN >> 2) & 1) == 1) {
            this.mm.o(2L);
            if (z2) {
                o(this.mm.n(), 0L, 2L);
            }
            long jO = omo.o(this.mm.n().n0());
            this.mm.o(jO);
            if (z2) {
                o(this.mm.n(), 0L, jO);
            }
            this.mm.mo(jO);
        }
        if (((bN >> 3) & 1) == 1) {
            long jO2 = this.mm.o((byte) 0);
            if (jO2 == -1) {
                throw new EOFException();
            }
            if (z2) {
                o(this.mm.n(), 0L, jO2 + 1);
            }
            this.mm.mo(jO2 + 1);
        }
        if (((bN >> 4) & 1) == 1) {
            long jO3 = this.mm.o((byte) 0);
            if (jO3 == -1) {
                throw new EOFException();
            }
            if (z2) {
                o(this.mm.n(), 0L, jO3 + 1);
            }
            this.mm.mo(jO3 + 1);
        }
        if (z2) {
            o("FHCRC", this.mm.nn(), (short) this.no.getValue());
            this.no.reset();
        }
    }

    private void n() throws IOException {
        o("CRC", this.mm.o00(), (int) this.no.getValue());
        o("ISIZE", this.mm.o00(), (int) this.mn.getBytesWritten());
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final long a_(n nVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return 0L;
        }
        if (this.mo == 0) {
            this.mm.o(10L);
            byte bN = this.mm.n().n(3L);
            boolean z2 = ((bN >> 1) & 1) == 1;
            if (z2) {
                o(this.mm.n(), 0L, 10L);
            }
            o("ID1ID2", 8075, this.mm.n0());
            this.mm.mo(8L);
            if (((bN >> 2) & 1) == 1) {
                this.mm.o(2L);
                if (z2) {
                    o(this.mm.n(), 0L, 2L);
                }
                long jNn = this.mm.n().nn();
                this.mm.o(jNn);
                if (z2) {
                    o(this.mm.n(), 0L, jNn);
                }
                this.mm.mo(jNn);
            }
            if (((bN >> 3) & 1) == 1) {
                long jO = this.mm.o((byte) 0);
                if (jO == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    o(this.mm.n(), 0L, jO + 1);
                }
                this.mm.mo(jO + 1);
            }
            if (((bN >> 4) & 1) == 1) {
                long jO2 = this.mm.o((byte) 0);
                if (jO2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    o(this.mm.n(), 0L, jO2 + 1);
                }
                this.mm.mo(jO2 + 1);
            }
            if (z2) {
                o("FHCRC", this.mm.nn(), (short) this.no.getValue());
                this.no.reset();
            }
            this.mo = 1;
        }
        if (this.mo == 1) {
            long j2 = nVar.f42084n;
            long jA_ = this.n0.a_(nVar, j);
            if (jA_ != -1) {
                o(nVar, j2, jA_);
                return jA_;
            }
            this.mo = 2;
        }
        if (this.mo == 2) {
            o("CRC", this.mm.o00(), (int) this.no.getValue());
            o("ISIZE", this.mm.o00(), (int) this.mn.getBytesWritten());
            this.mo = 3;
            if (!this.mm.on()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n0.close();
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final om0 o() {
        return this.mm.o();
    }

    private void o(n nVar, long j, long j2) {
        o0n o0nVar = nVar.m;
        while (true) {
            int i2 = o0nVar.oo;
            int i3 = o0nVar.o0;
            if (j < i2 - i3) {
                break;
            }
            j -= (long) (i2 - i3);
            o0nVar = o0nVar.m0;
        }
        while (j2 > 0) {
            int i4 = (int) (((long) o0nVar.o0) + j);
            int iMin = (int) Math.min(o0nVar.oo - i4, j2);
            this.no.update(o0nVar.f42090n, i4, iMin);
            j2 -= (long) iMin;
            o0nVar = o0nVar.m0;
            j = 0;
        }
    }

    private static void o(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }
}
