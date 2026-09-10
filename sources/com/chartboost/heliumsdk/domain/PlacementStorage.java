package com.chartboost.heliumsdk.domain;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PlacementStorage;", "", "()V", "DEFAULT_REFRESH_TIME_SECONDS", "", "MAXIMUM_FAILURES_BEFORE_PENALTY_REFRESH_TIME", "MAXIMUM_REFRESH_TIME_SECONDS", "MINIMUM_QUEUE_SIZE", "MINIMUM_REFRESH_TIME_SECONDS", "REFRESH_BY_DEFAULT", "", "defaultQueueSize", "placementQueueSize", "", "", "refreshTimes", "addQueueSize", "", "placement", "queueSize", "maxQueueSize", "addRefreshTime", "refreshTime", "getMaxRefreshTime", "getMaxTriesUntilPenaltyTime", "getQueueSize", "getRefreshTime", "shouldRefresh", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlacementStorage {
    private static final int DEFAULT_REFRESH_TIME_SECONDS = 30;
    private static final int MAXIMUM_FAILURES_BEFORE_PENALTY_REFRESH_TIME = 3;
    private static final int MAXIMUM_REFRESH_TIME_SECONDS = 240;
    private static final int MINIMUM_QUEUE_SIZE = 1;
    private static final int MINIMUM_REFRESH_TIME_SECONDS = 10;
    private static final boolean REFRESH_BY_DEFAULT = true;
    public static final PlacementStorage INSTANCE = new PlacementStorage();
    private static final int defaultQueueSize = AppConfigStorage.INSTANCE.getDefaultQueueSize();
    private static final Map<String, Integer> refreshTimes = MapsKt.t(new HashMap(), new Function1<String, Integer>() { // from class: com.chartboost.heliumsdk.domain.PlacementStorage$refreshTimes$1
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(String it) {
            Intrinsics.f(it, "it");
            return 30;
        }
    });
    private static final Map<String, Integer> placementQueueSize = MapsKt.t(new HashMap(), new Function1<String, Integer>() { // from class: com.chartboost.heliumsdk.domain.PlacementStorage$placementQueueSize$1
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(String it) {
            Intrinsics.f(it, "it");
            return Integer.valueOf(PlacementStorage.defaultQueueSize);
        }
    });

    private PlacementStorage() {
    }

    public final void addQueueSize(String placement, int queueSize, int maxQueueSize) {
        Intrinsics.f(placement, "placement");
        if (maxQueueSize < 1) {
            maxQueueSize = 1;
        }
        placementQueueSize.put(placement, Integer.valueOf(RangesKt.b(queueSize, 1, maxQueueSize)));
    }

    public final void addRefreshTime(String placement, int refreshTime) {
        Intrinsics.f(placement, "placement");
        if (refreshTime == 0) {
            refreshTimes.put(placement, 0);
            return;
        }
        if (refreshTime < 10) {
            refreshTimes.put(placement, 10);
        } else if (refreshTime > 240) {
            refreshTimes.put(placement, 240);
        } else {
            refreshTimes.put(placement, Integer.valueOf(refreshTime));
        }
    }

    public final int getMaxRefreshTime() {
        return 240;
    }

    public final int getMaxTriesUntilPenaltyTime() {
        return 3;
    }

    public final int getQueueSize(String placement) {
        Intrinsics.f(placement, "placement");
        Map<String, Integer> map = placementQueueSize;
        if (map.containsKey(placement)) {
            return ((Number) MapsKt.f(map, placement)).intValue();
        }
        return 1;
    }

    public final int getRefreshTime(String placement) {
        Intrinsics.f(placement, "placement");
        Map<String, Integer> map = refreshTimes;
        if (map.containsKey(placement)) {
            return ((Number) MapsKt.f(map, placement)).intValue();
        }
        return 30;
    }

    public final boolean shouldRefresh(String placement) {
        Intrinsics.f(placement, "placement");
        Map<String, Integer> map = refreshTimes;
        return !map.containsKey(placement) || ((Number) MapsKt.f(map, placement)).intValue() > 0;
    }
}
