package com.inmobi.media;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3003jf implements InterfaceC2889f1 {
    public final String a;
    public final ImpressionType b;
    public AdSessionContext c;
    public final boolean d;
    public byte e;
    public AdSession f;

    public C3003jf(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z) {
        Intrinsics.checkNotNullParameter(mAdSessionType, "mAdSessionType");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        this.a = mAdSessionType;
        this.b = impressionType;
        this.c = adSessionContext;
        this.d = z;
    }

    public static boolean a(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        taiyuan taiyuanVar = P9.a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b) + ", expectedState :: " + ((int) b2))));
        return false;
    }

    public static boolean a(byte b) {
        if (b > 0) {
            return true;
        }
        taiyuan taiyuanVar = P9.a;
        P9.a(new L2(new Exception("Omid AdSession State Error currentState :: " + ((int) b) + ", expectedState :: 1")));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    public final void a(WebView view, Map map) {
        AdSession adSession;
        AdSession adSession2;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        Intrinsics.checkNotNullParameter(view, "trackingView");
        if (this.f == null) {
            boolean z = this.d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            switch (this.a) {
                case "native_display_ad":
                    owner2 = Owner.NATIVE;
                    owner = Owner.NONE;
                    creativeType = CreativeType.NATIVE_DISPLAY;
                    break;
                case "html_display_ad":
                    owner = Owner.NONE;
                    creativeType = CreativeType.HTML_DISPLAY;
                    break;
                case "native_video_ad":
                    owner2 = Owner.NATIVE;
                    creativeType2 = CreativeType.VIDEO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                case "html_audio_ad":
                    creativeType2 = CreativeType.AUDIO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                case "html_video_ad":
                    creativeType2 = CreativeType.VIDEO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                default:
                    creativeType = creativeType3;
                    owner = null;
                    break;
            }
            AdSession adSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.b, owner2, owner, z), this.c);
            Intrinsics.checkNotNullExpressionValue(adSession3, "createAdSession(...)");
            this.f = adSession3;
            if (adSession3 != null) {
                String str = this.a;
                Intrinsics.checkNotNullParameter(adSession3, "adSession");
                if (Intrinsics.wireman(str, "native_video_ad")) {
                    MediaEvents.createMediaEvents(adSession3);
                    AdEvents.createAdEvents(adSession3);
                } else {
                    AdEvents.createAdEvents(adSession3);
                }
                this.e = (byte) 1;
            }
        }
        Intrinsics.checkNotNullParameter(view, "view");
        if (a(this.e, (byte) 1) && (adSession2 = this.f) != null) {
            adSession2.registerAdView(view);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View childView = (View) entry.getKey();
                FriendlyObstructionPurpose obstructionCode = (FriendlyObstructionPurpose) entry.getValue();
                Intrinsics.checkNotNullParameter(childView, "childView");
                Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
                if (a(this.e) && (adSession = this.f) != null) {
                    adSession.addFriendlyObstruction(childView, obstructionCode, null);
                }
            }
        }
        if (a(this.e, (byte) 1)) {
            AdSession adSession4 = this.f;
            if (adSession4 != null) {
                adSession4.start();
            }
            this.e = (byte) 2;
        }
    }
}
