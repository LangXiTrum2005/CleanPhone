package com.p004ironsource;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/vg;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "(Ljava/lang/Object;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface vg<T> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\rR$\u0010\f\u001a\u0004\u0018\u00018\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/ironsource/vg$a;", "ListenerType", "Lcom/ironsource/vg;", "Ljava/lang/Runnable;", "runnable", "", "predicate", "", "a", "", "instanceId", PglCryptUtils.KEY_MESSAGE, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static class a<ListenerType> implements vg<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private ListenerType listener;

        /* JADX INFO: renamed from: com.ironsource.vg$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/vg$a$a", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0301a extends ks {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f27509a;

            public C0301a(Runnable runnable) {
                this.f27509a = runnable;
            }

            @Override // com.p004ironsource.ks
            public void a() {
                this.f27509a.run();
            }
        }

        public final ListenerType a() {
            return this.listener;
        }

        public final void b(ListenerType listenertype) {
            this.listener = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            aVar.a(runnable, z2);
        }

        @Override // com.p004ironsource.vg
        public void a(ListenerType listener) {
            this.listener = listener;
        }

        public final void a(Runnable runnable, boolean predicate) {
            Intrinsics.f(runnable, "runnable");
            if (predicate) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0301a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            Intrinsics.f(instanceId, "instanceId");
            Intrinsics.f(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }
    }

    void a(T listener);
}
