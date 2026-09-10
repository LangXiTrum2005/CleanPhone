package com.scwang.smart.refresh.layout.constant;

/* JADX INFO: loaded from: classes5.dex */
public enum RefreshState {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false);

    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f33544Y;
    public final boolean Z;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;

    RefreshState(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.X = i2 == 1;
        this.f33544Y = i2 == 2;
        this.e0 = z2;
        this.f0 = z3;
        this.g0 = z4;
        this.Z = z5;
        this.h0 = z6;
    }
}
