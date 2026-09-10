package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Q9 implements O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23108a;

    public Q9(String resolvedUrl, int i2, ByteString bodyBytes, K9 responseMetaData) {
        Intrinsics.f(resolvedUrl, "resolvedUrl");
        Intrinsics.f(bodyBytes, "bodyBytes");
        Intrinsics.f(responseMetaData, "responseMetaData");
        this.f23108a = i2;
    }

    @Override // com.inmobi.media.O9
    public final int a() {
        return this.f23108a;
    }

    @Override // com.inmobi.media.O9
    public final String b() {
        return null;
    }
}
