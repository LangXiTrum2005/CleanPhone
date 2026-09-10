package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InstallationResponse {

    public static abstract class Builder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {
        public static final ResponseCode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final ResponseCode f20891Y;
        public static final /* synthetic */ ResponseCode[] Z;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            X = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            f20891Y = responseCode2;
            Z = new ResponseCode[]{responseCode, responseCode2};
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) Z.clone();
        }
    }

    public abstract TokenResult a();

    public abstract String b();

    public abstract String c();

    public abstract ResponseCode d();

    public abstract String e();
}
