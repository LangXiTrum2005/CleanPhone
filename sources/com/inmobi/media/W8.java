package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class W8 extends C3040h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23319c;
    public final ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f23320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(C3040h ad, JSONArray jSONArray, String videoUrl, String videoDuration, String str, ArrayList trackers, ArrayList companionAds) {
        super(ad, jSONArray);
        Intrinsics.f(ad, "ad");
        Intrinsics.f(videoUrl, "videoUrl");
        Intrinsics.f(videoDuration, "videoDuration");
        Intrinsics.f(trackers, "trackers");
        Intrinsics.f(companionAds, "companionAds");
        this.f23317a = videoUrl;
        this.f23318b = videoDuration;
        this.f23319c = str;
        this.d = trackers;
        this.f23320e = companionAds;
    }
}
