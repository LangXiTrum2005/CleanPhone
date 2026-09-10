package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Bk extends AbstractC3318w6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bk(Ec nativeAdUnitComponent, AbstractC2863e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
    }

    @Override // com.inmobi.media.AbstractC3318w6
    public final Object a(dern dernVar) {
        return new B6();
    }
}
