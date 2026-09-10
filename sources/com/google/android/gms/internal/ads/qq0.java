package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f19162b;

    public /* synthetic */ qq0(Integer num, int i10) {
        this.f19161a = i10;
        this.f19162b = num;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f19161a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Integer num = this.f19162b;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Integer num2 = this.f19162b;
                if (num2 != null) {
                    bundle2.putInt("dspct", Math.min(num2.intValue(), 20));
                }
                break;
        }
    }
}
