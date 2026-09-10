package k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import m0.s0;
import p.r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends f.l implements DialogInterface, h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f44092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f44093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f44094g;

    public f(ContextThemeWrapper contextThemeWrapper, int i10) {
        int i11;
        int iE = e(contextThemeWrapper, i10);
        if (iE == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = iE;
        }
        super(contextThemeWrapper, i11);
        this.f44093f = new w(this);
        l lVarC = c();
        if (iE == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iE = typedValue2.resourceId;
        }
        ((v) lVarC).T = iE;
        lVarC.d();
        this.f44094g = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // f.l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        v vVar = (v) c();
        vVar.v();
        ((ViewGroup) vVar.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f44173m.a(vVar.l.getCallback());
    }

    public final l c() {
        if (this.f44092e == null) {
            k kVar = l.f44125a;
            this.f44092e = new v(getContext(), getWindow(), this, this);
        }
        return this.f44092e;
    }

    public final void d(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        w wVar = this.f44093f;
        if (wVar == null) {
            return false;
        }
        return wVar.f44187a.g(keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().k(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        v vVar = (v) c();
        vVar.v();
        return vVar.l.findViewById(i10);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        v vVar = (v) c();
        if (vVar.f44175o != null) {
            vVar.z();
            vVar.f44175o.getClass();
            vVar.A(0);
        }
    }

    @Override // f.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        d(bundle);
        e eVar = this.f44094g;
        eVar.f44063b.setContentView(eVar.f44081u);
        Context context = eVar.f44062a;
        Window window = eVar.f44064c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = eVar.f44067f;
        if (view == null) {
            view = null;
        }
        boolean z10 = view != null;
        if (!z10 || !e.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            charSequence = null;
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f44068g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f44066e != null) {
                ((LinearLayout.LayoutParams) ((r1) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            charSequence = null;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = e.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = e.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = e.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f44073m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f44073m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        eVar.f44077q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f44073m.removeView(eVar.f44077q);
            if (eVar.f44066e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f44073m.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(eVar.f44073m);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(eVar.f44066e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        eVar.f44069h = button;
        a aVar = eVar.A;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(charSequence)) {
            eVar.f44069h.setVisibility(8);
            i10 = 0;
        } else {
            eVar.f44069h.setText(charSequence);
            eVar.f44069h.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        eVar.f44070i = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(eVar.f44071j)) {
            eVar.f44070i.setVisibility(8);
        } else {
            eVar.f44070i.setText(eVar.f44071j);
            eVar.f44070i.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        eVar.l = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            eVar.l.setVisibility(8);
        } else {
            eVar.l.setText((CharSequence) null);
            eVar.l.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = eVar.f44069h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = eVar.f44070i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = eVar.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (eVar.f44078r != null) {
            viewGroupB.addView(eVar.f44078r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f44075o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.f44065d) || !eVar.f44085y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f44075o.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f44076p = textView2;
                textView2.setText(eVar.f44065d);
                Drawable drawable = eVar.f44074n;
                if (drawable != null) {
                    eVar.f44075o.setImageDrawable(drawable);
                } else {
                    eVar.f44076p.setPadding(eVar.f44075o.getPaddingLeft(), eVar.f44075o.getPaddingTop(), eVar.f44075o.getPaddingRight(), eVar.f44075o.getPaddingBottom());
                    eVar.f44075o.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupB3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f44073m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = eVar.f44066e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f44066e;
        if (alertController$RecycleListView != null && (!z12 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f3835a, alertController$RecycleListView.getPaddingRight(), z12 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f3836b);
        }
        if (!z11) {
            View view2 = eVar.f44066e;
            if (view2 == null) {
                view2 = eVar.f44073m;
            }
            if (view2 != null) {
                int i12 = z12 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = s0.f45746a;
                view2.setScrollIndicators(i11 | i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f44066e;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f44079s) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = eVar.f44080t;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f44094g.f44073m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f44094g.f44073m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // f.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v vVar = (v) c();
        vVar.z();
        f0 f0Var = vVar.f44175o;
        if (f0Var != null) {
            f0Var.f44115t = false;
            n.j jVar = f0Var.f44114s;
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    @Override // f.l, android.app.Dialog
    public final void setContentView(int i10) {
        b();
        c().h(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        c().k(getContext().getString(i10));
    }

    @Override // f.l, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        e eVar = this.f44094g;
        eVar.f44065d = charSequence;
        TextView textView = eVar.f44076p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // f.l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().j(view, layoutParams);
    }
}
