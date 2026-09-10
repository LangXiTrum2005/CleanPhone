package k;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import ea.f2;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m0.s0;
import m0.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f44138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f44142e;

    public r(v vVar, Window.Callback callback) {
        this.f44142e = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f44138a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f44139b = true;
            callback.onContentChanged();
        } finally {
            this.f44139b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f44138a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f44138a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        n.l.a(this.f44138a, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f44138a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f44140c;
        Window.Callback callback = this.f44138a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f44142e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        u uVar;
        boolean z10;
        boolean zE;
        o.m mVar;
        boolean zPerformShortcut;
        if (!this.f44138a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            v vVar = this.f44142e;
            vVar.z();
            f0 f0Var = vVar.f44175o;
            if (f0Var == null) {
                uVar = vVar.M;
                if (uVar == null && vVar.E(uVar, keyEvent.getKeyCode(), keyEvent)) {
                    u uVar2 = vVar.M;
                    if (uVar2 != null) {
                        uVar2.l = true;
                    }
                } else {
                    if (vVar.M == null) {
                        u uVarY = vVar.y(0);
                        vVar.F(uVarY, keyEvent);
                        zE = vVar.E(uVarY, keyEvent.getKeyCode(), keyEvent);
                        uVarY.f44157k = false;
                        if (zE) {
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            } else {
                e0 e0Var = f0Var.f44105i;
                if (e0Var == null || (mVar = e0Var.f44088e) == null) {
                    zPerformShortcut = false;
                } else {
                    mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = mVar.performShortcut(keyCode, keyEvent, 0);
                }
                if (zPerformShortcut) {
                    z10 = true;
                } else {
                    uVar = vVar.M;
                    if (uVar == null) {
                        if (vVar.M == null) {
                            u uVarY2 = vVar.y(0);
                            vVar.F(uVarY2, keyEvent);
                            zE = vVar.E(uVarY2, keyEvent.getKeyCode(), keyEvent);
                            uVarY2.f44157k = false;
                            if (zE) {
                                z10 = true;
                            }
                        }
                        z10 = false;
                    } else {
                        if (vVar.M == null) {
                            u uVarY3 = vVar.y(0);
                            vVar.F(uVarY3, keyEvent);
                            zE = vVar.E(uVarY3, keyEvent.getKeyCode(), keyEvent);
                            uVarY3.f44157k = false;
                            if (zE) {
                                z10 = true;
                            }
                        }
                        z10 = false;
                    }
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f44138a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f44138a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f44138a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f44138a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f44138a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f44138a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f44139b) {
            this.f44138a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof o.m)) {
            return this.f44138a.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f44138a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f44138a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f44138a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        b(i10, menu);
        if (i10 == 108) {
            v vVar = this.f44142e;
            vVar.z();
            f0 f0Var = vVar.f44175o;
            if (f0Var != null) {
                ArrayList arrayList = f0Var.f44108m;
                if (true != f0Var.l) {
                    f0Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f44141d) {
            this.f44138a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        v vVar = this.f44142e;
        if (i10 != 108) {
            if (i10 == 0) {
                u uVarY = vVar.y(i10);
                if (uVarY.f44158m) {
                    vVar.r(uVarY, false);
                    return;
                }
                return;
            }
            return;
        }
        vVar.z();
        f0 f0Var = vVar.f44175o;
        if (f0Var != null) {
            ArrayList arrayList = f0Var.f44108m;
            if (f0Var.l) {
                f0Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        n.m.a(this.f44138a, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        o.m mVar = menu instanceof o.m ? (o.m) menu : null;
        if (i10 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f46981x = true;
        }
        boolean zOnPreparePanel = this.f44138a.onPreparePanel(i10, view, menu);
        if (mVar != null) {
            mVar.f46981x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        o.m mVar = this.f44142e.y(0).f44154h;
        if (mVar != null) {
            d(list, mVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f44138a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f44138a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f44138a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        if (i10 != 0) {
            return n.k.b(this.f44138a, callback, i10);
        }
        v vVar = this.f44142e;
        Context context = vVar.f44172k;
        zc.u uVar = new zc.u(context, callback);
        n.a aVar = vVar.f44181u;
        if (aVar != null) {
            aVar.b();
        }
        f2 f2Var = new f2(23, vVar, uVar);
        vVar.z();
        f0 f0Var = vVar.f44175o;
        int i11 = 1;
        if (f0Var != null) {
            e0 e0Var = f0Var.f44105i;
            if (e0Var != null) {
                e0Var.b();
            }
            f0Var.f44099c.setHideOnContentScrollEnabled(false);
            f0Var.f44102f.e();
            e0 e0Var2 = new e0(f0Var, f0Var.f44102f.getContext(), f2Var);
            o.m mVar = e0Var2.f44088e;
            mVar.w();
            try {
                boolean zY = ((zc.u) e0Var2.f44089f.f39409b).y(e0Var2, mVar);
                mVar.v();
                if (zY) {
                    f0Var.f44105i = e0Var2;
                    e0Var2.j();
                    f0Var.f44102f.c(e0Var2);
                    f0Var.a0(true);
                } else {
                    e0Var2 = null;
                }
                vVar.f44181u = e0Var2;
            } catch (Throwable th2) {
                mVar.v();
                throw th2;
            }
        }
        if (vVar.f44181u == null) {
            w0 w0Var = vVar.f44185y;
            if (w0Var != null) {
                w0Var.b();
            }
            n.a aVar2 = vVar.f44181u;
            if (aVar2 != null) {
                aVar2.b();
            }
            if (vVar.f44182v == null) {
                if (vVar.I) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        n.c cVar = new n.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    vVar.f44182v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    vVar.f44183w = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    vVar.f44183w.setContentView(vVar.f44182v);
                    vVar.f44183w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    vVar.f44182v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    vVar.f44183w.setHeight(-2);
                    vVar.f44184x = new m(vVar, i11);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vVar.A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        vVar.z();
                        f0 f0Var2 = vVar.f44175o;
                        Context contextB0 = f0Var2 != null ? f0Var2.b0() : null;
                        if (contextB0 != null) {
                            context = contextB0;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        vVar.f44182v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vVar.f44182v != null) {
                w0 w0Var2 = vVar.f44185y;
                if (w0Var2 != null) {
                    w0Var2.b();
                }
                vVar.f44182v.e();
                Context context2 = vVar.f44182v.getContext();
                ActionBarContextView actionBarContextView = vVar.f44182v;
                n.d dVar = new n.d();
                dVar.f46273d = context2;
                dVar.f46274e = actionBarContextView;
                dVar.f46275f = f2Var;
                o.m mVar2 = new o.m(actionBarContextView.getContext());
                mVar2.l = 1;
                dVar.f46278i = mVar2;
                mVar2.f46963e = dVar;
                if (uVar.y(dVar, mVar2)) {
                    dVar.j();
                    vVar.f44182v.c(dVar);
                    vVar.f44181u = dVar;
                    if (vVar.f44186z && (viewGroup = vVar.A) != null && viewGroup.isLaidOut()) {
                        vVar.f44182v.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        w0 w0VarA = s0.a(vVar.f44182v);
                        w0VarA.a(1.0f);
                        vVar.f44185y = w0VarA;
                        w0VarA.d(new n(vVar, i11));
                    } else {
                        vVar.f44182v.setAlpha(1.0f);
                        vVar.f44182v.setVisibility(0);
                        if (vVar.f44182v.getParent() instanceof View) {
                            View view = (View) vVar.f44182v.getParent();
                            WeakHashMap weakHashMap = s0.f45746a;
                            view.requestApplyInsets();
                        }
                    }
                    if (vVar.f44183w != null) {
                        vVar.l.getDecorView().post(vVar.f44184x);
                    }
                } else {
                    vVar.f44181u = null;
                }
            }
            vVar.H();
            vVar.f44181u = vVar.f44181u;
        }
        vVar.H();
        n.a aVar3 = vVar.f44181u;
        if (aVar3 != null) {
            return uVar.q(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f44138a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
