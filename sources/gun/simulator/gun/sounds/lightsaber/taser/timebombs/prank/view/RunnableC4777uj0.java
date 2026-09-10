package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC4777uj0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5096a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC4777uj0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f5096a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5096a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                C5041xj0.m285shouldOverrideUrlLoading$lambda6$lambda5$lambda4((InterfaceC4957wl0) obj6, (String) obj5, (FF) obj4, (Handler) obj3, (C5041xj0) obj2, (WebView) obj);
                break;
            case 1:
                C3 c3 = (C3) obj6;
                D3 d3 = (D3) obj5;
                WeakReference weakReference = (WeakReference) obj4;
                Activity activity = (Activity) obj3;
                HS hs = (HS) obj2;
                HS hs2 = (HS) obj;
                c3.getClass();
                try {
                    Dialog dialog = d3.g;
                    Context context = dialog.getContext();
                    if (dialog.isShowing()) {
                        if (context == null || context.isRestricted()) {
                            dialog.setCancelable(true);
                            dialog.setCanceledOnTouchOutside(true);
                        } else {
                            dialog.dismiss();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (weakReference.get() != null) {
                    c3.W(activity, d3, hs);
                } else if (hs2 != null) {
                    hs2.d(null);
                    hs2.h(false);
                }
                break;
            case 2:
                C3 c4 = (C3) obj6;
                MD md = (MD) obj4;
                WeakReference weakReference2 = (WeakReference) obj3;
                c4.getClass();
                C3.a0().getClass();
                AdManagerAdRequest adManagerAdRequestBuild = ((AdManagerAdRequest.Builder) obj5).setHttpTimeoutMillis(MBridgeCommon.DEFAULT_LOAD_TIMEOUT).build();
                ((C3491g4) md.f3354a).J(System.currentTimeMillis());
                c4.N((C3491g4) md.f3354a, new C3468fn0(c4, md, new WeakReference((Context) weakReference2.get()), (GS) obj2));
                InterstitialAd.load((Context) weakReference2.get(), ((C3491g4) md.f3354a).w(1), adManagerAdRequestBuild, new A3(c4, md, (Context) obj));
                break;
            case 3:
                C3927l3 c3927l3 = (C3927l3) obj6;
                I5 i5 = (I5) obj4;
                WeakReference weakReference3 = (WeakReference) obj3;
                c3927l3.getClass();
                X0.j.r().getClass();
                AdManagerAdRequest adManagerAdRequestBuild2 = ((AdManagerAdRequest.Builder) obj5).setHttpTimeoutMillis(MBridgeCommon.DEFAULT_LOAD_TIMEOUT).build();
                ((C3491g4) i5.f3354a).J(System.currentTimeMillis());
                c3927l3.N((C3491g4) i5.f3354a, new C3468fn0(c3927l3, i5, new WeakReference((Context) weakReference3.get()), (C4806v3) obj2));
                AppOpenAd.load(((Context) weakReference3.get()).getApplicationContext(), ((C3491g4) i5.f3354a).w(1).trim(), adManagerAdRequestBuild2, new C3839k3(c3927l3, i5, (Context) obj));
                break;
            default:
                H3 h3 = (H3) obj6;
                VZ vz = (VZ) obj4;
                WeakReference weakReference4 = (WeakReference) obj3;
                h3.getClass();
                X0.j.o().getClass();
                AdManagerAdRequest adManagerAdRequestBuild3 = ((AdManagerAdRequest.Builder) obj5).setHttpTimeoutMillis(MBridgeCommon.DEFAULT_LOAD_TIMEOUT).build();
                ((C3491g4) vz.f3354a).J(System.currentTimeMillis());
                h3.N((C3491g4) vz.f3354a, new C3468fn0(h3, vz, new WeakReference((Context) weakReference4.get()), (NS) obj2));
                RewardedAd.load((Context) weakReference4.get(), ((C3491g4) vz.f3354a).w(1), adManagerAdRequestBuild3, (RewardedAdLoadCallback) new F3(h3, vz, (Context) obj));
                break;
        }
    }
}
