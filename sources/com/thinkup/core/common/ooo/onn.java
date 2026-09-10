package com.thinkup.core.common.ooo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.SparseBooleanArray;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class onn {
    private static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42353n = 3;
    private static final int o = 1;
    private static volatile onn oo;
    private final SparseBooleanArray o0 = new SparseBooleanArray(3);

    public static onn o() {
        if (oo == null) {
            synchronized (onn.class) {
                try {
                    if (oo == null) {
                        oo = new onn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    public final synchronized boolean m(Context context) {
        if (this.o0.indexOfKey(2) >= 0) {
            return this.o0.get(2);
        }
        boolean z2 = false;
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                z2 = true;
            }
        } catch (Exception unused) {
        }
        this.o0.put(2, z2);
        return z2;
    }

    public final synchronized boolean o(Context context) {
        if (this.o0.indexOfKey(1) >= 0) {
            return this.o0.get(1);
        }
        boolean z2 = false;
        try {
            on0 on0Var = new on0(context);
            on0.o oVarO = on0Var.o("com.huawei.hwid");
            String strM = on0Var.m("com.huawei.hwid");
            if (oVarO == on0.o.ENABLED && "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(strM)) {
                z2 = true;
            }
        } catch (Exception unused) {
        }
        this.o0.put(1, z2);
        return z2;
    }

    public final synchronized boolean m() {
        boolean z2;
        if (this.o0.indexOfKey(3) >= 0) {
            return this.o0.get(3);
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z2 = true;
        } catch (Exception unused) {
            z2 = false;
        }
        this.o0.put(3, z2);
        return z2;
    }
}
