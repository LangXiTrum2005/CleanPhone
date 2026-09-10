package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ClientInfo extends ClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f16742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidClientInfo f16743b;

    public static final class Builder extends ClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClientInfo.ClientType f16744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AndroidClientInfo f16745b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo a() {
            return new AutoValue_ClientInfo(this.f16744a, this.f16745b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder b(AndroidClientInfo androidClientInfo) {
            this.f16745b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder c() {
            this.f16744a = ClientInfo.ClientType.X;
            return this;
        }
    }

    public AutoValue_ClientInfo(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f16742a = clientType;
        this.f16743b = androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final AndroidClientInfo b() {
        return this.f16743b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType c() {
        return this.f16742a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f16742a;
        if (clientType == null) {
            if (clientInfo.c() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.c())) {
            return false;
        }
        AndroidClientInfo androidClientInfo = this.f16743b;
        if (androidClientInfo == null) {
            return clientInfo.b() == null;
        }
        return androidClientInfo.equals(clientInfo.b());
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f16742a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f16743b;
        return (androidClientInfo != null ? androidClientInfo.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f16742a + ", androidClientInfo=" + this.f16743b + "}";
    }
}
