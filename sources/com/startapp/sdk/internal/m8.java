package com.startapp.sdk.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class m8 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f41243a;

    public m8(Handler handler) {
        this.f41243a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f41243a.post(runnable);
    }
}
