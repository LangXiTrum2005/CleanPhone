package com.bytedance.adsdk.ud.ud;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.ud.lnr;
import com.bytedance.adsdk.ud.lnr.wd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private final AssetManager mml;
    private lnr mzz;
    private final wd<String> qdl = new wd<>();
    private final Map<wd<String>, Typeface> ud = new HashMap();
    private final Map<String, Typeface> lnr = new HashMap();
    private String mo = ".ttf";

    public qdl(Drawable.Callback callback, lnr lnrVar) {
        this.mzz = lnrVar;
        if (callback instanceof View) {
            this.mml = ((View) callback).getContext().getAssets();
        } else {
            this.mml = null;
        }
    }

    private Typeface ud(com.bytedance.adsdk.ud.lnr.lnr lnrVar) {
        Typeface typefaceCreateFromAsset;
        String strQdl = lnrVar.qdl();
        Typeface typeface = this.lnr.get(strQdl);
        if (typeface != null) {
            return typeface;
        }
        String strLnr = lnrVar.lnr();
        String strUd = lnrVar.ud();
        lnr lnrVar2 = this.mzz;
        if (lnrVar2 != null) {
            typefaceCreateFromAsset = lnrVar2.qdl(strQdl, strLnr, strUd);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.mzz.qdl(strQdl);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        lnr lnrVar3 = this.mzz;
        if (lnrVar3 != null && typefaceCreateFromAsset == null) {
            String strUd2 = lnrVar3.ud(strQdl, strLnr, strUd);
            if (strUd2 == null) {
                strUd2 = this.mzz.ud(strQdl);
            }
            if (strUd2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.mml, strUd2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (lnrVar.mml() != null) {
            return lnrVar.mml();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.mml, "fonts/" + strQdl + this.mo);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.lnr.put(strQdl, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void qdl(lnr lnrVar) {
        this.mzz = lnrVar;
    }

    public void qdl(String str) {
        this.mo = str;
    }

    public Typeface qdl(com.bytedance.adsdk.ud.lnr.lnr lnrVar) {
        this.qdl.qdl(lnrVar.qdl(), lnrVar.lnr());
        Typeface typeface = this.ud.get(this.qdl);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceQdl = qdl(ud(lnrVar), lnrVar.lnr());
        this.ud.put(this.qdl, typefaceQdl);
        return typefaceQdl;
    }

    private Typeface qdl(Typeface typeface, String str) {
        int i2;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i2 = 3;
        } else if (zContains) {
            i2 = 2;
        } else {
            i2 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }
}
