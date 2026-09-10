package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3113l8 extends N8 {
    public /* synthetic */ C3113l8(String str, String str2, C3097k8 c3097k8, String str3, String str4) {
        this(str, str2, c3097k8, str3, new ArrayList(), str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3113l8(String assetId, String assetName, C3097k8 assetStyle, String str, List trackers, String interactionMode) {
        super(assetId, assetName, "CTA", assetStyle, str);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(interactionMode, "interactionMode");
        this.s.addAll(trackers);
        this.g = interactionMode;
    }
}
