package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0242a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0242a5 f28172a = new C0242a5();

    private C0242a5() {
    }

    public final boolean a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
