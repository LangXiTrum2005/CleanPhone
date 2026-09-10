package com.bytedance.sdk.openadsdk.core.co.ik;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.vr;
import com.bytedance.sdk.openadsdk.core.model.bu;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private final boolean fi;
    private wjv ik;
    private com.bytedance.sdk.openadsdk.core.co.ik.ri ka;
    private Context lr;
    private ik ri;

    public static class ri {
        public static ik ri(Context context, wjv wjvVar, boolean z) {
            if (bu.ri(wjvVar, z)) {
                return new ka(context, wjvVar, z);
            }
            return null;
        }
    }

    public lr(Context context, wjv wjvVar) {
        this(context, wjvVar, false);
    }

    public View ik() {
        ik ikVar = this.ri;
        if (ikVar != null) {
            return ikVar.ka();
        }
        return null;
    }

    public void ka() {
        ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.ik();
        }
    }

    public void lr() {
        ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.lr();
        }
    }

    public void ri(vr vrVar) {
        ik ikVarRi = ri.ri(this.lr, this.ik, this.fi);
        this.ri = ikVarRi;
        if (ikVarRi != null) {
            ikVarRi.ri();
            this.ri.ri(vrVar);
        }
    }

    public lr(Context context, wjv wjvVar, boolean z) {
        this.lr = context;
        this.ik = wjvVar;
        this.fi = z;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.co.ik.ri riVar) {
        this.ka = riVar;
        ik ikVar = this.ri;
        if (ikVar != null) {
            ikVar.ri(riVar);
        }
    }

    public void ri(int i) {
        dzy dzyVarFi;
        ik ikVar = this.ri;
        if (!(ikVar instanceof ka) || (dzyVarFi = ((ka) ikVar).fi()) == null || dzyVarFi.ri() == null) {
            return;
        }
        dzyVarFi.ri().ri(i);
    }

    public ik ri() {
        return this.ri;
    }
}
