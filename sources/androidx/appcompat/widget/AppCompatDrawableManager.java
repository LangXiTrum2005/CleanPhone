package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatDrawableManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3554b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AppCompatDrawableManager f3555c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResourceManagerInternal f3556a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatDrawableManager$1, reason: invalid class name */
    class AnonymousClass1 implements ResourceManagerInternal.ResourceManagerHooks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f3557a = {2131230857, 2131230855, 2131230781};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f3558b = {2131230805, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f3559c = {2131230854, 2131230856, 2131230798, R.drawable.abc_text_cursor_material, 2131230851, 2131230852, 2131230853};
        public final int[] d = {2131230830, R.drawable.abc_cab_background_internal_bg, 2131230829};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f3560e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i2, int[] iArr) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i2) {
            int iC = ThemeUtils.c(context, R.attr.colorControlHighlight);
            int iB = ThemeUtils.b(context, R.attr.colorButtonNormal);
            int[] iArr = ThemeUtils.f3638b;
            int[] iArr2 = ThemeUtils.d;
            int iC2 = ColorUtils.c(iC, i2);
            return new ColorStateList(new int[][]{iArr, iArr2, ThemeUtils.f3639c, ThemeUtils.f}, new int[]{iB, iC2, ColorUtils.c(iC, i2), i2});
        }

        public static LayerDrawable c(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable drawableD = resourceManagerInternal.d(context, R.drawable.abc_star_black_48dp);
            Drawable drawableD2 = resourceManagerInternal.d(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableD;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableD2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
            int[] iArr = DrawableUtils.f3600a;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.f3554b;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(i2, mode));
        }

        public final ColorStateList d(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i2 == 2131230847) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i2 != R.drawable.abc_switch_thumb_material) {
                if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, ThemeUtils.c(context, R.attr.colorButtonNormal));
                }
                if (i2 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i2 == R.drawable.abc_btn_colored_material) {
                    return b(context, ThemeUtils.c(context, R.attr.colorAccent));
                }
                if (i2 == 2131230842 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(i2, this.f3558b)) {
                    return ThemeUtils.d(context, R.attr.colorControlNormal);
                }
                if (a(i2, this.f3560e)) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(i2, this.f)) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i2 == R.drawable.abc_seekbar_thumb_material) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = ThemeUtils.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = ThemeUtils.f3638b;
                iArr2[0] = ThemeUtils.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = ThemeUtils.f3640e;
                iArr2[1] = ThemeUtils.c(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.f;
                iArr2[2] = ThemeUtils.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = ThemeUtils.f3638b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.f3640e;
                iArr2[1] = ThemeUtils.c(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized AppCompatDrawableManager a() {
        try {
            if (f3555c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3555c;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        return ResourceManagerInternal.f(i2, mode);
    }

    public static synchronized void d() {
        if (f3555c == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            f3555c = appCompatDrawableManager;
            appCompatDrawableManager.f3556a = ResourceManagerInternal.b();
            ResourceManagerInternal resourceManagerInternal = f3555c.f3556a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            synchronized (resourceManagerInternal) {
                resourceManagerInternal.f3619e = anonymousClass1;
            }
        }
    }

    public static void e(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f;
        int[] state = drawable.getState();
        int[] iArr2 = DrawableUtils.f3600a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = tintInfo.d;
        if (!z2 && !tintInfo.f3644c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z2 ? tintInfo.f3642a : null;
        PorterDuff.Mode mode2 = tintInfo.f3644c ? tintInfo.f3643b : ResourceManagerInternal.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = ResourceManagerInternal.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f3556a.d(context, i2);
    }
}
