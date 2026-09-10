package com.bytedance.sdk.openadsdk.component.fi;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static final Comparator<lr> ri = new Comparator<lr>() { // from class: com.bytedance.sdk.openadsdk.component.fi.lr.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(lr lrVar, lr lrVar2) {
            return lrVar.fi() != lrVar2.fi() ? Long.compare(lrVar2.fi(), lrVar.fi()) : Long.compare(lrVar2.ik(), lrVar.ik());
        }
    };
    private final long di;
    private final long fi;
    private final String ik;
    private final long ka;
    private final String lr;
    private final String xha;

    public lr(String str, String str2, long j, long j2, long j3, String str3) {
        this.lr = str;
        this.ik = str2;
        this.ka = j;
        this.fi = j2;
        this.di = j3;
        this.xha = str3;
    }

    public static lr ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new lr(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public String di() {
        return this.xha;
    }

    public long fi() {
        return this.di;
    }

    public long ik() {
        return this.ka;
    }

    public long ka() {
        return this.fi;
    }

    public String lr() {
        return this.ik;
    }

    public String toString() {
        return "AdCache{mRit=" + this.lr + ", mExpireTime=" + this.ka + ", mCreateTime=" + this.fi + ", mPrice=" + this.di + ", mReqId='" + this.xha + '}';
    }

    public JSONObject ri() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.lr);
            jSONObject.putOpt("material", this.ik);
            jSONObject.putOpt("expire_time", Long.valueOf(this.ka));
            jSONObject.putOpt("create_time", Long.valueOf(this.fi));
            jSONObject.putOpt("price", Long.valueOf(this.di));
            jSONObject.putOpt("req_id", this.xha);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
