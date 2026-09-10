package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3173p4 implements O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3125m4 f23881a;

    public C3173p4(String url, EnumC3125m4 errorCode) {
        Intrinsics.f(url, "url");
        Intrinsics.f(errorCode, "errorCode");
        this.f23881a = errorCode;
        ByteString byteString = ByteString.e0;
    }

    @Override // com.inmobi.media.O9
    public final int a() {
        return this.f23881a.f23808a;
    }

    @Override // com.inmobi.media.O9
    public final String b() {
        return this.f23881a.name();
    }
}
