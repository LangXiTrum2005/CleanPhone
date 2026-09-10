package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3197ra extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3297va a;
    public final /* synthetic */ Pm b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3197ra(C3297va c3297va, Pm pm, JSONObject jSONObject, dern dernVar) {
        super(2, dernVar);
        this.a = c3297va;
        this.b = pm;
        this.c = jSONObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3197ra(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3197ra) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a.a;
        Pm action = this.b;
        JSONObject jSONObject = this.c;
        gestureDetectorOnGestureListenerC2829ci.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        C3295v8 c3295v8 = gestureDetectorOnGestureListenerC2829ci.Y0;
        if (c3295v8 != null) {
            Intrinsics.checkNotNullParameter(action, "action");
            switch (action.ordinal()) {
                case 0:
                    c3295v8.b(true);
                    break;
                case 1:
                    c3295v8.b(false);
                    break;
                case 2:
                    if (!c3295v8.g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        EnumC3220s8 enumC3220s8 = EnumC3220s8.PLAYING;
                        EnumC3220s8[] enumC3220s8Arr = {EnumC3220s8.LOADED, EnumC3220s8.PAUSED, EnumC3220s8.COMPLETED, enumC3220s8};
                        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
                        if (c3295v8.a(enumC3220s8Arr, "executeVideoPlayerActions", jSONObject2.toString(), enumC3220s8)) {
                            c3295v8.k.d();
                        }
                    }
                    break;
                case 3:
                    if (!c3295v8.g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3220s8 enumC3220s9 = EnumC3220s8.PAUSED;
                        EnumC3220s8[] enumC3220s8Arr2 = {EnumC3220s8.LOADED, enumC3220s9, EnumC3220s8.COMPLETED, EnumC3220s8.PLAYING};
                        EnumC2767a8[] enumC2767a8Arr2 = EnumC2767a8.a;
                        if (c3295v8.a(enumC3220s8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), enumC3220s9)) {
                            c3295v8.k.c();
                        }
                    }
                    break;
                case 4:
                    c3295v8.a(true);
                    break;
                case 5:
                    c3295v8.a(false);
                    break;
                case 6:
                    if (!c3295v8.g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                        EnumC3220s8 enumC3220s10 = EnumC3220s8.PAUSED;
                        EnumC3220s8[] enumC3220s8Arr3 = {EnumC3220s8.LOADED, enumC3220s10, EnumC3220s8.COMPLETED, EnumC3220s8.PLAYING};
                        EnumC2767a8[] enumC2767a8Arr3 = EnumC2767a8.a;
                        if (c3295v8.a(enumC3220s8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), enumC3220s10)) {
                            c3295v8.k.c();
                        }
                    }
                    C3377yf c3377yf = c3295v8.p;
                    if (c3377yf != null) {
                        C3011jn videoEvent = new C3011jn((long) c3295v8.k.a().getTime());
                        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
                        Ae ae = c3377yf.e;
                        if (ae != null) {
                            ae.a(videoEvent);
                        }
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gestureDetectorOnGestureListenerC2829ci.a(EnumC3146p8.VIDEO_PLAYER_ACTION_EXECUTED, jSONObject);
        } else {
            EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_COMMAND_ERROR;
            EnumC2767a8[] enumC2767a8Arr4 = EnumC2767a8.a;
            X7 obj2 = new X7(jSONObject);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC2829ci.a(enumC3146p8, AbstractC3073ma.a(obj2, X7.class));
        }
        return Unit.f29295attabal;
    }
}
