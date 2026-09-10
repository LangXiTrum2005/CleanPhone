package com.bytedance.adsdk.LD.LD;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.LD.lk;
import com.bytedance.adsdk.LD.lk.ebl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    private lk JXs;
    private final AssetManager ZU;
    private final ebl<String> Lxb = new ebl<>();
    private final Map<ebl<String>, Typeface> LD = new HashMap();
    private final Map<String, Typeface> lk = new HashMap();
    private String lc = ".ttf";

    public Lxb(Drawable.Callback callback, lk lkVar) {
        this.JXs = lkVar;
        if (callback instanceof View) {
            this.ZU = ((View) callback).getContext().getAssets();
        } else {
            this.ZU = null;
        }
    }

    private Typeface LD(com.bytedance.adsdk.LD.lk.lk lkVar) {
        Typeface typefaceCreateFromAsset;
        String strLxb = lkVar.Lxb();
        Typeface typeface = this.lk.get(strLxb);
        if (typeface != null) {
            return typeface;
        }
        String strLk = lkVar.lk();
        String strLD = lkVar.LD();
        lk lkVar2 = this.JXs;
        if (lkVar2 != null) {
            typefaceCreateFromAsset = lkVar2.Lxb(strLxb, strLk, strLD);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.JXs.Lxb(strLxb);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        lk lkVar3 = this.JXs;
        if (lkVar3 != null && typefaceCreateFromAsset == null) {
            String strLD2 = lkVar3.LD(strLxb, strLk, strLD);
            if (strLD2 == null) {
                strLD2 = this.JXs.LD(strLxb);
            }
            if (strLD2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.ZU, strLD2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (lkVar.ZU() != null) {
            return lkVar.ZU();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.ZU, "fonts/" + strLxb + this.lc);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.lk.put(strLxb, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void Lxb(lk lkVar) {
        this.JXs = lkVar;
    }

    public void Lxb(String str) {
        this.lc = str;
    }

    public Typeface Lxb(com.bytedance.adsdk.LD.lk.lk lkVar) {
        this.Lxb.Lxb(lkVar.Lxb(), lkVar.lk());
        Typeface typeface = this.LD.get(this.Lxb);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceLxb = Lxb(LD(lkVar), lkVar.lk());
        this.LD.put(this.Lxb, typefaceLxb);
        return typefaceLxb;
    }

    private Typeface Lxb(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
