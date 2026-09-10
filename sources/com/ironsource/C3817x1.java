package com.ironsource;

import androidx.p001lifecycle.Lifecycle;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3817x1 implements P1 {

    /* JADX INFO: renamed from: com.ironsource.x1$a */
    public static final class a implements androidx.p001lifecycle.impassible {
        private final InterfaceC3530ga a;

        /* JADX INFO: renamed from: com.ironsource.x1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0418a {
            public static final /* synthetic */ int[] a;

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
                a = iArr;
            }
        }

        public a(InterfaceC3530ga listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a this$0) {
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i = C0418a.a[event.ordinal()];
            if (i == 1) {
                this$0.a.b();
                return;
            }
            if (i == 2) {
                this$0.a.c();
            } else if (i == 3) {
                this$0.a.d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC3530ga interfaceC3530ga = this.a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.wireman(interfaceC3530ga, aVar != null ? aVar.a : null);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(androidx.p001lifecycle.arytenoidectomy source, final Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.infiltration
                @Override // java.lang.Runnable
                public final void run() {
                    C3817x1.a.a(event, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC3530ga observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.p001lifecycle.trm.INSTANCE.attabal().getLifecycle().attabal(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC3530ga observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.p001lifecycle.trm.INSTANCE.attabal().getLifecycle().wireman(new a(observer));
    }

    @Override // com.ironsource.P1
    public void a(final InterfaceC3530ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.brighton
            @Override // java.lang.Runnable
            public final void run() {
                C3817x1.c(observer);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.P1
    public void b(final InterfaceC3530ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.imparkation
            @Override // java.lang.Runnable
            public final void run() {
                C3817x1.d(observer);
            }
        }, 0L, 2, null);
    }
}
