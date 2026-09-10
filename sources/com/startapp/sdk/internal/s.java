package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41458a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdPreferences.Placement f41459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41460c;

    public s(AdPreferences.Placement placement, String str) {
        this.f41459b = placement;
        this.f41460c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f41458a - ((s) obj).f41458a;
        if (j > 0) {
            return 1;
        }
        return j == 0 ? 0 : -1;
    }
}
