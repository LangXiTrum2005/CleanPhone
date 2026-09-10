package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3272ua extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3297va a;
    public final /* synthetic */ VideoViewPosition b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3272ua(C3297va c3297va, VideoViewPosition videoViewPosition, String str, dern dernVar) {
        super(2, dernVar);
        this.a = c3297va;
        this.b = videoViewPosition;
        this.c = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3272ua(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3272ua) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a.a;
        VideoViewPosition newVideoViewPosition = this.b;
        String str = this.c;
        gestureDetectorOnGestureListenerC2829ci.getClass();
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "videoViewPosition");
        C3295v8 c3295v8 = gestureDetectorOnGestureListenerC2829ci.Y0;
        if (c3295v8 != null) {
            Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
            if (!c3295v8.g.get()) {
                EnumC3220s8[] enumC3220s8Arr = {EnumC3220s8.LOADED, EnumC3220s8.PLAYING, EnumC3220s8.PAUSED, EnumC3220s8.COMPLETED};
                EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
                if (C3295v8.a(c3295v8, enumC3220s8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    c3295v8.k.a(newVideoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC2829ci.a(EnumC3146p8.VIDEO_PLAYER_POSITION_UPDATED, str);
        } else {
            EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_COMMAND_ERROR;
            EnumC2767a8[] enumC2767a8Arr2 = EnumC2767a8.a;
            X7 obj2 = new X7((Object) str);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC2829ci.a(enumC3146p8, AbstractC3073ma.a(obj2, X7.class));
        }
        return Unit.f29295attabal;
    }
}
