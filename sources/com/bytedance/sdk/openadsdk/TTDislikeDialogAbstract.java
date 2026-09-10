package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.lnr.to;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements to.ud {
    protected final to lnr;
    private View mml;
    protected String qdl;
    protected List<FilterWord> ud;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        to toVar = new to();
        this.lnr = toVar;
        toVar.qdl(this);
    }

    public void destroy() {
        to toVar = this.lnr;
        if (toVar != null) {
            toVar.qdl();
        }
    }

    public to getDislikeManager() {
        return this.lnr;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mml = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.mml;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        to toVar = this.lnr;
        if (toVar != null) {
            toVar.lnr(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.qdl = str;
        this.ud = list;
        this.lnr.qdl(str);
        this.lnr.qdl(this.ud);
    }

    public TTDislikeDialogAbstract(Context context, int i2) {
        super(context, i2);
        to toVar = new to();
        this.lnr = toVar;
        toVar.qdl(this);
    }
}
