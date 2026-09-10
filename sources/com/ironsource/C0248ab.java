package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;

/* JADX INFO: renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0248ab implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlayImpressionDataListener f28209a;

    public C0248ab(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f28209a = listener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.f28209a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0248ab) {
            return kotlin.jvm.internal.n.a(this.f28209a, ((C0248ab) obj).f28209a);
        }
        return false;
    }

    public int hashCode() {
        return this.f28209a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(W8 impressionData) {
        kotlin.jvm.internal.n.f(impressionData, "impressionData");
        this.f28209a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.d()));
    }
}
