package com.kochava.core.task.internal;

/* JADX INFO: loaded from: classes5.dex */
public enum TaskQueue {
    UI(true),
    Worker(true),
    IO(false);

    public final boolean X;

    TaskQueue(boolean z2) {
        this.X = z2;
    }
}
