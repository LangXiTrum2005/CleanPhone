package com.bytedance.sdk.openadsdk.ka.fi.ri;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import canonical.attabal;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ory;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ka.fi.lr.aw;
import com.bytedance.sdk.openadsdk.ka.fi.lr.bgr;
import com.bytedance.sdk.openadsdk.ka.fi.lr.di;
import com.bytedance.sdk.openadsdk.ka.fi.lr.fi;
import com.bytedance.sdk.openadsdk.ka.fi.lr.lr;
import com.bytedance.sdk.openadsdk.ka.fi.lr.mj;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import com.bytedance.sdk.openadsdk.ka.xha;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.su;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static final Map<attabal, vr> ri = Collections.synchronizedMap(new WeakHashMap());

    public static void fi(attabal attabalVar, vr.ri riVar) {
        vr vrVar;
        if (attabalVar == null || riVar == null || riVar.qt() <= 0 || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jKa = riVar.ka();
        aw awVar = new aw();
        awVar.ri(riVar.ik());
        awVar.lr(jKa);
        awVar.ri(riVar.qt());
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(awVar);
        riVarRi.ri(riVar.sf());
        ri(riVarRi, "play_buffer");
    }

    public static void ik(attabal attabalVar, vr.ri riVar) {
        vr vrVar;
        if (attabalVar == null || riVar == null || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jLr = riVar.lr();
        long jKa = riVar.ka();
        bgr bgrVar = new bgr(riVar.aw());
        bgrVar.ri(riVar.ik());
        bgrVar.lr(jKa);
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(bgrVar);
        riVarRi.ri(riVar.sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jLr);
            jSONObject.put("percent", riVar.xha());
            ri(riVarRi, "play_error", jSONObject);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
    }

    public static void ka(attabal attabalVar, vr.ri riVar) {
        vr vrVar;
        if (attabalVar == null || riVar == null || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jLr = riVar.lr();
        long jKa = riVar.ka();
        lr lrVar = new lr();
        lrVar.ri(riVar.ik());
        lrVar.lr(jKa);
        lrVar.ri(riVar.fi());
        lrVar.lr(riVar.di());
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(lrVar);
        riVarRi.ri(riVar.sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jLr);
            jSONObject.put("percent", riVar.xha());
            ri(riVarRi, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
        ri.remove(attabalVar);
    }

    public static void lr(com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar) {
        ka.ri("load_video_cancel", riVar);
    }

    public static com.bytedance.sdk.openadsdk.ka.fi.lr.ri ri(wjv wjvVar, String str, int i, ik ikVar) {
        return ri(wjvVar, str, i, ikVar, null);
    }

    public static void lr(attabal attabalVar, vr.ri riVar) {
        vr vrVar;
        if (attabalVar == null || riVar == null || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jLr = riVar.lr();
        long jKa = riVar.ka();
        if (jKa <= 0 || jLr <= 0) {
            return;
        }
        fi fiVar = new fi();
        fiVar.ri(riVar.ik());
        fiVar.lr(jKa);
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(fiVar);
        riVarRi.ri(riVar.sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jLr);
            jSONObject.put("percent", riVar.xha());
            ri(riVarRi, "feed_continue", jSONObject);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x005a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x006a A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0076 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: JSONException -> 0x0012, TryCatch #0 {JSONException -> 0x0012, blocks: (B:4:0x0008, B:8:0x0016, B:10:0x001c, B:11:0x004d, B:13:0x005a, B:15:0x006a, B:16:0x0070, B:18:0x0076, B:19:0x007b), top: B:24:0x0008 }] */
    public static com.bytedance.sdk.openadsdk.ka.fi.lr.ri ri(wjv wjvVar, String str, int i, ik ikVar, vr.ri riVar) {
        com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVarEu;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = null;
        if (i > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i));
                if (wjvVar != null) {
                    attabalVarEu = wjvVar.eu();
                    if (attabalVarEu != null) {
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, attabalVarEu.arytenoidectomy());
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(attabalVarEu.taiyuan()));
                        jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, attabalVarEu.supplicat());
                        jSONObject.put("player_type", ikVar.nr());
                        jSONObject.put("video_encode_type", ikVar.bgr() ? 1 : 0);
                    }
                    jSONObject.put("play_time", ikVar.fi);
                    jSONObject2 = ikVar.ri() ? new JSONObject(ikVar.ik().toString()) : null;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject2.put("session_id", str);
                    }
                    jSONObject.put("dp_creative_type", wjvVar.yv());
                }
            } catch (JSONException e) {
                ac.ri("TTAD.VideoEventManager", "", e);
            }
        } else if (wjvVar != null) {
            attabalVarEu = wjvVar.eu();
            if (attabalVarEu != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, attabalVarEu.arytenoidectomy());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(attabalVarEu.taiyuan()));
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, attabalVarEu.supplicat());
                jSONObject.put("player_type", ikVar.nr());
                jSONObject.put("video_encode_type", ikVar.bgr() ? 1 : 0);
            }
            jSONObject.put("play_time", ikVar.fi);
            if (ikVar.ri()) {
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", wjvVar.yv());
        }
        return new com.bytedance.sdk.openadsdk.ka.fi.lr.ri(wjvVar, ig.ri(wjvVar), jSONObject, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long ik(ik ikVar) {
        if (ikVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVarAy = ikVar.bgr() ? ikVar.ay() : ikVar.wjv();
        if (attabalVarAy != null) {
            return Double.valueOf(attabalVarAy.beachfront() * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void lr(attabal attabalVar, vr.ri riVar, xha xhaVar) {
        if (attabalVar == null || riVar == null) {
            return;
        }
        fi(attabalVar, riVar);
        vr vrVar = ri.get(attabalVar);
        if (vrVar == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jLr = riVar.lr();
        long jKa = riVar.ka();
        di diVar = new di(ikVarKa);
        diVar.lr(riVar.ik());
        diVar.ri(jKa);
        diVar.ri(riVar.jbs());
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(diVar);
        JSONObject jSONObjectKa = riVarRi.ka();
        ri(riVar, wjvVarFi, jSONObjectKa);
        riVarRi.ri(riVar.sf());
        try {
            jSONObjectKa.put("surface_texture_updated", riVar.vr() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jLr);
            jSONObject.put("percent", riVar.xha());
            ri(riVarRi, "feed_over", jSONObject, xhaVar);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
        ri.remove(attabalVar);
    }

    public static void ri(com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar) {
        ka.ri("load_video_error", riVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ka(ik ikVar) {
        return new File(ikVar.fi(), ikVar.bu()).getAbsolutePath();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public static void ri(wjv wjvVar, attabal attabalVar, ik ikVar) {
        int i;
        int i2;
        if (wjvVar == null || attabalVar == null || ikVar == null) {
            return;
        }
        String strRi = su.ri();
        try {
            if (!ikVar.fr()) {
                if (CacheDirFactory.getICacheDir(wjvVar.qf()).ri(ikVar)) {
                    i2 = 1;
                } else {
                    i = 2;
                }
                ri.put(attabalVar, new vr(SystemClock.elapsedRealtime(), strRi, i2, ikVar, wjvVar));
                com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVar, strRi, i2, ikVar, null);
                riVarRi.ik().put("is_mute", ikVar.sf() ? 1 : 0);
                riVarRi.ri(ikVar.nr() == -1);
                ri(riVarRi, "play_start");
            }
            i = 3;
            riVarRi.ik().put("is_mute", ikVar.sf() ? 1 : 0);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
        i2 = i;
        ri.put(attabalVar, new vr(SystemClock.elapsedRealtime(), strRi, i2, ikVar, wjvVar));
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi2 = ri(wjvVar, strRi, i2, ikVar, null);
        riVarRi2.ri(ikVar.nr() == -1);
        ri(riVarRi2, "play_start");
    }

    public static void ri(Context context, attabal attabalVar, vr.ri riVar, xha xhaVar) {
        vr vrVar;
        if (context == null || attabalVar == null || riVar == null || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        if (!riVar.sf()) {
            ri(wjvVarFi, ikVarKa, riVar);
        }
        mj mjVar = new mj(ikVarKa);
        mjVar.ri(riVar.co() ? 1 : 0);
        mjVar.lr(CacheDirFactory.getICacheDir(wjvVarFi.qf()).attabal(ikVarKa));
        mjVar.ri(SystemClock.elapsedRealtime() - vrVar.ri());
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(mjVar);
        JSONObject jSONObjectKa = riVarRi.ka();
        try {
            jSONObjectKa.put("is_received_video_not_playing_info", riVar.bgr() ? 1 : 0);
            jSONObjectKa.put("new_media_source", phytopathogen.attabal.attabal());
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
        riVarRi.ri(riVar.sf());
        ri(riVarRi, "feed_play", xhaVar);
    }

    public static void ri(attabal attabalVar, vr.ri riVar) {
        vr vrVar;
        if (attabalVar == null || riVar == null || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jLr = riVar.lr();
        long jKa = riVar.ka();
        if (jKa <= 0 || jLr <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.fi.lr.xha xhaVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.xha();
        xhaVar.ri(riVar.ik());
        xhaVar.lr(jKa);
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(xhaVar);
        ri(riVar, wjvVarFi, riVarRi.ka());
        riVarRi.ri(riVar.sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jLr);
            jSONObject.put("percent", riVar.xha());
            ri(riVarRi, "feed_pause", jSONObject);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
    }

    private static void ri(vr.ri riVar, wjv wjvVar, JSONObject jSONObject) {
        if (wjvVar != null) {
            try {
                ory oryVarCmy = wjvVar.cmy();
                if (oryVarCmy != null) {
                    jSONObject.put("speed_type", oryVarCmy.lr());
                    jSONObject.put("speed", oryVarCmy.ri());
                    jSONObject.put("speed_duration", riVar.ri());
                }
            } catch (Throwable th) {
                ac.ri("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void ri(attabal attabalVar, vr.ri riVar, xha xhaVar) {
        if (attabalVar == null || riVar == null) {
            return;
        }
        fi(attabalVar, riVar);
        vr vrVar = ri.get(attabalVar);
        if (vrVar == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        long jLr = riVar.lr();
        long jKa = riVar.ka();
        com.bytedance.sdk.openadsdk.ka.fi.lr.ka kaVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.ka();
        kaVar.lr(riVar.ik());
        kaVar.ri(jKa);
        kaVar.ri(riVar.mj());
        kaVar.lr(riVar.jbs());
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, riVar);
        riVarRi.ri(kaVar);
        ri(riVar, wjvVarFi, riVarRi.ka());
        riVarRi.ri(riVar.sf());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jLr);
            jSONObject.put("percent", riVar.xha());
            ri(riVarRi, "feed_break", jSONObject, xhaVar);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
    }

    public static void ri(attabal attabalVar, boolean z, String str) {
        vr vrVar;
        if (attabalVar == null || (vrVar = ri.get(attabalVar)) == null) {
            return;
        }
        ik ikVarKa = vrVar.ka();
        wjv wjvVarFi = vrVar.fi();
        if (ikVarKa == null || wjvVarFi == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = ri(wjvVarFi, vrVar.lr(), vrVar.ik(), ikVarKa, null);
        try {
            riVarRi.ik().put("is_mute", z ? 1 : 0);
            riVarRi.ka().put("from", str);
        } catch (JSONException e) {
            ac.ri("TTAD.VideoEventManager", "", e);
        }
        ri(riVarRi, "mute_state_change");
    }

    private static void ri(com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar, String str) {
        ri(riVar, str, (JSONObject) null, (xha) null);
    }

    private static void ri(com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar, String str, JSONObject jSONObject) {
        ri(riVar, str, jSONObject, (xha) null);
    }

    private static void ri(com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar, String str, xha xhaVar) {
        ri(riVar, str, (JSONObject) null, xhaVar);
    }

    private static void ri(final com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVar, String str, final JSONObject jSONObject, final xha xhaVar) {
        if (riVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (riVar.di() && !TextUtils.isEmpty(riVar.lr())) {
            String strLr = riVar.lr();
            strLr.getClass();
            if (strLr.equals("stream") || strLr.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), riVar.ri(), riVar.lr(), str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ka.fi.ri.ri.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                xha xhaVar2;
                try {
                    JSONObject jSONObjectIk = riVar.ik();
                    if (riVar.fi() != null) {
                        riVar.fi().ri(jSONObjectIk);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (xhaVar2 = xhaVar) != null) {
                        xhaVar2.ri(jSONObjectIk);
                    }
                    return jSONObjectIk;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                riVar.xha();
                return riVar.ka();
            }
        });
    }

    private static void ri(final wjv wjvVar, final ik ikVar, final vr.ri riVar) {
        ka.ri();
        ka.ri("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.ka.fi.ri.ri.2
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", ri.ik(ikVar));
                jSONObject.put("player_duration", riVar.ka());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", ikVar.slm());
                jSONObject.put("path", ri.ka(ikVar));
                jSONObject.put("player_type", ikVar.nr());
                com.bytedance.sdk.openadsdk.slm.ri.ka kaVarRi = com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("pangle_video_play_state");
                wjv wjvVar2 = wjvVar;
                return kaVarRi.ri(wjvVar2 != null ? wjvVar2.lji() : 0).lr(jSONObject.toString());
            }
        });
    }
}
