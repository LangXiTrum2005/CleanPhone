package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f37104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f37105b;

    public static boolean a() {
        if (f37104a == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                f37104a = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isChina", e10);
                }
            }
        }
        return f37104a != null && f37104a.booleanValue();
    }

    public static boolean b() {
        if (f37105b == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                f37105b = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f37105b != null && f37105b.booleanValue();
    }
}
