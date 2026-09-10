package com.p004ironsource;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f26537a;

    public q4(c2 c2Var) {
        this.f26537a = c2Var;
    }

    public String a(int i2, int i3, int i4, int i5) {
        StringBuilder sbP = a.p(i2, i3, "interstitial=", ";rewarded=", ";banner=");
        sbP.append(i4);
        sbP.append(";native=");
        sbP.append(i5);
        return sbP.toString();
    }

    public void b(String str) {
        this.f26537a.a(z1.AUCTION_REQUEST_WATERFALL, androidx.media3.extractor.text.ttml.a.s(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void c(String str) {
        this.f26537a.a(z1.AUCTION_RESULT_WATERFALL, androidx.media3.extractor.text.ttml.a.s(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void a(int i2, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f26537a.a(z1.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j, int i2, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f26537a.a(z1.AUCTION_FAILED, map);
    }

    public void a(long j, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f26537a.a(z1.AUCTION_SUCCESS, map);
    }

    public void a(Double d) {
        HashMap map;
        if (d != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            map = null;
        }
        this.f26537a.a(z1.AUCTION_REQUEST, map);
    }

    public void a(String str) {
        this.f26537a.a(z1.AD_FORMAT_CAPPED, androidx.media3.extractor.text.ttml.a.s("auctionId", str));
    }
}
