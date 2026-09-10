package com.thinkup.core.common.oo0;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.x4;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdMixBidInfo;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.n0o;
import com.thinkup.core.common.on.nmn;
import com.thinkup.core.common.on.nn0;
import com.thinkup.core.common.on.noo;
import com.thinkup.core.common.on.o00;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0n;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.on.oo00;
import com.thinkup.core.common.on.oo0m;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.m0o;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.mg.api.MgAdInfo;
import com.thinkup.core.mg.api.MgComparedResult;
import com.thinkup.core.mg.api.MgPreLoadAdRequest;
import com.thinkup.core.oo.nm;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    public static final int m = 2;
    public static final int m0 = 11;
    public static final int mm = 4;
    public static final int mn = 5;
    public static final int mo = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42286n = 7;
    public static final int n0 = 5;
    public static final int nm = 1;
    public static final int nn = 1;
    public static final int no = 0;
    public static final int o = 1;
    public static final int o0 = 8;
    public static final int o00 = 2;
    public static final int o0m = 1;
    public static final int o0n = 2;
    public static final int o0o = 3;
    public static final int om = 10;
    private static final String om0 = "oo";
    private static String omo = "";
    public static final int on = 3;
    public static final int oo = 9;
    public static final int oo0 = 3;
    public static final int oom = 5;
    public static final int oon = 0;
    public static final int ooo = 4;

    private static void n() {
    }

    private static boolean o0(com.thinkup.core.oo.m mVar, o0n o0nVar) {
        Map<String, String> mapO00n = mVar.o00n();
        if (mapO00n == null) {
            return false;
        }
        if (TextUtils.isEmpty(o0nVar.mn0)) {
            return mapO00n.containsKey(o0nVar.f42235n);
        }
        if (!mapO00n.containsKey(o0nVar.f42235n)) {
            return false;
        }
        String str = mapO00n.get(o0nVar.f42235n);
        return !TextUtils.isEmpty(str) && str.contains(o0nVar.mn0);
    }

    private static void n(n0 n0Var, String str) {
        try {
            o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
            o0nVar.f42235n = "1004639";
            o0nVar.o(n0Var);
            o0nVar.o00 = String.valueOf(n0Var.n0n());
            o0nVar.o0o = n0Var.mon();
            o0nVar.o0m = String.valueOf(n0Var.mmo());
            o0nVar.o0n = str;
            o0nVar.mn0 = n0Var.oono();
            o0nVar.mnm = n0Var.ooo0();
            o0nVar.mnn = n0Var.oooo();
            o0nVar.noo = n0Var.oo00();
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    public static void o(n0 n0Var, AdError adError) {
        o(n0Var, adError, (o0mm) null);
    }

    public static void m(String str, String str2, String str3) {
        m(str, str2, str3, "");
    }

    public static void o(n0 n0Var, AdError adError, o0mm o0mmVar) {
        try {
            o0n o0nVar = new o0n(n0Var.oono(), null);
            o0nVar.f42235n = "1004630";
            o0nVar.o(n0Var);
            com.thinkup.core.oo.n0 n0VarO = nm.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn());
            o0nVar.mn = n0VarO != null ? n0VarO.o000() : "";
            if (adError != null) {
                o0nVar.o00 = adError.printStackTrace();
                o0nVar.o0o = adError.getCode();
            }
            if (o0mmVar != null) {
                o0nVar.o0m = o0mmVar.m0o();
                o0nVar.o0n = String.valueOf(nn.o(o0mmVar));
            }
            o0nVar.mnm = n0Var.ooo0();
            o0nVar.mnn = n0Var.oooo();
            o0nVar.noo = n0Var.oo00();
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    public static void m(String str, String str2, String str3, String str4) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004647";
        o0nVar.om = str3;
        o0nVar.o00 = str2;
        o0nVar.o0o = str;
        o0nVar.o0m = str4;
        o(o0nVar);
    }

    private static void m(oom oomVar, ooo oooVar, int i2, long j, long j2, long j3, long j4) {
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004708";
        o0nVar.o(oomVar);
        o0nVar.o00 = String.valueOf(oomVar.mm);
        o0nVar.o0o = oomVar.oo;
        o0nVar.o0m = String.valueOf(oomVar.m);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o0n = o00Var.mmn();
            o0nVar.oo0 = o00Var.mo();
        }
        o0nVar.ooo = String.valueOf(i2);
        o0nVar.oom = String.valueOf(j);
        o0nVar.oon = String.format("%.2f", Double.valueOf((j2 / 1024.0d) / 1024.0d));
        o0nVar.om0 = String.valueOf(j3);
        o0nVar.omo = String.format("%.2f", Double.valueOf((j4 / 1024.0d) / 1024.0d));
        oon oonVar = oomVar.oo0;
        if (oonVar != null && oonVar.mm0() > 0) {
            o0nVar.omm = String.valueOf(oomVar.oo0.mm0());
        }
        o(o0nVar);
    }

    public static void n(n0 n0Var, String str, String str2) {
        if (n0Var == null) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
        o0nVar.f42235n = "1004750";
        o0nVar.o(n0Var);
        o0nVar.o0 = n0Var.oon0();
        o0nVar.oo = n0Var.oomn();
        o0nVar.mn = n0Var.oomm();
        o0nVar.m0 = String.valueOf(n0Var.no0());
        o0nVar.nn = String.valueOf(n0Var.oomo());
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = String.valueOf(n0Var.oono());
        o0nVar.o0n = str;
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.oo0 = str2;
        }
        o(o0nVar);
    }

    private static void o(n0 n0Var, String str, int i2, String str2, String str3, int i3, int i4, AdError adError, int i5, double d, long j, int i6, int i7, String str4, String str5, JSONObject jSONObject, int i8, String str6) {
        String platformMSG;
        o0n o0nVar = new o0n(str3, String.valueOf(i2));
        o0nVar.f42235n = "1004631";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = str2;
        o0nVar.o0m = String.valueOf(i3);
        if (!TextUtils.isEmpty(str6)) {
            o0nVar.o0n = "15";
        } else {
            o0nVar.o0n = String.valueOf(i4);
        }
        String strO000 = "";
        o0nVar.oo0 = adError != null ? adError.getPlatformCode() : "";
        if (adError == null) {
            platformMSG = "";
        } else {
            platformMSG = adError.getPlatformMSG();
        }
        o0nVar.ooo = platformMSG;
        o0nVar.oom = String.valueOf(i5);
        o0nVar.oon = String.valueOf(d);
        if (i4 == 0) {
            o0nVar.om0 = String.valueOf(j);
        }
        o0nVar.omo = String.valueOf(i6);
        o0nVar.omm = String.valueOf(i7);
        if (i8 >= -1) {
            o0nVar.omn = String.valueOf(i8);
        }
        com.thinkup.core.oo.n0 n0VarO = nm.o(com.thinkup.core.common.n.o0n.m().on()).o(str);
        if (n0VarO != null) {
            strO000 = n0VarO.o000();
        }
        o0nVar.mn = strO000;
        o0nVar.mnm = str4;
        o0nVar.mnn = str5;
        if (jSONObject != null) {
            o0nVar.noo = jSONObject;
        }
        if (n0Var.o0nm() > 0.0d) {
            o0nVar.ono = String.valueOf(n0Var.o0nm());
        }
        if (!TextUtils.isEmpty(n0Var.o0nn())) {
            o0nVar.onm = n0Var.o0nn();
        }
        o(o0nVar);
    }

    private static void m(ooo oooVar, oom oomVar, int i2) {
        int iMoo = oooVar.on() != null ? oooVar.on().moo() : 1;
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004719";
        o0nVar.o(oomVar);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o00 = o00Var.mmn();
            o0nVar.o0o = o00Var.mo();
        }
        o0nVar.o0m = "1";
        o0nVar.o0n = "1";
        o0nVar.oom = String.valueOf(oomVar.m);
        if (oooVar.on() != null) {
            o0nVar.oon = oooVar.on().ooo();
        }
        o0nVar.om0 = String.valueOf(i2);
        o0nVar.omo = String.valueOf(iMoo);
        o(o0nVar);
    }

    private static void n(ooo oooVar, oom oomVar, int i2) {
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004768";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o0o = o00Var.mmn();
            o0nVar.o0m = String.valueOf(o00Var.mmm());
        }
        o0nVar.o0n = String.valueOf(i2);
        o(o0nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(com.thinkup.core.oo.m mVar, o0n o0nVar) {
        if (com.thinkup.core.common.n.o0n.m().omn()) {
            return true;
        }
        String strO0on = mVar.o0on();
        if (!TextUtils.isEmpty(strO0on)) {
            String str = o0nVar.mno;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(strO0on);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        if (TextUtils.equals(str, jSONArray.optString(i2))) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        Map<String, String> mapO0oo = mVar.o0oo();
        if (mapO0oo == null) {
            return false;
        }
        if (TextUtils.isEmpty(o0nVar.mn0)) {
            return mapO0oo.containsKey(o0nVar.f42235n);
        }
        if (mapO0oo.containsKey(o0nVar.f42235n)) {
            String str2 = mapO0oo.get(o0nVar.f42235n);
            if (!TextUtils.isEmpty(str2) && str2.contains(o0nVar.mn0)) {
                return true;
            }
        }
        return false;
    }

    public static void m(n0 n0Var, String str, String str2) {
        if (n0Var == null) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
        o0nVar.f42235n = "1004745";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = String.valueOf(n0Var.oono());
        o0nVar.o0n = str;
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.oo0 = str2;
        }
        o(o0nVar);
    }

    public static void o(n0 n0Var, int i2, AdError adError) {
        try {
            o(n0Var, n0Var.oomn(), n0Var.n0n(), n0Var.mon(), n0Var.oono(), -1, i2, adError, n0Var.mo0(), n0Var.mom(), 0L, n0Var.non(), n0Var.oo0, n0Var.ooo0(), n0Var.oooo(), n0Var.oo00(), n0Var.o00m(), o(adError, n0Var.n0n(), n0Var.oomn(), i2));
        } catch (Throwable unused) {
        }
    }

    public static void n(o0n o0nVar) {
        com.thinkup.core.oo.n0 n0VarM = nm.o(com.thinkup.core.common.n.o0n.m().on()).m(o0nVar.oo);
        if (n0VarM != null) {
            o0nVar.n00 = n0VarM.oomn();
        }
    }

    private static void m(ooo oooVar, oom oomVar, int i2, int i3) {
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004747";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        o0nVar.o0m = String.valueOf(i2);
        if (i3 > 0) {
            o0nVar.o0n = String.valueOf(i3);
        }
        o0nVar.oo0 = String.valueOf(oooVar.oom());
        o0nVar.ooo = oooVar.o0m();
        o0nVar.oom = oooVar.o0n();
        o(o0nVar);
    }

    public static void o(n0 n0Var, int i2, AdError adError, long j) {
        try {
            o(n0Var, n0Var.oomn(), n0Var.n0n(), n0Var.mon(), n0Var.oono(), n0Var.mmo(), i2, adError, n0Var.mo0(), n0Var.mom(), j, n0Var.non(), n0Var.oo0, n0Var.ooo0(), n0Var.oooo(), n0Var.oo00(), n0Var.o00m(), o(adError, n0Var.n0n(), n0Var.oomn(), i2));
        } catch (Throwable unused) {
        }
    }

    public static void m(n0 n0Var) {
        com.thinkup.core.common.on.m mVarOm = n0Var.om();
        int iMnn = n0Var.mnn();
        n0Var.oomn();
        if (mVarOm == null || !com.thinkup.core.common.oon.o().o(n0Var.oomn())) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), null);
        o0nVar.f42235n = "1004754";
        o0nVar.o(n0Var);
        o0nVar.o0 = n0Var.oon0();
        o0nVar.oo = n0Var.oomn();
        o0nVar.m0 = String.valueOf(n0Var.no0());
        o0nVar.nn = String.valueOf(n0Var.oomo());
        o0nVar.o00 = String.valueOf(iMnn);
        o0nVar.o0o = mVarOm.o();
        o0nVar.o0m = mVarOm.o0();
        o0nVar.o0n = String.valueOf(mVarOm.oo());
        o0nVar.oo0 = String.valueOf(mVarOm.mo());
        o0nVar.ooo = String.valueOf(mVarOm.on());
        o0nVar.oom = String.valueOf(mVarOm.om());
        o0nVar.oon = String.valueOf(mVarOm.m0());
        o(o0nVar);
    }

    public static void o(String str, String str2, com.thinkup.core.oo.n0 n0Var, int i2, String str3, Map<String, Object> map, ono onoVar) {
        Object objValueOf;
        String strO000;
        try {
            String strOmn = "";
            o0n o0nVar = new o0n(n0Var != null ? String.valueOf(n0Var.o00n()) : "", "");
            o0nVar.f42235n = "1004633";
            o0nVar.o(n0Var);
            o0nVar.o(onoVar);
            o0nVar.o0 = str;
            o0nVar.oo = str2;
            o0nVar.m0 = String.valueOf(n0Var != null ? n0Var.o0mn() : 0);
            o0nVar.n0 = "0";
            if (n0Var == null) {
                objValueOf = "";
            } else {
                objValueOf = Integer.valueOf(n0Var.nmn());
            }
            o0nVar.nn = String.valueOf(objValueOf);
            o0nVar.o00 = String.valueOf(i2);
            o0nVar.o0o = str3;
            o0nVar.oo0 = str;
            o0nVar.ooo = "0";
            if (n0Var == null) {
                strO000 = "";
            } else {
                strO000 = n0Var.o000();
            }
            o0nVar.mn = strO000;
            if (n0Var != null) {
                strOmn = n0Var.omn();
            }
            o0nVar.mnm = strOmn;
            if (map != null) {
                Object obj = map.get(TUAdConst.KEY.CP_PLACEMENT_ID);
                if (obj != null) {
                    o0nVar.mnn = obj.toString();
                }
                JSONObject jSONObjectO = m0o.o(map);
                if (jSONObjectO != null) {
                    o0nVar.noo = jSONObjectO;
                }
            }
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    public static void m(String str, String str2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004755";
        o0nVar.o00 = str;
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.o0o = str2;
        }
        o(o0nVar);
    }

    private static void m(oom oomVar, ooo oooVar, String str, String str2, String str3, String str4) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), "66");
        o0nVar.f42235n = "1004743";
        o0nVar.o0 = oomVar.om;
        o0nVar.oo = oomVar.o;
        o0nVar.o(oomVar);
        o0nVar.o00 = str;
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o0o = String.valueOf(o00Var.mmn());
            o0nVar.o0m = String.valueOf(o00Var.mo());
        }
        o0nVar.o0n = String.valueOf(oomVar.m);
        o0nVar.oo0 = str2;
        o0nVar.ooo = "1";
        o0nVar.oom = str3;
        o0nVar.oon = str4;
        o(o0nVar);
    }

    public static void o(n0 n0Var, boolean z2) {
        if (com.thinkup.core.common.n.o0n.m().on() == null) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
        o0nVar.f42235n = "1004634";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = String.valueOf(n0Var.mmm());
        o0nVar.o0n = z2 ? "1" : "0";
        o0nVar.oo0 = String.valueOf(n0Var.onm);
        if (n0Var.n0n() == 66) {
            int iNn0 = n0Var.nn0();
            if (iNn0 != 0) {
                o0nVar.ooo = String.valueOf(iNn0);
            }
            int iNnm = n0Var.nnm();
            if (iNnm != 0) {
                o0nVar.oon = String.valueOf(iNnm);
            }
            int iNnn = n0Var.nnn();
            if (iNnn != 0) {
                o0nVar.om0 = String.valueOf(iNnn);
            }
        }
        o0nVar.oom = n0Var.oono();
        o0nVar.omo = String.valueOf(n0Var.o0mo());
        o0nVar.omm = String.valueOf(n0Var.o0m0());
        o0nVar.omn = String.valueOf(n0Var.o0mm());
        o0nVar.on0 = n0Var.nmn() == 2 ? "2" : "1";
        com.thinkup.core.oo.n0 n0VarO = nm.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn());
        o0nVar.mn = n0VarO != null ? n0VarO.o000() : "";
        o0nVar.mn0 = n0Var.oono();
        o0nVar.mnm = n0Var.ooo0();
        o0nVar.mnn = n0Var.oooo();
        o0nVar.noo = n0Var.oo00();
        o(o0nVar);
        m.o().o(o0nVar, n0Var);
    }

    public static void m(n0 n0Var, int i2) {
        TUAdRequest tUAdRequestO;
        if (n0Var == null || (tUAdRequestO = n0Var.o()) == null || tUAdRequestO.getPreLoadInfo() == null || tUAdRequestO.getPreLoadInfo().getPreLoadCallbackRegister() == null || tUAdRequestO.getPreLoadInfo().getPreLoadCallbackRegister().getMgAdInfo() == null) {
            return;
        }
        MgPreLoadAdRequest preLoadInfo = tUAdRequestO.getPreLoadInfo();
        MgAdInfo mgAdInfo = preLoadInfo.getPreLoadCallbackRegister().getMgAdInfo();
        int cpEcpmReceiveTime = preLoadInfo.getCpEcpmReceiveTime();
        if (!MgAdInfo.isMgAdInfoValid(mgAdInfo) || cpEcpmReceiveTime > 0) {
            return;
        }
        preLoadInfo.setCpEcpmReceiveTime(i2);
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004760";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(i2);
        MgComparedResult mgComparedResult = tUAdRequestO.getPreLoadInfo().getMgComparedResult();
        o0nVar.o0o = String.valueOf(mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L);
        double cpPrice = mgComparedResult != null ? mgComparedResult.getCpPrice() : 0.0d;
        if (cpPrice > 0.0d) {
            o0nVar.o0m = String.valueOf(cpPrice);
        }
        o(o0nVar);
    }

    private static void m(ooo oooVar, oom oomVar, long j, long j2) {
        String string;
        String string2;
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004761";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        o0nVar.o0m = "1";
        o0nVar.o0n = String.valueOf(j);
        o0nVar.oo0 = oooVar.mom();
        String string3 = "";
        if (oooVar.on() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(oooVar.on().noo());
            string = sb.toString();
        } else {
            string = "";
        }
        o0nVar.ooo = string;
        if (oooVar.on() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oooVar.on().n0n());
            string2 = sb2.toString();
        } else {
            string2 = "";
        }
        o0nVar.oom = string2;
        if (oooVar.on() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(oooVar.on().no0());
            string3 = sb3.toString();
        }
        o0nVar.oon = string3;
        if (j2 > 0) {
            o0nVar.omm = String.valueOf(j2);
        }
        o(o0nVar);
    }

    public static void o(String str, String str2, boolean z2, int i2, com.thinkup.core.oo.n0 n0Var, com.thinkup.core.common.on.o oVar, String str3, String str4, Map<String, Object> map, com.thinkup.core.common.on.m mVar, ono onoVar) {
        o(str, str2, z2, i2, n0Var, oVar, str3, str4, map, mVar, 0L, onoVar);
    }

    public static void o(final String str, final String str2, final boolean z2, final int i2, final com.thinkup.core.oo.n0 n0Var, final com.thinkup.core.common.on.o oVar, final String str3, final String str4, final Map<String, Object> map, final com.thinkup.core.common.on.m mVar, final long j, final ono onoVar) {
        try {
            o(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.1
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    JSONObject jSONObjectO;
                    try {
                        com.thinkup.core.common.on.o oVar2 = oVar;
                        n0 n0VarMo = oVar2 != null ? oVar2.mo() : null;
                        com.thinkup.core.oo.n0 n0Var2 = n0Var;
                        o0n o0nVar = new o0n(n0Var2 != null ? String.valueOf(n0Var2.o00n()) : "", n0VarMo != null ? String.valueOf(n0VarMo.n0n()) : "");
                        o0nVar.f42235n = "1004632";
                        o0nVar.o0 = str;
                        o0nVar.oo = str2;
                        o0nVar.o(n0VarMo);
                        if (n0VarMo == null) {
                            o0nVar.o(onoVar);
                        }
                        if (TextUtils.isEmpty(o0nVar.m0)) {
                            com.thinkup.core.oo.n0 n0Var3 = n0Var;
                            if (n0Var3 != null) {
                                o0nVar.m0 = String.valueOf(n0Var3.o0mn());
                            } else {
                                o0nVar.m0 = "0";
                            }
                        }
                        o0nVar.o00 = z2 ? "1" : "0";
                        o0nVar.o0o = String.valueOf(i2);
                        o0nVar.o0m = n0VarMo != null ? String.valueOf(n0VarMo.mmm()) : x4.DISABLED_AUCTION_FALLBACK_ID;
                        o0nVar.o0n = n0VarMo != null ? n0VarMo.mon() : "";
                        o0nVar.oo0 = n0VarMo != null ? String.valueOf(n0VarMo.n0n()) : "";
                        o0nVar.ooo = n0VarMo != null ? n0VarMo.om0 : "";
                        o0nVar.oom = str3;
                        o0nVar.oon = n0VarMo != null ? n0VarMo.oon0() : str;
                        if (n0VarMo == null || TextUtils.equals(str, n0VarMo.oon0())) {
                            o0nVar.om0 = "0";
                        } else {
                            o0nVar.om0 = "1";
                        }
                        if (n0VarMo != null) {
                            o0nVar.omo = n0VarMo.oo0 == 3 ? "1" : "0";
                        } else {
                            o0nVar.omo = "0";
                        }
                        o0nVar.omm = str4;
                        com.thinkup.core.common.on.o oVar3 = oVar;
                        if (oVar3 != null && oVar3.n0() == "3") {
                            o0nVar.on0 = "1";
                        }
                        long j2 = j;
                        if (j2 > 0) {
                            o0nVar.omn = String.valueOf(j2);
                        }
                        com.thinkup.core.oo.n0 n0Var4 = n0Var;
                        o0nVar.mn = n0Var4 != null ? n0Var4.o000() : "";
                        com.thinkup.core.oo.n0 n0Var5 = n0Var;
                        o0nVar.mn0 = n0Var5 != null ? String.valueOf(n0Var5.o00n()) : "";
                        if (n0VarMo != null) {
                            o0nVar.mnm = n0VarMo.ooo0();
                        } else {
                            com.thinkup.core.oo.n0 n0Var6 = n0Var;
                            if (n0Var6 != null) {
                                o0nVar.mnm = n0Var6.omn();
                            }
                        }
                        if (n0VarMo != null) {
                            o0nVar.mnn = n0VarMo.oooo();
                        } else {
                            Map map2 = map;
                            if (map2 != null && (obj = map2.get(TUAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                                o0nVar.mnn = obj.toString();
                            }
                        }
                        com.thinkup.core.common.on.m mVar2 = mVar;
                        if (mVar2 != null) {
                            o0nVar.n0o = mVar2.o();
                            o0nVar.n0m = mVar.m();
                            o0nVar.n0n = mVar.n();
                        }
                        if (n0VarMo != null) {
                            o0nVar.noo = n0VarMo.oo00();
                        } else {
                            Map map3 = map;
                            if (map3 != null && (jSONObjectO = m0o.o(map3)) != null) {
                                o0nVar.noo = jSONObjectO;
                            }
                        }
                        oo.o(o0nVar);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void o(n0 n0Var, AdError adError, Map<String, Object> map) {
        if (com.thinkup.core.common.n.o0n.m().on() == null) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
        o0nVar.f42235n = "1004636";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = String.valueOf(n0Var.mmm());
        if (adError != null) {
            o0nVar.o0n = adError.getCode();
            o0nVar.oo0 = adError.getPlatformCode();
            o0nVar.ooo = adError.getPlatformMSG();
        }
        com.thinkup.core.oo.n0 n0VarO = nm.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn());
        o0nVar.mn = n0VarO != null ? n0VarO.o000() : "";
        o0nVar.mn0 = n0Var.oono();
        if (map != null) {
            try {
                if (map.containsKey("offer_id")) {
                    o0nVar.oom = map.get("offer_id").toString();
                }
                if (map.containsKey("rv_anim_type") && n0Var.oono().equals("1")) {
                    o0nVar.oon = map.get("rv_anim_type").toString();
                }
            } catch (Throwable unused) {
            }
        }
        o0nVar.mnm = n0Var.ooo0();
        o0nVar.mnn = n0Var.oooo();
        o0nVar.noo = n0Var.oo00();
        o(o0nVar);
    }

    public static void m(n0 n0Var, String str) {
        o0n o0nVar = new o0n("", "");
        o0nVar.o(n0Var);
        o0nVar.f42235n = "1004767";
        o0nVar.o00 = str;
        o(o0nVar);
    }

    private static boolean m(o0n o0nVar, com.thinkup.core.oo.m mVar) {
        Map<String, String> mapOm;
        if ("1004742".equals(o0nVar.f42235n)) {
            return true;
        }
        if (!TextUtils.isEmpty(o0nVar.f42235n) && !TextUtils.isEmpty(o0nVar.mno) && !TextUtils.isEmpty(o0nVar.mn0) && (mapOm = mVar.om(o0nVar.f42235n)) != null) {
            if (mapOm.containsKey("0")) {
                String str = mapOm.get("0");
                return !TextUtils.isEmpty(str) && str.contains(o0nVar.mn0);
            }
            if (mapOm.containsKey(o0nVar.mno)) {
                String str2 = mapOm.get(o0nVar.mno);
                if (!TextUtils.isEmpty(str2) && str2.contains(o0nVar.mn0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void m(o0n o0nVar) {
        o(o0nVar);
    }

    public static /* synthetic */ boolean m(com.thinkup.core.oo.m mVar, o0n o0nVar) {
        Map<String, String> mapO00n = mVar.o00n();
        if (mapO00n == null) {
            return false;
        }
        if (TextUtils.isEmpty(o0nVar.mn0)) {
            return mapO00n.containsKey(o0nVar.f42235n);
        }
        if (!mapO00n.containsKey(o0nVar.f42235n)) {
            return false;
        }
        String str = mapO00n.get(o0nVar.f42235n);
        return !TextUtils.isEmpty(str) && str.contains(o0nVar.mn0);
    }

    public static void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, TUAdRequest tUAdRequest) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004616";
        o0nVar.o(tUAdRequest);
        o0nVar.oo = str5;
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o0nVar.o0n = str4;
        o0nVar.oo0 = str6;
        o0nVar.ooo = str7;
        o0nVar.oom = String.valueOf(com.thinkup.core.common.ooo.o00.o(com.thinkup.core.common.n.o0n.m().on()) ? 1 : 0);
        o0nVar.oon = String.valueOf(com.thinkup.core.oo.o0.o().oooo());
        o(o0nVar);
    }

    public static void o(String str, String str2, long j, long j2, long j3, TUAdRequest tUAdRequest) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004635";
        o0nVar.o(tUAdRequest);
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.oo = str2;
        }
        o0nVar.o00 = str;
        o0nVar.o0o = String.valueOf(j);
        o0nVar.o0m = String.valueOf(j2);
        o0nVar.o0n = String.valueOf(j3);
        o0nVar.oo0 = String.valueOf(com.thinkup.core.oo.o0.o().oooo());
        o(o0nVar);
    }

    public static void o(String str, String str2, String str3, String str4) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004637";
        o0nVar.oo = str;
        o0nVar.o00 = str2;
        o0nVar.o0o = str3;
        o0nVar.o0m = str4;
        o(o0nVar);
    }

    public static void o(String str, String str2, String str3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004772";
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o(o0nVar);
    }

    private static void o(ooo oooVar, oom oomVar, String str) {
        o(oooVar, oomVar, false, str, 0.0d, 0.0d, 0L);
    }

    private static void o(ooo oooVar, oom oomVar, double d, double d2, long j) {
        o(oooVar, oomVar, true, "", d, d2, j);
    }

    private static void o(ooo oooVar, oom oomVar, boolean z2, String str, double d, double d2, long j) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004764";
        o0nVar.o(oomVar);
        if (oooVar != null) {
            o0nVar.o00 = String.valueOf(oooVar.o());
            if (oooVar instanceof o00) {
                o0nVar.o0m = ((o00) oooVar).mmn();
                o0nVar.o0n = oooVar.mo();
            }
            o0nVar.oo0 = oooVar.o0o();
        }
        if (oomVar != null) {
            o0nVar.o0o = String.valueOf(oomVar.m);
            oon oonVar = oomVar.oo0;
            if (oonVar != null) {
                o0nVar.omo = String.valueOf(oonVar.omo());
            }
        }
        o0nVar.ooo = z2 ? "1" : "2";
        if (!TextUtils.isEmpty(str)) {
            o0nVar.oom = str;
        }
        if (d > 0.0d) {
            o0nVar.oon = String.valueOf(Math.round(d / 1024.0d));
        }
        if (d2 > 0.0d) {
            o0nVar.om0 = String.valueOf(Math.round(d2 / 1024.0d));
        }
        if (j > 0) {
            o0nVar.omm = String.valueOf(j);
        }
        o(o0nVar);
    }

    public static void o(n0 n0Var) {
        try {
            o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
            o0nVar.f42235n = "1004640";
            o0nVar.o(n0Var);
            o0nVar.o00 = String.valueOf(n0Var.n0n());
            o0nVar.o0o = n0Var.mon();
            o0nVar.o0m = String.valueOf(n0Var.mmo());
            o0nVar.o0n = String.valueOf(n0Var.noo());
            o0nVar.oo0 = String.valueOf(n0Var.nom());
            o0nVar.mnm = n0Var.ooo0();
            o0nVar.mnn = n0Var.oooo();
            o0nVar.noo = n0Var.oo00();
            o0nVar.mn0 = n0Var.oono();
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    public static void o(int i2, int i3, int i4, int i5) {
        o0n o0nVar = new o0n(null, String.valueOf(i5));
        o0nVar.f42235n = "1004641";
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = String.valueOf(i3);
        o0nVar.o0m = String.valueOf(i4);
        o0nVar.o0n = String.valueOf(i5);
        o(o0nVar);
    }

    public static void o(String str, String str2, String str3, int i2, String str4, String str5, String str6) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004642";
        o0nVar.o0 = str;
        o0nVar.nom = str5;
        o0nVar.non = str6;
        o0nVar.o00 = str2;
        o0nVar.o0o = str3;
        o0nVar.o0m = String.valueOf(i2);
        if (i2 == 3 || i2 == 10) {
            o0nVar.o0n = str4;
        } else if (i2 == 2) {
            o0nVar.oo0 = "0";
            o0nVar.ooo = "0.0";
        }
        o(o0nVar);
    }

    private static void o(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, int i3, long j2, long j3, String str11, String str12) {
        o0n o0nVar = new o0n(null, str3);
        o0nVar.f42235n = "1004711";
        o0nVar.o0 = str;
        o0nVar.nom = str11;
        o0nVar.non = str12;
        o0nVar.oo = str2;
        o0nVar.mm = String.valueOf(j);
        o0nVar.o00 = str3;
        o0nVar.o0o = str4;
        o0nVar.o0m = str5;
        o0nVar.o0n = str6;
        if (!TextUtils.isEmpty(str7)) {
            o0nVar.oo0 = String.valueOf(str7.contains("data/data") ? 1 : 2);
        }
        o0nVar.ooo = str8;
        o0nVar.oom = String.valueOf(i2);
        o0nVar.oon = str9;
        if (!"1".equals(str9)) {
            o0nVar.om0 = str10;
        }
        o0nVar.omo = String.valueOf(i3);
        o0nVar.omm = String.valueOf(j2 / 1024.0f);
        o0nVar.omn = String.valueOf(j3);
        o(o0nVar);
    }

    private static void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9) {
        o0n o0nVar = new o0n(null, str3);
        o0nVar.f42235n = "1004712";
        o0nVar.o0 = str;
        o0nVar.nom = str8;
        o0nVar.non = str9;
        o0nVar.oo = str2;
        o0nVar.mm = String.valueOf(System.currentTimeMillis());
        o0nVar.o00 = str3;
        o0nVar.o0o = str4;
        o0nVar.o0m = str5;
        o0nVar.o0n = str6;
        o0nVar.oo0 = str7;
        o0nVar.ooo = String.valueOf(i2);
        o(o0nVar);
    }

    public static void o(int i2, long j, long j2, String str) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004644";
        o0nVar.om = str;
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = String.valueOf(j);
        o0nVar.o0m = String.valueOf(j2);
        o0nVar.o0n = String.valueOf(j2 - j);
        o(o0nVar);
    }

    private static void o(int i2, long j, long j2, String str, String str2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004651";
        o0nVar.om = str;
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = String.valueOf(j2 - j);
        o0nVar.o0m = str2;
        o(o0nVar);
    }

    public static void o(n0 n0Var, boolean z2, long j, long j2, long j3) {
        try {
            if (com.thinkup.core.common.n.o0n.m().on() == null) {
                return;
            }
            o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
            o0nVar.f42235n = "1004643";
            o0nVar.o(n0Var);
            o0nVar.o00 = n0Var.oono();
            o0nVar.o0o = String.valueOf(j);
            o0nVar.o0m = String.valueOf(j2);
            o0nVar.o0n = String.valueOf(j3);
            o0nVar.oo0 = String.valueOf(n0Var.n0n());
            o0nVar.ooo = n0Var.mon();
            o0nVar.oom = String.valueOf(n0Var.mmm());
            o0nVar.oon = String.valueOf(n0Var.onm);
            o0nVar.om0 = z2 ? "1" : "0";
            com.thinkup.core.oo.n0 n0VarO = nm.o(com.thinkup.core.common.n.o0n.m().on()).o(n0Var.oomn());
            o0nVar.mn = n0VarO != null ? n0VarO.o000() : "";
            o0nVar.mn0 = n0Var.oono();
            o0nVar.mnm = n0Var.ooo0();
            o0nVar.mnn = n0Var.oooo();
            o0nVar.noo = n0Var.oo00();
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    public static void o(String str, String str2, String str3, n0 n0Var, com.thinkup.core.oo.n0 n0Var2, String str4, String str5) {
        try {
            o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
            o0nVar.f42235n = str;
            o0nVar.o(n0Var);
            o0nVar.o0 = n0Var.oon0();
            o0nVar.oo = str2;
            o0nVar.mn = n0Var2 != null ? n0Var2.o000() : "";
            o0nVar.o00 = String.valueOf(n0Var.n0n());
            o0nVar.o0o = n0Var.mon();
            o0nVar.o0m = n0Var.omm();
            o0nVar.o0n = n0Var.nn();
            o0nVar.oo0 = n0Var.m0o;
            o0nVar.ooo = str4;
            o0nVar.oom = str5;
            o0nVar.oon = str3;
            o0nVar.mnm = n0Var.ooo0();
            o0nVar.mnn = n0Var.oooo();
            o0nVar.noo = n0Var.oo00();
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    public static void o(oom oomVar, ooo oooVar, int i2) {
        try {
            o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
            o0nVar.f42235n = "1004679";
            o0nVar.o(oomVar);
            if (oooVar instanceof o00) {
                o0nVar.o00 = ((o00) oooVar).mmn();
            }
            o0nVar.o0o = oomVar.oo;
            o0nVar.o0m = oooVar.mo();
            o0nVar.o0n = String.valueOf(oooVar.o());
            o0nVar.oo0 = oooVar.n();
            o0nVar.ooo = oooVar.o0();
            o0nVar.oom = String.valueOf(i2);
            o(o0nVar);
        } catch (Throwable unused) {
        }
    }

    private static void o(String str, String str2, com.thinkup.core.oo.n0 n0Var, String str3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004646";
        o0nVar.o0 = str;
        o0nVar.oo = str2;
        o0nVar.m0 = String.valueOf(n0Var.o0mn());
        o0nVar.nn = String.valueOf(n0Var.nmn());
        o0nVar.mn = n0Var.o000();
        o0nVar.oon = String.valueOf(str3);
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, String str, String str2, String str3, String str4) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004648";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        o0nVar.o0o = String.valueOf(oooVar.o());
        o0nVar.o0m = str;
        o0nVar.o0n = str2;
        o0nVar.oo0 = str3;
        o0nVar.ooo = str4;
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, String str, String str2, int i2, int i3, String str3) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004650";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        o0nVar.o0o = String.valueOf(oooVar.o());
        o0nVar.o0m = str;
        o0nVar.o0n = str2;
        o0nVar.oo0 = String.valueOf(i2);
        if (oooVar instanceof o00) {
            o0nVar.oom = String.valueOf(((o00) oooVar).mmn());
        }
        o0nVar.oon = String.valueOf(oomVar.m);
        if (i3 > 0) {
            o0nVar.om0 = String.valueOf(i3);
        }
        o0nVar.omo = str3;
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, String str, String str2, int i2) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        boolean z2 = i2 == 0;
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004728";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        o0nVar.o0o = String.valueOf(oomVar.oo0.mmm());
        o0nVar.o0m = String.valueOf(z2 ? 1 : 2);
        o0nVar.o0n = str;
        o0nVar.oo0 = str2;
        if (!z2) {
            o0nVar.ooo = String.valueOf(i2);
        }
        o(o0nVar);
    }

    private static void o(ooo oooVar, oom oomVar, String str, String str2) {
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004652";
        o0nVar.o(oomVar);
        o0nVar.o00 = String.valueOf(oomVar.mm);
        o0nVar.o0o = oomVar.oo;
        if (oooVar instanceof n0o) {
            o0nVar.o0m = "1";
        } else if (oooVar instanceof o00) {
            o0nVar.o0m = "2";
        } else if (oooVar instanceof nmn) {
            o0nVar.o0m = "3";
        }
        o0nVar.o0n = str;
        o0nVar.oo0 = str2;
        o0nVar.ooo = oooVar.mo();
        o0nVar.oom = oooVar.mm();
        o0nVar.oon = oooVar.oo0();
        o0nVar.om0 = oooVar.mn();
        o0nVar.omo = oooVar.n0();
        o0nVar.omm = oooVar.no();
        o0nVar.omn = oooVar.nm();
        o0nVar.on0 = oooVar.o0o();
        try {
            if (oooVar instanceof nn0) {
                StringBuilder sb = new StringBuilder();
                String strN00 = ((nn0) oooVar).n00();
                if (!TextUtils.isEmpty(strN00)) {
                    JSONArray jSONArray = new JSONArray(strN00);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        sb.append(jSONArray.optString(i2));
                        sb.append(",");
                    }
                    if (sb.length() > 1) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    o0nVar.ono = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        o(o0nVar);
    }

    public static void o() {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004657";
        o(o0nVar);
    }

    public static void o(mnn mnnVar, double d, String str, double d2, double d3, double d4, double d5, String str2, String str3, boolean z2) {
        o(mnnVar, d, str, d2, d3, d4, d5, str2, str3, z2, 0.0d);
    }

    public static void o(mnn mnnVar, double d, String str, double d2, double d3, double d4, double d5, String str2, String str3, boolean z2, double d6) {
        o0n o0nVar = new o0n(String.valueOf(mnnVar.nm()), String.valueOf(mnnVar.mn()));
        o0nVar.f42235n = "1004659";
        o0nVar.o(mnnVar.omm());
        o0nVar.mn = mnnVar.no();
        o0nVar.o00 = String.valueOf(mnnVar.mn());
        o0nVar.o0o = mnnVar.n0();
        o0nVar.o0m = String.valueOf(d);
        o0nVar.o0n = str;
        o0nVar.mnm = mnnVar.nn();
        o0nVar.mnn = mnnVar.o00();
        o0nVar.oo0 = String.valueOf(d2);
        o0nVar.ooo = String.valueOf(d3);
        o0nVar.oom = mnnVar.o0n();
        o0nVar.oon = String.valueOf(mnnVar.oo0());
        o0nVar.om0 = String.valueOf(mnnVar.m0());
        o0nVar.omo = String.valueOf(d4);
        if (mnnVar.o0() != null) {
            o0nVar.omm = mnnVar.o0();
        }
        Double dOom = mnnVar.oom();
        if (dOom != null) {
            o0nVar.omn = String.valueOf(dOom);
        }
        if (mnnVar.mn() == 66 && d5 > 0.0d) {
            o0nVar.on0 = String.valueOf(d3 / d5);
        }
        o0nVar.ono = mnnVar.on0();
        o0nVar.onm = z2 ? "1" : null;
        o0nVar.onn = str2;
        if (!TextUtils.isEmpty(str3)) {
            o0nVar.m00 = str3;
        }
        TUAdMixBidInfo.BidEntity bidEntityO = mnnVar.o();
        if (bidEntityO != null) {
            if (!TextUtils.isEmpty(bidEntityO.getAdUserName())) {
                o0nVar.m0o = bidEntityO.getAdUserName();
            }
            if (!TextUtils.isEmpty(bidEntityO.getAdTittle())) {
                o0nVar.m0m = bidEntityO.getAdTittle();
            }
            if (!TextUtils.isEmpty(bidEntityO.getAdPackageName())) {
                o0nVar.mom = bidEntityO.getAdPackageName();
            }
        }
        o0nVar.m0n = String.valueOf(mnnVar.onn());
        MgComparedResult mgComparedResultM00 = mnnVar.m00();
        if (mgComparedResultM00 != null && com.thinkup.core.n.o0.n.m.o(mnnVar.oon())) {
            o0nVar.mo0 = mgComparedResultM00.isMgWin() ? "1" : "2";
            o0nVar.moo = String.valueOf(mgComparedResultM00.getCpCostTime());
        }
        o0nVar.mon = String.valueOf(mnnVar.m0o());
        o0nVar.mm0 = String.valueOf(mnnVar.m0m());
        if (mnnVar.mn() == 8 && d6 > 0.0d) {
            o0nVar.mmo = String.valueOf(com.thinkup.core.n.o0.o.o(8, String.valueOf(d6)));
        }
        if (mnnVar.m0n() > 0.0d) {
            o0nVar.mmm = String.valueOf(mnnVar.m0n());
        }
        if (!TextUtils.isEmpty(mnnVar.mo0())) {
            o0nVar.mmn = mnnVar.mo0();
        }
        o0nVar.noo = mnnVar.o0o();
        o(o0nVar);
    }

    public static void o(o0mm o0mmVar, o0om o0omVar, long j, boolean z2, boolean z3) {
        Object objValueOf;
        String strO000;
        o0n o0nVar = new o0n(String.valueOf(o0omVar.om), String.valueOf(o0mmVar.nm()));
        o0nVar.f42235n = "1004660";
        o0nVar.o(o0mmVar);
        oo00 oo00Var = o0omVar.nm;
        com.thinkup.core.oo.n0 n0VarO = oo00Var != null ? oo00Var.o() : null;
        o0nVar.o0 = o0omVar.o0;
        o0nVar.oo = o0omVar.oo;
        String strOmn = "";
        o0nVar.m0 = String.valueOf(n0VarO != null ? Integer.valueOf(n0VarO.o0mn()) : "");
        if (n0VarO == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(n0VarO.nmn());
        }
        o0nVar.nn = String.valueOf(objValueOf);
        if (n0VarO == null) {
            strO000 = "";
        } else {
            strO000 = n0VarO.o000();
        }
        o0nVar.mn = strO000;
        o0nVar.o00 = String.valueOf(o0mmVar.nm());
        o0nVar.o0o = o0mmVar.m0o();
        o0nVar.o0m = z2 ? "1" : "2";
        o0nVar.o0n = String.valueOf(j);
        o0nVar.oo0 = z3 ? "1" : "2";
        if (n0VarO != null) {
            try {
                strOmn = n0VarO.omn();
            } catch (Throwable unused) {
            }
        }
        o0nVar.mnm = strOmn;
        Map<String, Object> map = o0omVar.f42240n.on;
        if (map != null) {
            try {
                Object obj = map.get(TUAdConst.KEY.CP_PLACEMENT_ID);
                if (obj != null) {
                    o0nVar.mnn = obj.toString();
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONObject jSONObjectO = m0o.o(o0omVar.f42240n.on);
                if (jSONObjectO != null) {
                    o0nVar.noo = jSONObjectO;
                }
            } catch (Throwable unused3) {
            }
        }
        o(o0nVar);
    }

    public static void o(String str, o0mm o0mmVar, boolean z2, long j, o0om o0omVar) {
        com.thinkup.core.oo.n0 n0VarO = o0omVar != null ? o0omVar.nm.o() : null;
        o0n o0nVar = new o0n(String.valueOf(o0omVar.om), String.valueOf(o0mmVar.nm()));
        o0nVar.f42235n = "1004665";
        o0nVar.o(o0mmVar);
        o0nVar.oo = str;
        String strOmn = "";
        o0nVar.mn = n0VarO != null ? n0VarO.o000() : "";
        o0nVar.o00 = String.valueOf(o0mmVar.nm());
        o0nVar.o0o = o0mmVar.m0o();
        o0nVar.o0m = String.valueOf(z2 ? 1 : 2);
        o0nVar.o0n = String.valueOf(j);
        if (n0VarO != null) {
            try {
                strOmn = n0VarO.omn();
            } catch (Throwable unused) {
            }
        }
        o0nVar.mnm = strOmn;
        Map<String, Object> map = o0omVar.f42240n.on;
        if (map != null) {
            try {
                Object obj = map.get(TUAdConst.KEY.CP_PLACEMENT_ID);
                if (obj != null) {
                    o0nVar.mnn = obj.toString();
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONObject jSONObjectO = m0o.o(o0omVar.f42240n.on);
                if (jSONObjectO != null) {
                    o0nVar.noo = jSONObjectO;
                }
            } catch (Throwable unused3) {
            }
        }
        o(o0nVar);
    }

    public static void o(oo0m oo0mVar) {
        if (oo0mVar == null) {
            return;
        }
        o0n o0nVar = new o0n(oo0mVar.no(), String.valueOf(oo0mVar.mn()));
        o0nVar.f42235n = "1004667";
        o0nVar.o(oo0mVar.omo());
        o0nVar.o00 = String.valueOf(oo0mVar.mn());
        o0nVar.o0o = oo0mVar.n0();
        o0nVar.o0m = oo0mVar.on();
        o0nVar.o0n = oo0mVar.m0();
        o0nVar.oo0 = oo0mVar.om();
        o0nVar.ooo = oo0mVar.oo();
        o0nVar.oom = oo0mVar.mm();
        o0nVar.oon = oo0mVar.mo();
        o0nVar.om0 = String.valueOf(oo0mVar.nn());
        o0nVar.omo = String.valueOf(oo0mVar.o00());
        o0nVar.omm = String.valueOf(oo0mVar.o0m());
        o0nVar.omn = String.valueOf(oo0mVar.oo0());
        o0nVar.on0 = String.valueOf(oo0mVar.ooo());
        if (oo0mVar.m() != null) {
            o0nVar.ono = oo0mVar.m();
        }
        Double dN = oo0mVar.n();
        if (dN != null) {
            o0nVar.onm = String.valueOf(dN);
        }
        o0nVar.noo = oo0mVar.nm();
        if (oo0mVar.mn() == 66 && oo0mVar.oon().doubleValue() > 0.0d) {
            o0nVar.onn = String.valueOf(oo0mVar.oo0() / oo0mVar.oon().doubleValue());
        }
        o0nVar.m00 = oo0mVar.on0();
        if (oo0mVar.omo() != null) {
            String strO0mn = oo0mVar.omo().o0mn();
            if (!TextUtils.isEmpty(strO0mn)) {
                o0nVar.m0o = strO0mn;
            }
        }
        MgComparedResult mgComparedResultOno = oo0mVar.ono();
        if (mgComparedResultOno != null && com.thinkup.core.n.o0.n.m.o(oo0mVar.om0())) {
            MgAdInfo mgAdInfo = mgComparedResultOno.getMgAdInfo();
            o0nVar.m0m = mgAdInfo != null ? String.valueOf(mgAdInfo.getUSDEcpm()) : "0";
            o0nVar.m0n = String.valueOf(mgComparedResultOno.getCpCostTime());
        }
        o0nVar.mo0 = String.valueOf(oo0mVar.o0o());
        o(o0nVar);
    }

    public static void o(n0 n0Var, int i2, String str, double d, double d2, String str2, String str3, String str4, String str5) {
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(i2));
        o0nVar.f42235n = "1004668";
        o0nVar.o(n0Var);
        o0nVar.oo = n0Var.oomn();
        o0nVar.nom = str4;
        o0nVar.non = str5;
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = str;
        o0nVar.o0m = String.valueOf(d);
        o0nVar.o0n = str2;
        o0nVar.oo0 = str3;
        o0nVar.ooo = String.valueOf(d2);
        o0nVar.mn = n0Var.oomm();
        o0nVar.m0 = String.valueOf(n0Var.no0());
        o0nVar.nn = String.valueOf(n0Var.oomo());
        o0nVar.mnm = n0Var.ooo0();
        o0nVar.mnn = n0Var.oooo();
        o0nVar.noo = n0Var.oo00();
        o(o0nVar);
    }

    public static void o(n0 n0Var, String str, String str2) {
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
        o0nVar.f42235n = "1004669";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = str;
        o0nVar.o0m = str2;
        o(o0nVar);
    }

    public static void o(oom oomVar, int i2, String str, Map<String, JSONArray> map, int i3, int i4, int i5, String str2, int i6, int i7, long j, String str3, int i8, boolean z2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004675";
        o0nVar.o(oomVar);
        o0nVar.o00 = str;
        o0nVar.o0o = String.valueOf(i2);
        o0nVar.o0n = String.valueOf(i3);
        o0nVar.oo0 = String.valueOf(i4);
        o0nVar.ooo = String.valueOf(i5);
        o0nVar.oom = str2;
        o0nVar.oon = String.valueOf(i6);
        if (i7 >= 0) {
            o0nVar.om0 = String.valueOf(i7);
        }
        if (j > 0) {
            o0nVar.omo = String.valueOf(j);
        }
        if (!TextUtils.isEmpty(str3)) {
            o0nVar.omm = str3;
        }
        if (i8 > 0) {
            o0nVar.omn = String.valueOf(i8);
        }
        if (map != null && map.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, JSONArray> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                o0nVar.on0 = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        if (z2) {
            o0nVar.ono = "1";
        }
        o(o0nVar);
    }

    private static void o(final String str, final String str2, final String str3, final String str4, final String str5, final int i2, final boolean z2, final String str6, final String str7) {
        o(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsScreenOn;
                o0n o0nVar = new o0n(str4, str5);
                o0nVar.f42235n = "1004680";
                o0nVar.o0 = str;
                o0nVar.oo = str2;
                o0nVar.o00 = str3;
                o0nVar.o0o = String.valueOf(i2);
                o0nVar.o0m = z2 ? "1" : "0";
                try {
                    zIsScreenOn = ((PowerManager) com.thinkup.core.common.n.o0n.m().on().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                    zIsScreenOn = true;
                }
                o0nVar.o0n = zIsScreenOn ? "1" : "0";
                o0nVar.oo0 = com.thinkup.core.common.ooo.o00.o(com.thinkup.core.common.n.o0n.m().on()) ? "1" : "0";
                o0nVar.ooo = str7;
                o0nVar.oom = str6;
                oo.o(o0nVar);
            }
        });
    }

    public static void o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o(str, str2, str3, str4, str5, str6, str7, "", "", "", "", 0);
    }

    public static void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2) {
        o0n o0nVar = new o0n("", "");
        if (TextUtils.isEmpty(o0nVar.f42235n)) {
            o0nVar.f42235n = "1004685";
        }
        if (!TextUtils.isEmpty(str)) {
            o0nVar.o00 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.o0o = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            o0nVar.o0m = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            o0nVar.o0n = str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            o0nVar.oo0 = str5;
        }
        if (!TextUtils.isEmpty(str6)) {
            o0nVar.ooo = str6;
        }
        if (!TextUtils.isEmpty(str7)) {
            o0nVar.oom = str7;
        }
        if (!TextUtils.isEmpty(str8)) {
            o0nVar.oon = str8;
        }
        if (!TextUtils.isEmpty(str9)) {
            o0nVar.om0 = str9;
        }
        if (!TextUtils.isEmpty(str10)) {
            o0nVar.omo = str10;
        }
        if (!TextUtils.isEmpty(str11)) {
            o0nVar.omm = str11;
        }
        if (i2 > 0) {
            o0nVar.on0 = String.valueOf(i2);
        }
        o0nVar.omn = "300000001";
        o(o0nVar);
    }

    public static void o(String str, String str2, com.thinkup.core.oo.n0 n0Var, String str3, com.thinkup.core.common.on.o oVar, long j, TUAdRequest tUAdRequest) {
        String string;
        if (oVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(oVar.mo().n0n());
            string = sb.toString();
        } else {
            string = null;
        }
        o0n o0nVar = new o0n("4", string);
        o0nVar.f42235n = "1004690";
        o0nVar.o(tUAdRequest);
        o0nVar.o(n0Var);
        o0nVar.o0 = str2;
        o0nVar.oo = str;
        if (n0Var != null) {
            o0nVar.nn = String.valueOf(n0Var.nmn());
            o0nVar.m0 = String.valueOf(n0Var.o0mn());
            o0nVar.mn = n0Var.o000();
        }
        if (oVar != null) {
            o0nVar.o(oVar.mo());
        }
        o0nVar.o00 = str3;
        if (oVar != null) {
            o0nVar.o0o = oVar.n0();
            o0nVar.o0m = o0nVar.mno;
            o0nVar.o0n = oVar.mo() != null ? oVar.mo().mon() : "";
        }
        o0nVar.oo0 = "1";
        o0nVar.ooo = String.valueOf(j);
        o(o0nVar);
    }

    private static void o(final String str, final oom oomVar, final String str2, final String str3, final String str4, final int i2, final int i3, final String str5, final String str6, final boolean z2, final long j) {
        if (com.thinkup.core.common.n.o0n.m().on() == null) {
            return;
        }
        o(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsScreenOn;
                String str7;
                o0n o0nVar = new o0n(str3, str4);
                o0nVar.f42235n = "1004687";
                com.thinkup.core.oo.m mVarH = a.h(a.i());
                if (mVarH == null || !oo.n(mVarH, o0nVar)) {
                    o0nVar.o(oomVar);
                    o0nVar.o00 = str2;
                    o0nVar.o0o = String.valueOf(i2);
                    o0nVar.o0m = String.valueOf(i3);
                    boolean zO = true;
                    try {
                        zIsScreenOn = ((PowerManager) com.thinkup.core.common.n.o0n.m().on().getSystemService("power")).isScreenOn();
                    } catch (Throwable unused) {
                        zIsScreenOn = true;
                    }
                    boolean zInKeyguardRestrictedInputMode = false;
                    try {
                        KeyguardManager keyguardManager = (KeyguardManager) com.thinkup.core.common.n.o0n.m().on().getSystemService("keyguard");
                        if (keyguardManager != null) {
                            zInKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                        }
                    } catch (Throwable unused2) {
                    }
                    if (!zInKeyguardRestrictedInputMode && zIsScreenOn) {
                        str7 = "0";
                    } else if (zInKeyguardRestrictedInputMode || zIsScreenOn) {
                        str7 = (zInKeyguardRestrictedInputMode && zIsScreenOn) ? "2" : "3";
                    } else {
                        str7 = "1";
                    }
                    o0nVar.o0n = str7;
                    try {
                        zO = com.thinkup.core.common.ooo.o00.o(com.thinkup.core.common.n.o0n.m().on());
                    } catch (Throwable unused3) {
                    }
                    o0nVar.oo0 = zO ? "1" : "0";
                    o0nVar.ooo = str6;
                    o0nVar.oom = str5;
                    o0nVar.oon = z2 ? "1" : "2";
                    if (TextUtils.isEmpty(oo.omo)) {
                        try {
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            long blockSize = statFs.getBlockSize();
                            String unused4 = oo.omo = ((statFs.getAvailableBlocks() * blockSize) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB";
                            o0nVar.om0 = oo.omo;
                        } catch (Throwable unused5) {
                        }
                    } else {
                        o0nVar.om0 = oo.omo;
                    }
                    o0nVar.omo = str;
                    o0nVar.omm = String.valueOf(j);
                    oo.o(o0nVar);
                }
            }
        });
    }

    public static void o(String str, String str2, String str3, String str4, String str5) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004688";
        if (!TextUtils.isEmpty(str)) {
            o0nVar.oo = str;
        }
        o0nVar.o00 = str2;
        o0nVar.o0o = str3;
        o0nVar.o0m = str4;
        o0nVar.o0n = str5;
        o(o0nVar);
    }

    public static void o(final String str, final n0 n0Var, final String str2, final String str3, final String str4, final int i2, final int i3, final long j) {
        if (com.thinkup.core.common.n.o0n.m().on() == null) {
            return;
        }
        o(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    o0n o0nVar = new o0n(String.valueOf(i3), "");
                    o0nVar.f42235n = "1004691";
                    o0nVar.o(n0Var);
                    com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
                    if (mVarM != null && !mVarM.mom() && mVarM.mo() && !oo.n(mVarM, o0nVar)) {
                        o0nVar.o0 = str2;
                        o0nVar.oo = str3;
                        o0nVar.o(n0Var);
                        o0nVar.o00 = str;
                        o0nVar.o0o = str4;
                        long j2 = j;
                        if (j2 >= 0) {
                            o0nVar.o0m = String.valueOf(j2);
                        }
                        int i4 = i2;
                        if (i4 > 0) {
                            o0nVar.o0n = String.valueOf(i4);
                        }
                        com.thinkup.core.common.nm.o0 o0VarM = com.thinkup.core.common.nm.oo.o().m();
                        if (o0VarM != null) {
                            o0nVar.oo0 = String.valueOf(o0VarM.o());
                            o0nVar.ooo = String.valueOf(o0VarM.oo());
                            o0nVar.oom = String.valueOf(o0VarM.om());
                            o0nVar.oon = String.valueOf(o0VarM.m());
                            o0nVar.om0 = String.valueOf(o0VarM.on());
                            o0nVar.omo = String.valueOf(o0VarM.m0());
                            o0nVar.omm = String.valueOf(o0VarM.n());
                            o0nVar.omn = String.valueOf(o0VarM.o0());
                        }
                        o0nVar.on0 = String.valueOf(com.thinkup.core.common.nm.oo.o().oo());
                        oo.o(o0nVar);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private static void o(oom oomVar, ooo oooVar) {
        if (oooVar == null || oomVar == null || !(oooVar instanceof nn0)) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004697";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        o0nVar.o0o = oooVar.mm();
        o0nVar.o0m = ((nn0) oooVar).mmn();
        o(o0nVar);
    }

    public static void o(String str, String str2, n0 n0Var, String str3, String str4, com.thinkup.core.oo.n0 n0Var2, boolean z2, String str5, String str6, String str7) {
        o0n o0nVar = new o0n(str3, "");
        o0nVar.f42235n = "1004693";
        o0nVar.o(n0Var);
        o0nVar.o0 = str4;
        o0nVar.oo = str;
        if (n0Var2 != null) {
            o0nVar.m0 = String.valueOf(n0Var2.o0mn());
            o0nVar.nn = String.valueOf(n0Var2.nmn());
            o0nVar.mn = n0Var2.o000();
        }
        o0nVar.o00 = z2 ? "1" : "2";
        o0nVar.o0o = str5;
        o0nVar.o0m = str6;
        if (n0Var2 != null) {
            o0nVar.o0n = n0Var2.omo() == 1 ? "1" : "2";
        }
        o0nVar.oo0 = str2;
        o0nVar.ooo = str7;
        o(o0nVar);
    }

    public static void o(String str, String str2, com.thinkup.core.oo.n0 n0Var, n0 n0Var2, boolean z2, boolean z3, boolean z4, String str3, String str4, String str5) {
        o0n o0nVar = new o0n(null, "");
        o0nVar.f42235n = "1004694";
        o0nVar.o(n0Var2);
        o0nVar.o(n0Var);
        o0nVar.o0 = str3;
        o0nVar.oo = str;
        if (n0Var != null) {
            o0nVar.m0 = String.valueOf(n0Var.o0mn());
            o0nVar.nn = String.valueOf(n0Var.nmn());
            o0nVar.mn = n0Var.o000();
        }
        o0nVar.n0 = str5;
        o0nVar.o00 = z2 ? "1" : "0";
        o0nVar.o0o = z4 ? "1" : "0";
        o0nVar.o0m = z3 ? "1" : "0";
        o0nVar.o0n = str2;
        o0nVar.oo0 = str4;
        o(o0nVar);
    }

    public static void o(n0 n0Var, com.thinkup.core.oo.n0 n0Var2, String str, String str2, String str3, String str4, String str5) {
        o0n o0nVar = new o0n(null, str);
        o0nVar.f42235n = "1004695";
        o0nVar.o(n0Var);
        if (n0Var2 != null) {
            o0nVar.mn = n0Var2.o000();
        }
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o0nVar.o0n = str4;
        o0nVar.oo0 = str5;
        o(o0nVar);
    }

    public static void o(n0 n0Var, com.thinkup.core.oo.n0 n0Var2, String str, String str2, String str3, int i2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004696";
        o0nVar.o(n0Var);
        if (n0Var2 != null) {
            o0nVar.mn = n0Var2.o000();
        }
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o0nVar.o0n = String.valueOf(i2);
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, int i2, boolean z2) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004698";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        o0nVar.o0o = oooVar.mm();
        o0nVar.o0m = oooVar instanceof o00 ? ((o00) oooVar).mmn() : "";
        o0nVar.o0n = String.valueOf(oomVar.m);
        o0nVar.oo0 = String.valueOf(oomVar.mo);
        o0nVar.ooo = String.valueOf(i2);
        o0nVar.oom = String.valueOf(oomVar.n0);
        if (i2 != 5) {
            o0nVar.oon = z2 ? "1" : "2";
        }
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, boolean z2, int i2, int i3, long j, long j2) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004699";
        o0nVar.o(oomVar);
        o0nVar.o00 = z2 ? "2" : "1";
        o0nVar.o0o = String.valueOf(i2);
        o0nVar.o0m = String.valueOf(j);
        o0nVar.o0n = String.valueOf(j2);
        o0nVar.oo0 = String.valueOf(oomVar.m);
        o0nVar.ooo = String.valueOf(i3);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.oom = String.valueOf(o00Var.mmn());
            o0nVar.oon = String.valueOf(o00Var.mo());
        }
        o(o0nVar);
    }

    public static void o(oom oomVar, int i2, String str, JSONArray jSONArray, String str2, int i3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004700";
        o0nVar.o(oomVar);
        o0nVar.o00 = str;
        o0nVar.o0o = String.valueOf(i2);
        o0nVar.o0m = jSONArray != null ? jSONArray.toString() : "";
        o0nVar.o0n = str2;
        o0nVar.oo0 = String.valueOf(i3);
        o(o0nVar);
    }

    public static void o(String str, n0 n0Var, String str2, Object obj, String str3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004701";
        o0nVar.o(n0Var);
        o0nVar.oo = str;
        o0nVar.m0 = String.valueOf(n0Var.no0());
        o0nVar.nn = String.valueOf(n0Var.oomo());
        o0nVar.o00 = n0Var.oono();
        o0nVar.o0o = String.valueOf(n0Var.n0n());
        o0nVar.o0m = n0Var.mon();
        o0nVar.o0n = String.valueOf(n0Var.non());
        o0nVar.oo0 = str2;
        o0nVar.ooo = obj != null ? obj.toString() : "";
        if (!TextUtils.isEmpty(str3)) {
            o0nVar.oom = str3;
        }
        o(o0nVar);
    }

    public static void o(n0 n0Var, com.thinkup.core.oo.om omVar, String str, double d, String str2, double d2, String str3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004702";
        o0nVar.o(n0Var);
        o0nVar.o00 = n0Var.oono();
        o0nVar.o0o = omVar.o() == 1 ? "1" : "2";
        o0nVar.o0m = String.valueOf(omVar.m());
        o0nVar.o0n = String.valueOf(omVar.n());
        o0nVar.oo0 = String.valueOf(omVar.o0());
        o0nVar.ooo = String.valueOf(omVar.om());
        o0nVar.oom = String.valueOf(omVar.oo());
        o0nVar.oon = str;
        o0nVar.om0 = String.valueOf(d);
        o0nVar.omo = str2;
        o0nVar.omm = String.valueOf(d2);
        if (!TextUtils.isEmpty(str3)) {
            o0nVar.omn = str3;
        }
        o(o0nVar);
    }

    public static void o(n0 n0Var, String str, String str2, String str3, String str4, String str5) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004705";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = str4;
        o0nVar.o0n = str5;
        o0nVar.oo0 = str;
        o0nVar.ooo = str2;
        o0nVar.oom = str3;
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, int i2, String str) {
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004706";
        o0nVar.o(oomVar);
        o0nVar.o00 = String.valueOf(oomVar.mm);
        o0nVar.o0o = oomVar.oo;
        o0nVar.o0m = String.valueOf(oomVar.m);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o0n = o00Var.mmn();
            o0nVar.oo0 = o00Var.mo();
        }
        o0nVar.ooo = String.valueOf(i2);
        o0nVar.oom = str;
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, int i2, long j, long j2, long j3, long j4) {
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004707";
        o0nVar.o(oomVar);
        o0nVar.o00 = String.valueOf(oomVar.mm);
        o0nVar.o0o = oomVar.oo;
        o0nVar.o0m = String.valueOf(oomVar.m);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o0n = o00Var.mmn();
            o0nVar.oo0 = o00Var.mo();
        }
        o0nVar.ooo = String.valueOf(i2);
        o0nVar.oom = String.valueOf(j);
        o0nVar.oon = String.format("%.2f", Double.valueOf((j2 / 1024.0d) / 1024.0d));
        o0nVar.om0 = String.valueOf(j3);
        o0nVar.omo = String.format("%.2f", Double.valueOf((j4 / 1024.0d) / 1024.0d));
        o(o0nVar);
    }

    private static void o(n0 n0Var, String str, String str2, int i2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004709";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = n0Var.oono();
        o0nVar.o0n = str;
        o0nVar.oo0 = str2;
        o0nVar.ooo = String.valueOf(i2);
        o0nVar.oom = "1";
        o(o0nVar);
    }

    private static void o(n0 n0Var, String str, String str2, boolean z2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004710";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = str;
        o0nVar.o0n = str2;
        o0nVar.oo0 = z2 ? "1" : "2";
        o(o0nVar);
    }

    private static void o(String str, oom oomVar, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i2, int i3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004713";
        o0nVar.o0 = str;
        o0nVar.oo = str2;
        o0nVar.o(oomVar);
        o0nVar.o00 = str3;
        o0nVar.o0o = str4;
        o0nVar.o0m = str5;
        o0nVar.o0n = str6;
        o0nVar.oo0 = str7;
        o0nVar.ooo = String.valueOf(j);
        o0nVar.oom = String.valueOf(i2);
        o0nVar.oon = String.valueOf(i3);
        o(o0nVar);
    }

    public static void o(String str, String str2, o0mm o0mmVar, Double d, Double d2, com.thinkup.core.n.n.o oVar) {
        String strValueOf;
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004716";
        o0nVar.o(o0mmVar);
        o0nVar.o0 = str;
        o0nVar.oo = str2;
        o0nVar.o00 = String.valueOf(o0mmVar.nm());
        o0nVar.o0o = o0mmVar.m0o();
        String strO = "";
        o0nVar.o0m = d != null ? String.valueOf(d) : "";
        if (d2 == null) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(d2);
        }
        o0nVar.o0n = strValueOf;
        if (oVar != null) {
            strO = oVar.o();
        }
        o0nVar.oo0 = strO;
        o(o0nVar);
    }

    private static void o(oom oomVar, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004715";
        o0nVar.o(oomVar);
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o0nVar.o0n = str4;
        o0nVar.oo0 = String.valueOf(j);
        o0nVar.ooo = str5;
        o0nVar.oom = str6;
        o0nVar.oon = str7;
        o0nVar.om0 = str8;
        o0nVar.omo = str9;
        o0nVar.omm = str10;
        o(o0nVar);
    }

    private static void o(String str, int i2, int i3, int i4) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004717";
        o0nVar.o00 = str;
        o0nVar.o0o = String.valueOf(i2);
        o0nVar.o0m = String.valueOf(i3);
        o0nVar.o0n = String.valueOf(i4);
        o(o0nVar);
    }

    public static void o(n0 n0Var, String str, String str2, String str3) {
        o0n o0nVar = new o0n(null, str);
        o0nVar.f42235n = "1004718";
        o0nVar.o(n0Var);
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o(o0nVar);
    }

    private static void o(ooo oooVar, oom oomVar, int i2, int i3) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004719";
        o0nVar.o(oomVar);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o00 = o00Var.mmn();
            o0nVar.o0o = o00Var.mo();
        }
        o0nVar.o0m = "1";
        o0nVar.o0n = "1";
        o0nVar.oom = String.valueOf(oomVar.m);
        if (oooVar != null && oooVar.on() != null) {
            o0nVar.oon = oooVar.on().ooo();
        }
        o0nVar.om0 = String.valueOf(i2);
        o0nVar.omo = String.valueOf(i3);
        o(o0nVar);
    }

    private static void o(oom oomVar, int i2, ooo oooVar, long j, long j2) {
        o0n o0nVar = new o0n(String.valueOf(i2), null);
        o0nVar.f42235n = "1004721";
        o0nVar.o(oomVar);
        o0nVar.o00 = String.valueOf(j);
        o0nVar.o0o = String.valueOf(j2);
        if (oooVar != null) {
            if (!TextUtils.isEmpty(oooVar.on0())) {
                o0nVar.o0m = oooVar.on0();
            }
            o0nVar.o0n = oooVar.o0m();
            o0nVar.oo0 = oooVar.mo();
            if (oooVar instanceof o00) {
                o0nVar.ooo = ((o00) oooVar).mmn();
            }
        }
        o0nVar.oom = String.valueOf(i2);
        o(o0nVar);
    }

    public static void o(String str, com.thinkup.core.oo.n0 n0Var, int i2, int i3, int i4, TUAdRequest tUAdRequest) {
        o0n o0nVar = new o0n("4", null);
        o0nVar.f42235n = "1004722";
        o0nVar.oo = str;
        o0nVar.o(tUAdRequest);
        o0nVar.o(n0Var);
        if (n0Var != null) {
            o0nVar.mn = n0Var.o000();
            o0nVar.m0 = String.valueOf(n0Var.o0mn());
            o0nVar.nn = String.valueOf(n0Var.nmn());
        }
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = String.valueOf(i4);
        o0nVar.o0m = String.valueOf(i3);
        o(o0nVar);
    }

    public static void o(String str, String str2, String str3, double d, String str4, String str5, String str6) {
        o0n o0nVar = new o0n(str3, null);
        o0nVar.f42235n = "1004724";
        o0nVar.oo = str;
        o0nVar.o0 = str2;
        o0nVar.o00 = String.valueOf(System.currentTimeMillis());
        o0nVar.o0o = str3;
        o0nVar.o0m = String.valueOf(d);
        o0nVar.o0n = str4;
        o0nVar.oo0 = str5;
        o0nVar.ooo = str6;
        o(o0nVar);
    }

    public static void o(String str, String str2, String str3, int i2, long j, long j2, long j3, long j4, long j5) {
        o0n o0nVar = new o0n(null, "2");
        o0nVar.f42235n = "1004725";
        o0nVar.o00 = str;
        o0nVar.o0o = str3;
        o0nVar.o0m = str2;
        o0nVar.o0n = String.valueOf(i2);
        o0nVar.oo0 = String.valueOf(j3);
        o0nVar.ooo = String.valueOf(j4);
        o0nVar.oom = String.valueOf(j);
        o0nVar.oon = String.valueOf(j2);
        o0nVar.om0 = String.valueOf(j5);
        o(o0nVar);
    }

    private static void o(oom oomVar, String str, String str2, String str3, String str4, int i2) {
        o0n o0nVar = new o0n(null, "66");
        o0nVar.f42235n = "1004735";
        o0nVar.o(oomVar);
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o0nVar.o0n = str4;
        o0nVar.oo0 = String.valueOf(i2);
        o(o0nVar);
    }

    public static void o(String str, String str2) {
        boolean zIsEmpty = str.isEmpty();
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004729";
        o0nVar.o00 = Build.MANUFACTURER;
        o0nVar.o0o = !zIsEmpty ? "1" : "2";
        if (!zIsEmpty) {
            o0nVar.o0m = str;
        } else {
            o0nVar.o0n = str2;
        }
        o(o0nVar);
    }

    public static void o(final com.thinkup.core.common.mm.oo ooVar, final boolean z2, final n0 n0Var, final long j, final boolean z3, final String str, final TUBaseAdAdapter tUBaseAdAdapter) {
        com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.5
            final /* synthetic */ int m = 1;

            @Override // java.lang.Runnable
            public final void run() {
                String string;
                Map<String, Object> networkInfoMap;
                o0n o0nVar = new o0n(n0Var.oono(), "2");
                o0nVar.f42235n = "1004730";
                o0nVar.o(n0Var);
                o0nVar.o00 = n0Var.mon();
                o0nVar.o0o = String.valueOf(n0Var.nm0());
                o0nVar.o0m = String.valueOf(n0Var.n0n());
                o0nVar.o0n = String.valueOf(this.m);
                o0nVar.oo0 = String.valueOf(j);
                o0nVar.ooo = z3 ? "1" : "2";
                o0nVar.oom = str;
                TUBaseAdAdapter tUBaseAdAdapter2 = tUBaseAdAdapter;
                if (tUBaseAdAdapter2 == null || (networkInfoMap = tUBaseAdAdapter2.getNetworkInfoMap()) == null) {
                    string = "";
                } else {
                    try {
                        string = new JSONObject(networkInfoMap).toString();
                    } catch (Throwable unused) {
                        string = "";
                    }
                }
                o0nVar.oon = string;
                o0nVar.om0 = z2 ? "1" : "2";
                com.thinkup.core.common.mm.oo ooVar2 = ooVar;
                if (ooVar2 instanceof com.thinkup.core.common.o00.oo) {
                    com.thinkup.core.common.o00.oo ooVar3 = (com.thinkup.core.common.o00.oo) ooVar2;
                    o0nVar.omo = String.valueOf(ooVar3.o());
                    String strM = ooVar3.m();
                    if (!TextUtils.isEmpty(strM)) {
                        o0nVar.omm = strM;
                    }
                }
                noo nooVarO0om = n0Var.o0om();
                if (nooVarO0om != null) {
                    if (!TextUtils.isEmpty(nooVarO0om.m())) {
                        o0nVar.omn = nooVarO0om.m();
                    }
                    if (!TextUtils.isEmpty(nooVarO0om.n())) {
                        o0nVar.on0 = nooVarO0om.n();
                    }
                }
                oo.o(o0nVar);
            }
        }, 13);
    }

    private static void o(String str, String str2, oom oomVar, String str3, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z2, boolean z3, String str18, String str19, String str20) {
        o0n o0nVar = new o0n(null, "66");
        o0nVar.f42235n = "1004731";
        o0nVar.o0 = str;
        o0nVar.oo = str2;
        o0nVar.o(oomVar);
        o0nVar.o00 = str3;
        o0nVar.o0o = str4;
        o0nVar.o0m = str6;
        o0nVar.o0n = str7;
        o0nVar.oo0 = str8;
        o0nVar.ooo = str9;
        o0nVar.oom = str10;
        o0nVar.oon = str11;
        o0nVar.om0 = str12;
        o0nVar.omo = str5;
        o0nVar.omm = String.valueOf(i2);
        o0nVar.omn = str13;
        o0nVar.on0 = str14;
        o0nVar.ono = str15;
        o0nVar.onm = str16;
        o0nVar.onn = str17;
        o0nVar.m00 = z2 ? "2" : "1";
        o0nVar.m0o = z3 ? "1" : "2";
        o0nVar.m0m = str18;
        o0nVar.m0n = str19;
        o0nVar.mo0 = str20;
        o(o0nVar);
    }

    public static void o(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004738";
        o0nVar.o00 = str;
        o0nVar.o0o = str2;
        o0nVar.o0m = str3;
        o0nVar.o0n = str4;
        o0nVar.oo0 = str5;
        o0nVar.ooo = str6;
        o0nVar.oom = String.valueOf(SystemClock.elapsedRealtime() - j);
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, long j, boolean z2, long j2, int i2) {
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), "66");
        o0nVar.f42235n = "1004733";
        o0nVar.o(oomVar);
        oon oonVar = oomVar.oo0;
        if (oonVar != null) {
            o0nVar.o00 = oonVar.mmn() == 2 ? "1" : "2";
            o0nVar.ooo = String.valueOf(oomVar.oo0.mn0());
            o0nVar.oom = String.valueOf(oomVar.oo0.mno());
            o0nVar.om0 = String.valueOf(oomVar.oo0.mnm());
            o0nVar.omo = String.valueOf(oomVar.oo0.m0());
        }
        o0nVar.o0o = String.valueOf(j);
        o0nVar.o0m = String.valueOf(System.currentTimeMillis() - j);
        if (oooVar instanceof o00) {
            o0nVar.o0n = ((o00) oooVar).mmn();
            o0nVar.oo0 = oooVar.mo();
        }
        o0nVar.oon = z2 ? "1" : "2";
        o0nVar.omm = String.valueOf(j2);
        o0nVar.omn = String.valueOf(i2);
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), "66");
        o0nVar.f42235n = "1004736";
        o0nVar.o(oomVar);
        o0nVar.o00 = String.valueOf(oomVar.m);
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
            o0nVar.o0m = oooVar.mo();
        }
        o0nVar.o0n = 1 == ((nn0) oooVar).mnn() ? "2" : "1";
        oon oonVar = oomVar.oo0;
        if (oonVar != null) {
            o0nVar.oo0 = oonVar.oom() == 1 ? "1" : "2";
        }
        o0nVar.ooo = i2 == 1 ? "2" : "1";
        o0nVar.oom = i3 == 1 ? "2" : "1";
        o0nVar.oon = String.valueOf(i4);
        o0nVar.om0 = z2 ? "1" : "2";
        o0nVar.omo = z3 ? "1" : "2";
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, String str) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), "66");
        o0nVar.f42235n = "1004737";
        o0nVar.o(oomVar);
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o00 = String.valueOf(o00Var.mmn());
            o0nVar.o0o = String.valueOf(o00Var.mo());
        }
        o0nVar.o0m = oooVar.m0n();
        o0nVar.o0n = oooVar.mo0();
        o0nVar.oo0 = oooVar.moo();
        o0nVar.ooo = str;
        o0nVar.oom = String.valueOf(oomVar.m);
        o(o0nVar);
    }

    public static void o(long j, long j2, long j3) {
        o0n o0nVar = new o0n("", "");
        o0nVar.f42235n = "1004742";
        o0nVar.o00 = String.valueOf(j);
        o0nVar.o0o = String.valueOf(j2);
        o0nVar.o0m = String.valueOf(j3);
        o(o0nVar);
    }

    public static void o(n0 n0Var, String str, boolean z2) {
        if (n0Var == null) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
        o0nVar.f42235n = "1004744";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(n0Var.n0n());
        o0nVar.o0o = n0Var.mon();
        o0nVar.o0m = String.valueOf(n0Var.oono());
        o0nVar.o0n = z2 ? "1" : "2";
        o0nVar.oo0 = str;
        o0nVar.ooo = com.thinkup.core.common.n.o0n.m().n0m() ? "1" : "2";
        o0nVar.oom = com.thinkup.core.common.n.m.n().o();
        o(o0nVar);
    }

    public static void o(int i2) {
        o0n o0nVar = new o0n("", "");
        o0nVar.f42235n = "1004739";
        o0nVar.o00 = String.valueOf(i2);
        o(o0nVar);
    }

    public static void o(String str, n0 n0Var, boolean z2, String str2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004740";
        o0nVar.o(n0Var);
        o0nVar.o00 = str;
        o0nVar.o0m = z2 ? "1" : "2";
        if (n0Var != null) {
            o0nVar.o0o = String.valueOf(n0Var.n0n());
            o0nVar.o0n = String.valueOf(n0Var.nm0());
            o0nVar.oo0 = n0Var.mon();
        }
        o0nVar.ooo = str2;
        o(o0nVar);
    }

    public static void o(n0 n0Var, String str) {
        if (n0Var != null) {
            o0n o0nVar = new o0n(n0Var.oono(), String.valueOf(n0Var.n0n()));
            o0nVar.f42235n = "1004741";
            o0nVar.o(n0Var);
            o0nVar.o00 = n0Var.mon();
            o0nVar.o0o = "2";
            o0nVar.o0m = String.valueOf(n0Var.n0n());
            o0nVar.o0n = n0Var.oono();
            o0nVar.oo0 = String.valueOf(n0Var.nm0());
            o0nVar.ooo = str;
            o(o0nVar);
        }
    }

    public static void o(ooo oooVar, oom oomVar, int i2, boolean z2, int i3, String str) {
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004748";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        if (TextUtils.isEmpty(str)) {
            o0nVar.o0m = oooVar.o0m();
        } else {
            o0nVar.o0m = str;
        }
        o0nVar.o0n = oooVar.o0n();
        o0nVar.oo0 = String.valueOf(i2);
        if (i2 != 1 && z2) {
            o0nVar.ooo = z2 ? "1" : "2";
        }
        if (i2 == 3 && i3 > 0) {
            o0nVar.oom = String.valueOf(i3);
        }
        o(o0nVar);
    }

    public static void o(ooo oooVar, oom oomVar, int i2) {
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004749";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        o0nVar.o0m = oooVar.o0m();
        o0nVar.o0n = String.valueOf(i2);
        o(o0nVar);
    }

    public static void o(com.thinkup.core.common.on.om omVar, n0 n0Var) {
        if (omVar == null || n0Var == null) {
            return;
        }
        o0n o0nVar = new o0n(n0Var.oono(), null);
        o0nVar.f42235n = "1004753";
        o0nVar.o(n0Var);
        o0nVar.o00 = String.valueOf(omVar.mo());
        o0nVar.o0o = String.valueOf(omVar.o());
        o0nVar.o0m = String.valueOf(omVar.m());
        o0nVar.o0n = String.valueOf(omVar.n());
        o0nVar.oo0 = String.valueOf(omVar.o0());
        o0nVar.ooo = String.valueOf(omVar.oo());
        o0nVar.oom = String.valueOf(omVar.om());
        o0nVar.oon = String.valueOf(omVar.on());
        o0nVar.om0 = String.valueOf(omVar.m0());
        o0nVar.omo = String.valueOf(n0Var.o00n());
        omVar.m0();
        omVar.o();
        o(o0nVar);
    }

    private static void o(ooo oooVar, oom oomVar, boolean z2, boolean z3) {
        String string;
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004751";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        oon oonVar = oomVar.oo0;
        if (oonVar != null) {
            o0nVar.o0m = String.valueOf(oonVar.mnn());
            o0nVar.ooo = String.valueOf(oomVar.oo0.m00());
            if (oomVar.oo0.m00() == 2) {
                string = String.valueOf(oomVar.oo0.m0n());
            } else if (oomVar.oo0.m0m() != null) {
                string = oomVar.oo0.m0m().toString();
            } else {
                string = "";
            }
            o0nVar.oom = string;
            o0nVar.oon = String.valueOf(oomVar.oo0.n00());
        }
        o0nVar.o0n = z2 ? "1" : "2";
        o0nVar.oo0 = z3 ? "1" : "2";
        o(o0nVar);
    }

    private static void o(ooo oooVar, oom oomVar, String str, String str2, List<Boolean> list, int i2, boolean z2) {
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004756";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        o0nVar.o0m = str;
        o0nVar.o0n = str2;
        o0nVar.oo0 = String.valueOf(oomVar.m);
        o0nVar.oom = String.valueOf(i2);
        if (list != null && list.size() == 5) {
            Boolean bool = list.get(0);
            Boolean bool2 = list.get(1);
            Boolean bool3 = list.get(2);
            Boolean bool4 = list.get(3);
            Boolean bool5 = list.get(4);
            if (bool != null) {
                o0nVar.oon = bool.booleanValue() ? "1" : "2";
            }
            if (bool2 != null) {
                o0nVar.om0 = bool2.booleanValue() ? "1" : "2";
            }
            if (bool3 != null) {
                o0nVar.omo = bool3.booleanValue() ? "1" : "2";
            }
            if (bool4 != null) {
                o0nVar.omm = bool4.booleanValue() ? "1" : "2";
            }
            if (bool5 != null) {
                o0nVar.omn = bool5.booleanValue() ? "1" : "2";
            }
        }
        o0nVar.on0 = z2 ? "1" : "2";
        o(o0nVar);
    }

    private static void o(int i2, int i3, int i4, long j) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004758";
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = String.valueOf(i3);
        o0nVar.o0m = String.valueOf(i4);
        o0nVar.o0n = String.valueOf(j);
        o(o0nVar);
    }

    public static void o(n0 n0Var, int i2) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004759";
        o0nVar.o(n0Var);
        o0nVar.o00 = i2 == 7 ? "1" : "2";
        o(o0nVar);
    }

    private static void o(oom oomVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o0n o0nVarO = o0n.o(str);
        o0nVarO.o(oomVar);
        o(o0nVarO);
    }

    private static void o(ooo oooVar, oom oomVar, int i2, long j, String str, long j2, long j3, long j4, long j5, long j6) {
        String string;
        String string2;
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004762";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        o0nVar.o0m = String.valueOf(i2);
        o0nVar.o0n = String.valueOf(j);
        o0nVar.oo0 = oooVar.mom();
        String string3 = "";
        if (oooVar.on() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(oooVar.on().noo());
            string = sb.toString();
        } else {
            string = "";
        }
        o0nVar.ooo = string;
        if (oooVar.on() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oooVar.on().n0n());
            string2 = sb2.toString();
        } else {
            string2 = "";
        }
        o0nVar.oom = string2;
        if (oooVar.on() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(oooVar.on().no0());
            string3 = sb3.toString();
        }
        o0nVar.oon = string3;
        o0nVar.om0 = str;
        o0nVar.omo = String.valueOf(j2);
        o0nVar.omm = String.valueOf(j3);
        o0nVar.omn = String.valueOf(j4);
        o0nVar.on0 = String.valueOf(j5);
        o0nVar.ono = String.valueOf(j6);
        o(o0nVar);
    }

    private static void o(int i2, String str, String str2) {
        o0n o0nVar = new o0n("", "");
        o0nVar.f42235n = "1004765";
        o0nVar.o00 = String.valueOf(i2);
        o0nVar.o0o = str;
        o0nVar.o0m = str2;
        o(o0nVar);
    }

    public static void o(com.thinkup.core.common.n0.m.o oVar) {
        if (oVar == null) {
            return;
        }
        o0n o0nVar = new o0n("", "");
        o0nVar.f42235n = "1004766";
        o0nVar.o00 = oVar.o();
        o0nVar.o0o = String.valueOf(oVar.m());
        o0nVar.o0m = String.valueOf(oVar.n());
        o0nVar.o0n = String.valueOf(oVar.om());
        o0nVar.oo0 = String.valueOf(oVar.on());
        o0nVar.ooo = String.valueOf(oVar.o0());
        o0nVar.oom = String.valueOf(oVar.oo());
        o0nVar.oon = oVar.mo();
        o0nVar.om0 = String.valueOf(oVar.mm());
        o0nVar.omo = oVar.n0();
        o0nVar.omm = oVar.no();
        o0nVar.omn = oVar.nm();
        o0nVar.ono = String.valueOf(oVar.o0o());
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        if (contextOn != null) {
            o0nVar.on0 = com.thinkup.core.common.ooo.o00.o(contextOn) ? "1" : "0";
        }
        o(o0nVar);
    }

    public static void o(int i2, int i3, String str, long j) {
        o0n o0nVar = new o0n(null, null);
        o0nVar.f42235n = "1004769";
        try {
            o0nVar.o00 = Build.MANUFACTURER;
        } catch (Throwable unused) {
        }
        o0nVar.o0o = String.valueOf(i2);
        o0nVar.o0m = String.valueOf(i3);
        if (!TextUtils.isEmpty(str)) {
            o0nVar.o0n = str;
        }
        o0nVar.oo0 = String.valueOf(j);
        o(o0nVar);
    }

    public static void o(com.thinkup.core.common.o0.m mVar) {
        if (mVar != null) {
            o0n o0nVar = new o0n("", "");
            o0nVar.f42235n = "1004773";
            o0nVar.o00 = String.valueOf(mVar.o());
            o0nVar.o0o = mVar.n();
            o(o0nVar);
        }
    }

    public static void o(final o0n o0nVar) {
        if (o0nVar == null || com.thinkup.core.common.n.o0n.m().on() == null) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.6
            @Override // java.lang.Runnable
            public final void run() {
                boolean zO;
                try {
                    if (TextUtils.isEmpty(o0nVar.om)) {
                        o0nVar.om = com.thinkup.core.common.n.o0n.m().o0m();
                    }
                    if (!TextUtils.isEmpty(o0nVar.oo)) {
                        o0nVar.on = com.thinkup.core.common.n.o0n.m().on(o0nVar.oo);
                        oo.n(o0nVar);
                        if (TUAdxSetting.getInstance().isAdxNetworkMode(o0nVar.oo)) {
                            o0nVar.no0 = 1;
                        }
                    }
                    o0nVar.mm = String.valueOf(System.currentTimeMillis());
                    com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
                    if (mVarM == null) {
                        zO = false;
                    } else {
                        if (oo.n(mVarM, o0nVar)) {
                            return;
                        }
                        if (oo.m(mVarM, o0nVar)) {
                            om.o(com.thinkup.core.common.n.o0n.m().on()).o(o0nVar, true);
                            return;
                        }
                        zO = oo.o(o0nVar, mVarM);
                    }
                    o0.o().o(o0nVar, zO);
                } catch (Throwable unused) {
                }
            }
        }, 8);
    }

    public static void o(final String str) {
        o(new Runnable() { // from class: com.thinkup.core.common.oo0.oo.7
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                o0n o0nVarO = o0n.o(str);
                if (TextUtils.isEmpty(o0nVarO.f42235n)) {
                    return;
                }
                oo.o(o0nVarO);
            }
        });
    }

    private static void o(Runnable runnable) {
        com.thinkup.core.common.ooo.m.m.o().m(runnable, 13);
    }

    private static String o(AdError adError, int i2, String str, int i3) {
        com.thinkup.core.common.oom.o.m.n nVar;
        com.thinkup.core.common.on.m0o m0oVarO;
        if (i3 == 0 && (nVar = (com.thinkup.core.common.oom.o.m.n) com.thinkup.core.common.oom.o.o.o0.o(str, com.thinkup.core.common.oom.o.m.n.class)) != null && adError != null && (m0oVarO = nVar.o()) != null && m0oVarO.oo() != null) {
            return com.thinkup.core.common.oom.o.o0.o.o(adError.getPlatformCode() + "," + adError.getPlatformMSG(), m0oVarO.oo().get(Integer.valueOf(i2)));
        }
        return "";
    }

    private static void o(oom oomVar, ooo oooVar, String str, String str2, int i2, int i3) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004650";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        o0nVar.o0o = String.valueOf(oooVar.o());
        o0nVar.o0m = str;
        o0nVar.o0n = str2;
        o0nVar.oo0 = String.valueOf(i2);
        if (oooVar instanceof o00) {
            o0nVar.oom = String.valueOf(((o00) oooVar).mmn());
        }
        o0nVar.oon = String.valueOf(oomVar.m);
        if (i3 > 0) {
            o0nVar.om0 = String.valueOf(i3);
        }
        o0nVar.omo = "";
        o(o0nVar);
    }

    private static void o(oom oomVar, ooo oooVar, String str, String str2) {
        if (oomVar == null || oooVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), "66");
        o0nVar.f42235n = "1004743";
        o0nVar.o0 = oomVar.om;
        o0nVar.oo = oomVar.o;
        o0nVar.o(oomVar);
        o0nVar.o00 = str;
        if (oooVar instanceof o00) {
            o00 o00Var = (o00) oooVar;
            o0nVar.o0o = String.valueOf(o00Var.mmn());
            o0nVar.o0m = String.valueOf(o00Var.mo());
        }
        o0nVar.o0n = String.valueOf(oomVar.m);
        o0nVar.oo0 = str2;
        o0nVar.ooo = "1";
        o0nVar.oom = "";
        o0nVar.oon = "";
        o(o0nVar);
    }

    private static void o(ooo oooVar, oom oomVar, long j, long j2) {
        String string;
        String string2;
        if (oooVar == null || oomVar == null) {
            return;
        }
        o0n o0nVar = new o0n(String.valueOf(oomVar.m), String.valueOf(oomVar.mm));
        o0nVar.f42235n = "1004761";
        o0nVar.o(oomVar);
        o0nVar.o00 = oooVar.mo();
        if (oooVar instanceof o00) {
            o0nVar.o0o = ((o00) oooVar).mmn();
        }
        o0nVar.o0m = "1";
        o0nVar.o0n = String.valueOf(j);
        o0nVar.oo0 = oooVar.mom();
        String string3 = "";
        if (oooVar.on() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(oooVar.on().noo());
            string = sb.toString();
        } else {
            string = "";
        }
        o0nVar.ooo = string;
        if (oooVar.on() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oooVar.on().n0n());
            string2 = sb2.toString();
        } else {
            string2 = "";
        }
        o0nVar.oom = string2;
        if (oooVar.on() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(oooVar.on().no0());
            string3 = sb3.toString();
        }
        o0nVar.oon = string3;
        if (j2 > 0) {
            o0nVar.omm = String.valueOf(j2);
        }
        o(o0nVar);
    }

    public static /* synthetic */ boolean o(o0n o0nVar, com.thinkup.core.oo.m mVar) {
        Map<String, String> mapOm;
        if ("1004742".equals(o0nVar.f42235n)) {
            return true;
        }
        if (!TextUtils.isEmpty(o0nVar.f42235n) && !TextUtils.isEmpty(o0nVar.mno) && !TextUtils.isEmpty(o0nVar.mn0) && (mapOm = mVar.om(o0nVar.f42235n)) != null) {
            if (mapOm.containsKey("0")) {
                String str = mapOm.get("0");
                return !TextUtils.isEmpty(str) && str.contains(o0nVar.mn0);
            }
            if (mapOm.containsKey(o0nVar.mno)) {
                String str2 = mapOm.get(o0nVar.mno);
                if (!TextUtils.isEmpty(str2) && str2.contains(o0nVar.mn0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
