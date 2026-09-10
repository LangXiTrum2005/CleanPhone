package com.p004ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/bv;", "", "Ljava/lang/Runnable;", "action", "", "delay", "", "a", "Lcom/ironsource/ls;", "b", "Lkotlin/Lazy;", "()Lcom/ironsource/ls;", "longBlockingTasksExecutorService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv f24465a = new bv();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy longBlockingTasksExecutorService = LazyKt.b(a.f24467a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ls;", "a", "()Lcom/ironsource/ls;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<ls> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24467a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ls invoke() {
            return new ls(16, null, null, 6, null);
        }
    }

    private bv() {
    }

    private final ls a() {
        return (ls) longBlockingTasksExecutorService.getX();
    }

    public static /* synthetic */ void a(bv bvVar, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        bvVar.a(runnable, j);
    }

    public final void a(Runnable action) {
        Intrinsics.f(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void a(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        a().schedule(action, delay, TimeUnit.MILLISECONDS);
    }
}
