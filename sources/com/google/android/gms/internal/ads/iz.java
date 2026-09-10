package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iz implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15877d;

    public iz(Context context, String str) {
        this.f15874a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f15876c = str;
        this.f15877d = false;
        this.f15875b = new Object();
    }

    public final void a(boolean z10) {
        kz kzVarZzD = zzt.zzD();
        Context context = this.f15874a;
        if (kzVarZzD.a(context)) {
            synchronized (this.f15875b) {
                try {
                    if (this.f15877d == z10) {
                        return;
                    }
                    this.f15877d = z10;
                    String str = this.f15876c;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f15877d) {
                        kz kzVarZzD2 = zzt.zzD();
                        if (kzVarZzD2.a(context)) {
                            kzVarZzD2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        kz kzVarZzD3 = zzt.zzD();
                        if (kzVarZzD3.a(context)) {
                            kzVarZzD3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        a(zhVar.f22617j);
    }
}
