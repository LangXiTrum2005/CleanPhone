package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f16779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f16780b;

    public static final class Builder extends NetworkConnectionInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetworkConnectionInfo.NetworkType f16781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public NetworkConnectionInfo.MobileSubtype f16782b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo a() {
            return new AutoValue_NetworkConnectionInfo(this.f16781a, this.f16782b);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo.Builder b(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f16782b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo.Builder c(NetworkConnectionInfo.NetworkType networkType) {
            this.f16781a = networkType;
            return this;
        }
    }

    public AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f16779a = networkType;
        this.f16780b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.MobileSubtype b() {
        return this.f16780b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.NetworkType c() {
        return this.f16779a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f16779a;
        if (networkType == null) {
            if (networkConnectionInfo.c() != null) {
                return false;
            }
        } else if (!networkType.equals(networkConnectionInfo.c())) {
            return false;
        }
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f16780b;
        if (mobileSubtype == null) {
            return networkConnectionInfo.b() == null;
        }
        return mobileSubtype.equals(networkConnectionInfo.b());
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f16779a;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f16780b;
        return (mobileSubtype != null ? mobileSubtype.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16779a + ", mobileSubtype=" + this.f16780b + "}";
    }
}
