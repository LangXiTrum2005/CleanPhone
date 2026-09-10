package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0541r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, S0> f30125a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.r0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final S0 a(String adUnitId, List<? extends NetworkSettings> providers, int i10) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(providers, "providers");
        S0 s10 = this.f30125a.get(adUnitId);
        if (s10 != null) {
            return s10;
        }
        S0 s11 = new S0(providers, i10);
        this.f30125a.put(adUnitId, s11);
        return s11;
    }
}
