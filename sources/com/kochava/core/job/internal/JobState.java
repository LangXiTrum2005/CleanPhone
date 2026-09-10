package com.kochava.core.job.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class JobState {
    public static final JobState X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final JobState f28015Y;
    public static final JobState Z;
    public static final /* synthetic */ JobState[] e0;

    static {
        JobState jobState = new JobState("Pending", 0);
        X = jobState;
        JobState jobState2 = new JobState("Started", 1);
        f28015Y = jobState2;
        JobState jobState3 = new JobState("Completed", 2);
        Z = jobState3;
        e0 = new JobState[]{jobState, jobState2, jobState3};
    }

    public static JobState valueOf(String str) {
        return (JobState) Enum.valueOf(JobState.class, str);
    }

    public static JobState[] values() {
        return (JobState[]) e0.clone();
    }
}
