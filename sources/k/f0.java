package k;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import ea.f2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.s0;
import m0.w0;
import p.f1;
import p.x2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends go.k implements p.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f44095y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f44096z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f44098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f44099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f44100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1 f44101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f44102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f44103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f44105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f44106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f2 f44107k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f44108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n.j f44114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44115t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f44116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0 f44117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0 f44118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final od.c f44119x;

    public f0(Activity activity, boolean z10) {
        new ArrayList();
        this.f44108m = new ArrayList();
        this.f44109n = 0;
        this.f44110o = true;
        this.f44113r = true;
        this.f44117v = new d0(this, 0);
        this.f44118w = new d0(this, 1);
        this.f44119x = new od.c(this, 13);
        View decorView = activity.getWindow().getDecorView();
        c0(decorView);
        if (z10) {
            return;
        }
        this.f44103g = decorView.findViewById(R.id.content);
    }

    public final void a0(boolean z10) {
        w0 w0VarI;
        w0 w0VarI2;
        if (z10) {
            if (!this.f44112q) {
                this.f44112q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f44099c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f0(false);
            }
        } else if (this.f44112q) {
            this.f44112q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f44099c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f0(false);
        }
        if (!this.f44100d.isLaidOut()) {
            if (z10) {
                ((x2) this.f44101e).f47854a.setVisibility(4);
                this.f44102f.setVisibility(0);
                return;
            } else {
                ((x2) this.f44101e).f47854a.setVisibility(0);
                this.f44102f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            x2 x2Var = (x2) this.f44101e;
            w0VarI = s0.a(x2Var.f47854a);
            w0VarI.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            w0VarI.c(100L);
            w0VarI.d(new n.i(x2Var, 4));
            w0VarI2 = this.f44102f.i(0, 200L);
        } else {
            x2 x2Var2 = (x2) this.f44101e;
            w0 w0VarA = s0.a(x2Var2.f47854a);
            w0VarA.a(1.0f);
            w0VarA.c(200L);
            w0VarA.d(new n.i(x2Var2, 0));
            w0VarI = this.f44102f.i(8, 100L);
            w0VarI2 = w0VarA;
        }
        n.j jVar = new n.j();
        ArrayList arrayList = (ArrayList) jVar.f46321c;
        arrayList.add(w0VarI);
        View view = (View) w0VarI.f45759a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) w0VarI2.f45759a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(w0VarI2);
        jVar.f();
    }

    public final Context b0() {
        if (this.f44098b == null) {
            TypedValue typedValue = new TypedValue();
            this.f44097a.getTheme().resolveAttribute(com.storage.androidcleaner.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f44098b = new ContextThemeWrapper(this.f44097a, i10);
            } else {
                this.f44098b = this.f44097a;
            }
        }
        return this.f44098b;
    }

    public final void c0(View view) {
        f1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.storage.androidcleaner.R.id.decor_content_parent);
        this.f44099c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.storage.androidcleaner.R.id.action_bar);
        if (callbackFindViewById instanceof f1) {
            wrapper = (f1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f44101e = wrapper;
        this.f44102f = (ActionBarContextView) view.findViewById(com.storage.androidcleaner.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.storage.androidcleaner.R.id.action_bar_container);
        this.f44100d = actionBarContainer;
        f1 f1Var = this.f44101e;
        if (f1Var == null || this.f44102f == null || actionBarContainer == null) {
            throw new IllegalStateException(f0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((x2) f1Var).f47854a.getContext();
        this.f44097a = context;
        if ((((x2) this.f44101e).f47855b & 4) != 0) {
            this.f44104h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f44101e.getClass();
        e0(context.getResources().getBoolean(com.storage.androidcleaner.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f44097a.obtainStyledAttributes(null, j.a.f43517a, com.storage.androidcleaner.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f44099c;
            if (!actionBarOverlayLayout2.f3900g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f44116u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f44100d;
            WeakHashMap weakHashMap = s0.f45746a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d0(boolean z10) {
        if (this.f44104h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        x2 x2Var = (x2) this.f44101e;
        int i11 = x2Var.f47855b;
        this.f44104h = true;
        x2Var.a((i10 & 4) | (i11 & (-5)));
    }

    public final void e0(boolean z10) {
        if (z10) {
            this.f44100d.setTabContainer(null);
            ((x2) this.f44101e).getClass();
        } else {
            ((x2) this.f44101e).getClass();
            this.f44100d.setTabContainer(null);
        }
        this.f44101e.getClass();
        ((x2) this.f44101e).f47854a.setCollapsible(false);
        this.f44099c.setHasNonEmbeddedTabs(false);
    }

    public final void f0(boolean z10) {
        boolean z11 = this.f44111p;
        boolean z12 = this.f44112q;
        final od.c cVar = this.f44119x;
        View view = this.f44103g;
        if (!z12 && z11) {
            if (this.f44113r) {
                this.f44113r = false;
                n.j jVar = this.f44114s;
                if (jVar != null) {
                    jVar.b();
                }
                int i10 = this.f44109n;
                d0 d0Var = this.f44117v;
                if (i10 != 0 || (!this.f44115t && !z10)) {
                    d0Var.c();
                    return;
                }
                this.f44100d.setAlpha(1.0f);
                this.f44100d.setTransitioning(true);
                n.j jVar2 = new n.j();
                ArrayList arrayList = (ArrayList) jVar2.f46321c;
                float f10 = -this.f44100d.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.f44100d.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                w0 w0VarA = s0.a(this.f44100d);
                w0VarA.e(f10);
                final View view2 = (View) w0VarA.f45759a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: m0.u0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((k.f0) cVar.f47386b).f44100d.getParent()).invalidate();
                        }
                    } : null);
                }
                if (!jVar2.f46320b) {
                    arrayList.add(w0VarA);
                }
                if (this.f44110o && view != null) {
                    w0 w0VarA2 = s0.a(view);
                    w0VarA2.e(f10);
                    if (!jVar2.f46320b) {
                        arrayList.add(w0VarA2);
                    }
                }
                boolean z13 = jVar2.f46320b;
                if (!z13) {
                    jVar2.f46322d = f44095y;
                }
                if (!z13) {
                    jVar2.f46319a = 250L;
                }
                if (!z13) {
                    jVar2.f46323e = d0Var;
                }
                this.f44114s = jVar2;
                jVar2.f();
                return;
            }
            return;
        }
        if (this.f44113r) {
            return;
        }
        this.f44113r = true;
        n.j jVar3 = this.f44114s;
        if (jVar3 != null) {
            jVar3.b();
        }
        this.f44100d.setVisibility(0);
        int i11 = this.f44109n;
        d0 d0Var2 = this.f44118w;
        if (i11 == 0 && (this.f44115t || z10)) {
            this.f44100d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f11 = -this.f44100d.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f44100d.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f44100d.setTranslationY(f11);
            n.j jVar4 = new n.j();
            ArrayList arrayList2 = (ArrayList) jVar4.f46321c;
            w0 w0VarA3 = s0.a(this.f44100d);
            w0VarA3.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            final View view3 = (View) w0VarA3.f45759a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: m0.u0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((k.f0) cVar.f47386b).f44100d.getParent()).invalidate();
                    }
                } : null);
            }
            if (!jVar4.f46320b) {
                arrayList2.add(w0VarA3);
            }
            if (this.f44110o && view != null) {
                view.setTranslationY(f11);
                w0 w0VarA4 = s0.a(view);
                w0VarA4.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (!jVar4.f46320b) {
                    arrayList2.add(w0VarA4);
                }
            }
            boolean z14 = jVar4.f46320b;
            if (!z14) {
                jVar4.f46322d = f44096z;
            }
            if (!z14) {
                jVar4.f46319a = 250L;
            }
            if (!z14) {
                jVar4.f46323e = d0Var2;
            }
            this.f44114s = jVar4;
            jVar4.f();
        } else {
            this.f44100d.setAlpha(1.0f);
            this.f44100d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.f44110o && view != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            d0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f44099c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = s0.f45746a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public f0(Dialog dialog) {
        new ArrayList();
        this.f44108m = new ArrayList();
        this.f44109n = 0;
        this.f44110o = true;
        this.f44113r = true;
        this.f44117v = new d0(this, 0);
        this.f44118w = new d0(this, 1);
        this.f44119x = new od.c(this, 13);
        c0(dialog.getWindow().getDecorView());
    }
}
