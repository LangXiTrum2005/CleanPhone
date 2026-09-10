package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0404j6 extends B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C0350g5 f28973z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404j6(V0 adTools, C instanceData, I adInstancePayload) {
        super(adTools, instanceData, adInstancePayload, null, null, 24, null);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
    }

    private final void Q() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        InterfaceC0422k6 interfaceC0422k6L = L();
        if (interfaceC0422k6L != null) {
            interfaceC0422k6L.a(this);
        }
    }

    private final void R() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().i(k());
    }

    private final void S() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0404j6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0404j6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C0404j6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C0404j6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.S();
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objG).loadAd(n().h(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void c() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) objG).destroyAd(n().h());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new hi(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new hi(this, 2));
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new hi(this, 3));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new hi(this, 5));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new hi(this, 4));
    }

    private final List<String> K() {
        JSONObject jSONObjectOptJSONObject = new Q6().a(new String[]{O6.f26751u}).optJSONObject(O6.f26751u);
        xj.v vVar = xj.v.f53866a;
        if (jSONObjectOptJSONObject == null) {
            return vVar;
        }
        Object objOpt = jSONObjectOptJSONObject.opt(O6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return vVar;
        }
        ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final InterfaceC0422k6 L() {
        F fS = s();
        if (fS instanceof InterfaceC0422k6) {
            return (InterfaceC0422k6) fS;
        }
        return null;
    }

    private final Map<String, Object> M() {
        yj.f fVar = new yj.f();
        for (String str : K()) {
            List listI0 = an.h.I0(str, new String[]{X3.j.f27830b}, 2, 2);
            if (listI0.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listI0.get(0);
                fVar.put("custom_" + str2, (String) listI0.get(1));
            }
        }
        return fVar.g();
    }

    private final void N() {
        if (w()) {
            f().d().h().l("closed after failure");
            return;
        }
        if (!z()) {
            a(1000, "ad closed before ad opened");
            return;
        }
        this.f28973z = new C0350g5();
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().a(k(), "");
        InterfaceC0422k6 interfaceC0422k6L = L();
        if (interfaceC0422k6L != null) {
            interfaceC0422k6L.b(this);
        }
        c();
    }

    private final void O() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().d(k());
    }

    private final void P() {
        if (w()) {
            f().d().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> mapM = M();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C0350g5.a(this.f28973z);
        LevelPlayReward levelPlayRewardA = Kb.f26413u.d().C().a(k(), n().j().b().c());
        f().d().a().a(k(), levelPlayRewardA.getName(), levelPlayRewardA.getAmount(), jCurrentTimeMillis, strA, jA, mapM, f().i());
        InterfaceC0422k6 interfaceC0422k6L = L();
        if (interfaceC0422k6L != null) {
            interfaceC0422k6L.a(this, levelPlayRewardA);
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().d().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().d().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objG = g();
                kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), activity, this);
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("showAd - exception = ", th2.getMessage());
            IronLog.INTERNAL.error(a(strN));
            f().d().h().g(strN);
            a(B0.h(n().i()), strN);
        }
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        kotlin.jvm.internal.n.f(extraData, "extraData");
        super.onAdOpened(extraData);
        a(new hi(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0404j6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0404j6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.N();
    }
}
