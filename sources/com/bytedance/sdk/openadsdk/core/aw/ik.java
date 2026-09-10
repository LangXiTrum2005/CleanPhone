package com.bytedance.sdk.openadsdk.core.aw;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private wjv f18100co;
    protected List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> di;
    protected String fi;
    protected com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri ik;
    protected com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr ka;
    protected int lr;
    protected String mj;
    private String qt;
    protected int ri;
    protected List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> xha;
    private final AtomicBoolean sf = new AtomicBoolean(false);
    protected String jbs = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.values().length];
            ri = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ik(int i, int i2, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar, String str, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list2, String str2) {
        this.di = new ArrayList();
        this.xha = new ArrayList();
        this.ri = i;
        this.lr = i2;
        this.ik = enumC0228ri;
        this.ka = lrVar;
        this.fi = str;
        this.di = list;
        this.xha = list2;
        this.mj = str2;
    }

    public String fi() {
        return this.fi;
    }

    public String ik() {
        int i = AnonymousClass1.ri[this.ka.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.fi;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.ri + "\" height=\"" + this.lr + "\" src=\"" + this.fi + "\"></iframe>";
        }
        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri = this.ik;
        if (enumC0228ri == com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.fi + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0228ri != com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.fi + "\"></script>";
    }

    public String ka() {
        if (this.ka == com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.STATIC_RESOURCE && this.ik == com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.IMAGE) {
            return this.fi;
        }
        return null;
    }

    public int lr() {
        return this.lr;
    }

    public int ri() {
        return this.ri;
    }

    public void lr(long j) {
        if (this.sf.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr((wjv) null, this.xha, (com.bytedance.sdk.openadsdk.core.aw.ri.ri) null, j, this.qt, (String) null);
        }
    }

    public void ri(long j) {
        com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(null, this.di, null, j, this.qt, new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(this.jbs, this.f18100co), null);
    }

    public static float ri(int i, int i2, int i3, int i4, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri) {
        if (i2 == 0 || i4 == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = i;
        float f2 = i3;
        return ri(lrVar, enumC0228ri) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    public static ik lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONArrayOptJSONArray.optString(i)).ri());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONArrayOptJSONArray2.optString(i2)).ri());
        }
        return new ik(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float ri(com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri) {
        int i = AnonymousClass1.ri[lrVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1.2f;
            }
            if (i != 3) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        if (com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.JAVASCRIPT.equals(enumC0228ri)) {
            return 1.0f;
        }
        if (com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.IMAGE.equals(enumC0228ri)) {
            return 0.8f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void ri(String str) {
        this.qt = str;
    }

    public void ri(wjv wjvVar) {
        this.f18100co = wjvVar;
    }
}
