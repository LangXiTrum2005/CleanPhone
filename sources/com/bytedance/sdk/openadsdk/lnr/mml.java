package com.bytedance.sdk.openadsdk.lnr;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends TTDislikeDialogAbstract {
    private qdl mml;
    private String mzz;

    public interface qdl {
        void qdl();

        void qdl(int i2, FilterWord filterWord);

        void ud();
    }

    public mml(Context context, String str, List<FilterWord> list) {
        super(context, ljh.mo(context, "tt_dislikeDialog"));
        this.qdl = str;
        this.ud = list;
    }

    private void ud() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.lnr.mml.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (mml.this.mml != null) {
                    qdl unused = mml.this.mml;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.lnr.mml.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (mml.this.mml != null) {
                    mml.this.mml.ud();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(ax.lnr(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new tvp(getContext(), this.lnr, this.ud);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            qdl();
            ud();
            setMaterialMeta(this.qdl, this.ud);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void qdl(qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void qdl(String str) {
        this.mzz = str;
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.ud
    public void qdl(int i2) {
        FilterWord filterWordUd;
        if (to.lnr == i2) {
            dismiss();
            return;
        }
        if (to.mzz == i2) {
            qdl qdlVar = this.mml;
            if (qdlVar != null) {
                qdlVar.qdl();
                return;
            }
            return;
        }
        if (to.ud != i2 || (filterWordUd = this.lnr.ud()) == null || to.qdl.equals(filterWordUd)) {
            return;
        }
        qdl qdlVar2 = this.mml;
        if (qdlVar2 != null) {
            try {
                qdlVar2.qdl(0, filterWordUd);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void qdl() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
