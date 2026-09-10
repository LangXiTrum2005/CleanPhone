package com.bytedance.sdk.openadsdk.core.fs;

import android.support.v4.media.a;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private ljh fs;
    protected String jpc;
    protected com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl lnr;
    protected com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud mml;
    protected List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mo;
    protected String mzz;
    protected int qdl;
    private String to;
    protected int ud;
    protected List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> wd;
    private final AtomicBoolean rq = new AtomicBoolean(false);
    protected String tvp = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.lnr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.values().length];
            qdl = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lnr(int i2, int i3, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar, String str, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list2, String str2) {
        this.mo = new ArrayList();
        this.wd = new ArrayList();
        this.qdl = i2;
        this.ud = i3;
        this.lnr = enumC0113qdl;
        this.mml = udVar;
        this.mzz = str;
        this.mo = list;
        this.wd = list2;
        this.jpc = str2;
    }

    public int lnr() {
        return this.ud;
    }

    public String mml() {
        int i2 = AnonymousClass1.qdl[this.mml.ordinal()];
        if (i2 == 1) {
            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl = this.lnr;
            if (enumC0113qdl == com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.IMAGE) {
                return a.r(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.mzz, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0113qdl == com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.JAVASCRIPT) {
                return a.r(new StringBuilder("<script src=\""), this.mzz, "\"></script>");
            }
            return null;
        }
        if (i2 == 2) {
            return this.mzz;
        }
        if (i2 != 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb.append(this.qdl);
        sb.append("\" height=\"");
        sb.append(this.ud);
        sb.append("\" src=\"");
        return a.r(sb, this.mzz, "\"></iframe>");
    }

    public String mo() {
        return this.mzz;
    }

    public String mzz() {
        if (this.mml == com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.STATIC_RESOURCE && this.lnr == com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.IMAGE) {
            return this.mzz;
        }
        return null;
    }

    public void qdl(long j) {
        com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(null, this.mo, null, j, this.to, new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud(this.tvp, this.fs), null);
    }

    public int ud() {
        return this.qdl;
    }

    public static float qdl(int i2, int i3, int i4, int i5, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl) {
        if (i3 == 0 || i5 == 0) {
            return 0.0f;
        }
        float f = i2;
        float f2 = i4;
        return qdl(udVar, enumC0113qdl) / ((Math.abs((f - f2) / f) + Math.abs((f / i3) - (f2 / i5))) + 1.0f);
    }

    public void ud(long j) {
        if (this.rq.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud((ljh) null, this.wd, (com.bytedance.sdk.openadsdk.core.fs.qdl.qdl) null, j, this.to, (String) null);
        }
    }

    public static lnr ud(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONArrayOptJSONArray.optString(i2)).qdl());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(jSONArrayOptJSONArray2.optString(i3)).qdl());
        }
        return new lnr(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float qdl(com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl) {
        int i2 = AnonymousClass1.qdl[udVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return i2 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.JAVASCRIPT.equals(enumC0113qdl)) {
            return 1.0f;
        }
        return com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.IMAGE.equals(enumC0113qdl) ? 0.8f : 0.0f;
    }

    public void qdl(String str) {
        this.to = str;
    }

    public JSONObject qdl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.qdl);
        jSONObject.put("height", this.ud);
        jSONObject.put("creativeType", this.lnr.toString());
        jSONObject.put("resourceType", this.mml.toString());
        jSONObject.put("contentUrl", this.mzz);
        jSONObject.put("clickThroughUri", this.jpc);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.mo));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(this.wd));
        return jSONObject;
    }

    public void qdl(ljh ljhVar) {
        this.fs = ljhVar;
    }
}
