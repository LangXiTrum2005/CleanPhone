package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3247ta extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3297va a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3247ta(C3297va c3297va, Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, dern dernVar) {
        super(2, dernVar);
        this.a = c3297va;
        this.b = ref$ObjectRef;
        this.c = countDownLatch;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3247ta(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3247ta) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, org.json.JSONObject] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            HtmlVideoPlaybackState obj2 = this.a.a.getPlaybackState();
            if (obj2 == null) {
                obj2 = new HtmlVideoPlaybackState();
            }
            Ref$ObjectRef ref$ObjectRef = this.b;
            Intrinsics.checkNotNullParameter(obj2, "obj");
            ref$ObjectRef.element = AbstractC3073ma.a(obj2, HtmlVideoPlaybackState.class);
            return Unit.f29295attabal;
        } finally {
            this.c.countDown();
        }
    }
}
