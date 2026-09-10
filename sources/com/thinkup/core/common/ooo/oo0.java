package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.on.o0mm;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class oo0 {
    protected static oo0 o = new oo0();
    protected static final String m = mm.m(com.thinkup.core.common.n.mo.omn);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f42355n = m00.o(com.thinkup.core.common.n.mo.on0);

    /* JADX INFO: Access modifiers changed from: private */
    public static com.thinkup.core.common.on.nm n(o0mm o0mmVar) {
        TUBaseAdAdapter tUBaseAdAdapterO;
        try {
            String strM = 6 == o0mmVar.nm() ? m(o0mmVar.oo0()) : "";
            if (TextUtils.isEmpty(strM)) {
                tUBaseAdAdapterO = null;
            } else {
                try {
                    tUBaseAdAdapterO = o(strM);
                } catch (Throwable unused) {
                    tUBaseAdAdapterO = null;
                }
            }
            if (tUBaseAdAdapterO == null) {
                tUBaseAdAdapterO = o(o0mmVar.oo0());
            }
            try {
                n0.o(o0mmVar.nm(), tUBaseAdAdapterO.getInternalNetworkSDKVersion());
            } catch (Throwable unused2) {
            }
            return new com.thinkup.core.common.on.nm(tUBaseAdAdapterO);
        } catch (Throwable th) {
            return new com.thinkup.core.common.on.nm(th);
        }
    }

    private static boolean o(int i2) {
        return 6 == i2;
    }

    private static com.thinkup.core.common.on.nm o0(final o0mm o0mmVar) {
        final com.thinkup.core.common.on.nm[] nmVarArr = new com.thinkup.core.common.on.nm[1];
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
            if (o0mVarN != null) {
                o0mVarN.addPlLoadStateListener(new com.thinkup.core.common.mm.o0() { // from class: com.thinkup.core.common.ooo.oo0.1
                    @Override // com.thinkup.core.common.mm.o0
                    public final void o() {
                        nmVarArr[0] = oo0.n(o0mmVar);
                        countDownLatch.countDown();
                    }
                });
            }
            try {
                countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            th = null;
        } catch (Throwable th) {
            th = th;
            th.printStackTrace();
        }
        com.thinkup.core.common.on.nm nmVar = nmVarArr[0];
        return nmVar == null ? new com.thinkup.core.common.on.nm(th) : nmVar;
    }

    private static String m(String str) {
        try {
            String strO = o();
            String[] strArrSplit = str.replace(strO + com.thinkup.core.common.n.mo.ono, "").split("\\.");
            if (strArrSplit != null && strArrSplit.length > 1) {
                String str2 = strArrSplit[strArrSplit.length - 1];
                String str3 = f42355n;
                String str4 = m;
                Locale locale = Locale.ENGLISH;
                return strO + com.thinkup.core.common.n.mo.ono + strArrSplit[0] + com.thinkup.core.common.n.mo.ono + str4.toLowerCase(locale) + com.thinkup.core.common.n.mo.ono + str2.replace(str3, str4.toUpperCase(locale));
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static TUBaseAdAdapter o(String str) throws NoSuchMethodException {
        if (str == null) {
            return null;
        }
        Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(TUBaseAdAdapter.class);
        if (clsAsSubclass == 0) {
            Log.w(com.thinkup.core.common.n.mo.oo0, "can not find adapter");
        }
        Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (TUBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }

    private static TUBaseAdAdapter o(Class<? extends com.thinkup.core.common.n.ooo> cls) throws NoSuchMethodException {
        if (cls == null) {
            Log.w(com.thinkup.core.common.n.mo.oo0, "can not find adapter");
        }
        Constructor<? extends com.thinkup.core.common.n.ooo> declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (TUBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }

    public static com.thinkup.core.common.on.nm o(o0mm o0mmVar) {
        com.thinkup.core.common.on.nm nmVarN;
        com.thinkup.core.common.n.o0m o0mVarN;
        if (TUSDK.isCnSDK()) {
            int iNm = o0mmVar.nm();
            if (iNm == 46) {
                return o0(o0mmVar);
            }
            if (iNm > 100000) {
                String strOo0 = o0mmVar.oo0();
                if (!TextUtils.isEmpty(strOo0) && (o0mVarN = com.thinkup.core.common.n.o0n.m().n()) != null && o0mVarN.isContainsPlStr(strOo0)) {
                    return o0(o0mmVar);
                }
                nmVarN = null;
            } else {
                nmVarN = n(o0mmVar);
            }
        } else {
            nmVarN = n(o0mmVar);
        }
        return nmVarN == null ? n(o0mmVar) : nmVarN;
    }

    private static void o(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
        try {
            n0.o(o0mmVar.nm(), tUBaseAdAdapter.getInternalNetworkSDKVersion());
        } catch (Throwable unused) {
        }
    }

    private static String o(int i2, String str) {
        if (6 == i2) {
            return m(str);
        }
        return "";
    }

    private static String o() {
        String[] strArrSplit = oo0.class.getPackage().getName().split("\\.");
        if (strArrSplit != null) {
            try {
                if (strArrSplit.length > 1) {
                    return strArrSplit[0] + com.thinkup.core.common.n.mo.ono + strArrSplit[1];
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }
}
