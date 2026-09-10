package com.p004ironsource;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J%\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ironsource/te;", "Lcom/ironsource/zu;", "Lcom/ironsource/zu$a;", "scheduleTask", "Ljava/lang/Runnable;", "task", "Lcom/ironsource/ks;", "a", "Lkotlin/time/Duration;", "delay", "(Ljava/lang/Runnable;J)Lcom/ironsource/zu$a;", "Lcom/ironsource/te$a;", "Lcom/ironsource/te$a;", "handler", "<init>", "(Lcom/ironsource/te$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class te implements zu {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a handler;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/te$a;", "", "Ljava/lang/Runnable;", "runnable", "", "delay", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(Runnable runnable, long delay);
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/te$b", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zu.a f27294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f27295b;

        public b(zu.a aVar, Runnable runnable) {
            this.f27294a = aVar;
            this.f27295b = runnable;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            if (this.f27294a.getCancelled()) {
                return;
            }
            this.f27295b.run();
        }
    }

    public te() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ks a(zu.a scheduleTask, Runnable task) {
        return new b(scheduleTask, task);
    }

    public te(a handler) {
        Intrinsics.f(handler, "handler");
        this.handler = handler;
    }

    @Override // com.p004ironsource.zu
    public zu.a a(Runnable task, long delay) {
        Intrinsics.f(task, "task");
        zu.a aVar = new zu.a();
        this.handler.a(a(aVar, task), Duration.f(delay));
        return aVar;
    }

    public /* synthetic */ te(a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Handler.a(new Handler(Looper.getMainLooper())) : aVar);
    }
}
