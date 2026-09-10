package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThreadUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/util/gintrap;", "", "<init>", "()V", "Lkotlin/Function0;", "", "block", "runOnUiThread", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Handler;", "UI_HANDLER", "Landroid/os/Handler;", "Ljava/util/concurrent/Executor;", "uiExecutor", "Ljava/util/concurrent/Executor;", "getUiExecutor$vungle_ads_release", "()Ljava/util/concurrent/Executor;", "setUiExecutor$vungle_ads_release", "(Ljava/util/concurrent/Executor;)V", "getUiExecutor$vungle_ads_release$annotations", "", "isMainThread", "()Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class gintrap {
    public static final gintrap INSTANCE = new gintrap();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private gintrap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m3282runOnUiThread$lambda0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m3283runOnUiThread$lambda1(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new Runnable() { // from class: com.vungle.ads.internal.util.dovishness
                @Override // java.lang.Runnable
                public final void run() {
                    gintrap.m3283runOnUiThread$lambda1(block);
                }
            });
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.adultoid
                @Override // java.lang.Runnable
                public final void run() {
                    gintrap.m3282runOnUiThread$lambda0(block);
                }
            });
        }
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
