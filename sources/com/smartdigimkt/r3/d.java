package com.smartdigimkt.r3;

import android.text.TextUtils;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.sdk.basead.mraid.MraidWebView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38053b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38054c = -1;
    public static final int d = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f38052a = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, MraidWebView> f38055e = new ConcurrentHashMap<>(3);
    private static ConcurrentHashMap<String, WTWebView> f = new ConcurrentHashMap<>(3);

    public class a implements Runnable {
        final /* synthetic */ WTWebView X;

        public a(WTWebView wTWebView) {
            this.X = wTWebView;
        }

        @Override // java.lang.Runnable
        public void run() {
            WTWebView wTWebView = this.X;
            if (wTWebView != null) {
                wTWebView.release();
            }
        }
    }

    public static void a(String str, MraidWebView mraidWebView) {
        f38055e.put(str, mraidWebView);
    }

    public static void b(String str, int i2) {
        Integer num = f38052a.get(str);
        if (num == null || num.intValue() < i2) {
            f38052a.put(str, Integer.valueOf(i2));
        }
    }

    public static boolean c(String str) {
        Integer num = f38052a.get(str);
        return num != null && num.intValue() == 0;
    }

    public static void d(String str) {
        com.smartdigimkt.l7.b.a().e(new a(e(str)));
    }

    public static WTWebView e(String str) {
        return f.remove(str);
    }

    public static MraidWebView f(String str) {
        return f38055e.remove(str);
    }

    public static void a(String str, WTWebView wTWebView) {
        f.put(str, wTWebView);
    }

    public static WTWebView a(String str) {
        return f.get(str);
    }

    public static boolean c(com.smartdigimkt.w6.f fVar) {
        if (fVar != null) {
            return f.containsKey(a((com.smartdigimkt.v6.a) null, fVar, 3));
        }
        return false;
    }

    public static String a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar) {
        return a(aVar, fVar, 2);
    }

    public static boolean b(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar) {
        if (aVar == null || fVar == null) {
            return false;
        }
        return f38055e.containsKey(a(aVar, fVar));
    }

    public static String a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, int i2) {
        if (aVar != null) {
            return aVar.f + "_" + fVar.L() + "_" + i2;
        }
        return fVar.d0() + "_" + fVar.L() + "_" + i2;
    }

    public static boolean b(String str) {
        return a(str, 1);
    }

    public static boolean b(com.smartdigimkt.w6.f fVar) {
        if (fVar != null && fVar.N() == 3) {
            if (c(fVar)) {
                return true;
            }
            if (fVar.i() != null && fVar.i().b0() != 1) {
                return !TextUtils.isEmpty(com.smartdigimkt.d7.d.c().a(fVar.v()));
            }
        }
        return false;
    }

    public static boolean a(String str, int i2) {
        return com.smartdigimkt.d7.d.c().e(i2, l.b(str));
    }

    public static boolean a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar) {
        int iF0 = gVar.F0();
        String strK0 = fVar.k0();
        if (TextUtils.isEmpty(strK0)) {
            return false;
        }
        if (iF0 == 0) {
            return true;
        }
        boolean zA = p.c().a(strK0, iF0);
        if (zA) {
            h.a(fVar, gVar);
        }
        return zA;
    }

    public static boolean a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        if (fVar == null) {
            return false;
        }
        if (fVar.g() == -1) {
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            if (cVarB != null && cVarB.a()) {
                cVarB.fillDataFetchStatus(com.smartdigimkt.m6.b.p().k(), fVar, aVar);
            } else {
                fVar.a(0);
            }
        }
        com.smartdigimkt.w6.g gVarI = aVar.t;
        if (fVar.i() != null) {
            gVarI = fVar.i();
        }
        return a(fVar, aVar.f39164b, gVarI);
    }

    public static boolean a(com.smartdigimkt.w6.f fVar, int i2, com.smartdigimkt.w6.g gVar) {
        boolean zA;
        if (TextUtils.equals(String.valueOf(i2), "1")) {
            if (!TextUtils.isEmpty(fVar.k0())) {
                boolean zA2 = a(fVar, gVar);
                if (fVar.N() == 3) {
                    return zA2 && (gVar.f0() == 1 || b(fVar));
                }
                return zA2;
            }
            if (gVar.X0() != 1 && gVar.W0() <= 0) {
                return a(fVar);
            }
            if (TextUtils.isEmpty(fVar.s())) {
                return fVar.N() == 2 && gVar.W0() == 1;
            }
            return a(fVar);
        }
        if (TextUtils.equals(String.valueOf(i2), "3")) {
            if (fVar.h0() == 1 && !TextUtils.isEmpty(fVar.k0())) {
                zA = a(fVar, gVar);
            } else {
                if (fVar.N() == 2) {
                    return true;
                }
                zA = a(fVar);
            }
            if (fVar.N() == 3) {
                return zA && (gVar.f0() == 1 || b(fVar));
            }
            return zA;
        }
        if (!TextUtils.equals(String.valueOf(i2), "4") || fVar.N() == 2) {
            return true;
        }
        boolean z2 = a(fVar, gVar) || a(fVar);
        if (fVar.N() == 3) {
            return z2 && (gVar.f0() == 1 || b(fVar));
        }
        return z2;
    }

    private static boolean a(com.smartdigimkt.w6.f fVar) {
        if (TextUtils.isEmpty(fVar.s())) {
            return false;
        }
        return com.smartdigimkt.d7.d.c().e(1, l.b(fVar.s()));
    }
}
