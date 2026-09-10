package com.kochava.core.task.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TaskState {
    public static final TaskState X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final TaskState f28081Y;
    public static final TaskState Z;
    public static final TaskState e0;
    public static final TaskState f0;
    public static final /* synthetic */ TaskState[] g0;

    static {
        TaskState taskState = new TaskState("Pending", 0);
        X = taskState;
        TaskState taskState2 = new TaskState("Delayed", 1);
        f28081Y = taskState2;
        TaskState taskState3 = new TaskState("Queued", 2);
        Z = taskState3;
        TaskState taskState4 = new TaskState("Started", 3);
        e0 = taskState4;
        TaskState taskState5 = new TaskState("Completed", 4);
        f0 = taskState5;
        g0 = new TaskState[]{taskState, taskState2, taskState3, taskState4, taskState5};
    }

    public static TaskState valueOf(String str) {
        return (TaskState) Enum.valueOf(TaskState.class, str);
    }

    public static TaskState[] values() {
        return (TaskState[]) g0.clone();
    }
}
