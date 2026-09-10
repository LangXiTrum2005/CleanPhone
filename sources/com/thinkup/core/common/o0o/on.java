package com.thinkup.core.common.o0o;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.impl.Z;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class on {
    public static final String o = "on";
    private boolean m;
    private int m0;
    private Integer[] mm;
    private long mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42169n;
    private int o0;
    private int om;
    private long on;
    private long oo;
    private final List<m0> mn = a.u();
    private final Map<String, m0> n0 = new ConcurrentHashMap();

    private static Integer[] m(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return new Integer[]{Integer.valueOf(o(jSONObject.optInt("pre_load_mode", 1))), 6, 11};
            }
            Integer[] numArr = new Integer[jSONArrayOptJSONArray.length()];
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                try {
                    numArr[i2] = Integer.valueOf(o(jSONArrayOptJSONArray.optInt(i2)));
                } catch (Throwable unused) {
                    return numArr;
                }
            }
            return numArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static Integer[] n(JSONObject jSONObject) {
        Integer[] numArr = null;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                numArr = new Integer[jSONArrayOptJSONArray.length()];
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    numArr[i2] = Integer.valueOf(o(jSONArrayOptJSONArray.optInt(i2)));
                }
            }
        } catch (Throwable unused) {
        }
        return numArr;
    }

    private int no() {
        return this.om;
    }

    private static int o(int i2) {
        switch (i2) {
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 6;
            case 4:
                return 11;
            case 5:
                return 15;
            case 6:
                return 16;
            default:
                return 17;
        }
    }

    public final long m0() {
        return this.mo;
    }

    public final boolean mm() {
        Integer[] numArr = this.mm;
        if (numArr != null) {
            return Arrays.asList(numArr).contains(10);
        }
        return false;
    }

    public final boolean mn() {
        return this.m;
    }

    public final boolean mo() {
        Integer[] numArr;
        if (this.mn != null) {
            for (int i2 = 0; i2 < this.mn.size(); i2++) {
                m0 m0Var = this.mn.get(i2);
                if (m0Var != null && (numArr = m0Var.mn) != null) {
                    for (Integer num : numArr) {
                        if (num.intValue() == 10) {
                            return true;
                        }
                    }
                }
            }
        }
        Integer[] numArr2 = this.mm;
        if (numArr2 != null) {
            return Arrays.asList(numArr2).contains(10);
        }
        return false;
    }

    public final void n0() {
        this.m = true;
    }

    public final Map<String, m0> o0() {
        return this.n0;
    }

    public final long om() {
        return this.on;
    }

    public final int on() {
        if (this.m0 <= 0) {
            this.m0 = 6;
        }
        return this.m0;
    }

    public final List<m0> oo() {
        return this.mn;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SharedPlaceConfig{isPreLocalConfig=");
        sb.append(this.m);
        sb.append(", delayPreloadTime=");
        sb.append(this.f42169n);
        sb.append(", parallelReqNum=");
        sb.append(this.o0);
        sb.append(", preLoadTimeout=");
        sb.append(this.oo);
        sb.append(", preloadMode=");
        sb.append(this.om);
        sb.append(", loadDelayTimeInWF=");
        sb.append(this.on);
        sb.append(", retryLoadCountInFailed=");
        sb.append(this.m0);
        sb.append(", retryLoadDelayTimeInfFailed=");
        sb.append(this.mo);
        sb.append(", loadModes=");
        sb.append(Arrays.toString(this.mm));
        sb.append(", sharedPlaceInfoList=");
        sb.append(this.mn);
        sb.append(", placementIdToSharedPlaceInfoMap=");
        return Z.o(sb, this.n0, AbstractJsonLexerKt.END_OBJ);
    }

    public static on o(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            on onVar = new on();
            onVar.f42169n = jSONObject.optLong("pre_load_time", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            onVar.o0 = jSONObject.optInt("pre_load_num", 1);
            onVar.oo = jSONObject.optLong("pre_load_timeout", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            onVar.om = jSONObject.optInt("pre_load_mode", 1);
            onVar.on = jSONObject.optLong("shared_delay_time_in_wf", 2000L);
            onVar.mo = jSONObject.optLong("shared_retry_time_in_loadfailed", MBInterstitialActivity.WEB_LOAD_TIME);
            onVar.m0 = jSONObject.optInt("shared_retry_count_in_loadfailed", 6);
            Integer[] numArrM = m(jSONObject);
            onVar.mm = numArrM;
            Arrays.toString(numArrM);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("formats");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            m0 m0Var = new m0();
                            m0Var.o = jSONObjectOptJSONObject.optInt("format");
                            m0Var.m = jSONObjectOptJSONObject.optString("pl_id", "");
                            m0Var.f42166n = jSONObjectOptJSONObject.optInt("req_pacing");
                            m0Var.o0 = jSONObjectOptJSONObject.optInt("ad_cache", 1);
                            m0Var.oo = jSONObjectOptJSONObject.optDouble("ad_ecpm", -1.0d);
                            m0Var.mm = onVar;
                            if (!jSONObjectOptJSONObject.isNull("pre_load_mode_n")) {
                                m0Var.mn = n(jSONObjectOptJSONObject);
                            }
                            Arrays.toString(m0Var.mn);
                            onVar.mn.add(m0Var);
                            onVar.n0.put(m0Var.m, m0Var);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return onVar;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final long n() {
        return this.oo;
    }

    public final int m() {
        return this.o0;
    }

    public final long o() {
        return this.f42169n;
    }

    public final boolean o(int i2, String str) {
        m0 m0Var;
        Integer[] numArr;
        if (this.n0 == null || TextUtils.isEmpty(str) || (m0Var = this.n0.get(str)) == null || (numArr = m0Var.mn) == null) {
            Integer[] numArr2 = this.mm;
            if (numArr2 != null) {
                return Arrays.asList(numArr2).contains(Integer.valueOf(i2));
            }
        } else {
            for (Integer num : numArr) {
                if (num.intValue() == i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
