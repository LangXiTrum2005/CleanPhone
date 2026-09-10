package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Y7<T> {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a<ListenerType> implements Y7<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ListenerType f27994a;

        /* JADX INFO: renamed from: com.ironsource.Y7$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0050a extends AbstractRunnableC0430ke {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f27995b;

            public C0050a(Runnable runnable) {
                this.f27995b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC0430ke
            public void a() {
                this.f27995b.run();
            }
        }

        public final ListenerType a() {
            return this.f27994a;
        }

        public final void b(ListenerType listenertype) {
            this.f27994a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        public final void a(Runnable runnable, boolean z10) {
            kotlin.jvm.internal.n.f(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0050a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            kotlin.jvm.internal.n.f(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.Y7
        public void a(ListenerType listenertype) {
            this.f27994a = listenertype;
        }
    }

    void a(T t10);
}
