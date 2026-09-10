package com.bytedance.adsdk.ugeno.mzz;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    int bjy;
    int exu;
    int fs;
    boolean jl;
    int jpc;
    int jtx;
    int mo;
    int mzz;
    float rq;
    float to;
    int tvp;
    int wd;
    boolean yt;
    int qdl = Integer.MAX_VALUE;
    int ud = Integer.MAX_VALUE;
    int lnr = Integer.MIN_VALUE;
    int mml = Integer.MIN_VALUE;
    List<Integer> rdp = new ArrayList();

    public int qdl() {
        return this.wd;
    }

    public int ud() {
        return this.jpc - this.tvp;
    }

    public void qdl(View view, int i2, int i3, int i4, int i5) {
        ud udVar = (ud) view.getLayoutParams();
        this.qdl = Math.min(this.qdl, (view.getLeft() - udVar.exu()) - i2);
        this.ud = Math.min(this.ud, (view.getTop() - udVar.rdp()) - i3);
        this.lnr = Math.max(this.lnr, udVar.bjy() + view.getRight() + i4);
        this.mml = Math.max(this.mml, udVar.jtx() + view.getBottom() + i5);
    }
}
