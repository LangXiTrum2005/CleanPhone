package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.do0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3293do0 extends AbstractC4454r3 implements DB {
    public static final C3293do0 v;
    public HashMap t;
    public int u;

    static {
        C3293do0 c3293do0 = new C3293do0();
        c3293do0.t = new HashMap();
        c3293do0.u = -1;
        v = c3293do0;
    }

    public static void H0(C3908ko0 c3908ko0, Kn0 kn0, C4258on0 c4258on0, IS is, ViewGroup viewGroup) {
        View viewInflate;
        NativeAdView nativeAdView;
        NativeAdView nativeAdView2;
        CB cb;
        NativeAdView nativeAdView3;
        NativeAdView nativeAdView4;
        if (is != null) {
            C3887ke c3887keE = ((QL) is).e();
            if (c3887keE.f() instanceof View) {
                viewInflate = (View) c3887keE.f();
            } else {
                viewInflate = viewGroup != null ? LayoutInflater.from(viewGroup.getContext()).inflate(c3887keE.f().intValue(), viewGroup, false) : null;
            }
            if (viewInflate == null || c3908ko0.f4617a == null) {
                return;
            }
            TextView textView = c3887keE.g() instanceof TextView ? (TextView) c3887keE.g() : (TextView) viewInflate.findViewById(c3887keE.g().intValue());
            TextView textView2 = c3887keE.a() instanceof TextView ? (TextView) c3887keE.a() : (TextView) viewInflate.findViewById(c3887keE.a().intValue());
            ViewGroup viewGroup2 = c3887keE.e() instanceof ViewGroup ? (ViewGroup) c3887keE.e() : (ViewGroup) viewInflate.findViewById(c3887keE.e().intValue());
            ImageView imageView = c3887keE.d() instanceof ImageView ? (ImageView) c3887keE.d() : (ImageView) viewInflate.findViewById(c3887keE.d().intValue());
            TextView textView3 = c3887keE.c() instanceof TextView ? (TextView) c3887keE.c() : (TextView) viewInflate.findViewById(c3887keE.c().intValue());
            NativeAd nativeAd = kn0.d;
            c3908ko0.c = nativeAd;
            c3908ko0.b = kn0;
            c3908ko0.e = true;
            if (textView != null && (nativeAdView4 = c3908ko0.f4617a) != null) {
                nativeAdView4.setHeadlineView(textView);
                NativeAd nativeAd2 = c3908ko0.c;
                if (nativeAd2 != null && c3908ko0.e) {
                    textView.setText(nativeAd2.getHeadline());
                }
            }
            if (textView2 != null && (nativeAdView3 = c3908ko0.f4617a) != null) {
                nativeAdView3.setBodyView(textView2);
                NativeAd nativeAd3 = c3908ko0.c;
                if (nativeAd3 != null && c3908ko0.e) {
                    textView2.setText(nativeAd3.getBody());
                }
            }
            if (viewGroup2 != null && (cb = c3908ko0.b) != null && cb.getMediaView() != null && ((MediaView) c3908ko0.b.getMediaView().b) != null) {
                c3908ko0.d = viewGroup2;
                viewGroup2.removeAllViews();
                MediaView mediaView = (MediaView) c3908ko0.b.getMediaView().b;
                if (mediaView.getParent() != null) {
                    ((ViewGroup) mediaView.getParent()).removeView(mediaView);
                }
                c3908ko0.d.addView(mediaView, new ViewGroup.LayoutParams(-1, -1));
                c3908ko0.f4617a.setMediaView(mediaView);
                C4258on0 mediaView2 = c3908ko0.b.getMediaView();
                C4258on0 mediaContent = c3908ko0.b.getMediaContent();
                MediaView mediaView3 = (MediaView) mediaView2.b;
                if (mediaView3 != null && mediaContent != null) {
                    mediaView3.setMediaContent((MediaContent) mediaContent.b);
                }
            }
            if (imageView != null && (nativeAdView2 = c3908ko0.f4617a) != null) {
                nativeAdView2.setIconView(imageView);
                NativeAd nativeAd4 = c3908ko0.c;
                if (nativeAd4 != null && nativeAd4.getIcon() != null && c3908ko0.e) {
                    imageView.setImageDrawable(c3908ko0.c.getIcon().getDrawable());
                }
            }
            if (textView3 != null && (nativeAdView = c3908ko0.f4617a) != null) {
                nativeAdView.setCallToActionView(textView3);
                NativeAd nativeAd5 = c3908ko0.c;
                if (nativeAd5 != null && c3908ko0.e) {
                    textView3.setText(nativeAd5.getCallToAction());
                }
            }
            NativeAdView nativeAdView5 = c3908ko0.f4617a;
            if (nativeAdView5 != null) {
                c3908ko0.b = kn0;
                c3908ko0.c = nativeAd;
                nativeAdView5.setNativeAd(nativeAd);
            }
            if (viewInflate.getParent() != null) {
                ((ViewGroup) viewInflate.getParent()).removeView(viewInflate);
            }
            c3908ko0.f4617a.removeAllViews();
            c3908ko0.f4617a.addView(viewInflate);
        }
    }

    public static void I0(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof NativeAdView) {
                viewGroup.removeView(childAt);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final void k(Context context, UQ uq, IS is) {
        X0 x0 = X0.j;
        x0.h();
        if (uq == null) {
            byte[] bArr = {-80, 67, 27, 87, 82, -26, -45, -77, -74, 10, 29, 65, 123, -76, -46, -87, -78, 10, 28, 69, 53, -6, -55, -86, -86, 11};
            byte[] bArr2 = {-58, 42, 126, 32, 21, -108, -68, -58};
            int i = 0;
            int i2 = 0;
            while (i < 26) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            return;
        }
        if (uq.c() == null) {
            return;
        }
        Object tag = uq.c().getTag();
        boolean z = tag == null || tag.toString().isEmpty();
        WeakReference weakReference = new WeakReference(context);
        String strN = AbstractC4454r3.N(uq);
        synchronized (this.b) {
            try {
                if (s0(strN)) {
                    return;
                }
                if (z) {
                    Y(strN, 1);
                }
                if (x0.s().f5021a) {
                    if (i0(strN) == null) {
                        a0(strN, is);
                    }
                    W((IS) i0(strN));
                }
                Z(strN, uq);
                z0((C3491g4) uq.f3354a, strN);
                if (!uq.e) {
                    C((Context) weakReference.get(), (C3491g4) uq.f3354a, (String) uq.b);
                }
                P(uq.c());
                if (((Om0) x0.k()).l) {
                    byte[] bArr3 = {-97, 34, -111, 45, 11, -21, 68, -64, -119, 33, -111, 127, 66, -81, 89, -126, -55, 117, -116, 117, 66, -94, 93, -126, -55, 119, -120, 99, 73, -87, 93, -121, -54, 122, -118, 125, 74, -85};
                    byte[] bArr4 = {-4, 67, -68, 76, 123, -101, 105, -80};
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 38; i3 < i5; i5 = 38) {
                        if (i4 >= 8) {
                            i4 = 0;
                        }
                        bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                        i3++;
                        i4++;
                    }
                    ((C3491g4) uq.f3354a).H(1, new String(bArr3, StandardCharsets.UTF_8));
                } else {
                    AbstractC4103n3.H(context, (C3491g4) uq.f3354a, AbstractC3661i1.i, AbstractC3661i1.t);
                }
                if (weakReference.get() == null || TextUtils.isEmpty(((C3491g4) uq.f3354a).w(1))) {
                    S((C3491g4) uq.f3354a, strN, 2);
                    if (is != null) {
                        ((QL) is).a(null);
                        return;
                    }
                    return;
                }
                C4312pT c4312pT = C4312pT.n;
                c4312pT.m(uq.c(), new C3818jn0(this, is, uq, strN, 1));
                C3044b1.b.k().getClass();
                Kn0 kn0 = (Kn0) g0((C3491g4) uq.f3354a, strN);
                if (x0.s().f5021a && kn0 != null && !l0(uq) && !uq.d) {
                    C3491g4 c3491g4 = (C3491g4) uq.f3354a;
                    if (J(c3491g4, strN) != 2 && J(c3491g4, strN) != -1) {
                        if (i0(strN) != null) {
                            if (!uq.e) {
                                E((Context) weakReference.get(), (C3491g4) uq.f3354a, (String) uq.b);
                            }
                            if (this.g.get((C3491g4) uq.f3354a) == null) {
                                B(strN);
                                A(strN);
                            }
                            this.u = 4;
                            C3908ko0 c3908ko0 = new C3908ko0((Context) weakReference.get());
                            C4258on0 c4258on0 = new C4258on0((Context) weakReference.get());
                            kn0.g = c3908ko0;
                            kn0.h = c4258on0;
                            c4312pT.j(uq.c());
                            ((QL) ((IS) i0(strN))).b(kn0);
                            ((QL) ((IS) i0(strN))).getClass();
                            H0(c3908ko0, kn0, c4258on0, (IS) i0(strN), uq.c());
                            G0(kn0, c3908ko0, uq.c());
                            P(uq.c());
                            return;
                        }
                        return;
                    }
                }
                if (!AbstractC3221d1.a()) {
                    byte[] bArr5 = {-28, 47, 20, 75, -103, -85, 59, -74, -118, 34, com.umeng.analytics.pro.cw.m, 67, -117, -18, 31, -96, -40, 33, 18, com.umeng.analytics.pro.cw.l, -49, -81, 12, -77, -61, 34, 1, 64, -125, -85, 90, -95, -38, 47, 3, 71, -49, -96, 21, -90, -118, 43, com.umeng.analytics.pro.cw.l, 77, -102, -87, 18, 61, 22, -49, -113, -98, 110};
                    byte[] bArr6 = {-86, 78, 96, 34, -17, -50, 122, -46};
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < 53) {
                        if (i7 >= 8) {
                            i7 = 0;
                        }
                        bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i7]);
                        i6++;
                        i7++;
                    }
                    new String(bArr5, StandardCharsets.UTF_8);
                    if (is != null) {
                        ((QL) is).a(null);
                        return;
                    }
                    return;
                }
                if (uq.e) {
                    this.e.remove((C3491g4) uq.f3354a);
                } else {
                    this.e.put((C3491g4) uq.f3354a, Boolean.FALSE);
                }
                uq.d = false;
                uq.e = false;
                ((C3491g4) uq.f3354a).I();
                Un0 un0 = new Un0(this, uq, is, weakReference);
                Vn0 vn0 = new Vn0(this, uq, weakReference, uq, is);
                synchronized (this.b) {
                    try {
                        if (!uq.d && J((C3491g4) uq.f3354a, strN) == 0) {
                            byte[] bArr7 = {-38, -111, -113, 38, -55, -51, -81, 40, -76, -100, -108, 46, -37, -23, -118, 118, -76, -68, -76, com.umeng.analytics.pro.cw.l, -5, -31, -96, 11};
                            byte[] bArr8 = {-108, -16, -5, 79, -65, -88, -18, 76};
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < 24) {
                                if (i9 >= 8) {
                                    i9 = 0;
                                }
                                bArr7[i8] = (byte) (bArr7[i8] ^ bArr8[i9]);
                                i8++;
                                i9++;
                            }
                            new String(bArr7, StandardCharsets.UTF_8);
                            R((C3491g4) uq.f3354a, un0);
                            this.t.put((C3491g4) uq.f3354a, vn0);
                            return;
                        }
                        B0((C3491g4) uq.f3354a);
                        S((C3491g4) uq.f3354a, strN, 0);
                        ((C3491g4) uq.f3354a).J(System.currentTimeMillis());
                        this.t.remove((C3491g4) uq.f3354a);
                        byte[] bArr9 = {8, -60, 36, 22, 30, -90, 35, 116, 102, -55, 63, 30, 12, -126, 6};
                        byte[] bArr10 = {70, -91, 80, 127, 104, -61, 98, com.umeng.analytics.pro.cw.n};
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < 15) {
                            if (i11 >= 8) {
                                i11 = 0;
                            }
                            bArr9[i10] = (byte) (bArr9[i10] ^ bArr10[i11]);
                            i10++;
                            i11++;
                        }
                        new String(bArr9, StandardCharsets.UTF_8);
                        D0((C3491g4) uq.f3354a);
                        B(strN);
                        A(strN);
                        C4981x20.u().t(new Wn0(this, weakReference, uq, vn0, un0));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void F0(Context context, final String str, final C2498In c2498In, final String str2, final int i, NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, final AdListener adListener) {
        final AdLoader.Builder builder = new AdLoader.Builder(context, str);
        builder.forNativeAd(onNativeAdLoadedListener);
        C4981x20.u().q(new Runnable(str, str2, c2498In, builder, adListener, i) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mn0
            public final /* synthetic */ String b;
            public final /* synthetic */ C2498In c;
            public final /* synthetic */ AdLoader.Builder d;
            public final /* synthetic */ AdListener e;
            public final /* synthetic */ int f;

            {
                this.c = c2498In;
                this.d = builder;
                this.e = adListener;
                this.f = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final C3293do0 c3293do0 = this.f3425a;
                c3293do0.getClass();
                final AdManagerAdRequest.Builder builderC = Um0.c(X0.j.j(), this.b, AbstractC3661i1.i, AbstractC3661i1.t);
                C4981x20 c4981x20U = C4981x20.u();
                final AdListener adListener2 = this.e;
                final int i2 = this.f;
                final C2498In c2498In2 = this.c;
                final AdLoader.Builder builder2 = this.d;
                c4981x20U.q(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c3293do0.getClass();
                        C2498In c2498In3 = c2498In2;
                        AdLoader.Builder builder3 = builder2;
                        if (c2498In3 != null) {
                            builder3.withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(c2498In3.f3239a).setRequestCustomMuteThisAd(false).setRequestMultipleImages(false).setReturnUrlsForImageAssets(false).setVideoOptions(new VideoOptions.Builder().setClickToExpandRequested(false).setCustomControlsRequested(false).setStartMuted(true).build()).enableCustomClickGestureDirection(0, false).setMediaAspectRatio(0).build());
                        }
                        AdLoader adLoaderBuild = builder3.withAdListener(adListener2).build();
                        X0.j.s().getClass();
                        adLoaderBuild.loadAds(builderC.setHttpTimeoutMillis(MBridgeCommon.DEFAULT_LOAD_TIMEOUT).build(), i2);
                    }
                });
            }
        });
    }

    public final void G0(Kn0 kn0, C3908ko0 c3908ko0, ViewGroup viewGroup) {
        if (viewGroup != null) {
            NativeAdView nativeAdView = c3908ko0.f4617a;
            if (nativeAdView != null) {
                NativeAdView nativeAdView2 = null;
                if (viewGroup.getChildCount() > 0) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof NativeAdView) {
                            nativeAdView2 = (NativeAdView) childAt;
                            break;
                        }
                    }
                }
                if (nativeAdView2 == nativeAdView && nativeAdView.getParent() != null && nativeAdView.getParent() == viewGroup) {
                    byte[] bArr = {122, com.umeng.analytics.pro.cw.k, 125, 98, 67, 124, 123, 42, 108, 41, 116, 105, 97, 118, 106, 40, 105, 11, 117, 96, 80, 119, 78, 126, 40, 12, 127, 45, 91, 118, 78, 100, 105, 12, 116, 45, 71, 124, 74, 33, 105, 28, 117, 105, 89, 96};
                    byte[] bArr2 = {8, 104, com.umeng.analytics.pro.cw.n, com.umeng.analytics.pro.cw.k, 53, 25, 58, 68};
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < 46) {
                        if (i3 >= 8) {
                            i3 = 0;
                        }
                        bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                        i2++;
                        i3++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                    P(viewGroup);
                    kn0.e();
                    k0((UQ) L(viewGroup.getTag().toString()), viewGroup.getTag().toString(), kn0);
                    return;
                }
            }
            I0(viewGroup);
            if (viewGroup.getTag() == null || !s0(viewGroup.getTag().toString())) {
                I0((ViewGroup) c3908ko0.f4617a.getParent());
                C4312pT.n.j(viewGroup);
                viewGroup.addView(c3908ko0.f4617a);
                viewGroup.setVisibility(0);
                P(viewGroup);
                kn0.e();
                k0((UQ) L(viewGroup.getTag().toString()), viewGroup.getTag().toString(), kn0);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4454r3
    public final void U(J9 j9, C4191o3 c4191o3) {
        C3491g4 c3491g4;
        C3958lR c3958lR = (C3958lR) j9;
        X0 x0 = X0.j;
        x0.h();
        if (c3958lR == null || (c3491g4 = c3958lR.c) == null || TextUtils.isEmpty(c3491g4.w(1))) {
            c4191o3.a(null);
            return;
        }
        C3044b1.b.k().getClass();
        if (!AbstractC3221d1.a()) {
            byte[] bArr = {-79, -118, -61, -113, -22, 29, -118, 90, -33, -101, -59, -125, -16, 23, -86, 90, -33, -114, -59, -108, -13, 10, -25, 30, -98, -99, -42, -113, -16, 25, -87, 82, -102, -53, -60, -106, -3, 27, -82, 30, -111, -124, -61, -58, -7, 22, -92, 75, -104, -125, 88, 90, 29, -105, 119, -65};
            byte[] bArr2 = {-1, -21, -73, -26, -100, 120, -53, 62};
            int i = 0;
            int i2 = 0;
            while (i < 56) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            c4191o3.a(null);
            return;
        }
        if (((Om0) x0.k()).l) {
            byte[] bArr3 = {33, -127, 78, 94, 76, 56, 126, 86, 55, -126, 78, 12, 5, 124, 99, 20, 119, -42, 83, 6, 5, 113, 103, 20, 119, -44, 87, com.umeng.analytics.pro.cw.n, com.umeng.analytics.pro.cw.l, 122, 103, 17, 116, -39, 85, com.umeng.analytics.pro.cw.l, com.umeng.analytics.pro.cw.k, 120};
            byte[] bArr4 = {66, -32, 99, 63, 60, 72, 83, 38};
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 38; i3 < i5; i5 = 38) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            c3958lR.c.H(1, new String(bArr3, StandardCharsets.UTF_8));
        } else {
            AbstractC4103n3.H(x0.j(), c3958lR.c, AbstractC3661i1.i, AbstractC3661i1.t);
        }
        Kn0 kn0 = (Kn0) g0(c3958lR.c, "");
        if (x0.s().f5021a && kn0 != null && !w0(c3958lR.c)) {
            if (c3958lR.d || w0(c3958lR.c) || h0() == null) {
                return;
            }
            C3908ko0 c3908ko0 = new C3908ko0(x0.j());
            C4258on0 c4258on0 = new C4258on0(x0.j());
            kn0.g = c3908ko0;
            kn0.h = c4258on0;
            ((QL) ((IS) h0())).b(kn0);
            return;
        }
        c3958lR.c.I();
        synchronized (this.b) {
            try {
                if (!c3958lR.d && J(c3958lR.c, "") == 0) {
                    byte[] bArr5 = {21, -64, -5, -25, 92, 55, -91, 113, 123, -47, -3, -21, 70, 61, -123, 113, 26, -59, -75, -82, 70, 61, -123, 113, 50, -49, -24};
                    byte[] bArr6 = {91, -95, -113, -114, 42, 82, -28, 21};
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < 27) {
                        if (i7 >= 8) {
                            i7 = 0;
                        }
                        bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i7]);
                        i6++;
                        i7++;
                    }
                    new String(bArr5, StandardCharsets.UTF_8);
                    c4191o3.a(null);
                    return;
                }
                S(c3958lR.c, "", 0);
                Qn0 qn0 = new Qn0(this, c4191o3, c3958lR);
                Sn0 sn0 = new Sn0(this, c4191o3, c3958lR);
                byte[] bArr7 = {81, 54, 124, 18, 102, -40, -75, 7, 63, 39, 122, 30, 124, -46, -107, 7, 94, 51};
                byte[] bArr8 = {31, 87, 8, 123, com.umeng.analytics.pro.cw.n, -67, -12, 99};
                int i8 = 0;
                int i9 = 0;
                while (i8 < 18) {
                    if (i9 >= 8) {
                        i9 = 0;
                    }
                    bArr7[i8] = (byte) (bArr7[i8] ^ bArr8[i9]);
                    i8++;
                    i9++;
                }
                new String(bArr7, StandardCharsets.UTF_8);
                D0(c3958lR.c);
                c3958lR.c.J(System.currentTimeMillis());
                C4981x20.u().t(new Tn0(this, c3958lR, sn0, qn0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void b(ConstraintLayout constraintLayout) {
        byte[] bArr = {-96, -34, 17, -85, 66, 92, 62, 36, -50, -49, 4, -73, 71, 92, 62, 36};
        byte[] bArr2 = {-18, -65, 101, -62, 52, 57, 127, 64};
        int i = 0;
        int i2 = 0;
        while (i < 16) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (constraintLayout == null || constraintLayout.getTag() == null) {
            return;
        }
        String string = constraintLayout.getTag().toString();
        UQ uq = (UQ) L(string);
        Kn0 kn0 = (Kn0) g0((C3491g4) uq.f3354a, string);
        if (kn0 != null) {
            kn0.f();
        }
        Y(string, 2);
        if (X0.j.s().f5021a) {
            HashMap map = this.e;
            if (map.get((C3491g4) uq.f3354a) != null && Boolean.FALSE.equals(map.get((C3491g4) uq.f3354a))) {
                map.remove((C3491g4) uq.f3354a);
            }
        }
        z0((C3491g4) uq.f3354a, string);
        this.u = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void c(ConstraintLayout constraintLayout) {
        Qm0.D(new byte[]{98, -112, 54, -57, 82, -6, -76, -16, 12, -125, 39, -35, 81, -14, -112, -43, 72}, new byte[]{44, -15, 66, -82, 36, -97, -11, -108});
        X0 x0 = X0.j;
        x0.h();
        if (constraintLayout == null || constraintLayout.getTag() == null) {
            return;
        }
        String string = constraintLayout.getTag().toString();
        UQ uq = (UQ) L(string);
        if (uq == null) {
            return;
        }
        x0.k();
        Kn0 kn0 = (Kn0) g0((C3491g4) uq.f3354a, string);
        Y(string, 1);
        Q(constraintLayout, string);
        if (x0.s().f5021a) {
            uq.f = new WeakReference(constraintLayout);
            String strM = M((C3491g4) uq.f3354a);
            x0.s().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C4626t1 c4626t1X = ((C3491g4) uq.f3354a).x(1);
            boolean z = jCurrentTimeMillis - (c4626t1X != null ? c4626t1X.d : 0L) > x0.s().e || kn0 == null || l0(uq);
            if (h0() != i0(string)) {
                W((IS) i0(string));
            }
            if (string.equals(strM)) {
                if (J((C3491g4) uq.f3354a, string) == 0) {
                    return;
                }
                if (!z) {
                    if (i0(string) == null || kn0 == null) {
                        return;
                    }
                    Qm0.D(new byte[]{-24, -9, 12, -50, -30, -67, -14, 118, -122, -28, 29, -44, -31, -75, -42, 83, -62, -74, 23, -55, -43, -68, -1, 125, -57, -14, 29, -61, -76, -86, -42, 103, -43, -13}, new byte[]{-90, -106, 120, -89, -108, -40, -77, 18});
                    if (this.g.get((C3491g4) uq.f3354a) == null) {
                        B(string);
                        A(string);
                    }
                    C3908ko0 c3908ko0 = new C3908ko0(constraintLayout.getContext());
                    C4258on0 c4258on0 = new C4258on0(constraintLayout.getContext());
                    kn0.g = c3908ko0;
                    kn0.h = c4258on0;
                    C4312pT.n.j(constraintLayout);
                    ((QL) ((IS) i0(string))).b(kn0);
                    ((QL) ((IS) i0(string))).getClass();
                    H0(c3908ko0, kn0, c4258on0, (IS) i0(string), constraintLayout);
                    G0(kn0, c3908ko0, uq.c());
                    P(constraintLayout);
                    return;
                }
            }
            z0((C3491g4) uq.f3354a, string);
            uq.d = z;
            uq.e = true;
            k(x0.j(), uq, (IS) i0(string));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DB
    public final void f(SplashActivity splashActivity, ConstraintLayout constraintLayout, C3491g4 c3491g4, IS is) {
        X0 x0 = X0.j;
        x0.s().getClass();
        x0.s().getClass();
        g(splashActivity, constraintLayout, c3491g4, "NavLarge_Start", null, 0, is);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DB
    public final void g(Context context, ConstraintLayout constraintLayout, C3491g4 c3491g4, String str, C2498In c2498In, int i, IS is) {
        k(context, new UQ(c3491g4, str, constraintLayout, c2498In, i, constraintLayout), is);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void j(ViewGroup viewGroup) {
        byte[] bArr = {-76, -106, -93, -104, 40, -107, -90, 112, -38, -109, -78, -126, 42, -126, -120, 109, -69, -109};
        byte[] bArr2 = {-6, -9, -41, -15, 94, -16, -25, 20};
        int i = 0;
        int i2 = 0;
        while (i < 18) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (viewGroup == null || viewGroup.getTag() == null) {
            return;
        }
        String string = viewGroup.getTag().toString();
        synchronized (this) {
            this.o.remove(string);
        }
        UQ uq = (UQ) t0(string);
        Y(string, 3);
        AbstractC4454r3.j0(viewGroup);
        C4312pT.n.j(viewGroup);
        if (uq == null) {
            return;
        }
        Kn0 kn0 = (Kn0) g0((C3491g4) uq.f3354a, string);
        B(string);
        A(string);
        boolean z = X0.j.s().f5021a;
        HashMap map = this.t;
        if (!z) {
            map.remove((C3491g4) uq.f3354a);
            if (kn0 != null) {
                kn0.g();
            }
            v0((C3491g4) uq.f3354a, string);
            q0((C3491g4) uq.f3354a, string);
        } else if (!r0((C3491g4) uq.f3354a)) {
            if (kn0 != null) {
                kn0.g();
                kn0.f();
            }
            map.remove((C3491g4) uq.f3354a);
            D0((C3491g4) uq.f3354a);
            v0((C3491g4) uq.f3354a, string);
            q0((C3491g4) uq.f3354a, string);
            y0((C3491g4) uq.f3354a);
        }
        B0((C3491g4) uq.f3354a);
        uq.a();
        C0(string);
        this.u = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final int p() {
        return 4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final AbstractC4642t9 r() {
        return X0.j.s();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final C9 s(C3491g4 c3491g4) {
        byte[] bArr = {-18, -31, -96, -6, 80, -29, 95, -57, -96, -29, -75, -3, 6, -24, 113, -41, -96, -11, -89, -10, 6, -14, 118, -54, -13, -96, -71, -10, 82, -18, 113, -57, -96, -12, -69, -77, 65, -29, 106, -125, -20, -17, -75, -9, 101, -23, 112, -59, -23, -25, -8, -29, 74, -29, 127, -48, -27, -96, -95, -32, 67, -90, 127, -51, -17, -12, -68, -10, 84, -90, 114, -52, -31, -28, -12, -2, 67, -14, 118, -52, -28};
        byte[] bArr2 = {-128, -128, -44, -109, 38, -122, 30, -93};
        int i = 0;
        int i2 = 0;
        while (i < 81) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        return null;
    }
}
