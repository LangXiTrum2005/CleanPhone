package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3256u8 extends C2984d8 {
    public /* synthetic */ C3256u8(String str, String str2, C3001e8 c3001e8, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, c3001e8, str3, new ArrayList(), str4, jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3256u8(String assetId, String assetName, C3001e8 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "IMAGE", assetStyle, trackers);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(url, "url");
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(interactionMode, "interactionMode");
        this.f23516e = url;
        if (jSONObject != null) {
            this.g = interactionMode;
        }
    }
}
