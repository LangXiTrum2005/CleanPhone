package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ClientInfo {

    public static abstract class Builder {
        public abstract ClientInfo a();

        public abstract Builder b(AndroidClientInfo androidClientInfo);

        public abstract Builder c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ClientType {
        public static final ClientType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ ClientType[] f16783Y;

        /* JADX INFO: Fake field, exist only in values array */
        ClientType EF0;

        static {
            ClientType clientType = new ClientType("UNKNOWN", 0);
            ClientType clientType2 = new ClientType("ANDROID_FIREBASE", 1);
            X = clientType2;
            f16783Y = new ClientType[]{clientType, clientType2};
        }

        public static ClientType valueOf(String str) {
            return (ClientType) Enum.valueOf(ClientType.class, str);
        }

        public static ClientType[] values() {
            return (ClientType[]) f16783Y.clone();
        }
    }

    public static Builder a() {
        return new AutoValue_ClientInfo.Builder();
    }

    public abstract AndroidClientInfo b();

    public abstract ClientType c();
}
