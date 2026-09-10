package com.p004ironsource;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00052\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/j9;", "", "Lcom/ironsource/j9$d;", "callback", "", "a", "b", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f25412a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/j9$a;", "Lcom/ironsource/j9;", "Lcom/ironsource/j9$d;", "callback", "", "a", "Lcom/ironsource/xe;", "b", "Lcom/ironsource/xe;", com.smartdigimkt.q0.b.i0, "Lcom/ironsource/dw;", "c", "Lcom/ironsource/dw;", "timer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProcessing", "<init>", "(Lcom/ironsource/xe;Lcom/ironsource/dw;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements j9 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final xe config;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final dw timer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final AtomicBoolean isProcessing;

        /* JADX INFO: renamed from: com.ironsource.j9$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/j9$a$a", "Lcom/ironsource/dw$a;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0283a implements dw.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f25409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f25410b;

            public C0283a(d dVar, a aVar) {
                this.f25409a = dVar;
                this.f25410b = aVar;
            }

            @Override // com.ironsource.dw.a
            public void a() {
                this.f25409a.a(new bf.a(new ye.a(this.f25410b.config.getRecoveryStrategy())));
                this.f25410b.isProcessing.set(false);
            }
        }

        public a(xe config, dw timer) {
            Intrinsics.f(config, "config");
            Intrinsics.f(timer, "timer");
            this.config = config;
            this.timer = timer;
            this.isProcessing = new AtomicBoolean(false);
        }

        @Override // com.p004ironsource.j9
        public synchronized void a() {
            this.timer.cancel();
            this.isProcessing.set(false);
        }

        @Override // com.p004ironsource.j9
        public synchronized void a(d callback) {
            Intrinsics.f(callback, "callback");
            if (this.isProcessing.compareAndSet(false, true)) {
                this.timer.a(new C0283a(callback, this));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/j9$b;", "Lcom/ironsource/j9;", "Lcom/ironsource/j9$d;", "callback", "", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements j9 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f25411b = new b();

        private b() {
        }

        @Override // com.p004ironsource.j9
        public void a() {
        }

        @Override // com.p004ironsource.j9
        public void a(d callback) {
            Intrinsics.f(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j9$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/j9$c;", "", "Lcom/ironsource/ze;", "featureFlag", "Lcom/ironsource/j9;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f25412a = new Companion();

        private Companion() {
        }

        public final j9 a() {
            return b.f25411b;
        }

        @JvmStatic
        public final j9 a(ze featureFlag) {
            Intrinsics.f(featureFlag, "featureFlag");
            if (!featureFlag.c()) {
                return b.f25411b;
            }
            we weVar = new we(featureFlag);
            dw.b bVar = new dw.b();
            bVar.b(weVar.getTimeoutInMills());
            bVar.a(weVar.getTimeoutInMills());
            return new a(weVar, new dw.d().a(bVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/j9$d;", "", "Lcom/ironsource/bf;", "result", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        void a(bf result);
    }

    @JvmStatic
    static j9 a(ze zeVar) {
        return INSTANCE.a(zeVar);
    }

    void a();

    void a(d callback);
}
