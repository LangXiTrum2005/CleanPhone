package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TokenResult {

    public static abstract class Builder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {
        public static final ResponseCode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final ResponseCode f20896Y;
        public static final ResponseCode Z;
        public static final /* synthetic */ ResponseCode[] e0;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            X = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            f20896Y = responseCode2;
            ResponseCode responseCode3 = new ResponseCode("AUTH_ERROR", 2);
            Z = responseCode3;
            e0 = new ResponseCode[]{responseCode, responseCode2, responseCode3};
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) e0.clone();
        }
    }

    public abstract ResponseCode a();

    public abstract String b();

    public abstract long c();
}
