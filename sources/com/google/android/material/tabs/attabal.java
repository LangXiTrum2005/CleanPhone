package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: ElasticTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal extends dern {
    public static float beachfront(float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    public static float marial(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.dern
    public void wireman(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fBeachfront;
        float fMarial;
        RectF rectFAttabal = dern.attabal(tabLayout, view);
        RectF rectFAttabal2 = dern.attabal(tabLayout, view2);
        if (rectFAttabal.left < rectFAttabal2.left) {
            fBeachfront = marial(f);
            fMarial = beachfront(f);
        } else {
            fBeachfront = beachfront(f);
            fMarial = marial(f);
        }
        drawable.setBounds(phrasemonger.saneness.dern((int) rectFAttabal.left, (int) rectFAttabal2.left, fBeachfront), drawable.getBounds().top, phrasemonger.saneness.dern((int) rectFAttabal.right, (int) rectFAttabal2.right, fMarial), drawable.getBounds().bottom);
    }
}
