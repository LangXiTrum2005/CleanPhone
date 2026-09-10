package com.bytedance.sdk.openadsdk.bjy.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private String lnr;
    private int mml;
    private String mo;
    private boolean mzz;
    private String qdl;
    private ljh ud;
    private int wd;
    private int jpc = 0;
    private int tvp = 0;

    public int jpc() {
        return this.jpc;
    }

    public String lnr() {
        ljh ljhVar;
        if (TextUtils.isEmpty(this.lnr) && (ljhVar = this.ud) != null) {
            this.lnr = gy.qdl(ljhVar);
        }
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public int tvp() {
        return this.tvp;
    }

    public ljh ud() {
        return this.ud;
    }

    public int wd() {
        return this.wd;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.lnr = str;
    }

    public void qdl(ljh ljhVar) {
        this.ud = ljhVar;
    }

    public void ud(int i2) {
        this.wd = i2;
    }

    public void qdl(int i2) {
        this.mml = i2;
    }

    public void lnr(String str) {
        this.mo = str;
    }

    public void qdl(boolean z2) {
        this.mzz = z2;
    }
}
