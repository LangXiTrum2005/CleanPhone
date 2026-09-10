package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zr implements AdapterStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdapterStatus.State f22698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22700c;

    public zr(AdapterStatus.State state, String str, int i10) {
        this.f22698a = state;
        this.f22699b = str;
        this.f22700c = i10;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f22699b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f22698a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f22700c;
    }
}
