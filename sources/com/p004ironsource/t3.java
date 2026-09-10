package com.p004ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/t3;", "Lcom/ironsource/m4;", "Lcom/ironsource/uk;", "observer", "", "a", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t3 implements m4 {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/t3$a;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "", "hashCode", "Lcom/ironsource/uk;", "a", "Lcom/ironsource/uk;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/uk;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final uk listener;

        /* JADX INFO: renamed from: com.ironsource.t3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0300a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27244a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f27244a = iArr;
            }
        }

        public a(uk listener) {
            Intrinsics.f(listener, "listener");
            this.listener = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a this$0) {
            Intrinsics.f(event, "$event");
            Intrinsics.f(this$0, "this$0");
            int i2 = C0300a.f27244a[event.ordinal()];
            if (i2 == 1) {
                this$0.listener.c();
                return;
            }
            if (i2 == 2) {
                this$0.listener.a();
            } else if (i2 == 3) {
                this$0.listener.d();
            } else {
                if (i2 != 4) {
                    return;
                }
                this$0.listener.b();
            }
        }

        public boolean equals(Object other) {
            uk ukVar = this.listener;
            a aVar = other instanceof a ? (a) other : null;
            return Intrinsics.a(ukVar, aVar != null ? aVar.listener : null);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            Intrinsics.f(source, "source");
            Intrinsics.f(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new G0(0, event, this), 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(uk observer) {
        Intrinsics.f(observer, "$observer");
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.j0;
        ProcessLifecycleOwner.j0.g0.a(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(uk observer) {
        Intrinsics.f(observer, "$observer");
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.j0;
        ProcessLifecycleOwner.j0.g0.c(new a(observer));
    }

    @Override // com.p004ironsource.m4
    public void a(uk observer) {
        Intrinsics.f(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new F0(observer, 0), 0L, 2, null);
    }

    @Override // com.p004ironsource.m4
    public void b(uk observer) {
        Intrinsics.f(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new F0(observer, 1), 0L, 2, null);
    }
}
