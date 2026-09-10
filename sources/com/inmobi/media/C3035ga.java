package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.PlayerState;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3035ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImpressionType f23635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSessionContext f23636c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f23637e;
    public AdSession f;
    public C3311y g;

    public C3035ga(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z2) {
        Intrinsics.f(mAdSessionType, "mAdSessionType");
        Intrinsics.f(impressionType, "impressionType");
        this.f23634a = mAdSessionType;
        this.f23635b = impressionType;
        this.f23636c = adSessionContext;
        this.d = z2;
    }

    public static boolean a(byte b2, byte b3) {
        if (b2 == b3) {
            return true;
        }
        S5 s5 = S5.f23167a;
        S5.d.a(new C3011f2(new Exception(android.support.v4.media.a.g(b2, b3, "Omid AdSession State Error currentState :: ", ", expectedState :: "))));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    public final void a(View trackingView, Map map, View view) {
        AdSession adSession;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        Intrinsics.f(trackingView, "trackingView");
        if (this.f == null) {
            boolean z2 = this.d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            switch (this.f23634a) {
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
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f23635b, owner2, owner, z2), this.f23636c);
            Intrinsics.e(adSessionCreateAdSession, "createAdSession(...)");
            this.f = adSessionCreateAdSession;
            this.g = new C3311y(adSessionCreateAdSession, this.f23634a);
            this.f23637e = (byte) 1;
        }
        if (a(this.f23637e, (byte) 1) && (adSession = this.f) != null) {
            adSession.registerAdView(trackingView);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a((View) entry.getKey(), (FriendlyObstructionPurpose) entry.getValue());
            }
        }
        if (view != null && (view instanceof ViewGroup)) {
            a(trackingView, map, (ViewGroup) view);
        }
        if (a(this.f23637e, (byte) 1)) {
            AdSession adSession2 = this.f;
            if (adSession2 != null) {
                adSession2.start();
            }
            this.f23637e = (byte) 2;
        }
    }

    public final void a(int i2, int i3, float f, VastProperties vastProperties) {
        C3311y c3311y;
        AdEvents adEvents;
        MediaEvents mediaEvents;
        AdSession adSession;
        Intrinsics.f(vastProperties, "vastProperties");
        if (a(this.f23637e, (byte) 2)) {
            byte b2 = (byte) i2;
            if (b2 == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                Intrinsics.f(errorType, "errorType");
                if (a(this.f23637e, (byte) 2) && (adSession = this.f) != null) {
                    adSession.error(errorType, "Unknown Player error");
                }
            } else if (b2 == 0 && (c3311y = this.g) != null && (adEvents = c3311y.f24111a) != null) {
                adEvents.impressionOccurred();
            }
            C3311y c3311y2 = this.g;
            if (c3311y2 == null || (mediaEvents = c3311y2.f24112b) == null) {
                return;
            }
            if (b2 == 7) {
                mediaEvents.pause();
                return;
            }
            if (b2 == 5) {
                AdEvents adEvents2 = c3311y2.f24111a;
                if (adEvents2 != null) {
                    adEvents2.loaded(vastProperties);
                    return;
                }
                return;
            }
            if (b2 == 6) {
                mediaEvents.start(i3, f);
                return;
            }
            if (b2 == 8 || b2 == 16) {
                mediaEvents.resume();
                return;
            }
            if (b2 == 15) {
                mediaEvents.skipped();
                return;
            }
            if (b2 == 9) {
                mediaEvents.firstQuartile();
                return;
            }
            if (b2 == 10) {
                mediaEvents.midpoint();
                return;
            }
            if (b2 == 11) {
                mediaEvents.thirdQuartile();
                return;
            }
            if (b2 == 12) {
                mediaEvents.complete();
                return;
            }
            if (b2 == 13) {
                mediaEvents.volumeChange(0.0f);
                return;
            }
            if (b2 == 14) {
                mediaEvents.volumeChange(f);
                return;
            }
            if (b2 == 1) {
                mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
                return;
            }
            if (b2 == 2) {
                mediaEvents.playerStateChange(PlayerState.NORMAL);
            } else if (b2 == 4) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
            } else if (b2 == 18) {
                mediaEvents.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
            }
        }
    }

    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        byte b2 = this.f23637e;
        if (b2 > 0) {
            AdSession adSession = this.f;
            if (adSession != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
                return;
            }
            return;
        }
        S5 s5 = S5.f23167a;
        S5.d.a(new C3011f2(new Exception(androidx.datastore.preferences.protobuf.a.k("Omid AdSession State Error currentState :: ", b2, ", expectedState :: 1"))));
    }

    public final void a(View view, Map map, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (!Intrinsics.a(childAt, view)) {
                if (map == null || !map.containsKey(childAt)) {
                    Intrinsics.c(childAt);
                    a(childAt, FriendlyObstructionPurpose.OTHER);
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        a(view, map, viewGroup2);
                    }
                }
            }
        }
    }
}
