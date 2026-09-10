package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f19295attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f19296saneness;

    /* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
    public static final class saneness extends NetworkConnectionInfo.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public NetworkConnectionInfo.NetworkType f19297attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public NetworkConnectionInfo.MobileSubtype f19298saneness;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.attabal
        public NetworkConnectionInfo attabal() {
            return new wireman(this.f19297attabal, this.f19298saneness);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.attabal
        public NetworkConnectionInfo.attabal dern(NetworkConnectionInfo.NetworkType networkType) {
            this.f19297attabal = networkType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.attabal
        public NetworkConnectionInfo.attabal saneness(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f19298saneness = mobileSubtype;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.NetworkType dern() {
        return this.f19295attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkConnectionInfo) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            NetworkConnectionInfo.NetworkType networkType = this.f19295attabal;
            if (networkType != null ? networkType.equals(networkConnectionInfo.dern()) : networkConnectionInfo.dern() == null) {
                NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f19296saneness;
                if (mobileSubtype != null ? mobileSubtype.equals(networkConnectionInfo.saneness()) : networkConnectionInfo.saneness() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f19295attabal;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f19296saneness;
        return iHashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.MobileSubtype saneness() {
        return this.f19296saneness;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f19295attabal + ", mobileSubtype=" + this.f19296saneness + "}";
    }

    public wireman(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f19295attabal = networkType;
        this.f19296saneness = mobileSubtype;
    }
}
