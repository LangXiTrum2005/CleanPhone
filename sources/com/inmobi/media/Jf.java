package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class jf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf f23728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(lf lfVar) {
        super(0);
        this.f23728a = lfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        lf lfVar = this.f23728a;
        return new gf(lfVar, lfVar.f23796i);
    }
}
