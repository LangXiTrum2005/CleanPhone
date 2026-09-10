package com.thinkup.core.common.o;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mn;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.oo0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static volatile n m;
    private final String o = getClass().getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, o> f42116n = new ConcurrentHashMap();

    public class o {
        private o0mm m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private TUBaseAdAdapter f42117n;
        private BaseAd o0;
        private String om;
        private com.thinkup.core.common.on.n0 on;
        private com.thinkup.core.common.on.o oo;

        public o() {
        }

        private com.thinkup.core.common.on.n0 om() {
            return this.on;
        }

        public final synchronized void n() {
            String unused = n.this.o;
            this.f42117n = null;
            this.o0 = null;
            this.oo = null;
        }

        public final o0mm o0() {
            return this.m;
        }

        public final synchronized com.thinkup.core.common.on.o oo() {
            return this.oo;
        }

        public final synchronized boolean m() {
            String unused = n.this.o;
            return o() != null;
        }

        public final synchronized void o(String str, com.thinkup.core.common.on.n0 n0Var) {
            String unused = n.this.o;
            this.om = str;
            this.on = n0Var;
        }

        public final synchronized com.thinkup.core.common.on.o o() {
            boolean zInternalIsAdReady;
            String unused = n.this.o;
            TUBaseAdAdapter tUBaseAdAdapter = this.f42117n;
            com.thinkup.core.common.on.n0 n0Var = this.on;
            if (tUBaseAdAdapter == null) {
                return null;
            }
            if (n0Var == null) {
                return null;
            }
            com.thinkup.core.common.on.o oVar = this.oo;
            if (oVar != null) {
                if (!oVar.mn()) {
                    String unused2 = n.this.o;
                    return null;
                }
                String unused3 = n.this.o;
                return this.oo;
            }
            this.o0 = null;
            if (TextUtils.equals(n0Var.oono(), "0")) {
                BaseAd baseAdObject = this.f42117n.getBaseAdObject(o0n.m().on());
                this.o0 = baseAdObject;
                zInternalIsAdReady = baseAdObject != null;
            } else {
                zInternalIsAdReady = this.f42117n.internalIsAdReady();
            }
            String unused4 = n.this.o;
            if (zInternalIsAdReady) {
                this.on.mom(12);
                this.on.no(m0n.o(this.m, this.f42117n));
                m0m.o(this.f42117n, this.on, this.m);
                BaseAd baseAd = this.o0;
                if (baseAd != null) {
                    baseAd.setTrackingInfo(this.f42117n.getTrackingInfo().nmm());
                }
                this.m.n0n().m(this.om);
                com.thinkup.core.n.o0.n.o(this.f42117n, this.m, this.on, this.o0);
                com.thinkup.core.common.on.o oVar2 = new com.thinkup.core.common.on.o();
                this.oo = oVar2;
                oVar2.o(this.f42117n);
                this.oo.n(System.currentTimeMillis());
                this.oo.m(this.m.on0());
                this.oo.o(this.m.mm0());
                this.oo.o("3");
                BaseAd baseAd2 = this.o0;
                if (baseAd2 != null) {
                    this.oo.o(baseAd2);
                }
            }
            return this.oo;
        }
    }

    private n() {
    }

    public static n o() {
        if (m == null) {
            synchronized (n.class) {
                try {
                    if (m == null) {
                        m = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final o o(Context context, String str, String str2, o0mm o0mmVar, com.thinkup.core.oo.n0 n0Var, Map<String, Object> map, TUAdRequest tUAdRequest) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if ((mVarH != null && !mVarH.mom() && mVarH.nm() != 1) || o0mmVar == null) {
            return null;
        }
        o0mn o0mnVarO = com.thinkup.core.common.o.o().o(str, o0mmVar);
        if (o0mnVarO != null && o0mnVarO.o((on0) null).m() != null) {
            return null;
        }
        o oVar = this.f42116n.get(str);
        if (oVar != null && oVar.f42117n != null) {
            return oVar;
        }
        on0 on0VarO = com.thinkup.core.n.n.o().o(str, o0mmVar);
        if (on0VarO != null) {
            on0VarO.o();
        }
        if (on0VarO != null && !on0VarO.o()) {
            o0mmVar.o(on0VarO, 0, 2, 1);
            com.thinkup.core.common.on.nm nmVarO = oo0.o(o0mmVar);
            TUBaseAdAdapter tUBaseAdAdapter = nmVarO != null ? nmVarO.o : null;
            if (tUBaseAdAdapter != null && tUBaseAdAdapter.internalInitNetworkObjectByPlacementId(context, n0Var.o(str, str2, o0mmVar, tUAdRequest), map)) {
                o oVar2 = new o();
                oVar2.f42117n = tUBaseAdAdapter;
                oVar2.m = o0mmVar;
                this.f42116n.put(str, oVar2);
                return oVar2;
            }
        }
        return null;
    }

    public final synchronized com.thinkup.core.common.on.o o(String str) {
        o oVar;
        com.thinkup.core.common.on.o oVarOo;
        if (TextUtils.isEmpty(str) || (oVar = this.f42116n.get(str)) == null || oVar.f42117n == null || (oVarOo = oVar.oo()) == null || !oVarOo.mn()) {
            return null;
        }
        com.thinkup.core.common.ooo.nn.o(oVar.o0());
        return oVarOo;
    }

    public final synchronized void o(String str, String str2) {
        o oVar;
        if (!TextUtils.isEmpty(str) && (oVar = this.f42116n.get(str)) != null && oVar.m != null && oVar.m.m0o().equals(str2)) {
            oVar.n();
            this.f42116n.remove(str);
        }
    }
}
