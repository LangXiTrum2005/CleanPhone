package com.bytedance.adsdk.ugeno.ebl;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class JXs {
    private static boolean LD;
    private static Field Lxb;

    public static Drawable Lxb(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!LD) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                Lxb = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            LD = true;
        }
        Field field = Lxb;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                Lxb = null;
            }
        }
        return null;
    }
}
