package com.inmobi.media;

import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class N8 extends C2984d8 {
    public /* synthetic */ N8(String str, String str2, M8 m8, String str3) {
        this(str, str2, AdPreferences.TYPE_TEXT, m8, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(String assetId, String assetName, String assetType, M8 assetStyle, String str) {
        super(assetId, assetName, assetType, assetStyle, 16);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetType, "assetType");
        Intrinsics.f(assetStyle, "assetStyle");
        this.f23516e = str;
    }
}
