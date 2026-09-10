package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3277uf {
    public static C3003jf a(String creativeType, GestureDetectorOnGestureListenerC2829ci webView, boolean z, String str, byte b, String str2) {
        ImpressionType impressionType;
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Cf cf = Bf.a;
        cf.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(cf.b, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        if (b == 1) {
            impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        } else if (b == 2) {
            impressionType = ImpressionType.UNSPECIFIED;
        } else if (b == 3) {
            impressionType = ImpressionType.LOADED;
        } else if (b == 4) {
            impressionType = ImpressionType.BEGIN_TO_RENDER;
        } else if (b == 5) {
            impressionType = ImpressionType.ONE_PIXEL;
        } else if (b == 6) {
            impressionType = ImpressionType.VIEWABLE;
        } else if (b == 7) {
            impressionType = ImpressionType.AUDIBLE;
        } else {
            impressionType = b == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        }
        int iHashCode = creativeType.hashCode();
        if (iHashCode != -284840886) {
            if (iHashCode != 93166550) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1425678798 && creativeType.equals("nonvideo")) {
                        return new C3003jf("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                    }
                } else if (creativeType.equals("video")) {
                    return new C3003jf("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z);
                }
            } else if (creativeType.equals("audio")) {
                return new C3003jf("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z);
            }
        } else if (creativeType.equals("unknown")) {
            Intrinsics.checkNotNullExpressionValue("vf", "access$getTAG$cp(...)");
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("vf", "access$getTAG$cp(...)");
        return null;
    }
}
