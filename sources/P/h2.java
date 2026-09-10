package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.storage.androidcleaner.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static h2 f47662g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f47664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f47665b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f47666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.x f47668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f47661f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g2 f47663h = new g2(6);

    public static synchronized h2 b() {
        try {
            if (f47662g == null) {
                f47662g = new h2();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f47662g;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        g2 g2Var = f47663h;
        g2Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) g2Var.g(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f47666c == null) {
            this.f47666c = new TypedValue();
        }
        TypedValue typedValue = this.f47666c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            x.g gVar = (x.g) this.f47665b.get(context);
            drawableNewDrawable = null;
            if (gVar != null && (weakReference = (WeakReference) gVar.b(j10)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = y.a.b(gVar.f53499b, gVar.f53501d, j10);
                    if (iB >= 0) {
                        Object[] objArr = gVar.f53500c;
                        Object obj = objArr[iB];
                        Object obj2 = x.h.f53502a;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            gVar.f53498a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableK = null;
        if (this.f47668e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableK = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230747)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableK = com.google.android.gms.internal.consent_sdk.x.k(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableK = com.google.android.gms.internal.consent_sdk.x.k(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableK = com.google.android.gms.internal.consent_sdk.x.k(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableK == null) {
            return layerDrawableK;
        }
        layerDrawableK.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableK.getConstantState();
                if (constantState2 != null) {
                    x.g gVar2 = (x.g) this.f47665b.get(context);
                    if (gVar2 == null) {
                        gVar2 = new x.g();
                        this.f47665b.put(context, gVar2);
                    }
                    gVar2.d(j10, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableK;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10, false);
    }

    public final synchronized Drawable d(Context context, int i10, boolean z10) {
        Drawable drawableA;
        try {
            if (!this.f47667d) {
                this.f47667d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof p4.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f47667d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = context.getDrawable(i10);
            }
            if (drawableA != null) {
                drawableA = g(context, i10, z10, drawableA);
            }
            if (drawableA != null) {
                h1.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateList;
        x.j jVar;
        WeakHashMap weakHashMap = this.f47664a;
        ColorStateList colorStateListM = null;
        colorStateList = (weakHashMap == null || (jVar = (x.j) weakHashMap.get(context)) == null) ? null : (ColorStateList) jVar.b(i10);
        if (colorStateList == null) {
            com.google.android.gms.internal.consent_sdk.x xVar = this.f47668e;
            if (xVar != null) {
                colorStateListM = xVar.m(context, i10);
            }
            if (colorStateListM != null) {
                if (this.f47664a == null) {
                    this.f47664a = new WeakHashMap();
                }
                x.j jVar2 = (x.j) this.f47664a.get(context);
                if (jVar2 == null) {
                    jVar2 = new x.j();
                    this.f47664a.put(context, jVar2);
                }
                jVar2.a(i10, colorStateListM);
            }
            colorStateList = colorStateListM;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Drawable g(Context context, int i10, boolean z10, Drawable drawable) {
        int i11;
        boolean z11;
        int iRound;
        Drawable drawableMutate;
        int iC;
        ColorStateList colorStateListF = f(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.f47668e != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f47668e != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC2 = n2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = t.f47811b;
                com.google.android.gms.internal.consent_sdk.x.z(drawableFindDrawableByLayerId, iC2, mode2);
                com.google.android.gms.internal.consent_sdk.x.z(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), n2.c(context, R.attr.colorControlNormal), mode2);
                com.google.android.gms.internal.consent_sdk.x.z(layerDrawable.findDrawableByLayerId(android.R.id.progress), n2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = n2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = t.f47811b;
                com.google.android.gms.internal.consent_sdk.x.z(drawableFindDrawableByLayerId2, iB, mode3);
                com.google.android.gms.internal.consent_sdk.x.z(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), n2.c(context, R.attr.colorControlActivated), mode3);
                com.google.android.gms.internal.consent_sdk.x.z(layerDrawable2.findDrawableByLayerId(android.R.id.progress), n2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        com.google.android.gms.internal.consent_sdk.x xVar = this.f47668e;
        boolean z12 = false;
        if (xVar != null) {
            PorterDuff.Mode mode4 = t.f47811b;
            if (com.google.android.gms.internal.consent_sdk.x.c(i10, (int[]) xVar.f23260a)) {
                i11 = R.attr.colorControlNormal;
            } else if (com.google.android.gms.internal.consent_sdk.x.c(i10, (int[]) xVar.f23262c)) {
                i11 = R.attr.colorControlActivated;
            } else {
                if (com.google.android.gms.internal.consent_sdk.x.c(i10, (int[]) xVar.f23263d)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == 2131230767) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        z11 = true;
                    } else {
                        if (i10 != R.drawable.abc_dialog_material_background) {
                            i11 = 0;
                            z11 = false;
                        }
                        iRound = -1;
                    }
                    if (z11) {
                        drawableMutate = drawable.mutate();
                        iC = n2.c(context, i11);
                        synchronized (t.class) {
                            PorterDuffColorFilter porterDuffColorFilterE = e(iC, mode4);
                        }
                        drawableMutate.setColorFilter(porterDuffColorFilterE);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z12 = true;
                    }
                }
                i11 = 16842801;
            }
            z11 = true;
            iRound = -1;
            if (z11) {
                drawableMutate = drawable.mutate();
                iC = n2.c(context, i11);
                synchronized (t.class) {
                    PorterDuffColorFilter porterDuffColorFilterE2 = e(iC, mode4);
                    drawableMutate.setColorFilter(porterDuffColorFilterE2);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z12 = true;
                }
            }
        }
        if (z12 || !z10) {
            return drawable;
        }
        return null;
    }
}
