package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class RtbSignalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f11316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdSize f11317d;

    public RtbSignalData(@NonNull Context context, @NonNull List<MediationConfiguration> list, @NonNull Bundle bundle, @Nullable AdSize adSize) {
        this.f11314a = context;
        this.f11315b = list;
        this.f11316c = bundle;
        this.f11317d = adSize;
    }

    @Nullable
    public AdSize getAdSize() {
        return this.f11317d;
    }

    @NonNull
    public List<MediationConfiguration> getConfigurations() {
        return this.f11315b;
    }

    @NonNull
    public Context getContext() {
        return this.f11314a;
    }

    @NonNull
    public Bundle getNetworkExtras() {
        return this.f11316c;
    }
}
