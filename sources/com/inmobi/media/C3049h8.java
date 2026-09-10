package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3049h8 extends C2984d8 implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f23659A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f23660B;
    public final boolean C;
    public final boolean D;
    public final int x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte f23661z;

    public /* synthetic */ C3049h8(String str, String str2, C3001e8 c3001e8, String str3, JSONObject jSONObject, byte b2) {
        this(str, str2, c3001e8, new ArrayList(), str3, jSONObject, b2);
    }

    public final void a(C2984d8 child) {
        Intrinsics.f(child, "child");
        int i2 = this.f23660B;
        if (i2 < this.x) {
            this.f23660B = i2 + 1;
            this.f23659A.add(child);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3033g8(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3049h8(String assetId, String assetName, C3001e8 assetStyle, List trackers, String interactionMode, JSONObject rawAssetJson, byte b2) {
        super(assetId, assetName, "CONTAINER", assetStyle, trackers);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(interactionMode, "interactionMode");
        Intrinsics.f(rawAssetJson, "rawAssetJson");
        this.x = 16;
        this.f23661z = b2;
        this.f23659A = new ArrayList();
        this.g = interactionMode;
        this.C = "root".equalsIgnoreCase(assetName);
        this.D = "card_scrollable".equalsIgnoreCase(assetName);
    }
}
