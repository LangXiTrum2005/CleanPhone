package com.bytedance.adsdk.ugeno.ri;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private Context ik;
    private com.bytedance.adsdk.ugeno.lr.ik ka;
    private List<ri> lr;
    private List<ik> ri;

    public di(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, List<ik> list) {
        this.ka = ikVar;
        this.ik = context;
        this.ri = list;
        ka();
    }

    private void ka() {
        this.lr = new ArrayList();
        List<ik> list = this.ri;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.ri.size(); i++) {
            ik ikVar = this.ri.get(i);
            if (ikVar != null) {
                this.lr.add(new ri(this.ik, this.ka, ikVar));
            }
        }
    }

    public void ik() {
        List<ri> list = this.lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ri riVar : this.lr) {
            if (riVar != null) {
                riVar.ik();
            }
        }
    }

    public void lr() {
        List<ri> list = this.lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ri riVar : this.lr) {
            if (riVar != null) {
                riVar.ri();
            }
        }
    }

    public void ri() {
        List<ri> list = this.lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ri riVar : this.lr) {
            if (riVar != null) {
                riVar.ka();
            }
        }
    }

    public void lr(Canvas canvas) {
        List<ri> list = this.lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ri riVar : this.lr) {
            if (riVar != null) {
                riVar.lr(canvas);
            }
        }
    }

    public void ri(Canvas canvas) {
        List<ri> list = this.lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ri riVar : this.lr) {
            if (riVar != null) {
                riVar.ri(canvas);
            }
        }
    }

    public void ri(int i, int i2) {
        List<ri> list = this.lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ri riVar : this.lr) {
            if (riVar != null) {
                riVar.ri(i, i2);
            }
        }
    }

    public ri ri(String str) {
        List<ri> list = this.lr;
        if (list != null && !list.isEmpty()) {
            for (ri riVar : this.lr) {
                if (riVar != null && TextUtils.equals(riVar.fi(), str)) {
                    return riVar;
                }
            }
        }
        return null;
    }
}
