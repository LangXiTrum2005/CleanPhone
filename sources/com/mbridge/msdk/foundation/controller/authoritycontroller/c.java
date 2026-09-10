package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile c f33423j;

    private c() {
        h();
    }

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f33423j == null) {
            synchronized (c.class) {
                try {
                    if (f33423j == null) {
                        f33423j = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33423j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = i.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.z0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.y0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.A0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z10;
        g gVarI = f2.i(i.b());
        if (gVarI == null) {
            gVarI = i.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iN0 = gVarI.n0();
        boolean z11 = iN0 != 0 ? iN0 == 1 && a(gVarI, str) == 1 : a(str) == 1 && a(gVarI, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) {
            return (gVarI.K0() || z10 || a(str) != 1) ? false : true;
        }
        return z11;
    }
}
