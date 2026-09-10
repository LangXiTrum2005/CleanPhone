package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0650x1 implements P1 {

    /* JADX INFO: renamed from: com.ironsource.x1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements androidx.lifecycle.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0408ja f30994a;

        /* JADX INFO: renamed from: com.ironsource.x1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class C0092a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30995a;

            static {
                int[] iArr = new int[androidx.lifecycle.m.values().length];
                try {
                    iArr[androidx.lifecycle.m.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.m.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.m.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.m.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f30995a = iArr;
            }
        }

        public a(InterfaceC0408ja listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f30994a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(androidx.lifecycle.m event, a this$0) {
            kotlin.jvm.internal.n.f(event, "$event");
            kotlin.jvm.internal.n.f(this$0, "this$0");
            int i10 = C0092a.f30995a[event.ordinal()];
            if (i10 == 1) {
                this$0.f30994a.b();
                return;
            }
            if (i10 == 2) {
                this$0.f30994a.c();
            } else if (i10 == 3) {
                this$0.f30994a.d();
            } else {
                if (i10 != 4) {
                    return;
                }
                this$0.f30994a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC0408ja interfaceC0408ja = this.f30994a;
            a aVar = obj instanceof a ? (a) obj : null;
            return kotlin.jvm.internal.n.a(interfaceC0408ja, aVar != null ? aVar.f30994a : null);
        }

        public int hashCode() {
            return this.f30994a.hashCode();
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(androidx.lifecycle.v source, androidx.lifecycle.m event) {
            kotlin.jvm.internal.n.f(source, "source");
            kotlin.jvm.internal.n.f(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new ki(1, event, this), 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "$observer");
        androidx.lifecycle.k0 k0Var = androidx.lifecycle.k0.f4555h;
        androidx.lifecycle.k0.f4555h.f4561f.a(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "$observer");
        androidx.lifecycle.k0 k0Var = androidx.lifecycle.k0.f4555h;
        androidx.lifecycle.k0.f4555h.f4561f.b(new a(observer));
    }

    @Override // com.ironsource.P1
    public void a(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new ti(observer, 1), 0L, 2, null);
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new ti(observer, 0), 0L, 2, null);
    }
}
