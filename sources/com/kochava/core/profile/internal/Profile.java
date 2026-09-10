package com.kochava.core.profile.internal;

import android.content.Context;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.action.internal.TaskActionListener;
import com.kochava.core.task.internal.TaskCompletedListener;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.tracker.controller.internal.Controller;
import com.kochava.tracker.log.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Profile implements ProfileApi, TaskActionListener, TaskCompletedListener {
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TaskManagerApi f28053Y;
    public final Object Z = new Object();
    public final Object e0 = new Object();
    public final CountDownLatch f0 = new CountDownLatch(1);
    public volatile boolean g0 = false;
    public volatile Controller h0 = null;

    public Profile(Context context, TaskManagerApi taskManagerApi) {
        this.X = context;
        this.f28053Y = taskManagerApi;
    }

    public final boolean a() {
        boolean z2;
        synchronized (this.e0) {
            z2 = this.f0.getCount() == 0;
        }
        return z2;
    }

    @Override // com.kochava.core.task.action.internal.TaskActionListener
    public final void b() {
        synchronized (this.Z) {
            e();
        }
        synchronized (this.e0) {
            this.f0.countDown();
        }
    }

    @Override // com.kochava.core.task.internal.TaskCompletedListener
    public final void c(boolean z2) {
        Controller controller;
        synchronized (this.e0) {
            controller = this.h0;
        }
        if (controller != null) {
            synchronized (controller) {
                try {
                    controller.r();
                    controller.q();
                    controller.v();
                    controller.f28107e.i();
                    ClassLoggerApi classLoggerApi = Controller.y;
                    StringBuilder sb = new StringBuilder("This ");
                    sb.append(controller.d.m().h() ? "is" : "is not");
                    sb.append(" the first tracker SDK launch");
                    Logger.a(classLoggerApi, sb.toString());
                    Logger.c(classLoggerApi, "The kochava device id is " + ObjectUtil.b(controller.d.m().f(), controller.d.m().e(), new String[0]));
                    controller.g.start();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d(Controller controller) {
        synchronized (this.e0) {
            try {
                if (this.g0) {
                    return;
                }
                this.g0 = true;
                this.h0 = controller;
                this.f28053Y.c(TaskQueue.IO, new TaskAction(this), this).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void e();

    public final void f(long j) {
        if (a()) {
            return;
        }
        synchronized (this.e0) {
            if (!this.g0) {
                throw new ProfileLoadException("Failed to load persisted profile. attempted access before loading.");
            }
        }
        try {
            if (j <= 0) {
                this.f0.await();
            } else if (!this.f0.await(j, TimeUnit.MILLISECONDS)) {
                throw new ProfileLoadException("Failed to load persisted profile, timed out.");
            }
        } catch (InterruptedException e2) {
            throw new ProfileLoadException(e2);
        }
    }
}
