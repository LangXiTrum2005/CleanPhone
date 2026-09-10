package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.mml.jpc;
import com.bytedance.adsdk.ugeno.mml.to;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private static volatile mzz qdl;
    private com.bytedance.adsdk.ugeno.core.lnr lnr;
    private qdl mml;
    private com.bytedance.adsdk.ugeno.core.ud.mml mo;
    private com.bytedance.adsdk.ugeno.lnr.qdl mzz;
    private List<com.bytedance.adsdk.ugeno.core.ud> ud;
    private com.bytedance.adsdk.ugeno.core.qdl.qdl wd;

    private mzz() {
    }

    private void mo() {
        ArrayList arrayList = new ArrayList();
        this.ud = arrayList;
        com.bytedance.adsdk.ugeno.core.lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            arrayList.addAll(lnrVar.qdl());
        }
        com.bytedance.adsdk.ugeno.core.mml.qdl(this.ud);
    }

    public static mzz qdl() {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public com.bytedance.adsdk.ugeno.lnr.qdl lnr() {
        return this.mzz;
    }

    public com.bytedance.adsdk.ugeno.core.ud.mml mml() {
        return this.mo;
    }

    public com.bytedance.adsdk.ugeno.core.qdl.qdl mzz() {
        return this.wd;
    }

    public qdl ud() {
        return this.mml;
    }

    public void qdl(Context context, com.bytedance.adsdk.ugeno.core.lnr lnrVar, qdl qdlVar) {
        this.lnr = lnrVar;
        this.mml = qdlVar;
        mo();
    }

    public void qdl(com.bytedance.adsdk.ugeno.lnr.qdl qdlVar) {
        this.mzz = qdlVar;
    }

    public void qdl(jpc jpcVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.mml.qdl().qdl());
        if (jpcVar != null) {
            arrayList.addAll(jpcVar.qdl());
        }
        to.qdl(arrayList);
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.lnr lnrVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.mml.mzz().qdl());
        if (lnrVar != null) {
            arrayList.addAll(lnrVar.qdl());
        }
        com.bytedance.adsdk.ugeno.mml.mml.qdl(arrayList);
    }
}
