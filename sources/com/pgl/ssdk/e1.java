package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class e1 extends m0 {
    private Context p;

    public e1(Context context, String str) {
        super(context, str);
        this.p = context;
        this.f2444a = l0.b() + b();
    }

    @Override // com.pgl.ssdk.m0
    public boolean a(int i, byte[] bArr) {
        try {
            Object objA = b1.a(bArr);
            if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                b1.f2424a = 200;
                return true;
            }
            if (objA instanceof String) {
                b1.c = (String) objA;
                b1.f2424a = 200;
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public String b() {
        return "?os=android&app_id=" + b1.b + "&did=" + com.pgl.ssdk.ces.b.e() + "&app_ver=" + z.g(this.p) + "&platform=android&ver=6.5.0.0.overseas-rc.1&mode=1";
    }
}
