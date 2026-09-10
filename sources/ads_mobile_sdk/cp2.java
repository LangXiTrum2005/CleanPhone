package ads_mobile_sdk;

import ads_mobile_sdk.cp2;
import ads_mobile_sdk.i72;
import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.base.kowloon;
import com.google.common.base.marial;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.cyrtometer;
import saneness.disciplinal;
import saneness.euthanasia;
import saneness.isoparametric;
import saneness.pastie;
import saneness.resalable;
import saneness.sakeen;

/* JADX INFO: loaded from: classes.dex */
public final class cp2 implements disciplinal {
    public final euthanasia a;
    public final adultoid b;
    public final resalable c;
    public final isoparametric d;
    public final ExecutorService e;
    public final av2 f;
    public final u13 g;
    public final Object h = new Object();
    public final String i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public bp2 n;

    public cp2(euthanasia euthanasiaVar, coffeecake coffeecakeVar, resalable resalableVar, isoparametric isoparametricVar, av2 av2Var, u13 u13Var, j5 j5Var, ExecutorService executorService) {
        this.a = euthanasiaVar;
        this.b = coffeecakeVar;
        this.c = resalableVar;
        this.d = isoparametricVar;
        this.e = executorService;
        this.f = av2Var;
        this.g = u13Var;
        this.i = j5Var.D();
        this.j = j5Var.F();
        this.k = j5Var.B();
        this.l = j5Var.p();
        this.m = j5Var.A();
    }

    public static /* synthetic */ i72 a(Throwable th) {
        return null;
    }

    @Override // saneness.disciplinal
    public final com.google.common.util.concurrent.adultoid b(final Context context, final String str, final View view, final Activity activity) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.ctenidium
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37115kowloon.e(context, str, view, activity);
            }
        }, this.e);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String e(final Context context, final String str, final View view, final Activity activity) {
        final HashMap map = new HashMap();
        this.g.a(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: saneness.tout
            @Override // java.lang.Runnable
            public final void run() {
                this.f37339kowloon.a(map, context, view, activity, str);
            }
        });
        String strA = a(map);
        map.clear();
        return strA;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String f(final Context context, final String str, final View view, final Activity activity) {
        final HashMap map = new HashMap();
        this.g.a(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: saneness.ethene
            @Override // java.lang.Runnable
            public final void run() {
                this.f37143kowloon.b(map, context, view, activity, str);
            }
        });
        String strA = a(map);
        map.clear();
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Map map) {
        String strP;
        v03 v03Var;
        String str;
        map.put("v", this.i);
        com.google.common.util.concurrent.adultoid adultoidVar = (com.google.common.util.concurrent.adultoid) map.get("gs");
        com.google.common.util.concurrent.adultoid adultoidVar2 = (com.google.common.util.concurrent.adultoid) map.get("ai");
        long jO = -1;
        byte[] bArrA = null;
        if (adultoidVar != null) {
            u13 u13Var = this.g;
            v03 v03Var2 = new v03(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_GASS_SIGNAL_STATE, u13Var.b, u13Var.a);
            try {
                try {
                    v03Var2.b();
                    ra raVar = (ra) adultoidVar.get(this.k, TimeUnit.MILLISECONDS);
                    if (raVar != null) {
                        bArrA = raVar.q().a();
                        strP = raVar.p().length() > 1 ? raVar.p() : "E";
                        try {
                            if (raVar.s()) {
                                jO = raVar.o();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            v03Var2.a(e);
                        } catch (InterruptedException e2) {
                            e = e2;
                            v03Var2.a(e);
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            v03Var2.a(e);
                        } catch (TimeoutException e4) {
                            e = e4;
                            v03Var2.a(e);
                        }
                    } else {
                        strP = "E";
                    }
                } catch (ClassCastException e5) {
                    e = e5;
                    strP = "E";
                    v03Var2.a(e);
                    if (strP.equals("E")) {
                        u13 u13Var2 = this.g;
                        v03Var = new v03(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_LOCAL_INT_SIGNAL_STATE, u13Var2.b, u13Var2.a);
                        try {
                            try {
                                v03Var.b();
                                str = (String) adultoidVar2.get(this.j, TimeUnit.MILLISECONDS);
                                if (!kowloon.saneness(str)) {
                                    strP = str;
                                }
                                v03Var.a();
                            } catch (ClassCastException e6) {
                                e = e6;
                                v03Var.a(e);
                                v03Var.a();
                            } catch (InterruptedException e7) {
                                e = e7;
                                v03Var.a(e);
                                v03Var.a();
                            } catch (ExecutionException e8) {
                                e = e8;
                                Throwable cause2 = e.getCause();
                                if (cause2 != null) {
                                    e = cause2;
                                }
                                v03Var.a(e);
                                v03Var.a();
                            } catch (TimeoutException e9) {
                                e = e9;
                                v03Var.a(e);
                                v03Var.a();
                            }
                        } catch (Throwable th) {
                            v03Var.a();
                            throw th;
                        }
                    }
                    map.put("int", strP);
                    if (bArrA != null) {
                        map.put("att", bArrA);
                    }
                    map.put("gv", Long.valueOf(jO));
                } catch (InterruptedException e10) {
                    e = e10;
                    strP = "E";
                    v03Var2.a(e);
                    if (strP.equals("E")) {
                        u13 u13Var3 = this.g;
                        v03Var = new v03(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_LOCAL_INT_SIGNAL_STATE, u13Var3.b, u13Var3.a);
                        v03Var.b();
                        str = (String) adultoidVar2.get(this.j, TimeUnit.MILLISECONDS);
                        if (!kowloon.saneness(str)) {
                            strP = str;
                        }
                        v03Var.a();
                    }
                    map.put("int", strP);
                    if (bArrA != null) {
                        map.put("att", bArrA);
                    }
                    map.put("gv", Long.valueOf(jO));
                } catch (ExecutionException e11) {
                    e = e11;
                    strP = "E";
                } catch (TimeoutException e12) {
                    e = e12;
                    strP = "E";
                    v03Var2.a(e);
                    if (strP.equals("E")) {
                        u13 u13Var4 = this.g;
                        v03Var = new v03(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_LOCAL_INT_SIGNAL_STATE, u13Var4.b, u13Var4.a);
                        v03Var.b();
                        str = (String) adultoidVar2.get(this.j, TimeUnit.MILLISECONDS);
                        if (!kowloon.saneness(str)) {
                            strP = str;
                        }
                        v03Var.a();
                    }
                    map.put("int", strP);
                    if (bArrA != null) {
                        map.put("att", bArrA);
                    }
                    map.put("gv", Long.valueOf(jO));
                }
            } finally {
                v03Var2.a();
            }
        } else {
            strP = "E";
        }
        if (strP.equals("E") && adultoidVar2 != null) {
            u13 u13Var5 = this.g;
            v03Var = new v03(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_LOCAL_INT_SIGNAL_STATE, u13Var5.b, u13Var5.a);
            v03Var.b();
            str = (String) adultoidVar2.get(this.j, TimeUnit.MILLISECONDS);
            if (!kowloon.saneness(str)) {
                strP = str;
            }
            v03Var.a();
        }
        map.put("int", strP);
        if (bArrA != null) {
            map.put("att", bArrA);
        }
        map.put("gv", Long.valueOf(jO));
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String c(final Context context) {
        final HashMap map = new HashMap();
        this.g.a(gf0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: saneness.undecorated
            @Override // java.lang.Runnable
            public final void run() {
                this.f37351kowloon.a(map, context);
            }
        });
        String strA = a(map);
        map.clear();
        return strA;
    }

    public final com.google.common.util.concurrent.adultoid c() {
        return arytenoidectomy.formularize(((mw2) this.d).d(), new marial() { // from class: saneness.puffin
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37267kowloon.a((byte[]) obj);
            }
        }, rotuma.attabal());
    }

    @Override // saneness.disciplinal
    public final String b() {
        synchronized (this.h) {
            try {
                bp2 bp2Var = this.n;
                if (bp2Var != null) {
                    return bp2Var.d;
                }
                return "3.869935264.-1";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Map map, Context context, View view, Activity activity, String str) {
        av2 av2Var = this.f;
        av2Var.getClass();
        HashMap map2 = new HashMap();
        Iterator it = av2Var.a.iterator();
        while (it.hasNext()) {
            ((sakeen) it.next()).a(map2, context, view);
        }
        map.putAll(map2);
        a(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", activity);
        map.put("bds", str);
    }

    public final com.google.common.util.concurrent.adultoid b(Throwable th) {
        if (this.l) {
            return c();
        }
        return arytenoidectomy.competently(th);
    }

    public final /* synthetic */ Void b(byte[] bArr) {
        a((pastie) this.b.get(), bArr, false);
        return null;
    }

    @Override // saneness.disciplinal
    public final void a(InputEvent inputEvent) {
        try {
            synchronized (this.h) {
                try {
                    bp2 bp2Var = this.n;
                    if (bp2Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        bp2Var.b(map);
                    } else {
                        this.g.b(gf0.EVENT_ID_ORCAS_ENGINE_REPORT_TOUCH_EVENT_NULL_HOLDER);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (t73 | v81 e) {
            u13 u13Var = this.g;
            gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
            ((kc1) u13Var.a).a(20103, -1L, e, null);
        }
    }

    public final String a(HashMap map) {
        u13 u13Var = this.g;
        v03 v03Var = new v03(gf0.EVENT_ID_ORCAS_ENGINE_COLLECT_SIGNAL_VM_INVOCATION, u13Var.b, u13Var.a);
        try {
            v03Var.b();
            synchronized (this.h) {
                bp2 bp2Var = this.n;
                if (bp2Var == null) {
                    this.g.b(gf0.EVENT_ID_ORCAS_ENGINE_COLLECT_SIGNAL_NULL_HOLDER);
                    v03Var.a();
                    return "";
                }
                String strA = bp2Var.a(map);
                v03Var.a();
                return strA;
            }
        } catch (Throwable th) {
            try {
                v03Var.a(th);
                throw th;
            } catch (Throwable th2) {
                v03Var.a();
                throw th2;
            }
        }
    }

    @Override // saneness.disciplinal
    public final com.google.common.util.concurrent.adultoid a(final Context context) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.hyalinization
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37170kowloon.c(context);
            }
        }, this.e);
    }

    @Override // saneness.disciplinal
    public final com.google.common.util.concurrent.adultoid a(final Context context, final String str, final View view, final Activity activity) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.rajahship
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37282kowloon.f(context, str, view, activity);
            }
        }, this.e);
    }

    @Override // saneness.disciplinal
    public final com.google.common.util.concurrent.adultoid a() {
        if (this.m) {
            return c();
        }
        return cutely.restrictive(((mw2) this.d).a()).kattegat(Throwable.class, new marial() { // from class: saneness.microanalysis
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return cp2.a((Throwable) obj);
            }
        }, this.e).polder(new impromptu() { // from class: saneness.hydromechanics
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37173attabal.a((i72) obj);
            }
        }, this.e).supplicat(Throwable.class, new impromptu() { // from class: saneness.polyfoil
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37259attabal.b((Throwable) obj);
            }
        }, rotuma.attabal());
    }

    public final void a(pastie pastieVar, byte[] bArr, boolean z) {
        u13 u13Var = this.g;
        v03 v03Var = new v03(gf0.EVENT_ID_ORCAS_ENGINE_INIT_VM_LOAD, u13Var.b, u13Var.a);
        try {
            try {
                v03Var.b();
                synchronized (this.h) {
                    this.n = bp2.a(pastieVar, bArr, z);
                }
                v03Var.a();
            } catch (t73 e) {
                e = e;
                v03Var.a(e);
                throw new ap2(e);
            } catch (v81 e2) {
                e = e2;
                v03Var.a(e);
                throw new ap2(e);
            } catch (Throwable th) {
                v03Var.a(th);
                throw th;
            }
        } catch (Throwable th2) {
            v03Var.a();
            throw th2;
        }
    }

    public final void a(Map map, Context context, View view, Activity activity, String str) {
        av2 av2Var = this.f;
        av2Var.getClass();
        HashMap map2 = new HashMap();
        Iterator it = av2Var.a.iterator();
        while (it.hasNext()) {
            ((sakeen) it.next()).b(map2);
        }
        map.putAll(map2);
        a(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", activity);
        map.put("bds", str);
    }

    public final void a(Map map, Context context) {
        av2 av2Var = this.f;
        av2Var.getClass();
        HashMap map2 = new HashMap();
        Iterator it = av2Var.a.iterator();
        while (it.hasNext()) {
            ((sakeen) it.next()).a(map2);
        }
        map.putAll(map2);
        a(map);
        map.put("f", CampaignEx.JSON_KEY_AD_Q);
        map.put("ctx", context);
    }

    public final /* synthetic */ Void a(byte[] bArr) {
        a((pastie) this.b.get(), bArr, true);
        return null;
    }

    public final com.google.common.util.concurrent.adultoid a(i72 i72Var) {
        if (i72Var != null) {
            euthanasia euthanasiaVar = this.a;
            cyrtometer cyrtometerVarO = i72Var.o();
            kc1 kc1Var = (kc1) euthanasiaVar;
            synchronized (kc1Var.m) {
                kc1Var.p.beachfront(cyrtometerVarO);
            }
        }
        if (this.c.b(i72Var)) {
            mw2 mw2Var = (mw2) this.d;
            return arytenoidectomy.formularize(mw2Var.e.a(gf0.EVENT_ID_ORCAS_STORAGE_GET_PROGRAM_BYTECODE, mw2Var.b.a()), new marial() { // from class: saneness.bluecoat
                @Override // com.google.common.base.marial
                public final Object apply(Object obj) {
                    return this.f37077kowloon.b((byte[]) obj);
                }
            }, rotuma.attabal());
        }
        this.g.b(gf0.EVENT_ID_ORCAS_ENGINE_INIT_SKIP_INVALID_METADATA);
        throw new ap2(1);
    }
}
