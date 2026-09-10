package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Handler;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class Wm0 implements InterfaceC5232zt, ModelLoaderFactory, InterfaceC4724u6, InterfaceC2693Qb, InterfaceC3473fr, Bg0, GG, AdViewParentApi, InterfaceC4792ut, PAGInterstitialAdInteractionListener, PAGRewardedAdInteractionListener, InterfaceC4968wt, InterfaceC4985x40, InterfaceC3021al, InterfaceC4897w40, LT {
    public static volatile Wm0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3939a;
    public Object b;

    public Wm0(int i) {
        this.f3939a = i;
        if (i == 2) {
            this.b = new C4508rh();
            return;
        }
        if (i == 4) {
            this.b = new ArrayDeque();
            return;
        }
        int i2 = 8;
        if (i == 8) {
            this.b = new NN(this, i2);
            return;
        }
        if (i == 11) {
            this.b = new NN();
            return;
        }
        if (i == 22) {
            this.b = new JT(10);
        } else {
            if (i != 27) {
                this.b = new HashSet();
                return;
            }
            try {
                this.b = XmlPullParserFactory.newInstance();
            } catch (XmlPullParserException e) {
                throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
            }
        }
    }

    public static Wm0 y() {
        if (c == null) {
            synchronized (Wm0.class) {
                try {
                    if (c == null) {
                        int i = 0;
                        c = new Wm0(i, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final C3029ap A() {
        C3029ap c3029ap;
        synchronized (((Queue) this.b)) {
            c3029ap = (C3029ap) ((Queue) this.b).poll();
        }
        return c3029ap == null ? new C3029ap() : c3029ap;
    }

    public final void B(C3029ap c3029ap) {
        synchronized (((Queue) this.b)) {
            try {
                if (((Queue) this.b).size() < 10) {
                    ((Queue) this.b).offer(c3029ap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(Exception exc) {
        AbstractC4038mJ.d("Audio sink error", exc);
        C3491g4 c3491g4 = ((C4481rN) this.b).D0;
        Handler handler = (Handler) c3491g4.b;
        if (handler != null) {
            handler.post(new RunnableC3935l7(c3491g4, exc, 1));
        }
    }

    public final void D() {
        Object obj = this.b;
        C2587Lz c2587Lz = (C2587Lz) obj;
        int i = c2587Lz.s - 1;
        c2587Lz.s = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C3591hA c3591hA : ((C2587Lz) obj).u) {
            c3591hA.g();
            i2 += c3591hA.I.f4703a;
        }
        C3974ld0[] c3974ld0Arr = new C3974ld0[i2];
        int i3 = 0;
        for (C3591hA c3591hA2 : ((C2587Lz) this.b).u) {
            c3591hA2.g();
            int i4 = c3591hA2.I.f4703a;
            int i5 = 0;
            while (i5 < i4) {
                c3591hA2.g();
                c3974ld0Arr[i3] = c3591hA2.I.a(i5);
                i5++;
                i3++;
            }
        }
        ((C2587Lz) this.b).t = new C4062md0(c3974ld0Arr);
        Object obj2 = this.b;
        ((C2587Lz) obj2).r.p((C2587Lz) obj2);
    }

    public final Metadata E(InterfaceC4265ot interfaceC4265ot, InterfaceC3064bC interfaceC3064bC) {
        Metadata metadataK0 = null;
        int i = 0;
        while (true) {
            try {
                interfaceC4265ot.peekFully(((JT) this.b).f3266a, 0, 10);
                ((JT) this.b).E(0);
                if (((JT) this.b).v() != 4801587) {
                    break;
                }
                ((JT) this.b).F(3);
                int iS = ((JT) this.b).s();
                int i2 = iS + 10;
                if (metadataK0 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(((JT) this.b).f3266a, 0, bArr, 0, 10);
                    interfaceC4265ot.peekFully(bArr, 10, iS);
                    metadataK0 = new C3241dC(interfaceC3064bC).k0(i2, bArr);
                } else {
                    interfaceC4265ot.advancePeekPosition(iS);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC4265ot.resetPeekPosition();
        interfaceC4265ot.advancePeekPosition(i);
        return metadataK0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2693Qb
    public final Class a() {
        return InputStream.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        boolean zContinueLoading;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (InterfaceC4985x40 interfaceC4985x40 : (InterfaceC4985x40[]) this.b) {
                long nextLoadPositionUs2 = interfaceC4985x40.getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zContinueLoading |= interfaceC4985x40.continueLoading(j);
                }
            }
            z |= zContinueLoading;
        } while (zContinueLoading);
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5232zt
    public final Object create() {
        try {
            return new L20(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GG
    public final void d(UG ug) {
        int iG = ug.g();
        synchronized (((C4959wm0) this.b).b) {
            try {
                Map map = (Map) ((C4959wm0) this.b).b.get(iG);
                if (map != null) {
                    map.remove(ug.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        No0 no0 = AbstractC4648tE.f5026a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long e(long j, long j2) {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long f(long j, long j2) {
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final C3614hX g(long j) {
        return (C3614hX) this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        String packageName = ((Context) ((InterfaceC5194zW) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC4985x40 interfaceC4985x40 : (InterfaceC4985x40[]) this.b) {
            long bufferedPositionUs = interfaceC4985x40.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC4985x40 interfaceC4985x40 : (InterfaceC4985x40[]) this.b) {
            long nextLoadPositionUs = interfaceC4985x40.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long getTimeUs(long j) {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long h(long j, long j2) {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bg0
    public final InterfaceC3551gl i(Uri uri) {
        return new C4373q6((ContentResolver) this.b, uri, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        for (InterfaceC4985x40 interfaceC4985x40 : (InterfaceC4985x40[]) this.b) {
            if (interfaceC4985x40.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2693Qb
    public final Object j(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT
    public final Object l(Uri uri, C4692tl c4692tl) throws KT {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.b).newPullParser();
            xmlPullParserNewPullParser.setInput(c4692tl, null);
            return (R80) new V80(uri.toString()).e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e) {
            throw KT.b(null, e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long m(long j) {
        return 1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        C2587Lz c2587Lz = (C2587Lz) this.b;
        c2587Lz.r.o(c2587Lz);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        switch (this.f3939a) {
            case 16:
                MediationInterstitialAdCallback mediationInterstitialAdCallback = ((PangleInterstitialAd) this.b).g;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.reportAdClicked();
                }
                break;
            default:
                MediationRewardedAdCallback mediationRewardedAdCallback = ((PangleRewardedAd) this.b).g;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.reportAdClicked();
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        switch (this.f3939a) {
            case 16:
                MediationInterstitialAdCallback mediationInterstitialAdCallback = ((PangleInterstitialAd) this.b).g;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.onAdClosed();
                }
                break;
            default:
                MediationRewardedAdCallback mediationRewardedAdCallback = ((PangleRewardedAd) this.b).g;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdClosed();
                }
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        switch (this.f3939a) {
            case 16:
                MediationInterstitialAdCallback mediationInterstitialAdCallback = ((PangleInterstitialAd) this.b).g;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.onAdOpened();
                    ((PangleInterstitialAd) this.b).g.reportAdImpression();
                }
                break;
            default:
                MediationRewardedAdCallback mediationRewardedAdCallback = ((PangleRewardedAd) this.b).g;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdOpened();
                    ((PangleRewardedAd) this.b).g.reportAdImpression();
                }
                break;
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.widget.RelativeLayout*/.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        C3692iN c3692iN = new C3692iN(this, pAGRewardItem, 20);
        MediationRewardedAdCallback mediationRewardedAdCallback = ((PangleRewardedAd) this.b).g;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onUserEarnedReward(c3692iN);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedRewardFail(int i, String str) {
        PangleConstants.createSdkError(i, "Failed to reward user: " + str).toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        for (InterfaceC4985x40 interfaceC4985x40 : (InterfaceC4985x40[]) this.b) {
            interfaceC4985x40.reevaluateBuffer(j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4724u6
    public final C2711Qt s(AssetManager assetManager, String str) {
        return new C2711Qt(assetManager, str, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final boolean t() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long u() {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long v(long j, long j2) {
        return 1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3473fr
    public final boolean w(Object obj, File file, YS ys) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((C4391qK) this.b).d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    ((C4391qK) this.b).h(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    ((C4391qK) this.b).h(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            ((C4391qK) this.b).h(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void x(C4172no0 c4172no0) {
        if (AbstractC4648tE.c) {
            "afterExecute, ProxyTask: ".concat(String.valueOf(c4172no0));
        }
        int iG = c4172no0.g();
        synchronized (((C4963wo0) this.b).f) {
            try {
                Set set = (Set) ((C4963wo0) this.b).f.get(iG);
                if (set != null) {
                    set.remove(c4172no0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        switch (this.f3939a) {
            case 6:
                return new C4812v6((AssetManager) this.b, this);
            case 7:
            case 9:
            default:
                return new TA((NN) this.b);
            case 8:
                return new C2745Sb((NN) this.b, 1);
            case 10:
                return new Cg0(this);
        }
    }

    public /* synthetic */ Wm0(int i, int i2) {
        this.f3939a = i;
        this.b = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wm0(com.google.android.exoplayer2.drm.b bVar) {
        this(bVar, 21);
        this.f3939a = 21;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wm0(C2936Zk c2936Zk) {
        this(c2936Zk, 24);
        this.f3939a = 24;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wm0(C2587Lz c2587Lz) {
        this(c2587Lz, 26);
        this.f3939a = 26;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Wm0(C4481rN c4481rN) {
        this(c4481rN, 20);
        this.f3939a = 20;
    }

    public /* synthetic */ Wm0(Object obj, int i) {
        this.f3939a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long c(long j, long j2) {
        return j2;
    }
}
