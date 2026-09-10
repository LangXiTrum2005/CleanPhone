package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f27199a;

    public T1(F0 f10) {
        this.f27199a = f10;
    }

    public void a(@Nullable Double d10) {
        HashMap map;
        if (d10 != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10);
        } else {
            map = null;
        }
        this.f27199a.a(C0.AUCTION_REQUEST, map);
    }

    public void b(String str) {
        this.f27199a.a(C0.AUCTION_REQUEST_WATERFALL, com.applovin.impl.ca.n(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void c(String str) {
        this.f27199a.a(C0.AUCTION_RESULT_WATERFALL, com.applovin.impl.ca.n(IronSourceConstants.EVENTS_EXT1, str));
    }

    public String a(int i10, int i11, int i12, int i13) {
        StringBuilder sbL = l1.d.l("interstitial=", i10, ";rewarded=", i11, ";banner=");
        sbL.append(i12);
        sbL.append(";native=");
        sbL.append(i13);
        return sbL.toString();
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f27199a.a(C0.AUCTION_FAILED, map);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f27199a.a(C0.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f27199a.a(C0.AUCTION_SUCCESS, map);
    }

    public void a(String str) {
        this.f27199a.a(C0.AD_FORMAT_CAPPED, com.applovin.impl.ca.n("auctionId", str));
    }
}
