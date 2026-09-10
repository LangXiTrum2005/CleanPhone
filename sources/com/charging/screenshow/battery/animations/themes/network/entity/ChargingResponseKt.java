package com.charging.screenshow.battery.animations.themes.network.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ChargingResponseKt {
    public static final ChargingVideo a(ColorCallResponse bean) {
        Intrinsics.f(bean, "bean");
        ChargingVideo chargingVideo = new ChargingVideo("color_call_" + bean.getFilename());
        chargingVideo.e(String.valueOf(bean.getFilename()));
        chargingVideo.m("https://apps.ezlifetech.com/ColorCall5_Theme/video_preview/" + chargingVideo.getName() + ".webp");
        chargingVideo.n("https://apps.ezlifetech.com/ColorCall5_Theme/video/" + chargingVideo.getName() + ".mp4");
        return chargingVideo;
    }

    public static final ChargingVideo b(Live bean) {
        Intrinsics.f(bean, "bean");
        ChargingVideo chargingVideo = new ChargingVideo("live_" + bean.getId());
        chargingVideo.e(String.valueOf(bean.getId()));
        chargingVideo.m(bean.getImageVariations().getPreviewSmall().getUrl());
        chargingVideo.n(bean.getVideoVariations().getPreviewSmall().getUrl());
        return chargingVideo;
    }
}
