package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class UiExecutor implements Executor {
    public static final UiExecutor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Handler f20257Y;
    public static final /* synthetic */ UiExecutor[] Z;

    static {
        UiExecutor uiExecutor = new UiExecutor("INSTANCE", 0);
        X = uiExecutor;
        Z = new UiExecutor[]{uiExecutor};
        f20257Y = new Handler(Looper.getMainLooper());
    }

    public static UiExecutor valueOf(String str) {
        return (UiExecutor) Enum.valueOf(UiExecutor.class, str);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[]) Z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f20257Y.post(runnable);
    }
}
