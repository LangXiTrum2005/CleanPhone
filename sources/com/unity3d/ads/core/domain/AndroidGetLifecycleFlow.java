package com.unity3d.ads.core.domain;

import ak.f;
import ak.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import ck.e;
import ck.i;
import cn.d0;
import fn.d;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lfn/e;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "invoke", "()Lfn/e;", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len/r;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "Lwj/r;", "<anonymous>", "(Len/r;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {64}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends o implements jk.a {
            final /* synthetic */ AndroidGetLifecycleFlow$invoke$2$listener$1 $listener;
            final /* synthetic */ AndroidGetLifecycleFlow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
                super(0);
                this.this$0 = androidGetLifecycleFlow;
                this.$listener = androidGetLifecycleFlow$invoke$2$listener$1;
            }

            @Override // jk.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3221invoke();
                return r.f53297a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3221invoke() {
                ((Application) this.this$0.applicationContext).unregisterActivityLifecycleCallbacks(this.$listener);
            }
        }

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = AndroidGetLifecycleFlow.this.new AnonymousClass2(fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(en.r rVar, f fVar) {
            return ((AnonymousClass2) create(rVar, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                final en.r rVar = (en.r) this.L$0;
                ?? r0 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        n.f(activity, "activity");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(rVar2, activity, bundle, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        n.f(activity, "activity");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(rVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        n.f(activity, "activity");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(rVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        n.f(activity, "activity");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(rVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        n.f(activity, "activity");
                        n.f(bundle, "bundle");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(rVar2, activity, bundle, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        n.f(activity, "activity");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(rVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        n.f(activity, "activity");
                        en.r rVar2 = rVar;
                        d0.w(rVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(rVar2, activity, null), 3);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidGetLifecycleFlow.this, r0);
                this.label = 1;
                Object objA = x7.a.a(rVar, anonymousClass1, this);
                bk.a aVar = bk.a.f5708a;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    public AndroidGetLifecycleFlow(Context applicationContext) {
        n.f(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final fn.e invoke() {
        if (!(this.applicationContext instanceof Application)) {
            throw new IllegalArgumentException("Application context is required");
        }
        return new d(new AnonymousClass2(null), l.f3620a, -2, en.a.f40122a);
    }
}
