package com.thinkup.core.common.oo0;

import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0n;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    private static void o(n0 n0Var, int i2, int i3, String str, String str2, int i4, Boolean bool, String str3, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str4;
        o0n o0nVar = new o0n(n0Var.oono(), null);
        o0nVar.f42235n = "1004684";
        o0nVar.o(n0Var);
        o0nVar.o0 = n0Var.oon0();
        o0nVar.oo = n0Var.oomn();
        o0nVar.n0 = String.valueOf(i2);
        o0nVar.o00 = String.valueOf(i4);
        o0nVar.o0o = String.valueOf(n0Var.oono());
        o0nVar.o0m = z2 ? "1" : "2";
        o0nVar.o0n = String.valueOf(i3);
        if (!TextUtils.isEmpty(str)) {
            o0nVar.oo0 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            o0nVar.ooo = str2;
        }
        if (bool == null) {
            str4 = "0";
        } else {
            str4 = bool.booleanValue() ? "1" : "2";
        }
        o0nVar.oom = str4;
        o0nVar.oon = str3;
        o0nVar.om0 = z3 ? "1" : "2";
        o0nVar.omo = z4 ? "1" : "2";
        o0nVar.omm = String.valueOf(i2);
        o0nVar.omn = z5 ? "1" : "2";
        oo.m(o0nVar);
    }

    public static void o(String str, TUBaseAdAdapter tUBaseAdAdapter, BaseAd baseAd) {
        String str2;
        String string;
        try {
            String strO0m = com.thinkup.core.common.n.o0n.m().o0m();
            String string2 = AbstractJsonLexerKt.NULL;
            if (tUBaseAdAdapter == null) {
                str2 = AbstractJsonLexerKt.NULL;
                string = str2;
            } else {
                String string3 = tUBaseAdAdapter.toString();
                n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
                if (trackingInfo == null) {
                    string = AbstractJsonLexerKt.NULL;
                } else {
                    string = trackingInfo.toString();
                }
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo != null) {
                    string2 = unitGroupInfo.toString();
                }
                str2 = string2;
                string2 = string3;
            }
            String str3 = "format: " + str + " | adapter: " + string2 + " | tracking: " + string + " | unitGroupInfo: " + str2;
            if (baseAd != null) {
                str3 = str3 + " | baseAd: " + baseAd.toString();
            }
            oo.m("Empty TUAdInfo", str3, strO0m);
        } catch (Throwable unused) {
        }
    }
}
