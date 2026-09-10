package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3245t8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3295v8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245t8(C3295v8 c3295v8, dern dernVar) {
        super(2, dernVar);
        this.b = c3295v8;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3245t8 c3245t8 = new C3245t8(this.b, dernVar);
        c3245t8.a = obj;
        return c3245t8;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3245t8 c3245t8 = new C3245t8(this.b, (dern) obj2);
        c3245t8.a = (Rl) obj;
        return c3245t8.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Rl mediaEvent = (Rl) this.a;
        this.b.a(mediaEvent);
        C3081mi c3081mi = this.b.b;
        if (c3081mi != null) {
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof C2845d8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C2845d8) mediaEvent).a;
                Map mapA = c3081mi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                mapA.put("payload", jSONObject.toString());
                Wj wj = Wj.a;
                Wj.b("VideoLoadStarted", mapA, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof C2922g8) {
                C2922g8 c2922g8 = (C2922g8) mediaEvent;
                Map mapA2 = c3081mi.a();
                Long latency = c2922g8.a.getLatency();
                mapA2.put("latency", Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("videoUrl", c2922g8.a.getVideoUrl());
                jSONObject2.put("cacheProgress", c2922g8.b);
                mapA2.put("payload", jSONObject2.toString());
                Wj wj2 = Wj.a;
                Wj.b("VideoLoadSuccess", mapA2, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof C3036kn) {
                Map mapA3 = c3081mi.a();
                Wj wj3 = Wj.a;
                Wj.b("VideoStart", mapA3, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof C3359xm) {
                Map mapA4 = c3081mi.a();
                Wj wj4 = Wj.a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof C2986in) {
                Map mapA5 = c3081mi.a();
                Wj wj5 = Wj.a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof C3210rn) {
                Map mapA6 = c3081mi.a();
                Wj wj6 = Wj.a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof Pl) {
                Map mapA7 = c3081mi.a();
                Wj wj7 = Wj.a;
                Wj.b("VideoComplete", mapA7, EnumC2779ak.SDK);
            } else if (mediaEvent instanceof C2793b8) {
                C2793b8 c2793b8 = (C2793b8) mediaEvent;
                Map mapA8 = c3081mi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c2793b8.a.getVideoFiles());
                mapA8.put("payload", jSONObject3.toString());
                mapA8.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(c2793b8.b));
                Wj wj8 = Wj.a;
                Wj.b("VideoLoadFailure", mapA8, EnumC2779ak.SDK);
            }
        }
        return Unit.f29295attabal;
    }
}
