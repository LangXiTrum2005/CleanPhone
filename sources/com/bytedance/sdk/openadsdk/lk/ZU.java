package com.bytedance.sdk.openadsdk.lk;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends TTDislikeDialogAbstract {
    private String JXs;
    private Lxb ZU;

    public interface Lxb {
        void LD();

        void Lxb();

        void Lxb(int i, FilterWord filterWord);
    }

    public ZU(Context context, String str, List<FilterWord> list, String str2) {
        super(context, tD.lc(context, "tt_dislikeDialog"), str2);
        this.Lxb = str;
        this.LD = list;
    }

    private void LD() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.lk.ZU.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (ZU.this.ZU != null) {
                    Lxb unused = ZU.this.ZU;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.lk.ZU.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (ZU.this.ZU != null) {
                    ZU.this.ZU.LD();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(le.lk(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new QAg(getContext(), this.lk, this.LD);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            Lxb();
            LD();
            setMaterialMeta(this.Lxb, this.LD);
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

    public void Lxb(Lxb lxb) {
        this.ZU = lxb;
    }

    public void Lxb(String str) {
        this.JXs = str;
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.LD
    public void Lxb(int i) {
        FilterWord filterWordLD;
        if (nBu.lk == i) {
            dismiss();
            return;
        }
        if (nBu.JXs == i) {
            Lxb lxb = this.ZU;
            if (lxb != null) {
                lxb.Lxb();
                return;
            }
            return;
        }
        if (nBu.LD != i || (filterWordLD = this.lk.LD()) == null || nBu.Lxb.equals(filterWordLD)) {
            return;
        }
        Lxb lxb2 = this.ZU;
        if (lxb2 != null) {
            try {
                lxb2.Lxb(0, filterWordLD);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void Lxb() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
