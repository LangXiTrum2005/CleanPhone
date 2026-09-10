package k;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.q00;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m0.l0;
import m0.s0;
import m0.w0;
import p.c1;
import p.e1;
import p.f1;
import p.q0;
import p.s2;
import p.x0;
import p.x2;
import p.z2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends l implements o.k, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final x.i f44162h0 = new x.i(0);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int[] f44163i0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final boolean f44164j0 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public u[] L;
    public u M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public s W;
    public s X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f44166b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Rect f44167c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Rect f44168d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public y f44169e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f44170f0;
    public OnBackInvokedCallback g0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f44171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f44172k;
    public Window l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f44173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f44174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f0 f44175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n.h f44176p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f44177q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e1 f44178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n5.f f44179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public am.e f44180t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n.a f44181u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f44182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f44183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f44184x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44186z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w0 f44185y = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final m f44165a0 = new m(this, 0);

    public v(Context context, Window window, h hVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.S = -100;
        this.f44172k = context;
        this.f44174n = hVar;
        this.f44171j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.S = ((v) appCompatActivity.H()).S;
            }
        }
        if (this.S == -100) {
            String name = this.f44171j.getClass().getName();
            x.i iVar = f44162h0;
            Integer num = (Integer) iVar.get(name);
            if (num != null) {
                this.S = num.intValue();
                iVar.remove(this.f44171j.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        p.t.c();
    }

    public static i0.e n(Context context) {
        i0.e eVar;
        i0.e eVar2;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = l.f44127c) == null) {
            return null;
        }
        i0.f fVar = eVar.f42488a;
        i0.e eVarB = p.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.f42489a.isEmpty()) {
            eVar2 = i0.e.f42487b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < eVarB.f42488a.f42489a.size() + fVar.f42489a.size()) {
                Locale locale = i10 < fVar.f42489a.size() ? fVar.f42489a.get(i10) : eVarB.f42488a.f42489a.get(i10 - fVar.f42489a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            eVar2 = new i0.e(new i0.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return eVar2.f42488a.f42489a.isEmpty() ? eVarB : eVar2;
    }

    public static Configuration s(Context context, int i10, i0.e eVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            p.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final void A(int i10) {
        this.Z = (1 << i10) | this.Z;
        if (this.Y) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = s0.f45746a;
        decorView.postOnAnimation(this.f44165a0);
        this.Y = true;
    }

    public final int B(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.X == null) {
                            this.X = new s(this, context);
                        }
                        return this.X.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).g();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean C() {
        f1 f1Var;
        s2 s2Var;
        boolean z10 = this.N;
        this.N = false;
        u uVarY = y(0);
        if (!uVarY.f44158m) {
            n.a aVar = this.f44181u;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            z();
            f0 f0Var = this.f44175o;
            if (f0Var == null || (f1Var = f0Var.f44101e) == null || (s2Var = ((x2) f1Var).f47854a.L) == null || s2Var.f47809b == null) {
                return false;
            }
            s2 s2Var2 = ((x2) f1Var).f47854a.L;
            o.o oVar = s2Var2 == null ? null : s2Var2.f47809b;
            if (oVar != null) {
                oVar.collapseActionView();
            }
        } else if (!z10) {
            r(uVarY, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0177, code lost:
    
        if (r2.f46951f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(k.u r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.v.D(k.u, android.view.KeyEvent):void");
    }

    public final boolean E(u uVar, int i10, KeyEvent keyEvent) {
        o.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f44157k || F(uVar, keyEvent)) && (mVar = uVar.f44154h) != null) {
            return mVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    public final boolean F(u uVar, KeyEvent keyEvent) {
        o.m mVar;
        e1 e1Var;
        e1 e1Var2;
        Resources.Theme themeNewTheme;
        e1 e1Var3;
        e1 e1Var4;
        if (!this.Q) {
            boolean z10 = uVar.f44157k;
            int i10 = uVar.f44147a;
            if (z10) {
                return true;
            }
            u uVar2 = this.M;
            if (uVar2 != null && uVar2 != uVar) {
                r(uVar2, false);
            }
            Window.Callback callback = this.l.getCallback();
            if (callback != null) {
                uVar.f44153g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (e1Var4 = this.f44178r) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) e1Var4;
                actionBarOverlayLayout.k();
                ((x2) actionBarOverlayLayout.f3898e).l = true;
            }
            if (uVar.f44153g == null) {
                o.m mVar2 = uVar.f44154h;
                if (mVar2 == null || uVar.f44160o) {
                    if (mVar2 == null) {
                        Context context = this.f44172k;
                        if ((i10 == 0 || i10 == 108) && this.f44178r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.storage.androidcleaner.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.storage.androidcleaner.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.storage.androidcleaner.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                n.c cVar = new n.c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        o.m mVar3 = new o.m(context);
                        mVar3.f46963e = this;
                        o.m mVar4 = uVar.f44154h;
                        if (mVar3 != mVar4) {
                            if (mVar4 != null) {
                                mVar4.r(uVar.f44155i);
                            }
                            uVar.f44154h = mVar3;
                            o.i iVar = uVar.f44155i;
                            if (iVar != null) {
                                mVar3.b(iVar, mVar3.f46959a);
                            }
                        }
                        if (uVar.f44154h != null) {
                            if (z11 && (e1Var2 = this.f44178r) != null) {
                                if (this.f44179s == null) {
                                    this.f44179s = new n5.f(this, 19);
                                }
                                ((ActionBarOverlayLayout) e1Var2).l(uVar.f44154h, this.f44179s);
                            }
                            uVar.f44154h.w();
                            if (callback.onCreatePanelMenu(i10, uVar.f44154h)) {
                                uVar.f44160o = false;
                            } else {
                                mVar = uVar.f44154h;
                                if (mVar != null) {
                                    if (mVar != null) {
                                        mVar.r(uVar.f44155i);
                                    }
                                    uVar.f44154h = null;
                                }
                                if (z11 && (e1Var = this.f44178r) != null) {
                                    ((ActionBarOverlayLayout) e1Var).l(null, this.f44179s);
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            if (this.f44179s == null) {
                                this.f44179s = new n5.f(this, 19);
                            }
                            ((ActionBarOverlayLayout) e1Var2).l(uVar.f44154h, this.f44179s);
                        }
                        uVar.f44154h.w();
                        if (callback.onCreatePanelMenu(i10, uVar.f44154h)) {
                            mVar = uVar.f44154h;
                            if (mVar != null) {
                                if (mVar != null) {
                                    mVar.r(uVar.f44155i);
                                }
                                uVar.f44154h = null;
                            }
                            if (z11) {
                                ((ActionBarOverlayLayout) e1Var).l(null, this.f44179s);
                            }
                        } else {
                            uVar.f44160o = false;
                        }
                    }
                }
                uVar.f44154h.w();
                Bundle bundle = uVar.f44161p;
                if (bundle != null) {
                    uVar.f44154h.s(bundle);
                    uVar.f44161p = null;
                }
                if (!callback.onPreparePanel(0, uVar.f44153g, uVar.f44154h)) {
                    if (z11 && (e1Var3 = this.f44178r) != null) {
                        ((ActionBarOverlayLayout) e1Var3).l(null, this.f44179s);
                    }
                    uVar.f44154h.v();
                    return false;
                }
                uVar.f44154h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                uVar.f44154h.v();
            }
            uVar.f44157k = true;
            uVar.l = false;
            this.M = uVar;
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.f44186z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f44170f0 != null && (y(0).f44158m || this.f44181u != null)) {
                z10 = true;
            }
            if (z10 && this.g0 == null) {
                this.g0 = q.b(this.f44170f0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.g0) == null) {
                    return;
                }
                q.c(this.f44170f0, onBackInvokedCallback);
                this.g0 = null;
            }
        }
    }

    @Override // k.l
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f44172k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // o.k
    public final boolean c(o.m mVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            o.m mVarK = mVar.k();
            u[] uVarArr = this.L;
            int length = uVarArr != null ? uVarArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                uVar = uVarArr[i10];
                if (uVar != null && uVar.f44154h == mVarK) {
                    if (uVar != null) {
                        return callback.onMenuItemSelected(uVar.f44147a, menuItem);
                    }
                }
            }
            uVar = null;
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f44147a, menuItem);
            }
        }
        return false;
    }

    @Override // k.l
    public final void d() {
        String strE;
        this.O = true;
        l(false, true);
        w();
        Object obj = this.f44171j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strE = b0.b.e(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            if (strE != null) {
                f0 f0Var = this.f44175o;
                if (f0Var == null) {
                    this.f44166b0 = true;
                } else {
                    f0Var.d0(true);
                }
            }
            synchronized (l.f44132h) {
                l.f(this);
                l.f44131g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.f44172k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // k.l
    public final void e() {
        if (this.f44171j instanceof Activity) {
            synchronized (l.f44132h) {
                l.f(this);
            }
        }
        if (this.Y) {
            this.l.getDecorView().removeCallbacks(this.f44165a0);
        }
        this.Q = true;
        if (this.S != -100) {
            Object obj = this.f44171j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f44162h0.put(this.f44171j.getClass().getName(), Integer.valueOf(this.S));
            } else {
                f44162h0.remove(this.f44171j.getClass().getName());
            }
        } else {
            f44162h0.remove(this.f44171j.getClass().getName());
        }
        s sVar = this.W;
        if (sVar != null) {
            sVar.c();
        }
        s sVar2 = this.X;
        if (sVar2 != null) {
            sVar2.c();
        }
    }

    @Override // k.l
    public final boolean g(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.J && i10 == 108) {
            return false;
        }
        if (this.F && i10 == 1) {
            this.F = false;
        }
        if (i10 == 1) {
            G();
            this.J = true;
            return true;
        }
        if (i10 == 2) {
            G();
            this.D = true;
            return true;
        }
        if (i10 == 5) {
            G();
            this.E = true;
            return true;
        }
        if (i10 == 10) {
            G();
            this.H = true;
            return true;
        }
        if (i10 == 108) {
            G();
            this.F = true;
            return true;
        }
        if (i10 != 109) {
            return this.l.requestFeature(i10);
        }
        G();
        this.G = true;
        return true;
    }

    @Override // k.l
    public final void h(int i10) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f44172k).inflate(i10, viewGroup);
        this.f44173m.a(this.l.getCallback());
    }

    @Override // k.l
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f44173m.a(this.l.getCallback());
    }

    @Override // k.l
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f44173m.a(this.l.getCallback());
    }

    @Override // k.l
    public final void k(CharSequence charSequence) {
        this.f44177q = charSequence;
        e1 e1Var = this.f44178r;
        if (e1Var != null) {
            e1Var.setWindowTitle(charSequence);
            return;
        }
        f0 f0Var = this.f44175o;
        if (f0Var == null) {
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        x2 x2Var = (x2) f0Var.f44101e;
        if (x2Var.f47860g) {
            return;
        }
        Toolbar toolbar = x2Var.f47854a;
        x2Var.f47861h = charSequence;
        if ((x2Var.f47855b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x2Var.f47860g) {
                s0.g(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        if (this.Q) {
            return false;
        }
        int i11 = this.S;
        if (i11 == -100) {
            i11 = l.f44126b;
        }
        Context context = this.f44172k;
        int iB = B(context, i11);
        i0.e eVarN = Build.VERSION.SDK_INT < 33 ? n(context) : null;
        if (!z11 && eVarN != null) {
            eVarN = p.b(context.getResources().getConfiguration());
        }
        Configuration configurationS = s(context, iB, eVarN, null, false);
        boolean z13 = this.V;
        boolean z14 = true;
        Object obj = this.f44171j;
        if (z13 || !(obj instanceof Activity)) {
            this.V = true;
            i10 = this.U;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.U = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.U = 0;
                }
                this.V = true;
                i10 = this.U;
            }
        }
        Configuration configuration = this.R;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i12 = configuration.uiMode & 48;
        int i13 = configurationS.uiMode & 48;
        i0.e eVarB = p.b(configuration);
        i0.e eVarB2 = eVarN == null ? null : p.b(configurationS);
        int i14 = i12 != i13 ? 512 : 0;
        if (eVarB2 != null && !eVarB.equals(eVarB2)) {
            i14 |= 8196;
        }
        if (((~i10) & i14) != 0 && z10 && this.O && ((f44164j0 || this.P) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z12 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i14 & Segment.SIZE) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationS.getLayoutDirection());
                }
                activity.recreate();
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i14 == 0) {
            z14 = z12;
        } else {
            boolean z15 = (i14 & i10) == i14;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i13;
            if (eVarB2 != null) {
                p.d(configuration2, eVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i15 = this.T;
            if (i15 != 0) {
                context.setTheme(i15);
                context.getTheme().applyStyle(this.T, true);
            }
            if (z15 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof androidx.lifecycle.v) {
                    if (((androidx.lifecycle.x) ((androidx.lifecycle.v) activity2).getLifecycle()).f4609d.compareTo(androidx.lifecycle.n.f4566c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.P && !this.Q) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (eVarB2 != null) {
            p.c(p.b(context.getResources().getConfiguration()));
        }
        if (i11 == 0) {
            x(context).n();
        } else {
            s sVar = this.W;
            if (sVar != null) {
                sVar.c();
            }
        }
        if (i11 == 3) {
            if (this.X == null) {
                this.X = new s(this, context);
            }
            this.X.n();
        } else {
            s sVar2 = this.X;
            if (sVar2 != null) {
                sVar2.c();
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void m(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof r) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        r rVar = new r(this, callback);
        this.f44173m = rVar;
        window.setCallback(rVar);
        Context context = this.f44172k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f44163i0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            p.t tVarA = p.t.a();
            synchronized (tVarA) {
                drawableD = tVarA.f47813a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f44170f0) != null) {
            return;
        }
        Object obj = this.f44171j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.g0) != null) {
            q.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f44170f0 = q.a(activity);
            } else {
                this.f44170f0 = null;
            }
        } else {
            this.f44170f0 = null;
        }
        H();
    }

    public final void o(int i10, u uVar, o.m mVar) {
        if (mVar == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.L;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                mVar = uVar.f44154h;
            }
        }
        if ((uVar == null || uVar.f44158m) && !this.Q) {
            r rVar = this.f44173m;
            Window.Callback callback = this.l.getCallback();
            rVar.getClass();
            try {
                rVar.f44141d = true;
                callback.onPanelClosed(i10, mVar);
            } finally {
                rVar.f44141d = false;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View d0Var;
        View view2 = null;
        if (this.f44169e0 == null) {
            int[] iArr = j.a.f43526j;
            Context context2 = this.f44172k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f44169e0 = new y();
            } else {
                try {
                    this.f44169e0 = (y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f44169e0 = new y();
                }
            }
        }
        y yVar = this.f44169e0;
        int i10 = z2.f47877a;
        yVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.f43540y, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof n.c) && ((n.c) context).f46268a == resourceId)) ? context : new n.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b10 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                d0Var = new p.d0(cVar, attributeSet);
                break;
            case 1:
                d0Var = new p.r(cVar, attributeSet);
                break;
            case 2:
                d0Var = new p.z(cVar, attributeSet);
                break;
            case 3:
                d0Var = new x0(cVar, attributeSet);
                break;
            case 4:
                d0Var = new p.x(cVar, attributeSet, com.storage.androidcleaner.R.attr.imageButtonStyle);
                break;
            case 5:
                d0Var = new p.f0(cVar, attributeSet);
                break;
            case 6:
                d0Var = new q0(cVar, attributeSet);
                break;
            case 7:
                d0Var = new p.c0(cVar, attributeSet);
                break;
            case 8:
                d0Var = new c1(cVar, attributeSet);
                break;
            case 9:
                d0Var = new AppCompatImageView(cVar, attributeSet);
                break;
            case 10:
                d0Var = new p.n(cVar, attributeSet);
                break;
            case 11:
                d0Var = new p.q(cVar, attributeSet);
                break;
            case 12:
                d0Var = new p.v(cVar, attributeSet);
                break;
            case 13:
                d0Var = new p.p(cVar, attributeSet);
                break;
            default:
                d0Var = null;
                break;
        }
        if (d0Var == null && context != cVar) {
            Object[] objArr = yVar.f44196a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = y.f44194d;
                        if (i11 < 3) {
                            View viewA = yVar.a(cVar, str, strArr[i11]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = yVar.a(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th3) {
                objArr[0] = null;
                objArr[1] = null;
                throw th3;
            }
            d0Var = view2;
        }
        if (d0Var != null) {
            Context context3 = d0Var.getContext();
            if ((context3 instanceof ContextWrapper) && d0Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, y.f44193c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    d0Var.setOnClickListener(new x(d0Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
        }
        return d0Var;
    }

    public final void p(o.m mVar) {
        p.j jVar;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f44178r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((x2) actionBarOverlayLayout.f3898e).f47854a.f3970a;
        if (actionMenuView != null && (jVar = actionMenuView.f3923t) != null) {
            jVar.j();
            p.f fVar = jVar.f47688t;
            if (fVar != null && fVar.b()) {
                fVar.f47029i.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(108, mVar);
        }
        this.K = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(o.m r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.v.q(o.m):void");
    }

    public final void r(u uVar, boolean z10) {
        t tVar;
        e1 e1Var;
        p.j jVar;
        if (z10 && uVar.f44147a == 0 && (e1Var = this.f44178r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) e1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((x2) actionBarOverlayLayout.f3898e).f47854a.f3970a;
            if (actionMenuView != null && (jVar = actionMenuView.f3923t) != null && jVar.k()) {
                p(uVar.f44154h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f44172k.getSystemService("window");
        if (windowManager != null && uVar.f44158m && (tVar = uVar.f44151e) != null) {
            windowManager.removeView(tVar);
            if (z10) {
                o(uVar.f44147a, uVar, null);
            }
        }
        uVar.f44157k = false;
        uVar.l = false;
        uVar.f44158m = false;
        uVar.f44152f = null;
        uVar.f44159n = true;
        if (this.M == uVar) {
            this.M = null;
        }
        if (uVar.f44147a == 0) {
            H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    public final boolean t(KeyEvent keyEvent) {
        int keyCode;
        u uVarY;
        e1 e1Var;
        Context context;
        boolean z10;
        boolean z11;
        boolean zF;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        p.j jVar;
        p.j jVar2;
        p.j jVar3;
        u uVarY2;
        Object obj = this.f44171j;
        if (((obj instanceof m0.m) || (obj instanceof f)) && this.l.getDecorView() != null) {
            WeakHashMap weakHashMap = s0.f45746a;
        }
        if (keyEvent.getKeyCode() == 82) {
            r rVar = this.f44173m;
            Window.Callback callback = this.l.getCallback();
            rVar.getClass();
            try {
                rVar.f44140c = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                rVar.f44140c = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.N = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                uVarY2 = y(0);
                                if (!uVarY2.f44158m) {
                                    F(uVarY2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f44181u == null) {
                                uVarY = y(0);
                                e1Var = this.f44178r;
                                context = this.f44172k;
                                if (e1Var != null) {
                                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) e1Var;
                                    actionBarOverlayLayout.k();
                                    toolbar = ((x2) actionBarOverlayLayout.f3898e).f47854a;
                                    if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f3970a) == null || !actionMenuView.f3922s || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z10 = uVarY.f44158m;
                                        if (!z10 || uVarY.l) {
                                            r(uVarY, true);
                                            z11 = z10;
                                        } else {
                                            if (uVarY.f44157k) {
                                                if (uVarY.f44160o) {
                                                    uVarY.f44157k = false;
                                                    zF = F(uVarY, keyEvent);
                                                } else {
                                                    zF = true;
                                                }
                                                if (zF) {
                                                    D(uVarY, keyEvent);
                                                    z11 = true;
                                                }
                                            }
                                            z11 = false;
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f44178r;
                                        actionBarOverlayLayout2.k();
                                        ActionMenuView actionMenuView2 = ((x2) actionBarOverlayLayout2.f3898e).f47854a.f3970a;
                                        if (actionMenuView2 == null || (jVar2 = actionMenuView2.f3923t) == null || !jVar2.k()) {
                                            if (!this.Q && F(uVarY, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f44178r;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView3 = ((x2) actionBarOverlayLayout3.f3898e).f47854a.f3970a;
                                                if (actionMenuView3 != null && (jVar = actionMenuView3.f3923t) != null && jVar.l()) {
                                                    z11 = true;
                                                }
                                            }
                                            z11 = false;
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f44178r;
                                            actionBarOverlayLayout4.k();
                                            ActionMenuView actionMenuView4 = ((x2) actionBarOverlayLayout4.f3898e).f47854a.f3970a;
                                            if (actionMenuView4 == null || (jVar3 = actionMenuView4.f3923t) == null || !jVar3.j()) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                        }
                                    }
                                } else {
                                    z10 = uVarY.f44158m;
                                    if (z10) {
                                    }
                                    r(uVarY, true);
                                    z11 = z10;
                                }
                                if (z11) {
                                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (C()) {
                        return false;
                    }
                }
            } catch (Throwable th2) {
                rVar.f44140c = false;
                throw th2;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.N = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        uVarY2 = y(0);
                        if (!uVarY2.f44158m) {
                            F(uVarY2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f44181u == null) {
                        uVarY = y(0);
                        e1Var = this.f44178r;
                        context = this.f44172k;
                        if (e1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) e1Var;
                            actionBarOverlayLayout5.k();
                            toolbar = ((x2) actionBarOverlayLayout5.f3898e).f47854a;
                            if (toolbar.getVisibility() == 0) {
                                z10 = uVarY.f44158m;
                                if (z10) {
                                }
                                r(uVarY, true);
                                z11 = z10;
                            } else {
                                z10 = uVarY.f44158m;
                                if (z10) {
                                }
                                r(uVarY, true);
                                z11 = z10;
                            }
                        } else {
                            z10 = uVarY.f44158m;
                            if (z10) {
                            }
                            r(uVarY, true);
                            z11 = z10;
                        }
                        if (z11) {
                            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                    }
                }
                return false;
            }
            if (C()) {
                return false;
            }
        }
        return true;
    }

    public final void u(int i10) {
        u uVarY = y(i10);
        if (uVarY.f44154h != null) {
            Bundle bundle = new Bundle();
            uVarY.f44154h.t(bundle);
            if (bundle.size() > 0) {
                uVarY.f44161p = bundle;
            }
            uVarY.f44154h.w();
            uVarY.f44154h.clear();
        }
        uVarY.f44160o = true;
        uVarY.f44159n = true;
        if ((i10 == 108 || i10 == 0) && this.f44178r != null) {
            u uVarY2 = y(0);
            uVarY2.f44157k = false;
            F(uVarY2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.f44186z) {
            return;
        }
        Context context = this.f44172k;
        int[] iArr = j.a.f43526j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(WebSocketProtocol.PAYLOAD_SHORT, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(InterfaceC0435l1.d.b.f29110g);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(com.storage.androidcleaner.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.storage.androidcleaner.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.storage.androidcleaner.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.storage.androidcleaner.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.c(context, typedValue.resourceId) : context).inflate(com.storage.androidcleaner.R.layout.abc_screen_toolbar, (ViewGroup) null);
            e1 e1Var = (e1) viewGroup.findViewById(com.storage.androidcleaner.R.id.decor_content_parent);
            this.f44178r = e1Var;
            e1Var.setWindowCallback(this.l.getCallback());
            if (this.G) {
                ((ActionBarOverlayLayout) this.f44178r).j(InterfaceC0435l1.d.b.f29110g);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.f44178r).j(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f44178r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.J + " }");
        }
        od.c cVar = new od.c(this, 12);
        WeakHashMap weakHashMap = s0.f45746a;
        l0.b(viewGroup, cVar);
        if (this.f44178r == null) {
            this.B = (TextView) viewGroup.findViewById(com.storage.androidcleaner.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.storage.androidcleaner.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s4.i(this));
        this.A = viewGroup;
        Object obj = this.f44171j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f44177q;
        if (!TextUtils.isEmpty(title)) {
            e1 e1Var2 = this.f44178r;
            if (e1Var2 != null) {
                e1Var2.setWindowTitle(title);
            } else {
                f0 f0Var = this.f44175o;
                if (f0Var != null) {
                    x2 x2Var = (x2) f0Var.f44101e;
                    if (!x2Var.f47860g) {
                        Toolbar toolbar = x2Var.f47854a;
                        x2Var.f47861h = title;
                        if ((x2Var.f47855b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (x2Var.f47860g) {
                                s0.g(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.f3940g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f44186z = true;
        u uVarY = y(0);
        if (this.Q || uVarY.f44154h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.l == null) {
            Object obj = this.f44171j;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final q00 x(Context context) {
        if (this.W == null) {
            if (v9.e.f52500g == null) {
                Context applicationContext = context.getApplicationContext();
                v9.e.f52500g = new v9.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new s(this, v9.e.f52500g);
        }
        return this.W;
    }

    public final u y(int i10) {
        u[] uVarArr = this.L;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.L = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f44147a = i10;
        uVar2.f44159n = false;
        uVarArr[i10] = uVar2;
        return uVar2;
    }

    public final void z() {
        v();
        if (this.F && this.f44175o == null) {
            Object obj = this.f44171j;
            if (obj instanceof Activity) {
                this.f44175o = new f0((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.f44175o = new f0((Dialog) obj);
            }
            f0 f0Var = this.f44175o;
            if (f0Var != null) {
                f0Var.d0(this.f44166b0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
