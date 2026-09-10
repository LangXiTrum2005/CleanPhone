package com.bytedance.sdk.openadsdk.IeN;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sLN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.umeng.analytics.pro.cw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements Comparable<Lxb> {
    private int JXs;
    private final String LD;
    private long STP;
    private int ebl;
    private int lk;
    private final ArrayList<Long> Lxb = new ArrayList<>();
    private final ArrayList<Long> ZU = new ArrayList<>();
    private final ArrayList<Long> lc = new ArrayList<>();
    private final ArrayList<Long> OY = new ArrayList<>();
    private final HashMap<String, LD> QAg = new HashMap<>();
    private int nBu = 0;
    private int JVA = 0;
    private final HashMap<String, LD> sLN = new HashMap<>();
    private int NXR = 0;
    private final ArrayList<String> IeN = new ArrayList<>();

    public Lxb(String str) {
        this.LD = str;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0109 A[PHI: r10 r14
  0x0109: PHI (r10v3 int) = (r10v2 int), (r10v5 int), (r10v5 int) binds: [B:34:0x00e8, B:39:0x00fc, B:41:0x0101] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r14v2 long) = (r14v1 long), (r14v4 long), (r14v4 long) binds: [B:34:0x00e8, B:39:0x00fc, B:41:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    private void LD(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long j;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        int[] iArrSLN = com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().sLN();
        long j2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        if (iArrSLN != null) {
            int i4 = 0;
            while (i4 < iArrSLN.length) {
                int i5 = iArrSLN[i4];
                long j3 = jElapsedRealtime - (((long) i5) * j2);
                Iterator<String> it = this.sLN.keySet().iterator();
                long j4 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<String> it2 = it;
                    LD ld = this.sLN.get(next);
                    if (ld != null) {
                        long jLxb = ld.Lxb(j3, jElapsedRealtime);
                        j4 += jLxb;
                        if (jLxb <= 0 && i4 == iArrSLN.length - 1) {
                            hashSet4.add(next);
                        }
                    }
                    it = it2;
                }
                if (j4 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j4);
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5)))) + j4;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), jOptInt);
                    }
                } else {
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                }
                i4++;
                hashSet4 = hashSet2;
                hashSet5 = hashSet3;
                j2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            }
        }
        HashSet hashSet6 = hashSet4;
        HashSet hashSet7 = hashSet5;
        int[] iArrNXR = com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().NXR();
        if (iArrNXR != null) {
            int i6 = 0;
            while (i6 < iArrNXR.length) {
                int i7 = iArrNXR[i6];
                long j5 = jElapsedRealtime - (((long) i7) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it3 = this.QAg.keySet().iterator();
                int i8 = 0;
                long j6 = 0;
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    Iterator<String> it4 = it3;
                    LD ld2 = this.QAg.get(next2);
                    if (ld2 != null) {
                        long jLxb2 = ld2.Lxb(j5, jElapsedRealtime);
                        j6 += jLxb2;
                        if (jLxb2 > 20000) {
                            i8++;
                        }
                        if (jLxb2 > 0 || i6 != iArrNXR.length - 1) {
                            hashSet = hashSet7;
                        } else {
                            hashSet = hashSet7;
                            hashSet.add(next2);
                        }
                    } else {
                        hashSet = hashSet7;
                    }
                    hashSet7 = hashSet;
                    it3 = it4;
                }
                HashSet hashSet8 = hashSet7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i7)), j6);
                    j = jElapsedRealtime;
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i7)))) + j6;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i7)), jOptInt2);
                    }
                } else {
                    j = jElapsedRealtime;
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i7)), i8);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i7))) + i8;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i7)), iOptInt);
                    }
                }
                i6++;
                hashSet7 = hashSet8;
                jElapsedRealtime = j;
            }
        }
        HashSet hashSet9 = hashSet7;
        if (!hashSet6.isEmpty()) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                this.sLN.remove((String) it5.next());
            }
        }
        if (!hashSet9.isEmpty()) {
            Iterator it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                this.QAg.remove((String) it6.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().IeN() && (i3 = this.nBu) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.nBu;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().STP() && (i2 = this.NXR) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.NXR;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().kqm() || (i = this.JVA) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.JVA;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void Lxb(@NonNull String str, @Nullable String str2) {
        LD ld;
        LD ld2;
        LD ld3;
        LD ld4;
        LD ld5;
        LD ld6;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    b = 0;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    b = 1;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    b = 2;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    b = 3;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    b = 4;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    b = 5;
                }
                break;
            case 94750088:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    b = 6;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    b = 7;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    b = 8;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    b = 9;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    b = 10;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    b = 11;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    b = 12;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    b = cw.k;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    b = cw.l;
                }
                break;
        }
        switch (b) {
            case 0:
                if (!TextUtils.isEmpty(str2) && (ld = this.sLN.get(str2)) != null) {
                    ld.ZU(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 1:
                if (!TextUtils.isEmpty(str2) && (ld2 = this.sLN.get(str2)) != null) {
                    ld2.lk(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(str2) && this.sLN.get(str2) == null) {
                    LD ld7 = new LD();
                    this.sLN.put(str2, ld7);
                    ld7.Lxb(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 3:
            case 8:
            case 12:
            case 14:
                if (!TextUtils.isEmpty(str2) && (ld3 = this.QAg.get(str2)) != null && ld3.Lxb() != LD.JXs) {
                    ld3.LD(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().IeN()) {
                        this.nBu = (int) (ld3.Lxb(this.STP, SystemClock.elapsedRealtime()) + ((long) this.nBu));
                    }
                    break;
                }
                break;
            case 4:
                this.lc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().OY()) {
                    this.ebl++;
                }
                if (!TextUtils.isEmpty(str2) && this.QAg.get(str2) == null) {
                    LD ld8 = new LD();
                    this.QAg.put(str2, ld8);
                    ld8.Lxb(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 5:
                this.Lxb.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().lc()) {
                    this.lk++;
                }
                break;
            case 6:
                if (!this.IeN.contains(str2)) {
                    if (this.IeN.size() > 50) {
                        this.IeN.subList(0, 25).clear();
                    }
                    this.IeN.add(str2);
                    this.ZU.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().ebl()) {
                        this.JXs++;
                    }
                    break;
                }
                break;
            case 7:
                if (!TextUtils.isEmpty(str2) && (ld4 = this.QAg.get(str2)) != null) {
                    ld4.ZU(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 9:
                if (!TextUtils.isEmpty(str2) && (ld5 = this.QAg.get(str2)) != null) {
                    ld5.lk(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 10:
                if (!TextUtils.isEmpty(str2) && (ld6 = this.sLN.get(str2)) != null && ld6.Lxb() != LD.JXs) {
                    ld6.LD(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().STP()) {
                        this.NXR = (int) (ld6.Lxb(this.STP, SystemClock.elapsedRealtime()) + ((long) this.NXR));
                    }
                    break;
                }
                break;
            case 11:
                if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().kqm()) {
                    this.JVA++;
                }
                break;
            case 13:
                this.OY.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String LD() {
        return this.LD;
    }

    public JSONObject Lxb(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            Lxb(jSONObject2, jSONObject);
            LD(jSONObject2, jSONObject);
        } catch (Throwable th) {
            sLN.LD(th.getMessage());
        }
        return jSONObject2;
    }

    private void Lxb(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
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

    private void Lxb(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Lxb("show_c_", jSONObject, this.Lxb, com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().QAg(), jElapsedRealtime, jSONObject2);
        Lxb("click_c_", jSONObject, this.ZU, com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().nBu(), jElapsedRealtime, jSONObject2);
        Lxb("v_play_c_", jSONObject, this.lc, com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().JVA(), jElapsedRealtime, jSONObject2);
        Lxb("dislike_c_", jSONObject, this.OY, com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().VVE(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().lc() && (i3 = this.lk) != 0) {
            jSONObject.put("show_c_s", i3);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.lk;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().ebl() && (i2 = this.JXs) != 0) {
            jSONObject.put("click_c_s", i2);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.JXs;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().OY() || (i = this.ebl) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.ebl;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void Lxb() {
        this.STP = SystemClock.elapsedRealtime();
        this.JVA = 0;
        this.JXs = 0;
        this.lk = 0;
        this.NXR = 0;
        this.nBu = 0;
        this.ebl = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(Lxb lxb) {
        return lxb.lk - this.lk;
    }
}
