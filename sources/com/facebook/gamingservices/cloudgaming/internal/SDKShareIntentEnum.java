package com.facebook.gamingservices.cloudgaming.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum SDKShareIntentEnum {
    /* JADX INFO: Fake field, exist only in values array */
    INVITE("INVITE"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST("REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    CHALLENGE("CHALLENGE"),
    /* JADX INFO: Fake field, exist only in values array */
    SHARE("SHARE");

    public final String X;

    SDKShareIntentEnum(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
