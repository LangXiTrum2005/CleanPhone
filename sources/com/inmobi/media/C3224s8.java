package com.inmobi.media;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3224s8 extends C2984d8 {
    public final String x;
    public final Lazy y;

    public /* synthetic */ C3224s8(String str, String str2, C3001e8 c3001e8, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, c3001e8, str3, new ArrayList(), str4, jSONObject);
    }

    public static final I4 a(C3224s8 c3224s8, String str) {
        c3224s8.getClass();
        return Build.VERSION.SDK_INT < 28 ? new J4(str) : new X0(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224s8(String assetId, String assetName, C3001e8 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "GIF", assetStyle, trackers);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(url, "url");
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(interactionMode, "interactionMode");
        this.x = "s8";
        this.y = LazyKt.b(new C3208r8(this, url));
        Uc.a(new A.F(url, this, jSONObject, interactionMode, 2));
    }

    public static final void a(String url, C3224s8 this$0, JSONObject jSONObject, String interactionMode) {
        Intrinsics.f(url, "$url");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(interactionMode, "$interactionMode");
        C3072j c3072jB = Nc.a().b(url);
        this$0.f23516e = c3072jB != null ? c3072jB.f23704c : null;
        if (jSONObject != null) {
            this$0.g = interactionMode;
        }
    }
}
