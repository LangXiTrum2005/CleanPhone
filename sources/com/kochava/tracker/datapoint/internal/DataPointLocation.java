package com.kochava.tracker.datapoint.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class DataPointLocation {
    public static final DataPointLocation X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final DataPointLocation f28148Y;
    public static final /* synthetic */ DataPointLocation[] Z;

    static {
        DataPointLocation dataPointLocation = new DataPointLocation("Envelope", 0);
        X = dataPointLocation;
        DataPointLocation dataPointLocation2 = new DataPointLocation("Data", 1);
        f28148Y = dataPointLocation2;
        Z = new DataPointLocation[]{dataPointLocation, dataPointLocation2};
    }

    public static DataPointLocation valueOf(String str) {
        return (DataPointLocation) Enum.valueOf(DataPointLocation.class, str);
    }

    public static DataPointLocation[] values() {
        return (DataPointLocation[]) Z.clone();
    }
}
