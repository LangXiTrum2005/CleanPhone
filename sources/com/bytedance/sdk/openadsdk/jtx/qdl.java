package com.bytedance.sdk.openadsdk.jtx;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements Comparable<qdl> {
    private int lnr;
    private int mzz;
    private long rdp;
    private final String ud;
    private int wd;
    private final ArrayList<Long> qdl = new ArrayList<>();
    private final ArrayList<Long> mml = new ArrayList<>();
    private final ArrayList<Long> mo = new ArrayList<>();
    private final ArrayList<Long> jpc = new ArrayList<>();
    private final HashMap<String, ud> tvp = new HashMap<>();
    private int to = 0;
    private int rq = 0;
    private final HashMap<String, ud> fs = new HashMap<>();
    private int exu = 0;
    private final ArrayList<String> bjy = new ArrayList<>();

    public qdl(String str) {
        this.ud = str;
    }

    private void ud(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrFs = com.bytedance.sdk.openadsdk.mo.qdl.qdl().fs();
        if (iArrFs != null) {
            int i5 = 0;
            while (i5 < iArrFs.length) {
                int i6 = iArrFs[i5];
                long j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                long j2 = jElapsedRealtime - (((long) i6) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it = this.fs.keySet().iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    long j4 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    ud udVar = this.fs.get(next);
                    if (udVar != null) {
                        long jQdl = udVar.qdl(j2, jElapsedRealtime);
                        j3 += jQdl;
                        if (jQdl <= 0 && i5 == iArrFs.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j4;
                }
                if (j3 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i6)), j3);
                    iArr = iArrFs;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i6)))) + j3;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i6)), jOptInt);
                    }
                } else {
                    iArr = iArrFs;
                }
                i5++;
                iArrFs = iArr;
            }
        }
        int[] iArrExu = com.bytedance.sdk.openadsdk.mo.qdl.qdl().exu();
        if (iArrExu != null) {
            int i7 = 0;
            while (i7 < iArrExu.length) {
                int i8 = iArrExu[i7];
                long j5 = jElapsedRealtime - (((long) i8) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                long j6 = 0;
                int i9 = 0;
                for (String str : this.tvp.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i10 = i8;
                    ud udVar2 = this.tvp.get(str);
                    if (udVar2 != null) {
                        long jQdl2 = udVar2.qdl(j5, jElapsedRealtime);
                        j6 += jQdl2;
                        if (jQdl2 > 20000) {
                            i9++;
                        }
                        if (jQdl2 <= 0 && i7 == iArrExu.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i8 = i10;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i11 = i8;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i11)), j6);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i11)))) + j6;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i11)), jOptInt2);
                    }
                }
                if (i9 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i11)), i9);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i11))) + i9;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i11)), iOptInt);
                    }
                }
                i7++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.fs.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.tvp.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().bjy() && (i4 = this.to) != 0) {
            jSONObject.put("v_stay_t_s", i4);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.to;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().rdp() && (i3 = this.exu) != 0) {
            jSONObject.put("lp_stay_t_s", i3);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.exu;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.mo.qdl.qdl().yt() || (i2 = this.rq) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i2);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.rq;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void qdl(String str, String str2) {
        ud udVar;
        ud udVar2;
        ud udVar3;
        ud udVar4;
        ud udVar5;
        ud udVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (udVar = this.fs.get(str2)) != null) {
                    udVar.mml(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (udVar2 = this.fs.get(str2)) != null) {
                    udVar2.lnr(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.fs.get(str2) == null) {
                    ud udVar7 = new ud();
                    this.fs.put(str2, udVar7);
                    udVar7.qdl(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (udVar3 = this.tvp.get(str2)) != null && udVar3.qdl() != ud.mzz) {
                    udVar3.ud(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().bjy()) {
                        this.to = (int) (udVar3.qdl(this.rdp, SystemClock.elapsedRealtime()) + ((long) this.to));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.mo.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().jpc()) {
                    this.wd++;
                }
                if (!TextUtils.isEmpty(str2) && this.tvp.get(str2) == null) {
                    ud udVar8 = new ud();
                    this.tvp.put(str2, udVar8);
                    udVar8.qdl(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.qdl.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().mo()) {
                    this.lnr++;
                    break;
                }
                break;
            case "click":
                if (!this.bjy.contains(str2)) {
                    if (this.bjy.size() > 50) {
                        this.bjy.subList(0, 25).clear();
                    }
                    this.bjy.add(str2);
                    this.mml.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().wd()) {
                        this.mzz++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (udVar4 = this.tvp.get(str2)) != null) {
                    udVar4.mml(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (udVar5 = this.tvp.get(str2)) != null) {
                    udVar5.lnr(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (udVar6 = this.fs.get(str2)) != null && udVar6.qdl() != ud.mzz) {
                    udVar6.ud(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().rdp()) {
                        this.exu = (int) (udVar6.qdl(this.rdp, SystemClock.elapsedRealtime()) + ((long) this.exu));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().yt()) {
                    this.rq++;
                    break;
                }
                break;
            case "dislike":
                this.jpc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject qdl(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            qdl(jSONObject2, jSONObject);
            ud(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            aaj.lnr(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    public String ud() {
        return this.ud;
    }

    private void qdl(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i2 = 0;
        for (int i3 : iArr) {
            long j2 = j - (((long) i3) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i2++;
                size--;
            }
            if (i2 != 0) {
                jSONObject.put(str + i3, i2);
                int iOptInt = jSONObject2.optInt(str + i3) + i2;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i3, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void qdl(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i2;
        int i3;
        int i4;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qdl("show_c_", jSONObject, this.qdl, com.bytedance.sdk.openadsdk.mo.qdl.qdl().tvp(), jElapsedRealtime, jSONObject2);
        qdl("click_c_", jSONObject, this.mml, com.bytedance.sdk.openadsdk.mo.qdl.qdl().to(), jElapsedRealtime, jSONObject2);
        qdl("v_play_c_", jSONObject, this.mo, com.bytedance.sdk.openadsdk.mo.qdl.qdl().rq(), jElapsedRealtime, jSONObject2);
        qdl("dislike_c_", jSONObject, this.jpc, com.bytedance.sdk.openadsdk.mo.qdl.qdl().jtx(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().mo() && (i4 = this.lnr) != 0) {
            jSONObject.put("show_c_s", i4);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.lnr;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.mo.qdl.qdl().wd() && (i3 = this.mzz) != 0) {
            jSONObject.put("click_c_s", i3);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.mzz;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.mo.qdl.qdl().jpc() || (i2 = this.wd) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i2);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.wd;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void qdl() {
        this.rdp = SystemClock.elapsedRealtime();
        this.rq = 0;
        this.mzz = 0;
        this.lnr = 0;
        this.exu = 0;
        this.to = 0;
        this.wd = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(qdl qdlVar) {
        return qdlVar.lnr - this.lnr;
    }
}
