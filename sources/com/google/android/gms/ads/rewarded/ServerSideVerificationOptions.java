package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ServerSideVerificationOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11566b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11567a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11568b = "";

        @NonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        @NonNull
        public Builder setCustomData(@NonNull String str) {
            this.f11568b = str;
            return this;
        }

        @NonNull
        public Builder setUserId(@NonNull String str) {
            this.f11567a = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder) {
        this.f11565a = builder.f11567a;
        this.f11566b = builder.f11568b;
    }

    @NonNull
    public String getCustomData() {
        return this.f11566b;
    }

    @NonNull
    public String getUserId() {
        return this.f11565a;
    }
}
