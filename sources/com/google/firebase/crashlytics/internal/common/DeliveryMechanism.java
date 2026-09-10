package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes4.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SIDELOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    public final int X;

    DeliveryMechanism(int i2) {
        this.X = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.X);
    }
}
