package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource {
    public static final DataSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final DataSource f12350Y;
    public static final DataSource Z;
    public static final DataSource e0;
    public static final DataSource f0;
    public static final /* synthetic */ DataSource[] g0;

    static {
        DataSource dataSource = new DataSource("LOCAL", 0);
        X = dataSource;
        DataSource dataSource2 = new DataSource("REMOTE", 1);
        f12350Y = dataSource2;
        DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
        Z = dataSource3;
        DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
        e0 = dataSource4;
        DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
        f0 = dataSource5;
        g0 = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) g0.clone();
    }
}
