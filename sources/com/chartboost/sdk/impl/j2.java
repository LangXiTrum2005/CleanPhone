package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j2 {
    public static boolean a(AtomicReference atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new qf(jSONObject));
            return true;
        } catch (Exception e2) {
            za.b("updateConfig: " + e2, null);
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            if (context != null) {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                boolean z2 = context.checkSelfPermission("android.permission.INTERNET") != 0;
                boolean z3 = iCheckSelfPermission != 0;
                if (z2) {
                    throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
                }
                if (z3) {
                    throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                }
                return true;
            }
            throw new RuntimeException("Invalid activity context passed during intitalization");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
