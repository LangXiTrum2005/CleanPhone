package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import bc.s;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.config.component.style.StyleCpt;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.view.ScarBannerContainer;
import f.i;
import f.l;
import io.flutter.plugin.platform.n;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.o;
import l1.w;
import l1.y;
import p1.b0;
import p1.h;
import p1.h0;
import p1.z0;
import wi.j;
import xi.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32082b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f32081a = i10;
        this.f32082b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0142 A[Catch: all -> 0x0107, TryCatch #1 {, blocks: (B:60:0x00fc, B:62:0x0100, B:69:0x010d, B:73:0x0114, B:79:0x011f, B:81:0x0123, B:83:0x0129, B:85:0x0133, B:87:0x013d, B:89:0x014e, B:88:0x0142, B:90:0x0150, B:92:0x0163, B:94:0x016b), top: B:151:0x00fc }] */
    @Override // java.lang.Runnable
    public final void run() {
        String strH;
        TelephonyManager telephonyManager;
        boolean zIsEmpty;
        int i10 = this.f32081a;
        boolean z10 = false;
        byte b10 = 0;
        Object obj = this.f32082b;
        switch (i10) {
            case 0:
                ((b) obj).f();
                return;
            case 1:
                ((com.mbridge.msdk.config.component.status.b) obj).c();
                return;
            case 2:
                ((StyleCpt) obj).m();
                return;
            case 3:
                ((MoreOfferContainerView) obj).a();
                return;
            case 4:
                UnityAdsImplementation.lambda$load$2((InternalLoadListener) obj);
                return;
            case 5:
                ((BiddingBaseManager) obj).lambda$fetchSignals$1();
                return;
            case 6:
                ((ShowOperationState) obj).lambda$onUnityAdsShowClick$1();
                return;
            case 7:
                ((BannerView) obj).lambda$addScarContainer$0();
                return;
            case 8:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) obj);
                return;
            case 9:
                ((InitializationListener) obj).onInitializationComplete(null);
                return;
            case 10:
                ((d2.e) obj).y();
                return;
            case 11:
                w6.e eVar = (w6.e) obj;
                if (eVar.isCancelled()) {
                    return;
                }
                try {
                    eVar.get();
                    return;
                } catch (Exception e10) {
                    l8.a.b(e10);
                    return;
                }
            case 12:
                ((k3) obj).getClass();
                return;
            case 13:
                ei.a aVar = (ei.a) obj;
                g gVar = aVar.f40097b;
                ConnectivityManager connectivityManager = (ConnectivityManager) aVar.f40096a.f47386b;
                gVar.b(od.c.h(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case 14:
                i iVar = (i) obj;
                Runnable runnable = iVar.f40222b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f40222b = null;
                    return;
                }
                return;
            case 15:
                l.a((l) obj);
                return;
            case 16:
                ((n) obj).f(false);
                return;
            case 17:
                s sVar = (s) obj;
                ((Context) sVar.f5581b).unregisterReceiver((j1.a) sVar.f5582c);
                return;
            case 18:
                j1.a aVar2 = (j1.a) obj;
                if (aVar2.f43578c.f5580a) {
                    aVar2.f43576a.f48170a.i1(3, false);
                    return;
                }
                return;
            case 19:
                o oVar = (o) obj;
                j2.f fVar = (j2.f) oVar.f44800a.get();
                if (fVar != null) {
                    int iB = oVar.f44802c.b();
                    j2.g gVar2 = fVar.f43639a;
                    synchronized (gVar2) {
                        int i11 = gVar2.f43659n;
                        if (i11 == 0 || gVar2.f43651e) {
                            if (i11 != iB || gVar2.f43660o == null) {
                                gVar2.f43659n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (gVar2.f43660o == null) {
                                        Context context = gVar2.f43647a;
                                        String str = y.f44830a;
                                        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                            strH = q1.H(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strH = q1.H(Locale.getDefault().getCountry());
                                            } else {
                                                strH = q1.H(networkCountryIso);
                                            }
                                        }
                                        gVar2.f43660o = strH;
                                    }
                                    gVar2.l = gVar2.a(iB);
                                    gVar2.f43650d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    gVar2.b(gVar2.f43653g > 0 ? (int) (jElapsedRealtime - gVar2.f43654h) : 0, gVar2.f43655i, gVar2.l);
                                    gVar2.f43654h = jElapsedRealtime;
                                    gVar2.f43655i = 0L;
                                    gVar2.f43657k = 0L;
                                    gVar2.f43656j = 0L;
                                    j2.s sVar2 = gVar2.f43652f;
                                    sVar2.f43689a.clear();
                                    sVar2.f43691c = -1;
                                    sVar2.f43692d = 0;
                                    sVar2.f43693e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 20:
                ((l2.c) obj).f44853h.d();
                return;
            case 21:
                ((l2.o) obj).f44917m--;
                return;
            case 22:
                l2.s sVar3 = (l2.s) obj;
                sVar3.f15045b.postVsyncCallback(sVar3);
                return;
            case 23:
                ((l7.f) obj).a();
                return;
            case 24:
                ((j) obj).c();
                return;
            case 25:
                ViewObserver.process$lambda$0((ViewObserver) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                oi.g gVar3 = (oi.g) obj;
                ExecutorService executorService = gVar3.f47449a;
                ConcurrentLinkedQueue concurrentLinkedQueue = gVar3.f47450b;
                AtomicBoolean atomicBoolean = gVar3.f47451c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    int i12 = 26;
                    try {
                        Runnable runnable2 = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (zIsEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new f(gVar3, i12));
                        }
                    }
                    break;
                }
                return;
            case 27:
                b0 b0Var = (b0) obj;
                kj1 kj1Var = b0Var.C;
                Context context2 = b0Var.f47935e;
                String str2 = y.f44830a;
                int iGenerateAudioSessionId = j1.f.u(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                kj1Var.f16467f = numValueOf;
                l1.b bVar = new l1.b(kj1Var, numValueOf, b10 == true ? 1 : 0);
                w wVar = (w) kj1Var.f16464c;
                if (wVar.f44825a.getLooper().getThread().isAlive()) {
                    wVar.c(bVar);
                    return;
                }
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                q1.f fVar2 = ((h0) obj).f48069w;
                fVar2.I(fVar2.D(), IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new ni.g(22));
                return;
            default:
                z0 z0Var = (z0) obj;
                try {
                    synchronized (z0Var) {
                    }
                    try {
                        z0Var.f48203a.handleMessage(z0Var.f48205c, z0Var.f48206d);
                        return;
                    } finally {
                        z0Var.a(true);
                    }
                } catch (h e11) {
                    l1.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
        }
    }

    public /* synthetic */ f(h0 h0Var, int i10) {
        this.f32081a = 28;
        this.f32082b = h0Var;
    }

    public /* synthetic */ f(h0 h0Var, z0 z0Var) {
        this.f32081a = 29;
        this.f32082b = z0Var;
    }
}
