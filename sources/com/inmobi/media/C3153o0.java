package com.inmobi.media;

import A.RunnableC0900k0;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3153o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f23842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23844c;
    public final AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f23845e;
    public final CopyOnWriteArrayList f;
    public AdQualityControl g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EnumC2991df f23846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdQualityResult f23847i;
    public String j;
    public JSONObject k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f23848l;

    public C3153o0(AdConfig.AdQualityConfig adQualityConfig, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(adQualityConfig, "adQualityConfig");
        this.f23842a = adQualityConfig;
        this.f23843b = interfaceC3333z5;
        this.f23844c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.f23845e = new AtomicBoolean(false);
        this.f = new CopyOnWriteArrayList();
        this.f23846h = EnumC2991df.UNKNOWN;
        this.j = "";
        this.k = new JSONObject();
        this.f23848l = new AtomicBoolean(false);
    }

    public final boolean a() {
        if (this.f23844c.get()) {
            a("ad quality session is already in progress. skipping...");
            return false;
        }
        if (!this.f23842a.getEnabled()) {
            a("config kill switch - false. ad quality will skip");
            return false;
        }
        if (this.g == null) {
            a("setup not done. skipping");
            return false;
        }
        EnumC2991df enumC2991df = this.f23846h;
        if (enumC2991df != EnumC2991df.UNKNOWN && enumC2991df != EnumC2991df.HIDDEN) {
            return true;
        }
        a("ad view is not visible. skipping");
        return false;
    }

    public final void a(AdQualityResult adQualityResult, boolean z2) {
        if (adQualityResult.getBeaconUrl().length() == 0) {
            a("beacon is empty");
            return;
        }
        C3275vb c3275vb = new C3275vb(adQualityResult);
        C3057i0 c3057i0 = new C3057i0(this, z2);
        C3073j0 shouldProcess = C3073j0.f23709a;
        Intrinsics.f(shouldProcess, "shouldProcess");
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        C3009f0.a(0L, new C2975d(shouldProcess, c3275vb, c3057i0));
    }

    public final void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, long j, boolean z2, Jb jb) {
        a("isCapture started - " + this.f23848l.get() + ", isReporting - " + z2);
        if (this.f23848l.get() && !z2) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            gestureDetectorOnGestureListenerC3005ec.post(new RunnableC0900k0(this, gestureDetectorOnGestureListenerC3005ec, j, z2, jb, 0));
        }
    }

    public static final void a(C3153o0 this$0, View adView, long j, boolean z2, Jb jb) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adView, "$adView");
        Log.i("AdQualityManager", "starting capture - draw");
        Qc qc = new Qc(adView, this$0.f23842a);
        if (!z2) {
            this$0.f.add(qc);
        }
        C3121m0 c3121m0 = new C3121m0(this$0, qc, z2, jb);
        C3137n0 c3137n0 = new C3137n0(this$0);
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        C3009f0.a(j, new C2975d(c3137n0, qc, c3121m0));
        this$0.f23848l.set(!z2);
    }

    public final void a(Activity activity, long j, boolean z2, Jb jb) {
        a("isCapture started - " + this.f23848l.get() + ", isReporting - " + z2);
        if (this.f23848l.get() && !z2) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            activity.getWindow().getDecorView().post(new RunnableC0900k0(this, activity, j, z2, jb, 1));
        }
    }

    public static final void a(C3153o0 this$0, Activity activity, long j, boolean z2, Jb jb) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(activity, "$activity");
        this$0.a("activity is visible");
        Window window = activity.getWindow();
        Intrinsics.e(window, "getWindow(...)");
        Qa qa = new Qa(window, this$0.f23842a);
        if (!z2) {
            this$0.f.add(qa);
        }
        C3121m0 c3121m0 = new C3121m0(this$0, qa, z2, jb);
        C3137n0 c3137n0 = new C3137n0(this$0);
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        C3009f0.a(j, new C2975d(c3137n0, qa, c3121m0));
        this$0.f23848l.set(!z2);
    }

    public final void a(String str, byte[] bArr, boolean z2) {
        Context contextD = Uc.d();
        if (contextD != null) {
            Dd dd = new Dd(contextD.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z2) {
                this.f.add(dd);
            }
            C3089k0 c3089k0 = new C3089k0(this, z2, dd, str);
            C3105l0 shouldProcess = C3105l0.f23757a;
            Intrinsics.f(shouldProcess, "shouldProcess");
            ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
            C3009f0.a(0L, new C2975d(shouldProcess, dd, c3089k0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    public final void a(boolean z2) {
        String beacon;
        AdQualityResult adQualityResult;
        Log.i("AdQualityManager", "checking for trigger");
        AdQualityControl adQualityControl = this.g;
        if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
            return;
        }
        if (this.f.isEmpty() && this.d.get() && !this.f23845e.get()) {
            this.f23845e.set(true);
            a("session end - queuing result");
            AdQualityResult adQualityResult2 = this.f23847i;
            if (adQualityResult2 == null) {
                adQualityResult2 = new AdQualityResult(AbstractJsonLexerKt.NULL, null, beacon, null, 8, null);
            }
            a(adQualityResult2, true);
            return;
        }
        if (this.d.get() && !z2 && !this.f23845e.get()) {
            this.f23845e.set(true);
            a("session stop - queuing result");
            ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
                try {
                    try {
                        scheduledExecutorService.shutdownNow();
                    } catch (Exception e2) {
                        Log.e("AdQualityComponent", "shutdown fail", e2);
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                    Thread.currentThread().interrupt();
                    adQualityResult = this.f23847i;
                    if (adQualityResult == null) {
                        adQualityResult = new AdQualityResult(AbstractJsonLexerKt.NULL, null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
            }
            adQualityResult = this.f23847i;
            if (adQualityResult == null) {
                adQualityResult = new AdQualityResult(AbstractJsonLexerKt.NULL, null, beacon, null, 8, null);
            }
            a(adQualityResult, true);
            return;
        }
        String message = "list size - " + this.f.size() + " session end triggered - " + this.d.get() + " queue triggered - " + this.f23845e + " waiting";
        Intrinsics.f(message, "message");
        Log.i("AdQualityManager", message);
    }

    public final void a(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23843b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("AdQualityManager", str);
        }
    }

    public final void a(Exception exc, String str) {
        Unit unit;
        if (exc != null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23843b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("AdQualityManager", str, exc);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23843b;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("AdQualityManager", AbstractC3041h0.a("Error with null exception : ", str));
        }
    }
}
