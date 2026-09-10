package com.bytedance.adsdk.ugeno.ri;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private ri di;
    private long fi;
    private int ik;
    private int jbs = 1;
    private String ka;
    private long lr;
    private String mj;
    private JSONObject qt;
    private Map<String, TreeMap<Float, String>> ri;
    private String xha;

    public static class ri {
        public String lr;
        public String ri;
    }

    public long di() {
        return this.fi;
    }

    public String fi() {
        return this.ka;
    }

    public long ik() {
        return this.lr;
    }

    public String jbs() {
        return this.mj;
    }

    public int ka() {
        return this.ik;
    }

    public Map<String, TreeMap<Float, String>> lr() {
        return this.ri;
    }

    public String mj() {
        return this.xha;
    }

    public int qt() {
        return this.jbs;
    }

    public JSONObject ri() {
        return this.qt;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.ri + ", mDuration=" + this.lr + ", mPlayCount=" + this.ik + ", mPlayDirection=" + this.ka + ", mDelay=" + this.fi + ", mName=" + this.mj + ", mPlayState=" + this.jbs + ", mTransformOrigin='" + this.di + "', mTimingFunction='" + this.xha + "'}";
    }

    public ri xha() {
        return this.di;
    }

    public void ik(String str) {
        this.mj = str;
    }

    public void lr(long j) {
        this.fi = j;
    }

    public void ri(JSONObject jSONObject) {
        this.qt = jSONObject;
    }

    public void lr(String str) {
        this.xha = str;
    }

    public void ri(Map<String, TreeMap<Float, String>> map) {
        this.ri = map;
    }

    public void lr(int i) {
        this.jbs = i;
    }

    public void ri(long j) {
        this.lr = j;
    }

    public void ri(int i) {
        this.ik = i;
    }

    public void ri(String str) {
        this.ka = str;
    }

    public void ri(ri riVar) {
        this.di = riVar;
    }
}
