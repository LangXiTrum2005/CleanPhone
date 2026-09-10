package com.ironsource;

import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3772u7 {
    public static final C3772u7 a = new C3772u7();

    private C3772u7() {
    }

    public final UUID a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }
}
