package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3293v6 extends ContinuationImpl {
    public List a;
    public OmSdkInfo b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractC3318w6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3293v6(AbstractC3318w6 abstractC3318w6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = abstractC3318w6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
