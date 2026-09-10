package com.thinkup.core.common.n0.n;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class on implements mo {
    private static final String o = "HttpLoaderInterceptor";
    private final Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, mo> f41950n;
    private final o o0;

    public on(Context context) {
        context = context instanceof Activity ? context.getApplicationContext() : context;
        this.m = context;
        this.f41950n = new ConcurrentHashMap();
        this.o0 = new o(context);
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public final com.thinkup.core.common.n0.m.om o(com.thinkup.core.common.n0.m.o0 o0Var) {
        mo moVarO;
        com.thinkup.core.common.n0.m.om omVarO = null;
        if (this.m != null && o0Var != null) {
            try {
                o oVar = this.o0;
                omVarO = oVar != null ? oVar.o(o0Var) : null;
                return ((omVarO == null || !omVarO.oo()) && (moVarO = o(this.m, o0Var)) != null) ? moVarO.o(o0Var) : omVarO;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return omVarO;
    }

    @Override // com.thinkup.core.common.n0.n.mo
    public final void o(com.thinkup.core.common.n0.m.om omVar, com.thinkup.core.common.n0.m.o0 o0Var) {
        if (this.m == null || omVar == null || o0Var == null) {
            return;
        }
        try {
            o oVar = this.o0;
            if (oVar != null) {
                oVar.o(omVar, o0Var);
            }
            mo moVarO = o(this.m, o0Var);
            if (moVarO != null) {
                moVarO.o(omVar, o0Var);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private mo o(Context context, com.thinkup.core.common.n0.m.o0 o0Var) {
        byte b2;
        mo mVar = null;
        if (o0Var == null || this.f41950n == null) {
            return null;
        }
        String strM = o0Var.m();
        mo moVar = this.f41950n.get(strM);
        if (moVar != null) {
            return moVar;
        }
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(strM)) {
                    switch (strM.hashCode()) {
                        case 261237151:
                            if (!strM.equals("get_cdn_domain")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 1584672721:
                            if (!strM.equals("app_strategy")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1899111790:
                            if (!strM.equals("eu_traffic")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 1976115158:
                            if (!strM.equals("get_area")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        mVar = new m(context);
                    } else if (b2 == 1) {
                        mVar = new om(context);
                    } else if (b2 == 2) {
                        mVar = new n(context);
                    } else if (b2 == 3) {
                        mVar = new oo(context);
                    }
                    if (mVar != null) {
                        this.f41950n.put(strM, mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    private mo o(Context context, String str) {
        mo ooVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "get_cdn_domain":
                ooVar = new oo(context);
                break;
            case "app_strategy":
                ooVar = new m(context);
                break;
            case "eu_traffic":
                ooVar = new om(context);
                break;
            case "get_area":
                ooVar = new n(context);
                break;
        }
        if (ooVar != null) {
            this.f41950n.put(str, ooVar);
        }
        return ooVar;
    }
}
