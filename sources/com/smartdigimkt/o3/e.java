package com.smartdigimkt.o3;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    NO_HANDLE(0),
    HANDLE_SUCCESS(1),
    HANDLE_FAIL(2),
    HANDLE_SUCCESS_WITH_WEB_CLICK(3),
    HANDLE_DEEPLINK_REFUSE(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37358a;

    e(int i2) {
        this.f37358a = i2;
    }

    public static e a(int i2) {
        for (e eVar : values()) {
            if (eVar.f37358a == i2) {
                return eVar;
            }
        }
        return NO_HANDLE;
    }

    public int c() {
        return this.f37358a;
    }
}
