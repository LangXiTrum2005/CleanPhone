package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableDecoderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f12707a = true;

    public static Drawable a(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (f12707a) {
                return b(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return ContextCompat.getDrawable(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            f12707a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.b(context2.getResources(), i2, theme);
    }

    public static Drawable b(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context);
            contextThemeWrapper.f3422b = theme;
            contextThemeWrapper.a(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.a(context, i2);
    }
}
