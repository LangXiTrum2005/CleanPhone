package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.kx1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f11542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f11543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f11544e;

    public CsiParamDefaults_Factory(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, kx1 kx1Var5) {
        this.f11540a = kx1Var;
        this.f11541b = kx1Var2;
        this.f11542c = kx1Var3;
        this.f11543d = kx1Var4;
        this.f11544e = kx1Var5;
    }

    public static CsiParamDefaults_Factory create(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, kx1 kx1Var5) {
        return new CsiParamDefaults_Factory(kx1Var, kx1Var2, kx1Var3, kx1Var4, kx1Var5);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel, @Nullable PackageInfo packageInfo, @Nullable String str, @NonNull DeviceTierManager deviceTierManager) {
        return new CsiParamDefaults(context, versionInfoParcel, packageInfo, str, deviceTierManager);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    @NonNull
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.f11540a.zzb(), (VersionInfoParcel) this.f11541b.zzb(), (PackageInfo) this.f11542c.zzb(), (String) this.f11543d.zzb(), (DeviceTierManager) this.f11544e.zzb());
    }
}
