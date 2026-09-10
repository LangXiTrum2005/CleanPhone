package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3024g extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3040h f23618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3024g(C3040h c3040h) {
        super(0);
        this.f23618a = c3040h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AdMetaInfo(this.f23618a.o(), this.f23618a.E());
    }
}
