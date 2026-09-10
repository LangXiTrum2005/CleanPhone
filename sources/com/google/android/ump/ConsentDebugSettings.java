package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.d0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ConsentDebugSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24519b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f24521b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24523d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f24520a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24522c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f24521b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f24520a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!d0.d()) {
                if (!this.f24520a.contains(d0.a(this.f24521b)) && !this.f24523d) {
                    z10 = false;
                }
            }
            return new ConsentDebugSettings(z10, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f24522c = i10;
            return this;
        }

        @RecentlyNonNull
        public Builder setForceTesting(boolean z10) {
            this.f24523d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder) {
        this.f24518a = z10;
        this.f24519b = builder.f24522c;
    }

    public int getDebugGeography() {
        return this.f24519b;
    }

    public boolean isTestDevice() {
        return this.f24518a;
    }
}
