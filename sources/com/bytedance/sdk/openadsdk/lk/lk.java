package com.bytedance.sdk.openadsdk.lk;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.CSn;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements CSn {
    private CSn.Lxb JXs;
    private final Context LD;
    public sLN Lxb;
    private boolean ZU;
    private ZU lk;

    public lk(Context context, String str, List<FilterWord> list, String str2, String str3) {
        if (!(context instanceof Activity)) {
            com.bytedance.sdk.component.utils.sLN.LD("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.LD = context;
        Lxb(str, list, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        Context context = this.LD;
        if ((context instanceof Activity) && (!((Activity) context).isFinishing()) && !this.Lxb.isShowing()) {
            this.Lxb.show();
        }
    }

    private void Lxb(String str, List<FilterWord> list, String str2, String str3) {
        this.lk = new ZU(this.LD, str, list, str3);
        sLN sln = new sLN(this.LD, this.lk.getDislikeManager());
        this.Lxb = sln;
        sln.Lxb(str, str2);
        this.Lxb.Lxb(str3);
        this.Lxb.Lxb(new sLN.Lxb() { // from class: com.bytedance.sdk.openadsdk.lk.lk.1
            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void LD() {
                lk.this.Lxb();
            }

            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void Lxb() {
            }

            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void lk() {
                lk.this.Lxb();
            }

            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void Lxb(int i, FilterWord filterWord, String str4) {
                lk.this.lk.onSuggestionSubmit(str4);
                lk.this.Lxb();
            }
        });
        this.lk.Lxb(new ZU.Lxb() { // from class: com.bytedance.sdk.openadsdk.lk.lk.2
            @Override // com.bytedance.sdk.openadsdk.lk.ZU.Lxb
            public void LD() {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (lk.this.JXs != null) {
                        lk.this.JXs.Lxb();
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.lk.ZU.Lxb
            public void Lxb() {
                lk.this.Lxb(true);
                if (lk.this.lk != null && lk.this.lk.isShowing()) {
                    lk.this.lk.hide();
                }
                lk.this.ZU();
            }

            @Override // com.bytedance.sdk.openadsdk.lk.ZU.Lxb
            public void Lxb(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && lk.this.JXs != null) {
                        lk.this.JXs.Lxb(i, filterWord.getName());
                    }
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + filterWord.getName());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.CSn
    public void LD() {
        ZU zu = this.lk;
        if (zu != null) {
            zu.destroy();
        }
    }

    public boolean lk() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.CSn
    public void Lxb() {
        Context context = this.LD;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.lk.isShowing()) {
            return;
        }
        this.lk.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.CSn
    public void Lxb(CSn.Lxb lxb) {
        this.JXs = lxb;
    }

    public void Lxb(String str) {
        ZU zu = this.lk;
        if (zu != null) {
            zu.Lxb(str);
        }
    }

    public void Lxb(boolean z) {
        this.ZU = z;
    }
}
