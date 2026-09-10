package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wy extends qh implements fy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21621b;

    public wy(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f21620a);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f21621b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final String zze() {
        return this.f21620a;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final int zzf() {
        return this.f21621b;
    }

    public wy(String str, int i10) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f21620a = str;
        this.f21621b = i10;
    }
}
