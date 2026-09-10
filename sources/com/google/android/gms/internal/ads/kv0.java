package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16543a = new HashMap();

    public final jv0 a(cv0 cv0Var, Context context, zu0 zu0Var, at0 at0Var) {
        cv0 cv0Var2;
        ev0 ev0Var;
        ev0 ev0Var2;
        HashMap map = this.f16543a;
        jv0 jv0Var = (jv0) map.get(cv0Var);
        if (jv0Var != null) {
            return jv0Var;
        }
        if (cv0Var == cv0.f13257a) {
            int iIntValue = ((Integer) zzba.zzc().a(am.f12375u7)).intValue();
            int iIntValue2 = ((Integer) zzba.zzc().a(am.A7)).intValue();
            int iIntValue3 = ((Integer) zzba.zzc().a(am.C7)).intValue();
            String str = (String) zzba.zzc().a(am.E7);
            String str2 = (String) zzba.zzc().a(am.f12404w7);
            ev0Var = new ev0(context, cv0Var, iIntValue, iIntValue2, iIntValue3, str, str2);
            cv0Var2 = cv0Var;
        } else {
            cv0Var2 = cv0Var;
            if (cv0Var2 == cv0.f13258b) {
                int iIntValue4 = ((Integer) zzba.zzc().a(am.f12391v7)).intValue();
                int iIntValue5 = ((Integer) zzba.zzc().a(am.B7)).intValue();
                int iIntValue6 = ((Integer) zzba.zzc().a(am.D7)).intValue();
                String str3 = (String) zzba.zzc().a(am.F7);
                String str4 = (String) zzba.zzc().a(am.f12421x7);
                ev0Var2 = new ev0(context, cv0Var2, iIntValue4, iIntValue5, iIntValue6, str3, str4);
            } else if (cv0Var2 == cv0.f13259c) {
                int iIntValue7 = ((Integer) zzba.zzc().a(am.I7)).intValue();
                int iIntValue8 = ((Integer) zzba.zzc().a(am.K7)).intValue();
                int iIntValue9 = ((Integer) zzba.zzc().a(am.L7)).intValue();
                String str5 = (String) zzba.zzc().a(am.G7);
                String str6 = (String) zzba.zzc().a(am.H7);
                ev0Var2 = new ev0(context, cv0Var2, iIntValue7, iIntValue8, iIntValue9, str5, str6);
            } else {
                ev0Var = null;
            }
            ev0Var = ev0Var2;
        }
        vu0 vu0Var = new vu0(ev0Var);
        jv0 jv0Var2 = new jv0(vu0Var, new s(vu0Var, zu0Var, at0Var));
        map.put(cv0Var2, jv0Var2);
        return jv0Var2;
    }
}
