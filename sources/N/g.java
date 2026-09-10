package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import d5.u;
import java.lang.reflect.Constructor;
import o.o;
import o.p;
import o.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f46284a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f46294k;
    public CharSequence l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f46296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f46298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f46299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f46301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f46303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f46304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f46305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f46306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f46307y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f46308z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46285b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46286c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46287d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46288e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46289f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46290g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f46284a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f46313c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f46313c;
        boolean z10 = false;
        menuItem.setChecked(this.f46301s).setVisible(this.f46302t).setEnabled(this.f46303u).setCheckable(this.f46300r >= 1).setTitleCondensed(this.l).setIcon(this.f46295m);
        int i10 = this.f46304v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f46307y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f46314d == null) {
                hVar.f46314d = h.a(context);
            }
            Object obj = hVar.f46314d;
            String str = this.f46307y;
            f fVar = new f();
            fVar.f46282a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f46283b = cls.getMethod(str, f.f46281c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e10) {
                StringBuilder sbK = u.k("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbK.append(cls.getName());
                InflateException inflateException = new InflateException(sbK.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f46300r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f47007x = (oVar.f47007x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                h0.a aVar = tVar.f47017c;
                try {
                    if (tVar.f47018d == null) {
                        tVar.f47018d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f47018d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.f46306x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f46309e, hVar.f46311a));
            z10 = true;
        }
        int i11 = this.f46305w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        p pVar = this.f46308z;
        if (pVar != null) {
            if (menuItem instanceof h0.a) {
                ((h0.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof h0.a;
        if (z11) {
            ((h0.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((h0.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c4 = this.f46296n;
        int i12 = this.f46297o;
        if (z11) {
            ((h0.a) menuItem).setAlphabeticShortcut(c4, i12);
        } else {
            menuItem.setAlphabeticShortcut(c4, i12);
        }
        char c5 = this.f46298p;
        int i13 = this.f46299q;
        if (z11) {
            ((h0.a) menuItem).setNumericShortcut(c5, i13);
        } else {
            menuItem.setNumericShortcut(c5, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((h0.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((h0.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
