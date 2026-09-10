package com.p004ironsource;

import android.os.Handler;
import android.os.Looper;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u0007\u001a\u0004\u0018\u00010\rJ\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0007\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006#"}, d2 = {"Lcom/ironsource/pg;", "Lcom/ironsource/zv;", "Ljava/lang/Runnable;", "action", "", f.j, "", "a", "", "delay", "d", "b", "c", "Landroid/os/Looper;", "Ljava/util/concurrent/ThreadPoolExecutor;", "e", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiHandler", "Z", "()Z", "(Z)V", "useSharedExecutorService", "Lcom/ironsource/ls;", "Lkotlin/Lazy;", "()Lcom/ironsource/ls;", "executorService", "Lcom/ironsource/gk;", "Lcom/ironsource/gk;", "backgroundHandler", "publisherCallbackHandler", g.f40227p, "releaseHandler", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pg implements zv {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean useSharedExecutorService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final gk backgroundHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final gk publisherCallbackHandler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final gk releaseHandler;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg f26494a = new pg();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Lazy executorService = LazyKt.b(a.f26498a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ls;", "a", "()Lcom/ironsource/ls;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<ls> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26498a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ls invoke() {
            return new ls(0, null, null, 7, null);
        }
    }

    static {
        gk gkVar = new gk("isadplayer-background");
        gkVar.start();
        gkVar.a();
        backgroundHandler = gkVar;
        gk gkVar2 = new gk("isadplayer-publisher-callbacks");
        gkVar2.start();
        gkVar2.a();
        publisherCallbackHandler = gkVar2;
        gk gkVar3 = new gk("isadplayer-release");
        gkVar3.start();
        gkVar3.a();
        releaseHandler = gkVar3;
    }

    private pg() {
    }

    private final ls b() {
        return (ls) executorService.getX();
    }

    private final boolean f(Runnable action) {
        return useSharedExecutorService && b().getQueue().contains(action);
    }

    public final Looper a() {
        return backgroundHandler.getLooper();
    }

    public final ThreadPoolExecutor c() {
        return b();
    }

    public final void d(Runnable action) {
        Intrinsics.f(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void e(Runnable action) {
        Intrinsics.f(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            releaseHandler.b(action);
        }
    }

    public static /* synthetic */ void a(pg pgVar, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        pgVar.b(runnable, j);
    }

    public static /* synthetic */ void b(pg pgVar, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        pgVar.c(runnable, j);
    }

    public static /* synthetic */ void c(pg pgVar, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        pgVar.d(runnable, j);
    }

    public final void d(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        uiHandler.postDelayed(action, delay);
    }

    @Override // com.p004ironsource.zv
    public void a(Runnable action) {
        Intrinsics.f(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void b(Runnable action) {
        Intrinsics.f(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(Runnable action) {
        Intrinsics.f(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final boolean d() {
        return useSharedExecutorService;
    }

    @Override // com.p004ironsource.zv
    public void a(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        if (useSharedExecutorService) {
            b().schedule(action, delay, TimeUnit.MILLISECONDS);
        } else {
            releaseHandler.a(action, delay);
        }
    }

    public final void b(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        backgroundHandler.a(action, delay);
    }

    public final void c(Runnable action, long delay) {
        Intrinsics.f(action, "action");
        publisherCallbackHandler.a(action, delay);
    }

    public final void a(boolean z2) {
        useSharedExecutorService = z2;
    }
}
