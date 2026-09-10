package com.bytedance.sdk.openadsdk.component.tvp;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    private static boolean qdl;
    private static Drawable ud;
    private yt lnr;
    private TextView mml;

    public static Drawable lnr() {
        return ud;
    }

    public void qdl(lnr lnrVar, ljh ljhVar, float f, float f2, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (lnrVar != null) {
            this.lnr = lnrVar.getHostAppIcon();
            this.mml = lnrVar.getHostAppName();
            View userInfo = lnrVar.getUserInfo();
            if (lnrVar instanceof mml) {
                yt ytVar = this.lnr;
                if (ytVar != null && (layoutParams2 = ytVar.getLayoutParams()) != null) {
                    if (ljhVar.jb() == 1) {
                        int iUd = ax.ud(this.lnr.getContext(), 40.0f);
                        layoutParams2.width = iUd;
                        layoutParams2.height = iUd;
                    } else {
                        int iUd2 = ax.ud(this.lnr.getContext(), 30.0f);
                        layoutParams2.width = iUd2;
                        layoutParams2.height = iUd2;
                    }
                    this.lnr.setLayoutParams(layoutParams2);
                }
                if (this.mml != null) {
                    if (ljhVar.jb() == 1) {
                        this.mml.setTextSize(30.0f);
                    } else {
                        this.mml.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (ljhVar.jb() == 1) {
                        layoutParams.height = ax.ud(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = ax.ud(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.tvp.jpc.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void ud() {
        if (qdl) {
            return;
        }
        try {
            int iTvp = tvp.ud().tvp();
            if (iTvp != 0) {
                ud = com.bytedance.sdk.openadsdk.core.yt.qdl().getResources().getDrawable(iTvp);
            }
            qdl = true;
        } catch (Throwable unused) {
            qdl = true;
        }
    }

    public void qdl() {
        String strJpc = tvp.ud().jpc();
        if (TextUtils.isEmpty(strJpc)) {
            this.mml.setVisibility(8);
        } else {
            this.mml.setText(strJpc);
        }
        ud();
        try {
            Drawable drawable = ud;
            if (drawable == null) {
                this.lnr.setVisibility(8);
                return;
            }
            this.lnr.setImageDrawable(drawable);
            if (this.mml.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.lnr.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.lnr.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.lnr.setVisibility(8);
        }
    }
}
