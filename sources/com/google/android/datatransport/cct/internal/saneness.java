package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: AutoValue_ClientInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness extends ClientInfo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ClientInfo.ClientType f19291attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final escorial.attabal f19292saneness;

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_ClientInfo.java */
    public static final class C0292saneness extends ClientInfo.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public ClientInfo.ClientType f19293attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public escorial.attabal f19294saneness;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.attabal
        public ClientInfo attabal() {
            return new saneness(this.f19293attabal, this.f19294saneness);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.attabal
        public ClientInfo.attabal dern(ClientInfo.ClientType clientType) {
            this.f19293attabal = clientType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.attabal
        public ClientInfo.attabal saneness(escorial.attabal attabalVar) {
            this.f19294saneness = attabalVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public ClientInfo.ClientType dern() {
        return this.f19291attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType = this.f19291attabal;
            if (clientType != null ? clientType.equals(clientInfo.dern()) : clientInfo.dern() == null) {
                escorial.attabal attabalVar = this.f19292saneness;
                if (attabalVar != null ? attabalVar.equals(clientInfo.saneness()) : clientInfo.saneness() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f19291attabal;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        escorial.attabal attabalVar = this.f19292saneness;
        return iHashCode ^ (attabalVar != null ? attabalVar.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public escorial.attabal saneness() {
        return this.f19292saneness;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f19291attabal + ", androidClientInfo=" + this.f19292saneness + "}";
    }

    public saneness(ClientInfo.ClientType clientType, escorial.attabal attabalVar) {
        this.f19291attabal = clientType;
        this.f19292saneness = attabalVar;
    }
}
