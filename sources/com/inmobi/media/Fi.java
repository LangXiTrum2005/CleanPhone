package com.inmobi.media;

import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Fi {
    public final Yj a;
    public final double b;
    public final List c;

    public Fi(Yj telemetryConfigMetaData, double d, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.a = telemetryConfigMetaData;
        this.b = d;
        this.c = samplingEvents;
        Intrinsics.checkNotNullExpressionValue(Fi.class.getSimpleName(), "getSimpleName(...)");
    }

    public final boolean a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Yj yj = this.a;
        if (yj.e && !yj.f.contains(eventType)) {
            return false;
        }
        if (keyValueMap.isEmpty() || !Intrinsics.wireman(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (Intrinsics.wireman("image", keyValueMap.get("assetType")) && !this.a.b) {
            Wj wj = Wj.a;
            return false;
        }
        if (Intrinsics.wireman("gif", keyValueMap.get("assetType")) && !this.a.c) {
            Wj wj2 = Wj.a;
            return false;
        }
        if (!Intrinsics.wireman("video", keyValueMap.get("assetType")) || this.a.d) {
            return true;
        }
        Wj wj3 = Wj.a;
        return false;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (!this.c.contains(eventType)) {
            return 1;
        }
        if (this.b < this.a.g) {
            Wj wj = Wj.a;
            return 2;
        }
        Wj wj2 = Wj.a;
        return 0;
    }
}
