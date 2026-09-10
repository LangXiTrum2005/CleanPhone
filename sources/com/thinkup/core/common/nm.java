package com.thinkup.core.common;

import android.content.Context;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.d9;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.o0n0;
import com.thinkup.core.common.on.oo00;
import com.thinkup.core.common.ooo.omn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nm {
    String m;
    String o;
    private List<com.thinkup.core.common.n.o> oo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41979n = "nm";
    private final Object o0 = new Object();
    private com.thinkup.core.common.n.o om = new com.thinkup.core.common.n.o() { // from class: com.thinkup.core.common.nm.1
        @Override // com.thinkup.core.common.n.o
        public final void onAdLoadFail(AdError adError) {
            synchronized (nm.this.o0) {
                try {
                    Iterator it = nm.this.oo.iterator();
                    while (it.hasNext()) {
                        com.thinkup.core.common.n.o oVar = (com.thinkup.core.common.n.o) it.next();
                        if (oVar != null) {
                            nm nmVar = nm.this;
                            omn.o(nmVar.o, String.valueOf(nmVar.m), com.thinkup.core.common.n.mo.o0m.m00, com.thinkup.core.common.n.mo.o0m.nm, "returned no eligible ads from any mediated networks. [listener:" + oVar.toString() + d9.i.f24752e);
                            oVar.onAdLoadFail(adError);
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.thinkup.core.common.n.o
        public final void onAdLoaded() {
            synchronized (nm.this.o0) {
                try {
                    if (nm.this.oo != null) {
                        Iterator it = nm.this.oo.iterator();
                        while (it.hasNext()) {
                            com.thinkup.core.common.n.o oVar = (com.thinkup.core.common.n.o) it.next();
                            if (oVar != null) {
                                nm nmVar = nm.this;
                                omn.o(nmVar.o, String.valueOf(nmVar.m), com.thinkup.core.common.n.mo.o0m.m00, com.thinkup.core.common.n.mo.o0m.no, "[listener:" + oVar.toString() + d9.i.f24752e);
                                oVar.onAdLoaded();
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    private static void o(oo00 oo00Var, mmm mmmVar) {
        com.thinkup.core.oo.m mVarH;
        com.thinkup.core.common.o0o.on onVarM0;
        if (oo00Var == null || (mVarH = a.h(a.i())) == null || (onVarM0 = mVarH.m0()) == null || !oon.o().o(oo00Var.o())) {
            return;
        }
        oon.o().o(onVarM0, oo00Var.o(), mmmVar);
    }

    public final void m(com.thinkup.core.common.n.o oVar) {
        synchronized (this.o0) {
            try {
                List<com.thinkup.core.common.n.o> list = this.oo;
                if (list == null) {
                    return;
                }
                list.remove(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(String str, String str2) {
        this.o = str;
        this.m = str2;
    }

    public final void o(com.thinkup.core.common.n.o oVar) {
        synchronized (this.o0) {
            try {
                if (this.oo == null) {
                    this.oo = new ArrayList();
                }
                if (oVar == null) {
                    return;
                }
                Iterator<com.thinkup.core.common.n.o> it = this.oo.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (it.next() == oVar) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    this.oo.add(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i2, mmm mmmVar, oo00 oo00Var, int i3) {
        boolean zNn;
        com.thinkup.core.oo.n0 n0VarO0;
        com.thinkup.core.common.nn.o0 o0Var;
        com.thinkup.core.oo.n0 n0VarO;
        com.thinkup.core.oo.n0 n0VarO2;
        String str = mmmVar.o;
        if (oo00Var != null) {
            oo00Var.toString();
        }
        om omVarO = ooo.o().o(this.o, String.valueOf(this.m));
        if (oo00Var != null && i3 != 10 && (n0VarO2 = oo00Var.o()) != null) {
            if (n0VarO2.o00() != 1) {
                oo00Var.toString();
                if (omVarO != null) {
                    omVarO.o(new o0n0(System.currentTimeMillis(), oo00Var.no()), n0VarO2);
                }
            } else if (i2 == 1) {
                oo00Var.toString();
                if (omVarO != null) {
                    omVarO.o(new o0n0(System.currentTimeMillis(), oo00Var.no()), n0VarO2);
                }
            }
        }
        if (omVarO != null) {
            omVarO.oo();
        }
        boolean z2 = (i3 == 13 || (n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(this.o)) == null || omVarO == null || TUAdxSetting.getInstance().isAdxNetworkMode(this.o) || n0VarO.o00() != 1 || omVarO.n() >= n0VarO.o0o()) ? false : true;
        this.om.onAdLoaded();
        if (mmmVar.f42198n != 9 && i2 != 3 && z2 && omVarO != null) {
            oo00Var.toString();
            mmm mmmVarN = mmmVar.n();
            mmmVarN.f42198n = 9;
            mmmVarN.oo = null;
            mmmVarN.o0 = null;
            omVarO.o(com.thinkup.core.common.n.o0n.m().on(), this.m, this.o, mmmVarN, (com.thinkup.core.common.n.o) null);
        }
        if (i2 == 1 && mmmVar.oo() && omVarO != null && (o0Var = omVarO.mm) != null) {
            o0Var.n();
        }
        if (!mmmVar.o0()) {
            if (oo00Var == null) {
                zNn = i2 == 3;
            } else {
                zNn = oo00Var.nn();
            }
            if (zNn) {
                com.thinkup.core.oo.nm nmVarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on());
                n0VarO0 = nmVarO.o0(this.o);
                if (n0VarO0 == null) {
                    n0VarO0 = nmVarO.oo(this.o);
                }
                (n0VarO0 == null ? "本地缓存策略为空" : Integer.valueOf(n0VarO0.omon())).toString();
                if (n0VarO0 != null) {
                    n0VarO0.ommm();
                }
                zNn = n0VarO0 != null && n0VarO0.ommm();
            } else {
                n0VarO0 = null;
            }
            if (zNn) {
                int i4 = n0VarO0.om0o() ? 13 : 14;
                om omVarO2 = om.o(mmmVar.o(), this.o, this.m);
                mmm mmmVarN2 = mmmVar.n();
                mmmVarN2.f42198n = i4;
                mmmVarN2.oo = null;
                mmmVarN2.o0 = null;
                omVarO2.o(mmmVar.o(), this.m, this.o, mmmVarN2, (com.thinkup.core.common.n.o) null);
            }
        }
        o(oo00Var, mmmVar);
    }

    public final void o(int i2, final mmm mmmVar, oo00 oo00Var, AdError adError) {
        boolean zIsMgWin;
        final om omVarO = ooo.o().o(this.o, String.valueOf(this.m));
        String str = mmmVar.o;
        if (oo00Var != null) {
            oo00Var.toString();
        }
        try {
            zIsMgWin = mmmVar.m().getPreLoadInfo().getMgComparedResult().isMgWin();
        } catch (Throwable unused) {
            zIsMgWin = false;
        }
        if (oo00Var != null && i2 == 2 && oo00Var.m() && !zIsMgWin) {
            if (omVarO != null && !ooo.o().oo(this.o)) {
                oo00Var.toString();
                com.thinkup.core.common.n.o0n.m();
                com.thinkup.core.common.n.o0n.m(new Runnable() { // from class: com.thinkup.core.common.nm.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        mmm mmmVarN = mmmVar.n();
                        mmmVarN.f42198n = 8;
                        mmmVarN.oo = null;
                        mmmVarN.o0 = null;
                        om omVar = omVarO;
                        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
                        nm nmVar = nm.this;
                        omVar.o(contextOn, nmVar.m, nmVar.o, mmmVarN, (com.thinkup.core.common.n.o) null);
                    }
                }, oo00Var.n());
            }
        } else {
            if (oo00Var != null) {
                oo00Var.toString();
            }
            if (i2 != 3 && omVarO != null) {
                omVarO.om();
            }
            this.om.onAdLoadFail(adError);
        }
        if (omVarO != null && mmmVar.oo()) {
            omVarO.o(adError);
        }
        if (i2 != 2 && TUSDK.isNetworkLogDebug()) {
            Log.e(com.thinkup.core.common.n.mo.oo0, "ad load failed: " + this.o + ", " + adError.printStackTrace());
        }
        o(oo00Var, mmmVar);
    }

    private boolean o(om omVar, int i2) {
        com.thinkup.core.oo.n0 n0VarO;
        return (i2 == 13 || (n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(this.o)) == null || omVar == null || TUAdxSetting.getInstance().isAdxNetworkMode(this.o) || n0VarO.o00() != 1 || omVar.n() >= n0VarO.o0o()) ? false : true;
    }

    private void o(int i2, mmm mmmVar, oo00 oo00Var) {
        boolean zNn;
        com.thinkup.core.oo.n0 n0VarO0;
        if (mmmVar == null || mmmVar.o0()) {
            return;
        }
        boolean z2 = false;
        if (oo00Var == null) {
            zNn = i2 == 3;
        } else {
            zNn = oo00Var.nn();
        }
        if (zNn) {
            com.thinkup.core.oo.nm nmVarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on());
            n0VarO0 = nmVarO.o0(this.o);
            if (n0VarO0 == null) {
                n0VarO0 = nmVarO.oo(this.o);
            }
            (n0VarO0 == null ? "本地缓存策略为空" : Integer.valueOf(n0VarO0.omon())).toString();
            if (n0VarO0 != null) {
                n0VarO0.ommm();
            }
            if (n0VarO0 != null && n0VarO0.ommm()) {
                z2 = true;
            }
            zNn = z2;
        } else {
            n0VarO0 = null;
        }
        if (zNn) {
            int i3 = n0VarO0.om0o() ? 13 : 14;
            om omVarO = om.o(mmmVar.o(), this.o, this.m);
            mmm mmmVarN = mmmVar.n();
            mmmVarN.f42198n = i3;
            mmmVarN.oo = null;
            mmmVarN.o0 = null;
            omVarO.o(mmmVar.o(), this.m, this.o, mmmVarN, (com.thinkup.core.common.n.o) null);
        }
    }
}
