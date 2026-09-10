package com.bykv.vk.openvk.qdl.qdl.qdl.lnr;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private int exu;
    private int fs;
    private String jpc;
    private long lnr;
    private double mml;
    private String mo;
    private String mzz;
    private int qdl;
    private double rq;
    private String to;
    private String tvp;
    private int ud;
    private String wd;
    private float rdp = -1.0f;
    private int bjy = 0;
    private int jtx = 0;
    private int yt = 0;
    private int jl = 0;
    private int exc = 307200;
    private int aaj = 1;

    public int aaj() {
        return this.jtx;
    }

    public int bjy() {
        if (this.exc < 0) {
            this.exc = 307200;
        }
        long j = this.exc;
        long j2 = this.lnr;
        if (j > j2) {
            this.exc = (int) j2;
        }
        return this.exc;
    }

    public int exc() {
        return this.bjy;
    }

    public String exu() {
        return this.tvp;
    }

    public String fs() {
        return this.jpc;
    }

    public JSONObject jl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", ud());
            jSONObject.put("cover_url", to());
            jSONObject.put("cover_width", lnr());
            jSONObject.put("endcard", fs());
            jSONObject.put("file_hash", rdp());
            jSONObject.put("resolution", tvp());
            jSONObject.put("size", mzz());
            jSONObject.put("video_duration", mo());
            jSONObject.put("video_url", rq());
            jSONObject.put("playable_download_url", exu());
            jSONObject.put("if_playable_loading_show", exc());
            jSONObject.put("remove_loading_page_type", aaj());
            jSONObject.put("fallback_endcard_judge", qdl());
            jSONObject.put("video_preload_size", bjy());
            jSONObject.put("reward_video_cached_type", jtx());
            jSONObject.put("execute_cached_type", yt());
            jSONObject.put("endcard_render", mml());
            jSONObject.put("replay_time", oth());
            jSONObject.put("play_speed_ratio", jpc());
            if (wd() > 0.0d) {
                jSONObject.put("start", wd());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public float jpc() {
        return this.rdp;
    }

    public int jtx() {
        return this.yt;
    }

    public boolean jyq() {
        return this.yt == 0;
    }

    public int lnr() {
        return this.ud;
    }

    public int mml() {
        return this.exu;
    }

    public double mo() {
        return this.mml;
    }

    public long mzz() {
        return this.lnr;
    }

    public int oth() {
        return this.aaj;
    }

    public int qdl() {
        return this.fs;
    }

    public String rdp() {
        if (TextUtils.isEmpty(this.to)) {
            this.to = com.bykv.vk.openvk.qdl.qdl.qdl.wd.ud.qdl(this.wd);
        }
        return this.to;
    }

    public String rq() {
        return this.wd;
    }

    public String to() {
        return this.mo;
    }

    public String tvp() {
        return this.mzz;
    }

    public int ud() {
        return this.qdl;
    }

    public double wd() {
        return this.rq;
    }

    public int yt() {
        return this.jl;
    }

    public void jpc(int i2) {
        this.bjy = i2;
    }

    public void lnr(int i2) {
        this.ud = i2;
    }

    public void mml(int i2) {
        this.exu = i2;
    }

    public void mo(String str) {
        this.to = str;
    }

    public void mzz(String str) {
        this.tvp = str;
    }

    public void qdl(int i2) {
        this.fs = i2;
    }

    public void to(int i2) {
        this.aaj = Math.min(4, Math.max(1, i2));
    }

    public void tvp(int i2) {
        this.jtx = i2;
    }

    public void ud(int i2) {
        this.qdl = i2;
    }

    public void wd(int i2) {
        this.jl = i2;
    }

    public void lnr(String str) {
        this.wd = str;
    }

    public void mml(String str) {
        this.jpc = str;
    }

    public void mo(int i2) {
        this.yt = i2;
    }

    public void mzz(int i2) {
        this.exc = i2;
    }

    public void qdl(long j) {
        this.lnr = j;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(double d) {
        this.mml = d;
    }

    public void qdl(String str) {
        this.mzz = str;
    }
}
