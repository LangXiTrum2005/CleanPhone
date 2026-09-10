package com.bytedance.sdk.openadsdk.core.sLN;

import com.bytedance.sdk.openadsdk.core.model.tD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    protected String JXs;
    protected int LD;
    protected int Lxb;
    protected String OY;
    protected com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ZU;
    protected List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> ebl;
    protected List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> lc;
    protected com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb lk;
    private String nBu;
    private tD sLN;
    private final AtomicBoolean JVA = new AtomicBoolean(false);
    protected String QAg = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sLN.lk$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lk(int i, int i2, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld, String str, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list2, String str2) {
        this.lc = new ArrayList();
        this.ebl = new ArrayList();
        this.Lxb = i;
        this.LD = i2;
        this.lk = enumC0111Lxb;
        this.ZU = ld;
        this.JXs = str;
        this.lc = list;
        this.ebl = list2;
        this.OY = str2;
    }

    public String JXs() {
        if (this.ZU == com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.STATIC_RESOURCE && this.lk == com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.IMAGE) {
            return this.JXs;
        }
        return null;
    }

    public int LD() {
        return this.Lxb;
    }

    public void Lxb(long j) {
        com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.lc, null, j, this.nBu, new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD(this.QAg, this.sLN));
    }

    public String ZU() {
        int i = AnonymousClass1.Lxb[this.ZU.ordinal()];
        if (i == 1) {
            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb = this.lk;
            if (enumC0111Lxb == com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.IMAGE) {
                return DM.m(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.JXs, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0111Lxb == com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.JAVASCRIPT) {
                return DM.m(new StringBuilder("<script src=\""), this.JXs, "\"></script>");
            }
            return null;
        }
        if (i == 2) {
            return this.JXs;
        }
        if (i != 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb.append(this.Lxb);
        sb.append("\" height=\"");
        sb.append(this.LD);
        sb.append("\" src=\"");
        return DM.m(sb, this.JXs, "\"></iframe>");
    }

    public String lc() {
        return this.JXs;
    }

    public int lk() {
        return this.LD;
    }

    public static float Lxb(int i, int i2, int i3, int i4, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return Lxb(ld, enumC0111Lxb) / ((Math.abs((f - f2) / f) + Math.abs((f / i2) - (f2 / i4))) + 1.0f);
    }

    public void LD(long j) {
        if (this.JVA.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD(this.ebl, null, j, this.nBu);
        }
    }

    public static lk LD(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONArrayOptJSONArray.optString(i)).Lxb());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONArrayOptJSONArray2.optString(i2)).Lxb());
        }
        return new lk(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float Lxb(com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb) {
        int i = AnonymousClass1.Lxb[ld.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.JAVASCRIPT.equals(enumC0111Lxb)) {
            return 1.0f;
        }
        return com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.IMAGE.equals(enumC0111Lxb) ? 0.8f : 0.0f;
    }

    public void Lxb(String str) {
        this.nBu = str;
    }

    public JSONObject Lxb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.Lxb);
        jSONObject.put("height", this.LD);
        jSONObject.put("creativeType", this.lk.toString());
        jSONObject.put("resourceType", this.ZU.toString());
        jSONObject.put("contentUrl", this.JXs);
        jSONObject.put("clickThroughUri", this.OY);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.lc));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.ebl));
        return jSONObject;
    }

    public void Lxb(tD tDVar) {
        this.sLN = tDVar;
    }
}
