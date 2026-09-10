package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ue, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/os/Handler;", "Lcom/ironsource/te$a;", "a", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class Handler {

    /* JADX INFO: renamed from: com.ironsource.ue$a */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ue$a", "Lcom/ironsource/te$a;", "Ljava/lang/Runnable;", "runnable", "", "delay", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements te.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f27416a;

        public a(android.os.Handler handler) {
            this.f27416a = handler;
        }

        @Override // com.ironsource.te.a
        public void a(Runnable runnable, long delay) {
            Intrinsics.f(runnable, "runnable");
            this.f27416a.postDelayed(runnable, delay);
        }
    }

    public static final te.a a(android.os.Handler handler) {
        Intrinsics.f(handler, "<this>");
        return new a(handler);
    }
}
