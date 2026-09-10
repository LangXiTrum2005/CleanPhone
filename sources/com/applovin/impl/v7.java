package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f9900f = Arrays.asList(MimeTypes.VIDEO_MP4, "video/webm", MimeTypes.VIDEO_H263, "video/x-matroska");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9901a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f9903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f9904d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f9902b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9905e = System.currentTimeMillis();

    public v7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        this.f9901a = lVar;
        this.f9903c = jSONObject;
        this.f9904d = jSONObject2;
    }

    public List a() {
        return this.f9902b;
    }

    public JSONObject b() {
        return this.f9903c;
    }

    public long c() {
        return this.f9905e;
    }

    public int d() {
        return this.f9902b.size();
    }

    public JSONObject e() {
        return this.f9904d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f9903c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f9900f;
    }

    public int g() {
        return q7.c(JsonUtils.getInt(this.f9903c, "video_completion_percent", -1));
    }
}
