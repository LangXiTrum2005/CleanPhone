package com.bytedance.adsdk.ugeno.tvp.ud;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ud extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.tvp.ud.qdl> {
    private com.bytedance.adsdk.ugeno.tvp.ud.qdl dps;

    public static class qdl extends com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl {
        protected int xmv;

        public qdl(com.bytedance.adsdk.ugeno.ud.qdl qdlVar) {
            super(qdlVar);
            this.xmv = -1;
        }

        private int ud(String str) {
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

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl
        public void qdl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.qdl(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.xmv = qdl(str2);
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams qdl() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.qdl, (int) this.ud);
            layoutParams.leftMargin = (int) this.mo;
            layoutParams.rightMargin = (int) this.wd;
            layoutParams.topMargin = (int) this.jpc;
            layoutParams.bottomMargin = (int) this.tvp;
            layoutParams.gravity = this.xmv;
            return layoutParams;
        }

        private int qdl(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iUd = 0;
            for (String str2 : strArrSplit) {
                iUd |= ud(str2);
            }
            return iUd;
        }
    }

    public ud(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.tvp.ud.qdl qdl() {
        com.bytedance.adsdk.ugeno.tvp.ud.qdl qdlVar = new com.bytedance.adsdk.ugeno.tvp.ud.qdl(this.ud);
        this.dps = qdlVar;
        qdlVar.qdl(this);
        return this.dps;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl to() {
        return new qdl(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        this.dps.setEventMap(this.jnw);
        super.ud();
    }
}
