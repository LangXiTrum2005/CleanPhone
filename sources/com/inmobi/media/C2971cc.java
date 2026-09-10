package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2971cc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23495a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2971cc(String str) {
        super(0);
        this.f23495a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String errorCode = this.f23495a;
        Intrinsics.e(errorCode, "$errorCode");
        return Short.valueOf(Short.parseShort(errorCode));
    }
}
