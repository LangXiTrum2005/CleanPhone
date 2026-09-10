package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.A1;
import com.inmobi.media.A5;
import com.inmobi.media.AbstractC3048h7;
import com.inmobi.media.AbstractC3174p5;
import com.inmobi.media.B2;
import com.inmobi.media.C3329z1;
import com.inmobi.media.Cb;
import com.inmobi.media.E1;
import com.inmobi.media.F1;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.L3;
import com.inmobi.media.M2;
import com.inmobi.media.Md;
import com.inmobi.media.O2;
import com.inmobi.media.U3;
import com.inmobi.media.Uc;
import com.inmobi.media.V3;
import com.inmobi.media.Vc;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC3190q5;
import com.inmobi.media.Wa;
import com.inmobi.media.X;
import com.inmobi.media.Z;
import com.startapp.sdk.internal.C;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "load", "()V", "show", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", "resume", "pause", "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/E1;", "b", "Lcom/inmobi/media/E1;", "getMAdManager$media_release", "()Lcom/inmobi/media/E1;", "setMAdManager$media_release", "(Lcom/inmobi/media/E1;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public E1 mAdManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22624c;
    public final Wa d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22625e;
    public int f;
    public int g;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/A1;", "Lcom/inmobi/ads/InMobiAudio;", "audio", "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends A1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiAudio audio) {
            super(audio);
            Intrinsics.f(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            Intrinsics.f(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
                return;
            }
            mPubListener.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.A1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            Intrinsics.f(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                E1 mAdManager = inMobiAudio.getMAdManager();
                if (mAdManager != null) {
                    mAdManager.y();
                }
            } catch (IllegalStateException e2) {
                AbstractC3048h7.a((byte) 1, "InMobiAudio", e2.getMessage());
                AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, AttributeSet attributeSet) {
        long j;
        super(context, attributeSet);
        Intrinsics.f(context, "context");
        Intrinsics.f(attributeSet, "attributeSet");
        a aVar = new a(this);
        this.d = new Wa();
        if (!Uc.q()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.f22624c = new WeakReference(context);
        }
        this.mAdManager = new E1(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
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
                    AbstractC3048h7.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
                    AbstractC3048h7.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + attributeValue);
                    j = Long.MIN_VALUE;
                }
            } catch (NumberFormatException unused) {
                AbstractC3048h7.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
                AbstractC3048h7.a((byte) 1, "InMobiAudio", "Invalid Placement id: ".concat(attributeValue));
            } catch (StringIndexOutOfBoundsException unused2) {
                AbstractC3048h7.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
                AbstractC3048h7.a((byte) 1, "InMobiAudio", "Invalid Placement id: ".concat(attributeValue));
            }
            if (j == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            this.d.f23322a = j;
        }
        Context context2 = getContext();
        Intrinsics.e(context2, "getContext(...)");
        a(context2);
    }

    public static final void a(InMobiAudio this$0) {
        E1 e1;
        Intrinsics.f(this$0, "this$0");
        try {
            if (this$0.b()) {
                if (!this$0.a() || (e1 = this$0.mAdManager) == null) {
                    return;
                }
                e1.b(this$0.getFrameSizeString());
                return;
            }
            AbstractC3048h7.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            E1 e2 = this$0.mAdManager;
            if (e2 != null) {
                e2.a((short) 108);
            }
            E1 e3 = this$0.mAdManager;
            if (e3 != null) {
                e3.a(e3.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception unused) {
            E1 e4 = this$0.mAdManager;
            if (e4 != null) {
                e4.a((short) 105);
            }
            AbstractC3048h7.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
        }
    }

    private final String getFrameSizeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('x');
        sb.append(this.g);
        return sb.toString();
    }

    public final boolean b() {
        return this.f > 0 && this.g > 0;
    }

    public final boolean c() {
        if (!b()) {
            if (getLayoutParams() == null) {
                AbstractC3048h7.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                AbstractC3048h7.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f = B2.b(getLayoutParams().width / U3.b());
                this.g = B2.b(getLayoutParams().height / U3.b());
            }
        }
        return true;
    }

    public final void d() {
        E1 e1;
        try {
            LinkedHashMap linkedHashMap = O2.f23027a;
            Config configA = M2.a("ads", Uc.b(), null);
            Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (!((AdConfig) configA).getAudio().getIsAudioEnabled()) {
                E1 e2 = this.mAdManager;
                if (e2 != null) {
                    e2.a((short) 107);
                }
                E1 e3 = this.mAdManager;
                if (e3 != null) {
                    e3.a(e3.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                AbstractC3048h7.a((byte) 1, "InMobi", "");
                return;
            }
            this.d.f23325e = "NonAB";
            Context context = getContext();
            Intrinsics.e(context, "getContext(...)");
            a(context);
            E1 e4 = this.mAdManager;
            if (e4 != null) {
                C3329z1 c3329z1 = e4.q;
                if (c3329z1 != null ? c3329z1.E0() : false) {
                    E1 e5 = this.mAdManager;
                    if (e5 != null) {
                        InterfaceC3333z5 interfaceC3333z5P = e5.p();
                        if (interfaceC3333z5P != null) {
                            String str = F1.f22805a;
                            Intrinsics.e(str, "access$getTAG$p(...)");
                            ((A5) interfaceC3333z5P).b(str, "submitAdLoadFailed " + e5);
                        }
                        C3329z1 c3329z2 = e5.r;
                        if (c3329z2 != null) {
                            c3329z2.b((short) 15);
                        }
                    }
                    AudioAdEventListener audioAdEventListener = this.mPubListener;
                    if (audioAdEventListener != null) {
                        audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    }
                    AbstractC3048h7.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                    return;
                }
            }
            if (!c()) {
                E1 e6 = this.mAdManager;
                if (e6 != null) {
                    e6.a((short) 108);
                }
                E1 e7 = this.mAdManager;
                if (e7 != null) {
                    e7.a(e7.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Config configA2 = M2.a("ads", Uc.b(), null);
            Intrinsics.d(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (((AdConfig) configA2).getAudio().getMinDeviceVolume() > L3.f22938a.a(Uc.d(), Uc.o())) {
                E1 e8 = this.mAdManager;
                if (e8 != null) {
                    e8.a((short) 106);
                }
                E1 e9 = this.mAdManager;
                if (e9 != null) {
                    e9.a(e9.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (!b()) {
                Md.a(new C(this, 22), 200L);
            } else {
                if (!a() || (e1 = this.mAdManager) == null) {
                    return;
                }
                e1.b(getFrameSizeString());
            }
        } catch (Exception unused) {
            E1 e10 = this.mAdManager;
            if (e10 != null) {
                e10.a((short) 105);
            }
            AbstractC3048h7.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    public final void destroy() {
        removeAllViews();
        E1 e1 = this.mAdManager;
        if (e1 != null) {
            InterfaceC3333z5 interfaceC3333z5P = e1.p();
            if (interfaceC3333z5P != null) {
                String str = F1.f22805a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P).a(str, "clear " + e1);
            }
            InterfaceC3333z5 interfaceC3333z5P2 = e1.p();
            if (interfaceC3333z5P2 != null) {
                String str2 = F1.f22805a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P2).c(str2, "unregisterLifecycleCallbacks " + e1);
            }
            C3329z1 c3329z1 = e1.o;
            if (c3329z1 != null) {
                c3329z1.J0();
            }
            C3329z1 c3329z2 = e1.f22792p;
            if (c3329z2 != null) {
                c3329z2.J0();
            }
            C3329z1 c3329z3 = e1.o;
            if (c3329z3 != null) {
                c3329z3.g();
            }
            e1.o = null;
            C3329z1 c3329z4 = e1.f22792p;
            if (c3329z4 != null) {
                c3329z4.g();
            }
            e1.f22792p = null;
            e1.q = null;
            e1.r = null;
            e1.a((Boolean) null);
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.d.d = true;
    }

    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final E1 getMAdManager() {
        return this.mAdManager;
    }

    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    public final void load() {
        E1 e1 = this.mAdManager;
        if (e1 != null) {
            e1.w();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            E1 e1 = this.mAdManager;
            if (e1 != null) {
                e1.x();
            }
            if (getLayoutParams() != null) {
                this.f = B2.b(getLayoutParams().width / U3.b());
                this.g = B2.b(getLayoutParams().height / U3.b());
            }
            if (!b()) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                V3 v3 = U3.f23253a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.e(rootWindowInsets, "getRootWindowInsets(...)");
                U3.a(rootWindowInsets, context);
            }
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            E1 e1 = this.mAdManager;
            if (e1 != null) {
                InterfaceC3333z5 interfaceC3333z5P = e1.p();
                if (interfaceC3333z5P != null) {
                    String str = F1.f22805a;
                    Intrinsics.e(str, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z5P).c(str, "unregisterLifecycleCallbacks " + e1);
                }
                C3329z1 c3329z1 = e1.o;
                if (c3329z1 != null) {
                    c3329z1.J0();
                }
                C3329z1 c3329z2 = e1.f22792p;
                if (c3329z2 != null) {
                    c3329z2.J0();
                }
            }
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    public final void pause() {
        E1 e1;
        try {
            if (this.f22624c != null || (e1 = this.mAdManager) == null) {
                return;
            }
            InterfaceC3333z5 interfaceC3333z5P = e1.p();
            if (interfaceC3333z5P != null) {
                String str = F1.f22805a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P).a(str, "pause " + e1);
            }
            C3329z1 c3329z1 = e1.q;
            if (c3329z1 != null) {
                c3329z1.F0();
            }
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        E1 e1;
        try {
            if (this.f22624c != null || (e1 = this.mAdManager) == null) {
                return;
            }
            InterfaceC3333z5 interfaceC3333z5P = e1.p();
            if (interfaceC3333z5P != null) {
                String str = F1.f22805a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P).a(str, "resume " + e1);
            }
            C3329z1 c3329z1 = e1.q;
            if (c3329z1 != null) {
                c3329z1.G0();
            }
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setAudioSize(int widthInDp, int heightInDp) {
        this.f = widthInDp;
        this.g = heightInDp;
    }

    public final void setContentUrl(String contentUrl) {
        Intrinsics.f(contentUrl, "contentUrl");
        this.d.f = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null) {
                Vc.a(str);
            }
            String str2 = extras.get("tp-v");
            if (str2 != null) {
                Vc.b(str2);
            }
        }
        this.d.f23324c = extras;
    }

    public final void setKeywords(String keywords) {
        this.d.f23323b = keywords;
    }

    public final void setListener(AudioAdEventListener listener) {
        Intrinsics.f(listener, "listener");
        this.mPubListener = listener;
    }

    public final void setMAdManager$media_release(E1 e1) {
        this.mAdManager = e1;
    }

    public final void setMPubListener$media_release(AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3190q5(this));
    }

    public final void show() {
        E1 e1 = this.mAdManager;
        if (e1 != null) {
            InterfaceC3333z5 interfaceC3333z5P = e1.p();
            if (interfaceC3333z5P != null) {
                String str = F1.f22805a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P).a(str, "submitAdShowCalled " + e1);
            }
            C3329z1 c3329z1 = e1.r;
            if (c3329z1 != null) {
                c3329z1.w0();
            }
        }
        E1 e2 = this.mAdManager;
        if (e2 != null) {
            e2.a(this);
        }
    }

    public final boolean a() {
        E1 e1;
        long j = this.f22625e;
        if (j != 0 && (e1 = this.mAdManager) != null) {
            InterfaceC3333z5 interfaceC3333z5P = e1.p();
            if (interfaceC3333z5P != null) {
                String str = F1.f22805a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P).c(str, "checkForRefreshRate " + e1);
            }
            if (e1.r == null) {
                return false;
            }
            LinkedHashMap linkedHashMap = O2.f23027a;
            int minRefreshInterval = ((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getAudio().getMinRefreshInterval();
            if (SystemClock.elapsedRealtime() - j < minRefreshInterval * 1000) {
                e1.a((short) 2175);
                e1.b(e1.r, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
                String str2 = F1.f22805a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                StringBuilder sb = new StringBuilder("Ad cannot be refreshed before ");
                sb.append(minRefreshInterval);
                sb.append(" seconds (AdPlacement Id = ");
                C3329z1 c3329z1 = e1.r;
                sb.append(c3329z1 != null ? c3329z1.I() : null);
                sb.append(')');
                AbstractC3048h7.a((byte) 1, str2, sb.toString());
                InterfaceC3333z5 interfaceC3333z5P2 = e1.p();
                if (interfaceC3333z5P2 == null) {
                    return false;
                }
                StringBuilder sbU = android.support.v4.media.a.u(minRefreshInterval, "Ad cannot be refreshed before ", " seconds (AdPlacement Id = ");
                C3329z1 c3329z2 = e1.r;
                sbU.append(c3329z2 != null ? c3329z2.I() : null);
                sbU.append(')');
                ((A5) interfaceC3333z5P2).b(str2, sbU.toString());
                return false;
            }
        }
        this.f22625e = SystemClock.elapsedRealtime();
        return true;
    }

    public final void a(Context context) {
        String str;
        E1 e1 = this.mAdManager;
        if (e1 != null) {
            Wa pubSettings = this.d;
            String adSize = getFrameSizeString();
            Intrinsics.f(context, "context");
            Intrinsics.f(pubSettings, "pubSettings");
            Intrinsics.f(adSize, "adSize");
            String str2 = F1.f22805a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            X x = new X("audio");
            if (context instanceof Activity) {
                str = "activity";
            } else {
                str = "others";
            }
            Z zA = x.d(str).a(pubSettings.f23322a).c(pubSettings.f23323b).a(pubSettings.f23324c).a(adSize).a(pubSettings.d).e(pubSettings.f23325e).b(pubSettings.f).a();
            C3329z1 c3329z1 = e1.o;
            if (c3329z1 != null && e1.f22792p != null) {
                c3329z1.a(context, zA, e1);
                C3329z1 c3329z2 = e1.f22792p;
                if (c3329z2 != null) {
                    c3329z2.a(context, zA, e1);
                }
            } else {
                e1.o = new C3329z1(context, zA, e1);
                e1.f22792p = new C3329z1(context, zA, e1);
                e1.r = e1.o;
            }
            String str3 = pubSettings.f23325e;
            if (str3 != null) {
                InterfaceC3333z5 interfaceC3333z5P = e1.p();
                if (interfaceC3333z5P != null) {
                    ((A5) interfaceC3333z5P).a();
                }
                e1.a(Cb.a("audio", str3, false));
                InterfaceC3333z5 interfaceC3333z5P2 = e1.p();
                if (interfaceC3333z5P2 != null) {
                    ((A5) interfaceC3333z5P2).a(str2, "adding audioAdUnit1 to reference tracker");
                }
                C3329z1 c3329z3 = e1.o;
                Intrinsics.c(c3329z3);
                Cb.a(c3329z3, e1.p());
                InterfaceC3333z5 interfaceC3333z5P3 = e1.p();
                if (interfaceC3333z5P3 != null) {
                    ((A5) interfaceC3333z5P3).a(str2, "adding audioAdUnit2 to reference tracker");
                }
                C3329z1 c3329z4 = e1.f22792p;
                Intrinsics.c(c3329z4);
                Cb.a(c3329z4, e1.p());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, long j) {
        super(context);
        Intrinsics.f(context, "context");
        a aVar = new a(this);
        Wa wa = new Wa();
        this.d = wa;
        if (Uc.q()) {
            if (context instanceof Activity) {
                this.f22624c = new WeakReference(context);
            }
            this.mAdManager = new E1(aVar);
            wa.f23322a = j;
            a(context);
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }
}
