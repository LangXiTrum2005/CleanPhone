package com.google.android.ump;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f24527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24528d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f24531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f24532d;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        public Builder setAdMobAppId(@Nullable String str) {
            this.f24530b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f24531c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.f24532d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f24529a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f24525a = builder.f24529a;
        this.f24526b = builder.f24530b;
        this.f24527c = builder.f24531c;
        this.f24528d = builder.f24532d;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f24527c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.f24528d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f24525a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f24526b;
    }
}
