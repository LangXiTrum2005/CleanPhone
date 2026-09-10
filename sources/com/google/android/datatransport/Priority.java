package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Priority {
    public static final Priority X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Priority f16674Y;
    public static final Priority Z;
    public static final /* synthetic */ Priority[] e0;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        X = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        f16674Y = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        Z = priority3;
        e0 = new Priority[]{priority, priority2, priority3};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) e0.clone();
    }
}
