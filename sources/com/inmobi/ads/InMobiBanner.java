package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.A5;
import com.inmobi.media.AbstractC3048h7;
import com.inmobi.media.B2;
import com.inmobi.media.C3221s5;
import com.inmobi.media.C3237t5;
import com.inmobi.media.D1;
import com.inmobi.media.H1;
import com.inmobi.media.I1;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.Md;
import com.inmobi.media.O1;
import com.inmobi.media.P1;
import com.inmobi.media.R1;
import com.inmobi.media.U3;
import com.inmobi.media.Uc;
import com.inmobi.media.V3;
import com.inmobi.media.Vc;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC3253u5;
import com.inmobi.media.Wa;
import com.p004ironsource.dc;
import com.p004ironsource.qt;
import com.p004ironsource.v6;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u007f2\u00020\u0001:\u0005\u0080\u0001R\u0081\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u000bH\u0014¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u000bH\u0014¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0007¢\u0006\u0004\b:\u0010\rJ\u001f\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020'H\u0014¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020#H\u0016¢\u0006\u0004\bA\u0010&J\u000f\u0010C\u001a\u00020\u000bH\u0000¢\u0006\u0004\bB\u0010\rJ\u000f\u0010E\u001a\u00020\u000bH\u0001¢\u0006\u0004\bD\u0010\rJ\r\u0010F\u001a\u00020\u000b¢\u0006\u0004\bF\u0010\rJ\r\u0010G\u001a\u00020\u000b¢\u0006\u0004\bG\u0010\rJ\r\u0010H\u001a\u00020\b¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020#¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000bH\u0007¢\u0006\u0004\bP\u0010\rR$\u0010X\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010^\u001a\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010MR\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010n\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010t\u001a\u00020o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR \u0010{\u001a\u00020u8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010w\u0012\u0004\bz\u0010\r\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0082\u0001"}, d2 = {"Lcom/inmobi/ads/InMobiBanner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "getSignals", "()V", "", qt.f26623n, "load", "([B)V", "refreshBanner$media_release", "refreshBanner", "(Landroid/content/Context;)V", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/BannerAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/BannerAdEventListener;)V", "", "enabled", "setEnableAutoRefresh", "(Z)V", "", v6.d, "setRefreshInterval", "(I)V", "Lcom/inmobi/ads/InMobiBanner$AnimationType;", "animationType", "setAnimationType", "(Lcom/inmobi/ads/InMobiBanner$AnimationType;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "widthInDp", "heightInDp", "setBannerSize", "(II)V", "setupBannerSizeObserver", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "hasWindowFocus", "onWindowFocusChanged", "scheduleRefresh$media_release", "scheduleRefresh", "swapAdUnitsAndDisplayAd$media_release", "swapAdUnitsAndDisplayAd", "resume", "pause", "getPlacementId", "()J", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "setAudioListener", "(Lcom/inmobi/ads/banner/AudioListener;)V", "isAudioAd", "()Z", "destroy", "Lcom/inmobi/media/H1;", "a", "Lcom/inmobi/media/H1;", "getMPubListener$media_release", "()Lcom/inmobi/media/H1;", "setMPubListener$media_release", "(Lcom/inmobi/media/H1;)V", "mPubListener", "b", "Lcom/inmobi/ads/banner/AudioListener;", "getMAudioListener$media_release", "()Lcom/inmobi/ads/banner/AudioListener;", "setMAudioListener$media_release", "mAudioListener", "Lcom/inmobi/media/D1;", "c", "Lcom/inmobi/media/D1;", "getAudioStatusInternal$media_release", "()Lcom/inmobi/media/D1;", "setAudioStatusInternal$media_release", "(Lcom/inmobi/media/D1;)V", "audioStatusInternal", "Lcom/inmobi/media/R1;", "d", "Lcom/inmobi/media/R1;", "getMAdManager$media_release", "()Lcom/inmobi/media/R1;", "setMAdManager$media_release", "(Lcom/inmobi/media/R1;)V", "mAdManager", "Lcom/inmobi/media/Wa;", dc.q, "Lcom/inmobi/media/Wa;", "getMPubSettings$media_release", "()Lcom/inmobi/media/Wa;", "mPubSettings", "Lcom/inmobi/ads/PreloadManager;", "o", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "Companion", "AnimationType", "com/inmobi/media/s5", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiBanner extends RelativeLayout {
    public static final C3221s5 Companion = new C3221s5();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public H1 mPubListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public AudioListener mAudioListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public D1 audioStatusInternal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public R1 mAdManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22629e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P1 f22630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22631i;
    public int j;
    public AnimationType k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22632l;
    public WeakReference m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Wa mPubSettings;
    public final e o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$AnimationType;", "", "(Ljava/lang/String;I)V", "ANIMATION_OFF", "ROTATE_HORIZONTAL_AXIS", "ANIMATION_ALPHA", "ROTATE_VERTICAL_AXIS", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$a;", "Lcom/inmobi/media/O1;", "Lcom/inmobi/ads/InMobiBanner;", "banner", "<init>", "(Lcom/inmobi/ads/InMobiBanner;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends O1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiBanner banner) {
            super(banner);
            Intrinsics.f(banner, "banner");
        }

        @Override // com.inmobi.media.O1, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.O1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            Intrinsics.f(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            H1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.O1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            Intrinsics.f(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    R1 mAdManager = inMobiBanner.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.G();
                    }
                } catch (IllegalStateException e2) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    Intrinsics.e(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC3048h7.a((byte) 1, strAccess$getTAG$cp, e2.getMessage());
                    H1 mPubListener = inMobiBanner.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, AttributeSet attributeSet) {
        InterfaceC3333z5 interfaceC3333z5P;
        InterfaceC3333z5 interfaceC3333z5P2;
        long j;
        InterfaceC3333z5 interfaceC3333z5P3;
        super(context, attributeSet);
        Intrinsics.f(context, "context");
        Intrinsics.f(attributeSet, "attributeSet");
        this.audioStatusInternal = D1.d;
        this.f22629e = new a(this);
        this.g = true;
        this.k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        this.mPubSettings = new Wa();
        this.o = new e(this);
        if (!Uc.q()) {
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.m = new WeakReference(context);
        }
        this.mAdManager = new R1();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", v6.d);
        if (attributeValue != null) {
            try {
                int length = attributeValue.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    boolean z3 = Intrinsics.h(attributeValue.charAt(!z2 ? i2 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z3) {
                        i2++;
                    } else {
                        z2 = true;
                    }
                }
                StringBuilder sb = new StringBuilder(attributeValue.subSequence(i2, length + 1).toString());
                if ("plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                    String strSubstring = sb.substring(5, sb.length());
                    Intrinsics.c(strSubstring);
                    int length2 = strSubstring.length() - 1;
                    int i3 = 0;
                    boolean z4 = false;
                    while (i3 <= length2) {
                        boolean z5 = Intrinsics.h(strSubstring.charAt(!z4 ? i3 : length2), 32) <= 0;
                        if (z4) {
                            if (!z5) {
                                break;
                            } else {
                                length2--;
                            }
                        } else if (z5) {
                            i3++;
                        } else {
                            z4 = true;
                        }
                    }
                    j = Long.parseLong(strSubstring.subSequence(i3, length2 + 1).toString());
                } else {
                    R1 r1 = this.mAdManager;
                    if (r1 != null && (interfaceC3333z5P3 = r1.p()) != null) {
                        ((A5) interfaceC3333z5P3).b("InMobiBanner", "Invalid Placement id: " + attributeValue);
                    }
                    j = Long.MIN_VALUE;
                }
            } catch (NumberFormatException unused) {
                R1 r2 = this.mAdManager;
                if (r2 != null && (interfaceC3333z5P2 = r2.p()) != null) {
                    ((A5) interfaceC3333z5P2).b("InMobiBanner", "Invalid Placement id: ".concat(attributeValue));
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                R1 r3 = this.mAdManager;
                if (r3 != null && (interfaceC3333z5P = r3.p()) != null) {
                    ((A5) interfaceC3333z5P).b("InMobiBanner", "Invalid Placement id: ".concat(attributeValue));
                }
            }
            if (j == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            this.mPubSettings.f23322a = j;
        }
        Context context2 = getContext();
        Intrinsics.e(context2, "getContext(...)");
        a(context2, "banner");
        R1 r4 = this.mAdManager;
        this.f = r4 != null ? r4.A() : 0;
        this.f22630h = new P1(this);
        if (attributeValue2 != null) {
            try {
                int length3 = attributeValue2.length() - 1;
                int i4 = 0;
                boolean z6 = false;
                while (i4 <= length3) {
                    boolean z7 = Intrinsics.h(attributeValue2.charAt(!z6 ? i4 : length3), 32) <= 0;
                    if (z6) {
                        if (!z7) {
                            break;
                        } else {
                            length3--;
                        }
                    } else if (z7) {
                        i4++;
                    } else {
                        z6 = true;
                    }
                }
                String string = attributeValue2.subSequence(i4, length3 + 1).toString();
                Intrinsics.c(string);
                setRefreshInterval(Integer.parseInt(string));
            } catch (NumberFormatException unused3) {
                AbstractC3048h7.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final boolean access$checkForRefreshRate(InMobiBanner inMobiBanner) {
        R1 r1;
        long j = inMobiBanner.f22632l;
        if (j != 0 && (r1 = inMobiBanner.mAdManager) != null && !r1.a(j)) {
            return false;
        }
        inMobiBanner.f22632l = SystemClock.elapsedRealtime();
        return true;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFrameSizeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22631i);
        sb.append('x');
        sb.append(this.j);
        return sb.toString();
    }

    @Deprecated
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final boolean a(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5P;
        InterfaceC3333z5 interfaceC3333z5P2;
        R1 r1 = this.mAdManager;
        if (r1 != null && (interfaceC3333z5P2 = r1.p()) != null) {
            ((A5) interfaceC3333z5P2).c("InMobiBanner", "checkStateAndLogError");
        }
        if (!z2 || this.mPubListener != null) {
            return true;
        }
        R1 r2 = this.mAdManager;
        if (r2 == null || (interfaceC3333z5P = r2.p()) == null) {
            return false;
        }
        ((A5) interfaceC3333z5P).b("InMobiBanner", "Listener supplied is null, Ignoring your call.");
        return false;
    }

    public final boolean b() {
        return this.f22631i > 0 && this.j > 0;
    }

    public final void destroy() {
        a();
        removeAllViews();
        R1 r1 = this.mAdManager;
        if (r1 != null) {
            r1.z();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.mPubSettings.d = true;
    }

    /* JADX INFO: renamed from: getAudioStatusInternal$media_release, reason: from getter */
    public final D1 getAudioStatusInternal() {
        return this.audioStatusInternal;
    }

    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final R1 getMAdManager() {
        return this.mAdManager;
    }

    /* JADX INFO: renamed from: getMAudioListener$media_release, reason: from getter */
    public final AudioListener getMAudioListener() {
        return this.mAudioListener;
    }

    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final H1 getMPubListener() {
        return this.mPubListener;
    }

    /* JADX INFO: renamed from: getMPubSettings$media_release, reason: from getter */
    public final Wa getMPubSettings() {
        return this.mPubSettings;
    }

    public final long getPlacementId() {
        return this.mPubSettings.f23322a;
    }

    public final PreloadManager getPreloadManager() {
        return this.o;
    }

    @Deprecated
    public final void getSignals() {
        InterfaceC3333z5 interfaceC3333z5P;
        if (a(true)) {
            if (!a("getSignals()")) {
                this.f22629e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            R1 r1 = this.mAdManager;
            if (r1 == null || !r1.D()) {
                Context context = getContext();
                Intrinsics.e(context, "getContext(...)");
                a(context, "getToken");
            }
            R1 r2 = this.mAdManager;
            if (r2 != null && (interfaceC3333z5P = r2.p()) != null) {
                ((A5) interfaceC3333z5P).a("InMobiBanner", "getSignals");
            }
            setEnableAutoRefresh(false);
            R1 r3 = this.mAdManager;
            if (r3 != null) {
                r3.a(this.f22629e);
            }
        }
    }

    public final boolean isAudioAd() {
        R1 r1 = this.mAdManager;
        if (r1 != null) {
            return r1.C();
        }
        return false;
    }

    public final void load(byte[] response) {
        R1 r1;
        R1 r2;
        if (a(false)) {
            this.mPubSettings.f23325e = "AB";
            if (getLayoutParams() != null) {
                this.f22631i = B2.b(getLayoutParams().width / U3.b());
                this.j = B2.b(getLayoutParams().height / U3.b());
            }
            R1 r3 = this.mAdManager;
            if (r3 == null || !r3.D() || ((r1 = this.mAdManager) != null && r1.D() && (r2 = this.mAdManager) != null && r2.q() == 0)) {
                Context context = getContext();
                Intrinsics.e(context, "getContext(...)");
                a(context, "banner");
            }
            R1 r4 = this.mAdManager;
            if (r4 != null) {
                r4.w();
            }
            a("load(byte[])", new d(this, response));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC3333z5 interfaceC3333z5P;
        try {
            super.onAttachedToWindow();
            R1 r1 = this.mAdManager;
            if (r1 != null) {
                r1.F();
            }
            if (getLayoutParams() != null) {
                this.f22631i = B2.b(getLayoutParams().width / U3.b());
                this.j = B2.b(getLayoutParams().height / U3.b());
            }
            if (!b()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                V3 v3 = U3.f23253a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.e(rootWindowInsets, "getRootWindowInsets(...)");
                U3.a(rootWindowInsets, context);
            }
        } catch (Exception e2) {
            R1 r2 = this.mAdManager;
            if (r2 == null || (interfaceC3333z5P = r2.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC3333z5 interfaceC3333z5P;
        try {
            super.onDetachedFromWindow();
            a();
            R1 r1 = this.mAdManager;
            if (r1 != null) {
                r1.L();
            }
        } catch (Exception e2) {
            R1 r2 = this.mAdManager;
            if (r2 == null || (interfaceC3333z5P = r2.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e2);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        InterfaceC3333z5 interfaceC3333z5P;
        Intrinsics.f(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, visibility);
            if (visibility == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e2) {
            R1 r1 = this.mAdManager;
            if (r1 == null || (interfaceC3333z5P = r1.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e2);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        InterfaceC3333z5 interfaceC3333z5P;
        try {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e2) {
            R1 r1 = this.mAdManager;
            if (r1 == null || (interfaceC3333z5P = r1.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e2);
        }
    }

    public final void pause() {
        InterfaceC3333z5 interfaceC3333z5P;
        R1 r1;
        try {
            if (this.m != null || (r1 = this.mAdManager) == null) {
                return;
            }
            r1.E();
        } catch (Exception e2) {
            R1 r2 = this.mAdManager;
            if (r2 == null || (interfaceC3333z5P = r2.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e2);
        }
    }

    public final void refreshBanner$media_release() {
        a(this.f22629e, "NonAB", true);
    }

    public final void resume() {
        InterfaceC3333z5 interfaceC3333z5P;
        R1 r1;
        try {
            if (this.m != null || (r1 = this.mAdManager) == null) {
                return;
            }
            r1.H();
        } catch (Exception e2) {
            R1 r2 = this.mAdManager;
            if (r2 == null || (interfaceC3333z5P = r2.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e2);
        }
    }

    public final void scheduleRefresh$media_release() {
        P1 p1;
        if (isShown() && hasWindowFocus()) {
            P1 p2 = this.f22630h;
            if (p2 != null) {
                p2.removeMessages(1);
            }
            R1 r1 = this.mAdManager;
            if (r1 == null || !r1.y() || !this.g || (p1 = this.f22630h) == null) {
                return;
            }
            p1.sendEmptyMessageDelayed(1, this.f * 1000);
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        Intrinsics.f(animationType, "animationType");
        this.k = animationType;
    }

    public final void setAudioListener(AudioListener audioListener) {
        AudioStatus audioStatus;
        Intrinsics.f(audioListener, "audioListener");
        this.mAudioListener = audioListener;
        D1 item = this.audioStatusInternal;
        if (item != D1.d) {
            D1.f22754b.getClass();
            Intrinsics.f(item, "item");
            int iOrdinal = item.ordinal();
            if (iOrdinal != 1) {
                audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            audioListener.onAudioStatusChanged(this, audioStatus);
        }
    }

    public final void setAudioStatusInternal$media_release(D1 d1) {
        Intrinsics.f(d1, "<set-?>");
        this.audioStatusInternal = d1;
    }

    public final void setBannerSize(int widthInDp, int heightInDp) {
        this.f22631i = widthInDp;
        this.j = heightInDp;
    }

    public final void setContentUrl(String contentUrl) {
        Intrinsics.f(contentUrl, "contentUrl");
        this.mPubSettings.f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean enabled) {
        InterfaceC3333z5 interfaceC3333z5P;
        try {
            if (this.g == enabled) {
                return;
            }
            this.g = enabled;
            if (enabled) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e2) {
            R1 r1 = this.mAdManager;
            if (r1 == null || (interfaceC3333z5P = r1.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e2);
        }
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            Vc.a(extras.get("tp"));
            Vc.b(extras.get("tp-v"));
        }
        this.mPubSettings.f23324c = extras;
    }

    public final void setKeywords(String keywords) {
        this.mPubSettings.f23323b = keywords;
    }

    public final void setListener(BannerAdEventListener listener) {
        Intrinsics.f(listener, "listener");
        this.mPubListener = new I1(listener);
    }

    public final void setMAdManager$media_release(R1 r1) {
        this.mAdManager = r1;
    }

    public final void setMAudioListener$media_release(AudioListener audioListener) {
        this.mAudioListener = audioListener;
    }

    public final void setMPubListener$media_release(H1 h1) {
        this.mPubListener = h1;
    }

    public final void setRefreshInterval(int refreshInterval) {
        InterfaceC3333z5 interfaceC3333z5P;
        try {
            this.mPubSettings.f23325e = "NonAB";
            Context context = getContext();
            Intrinsics.e(context, "getContext(...)");
            a(context, "banner");
            R1 r1 = this.mAdManager;
            this.f = r1 != null ? r1.a(refreshInterval, this.f) : 0;
        } catch (Exception e2) {
            R1 r2 = this.mAdManager;
            if (r2 == null || (interfaceC3333z5P = r2.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e2);
        }
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        R1 r1 = this.mAdManager;
        if (r1 != null) {
            r1.a(watermarkData);
        }
    }

    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3253u5(this));
    }

    public final void swapAdUnitsAndDisplayAd$media_release() {
        InterfaceC3333z5 interfaceC3333z5P;
        R1 r1 = this.mAdManager;
        if (r1 != null) {
            r1.K();
        }
        try {
            Animation animationA = b.a(this.k, getWidth(), getHeight());
            R1 r2 = this.mAdManager;
            if (r2 != null) {
                r2.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e2) {
            R1 r3 = this.mAdManager;
            if (r3 == null || (interfaceC3333z5P = r3.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e2);
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5P;
        InterfaceC3333z5 interfaceC3333z5P2;
        InterfaceC3333z5 interfaceC3333z5P3;
        InterfaceC3333z5 interfaceC3333z5P4;
        InterfaceC3333z5 interfaceC3333z5P5;
        try {
            this.mPubSettings.f23325e = str;
            R1 r1 = this.mAdManager;
            if (r1 != null && r1.B()) {
                R1 r2 = this.mAdManager;
                if (r2 != null) {
                    r2.w();
                }
                R1 r3 = this.mAdManager;
                if (r3 != null && (interfaceC3333z5P5 = r3.p()) != null) {
                    ((A5) interfaceC3333z5P5).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
                }
                R1 r4 = this.mAdManager;
                if (r4 != null && (interfaceC3333z5P4 = r4.p()) != null) {
                    ((A5) interfaceC3333z5P4).b("InMobiBanner", "load already in progress");
                }
                R1 r5 = this.mAdManager;
                if (r5 != null) {
                    r5.b((short) 2169);
                }
                H1 h1 = this.mPubListener;
                if (h1 != null) {
                    h1.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                R1 r6 = this.mAdManager;
                if (r6 != null && (interfaceC3333z5P3 = r6.p()) != null) {
                    ((A5) interfaceC3333z5P3).b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                AbstractC3048h7.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            Intrinsics.e(context, "getContext(...)");
            a(context, "banner");
            R1 r7 = this.mAdManager;
            if (r7 != null) {
                r7.w();
            }
            R1 r8 = this.mAdManager;
            if (r8 != null && (interfaceC3333z5P2 = r8.p()) != null) {
                ((A5) interfaceC3333z5P2).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
            }
            a("load", new C3237t5(this, publisherCallbacks, z2));
        } catch (Exception e2) {
            R1 r9 = this.mAdManager;
            if (r9 != null) {
                r9.a((short) 2172);
            }
            H1 h2 = this.mPubListener;
            if (h2 != null) {
                h2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            R1 r10 = this.mAdManager;
            if (r10 == null || (interfaceC3333z5P = r10.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "Load failed with unexpected error: ", e2);
        }
    }

    public final void load() {
        if (a(false)) {
            a(this.f22629e, "NonAB", false);
        }
    }

    public final void load(Context context) {
        Intrinsics.f(context, "context");
        if (a(false)) {
            this.m = context instanceof Activity ? new WeakReference(context) : null;
            a(this.f22629e, "NonAB", false);
        }
    }

    public final void a(String str, Function0 function0) {
        InterfaceC3333z5 interfaceC3333z5P;
        InterfaceC3333z5 interfaceC3333z5P2;
        R1 r1 = this.mAdManager;
        if (r1 != null && (interfaceC3333z5P2 = r1.p()) != null) {
            ((A5) interfaceC3333z5P2).c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!a(str)) {
            R1 r2 = this.mAdManager;
            if (r2 != null && (interfaceC3333z5P = r2.p()) != null) {
                ((A5) interfaceC3333z5P).b("InMobiBanner", "invalid banner size. fail.");
            }
            R1 r3 = this.mAdManager;
            if (r3 != null) {
                r3.a((short) 2170);
            }
            H1 h1 = this.mPubListener;
            if (h1 != null) {
                h1.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (!b()) {
            Md.a(new com.google.android.exoplayer2.video.a(29, this, function0), 200L);
        } else {
            function0.invoke();
        }
    }

    public static final void a(InMobiBanner this$0, Function0 onSuccess) {
        InterfaceC3333z5 interfaceC3333z5P;
        InterfaceC3333z5 interfaceC3333z5P2;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(onSuccess, "$onSuccess");
        try {
            if (this$0.b()) {
                onSuccess.invoke();
                return;
            }
            R1 r1 = this$0.mAdManager;
            if (r1 != null && (interfaceC3333z5P2 = r1.p()) != null) {
                ((A5) interfaceC3333z5P2).b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            R1 r2 = this$0.mAdManager;
            if (r2 != null) {
                r2.a((short) 2171);
            }
            H1 h1 = this$0.mPubListener;
            if (h1 != null) {
                h1.a(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e2) {
            R1 r3 = this$0.mAdManager;
            if (r3 != null) {
                r3.a((short) 2172);
            }
            H1 h2 = this$0.mPubListener;
            if (h2 != null) {
                h2.a(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            R1 r4 = this$0.mAdManager;
            if (r4 == null || (interfaceC3333z5P = r4.p()) == null) {
                return;
            }
            ((A5) interfaceC3333z5P).a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e2);
        }
    }

    public final boolean a(String str) {
        InterfaceC3333z5 interfaceC3333z5P;
        InterfaceC3333z5 interfaceC3333z5P2;
        if (b()) {
            return true;
        }
        if (getLayoutParams() == null) {
            R1 r1 = this.mAdManager;
            if (r1 != null && (interfaceC3333z5P2 = r1.p()) != null) {
                ((A5) interfaceC3333z5P2).b("InMobiBanner", android.support.v4.media.a.o("The layout params of the banner must be set before calling ", str, " or call setBannerSize(int widthInDp, int heightInDp) before ", str));
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f22631i = B2.b(getLayoutParams().width / U3.b());
            this.j = B2.b(getLayoutParams().height / U3.b());
            return true;
        }
        R1 r2 = this.mAdManager;
        if (r2 != null && (interfaceC3333z5P = r2.p()) != null) {
            ((A5) interfaceC3333z5P).b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(str));
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, long j) {
        super(context);
        Intrinsics.f(context, "context");
        this.audioStatusInternal = D1.d;
        this.f22629e = new a(this);
        this.g = true;
        this.k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Wa wa = new Wa();
        this.mPubSettings = wa;
        this.o = new e(this);
        if (Uc.q()) {
            if (context instanceof Activity) {
                this.m = new WeakReference(context);
            }
            this.mAdManager = new R1();
            wa.f23322a = j;
            a(context, "banner");
            R1 r1 = this.mAdManager;
            this.f = r1 != null ? r1.A() : 0;
            this.f22630h = new P1(this);
            return;
        }
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public final void a(Context context, String str) {
        int iA;
        R1 r1 = this.mAdManager;
        if (r1 != null) {
            r1.a(context, this.mPubSettings, getFrameSizeString(), str);
        }
        R1 r2 = this.mAdManager;
        if (r2 != null) {
            int i2 = this.f;
            iA = r2.a(i2, i2);
        } else {
            iA = 0;
        }
        this.f = iA;
    }

    public final void a() {
        P1 p1 = this.f22630h;
        if (p1 != null) {
            p1.removeMessages(1);
        }
    }
}
