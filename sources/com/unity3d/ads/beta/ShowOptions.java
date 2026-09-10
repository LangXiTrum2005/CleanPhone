package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/beta/ShowOptions;", "", "extras", "", "", "(Ljava/util/Map;)V", "getExtras", "()Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShowOptions {
    private final Map<String, String> extras;

    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public ShowOptions(Map<String, String> extras) {
        Intrinsics.f(extras, "extras");
        this.extras = extras;
    }

    public /* synthetic */ ShowOptions(Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmptyMap.X : map);
    }
}
