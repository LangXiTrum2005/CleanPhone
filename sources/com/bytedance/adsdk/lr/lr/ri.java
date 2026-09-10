package com.bytedance.adsdk.lr.lr;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.lr.ik;
import com.bytedance.adsdk.lr.ik.xha;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private ik fi;
    private final AssetManager ka;
    private final xha<String> ri = new xha<>();
    private final Map<xha<String>, Typeface> lr = new HashMap();
    private final Map<String, Typeface> ik = new HashMap();
    private String di = ".ttf";

    public ri(Drawable.Callback callback, ik ikVar) {
        this.fi = ikVar;
        if (callback instanceof View) {
            this.ka = ((View) callback).getContext().getAssets();
        } else {
            this.ka = null;
        }
    }

    private Typeface lr(com.bytedance.adsdk.lr.ik.ik ikVar) {
        Typeface typefaceCreateFromAsset;
        String strRi = ikVar.ri();
        Typeface typeface = this.ik.get(strRi);
        if (typeface != null) {
            return typeface;
        }
        String strIk = ikVar.ik();
        String strLr = ikVar.lr();
        ik ikVar2 = this.fi;
        if (ikVar2 != null) {
            typefaceCreateFromAsset = ikVar2.ri(strRi, strIk, strLr);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.fi.ri(strRi);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        ik ikVar3 = this.fi;
        if (ikVar3 != null && typefaceCreateFromAsset == null) {
            String strLr2 = ikVar3.lr(strRi, strIk, strLr);
            if (strLr2 == null) {
                strLr2 = this.fi.lr(strRi);
            }
            if (strLr2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.ka, strLr2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (ikVar.ka() != null) {
            return ikVar.ka();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.ka, "fonts/" + strRi + this.di);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.ik.put(strRi, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void ri(ik ikVar) {
        this.fi = ikVar;
    }

    public void ri(String str) {
        this.di = str;
    }

    public Typeface ri(com.bytedance.adsdk.lr.ik.ik ikVar) {
        this.ri.ri(ikVar.ri(), ikVar.ik());
        Typeface typeface = this.lr.get(this.ri);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceRi = ri(lr(ikVar), ikVar.ik());
        this.lr.put(this.ri, typefaceRi);
        return typefaceRi;
    }

    private Typeface ri(Typeface typeface, String str) {
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
