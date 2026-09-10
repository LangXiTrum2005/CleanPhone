package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f27245a;

    public Tc(F0 eventsWrapper) {
        kotlin.jvm.internal.n.f(eventsWrapper, "eventsWrapper");
        this.f27245a = eventsWrapper;
    }

    public final void a() {
        this.f27245a.a(C0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.f27245a.a(C0.PAUSE_AD, null);
    }

    public final void c() {
        this.f27245a.a(C0.RESUME_AD, null);
    }

    public final void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f27245a.a(C0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long j10, int i10, String reason) {
        kotlin.jvm.internal.n.f(reason, "reason");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", reason);
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f27245a.a(C0.OPERATIONAL_LOAD_FAILED, map);
    }

    public final void a(double d10) {
        this.f27245a.a(C0.OPERATIONAL_SET_CONFIGURATIONS, xj.b0.P(new wj.f(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10)));
    }

    public static /* synthetic */ void a(Tc tc2, LevelPlayReward levelPlayReward, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        tc2.a(levelPlayReward, str, str2);
    }

    public final void a(LevelPlayReward reward, String str, String str2) {
        kotlin.jvm.internal.n.f(reward, "reward");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_REWARD_NAME, reward.getName());
        map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(reward.getAmount()));
        if (str != null) {
            map.put("placement", str);
        }
        if (str2 != null) {
            map.put("reason", str2);
        }
        this.f27245a.a(C0.OPERATIONAL_GET_REWARD, map);
    }
}
