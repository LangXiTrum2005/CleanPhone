package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.ironsource.qg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0540qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f30118a;

    public C0540qg(F0 f10) {
        this.f30118a = f10;
    }

    public void a(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f30118a.a(C0.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    public void b(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f30118a.a(C0.TROUBLESHOOT_LOAD_FAILED, map);
    }

    public void c() {
        this.f30118a.a(C0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.f30118a.a(C0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.f30118a.a(C0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_ILLEGAL_STATE, com.applovin.impl.ca.n("reason", str));
    }

    public void g(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_INTERNAL_ERROR, com.applovin.impl.ca.n("reason", str));
    }

    public void h(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_LOAD_SKIPPED, com.applovin.impl.ca.n("reason", str));
    }

    public void i(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, com.applovin.impl.ca.n("reason", str));
    }

    public void j(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, com.applovin.impl.ca.n("reason", str));
    }

    public void k(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, com.applovin.impl.ca.n("reason", str));
    }

    public void l(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_CLOSED, com.applovin.impl.ca.n("reason", str));
    }

    public void m(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, com.applovin.impl.ca.n("reason", str));
    }

    public void n(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, com.applovin.impl.ca.n("reason", str));
    }

    public void o(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, com.applovin.impl.ca.n("reason", str));
    }

    public void p(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, com.applovin.impl.ca.n("reason", str));
    }

    public void q(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_OPENED, com.applovin.impl.ca.n("reason", str));
    }

    public void r(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, com.applovin.impl.ca.n("reason", str));
    }

    public void s(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, com.applovin.impl.ca.n("reason", str));
    }

    public void t(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, com.applovin.impl.ca.n("reason", str));
    }

    public void u(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, com.applovin.impl.ca.n("reason", str));
    }

    public void v(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_WATERFALL_OVERHEAD, com.applovin.impl.ca.n("reason", str));
    }

    public void c(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, com.applovin.impl.ca.n("reason", str));
    }

    public void d(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, com.applovin.impl.ca.n("reason", str));
    }

    public void e(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, com.applovin.impl.ca.n("reason", str));
    }

    public void b() {
        this.f30118a.a(C0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, l);
        this.f30118a.a(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    public void b(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, com.applovin.impl.ca.n("reason", str));
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f30118a.a(C0.TROUBLESHOOT_SHOW_FAILED, map);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f30118a.a(C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    public void a(String str) {
        this.f30118a.a(C0.TROUBLESHOOT_AD_EXPIRED, com.applovin.impl.ca.n("reason", str));
    }

    public void a(String str, long j10) {
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.isEmpty() ? "" : defpackage.e.o("provider=", str, ";"));
        sb2.append("expirationDuration=");
        sb2.append(j10);
        map.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
        this.f30118a.a(C0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(boolean z10, long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z10 ? 1 : 0));
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f30118a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f30118a.a(C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    public void a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f30118a.a(C0.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    public void a() {
        this.f30118a.a(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, null);
    }

    public void a(W8 w10) {
        HashMap map = new HashMap();
        double dO = w10.o();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(dO), w10.e()));
        this.f30118a.a(C0.TROUBLESHOOT_ILR_REVENUE, map);
    }

    public void a(Nd nd2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, nd2.b());
        this.f30118a.a(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, map);
    }

    public void a(long j10, long j11, String str) {
        HashMap map = new HashMap();
        Locale locale = Locale.ENGLISH;
        StringBuilder sbL = wi.d.l(j10, "refreshDuration=", ";notVisibleDuration=");
        sbL.append(j11);
        sbL.append(";reason=");
        sbL.append(str);
        map.put(IronSourceConstants.EVENTS_EXT1, sbL.toString());
        this.f30118a.a(C0.TROUBLESHOOT_RELOAD, map);
    }
}
