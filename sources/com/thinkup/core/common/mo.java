package com.thinkup.core.common;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.common.on.mon;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private static volatile mo o;

    private mo() {
    }

    public static String m() {
        return com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.om0 : com.thinkup.core.common.n.mo.oo.om);
    }

    public static String m0() {
        return com.thinkup.core.common.n.mo.oo.oo0;
    }

    public static String mm() {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.omm : com.thinkup.core.common.n.mo.oo.m0, "smart_wf");
        return mVarH != null ? o(mVarH.o0n0(), strO) : strO;
    }

    public static String mn() {
        com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
        String cdnUrl = o0mVarN != null ? o0mVarN.getCdnUrl() : "";
        if (TextUtils.isEmpty(cdnUrl)) {
            cdnUrl = "https://se.rfvtgbyhn.com/v2/open/ns";
        }
        com.thinkup.core.oo.m mVarO = com.thinkup.core.oo.o0.o();
        if (mVarO == null) {
            return cdnUrl;
        }
        String strMnm = mVarO.mnm();
        if (TextUtils.isEmpty(strMnm)) {
            return cdnUrl;
        }
        return strMnm.startsWith("http") ? strMnm.concat("/v2/open/ns") : com.thinkup.core.common.ooo.o00.o(cdnUrl, strMnm);
    }

    public static boolean mo() {
        return com.thinkup.core.common.n.o0n.m().mon() && com.thinkup.core.common.n.o0n.m().mom();
    }

    public static String n() {
        String str = mo() ? com.thinkup.core.common.n.mo.oo.omo : com.thinkup.core.common.n.mo.oo.on;
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        return (mVarH == null || TextUtils.isEmpty(mVarH.o0no())) ? com.thinkup.core.common.om.n.o().o(str) : mVarH.o0no();
    }

    public static String n0() {
        com.thinkup.core.oo.m mVarO = com.thinkup.core.oo.o0.o();
        com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
        String cdnTcpDm = (o0mVarN == null || o0mVarN.getOsDmEntity() == null) ? "" : o0mVarN.getOsDmEntity().getCdnTcpDm();
        if (TextUtils.isEmpty(cdnTcpDm)) {
            cdnTcpDm = com.thinkup.core.common.n.mo.on.m.f41907n;
        }
        if (mVarO != null) {
            String strOo00 = mVarO.oo00();
            if (!TextUtils.isEmpty(strOo00)) {
                return strOo00;
            }
        }
        return cdnTcpDm;
    }

    public static String nm() {
        String str = mo() ? com.thinkup.core.common.n.mo.oo.moo : com.thinkup.core.common.n.mo.oo.oon;
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        return (mVarH == null || TextUtils.isEmpty(mVarH.oo0m())) ? com.thinkup.core.common.om.n.o().o(str) : mVarH.oo0m();
    }

    private static String nn() {
        return mo() ? com.thinkup.core.common.n.mo.oo.ono : com.thinkup.core.common.n.mo.oo.mn;
    }

    public static int no() {
        int iOo0o;
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH == null || (iOo0o = mVarH.oo0o()) <= 0) {
            return 9377;
        }
        return iOo0o;
    }

    private static String o(String str) {
        return str;
    }

    public static String o0() {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.m0m : com.thinkup.core.common.n.mo.oo.o0o, "tracking");
        return mVarH != null ? o(mVarH.oo0(), strO) : strO;
    }

    private static String o00() {
        return com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.m0n : com.thinkup.core.common.n.mo.oo.o0m);
    }

    private static String o0m() {
        mon monVarOon = a.i().m(com.thinkup.core.common.n.o0n.m().o00()).oon();
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.m00 : com.thinkup.core.common.n.mo.oo.nm, "tracking");
        return monVarOon != null ? o(monVarOon.o0(), strO) : strO;
    }

    private static String o0n() {
        mon monVarOon = a.i().m(com.thinkup.core.common.n.o0n.m().o00()).oon();
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.m0o : com.thinkup.core.common.n.mo.oo.nn, "bid");
        return monVarOon != null ? o(monVarOon.o(), strO) : strO;
    }

    private static String o0o() {
        mon monVarOon = a.i().m(com.thinkup.core.common.n.o0n.m().o00()).oon();
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.onn : com.thinkup.core.common.n.mo.oo.no, "bid");
        return monVarOon != null ? o(monVarOon.m(), strO) : strO;
    }

    public static String om() {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.omn : com.thinkup.core.common.n.mo.oo.mo, "agent");
        return mVarH != null ? o(mVarH.nnm(), strO) : strO;
    }

    public static String on() {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH != null) {
            return o(mVarH.nom(), "https://img.robin-flow.com/gdpr/PrivacyPolicySetting.html");
        }
        com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
        String gdprUrl = o0mVarN != null ? o0mVarN.getGdprUrl() : "";
        return !TextUtils.isEmpty(gdprUrl) ? gdprUrl : "https://img.robin-flow.com/gdpr/PrivacyPolicySetting.html";
    }

    public static String oo() {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.on0 : com.thinkup.core.common.n.mo.oo.mm, "tracking");
        return mVarH != null ? o(mVarH.nmo(), strO) : strO;
    }

    private static String oo0() {
        return com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.mo0 : com.thinkup.core.common.n.mo.oo.oom);
    }

    public static mo o() {
        if (o == null) {
            synchronized (mo.class) {
                try {
                    if (o == null) {
                        o = new mo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public static String m(com.thinkup.core.oo.n0 n0Var) {
        return n0Var.mon();
    }

    public static String o(com.thinkup.core.oo.n0 n0Var, boolean z2) {
        if (z2) {
            String strMn0 = n0Var.mn0();
            n0Var.ooo0();
            if (!TextUtils.isEmpty(strMn0)) {
                return strMn0;
            }
        }
        mon monVarOon = a.i().m(com.thinkup.core.common.n.o0n.m().o00()).oon();
        String strO = com.thinkup.core.common.om.n.o().o(mo() ? com.thinkup.core.common.n.mo.oo.onm : com.thinkup.core.common.n.mo.oo.n0, "bid");
        return monVarOon != null ? o(monVarOon.n(), strO) : strO;
    }

    public static String o(com.thinkup.core.oo.n0 n0Var) {
        String strMm0 = n0Var.mm0();
        return TextUtils.isEmpty(strMm0) ? "" : strMm0;
    }

    private static String o(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}
