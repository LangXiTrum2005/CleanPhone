package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes4.dex */
public class Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionData f20746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FeatureFlagData f20747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20748c;
    public final double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f20749e;
    public final int f;

    public static class FeatureFlagData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20752c;

        public FeatureFlagData(boolean z2, boolean z3, boolean z4) {
            this.f20750a = z2;
            this.f20751b = z3;
            this.f20752c = z4;
        }
    }

    public static class SessionData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20753a;

        public SessionData(int i2) {
            this.f20753a = i2;
        }
    }

    public Settings(long j, SessionData sessionData, FeatureFlagData featureFlagData, double d, double d2, int i2) {
        this.f20748c = j;
        this.f20746a = sessionData;
        this.f20747b = featureFlagData;
        this.d = d;
        this.f20749e = d2;
        this.f = i2;
    }
}
