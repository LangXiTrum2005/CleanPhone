package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3526g6 extends B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {
    private WeakReference<InterfaceC3544h6> x;
    private C3507f5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3526g6(V0 adTools, C instanceData, I adInstancePayload, InterfaceC3544h6 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.x = new WeakReference<>(listener);
    }

    private final List<String> I() {
        JSONObject jSONObjectOptJSONObject = new N6().a(new String[]{L6.u}).optJSONObject(L6.u);
        if (jSONObjectOptJSONObject == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(L6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> J() {
        Map mapDern = p002kotlin.collections.polder.dern();
        for (String str : I()) {
            List listSplit$default = StringsKt.split$default(str, new String[]{X3.j.b}, false, 2, 2, null);
            if (listSplit$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listSplit$default.get(0);
                mapDern.put("custom_" + str2, (String) listSplit$default.get(1));
            }
        }
        return p002kotlin.collections.polder.saneness(mapDern);
    }

    private final void K() {
        if (v()) {
            f().e().h().l("closed after failure");
            return;
        }
        this.y = new C3507f5();
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC3544h6 interfaceC3544h6 = this.x.get();
        if (interfaceC3544h6 != null) {
            interfaceC3544h6.b(this);
        }
        c();
    }

    private final void L() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void M() {
        if (v()) {
            f().e().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> mapJ = J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C3507f5.a(this.y);
        LevelPlayReward levelPlayRewardA = Gb.s.d().B().a(k(), n().i().b().c());
        f().e().a().a(k(), levelPlayRewardA.getName(), levelPlayRewardA.getAmount(), jCurrentTimeMillis, strA, jA, mapJ, f().j());
        InterfaceC3544h6 interfaceC3544h6 = this.x.get();
        if (interfaceC3544h6 != null) {
            interfaceC3544h6.a(this, levelPlayRewardA);
        }
    }

    private final void N() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        InterfaceC3544h6 interfaceC3544h6 = this.x.get();
        if (interfaceC3544h6 != null) {
            interfaceC3544h6.a(this);
        }
    }

    private final void O() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void P() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3526g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3526g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3526g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3526g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    @Override // com.ironsource.B
    public void A() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        Intrinsics.competently(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objG).loadAd(n().g(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void c() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        Intrinsics.competently(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) objG).destroyAd(n().g());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.technofreak
            @Override // java.lang.Runnable
            public final void run() {
                C3526g6.a(this.f23483kowloon);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.setterwort
            @Override // java.lang.Runnable
            public final void run() {
                C3526g6.b(this.f23462kowloon);
            }
        });
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.outmarry
            @Override // java.lang.Runnable
            public final void run() {
                C3526g6.d(this.f23362kowloon);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.mastfed
            @Override // java.lang.Runnable
            public final void run() {
                C3526g6.e(this.f23310kowloon);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.vesuvio
            @Override // java.lang.Runnable
            public final void run() {
                C3526g6.f(this.f23508kowloon);
            }
        });
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objG = g();
                Intrinsics.competently(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), activity, this);
            }
        } catch (Throwable th) {
            C3631m4.d().a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            a(B0.h(n().h()), str);
        }
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        a(new Runnable() { // from class: com.ironsource.dhss
            @Override // java.lang.Runnable
            public final void run() {
                C3526g6.c(this.f23226kowloon);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3526g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3526g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }
}
