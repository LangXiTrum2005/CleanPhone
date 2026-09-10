package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class lk {

    public static class Lxb implements View.OnLayoutChangeListener {
        private int LD;
        private final Drawable Lxb;
        private int lk;

        public Lxb(Drawable drawable) {
            this.Lxb = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.LD && i10 == this.lk) {
                return;
            }
            this.LD = i9;
            this.lk = i10;
            this.Lxb.setBounds(0, 0, i9, i10);
        }
    }

    public static void Lxb(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (viewGroup == null || tDVar == null || TextUtils.isEmpty(tDVar.uTT())) {
            return;
        }
        try {
            int i = STP.Ax;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable drawableLxb = Lxb(viewGroup.getResources(), tDVar);
            if (drawableLxb == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                viewGroup.setForeground(drawableLxb);
            } else {
                viewGroup.getOverlay().add(drawableLxb);
                viewGroup.addOnLayoutChangeListener(new Lxb(drawableLxb));
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("add overlay fail", th.getMessage());
        }
    }

    public static void Lxb(Activity activity, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (activity == null || tDVar == null || TextUtils.isEmpty(tDVar.uTT())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = STP.Ax;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable drawableLxb = Lxb(activity.getResources(), tDVar);
            if (drawableLxb == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                activity.getWindow().getDecorView().setForeground(drawableLxb);
            } else {
                activity.getWindow().getDecorView().getOverlay().add(drawableLxb);
                activity.getWindow().getDecorView().addOnLayoutChangeListener(new Lxb(drawableLxb));
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable Lxb(Resources resources, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        try {
            String strUTT = tDVar.uTT();
            if (TextUtils.isEmpty(strUTT)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strUTT, 0);
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
