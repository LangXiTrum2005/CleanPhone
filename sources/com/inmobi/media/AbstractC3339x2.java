package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3339x2 extends AbstractC2863e1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3339x2(saran coroutineScope, InterfaceC3072m9 interfaceC3072m9) {
        super(coroutineScope, interfaceC3072m9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = AbstractC3339x2.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC2863e1
    public final void a(boolean z) {
        if (this.e == null) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            return;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C3097n9) interfaceC3072m9).a(tag, "nonSkippableVideoAdLoaded - isAutoPlay: " + z);
        }
        try {
            P4.a(this.a, new C3264u2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.STANDALONE), null));
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            e.getStackTrace();
        }
    }

    public final void b(Rl rl) {
        MediaEvents mediaEvents;
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C3097n9) interfaceC3072m9).a(tag, "fireAdVideoEvent - received video event: " + rl);
        }
        if (rl instanceof Ql) {
            AdSession adSession = this.c;
            if (adSession != null) {
                adSession.error(ErrorType.VIDEO, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (rl instanceof Om) {
            MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (rl instanceof C2962hn) {
            MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (rl instanceof C3359xm) {
            MediaEvents mediaEvents4 = this.d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (rl instanceof C2986in) {
            MediaEvents mediaEvents5 = this.d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (rl instanceof C3210rn) {
            MediaEvents mediaEvents6 = this.d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (rl instanceof Pl) {
            MediaEvents mediaEvents7 = this.d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (rl instanceof C3036kn) {
            MediaEvents mediaEvents8 = this.d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((C3036kn) rl).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (rl instanceof S1) {
            MediaEvents mediaEvents9 = this.d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((S1) rl).b);
                return;
            }
            return;
        }
        if (!(rl instanceof C3011jn) || (mediaEvents = this.d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f, boolean z) {
        if (this.e == null) {
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                String tag = this.g;
                Intrinsics.checkNotNullExpressionValue(tag, "tag");
                ((C3097n9) interfaceC3072m9).a(tag, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.b;
        if (interfaceC3072m10 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            ((C3097n9) interfaceC3072m10).a(tag2, "skippableVideoAdLoaded - skipOffset: " + f + ", isAutoPlay: " + z);
        }
        try {
            P4.a(this.a, new C3289v2(this, VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.STANDALONE), null));
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            e.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC2863e1, com.inmobi.media.Kl
    public final void a(Rl videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (videoEvent instanceof Xm) {
            return;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C3097n9) interfaceC3072m9).a(tag, "trackAdVideoEvent - videoEvent: " + videoEvent);
        }
        if (this.d == null) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
        } else {
            P4.a(this.a, new C3314w2(this, videoEvent, null));
        }
    }
}
