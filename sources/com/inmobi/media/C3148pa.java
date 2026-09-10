package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.marial;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3148pa extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3297va a;
    public final /* synthetic */ HtmlVideoPlayerRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3148pa(C3297va c3297va, HtmlVideoPlayerRequest htmlVideoPlayerRequest, dern dernVar) {
        super(2, dernVar);
        this.a = c3297va;
        this.b = htmlVideoPlayerRequest;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3148pa(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3148pa(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC3072m9 interfaceC3072m9;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a.a;
        HtmlVideoPlayerRequest obj2 = this.b;
        gestureDetectorOnGestureListenerC2829ci.getClass();
        Intrinsics.checkNotNullParameter(obj2, "requestConfig");
        InterfaceC3072m9 interfaceC3072m10 = gestureDetectorOnGestureListenerC2829ci.i;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (gestureDetectorOnGestureListenerC2829ci.getAdConfig().getHybridNative().getIsEnabled()) {
            String maxSupportedPlayerVersion = gestureDetectorOnGestureListenerC2829ci.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            C3081mi c3081mi = gestureDetectorOnGestureListenerC2829ci.d0;
            try {
                Sm.a(maxSupportedPlayerVersion);
                gestureDetectorOnGestureListenerC2829ci.Z0 = true;
                gestureDetectorOnGestureListenerC2829ci.Y0 = new C3295v8(gestureDetectorOnGestureListenerC2829ci, gestureDetectorOnGestureListenerC2829ci.getAdConfig().getHybridNative(), obj2, gestureDetectorOnGestureListenerC2829ci.a1, gestureDetectorOnGestureListenerC2829ci.d0, gestureDetectorOnGestureListenerC2829ci.i);
                EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_PLAYER_CREATED;
                Intrinsics.checkNotNullParameter(obj2, "obj");
                gestureDetectorOnGestureListenerC2829ci.a(enumC3146p8, AbstractC3073ma.a(obj2, HtmlVideoPlayerRequest.class));
                C3295v8 c3295v8 = gestureDetectorOnGestureListenerC2829ci.Y0;
                if (c3295v8 != null) {
                    Uh videoLoadListener = new Uh(gestureDetectorOnGestureListenerC2829ci);
                    Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
                    if (!c3295v8.g.get()) {
                        HtmlVideoPlayerRequest obj3 = c3295v8.a;
                        Intrinsics.checkNotNullParameter(obj3, "obj");
                        String strValueOf = String.valueOf(AbstractC3073ma.a(obj3, HtmlVideoPlayerRequest.class));
                        EnumC3220s8[] enumC3220s8Arr = {EnumC3220s8.INIT};
                        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
                        if (c3295v8.a(enumC3220s8Arr, "createVideoPlayer", strValueOf, EnumC3220s8.LOADING)) {
                            InterfaceC3072m9 interfaceC3072m11 = c3295v8.c;
                            if (interfaceC3072m11 != null) {
                                ((C3097n9) interfaceC3072m11).b("HybridVideoPlayerHandler", "load called with video files");
                            }
                            c3295v8.m = videoLoadListener;
                            if (c3295v8.f == null) {
                                c3295v8.f = marial.preprohormone(marial.stratoscope(c3295v8.k.C, new C3245t8(c3295v8, null)), c3295v8.e);
                            }
                            N7 n7 = c3295v8.k;
                            if (!n7.h.get()) {
                                n7.a(new C2845d8(n7.a));
                                if (n7.b() == EnumC3228sg.STATE_INITIALIZED) {
                                    n7.l.set(EnumC3228sg.STATE_PREPARING);
                                    n7.s.clear();
                                    n7.s.addAll(n7.a.getVideoFiles());
                                    List list = n7.s;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((HtmlVideoFile) it.next()).getUrl());
                                    }
                                    if (arrayList.isEmpty()) {
                                        n7.a(new C2819c8(Am.NO_URL_FOUND));
                                    } else {
                                        n7.v = cutely.wireman(n7.c, null, null, new C7(n7, arrayList, null), 3, null);
                                    }
                                } else {
                                    n7.a(new C2819c8(Am.INVALID_STATE));
                                }
                            }
                        }
                    }
                }
                gestureDetectorOnGestureListenerC2829ci.getViewableAd();
            } catch (C3203rg e) {
                if (c3081mi != null) {
                    c3081mi.a(e.a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMessage", "Hybrid video is not supported on this device.");
                EnumC2767a8[] enumC2767a8Arr2 = EnumC2767a8.a;
                jSONObject.put("jsCommand", "createVideoPlayer");
                gestureDetectorOnGestureListenerC2829ci.a(EnumC3146p8.VIDEO_COMMAND_ERROR, jSONObject);
                interfaceC3072m9 = gestureDetectorOnGestureListenerC2829ci.i;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).b("HtmlVideoPlayer", "Cannot play hybrid video");
                }
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMessage", "Hybrid video is not supported on this device.");
            EnumC2767a8[] enumC2767a8Arr3 = EnumC2767a8.a;
            jSONObject2.put("jsCommand", "createVideoPlayer");
            gestureDetectorOnGestureListenerC2829ci.a(EnumC3146p8.VIDEO_COMMAND_ERROR, jSONObject2);
            interfaceC3072m9 = gestureDetectorOnGestureListenerC2829ci.i;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("HtmlVideoPlayer", "Cannot play hybrid video");
            }
        }
        return Unit.f29295attabal;
    }
}
