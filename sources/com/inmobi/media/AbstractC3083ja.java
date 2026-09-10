package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3083ja {
    public static C3035ga a(String creativeType, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, boolean z2, String str, byte b2, String str2) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        ImpressionType impressionType;
        Intrinsics.f(creativeType, "creativeType");
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            C3163oa c3163oa = AbstractC3147na.f23833a;
            c3163oa.getClass();
            adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(c3163oa.f23872b, gestureDetectorOnGestureListenerC3005ec, str, str2);
            Intrinsics.e(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        } else {
            adSessionContextCreateHtmlAdSessionContext = null;
        }
        if (b2 == 1) {
            impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        } else if (b2 == 2) {
            impressionType = ImpressionType.UNSPECIFIED;
        } else if (b2 == 3) {
            impressionType = ImpressionType.LOADED;
        } else if (b2 == 4) {
            impressionType = ImpressionType.BEGIN_TO_RENDER;
        } else if (b2 == 5) {
            impressionType = ImpressionType.ONE_PIXEL;
        } else if (b2 == 6) {
            impressionType = ImpressionType.VIEWABLE;
        } else if (b2 == 7) {
            impressionType = ImpressionType.AUDIBLE;
        } else {
            impressionType = b2 == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        }
        int iHashCode = creativeType.hashCode();
        if (iHashCode == -284840886) {
            creativeType.equals("unknown");
        } else if (iHashCode != 93166550) {
            if (iHashCode != 112202875) {
                if (iHashCode == 1425678798 && creativeType.equals("nonvideo")) {
                    return new C3035ga("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                }
            } else if (creativeType.equals("video")) {
                return new C3035ga("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z2);
            }
        } else if (creativeType.equals("audio")) {
            return new C3035ga("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z2);
        }
        return null;
    }
}
