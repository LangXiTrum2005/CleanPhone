package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f15367b;

    public /* synthetic */ hr0(Boolean bool, int i10) {
        this.f15366a = i10;
        this.f15367b = bool;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f15366a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Boolean bool = this.f15367b;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Boolean bool2 = this.f15367b;
                if (bool2 == null) {
                    bundle2.putInt("lft", -1);
                } else if (!bool2.booleanValue()) {
                    bundle2.putInt("lft", 0);
                } else {
                    bundle2.putInt("lft", 1);
                }
                break;
        }
    }
}
