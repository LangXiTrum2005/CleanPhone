package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.thinkup.core.common.n.mo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class xb extends vb implements rj {
    public final MediaEvents k;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ki f15535c;
        public final /* synthetic */ xb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ki kiVar, xb xbVar, Continuation continuation) {
            super(2, continuation);
            this.f15535c = kiVar;
            this.d = xbVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f15535c, this.d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:5:0x000b, B:6:0x0015, B:43:0x00c1, B:8:0x001a, B:11:0x0024, B:14:0x0032, B:17:0x003c, B:18:0x0043, B:20:0x004b, B:21:0x0056, B:24:0x005f, B:25:0x006c, B:28:0x0075, B:29:0x0080, B:32:0x0089, B:33:0x0093, B:36:0x009c, B:37:0x00a6, B:40:0x00af, B:41:0x00b9, B:44:0x00d9), top: B:52:0x000b }] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Instruction removed from duplicated block: B:43:0x00c1, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15534b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                String strA = this.f15535c.a();
                switch (strA.hashCode()) {
                    case -1638835128:
                        if (!strA.equals("midpoint")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.midpoint();
                        }
                        break;
                    case -1337830390:
                        if (!strA.equals("thirdQuartile")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.thirdQuartile();
                        }
                        break;
                    case -934426579:
                        if (!strA.equals("resume")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.resume();
                        }
                        break;
                    case -599445191:
                        if (!strA.equals("complete")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.complete();
                        }
                        break;
                    case 3532159:
                        if (!strA.equals("skip")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.skipped();
                        }
                        break;
                    case 94750088:
                        if (!strA.equals("click")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.adUserInteraction(InteractionType.CLICK);
                        }
                        break;
                    case 106440182:
                        if (!strA.equals("pause")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.pause();
                        }
                        break;
                    case 120623625:
                        if (!strA.equals("impression")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.c();
                        }
                        break;
                    case 560220243:
                        if (!strA.equals("firstQuartile")) {
                            za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.d.k.firstQuartile();
                        }
                        break;
                    default:
                        za.a("No viewability action taken on video " + this.f15535c.a(), (Throwable) null, 2, (Object) null);
                        break;
                }
            } catch (Exception e2) {
                za.b("Viewability update for " + this.f15535c.a() + " failed.", e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15536b;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, Continuation continuation) {
            super(2, continuation);
            this.d = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return xb.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15536b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                xb.this.k.volumeChange(this.d);
            } catch (Exception e2) {
                za.b("Viewability video player volume failed to update to " + this.d + mo.ono, e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15538b;
        public final /* synthetic */ float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f15540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, float f2, Continuation continuation) {
            super(2, continuation);
            this.d = f;
            this.f15540e = f2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return xb.this.new c(this.d, this.f15540e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15538b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                xb.this.k.start(this.d, this.f15540e);
            } catch (Exception e2) {
                za.b("Start viewability media event failed.", e2);
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(kj manager, AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents, View videoView) {
        super(manager, adSession, adEvents, videoView);
        Intrinsics.f(manager, "manager");
        Intrinsics.f(adSession, "adSession");
        Intrinsics.f(adEvents, "adEvents");
        Intrinsics.f(mediaEvents, "mediaEvents");
        Intrinsics.f(videoView, "videoView");
        this.k = mediaEvents;
    }

    @Override // com.chartboost.sdk.impl.vb, com.chartboost.sdk.impl.oj
    public void b() {
        a(qj.STARTED_VIDEO);
    }

    @Override // com.chartboost.sdk.impl.rj
    public void a(ki videoEvent) {
        Intrinsics.f(videoEvent, "videoEvent");
        if (e()) {
            BuildersKt.c(d(), null, null, new a(videoEvent, this, null), 3);
        }
    }

    @Override // com.chartboost.sdk.impl.vb, com.chartboost.sdk.impl.oj
    public void a(float f) {
        BuildersKt.c(d(), null, null, new b(f, null), 3);
    }

    @Override // com.chartboost.sdk.impl.rj
    public void a(float f, float f2) {
        if (e()) {
            BuildersKt.c(d(), null, null, new c(Math.max(f, 0.0f), Math.min(Math.max(f2, 0.0f), 1.0f), null), 3);
        }
    }
}
