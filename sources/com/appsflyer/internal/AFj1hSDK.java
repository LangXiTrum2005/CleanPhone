package com.appsflyer.internal;

import java.lang.reflect.Field;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    public final String getMediationNetwork() {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = slumberous.attabal.class.getDeclaredField("attabal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.competently(obj, "");
            objM3351constructorimpl = Result.m3351constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return (String) (Result.m3356isFailureimpl(objM3351constructorimpl) ? "" : objM3351constructorimpl);
    }
}
