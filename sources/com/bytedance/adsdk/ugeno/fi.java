package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ka.mj;
import com.bytedance.adsdk.ugeno.ka.qt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static volatile fi ri;
    private com.bytedance.adsdk.ugeno.core.lr.ka di;
    private com.bytedance.adsdk.ugeno.ik.ri fi;
    private com.bytedance.adsdk.ugeno.core.ik ik;
    private ri ka;
    private List<com.bytedance.adsdk.ugeno.core.lr> lr;
    private com.bytedance.adsdk.ugeno.core.ri.ri xha;

    private fi() {
    }

    private void di() {
        ArrayList arrayList = new ArrayList();
        this.lr = arrayList;
        com.bytedance.adsdk.ugeno.core.ik ikVar = this.ik;
        if (ikVar != null) {
            arrayList.addAll(ikVar.ri());
        }
        com.bytedance.adsdk.ugeno.core.ka.ri(this.lr);
    }

    public static fi ri() {
        if (ri == null) {
            synchronized (fi.class) {
                try {
                    if (ri == null) {
                        ri = new fi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public com.bytedance.adsdk.ugeno.core.ri.ri fi() {
        return this.xha;
    }

    public com.bytedance.adsdk.ugeno.ik.ri ik() {
        return this.fi;
    }

    public com.bytedance.adsdk.ugeno.core.lr.ka ka() {
        return this.di;
    }

    public ri lr() {
        return this.ka;
    }

    public void ri(Context context, com.bytedance.adsdk.ugeno.core.ik ikVar, ri riVar) {
        this.ik = ikVar;
        this.ka = riVar;
        di();
    }

    public void ri(com.bytedance.adsdk.ugeno.ik.ri riVar) {
        this.fi = riVar;
    }

    public void ri(mj mjVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.ka.ri().ri());
        if (mjVar != null) {
            arrayList.addAll(mjVar.ri());
        }
        qt.ri(arrayList);
    }

    public void ri(com.bytedance.adsdk.ugeno.ka.ik ikVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.ka.fi().ri());
        if (ikVar != null) {
            arrayList.addAll(ikVar.ri());
        }
        com.bytedance.adsdk.ugeno.ka.ka.ri(arrayList);
    }
}
