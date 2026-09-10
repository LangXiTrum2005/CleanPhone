package com.bytedance.sdk.openadsdk.component.QAg;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private static Drawable LD;
    private static boolean Lxb;
    private TextView ZU;
    private kqm lk;

    public static Drawable lk() {
        return LD;
    }

    public void LD() {
        if (Lxb) {
            return;
        }
        try {
            int iEbl = QAg.LD().ebl();
            if (iEbl != 0) {
                LD = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources().getDrawable(iEbl);
            }
            Lxb = true;
        } catch (Throwable unused) {
            Lxb = true;
        }
    }

    public void Lxb(lk lkVar, tD tDVar, float f, float f2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (lkVar != null) {
            this.lk = lkVar.getHostAppIcon();
            this.ZU = lkVar.getHostAppName();
            View userInfo = lkVar.getUserInfo();
            if (lkVar instanceof ZU) {
                kqm kqmVar = this.lk;
                if (kqmVar != null && (layoutParams2 = kqmVar.getLayoutParams()) != null) {
                    if (tDVar.wCT() == 1) {
                        int iLk = le.lk(this.lk.getContext(), 40.0f);
                        layoutParams2.width = iLk;
                        layoutParams2.height = iLk;
                    } else {
                        int iLk2 = le.lk(this.lk.getContext(), 30.0f);
                        layoutParams2.width = iLk2;
                        layoutParams2.height = iLk2;
                    }
                    this.lk.setLayoutParams(layoutParams2);
                }
                if (this.ZU != null) {
                    if (tDVar.wCT() == 1) {
                        this.ZU.setTextSize(30.0f);
                    } else {
                        this.ZU.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (tDVar.wCT() == 1) {
                        layoutParams.height = le.lk(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = le.lk(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.QAg.OY.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void Lxb() {
        String strLc = QAg.LD().lc();
        if (TextUtils.isEmpty(strLc)) {
            this.ZU.setVisibility(8);
        } else {
            this.ZU.setText(strLc);
        }
        LD();
        try {
            Drawable drawable = LD;
            if (drawable == null) {
                this.lk.setVisibility(8);
                return;
            }
            this.lk.setImageDrawable(drawable);
            if (this.ZU.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.lk.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.lk.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.lk.setVisibility(8);
        }
    }
}
