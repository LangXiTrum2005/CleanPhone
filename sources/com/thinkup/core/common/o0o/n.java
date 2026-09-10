package com.thinkup.core.common.o0o;

import android.support.v4.media.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static final String n0 = "n";
    m0 m;
    String m0;
    Boolean mm;
    com.thinkup.core.common.o0n.m mn;
    boolean mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f42167n;
    private TUAdRequest no;
    String o;
    o0 o0;
    boolean om;
    long on;
    int oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.o0o.n$1, reason: invalid class name */
    public class AnonymousClass1 implements com.thinkup.core.common.o0n.m {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n.this.mn();
        }
    }

    public n(String str) {
        this.o = str;
        StringBuilder sbX = a.x(str, "_");
        sbX.append(hashCode());
        this.m0 = sbX.toString();
    }

    private void m0() {
        if (this.mn != null) {
            this.m.toString();
            com.thinkup.core.common.o0n.o0.o().o(this.mn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mm() {
        m0();
        o0 o0Var = this.o0;
        if (o0Var != null) {
            o0Var.o(this.m0, this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mn() {
        o0 o0Var = this.o0;
        if (o0Var != null) {
            o0Var.m(this.m0, this.m);
        }
    }

    private com.thinkup.core.common.om mo() {
        return com.thinkup.core.common.om.o(o0n.m().on(), this.o, String.valueOf(this.oo));
    }

    private mmm n0() {
        com.thinkup.core.common.on.m mVar;
        mmm mmmVar = new mmm();
        mmmVar.o(o0n.m().mm0());
        mmmVar.f42198n = this.f42167n;
        mmmVar.o(this.no);
        m0 m0Var = this.m;
        if (m0Var != null) {
            n0 n0Var = m0Var.on;
            mmm mmmVar2 = m0Var.om;
            com.thinkup.core.oo.n0 n0Var2 = m0Var.m0;
            on onVar = m0Var.mm;
            if (mmmVar2 != null) {
                mVar = mmmVar2.mo;
                if (mVar == null) {
                    mVar = new com.thinkup.core.common.on.m();
                }
                mVar.o(mmmVar2.o);
            } else {
                mVar = new com.thinkup.core.common.on.m();
                if (this.f42167n == 17) {
                    mVar.m(n0Var != null ? 1 : 2);
                }
            }
            mVar.o(this.m.mo);
            if (n0Var != null) {
                mVar.o(n0Var.oomn(), n0Var.no0(), n0Var.oomo());
            } else if (n0Var2 != null) {
                mVar.o(n0Var2.mo(), n0Var2.o0mn(), n0Var2.nmn());
            }
            if (onVar != null) {
                mVar.m(onVar.m0());
                mVar.o(onVar.om());
                mVar.o(onVar.mn());
            }
        } else {
            mVar = null;
        }
        mmmVar.mo = mVar;
        return mmmVar;
    }

    private Boolean om() {
        return this.mm;
    }

    private void on() {
        if (this.om && this.on != -1) {
            this.mn = new AnonymousClass1();
            com.thinkup.core.common.o0n.o0.o().o(this.mn, this.on, false);
        }
    }

    public final void n() {
        com.thinkup.core.common.on.m mVar;
        m0 m0Var = this.m;
        if (m0Var != null) {
            m0Var.toString();
        }
        com.thinkup.core.common.om omVarO = com.thinkup.core.common.om.o(o0n.m().on(), this.o, String.valueOf(this.oo));
        if (this.om && this.on != -1) {
            this.mn = new AnonymousClass1();
            com.thinkup.core.common.o0n.o0.o().o(this.mn, this.on, false);
        }
        mmm mmmVar = new mmm();
        mmmVar.o(o0n.m().mm0());
        mmmVar.f42198n = this.f42167n;
        mmmVar.o(this.no);
        m0 m0Var2 = this.m;
        if (m0Var2 != null) {
            n0 n0Var = m0Var2.on;
            mmm mmmVar2 = m0Var2.om;
            com.thinkup.core.oo.n0 n0Var2 = m0Var2.m0;
            on onVar = m0Var2.mm;
            if (mmmVar2 != null) {
                mVar = mmmVar2.mo;
                if (mVar == null) {
                    mVar = new com.thinkup.core.common.on.m();
                }
                mVar.o(mmmVar2.o);
            } else {
                mVar = new com.thinkup.core.common.on.m();
                if (this.f42167n == 17) {
                    mVar.m(n0Var != null ? 1 : 2);
                }
            }
            mVar.o(this.m.mo);
            if (n0Var != null) {
                mVar.o(n0Var.oomn(), n0Var.no0(), n0Var.oomo());
            } else if (n0Var2 != null) {
                mVar.o(n0Var2.mo(), n0Var2.o0mn(), n0Var2.nmn());
            }
            if (onVar != null) {
                mVar.m(onVar.m0());
                mVar.o(onVar.om());
                mVar.o(onVar.mn());
            }
        } else {
            mVar = null;
        }
        mmmVar.mo = mVar;
        omVarO.o(o0n.m().on(), String.valueOf(this.oo), this.o, mmmVar, new com.thinkup.core.common.n.o() { // from class: com.thinkup.core.common.o0o.n.2
            @Override // com.thinkup.core.common.n.o
            public final void onAdLoadFail(AdError adError) {
                n.this.o(adError);
            }

            @Override // com.thinkup.core.common.n.o
            public final void onAdLoaded() {
                n.this.mm();
            }
        });
    }

    public final int o0() {
        return this.f42167n;
    }

    public final String oo() {
        return this.o;
    }

    public final boolean m() {
        return this.mm == null || !this.mo;
    }

    public final void o(m mVar) {
        m0 m0Var = mVar.o;
        this.m = m0Var;
        this.f42167n = mVar.m;
        this.oo = m0Var.o;
        this.o0 = mVar.oo;
        this.om = mVar.f42165n;
        this.on = mVar.o0;
        this.no = mVar.om;
    }

    public final String o() {
        return this.m0;
    }

    private void o(Boolean bool) {
        this.mm = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(AdError adError) {
        m0();
        o0 o0Var = this.o0;
        if (o0Var != null) {
            o0Var.o(this.m0, this.m, adError);
        }
    }
}
