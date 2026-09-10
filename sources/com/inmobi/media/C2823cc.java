package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2823cc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2823cc(String error) {
        super(error);
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
