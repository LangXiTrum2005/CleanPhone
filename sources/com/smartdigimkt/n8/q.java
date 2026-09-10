package com.smartdigimkt.n8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.SparseBooleanArray;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f37226b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37227c = 2;
    private static final int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile q f37228e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f37229a = new SparseBooleanArray(3);

    public static q a() {
        if (f37228e == null) {
            synchronized (q.class) {
                try {
                    if (f37228e == null) {
                        f37228e = new q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37228e;
    }

    public synchronized boolean b(Context context) {
        if (this.f37229a.indexOfKey(1) >= 0) {
            return this.f37229a.get(1);
        }
        boolean z2 = false;
        try {
            o oVar = new o(context);
            o.a aVarB = oVar.b("com.huawei.hwid");
            String strA = oVar.a("com.huawei.hwid");
            if (aVarB == o.a.ENABLED && "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(strA)) {
                z2 = true;
            }
        } catch (Exception unused) {
        }
        this.f37229a.put(1, z2);
        return z2;
    }

    public synchronized boolean a(Context context) {
        if (this.f37229a.indexOfKey(2) >= 0) {
            return this.f37229a.get(2);
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
        this.f37229a.put(2, z2);
        return z2;
    }

    public synchronized boolean b() {
        boolean z2;
        if (this.f37229a.indexOfKey(3) >= 0) {
            return this.f37229a.get(3);
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z2 = true;
        } catch (Exception unused) {
            z2 = false;
        }
        this.f37229a.put(3, z2);
        return z2;
    }
}
