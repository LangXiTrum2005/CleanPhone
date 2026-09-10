package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0005\u0005\u0007\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/dw;", "", "Lcom/ironsource/dw$a;", "callback", "", "a", com.smartdigimkt.o1.b.P3, "b", "c", "d", "e", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface dw {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/ironsource/dw$a;", "", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ironsource/dw$b;", "", "", "a", "J", "b", "()J", "(J)V", "duration", "countDownInterval", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long duration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long countDownInterval;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCountDownInterval() {
            return this.countDownInterval;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final void a(long j) {
            this.countDownInterval = j;
        }

        public final void b(long j) {
            this.duration = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/dw$c;", "", "Lcom/ironsource/dw$b;", "timerConfig", "Lcom/ironsource/dw;", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        dw a(b timerConfig);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/dw$d;", "Lcom/ironsource/dw$c;", "Lcom/ironsource/dw$b;", "timerConfig", "Lcom/ironsource/dw;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements c {
        @Override // com.ironsource.dw.c
        public dw a(b timerConfig) {
            Intrinsics.f(timerConfig, "timerConfig");
            return new e(new fw(timerConfig.getDuration()));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/dw$e;", "Lcom/ironsource/dw;", "Lcom/ironsource/dw$a;", "callback", "", "a", com.smartdigimkt.o1.b.P3, "Lcom/ironsource/fw;", "Lcom/ironsource/fw;", "timer", "<init>", "(Lcom/ironsource/fw;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements dw {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final fw timer;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/dw$e$a", "Lcom/ironsource/fw$a;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements fw.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f24852a;

            public a(a aVar) {
                this.f24852a = aVar;
            }

            @Override // com.ironsource.fw.a
            public void a() {
                this.f24852a.a();
            }
        }

        public e(fw timer) {
            Intrinsics.f(timer, "timer");
            this.timer = timer;
        }

        @Override // com.p004ironsource.dw
        public void a(a callback) {
            Intrinsics.f(callback, "callback");
            this.timer.a((fw.a) new a(callback));
        }

        @Override // com.p004ironsource.dw
        public void cancel() {
            this.timer.e();
        }
    }

    void a(a callback);

    void cancel();
}
