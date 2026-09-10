package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.overspeculate;
import androidx.collection.splinterproof;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourceManagerInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class cuirassed {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static cuirassed f5430taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public WeakHashMap<Context, overspeculate<ColorStateList>> f5431attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f5432beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public dern f5433competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public overspeculate<String> f5434dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public TypedValue f5435marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public splinterproof<String, saneness> f5436saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final WeakHashMap<Context, androidx.collection.gintrap<WeakReference<Drawable.ConstantState>>> f5437wireman = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final PorterDuff.Mode f5429impromptu = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final attabal f5428cutely = new attabal(6);

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class attabal extends androidx.collection.preprohormone<Integer, PorterDuffColorFilter> {
        public attabal(int i) {
            super(i);
        }

        public static int attabal(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter dern(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(attabal(i, mode)), porterDuffColorFilter);
        }

        public PorterDuffColorFilter saneness(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(attabal(i, mode)));
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public interface dern {
        Drawable attabal(cuirassed cuirassedVar, Context context, int i);

        boolean dern(Context context, int i, Drawable drawable);

        boolean marial(Context context, int i, Drawable drawable);

        ColorStateList saneness(Context context, int i);

        PorterDuff.Mode wireman(int i);
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public interface saneness {
        Drawable attabal(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static synchronized PorterDuffColorFilter apical(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterSaneness;
        attabal attabalVar = f5428cutely;
        porterDuffColorFilterSaneness = attabalVar.saneness(i, mode);
        if (porterDuffColorFilterSaneness == null) {
            porterDuffColorFilterSaneness = new PorterDuffColorFilter(i, mode);
            attabalVar.dern(i, mode, porterDuffColorFilterSaneness);
        }
        return porterDuffColorFilterSaneness;
    }

    public static boolean arytenoidectomy(Drawable drawable) {
        return (drawable instanceof weimar.competently) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static PorterDuffColorFilter beachfront(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return apical(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized cuirassed competently() {
        try {
            if (f5430taiyuan == null) {
                cuirassed cuirassedVar = new cuirassed();
                f5430taiyuan = cuirassedVar;
                kowloon(cuirassedVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5430taiyuan;
    }

    public static void dovishness(Drawable drawable, kattegat kattegatVar, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = kattegatVar.f5491wireman;
            if (z || kattegatVar.f5489dern) {
                drawable.setColorFilter(beachfront(z ? kattegatVar.f5488attabal : null, kattegatVar.f5489dern ? kattegatVar.f5490saneness : f5429impromptu, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public static long wireman(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public final Drawable adultoid(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListFormularize = formularize(context, i);
        if (colorStateListFormularize != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTintList(drawableWrap, colorStateListFormularize);
            PorterDuff.Mode modeTriweekly = triweekly(i);
            if (modeTriweekly != null) {
                DrawableCompat.setTintMode(drawableWrap, modeTriweekly);
            }
            return drawableWrap;
        }
        dern dernVar = this.f5433competently;
        if ((dernVar == null || !dernVar.marial(context, i, drawable)) && !gintrap(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public final synchronized boolean attabal(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.gintrap<WeakReference<Drawable.ConstantState>> gintrapVar = this.f5437wireman.get(context);
            if (gintrapVar == null) {
                gintrapVar = new androidx.collection.gintrap<>();
                this.f5437wireman.put(context, gintrapVar);
            }
            gintrapVar.taiyuan(j, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Drawable cutely(Context context, int i, boolean z) {
        Drawable drawableMonoploid;
        try {
            dern(context);
            drawableMonoploid = monoploid(context, i);
            if (drawableMonoploid == null) {
                drawableMonoploid = marial(context, i);
            }
            if (drawableMonoploid == null) {
                drawableMonoploid = picketboat.saneness.getDrawable(context, i);
            }
            if (drawableMonoploid != null) {
                drawableMonoploid = adultoid(context, i, z, drawableMonoploid);
            }
            if (drawableMonoploid != null) {
                dovishness.saneness(drawableMonoploid);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableMonoploid;
    }

    public final void dern(Context context) {
        if (this.f5432beachfront) {
            return;
        }
        this.f5432beachfront = true;
        Drawable drawableTaiyuan = taiyuan(context, taiyuan.attabal.abc_vector_test);
        if (drawableTaiyuan == null || !arytenoidectomy(drawableTaiyuan)) {
            this.f5432beachfront = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public synchronized ColorStateList formularize(Context context, int i) {
        ColorStateList colorStateListImpassible;
        colorStateListImpassible = impassible(context, i);
        if (colorStateListImpassible == null) {
            dern dernVar = this.f5433competently;
            colorStateListImpassible = dernVar == null ? null : dernVar.saneness(context, i);
            if (colorStateListImpassible != null) {
                saneness(context, i, colorStateListImpassible);
            }
        }
        return colorStateListImpassible;
    }

    public boolean gintrap(Context context, int i, Drawable drawable) {
        dern dernVar = this.f5433competently;
        return dernVar != null && dernVar.dern(context, i, drawable);
    }

    public synchronized void graveside(dern dernVar) {
        this.f5433competently = dernVar;
    }

    public final ColorStateList impassible(Context context, int i) {
        overspeculate<ColorStateList> overspeculateVar;
        WeakHashMap<Context, overspeculate<ColorStateList>> weakHashMap = this.f5431attabal;
        if (weakHashMap == null || (overspeculateVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return overspeculateVar.beachfront(i);
    }

    public final synchronized Drawable impromptu(Context context, long j) {
        androidx.collection.gintrap<WeakReference<Drawable.ConstantState>> gintrapVar = this.f5437wireman.get(context);
        if (gintrapVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceMarial = gintrapVar.marial(j);
        if (weakReferenceMarial != null) {
            Drawable.ConstantState constantState = weakReferenceMarial.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            gintrapVar.apical(j);
        }
        return null;
    }

    public final Drawable marial(Context context, int i) {
        if (this.f5435marial == null) {
            this.f5435marial = new TypedValue();
        }
        TypedValue typedValue = this.f5435marial;
        context.getResources().getValue(i, typedValue, true);
        long jWireman = wireman(typedValue);
        Drawable drawableImpromptu = impromptu(context, jWireman);
        if (drawableImpromptu != null) {
            return drawableImpromptu;
        }
        dern dernVar = this.f5433competently;
        Drawable drawableAttabal = dernVar == null ? null : dernVar.attabal(this, context, i);
        if (drawableAttabal != null) {
            drawableAttabal.setChangingConfigurations(typedValue.changingConfigurations);
            attabal(context, jWireman, drawableAttabal);
        }
        return drawableAttabal;
    }

    public synchronized Drawable molybdenite(Context context, walach walachVar, int i) {
        try {
            Drawable drawableMonoploid = monoploid(context, i);
            if (drawableMonoploid == null) {
                drawableMonoploid = walachVar.attabal(i);
            }
            if (drawableMonoploid == null) {
                return null;
            }
            return adultoid(context, i, false, drawableMonoploid);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable monoploid(Context context, int i) {
        int next;
        splinterproof<String, saneness> splinterproofVar = this.f5436saneness;
        if (splinterproofVar == null || splinterproofVar.isEmpty()) {
            return null;
        }
        overspeculate<String> overspeculateVar = this.f5434dern;
        if (overspeculateVar != null) {
            String strBeachfront = overspeculateVar.beachfront(i);
            if ("appcompat_skip_skip".equals(strBeachfront) || (strBeachfront != null && this.f5436saneness.get(strBeachfront) == null)) {
                return null;
            }
        } else {
            this.f5434dern = new overspeculate<>();
        }
        if (this.f5435marial == null) {
            this.f5435marial = new TypedValue();
        }
        TypedValue typedValue = this.f5435marial;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jWireman = wireman(typedValue);
        Drawable drawableImpromptu = impromptu(context, jWireman);
        if (drawableImpromptu != null) {
            return drawableImpromptu;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f5434dern.attabal(i, name);
                saneness sanenessVar = this.f5436saneness.get(name);
                if (sanenessVar != null) {
                    drawableImpromptu = sanenessVar.attabal(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableImpromptu != null) {
                    drawableImpromptu.setChangingConfigurations(typedValue.changingConfigurations);
                    attabal(context, jWireman, drawableImpromptu);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableImpromptu == null) {
            this.f5434dern.attabal(i, "appcompat_skip_skip");
        }
        return drawableImpromptu;
    }

    public synchronized void polloi(Context context) {
        androidx.collection.gintrap<WeakReference<Drawable.ConstantState>> gintrapVar = this.f5437wireman.get(context);
        if (gintrapVar != null) {
            gintrapVar.attabal();
        }
    }

    public final void saneness(Context context, int i, ColorStateList colorStateList) {
        if (this.f5431attabal == null) {
            this.f5431attabal = new WeakHashMap<>();
        }
        overspeculate<ColorStateList> overspeculateVar = this.f5431attabal.get(context);
        if (overspeculateVar == null) {
            overspeculateVar = new overspeculate<>();
            this.f5431attabal.put(context, overspeculateVar);
        }
        overspeculateVar.attabal(i, colorStateList);
    }

    public synchronized Drawable taiyuan(Context context, int i) {
        return cutely(context, i, false);
    }

    public PorterDuff.Mode triweekly(int i) {
        dern dernVar = this.f5433competently;
        if (dernVar == null) {
            return null;
        }
        return dernVar.wireman(i);
    }

    public static void kowloon(cuirassed cuirassedVar) {
    }
}
