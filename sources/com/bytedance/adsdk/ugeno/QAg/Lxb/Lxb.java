package com.bytedance.adsdk.ugeno.QAg.Lxb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.LD.lk;
import com.bytedance.adsdk.ugeno.QAg.lc.LD;
import com.bytedance.adsdk.ugeno.ZU;
import com.bytedance.adsdk.ugeno.ebl.OY;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends LD {
    private boolean Iyd;
    private String Rt;
    private int SlV;
    private String ZU;
    private com.bytedance.adsdk.ugeno.ebl.Lxb.C0039Lxb chu;
    private String lk;
    private int mb;
    private boolean owi;
    private String pyu;

    public Lxb(Context context) {
        super(context);
        this.ZU = "row";
    }

    private void lk() {
        if (TextUtils.isEmpty(this.lk)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setCompoundDrawables(null, null, null, null);
        if (!this.lk.startsWith("local://")) {
            ZU.Lxb().LD().Lxb(this.sLN, this.lk, new com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb() { // from class: com.bytedance.adsdk.ugeno.QAg.Lxb.Lxb.1
                @Override // com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb
                public void Lxb(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.QAg.Lxb.Lxb.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Lxb.this.LD(new BitmapDrawable(((lk) Lxb.this).JXs.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.lk.replace("local://", "");
            Context context = this.JXs;
            LD(OY.Lxb(context, com.bytedance.adsdk.ugeno.ebl.ZU.Lxb(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lc.LD, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        lk();
        ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Pw() {
        super.Pw();
        if (this.Iyd) {
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setTextColor(((LD) this).LD);
        }
        if (this.owi) {
            if (this.bm) {
                Lxb(this.eXY);
            } else {
                ZU(this.Pw);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void rW() {
        super.rW();
        if (this.Iyd) {
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setTextColor(this.SlV);
        }
        if (this.owi) {
            if (this.bm) {
                Lxb(this.chu);
            } else {
                ZU(this.mb);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lc.LD, com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.ZU = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.SlV = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                this.Iyd = true;
                break;
            case "image":
                this.lk = str2;
                break;
            case "highlightImage":
                this.Rt = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.ebl.Lxb.lk(str2)) {
                    this.bm = true;
                    this.chu = com.bytedance.adsdk.ugeno.ebl.Lxb.LD(str2);
                } else {
                    this.mb = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                    this.bm = false;
                }
                this.owi = true;
                break;
            case "highlightBackgroundImage":
                this.pyu = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public void LD(Drawable drawable) {
        byte b;
        if (drawable == null) {
            return;
        }
        switch (this.ZU) {
            case "column_reverse":
                b = 2;
                break;
            case "column":
                b = 1;
                break;
            case "row_reverse":
                b = 0;
                break;
            case "row":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (b == 1) {
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (b != 2) {
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            ((com.bytedance.adsdk.ugeno.QAg.lc.Lxb) this.OY).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
    }
}
