package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3714r0 {
    private final HashMap<String, S0> a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.r0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final S0 a(String adUnitId, List<? extends NetworkSettings> providers, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        S0 s0 = this.a.get(adUnitId);
        if (s0 != null) {
            return s0;
        }
        S0 s1 = new S0(providers, i);
        this.a.put(adUnitId, s1);
        return s1;
    }
}
