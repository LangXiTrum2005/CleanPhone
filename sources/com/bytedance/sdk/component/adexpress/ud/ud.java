package com.bytedance.sdk.component.adexpress.ud;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public class ud implements to {
    private ThemeStatusBroadcastReceiver lnr;
    private jpc mml;
    private int mo;
    private exu mzz;
    private Context qdl;
    private com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl ud;

    public ud(Context context, exu exuVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc jpcVar, jpc jpcVar2, com.bytedance.sdk.component.adexpress.dynamic.mo.qdl qdlVar, com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl qdlVar2) {
        this.qdl = context;
        this.mzz = exuVar;
        this.lnr = themeStatusBroadcastReceiver;
        this.mml = jpcVar2;
        if (qdlVar2 != null) {
            this.ud = qdlVar2;
        } else {
            this.ud = new com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl(context, themeStatusBroadcastReceiver, z2, jpcVar, exuVar, qdlVar);
        }
        this.ud.qdl(this.mml);
        if (jpcVar instanceof com.bytedance.sdk.component.adexpress.dynamic.mzz.wd) {
            this.mo = 3;
        } else {
            this.mo = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public boolean qdl(final to.qdl qdlVar) {
        this.mzz.mzz().qdl(this.mo);
        this.ud.qdl(new wd() { // from class: com.bytedance.sdk.component.adexpress.ud.ud.1
            @Override // com.bytedance.sdk.component.adexpress.ud.wd
            public void qdl(View view, rdp rdpVar) {
                if (qdlVar.lnr()) {
                    return;
                }
                ud.this.mzz.mzz().mzz(ud.this.mo);
                ud.this.mzz.mzz().mo(ud.this.mo);
                ud.this.mzz.mzz().to();
                bjy bjyVarUd = qdlVar.ud();
                if (bjyVarUd == null) {
                    return;
                }
                bjyVarUd.qdl(ud.this.ud, rdpVar);
                qdlVar.qdl(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.ud.wd
            public void qdl(int i2, String str) {
                ud.this.mzz.mzz().qdl(ud.this.mo, i2, str, qdlVar.ud(ud.this));
                if (qdlVar.ud(ud.this)) {
                    qdlVar.qdl(ud.this);
                    return;
                }
                bjy bjyVarUd = qdlVar.ud();
                if (bjyVarUd == null) {
                    return;
                }
                bjyVarUd.a_(i2);
            }
        });
        return true;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.mml ud() {
        com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl qdlVar = this.ud;
        if (qdlVar != null) {
            return qdlVar.mml();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to
    public void qdl() {
        com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.ud();
        }
    }
}
