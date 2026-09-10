package androidx.fragment.app;

import android.os.Bundle;
import android.os.HandlerThread;
import android.view.View;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.Be;
import com.ironsource.C0289cg;
import com.ironsource.C0303dc;
import com.ironsource.Ce;
import com.ironsource.InterfaceC0591te;
import com.ironsource.O9;
import com.ironsource.S8;
import com.ironsource.Ve;
import com.ironsource.W2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4401b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f4400a = i10;
        this.f4401b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        int i10 = this.f4400a;
        Object obj = this.f4401b;
        switch (i10) {
            case 0:
                r1.a((ArrayList) obj, 4);
                return;
            case 1:
                ((Fragment) obj).lambda$performCreateView$0();
                return;
            case 2:
                Iterator it = ((g1) obj).f4334n.iterator();
                if (it.hasNext()) {
                    throw f2.j(it);
                }
                return;
            case 3:
                androidx.lifecycle.k0 k0Var = (androidx.lifecycle.k0) obj;
                androidx.lifecycle.x xVar = k0Var.f4561f;
                if (k0Var.f4557b == 0) {
                    k0Var.f4558c = true;
                    xVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (k0Var.f4556a == 0 && k0Var.f4558c) {
                    xVar.e(androidx.lifecycle.m.ON_STOP);
                    k0Var.f4559d = true;
                    return;
                }
                return;
            case 4:
                ((HandlerThread) obj).quit();
                return;
            case 5:
                fc.f fVar = (fc.f) obj;
                synchronized (((AtomicMarkableReference) fVar.f40786h)) {
                    try {
                        z10 = false;
                        if (((AtomicMarkableReference) fVar.f40786h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) fVar.f40786h).getReference();
                            ((AtomicMarkableReference) fVar.f40786h).set(str, false);
                            z10 = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (z10) {
                    ((bc.h) fVar.f40781c).j((String) fVar.f40780b, str);
                    return;
                }
                return;
            case 6:
                bc.s sVar = (bc.s) obj;
                Map mapUnmodifiableMap = null;
                ((AtomicReference) sVar.f5582c).set(null);
                synchronized (sVar) {
                    if (((AtomicMarkableReference) sVar.f5581b).isMarked()) {
                        bc.e eVar = (bc.e) ((AtomicMarkableReference) sVar.f5581b).getReference();
                        synchronized (eVar) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f5543a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) sVar.f5581b;
                        atomicMarkableReference.set((bc.e) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    fc.f fVar2 = (fc.f) sVar.f5583d;
                    ((bc.h) fVar2.f40781c).h((String) fVar2.f40780b, mapUnmodifiableMap, sVar.f5580a);
                    return;
                }
                return;
            case 7:
                ((AppLovinFullscreenActivity) obj).c();
                return;
            case 8:
                AppLovinBroadcastManager.sendBroadcastSync((CommunicatorMessageImpl) obj, null);
                return;
            case 9:
                ((com.applovin.impl.sdk.b) obj).c();
                return;
            case 10:
                ((com.applovin.impl.sdk.g) obj).i();
                return;
            case 11:
                ((com.applovin.impl.sdk.network.b) obj).e();
                return;
            case 12:
                ((MaxNativeAdView) obj).a();
                return;
            case 13:
                ((MaxAdPlacer) obj).b();
                return;
            case 14:
                AppEventQueue.flush$lambda$2((FlushReason) obj);
                return;
            case 15:
                UserDataStore.setUserDataAndHash$lambda$1((Bundle) obj);
                return;
            case 16:
                AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint$lambda$0((l7.b0) obj);
                return;
            case 17:
                CodelessMatcher.startTracking$lambda$1((CodelessMatcher) obj);
                return;
            case 18:
                Be.b((Be) obj);
                return;
            case 19:
                Ce.a((InterfaceC0591te) obj);
                return;
            case 20:
                Ce.b((Ve) obj);
                return;
            case 21:
                Ce.a((IronSourceError) obj);
                return;
            case 22:
                O9.a((InitListener) obj);
                return;
            case 23:
                W2.a.a((View) obj);
                return;
            case 24:
                C0289cg.e((C0289cg) obj);
                return;
            case 25:
                C0289cg.a((S8) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                C0289cg.b.a((C0289cg.b) obj);
                return;
            case 27:
                C0303dc.a((C0303dc) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ((com.ironsource.sdk.controller.v) obj).C();
                return;
            default:
                ((com.mbridge.msdk.config.component.common.network.connect.socket.c) obj).c();
                return;
        }
    }
}
