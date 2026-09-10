package com.scwang.smart.refresh.layout.constant;

/* JADX INFO: loaded from: classes5.dex */
public class DimensionStatus {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DimensionStatus f33538c;
    public static final DimensionStatus d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DimensionStatus f33539e;
    public static final DimensionStatus f;
    public static final DimensionStatus g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DimensionStatus f33540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DimensionStatus[] f33541i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33543b;

    static {
        DimensionStatus dimensionStatus = new DimensionStatus(0, false);
        f33538c = dimensionStatus;
        DimensionStatus dimensionStatus2 = new DimensionStatus(1, true);
        DimensionStatus dimensionStatus3 = new DimensionStatus(2, false);
        d = dimensionStatus3;
        DimensionStatus dimensionStatus4 = new DimensionStatus(3, true);
        DimensionStatus dimensionStatus5 = new DimensionStatus(4, false);
        f33539e = dimensionStatus5;
        DimensionStatus dimensionStatus6 = new DimensionStatus(5, true);
        DimensionStatus dimensionStatus7 = new DimensionStatus(6, false);
        f = dimensionStatus7;
        DimensionStatus dimensionStatus8 = new DimensionStatus(7, true);
        DimensionStatus dimensionStatus9 = new DimensionStatus(8, false);
        g = dimensionStatus9;
        DimensionStatus dimensionStatus10 = new DimensionStatus(9, true);
        f33540h = dimensionStatus10;
        f33541i = new DimensionStatus[]{dimensionStatus, dimensionStatus2, dimensionStatus3, dimensionStatus4, dimensionStatus5, dimensionStatus6, dimensionStatus7, dimensionStatus8, dimensionStatus9, dimensionStatus10, new DimensionStatus(10, false), new DimensionStatus(10, true)};
    }

    public DimensionStatus(int i2, boolean z2) {
        this.f33542a = i2;
        this.f33543b = z2;
    }

    public final boolean a(DimensionStatus dimensionStatus) {
        int i2 = dimensionStatus.f33542a;
        int i3 = this.f33542a;
        if (i3 >= i2) {
            return (!this.f33543b || f33540h == this) && i3 == i2;
        }
        return true;
    }

    public final DimensionStatus b() {
        if (!this.f33543b) {
            return this;
        }
        DimensionStatus dimensionStatus = f33541i[this.f33542a - 1];
        return !dimensionStatus.f33543b ? dimensionStatus : f33538c;
    }
}
