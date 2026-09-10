package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3394z7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ N7 a;
    public final /* synthetic */ C2896f8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3394z7(dern dernVar, N7 n7, C2896f8 c2896f8) {
        super(2, dernVar);
        this.a = n7;
        this.b = c2896f8;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3394z7(dernVar, this.a, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3394z7((dern) obj2, this.a, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.l.set(EnumC3228sg.STATE_PREPARED);
        this.a.p.seekTo(0L);
        C3121o8 c3121o8 = this.a.z;
        if (!c3121o8.g && (surface = c3121o8.e) != null) {
            c3121o8.g = true;
            c3121o8.b.setVideoSurface(surface);
        }
        N7 n7 = this.a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.b.b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.b.a);
        htmlVideoPlaybackState.setLatency(igo.attabal.marial(System.currentTimeMillis() - this.a.u));
        htmlVideoPlaybackState.setMuted(this.a.y.e);
        EnumC2996j8[] enumC2996j8Arr = EnumC2996j8.a;
        htmlVideoPlaybackState.setState(com.ironsource.X3.i.s);
        htmlVideoPlaybackState.setTime(this.a.p.getCurrentPosition() / 1000.0f);
        n7.a(new C2922g8(htmlVideoPlaybackState, this.b.c));
        return Unit.f29295attabal;
    }
}
