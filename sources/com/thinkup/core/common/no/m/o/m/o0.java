package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.m0m;
import com.thinkup.core.common.no.m.o0m;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.oon;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class o0 {
    static final /* synthetic */ boolean o = true;
    private final mm m;
    private final mo m0;
    private boolean mm;
    private m0m mn;
    private oo mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.m.o f42013n;
    private final om o0;
    private final o0m om;
    private mo.o on;
    private final com.thinkup.core.common.no.m.oo oo;

    public o0(mm mmVar, om omVar, com.thinkup.core.common.no.m.o oVar, com.thinkup.core.common.no.m.oo ooVar, o0m o0mVar) {
        this.m = mmVar;
        this.o0 = omVar;
        this.f42013n = oVar;
        this.oo = ooVar;
        this.om = o0mVar;
        this.m0 = new mo(oVar, omVar.o, ooVar, o0mVar);
    }

    private boolean oo() {
        oo ooVar = this.m.o;
        return ooVar != null && ooVar.f42015n == 0 && com.thinkup.core.common.no.m.o.n.o(ooVar.o().o().o(), this.f42013n.o());
    }

    public final void m() {
        if (!o && Thread.holdsLock(this.o0)) {
            throw new AssertionError();
        }
        synchronized (this.o0) {
            this.mm = true;
        }
    }

    public final boolean n() {
        boolean z2;
        synchronized (this.o0) {
            z2 = this.mm;
        }
        return z2;
    }

    public final com.thinkup.core.common.no.m.o.n.n o(omm ommVar, oon.o oVar, boolean z2) {
        try {
            return o(oVar.o0(), oVar.oo(), oVar.om(), ommVar.m(), ommVar.o00(), z2).o(ommVar, oVar);
        } catch (m0 e2) {
            m();
            throw e2;
        } catch (IOException e3) {
            m();
            throw new m0(e3);
        }
    }

    public final boolean o0() {
        synchronized (this.o0) {
            try {
                boolean z2 = true;
                if (this.mn != null) {
                    return true;
                }
                if (oo()) {
                    this.mn = this.m.o.o();
                    return true;
                }
                mo.o oVar = this.on;
                if ((oVar == null || !oVar.o()) && !this.m0.o()) {
                    z2 = false;
                }
                return z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private oo o(int i2, int i3, int i4, int i5, boolean z2, boolean z3) throws Throwable {
        while (true) {
            oo ooVarO = o(i2, i3, i4, i5, z2);
            boolean z4 = z2;
            int i6 = i5;
            int i7 = i4;
            int i8 = i3;
            int i9 = i2;
            synchronized (this.o0) {
                if (ooVarO.o0 == 0 && !ooVarO.on()) {
                    return ooVarO;
                }
                if (ooVarO.o(z3)) {
                    return ooVarO;
                }
                ooVarO.oo();
                i2 = i9;
                i3 = i8;
                i4 = i7;
                i5 = i6;
                z2 = z4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    private oo o(int i2, int i3, int i4, int i5, boolean z2) throws Throwable {
        Socket socketM;
        Socket socketOo;
        oo ooVar;
        boolean z3;
        m0m m0mVarM;
        boolean z4;
        List<m0m> listN;
        oo ooVar2;
        mo.o oVar;
        synchronized (this.o0) {
            try {
                if (!this.m.mm()) {
                    this.mm = false;
                    mm mmVar = this.m;
                    oo ooVar3 = mmVar.o;
                    socketM = null;
                    socketOo = (ooVar3 == null || !ooVar3.m) ? null : mmVar.oo();
                    mm mmVar2 = this.m;
                    ooVar = mmVar2.o;
                    if (ooVar == null) {
                        ooVar = null;
                    }
                    if (ooVar != null) {
                        z3 = false;
                        m0mVarM = null;
                    } else if (this.o0.o(this.f42013n, mmVar2, null, false)) {
                        ooVar = this.m.o;
                        m0mVarM = null;
                        z3 = true;
                    } else {
                        m0mVarM = this.mn;
                        if (m0mVarM != null) {
                            this.mn = null;
                        } else if (oo()) {
                            m0mVarM = this.m.o.o();
                        } else {
                            z3 = false;
                            m0mVarM = null;
                        }
                        z3 = false;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.thinkup.core.common.no.m.o.n.o(socketOo);
        if (ooVar != null) {
            return ooVar;
        }
        if (m0mVarM != null || ((oVar = this.on) != null && oVar.o())) {
            z4 = false;
        } else {
            this.on = this.m0.m();
            z4 = true;
        }
        synchronized (this.o0) {
            try {
                if (this.m.mm()) {
                    throw new IOException("Canceled");
                }
                if (z4) {
                    listN = this.on.n();
                    if (this.o0.o(this.f42013n, this.m, listN, false)) {
                        ooVar = this.m.o;
                        z3 = true;
                    }
                } else {
                    listN = null;
                }
                if (!z3) {
                    if (m0mVarM == null) {
                        m0mVarM = this.on.m();
                    }
                    ooVar = new oo(this.o0, m0mVarM);
                    this.mo = ooVar;
                }
                ooVar2 = ooVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z3) {
            return ooVar2;
        }
        ooVar2.o(i2, i3, i4, i5, z2);
        this.o0.o.m(ooVar2.o());
        synchronized (this.o0) {
            try {
                this.mo = null;
                if (this.o0.o(this.f42013n, this.m, listN, true)) {
                    ooVar2.m = true;
                    socketM = ooVar2.m();
                    ooVar2 = this.m.o;
                    this.mn = m0mVarM;
                } else {
                    this.o0.o(ooVar2);
                    this.m.o(ooVar2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        com.thinkup.core.common.no.m.o.n.o(socketM);
        return ooVar2;
    }

    public final oo o() {
        if (o || Thread.holdsLock(this.o0)) {
            return this.mo;
        }
        throw new AssertionError();
    }
}
