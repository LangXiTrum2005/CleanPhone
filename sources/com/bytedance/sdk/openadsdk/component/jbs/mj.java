package com.bytedance.sdk.openadsdk.component.jbs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static Drawable lr;
    private static boolean ri;
    private bu ik;
    private TextView ka;

    public static Drawable ik() {
        return lr;
    }

    public void lr() {
        if (ri) {
            return;
        }
        try {
            int iJbs = qt.lr().jbs();
            if (iJbs != 0) {
                lr = nr.ri().getResources().getDrawable(iJbs);
            }
            ri = true;
        } catch (Throwable unused) {
            ri = true;
        }
    }

    public void ri(ik ikVar, wjv wjvVar, float f, float f2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (ikVar != null) {
            this.ik = ikVar.getHostAppIcon();
            this.ka = ikVar.getHostAppName();
            View userInfo = ikVar.getUserInfo();
            if (ikVar instanceof ka) {
                bu buVar = this.ik;
                if (buVar != null && (layoutParams2 = buVar.getLayoutParams()) != null) {
                    if (wjvVar.bbu() == 1) {
                        int iLr = qd.lr(this.ik.getContext(), 40.0f);
                        layoutParams2.width = iLr;
                        layoutParams2.height = iLr;
                    } else {
                        int iLr2 = qd.lr(this.ik.getContext(), 30.0f);
                        layoutParams2.width = iLr2;
                        layoutParams2.height = iLr2;
                    }
                    this.ik.setLayoutParams(layoutParams2);
                }
                if (this.ka != null) {
                    if (wjvVar.bbu() == 1) {
                        this.ka.setTextSize(30.0f);
                    } else {
                        this.ka.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (wjvVar.bbu() == 1) {
                        layoutParams.height = qd.lr(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = qd.lr(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.jbs.mj.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void ri() {
        String strMj = qt.lr().mj();
        if (TextUtils.isEmpty(strMj)) {
            this.ka.setVisibility(8);
        } else {
            this.ka.setText(strMj);
        }
        lr();
        try {
            Drawable drawable = lr;
            if (drawable == null) {
                this.ik.setVisibility(8);
                return;
            }
            this.ik.setImageDrawable(drawable);
            if (this.ka.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ik.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.ik.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.ik.setVisibility(8);
        }
    }
}
