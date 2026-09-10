package com.kochava.core.task.manager.internal;

import com.kochava.core.task.action.internal.TaskAction;
import com.kochava.core.task.internal.Task;
import com.kochava.core.task.internal.TaskCompletedListener;
import com.kochava.core.task.internal.TaskQueue;

/* JADX INFO: loaded from: classes5.dex */
public interface TaskManagerApi {
    Task a(TaskQueue taskQueue, TaskAction taskAction);

    void b(Runnable runnable);

    Task c(TaskQueue taskQueue, TaskAction taskAction, TaskCompletedListener taskCompletedListener);
}
