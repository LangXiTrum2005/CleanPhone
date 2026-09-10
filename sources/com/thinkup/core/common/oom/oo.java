package com.thinkup.core.common.oom;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oom;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.nm;
import com.thinkup.core.common.on.o00o;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mn;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.mn;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.oo0;
import com.thinkup.network.admob.AdmobTUConst;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    public static final String o = "oo";
    String m;
    n m0;
    boolean mm;
    long mn;
    boolean mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    o0mm f42311n;
    long n0;
    com.thinkup.core.common.o0n.m nm;
    o0 nn;
    com.thinkup.core.common.o0n.m no;
    n0 o0;
    Boolean o00;
    String o0m;
    boolean o0n;
    int o0o;
    int om;
    TUBaseAdAdapter on;
    String oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.oom.oo$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ o0mm m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f42312n;
        final /* synthetic */ TUBaseAdAdapter o;

        public AnonymousClass1(TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar, Map map) {
            this.o = tUBaseAdAdapter;
            this.m = o0mmVar;
            this.f42312n = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context contextO = oo.o(oo.this);
            byte b2 = 0;
            if (contextO == null) {
                if (oo.this.m0 != null) {
                    m mVar = new m();
                    mVar.f42293n = 0;
                    mVar.oo = SystemClock.elapsedRealtime() - oo.this.mn;
                    mVar.o0 = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    oo.this.o(this.o, mVar);
                    return;
                }
                return;
            }
            oo.o(oo.this, contextO, this.m, this.o);
            try {
                Map<String, Object> mapMm = oo.this.mm();
                oo.this.on = this.o;
                com.thinkup.core.common.nm.oo.o().n();
                TUBaseAdAdapter tUBaseAdAdapter = this.o;
                Map<String, Object> map = this.f42312n;
                oo ooVar = oo.this;
                tUBaseAdAdapter.internalLoad(contextO, map, mapMm, new com.thinkup.core.common.oom.o(ooVar.o0, ooVar.oo, map, new o(ooVar, ooVar, tUBaseAdAdapter, b2)));
                n0 trackingInfo = this.o.getTrackingInfo();
                String internalNetworkPlacementId = this.o.getInternalNetworkPlacementId();
                if (!TextUtils.isEmpty(internalNetworkPlacementId)) {
                    trackingInfo.no(internalNetworkPlacementId);
                }
                n nVar = oo.this.m0;
                if (nVar != null) {
                    nVar.o(trackingInfo, this.o);
                }
            } catch (Throwable th) {
                m mVar2 = new m();
                mVar2.f42293n = 0;
                mVar2.oo = SystemClock.elapsedRealtime() - oo.this.mn;
                mVar2.o0 = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                oo.this.o(this.o, mVar2);
            }
        }
    }

    public class o implements TUCustomLoadListener {
        oo m;
        TUBaseAdAdapter o;

        public /* synthetic */ o(oo ooVar, oo ooVar2, TUBaseAdAdapter tUBaseAdAdapter, byte b2) {
            this(ooVar2, tUBaseAdAdapter);
        }

        @Override // com.thinkup.core.api.TUCustomLoadListener
        public final void onAdCacheLoaded(final BaseAd... baseAdArr) {
            com.thinkup.core.common.nm.oo.o().o0();
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.oom.oo.o.2
                @Override // java.lang.Runnable
                public final void run() {
                    TUBaseAdAdapter tUBaseAdAdapter;
                    synchronized (o.this) {
                        try {
                            o oVar = o.this;
                            oo ooVar = oVar.m;
                            if (ooVar != null && (tUBaseAdAdapter = oVar.o) != null) {
                                ooVar.o(tUBaseAdAdapter, baseAdArr);
                                o oVar2 = o.this;
                                oVar2.m = null;
                                oVar2.o = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        @Override // com.thinkup.core.api.TUCustomLoadListener
        public final void onAdDataLoaded() {
            oo.o0(oo.this);
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.oom.oo.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (o.this) {
                        try {
                            o oVar = o.this;
                            oo ooVar = oVar.m;
                            if (ooVar != null && oVar.o != null) {
                                ooVar.o00();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        @Override // com.thinkup.core.api.TUCustomLoadListener
        public final void onAdLoadError(final String str, final String str2) {
            com.thinkup.core.common.nm.oo.o().o0();
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.oom.oo.o.3
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (o.this) {
                        try {
                            o oVar = o.this;
                            if (oVar.m != null && oVar.o != null) {
                                m mVar = new m();
                                mVar.f42293n = 0;
                                mVar.o0 = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                o oVar2 = o.this;
                                mVar.oo = jElapsedRealtime - oo.this.mn;
                                oVar2.m.o(oVar2.o, mVar);
                                o oVar3 = o.this;
                                oVar3.m = null;
                                oVar3.o = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        private o(oo ooVar, TUBaseAdAdapter tUBaseAdAdapter) {
            this.m = ooVar;
            this.o = tUBaseAdAdapter;
        }
    }

    public oo(o0mm o0mmVar, int i2) {
        this.f42311n = o0mmVar;
        this.o0o = i2;
        this.oo = o0mmVar.m0o();
        this.o0m = this.oo + "_" + hashCode();
    }

    private void m0() {
        if (this.nm != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.nm);
            this.nm = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> mm() {
        Map<String, Object> map = this.nn.om;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.f42311n.nm() == 2) {
            Object obj = map.get(AdmobTUConst.CONTENT_URLS);
            String string = "";
            try {
                Object obj2 = map.get(AdmobTUConst.CONTENT_KEYWORDS);
                if (obj2 instanceof List) {
                    string = obj2.toString();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if ((obj instanceof List) || !TextUtils.isEmpty(string)) {
                com.thinkup.core.common.oo0.oo.o(this.m, this.o0, AdmobTUConst.CONTENT_URLS, obj, string);
            }
        }
        return map;
    }

    private Context mn() {
        Context contextMm0 = this.nn.m.get();
        if (!(contextMm0 instanceof Activity)) {
            contextMm0 = o0n.m().mm0();
        }
        if (TUSDK.isNetworkLogDebug()) {
            Log.d(o, "requestContext = ".concat(String.valueOf(contextMm0)));
        }
        return contextMm0;
    }

    private Map<String, Object> mo() {
        o0 o0Var = this.nn;
        com.thinkup.core.oo.n0 n0Var = o0Var.oo;
        String str = o0Var.f42309n;
        if (n0Var == null) {
            return new HashMap();
        }
        n0 n0Var2 = this.o0;
        Map<String, Object> mapO = n0Var.o(this.m, str, this.f42311n, n0Var2 != null ? n0Var2.o() : null);
        int iNm = this.f42311n.nm();
        if (iNm == 2) {
            com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(this.nn.o));
            if (mVarH != null) {
                mapO.put("mediation_switch", Boolean.valueOf(mVarH.nn() == 1));
            }
            if (n0Var.n0() == 1) {
                mapO.put("admob_show_with_pay_info", Integer.valueOf(n0Var.n0()));
            } else {
                mapO.put("admob_show_with_pay_info", Integer.valueOf(this.f42311n.ooo0()));
            }
        } else if (iNm == 6) {
            JSONObject jSONObjectO = nn.o(this.nn.o, str, this.m, n0Var.o00n(), this.om);
            if (n0Var.oomm() == 1) {
                mapO.put("tp_info", jSONObjectO.toString());
            }
        } else if (iNm == 22) {
            com.thinkup.core.common.ooo.om.o(n0Var, mapO, this.f42311n, this.nn.mo);
        } else if (iNm == 76) {
            mapO.put("internal_vast_load_timeout", Long.valueOf(this.f42311n.onm()));
        }
        if (!m0n.o(this.f42311n) || this.nn.oo.ooon() != 1) {
            return mapO;
        }
        o00o o00oVarO = com.thinkup.core.m.o.o(this.nn.o).o(this.m, this.nn.oo.o00n());
        mapO.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_LOAD_SEQ, Integer.valueOf(o00oVarO != null ? o00oVarO.f42227n : 0));
        synchronized (ooo.o().o(this.m)) {
            try {
                String strO = ooo.o().o(this.m, this.f42311n.nm());
                if (!TextUtils.isEmpty(strO)) {
                    mapO.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.CONTENT, strO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapO;
    }

    private boolean n0() {
        return !this.o0n || this.mm || o0m();
    }

    private com.thinkup.core.common.o0n.m nm() {
        return new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.common.oom.oo.2
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.oom.oo.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        oo.this.no();
                    }
                });
            }
        };
    }

    private void nn() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.mn;
        this.n0 = j;
        n0 n0Var = this.o0;
        if (n0Var != null) {
            n0Var.o0m(j);
            this.o0.n0(jElapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void no() {
        if (n0()) {
            return;
        }
        this.mo = true;
        String str = this.oo;
        n nVar = this.m0;
        if (nVar != null) {
            nVar.o(this.o0m, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o00() {
        on();
    }

    private boolean o0m() {
        return this.o00 != null;
    }

    private long o0n() {
        return this.mn;
    }

    private void o0o() {
        this.on = null;
    }

    private void on() {
        if (this.no != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.no);
            this.no = null;
        }
    }

    private boolean oo0() {
        return this.mo;
    }

    public final boolean o0() {
        return (o0m() && this.mo) ? false : true;
    }

    public final o0mm om() {
        return this.f42311n;
    }

    private void m(long j) {
        if (j == -1) {
            return;
        }
        this.no = nm();
        com.thinkup.core.common.o0n.o0.o().o(this.no, j, false);
    }

    public static /* synthetic */ void o0(oo ooVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - ooVar.mn;
        ooVar.n0 = j;
        n0 n0Var = ooVar.o0;
        if (n0Var != null) {
            n0Var.o0m(j);
            ooVar.o0.n0(jElapsedRealtime);
        }
    }

    public final Boolean n() {
        return this.o00;
    }

    public final String o() {
        return this.o0m;
    }

    public final int oo() {
        return this.o0o;
    }

    public final void o(o0 o0Var) {
        this.nn = o0Var;
        this.m = o0Var.o0;
        this.o0 = o0Var.m0;
        this.om = o0Var.on;
    }

    public final synchronized void m() {
        if (n0()) {
            return;
        }
        this.o00 = Boolean.FALSE;
        this.mm = true;
        m mVar = new m();
        mVar.f42293n = 0;
        mVar.oo = SystemClock.elapsedRealtime() - this.mn;
        mVar.o0 = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        o(this.on, mVar);
    }

    public final void o(n nVar) {
        this.m0 = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    public final void o(o0mm o0mmVar) {
        boolean z2;
        com.thinkup.core.common.on.o oVarOo;
        BaseAd baseAdM;
        TUBaseAdAdapter tUBaseAdAdapterO;
        nm nmVarO;
        String strO;
        boolean z3 = true;
        this.o0n = true;
        on0 on0VarN0n = this.f42311n.n0n();
        if (on0VarN0n != null && on0VarN0n.nn()) {
            if (this.m0 != null) {
                m mVar = new m();
                mVar.f42293n = 0;
                mVar.oo = 0L;
                mVar.o0 = ErrorCode.getErrorCode(ErrorCode.biddingResultHasShow, "", "Bidding result has been used");
                mVar.m0 = 1;
                o((TUBaseAdAdapter) null, mVar);
                return;
            }
            return;
        }
        if (this.f42311n.oom() && this.f42311n.n0n() != null && !TextUtils.isEmpty(this.nn.f42309n)) {
            this.f42311n.n0n().m(this.nn.f42309n);
        }
        o0mn o0mnVarO = com.thinkup.core.common.o.o().o(this.m, this.f42311n);
        if (o0mnVarO != null) {
            com.thinkup.core.common.on.m0 m0VarO = o0mnVarO.o(this.f42311n.n0n());
            int iO0 = m0VarO.o0();
            if (this.f42311n.ooo() == 1) {
                oVarOo = m0VarO.oo();
                if (oVarOo != null) {
                    this.f42311n.toString();
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                com.thinkup.core.common.on.o oVarO = m0VarO.o();
                if (!m0VarO.n() || oVarO == null) {
                    z2 = false;
                } else {
                    if (mn.o(this.f42311n, o0mmVar) >= 0) {
                        nn.o(o0mmVar);
                        this.f42311n.toString();
                    } else if (iO0 >= this.f42311n.oo0n()) {
                        this.f42311n.toString();
                    } else {
                        z2 = false;
                    }
                    z2 = true;
                }
                oVarOo = oVarO;
            }
            this.f42311n.toString();
        } else {
            this.f42311n.toString();
            z2 = false;
            oVarOo = null;
        }
        if (z2) {
            n nVar = this.m0;
            if (nVar != null) {
                nVar.o(oVarOo.oo().getTrackingInfo(), oVarOo.oo());
            }
            this.f42311n.toString();
            o(oVarOo.oo(), this.f42311n, oVarOo);
            return;
        }
        this.f42311n.toString();
        if (on0VarN0n == null || !on0VarN0n.oo0) {
            z3 = false;
            baseAdM = null;
            tUBaseAdAdapterO = null;
        } else {
            com.thinkup.core.n.n.m mVar2 = on0VarN0n.o0n;
            if (mVar2 != null) {
                tUBaseAdAdapterO = mVar2.o();
                baseAdM = mVar2.m();
            } else {
                baseAdM = null;
                tUBaseAdAdapterO = null;
            }
            on0VarN0n.o0n = null;
        }
        if (tUBaseAdAdapterO != null || z3) {
            nmVarO = null;
        } else {
            nmVarO = oo0.o(this.f42311n);
            tUBaseAdAdapterO = nmVarO != null ? nmVarO.o : null;
        }
        if (tUBaseAdAdapterO == null) {
            if (this.m0 != null) {
                m mVar3 = new m();
                mVar3.f42293n = 0;
                mVar3.oo = z3 ? this.f42311n.oon() : 0L;
                if (z3) {
                    strO = "";
                } else {
                    strO = this.f42311n.oo0() + " does not exist!";
                }
                if (nmVarO != null) {
                    strO = nmVarO.o(strO);
                }
                mVar3.o0 = ErrorCode.getErrorCode(z3 ? ErrorCode.c2sBiddingCacheError : ErrorCode.adapterNotExistError, "", strO);
                o((TUBaseAdAdapter) null, mVar3);
                return;
            }
            return;
        }
        n0 n0VarO = m0m.o(tUBaseAdAdapterO, this.o0, this.f42311n);
        this.o0 = n0VarO;
        n0VarO.no(m0n.o(this.f42311n, (TUBaseAdAdapter) null));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mn = jElapsedRealtime;
        this.o0.o(jElapsedRealtime);
        n nVar2 = this.m0;
        if (nVar2 != null) {
            nVar2.o(tUBaseAdAdapterO, String.valueOf(this.nn.oo.o00n()));
        }
        n nVar3 = this.m0;
        if (nVar3 != null) {
            nVar3.o(this.o0);
        }
        long jMmo = this.f42311n.mmo();
        if (jMmo != -1) {
            this.no = nm();
            com.thinkup.core.common.o0n.o0.o().o(this.no, jMmo, false);
        }
        long jOnm = this.f42311n.onm();
        if (jOnm != -1) {
            this.nm = nm();
            com.thinkup.core.common.o0n.o0.o().o(this.nm, jOnm, false);
        }
        Context context = this.nn.m.get();
        if (context != null && (context instanceof Activity)) {
            tUBaseAdAdapterO.refreshActivityContext((Activity) context);
        }
        if (z3) {
            n nVar4 = this.m0;
            if (nVar4 != null) {
                nVar4.o(this.o0, tUBaseAdAdapterO);
            }
            if (baseAdM != null) {
                o(tUBaseAdAdapterO, baseAdM);
                return;
            } else {
                o(tUBaseAdAdapterO, new BaseAd[0]);
                return;
            }
        }
        o0mm o0mmVar2 = this.f42311n;
        Map<String, Object> mapMo = mo();
        String strValueOf = String.valueOf(this.nn.oo.o00n());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(tUBaseAdAdapterO, o0mmVar2, mapMo);
        if (TextUtils.equals(strValueOf, "2")) {
            o0n.m().m(anonymousClass1);
        } else {
            com.thinkup.core.common.ooo.m.m.o().m(anonymousClass1);
        }
    }

    private void o(long j) {
        if (j == -1) {
            return;
        }
        this.nm = nm();
        com.thinkup.core.common.o0n.o0.o().o(this.nm, j, false);
    }

    private void o(TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar) {
        Map<String, Object> mapMo = mo();
        String strValueOf = String.valueOf(this.nn.oo.o00n());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(tUBaseAdAdapter, o0mmVar, mapMo);
        if (TextUtils.equals(strValueOf, "2")) {
            o0n.m().m(anonymousClass1);
        } else {
            com.thinkup.core.common.ooo.m.m.o().m(anonymousClass1);
        }
    }

    private void o(Context context, o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
        if (com.thinkup.core.oo.m.oomm()) {
            oom oomVarO = oom.o(o0n.m().on());
            try {
                boolean zM = oomVarO.m(o0mmVar.nm());
                if (oomVarO.m(o0mmVar.nm(), zM) && tUBaseAdAdapter.internalSetUserDataConsent(context, zM, TUSDK.isEUTraffic(this.nn.o))) {
                    oomVarO.o(o0mmVar.nm(), zM);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void o(TUBaseAdAdapter tUBaseAdAdapter) {
        this.on = tUBaseAdAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(TUBaseAdAdapter tUBaseAdAdapter, BaseAd... baseAdArr) {
        try {
            if (n0()) {
                return;
            }
            o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
            long jOon = unitGroupInfo.om0() == 2 ? unitGroupInfo.oon() : 0L;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.o0.o0n((jElapsedRealtime - this.mn) + jOon);
            this.o0.no(jElapsedRealtime);
            m0m.o(this.o0, tUBaseAdAdapter);
            on();
            m0();
            this.on = null;
            this.o00 = Boolean.TRUE;
            if (this.mo) {
                this.o0.ooo = 1;
            }
            n nVar = this.m0;
            if (nVar != null) {
                nVar.o(this.o0m, tUBaseAdAdapter, baseAdArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void o(TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar, com.thinkup.core.common.on.o oVar) {
        try {
            if (n0()) {
                return;
            }
            on();
            m0();
            this.on = null;
            this.o00 = Boolean.TRUE;
            if (this.mo) {
                this.o0.ooo = 1;
            }
            n nVar = this.m0;
            if (nVar != null) {
                nVar.o(this.o0m, tUBaseAdAdapter, o0mmVar, oVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(final TUBaseAdAdapter tUBaseAdAdapter, m mVar) {
        try {
            if (n0()) {
                return;
            }
            on();
            m0();
            if (tUBaseAdAdapter != null) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.oom.oo.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            TUBaseAdAdapter tUBaseAdAdapter2 = tUBaseAdAdapter;
                            if (tUBaseAdAdapter2 != null) {
                                tUBaseAdAdapter2.internalDestory();
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
            this.on = null;
            this.o00 = Boolean.FALSE;
            boolean z2 = this.mm;
            if (z2) {
                this.o0.ooo = 2;
            } else if (this.mo) {
                this.o0.ooo = 1;
            }
            if (!z2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.thinkup.core.common.n.o().o(this.oo, jCurrentTimeMillis);
                com.thinkup.core.common.n.o().o(this.oo, jCurrentTimeMillis, mVar.o0);
            }
            mVar.om = this.o0;
            mVar.on = this.f42311n;
            n nVar = this.m0;
            if (nVar != null) {
                nVar.o(this.o0m, tUBaseAdAdapter, mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ Context o(oo ooVar) {
        Context contextMm0 = ooVar.nn.m.get();
        if (!(contextMm0 instanceof Activity)) {
            contextMm0 = o0n.m().mm0();
        }
        if (TUSDK.isNetworkLogDebug()) {
            Log.d(o, "requestContext = ".concat(String.valueOf(contextMm0)));
        }
        return contextMm0;
    }

    public static /* synthetic */ void o(oo ooVar, Context context, o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
        if (com.thinkup.core.oo.m.oomm()) {
            oom oomVarO = oom.o(o0n.m().on());
            try {
                boolean zM = oomVarO.m(o0mmVar.nm());
                if (oomVarO.m(o0mmVar.nm(), zM) && tUBaseAdAdapter.internalSetUserDataConsent(context, zM, TUSDK.isEUTraffic(ooVar.nn.o))) {
                    oomVarO.o(o0mmVar.nm(), zM);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
