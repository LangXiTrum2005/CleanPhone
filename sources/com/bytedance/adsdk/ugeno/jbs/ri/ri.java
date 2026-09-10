package com.bytedance.adsdk.ugeno.jbs.ri;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fi;
import com.bytedance.adsdk.ugeno.jbs.di.lr;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.adsdk.ugeno.xha.ka;
import com.bytedance.adsdk.ugeno.xha.mj;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends lr {
    private boolean adz;
    private String de;
    private int eu;
    private boolean ezp;
    private int jm;
    private com.bytedance.adsdk.ugeno.xha.ri.C0197ri tpb;
    private String xlq;
    private String zv;
    private String zxp;

    public ri(Context context) {
        super(context);
        this.zv = "row";
    }

    private void ka() {
        if (TextUtils.isEmpty(this.de)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setCompoundDrawables(null, null, null, null);
        if (!this.de.startsWith("local://")) {
            fi.ri().lr().ri(this.jbs, this.de, new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ri.ri.1
                @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
                public void ri(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ri.ri.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ri.this.lr(new BitmapDrawable(((ik) ri.this).lr.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.de.replace("local://", "");
            Context context = this.lr;
            lr(mj.ri(context, ka.lr(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void feb() {
        super.feb();
        if (this.adz) {
            ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setTextColor(((lr) this).akr);
        }
        if (this.ezp) {
            if (this.hd) {
                ri(this.sez);
            } else {
                ka(this.ig);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void kt() {
        super.kt();
        if (this.adz) {
            ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setTextColor(this.jm);
        }
        if (this.ezp) {
            if (this.hd) {
                ri(this.tpb);
            } else {
                ka(this.eu);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.di.lr, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        ka();
        ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.di.lr, com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.zv = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.jm = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                this.adz = true;
                break;
            case "image":
                this.de = str2;
                break;
            case "highlightImage":
                this.xlq = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.xha.ri.ik(str2)) {
                    this.hd = true;
                    this.tpb = com.bytedance.adsdk.ugeno.xha.ri.lr(str2);
                } else {
                    this.eu = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                    this.hd = false;
                }
                this.ezp = true;
                break;
            case "highlightBackgroundImage":
                this.zxp = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.zv;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
                    return;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                }
                break;
            case 113114:
                str.equals("row");
                break;
        }
        ((com.bytedance.adsdk.ugeno.jbs.di.ri) this.fi).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
