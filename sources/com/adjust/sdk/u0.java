package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7050g;

    public u0(ActivityState activityState) {
        this.f7044a = -1;
        this.f7045b = -1;
        this.f7046c = -1;
        this.f7047d = -1L;
        this.f7048e = -1L;
        this.f7049f = null;
        this.f7050g = null;
        if (activityState == null) {
            return;
        }
        this.f7044a = activityState.eventCount;
        this.f7045b = activityState.sessionCount;
        this.f7046c = activityState.subsessionCount;
        this.f7047d = activityState.timeSpent;
        this.f7048e = activityState.sessionLength;
        this.f7049f = activityState.uuid;
        this.f7050g = activityState.pushToken;
    }
}
