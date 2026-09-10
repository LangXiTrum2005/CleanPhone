package com.applovin.impl;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s1 extends g2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f9231i;

    public s1(com.applovin.impl.sdk.l lVar) {
        super(lVar, f2.b.ERROR);
    }

    public void a(String str, Throwable th2) {
        a(str, th2, new HashMap());
    }

    public void b() {
        this.f9231i = JsonUtils.deserialize((String) this.f7970a.a(z4.K));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th2) {
        a(str, str2, th2, new HashMap());
    }

    public void a(String str, String str2, Throwable th2, Map map) {
        a(wi.d.i(str, ":", str2), th2, map);
    }

    public void b(String str, String str2, Throwable th2) {
        this.f7970a.s0().a((k5) new u6(this.f7970a, "reportCaughtException", new bc.r(this, str, str2, th2, 10)), f6.b.OTHER);
    }

    public void a(String str, Throwable th2, Map map) {
        map.put("source", str);
        map.put("top_main_method", th2.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th3 : th2.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th3.toString(), map2);
            arrayList.add(map2);
        }
        a(f2.V0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(h2.a((AppLovinAdImpl) bVar));
            map.putAll(h2.a(bVar));
            boolean zA0 = bVar.A0();
            map.put("is_video_stream", String.valueOf(zA0));
            if (zA0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_VIDEO_URL, ((com.applovin.impl.sdk.ad.a) bVar).f1(), map);
            } else {
                CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_VIDEO_URL, bVar.I(), map);
            }
        }
        d(f2.f7838b1, map);
    }

    public void a(String str, String str2, int i10, String str3) {
        List listA = a(str2);
        boolean z10 = listA != null;
        if (z10 && listA.contains(Integer.valueOf(i10))) {
            return;
        }
        if (z10 || i10 >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i10));
            map.put("error_message", h2.a(str3));
            d(f2.f7847e1, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f9231i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f9231i, BuildConfig.FLAVOR, null) : integerList;
    }
}
