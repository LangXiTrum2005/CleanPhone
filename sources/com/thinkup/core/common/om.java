package com.thinkup.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.o00m;
import com.thinkup.core.common.on.o00n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mo;
import com.thinkup.core.common.on.o0n0;
import com.thinkup.core.common.on.o0nm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.omn;
import com.thinkup.core.common.on.oo00;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.ono;
import com.thinkup.core.debugger.CoreDebuggerManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    protected String m;
    com.thinkup.core.common.nn.o0 mm;
    com.thinkup.core.common.nn.n mo;
    private boolean nm;
    private long nn;
    protected Context o;
    protected boolean o0;
    private mmm o0m;
    private TUAdRequest o0o;
    nm on;
    private final String n0 = "om";
    protected String oo = "";
    private String no = "";
    private boolean o00 = false;
    protected int om = 1;
    m0.o0 mn = new m0.o0() { // from class: com.thinkup.core.common.om.5
        @Override // com.thinkup.core.common.m0.o0
        public final void o(on onVar) {
            if (onVar != null) {
                onVar.m();
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ConcurrentHashMap<String, on> f42171n = new ConcurrentHashMap<>(5);
    final List<o0n0> m0 = Collections.synchronizedList(new ArrayList(2));

    /* JADX INFO: renamed from: com.thinkup.core.common.om$3, reason: invalid class name */
    public class AnonymousClass3 implements com.thinkup.core.common.oom.m.m {
        final /* synthetic */ Context m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42174n;
        final /* synthetic */ mmm o;
        final /* synthetic */ String o0;
        final /* synthetic */ com.thinkup.core.common.on.n0 om;
        final /* synthetic */ com.thinkup.core.oo.n0 oo;

        public AnonymousClass3(mmm mmmVar, Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2) {
            this.o = mmmVar;
            this.m = context;
            this.f42174n = str;
            this.o0 = str2;
            this.oo = n0Var;
            this.om = n0Var2;
        }

        @Override // com.thinkup.core.common.oom.m.m
        public final void o() {
            com.thinkup.core.common.on.om omVar = this.o.no;
            if (omVar != null) {
                omVar.on(System.currentTimeMillis());
            }
            om.m(om.this, this.m, this.f42174n, this.o0, this.oo, this.om, this.o);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.om$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ mmm m;
        final /* synthetic */ oo00 m0;
        final /* synthetic */ o0nm mm;
        final /* synthetic */ o00n mn;
        final /* synthetic */ com.thinkup.core.common.on.n0 mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42175n;
        final /* synthetic */ omn n0;
        final /* synthetic */ Boolean nm;
        final /* synthetic */ Double[] nn;
        final /* synthetic */ com.thinkup.core.common.oom.mo no;
        final /* synthetic */ Context o;
        final /* synthetic */ String o0;
        final /* synthetic */ boolean o00;
        final /* synthetic */ on o0m;
        final /* synthetic */ m0 o0o;
        final /* synthetic */ boolean om;
        final /* synthetic */ List on;
        final /* synthetic */ com.thinkup.core.oo.n0 oo;

        public AnonymousClass4(Context context, mmm mmmVar, String str, String str2, com.thinkup.core.oo.n0 n0Var, boolean z2, List list, oo00 oo00Var, com.thinkup.core.common.on.n0 n0Var2, o0nm o0nmVar, o00n o00nVar, omn omnVar, com.thinkup.core.common.oom.mo moVar, Boolean bool, Double[] dArr, boolean z3, m0 m0Var, on onVar) {
            this.o = context;
            this.m = mmmVar;
            this.f42175n = str;
            this.o0 = str2;
            this.oo = n0Var;
            this.om = z2;
            this.on = list;
            this.m0 = oo00Var;
            this.mo = n0Var2;
            this.mm = o0nmVar;
            this.mn = o00nVar;
            this.n0 = omnVar;
            this.no = moVar;
            this.nm = bool;
            this.nn = dArr;
            this.o00 = z3;
            this.o0o = m0Var;
            this.o0m = onVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Double d;
            try {
                o0om o0omVar = new o0om();
                o0omVar.m = this.o;
                o0omVar.f42240n = this.m;
                o0omVar.o0 = this.f42175n;
                o0omVar.oo = this.o0;
                o0omVar.om = this.oo.o00n();
                o0omVar.on = this.oo.no0();
                o0omVar.m0 = this.oo.n00();
                o0omVar.mo = this.oo.onn();
                mo.o();
                o0omVar.n0 = mo.o(this.oo, this.om);
                mo.o();
                o0omVar.nn = mo.o(this.oo);
                mo.o();
                o0omVar.o00 = mo.m(this.oo);
                o0omVar.mm = this.on;
                o0omVar.nm = this.m0;
                o0omVar.o0n = this.mo;
                o0omVar.oom = this.mm;
                o0omVar.oon = this.mn;
                o0omVar.om0 = this.n0;
                o0omVar.o0o = ooo.o().m(om.this.m);
                o0omVar.no = this.om;
                mmm mmmVar = this.m;
                if (mmmVar.f42198n == 8) {
                    o0omVar.oo0 = 7;
                }
                o0omVar.omo = this.no;
                o0omVar.omn = mmmVar.n0;
                o0omVar.on0 = o0.o().n(om.this.m);
                Boolean bool = this.nm;
                int iOnmm = 0;
                if (bool != null && bool.booleanValue() && (d = this.nn[0]) != null) {
                    o0omVar.ono = d.doubleValue();
                }
                if (this.o00 && this.oo.onmm() > 0) {
                    iOnmm = this.oo.onmm();
                }
                o0omVar.onm = iOnmm;
                o0omVar.onn = this.oo.m00n();
                o0omVar.m00 = this.o0o;
                com.thinkup.core.n.m0 m0Var = new com.thinkup.core.n.m0(o0omVar);
                m0Var.o(TUSDK.isNetworkLogDebug());
                m0Var.o(new mm.o() { // from class: com.thinkup.core.common.om.4.1
                    @Override // com.thinkup.core.common.mm.o
                    public final void o(String str, List<o0mm> list, List<o0mm> list2, boolean z2) {
                        boolean zO0 = AnonymousClass4.this.m0.o0();
                        ArrayList arrayList = null;
                        for (o0mm o0mmVar : list2) {
                            if (zO0 && (o0mmVar.om0() == 1 || o0mmVar.om0() == 3)) {
                                if (o0mmVar.nom() != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList(4);
                                    }
                                    o0mmVar.m0o(7);
                                    arrayList.add(o0mmVar);
                                }
                            }
                            if (!zO0 && o0mmVar.oon() != 0) {
                                n nVarO = n.o();
                                nVarO.f41885n.put(o0mmVar.m0o(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        AnonymousClass4.this.o0m.o(list, list2, arrayList, list2);
                        if (z2) {
                            AnonymousClass4.this.o0m.oo();
                        }
                    }

                    @Override // com.thinkup.core.common.mm.o
                    public final void o(String str) {
                        AnonymousClass4.this.o0m.o0();
                    }
                });
            } catch (Throwable th) {
                com.thinkup.core.common.oo0.oo.m("notifyBiddingFinish error", th.getMessage() + ", " + com.thinkup.core.common.ooo.o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
                this.o0m.oo();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.om$7, reason: invalid class name */
    public class AnonymousClass7 implements com.thinkup.core.common.n.o {
        final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42176n;
        final /* synthetic */ com.thinkup.core.common.n.o[] o;
        final /* synthetic */ String o0;
        final /* synthetic */ com.thinkup.core.oo.n0 om;
        final /* synthetic */ mmm oo;

        public AnonymousClass7(com.thinkup.core.common.n.o[] oVarArr, String str, String str2, String str3, mmm mmmVar, com.thinkup.core.oo.n0 n0Var) {
            this.o = oVarArr;
            this.m = str;
            this.f42176n = str2;
            this.o0 = str3;
            this.oo = mmmVar;
            this.om = n0Var;
        }

        @Override // com.thinkup.core.common.n.o
        public final void onAdLoadFail(AdError adError) {
            if (this.o[0] != null) {
                com.thinkup.core.common.oo0.oo.o(this.m, this.f42176n, (com.thinkup.core.common.on.n0) null, this.o0, this.oo.o, this.om, false, "0", "0", "");
                this.o[0].onAdLoadFail(adError);
            }
        }

        @Override // com.thinkup.core.common.n.o
        public final void onAdLoaded() {
            if (this.o[0] != null) {
                com.thinkup.core.common.oo0.oo.o(this.m, this.f42176n, (com.thinkup.core.common.on.n0) null, this.o0, this.oo.o, this.om, true, "0", "1", "");
                this.o[0].onAdLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.om$8, reason: invalid class name */
    public class AnonymousClass8 implements com.thinkup.core.common.n.o {
        final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42177n;
        final /* synthetic */ String o;
        final /* synthetic */ mmm o0;
        final /* synthetic */ com.thinkup.core.common.n.o[] om;
        final /* synthetic */ Context on;
        final /* synthetic */ com.thinkup.core.oo.n0 oo;

        public AnonymousClass8(String str, String str2, String str3, mmm mmmVar, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.n.o[] oVarArr, Context context) {
            this.o = str;
            this.m = str2;
            this.f42177n = str3;
            this.o0 = mmmVar;
            this.oo = n0Var;
            this.om = oVarArr;
            this.on = context;
        }

        @Override // com.thinkup.core.common.n.o
        public final void onAdLoadFail(AdError adError) {
            com.thinkup.core.common.on.o oVarM = om.m(this.on, this.m, this.f42177n, this.o0);
            if (oVarM == null) {
                oon.o().m(this.m, this.o0.m());
                com.thinkup.core.common.oo0.oo.o(this.o, this.m, (com.thinkup.core.common.on.n0) null, this.f42177n, this.o0.o, this.oo, false, "0", "0", "");
                com.thinkup.core.common.n.o oVar = this.om[0];
                if (oVar != null) {
                    oVar.onAdLoadFail(adError);
                    return;
                }
                return;
            }
            com.thinkup.core.common.ooo.omn.o("Shared", "placementId:" + this.o + ";result_callback:success;");
            com.thinkup.core.common.on.n0 n0VarMo = oVarM.mo();
            com.thinkup.core.common.oo0.oo.o(this.o, this.m, n0VarMo, this.f42177n, this.o0.o, this.oo, true, "1", "0", n0VarMo != null ? n0VarMo.oon0() : "");
            com.thinkup.core.common.n.o oVar2 = this.om[0];
            if (oVar2 != null) {
                oVar2.onAdLoaded();
            }
        }

        @Override // com.thinkup.core.common.n.o
        public final void onAdLoaded() {
            com.thinkup.core.common.oo0.oo.o(this.o, this.m, (com.thinkup.core.common.on.n0) null, this.f42177n, this.o0.o, this.oo, true, "2", "1", "");
            com.thinkup.core.common.n.o oVar = this.om[0];
            if (oVar != null) {
                oVar.onAdLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.om$9, reason: invalid class name */
    public class AnonymousClass9 implements Comparator<com.thinkup.core.common.on.o> {
        public AnonymousClass9() {
        }

        private static int o(com.thinkup.core.common.on.o oVar, com.thinkup.core.common.on.o oVar2) {
            return com.thinkup.core.common.ooo.mn.o(oVar.nn(), oVar2.nn());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.thinkup.core.common.on.o oVar, com.thinkup.core.common.on.o oVar2) {
            return com.thinkup.core.common.ooo.mn.o(oVar.nn(), oVar2.nn());
        }
    }

    private om(Context context, String str) {
        this.o = context.getApplicationContext();
        this.m = str;
        if (com.thinkup.core.common.n.o0n.m().on() == null) {
            com.thinkup.core.common.n.o0n.m().o(this.o);
        }
    }

    public static /* synthetic */ boolean m0(om omVar) {
        omVar.nm = false;
        return false;
    }

    private boolean mn() {
        return System.currentTimeMillis() - this.nn <= 2000;
    }

    public static /* synthetic */ long mo(om omVar) {
        omVar.nn = 0L;
        return 0L;
    }

    private mmm n0() {
        return this.o0m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean nm() {
        com.thinkup.core.common.nn.o0 o0Var = this.mm;
        return o0Var != null && o0Var.m();
    }

    private void nn() {
        com.thinkup.core.common.nn.o0 o0Var = this.mm;
        if (o0Var != null) {
            o0Var.o0();
        }
    }

    private boolean no() {
        return !TextUtils.isEmpty(this.oo);
    }

    private void o00() {
        com.thinkup.core.common.nn.o0 o0Var = this.mm;
        if (o0Var != null) {
            o0Var.n();
        }
    }

    public final int n() {
        List<o0n0> list = this.m0;
        int i2 = 0;
        if (list == null) {
            return 0;
        }
        synchronized (list) {
            try {
                Iterator<o0n0> it = this.m0.iterator();
                while (it.hasNext()) {
                    o0n0 next = it.next();
                    if (next == null || !next.o()) {
                        it.remove();
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.om$2, reason: invalid class name */
    public class AnonymousClass2 implements com.thinkup.core.oo.nm.m {
        final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ mmm f42173n;
        final /* synthetic */ com.thinkup.core.common.on.n0 o;
        final /* synthetic */ String o0;

        public AnonymousClass2(com.thinkup.core.common.on.n0 n0Var, String str, mmm mmmVar, String str2) {
            this.o = n0Var;
            this.m = str;
            this.f42173n = mmmVar;
            this.o0 = str2;
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void m() {
            com.thinkup.core.common.on.n0 n0Var = this.o;
            if (n0Var != null) {
                n0Var.mo(SystemClock.elapsedRealtime());
            }
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void o() {
            com.thinkup.core.common.on.n0 n0Var = this.o;
            if (n0Var != null) {
                n0Var.m0(SystemClock.elapsedRealtime());
            }
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void m(com.thinkup.core.oo.n0 n0Var) {
            if (n0Var.oono()) {
                return;
            }
            om.this.m();
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void o(com.thinkup.core.oo.n0 n0Var) {
            com.thinkup.core.common.on.n0 n0Var2;
            String unused = om.this.n0;
            if (n0Var != null) {
                n0Var.mo();
            }
            synchronized (om.this) {
                try {
                    m0m.o(this.o, n0Var);
                    if (!TextUtils.equals(String.valueOf(n0Var != null ? n0Var.o00n() : 0), this.m)) {
                        AdError errorCode = ErrorCode.getErrorCode("3003", "", "Format corresponding to API: " + com.thinkup.core.common.ooo.nn.om(this.m) + ", Format corresponding to placement strategy: " + com.thinkup.core.common.ooo.nn.om(String.valueOf(n0Var.o00n())));
                        om.this.o(this.f42173n, errorCode);
                        this.o.m(false);
                        com.thinkup.core.common.oo0.oo.o(this.o, errorCode);
                        om.this.o0 = false;
                        return;
                    }
                    if (n0Var != null && (n0Var2 = this.o) != null) {
                        n0Var2.mm(SystemClock.elapsedRealtime());
                        if (n0Var.m0m0()) {
                            this.o.o(2);
                        } else {
                            this.o.o(1);
                        }
                    }
                    long j = 0;
                    long jM0om = n0Var != null ? n0Var.m0om() : 0L;
                    int iM0on = n0Var != null ? n0Var.m0on() : 0;
                    com.thinkup.core.common.on.om omVar = this.f42173n.no;
                    if (omVar != null) {
                        if (n0Var == null || n0Var.m0m0()) {
                            j = jM0om;
                        }
                        omVar.oo(j);
                        omVar.om(System.currentTimeMillis());
                        omVar.o(iM0on);
                    }
                    om omVar2 = om.this;
                    om.o(omVar2, omVar2.o, omVar2.m, this.o0, n0Var, this.o, this.f42173n);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void o(AdError adError) {
            String str = com.thinkup.core.common.n.mo.o0m.nm;
            String str2 = om.this.m;
            String strOm = com.thinkup.core.common.ooo.nn.om(this.m);
            String strPrintStackTrace = adError.printStackTrace();
            if (TUSDK.isNetworkLogDebug()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", com.thinkup.core.common.n.mo.o0m.onn);
                    jSONObject.put("result", str);
                    jSONObject.put("placementId", str2);
                    jSONObject.put("adtype", strOm);
                    jSONObject.put("errorMsg", strPrintStackTrace);
                    com.thinkup.core.common.ooo.omn.o("tpn_thinkup_network", jSONObject.toString(), TextUtils.equals(com.thinkup.core.common.n.mo.o0m.nm, str));
                } catch (Throwable unused) {
                }
            }
            if (adError.getCode().equals(ErrorCode.statuError)) {
                adError = ErrorCode.getErrorCode("3001", adError.getPlatformCode(), adError.getPlatformMSG());
            }
            this.o.mom(5);
            om.this.o(true, this.o, adError, this.f42173n);
        }
    }

    public final void m() {
        synchronized (this.m0) {
            this.m0.clear();
        }
    }

    public final String m0() {
        return this.oo;
    }

    public final void mm() {
        try {
            ooo.o().o(this.m, com.thinkup.core.common.ooo.nn.o(new Throwable().getStackTrace()));
        } catch (Throwable unused) {
        }
    }

    public final TUAdRequest mo() {
        return this.o0o;
    }

    public final void o0() {
        List<o0n0> list = this.m0;
        if (list != null) {
            synchronized (list) {
                try {
                    this.m0.size();
                    if (this.m0.size() > 0) {
                        this.m0.remove(0);
                    }
                    this.m0.size();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void om() {
        com.thinkup.core.oo.n0 n0VarM = com.thinkup.core.oo.nm.o(this.o).m(this.m);
        if (this.nm || n0VarM == null) {
            return;
        }
        this.nm = true;
        this.nn = System.currentTimeMillis();
    }

    public final boolean on() {
        on onVar;
        if (this.o0) {
            return true;
        }
        return (TextUtils.isEmpty(this.oo) || (onVar = this.f42171n.get(this.oo)) == null || onVar.n()) ? false : true;
    }

    public final void oo() {
        this.nm = false;
        this.nn = 0L;
        this.o00 = false;
    }

    public final on m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f42171n.get(str);
    }

    private void m(Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, mmm mmmVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        o0mm o0mmVar;
        List<o0mm> list;
        o00n o00nVar;
        omn omnVar;
        boolean z5;
        on onVar;
        boolean z6;
        boolean z7;
        mmm mmmVar2 = mmmVar;
        n0Var.omn();
        String str3 = str;
        String str4 = str2;
        com.thinkup.core.common.oo0.oo.o("1", n0Var2, str4, str3, "", 0, n0Var.o00n(), 0L);
        oo00 oo00Var = new oo00(mmmVar2, n0Var);
        m0m.o(n0Var2, oo00Var);
        try {
            try {
                try {
                    if (n0Var.omnn()) {
                        o(n0Var, n0Var2);
                        m(n0Var, n0Var2);
                        o00m o00mVarO = ono.o(n0Var, n0Var2);
                        com.thinkup.core.common.on.n0 n0VarN = o00mVarO.n();
                        if (o00mVarO.m() == 0) {
                            try {
                                n0VarN.mom(5);
                                if (o00mVarO.o().onm() == 1) {
                                    throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                                }
                                throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                            } catch (Throwable th) {
                                th = th;
                                z2 = true;
                                o(z2, n0Var2, th, mmmVar2);
                                return;
                            }
                        }
                        if (o00mVarO.mo()) {
                            boolean zMn = o00mVarO.mn();
                            ArrayList arrayList = new ArrayList(1);
                            ono.m(o00mVarO, arrayList);
                            List<o0mm> listO0 = o00mVarO.o0();
                            if (listO0 != null && !listO0.isEmpty()) {
                                ono.o(n0Var, o00mVarO.n(), listO0);
                            }
                            List<o0mm> listO = ono.o(o00mVarO, o00mVarO.o0());
                            o.o().m(str3);
                            boolean z8 = arrayList.size() > 0;
                            boolean z9 = !z8 && (o00mVarO.oo() == null || o00mVarO.oo().size() == 0);
                            n0Var2.on(SystemClock.elapsedRealtime());
                            if (z9 && ((listO == null || listO.size() == 0) && ((o00mVarO.om() == null || o00mVarO.om().size() == 0) && ((o00mVarO.on() == null || o00mVarO.on().size() == 0) && (o00mVarO.m0() == null || o00mVarO.m0().size() == 0))))) {
                                AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                                n0Var2.mom(6);
                                o(true, n0Var2, errorCode, mmmVar2);
                                this.o0 = false;
                                return;
                            }
                            com.thinkup.core.m.n.o();
                            com.thinkup.core.m.n.m(this.o, str3, n0Var);
                            Map<String, Object> mapM = ooo.o().m(this.m);
                            Map<String, o0nm> map = om0.o(this.o).o;
                            o0nm o0nmVarRemove = map != null ? map.remove(str3) : null;
                            o00n o00nVarO = oom.o(this.o).o(str3, str4);
                            omn omnVarO = o0.o().o(str3);
                            omn omnVar2 = new omn(str4);
                            boolean z10 = z9;
                            o0.o().o(this.m, omnVar2);
                            n0Var2.m(true);
                            n0Var2.on0(oo00Var.om());
                            on onVar2 = new on(mmmVar2.o());
                            onVar2.m0 = mapM;
                            onVar2.mo = n0Var2;
                            onVar2.o(mmmVar2);
                            onVar2.o(mmmVar2.o0);
                            this.oo = str4;
                            this.no = n0Var2.ooo0();
                            List<o0mm> listO2 = com.thinkup.core.oo.ooo.o(n0Var, n0Var.n0n());
                            if (listO2.size() > 0) {
                                z4 = false;
                                o0mmVar = listO2.get(0);
                            } else {
                                z4 = false;
                                o0mmVar = null;
                            }
                            if (o0mmVar != null) {
                                for (o0mm o0mmVar2 : o00mVarO.oo()) {
                                    on onVar3 = onVar2;
                                    if (o0mmVar2.m0o().equals(o0mmVar.m0o())) {
                                        String str5 = str3;
                                        String str6 = str4;
                                        o00nVar = o00nVarO;
                                        list = listO;
                                        omnVar = omnVarO;
                                        z5 = z10;
                                        z6 = zMn;
                                        z7 = false;
                                        com.thinkup.core.common.o.n.o oVarO = com.thinkup.core.common.o.n.o().o(context, str5, str6, o0mmVar2, n0Var, mapM, this.o0o);
                                        str3 = str5;
                                        str4 = str6;
                                        if (oVarO != null) {
                                            o0mm o0mmVarO0 = oVarO.o0();
                                            AdError adErrorO = ono.o(0, n0Var2, o0mmVarO0, (com.thinkup.core.common.on.om0) null);
                                            Objects.toString(adErrorO);
                                            if (adErrorO != null) {
                                                com.thinkup.core.common.o.n.o().o(str3, o0mmVarO0.m0o());
                                                onVar = onVar3;
                                            } else {
                                                onVar = onVar3;
                                                onVar.mo0 = oVarO;
                                            }
                                            n0Var2.oo(SystemClock.elapsedRealtime());
                                        } else {
                                            onVar = onVar3;
                                        }
                                    } else {
                                        list = listO;
                                        o00nVar = o00nVarO;
                                        omnVar = omnVarO;
                                        z5 = z10;
                                        onVar = onVar3;
                                        z6 = zMn;
                                        z7 = false;
                                    }
                                    mapM = mapM;
                                    onVar2 = onVar;
                                    o00nVarO = o00nVar;
                                    omnVarO = omnVar;
                                    listO = list;
                                    z4 = z7;
                                    zMn = z6;
                                    z10 = z5;
                                }
                            }
                            o00n o00nVar2 = o00nVarO;
                            omn omnVar3 = omnVarO;
                            boolean z11 = z10;
                            boolean z12 = zMn;
                            boolean z13 = z4;
                            List<o0mm> list2 = listO;
                            on onVar4 = onVar2;
                            com.thinkup.core.common.oo0.n.o(this.o).o(10, n0Var2);
                            Double[] dArr = new Double[1];
                            Boolean boolOn0n = n0Var.on0n();
                            if (o00mVarO.mm() || (boolOn0n != null && boolOn0n.booleanValue())) {
                                com.thinkup.core.common.on.o oVarO2 = o.o().o(context, str3);
                                if (oVarO2 != null) {
                                    dArr[z13 ? 1 : 0] = Double.valueOf(oVarO2.nm());
                                }
                            }
                            o00mVarO.mm();
                            com.thinkup.core.common.oom.mo moVar = new com.thinkup.core.common.oom.mo(list2);
                            com.thinkup.core.common.oom.m0 m0Var = new com.thinkup.core.common.oom.m0();
                            m0Var.o = str3;
                            m0Var.m = str4;
                            m0Var.f42298n = oo00Var;
                            m0Var.o0 = list2;
                            m0Var.oo = o00mVarO.m0();
                            m0Var.mo = z11;
                            m0Var.mm = n0Var2.ooon();
                            m0Var.mn = o0nmVarRemove;
                            m0Var.no = o00nVar2;
                            m0Var.n0 = moVar;
                            m0Var.nn = omnVar3;
                            m0Var.nm = omnVar2;
                            m0Var.om = o00mVarO.om();
                            m0Var.on = o00mVarO.on();
                            Double d = dArr[z13 ? 1 : 0];
                            m0Var.m0 = d != null ? d.doubleValue() : 0.0d;
                            m0Var.o00 = o00mVarO.oo();
                            onVar4.o(m0Var);
                            this.f42171n.put(str4, onVar4);
                            com.thinkup.core.common.on.om omVar = mmmVar2.no;
                            if (omVar != null) {
                                omVar.m0(System.currentTimeMillis());
                            }
                            com.thinkup.core.common.oo0.oo.o(mmmVar2.no, n0Var2);
                            m0 m0Var2 = new m0(str3);
                            onVar4.o(m0Var2);
                            m0Var2.o(n0Var, z12);
                            m0Var2.o(this.mn);
                            m0Var2.o(onVar4);
                            this.o0 = z13;
                            if (!z11) {
                                List<o0mm> listOo = o00mVarO.oo();
                                com.thinkup.core.common.ooo.m.m mVarO = com.thinkup.core.common.ooo.m.m.o();
                                AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, mmmVar2, str4, str3, n0Var, z8, listOo, oo00Var, n0Var2, o0nmVarRemove, o00nVar2, omnVar3, moVar, boolOn0n, dArr, z12, m0Var2, onVar4);
                                mmmVar2 = mmmVar2;
                                mVarO.m(anonymousClass4);
                            }
                            int i2 = mmmVar2.f42198n;
                            if (i2 == 0 || i2 == 3) {
                                oon.o().o(n0Var, 15, mmmVar2, n0Var2);
                                return;
                            }
                            return;
                        }
                        n0VarN.mom(6);
                        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        throw new com.thinkup.core.common.on.mn(errorCode2, errorCode2.printStackTrace());
                    }
                    n0Var2.mom(5);
                    throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
                } catch (com.thinkup.core.common.on.mn e2) {
                    e = e2;
                    z3 = true;
                    o(z3, n0Var2, e, mmmVar2);
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
            }
        } catch (com.thinkup.core.common.on.mn e3) {
            e = e3;
            z3 = true;
        }
    }

    public final void o(com.thinkup.core.common.nn.n nVar) {
        this.mo = nVar;
    }

    private void o(com.thinkup.core.common.nn.o0 o0Var) {
        this.mm = o0Var;
    }

    private static void n(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2) {
        if (n0Var.omnn()) {
            return;
        }
        n0Var2.mom(5);
        throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
    }

    private List<com.thinkup.core.common.on.o> o0(Context context) {
        if (o(false, false, (com.thinkup.core.common.on.ono) null)) {
            return null;
        }
        return o.o().o(context, this.m, false, false, true, (com.thinkup.core.common.on.ono) null);
    }

    public final com.thinkup.core.common.nn.o0 o() {
        return this.mm;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    public static om o(Context context, String str, String str2) {
        byte b2;
        om omVarO = ooo.o().o(str, str2);
        if (omVarO != null) {
            return omVarO;
        }
        synchronized (om.class) {
            if (omVarO == null) {
                try {
                    omVarO = new om(context, str);
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 49) {
                        if (iHashCode == 51 && str2.equals("3")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("1")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0 || b2 == 1) {
                        omVarO.mm = new com.thinkup.core.common.nn.o(str, str2);
                    }
                    ooo.o().o(str, str2, omVarO);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return omVarO;
    }

    private List<com.thinkup.core.common.on.o> n(Context context) {
        return o.o().o(context, this.m, false, false, true, (com.thinkup.core.common.on.ono) null);
    }

    public final void n(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.om.6
            @Override // java.lang.Runnable
            public final void run() {
                on onVar = om.this.f42171n.get(str);
                if (onVar != null) {
                    onVar.on();
                }
            }
        }, 2);
    }

    public static /* synthetic */ void n(om omVar) {
        com.thinkup.core.common.nn.o0 o0Var = omVar.mm;
        if (o0Var != null) {
            o0Var.o0();
        }
    }

    public final void o(o0n0 o0n0Var, com.thinkup.core.oo.n0 n0Var) {
        com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(this.m);
        if (n0VarO != null) {
            if (n0Var == null) {
                return;
            }
            if (!TextUtils.equals(n0VarO.o000(), n0Var.o000()) && !n0VarO.oono()) {
                return;
            }
        }
        synchronized (this.m0) {
            this.m0.add(o0n0Var);
        }
    }

    public final void o(String str) {
        this.f42171n.remove(str);
    }

    public final void o(String str, double d, o0mm o0mmVar) {
        on onVar = this.f42171n.get(str);
        if (onVar != null) {
            onVar.o(d, o0mmVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final void o(final Context context, final String str, final String str2, final mmm mmmVar, final com.thinkup.core.common.n.o oVar) {
        final long j;
        if (!com.thinkup.core.common.n.o0n.m().omn()) {
            com.thinkup.core.common.n.o0n.m().f41918n = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mmmVar != null) {
            long j2 = mmmVar.nm;
            if (j2 != 0) {
                j = j2;
            } else {
                j = jElapsedRealtime;
            }
        } else {
            j = jElapsedRealtime;
        }
        final Map<String, Object> mapM = ooo.o().m(str2);
        final int[] iArr = {0};
        if (mapM.containsKey(o0mo.n0o)) {
            try {
                iArr[0] = ((Integer) mapM.get(o0mo.n0o)).intValue();
            } catch (Throwable unused) {
            }
        }
        int i2 = mmmVar.f42198n;
        if (i2 == 0 || i2 == 3) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            ooo.o().o(str2, stackTrace);
            if (!TextUtils.equals(str, "4")) {
                ooo.o().o(str2, com.thinkup.core.common.ooo.nn.o(stackTrace));
            }
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.om.1
            /* JADX WARN: Code duplicated, block: B:74:0x019e A[PHI: r0 r8
  0x019e: PHI (r0v55 com.thinkup.core.oo.n0) = (r0v54 com.thinkup.core.oo.n0), (r0v54 com.thinkup.core.oo.n0), (r0v124 com.thinkup.core.oo.n0) binds: [B:57:0x0163, B:58:0x0165, B:72:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r8v3 long) = (r8v2 long), (r8v2 long), (r8v13 long) binds: [B:57:0x0163, B:58:0x0165, B:72:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                String strO;
                long j3;
                com.thinkup.core.oo.n0 n0Var;
                boolean z2;
                synchronized (om.this) {
                    try {
                        com.thinkup.core.common.n.o0n.m();
                        com.thinkup.core.common.n.o0n.n(om.this.o);
                        if (!om.this.on() || mmmVar.f42198n == 0) {
                            if (om.o(om.this) || mmmVar.f42198n != 5) {
                                if (om.this.nm() && mmmVar.f42198n == 0) {
                                    Log.e(com.thinkup.core.common.n.mo.oo0, "PlacementId(" + str2 + ") the load api calls are not allowed in Auto-load mode");
                                    return;
                                }
                                om omVar = om.this;
                                if (omVar.on == null) {
                                    omVar.on = new nm();
                                }
                                nm nmVar = om.this.on;
                                String str3 = str2;
                                String str4 = str;
                                nmVar.o = str3;
                                nmVar.m = str4;
                                nmVar.o(oVar);
                                mmm mmmVar2 = mmmVar;
                                om omVar2 = om.this;
                                mmmVar2.oo = omVar2.on;
                                int i3 = mmmVar2.f42198n;
                                if (i3 == 4 || i3 == 5) {
                                    omVar2.om++;
                                } else {
                                    omVar2.om = 1;
                                }
                                om.n(omVar2);
                                int i4 = mmmVar.f42198n;
                                com.thinkup.core.common.n.o0n.m().o(context, true);
                                if (TextUtils.isEmpty(mmmVar.o)) {
                                    strO = com.thinkup.core.common.ooo.nn.o(context);
                                    mmmVar.o = strO;
                                } else {
                                    strO = mmmVar.o;
                                }
                                String str5 = strO;
                                om omVar3 = om.this;
                                String str6 = mmmVar.o;
                                com.thinkup.core.common.n.o oVar2 = oVar;
                                com.thinkup.core.common.nn.n nVar = omVar3.mo;
                                if (nVar != null) {
                                    nVar.o(str6, oVar2);
                                }
                                om.this.o0m = mmmVar;
                                om.this.o0o = mmmVar.m();
                                if (com.thinkup.core.common.n.o0n.m().on() != null && !TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().o00()) && !TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().o0o()) && !com.thinkup.core.common.ooo.o00.o(str2)) {
                                    Context contextOn = com.thinkup.core.common.n.o0n.m().on();
                                    String strO00 = com.thinkup.core.common.n.o0n.m().o00();
                                    String strO0o = com.thinkup.core.common.n.o0n.m().o0o();
                                    boolean zOmn = com.thinkup.core.common.n.o0n.m().omn();
                                    mmm mmmVar3 = mmmVar;
                                    int i5 = mmmVar3.f42198n;
                                    com.thinkup.core.common.on.om omVar4 = mmmVar3.no;
                                    if (omVar4 != null) {
                                        omVar4.m(System.currentTimeMillis());
                                    }
                                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    mmm mmmVar4 = mmmVar;
                                    if (mmmVar4.nm != 0) {
                                        jElapsedRealtime2 = mmmVar4.nn;
                                    }
                                    com.thinkup.core.oo.nm nmVarO = com.thinkup.core.oo.nm.o(context);
                                    com.thinkup.core.oo.n0 n0VarO = om.o(om.this, zOmn, mapM);
                                    boolean zM0 = nmVarO.m0(str2);
                                    if (zOmn || n0VarO != null) {
                                        j3 = jElapsedRealtime2;
                                        n0Var = n0VarO;
                                        z2 = false;
                                    } else {
                                        if (i5 == 13) {
                                            n0VarO = nmVarO.o0(str2);
                                        } else {
                                            n0VarO = i5 == 14 ? nmVarO.oo(str2) : nmVarO.n(str2);
                                        }
                                        com.thinkup.core.oo.n0 n0VarOm = nmVarO.om(str2);
                                        if (n0VarO != null || n0VarOm == null) {
                                            jElapsedRealtime2 = 0;
                                        } else {
                                            n0VarO = n0VarOm;
                                        }
                                        if (com.thinkup.core.oo.nm.o(n0VarO)) {
                                            j3 = jElapsedRealtime2;
                                            n0Var = n0VarO;
                                            z2 = false;
                                        } else {
                                            j3 = jElapsedRealtime2;
                                            n0Var = n0VarO;
                                            z2 = true;
                                        }
                                    }
                                    String unused2 = om.this.n0;
                                    (n0Var == null ? "本地缓存策略为空" : Integer.valueOf(n0Var.omon())).toString();
                                    String str7 = str2;
                                    int i6 = iArr[0];
                                    mmm mmmVar5 = mmmVar;
                                    long j4 = j3;
                                    int i7 = 2;
                                    com.thinkup.core.common.on.n0 n0VarO2 = m0m.o(str5, str7, n0Var, i5, i6, mmmVar5.on, mmmVar5.mo, zM0 ? 1 : 2, mmmVar5.m());
                                    n0VarO2.mn(j);
                                    n0VarO2.o0(j4);
                                    n0VarO2.mom(str);
                                    Map<String, Object> map = mapM;
                                    if (map != null) {
                                        n0VarO2.m(map);
                                    }
                                    if (n0Var != null) {
                                        try {
                                            om.o(n0Var, n0VarO2);
                                            om.m(n0Var, n0VarO2);
                                        } catch (com.thinkup.core.common.on.mn e2) {
                                            om.this.o(true, n0VarO2, (Throwable) e2, mmmVar);
                                            return;
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                    }
                                    if (mmmVar.o0()) {
                                        om.this.m();
                                    } else {
                                        int iN = om.this.n();
                                        if (iN > 0 && n0Var != null) {
                                            com.thinkup.core.common.on.o oVarO = o.o().o(context, str2);
                                            if (oVarO != null) {
                                                String unused3 = om.this.n0;
                                                n0Var.o0o();
                                                if (iN >= n0Var.o0o()) {
                                                    n0VarO2.m(false);
                                                    n0VarO2.mom(4);
                                                    o0mm o0mmVarNn = oVarO.nn();
                                                    if (o0mmVarNn != null) {
                                                        n0VarO2.o(o0mmVarNn);
                                                    }
                                                    n0VarO2.m(1);
                                                    com.thinkup.core.common.oo0.n.o(contextOn).o(10, n0VarO2);
                                                    com.thinkup.core.common.oo0.n.o(contextOn).o(12, n0VarO2);
                                                    om.this.o0 = false;
                                                    com.thinkup.core.common.n.o oVar3 = oVar;
                                                    if (oVar3 != null) {
                                                        oVar3.onAdLoaded();
                                                        om.this.on.m(oVar);
                                                    }
                                                    return;
                                                }
                                                com.thinkup.core.common.n.o oVar4 = oVar;
                                                if (oVar4 != null) {
                                                    oVar4.onAdLoaded();
                                                    om.this.on.m(oVar);
                                                }
                                                String unused4 = om.this.n0;
                                                n0Var.o0o();
                                                mmm mmmVar6 = mmmVar;
                                                int i8 = mmmVar6.f42198n;
                                                mmmVar6.m = i8;
                                                n0VarO2.onm(i8);
                                                mmmVar.f42198n = 9;
                                                n0VarO2.ono(9);
                                            } else {
                                                om.this.m();
                                            }
                                        }
                                    }
                                    if (n0Var != null && om.this.nm) {
                                        long jCurrentTimeMillis = System.currentTimeMillis() - om.this.nn;
                                        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < n0Var.oo00()) {
                                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                            n0VarO2.mom(7);
                                            om.this.o(!om.this.o00, n0VarO2, new com.thinkup.core.common.on.mn(errorCode, errorCode.printStackTrace()), mmmVar);
                                            om.this.o00 = true;
                                            return;
                                        }
                                    }
                                    om.m0(om.this);
                                    om.mo(om.this);
                                    om.this.o00 = false;
                                    com.thinkup.core.m.n.o();
                                    int iO = com.thinkup.core.m.n.o(contextOn, str);
                                    if (iO != -1) {
                                        String str8 = ErrorCode.loadCappingError;
                                        if (iO == 9) {
                                            str8 = ErrorCode.loadCappingError_Global;
                                        } else if (iO == 10) {
                                            str8 = ErrorCode.loadCappingError_Format;
                                        }
                                        AdError errorCode2 = ErrorCode.getErrorCode(str8, "", "");
                                        n0VarO2.mom(iO);
                                        om.this.o(true, n0VarO2, (Throwable) new com.thinkup.core.common.on.mn(errorCode2, errorCode2.printStackTrace()), mmmVar);
                                        return;
                                    }
                                    if (n0Var != null && com.thinkup.core.m.n.o().o(contextOn, str2, n0Var) != -1) {
                                        AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                                        n0VarO2.mom(iO);
                                        om.this.o(true, n0VarO2, (Throwable) new com.thinkup.core.common.on.mn(errorCode3, errorCode3.printStackTrace()), mmmVar);
                                        return;
                                    }
                                    if (om.this.on()) {
                                        Log.i(com.thinkup.core.common.n.mo.oo0, "Placement(" + str2 + ") is loading.");
                                        oo.o(mmmVar.on, oo.f42258n, str2, om.this.no, om.this.oo);
                                        return;
                                    }
                                    nmVarO.on(str2);
                                    om omVar5 = om.this;
                                    omVar5.o0 = true;
                                    Iterator<on> it = omVar5.f42171n.values().iterator();
                                    while (it.hasNext()) {
                                        it.next().om();
                                    }
                                    if (!zOmn && (n0Var == null || n0Var.oonn() || zM0)) {
                                        i7 = 3;
                                    }
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    mmmVar.no.n(jCurrentTimeMillis2);
                                    mmmVar.no.o0(jCurrentTimeMillis2);
                                    om.o(om.this, context, strO00, strO0o, n0Var, mmmVar, n0VarO2, str, str5, i7, z2);
                                    return;
                                }
                                om.this.o(mmmVar, ErrorCode.getErrorCode("3002", "", ""));
                                if (com.thinkup.core.common.n.o0n.m().m0o()) {
                                    Log.e(com.thinkup.core.common.n.mo.oo0, "Please check these params in your code (AppId: " + com.thinkup.core.common.n.o0n.m().o00() + ", AppKey: " + com.thinkup.core.common.n.o0n.m().o0o() + ", PlacementId: " + str2 + ")");
                                }
                                om.this.o0 = false;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }, 2);
    }

    private void o(Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, mmm mmmVar, com.thinkup.core.common.on.n0 n0Var2, String str3, String str4, int i2, boolean z2) {
        com.thinkup.core.oo.nm.o(context).o(n0Var, str, str2, this.m, mmmVar.on, new AnonymousClass2(n0Var2, str3, mmmVar, str4), i2, z2, mmmVar.m());
    }

    private void o(Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, mmm mmmVar) {
        if (n0Var2 != null) {
            n0Var2.om(SystemClock.elapsedRealtime());
        }
        com.thinkup.core.common.oom.m.m0 m0Var = new com.thinkup.core.common.oom.m.m0(context, str, n0Var, new AnonymousClass3(mmmVar, context, str, str2, n0Var, n0Var2));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.thinkup.core.common.oom.m.oo());
        new com.thinkup.core.common.oom.m.on(arrayList, m0Var, 0).o(m0Var);
    }

    private static void o(o00m o00mVar) {
        com.thinkup.core.common.on.n0 n0VarN = o00mVar.n();
        if (o00mVar.m() == 0) {
            n0VarN.mom(5);
            if (o00mVar.o().onm() == 1) {
                throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
            }
            throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
        }
        if (o00mVar.mo()) {
            return;
        }
        n0VarN.mom(6);
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
        throw new com.thinkup.core.common.on.mn(errorCode, errorCode.printStackTrace());
    }

    public static void o(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2) {
        int iO = com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var, n0Var2.oomn());
        if (iO != -1) {
            String str = ErrorCode.outOfCapError;
            if (iO != 2) {
                switch (iO) {
                    case 7:
                        str = ErrorCode.outOfCapError_day_Global;
                        break;
                    case 8:
                        str = ErrorCode.outOfCapError_day_Format;
                        break;
                    case 9:
                        str = ErrorCode.outOfCapError_hour_Global;
                        break;
                    case 10:
                        str = ErrorCode.outOfCapError_hour_Format;
                        break;
                }
            }
            n0Var2.mom(1);
            throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(str, "", ""), "Capping.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(boolean z2, com.thinkup.core.common.on.n0 n0Var, Throwable th, mmm mmmVar) {
        AdError errorCode;
        if (th instanceof com.thinkup.core.common.on.mn) {
            errorCode = ((com.thinkup.core.common.on.mn) th).o;
        } else {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", th.getMessage());
        }
        o(z2, n0Var, errorCode, mmmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(boolean z2, com.thinkup.core.common.on.n0 n0Var, AdError adError, mmm mmmVar) {
        this.o0 = false;
        n0Var.m(false);
        if (z2) {
            com.thinkup.core.common.oo0.n.o(this.o).o(10, n0Var);
            com.thinkup.core.common.oo0.oo.o(n0Var, adError);
        }
        o(mmmVar, adError);
    }

    public final void o(com.thinkup.core.common.on.o oVar) {
        List<o0n0> list;
        if (oVar == null || (list = this.m0) == null) {
            return;
        }
        synchronized (list) {
            try {
                if (this.m0.size() > 0) {
                    this.m0.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final TUAdStatusInfo o(Context context, Map<String, Object> map) {
        boolean zOn = on();
        com.thinkup.core.common.on.ono onoVar = new com.thinkup.core.common.on.ono();
        onoVar.o(map);
        onoVar.o(this.o0o);
        com.thinkup.core.common.on.o oVarM = m(context, true, false, onoVar);
        TUAdStatusInfo tUAdStatusInfo = new TUAdStatusInfo(zOn, oVarM != null, oVarM != null ? oVarM.o00() : null);
        if (this.mm != null && System.currentTimeMillis() - this.nn > 2000 && o(tUAdStatusInfo, 5) && (n() <= 0 || !tUAdStatusInfo.isReady())) {
            com.thinkup.core.common.nn.o0 o0Var = this.mm;
            o0Var.o(context, ((com.thinkup.core.common.nn.o) o0Var).o(), 5);
        }
        return tUAdStatusInfo;
    }

    public final List<TUAdInfo> o(Context context, com.thinkup.core.common.on.ono onoVar) {
        List<com.thinkup.core.common.on.o> listO0 = o0(context);
        if (listO0 == null || listO0.size() <= 0) {
            return null;
        }
        return o(onoVar, listO0);
    }

    private static List<TUAdInfo> o(com.thinkup.core.common.on.ono onoVar, List<com.thinkup.core.common.on.o> list) {
        com.thinkup.core.common.on.n0 detail;
        com.thinkup.core.common.on.n0 trackingInfo;
        ArrayList arrayList = new ArrayList(3);
        if (list != null && list.size() > 0) {
            Iterator<com.thinkup.core.common.on.o> it = list.iterator();
            com.thinkup.core.common.on.m mVarM = null;
            while (it.hasNext()) {
                com.thinkup.core.common.on.o next = it.next();
                if (onoVar != null) {
                    mVarM = onoVar.m();
                }
                BaseAd baseAdOm = next != null ? next.om() : null;
                TUBaseAdAdapter tUBaseAdAdapterOo = next != null ? next.oo() : null;
                if (baseAdOm != null) {
                    if (mVarM != null && (detail = baseAdOm.getDetail()) != null) {
                        detail.o(mVarM);
                    }
                    arrayList.add(com.thinkup.core.common.n.mn.o(baseAdOm, tUBaseAdAdapterOo, 4));
                } else if (tUBaseAdAdapterOo != null) {
                    if (mVarM != null && (trackingInfo = tUBaseAdAdapterOo.getTrackingInfo()) != null) {
                        trackingInfo.o(mVarM);
                    }
                    arrayList.add(com.thinkup.core.common.n.mn.o(tUBaseAdAdapterOo, 4));
                }
            }
        }
        return arrayList;
    }

    public final com.thinkup.core.common.on.o o(Context context, boolean z2, boolean z3, com.thinkup.core.common.on.ono onoVar) {
        if (o(z3, z2, onoVar)) {
            return null;
        }
        return o.o().o(context, this.m, z2, z3, onoVar);
    }

    private boolean o(boolean z2, boolean z3, com.thinkup.core.common.on.ono onoVar) {
        Map<String, Object> mapO = onoVar != null ? onoVar.o() : null;
        com.thinkup.core.common.on.m mVarM = onoVar != null ? onoVar.m() : null;
        com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(this.m);
        String str = TextUtils.isEmpty(this.oo) ? "" : this.oo;
        if (n0VarO == null) {
            n0VarO = com.thinkup.core.oo.nm.o(this.o).o(this.m);
        }
        com.thinkup.core.oo.n0 n0Var = n0VarO;
        if (n0Var == null) {
            if (z2) {
                com.thinkup.core.common.oo0.oo.o(str, this.m, n0Var, 4, "", mapO, onoVar);
            } else if (z3) {
                com.thinkup.core.common.oo0.oo.o(str, this.m, false, 4, n0Var, (com.thinkup.core.common.on.o) null, "", "", mapO, mVarM, onoVar);
            }
            return true;
        }
        com.thinkup.core.m.o0.o();
        int iO = com.thinkup.core.m.o0.o(this.m, n0Var);
        if (iO != -1) {
            if (z2) {
                com.thinkup.core.common.oo0.oo.o(str, this.m, n0Var, iO, "", mapO, onoVar);
            } else if (z3) {
                com.thinkup.core.common.oo0.oo.o(str, this.m, false, iO, n0Var, (com.thinkup.core.common.on.o) null, "", "", mapO, mVarM, onoVar);
            }
            return true;
        }
        int iO2 = com.thinkup.core.m.o.o(this.o).o(n0Var, this.m);
        if (iO2 == -1) {
            return false;
        }
        if (z2) {
            com.thinkup.core.common.oo0.oo.o(str, this.m, n0Var, iO2, "", mapO, onoVar);
        } else if (z3) {
            com.thinkup.core.common.oo0.oo.o(str, this.m, false, iO2, n0Var, (com.thinkup.core.common.on.o) null, "", "", mapO, mVarM, onoVar);
        }
        return true;
    }

    public static void m(com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2) {
        com.thinkup.core.m.o0.o();
        int iO = com.thinkup.core.m.o0.o(n0Var2.oomn(), n0Var);
        if (iO != -1) {
            n0Var2.mom(2);
            String str = ErrorCode.inPacingError;
            if (iO != 3) {
                if (iO == 11) {
                    str = ErrorCode.inPacingError_Global;
                } else if (iO == 12) {
                    str = ErrorCode.inPacingError_Format;
                }
            }
            throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(str, "", ""), "Pacing.");
        }
    }

    public final void m(Context context, String str, String str2, mmm mmmVar, com.thinkup.core.common.n.o oVar) {
        String str3;
        if (oon.o().m()) {
            com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(context).o(this.m);
            if (n0VarO != null && oon.o().o(this.m)) {
                Log.w(com.thinkup.core.common.n.mo.oo0, "Forbidden placement");
                if (oVar != null) {
                    oVar.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.sharedPlacementIdError, "", ""));
                    return;
                }
                return;
            }
            if (oon.o().o(n0VarO)) {
                String strOoo = n0VarO.ooo();
                com.thinkup.core.common.on.m mVar = new com.thinkup.core.common.on.m();
                o(mVar, str2, n0VarO);
                mmmVar.mo = mVar;
                com.thinkup.core.common.n.o[] oVarArr = {oVar};
                if (n0VarO.omo() == 1) {
                    com.thinkup.core.common.on.o oVarM = m(context, strOoo, str, mmmVar);
                    if (oVarM != null) {
                        String strOon0 = "";
                        str3 = strOoo;
                        String strO = com.thinkup.core.common.ooo.nn.o(context);
                        mmmVar.o = strO;
                        com.thinkup.core.common.ooo.omn.o("Shared", "placementId:" + str2 + ";result_callback:success;");
                        com.thinkup.core.common.on.n0 n0VarMo = oVarM.mo();
                        if (n0VarMo != null) {
                            strOon0 = n0VarMo.oon0();
                        }
                        com.thinkup.core.common.oo0.oo.o(str2, str3, n0VarMo, str, strO, n0VarO, true, "1", "2", strOon0);
                        com.thinkup.core.common.n.o oVar2 = oVarArr[0];
                        if (oVar2 != null) {
                            oVar2.onAdLoaded();
                        }
                        oVarArr[0] = null;
                    } else {
                        str3 = strOoo;
                        oon.o().m(str3, mmmVar.m());
                    }
                    o(context, str, str2, mmmVar, new AnonymousClass7(oVarArr, str2, str3, str, mmmVar, n0VarO));
                    return;
                }
                o(context, str, str2, mmmVar, new AnonymousClass8(str2, strOoo, str, mmmVar, n0VarO, oVarArr, context));
                return;
            }
        }
        o(context, str, str2, mmmVar, oVar);
    }

    private void o(String str, com.thinkup.core.common.n.o oVar) {
        com.thinkup.core.common.nn.n nVar = this.mo;
        if (nVar != null) {
            nVar.o(str, oVar);
        }
    }

    public final void o(mmm mmmVar, AdError adError) {
        nm nmVar = this.on;
        if (nmVar != null) {
            nmVar.o(1, mmmVar, (oo00) null, adError);
        }
    }

    public final boolean o(TUAdStatusInfo tUAdStatusInfo, int i2) {
        com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(this.m);
        if ((n0VarO != null && n() >= n0VarO.o0o() && tUAdStatusInfo != null && tUAdStatusInfo.isReady()) || TUAdxSetting.getInstance().isAdxNetworkMode(this.m)) {
            return false;
        }
        if (i2 == 6 || i2 == 18) {
            int iOn = n0VarO.on();
            if (iOn != -1) {
                if (iOn == 1) {
                    return false;
                }
                if (i2 == 6 && iOn == 2) {
                    return true;
                }
                return i2 == 18 && iOn == 3;
            }
            if (i2 == 18) {
                return false;
            }
        }
        if (!nm()) {
            return n0VarO != null && n0VarO.o00o() == 1;
        }
        if (o(i2, n0VarO != null ? n0VarO.onnm() : null)) {
            return true;
        }
        return n0VarO != null && n0VarO.o00o() == 1 && (i2 == 5 || i2 == 6 || i2 == 7);
    }

    private boolean o(int i2, List<String> list) {
        com.thinkup.core.common.nn.o0 o0Var = this.mm;
        if (o0Var != null) {
            return o0Var.o(i2, list);
        }
        return true;
    }

    public final void o(AdError adError) {
        com.thinkup.core.common.nn.o0 o0Var = this.mm;
        if (o0Var != null) {
            o0Var.o(adError, this.om, o((TUAdStatusInfo) null, 4));
        }
    }

    private static String o(com.thinkup.core.common.on.oom oomVar) {
        return oomVar.o + oomVar.oo + oomVar.mm + System.currentTimeMillis();
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3 + System.currentTimeMillis();
    }

    public final List<TUAdInfo> o(Context context) {
        List<com.thinkup.core.common.on.o> listO0 = null;
        if (oon.o().m()) {
            com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(context).o(this.m);
            if (n0VarO != null && oon.o().o(this.m)) {
                Log.w(com.thinkup.core.common.n.mo.oo0, "Forbidden placement");
                return null;
            }
            if (oon.o().o(n0VarO)) {
                String strOoo = n0VarO.ooo();
                oon.o();
                om omVarO = oon.o(strOoo, String.valueOf(n0VarO.o00n()));
                com.thinkup.core.common.on.ono onoVar = new com.thinkup.core.common.on.ono();
                com.thinkup.core.common.on.m mVar = new com.thinkup.core.common.on.m();
                if (omVarO != null) {
                    o(mVar, this.m, n0VarO);
                    onoVar.o(mVar);
                    onoVar.o(omVarO.o0o);
                    listO0 = omVarO.o0(context);
                }
                List<com.thinkup.core.common.on.o> listO1 = o0(context);
                if (listO0 == null) {
                    return o(onoVar, listO1);
                }
                if (listO1 != null && listO1.size() != 0) {
                    listO1.addAll(listO0);
                    Collections.sort(listO1, new AnonymousClass9());
                    return o(onoVar, listO1);
                }
                return o(onoVar, listO0);
            }
        }
        return o(context, (com.thinkup.core.common.on.ono) null);
    }

    public final com.thinkup.core.common.on.o m(Context context, boolean z2, boolean z3, com.thinkup.core.common.on.ono onoVar) {
        if (oon.o().m()) {
            com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(context).o(this.m);
            if (n0VarO != null && oon.o().o(this.m)) {
                Log.w(com.thinkup.core.common.n.mo.oo0, "Forbidden placement");
                return null;
            }
            if (n0VarO != null && oon.o().o(n0VarO)) {
                return o(context, z2, z3, onoVar, this, n0VarO);
            }
        }
        return o(context, z2, z3, onoVar);
    }

    public final List<com.thinkup.core.common.on.o> m(Context context) {
        com.thinkup.core.oo.n0 n0VarO;
        List<com.thinkup.core.common.on.o> listN;
        try {
            List<com.thinkup.core.common.on.o> listN2 = n(context);
            ArrayList arrayList = new ArrayList();
            if (listN2 != null) {
                listN2.size();
                arrayList.addAll(listN2);
            }
            if (oon.o().m() && (n0VarO = com.thinkup.core.oo.nm.o(context).o(this.m)) != null && oon.o().o(n0VarO)) {
                String strOoo = n0VarO.ooo();
                int iO00n = n0VarO.o00n();
                oon.o();
                om omVarO = oon.o(strOoo, String.valueOf(iO00n));
                if (omVarO != null && (listN = omVarO.n(context)) != null && !listN.isEmpty()) {
                    listN.size();
                    arrayList.addAll(listN);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void o(Context context, String str, String str2, mmm mmmVar, com.thinkup.core.common.n.o oVar, om omVar, com.thinkup.core.oo.n0 n0Var) {
        String strOon0;
        String strOoo = n0Var.ooo();
        com.thinkup.core.common.on.m mVar = new com.thinkup.core.common.on.m();
        o(mVar, str2, n0Var);
        mmmVar.mo = mVar;
        com.thinkup.core.common.n.o[] oVarArr = {oVar};
        if (n0Var.omo() == 1) {
            com.thinkup.core.common.on.o oVarM = m(context, strOoo, str, mmmVar);
            if (oVarM != null) {
                String strO = com.thinkup.core.common.ooo.nn.o(context);
                mmmVar.o = strO;
                com.thinkup.core.common.ooo.omn.o("Shared", "placementId:" + str2 + ";result_callback:success;");
                com.thinkup.core.common.on.n0 n0VarMo = oVarM.mo();
                if (n0VarMo != null) {
                    strOon0 = n0VarMo.oon0();
                } else {
                    strOon0 = "";
                }
                com.thinkup.core.common.oo0.oo.o(str2, strOoo, n0VarMo, str, strO, n0Var, true, "1", "2", strOon0);
                com.thinkup.core.common.n.o oVar2 = oVarArr[0];
                if (oVar2 != null) {
                    oVar2.onAdLoaded();
                }
                oVarArr[0] = null;
            } else {
                oon.o().m(strOoo, mmmVar.m());
            }
            omVar.o(context, str, str2, mmmVar, new AnonymousClass7(oVarArr, str2, strOoo, str, mmmVar, n0Var));
            return;
        }
        omVar.o(context, str, str2, mmmVar, new AnonymousClass8(str2, strOoo, str, mmmVar, n0Var, oVarArr, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.thinkup.core.common.on.o m(Context context, String str, String str2, mmm mmmVar) {
        oon.o();
        om omVarO = oon.o(str, str2);
        if (omVarO == null) {
            return null;
        }
        com.thinkup.core.common.on.ono onoVar = new com.thinkup.core.common.on.ono();
        onoVar.o(mmmVar.on);
        onoVar.o(mmmVar.mo);
        onoVar.o(mmmVar.m());
        return omVarO.o(context, true, false, onoVar);
    }

    public static /* synthetic */ void m(om omVar, Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, mmm mmmVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        o0mm o0mmVar;
        List<o0mm> list;
        o00n o00nVar;
        omn omnVar;
        boolean z5;
        on onVar;
        boolean z6;
        boolean z7;
        mmm mmmVar2 = mmmVar;
        n0Var.omn();
        String str3 = str;
        String str4 = str2;
        com.thinkup.core.common.oo0.oo.o("1", n0Var2, str4, str3, "", 0, n0Var.o00n(), 0L);
        oo00 oo00Var = new oo00(mmmVar2, n0Var);
        m0m.o(n0Var2, oo00Var);
        try {
            try {
                try {
                    if (n0Var.omnn()) {
                        o(n0Var, n0Var2);
                        m(n0Var, n0Var2);
                        o00m o00mVarO = ono.o(n0Var, n0Var2);
                        com.thinkup.core.common.on.n0 n0VarN = o00mVarO.n();
                        if (o00mVarO.m() == 0) {
                            try {
                                n0VarN.mom(5);
                                if (o00mVarO.o().onm() == 1) {
                                    throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                                }
                                throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                            } catch (Throwable th) {
                                th = th;
                                z2 = true;
                                omVar.o(z2, n0Var2, th, mmmVar2);
                                return;
                            }
                        }
                        if (o00mVarO.mo()) {
                            boolean zMn = o00mVarO.mn();
                            ArrayList arrayList = new ArrayList(1);
                            ono.m(o00mVarO, arrayList);
                            List<o0mm> listO0 = o00mVarO.o0();
                            if (listO0 != null && !listO0.isEmpty()) {
                                ono.o(n0Var, o00mVarO.n(), listO0);
                            }
                            List<o0mm> listO = ono.o(o00mVarO, o00mVarO.o0());
                            o.o().m(str3);
                            boolean z8 = arrayList.size() > 0;
                            boolean z9 = !z8 && (o00mVarO.oo() == null || o00mVarO.oo().size() == 0);
                            n0Var2.on(SystemClock.elapsedRealtime());
                            if (z9 && ((listO == null || listO.size() == 0) && ((o00mVarO.om() == null || o00mVarO.om().size() == 0) && ((o00mVarO.on() == null || o00mVarO.on().size() == 0) && (o00mVarO.m0() == null || o00mVarO.m0().size() == 0))))) {
                                AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                                n0Var2.mom(6);
                                omVar.o(true, n0Var2, errorCode, mmmVar2);
                                omVar.o0 = false;
                                return;
                            }
                            com.thinkup.core.m.n.o();
                            com.thinkup.core.m.n.m(omVar.o, str3, n0Var);
                            Map<String, Object> mapM = ooo.o().m(omVar.m);
                            Map<String, o0nm> map = om0.o(omVar.o).o;
                            o0nm o0nmVarRemove = map != null ? map.remove(str3) : null;
                            o00n o00nVarO = oom.o(omVar.o).o(str3, str4);
                            omn omnVarO = o0.o().o(str3);
                            omn omnVar2 = new omn(str4);
                            boolean z10 = z9;
                            o0.o().o(omVar.m, omnVar2);
                            n0Var2.m(true);
                            n0Var2.on0(oo00Var.om());
                            on onVar2 = new on(mmmVar2.o());
                            onVar2.m0 = mapM;
                            onVar2.mo = n0Var2;
                            onVar2.o(mmmVar2);
                            onVar2.o(mmmVar2.o0);
                            omVar.oo = str4;
                            omVar.no = n0Var2.ooo0();
                            List<o0mm> listO2 = com.thinkup.core.oo.ooo.o(n0Var, n0Var.n0n());
                            if (listO2.size() > 0) {
                                z4 = false;
                                o0mmVar = listO2.get(0);
                            } else {
                                z4 = false;
                                o0mmVar = null;
                            }
                            if (o0mmVar != null) {
                                for (o0mm o0mmVar2 : o00mVarO.oo()) {
                                    on onVar3 = onVar2;
                                    if (o0mmVar2.m0o().equals(o0mmVar.m0o())) {
                                        String str5 = str3;
                                        String str6 = str4;
                                        o00nVar = o00nVarO;
                                        list = listO;
                                        omnVar = omnVarO;
                                        z5 = z10;
                                        z6 = zMn;
                                        z7 = false;
                                        com.thinkup.core.common.o.n.o oVarO = com.thinkup.core.common.o.n.o().o(context, str5, str6, o0mmVar2, n0Var, mapM, omVar.o0o);
                                        str3 = str5;
                                        str4 = str6;
                                        if (oVarO != null) {
                                            o0mm o0mmVarO0 = oVarO.o0();
                                            AdError adErrorO = ono.o(0, n0Var2, o0mmVarO0, (com.thinkup.core.common.on.om0) null);
                                            Objects.toString(adErrorO);
                                            if (adErrorO != null) {
                                                com.thinkup.core.common.o.n.o().o(str3, o0mmVarO0.m0o());
                                                onVar = onVar3;
                                            } else {
                                                onVar = onVar3;
                                                onVar.mo0 = oVarO;
                                            }
                                            n0Var2.oo(SystemClock.elapsedRealtime());
                                        } else {
                                            onVar = onVar3;
                                        }
                                    } else {
                                        list = listO;
                                        o00nVar = o00nVarO;
                                        omnVar = omnVarO;
                                        z5 = z10;
                                        onVar = onVar3;
                                        z6 = zMn;
                                        z7 = false;
                                    }
                                    mapM = mapM;
                                    onVar2 = onVar;
                                    o00nVarO = o00nVar;
                                    omnVarO = omnVar;
                                    listO = list;
                                    z4 = z7;
                                    zMn = z6;
                                    z10 = z5;
                                }
                            }
                            o00n o00nVar2 = o00nVarO;
                            omn omnVar3 = omnVarO;
                            boolean z11 = z10;
                            boolean z12 = zMn;
                            boolean z13 = z4;
                            List<o0mm> list2 = listO;
                            on onVar4 = onVar2;
                            com.thinkup.core.common.oo0.n.o(omVar.o).o(10, n0Var2);
                            Double[] dArr = new Double[1];
                            Boolean boolOn0n = n0Var.on0n();
                            if (o00mVarO.mm() || (boolOn0n != null && boolOn0n.booleanValue())) {
                                com.thinkup.core.common.on.o oVarO2 = o.o().o(context, str3);
                                if (oVarO2 != null) {
                                    dArr[z13 ? 1 : 0] = Double.valueOf(oVarO2.nm());
                                }
                            }
                            o00mVarO.mm();
                            com.thinkup.core.common.oom.mo moVar = new com.thinkup.core.common.oom.mo(list2);
                            com.thinkup.core.common.oom.m0 m0Var = new com.thinkup.core.common.oom.m0();
                            m0Var.o = str3;
                            m0Var.m = str4;
                            m0Var.f42298n = oo00Var;
                            m0Var.o0 = list2;
                            m0Var.oo = o00mVarO.m0();
                            m0Var.mo = z11;
                            m0Var.mm = n0Var2.ooon();
                            m0Var.mn = o0nmVarRemove;
                            m0Var.no = o00nVar2;
                            m0Var.n0 = moVar;
                            m0Var.nn = omnVar3;
                            m0Var.nm = omnVar2;
                            m0Var.om = o00mVarO.om();
                            m0Var.on = o00mVarO.on();
                            Double d = dArr[z13 ? 1 : 0];
                            m0Var.m0 = d != null ? d.doubleValue() : 0.0d;
                            m0Var.o00 = o00mVarO.oo();
                            onVar4.o(m0Var);
                            omVar.f42171n.put(str4, onVar4);
                            com.thinkup.core.common.on.om omVar2 = mmmVar2.no;
                            if (omVar2 != null) {
                                omVar2.m0(System.currentTimeMillis());
                            }
                            com.thinkup.core.common.oo0.oo.o(mmmVar2.no, n0Var2);
                            m0 m0Var2 = new m0(str3);
                            onVar4.o(m0Var2);
                            m0Var2.o(n0Var, z12);
                            m0Var2.o(omVar.mn);
                            m0Var2.o(onVar4);
                            omVar.o0 = z13;
                            if (!z11) {
                                List<o0mm> listOo = o00mVarO.oo();
                                com.thinkup.core.common.ooo.m.m mVarO = com.thinkup.core.common.ooo.m.m.o();
                                AnonymousClass4 anonymousClass4 = omVar.new AnonymousClass4(context, mmmVar2, str4, str3, n0Var, z8, listOo, oo00Var, n0Var2, o0nmVarRemove, o00nVar2, omnVar3, moVar, boolOn0n, dArr, z12, m0Var2, onVar4);
                                mmmVar2 = mmmVar2;
                                mVarO.m(anonymousClass4);
                            }
                            int i2 = mmmVar2.f42198n;
                            if (i2 == 0 || i2 == 3) {
                                oon.o().o(n0Var, 15, mmmVar2, n0Var2);
                                return;
                            }
                            return;
                        }
                        n0VarN.mom(6);
                        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        throw new com.thinkup.core.common.on.mn(errorCode2, errorCode2.printStackTrace());
                    }
                    n0Var2.mom(5);
                    throw new com.thinkup.core.common.on.mn(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
                } catch (com.thinkup.core.common.on.mn e2) {
                    e = e2;
                    z3 = true;
                    omVar.o(z3, n0Var2, e, mmmVar2);
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
            }
        } catch (com.thinkup.core.common.on.mn e3) {
            e = e3;
            z3 = true;
        }
    }

    private com.thinkup.core.common.on.o o(Context context, boolean z2, boolean z3, com.thinkup.core.common.on.ono onoVar, om omVar, com.thinkup.core.oo.n0 n0Var) {
        com.thinkup.core.common.on.o oVarO;
        boolean z4;
        String strOon0;
        String strValueOf;
        com.thinkup.core.common.on.n0 n0VarMo;
        boolean z5;
        boolean z6;
        com.thinkup.core.common.on.o oVar;
        com.thinkup.core.common.on.n0 n0Var2;
        String strOoo = n0Var.ooo();
        int iO00n = n0Var.o00n();
        oon.o();
        om omVarO = oon.o(strOoo, String.valueOf(iO00n));
        if (omVarO != null) {
            com.thinkup.core.common.on.m mVar = new com.thinkup.core.common.on.m();
            o(mVar, this.m, n0Var);
            if (onoVar != null) {
                onoVar.o(mVar);
                onoVar.o(omVarO.o0o);
            }
            oVarO = omVarO.o(context, z2, z3, onoVar);
            if (oVarO != null) {
                m0m.o(this.m, n0Var, oVarO.mo());
            }
        } else {
            oVarO = null;
        }
        com.thinkup.core.common.on.o oVarO2 = omVar.o(context, z2, z3, onoVar);
        String strOon1 = "";
        if (oVarO2 == null) {
            z4 = false;
            strOon0 = "";
            strValueOf = strOon0;
            n0VarMo = null;
        } else {
            n0VarMo = oVarO2.mo();
            if (n0VarMo == null) {
                strOon0 = "";
                strValueOf = strOon0;
                n0VarMo = null;
            } else {
                strOon0 = n0VarMo.oon0();
                strValueOf = String.valueOf(n0VarMo.mnn());
            }
            z4 = true;
        }
        if (oVarO != null) {
            com.thinkup.core.common.on.n0 n0VarMo2 = oVarO.mo();
            if (n0VarMo2 != null) {
                strOon1 = n0VarMo2.oon0();
            }
            z5 = false;
            z6 = true;
        } else {
            oon.o().m(strOoo, omVar.o0o);
            oon.o().o(n0Var, 17, omVar.o0m, n0VarMo);
            z5 = false;
            z6 = false;
        }
        if (oVarO != null) {
            if (oVarO2 != null) {
                if (com.thinkup.core.common.ooo.mn.o(oVarO.nn(), oVarO2.nn()) < 0) {
                    oVarO.nm();
                    oVarO2.nm();
                } else {
                    oVarO.nm();
                    oVarO2.nm();
                    oVar = oVarO2;
                }
            }
            oVar = oVarO;
        } else {
            oVar = oVarO2;
        }
        String str = this.m;
        com.thinkup.core.common.on.n0 n0VarMo3 = oVar != null ? oVar.mo() : null;
        if (z4 || z6) {
            n0Var2 = n0VarMo3;
            z5 = true;
        } else {
            n0Var2 = n0VarMo3;
        }
        com.thinkup.core.common.oo0.oo.o(str, strOoo, n0Var, n0Var2, z5, z4, z6, strOon0, strOon1, strValueOf);
        return oVar;
    }

    private List<TUAdInfo> o(Context context, om omVar, com.thinkup.core.oo.n0 n0Var) {
        List<com.thinkup.core.common.on.o> listO0;
        String strOoo = n0Var.ooo();
        oon.o();
        om omVarO = oon.o(strOoo, String.valueOf(n0Var.o00n()));
        com.thinkup.core.common.on.ono onoVar = new com.thinkup.core.common.on.ono();
        com.thinkup.core.common.on.m mVar = new com.thinkup.core.common.on.m();
        if (omVarO != null) {
            o(mVar, this.m, n0Var);
            onoVar.o(mVar);
            onoVar.o(omVarO.o0o);
            listO0 = omVarO.o0(context);
        } else {
            listO0 = null;
        }
        List<com.thinkup.core.common.on.o> listO1 = omVar.o0(context);
        if (listO0 == null) {
            return o(onoVar, listO1);
        }
        if (listO1 != null && listO1.size() != 0) {
            listO1.addAll(listO0);
            Collections.sort(listO1, new AnonymousClass9());
            return o(onoVar, listO1);
        }
        return o(onoVar, listO0);
    }

    private static void o(com.thinkup.core.common.on.m mVar, String str, com.thinkup.core.oo.n0 n0Var) {
        mVar.o(str, n0Var.o0mn(), n0Var.nmn());
    }

    private com.thinkup.core.oo.n0 o(boolean z2, Map<String, Object> map) {
        if (!z2 && map != null) {
            Object obj = map.get(CoreDebuggerManager.o);
            if (obj instanceof com.thinkup.core.oo.n0) {
                return (com.thinkup.core.oo.n0) obj;
            }
        }
        return null;
    }

    public static /* synthetic */ boolean o(om omVar) {
        return !TextUtils.isEmpty(omVar.oo);
    }

    public static /* synthetic */ com.thinkup.core.oo.n0 o(om omVar, boolean z2, Map map) {
        if (z2 || map == null) {
            return null;
        }
        Object obj = map.get(CoreDebuggerManager.o);
        String str = omVar.n0;
        if (obj instanceof com.thinkup.core.oo.n0) {
            return (com.thinkup.core.oo.n0) obj;
        }
        return null;
    }

    public static /* synthetic */ void o(om omVar, Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, mmm mmmVar, com.thinkup.core.common.on.n0 n0Var2, String str3, String str4, int i2, boolean z2) {
        com.thinkup.core.oo.nm.o(context).o(n0Var, str, str2, omVar.m, mmmVar.on, omVar.new AnonymousClass2(n0Var2, str3, mmmVar, str4), i2, z2, mmmVar.m());
    }

    public static /* synthetic */ void o(om omVar, Context context, String str, String str2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, mmm mmmVar) {
        if (n0Var2 != null) {
            n0Var2.om(SystemClock.elapsedRealtime());
        }
        com.thinkup.core.common.oom.m.m0 m0Var = new com.thinkup.core.common.oom.m.m0(context, str, n0Var, omVar.new AnonymousClass3(mmmVar, context, str, str2, n0Var, n0Var2));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.thinkup.core.common.oom.m.oo());
        new com.thinkup.core.common.oom.m.on(arrayList, m0Var, 0).o(m0Var);
    }
}
