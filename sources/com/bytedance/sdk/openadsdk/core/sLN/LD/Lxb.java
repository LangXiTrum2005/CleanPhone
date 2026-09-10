package com.bytedance.sdk.openadsdk.core.sLN.LD;

import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends lk implements Comparable<Lxb> {
    public long Lxb;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0109Lxb {
        private final long LD;
        private final String Lxb;
        private lk.EnumC0110lk lk = lk.EnumC0110lk.TRACKING_URL;
        private boolean ZU = false;

        public C0109Lxb(String str, long j) {
            this.Lxb = str;
            this.LD = j;
        }

        public Lxb Lxb() {
            return new Lxb(this.LD, this.Lxb, this.lk, Boolean.valueOf(this.ZU));
        }
    }

    public Lxb(long j, String str, lk.EnumC0110lk enumC0110lk, Boolean bool) {
        super(str, enumC0110lk, bool);
        this.Lxb = j;
    }

    public static int Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * MBridgeCommon.DEFAULT_LOAD_TIMEOUT) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean Lxb(long j) {
        return this.Lxb <= j && !JXs();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(Lxb lxb) {
        if (lxb == null) {
            return 1;
        }
        long j = this.Lxb;
        long j2 = lxb.Lxb;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public JSONObject Lxb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", lk());
        jSONObject.put("trackingMilliseconds", this.Lxb);
        return jSONObject;
    }
}
