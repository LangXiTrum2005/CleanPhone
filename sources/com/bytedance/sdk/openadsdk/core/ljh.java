package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.smartdigimkt.x.g;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ljh implements oth<com.bytedance.sdk.openadsdk.mml.qdl> {
    private final Context qdl;

    public static class qdl {
        public final com.bytedance.sdk.openadsdk.core.model.qdl jpc;
        final long lnr;
        final int mml;
        final int mo;
        final String mzz;
        final int qdl;
        final ArrayList<Integer> to;
        final String tvp;
        final long ud;
        final String wd;

        private qdl(String str, int i2, int i3, String str2, int i4, String str3, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.qdl = i2;
            this.mml = i3;
            this.mzz = str2;
            this.wd = str3;
            this.jpc = qdlVar;
            this.tvp = str;
            this.mo = i4;
            this.ud = j;
            this.lnr = j2;
            this.to = arrayList;
        }

        public static qdl qdl(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString("desc");
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.qdl, ArrayList<Integer>> pairQdl = com.bytedance.sdk.openadsdk.core.ud.qdl(jSONObject, adSlot, bqtVar);
            return pairQdl == null ? new qdl(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new qdl(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.qdl) pairQdl.first, jOptLong, jOptLong2, (ArrayList) pairQdl.second);
        }
    }

    public static class ud {
        public final com.bytedance.sdk.openadsdk.core.model.hkc lnr;
        public final int qdl;
        public final boolean ud;

        private ud(int i2, boolean z2, com.bytedance.sdk.openadsdk.core.model.hkc hkcVar) {
            this.qdl = i2;
            this.ud = z2;
            this.lnr = hkcVar;
        }

        public static ud qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.hkc hkcVar = new com.bytedance.sdk.openadsdk.core.model.hkc();
            if (jSONObjectOptJSONObject != null) {
                try {
                    hkcVar.qdl(jSONObjectOptJSONObject.optInt("reason"));
                    hkcVar.ud(jSONObjectOptJSONObject.optInt("corp_type"));
                    hkcVar.lnr(jSONObjectOptJSONObject.optInt("reward_amount"));
                    hkcVar.qdl(jSONObjectOptJSONObject.optString("reward_name"));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", th.getMessage());
                }
            }
            return new ud(iOptInt, zOptBoolean, hkcVar);
        }
    }

    public ljh(Context context) {
        this.qdl = context;
    }

    private boolean lnr(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private boolean mml(String str) {
        if (com.bytedance.sdk.openadsdk.core.jpc.ud.qdl()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.jpc.ud.qdl(str)) {
            return false;
        }
        String strUd = com.bytedance.sdk.openadsdk.core.jpc.ud.ud();
        if (!TextUtils.isEmpty(strUd)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(strUd, System.currentTimeMillis());
        }
        return true;
    }

    @DungeonFlag
    private void mo(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.gy.mo());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.gy.wd());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.gy.jpc());
        } catch (Exception unused) {
        }
    }

    private boolean mzz(JSONObject jSONObject) {
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
    public void ud(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, final int i2, final oth.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar2;
        if (!yt.mml().mlb()) {
            qdlVar.qdl(40060, jpc.qdl(40060));
            return;
        }
        boolean zLnr = com.bytedance.sdk.openadsdk.jyq.qdl.lnr();
        if (!zLnr) {
            rdp.mo();
        }
        final com.bytedance.sdk.openadsdk.core.model.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.model.lnr();
        lnrVar.qdl(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            if (qdlVar != null) {
                qdlVar.qdl(1000, "Ad request is temporarily paused, Please contact your AM");
                lnrVar.qdl(1000);
                com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                return;
            }
            return;
        }
        if (!yt.mml().jjk()) {
            if (qdlVar != null) {
                qdlVar.qdl(-16, jpc.qdl(-16));
                lnrVar.qdl(1001);
                com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                return;
            }
            return;
        }
        if (qdlVar == null) {
            return;
        }
        if (mml(adSlot.getCodeId())) {
            qdlVar.qdl(-8, jpc.qdl(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !bqtVar.mo) {
            lnrVar.ud(2);
            lnrVar.qdl(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.bjy.mml()) {
                com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud.qdl(adSlot.getBidAdm());
            }
            if (yt.mml().car() && kdv.qdl().mml() == 1) {
                com.bytedance.sdk.openadsdk.utils.gy.qdl("Pangle_Debug_Mode", adSlot.getBidAdm(), this.qdl);
            }
            try {
                JSONObject jSONObjectQdl = qdl(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectQdl == null) {
                    lnrVar.lnr(12);
                    qdl(qdlVar, lnrVar);
                    return;
                }
                qdl qdlVarQdl = qdl.qdl(jSONObjectQdl, adSlot, bqtVar);
                lnrVar.qdl(qdlVarQdl.to);
                fs.qdl(qdlVarQdl.tvp);
                int i3 = qdlVarQdl.mml;
                if (i3 != 20000) {
                    qdlVar.qdl(i3, qdlVarQdl.mzz);
                    lnrVar.qdl(qdlVarQdl.mml);
                    lnrVar.lnr(9);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar3 = qdlVarQdl.jpc;
                if (qdlVar3 == null) {
                    lnrVar.lnr(13);
                    qdl(qdlVar, lnrVar);
                    return;
                }
                if (qdlVar3.mml() != null && !qdlVarQdl.jpc.mml().isEmpty()) {
                    com.bytedance.sdk.openadsdk.bjy.lnr.qdl(qdlVarQdl.jpc.mml().get(0));
                }
                qdl(qdlVarQdl.jpc);
                if (qdl(qdlVarQdl.jpc, qdlVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVarQdl.jpc);
                qdlVar.qdl(qdlVarQdl.jpc, lnrVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.ljh> mapQdl = com.bytedance.sdk.openadsdk.core.model.qdl.qdl(qdlVarQdl.jpc);
                if (mapQdl != null) {
                    com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(mapQdl);
                }
                ud(qdlVarQdl.jpc);
                com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(qdlVarQdl.jpc);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.qdl("NetApiImpl", "get ad error: ", th);
                lnrVar.lnr(14);
                lnrVar.ud(th.getMessage());
                qdl(qdlVar, lnrVar);
                return;
            }
        }
        if (bqtVar != null && !TextUtils.isEmpty(bqtVar.fs)) {
            try {
                JSONObject jSONObjectQdl2 = qdl(new JSONObject(bqtVar.fs));
                if (jSONObjectQdl2 != null) {
                    qdl qdlVarQdl2 = qdl.qdl(jSONObjectQdl2, adSlot, bqtVar);
                    aaj aajVar = bqtVar.exu;
                    if (aajVar != null && (qdlVar2 = qdlVarQdl2.jpc) != null && aajVar.qdl(qdlVar2)) {
                        com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVar2);
                        qdlVar.qdl(qdlVar2, lnrVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectQdl3 = qdl(adSlot, bqtVar, i2);
        if (jSONObjectQdl3 == null) {
            qdlVar.qdl(-9, jpc.qdl(-9));
            lnrVar.qdl(-9);
            com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
            return;
        }
        if (yt.mml().car() && kdv.qdl().mml() == 1) {
            com.bytedance.sdk.openadsdk.utils.gy.qdl("Pangle_Debug_Mode", jSONObjectQdl3.toString(), this.qdl);
        }
        String strQdl = com.bytedance.sdk.openadsdk.utils.gy.qdl("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
        try {
            mmlVarUd.ud(com.bytedance.sdk.openadsdk.jpc.mml.qdl(mmlVarUd, strQdl));
        } catch (Exception unused2) {
        }
        mmlVarUd.qdl(jSONObjectQdl3.toString(), yt.mml().jl());
        Map<String, String> mapQdl2 = com.bytedance.sdk.openadsdk.core.to.lnr.qdl(strQdl, jSONObjectQdl3.toString());
        if (mapQdl2 != null && mapQdl2.size() > 0) {
            for (String str : mapQdl2.keySet()) {
                try {
                    mmlVarUd.ud(str, mapQdl2.get(str));
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e2.getMessage());
                }
            }
        }
        try {
            mmlVarUd.ud(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.gy.mml());
            qdl(mmlVarUd, jSONObjectQdl3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.mrf mrfVarUd = com.bytedance.sdk.openadsdk.utils.mrf.ud();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z2 = tvp.ud().yt() && requestExtraMap != null;
        if (z2) {
            requestExtraMap.put("pgad_start", mrfVarUd);
        }
        mmlVarUd.qdl(10);
        mmlVarUd.qdl("get_ad");
        com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.8
            @Override // com.bytedance.sdk.openadsdk.yt.mml
            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarI = Z.i("get_ad");
                qdlVarI.lnr(adSlot.getCodeId());
                qdlVarI.mml(com.bytedance.sdk.openadsdk.utils.gy.lnr(adSlot.getDurationSlotType()));
                return qdlVarI;
            }
        });
        if (com.bytedance.sdk.component.utils.bjy.mml()) {
            Thread.currentThread().getName();
        }
        if (zLnr) {
            Map<String, Object> map = requestExtraMap;
            try {
                com.bytedance.sdk.component.wd.ud udVarQdl = mmlVarUd.qdl();
                com.bytedance.sdk.component.wd.ud udVar = udVarQdl == null ? new com.bytedance.sdk.component.wd.ud(false, IronSourceConstants.errorCode_biddingDataException, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : udVarQdl;
                if (udVar.mo()) {
                    boolean z3 = z2;
                    try {
                        qdl(mmlVarUd, udVar, z3, map, mrfVarUd, adSlot, lnrVar, qdlVar, bqtVar, i2);
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        map = map;
                        lnrVar = lnrVar;
                        qdl(mmlVarUd, new IOException(th.getMessage()), new com.bytedance.sdk.component.wd.ud(false, IronSourceConstants.errorCode_isReadyException, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z2, map, qdlVar, lnrVar);
                    }
                } else {
                    qdl(mmlVarUd, new IOException(udVar.ud()), udVar, adSlot, z2, map, qdlVar, lnrVar);
                    com.bytedance.sdk.openadsdk.utils.jyq.qdl(mmlVarUd.mml());
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            final boolean z4 = z2;
            mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.ud() { // from class: com.bytedance.sdk.openadsdk.core.ljh.9
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar2, com.bytedance.sdk.component.wd.ud udVar2) {
                    ljh.this.qdl(lnrVar2, udVar2, z4, (Map<String, Object>) requestExtraMap, mrfVarUd, adSlot, lnrVar, qdlVar, bqtVar, i2);
                }

                @Override // com.bytedance.sdk.component.wd.qdl.ud
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar2, IOException iOException, com.bytedance.sdk.component.wd.ud udVar2) {
                    ljh.this.qdl(mmlVarUd, iOException, udVar2, adSlot, z4, (Map<String, Object>) requestExtraMap, qdlVar, lnrVar);
                    if (lnrVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.jyq.qdl(lnrVar2.mml());
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().qdl(false);
    }

    public static JSONArray lnr(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.rq.qdl.qdl> setQdl = com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl(str);
            if (setQdl != null && setQdl.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.rq.qdl.qdl qdlVar : setQdl) {
                    if (qdlVar != null && !TextUtils.isEmpty(qdlVar.mzz())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = qdlVar.qdl().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", qdlVar.ud());
                            jSONArray.put(jSONObject);
                        } else {
                            continue;
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.qdl("NetApiImpl", "getUgenParentTplIds: ", e2);
            return null;
        }
    }

    private byte[] mzz(String str) throws Throwable {
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
                            } catch (IOException e2) {
                                com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e2.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                            e = e3;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e4.toString());
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
                                } catch (IOException e5) {
                                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e5.toString());
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e6) {
                                com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e6.toString());
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            } catch (IOException e8) {
                e = e8;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e9) {
            com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e9.toString());
        }
        return byteArray;
    }

    private Map<String, String> mml(JSONObject jSONObject) {
        HashMap mapS = a.s("Content-Type", "application/json; charset=utf-8");
        if (lnr(jSONObject)) {
            mapS.put("Content-Encoding", "union_sdk_encode");
        }
        return mapS;
    }

    @DungeonFlag
    private JSONObject qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, int i2) {
        int i3;
        int i4;
        int i5;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strMzz = (bqtVar == null || TextUtils.isEmpty(bqtVar.qdl)) ? com.bytedance.sdk.openadsdk.utils.gy.mzz() : bqtVar.qdl;
            if (i2 == 7) {
                if (bqtVar != null && (i5 = bqtVar.ud) > 0) {
                    jSONObject2.put("req_type", i5);
                }
            } else if (i2 == 8) {
                if (bqtVar != null && (i4 = bqtVar.lnr) > 0) {
                    jSONObject2.put("req_type", i4);
                }
            } else if (i2 == 3 && bqtVar != null && (i3 = bqtVar.mml) > 0) {
                jSONObject2.put("req_type", i3);
            }
            try {
                String strRq = yt.mml().rq();
                String strRc = yt.mml().rc();
                if (strRq != null && strRc != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strRq);
                    jSONObject3.put("param", strRc);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("request_id", strMzz);
            com.bytedance.sdk.openadsdk.utils.gy.qdl(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.tvp.fs.ud());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.tvp.fs.lnr());
            jSONObject2.put("source_type", "app");
            jSONObject2.put("app", ud());
            jSONObject2.put(d9.h.G, DeviceUtils.qdl(this.qdl, true));
            jSONObject2.put("user", qdl(adSlot));
            jSONObject2.put("ua", com.bytedance.sdk.openadsdk.utils.gy.mml());
            jSONObject2.put("channel", d9.h.Z);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(qdl(adSlot, i2, bqtVar));
            jSONObject2.put("adslots", jSONArray);
            qdl(jSONObject2, bqtVar);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strMzz != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strMzz);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.mzz.qdl(strConcat));
            if (com.bytedance.sdk.openadsdk.core.to.lnr.mzz() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.to.lnr.mzz()));
            }
            jSONObject2.put("adx_id", tvp.ud().bch());
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl(jSONObject2);
            jSONObject = qdl(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("body data exception", th);
        }
        return jSONObject;
    }

    private void qdl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar) {
        JSONArray jSONArray;
        if (bqtVar == null || (jSONArray = bqtVar.mzz) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, int i2, aaj aajVar) {
        if (!bqtVar.mo && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!qdl(bqtVar) && aajVar != null) {
                String strQdl = aajVar.qdl();
                if (!TextUtils.isEmpty(strQdl)) {
                    bqtVar.fs = strQdl;
                    bqtVar.exu = aajVar;
                }
            }
            qdl(adSlot, bqtVar, i2, (oth.qdl) aajVar);
            return;
        }
        qdl(adSlot, bqtVar, i2, (oth.qdl) aajVar);
    }

    private boolean qdl(com.bytedance.sdk.openadsdk.core.model.bqt bqtVar) {
        if (bqtVar != null) {
            return bqtVar.ud == 2 || bqtVar.lnr == 2 || bqtVar.mml == 2;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public void qdl(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, final int i2, oth.qdl qdlVar) {
        if (bqtVar != null && (bqtVar.ud == 2 || bqtVar.lnr == 2 || bqtVar.mml == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.core.ud.qdl(qdlVar, adSlot, (adSlot.isPreload() || bqtVar == null || bqtVar.mo) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            rdp.ud().post(new com.bytedance.sdk.component.jpc.jpc("getAd") { // from class: com.bytedance.sdk.openadsdk.core.ljh.1
                @Override // java.lang.Runnable
                public void run() {
                    ljh.this.ud(adSlot, bqtVar, i2, qdlVar2);
                }
            });
        } else {
            ud(adSlot, bqtVar, i2, qdlVar2);
        }
        if (com.bytedance.sdk.openadsdk.jyq.qdl.lnr()) {
            rdp.wd();
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVarMo;
        if (qdlVar == null || (ljhVarMo = qdlVar.mo()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.rq.vu(ljhVarMo.az());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.component.wd.ud.mml mmlVar, IOException iOException, com.bytedance.sdk.component.wd.ud udVar, final AdSlot adSlot, boolean z2, Map<String, Object> map, oth.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
        String message;
        int iQdl;
        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.10
            @Override // com.bytedance.sdk.openadsdk.yt.mml
            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarI = Z.i("get_ad");
                qdlVarI.lnr(adSlot.getCodeId());
                qdlVarI.mml(com.bytedance.sdk.openadsdk.utils.gy.lnr(adSlot.getDurationSlotType()));
                qdlVarI.qdl(BuildConfig.VERSION_NAME);
                return qdlVarI;
            }
        });
        if (udVar != null) {
            message = udVar.ud();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        com.bytedance.sdk.openadsdk.utils.mrf mrfVarUd = com.bytedance.sdk.openadsdk.utils.mrf.ud();
        if (z2) {
            map.put("pgad_end", Long.valueOf(mrfVarUd.qdl));
        }
        if (yt.mml().car() && kdv.qdl().mml() == 1) {
            com.bytedance.sdk.openadsdk.utils.gy.qdl("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.qdl);
        }
        if (udVar != null) {
            iQdl = udVar.qdl();
        } else {
            iQdl = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION : IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD;
        }
        if (qdlVar != null) {
            qdlVar.qdl(iQdl, message);
        }
        lnrVar.qdl(iQdl);
        lnrVar.lnr(10);
        lnrVar.ud(message);
        com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("get_ad", mmlVar.mml(), iQdl, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x0124 A[Catch: all -> 0x0058, Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:58:0x011c, B:60:0x0124, B:62:0x012a, B:64:0x0137, B:66:0x0148, B:65:0x0140, B:67:0x014b), top: B:88:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x012a A[Catch: all -> 0x0058, Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:58:0x011c, B:60:0x0124, B:62:0x012a, B:64:0x0137, B:66:0x0148, B:65:0x0140, B:67:0x014b), top: B:88:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: all -> 0x0058, Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:58:0x011c, B:60:0x0124, B:62:0x012a, B:64:0x0137, B:66:0x0148, B:65:0x0140, B:67:0x014b), top: B:88:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0140 A[Catch: all -> 0x0058, Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:58:0x011c, B:60:0x0124, B:62:0x012a, B:64:0x0137, B:66:0x0148, B:65:0x0140, B:67:0x014b), top: B:88:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:9:0x0027, B:11:0x0042, B:13:0x004c, B:16:0x005b, B:18:0x0061, B:20:0x006a, B:22:0x007e, B:24:0x008b, B:26:0x0092, B:28:0x00a3, B:27:0x009c, B:30:0x00ac, B:32:0x00b0, B:34:0x00b9, B:37:0x00c1, B:39:0x00cc, B:41:0x00d0, B:42:0x00d5, B:58:0x011c, B:60:0x0124, B:62:0x012a, B:64:0x0137, B:66:0x0148, B:65:0x0140, B:73:0x018a, B:75:0x01a3, B:76:0x01aa, B:78:0x01b2, B:81:0x01c0), top: B:90:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar, boolean z2, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.mrf mrfVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar2, oth.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, int i2) {
        int i3;
        byte b2;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        JSONObject jSONObject;
        long jQdl;
        com.bytedance.sdk.openadsdk.utils.mrf mrfVar2;
        boolean zDps;
        int iLnr;
        Map<String, com.bytedance.sdk.openadsdk.core.model.ljh> mapQdl;
        com.bytedance.sdk.openadsdk.core.model.kdv kdvVar;
        com.bytedance.sdk.openadsdk.core.model.lnr lnrVar3 = lnrVar2;
        oth.qdl qdlVar2 = qdlVar;
        if (z2) {
            map.put("pgad_end", mrfVar);
        }
        if (udVar == null) {
            return;
        }
        if (udVar.mo()) {
            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.11
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarI = Z.i("get_ad");
                    qdlVarI.lnr(adSlot.getCodeId());
                    qdlVarI.mml(com.bytedance.sdk.openadsdk.utils.gy.lnr(adSlot.getDurationSlotType()));
                    qdlVarI.qdl(BuildConfig.VERSION_NAME);
                    return qdlVarI;
                }
            });
            try {
                com.bytedance.sdk.openadsdk.utils.mrf mrfVarUd = com.bytedance.sdk.openadsdk.utils.mrf.ud();
                String strMml = udVar.mml();
                lnrVar3.qdl(strMml);
                JSONObject jSONObject2 = new JSONObject(strMml);
                if (yt.mml().car() && kdv.qdl().mml() == 1) {
                    com.bytedance.sdk.openadsdk.utils.gy.qdl("Pangle_Debug_Mode", jSONObject2.toString(), this.qdl);
                }
                JSONObject jSONObjectQdl = qdl(jSONObject2);
                if (jSONObjectQdl == null) {
                    lnrVar3.lnr(12);
                    qdl(qdlVar2, lnrVar3);
                    return;
                }
                qdl qdlVarQdl = qdl.qdl(jSONObjectQdl, adSlot, bqtVar);
                lnrVar3.qdl(qdlVarQdl.to);
                fs.qdl(qdlVarQdl.tvp);
                int i4 = qdlVarQdl.mml;
                if (i4 != 20000) {
                    lnrVar3.qdl(i4);
                    if (!yt.mml().ax() && qdlVarQdl.mml == 40029) {
                        qdlVar2.qdl(-100, jpc.qdl(-100));
                    } else {
                        qdlVar2.qdl(qdlVarQdl.mml, qdlVarQdl.mzz);
                    }
                    lnrVar3.lnr(9);
                    com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar3);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.qdl qdlVar3 = qdlVarQdl.jpc;
                if (qdlVar3 == null) {
                    lnrVar3.lnr(13);
                    qdl(qdlVar2, lnrVar3);
                    return;
                }
                if (qdl(qdlVar3, qdlVar2)) {
                    return;
                }
                qdlVarQdl.jpc.lnr(strMml);
                com.bytedance.sdk.openadsdk.utils.mrf mrfVarUd2 = com.bytedance.sdk.openadsdk.utils.mrf.ud();
                if (bqtVar != null && (kdvVar = bqtVar.rq) != null) {
                    kdvVar.qdl(mrfVar, mrfVarUd, qdlVarQdl.qdl, mrfVarUd2);
                }
                if (com.bytedance.sdk.openadsdk.jyq.qdl.mml()) {
                    i3 = i2;
                    if (i3 == 1) {
                        b2 = true;
                    }
                    if (b2 != false) {
                        try {
                            if (qdlVarQdl.jpc.mml() != null && !qdlVarQdl.jpc.mml().isEmpty()) {
                                ljhVar = qdlVarQdl.jpc.mml().get(0);
                                String strLnr = com.bytedance.sdk.openadsdk.utils.gy.lnr(i3);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject = new JSONObject();
                                jQdl = 0;
                                if (bqtVar != null) {
                                    try {
                                        mrfVar2 = bqtVar.to;
                                        if (mrfVar2.qdl > 0) {
                                            jQdl = mrfVarUd2.qdl(mrfVar2);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (ljhVar != null) {
                                    zDps = ljhVar.dps();
                                    jSONObject.put("is_new_engine", zDps ? 1 : 0);
                                    if (zDps) {
                                        iLnr = com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().mml();
                                    } else {
                                        iLnr = com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().lnr();
                                    }
                                    jSONObject.put("webview_cache_size", iLnr);
                                }
                                qdl(udVar.wd(), bqtVar, mrfVar, mrfVarUd, qdlVarQdl.qdl, mrfVarUd2, ljhVar, strLnr, jSONObject, true);
                                jSONObject3.put("duration", jQdl);
                                jSONObject3.put("extra_data", jSONObject);
                                jSONObject3.put("tag", strLnr);
                                jSONObject3.put("callback_start", mrfVarUd2.qdl());
                                qdlVarQdl.jpc.qdl(jSONObject3);
                            }
                        } catch (Throwable th) {
                            th = th;
                            lnrVar3 = lnrVar2;
                            qdlVar2 = qdlVar;
                            com.bytedance.sdk.component.utils.aaj.qdl("NetApiImpl", "get ad error: ", th);
                            lnrVar3.ud(th.getMessage());
                            lnrVar3.lnr(14);
                            qdl(qdlVar2, lnrVar3);
                            com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("get_ad", lnrVar.mml(), -9, th.getMessage());
                            ApmHelper.reportCustomError("", "parse_error", th);
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVarQdl.jpc);
                    qdlVar.qdl(qdlVarQdl.jpc, lnrVar2);
                    ud(qdlVarQdl.jpc);
                    com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(qdlVarQdl.jpc);
                    mapQdl = com.bytedance.sdk.openadsdk.core.model.qdl.qdl(qdlVarQdl.jpc);
                    if (mapQdl != null) {
                        com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(mapQdl);
                    }
                    if (qdlVarQdl.jpc.mml() != null || qdlVarQdl.jpc.mml().isEmpty() || b2 == true) {
                        return;
                    }
                    qdl(udVar.wd(), bqtVar, mrfVar, mrfVarUd, qdlVarQdl.qdl, mrfVarUd2, qdlVarQdl.jpc.mml().get(0), com.bytedance.sdk.openadsdk.utils.gy.lnr(i2));
                    return;
                }
                i3 = i2;
                b2 = false;
                if (b2 != false) {
                    if (qdlVarQdl.jpc.mml() != null) {
                        ljhVar = qdlVarQdl.jpc.mml().get(0);
                        String strLnr2 = com.bytedance.sdk.openadsdk.utils.gy.lnr(i3);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject = new JSONObject();
                        jQdl = 0;
                        if (bqtVar != null) {
                            mrfVar2 = bqtVar.to;
                            if (mrfVar2.qdl > 0) {
                                jQdl = mrfVarUd2.qdl(mrfVar2);
                            }
                        }
                        if (ljhVar != null) {
                            zDps = ljhVar.dps();
                            jSONObject.put("is_new_engine", zDps ? 1 : 0);
                            if (zDps) {
                                iLnr = com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().mml();
                            } else {
                                iLnr = com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().lnr();
                            }
                            jSONObject.put("webview_cache_size", iLnr);
                        }
                        qdl(udVar.wd(), bqtVar, mrfVar, mrfVarUd, qdlVarQdl.qdl, mrfVarUd2, ljhVar, strLnr2, jSONObject, true);
                        jSONObject4.put("duration", jQdl);
                        jSONObject4.put("extra_data", jSONObject);
                        jSONObject4.put("tag", strLnr2);
                        jSONObject4.put("callback_start", mrfVarUd2.qdl());
                        qdlVarQdl.jpc.qdl(jSONObject4);
                    }
                }
                com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(qdlVarQdl.jpc);
                qdlVar.qdl(qdlVarQdl.jpc, lnrVar2);
                ud(qdlVarQdl.jpc);
                com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(qdlVarQdl.jpc);
                mapQdl = com.bytedance.sdk.openadsdk.core.model.qdl.qdl(qdlVarQdl.jpc);
                if (mapQdl != null) {
                    com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(mapQdl);
                }
                if (qdlVarQdl.jpc.mml() != null) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.12
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarI = Z.i("get_ad");
                    qdlVarI.lnr(adSlot.getCodeId());
                    qdlVarI.mml(com.bytedance.sdk.openadsdk.utils.gy.lnr(adSlot.getDurationSlotType()));
                    qdlVarI.qdl(BuildConfig.VERSION_NAME);
                    return qdlVarI;
                }
            });
            int iQdl = udVar.qdl();
            String strUd = udVar.ud();
            qdlVar2.qdl(iQdl, strUd);
            lnrVar3.qdl(iQdl);
            lnrVar3.lnr(11);
            lnrVar3.ud(strUd);
            com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar3);
            com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("get_ad", lnrVar.mml(), iQdl, strUd);
        }
    }

    private void ud(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        List<com.bytedance.sdk.openadsdk.core.model.ljh> listMml = qdlVar.mml();
        if (listMml == null || listMml.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < listMml.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = listMml.get(i2);
            if (ljhVar != null && ljhVar.gt() == null) {
                qdl("", 0, 0, ljhVar.hcs(), ljhVar);
                qdl("", 0, 0, ljhVar.kj(), ljhVar);
                List<com.bytedance.sdk.openadsdk.core.model.jl> listVm = ljhVar.vm();
                if (listVm != null && listVm.size() > 0) {
                    for (int i3 = 0; i3 < listVm.size(); i3++) {
                        qdl(ljhVar, listVm.get(i3));
                    }
                }
                if (ljhVar.tdy() != null) {
                    qdl(ljhVar.tdy().to(), ljhVar.tdy().lnr(), ljhVar.tdy().ud(), (com.bytedance.sdk.openadsdk.core.model.jl) null, ljhVar);
                }
            }
        }
    }

    @DungeonFlag
    private JSONObject ud(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put("gaid", com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", qdl(list));
            jSONObject3.put("dislike_source", str3);
            if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().sy() && jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.qdl.qdl(jSONObject).toString());
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

    /* JADX WARN: Code duplicated, block: B:11:0x0081 A[Catch: JSONException -> 0x00b1, TryCatch #0 {JSONException -> 0x00b1, blocks: (B:3:0x0005, B:9:0x0047, B:11:0x0081, B:23:0x00a3, B:8:0x0030, B:5:0x002a), top: B:26:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    /* JADX WARN: Code duplicated, block: B:15:0x0096  */
    /* JADX WARN: Code duplicated, block: B:17:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    @DungeonFlag
    private JSONObject ud() {
        int i2;
        int rotation;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", tvp.ud().mml());
            jSONObject.put("name", tvp.ud().jpc());
            mo(jSONObject);
            Context contextQdl = yt.qdl();
            String packageResourcePath = "";
            if (contextQdl != null) {
                try {
                    packageResourcePath = contextQdl.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                i2 = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.ud.wd());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - rdp.qdl()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.to());
                jSONObject.put("is_init", rdp.mzz() ? 1 : 0);
                if (contextQdl != null) {
                    rotation = ((WindowManager) contextQdl.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i2 = 1;
                    } else if (rotation != 1) {
                        i2 = 3;
                    } else if (rotation != 2) {
                        i2 = 2;
                    } else if (rotation != 3) {
                        i2 = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i2));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                i2 = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.ud.wd());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - rdp.qdl()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.to());
                jSONObject.put("is_init", rdp.mzz() ? 1 : 0);
                if (contextQdl != null) {
                    rotation = ((WindowManager) contextQdl.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i2 = 1;
                    } else if (rotation != 1) {
                        i2 = 3;
                    } else if (rotation != 2) {
                        i2 = 2;
                    } else if (rotation != 3) {
                        i2 = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i2));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static String ud(AdSlot adSlot) {
        String strExu = tvp.ud().exu();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strExu)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strExu)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strExu);
                        int length2 = jSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
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
        return strExu;
    }

    private boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, oth.qdl qdlVar2) {
        if (qdlVar == null) {
            qdlVar2.qdl(40053, jpc.qdl(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.ljh> listMml = qdlVar.mml();
        if (listMml.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.ljh ljhVar : listMml) {
            if (TextUtils.isEmpty(ljhVar.rjh().ud()) || TextUtils.isEmpty(ljhVar.rjh().lnr())) {
                qdlVar2.qdl(40053, jpc.qdl(40053));
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar), "material_error", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.ljh.13
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", ljhVar.rjh().mo());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static String ud(int i2, String str) {
        Object obj;
        if (i2 == 3) {
            return com.bytedance.sdk.component.utils.qdl.lnr(str);
        }
        if (i2 == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                uw.qdl(true);
                return str2;
            }
            uw.qdl(false);
            uw.qdl(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private void qdl(String str, int i2, int i3, com.bytedance.sdk.openadsdk.core.model.jl jlVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.tvp.mml.qdl(str).qdl(i2).ud(i3).mzz(ax.mzz(yt.qdl())).mml(ax.lnr(yt.qdl())).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, str, null), 4);
        } else {
            if (jlVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.tvp.mml.qdl(jlVar).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, jlVar.qdl(), null), 4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public com.bytedance.sdk.openadsdk.mml.mzz ud(JSONObject jSONObject) {
        int i2;
        boolean z2;
        boolean z3;
        String strUd = "error unknown";
        System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.wd.qdl() || !yt.mml().mlb() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
        boolean z4 = false;
        int iQdl = 0;
        try {
            JSONObject jSONObjectQdl = qdl(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            mmlVarUd.qdl(jSONObjectQdl.toString(), yt.mml().jl());
            mmlVarUd.ud(com.bytedance.sdk.openadsdk.utils.gy.mml("/api/ad/union/sdk/stats/batch/"));
            qdl(mmlVarUd, jSONObjectQdl);
            mmlVarUd.ud(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.gy.mml());
            if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().jnw()) {
                mmlVarUd.ud("_disable_retry", "1");
            }
            com.bytedance.sdk.component.wd.ud udVarQdl = mmlVarUd.qdl();
            try {
                if (udVarQdl == null) {
                    return new com.bytedance.sdk.openadsdk.mml.mzz(false, 0, "error unknown", false);
                }
                if (!udVarQdl.mo() || TextUtils.isEmpty(udVarQdl.mml())) {
                    z3 = false;
                    z2 = false;
                } else {
                    JSONObject jSONObject2 = new JSONObject(udVarQdl.mml());
                    int iOptInt = jSONObject2.optInt("code", -1);
                    strUd = jSONObject2.optString("data", "");
                    z2 = true;
                    z3 = iOptInt == 20000;
                    if (iOptInt != 60005) {
                        z2 = false;
                    }
                }
                try {
                    iQdl = udVarQdl.qdl();
                    if (!udVarQdl.mo()) {
                        strUd = udVarQdl.ud();
                        com.bytedance.sdk.openadsdk.utils.jyq.qdl(mmlVarUd.mml());
                    }
                } catch (Throwable unused) {
                    i2 = iQdl;
                    z4 = z3;
                    z3 = z4;
                    iQdl = i2;
                }
                return new com.bytedance.sdk.openadsdk.mml.mzz(z3, iQdl, strUd, z2);
            } catch (Throwable unused2) {
                i2 = 0;
                z2 = false;
            }
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.mml.mzz(false, 0, "error unknown", false);
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.openadsdk.core.model.jl jlVar) {
        if (jlVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.tvp.mml.qdl(jlVar).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, jlVar.qdl(), new com.bytedance.sdk.component.mzz.jtx() { // from class: com.bytedance.sdk.openadsdk.core.ljh.14
            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(int i2, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
            }
        }), 4);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private void qdl(com.bytedance.sdk.component.ud.qdl.to toVar, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, com.bytedance.sdk.openadsdk.utils.mrf mrfVar, com.bytedance.sdk.openadsdk.utils.mrf mrfVar2, int i2, com.bytedance.sdk.openadsdk.utils.mrf mrfVar3, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str) {
        com.bytedance.sdk.openadsdk.utils.mrf mrfVar4;
        if (yt.mml().dk()) {
            JSONObject jSONObject = new JSONObject();
            long jQdl = 0;
            if (bqtVar != null) {
                try {
                    com.bytedance.sdk.openadsdk.utils.mrf mrfVar5 = bqtVar.to;
                    if (mrfVar5.qdl > 0) {
                        mrfVar4 = mrfVar3;
                        jQdl = mrfVar4.qdl(mrfVar5);
                    } else {
                        mrfVar4 = mrfVar3;
                    }
                } catch (Exception unused) {
                    return;
                }
            } else {
                mrfVar4 = mrfVar3;
            }
            long j = jQdl;
            qdl(toVar, bqtVar, mrfVar, mrfVar2, i2, mrfVar4, ljhVar, str, jSONObject, false);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "load_ad_time", j, jSONObject);
        }
    }

    private static void qdl(com.bytedance.sdk.component.ud.qdl.to toVar, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar, com.bytedance.sdk.openadsdk.utils.mrf mrfVar, com.bytedance.sdk.openadsdk.utils.mrf mrfVar2, int i2, com.bytedance.sdk.openadsdk.utils.mrf mrfVar3, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, JSONObject jSONObject, boolean z2) throws JSONException {
        if (bqtVar != null) {
            com.bytedance.sdk.openadsdk.utils.mrf mrfVar4 = bqtVar.to;
            if (mrfVar4.qdl > 0) {
                jSONObject.put("client_start_time", mrfVar.qdl(mrfVar4));
            }
        }
        jSONObject.put("network_time", mrfVar2.qdl(mrfVar));
        jSONObject.put("sever_time", i2);
        jSONObject.put("client_end_time", mrfVar3.qdl(mrfVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", ljhVar.xmv() ? 1 : 0);
        }
        if (ljhVar != null) {
            jSONObject.put("render_control_type", ljhVar.dk());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().lnr());
        jSONObject.put("sync_barrier_open", z2 ? 1 : 0);
        long j = toVar.ud;
        if (j > 0) {
            jSONObject.put("enqueue_2_run_ts", toVar.lnr - j);
            jSONObject.put("run_2_connect_end_ts", toVar.mzz - toVar.ud);
            jSONObject.put("connect_end_2_response_end_ts", toVar.mo - toVar.mzz);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - toVar.mo);
        }
    }

    public static JSONArray ud(String str) {
        try {
            Set<String> setUd = com.bytedance.sdk.component.adexpress.qdl.ud.ud.ud(str);
            if (setUd != null && setUd.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setUd.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.qdl.lnr.ud udVarQdl = com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl(it.next());
                    if (udVarQdl != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", udVarQdl.ud());
                        jSONObject.put("md5", udVarQdl.lnr());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.aaj.qdl("NetApiImpl", "getParentTplIds: ", e2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.mml.mzz qdl(JSONObject jSONObject, String str, boolean z2) {
        Object obj;
        try {
            System.currentTimeMillis();
            byte[] bArr = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
                return null;
            }
            com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
            mmlVarUd.ud(str);
            if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().jut()) {
                mmlVarUd.ud("_disable_retry", "1");
            }
            boolean z3 = true;
            if (z2) {
                com.bytedance.sdk.openadsdk.core.settings.rq rqVarLnr = com.bytedance.sdk.openadsdk.core.settings.rq.lnr();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean zQdl = rqVarLnr.qdl(cryptDataScene);
                byte[] bArrMzz = mzz(jSONObject.toString());
                if (zQdl) {
                    Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bArrMzz);
                    if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        bArr = (byte[]) obj;
                        uw.ud(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        uw.ud(false);
                        uw.qdl(1, cryptDataScene, iIntValue);
                    }
                }
                if (bArr != null) {
                    mmlVarUd.ud("Content-Encoding", "union_sdk_encode");
                    mmlVarUd.ud("x-pgli18n", "4");
                    mmlVarUd.qdl("application/octet-stream;tt-data=a", bArr);
                }
            }
            if (bArr == null) {
                try {
                    JSONObject jSONObjectQdl = com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
                    if (!lnr(jSONObjectQdl)) {
                        jSONObjectQdl = jSONObject;
                    }
                    qdl(mml(jSONObjectQdl), mmlVarUd);
                    mmlVarUd.qdl(jSONObjectQdl.toString(), yt.mml().jl());
                } catch (OutOfMemoryError e2) {
                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e2.toString());
                    return new com.bytedance.sdk.openadsdk.mml.mzz(false, -2, "encrypt_error", false);
                }
            }
            com.bytedance.sdk.component.wd.ud udVarQdl = mmlVarUd.qdl();
            boolean zMzz = (udVarQdl == null || !udVarQdl.mo() || TextUtils.isEmpty(udVarQdl.mml())) ? false : mzz(new JSONObject(udVarQdl.mml()));
            String strUd = "error unknown";
            int iQdl = udVarQdl != null ? udVarQdl.qdl() : 0;
            if (!zMzz && iQdl == 200) {
                strUd = "server say not success";
            } else {
                if (udVarQdl != null && udVarQdl.ud() != null) {
                    strUd = udVarQdl.ud();
                }
                z3 = false;
            }
            if (udVarQdl == null) {
                com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("applog", str, -1, "response is null");
            } else if (!udVarQdl.mo()) {
                com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("applog", str, iQdl, udVarQdl.ud());
            }
            qdl(jSONObject, z2);
            return new com.bytedance.sdk.openadsdk.mml.mzz(zMzz, iQdl, strUd, z3);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.mml.mzz(false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "service_busy", false);
        }
    }

    private void qdl(Map<String, String> map, com.bytedance.sdk.component.wd.ud.mml mmlVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    mmlVar.ud(entry.getKey(), entry.getValue());
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", "ADD header exceptopn", e2.getMessage());
                }
            }
        }
        try {
            mmlVar.ud(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.gy.mml());
        } catch (Exception e3) {
            com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", "ADD header exceptopn", e3.getMessage());
        }
    }

    private void qdl(JSONObject jSONObject, boolean z2) throws Throwable {
        Object obj;
        if (tvp.ud().jl()) {
            try {
                jSONObject.getJSONObject(g.f39716B).put(fl.SESSION_HISTORY_KEY_AD_ID, "4562");
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", "reportETEvent error", e2.getMessage());
            }
            com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
            mmlVarUd.ud(com.bytedance.sdk.openadsdk.utils.gy.jyq());
            byte[] bArr = null;
            if (z2) {
                com.bytedance.sdk.openadsdk.core.settings.rq rqVarLnr = com.bytedance.sdk.openadsdk.core.settings.rq.lnr();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean zQdl = rqVarLnr.qdl(cryptDataScene);
                byte[] bArrMzz = mzz(jSONObject.toString());
                if (zQdl) {
                    Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bArrMzz);
                    if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        bArr = (byte[]) obj;
                        uw.ud(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        uw.ud(false);
                        uw.qdl(1, cryptDataScene, iIntValue);
                    }
                }
                if (bArr != null) {
                    mmlVarUd.ud("Content-Encoding", "union_sdk_encode");
                    mmlVarUd.ud("x-pgli18n", "4");
                    mmlVarUd.qdl("application/octet-stream;tt-data=a", bArr);
                }
            }
            if (bArr == null) {
                JSONObject jSONObjectQdl = com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
                if (lnr(jSONObjectQdl)) {
                    jSONObject = jSONObjectQdl;
                }
                qdl(mml(jSONObject), mmlVarUd);
                mmlVarUd.qdl(jSONObject.toString(), yt.mml().jl());
            }
            mmlVarUd.qdl(7);
            mmlVarUd.qdl("et_applog");
            mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.ljh.15
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                    if (udVar == null || !udVar.mo()) {
                        return;
                    }
                    udVar.mml();
                }

                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public void qdl(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObjectUd;
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl() && (jSONObjectUd = ud(str, list, jSONObject, str2, str3)) != null) {
            com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
            final String strMml = com.bytedance.sdk.openadsdk.utils.gy.mml("/api/ad/union/dislike_event/");
            JSONObject jSONObjectQdl = qdl(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectUd);
            String string = jSONObjectQdl != null ? jSONObjectQdl.toString() : null;
            qdl(mmlVarUd, jSONObjectQdl);
            mmlVarUd.ud(strMml);
            mmlVarUd.mml(string);
            mmlVarUd.qdl(7);
            mmlVarUd.qdl("dislike");
            com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.2
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("dislike");
                }
            });
            mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.ljh.3
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                    if (udVar == null) {
                        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("dislike", strMml, -1, "response is null");
                        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.3.3
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("dislike");
                            }
                        });
                    } else if (udVar.mo()) {
                        com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.3.1
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("dislike");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.3.2
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("dislike");
                            }
                        });
                        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("dislike", strMml, udVar.qdl(), udVar.ud());
                    }
                }

                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                    com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("dislike", strMml, -1, iOException != null ? iOException.getMessage() : AbstractJsonLexerKt.NULL);
                    if (lnrVar != null) {
                        com.bytedance.sdk.openadsdk.utils.jyq.qdl(lnrVar.mml());
                    }
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.3.4
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i("dislike");
                        }
                    });
                }
            });
            try {
                String strOptString = new JSONObject(str).optString("cid", "");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("dislike", strOptString, (String) null, (String) null);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.aaj.lnr(e2.getMessage(), new Object[0]);
            }
        }
    }

    private static JSONObject qdl(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(cryptDataScene)) {
            JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new bch(cryptDataScene));
            uw.qdl(jSONObjectEncryptType4);
            return jSONObjectEncryptType4;
        }
        return com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
    }

    private JSONArray qdl(List<FilterWord> list) {
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

    private void qdl(oth.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
        qdlVar.qdl(-1, jpc.qdl(-1));
        lnrVar.qdl(-1);
        com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(oth.ud udVar) {
        udVar.qdl(-1, jpc.qdl(-1));
    }

    public static JSONObject qdl(AdSlot adSlot) {
        bqt bqtVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", yt.mml().zlt());
            jSONObject.put("lmt", DeviceUtils.lnr());
            jSONObject.put("gdpr", tvp.ud().to());
            jSONObject.put("pa_consent", tvp.ud().rq());
            jSONObject.put("is_gdpr_user", yt.mml().irn());
            if (adSlot != null && bqt.qdl.containsKey(Integer.valueOf(adSlot.getCodeId())) && (bqtVar = bqt.qdl.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", bqtVar.ud());
                jSONObject.put("lastbundle", bqtVar.lnr());
                jSONObject.put("lastclick", bqtVar.mml());
                jSONObject.put("lastskip", bqtVar.mzz());
            }
            qdl(jSONObject, "data", ud(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void qdl(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject qdl(AdSlot adSlot, int i2, com.bytedance.sdk.openadsdk.core.model.bqt bqtVar) {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i2);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (bqtVar != null) {
                jSONObject.put("render_method", bqtVar.tvp);
                int i3 = bqtVar.tvp;
                if (i3 == 1) {
                    qdl(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i3 == 2) {
                    qdl(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                qdl(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", ud(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", lnr(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", lnr(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i2));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i2 == 1 || i2 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (bqtVar != null && (obj2 = bqtVar.wd) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (bqtVar != null && (obj = bqtVar.jpc) != null) {
                jSONObject.put("common_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i2 == 7 || i2 == 8) {
                adCount = 1;
            }
            if (bqtVar != null && bqtVar.mzz != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i2 == 1) {
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

    private void qdl(JSONObject jSONObject, String str, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i2);
            jSONObject2.put("height", i3);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void qdl(JSONObject jSONObject, String str, float f, float f2) {
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

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public void qdl(JSONObject jSONObject, final oth.ud udVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            if (udVar != null) {
                udVar.qdl(1000, "Ad request is temporarily paused, Please contact your AM");
            }
        } else {
            if (jSONObject == null || udVar == null) {
                return;
            }
            JSONObject jSONObjectQdl = qdl(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
            try {
                mmlVarUd.ud(com.bytedance.sdk.openadsdk.jpc.mml.qdl(mmlVarUd, com.bytedance.sdk.openadsdk.utils.gy.mml("/api/ad/union/sdk/reward_video/reward/")));
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e2.getMessage());
            }
            qdl(mmlVarUd, jSONObjectQdl);
            mmlVarUd.mml(jSONObjectQdl != null ? jSONObjectQdl.toString() : "");
            mmlVarUd.qdl(10);
            mmlVarUd.qdl("reward");
            com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.4
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("reward");
                }
            });
            mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.ljh.5
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar2) {
                    if (udVar2 == null) {
                        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.5.3
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("reward");
                            }
                        });
                        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("reward", lnrVar.mml(), -1, "response is null");
                        ljh.this.qdl(udVar);
                        return;
                    }
                    if (!udVar2.mo() || TextUtils.isEmpty(udVar2.mml())) {
                        String strQdl = jpc.qdl(-2);
                        int iQdl = udVar2.qdl();
                        if (!udVar2.mo() && !TextUtils.isEmpty(udVar2.ud())) {
                            strQdl = udVar2.ud();
                        }
                        udVar.qdl(iQdl, strQdl);
                        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.5.2
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("reward");
                            }
                        });
                        if (udVar2.mo()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("reward", lnrVar.mml(), iQdl, strQdl);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(udVar2.mml());
                        String strUd = ljh.ud(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strUd)) {
                            try {
                                jSONObject2 = new JSONObject(strUd);
                            } catch (Throwable unused) {
                            }
                        }
                        ud udVarQdl = ud.qdl(jSONObject2);
                        int i2 = udVarQdl.qdl;
                        if (i2 != 20000) {
                            udVar.qdl(i2, jpc.qdl(i2));
                        } else if (udVarQdl.lnr == null) {
                            ljh.this.qdl(udVar);
                        } else {
                            udVar.qdl(udVarQdl);
                            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.5.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    return Z.i("reward");
                                }
                            });
                        }
                    } catch (JSONException e3) {
                        com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", e3.getMessage());
                        ljh.this.qdl(udVar);
                    }
                }

                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                    String message;
                    if (iOException != null) {
                        message = iOException.getMessage();
                    } else {
                        message = "";
                    }
                    udVar.qdl(-2, message);
                    if (lnrVar != null) {
                        String strMml = lnrVar.mml();
                        com.bytedance.sdk.openadsdk.utils.jyq.qdl(strMml);
                        com.bytedance.sdk.openadsdk.bjy.qdl.mzz.qdl("reward", strMml, -1, message);
                    }
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ljh.5.4
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            return Z.i("reward");
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public JSONObject qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strUd = ud(iOptInt, strOptString);
            if (TextUtils.isEmpty(strUd)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strUd);
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

    private void qdl(com.bytedance.sdk.component.wd.ud.mml mmlVar, JSONObject jSONObject) {
        try {
            if (lnr(jSONObject) && jSONObject.optInt("cypher") == 4) {
                mmlVar.ud("x-pgli18n", "4");
                mmlVar.ud("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdl() {
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarQdl = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("tpl_fetch_model", "date", 0L);
        String strWak = yt.mml().wak();
        String strUd = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("tpl_fetch_model", g.x, "");
        if (jCurrentTimeMillis <= yt.mml().mrf() && jCurrentTimeMillis >= 0 && TextUtils.equals(strWak, strUd)) {
            String strUd2 = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strUd2)) {
                    return com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.mzz(strUd2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
            String strQdl = com.bytedance.sdk.openadsdk.jpc.mml.qdl(udVarLnr, strWak);
            udVarLnr.ud(strQdl);
            com.bytedance.sdk.component.wd.ud udVarQdl = udVarLnr.qdl();
            if (udVarQdl == null || !udVarQdl.mo()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(udVarQdl.mml());
            jSONObject.put("template_fetch_url", strQdl);
            qdlVarQdl = com.bytedance.sdk.component.adexpress.qdl.lnr.qdl.qdl(jSONObject);
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("tpl_fetch_model", g.x, strWak);
            return qdlVarQdl;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("NetApiImpl", th.getMessage());
            return qdlVarQdl;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public void qdl(String str) {
        com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
        udVarLnr.ud(str);
        udVarLnr.qdl("upload_bidding");
        udVarLnr.qdl(7);
        udVarLnr.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.ljh.6
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                udVar.mml();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.oth
    public void qdl(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.wd.ud.mml mmlVarUd = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().ud();
        mmlVarUd.ud(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        mmlVarUd.ud("cypher", (String) pairGenerateRequestHeader.first);
        mmlVarUd.ud("transfer-param", (String) pairGenerateRequestHeader.second);
        mmlVarUd.ud("x-pangle-target-idc", yt.mml().ca());
        mmlVarUd.qdl(jSONObject);
        mmlVarUd.qdl(5);
        mmlVarUd.qdl("apm_pv");
        mmlVarUd.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.ljh.7
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) {
                udVar.mml();
            }
        });
    }
}
