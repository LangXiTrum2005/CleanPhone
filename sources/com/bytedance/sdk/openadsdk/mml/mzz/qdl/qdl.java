package com.bytedance.sdk.openadsdk.mml.mzz.qdl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.exu;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.jpc;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.mml;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.mo;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.mzz;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.rdp;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.to;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.tvp;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.ud;
import com.bytedance.sdk.openadsdk.mml.wd;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.smartdigimkt.m6.a;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static final Map<com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl, bjy> qdl = Collections.synchronizedMap(new WeakHashMap());

    public static void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        rdp rdpVar = new rdp(qdlVar2.exu());
        rdpVar.qdl(qdlVar2.lnr());
        rdpVar.ud(jMml);
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (JSONException e2) {
                aaj.qdl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, rdpVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, a.r.f36793h, jSONObject);
        } catch (JSONException e3) {
            aaj.qdl("TTAD.VideoEventManager", "", e3);
        }
    }

    public static void mml(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        ud udVar = new ud();
        udVar.qdl(qdlVar2.lnr());
        udVar.ud(jMml);
        udVar.qdl(qdlVar2.mzz());
        udVar.ud(qdlVar2.mo());
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml), udVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "endcard_skip", jSONObject);
        } catch (JSONException e2) {
            aaj.qdl("TTAD.VideoEventManager", "", e2);
        }
        qdl.remove(qdlVar);
    }

    public static void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || qdlVar2.to() <= 0 || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jMml = qdlVar2.mml();
        exu exuVar = new exu();
        exuVar.qdl(qdlVar2.lnr());
        exuVar.ud(jMml);
        exuVar.qdl(qdlVar2.to());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (JSONException e2) {
                aaj.qdl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, exuVar);
        qdlVar3.qdl(qdlVar2.rq());
        qdl(qdlVar3, "play_buffer");
    }

    public static JSONObject qdl(ljh ljhVar, String str, int i2, lnr lnrVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i2 > 0) {
                jSONObject.put("play_type", String.valueOf(i2));
            }
            if (ljhVar != null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
                if (udVarTdy != null) {
                    jSONObject.put("video_resolution", udVarTdy.tvp());
                    jSONObject.put("video_size", Long.valueOf(udVarTdy.mzz()));
                    jSONObject.put("video_url", udVarTdy.rq());
                    jSONObject.put("player_type", lnrVar.jl());
                    jSONObject.put("video_encode_type", lnrVar.rdp() ? 1 : 0);
                }
                if (lnrVar.qdl()) {
                    jSONObject.put("pag_json_data", new JSONObject(lnrVar.lnr().toString()).toString());
                }
                jSONObject.put("dp_creative_type", ljhVar.ikv());
                return jSONObject;
            }
        } catch (JSONException e2) {
            aaj.qdl("TTAD.VideoEventManager", "", e2);
        }
        return jSONObject;
    }

    public static void ud(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl<tvp> qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_video_cancel", qdlVar);
    }

    public static void ud(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        if (jMml <= 0 || jUd <= 0) {
            return;
        }
        mzz mzzVar = new mzz();
        mzzVar.qdl(qdlVar2.lnr());
        mzzVar.ud(jMml);
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (JSONException e2) {
                aaj.qdl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, mzzVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_continue", jSONObject);
        } catch (JSONException e3) {
            aaj.qdl("TTAD.VideoEventManager", "", e3);
        }
    }

    public static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl<to> qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_video_error", qdlVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[Catch: JSONException -> 0x004b, TryCatch #0 {JSONException -> 0x004b, blocks: (B:15:0x0041, B:17:0x0045, B:20:0x004d), top: B:29:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    public static void qdl(ljh ljhVar, com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, lnr lnrVar) {
        int i2;
        int i3;
        JSONObject jSONObjectQdl;
        int i4;
        if (ljhVar == null || qdlVar == null || lnrVar == null) {
            return;
        }
        String strQdl = uw.qdl();
        try {
            if (!lnrVar.uw()) {
                if (CacheDirFactory.getICacheDir(ljhVar.lhl()).qdl(lnrVar)) {
                    i3 = 1;
                } else {
                    i2 = 2;
                }
                qdl.put(qdlVar, new bjy(SystemClock.elapsedRealtime(), strQdl, i3, lnrVar, ljhVar));
                jSONObjectQdl = qdl(ljhVar, strQdl, i3, lnrVar);
                String strQdl2 = gy.qdl(ljhVar);
                i4 = lnrVar.mzz;
                if (i4 > 0) {
                    jSONObjectQdl.put("play_time", i4);
                }
                jSONObjectQdl.put("is_mute", lnrVar.rq() ? 1 : 0);
                com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVar, strQdl2, jSONObjectQdl, null);
                qdlVar2.qdl(lnrVar.jl() == -1);
                qdl(qdlVar2, a.r.f);
            }
            i2 = 3;
            i4 = lnrVar.mzz;
            if (i4 > 0) {
                jSONObjectQdl.put("play_time", i4);
            }
            jSONObjectQdl.put("is_mute", lnrVar.rq() ? 1 : 0);
        } catch (JSONException e2) {
            aaj.qdl("TTAD.VideoEventManager", "", e2);
        }
        i3 = i2;
        qdl.put(qdlVar, new bjy(SystemClock.elapsedRealtime(), strQdl, i3, lnrVar, ljhVar));
        jSONObjectQdl = qdl(ljhVar, strQdl, i3, lnrVar);
        String strQdl3 = gy.qdl(ljhVar);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVar, strQdl3, jSONObjectQdl, null);
        qdlVar3.qdl(lnrVar.jl() == -1);
        qdl(qdlVar3, a.r.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long lnr(lnr lnrVar) {
        if (lnrVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarBch = lnrVar.rdp() ? lnrVar.bch() : lnrVar.ljh();
        if (udVarBch != null) {
            return Double.valueOf(udVarBch.mo() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String mml(lnr lnrVar) {
        return new File(lnrVar.mzz(), lnrVar.yt()).getAbsolutePath();
    }

    public static void ud(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2, wd wdVar) {
        if (qdlVar == null || qdlVar2 == null) {
            return;
        }
        mzz(qdlVar, qdlVar2);
        bjy bjyVar = qdl.get(qdlVar);
        if (bjyVar == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        mo moVar = new mo();
        moVar.ud(qdlVar2.lnr());
        moVar.qdl(jMml);
        moVar.qdl(qdlVar2.tvp());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (JSONException e2) {
                aaj.qdl("TTAD.VideoEventManager", "", e2);
            }
        }
        qdl(qdlVar2, ljhVarMzz, jSONObjectQdl);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, moVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_over", jSONObject, wdVar);
        } catch (JSONException e3) {
            aaj.qdl("TTAD.VideoEventManager", "", e3);
        }
        qdl.remove(qdlVar);
    }

    public static void qdl(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2, wd wdVar) {
        bjy bjyVar;
        if (context == null || qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        if (!qdlVar2.rq()) {
            qdl(ljhVarMzz, lnrVarMml, qdlVar2);
        }
        jpc jpcVar = new jpc();
        jpcVar.qdl(qdlVar2.fs() ? 1 : 0);
        jpcVar.ud(CacheDirFactory.getICacheDir(ljhVarMzz.lhl()).ud(lnrVarMml));
        jpcVar.qdl(SystemClock.elapsedRealtime() - bjyVar.qdl());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (JSONException e2) {
                aaj.qdl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, jpcVar);
        qdlVar3.qdl(qdlVar2.rq());
        qdl(qdlVar3, "feed_play", wdVar);
    }

    public static void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2) {
        bjy bjyVar;
        if (qdlVar == null || qdlVar2 == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        if (jMml <= 0 || jUd <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.mzz.ud.wd wdVar = new com.bytedance.sdk.openadsdk.mml.mzz.ud.wd();
        wdVar.qdl(qdlVar2.lnr());
        wdVar.ud(jMml);
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (Throwable th) {
                aaj.qdl("TTAD.VideoEventManager", "", th);
            }
        }
        qdl(qdlVar2, ljhVarMzz, jSONObjectQdl);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, wdVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_pause", jSONObject);
        } catch (JSONException e2) {
            aaj.qdl("TTAD.VideoEventManager", "", e2);
        }
    }

    private static void qdl(bjy.qdl qdlVar, ljh ljhVar, JSONObject jSONObject) {
        if (ljhVar != null) {
            try {
                if (ljhVar.eu() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("speed_type", ljhVar.eu().ud());
                    jSONObject2.put("speed", ljhVar.eu().qdl());
                    jSONObject2.put("speed_duration", qdlVar.qdl());
                    jSONObject.put("pag_json_data", jSONObject2.toString());
                }
            } catch (Throwable th) {
                aaj.qdl("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, bjy.qdl qdlVar2, wd wdVar) {
        if (qdlVar == null || qdlVar2 == null) {
            return;
        }
        mzz(qdlVar, qdlVar2);
        bjy bjyVar = qdl.get(qdlVar);
        if (bjyVar == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        long jUd = qdlVar2.ud();
        long jMml = qdlVar2.mml();
        mml mmlVar = new mml();
        mmlVar.ud(qdlVar2.lnr());
        mmlVar.qdl(jMml);
        mmlVar.qdl(qdlVar2.jpc());
        mmlVar.ud(qdlVar2.tvp());
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        int i2 = lnrVarMml.mzz;
        if (i2 > 0) {
            try {
                jSONObjectQdl.put("play_time", i2);
            } catch (JSONException e2) {
                aaj.qdl("TTAD.VideoEventManager", "", e2);
            }
        }
        qdl(qdlVar2, ljhVarMzz, jSONObjectQdl);
        com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, mmlVar);
        qdlVar3.qdl(qdlVar2.rq());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jUd);
            jSONObject.put("percent", qdlVar2.wd());
            qdl(qdlVar3, "feed_break", jSONObject, wdVar);
        } catch (JSONException e3) {
            aaj.qdl("TTAD.VideoEventManager", "", e3);
        }
    }

    public static void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, boolean z2, String str) {
        bjy bjyVar;
        if (qdlVar == null || (bjyVar = qdl.get(qdlVar)) == null) {
            return;
        }
        lnr lnrVarMml = bjyVar.mml();
        ljh ljhVarMzz = bjyVar.mzz();
        if (lnrVarMml == null || ljhVarMzz == null) {
            return;
        }
        JSONObject jSONObjectQdl = qdl(ljhVarMzz, bjyVar.ud(), bjyVar.lnr(), lnrVarMml);
        try {
            int i2 = lnrVarMml.mzz;
            if (i2 > 0) {
                jSONObjectQdl.put("play_time", i2);
            }
            jSONObjectQdl.put("is_mute", z2 ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", str);
            jSONObjectQdl.put("pag_json_data", jSONObject);
        } catch (JSONException e2) {
            aaj.qdl("TTAD.VideoEventManager", "", e2);
        }
        qdl(new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVarMzz, gy.qdl(ljhVarMzz), jSONObjectQdl, null), "mute_state_change");
    }

    private static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str) {
        qdl(qdlVar, str, (JSONObject) null, (wd) null);
    }

    private static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str, JSONObject jSONObject) {
        qdl(qdlVar, str, jSONObject, (wd) null);
    }

    private static void qdl(com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str, wd wdVar) {
        qdl(qdlVar, str, (JSONObject) null, wdVar);
    }

    private static void qdl(final com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl qdlVar, String str, final JSONObject jSONObject, final wd wdVar) {
        if (qdlVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (qdlVar.mzz() && !TextUtils.isEmpty(qdlVar.ud())) {
            String strUd = qdlVar.ud();
            strUd.getClass();
            if (strUd.equals("stream") || strUd.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), qdlVar.qdl(), qdlVar.ud(), str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.1
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                wd wdVar2;
                try {
                    JSONObject jSONObjectLnr = qdlVar.lnr();
                    if (qdlVar.mml() != null) {
                        qdlVar.mml().qdl(jSONObjectLnr);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (wdVar2 = wdVar) != null) {
                        wdVar2.qdl(jSONObjectLnr);
                    }
                    return jSONObjectLnr;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                return jSONObject;
            }
        });
    }

    private static void qdl(final ljh ljhVar, final lnr lnrVar, final bjy.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.2
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", qdl.lnr(lnrVar));
                jSONObject.put("player_duration", qdlVar.mml());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", lnrVar.jtx());
                jSONObject.put("path", qdl.mml(lnrVar));
                jSONObject.put("player_type", lnrVar.jl());
                com.bytedance.sdk.openadsdk.bjy.qdl.mml mmlVarQdl = com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("pangle_video_play_state");
                ljh ljhVar2 = ljhVar;
                return mmlVarQdl.qdl(ljhVar2 != null ? ljhVar2.vz() : 0).ud(jSONObject.toString());
            }
        });
    }
}
