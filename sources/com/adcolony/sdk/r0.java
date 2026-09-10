package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, Integer> f9350b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, Integer> f9351c = new HashMap<>();

    public static boolean a(int i2, Bundle bundle) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i2 == 0) {
            if (iCurrentTimeMillis - f9349a < 5) {
                return true;
            }
            f9349a = iCurrentTimeMillis;
            return false;
        }
        if (i2 != 1 || bundle == null) {
            return false;
        }
        String string = bundle.getString("zone_id");
        if (f9350b.get(string) == null) {
            f9350b.put(string, Integer.valueOf(iCurrentTimeMillis));
        }
        if (f9351c.get(string) == null) {
            f9351c.put(string, 0);
        }
        if (iCurrentTimeMillis - f9350b.get(string).intValue() > 1) {
            f9351c.put(string, 1);
            f9350b.put(string, Integer.valueOf(iCurrentTimeMillis));
            return false;
        }
        int iIntValue = f9351c.get(string).intValue() + 1;
        f9351c.put(string, Integer.valueOf(iIntValue));
        return iIntValue > 3;
    }
}
