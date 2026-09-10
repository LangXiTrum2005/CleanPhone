package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.umeng.analytics.pro.ay;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SG;
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
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DY implements tD<com.bytedance.sdk.openadsdk.ZU.Lxb> {
    private final Context Lxb;

    public static class LD {
        public final boolean LD;
        public final int Lxb;
        public final com.bytedance.sdk.openadsdk.core.model.foI lk;

        private LD(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.foI foi) {
            this.Lxb = i;
            this.LD = z;
            this.lk = foi;
        }

        public static LD Lxb(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.foI foi = new com.bytedance.sdk.openadsdk.core.model.foI();
            if (jSONObjectOptJSONObject != null) {
                try {
                    foi.Lxb(jSONObjectOptJSONObject.optInt("reason"));
                    foi.LD(jSONObjectOptJSONObject.optInt("corp_type"));
                    foi.lk(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    foi.Lxb(jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", th.getMessage());
                }
            }
            return new LD(iOptInt, zOptBoolean, foi);
        }
    }

    public DY(Context context) {
        this.Lxb = context;
    }

    private boolean JXs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.bytedance.sdk.openadsdk.core.DY] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    public void LD(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.Sfi sfi, final int i, final tD.Lxb lxb) {
        Object ld;
        com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs;
        if (!kqm.ZU().Iyd()) {
            lxb.Lxb(40060, OY.Lxb(40060));
            return;
        }
        boolean zLk = com.bytedance.sdk.openadsdk.DY.Lxb.lk();
        if (!zLk) {
            STP.lc();
        }
        final com.bytedance.sdk.openadsdk.core.model.LD ld2 = new com.bytedance.sdk.openadsdk.core.model.LD();
        ld2.Lxb(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb()) {
            if (lxb != null) {
                lxb.Lxb(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                ld2.Lxb(1000);
                com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
                return;
            }
            return;
        }
        if (!kqm.ZU().NDz()) {
            if (lxb != null) {
                lxb.Lxb(-16, OY.Lxb(-16));
                ld2.Lxb(1001);
                com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
                return;
            }
            return;
        }
        if (lxb == null) {
            return;
        }
        if (ZU(adSlot.getCodeId())) {
            lxb.Lxb(-8, OY.Lxb(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !sfi.lc) {
            ld2.LD(2);
            ld2.Lxb(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.sLN.ZU()) {
                SG.a(adSlot.getBidAdm());
            }
            if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
                nJ.Lxb("Pangle_Debug_Mode", adSlot.getBidAdm(), this.Lxb);
            }
            try {
                JSONObject jSONObjectLxb = Lxb(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectLxb == null) {
                    Lxb(lxb, ld2);
                    return;
                }
                Lxb Lxb2 = Lxb.Lxb(jSONObjectLxb, adSlot, sfi, ld2);
                ld2.Lxb(Lxb2.nBu);
                sLN.Lxb(this.Lxb, Lxb2.QAg);
                int i2 = Lxb2.ZU;
                if (i2 != 20000) {
                    lxb.Lxb(i2, Lxb2.JXs);
                    ld2.Lxb(Lxb2.ZU);
                    com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.Lxb lxb2 = Lxb2.OY;
                if (lxb2 == null) {
                    Lxb(lxb, ld2);
                    return;
                }
                if (lxb2.ZU() != null && Lxb2.OY.ZU().size() > 0) {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb(Lxb2.OY.ZU().get(0));
                }
                Lxb2.OY.lk(jSONObjectLxb.toString());
                lxb.Lxb(Lxb2.OY, ld2);
                Map<String, com.bytedance.sdk.openadsdk.core.model.tD> mapLxb = com.bytedance.sdk.openadsdk.core.model.Lxb.Lxb(Lxb2.OY);
                if (mapLxb != null) {
                    com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(mapLxb);
                }
                Lxb(Lxb2.OY);
                com.bytedance.sdk.openadsdk.core.ZU.Lxb.Lxb().Lxb(Lxb2.OY);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "get ad error: ", th);
                Lxb(lxb, ld2);
                return;
            }
        }
        JSONObject jSONObjectLxb2 = Lxb(adSlot, sfi, i);
        if (jSONObjectLxb2 == null) {
            lxb.Lxb(-9, OY.Lxb(-9));
            ld2.Lxb(-9);
            com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
            return;
        }
        if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
            nJ.Lxb("Pangle_Debug_Mode", jSONObjectLxb2.toString(), this.Lxb);
        }
        String strLxb = nJ.Lxb(adSlot.getBiddingTokens() != null ? "/api/ad/union/mediation/get_ads/" : "/api/ad/union/sdk/get_ads/", true);
        com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
        final com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs2 = new com.bytedance.sdk.openadsdk.STP.Lxb.JXs(2);
        try {
            String strLxb2 = com.bytedance.sdk.openadsdk.OY.ZU.Lxb(zuLD, strLxb);
            zuLD.LD(strLxb2);
            jXs2.Lxb(strLxb2);
        } catch (Exception unused) {
        }
        zuLD.Lxb(jSONObjectLxb2.toString(), kqm.ZU().kqm());
        jXs2.Lxb(zuLD.ZU()).Lxb();
        Map<String, String> mapLxb2 = com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb(strLxb, jSONObjectLxb2.toString());
        if (mapLxb2 != null && mapLxb2.size() > 0) {
            for (String str : mapLxb2.keySet()) {
                try {
                    zuLD.LD(str, mapLxb2.get(str));
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e.getMessage());
                }
            }
        }
        try {
            zuLD.LD("User-Agent", nJ.lk());
            Lxb(zuLD, jSONObjectLxb2);
        } catch (Exception unused2) {
        }
        final CG cgLD = CG.LD();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z = QAg.LD().kqm() && requestExtraMap != null;
        if (z) {
            requestExtraMap.put("pgad_start", cgLD);
        }
        if (adSlot.getBiddingTokens() != null) {
            Lxb(adSlot, sfi, zuLD, requestExtraMap, z, cgLD, lxb);
            return;
        }
        zuLD.Lxb(10);
        zuLD.Lxb("get_ad");
        com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.8
            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("get_ad");
                lxbL.lk(adSlot.getCodeId());
                lxbL.ZU(nJ.lk(adSlot.getDurationSlotType()));
                return lxbL;
            }
        });
        if (com.bytedance.sdk.component.utils.sLN.ZU()) {
            Thread.currentThread().getName();
        }
        if (!zLk) {
            final boolean z2 = z;
            zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.LD() { // from class: com.bytedance.sdk.openadsdk.core.DY.9
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld3) {
                    DY.this.Lxb(ld3, jXs2, z2, requestExtraMap, cgLD, adSlot, ld2, lxb, sfi, i);
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.LD
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException, com.bytedance.sdk.component.ebl.LD ld3) {
                    DY.this.Lxb(iOException, ld3, adSlot, jXs2, z2, requestExtraMap, lxb, ld2);
                }
            });
            return;
        }
        try {
            com.bytedance.sdk.component.ebl.LD ldLxb = zuLD.Lxb();
            if (ldLxb == null) {
                jXs = null;
                ld = new com.bytedance.sdk.component.ebl.LD(false, 5001, "RequestBody is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L);
            }
            com.bytedance.sdk.component.ebl.LD ld3 = ldLxb;
            try {
                if (ld3.lc()) {
                    Lxb(ld3, jXs2, z, requestExtraMap, cgLD, adSlot, ld2, lxb, sfi, i);
                } else {
                    Lxb(new IOException(ld3.LD()), ld3, adSlot, jXs2, z, requestExtraMap, lxb, ld2);
                }
            } catch (Throwable th2) {
                th = th2;
                Lxb(new IOException(th.getMessage()), new com.bytedance.sdk.component.ebl.LD(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, jXs, z, ld, lxb, ld2);
            }
        } catch (Throwable th3) {
            th = th3;
            ld = requestExtraMap;
            jXs = jXs2;
        }
    }

    private boolean ZU(String str) {
        if (com.bytedance.sdk.openadsdk.core.ebl.LD.Lxb()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.ebl.LD.Lxb(str)) {
            return false;
        }
        String strLD = com.bytedance.sdk.openadsdk.core.ebl.LD.LD();
        if (!TextUtils.isEmpty(strLD)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(strLD, System.currentTimeMillis());
        }
        return true;
    }

    @DungeonFlag
    private void lc(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", nJ.JXs());
            jSONObject.put("version_code", nJ.lc());
            jSONObject.put("version", nJ.ebl());
        } catch (Exception unused) {
        }
    }

    private boolean lk(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private byte[] JXs(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes("utf-8"));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e) {
                                com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e3) {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e3.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e4.toString());
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e5.toString());
                                throw th;
                            }
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
        } catch (IOException e8) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e8.toString());
        }
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x008b A[Catch: JSONException -> 0x00bb, TryCatch #0 {JSONException -> 0x00bb, blocks: (B:3:0x0005, B:9:0x0047, B:11:0x008b, B:23:0x00ad, B:8:0x0030, B:5:0x002a), top: B:26:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x009d  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ac  */
    @DungeonFlag
    private JSONObject lk() {
        int i;
        int rotation;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", QAg.LD().ZU());
            jSONObject.put("name", QAg.LD().lc());
            lc(jSONObject);
            Context contextLxb = kqm.Lxb();
            String packageResourcePath = "";
            if (contextLxb != null) {
                try {
                    packageResourcePath = contextLxb.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                jSONObject.put("is_paid_app", QAg.LD().JVA());
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.LD.ebl());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - STP.Lxb()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.QAg(this.Lxb));
                i = 0;
                jSONObject.put("is_init", STP.JXs() ? 1 : 0);
                if (contextLxb != null) {
                    rotation = ((WindowManager) contextLxb.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i = 1;
                    } else if (rotation != 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i = 2;
                    } else if (rotation != 3) {
                        i = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                jSONObject.put("is_paid_app", QAg.LD().JVA());
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.LD.ebl());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - STP.Lxb()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.QAg(this.Lxb));
                i = 0;
                jSONObject.put("is_init", STP.JXs() ? 1 : 0);
                if (contextLxb != null) {
                    rotation = ((WindowManager) contextLxb.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i = 1;
                    } else if (rotation != 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i = 2;
                    } else if (rotation != 3) {
                        i = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    private Map<String, String> ZU(JSONObject jSONObject) {
        HashMap mapV = AbstractC3950lJ.v("Content-Type", "application/json; charset=utf-8");
        if (lk(jSONObject)) {
            mapV.put(HttpResponseHeader.ContentEncoding, "union_sdk_encode");
        }
        return mapV;
    }

    @DungeonFlag
    private JSONObject Lxb(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, int i) {
        int i2;
        int i3;
        int i4;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strZU = (sfi == null || TextUtils.isEmpty(sfi.Lxb)) ? nJ.ZU() : sfi.Lxb;
            if (i == 7) {
                if (sfi != null && (i4 = sfi.LD) > 0) {
                    jSONObject2.put("req_type", i4);
                }
            } else if (i == 8) {
                if (sfi != null && (i3 = sfi.lk) > 0) {
                    jSONObject2.put("req_type", i3);
                }
            } else if (i == 3 && sfi != null && (i2 = sfi.ZU) > 0) {
                jSONObject2.put("req_type", i2);
            }
            try {
                String strNBu = kqm.ZU().nBu();
                String strDY = kqm.ZU().DY();
                if (strNBu != null && strDY != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strNBu);
                    jSONObject3.put("param", strDY);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                jSONObject2.put("bidding_param", adSlot.getBiddingTokens());
                com.bytedance.sdk.openadsdk.core.settings.LD ldFoI = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().foI(adSlot.getCodeId());
                jSONObject2.put("waterfall_id", ldFoI.dR);
                jSONObject2.put("waterfall_version", ldFoI.NDz);
                jSONObject2.put("link_id", adSlot.getLinkId());
            }
            jSONObject2.put("request_id", strZU);
            nJ.Lxb(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.VVE.TA().bm() ? 1 : 0);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.OY.sLN.LD());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.OY.sLN.lk());
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, lk());
            jSONObject2.put("device", DeviceUtils.Lxb(this.Lxb, true));
            jSONObject2.put(ay.m, Lxb(adSlot));
            jSONObject2.put(ay.d, nJ.lk());
            jSONObject2.put("channel", "main");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(Lxb(adSlot, i, sfi));
            jSONObject2.put("adslots", jSONArray);
            Lxb(jSONObject2, sfi);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strZU != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strZU);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.JXs.Lxb(strConcat));
            if (com.bytedance.sdk.openadsdk.core.QAg.lk.JXs() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.QAg.lk.JXs()));
            }
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb(jSONObject2);
            jSONObject = Lxb(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.utils.Sfi.LD("body data exception", th);
        }
        return jSONObject;
    }

    public static class Lxb {
        final String JXs;
        final long LD;
        final int Lxb;

        @Nullable
        public final com.bytedance.sdk.openadsdk.core.model.Lxb OY;
        final String QAg;
        final int ZU;
        final String ebl;
        final int lc;
        final long lk;
        final ArrayList<Integer> nBu;

        private Lxb(String str, int i, int i2, String str2, int i3, String str3, @Nullable com.bytedance.sdk.openadsdk.core.model.Lxb lxb, long j, long j2, ArrayList<Integer> arrayList) {
            this.Lxb = i;
            this.ZU = i2;
            this.JXs = str2;
            this.ebl = str3;
            this.OY = lxb;
            this.QAg = str;
            this.lc = i3;
            this.LD = j;
            this.lk = j2;
            this.nBu = arrayList;
        }

        public static Lxb Lxb(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, com.bytedance.sdk.openadsdk.core.model.LD ld) {
            Object obj;
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.Lxb, ArrayList<Integer>> pairLxb = com.bytedance.sdk.openadsdk.core.LD.Lxb(jSONObject, adSlot, sfi, ld);
            if (pairLxb != null && (obj = pairLxb.first) != null) {
                ((com.bytedance.sdk.openadsdk.core.model.Lxb) obj).Lxb(jSONObject.optLong("request_after"));
            }
            return pairLxb == null ? new Lxb(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new Lxb(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.Lxb) pairLxb.first, jOptLong, jOptLong2, (ArrayList) pairLxb.second);
        }

        public static Lxb Lxb(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Sfi sfi) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adn_bid_result");
                com.bytedance.sdk.openadsdk.core.model.Lxb lxb = new com.bytedance.sdk.openadsdk.core.model.Lxb();
                if (jSONArrayOptJSONArray != null) {
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString4 = jSONObjectOptJSONObject.optString("name");
                            String strOptString5 = jSONObjectOptJSONObject.optString("render_data");
                            String strOptString6 = jSONObjectOptJSONObject.optString("price");
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("win_notice");
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("loss_notice");
                            String strOptString7 = jSONObjectOptJSONObject.optString(BidResponsedEx.KEY_CID);
                            String strOptString8 = jSONObjectOptJSONObject.optString("crid");
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray("adomain");
                            String strOptString9 = jSONObjectOptJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.OY oy = new com.bytedance.sdk.openadsdk.core.model.OY();
                            oy.Lxb(strOptString4);
                            oy.LD(strOptString5);
                            oy.lk(strOptString6);
                            oy.ZU(strOptString7);
                            oy.JXs(strOptString8);
                            oy.lc(strOptString9);
                            if (jSONArrayOptJSONArray4 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray4.length(); i2++) {
                                    arrayList.add(jSONArrayOptJSONArray4.optString(i2));
                                }
                                oy.lk(arrayList);
                            }
                            if (jSONArrayOptJSONArray2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                    arrayList2.add(jSONArrayOptJSONArray2.optString(i3));
                                }
                                oy.Lxb(arrayList2);
                            }
                            if (jSONArrayOptJSONArray3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                                    arrayList3.add(jSONArrayOptJSONArray3.optString(i4));
                                }
                                oy.LD(arrayList3);
                            }
                            lxb.Lxb(oy);
                        }
                        i++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        strOptString3 = strOptString3;
                        jOptLong2 = jOptLong2;
                        jOptLong = jOptLong;
                        iOptInt3 = iOptInt3;
                    }
                }
                return new Lxb(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, lxb, jOptLong, jOptLong2, null);
            }
            return new Lxb(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null);
        }
    }

    public static JSONArray lk(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb> setLxb = com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(str);
            if (setLxb != null && setLxb.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.JVA.Lxb.Lxb lxb : setLxb) {
                    if (lxb != null && !TextUtils.isEmpty(lxb.JXs())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = lxb.Lxb().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", lxb.LD());
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
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private void Lxb(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.Sfi sfi) {
        JSONArray jSONArray;
        if (sfi == null || (jSONArray = sfi.JXs) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public void Lxb(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.Sfi sfi, final int i, tD.Lxb lxb) {
        final com.bytedance.sdk.openadsdk.core.Lxb.Lxb lxb2 = new com.bytedance.sdk.openadsdk.core.Lxb.Lxb(lxb, adSlot);
        if (sfi != null && (sfi.LD == 2 || sfi.lk == 2 || sfi.ZU == 2)) {
            adSlot.setPreload(true);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            STP.LD().post(new com.bytedance.sdk.component.OY.OY("getAd") { // from class: com.bytedance.sdk.openadsdk.core.DY.1
                @Override // java.lang.Runnable
                public void run() {
                    DY.this.LD(adSlot, sfi, i, lxb2);
                }
            });
        } else {
            LD(adSlot, sfi, i, lxb2);
        }
        if (com.bytedance.sdk.openadsdk.DY.Lxb.lk()) {
            STP.ebl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(IOException iOException, com.bytedance.sdk.component.ebl.LD ld, final AdSlot adSlot, com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs, boolean z, Map<String, Object> map, tD.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld2) {
        String message;
        int iLxb;
        com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.10
            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("get_ad");
                lxbL.lk(adSlot.getCodeId());
                lxbL.ZU(nJ.lk(adSlot.getDurationSlotType()));
                lxbL.Lxb(BuildConfig.VERSION_NAME);
                return lxbL;
            }
        });
        jXs.LD();
        if (ld != null) {
            message = ld.LD();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        CG cgLD = CG.LD();
        if (z) {
            map.put("pgad_end", Long.valueOf(cgLD.Lxb));
        }
        if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
            nJ.Lxb("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.Lxb);
        }
        if (ld != null) {
            iLxb = ld.Lxb();
        } else {
            iLxb = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE;
        }
        if (lxb != null) {
            lxb.Lxb(iLxb, message);
        }
        ld2.Lxb(iLxb);
        com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
        com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk.incrementAndGet();
        com.bytedance.sdk.openadsdk.ZU.Lxb.lc.Lxb.incrementAndGet();
        com.bytedance.sdk.openadsdk.ZU.Lxb.lc.ebl.incrementAndGet();
        com.bytedance.sdk.openadsdk.ZU.Lxb.lc.JXs();
        com.bytedance.sdk.openadsdk.ZU.Lxb.lc.Lxb(iLxb, message);
        com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
        jXs.ZU(message).Lxb(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public void Lxb(com.bytedance.sdk.component.ebl.LD ld, com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs, boolean z, Map<String, Object> map, CG cg, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.LD ld2, tD.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, int i) {
        com.bytedance.sdk.openadsdk.core.model.LD ld3;
        CG cg2;
        boolean z2;
        com.bytedance.sdk.openadsdk.core.model.CSn cSn;
        System.currentTimeMillis();
        jXs.LD();
        if (z) {
            map.put("pgad_end", cg);
        }
        if (ld == null) {
            return;
        }
        if (ld.lc()) {
            com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.11
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("get_ad");
                    lxbL.lk(adSlot.getCodeId());
                    lxbL.ZU(nJ.lk(adSlot.getDurationSlotType()));
                    lxbL.Lxb(BuildConfig.VERSION_NAME);
                    return lxbL;
                }
            });
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.LD.incrementAndGet();
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.Lxb.incrementAndGet();
            try {
                CG cgLD = CG.LD();
                String strZU = ld.ZU();
                JSONObject jSONObject = new JSONObject(strZU);
                if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
                    nJ.Lxb("Pangle_Debug_Mode", jSONObject.toString(), this.Lxb);
                }
                ld2.Lxb(strZU);
                JSONObject jSONObjectLxb = Lxb(jSONObject);
                if (jSONObjectLxb == null) {
                    Lxb(lxb, ld2);
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lc.incrementAndGet();
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
                    jXs.Lxb(true).Lxb(ld.Lxb()).lk(strZU);
                    return;
                }
                Lxb Lxb2 = Lxb.Lxb(jSONObjectLxb, adSlot, sfi, ld2);
                ld2.Lxb(Lxb2.nBu);
                sLN.Lxb(this.Lxb, Lxb2.QAg);
                int i2 = Lxb2.ZU;
                if (i2 != 20000) {
                    ld2.Lxb(i2);
                    if (!kqm.ZU().nE() && Lxb2.ZU == 40029) {
                        lxb.Lxb(-100, OY.Lxb(-100));
                    } else {
                        lxb.Lxb(Lxb2.ZU, Lxb2.JXs);
                    }
                    com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lc.incrementAndGet();
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
                    jXs.Lxb(true).Lxb(ld.Lxb()).lk(strZU);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.Lxb lxb2 = Lxb2.OY;
                if (lxb2 == null) {
                    Lxb(lxb, ld2);
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.JXs.incrementAndGet();
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
                    jXs.Lxb(true).Lxb(ld.Lxb()).lk(strZU);
                    return;
                }
                lxb2.lk(jSONObjectLxb.toString());
                Lxb2.OY.ZU(strZU);
                CG cgLD2 = CG.LD();
                if (sfi != null && (cSn = sfi.nBu) != null) {
                    cSn.Lxb(cg, cgLD, Lxb2.Lxb, cgLD2);
                }
                boolean z3 = com.bytedance.sdk.openadsdk.DY.Lxb.ZU() && i == 1;
                if (!z3 || Lxb2.OY.ZU() == null || Lxb2.OY.ZU().isEmpty()) {
                    cg2 = cgLD;
                } else {
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar = Lxb2.OY.ZU().get(0);
                    String strLk = nJ.lk(i);
                    boolean zOY = Lxb2.OY.OY();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    long jLxb = 0;
                    if (sfi != null) {
                        try {
                            CG cg3 = sfi.QAg;
                            cg2 = cgLD;
                            try {
                                if (cg3.Lxb > 0) {
                                    jLxb = cgLD2.Lxb(cg3);
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            cg2 = cgLD;
                        }
                    } else {
                        cg2 = cgLD;
                    }
                    long j = jLxb;
                    if (tDVar != null) {
                        boolean zPw = tDVar.Pw();
                        jSONObject3.put("is_new_engine", zPw ? 1 : 0);
                        jSONObject3.put("webview_cache_size", zPw ? com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().ZU() : com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().lk());
                    }
                    Lxb(ld.ebl(), sfi, cg, cg2, Lxb2.Lxb, cgLD2, tDVar, strLk, zOY, jSONObject3, true);
                    jSONObject2.put("duration", j);
                    jSONObject2.put("extra_data", jSONObject3);
                    jSONObject2.put("tag", strLk);
                    jSONObject2.put("callback_start", cgLD2.Lxb());
                    Lxb2.OY.Lxb(jSONObject2);
                }
                lxb.Lxb(Lxb2.OY, ld2);
                Lxb(Lxb2.OY);
                com.bytedance.sdk.openadsdk.core.ZU.Lxb.Lxb().Lxb(Lxb2.OY);
                Map<String, com.bytedance.sdk.openadsdk.core.model.tD> mapLxb = com.bytedance.sdk.openadsdk.core.model.Lxb.Lxb(Lxb2.OY);
                if (mapLxb != null) {
                    com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(mapLxb);
                }
                if (Lxb2.OY.ZU() == null || Lxb2.OY.ZU().isEmpty()) {
                    strZU = strZU;
                    ld3 = ld2;
                    z2 = true;
                } else {
                    if (z3) {
                        ld3 = ld2;
                        z2 = true;
                    } else {
                        z2 = true;
                        ld3 = ld2;
                        try {
                            Lxb(ld.ebl(), sfi, cg, cg2, Lxb2.Lxb, cgLD2, Lxb2.OY.ZU().get(0), nJ.lk(i), Lxb2.OY.OY());
                        } catch (Throwable th) {
                            th = th;
                            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "get ad error: ", th);
                            Lxb(lxb, ld3);
                            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.JXs.incrementAndGet();
                            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
                            jXs.Lxb(ld.lc()).Lxb(ld.Lxb()).lk(ld.ZU()).ZU(th.getMessage());
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.ZU.Lxb.lc.ZU.incrementAndGet();
                }
                com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
                jXs.Lxb(z2).Lxb(ld.Lxb()).lk(strZU);
            } catch (Throwable th2) {
                th = th2;
                ld3 = ld2;
            }
        } else {
            com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.12
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("get_ad");
                    lxbL.lk(adSlot.getCodeId());
                    lxbL.ZU(nJ.lk(adSlot.getDurationSlotType()));
                    lxbL.Lxb(BuildConfig.VERSION_NAME);
                    return lxbL;
                }
            });
            int iLxb = ld.Lxb();
            String strLD = ld.LD();
            lxb.Lxb(iLxb, strLD);
            ld2.Lxb(iLxb);
            com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld2);
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.OY.incrementAndGet();
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk.incrementAndGet();
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.Lxb.incrementAndGet();
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.JXs();
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.Lxb(iLxb, strLD);
            com.bytedance.sdk.openadsdk.ZU.Lxb.lc.lk();
            jXs.Lxb(false).Lxb(iLxb).ZU(strLD).lk(ld.ZU());
        }
    }

    @DungeonFlag
    private JSONObject LD(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", Lxb(list));
            jSONObject2.put("dislike_source", str4);
            if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Of() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.Lxb.Lxb(new JSONObject(str2)).toString());
                jSONObject2.put("feedback_type", 1);
                jSONObject2.put("user_description", str3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @NonNull
    private Map<String, String> LD() {
        return AbstractC3950lJ.v("Content-Type", "application/octet-stream;tt-data=a");
    }

    private static String LD(AdSlot adSlot) {
        String strNXR = QAg.LD().NXR();
        if (adSlot == null) {
            return TextUtils.isEmpty(strNXR) ? "" : strNXR;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(strNXR)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return strNXR;
        }
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
                JSONArray jSONArray2 = new JSONArray(strNXR);
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
            return strNXR;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String LD(int i, String str) {
        Object obj;
        if (i == 3) {
            return com.bytedance.sdk.component.utils.Lxb.lk(str);
        }
        if (i == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                HD.Lxb(true);
                return str2;
            }
            HD.Lxb(false);
            HD.Lxb(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:35:0x00cd, B:37:0x00d3), top: B:69:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    @Override // com.bytedance.sdk.openadsdk.core.tD
    public com.bytedance.sdk.openadsdk.ZU.JXs LD(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int iLxb;
        boolean z3;
        String strZU;
        int i;
        String strLD = "error unknown";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb() || !kqm.ZU().Iyd() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.STP.Lxb.JXs(4);
        JSONObject jSONObjectLxb = Lxb(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
        com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
        boolean z4 = false;
        try {
            zuLD.Lxb(jSONObjectLxb.toString(), kqm.ZU().kqm());
            String strZU2 = nJ.ZU("/api/ad/union/sdk/stats/batch/");
            jXs.Lxb(strZU2).Lxb(zuLD.ZU()).Lxb();
            zuLD.LD(strZU2);
            Lxb(zuLD, jSONObjectLxb);
            zuLD.LD("User-Agent", nJ.lk());
            if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lv()) {
                zuLD.LD("_disable_retry", "1");
            }
            com.bytedance.sdk.component.ebl.LD ldLxb = zuLD.Lxb();
            try {
                if (ldLxb == null) {
                    return new com.bytedance.sdk.openadsdk.ZU.JXs(false, 0, "error unknown", false);
                }
                try {
                    try {
                        if (ldLxb.lc() && !TextUtils.isEmpty(ldLxb.ZU())) {
                            JSONObject jSONObject2 = new JSONObject(ldLxb.ZU());
                            int iOptInt = jSONObject2.optInt("code", -1);
                            strLD = jSONObject2.optString("data", "");
                            z = iOptInt == 20000;
                            z2 = iOptInt == 60005;
                            iLxb = ldLxb.Lxb();
                            if (!ldLxb.lc()) {
                                strLD = ldLxb.LD();
                            }
                            if (ldLxb == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3 && ldLxb.lc()) {
                                z4 = true;
                            }
                            com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXsLxb = jXs.Lxb(z4);
                            if (z3) {
                                strZU = null;
                            } else {
                                strZU = ldLxb.ZU();
                            }
                            com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXsLk = jXsLxb.lk(strZU);
                            if (z3) {
                                i = com.bytedance.sdk.openadsdk.STP.Lxb.JXs.Lxb;
                            } else {
                                i = iLxb;
                            }
                            jXsLk.Lxb(i).ZU(z3 ? null : ldLxb.LD());
                            com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.LD, z, iLxb, System.currentTimeMillis() - jCurrentTimeMillis);
                            return new com.bytedance.sdk.openadsdk.ZU.JXs(z, iLxb, strLD, z2);
                        }
                        z = false;
                        if (!ldLxb.lc()) {
                            strLD = ldLxb.LD();
                        }
                    } catch (Throwable unused) {
                    }
                    iLxb = ldLxb.Lxb();
                } catch (Throwable unused2) {
                    iLxb = 0;
                }
                if (ldLxb == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z4 = true;
                }
                com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXsLxb2 = jXs.Lxb(z4);
                if (z3) {
                    strZU = null;
                } else {
                    strZU = ldLxb.ZU();
                }
                com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXsLk2 = jXsLxb2.lk(strZU);
                if (z3) {
                    i = com.bytedance.sdk.openadsdk.STP.Lxb.JXs.Lxb;
                } else {
                    i = iLxb;
                }
                jXsLk2.Lxb(i).ZU(z3 ? null : ldLxb.LD());
                com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.LD, z, iLxb, System.currentTimeMillis() - jCurrentTimeMillis);
                return new com.bytedance.sdk.openadsdk.ZU.JXs(z, iLxb, strLD, z2);
            } catch (Throwable unused3) {
                z = false;
                z2 = false;
            }
        } catch (Throwable unused4) {
            com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.LD, false, 0, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.ZU.JXs(false, 0, "error unknown", false);
        }
    }

    public static JSONArray LD(String str) {
        try {
            Set<String> setLD = com.bytedance.sdk.component.adexpress.Lxb.LD.LD.LD(str);
            if (setLD != null && setLD.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setLD.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.Lxb.lk.LD ldLxb = com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb(it.next());
                    if (ldLxb != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", ldLxb.LD());
                        jSONObject.put("md5", ldLxb.lk());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    private void Lxb(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.Sfi sfi, com.bytedance.sdk.component.ebl.LD.ZU zu, final Map<String, Object> map, final boolean z, final CG cg, final tD.Lxb lxb) {
        zu.Lxb(new com.bytedance.sdk.component.ebl.Lxb.LD() { // from class: com.bytedance.sdk.openadsdk.core.DY.13
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                if (z) {
                    map.put("pgad_end", cg);
                }
                if (ld == null || !ld.lc()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(ld.ZU());
                    if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
                        nJ.Lxb("Pangle_Debug_Mode", jSONObject.toString(), DY.this.Lxb);
                    }
                    JSONObject jSONObjectLxb = DY.this.Lxb(jSONObject);
                    if (jSONObjectLxb == null) {
                        lxb.Lxb(-1, OY.Lxb(-1));
                        return;
                    }
                    Lxb Lxb2 = Lxb.Lxb(jSONObjectLxb, adSlot, sfi);
                    if (Lxb2.ZU != 20000) {
                        if (kqm.ZU().nE() || Lxb2.ZU != 40029) {
                            lxb.Lxb(Lxb2.ZU, Lxb2.JXs);
                            return;
                        } else {
                            lxb.Lxb(-100, OY.Lxb(-100));
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.model.Lxb lxb2 = Lxb2.OY;
                    if (lxb2 == null) {
                        lxb.Lxb(-1, OY.Lxb(-1));
                        return;
                    }
                    lxb2.lk(jSONObjectLxb.toString());
                    lxb.Lxb(Lxb2.OY, new com.bytedance.sdk.openadsdk.core.model.LD());
                    DY.this.Lxb(Lxb2.OY);
                    com.bytedance.sdk.openadsdk.core.ZU.Lxb.Lxb().Lxb(Lxb2.OY);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "get ad error: ", th);
                    lxb.Lxb(-1, OY.Lxb(-1));
                }
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.LD
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException, com.bytedance.sdk.component.ebl.LD ld) {
                String message;
                CG cgLD = CG.LD();
                if (z) {
                    map.put("pgad_end", Long.valueOf(cgLD.Lxb));
                }
                if (kqm.ZU().Ld() && foI.Lxb().ebl() == 1) {
                    nJ.Lxb("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, DY.this.Lxb);
                }
                if (ld != null) {
                    lxb.Lxb(ld.Lxb(), ld.LD());
                    return;
                }
                if (iOException != null) {
                    message = iOException.getMessage();
                } else {
                    message = "";
                }
                lxb.Lxb(601, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = lxb.ZU();
        if (listZU == null || listZU.size() == 0) {
            return;
        }
        for (int i = 0; i < listZU.size(); i++) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = listZU.get(i);
            if (tDVar != null && tDVar.sLN() == null) {
                Lxb("", 0, 0, tDVar.Lpq(), tDVar);
                Lxb("", 0, 0, tDVar.Ns(), tDVar);
                List<com.bytedance.sdk.openadsdk.core.model.IeN> listUxf = tDVar.uxf();
                if (listUxf != null && listUxf.size() > 0) {
                    for (int i2 = 0; i2 < listUxf.size(); i2++) {
                        Lxb(tDVar, listUxf.get(i2));
                    }
                }
                if (tDVar.JJ() != null) {
                    Lxb(tDVar.JJ().f, tDVar.JJ().b, tDVar.JJ().f3307a, (com.bytedance.sdk.openadsdk.core.model.IeN) null, tDVar);
                }
            }
        }
    }

    private void Lxb(String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.IeN ieN, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str).Lxb(i).LD(i2).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, str, null), 4);
        } else {
            if (ieN == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(ieN).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, ieN.Lxb(), null), 4);
        }
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.openadsdk.core.model.IeN ieN) {
        if (ieN == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(ieN).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, ieN.Lxb(), new com.bytedance.sdk.component.JXs.VVE() { // from class: com.bytedance.sdk.openadsdk.core.DY.14
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(com.bytedance.sdk.component.JXs.JVA jva) {
            }
        }), 4);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    private void Lxb(com.bytedance.sdk.component.LD.Lxb.nBu nbu, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, CG cg, CG cg2, int i, CG cg3, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, boolean z) {
        if (kqm.ZU().Lpq()) {
            JSONObject jSONObject = new JSONObject();
            long jLxb = 0;
            if (sfi != null) {
                try {
                    CG cg4 = sfi.QAg;
                    if (cg4.Lxb > 0) {
                        jLxb = cg3.Lxb(cg4);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            long j = jLxb;
            Lxb(nbu, sfi, cg, cg2, i, cg3, tDVar, str, z, jSONObject, false);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "load_ad_time", j, jSONObject);
        }
    }

    private static void Lxb(com.bytedance.sdk.component.LD.Lxb.nBu nbu, com.bytedance.sdk.openadsdk.core.model.Sfi sfi, CG cg, CG cg2, int i, CG cg3, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, boolean z, JSONObject jSONObject, boolean z2) throws JSONException {
        if (sfi != null) {
            CG cg4 = sfi.QAg;
            if (cg4.Lxb > 0) {
                jSONObject.put("client_start_time", cg.Lxb(cg4));
            }
        }
        jSONObject.put("network_time", cg2.Lxb(cg));
        jSONObject.put("sever_time", i);
        jSONObject.put("client_end_time", cg3.Lxb(cg2));
        if (z) {
            jSONObject.put("is_choose_ad", true);
        }
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", tDVar.kVf() ? 1 : 0);
        }
        if (tDVar != null) {
            jSONObject.put("render_control_type", tDVar.eK());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().lk());
        jSONObject.put("sync_barrier_open", z2 ? 1 : 0);
        long j = nbu.LD;
        if (j > 0) {
            jSONObject.put("enqueue_2_run_ts", nbu.lk - j);
            jSONObject.put("run_2_connect_end_ts", nbu.JXs - nbu.LD);
            jSONObject.put("connect_end_2_response_end_ts", nbu.lc - nbu.JXs);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - nbu.lc);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    @WorkerThread
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.ZU.JXs Lxb(JSONObject jSONObject, String str, boolean z) {
        byte[] bArrEncryptV3;
        boolean z2;
        Object obj;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLD = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb()) {
                return null;
            }
            com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
            zuLD.LD(str);
            if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().nTb()) {
                zuLD.LD("_disable_retry", "1");
            }
            boolean z3 = true;
            if (z) {
                com.bytedance.sdk.openadsdk.core.settings.lc lcVarTA = com.bytedance.sdk.openadsdk.core.settings.VVE.TA();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean zLxb = lcVarTA.Lxb(cryptDataScene);
                byte[] bArrJXs = JXs(jSONObject.toString());
                if (zLxb) {
                    Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bArrJXs);
                    if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        bArrEncryptV3 = (byte[]) obj;
                        HD.LD(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        HD.LD(false);
                        HD.Lxb(1, cryptDataScene, iIntValue);
                        bArrEncryptV3 = null;
                    }
                } else {
                    bArrEncryptV3 = null;
                }
                if (bArrEncryptV3 != null) {
                    zuLD.LD(HttpResponseHeader.ContentEncoding, "union_sdk_encode");
                    zuLD.LD("x-pgli18n", "4");
                    zuLD.Lxb("application/octet-stream;tt-data=a", bArrEncryptV3);
                } else {
                    bArrEncryptV3 = PangleEncryptManager.encryptV3(bArrJXs);
                    if (bArrEncryptV3 == null) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "V3 encrypt failed");
                    } else {
                        Lxb(LD(), zuLD);
                        zuLD.Lxb("application/octet-stream;tt-data=a", bArrEncryptV3);
                    }
                }
            } else {
                bArrEncryptV3 = null;
            }
            if (bArrEncryptV3 == null) {
                try {
                    JSONObject jSONObjectLxb = com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
                    if (!lk(jSONObjectLxb)) {
                        jSONObjectLxb = jSONObject;
                    }
                    Lxb(ZU(jSONObjectLxb), zuLD);
                    zuLD.Lxb(jSONObjectLxb.toString(), kqm.ZU().kqm());
                } catch (OutOfMemoryError e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e.toString());
                    return new com.bytedance.sdk.openadsdk.ZU.JXs(false, -2, "encrypt_error", false);
                }
            }
            com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.STP.Lxb.JXs(3);
            jXs.Lxb(str).Lxb(zuLD.ZU()).Lxb();
            com.bytedance.sdk.component.ebl.LD ldLxb = zuLD.Lxb();
            boolean zJXs = (ldLxb == null || !ldLxb.lc() || TextUtils.isEmpty(ldLxb.ZU())) ? false : JXs(new JSONObject(ldLxb.ZU()));
            String strLD2 = "error unknown";
            int iLxb = ldLxb != null ? ldLxb.Lxb() : 0;
            if (!zJXs && iLxb == 200) {
                strLD2 = "server say not success";
                z2 = true;
            } else {
                if (ldLxb != null && ldLxb.LD() != null) {
                    strLD2 = ldLxb.LD();
                }
                z2 = false;
            }
            boolean z4 = ldLxb == null;
            if (z4 || !ldLxb.lc()) {
                z3 = false;
            }
            com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXsLxb = jXs.Lxb(z3).lk(z4 ? null : ldLxb.ZU()).Lxb(z4 ? com.bytedance.sdk.openadsdk.STP.Lxb.JXs.Lxb : iLxb);
            if (!z4) {
                strLD = ldLxb.LD();
            }
            jXsLxb.ZU(strLD);
            Lxb(jSONObject, z);
            com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.Lxb, zJXs, iLxb, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.ZU.JXs(zJXs, iLxb, strLD2, z2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.ZU.JXs(false, 509, "service_busy", false);
        }
    }

    private void Lxb(Map<String, String> map, com.bytedance.sdk.component.ebl.LD.ZU zu) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    zu.LD(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            zu.LD("User-Agent", nJ.lk());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    private void Lxb(JSONObject jSONObject, boolean z) throws Throwable {
        Object obj;
        if (QAg.LD().kqm()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
            zuLD.LD(nJ.NXR());
            byte[] bArrEncryptV3 = null;
            if (z) {
                com.bytedance.sdk.openadsdk.core.settings.lc lcVarTA = com.bytedance.sdk.openadsdk.core.settings.VVE.TA();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean zLxb = lcVarTA.Lxb(cryptDataScene);
                byte[] bArrJXs = JXs(jSONObject.toString());
                if (zLxb) {
                    Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bArrJXs);
                    if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        bArrEncryptV3 = (byte[]) obj;
                        HD.LD(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        HD.LD(false);
                        HD.Lxb(1, cryptDataScene, iIntValue);
                    }
                }
                if (bArrEncryptV3 != null) {
                    zuLD.LD(HttpResponseHeader.ContentEncoding, "union_sdk_encode");
                    zuLD.LD("x-pgli18n", "4");
                    zuLD.Lxb("application/octet-stream;tt-data=a", bArrEncryptV3);
                } else {
                    bArrEncryptV3 = PangleEncryptManager.encryptV3(bArrJXs);
                    if (bArrEncryptV3 == null) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", "V3 encrypt failed");
                    } else {
                        Lxb(LD(), zuLD);
                        zuLD.Lxb("application/octet-stream;tt-data=a", bArrEncryptV3);
                    }
                }
            }
            if (bArrEncryptV3 == null) {
                JSONObject jSONObjectLxb = com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
                if (lk(jSONObjectLxb)) {
                    jSONObject = jSONObjectLxb;
                }
                Lxb(ZU(jSONObject), zuLD);
                zuLD.Lxb(jSONObject.toString(), kqm.ZU().kqm());
            }
            zuLD.Lxb(7);
            zuLD.Lxb("et_applog");
            zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.DY.15
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                    if (ld == null || !ld.lc()) {
                        return;
                    }
                    ld.ZU();
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public void Lxb(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject jSONObjectLD;
        if (com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb() && (jSONObjectLD = LD(str, list, str2, str3, str4)) != null) {
            com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
            String strZU = nJ.ZU("/api/ad/union/dislike_event/");
            JSONObject jSONObjectLxb = Lxb(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectLD);
            String string = jSONObjectLxb != null ? jSONObjectLxb.toString() : null;
            Lxb(zuLD, jSONObjectLxb);
            zuLD.LD(strZU);
            zuLD.ZU(string);
            final com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.STP.Lxb.JXs(6);
            jXs.Lxb(strZU).LD(string).Lxb();
            zuLD.Lxb(7);
            zuLD.Lxb("dislike");
            com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.2
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    return AbstractC3950lJ.l("dislike");
                }
            });
            zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.DY.3
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                    if (ld == null) {
                        jXs.Lxb(false).Lxb(com.bytedance.sdk.openadsdk.STP.Lxb.JXs.Lxb);
                        com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.3.3
                            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                return AbstractC3950lJ.l("dislike");
                            }
                        });
                        return;
                    }
                    boolean zLc = ld.lc();
                    jXs.Lxb(zLc).Lxb(ld.Lxb()).ZU(ld.LD()).lk(ld.ZU());
                    if (zLc) {
                        com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.3.1
                            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                return AbstractC3950lJ.l("dislike");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.3.2
                            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                return AbstractC3950lJ.l("dislike");
                            }
                        });
                    }
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    jXs.Lxb(false).ZU(iOException != null ? iOException.getMessage() : null);
                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.3.4
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            return AbstractC3950lJ.l("dislike");
                        }
                    });
                }
            });
            try {
                String strOptString = new JSONObject(str).optString(BidResponsedEx.KEY_CID, "");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("dislike", strOptString, (String) null, (String) null);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
            }
        }
    }

    private static JSONObject Lxb(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(cryptDataScene)) {
            JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new Sfi(cryptDataScene));
            HD.Lxb(jSONObjectEncryptType4);
            return jSONObjectEncryptType4;
        }
        return com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
    }

    private JSONArray Lxb(List<FilterWord> list) {
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

    private void Lxb(tD.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
        lxb.Lxb(-1, OY.Lxb(-1));
        ld.Lxb(-1);
        com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(tD.LD ld) {
        ld.Lxb(-1, OY.Lxb(-1));
    }

    public static JSONObject Lxb(AdSlot adSlot) {
        eK eKVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", kqm.ZU().JJ());
            jSONObject.put("lmt", DeviceUtils.lk());
            jSONObject.put("coppa", QAg.LD().nBu());
            jSONObject.put("gdpr", QAg.LD().QAg());
            jSONObject.put("is_gdpr_user", kqm.ZU().Pw());
            jSONObject.put("ccpa", QAg.LD().DY());
            if (adSlot != null && eK.Lxb.containsKey(Integer.valueOf(adSlot.getCodeId())) && (eKVar = eK.Lxb.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", eKVar.LD());
                jSONObject.put("lastbundle", eKVar.lk());
                jSONObject.put("lastclick", eKVar.ZU());
                jSONObject.put("lastskip", eKVar.JXs());
            }
            Lxb(jSONObject, "keywords", QAg.LD().sLN());
            Lxb(jSONObject, "data", LD(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void Lxb(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject Lxb(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.Sfi sfi) {
        Object obj;
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
            if (sfi != null) {
                jSONObject.put("render_method", sfi.OY);
                int i2 = sfi.OY;
                if (i2 == 1) {
                    Lxb(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i2 == 2) {
                    Lxb(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                Lxb(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", LD(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", lk(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", lk(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (sfi != null && (obj = sfi.ebl) != null) {
                jSONObject.put("session_params", obj);
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
            if (sfi != null && sfi.JXs != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void Lxb(JSONObject jSONObject, String str, int i, int i2) {
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

    private void Lxb(JSONObject jSONObject, String str, float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
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

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public void Lxb(JSONObject jSONObject, final tD.LD ld) {
        if (!com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb()) {
            if (ld != null) {
                ld.Lxb(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                return;
            }
            return;
        }
        if (jSONObject == null || ld == null) {
            return;
        }
        JSONObject jSONObjectLxb = Lxb(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        final com.bytedance.sdk.openadsdk.STP.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.STP.Lxb.JXs(5);
        com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
        try {
            String strLxb = com.bytedance.sdk.openadsdk.OY.ZU.Lxb(zuLD, nJ.ZU("/api/ad/union/sdk/reward_video/reward/"));
            zuLD.LD(strLxb);
            jXs.Lxb(strLxb);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e.getMessage());
        }
        Lxb(zuLD, jSONObjectLxb);
        zuLD.ZU(jSONObjectLxb != null ? jSONObjectLxb.toString() : "");
        jXs.Lxb(zuLD.ZU()).Lxb();
        zuLD.Lxb(10);
        zuLD.Lxb("reward");
        com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.4
            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                return AbstractC3950lJ.l("reward");
            }
        });
        zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.DY.5
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld2) {
                if (ld2 == null) {
                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.5.3
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            return AbstractC3950lJ.l("reward");
                        }
                    });
                    jXs.Lxb(false).Lxb(com.bytedance.sdk.openadsdk.STP.Lxb.JXs.Lxb);
                    DY.this.Lxb(ld);
                    return;
                }
                if (!ld2.lc() || TextUtils.isEmpty(ld2.ZU())) {
                    jXs.Lxb(ld2.lc()).lk(ld2.ZU()).Lxb(ld2.Lxb()).ZU(ld2.LD());
                    String strLxb2 = OY.Lxb(-2);
                    int iLxb = ld2.Lxb();
                    if (!ld2.lc() && !TextUtils.isEmpty(ld2.LD())) {
                        strLxb2 = ld2.LD();
                    }
                    ld.Lxb(iLxb, strLxb2);
                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.5.2
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            return AbstractC3950lJ.l("reward");
                        }
                    });
                    return;
                }
                jXs.Lxb(true).Lxb(ld2.Lxb()).lk(ld2.ZU());
                try {
                    JSONObject jSONObject2 = new JSONObject(ld2.ZU());
                    String strLD = DY.LD(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                    if (!TextUtils.isEmpty(strLD)) {
                        try {
                            jSONObject2 = new JSONObject(strLD);
                        } catch (Throwable unused) {
                        }
                    }
                    LD ldLxb = LD.Lxb(jSONObject2);
                    int i = ldLxb.Lxb;
                    if (i != 20000) {
                        ld.Lxb(i, OY.Lxb(i));
                    } else if (ldLxb.lk == null) {
                        DY.this.Lxb(ld);
                    } else {
                        ld.Lxb(ldLxb);
                        com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.5.1
                            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                return AbstractC3950lJ.l("reward");
                            }
                        });
                    }
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e2.getMessage());
                    DY.this.Lxb(ld);
                }
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                String message;
                if (iOException != null) {
                    message = iOException.getMessage();
                } else {
                    message = "";
                }
                jXs.Lxb(false).ZU(message);
                ld.Lxb(-2, message);
                com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.core.DY.5.4
                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                        return AbstractC3950lJ.l("reward");
                    }
                });
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public JSONObject Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strLD = LD(iOptInt, strOptString);
            if (TextUtils.isEmpty(strLD)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strLD);
            try {
                jSONObject2.put("auction_price", strOptString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    private void Lxb(com.bytedance.sdk.component.ebl.LD.ZU zu, JSONObject jSONObject) {
        try {
            if (lk(jSONObject) && jSONObject.optInt("cypher") == 4) {
                zu.LD("x-pgli18n", "4");
                zu.LD("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb Lxb() {
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbZU = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tpl_fetch_model", "date", 0L);
        String strBcA = kqm.ZU().BcA();
        String strLD = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= kqm.ZU().KPU() && jCurrentTimeMillis >= 0 && TextUtils.equals(strBcA, strLD)) {
            String strLD2 = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strLD2)) {
                    return com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.ZU(strLD2);
                }
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
        try {
            ldLk.LD(com.bytedance.sdk.openadsdk.OY.ZU.Lxb(ldLk, strBcA));
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NetApiImpl", e.getMessage());
        }
        com.bytedance.sdk.component.ebl.LD ldLxb = ldLk.Lxb();
        if (ldLxb == null) {
            return null;
        }
        try {
            if (!ldLxb.lc()) {
                return null;
            }
            String strZU = ldLxb.ZU();
            lxbZU = com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.ZU(strZU);
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tpl_fetch_model", "model", strZU);
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tpl_fetch_model", "last_url", strBcA);
            return lxbZU;
        } catch (Exception unused2) {
            return lxbZU;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public void Lxb(String str) {
        com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
        ldLk.LD(str);
        ldLk.Lxb("upload_bidding");
        ldLk.Lxb(7);
        ldLk.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.DY.6
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                ld.ZU();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tD
    public void Lxb(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
        zuLD.LD(str);
        zuLD.Lxb(jSONObject);
        zuLD.Lxb(5);
        zuLD.Lxb("apm_pv");
        zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.DY.7
            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
            public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                ld.ZU();
            }
        });
    }
}
