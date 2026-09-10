package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.ironsource.A5;
import com.ironsource.C3724ra;
import com.ironsource.C3764u;
import com.ironsource.L6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import shimmery.dern;

/* JADX INFO: loaded from: classes2.dex */
public class ay implements wjv<com.bytedance.sdk.openadsdk.ka.ri> {
    private final Context ri;

    public static class lr {
        public final com.bytedance.sdk.openadsdk.core.model.xd ik;
        public final boolean lr;
        public final int ri;

        private lr(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.xd xdVar) {
            this.ri = i;
            this.lr = z;
            this.ik = xdVar;
        }

        public static lr ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.xd xdVar = new com.bytedance.sdk.openadsdk.core.model.xd();
            if (jSONObjectOptJSONObject != null) {
                try {
                    xdVar.ri(jSONObjectOptJSONObject.optInt("reason"));
                    xdVar.lr(jSONObjectOptJSONObject.optInt("corp_type"));
                    xdVar.ik(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    xdVar.ri(jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", th.getMessage());
                }
            }
            return new lr(iOptInt, zOptBoolean, xdVar);
        }
    }

    public static class ri {
        final int di;
        final String fi;
        final long ik;
        final String jbs;
        final int ka;
        final long lr;
        public final com.bytedance.sdk.openadsdk.core.model.ri mj;
        final ArrayList<Integer> qt;
        final int ri;
        final String xha;

        private ri(String str, int i, int i2, String str2, int i3, String str3, com.bytedance.sdk.openadsdk.core.model.ri riVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.ri = i;
            this.ka = i2;
            this.fi = str2;
            this.xha = str3;
            this.mj = riVar;
            this.jbs = str;
            this.di = i3;
            this.lr = j;
            this.ik = j2;
            this.qt = arrayList;
        }

        public static ri ri(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.ri, ArrayList<Integer>> pairRi = com.bytedance.sdk.openadsdk.core.lr.ri(jSONObject, adSlot, igqVar);
            return pairRi == null ? new ri(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new ri(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.ri) pairRi.first, jOptLong, jOptLong2, (ArrayList) pairRi.second);
        }
    }

    public ay(Context context) {
        this.ri = context;
    }

    private boolean di(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private Map<String, String> fi(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (ik(jSONObject)) {
            map.put("Content-Encoding", "union_sdk_encode");
        }
        return map;
    }

    private boolean ik(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private boolean ka(String str) {
        if (com.bytedance.sdk.openadsdk.core.mj.lr.ri()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.mj.lr.ri(str)) {
            return false;
        }
        String strLr = com.bytedance.sdk.openadsdk.core.mj.lr.lr();
        if (!TextUtils.isEmpty(strLr)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(strLr, System.currentTimeMillis());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.igq igqVar, final int i, final wjv.ri riVar) {
        com.bytedance.sdk.openadsdk.core.model.ri riVar2;
        if (!com.bytedance.sdk.openadsdk.core.qt.lr.ri().di()) {
            riVar.ri(40060, jbs.ri(40060));
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().ka()) {
            riVar.ri(10007, jbs.ri(10007));
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.qt.lr.ri().jbs()) {
            riVar.ri(10008, jbs.ri(10008));
            return;
        }
        boolean zIk = com.bytedance.sdk.openadsdk.wjv.fi.ik();
        final com.bytedance.sdk.openadsdk.core.model.ik ikVar = new com.bytedance.sdk.openadsdk.core.model.ik();
        ikVar.ri(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri()) {
            if (riVar != null) {
                riVar.ri(1000, "Ad request is temporarily paused, Please contact your AM");
                ikVar.ri(1000);
                com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
                return;
            }
            return;
        }
        if (!nr.ka().siy()) {
            if (riVar != null) {
                riVar.ri(-16, jbs.ri(-16));
                ikVar.ri(1001);
                com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
                return;
            }
            return;
        }
        if (riVar == null) {
            return;
        }
        if (ka(adSlot.getCodeId())) {
            riVar.ri(-8, jbs.ri(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !igqVar.di) {
            ikVar.lr(2);
            ikVar.ri(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.vr.ik()) {
                dern.attabal(adSlot.getBidAdm());
            }
            if (nr.ka().qh() && oh.ri().ka() == 1) {
                com.bytedance.sdk.openadsdk.utils.ig.ri("Pangle_Debug_Mode", adSlot.getBidAdm(), this.ri);
            }
            try {
                JSONObject jSONObjectRi = ri(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectRi == null) {
                    ikVar.ik(12);
                    ri(riVar, ikVar);
                    return;
                }
                ri riVarRi = ri.ri(jSONObjectRi, adSlot, igqVar);
                ikVar.ri(riVarRi.qt);
                aw.ri(riVarRi.jbs);
                int i2 = riVarRi.ka;
                if (i2 != 20000) {
                    riVar.ri(i2, riVarRi.fi);
                    ikVar.ri(riVarRi.ka);
                    ikVar.ik(9);
                    com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.ri riVar3 = riVarRi.mj;
                if (riVar3 == null) {
                    ikVar.ik(13);
                    ri(riVar, ikVar);
                    return;
                }
                if (riVar3.ka() != null && !riVarRi.mj.ka().isEmpty()) {
                    com.bytedance.sdk.openadsdk.slm.ka.ri(riVarRi.mj.ka().get(0));
                }
                ri(riVarRi.mj);
                if (ri(riVarRi.mj, riVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.aw.ik.ka.ri(riVarRi.mj);
                riVar.ri(riVarRi.mj, ikVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.wjv> mapRi = com.bytedance.sdk.openadsdk.core.model.ri.ri(riVarRi.mj);
                if (mapRi != null) {
                    com.bytedance.sdk.openadsdk.xha.lr.ri().ri(mapRi);
                }
                ri(riVarRi.mj, i);
                com.bytedance.sdk.openadsdk.core.fi.ri.ri().ri(riVarRi.mj);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ri("NetApiImpl", "get ad error: ", th);
                ikVar.ik(14);
                ikVar.lr(th.getMessage());
                ri(riVar, ikVar);
                return;
            }
        }
        if (igqVar != null && !TextUtils.isEmpty(igqVar.f18139co)) {
            try {
                JSONObject jSONObjectRi2 = ri(new JSONObject(igqVar.f18139co));
                if (jSONObjectRi2 != null) {
                    ri riVarRi2 = ri.ri(jSONObjectRi2, adSlot, igqVar);
                    ihz ihzVar = igqVar.aw;
                    if (ihzVar != null && (riVar2 = riVarRi2.mj) != null && ihzVar.ri(riVar2)) {
                        com.bytedance.sdk.openadsdk.core.aw.ik.ka.ri(riVar2);
                        riVar.ri(riVar2, ikVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectRi3 = ri(adSlot, igqVar, i);
        if (jSONObjectRi3 == null) {
            riVar.ri(-9, jbs.ri(-9));
            ikVar.ri(-9);
            com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
            return;
        }
        if (nr.ka().qh() && oh.ri().ka() == 1) {
            com.bytedance.sdk.openadsdk.utils.ig.ri("Pangle_Debug_Mode", jSONObjectRi3.toString(), this.ri);
        }
        String strRi = com.bytedance.sdk.openadsdk.utils.ig.ri("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
        List<String> listRi = null;
        try {
            kaVarLr.ik(com.bytedance.sdk.openadsdk.jbs.ka.ri(kaVarLr, strRi));
            if (com.bytedance.sdk.openadsdk.utils.lr.ri()) {
                listRi = com.bytedance.sdk.openadsdk.utils.ig.ri("/api/ad/union/sdk/get_ads/", true);
                if (!listRi.isEmpty()) {
                    kaVarLr.ri(listRi);
                    kaVarLr.ri(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception unused2) {
        }
        kaVarLr.ri(jSONObjectRi3.toString(), nr.ka().bu());
        Map<String, String> mapRi2 = com.bytedance.sdk.openadsdk.core.sf.ik.ri(strRi, jSONObjectRi3.toString());
        if (mapRi2 != null && mapRi2.size() > 0) {
            for (String str : mapRi2.keySet()) {
                try {
                    kaVarLr.lr(str, mapRi2.get(str));
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e.getMessage());
                }
            }
        }
        try {
            kaVarLr.lr(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.ig.ka());
            ri(kaVarLr, jSONObjectRi3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.pv pvVarLr = com.bytedance.sdk.openadsdk.utils.pv.lr();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z = qt.lr().vr() && requestExtraMap != null;
        if (z) {
            requestExtraMap.put("pgad_start", pvVarLr);
        }
        kaVarLr.ri(10);
        kaVarLr.lr("get_ad");
        com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.8
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar4 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar4.lr("get_ad");
                riVar4.ik(adSlot.getCodeId());
                riVar4.ka(com.bytedance.sdk.openadsdk.utils.ig.ik(adSlot.getDurationSlotType()));
                return riVar4;
            }
        });
        if (com.bytedance.sdk.component.utils.vr.ik()) {
            Thread.currentThread().getName();
        }
        if (zIk) {
            List<String> list = listRi;
            try {
                com.bytedance.sdk.component.xha.lr lrVarRi = kaVarLr.ri();
                com.bytedance.sdk.component.xha.lr lrVar = lrVarRi == null ? new com.bytedance.sdk.component.xha.lr(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : lrVarRi;
                if (lrVar.di()) {
                    boolean z2 = z;
                    try {
                        ri(kaVarLr, lrVar, z2, requestExtraMap, pvVarLr, adSlot, ikVar, riVar, igqVar, i, list);
                    } catch (Throwable th2) {
                        th = th2;
                        z = z2;
                        requestExtraMap = requestExtraMap;
                        ikVar = ikVar;
                        list = list;
                        ri(kaVarLr, new IOException(th.getMessage()), new com.bytedance.sdk.component.xha.lr(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z, requestExtraMap, riVar, ikVar, list);
                    }
                } else {
                    ri(kaVarLr, new IOException(lrVar.lr()), lrVar, adSlot, z, requestExtraMap, riVar, ikVar, list);
                    com.bytedance.sdk.openadsdk.utils.uq.ri(kaVarLr.fi());
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            final boolean z3 = z;
            final List<String> list2 = listRi;
            kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.lr() { // from class: com.bytedance.sdk.openadsdk.core.ay.9
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar2, com.bytedance.sdk.component.xha.lr lrVar2) {
                    ay.this.ri(ikVar2, lrVar2, z3, requestExtraMap, pvVarLr, adSlot, ikVar, riVar, igqVar, i, list2);
                }

                @Override // com.bytedance.sdk.component.xha.ri.lr
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar2, IOException iOException, com.bytedance.sdk.component.xha.lr lrVar2) {
                    ay.this.ri(kaVarLr, iOException, lrVar2, adSlot, z3, requestExtraMap, riVar, ikVar, list2);
                    if (ikVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.uq.ri(ikVar2.fi());
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().ri(false);
    }

    @DungeonFlag
    private void xha(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.ig.di());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.ig.xha());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.ig.mj());
        } catch (Exception unused) {
        }
    }

    public static JSONArray ik(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.co.ri.ri> setRi = com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(str);
            if (setRi != null && setRi.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.co.ri.ri riVar : setRi) {
                    if (riVar != null && !TextUtils.isEmpty(riVar.fi())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = riVar.ri().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", riVar.lr());
                            jSONArray.put(jSONObject);
                        } else {
                            continue;
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private byte[] fi(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes(A5.O));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException e) {
                            com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e.toString());
                        }
                    } catch (IOException e2) {
                        e = e2;
                        gZIPOutputStream = gZIPOutputStream2;
                        com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e.toString());
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e3) {
                                com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e3.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e4) {
                                com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e4.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e5.toString());
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (IOException e7) {
            e = e7;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e8) {
            com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e8.toString());
        }
        return byteArray;
    }

    @DungeonFlag
    private JSONObject ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i) {
        int i2;
        int i3;
        int i4;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strFi = (igqVar == null || TextUtils.isEmpty(igqVar.ri)) ? com.bytedance.sdk.openadsdk.utils.ig.fi() : igqVar.ri;
            if (i == 7) {
                if (igqVar != null && (i4 = igqVar.lr) > 0) {
                    jSONObject2.put("req_type", i4);
                }
            } else if (i == 8) {
                if (igqVar != null && (i3 = igqVar.ik) > 0) {
                    jSONObject2.put("req_type", i3);
                }
            } else if (i == 3 && igqVar != null && (i2 = igqVar.ka) > 0) {
                jSONObject2.put("req_type", i2);
            }
            try {
                String strQt = nr.ka().qt();
                String strDw = nr.ka().dw();
                if (strQt != null && strDw != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strQt);
                    jSONObject3.put("param", strDw);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("request_id", strFi);
            com.bytedance.sdk.openadsdk.utils.ig.ri(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.jbs.co.ik());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.jbs.co.ka());
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, lr());
            jSONObject2.put(X3.i.G, DeviceUtils.ri(this.ri, true));
            jSONObject2.put("user", ri(adSlot));
            jSONObject2.put(L6.d0, com.bytedance.sdk.openadsdk.utils.ig.ka());
            jSONObject2.put(AppsFlyerProperties.CHANNEL, X3.i.Z);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(ri(adSlot, i, igqVar));
            jSONObject2.put("adslots", jSONArray);
            ri(jSONObject2, igqVar);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strFi != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strFi);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.fi.ri(strConcat));
            if (com.bytedance.sdk.openadsdk.core.sf.ik.fi() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.sf.ik.fi()));
            }
            jSONObject2.put("adx_id", qt.lr().uq());
            com.bytedance.sdk.openadsdk.di.lr.ri().ri(jSONObject2);
            jSONObject = ri(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("body data exception", th);
        }
        return jSONObject;
    }

    private void ka(JSONObject jSONObject) {
        byte[] bArr;
        Object obj;
        if (qt.lr().slm()) {
            try {
                jSONObject.getJSONObject("header").put(C3724ra.b, "4562");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
            kaVarLr.ik(com.bytedance.sdk.openadsdk.utils.ig.ihz());
            Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(fi(jSONObject.toString()));
            if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                bArr = (byte[]) obj;
                su.lr(true);
            } else {
                int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                su.lr(false);
                su.ri(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                bArr = null;
            }
            if (bArr != null) {
                kaVarLr.lr("Content-Encoding", "union_sdk_encode");
                kaVarLr.lr("x-pgli18n", "4");
                kaVarLr.ri("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                JSONObject jSONObjectRi = com.bytedance.sdk.component.utils.ri.ri(jSONObject);
                if (ik(jSONObjectRi)) {
                    jSONObject = jSONObjectRi;
                }
                ri(fi(jSONObject), kaVarLr);
                kaVarLr.ri(jSONObject.toString(), nr.ka().bu());
            }
            kaVarLr.ri(7);
            kaVarLr.lr("et_applog");
            kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.15
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                    if (lrVar == null || !lrVar.di()) {
                        return;
                    }
                    lrVar.ka();
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    private void ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        JSONArray jSONArray;
        if (igqVar == null || (jSONArray = igqVar.fi) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public void ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i, ihz ihzVar) {
        if (!igqVar.di && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!ri(igqVar) && ihzVar != null) {
                String strRi = ihzVar.ri();
                if (!TextUtils.isEmpty(strRi)) {
                    igqVar.f18139co = strRi;
                    igqVar.aw = ihzVar;
                }
            }
            ri(adSlot, igqVar, i, (wjv.ri) ihzVar);
            return;
        }
        ri(adSlot, igqVar, i, (wjv.ri) ihzVar);
    }

    private boolean ri(com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        if (igqVar != null) {
            return igqVar.lr == 2 || igqVar.ik == 2 || igqVar.ka == 2;
        }
        return false;
    }

    public void ri(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.igq igqVar, final int i, wjv.ri riVar) {
        if (igqVar != null && (igqVar.lr == 2 || igqVar.ik == 2 || igqVar.ka == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.lr.ri riVar2 = new com.bytedance.sdk.openadsdk.core.lr.ri(riVar, adSlot, (adSlot.isPreload() || igqVar == null || igqVar.di) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            vr.lr().post(new com.bytedance.sdk.component.mj.lr.ik("getAd") { // from class: com.bytedance.sdk.openadsdk.core.ay.1
                @Override // java.lang.Runnable
                public void run() {
                    ay.this.lr(adSlot, igqVar, i, riVar2);
                }
            });
        } else {
            lr(adSlot, igqVar, i, riVar2);
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarDi;
        if (riVar == null || (wjvVarDi = riVar.di()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.sf.dw(wjvVarDi.klz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.component.xha.lr.ka kaVar, IOException iOException, com.bytedance.sdk.component.xha.lr lrVar, final AdSlot adSlot, boolean z, Map<String, Object> map, wjv.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar, List<String> list) {
        String message;
        int iRi;
        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.10
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar2 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar2.lr("get_ad");
                riVar2.ik(adSlot.getCodeId());
                riVar2.ka(com.bytedance.sdk.openadsdk.utils.ig.ik(adSlot.getDurationSlotType()));
                riVar2.ri(BuildConfig.VERSION_NAME);
                return riVar2;
            }
        });
        if (lrVar != null) {
            message = lrVar.lr();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        String str = message;
        com.bytedance.sdk.openadsdk.utils.pv pvVarLr = com.bytedance.sdk.openadsdk.utils.pv.lr();
        if (z) {
            map.put("pgad_end", Long.valueOf(pvVarLr.ri));
        }
        if (nr.ka().qh() && oh.ri().ka() == 1) {
            com.bytedance.sdk.openadsdk.utils.ig.ri("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.ri);
        }
        if (lrVar != null) {
            iRi = lrVar.ri();
        } else {
            iRi = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD;
        }
        int i = iRi;
        if (riVar != null) {
            riVar.ri(i, str);
        }
        ikVar.ri(i);
        ikVar.ik(10);
        ikVar.lr(str);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
        com.bytedance.sdk.openadsdk.slm.ri.fi.ri("get_ad", kaVar.fi(), i, str, kaVar.ik(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.pv pvVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ik ikVar2, wjv.ri riVar, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i, List<String> list) {
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.core.model.hcw hcwVar;
        com.bytedance.sdk.openadsdk.core.model.ik ikVar3 = ikVar2;
        wjv.ri riVar2 = riVar;
        if (z) {
            map.put("pgad_end", pvVar);
        }
        if (lrVar == null) {
            return;
        }
        if (lrVar.di()) {
            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.11
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar3.lr("get_ad");
                    riVar3.ik(adSlot.getCodeId());
                    riVar3.ka(com.bytedance.sdk.openadsdk.utils.ig.ik(adSlot.getDurationSlotType()));
                    riVar3.ri(BuildConfig.VERSION_NAME);
                    return riVar3;
                }
            });
            try {
                com.bytedance.sdk.openadsdk.utils.pv pvVarLr = com.bytedance.sdk.openadsdk.utils.pv.lr();
                String strKa = lrVar.ka();
                ikVar3.ri(strKa);
                JSONObject jSONObject2 = new JSONObject(strKa);
                if (nr.ka().qh() && oh.ri().ka() == 1) {
                    com.bytedance.sdk.openadsdk.utils.ig.ri("Pangle_Debug_Mode", jSONObject2.toString(), this.ri);
                }
                JSONObject jSONObjectRi = ri(jSONObject2);
                if (jSONObjectRi == null) {
                    ikVar3.ik(12);
                    ri(riVar2, ikVar3);
                    return;
                }
                ri riVarRi = ri.ri(jSONObjectRi, adSlot, igqVar);
                ikVar3.ri(riVarRi.qt);
                aw.ri(riVarRi.jbs);
                int i2 = riVarRi.ka;
                if (i2 != 20000) {
                    ikVar3.ri(i2);
                    if (!nr.ka().qd() && riVarRi.ka == 40029) {
                        riVar2.ri(-100, jbs.ri(-100));
                    } else {
                        riVar2.ri(riVarRi.ka, riVarRi.fi);
                    }
                    ikVar3.ik(9);
                    com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar3);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.ri riVar3 = riVarRi.mj;
                if (riVar3 == null) {
                    ikVar3.ik(13);
                    ri(riVar2, ikVar3);
                    return;
                }
                if (ri(riVar3, riVar2)) {
                    return;
                }
                riVarRi.mj.ik(strKa);
                com.bytedance.sdk.openadsdk.utils.pv pvVarLr2 = com.bytedance.sdk.openadsdk.utils.pv.lr();
                if (igqVar != null && (hcwVar = igqVar.sf) != null) {
                    hcwVar.ri(pvVar, pvVarLr, riVarRi.ri, pvVarLr2);
                }
                byte b = com.bytedance.sdk.openadsdk.wjv.fi.ka() && i == 1;
                if (b != false) {
                    try {
                        if (riVarRi.mj.ka() != null && !riVarRi.mj.ka().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = riVarRi.mj.ka().get(0);
                            String strIk = com.bytedance.sdk.openadsdk.utils.ig.ik(i);
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            long jRi = 0;
                            if (igqVar != null) {
                                try {
                                    com.bytedance.sdk.openadsdk.utils.pv pvVar2 = igqVar.qt;
                                    jSONObject = jSONObject3;
                                    if (pvVar2.ri > 0) {
                                        jRi = pvVarLr2.ri(pvVar2);
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                jSONObject = jSONObject3;
                            }
                            if (wjvVar != null) {
                                boolean zNbc = wjvVar.nbc();
                                jSONObject4.put("is_new_engine", zNbc ? 1 : 0);
                                jSONObject4.put("webview_cache_size", zNbc ? com.bytedance.sdk.component.adexpress.fi.fi.ri().ka() : com.bytedance.sdk.component.adexpress.fi.fi.ri().ik());
                            }
                            JSONObject jSONObject5 = jSONObject;
                            ri(lrVar.xha(), igqVar, pvVar, pvVarLr, riVarRi.ri, pvVarLr2, wjvVar, strIk, jSONObject4, true);
                            jSONObject5.put(IronSourceConstants.EVENTS_DURATION, jRi);
                            jSONObject5.put("extra_data", jSONObject4);
                            jSONObject5.put("tag", strIk);
                            jSONObject5.put("callback_start", pvVarLr2.ri());
                            riVarRi.mj.ri(jSONObject5);
                        }
                    } catch (Throwable th) {
                        th = th;
                        ikVar3 = ikVar2;
                        riVar2 = riVar;
                        com.bytedance.sdk.component.utils.ac.ri("NetApiImpl", "get ad error: ", th);
                        ikVar3.lr(th.getMessage());
                        ikVar3.ik(14);
                        ri(riVar2, ikVar3);
                        com.bytedance.sdk.openadsdk.slm.ri.fi.ri("get_ad", ikVar.fi(), -9, th.getMessage(), ikVar.ik(), list);
                        ApmHelper.reportCustomError("", "parse_error", th);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.core.aw.ik.ka.ri(riVarRi.mj);
                riVar.ri(riVarRi.mj, ikVar2);
                ri(riVarRi.mj, i);
                com.bytedance.sdk.openadsdk.core.fi.ri.ri().ri(riVarRi.mj);
                Map<String, com.bytedance.sdk.openadsdk.core.model.wjv> mapRi = com.bytedance.sdk.openadsdk.core.model.ri.ri(riVarRi.mj);
                if (mapRi != null) {
                    com.bytedance.sdk.openadsdk.xha.lr.ri().ri(mapRi);
                }
                if (riVarRi.mj.ka() == null || riVarRi.mj.ka().isEmpty() || b == true) {
                    return;
                }
                ri(lrVar.xha(), igqVar, pvVar, pvVarLr, riVarRi.ri, pvVarLr2, riVarRi.mj.ka().get(0), com.bytedance.sdk.openadsdk.utils.ig.ik(i));
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.12
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar4 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar4.lr("get_ad");
                    riVar4.ik(adSlot.getCodeId());
                    riVar4.ka(com.bytedance.sdk.openadsdk.utils.ig.ik(adSlot.getDurationSlotType()));
                    riVar4.ri(BuildConfig.VERSION_NAME);
                    return riVar4;
                }
            });
            int iRi = lrVar.ri();
            String strLr = lrVar.lr();
            riVar2.ri(iRi, strLr);
            ikVar3.ri(iRi);
            ikVar3.ik(11);
            ikVar3.lr(strLr);
            com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar3);
            com.bytedance.sdk.openadsdk.slm.ri.fi.ri("get_ad", ikVar.fi(), iRi, strLr, ikVar.ik(), list);
        }
    }

    @DungeonFlag
    private JSONObject lr(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put(L6.V0, com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", ri(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.ri.ri(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0080 A[Catch: JSONException -> 0x00af, TryCatch #0 {JSONException -> 0x00af, blocks: (B:3:0x0005, B:9:0x0047, B:11:0x0080, B:22:0x00a1, B:8:0x0030, B:5:0x002a), top: B:25:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    /* JADX WARN: Code duplicated, block: B:15:0x0096  */
    /* JADX WARN: Code duplicated, block: B:17:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e A[PHI: r2
  0x009e: PHI (r2v15 int) = (r2v14 int), (r2v18 int) binds: [B:12:0x0091, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    @DungeonFlag
    private JSONObject lr() {
        int i;
        int rotation;
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", qt.lr().ka());
            jSONObject.put("name", qt.lr().mj());
            xha(jSONObject);
            Context contextRi = nr.ri();
            String packageResourcePath = "";
            if (contextRi != null) {
                try {
                    packageResourcePath = contextRi.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                i = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.ik.xha());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - vr.ri()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.qt());
                jSONObject.put("is_init", vr.fi() ? 1 : 0);
                if (contextRi != null) {
                    rotation = ((WindowManager) contextRi.getSystemService("window")).getDefaultDisplay().getRotation();
                    i2 = 1;
                    if (rotation == 0) {
                        i = i2;
                    } else if (rotation != 1) {
                        i2 = 2;
                        if (rotation != 2) {
                            i = i2;
                        } else if (rotation != 3) {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                i = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.ik.xha());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - vr.ri()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.qt());
                jSONObject.put("is_init", vr.fi() ? 1 : 0);
                if (contextRi != null) {
                    rotation = ((WindowManager) contextRi.getSystemService("window")).getDefaultDisplay().getRotation();
                    i2 = 1;
                    if (rotation == 0) {
                        i = i2;
                    } else if (rotation != 1) {
                        i2 = 2;
                        if (rotation != 2) {
                            i = i2;
                        } else if (rotation != 3) {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static String lr(AdSlot adSlot) {
        String strCo = qt.lr().co();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strCo)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strCo)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strCo);
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                                jSONArray.put(jSONObject2);
                            }
                        }
                        return jSONArray.toString();
                    } catch (Throwable unused) {
                        return userData;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return strCo;
    }

    private boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, wjv.ri riVar2) {
        if (riVar == null) {
            riVar2.ri(40053, jbs.ri(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listKa = riVar.ka();
        if (listKa.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar : listKa) {
            if (TextUtils.isEmpty(wjvVar.ckl().lr()) || TextUtils.isEmpty(wjvVar.ckl().ik())) {
                riVar2.ri(40053, jbs.ri(40053));
                com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, com.bytedance.sdk.openadsdk.utils.ig.ri(wjvVar), "material_error", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.13
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", wjvVar.ckl().di());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public com.bytedance.sdk.openadsdk.ka.fi lr(JSONObject jSONObject) {
        int i;
        boolean z;
        boolean z2;
        List<String> listRi;
        String strLr = "error unknown";
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
        boolean z3 = false;
        int iRi = 0;
        try {
            JSONObject jSONObjectRi = ri(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            kaVarLr.ri(jSONObjectRi.toString(), nr.ka().bu());
            kaVarLr.ik(com.bytedance.sdk.openadsdk.utils.ig.ka("/api/ad/union/sdk/stats/batch/"));
            if (com.bytedance.sdk.openadsdk.utils.lr.ri() && (listRi = com.bytedance.sdk.openadsdk.utils.ig.ri("/api/ad/union/sdk/stats/batch/", false)) != null && !listRi.isEmpty()) {
                kaVarLr.ri(listRi);
                kaVarLr.ri(60L, TimeUnit.SECONDS);
            }
            ri(kaVarLr, jSONObjectRi);
            kaVarLr.lr(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.ig.ka());
            if (com.bytedance.sdk.openadsdk.core.settings.sf.lr().eb()) {
                kaVarLr.lr("_disable_retry", "1");
            }
            com.bytedance.sdk.component.xha.lr lrVarRi = kaVarLr.ri();
            try {
                if (lrVarRi == null) {
                    return new com.bytedance.sdk.openadsdk.ka.fi(false, 0, "error unknown", false);
                }
                if (!lrVarRi.di() || TextUtils.isEmpty(lrVarRi.ka())) {
                    z2 = false;
                    z = false;
                } else {
                    JSONObject jSONObject2 = new JSONObject(lrVarRi.ka());
                    int iOptInt = jSONObject2.optInt("code", -1);
                    strLr = jSONObject2.optString("data", "");
                    z = true;
                    z2 = iOptInt == 20000;
                    if (iOptInt != 60005) {
                        z = false;
                    }
                }
                try {
                    iRi = lrVarRi.ri();
                    if (!lrVarRi.di()) {
                        strLr = lrVarRi.lr();
                        com.bytedance.sdk.openadsdk.utils.uq.ri(kaVarLr.fi());
                    }
                } catch (Throwable unused) {
                    i = iRi;
                    z3 = z2;
                    z2 = z3;
                    iRi = i;
                }
                return new com.bytedance.sdk.openadsdk.ka.fi(z2, iRi, strLr, z);
            } catch (Throwable unused2) {
                i = 0;
                z = false;
            }
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.ka.fi(false, 0, "error unknown", false);
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, int i) {
        List<com.bytedance.sdk.openadsdk.core.model.nr> listRbz;
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listKa = riVar.ka();
        if (listKa != null && listKa.size() != 0) {
            for (int i2 = 0; i2 < listKa.size(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = listKa.get(i2);
                if (wjvVar != null && wjvVar.xm() == null) {
                    ri("", 0, 0, wjvVar.fb(), wjvVar);
                    if (i == 3) {
                        ri("", 0, 0, wjvVar.bzf(), wjvVar);
                    }
                    if (wjvVar.eu() != null) {
                        ri(wjvVar.eu().cuirassed(), wjvVar.eu().impassible(), wjvVar.eu().adultoid(), (com.bytedance.sdk.openadsdk.core.model.nr) null, wjvVar);
                    }
                    if ((i != 1 || wjvVar.eu() == null) && (listRbz = wjvVar.rbz()) != null && listRbz.size() > 0) {
                        for (int i3 = 0; i3 < listRbz.size(); i3++) {
                            ri(wjvVar, listRbz.get(i3));
                        }
                    }
                }
            }
        }
    }

    private void ri(String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.nr nrVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.qt.ka.ri(str).ri(i).lr(i2).fi(com.bytedance.sdk.openadsdk.utils.qd.fi(nr.ri())).ka(com.bytedance.sdk.openadsdk.utils.qd.ik(nr.ri())).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, str, null), 4);
        } else {
            if (nrVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.qt.ka.ri(nrVar).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, nrVar.ri(), null), 4);
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, com.bytedance.sdk.openadsdk.core.model.nr nrVar) {
        if (nrVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.qt.ka.ri(nrVar).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, nrVar.ri(), new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.ay.14
            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            }
        }), 4);
    }

    public static JSONArray lr(String str) {
        try {
            Set<String> setLr = com.bytedance.sdk.component.adexpress.ri.lr.lr.lr(str);
            if (setLr != null && setLr.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setLr.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ri.ik.lr lrVarRi = com.bytedance.sdk.component.adexpress.ri.lr.lr.ri(it.next());
                    if (lrVarRi != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", lrVarRi.lr());
                        jSONObject.put("md5", lrVarRi.ik());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private void ri(com.bytedance.sdk.component.lr.ri.qt qtVar, com.bytedance.sdk.openadsdk.core.model.igq igqVar, com.bytedance.sdk.openadsdk.utils.pv pvVar, com.bytedance.sdk.openadsdk.utils.pv pvVar2, int i, com.bytedance.sdk.openadsdk.utils.pv pvVar3, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        com.bytedance.sdk.openadsdk.utils.pv pvVar4;
        if (nr.ka().nd()) {
            JSONObject jSONObject = new JSONObject();
            long jRi = 0;
            if (igqVar != null) {
                try {
                    com.bytedance.sdk.openadsdk.utils.pv pvVar5 = igqVar.qt;
                    if (pvVar5.ri > 0) {
                        pvVar4 = pvVar3;
                        jRi = pvVar4.ri(pvVar5);
                    } else {
                        pvVar4 = pvVar3;
                    }
                } catch (Exception unused) {
                    return;
                }
            } else {
                pvVar4 = pvVar3;
            }
            long j = jRi;
            ri(qtVar, igqVar, pvVar, pvVar2, i, pvVar4, wjvVar, str, jSONObject, false);
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, "load_ad_time", j, jSONObject);
        }
    }

    private static void ri(com.bytedance.sdk.component.lr.ri.qt qtVar, com.bytedance.sdk.openadsdk.core.model.igq igqVar, com.bytedance.sdk.openadsdk.utils.pv pvVar, com.bytedance.sdk.openadsdk.utils.pv pvVar2, int i, com.bytedance.sdk.openadsdk.utils.pv pvVar3, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, JSONObject jSONObject, boolean z) throws JSONException {
        if (igqVar != null) {
            com.bytedance.sdk.openadsdk.utils.pv pvVar4 = igqVar.qt;
            if (pvVar4.ri > 0) {
                jSONObject.put("client_start_time", pvVar.ri(pvVar4));
            }
        }
        jSONObject.put("network_time", pvVar2.ri(pvVar));
        jSONObject.put("sever_time", i);
        jSONObject.put("client_end_time", pvVar3.ri(pvVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", wjvVar.ory() ? 1 : 0);
        }
        if (wjvVar != null) {
            jSONObject.put("render_control_type", wjvVar.ajz());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.fi.fi.ri().ik());
        jSONObject.put("sync_barrier_open", z ? 1 : 0);
        long j = qtVar.lr;
        if (j > 0) {
            jSONObject.put("enqueue_2_run_ts", qtVar.ik - j);
            jSONObject.put("run_2_connect_end_ts", qtVar.fi - qtVar.lr);
            jSONObject.put("connect_end_2_response_end_ts", qtVar.di - qtVar.fi);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - qtVar.di);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.ka.fi ri(JSONObject jSONObject, String str, List<String> list) {
        String str2;
        boolean z;
        int i;
        Object obj;
        try {
            byte[] bArr = null;
            if (com.bytedance.sdk.openadsdk.core.settings.xha.ri() && !com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
                com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
                kaVarLr.ik(str);
                if (com.bytedance.sdk.openadsdk.utils.lr.ri() && list != null && !list.isEmpty()) {
                    kaVarLr.ri(list);
                    kaVarLr.ri(60L, TimeUnit.SECONDS);
                }
                if (com.bytedance.sdk.openadsdk.core.settings.sf.lr().nh()) {
                    kaVarLr.lr("_disable_retry", "1");
                }
                Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(fi(jSONObject.toString()));
                if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                    bArr = (byte[]) obj;
                    su.lr(true);
                } else {
                    int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                    su.lr(false);
                    su.ri(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                }
                if (bArr != null) {
                    kaVarLr.lr("Content-Encoding", "union_sdk_encode");
                    kaVarLr.lr("x-pgli18n", "4");
                    kaVarLr.ri("application/octet-stream;tt-data=a", bArr);
                }
                if (bArr == null) {
                    try {
                        JSONObject jSONObjectRi = com.bytedance.sdk.component.utils.ri.ri(jSONObject);
                        if (!ik(jSONObjectRi)) {
                            jSONObjectRi = jSONObject;
                        }
                        ri(fi(jSONObjectRi), kaVarLr);
                        kaVarLr.ri(jSONObjectRi.toString(), nr.ka().bu());
                    } catch (OutOfMemoryError e) {
                        com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e.toString());
                        return new com.bytedance.sdk.openadsdk.ka.fi(false, -2, "encrypt_error", false);
                    }
                }
                com.bytedance.sdk.component.xha.lr lrVarRi = kaVarLr.ri();
                boolean zDi = (lrVarRi == null || !lrVarRi.di() || TextUtils.isEmpty(lrVarRi.ka())) ? false : di(new JSONObject(lrVarRi.ka()));
                String strLr = "error unknown";
                int iRi = lrVarRi != null ? lrVarRi.ri() : 0;
                if (!zDi && iRi == 200) {
                    str2 = "server say not success";
                    z = true;
                } else {
                    if (lrVarRi != null && lrVarRi.lr() != null) {
                        strLr = lrVarRi.lr();
                    }
                    str2 = strLr;
                    z = false;
                }
                if (lrVarRi == null) {
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("applog", str, -1, "response is null", kaVarLr.ik(), list);
                } else {
                    if (!lrVarRi.di()) {
                        i = iRi;
                        com.bytedance.sdk.openadsdk.slm.ri.fi.ri("applog", str, i, lrVarRi.lr(), kaVarLr.ik(), list);
                    }
                    ka(jSONObject);
                    return new com.bytedance.sdk.openadsdk.ka.fi(zDi, i, str2, z);
                }
                i = iRi;
                ka(jSONObject);
                return new com.bytedance.sdk.openadsdk.ka.fi(zDi, i, str2, z);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.ka.fi(false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "service_busy", false);
        }
    }

    private void ri(Map<String, String> map, com.bytedance.sdk.component.xha.lr.ka kaVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    kaVar.lr(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            kaVar.lr(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.ig.ka());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public void ri(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return;
        }
        JSONObject jSONObjectLr = lr(str, list, jSONObject, str2, str3);
        if (jSONObjectLr == null) {
            return;
        }
        com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
        final String strKa = com.bytedance.sdk.openadsdk.utils.ig.ka("/api/ad/union/dislike_event/");
        JSONObject jSONObjectRi = ri(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectLr);
        String string = jSONObjectRi != null ? jSONObjectRi.toString() : null;
        ri(kaVarLr, jSONObjectRi);
        kaVarLr.ik(strKa);
        kaVarLr.fi(string);
        kaVarLr.ri(7);
        kaVarLr.lr("dislike");
        com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.2
            @Override // com.bytedance.sdk.openadsdk.nr.ka
            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                riVar.lr("dislike");
                return riVar;
            }
        });
        kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.3
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                if (lrVar == null) {
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("dislike", strKa, -1, "response is null", null, null);
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.3
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("dislike");
                            return riVar;
                        }
                    });
                } else if (lrVar.di()) {
                    com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.1
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("dislike");
                            return riVar;
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.2
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr("dislike");
                            return riVar;
                        }
                    });
                    com.bytedance.sdk.openadsdk.slm.ri.fi.ri("dislike", strKa, lrVar.ri(), lrVar.lr(), null, null);
                }
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                com.bytedance.sdk.openadsdk.slm.ri.fi.ri("dislike", strKa, -1, iOException != null ? iOException.getMessage() : "null", null, null);
                if (ikVar != null) {
                    com.bytedance.sdk.openadsdk.utils.uq.ri(ikVar.fi());
                }
                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.4
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar.lr("dislike");
                        return riVar;
                    }
                });
            }
        });
        try {
            String strOptString = new JSONObject(str).optString(BidResponsedEx.KEY_CID, "");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("dislike", strOptString, (String) null, (String) null);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik(e.getMessage(), new Object[0]);
        }
    }

    public static JSONObject ri(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new fr(cryptDataScene));
        su.ri(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    private JSONArray ri(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private void ri(wjv.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
        riVar.ri(-1, jbs.ri(-1));
        ikVar.ri(-1);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(wjv.lr lrVar) {
        lrVar.ri(-1, jbs.ri(-1));
    }

    public static JSONObject ri(AdSlot adSlot) {
        zf zfVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", nr.ka().whw());
            jSONObject.put("lmt", DeviceUtils.ik());
            if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().sf()) {
                jSONObject.put("pa_consent", qt.lr().qt());
            }
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.qt.lr.ri().mj());
            jSONObject.put("tcstring", com.bytedance.sdk.openadsdk.core.settings.sf.lr(nr.ri()));
            jSONObject.put("tcf_gdpr", com.bytedance.sdk.openadsdk.core.settings.sf.ri(nr.ri()));
            if (adSlot != null && zf.ri.containsKey(Integer.valueOf(adSlot.getCodeId())) && (zfVar = zf.ri.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", zfVar.lr());
                jSONObject.put("lastbundle", zfVar.ik());
                jSONObject.put("lastclick", zfVar.ka());
                jSONObject.put("lastskip", zfVar.fi());
            }
            ri(jSONObject, "data", lr(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void ri(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject ri(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (igqVar != null) {
                jSONObject.put("render_method", igqVar.jbs);
                int i2 = igqVar.jbs;
                if (i2 == 1) {
                    ri(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i2 == 2) {
                    ri(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                ri(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", lr(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", ik(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", ik(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i == 1 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (igqVar != null && (obj2 = igqVar.xha) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (igqVar != null && (obj = igqVar.mj) != null) {
                jSONObject.put("common_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (igqVar != null && igqVar.fi != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void ri(JSONObject jSONObject, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void ri(JSONObject jSONObject, String str, float f, float f2) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f);
            jSONObject2.put("height", (int) f2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public void ri(JSONObject jSONObject, final wjv.lr lrVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            if (lrVar != null) {
                lrVar.ri(1000, "Ad request is temporarily paused, Please contact your AM");
            }
        } else {
            if (jSONObject == null || lrVar == null) {
                return;
            }
            JSONObject jSONObjectRi = ri(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
            try {
                kaVarLr.ik(com.bytedance.sdk.openadsdk.jbs.ka.ri(kaVarLr, com.bytedance.sdk.openadsdk.utils.ig.ka("/api/ad/union/sdk/reward_video/reward/")));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e.getMessage());
            }
            ri(kaVarLr, jSONObjectRi);
            kaVarLr.fi(jSONObjectRi != null ? jSONObjectRi.toString() : "");
            kaVarLr.ri(10);
            kaVarLr.lr(C3764u.j);
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.4
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr(C3764u.j);
                    return riVar;
                }
            });
            kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.5
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar2) {
                    if (lrVar2 == null) {
                        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.3
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr(C3764u.j);
                                return riVar;
                            }
                        });
                        com.bytedance.sdk.openadsdk.slm.ri.fi.ri(C3764u.j, ikVar.fi(), -1, "response is null", null, null);
                        ay.this.ri(lrVar);
                        return;
                    }
                    if (!lrVar2.di() || TextUtils.isEmpty(lrVar2.ka())) {
                        String strRi = jbs.ri(-2);
                        int iRi = lrVar2.ri();
                        if (!lrVar2.di() && !TextUtils.isEmpty(lrVar2.lr())) {
                            strRi = lrVar2.lr();
                        }
                        String str = strRi;
                        lrVar.ri(iRi, str);
                        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.2
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar.lr(C3764u.j);
                                return riVar;
                            }
                        });
                        if (lrVar2.di()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.slm.ri.fi.ri(C3764u.j, ikVar.fi(), iRi, str, null, null);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(lrVar2.ka());
                        String strRi2 = ay.ri(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strRi2)) {
                            try {
                                jSONObject2 = new JSONObject(strRi2);
                            } catch (Throwable unused) {
                            }
                        }
                        lr lrVarRi = lr.ri(jSONObject2);
                        int i = lrVarRi.ri;
                        if (i != 20000) {
                            lrVar.ri(i, jbs.ri(i));
                        } else if (lrVarRi.ik == null) {
                            ay.this.ri(lrVar);
                        } else {
                            lrVar.ri(lrVarRi);
                            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.1
                                @Override // com.bytedance.sdk.openadsdk.nr.ka
                                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                    riVar.lr(C3764u.j);
                                    return riVar;
                                }
                            });
                        }
                    } catch (JSONException e2) {
                        com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", e2.getMessage());
                        ay.this.ri(lrVar);
                    }
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    String message;
                    if (iOException != null) {
                        message = iOException.getMessage();
                    } else {
                        message = "";
                    }
                    String str = message;
                    lrVar.ri(-2, str);
                    if (ikVar != null) {
                        String strFi = ikVar.fi();
                        com.bytedance.sdk.openadsdk.utils.uq.ri(strFi);
                        com.bytedance.sdk.openadsdk.slm.ri.fi.ri(C3764u.j, strFi, -1, str, null, null);
                    }
                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.4
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr(C3764u.j);
                            return riVar;
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public JSONObject ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strRi = ri(iOptInt, strOptString);
            if (TextUtils.isEmpty(strRi)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strRi);
            try {
                jSONObject2.put("auction_price", strOptString2);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    public static String ri(int i, String str) {
        Object obj;
        if (i == 3) {
            return com.bytedance.sdk.component.utils.ri.ik(str);
        }
        if (i == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                su.ri(true);
                return str2;
            }
            su.ri(false);
            su.ri(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private void ri(com.bytedance.sdk.component.xha.lr.ka kaVar, JSONObject jSONObject) {
        try {
            if (ik(jSONObject) && jSONObject.optInt("cypher") == 4) {
                kaVar.lr("x-pgli18n", "4");
                kaVar.lr("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public com.bytedance.sdk.component.adexpress.ri.ik.ri ri() {
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarRi = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tpl_fetch_model", "date", 0L);
        String strTnn = nr.ka().tnn();
        String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= nr.ka().pv() && jCurrentTimeMillis >= 0 && TextUtils.equals(strTnn, strLr)) {
            String strLr2 = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("tpl_fetch_model", L6.B, "");
            try {
                if (!TextUtils.isEmpty(strLr2)) {
                    return com.bytedance.sdk.component.adexpress.ri.ik.ri.fi(strLr2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
            String strRi = com.bytedance.sdk.openadsdk.jbs.ka.ri(lrVarIk, strTnn);
            lrVarIk.ik(strRi);
            com.bytedance.sdk.component.xha.lr lrVarRi = lrVarIk.ri();
            if (lrVarRi == null || !lrVarRi.di()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(lrVarRi.ka());
            jSONObject.put("template_fetch_url", strRi);
            riVarRi = com.bytedance.sdk.component.adexpress.ri.ik.ri.ri(jSONObject);
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tpl_fetch_model", L6.B, jSONObject.toString());
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tpl_fetch_model", "last_url", strTnn);
            return riVarRi;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("NetApiImpl", th.getMessage());
            return riVarRi;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public void ri(String str) {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return;
        }
        com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
        lrVarIk.ik(str);
        lrVarIk.lr("upload_bidding");
        lrVarIk.ri(7);
        lrVarIk.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.6
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                lrVar.ka();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    public void ri(JSONObject jSONObject, String str) {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return;
        }
        com.bytedance.sdk.component.xha.lr.ka kaVarLr = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().lr();
        kaVarLr.ik(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        kaVarLr.lr("cypher", (String) pairGenerateRequestHeader.first);
        kaVarLr.lr("transfer-param", (String) pairGenerateRequestHeader.second);
        kaVarLr.lr("x-pangle-target-idc", nr.ka().tpb());
        kaVarLr.ri(jSONObject);
        kaVarLr.ri(5);
        kaVarLr.lr("apm_pv");
        kaVarLr.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.7
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                lrVar.ka();
            }
        });
    }
}
