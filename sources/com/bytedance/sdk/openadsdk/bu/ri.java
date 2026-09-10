package com.bytedance.sdk.openadsdk.bu;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements Comparable<ri> {
    private long bgr;
    private int fi;
    private int ik;
    private final String lr;
    private int xha;
    private final ArrayList<Long> ri = new ArrayList<>();
    private final ArrayList<Long> ka = new ArrayList<>();
    private final ArrayList<Long> di = new ArrayList<>();
    private final ArrayList<Long> mj = new ArrayList<>();
    private final HashMap<String, lr> jbs = new HashMap<>();
    private int qt = 0;
    private int sf = 0;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final HashMap<String, lr> f18080co = new HashMap<>();
    private int aw = 0;
    private final ArrayList<String> vr = new ArrayList<>();

    public ri(String str) {
        this.lr = str;
    }

    private void lr(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrCo = com.bytedance.sdk.openadsdk.di.ri.ri().co();
        if (iArrCo != null) {
            int i4 = 0;
            while (i4 < iArrCo.length) {
                int i5 = iArrCo[i4];
                long j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                long j2 = jElapsedRealtime - (((long) i5) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it = this.f18080co.keySet().iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    long j4 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    lr lrVar = this.f18080co.get(next);
                    if (lrVar != null) {
                        long jRi = lrVar.ri(j2, jElapsedRealtime);
                        j3 += jRi;
                        if (jRi <= 0 && i4 == iArrCo.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j4;
                }
                if (j3 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j3);
                    iArr = iArrCo;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5)))) + j3;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), jOptInt);
                    }
                } else {
                    iArr = iArrCo;
                }
                i4++;
                iArrCo = iArr;
            }
        }
        int[] iArrAw = com.bytedance.sdk.openadsdk.di.ri.ri().aw();
        if (iArrAw != null) {
            int i6 = 0;
            while (i6 < iArrAw.length) {
                int i7 = iArrAw[i6];
                long j5 = jElapsedRealtime - (((long) i7) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                long j6 = 0;
                int i8 = 0;
                for (String str : this.jbs.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i9 = i7;
                    lr lrVar2 = this.jbs.get(str);
                    if (lrVar2 != null) {
                        long jRi2 = lrVar2.ri(j5, jElapsedRealtime);
                        j6 += jRi2;
                        if (jRi2 > 20000) {
                            i8++;
                        }
                        if (jRi2 <= 0 && i6 == iArrAw.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i7 = i9;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i10 = i7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i10)), j6);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i10)))) + j6;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i10)), jOptInt2);
                    }
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i10)), i8);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i10))) + i8;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i10)), iOptInt);
                    }
                }
                i6++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.f18080co.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.jbs.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.di.ri.ri().vr() && (i3 = this.qt) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.qt;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.di.ri.ri().bgr() && (i2 = this.aw) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.aw;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.di.ri.ri().bu() || (i = this.sf) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.sf;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void ri(String str, String str2) {
        lr lrVar;
        lr lrVar2;
        lr lrVar3;
        lr lrVar4;
        lr lrVar5;
        lr lrVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (lrVar = this.f18080co.get(str2)) != null) {
                    lrVar.ka(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (lrVar2 = this.f18080co.get(str2)) != null) {
                    lrVar2.ik(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.f18080co.get(str2) == null) {
                    lr lrVar7 = new lr();
                    this.f18080co.put(str2, lrVar7);
                    lrVar7.ri(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (lrVar3 = this.jbs.get(str2)) != null && lrVar3.ri() != lr.fi) {
                    lrVar3.lr(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.di.ri.ri().vr()) {
                        this.qt = (int) (((long) this.qt) + lrVar3.ri(this.bgr, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.di.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.di.ri.ri().mj()) {
                    this.xha++;
                }
                if (!TextUtils.isEmpty(str2) && this.jbs.get(str2) == null) {
                    lr lrVar8 = new lr();
                    this.jbs.put(str2, lrVar8);
                    lrVar8.ri(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.ri.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.di.ri.ri().di()) {
                    this.ik++;
                    break;
                }
                break;
            case "click":
                if (!this.vr.contains(str2)) {
                    if (this.vr.size() > 50) {
                        this.vr.subList(0, 25).clear();
                    }
                    this.vr.add(str2);
                    this.ka.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.di.ri.ri().xha()) {
                        this.fi++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (lrVar4 = this.jbs.get(str2)) != null) {
                    lrVar4.ka(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (lrVar5 = this.jbs.get(str2)) != null) {
                    lrVar5.ik(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (lrVar6 = this.f18080co.get(str2)) != null && lrVar6.ri() != lr.fi) {
                    lrVar6.lr(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.di.ri.ri().bgr()) {
                        this.aw = (int) (((long) this.aw) + lrVar6.ri(this.bgr, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.di.ri.ri().bu()) {
                    this.sf++;
                    break;
                }
                break;
            case "dislike":
                this.mj.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String lr() {
        return this.lr;
    }

    public JSONObject ri(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            ri(jSONObject2, jSONObject);
            lr(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            ac.ik(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void ri(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (((long) i2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int iOptInt = jSONObject2.optInt(str + i2) + i;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i2, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void ri(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ri("show_c_", jSONObject, this.ri, com.bytedance.sdk.openadsdk.di.ri.ri().jbs(), jElapsedRealtime, jSONObject2);
        ri("click_c_", jSONObject, this.ka, com.bytedance.sdk.openadsdk.di.ri.ri().qt(), jElapsedRealtime, jSONObject2);
        ri("v_play_c_", jSONObject, this.di, com.bytedance.sdk.openadsdk.di.ri.ri().sf(), jElapsedRealtime, jSONObject2);
        ri("dislike_c_", jSONObject, this.mj, com.bytedance.sdk.openadsdk.di.ri.ri().slm(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.di.ri.ri().di() && (i3 = this.ik) != 0) {
            jSONObject.put("show_c_s", i3);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.ik;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.di.ri.ri().xha() && (i2 = this.fi) != 0) {
            jSONObject.put("click_c_s", i2);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.fi;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.di.ri.ri().mj() || (i = this.xha) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.xha;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void ri() {
        this.bgr = SystemClock.elapsedRealtime();
        this.sf = 0;
        this.fi = 0;
        this.ik = 0;
        this.aw = 0;
        this.qt = 0;
        this.xha = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(ri riVar) {
        return riVar.ik - this.ik;
    }
}
