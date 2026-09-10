package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class ka {

    public static class ri implements View.OnLayoutChangeListener {
        private int ik;
        private int lr;
        private final Drawable ri;

        public ri(Drawable drawable) {
            this.ri = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.lr && i10 == this.ik) {
                return;
            }
            this.lr = i9;
            this.ik = i10;
            this.ri.setBounds(0, 0, i9, i10);
        }
    }

    public static void ri(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (viewGroup == null || wjvVar == null || TextUtils.isEmpty(wjvVar.dw())) {
            return;
        }
        try {
            int i = slm.sr;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable drawableRi = ri(viewGroup.getResources(), wjvVar);
            if (drawableRi == null) {
                return;
            }
            viewGroup.setForeground(drawableRi);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("add overlay fail", th.getMessage());
        }
    }

    public static void ri(Activity activity, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (activity == null || wjvVar == null || TextUtils.isEmpty(wjvVar.dw())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = slm.sr;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable drawableRi = ri(activity.getResources(), wjvVar);
            if (drawableRi == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableRi);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("add overlay fail", th.getMessage());
        }
    }

    private static Drawable ri(Resources resources, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        try {
            String strDw = wjvVar.dw();
            if (TextUtils.isEmpty(strDw)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strDw, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
