package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f33432c;

    public ao(Context context, int i2, Object[] objArr) {
        this.f33430a = context;
        this.f33431b = i2;
        this.f33432c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f33431b == 222) {
                ak.a(this.f33430a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f33431b, this.f33430a, this.f33432c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f33430a, this.f33431b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
