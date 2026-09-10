package com.inmobi.media;

import android.graphics.Bitmap;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3082mj extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3107nj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3082mj(C3107nj c3107nj, dern dernVar) {
        super(2, dernVar);
        this.a = c3107nj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3082mj(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3082mj(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        return AbstractC3367y5.a(this.a.a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
