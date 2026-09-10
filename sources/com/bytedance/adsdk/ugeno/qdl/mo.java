package com.bytedance.adsdk.ugeno.qdl;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    private Context lnr;
    private com.bytedance.adsdk.ugeno.ud.lnr mml;
    private List<lnr> qdl;
    private List<qdl> ud;

    public mo(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, List<lnr> list) {
        this.mml = lnrVar;
        this.lnr = context;
        this.qdl = list;
        mml();
    }

    private void mml() {
        this.ud = new ArrayList();
        List<lnr> list = this.qdl;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < this.qdl.size(); i2++) {
            lnr lnrVar = this.qdl.get(i2);
            if (lnrVar != null) {
                this.ud.add(new qdl(this.lnr, this.mml, lnrVar));
            }
        }
    }

    public void lnr() {
        List<qdl> list = this.ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.ud) {
            if (qdlVar != null) {
                qdlVar.lnr();
            }
        }
    }

    public void qdl() {
        List<qdl> list = this.ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.ud) {
            if (qdlVar != null) {
                qdlVar.mml();
            }
        }
    }

    public void ud() {
        List<qdl> list = this.ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.ud) {
            if (qdlVar != null) {
                qdlVar.qdl();
            }
        }
    }

    public void qdl(Canvas canvas) {
        List<qdl> list = this.ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.ud) {
            if (qdlVar != null) {
                qdlVar.qdl(canvas);
            }
        }
    }

    public void ud(Canvas canvas) {
        List<qdl> list = this.ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.ud) {
            if (qdlVar != null) {
                qdlVar.ud(canvas);
            }
        }
    }

    public void qdl(int i2, int i3) {
        List<qdl> list = this.ud;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (qdl qdlVar : this.ud) {
            if (qdlVar != null) {
                qdlVar.qdl(i2, i3);
            }
        }
    }

    public qdl qdl(String str) {
        List<qdl> list = this.ud;
        if (list != null && !list.isEmpty()) {
            for (qdl qdlVar : this.ud) {
                if (qdlVar != null && TextUtils.equals(qdlVar.mzz(), str)) {
                    return qdlVar;
                }
            }
        }
        return null;
    }
}
