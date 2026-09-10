package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.eo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eo f11268j;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, @Nullable Location location, int i10, int i11, @Nullable String str2, String str3, @Nullable eo eoVar) {
        super(context, str, bundle, bundle2, z10, location, i10, i11, str2, str3);
        this.f11268j = eoVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return eo.b(this.f11268j);
    }
}
