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

/* JADX INFO: loaded from: classes3.dex */
public class mml {

    public static class qdl implements View.OnLayoutChangeListener {
        private int lnr;
        private final Drawable qdl;
        private int ud;

        public qdl(Drawable drawable) {
            this.qdl = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = i4 - i2;
            int i11 = i5 - i3;
            if (i10 == this.ud && i11 == this.lnr) {
                return;
            }
            this.ud = i10;
            this.lnr = i11;
            this.qdl.setBounds(0, 0, i10, i11);
        }
    }

    public static void qdl(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (viewGroup == null || ljhVar == null || TextUtils.isEmpty(ljhVar.uw())) {
            return;
        }
        try {
            int i2 = jtx.rdz;
            if (viewGroup.getTag(i2) != null) {
                return;
            }
            viewGroup.setTag(i2, Integer.valueOf(i2));
            Drawable drawableQdl = qdl(viewGroup.getResources(), ljhVar);
            if (drawableQdl == null) {
                return;
            }
            viewGroup.setForeground(drawableQdl);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("add overlay fail", th.getMessage());
        }
    }

    public static void qdl(Activity activity, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (activity == null || ljhVar == null || TextUtils.isEmpty(ljhVar.uw())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i2 = jtx.rdz;
            if (decorView.getTag(i2) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i2, Integer.valueOf(i2));
            Drawable drawableQdl = qdl(activity.getResources(), ljhVar);
            if (drawableQdl == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableQdl);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("add overlay fail", th.getMessage());
        }
    }

    private static Drawable qdl(Resources resources, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        try {
            String strUw = ljhVar.uw();
            if (TextUtils.isEmpty(strUw)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strUw, 0);
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
