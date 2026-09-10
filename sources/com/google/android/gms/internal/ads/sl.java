package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sl implements q81, zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19993b;

    public /* synthetic */ sl(Context context, int i10) {
        this.f19992a = i10;
        this.f19993b = context;
    }

    public boolean a(Intent intent) {
        k9.c0.i(intent, "Intent can not be null");
        return !this.f19993b.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        int i10 = this.f19992a;
        Context context = this.f19993b;
        switch (i10) {
            case 1:
                return x10.b(context);
            default:
                int i11 = fy1.f14575z;
                return new m(context);
        }
    }

    public sl(Context context) {
        this.f19992a = 0;
        k9.c0.i(context, "Context can not be null");
        this.f19993b = context;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        ((oa0) obj).C(this.f19993b);
    }
}
