package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3160pm extends AbstractC3368y6 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final AdConfig.VastVideoConfig d;
    public final Qm e;
    public final Ml f;
    public final C3186qn g;
    public final V3 h;

    public C3160pm(String mediaDuration, ArrayList companionAds, ArrayList mediaFiles, AdConfig.VastVideoConfig vastVideoConfig, Qm videoPlayerConfig, Ml videoBeaconProcessor, C3186qn videoTelemetryHelper, V3 companionTelemetryHelper) {
        Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(videoPlayerConfig, "videoPlayerConfig");
        Intrinsics.checkNotNullParameter(videoBeaconProcessor, "videoBeaconProcessor");
        Intrinsics.checkNotNullParameter(videoTelemetryHelper, "videoTelemetryHelper");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.a = mediaDuration;
        this.b = companionAds;
        this.c = mediaFiles;
        this.d = vastVideoConfig;
        this.e = videoPlayerConfig;
        this.f = videoBeaconProcessor;
        this.g = videoTelemetryHelper;
        this.h = companionTelemetryHelper;
    }
}
