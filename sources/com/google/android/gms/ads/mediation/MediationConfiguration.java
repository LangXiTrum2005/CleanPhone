package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MediationConfiguration {

    @NonNull
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdFormat f11266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f11267b;

    public MediationConfiguration(@NonNull AdFormat adFormat, @NonNull Bundle bundle) {
        this.f11266a = adFormat;
        this.f11267b = bundle;
    }

    @NonNull
    public AdFormat getFormat() {
        return this.f11266a;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.f11267b;
    }
}
