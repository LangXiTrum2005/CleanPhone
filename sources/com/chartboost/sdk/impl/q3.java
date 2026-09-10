package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes3.dex */
public class q3 {
    public p3 a(Context context) {
        String strSubstring;
        String strSubstring2;
        if (c(context)) {
            za.a("Permission READ_PHONE_STATE not granted", null);
            return null;
        }
        TelephonyManager telephonyManagerB = b(context);
        if (!a(telephonyManagerB)) {
            return null;
        }
        String simOperator = telephonyManagerB.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            strSubstring = null;
            strSubstring2 = null;
        } else {
            strSubstring = simOperator.substring(0, 3);
            strSubstring2 = simOperator.substring(3);
        }
        return new p3(simOperator, strSubstring, strSubstring2, telephonyManagerB.getNetworkOperatorName(), telephonyManagerB.getNetworkCountryIso(), telephonyManagerB.getPhoneType());
    }

    public final TelephonyManager b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception e2) {
            za.b("Unable to retrieve TELEPHONY_SERVICE", e2);
            return null;
        }
    }

    public final boolean c(Context context) {
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == -1;
    }

    public final boolean a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }
}
