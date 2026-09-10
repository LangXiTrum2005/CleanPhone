package com.bytedance.sdk.component.mo.qdl.mo;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private String jpc;
    private final boolean lnr;
    private final String mo;
    private final int mzz;
    private final String qdl;
    private boolean rq;
    private final String ud;
    private String wd;
    private int mml = -1;
    private int tvp = 0;
    private String to = null;

    public mml(String str, String str2, boolean z2, int i2, String str3) {
        this.qdl = str;
        this.ud = str2;
        this.lnr = z2;
        this.mzz = i2;
        this.mo = str3;
    }

    public int jpc() {
        return this.tvp;
    }

    public boolean lnr() {
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public int mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public boolean rq() {
        return this.mml == -1;
    }

    public boolean to() {
        return this.rq;
    }

    public String tvp() {
        return this.jpc;
    }

    public String ud() {
        return this.ud;
    }

    public String wd() {
        return this.wd;
    }

    public void lnr(String str) {
        this.to = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.jpc)) {
            this.jpc = String.valueOf(this.to);
            return;
        }
        this.jpc += "," + this.to;
    }

    public void qdl(int i2) {
        this.mml = i2;
    }

    public void ud(int i2) {
        this.tvp = i2;
        if (i2 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.wd)) {
            this.wd = String.valueOf(this.tvp);
            return;
        }
        this.wd += "," + this.tvp;
    }

    public void qdl(String str) {
        this.wd = str;
    }

    public void qdl(boolean z2) {
        this.rq = z2;
    }

    public Runnable qdl(String str, Map<String, String> map) {
        return qdl.qdl().qdl(this, str, map);
    }

    public void ud(String str) {
        this.jpc = str;
    }
}
