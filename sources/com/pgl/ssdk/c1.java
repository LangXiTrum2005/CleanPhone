package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f2426a;
    private final Context b;

    public c1(Context context, d1 d1Var) {
        this.f2426a = d1Var;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strB = l0.b();
        try {
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.b, null);
            if (bArr == null || bArr.length <= 0) {
                b1.f2424a = 501;
                return;
            }
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            new e1(this.b, null).a(1, 2, bArr);
            d1 d1Var = this.f2426a;
            if (d1Var != null) {
                d1Var.a(b1.a());
            }
        } catch (Throwable unused) {
            b1.f2424a = 501;
        }
    }
}
