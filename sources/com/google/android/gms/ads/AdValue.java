package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10641c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    public AdValue(int i10, long j10, String str) {
        this.f10639a = i10;
        this.f10640b = str;
        this.f10641c = j10;
    }

    @NonNull
    public static AdValue zza(int i10, @NonNull String str, long j10) {
        return new AdValue(i10, j10, str);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.f10640b;
    }

    public int getPrecisionType() {
        return this.f10639a;
    }

    public long getValueMicros() {
        return this.f10641c;
    }
}
