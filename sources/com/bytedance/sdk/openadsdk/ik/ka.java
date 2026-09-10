package com.bytedance.sdk.openadsdk.ik;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends TTDislikeDialogAbstract {
    private ri ka;

    public interface ri {
        void lr();

        void ri();

        void ri(int i, FilterWord filterWord);
    }

    public ka(Context context, String str, List<FilterWord> list) {
        super(context, uq.di(context, "tt_dislikeDialog"));
        this.ri = str;
        this.lr = list;
    }

    private void lr() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.ik.ka.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (ka.this.ka != null) {
                    ri unused = ka.this.ka;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.ik.ka.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (ka.this.ka != null) {
                    ka.this.ka.lr();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(qd.ik(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new jbs(getContext(), this.ik, this.lr);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            ri();
            lr();
            setMaterialMeta(this.ri, this.lr);
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

    public void ri(ri riVar) {
        this.ka = riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.lr
    public void ri(int i) {
        FilterWord filterWordLr;
        if (qt.ik == i) {
            dismiss();
            return;
        }
        if (qt.fi == i) {
            ri riVar = this.ka;
            if (riVar != null) {
                riVar.ri();
                return;
            }
            return;
        }
        if (qt.lr != i || (filterWordLr = this.ik.lr()) == null || qt.ri.equals(filterWordLr)) {
            return;
        }
        ri riVar2 = this.ka;
        if (riVar2 != null) {
            try {
                riVar2.ri(0, filterWordLr);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void ri() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
