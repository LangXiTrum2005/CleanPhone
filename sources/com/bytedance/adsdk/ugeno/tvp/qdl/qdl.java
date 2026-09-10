package com.bytedance.adsdk.ugeno.tvp.qdl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.mzz;
import com.bytedance.adsdk.ugeno.tvp.mo.ud;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.bytedance.adsdk.ugeno.wd.mml;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends ud {
    private int ca;
    private boolean gsp;
    private String iw;
    private String kr;
    private String lme;
    private int syy;
    private com.bytedance.adsdk.ugeno.wd.qdl.C0071qdl tdy;
    private String xx;
    private boolean ygv;

    public qdl(Context context) {
        super(context);
        this.lme = "row";
    }

    private void mml() {
        if (TextUtils.isEmpty(this.iw)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setCompoundDrawables(null, null, null, null);
        if (!this.iw.startsWith("local://")) {
            mzz.qdl().ud().qdl(this.tvp, this.iw, new com.bytedance.adsdk.ugeno.qdl.InterfaceC0066qdl() { // from class: com.bytedance.adsdk.ugeno.tvp.qdl.qdl.1
                @Override // com.bytedance.adsdk.ugeno.qdl.InterfaceC0066qdl
                public void qdl(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    jpc.qdl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.tvp.qdl.qdl.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            qdl.this.ud(new BitmapDrawable(((lnr) qdl.this).ud.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.iw.replace("local://", "");
            Context context = this.ud;
            ud(jpc.qdl(context, mml.ud(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void om() {
        super.om();
        if (this.gsp) {
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setTextColor(((ud) this).dps);
        }
        if (this.ygv) {
            if (this.zpu) {
                qdl(this.jle);
            } else {
                mml(this.mrf);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mo.ud, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        mml();
        ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void wc() {
        super.wc();
        if (this.gsp) {
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setTextColor(this.ca);
        }
        if (this.ygv) {
            if (this.zpu) {
                qdl(this.tdy);
            } else {
                mml(this.syy);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tvp.mo.ud, com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.lme = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.ca = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                this.gsp = true;
                break;
            case "image":
                this.iw = str2;
                break;
            case "highlightImage":
                this.kr = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.wd.qdl.lnr(str2)) {
                    this.zpu = true;
                    this.tdy = com.bytedance.adsdk.ugeno.wd.qdl.ud(str2);
                } else {
                    this.syy = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                    this.zpu = false;
                }
                this.ygv = true;
                break;
            case "highlightBackgroundImage":
                this.xx = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public void ud(Drawable drawable) {
        byte b2;
        if (drawable == null) {
            return;
        }
        switch (this.lme) {
            case "column_reverse":
                b2 = 2;
                break;
            case "column":
                b2 = 1;
                break;
            case "row_reverse":
                b2 = 0;
                break;
            case "row":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (b2 == 1) {
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (b2 != 2) {
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            ((com.bytedance.adsdk.ugeno.tvp.mo.qdl) this.mzz).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
    }
}
