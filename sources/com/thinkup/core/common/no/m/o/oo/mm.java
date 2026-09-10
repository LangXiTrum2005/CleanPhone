package com.thinkup.core.common.no.m.o.oo;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
final class mm implements Closeable {
    private static final Logger m = Logger.getLogger(oo.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.n.o0 f42048n;
    final o0.m o;
    private final boolean o0;
    private int om;
    private boolean on;
    private final com.thinkup.core.common.no.n.n oo;

    public mm(com.thinkup.core.common.no.n.o0 o0Var, boolean z2) {
        this.f42048n = o0Var;
        this.o0 = z2;
        com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
        this.oo = nVar;
        this.o = new o0.m(nVar);
        this.om = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.on = true;
        this.f42048n.close();
    }

    public final synchronized void m() {
        if (this.on) {
            throw new IOException("closed");
        }
        this.f42048n.flush();
    }

    public final int n() {
        return this.om;
    }

    public final synchronized void o() {
        try {
            if (this.on) {
                throw new IOException("closed");
            }
            if (this.o0) {
                Logger logger = m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.thinkup.core.common.no.m.o.n.o(">> CONNECTION %s", oo.o.on()));
                }
                this.f42048n.o0(oo.o.mn());
                this.f42048n.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m(no noVar) {
        int i2;
        try {
            if (!this.on) {
                int i3 = 0;
                o(0, noVar.m() * 6, (byte) 4, (byte) 0);
                while (i3 < 10) {
                    if (noVar.o(i3)) {
                        if (i3 == 4) {
                            i2 = 3;
                        } else {
                            i2 = i3 == 7 ? 4 : i3;
                        }
                        this.f42048n.mn(i2);
                        this.f42048n.mo(noVar.m(i3));
                    }
                    i3++;
                }
                this.f42048n.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(no noVar) {
        try {
            if (!this.on) {
                this.om = noVar.n(this.om);
                if (noVar.n() != -1) {
                    this.o.o(noVar.n());
                }
                o(0, 0, (byte) 4, (byte) 1);
                this.f42048n.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void m(int i2, long j) {
        while (j > 0) {
            int iMin = (int) Math.min(this.om, j);
            long j2 = iMin;
            j -= j2;
            o(i2, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f42048n.o(this.oo, j2);
        }
    }

    public final synchronized void o(int i2, int i3, List<n> list) {
        if (!this.on) {
            this.o.o(list);
            long jM = this.oo.m();
            int iMin = (int) Math.min(this.om - 4, jM);
            long j = iMin;
            o(i2, iMin + 4, (byte) 5, jM == j ? (byte) 4 : (byte) 0);
            this.f42048n.mo(i3 & Integer.MAX_VALUE);
            this.f42048n.o(this.oo, j);
            if (jM > j) {
                m(i2, jM - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(int i2, m mVar) {
        if (!this.on) {
            if (mVar.n0 != -1) {
                o(i2, 4, (byte) 3, (byte) 0);
                this.f42048n.mo(mVar.n0);
                this.f42048n.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(boolean z2, int i2, com.thinkup.core.common.no.n.n nVar, int i3) {
        if (!this.on) {
            o(i2, i3, (byte) 0, z2 ? (byte) 1 : (byte) 0);
            if (i3 > 0) {
                this.f42048n.o(nVar, i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void o(int i2, byte b2, com.thinkup.core.common.no.n.n nVar, int i3) {
        o(i2, i3, (byte) 0, b2);
        if (i3 > 0) {
            this.f42048n.o(nVar, i3);
        }
    }

    public final synchronized void o(boolean z2, int i2, int i3) {
        if (!this.on) {
            o(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
            this.f42048n.mo(i2);
            this.f42048n.mo(i3);
            this.f42048n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(int i2, m mVar, byte[] bArr) {
        try {
            if (!this.on) {
                if (mVar.n0 != -1) {
                    o(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f42048n.mo(i2);
                    this.f42048n.mo(mVar.n0);
                    if (bArr.length > 0) {
                        this.f42048n.o0(bArr);
                    }
                    this.f42048n.flush();
                } else {
                    throw oo.o("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(int i2, long j) {
        if (this.on) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            o(i2, 4, (byte) 8, (byte) 0);
            this.f42048n.mo((int) j);
            this.f42048n.flush();
        } else {
            throw oo.o("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
    }

    private void o(int i2, int i3, byte b2, byte b3) {
        Logger logger = m;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(oo.o(false, i2, i3, b2, b3));
        }
        int i4 = this.om;
        if (i3 > i4) {
            throw oo.o("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            o(this.f42048n, i3);
            this.f42048n.n0(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f42048n.n0(b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f42048n.mo(i2 & Integer.MAX_VALUE);
            return;
        }
        throw oo.o("reserved bit set: %s", Integer.valueOf(i2));
    }

    private static void o(com.thinkup.core.common.no.n.o0 o0Var, int i2) {
        o0Var.n0((i2 >>> 16) & 255);
        o0Var.n0((i2 >>> 8) & 255);
        o0Var.n0(i2 & 255);
    }

    public final synchronized void o(boolean z2, int i2, List<n> list) {
        if (!this.on) {
            this.o.o(list);
            long jM = this.oo.m();
            int iMin = (int) Math.min(this.om, jM);
            long j = iMin;
            byte b2 = jM == j ? (byte) 4 : (byte) 0;
            if (z2) {
                b2 = (byte) (b2 | 1);
            }
            o(i2, iMin, (byte) 1, b2);
            this.f42048n.o(this.oo, j);
            if (jM > j) {
                m(i2, jM - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
