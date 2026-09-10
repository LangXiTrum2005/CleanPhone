package com.bytedance.adsdk.ugeno.qdl;

import android.support.v4.media.a;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private String jpc;
    private int lnr;
    private String mml;
    private qdl mo;
    private long mzz;
    private Map<String, TreeMap<Float, String>> qdl;
    private JSONObject to;
    private int tvp = 1;
    private long ud;
    private String wd;

    public static class qdl {
        public String qdl;
        public String ud;
    }

    public String jpc() {
        return this.wd;
    }

    public long lnr() {
        return this.ud;
    }

    public int mml() {
        return this.lnr;
    }

    public long mo() {
        return this.mzz;
    }

    public String mzz() {
        return this.mml;
    }

    public JSONObject qdl() {
        return this.to;
    }

    public int to() {
        return this.tvp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb.append(this.qdl);
        sb.append(", mDuration=");
        sb.append(this.ud);
        sb.append(", mPlayCount=");
        sb.append(this.lnr);
        sb.append(", mPlayDirection=");
        sb.append(this.mml);
        sb.append(", mDelay=");
        sb.append(this.mzz);
        sb.append(", mName=");
        sb.append(this.jpc);
        sb.append(", mPlayState=");
        sb.append(this.tvp);
        sb.append(", mTransformOrigin='");
        sb.append(this.mo);
        sb.append("', mTimingFunction='");
        return a.r(sb, this.wd, "'}");
    }

    public String tvp() {
        return this.jpc;
    }

    public Map<String, TreeMap<Float, String>> ud() {
        return this.qdl;
    }

    public qdl wd() {
        return this.mo;
    }

    public void lnr(String str) {
        this.jpc = str;
    }

    public void qdl(JSONObject jSONObject) {
        this.to = jSONObject;
    }

    public void ud(long j) {
        this.mzz = j;
    }

    public void qdl(Map<String, TreeMap<Float, String>> map) {
        this.qdl = map;
    }

    public void ud(String str) {
        this.wd = str;
    }

    public void qdl(long j) {
        this.ud = j;
    }

    public void ud(int i2) {
        this.tvp = i2;
    }

    public void qdl(int i2) {
        this.lnr = i2;
    }

    public void qdl(String str) {
        this.mml = str;
    }

    public void qdl(qdl qdlVar) {
        this.mo = qdlVar;
    }
}
