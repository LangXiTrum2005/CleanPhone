package com.p004ironsource;

import android.support.v4.media.a;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f25657a;

    public lw(c2 c2Var) {
        this.f25657a = c2Var;
    }

    private String a(long j, long j2, long j3) {
        StringBuilder sbV = a.v(j, "interval: ", ", remainingTime: ");
        sbV.append(j2);
        return androidx.media3.extractor.text.ttml.a.k(j3, ", timePassed: ", sbV);
    }

    public void b() {
        this.f25657a.a(z1.TROUBLESHOOT_LOAD, null);
    }

    public void c() {
        this.f25657a.a(z1.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.f25657a.a(z1.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.f25657a.a(z1.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_ILLEGAL_STATE, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void g(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_INTERNAL_ERROR, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void h(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_LOAD_SKIPPED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void i(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void j(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void k(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void l(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_CLOSED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void m(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void n(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void o(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void p(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void q(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_OPENED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void r(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void s(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void t(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void u(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void v(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_WATERFALL_OVERHEAD, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void b(int i2, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i2));
        map.put("reason", str);
        this.f25657a.a(z1.TROUBLESHOOT_LOAD_FAILED, map);
    }

    public void c(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void d(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void e(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void b(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_IMPRESSION_TIMEOUT, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void b(String str, long j, long j2, long j3) {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("reason", str);
        mapS.put(IronSourceConstants.EVENTS_EXT1, a(j, j2, j3));
        this.f25657a.a(z1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, mapS);
    }

    public void a() {
        this.f25657a.a(z1.TROUBLESHOOT_DISPOSE, null);
    }

    public void a(int i2, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i2));
        map.put("reason", str);
        this.f25657a.a(z1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    public void a(int i2, String str, String str2) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i2));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f25657a.a(z1.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f25657a.a(z1.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    public void a(long j, long j2, String str) {
        HashMap map = new HashMap();
        Locale locale = Locale.ENGLISH;
        StringBuilder sbV = a.v(j, "refreshDuration=", ";notVisibleDuration=");
        sbV.append(j2);
        sbV.append(";reason=");
        sbV.append(str);
        map.put(IronSourceConstants.EVENTS_EXT1, sbV.toString());
        this.f25657a.a(z1.TROUBLESHOOT_RELOAD, map);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f25657a.a(z1.TROUBLESHOOT_SHOW_FAILED, map);
    }

    public void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f25657a.a(z1.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    public void a(Long l2) {
        HashMap map = new HashMap();
        map.put("duration", l2);
        this.f25657a.a(z1.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    public void a(String str) {
        this.f25657a.a(z1.TROUBLESHOOT_AD_EXPIRED, androidx.media3.extractor.text.ttml.a.s("reason", str));
    }

    public void a(String str, long j) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str.isEmpty() ? "" : a.n("provider=", str, ";"));
        sb.append("expirationDuration=");
        sb.append(j);
        map.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.f25657a.a(z1.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(String str, long j, long j2, long j3) {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("reason", str);
        mapS.put(IronSourceConstants.EVENTS_EXT1, a(j, j2, j3));
        this.f25657a.a(z1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, mapS);
    }

    public void a(boolean z2, long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z2 ? 1 : 0));
        map.put("duration", Long.valueOf(j));
        this.f25657a.a(z1.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }
}
