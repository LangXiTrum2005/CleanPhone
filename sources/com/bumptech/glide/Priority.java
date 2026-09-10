package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Priority {
    public static final Priority X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Priority f12300Y;
    public static final Priority Z;
    public static final Priority e0;
    public static final /* synthetic */ Priority[] f0;

    static {
        Priority priority = new Priority("IMMEDIATE", 0);
        X = priority;
        Priority priority2 = new Priority("HIGH", 1);
        f12300Y = priority2;
        Priority priority3 = new Priority("NORMAL", 2);
        Z = priority3;
        Priority priority4 = new Priority("LOW", 3);
        e0 = priority4;
        f0 = new Priority[]{priority, priority2, priority3, priority4};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) f0.clone();
    }
}
