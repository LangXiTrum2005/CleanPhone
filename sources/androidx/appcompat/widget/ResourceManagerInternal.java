package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceManagerInternal {
    public static ResourceManagerInternal g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f3616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3617b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f3618c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResourceManagerHooks f3619e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ColorFilterLruCache f3615h = new ColorFilterLruCache(6);

    public static class AsldcInflateDelegate implements InflateDelegate {
    }

    public static class AvdcInflateDelegate implements InflateDelegate {
    }

    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
    }

    public static class DrawableDelegate implements InflateDelegate {
    }

    public interface InflateDelegate {
    }

    public interface ResourceManagerHooks {
    }

    public static class VdcInflateDelegate implements InflateDelegate {
    }

    public static synchronized ResourceManagerInternal b() {
        try {
            if (g == null) {
                g = new ResourceManagerInternal();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ColorFilterLruCache colorFilterLruCache = f3615h;
        colorFilterLruCache.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = colorFilterLruCache.get(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            colorFilterLruCache.put(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray longSparseArray = (LongSparseArray) this.f3617b.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray();
                    this.f3617b.put(context, longSparseArray);
                }
                longSparseArray.h(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable c(Context context, long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f3617b.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.d(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = ContainerHelpersKt.b(longSparseArray.f3745Y, longSparseArray.e0, j);
            if (iB >= 0) {
                Object[] objArr = longSparseArray.Z;
                Object obj = objArr[iB];
                Object obj2 = LongSparseArrayKt.f3746a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    longSparseArray.X = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable d(Context context, int i2) {
        return e(context, i2, false);
    }

    public final synchronized Drawable e(Context context, int i2, boolean z2) {
        Drawable drawableC;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.f3618c == null) {
                this.f3618c = new TypedValue();
            }
            TypedValue typedValue = this.f3618c;
            context.getResources().getValue(i2, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            drawableC = c(context, j);
            if (drawableC == null) {
                LayerDrawable layerDrawableC = null;
                if (this.f3619e != null) {
                    if (i2 == R.drawable.abc_cab_background_top_material) {
                        layerDrawableC = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, 2131230798)});
                    } else if (i2 == R.drawable.abc_ratingbar_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_big);
                    } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_medium);
                    } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_small);
                    }
                }
                drawableC = layerDrawableC;
                if (drawableC != null) {
                    drawableC.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j, drawableC);
                }
            }
            if (drawableC == null) {
                drawableC = ContextCompat.getDrawable(context, i2);
            }
            if (drawableC != null) {
                drawableC = h(context, i2, z2, drawableC);
            }
            if (drawableC != null) {
                DrawableUtils.a(drawableC);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableC;
    }

    public final synchronized ColorStateList g(Context context, int i2) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f3616a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) sparseArrayCompat.d(i2);
        if (colorStateList == null) {
            ResourceManagerHooks resourceManagerHooks = this.f3619e;
            if (resourceManagerHooks != null) {
                colorStateListD = ((AppCompatDrawableManager.AnonymousClass1) resourceManagerHooks).d(context, i2);
            }
            if (colorStateListD != null) {
                if (this.f3616a == null) {
                    this.f3616a = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.f3616a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat();
                    this.f3616a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.b(i2, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[RETURN] */
    public final Drawable h(Context context, int i2, boolean z2, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListG = g(context, i2);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            int[] iArr = DrawableUtils.f3600a;
            Drawable drawableMutate = drawable.mutate();
            DrawableCompat.j(drawableMutate, colorStateListG);
            if (this.f3619e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                DrawableCompat.k(drawableMutate, mode);
            }
            return drawableMutate;
        }
        ResourceManagerHooks resourceManagerHooks = this.f3619e;
        int i3 = R.attr.colorControlNormal;
        if (resourceManagerHooks != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = ThemeUtils.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = AppCompatDrawableManager.f3554b;
                AppCompatDrawableManager.AnonymousClass1.e(drawableFindDrawableByLayerId, iC, mode2);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.c(context, R.attr.colorControlNormal), mode2);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = ThemeUtils.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = AppCompatDrawableManager.f3554b;
                AppCompatDrawableManager.AnonymousClass1.e(drawableFindDrawableByLayerId2, iB, mode3);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.c(context, R.attr.colorControlActivated), mode3);
                AppCompatDrawableManager.AnonymousClass1.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (resourceManagerHooks != null) {
            AppCompatDrawableManager.AnonymousClass1 anonymousClass1 = (AppCompatDrawableManager.AnonymousClass1) resourceManagerHooks;
            PorterDuff.Mode mode4 = AppCompatDrawableManager.f3554b;
            boolean z3 = true;
            if (AppCompatDrawableManager.AnonymousClass1.a(i2, anonymousClass1.f3557a)) {
                iRound = -1;
            } else {
                if (AppCompatDrawableManager.AnonymousClass1.a(i2, anonymousClass1.f3559c)) {
                    i3 = R.attr.colorControlActivated;
                } else {
                    boolean zA = AppCompatDrawableManager.AnonymousClass1.a(i2, anonymousClass1.d);
                    i3 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == 2131230818) {
                        iRound = Math.round(40.8f);
                        i3 = android.R.attr.colorForeground;
                    } else if (i2 != R.drawable.abc_dialog_material_background) {
                        i3 = 0;
                        z3 = false;
                    }
                }
                iRound = -1;
            }
            if (z3) {
                int[] iArr2 = DrawableUtils.f3600a;
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(AppCompatDrawableManager.c(ThemeUtils.c(context, i3), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                    return drawable;
                }
            } else if (z2) {
                return null;
            }
        } else if (z2) {
            return null;
        }
        return drawable;
    }
}
