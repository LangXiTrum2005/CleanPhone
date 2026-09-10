package com.bytedance.adsdk.ugeno.Lxb;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private long JXs;
    private long LD;
    private Map<String, TreeMap<Float, String>> Lxb;
    private JSONObject OY;
    private String ZU;
    private String ebl;
    private Lxb lc;
    private int lk;

    public static class Lxb {
        public String LD;
        public String Lxb;
    }

    public String JXs() {
        return this.ZU;
    }

    public Map<String, TreeMap<Float, String>> LD() {
        return this.Lxb;
    }

    public JSONObject Lxb() {
        return this.OY;
    }

    public String OY() {
        return this.ebl;
    }

    public int ZU() {
        return this.lk;
    }

    public Lxb ebl() {
        return this.lc;
    }

    public long lc() {
        return this.JXs;
    }

    public long lk() {
        return this.LD;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb.append(this.Lxb);
        sb.append(", mDuration=");
        sb.append(this.LD);
        sb.append(", mPlayCount=");
        sb.append(this.lk);
        sb.append(", mPlayDirection=");
        sb.append(this.ZU);
        sb.append(", mDelay=");
        sb.append(this.JXs);
        sb.append(", mTransformOrigin='");
        sb.append(this.lc);
        sb.append("', mTimingFunction='");
        return DM.m(sb, this.ebl, "'}");
    }

    public void LD(long j) {
        this.JXs = j;
    }

    public void Lxb(JSONObject jSONObject) {
        this.OY = jSONObject;
    }

    public void LD(String str) {
        this.ebl = str;
    }

    public void Lxb(Map<String, TreeMap<Float, String>> map) {
        this.Lxb = map;
    }

    public void Lxb(long j) {
        this.LD = j;
    }

    public void Lxb(int i) {
        this.lk = i;
    }

    public void Lxb(String str) {
        this.ZU = str;
    }

    public void Lxb(Lxb lxb) {
        this.lc = lxb;
    }
}
