package com.smartdigimkt.q3;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.b8.k;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v3.m;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.l;
import com.smartdigimkt.w6.n;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static void a(int i2, l lVar, com.smartdigimkt.v3.l lVar2) {
        n nVarR0 = lVar.R0();
        if (nVarR0 == null) {
            return;
        }
        Map<String, Object> mapF = h.f(nVarR0.u());
        a(i2, lVar, nVarR0, mapF, lVar2);
        a(i2, lVar2, lVar, nVarR0, mapF);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("__SLD__") || str.contains("__DOWN_X__") || str.contains("__RE_DOWN_X__") || str.contains("__DOWN_Y__") || str.contains("__RE_DOWN_Y__") || str.contains("__UP_X__") || str.contains("__RE_UP_X__") || str.contains("__UP_Y__") || str.contains("__RE_UP_Y__") || str.contains("__DOWN_X_DT__") || str.contains("__RE_DOWN_X_DT__") || str.contains("__DOWN_Y_DT__") || str.contains("__RE_DOWN_Y_DT__") || str.contains("__UP_X_DT__") || str.contains("__RE_UP_X_DT__") || str.contains("__UP_Y_DT__") || str.contains("__RE_UP_Y_DT__");
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("__C_SLD__") || str.contains("__C_DOWN_X__") || str.contains("__RE_C_DOWN_X__") || str.contains("__C_DOWN_Y__") || str.contains("__RE_C_DOWN_Y__") || str.contains("__C_UP_X__") || str.contains("__RE_C_UP_X__") || str.contains("__C_UP_Y__") || str.contains("__RE_C_UP_Y__") || str.contains("__C_DOWN_X_DT__") || str.contains("__RE_C_DOWN_X_DT__") || str.contains("__C_DOWN_Y_DT__") || str.contains("__RE_C_DOWN_Y_DT__") || str.contains("__C_UP_X_DT__") || str.contains("__RE_C_UP_X_DT__") || str.contains("__C_UP_Y_DT__") || str.contains("__RE_C_UP_Y_DT__");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    private static void a(int i2, l lVar, n nVar, Map<String, Object> map, com.smartdigimkt.v3.l lVar2) {
        String[] strArrQ0;
        try {
            switch (i2) {
                case 1:
                    strArrQ0 = nVar.q0();
                    break;
                case 2:
                    strArrQ0 = nVar.k0();
                    break;
                case 3:
                    strArrQ0 = nVar.l0();
                    break;
                case 4:
                    strArrQ0 = nVar.m0();
                    break;
                case 5:
                    strArrQ0 = nVar.j0();
                    break;
                case 6:
                    strArrQ0 = nVar.o();
                    break;
                case 7:
                    strArrQ0 = nVar.n();
                    break;
                case 8:
                    strArrQ0 = nVar.p();
                    break;
                case 9:
                    strArrQ0 = nVar.i();
                    break;
                case 10:
                    strArrQ0 = nVar.t();
                    break;
                case 11:
                    strArrQ0 = nVar.h0();
                    break;
                case 12:
                    strArrQ0 = nVar.g0();
                    break;
                case 13:
                    strArrQ0 = nVar.r0();
                    break;
                case 14:
                    strArrQ0 = nVar.d0();
                    break;
                case 15:
                    strArrQ0 = nVar.o0();
                    break;
                case 16:
                    strArrQ0 = nVar.p0();
                    break;
                case 17:
                    strArrQ0 = nVar.i0();
                    break;
                case 18:
                    strArrQ0 = nVar.c();
                    break;
                case 19:
                    strArrQ0 = nVar.b();
                    break;
                case 20:
                    strArrQ0 = nVar.e();
                    break;
                case 21:
                    strArrQ0 = nVar.d();
                    break;
                case 22:
                default:
                    strArrQ0 = null;
                    break;
                case 23:
                    strArrQ0 = nVar.k();
                    break;
                case 24:
                    strArrQ0 = nVar.l();
                    break;
                case 25:
                    strArrQ0 = nVar.f();
                    break;
                case 26:
                    strArrQ0 = nVar.g();
                    break;
                case 27:
                    strArrQ0 = nVar.h();
                    break;
                case 28:
                    strArrQ0 = nVar.j();
                    break;
                case 29:
                    strArrQ0 = nVar.m();
                    break;
                case 30:
                    strArrQ0 = nVar.f0();
                    break;
                case 31:
                    strArrQ0 = nVar.v();
                    break;
                case 32:
                    m mVar = lVar2.j;
                    Map<Integer, String[]> mapE0 = nVar.e0();
                    if (mVar == null || mapE0 == null) {
                        strArrQ0 = null;
                    } else {
                        strArrQ0 = mapE0.get(Integer.valueOf(mVar.f39149i));
                    }
                    break;
                case 33:
                    strArrQ0 = nVar.r();
                    break;
                case 34:
                    strArrQ0 = nVar.q();
                    break;
                case 35:
                    strArrQ0 = nVar.n0();
                    break;
                case 36:
                    strArrQ0 = nVar.s();
                    break;
            }
            if (strArrQ0 != null) {
                boolean zB = (i2 == 8 || i2 == 9) ? lVar.i().b() : false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                boolean zA = a(i2, lVar2);
                for (String str : strArrQ0) {
                    if (!TextUtils.isEmpty(str) && !a(str, i2, lVar2)) {
                        if (zA) {
                            arrayList.add(str);
                        }
                        k kVar = new k(i2, a(str, lVar2, jCurrentTimeMillis, lVar), lVar, map);
                        kVar.a(zB);
                        kVar.a(0, (com.smartdigimkt.w7.c) null);
                    } else if (!TextUtils.isEmpty(str) && zA) {
                        arrayList2.add(str);
                    }
                }
                if (zA) {
                    com.smartdigimkt.i7.d.a(lVar, arrayList, arrayList2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean a(String str, int i2, com.smartdigimkt.v3.l lVar) {
        if (a(i2, lVar)) {
            return b(str) || c(str);
        }
        return false;
    }

    private static boolean a(int i2, com.smartdigimkt.v3.l lVar) {
        com.smartdigimkt.v3.b bVar;
        return i2 == 9 && ((lVar == null || (bVar = lVar.k) == null) ? 0 : bVar.f39079c) == 1001;
    }

    private static void a(int i2, com.smartdigimkt.v3.l lVar, l lVar2, n nVar, Map<String, Object> map) {
        String strB0;
        switch (i2) {
            case 1:
                strB0 = nVar.b0();
                break;
            case 2:
                strB0 = nVar.V();
                break;
            case 3:
                strB0 = nVar.W();
                break;
            case 4:
                strB0 = nVar.X();
                break;
            case 5:
                strB0 = nVar.U();
                break;
            case 6:
                strB0 = nVar.J();
                break;
            case 7:
                strB0 = nVar.I();
                break;
            case 8:
                strB0 = nVar.K();
                break;
            case 9:
                strB0 = nVar.D();
                break;
            case 10:
                strB0 = nVar.N();
                break;
            case 11:
                strB0 = nVar.S();
                break;
            case 12:
                strB0 = nVar.R();
                break;
            case 13:
                strB0 = nVar.c0();
                break;
            case 14:
                strB0 = nVar.P();
                break;
            case 15:
                strB0 = nVar.Z();
                break;
            case 16:
                strB0 = nVar.a0();
                break;
            case 17:
                strB0 = nVar.T();
                break;
            case 18:
                strB0 = nVar.x();
                break;
            case 19:
                strB0 = nVar.w();
                break;
            case 20:
                strB0 = nVar.z();
                break;
            case 21:
                strB0 = nVar.y();
                break;
            case 22:
            case 32:
            default:
                strB0 = "";
                break;
            case 23:
                strB0 = nVar.F();
                break;
            case 24:
                strB0 = nVar.G();
                break;
            case 25:
                strB0 = nVar.A();
                break;
            case 26:
                strB0 = nVar.B();
                break;
            case 27:
                strB0 = nVar.C();
                break;
            case 28:
                strB0 = nVar.E();
                break;
            case 29:
                strB0 = nVar.H();
                break;
            case 30:
                strB0 = nVar.Q();
                break;
            case 31:
                strB0 = nVar.O();
                break;
            case 33:
                strB0 = nVar.M();
                break;
            case 34:
                strB0 = nVar.L();
                break;
            case 35:
                strB0 = nVar.Y();
                break;
        }
        if (a(strB0)) {
            return;
        }
        com.smartdigimkt.b8.l lVar3 = new com.smartdigimkt.b8.l(i2, lVar2, strB0, map);
        lVar3.a(lVar.d);
        lVar3.a(0, (com.smartdigimkt.w7.c) null);
    }

    public static String a(String str, com.smartdigimkt.v3.l lVar, long j, f fVar) {
        return a(str, lVar, j, fVar, false);
    }

    public static String a(String str, com.smartdigimkt.v3.l lVar, long j, f fVar, boolean z2) {
        String strI;
        String strI2;
        String strI3;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (lVar.f39137i != null) {
            str = a(str, lVar, fVar, z2);
        }
        m mVar = lVar.j;
        if (mVar != null) {
            str = a(str, mVar);
        }
        com.smartdigimkt.v3.b bVar = lVar.k;
        if (bVar != null) {
            str = a(str, bVar);
        }
        Map<String, Object> map = lVar.r;
        if (map != null) {
            str = a(str, map);
        }
        long j2 = j / 1000;
        if (lVar.f39135e == 0) {
            strI = "__REQ_WIDTH__";
        } else {
            strI = android.support.v4.media.a.i(lVar.f39135e, "", new StringBuilder());
        }
        String strReplaceAll = str.replaceAll("\\{__REQ_WIDTH__\\}", strI);
        if (lVar.f == 0) {
            strI2 = "__REQ_HEIGHT__";
        } else {
            strI2 = android.support.v4.media.a.i(lVar.f, "", new StringBuilder());
        }
        String strL = com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), lVar.o, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), lVar.f39139n, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), lVar.f39136h, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), lVar.g, "", strReplaceAll.replaceAll("\\{__REQ_HEIGHT__\\}", strI2), "__WIDTH__"), "__HEIGHT__").replaceAll("\\{__PLAY_SEC__\\}", "0"), "__S_SCREEN_X__"), "__S_SCREEN_Y__");
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK != null) {
            strL = strL.replaceAll("__WIDTH_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, lVar.g, new StringBuilder(), "")).replaceAll("__HEIGHT_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, lVar.f39136h, new StringBuilder(), "")).replaceAll("__S_SCREEN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, lVar.f39139n, new StringBuilder(), "")).replaceAll("__S_SCREEN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, lVar.o, new StringBuilder(), ""));
        }
        if (lVar.f39137i == null) {
            strL = strL.replaceAll("__TS__", j2 + "").replaceAll("__TS_MSEC__", j + "").replaceAll("__END_TS__", j2 + "").replaceAll("__END_TS_MSEC__", j + "");
        }
        long jCurrentTimeMillis = lVar.q;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 < 500) {
            jCurrentTimeMillis2 = new Random().nextInt(500) + 500;
        }
        String strReplaceAll2 = strL.replaceAll("__SHOW_T__", jCurrentTimeMillis2 + "");
        int i2 = lVar.f39140p;
        if (i2 <= 0 || i2 > 100) {
            strI3 = "__M_SHOW_RATIO__";
        } else {
            strI3 = android.support.v4.media.a.i(lVar.f39140p, "", new StringBuilder());
        }
        return strReplaceAll2.replaceAll("__M_SHOW_RATIO__", strI3).replaceAll("__DENSITY__", com.smartdigimkt.n8.c.v(com.smartdigimkt.m6.b.p().k())).replaceAll("\\{", "").replaceAll("\\}", "");
    }

    private static String a(String str, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                str = str.replace(entry.getKey(), entry.getValue().toString());
            } catch (Throwable th) {
                th.getMessage();
                th.printStackTrace();
            }
        }
        return str;
    }

    private static String a(String str, m mVar) {
        return com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), mVar.m, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), mVar.f39150l, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), mVar.k, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), mVar.j, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), mVar.f39147e, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), mVar.d, "", str.replaceAll("\\{__VIDEO_TIME__\\}", android.support.v4.media.a.j(mVar.f39144a, "", new StringBuilder())).replaceAll("\\{__BEGIN_TIME__\\}", android.support.v4.media.a.j(mVar.f39145b, "", new StringBuilder())).replaceAll("\\{__END_TIME__\\}", android.support.v4.media.a.j(mVar.f39146c, "", new StringBuilder())), "\\{__PLAY_FIRST_FRAME__\\}"), "\\{__PLAY_LAST_FRAME__\\}"), "\\{__SCENE__\\}"), "\\{__TYPE__\\}"), "\\{__BEHAVIOR__\\}"), "\\{__STATUS__\\}").replaceAll("__TS__", android.support.v4.media.a.j(mVar.f / 1000, "", new StringBuilder())).replaceAll("__TS_MSEC__", android.support.v4.media.a.j(mVar.f, "", new StringBuilder())).replaceAll("__END_TS__", android.support.v4.media.a.j(mVar.g / 1000, "", new StringBuilder())).replaceAll("__END_TS_MSEC__", android.support.v4.media.a.j(mVar.g, "", new StringBuilder())).replaceAll("\\{__PLAY_SEC__\\}", android.support.v4.media.a.j(mVar.f39148h / 1000, "", new StringBuilder())).replaceAll("\\{__PLAY_MSEC__\\}", android.support.v4.media.a.j(mVar.f39148h, "", new StringBuilder()));
    }

    private static String a(String str, com.smartdigimkt.v3.b bVar) {
        String str2 = bVar.f39077a;
        if (str2 == null) {
            str2 = "";
        }
        String strReplaceAll = str.replaceAll("\\{__CLICK_ID__\\}", str2);
        int i2 = bVar.f39078b;
        return i2 > 0 ? str.replaceAll("__DP_APP_INSTALL__", String.valueOf(i2)) : strReplaceAll;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0893  */
    /* JADX WARN: Code duplicated, block: B:110:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0902  */
    /* JADX WARN: Code duplicated, block: B:118:0x0910  */
    /* JADX WARN: Code duplicated, block: B:121:0x0921  */
    /* JADX WARN: Code duplicated, block: B:123:0x0937  */
    /* JADX WARN: Code duplicated, block: B:64:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0596  */
    /* JADX WARN: Code duplicated, block: B:68:0x059e  */
    /* JADX WARN: Code duplicated, block: B:69:0x063f  */
    /* JADX WARN: Code duplicated, block: B:71:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0764  */
    /* JADX WARN: Code duplicated, block: B:78:0x076f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0776  */
    /* JADX WARN: Code duplicated, block: B:82:0x0784  */
    /* JADX WARN: Code duplicated, block: B:83:0x0787  */
    /* JADX WARN: Code duplicated, block: B:86:0x079d  */
    /* JADX WARN: Code duplicated, block: B:89:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:92:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x081e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0822  */
    /* JADX WARN: Multi-variable type inference failed */
    private static String a(String str, com.smartdigimkt.v3.l lVar, f fVar, boolean z2) {
        String strEncode;
        String strEncode2;
        String strI;
        String strReplaceAll;
        String str2;
        int i2;
        String str3;
        String strI2;
        String strI3;
        String str4;
        String str5;
        String strReplaceAll2;
        String strA;
        String strA2;
        String strReplaceAll3;
        com.smartdigimkt.v3.a aVar;
        String str6;
        String strL;
        String str7;
        String str8;
        String str9;
        String strA3;
        String strReplaceAll4;
        int i3;
        String strReplaceAll5;
        String str10;
        long j;
        long jNextInt;
        long jCurrentTimeMillis;
        String strReplaceAll6;
        int i4;
        String strA4;
        String strA5;
        String strReplaceAll7;
        String str11;
        int iE0;
        String str12;
        String str13;
        com.smartdigimkt.t3.b bVar;
        com.smartdigimkt.v6.a aVar2;
        boolean z3;
        com.smartdigimkt.v6.a aVar3;
        String strI0;
        float[] fArr;
        com.smartdigimkt.v3.a aVar4 = lVar.f39137i;
        int i5 = lVar.g;
        int i6 = lVar.f39136h;
        Context contextK = com.smartdigimkt.m6.b.p().k();
        com.smartdigimkt.t3.b bVarB = com.smartdigimkt.t3.a.a().b(fVar instanceof com.smartdigimkt.w6.d ? ((com.smartdigimkt.w6.d) fVar).I0() : "");
        JSONObject jSONObject = new JSONObject();
        try {
            com.smartdigimkt.v3.a aVar5 = aVar4.f39069p;
            if (aVar5 != null) {
                jSONObject.put("down_x", aVar5.f39064e);
                jSONObject.put("down_y", aVar4.f39069p.f);
                jSONObject.put("up_x", aVar4.f39069p.g);
                jSONObject.put("up_y", aVar4.f39069p.f39065h);
            } else {
                jSONObject.put("down_x", aVar4.f39064e);
                jSONObject.put("down_y", aVar4.f);
                jSONObject.put("up_x", aVar4.g);
                jSONObject.put("up_y", aVar4.f39065h);
            }
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        com.smartdigimkt.v3.a aVar6 = aVar4.f39069p;
        if (aVar6 != null) {
            float f = i5;
            jSONObject2.put("down_x", (int) ((aVar6.f39064e / f) * 1000.0f));
            float f2 = i6;
            jSONObject2.put("down_y", (int) ((aVar4.f39069p.f / f2) * 1000.0f));
            jSONObject2.put("up_x", (int) ((aVar4.f39069p.g / f) * 1000.0f));
            jSONObject2.put("up_y", (int) ((aVar4.f39069p.f39065h / f2) * 1000.0f));
        } else {
            float f3 = i5;
            jSONObject2.put("down_x", (int) ((aVar4.f39064e / f3) * 1000.0f));
            float f4 = i6;
            jSONObject2.put("down_y", (int) ((aVar4.f / f4) * 1000.0f));
            jSONObject2.put("up_x", (int) ((aVar4.g / f3) * 1000.0f));
            jSONObject2.put("up_y", (int) ((aVar4.f39065h / f4) * 1000.0f));
        }
        try {
            strEncode = URLEncoder.encode(jSONObject.toString(), "utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            strEncode = JsonUtils.EMPTY_JSON;
        }
        String str14 = strEncode;
        try {
            strEncode2 = URLEncoder.encode(jSONObject2.toString(), "utf-8");
        } catch (Throwable th2) {
            th2.printStackTrace();
            strEncode2 = JsonUtils.EMPTY_JSON;
        }
        boolean z4 = b(str) && c(str);
        if (aVar4.f39069p != null && !z4) {
            strI = android.support.v4.media.a.i(aVar4.f39069p.f39068n, "", new StringBuilder());
            strReplaceAll = str.replaceAll("__SLD__", strI);
        } else {
            strI = android.support.v4.media.a.i(aVar4.f39068n, "", new StringBuilder());
            strReplaceAll = str.replaceAll("__SLD__", strI);
        }
        String str15 = strI;
        String strI4 = android.support.v4.media.a.i(aVar4.f39068n, "", new StringBuilder());
        String strReplaceAll8 = strReplaceAll.replaceAll("__C_SLD__", strI4);
        int i7 = aVar4.f39066i ? 1 : 2;
        boolean zA = aVar4.a();
        if (aVar4.f39069p != null && !z4) {
            String strI5 = android.support.v4.media.a.i(aVar4.f39069p.f39061a, "", new StringBuilder());
            str2 = strI4;
            String strI6 = android.support.v4.media.a.i(aVar4.f39069p.f39062b, "", new StringBuilder());
            i2 = i7;
            strI2 = android.support.v4.media.a.i(aVar4.f39069p.f39063c, "", new StringBuilder());
            str3 = str15;
            strI3 = android.support.v4.media.a.i(aVar4.f39069p.d, "", new StringBuilder());
            str4 = strI5;
            str5 = strI6;
            strReplaceAll2 = com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f39069p.f39065h, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f39069p.g, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f39069p.f, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f39069p.f39064e, "", strReplaceAll8.replaceAll("__DOWN_X__", strI5).replaceAll("__DOWN_Y__", strI6).replaceAll("__UP_X__", strI2).replaceAll("__UP_Y__", strI3), "__RE_DOWN_X__"), "__RE_DOWN_Y__"), "__RE_UP_X__"), "__RE_UP_Y__").replaceAll("\\{ABSOLUTE_COORD\\}", str14).replaceAll("\\{RELATIVE_COORD\\}", strEncode2);
            if (contextK != null) {
                strReplaceAll2 = strReplaceAll2.replaceAll("__DOWN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.f39061a, new StringBuilder(), "")).replaceAll("__DOWN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.f39062b, new StringBuilder(), "")).replaceAll("__UP_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.f39063c, new StringBuilder(), "")).replaceAll("__UP_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.d, new StringBuilder(), "")).replaceAll("__RE_DOWN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.f39064e, new StringBuilder(), "")).replaceAll("__RE_DOWN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.f, new StringBuilder(), "")).replaceAll("__RE_UP_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.g, new StringBuilder(), "")).replaceAll("__RE_UP_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39069p.f39065h, new StringBuilder(), ""));
            }
        } else {
            str2 = strI4;
            i2 = i7;
            str3 = str15;
            int i8 = aVar4.f39068n;
            if ((i8 != 0 && i8 != 1) || !zA) {
                strA = a(bVarB, "__DOWN_X__", "-999");
                strA2 = a(bVarB, "__DOWN_Y__", "-999");
                strI2 = a(bVarB, "__UP_X__", "-999");
                strI3 = a(bVarB, "__UP_Y__", "-999");
                String strReplaceAll9 = strReplaceAll8.replaceAll("__DOWN_X__", strA).replaceAll("__DOWN_Y__", strA2).replaceAll("__UP_X__", strI2).replaceAll("__UP_Y__", strI3).replaceAll("__RE_DOWN_X__", a(bVarB, "__RE_DOWN_X__", "-999")).replaceAll("__RE_DOWN_Y__", a(bVarB, "__RE_DOWN_Y__", "-999")).replaceAll("__RE_UP_X__", a(bVarB, "__RE_UP_X__", "-999")).replaceAll("__RE_UP_Y__", a(bVarB, "__RE_UP_Y__", "-999"));
                try {
                    try {
                        strReplaceAll3 = strReplaceAll9.replaceAll("\\{ABSOLUTE_COORD\\}", URLEncoder.encode(JsonUtils.EMPTY_JSON, "utf-8")).replaceAll("\\{RELATIVE_COORD\\}", URLEncoder.encode(JsonUtils.EMPTY_JSON, "utf-8"));
                    } catch (Throwable unused2) {
                        strReplaceAll3 = strReplaceAll9;
                    }
                } catch (Throwable unused3) {
                }
                strReplaceAll2 = strReplaceAll3.replaceAll("__DOWN_X_DT__", a(bVarB, "__DOWN_X_DT__", "-999")).replaceAll("__DOWN_Y_DT__", a(bVarB, "__DOWN_Y_DT__", "-999")).replaceAll("__UP_X_DT__", a(bVarB, "__UP_X_DT__", "-999")).replaceAll("__UP_Y_DT__", a(bVarB, "__UP_Y_DT__", "-999")).replaceAll("__RE_DOWN_X_DT__", a(bVarB, "__RE_DOWN_X_DT__", "-999")).replaceAll("__RE_DOWN_Y_DT__", a(bVarB, "__RE_DOWN_Y_DT__", "-999")).replaceAll("__RE_UP_X_DT__", a(bVarB, "__RE_UP_X_DT__", "-999")).replaceAll("__RE_UP_Y_DT__", a(bVarB, "__RE_UP_Y_DT__", "-999"));
            } else {
                String strI7 = android.support.v4.media.a.i(aVar4.f39061a, "", new StringBuilder());
                String strI8 = android.support.v4.media.a.i(aVar4.f39062b, "", new StringBuilder());
                strI2 = android.support.v4.media.a.i(aVar4.f39063c, "", new StringBuilder());
                strI3 = android.support.v4.media.a.i(aVar4.d, "", new StringBuilder());
                str4 = strI7;
                str5 = strI8;
                strReplaceAll2 = com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f39065h, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.g, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f, "", com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar4.f39064e, "", strReplaceAll8.replaceAll("__DOWN_X__", strI7).replaceAll("__DOWN_Y__", strI8).replaceAll("__UP_X__", strI2).replaceAll("__UP_Y__", strI3), "__RE_DOWN_X__"), "__RE_DOWN_Y__"), "__RE_UP_X__"), "__RE_UP_Y__").replaceAll("\\{ABSOLUTE_COORD\\}", str14).replaceAll("\\{RELATIVE_COORD\\}", strEncode2);
                if (contextK != null) {
                    strReplaceAll2 = strReplaceAll2.replaceAll("__DOWN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39061a, new StringBuilder(), "")).replaceAll("__DOWN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39062b, new StringBuilder(), "")).replaceAll("__UP_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39063c, new StringBuilder(), "")).replaceAll("__UP_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.d, new StringBuilder(), "")).replaceAll("__RE_DOWN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39064e, new StringBuilder(), "")).replaceAll("__RE_DOWN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f, new StringBuilder(), "")).replaceAll("__RE_UP_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.g, new StringBuilder(), "")).replaceAll("__RE_UP_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar4.f39065h, new StringBuilder(), ""));
                }
            }
            String str16 = strA;
            String str17 = strA2;
            String str18 = strI2;
            String str19 = strI3;
            if (aVar4.f39068n == 2) {
                String strA6 = a(bVarB, "__C_DOWN_X__", "__C_DOWN_X__");
                String strA7 = a(bVarB, "__C_DOWN_Y__", "__C_DOWN_Y__");
                String strA8 = a(bVarB, "__C_UP_X__", "__C_UP_X__");
                String strA9 = a(bVarB, "__C_UP_Y__", "__C_UP_Y__");
                strL = strReplaceAll2.replaceAll("__C_DOWN_X__", strA6).replaceAll("__C_DOWN_Y__", strA7).replaceAll("__C_UP_X__", strA8).replaceAll("__C_UP_Y__", strA9).replaceAll("__RE_C_DOWN_X__", a(bVarB, "__RE_C_DOWN_X__", "__RE_C_DOWN_X__")).replaceAll("__RE_C_DOWN_Y__", a(bVarB, "__RE_C_DOWN_Y__", "__RE_C_DOWN_Y__")).replaceAll("__RE_C_UP_X__", a(bVarB, "__RE_C_UP_X__", "__RE_C_UP_X__")).replaceAll("__RE_C_UP_Y__", a(bVarB, "__RE_C_UP_Y__", "__RE_C_UP_Y__")).replaceAll("__C_DOWN_X_DT__", a(bVarB, "__C_DOWN_X_DT__", "__C_DOWN_X_DT__")).replaceAll("__C_DOWN_Y_DT__", a(bVarB, "__C_DOWN_Y_DT__", "__C_DOWN_Y_DT__")).replaceAll("__C_UP_X_DT__", a(bVarB, "__C_UP_X_DT__", "__C_UP_X_DT__")).replaceAll("__C_UP_Y_DT__", a(bVarB, "__C_UP_Y_DT__", "__C_UP_Y_DT__")).replaceAll("__RE_C_DOWN_X_DT__", a(bVarB, "__RE_C_DOWN_X_DT__", "__RE_C_DOWN_X_DT__")).replaceAll("__RE_C_DOWN_Y_DT__", a(bVarB, "__RE_C_DOWN_Y_DT__", "__RE_C_DOWN_Y_DT__")).replaceAll("__RE_C_UP_X_DT__", a(bVarB, "__RE_C_UP_X_DT__", "__RE_C_UP_X_DT__")).replaceAll("__RE_C_UP_Y_DT__", a(bVarB, "__RE_C_UP_Y_DT__", "__RE_C_UP_Y_DT__"));
                str7 = strA6;
                str8 = strA7;
                strA3 = strA8;
                str9 = strA9;
            } else {
                if (!zA) {
                    String strA10 = a(bVarB, "__C_DOWN_X__", "-999");
                    String strA11 = a(bVarB, "__C_DOWN_Y__", "-999");
                    strA3 = a(bVarB, "__C_UP_X__", "-999");
                    String strA12 = a(bVarB, "__C_UP_Y__", "-999");
                    strL = strReplaceAll2.replaceAll("__C_DOWN_X__", strA10).replaceAll("__C_DOWN_Y__", strA11).replaceAll("__C_UP_X__", strA3).replaceAll("__C_UP_Y__", strA12).replaceAll("__RE_C_DOWN_X__", a(bVarB, "__RE_C_DOWN_X__", "-999")).replaceAll("__RE_C_DOWN_Y__", a(bVarB, "__RE_C_DOWN_Y__", "-999")).replaceAll("__RE_C_UP_X__", a(bVarB, "__RE_C_UP_X__", "-999")).replaceAll("__RE_C_UP_Y__", a(bVarB, "__RE_C_UP_Y__", "-999")).replaceAll("__C_DOWN_X_DT__", a(bVarB, "__C_DOWN_X_DT__", "-999")).replaceAll("__C_DOWN_Y_DT__", a(bVarB, "__C_DOWN_Y_DT__", "-999")).replaceAll("__C_UP_X_DT__", a(bVarB, "__C_UP_X_DT__", "-999")).replaceAll("__C_UP_Y_DT__", a(bVarB, "__C_UP_Y_DT__", "-999")).replaceAll("__RE_C_DOWN_X_DT__", a(bVarB, "__RE_C_DOWN_X_DT__", "-999")).replaceAll("__RE_C_DOWN_Y_DT__", a(bVarB, "__RE_C_DOWN_Y_DT__", "-999")).replaceAll("__RE_C_UP_X_DT__", a(bVarB, "__RE_C_UP_X_DT__", "-999")).replaceAll("__RE_C_UP_Y_DT__", a(bVarB, "__RE_C_UP_Y_DT__", "-999"));
                    str8 = strA11;
                    str7 = strA10;
                    str9 = strA12;
                } else {
                    bVarB = bVarB;
                    aVar = aVar4;
                    str6 = "";
                    String strI9 = android.support.v4.media.a.i(aVar.f39061a, str6, new StringBuilder());
                    String strI10 = android.support.v4.media.a.i(aVar.f39062b, str6, new StringBuilder());
                    String strI11 = android.support.v4.media.a.i(aVar.f39063c, str6, new StringBuilder());
                    String strI12 = android.support.v4.media.a.i(aVar.d, str6, new StringBuilder());
                    strL = com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar.f39065h, str6, com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar.g, str6, com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar.f, str6, com.google.firebase.crashlytics.internal.model.a.l(new StringBuilder(), aVar.f39064e, str6, strReplaceAll2.replaceAll("__C_DOWN_X__", strI9).replaceAll("__C_DOWN_Y__", strI10).replaceAll("__C_UP_X__", strI11).replaceAll("__C_UP_Y__", strI12), "__RE_C_DOWN_X__"), "__RE_C_DOWN_Y__"), "__RE_C_UP_X__"), "__RE_C_UP_Y__");
                    if (contextK != null) {
                        strL = strL.replaceAll("__C_DOWN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.f39061a, new StringBuilder(), str6)).replaceAll("__C_DOWN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.f39062b, new StringBuilder(), str6)).replaceAll("__C_UP_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.f39063c, new StringBuilder(), str6)).replaceAll("__C_UP_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.d, new StringBuilder(), str6)).replaceAll("__RE_C_DOWN_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.f39064e, new StringBuilder(), str6)).replaceAll("__RE_C_DOWN_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.f, new StringBuilder(), str6)).replaceAll("__RE_C_UP_X_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.g, new StringBuilder(), str6)).replaceAll("__RE_C_UP_Y_DT__", com.google.firebase.crashlytics.internal.model.a.j(contextK, aVar.f39065h, new StringBuilder(), str6));
                    }
                    str7 = strI9;
                    str8 = strI10;
                    str9 = strI12;
                    strA3 = strI11;
                }
                strReplaceAll4 = strL.replaceAll("\\{__DPLINK_TYPE__\\}", String.valueOf(i2));
                if (aVar.f39066i) {
                    strReplaceAll4 = strReplaceAll4.replaceAll("&apk_ptype=\\{apk_ptype\\}", str6);
                }
                i3 = aVar.j;
                if (i3 == -1) {
                    strReplaceAll5 = strReplaceAll4.replaceAll("&apk_ptype=\\{apk_ptype\\}", str6);
                } else {
                    strReplaceAll5 = strReplaceAll4.replaceAll("\\{apk_ptype\\}", String.valueOf(i3));
                }
                if (aVar.f39066i) {
                    str10 = "1";
                } else {
                    str10 = "0";
                }
                String strReplaceAll10 = strReplaceAll5.replaceAll("\\{opdptype\\}", str10);
                j = aVar.k;
                jNextInt = aVar.f39067l;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (j <= 0) {
                    j = jCurrentTimeMillis;
                }
                if (jNextInt <= 0) {
                    jNextInt = jCurrentTimeMillis;
                }
                if (jNextInt <= j - 5) {
                    jNextInt = 50 + j + ((long) new Random().nextInt(150));
                }
                String strValueOf = String.valueOf(j);
                String strValueOf2 = String.valueOf(jNextInt);
                strReplaceAll6 = strReplaceAll10.replaceAll("__TS__", android.support.v4.media.a.j(j / 1000, str6, new StringBuilder())).replaceAll("__TS_MSEC__", j + str6).replaceAll("__END_TS__", android.support.v4.media.a.j(jNextInt / 1000, str6, new StringBuilder())).replaceAll("__END_TS_MSEC__", jNextInt + str6);
                if (aVar.f39068n == 2) {
                    fArr = aVar.m;
                    if (fArr != null || fArr.length != 3) {
                        i4 = 1;
                    } else if (fArr[0] > 0.0f || fArr[1] > 0.0f || fArr[2] > 0.0f) {
                        strA4 = android.support.v4.media.a.i((int) (fArr[0] * 100.0f), str6, new StringBuilder());
                        i4 = 1;
                        strA5 = android.support.v4.media.a.i((int) (fArr[1] * 100.0f), str6, new StringBuilder());
                        String strI13 = android.support.v4.media.a.i((int) (fArr[2] * 100.0f), str6, new StringBuilder());
                        strReplaceAll7 = strReplaceAll6.replaceAll("__M_X_ACC__", strA4).replaceAll("__M_Y_ACC__", strA5).replaceAll("__M_Z_ACC__", strI13);
                        str11 = strI13;
                        bVarB = bVarB;
                    } else {
                        i4 = 1;
                    }
                    String strA13 = a(bVarB, "__M_X_ACC__", (String) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0899: INVOKE (r6v13 'strA13' java.lang.String) = 
                          (r20v7 'bVarB' com.smartdigimkt.t3.b)
                          ("__M_X_ACC__")
                          (wrap java.lang.String:?: CAST (java.lang.String) (r29v0 ?? I:??[OBJECT, ARRAY]))
                         STATIC call: com.smartdigimkt.q3.e.a(com.smartdigimkt.t3.b, java.lang.String, java.lang.String):java.lang.String A[DECLARE_VAR, MD:(com.smartdigimkt.t3.b, java.lang.String, java.lang.String):java.lang.String (m)] (LINE:552) in method: com.smartdigimkt.q3.e.a(java.lang.String, com.smartdigimkt.v3.l, com.smartdigimkt.w6.f, boolean):java.lang.String, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 2385
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.q3.e.a(java.lang.String, com.smartdigimkt.v3.l, com.smartdigimkt.w6.f, boolean):java.lang.String");
                }

                private static boolean a(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return true;
                    }
                    try {
                        return new JSONObject(str).length() <= 0;
                    } catch (Throwable unused) {
                    }
                }

                private static String a(com.smartdigimkt.t3.b bVar, String str, String str2) {
                    return bVar != null ? bVar.a(str, str2) : str2;
                }
            }
