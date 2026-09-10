package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f11257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f11258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f11259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11264i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z10, @Nullable Location location, int i10, int i11, @Nullable String str2, @NonNull String str3) {
        this.f11256a = str;
        this.f11257b = bundle;
        this.f11258c = bundle2;
        this.f11259d = context;
        this.f11260e = z10;
        this.f11261f = i10;
        this.f11262g = i11;
        this.f11263h = str2;
        this.f11264i = str3;
    }

    @NonNull
    public String getBidResponse() {
        return this.f11256a;
    }

    @NonNull
    public Context getContext() {
        return this.f11259d;
    }

    @Nullable
    public String getMaxAdContentRating() {
        return this.f11263h;
    }

    @NonNull
    public Bundle getMediationExtras() {
        return this.f11258c;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.f11257b;
    }

    @NonNull
    public String getWatermark() {
        return this.f11264i;
    }

    public boolean isTestRequest() {
        return this.f11260e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f11261f;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f11262g;
    }
}
