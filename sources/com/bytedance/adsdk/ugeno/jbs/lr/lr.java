package com.bytedance.adsdk.ugeno.jbs.lr;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.lr.ri<com.bytedance.adsdk.ugeno.jbs.lr.ri> {
    private com.bytedance.adsdk.ugeno.jbs.lr.ri akr;

    public static class ri extends com.bytedance.adsdk.ugeno.lr.ri.C0193ri {
        protected int su;

        public ri(com.bytedance.adsdk.ugeno.lr.ri riVar) {
            super(riVar);
            this.su = -1;
        }

        private int lr(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams ri() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.ri, (int) this.lr);
            layoutParams.leftMargin = (int) this.di;
            layoutParams.rightMargin = (int) this.xha;
            layoutParams.topMargin = (int) this.mj;
            layoutParams.bottomMargin = (int) this.jbs;
            layoutParams.gravity = this.su;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        public void ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ri(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.su = ri(str2);
            }
        }

        private int ri(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iLr = 0;
            for (String str2 : strArrSplit) {
                iLr |= lr(str2);
            }
            return iLr;
        }
    }

    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.jbs.lr.ri ri() {
        com.bytedance.adsdk.ugeno.jbs.lr.ri riVar = new com.bytedance.adsdk.ugeno.jbs.lr.ri(this.lr);
        this.akr = riVar;
        riVar.ri(this);
        return this.akr;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        this.akr.setEventMap(this.che);
        super.lr();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public com.bytedance.adsdk.ugeno.lr.ri.C0193ri qt() {
        return new ri(this);
    }
}
