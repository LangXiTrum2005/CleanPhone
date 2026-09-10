package com.bytedance.adsdk.ugeno.fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    int aw;
    boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    int f18015co;
    int di;
    int fi;
    int jbs;
    int mj;
    boolean nr;
    float qt;
    float sf;
    int slm;
    int vr;
    int xha;
    int ri = Integer.MAX_VALUE;
    int lr = Integer.MAX_VALUE;
    int ik = Integer.MIN_VALUE;
    int ka = Integer.MIN_VALUE;
    List<Integer> bgr = new ArrayList();

    public int lr() {
        return this.mj - this.jbs;
    }

    public int ri() {
        return this.xha;
    }

    public void ri(View view, int i, int i2, int i3, int i4) {
        lr lrVar = (lr) view.getLayoutParams();
        this.ri = Math.min(this.ri, (view.getLeft() - lrVar.aw()) - i);
        this.lr = Math.min(this.lr, (view.getTop() - lrVar.bgr()) - i2);
        this.ik = Math.max(this.ik, view.getRight() + lrVar.vr() + i3);
        this.ka = Math.max(this.ka, view.getBottom() + lrVar.slm() + i4);
    }
}
