package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.IndexBasedArrayIterator;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BuildCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    public static final SimpleArrayMap j1 = new SimpleArrayMap(0);
    public static final int[] k1 = {R.attr.windowBackground};
    public static final boolean l1 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean m1 = true;
    public boolean B0;
    public ViewGroup C0;
    public TextView D0;
    public View E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public PanelFeatureState[] N0;
    public PanelFeatureState O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public Configuration T0;
    public final int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public AutoTimeNightModeManager Y0;
    public AutoBatteryNightModeManager Z0;
    public boolean a1;
    public int b1;
    public boolean d1;
    public Rect e1;
    public Rect f1;
    public AppCompatViewInflater g1;
    public OnBackInvokedDispatcher h1;
    public OnBackInvokedCallback i1;
    public final Object k0;
    public final Context l0;
    public Window m0;
    public AppCompatWindowCallback n0;
    public final Object o0;
    public ActionBar p0;
    public SupportMenuInflater q0;
    public CharSequence r0;
    public DecorContentParent s0;
    public ActionMenuPresenterCallback t0;
    public PanelMenuPresenterCallback u0;
    public ActionMode v0;
    public ActionBarContextView w0;
    public PopupWindow x0;
    public Runnable y0;
    public ViewPropertyAnimatorCompat z0 = null;
    public final boolean A0 = true;
    public final Runnable c1 = new AnonymousClass2();

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            boolean z2 = th instanceof Resources.NotFoundException;
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.b1 & 1) != 0) {
                appCompatDelegateImpl.L(0);
            }
            if ((appCompatDelegateImpl.b1 & 4096) != 0) {
                appCompatDelegateImpl.L(108);
            }
            appCompatDelegateImpl.a1 = false;
            appCompatDelegateImpl.b1 = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public final void a(Rect rect) {
            throw null;
        }
    }

    public class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
    }

    public interface ActionBarMenuCallback {
    }

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void b(MenuBuilder menuBuilder, boolean z2) {
            AppCompatDelegateImpl.this.H(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean c(MenuBuilder menuBuilder) {
            Window.Callback callback = AppCompatDelegateImpl.this.m0.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f3325a;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.f3325a = callback;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.app.AppCompatCallback, java.lang.Object] */
        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void a(ActionMode actionMode) {
            this.f3325a.a(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.x0 != null) {
                appCompatDelegateImpl.m0.getDecorView().removeCallbacks(appCompatDelegateImpl.y0);
            }
            if (appCompatDelegateImpl.w0 != null) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.z0;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.b();
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.a(appCompatDelegateImpl.w0);
                viewPropertyAnimatorCompatA.a(0.0f);
                appCompatDelegateImpl.z0 = viewPropertyAnimatorCompatA;
                viewPropertyAnimatorCompatA.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public final void c() {
                        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = ActionModeCallbackWrapperV9.this;
                        AppCompatDelegateImpl.this.w0.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl2.x0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl2.w0.getParent() instanceof View) {
                            ViewCompat.x((View) appCompatDelegateImpl2.w0.getParent());
                        }
                        appCompatDelegateImpl2.w0.g();
                        appCompatDelegateImpl2.z0.d(null);
                        appCompatDelegateImpl2.z0 = null;
                        ViewCompat.x(appCompatDelegateImpl2.C0);
                    }
                });
            }
            appCompatDelegateImpl.o0.onSupportActionModeFinished(appCompatDelegateImpl.v0);
            appCompatDelegateImpl.v0 = null;
            ViewCompat.x(appCompatDelegateImpl.C0);
            appCompatDelegateImpl.Y();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean b(ActionMode actionMode, MenuBuilder menuBuilder) {
            return this.f3325a.b(actionMode, menuBuilder);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean c(ActionMode actionMode, MenuItem menuItem) {
            return this.f3325a.c(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean d(ActionMode actionMode, MenuBuilder menuBuilder) {
            ViewCompat.x(AppCompatDelegateImpl.this.C0);
            return this.f3325a.d(actionMode, menuBuilder);
        }
    }

    public static class Api17Impl {
        public static void a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    public static class Api21Impl {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class Api24Impl {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static LocaleListCompat b(Configuration configuration) {
            return LocaleListCompat.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.f()));
        }

        public static void d(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.f()));
        }
    }

    public static class Api26Impl {
    }

    public static class Api33Impl {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.b] */
        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            ?? r0 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.b
                public final void onBackInvoked() {
                    appCompatDelegateImpl.T();
                }
            };
            Q.a.j(obj).registerOnBackInvokedCallback(1000000, r0);
            return r0;
        }

        public static void c(Object obj, Object obj2) {
            Q.a.j(obj).unregisterOnBackInvokedCallback(Q.a.d(obj2));
        }
    }

    public class AppCompatWindowCallback extends WindowCallbackWrapper {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ToolbarActionBar.ToolbarMenuCallback f3328Y;
        public boolean Z;
        public boolean e0;
        public boolean f0;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.Z = true;
                callback.onContentChanged();
            } finally {
                this.Z = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z2 = this.e0;
            Window.Callback callback = this.X;
            if (z2) {
                return callback.dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.K(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.X.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.Q();
                ActionBar actionBar = appCompatDelegateImpl.p0;
                if (actionBar == null || !actionBar.m(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.O0;
                    if (panelFeatureState == null || !appCompatDelegateImpl.V(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                        if (appCompatDelegateImpl.O0 == null) {
                            PanelFeatureState panelFeatureStateP = appCompatDelegateImpl.P(0);
                            appCompatDelegateImpl.W(panelFeatureStateP, keyEvent);
                            boolean zV = appCompatDelegateImpl.V(panelFeatureStateP, keyEvent.getKeyCode(), keyEvent);
                            panelFeatureStateP.k = false;
                            if (zV) {
                            }
                        }
                        return false;
                    }
                    PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.O0;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.f3340l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.Z) {
                this.X.onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof MenuBuilder)) {
                return this.X.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final View onCreatePanelView(int i2) {
            ToolbarActionBar.ToolbarMenuCallback toolbarMenuCallback = this.f3328Y;
            if (toolbarMenuCallback != null) {
                View view = i2 == 0 ? new View(ToolbarActionBar.this.f3356a.f3651a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.X.onCreatePanelView(i2);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i2 != 108) {
                appCompatDelegateImpl.getClass();
                return true;
            }
            appCompatDelegateImpl.Q();
            ActionBar actionBar = appCompatDelegateImpl.p0;
            if (actionBar != null) {
                actionBar.g(true);
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onPanelClosed(int i2, Menu menu) {
            if (this.f0) {
                this.X.onPanelClosed(i2, menu);
                return;
            }
            super.onPanelClosed(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i2 == 108) {
                appCompatDelegateImpl.Q();
                ActionBar actionBar = appCompatDelegateImpl.p0;
                if (actionBar != null) {
                    actionBar.g(false);
                    return;
                }
                return;
            }
            if (i2 != 0) {
                appCompatDelegateImpl.getClass();
                return;
            }
            PanelFeatureState panelFeatureStateP = appCompatDelegateImpl.P(i2);
            if (panelFeatureStateP.m) {
                appCompatDelegateImpl.I(panelFeatureStateP, false);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onPreparePanel(int i2, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i2 == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.x = true;
            }
            ToolbarActionBar.ToolbarMenuCallback toolbarMenuCallback = this.f3328Y;
            if (toolbarMenuCallback != null && i2 == 0) {
                ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
                if (!toolbarActionBar.d) {
                    toolbarActionBar.f3356a.f3657l = true;
                    toolbarActionBar.d = true;
                }
            }
            boolean zOnPreparePanel = this.X.onPreparePanel(i2, view, menu);
            if (menuBuilder != null) {
                menuBuilder.x = false;
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.P(0).f3338h;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i2) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.A0 || i2 != 0) {
                return super.onWindowStartingActionMode(callback, i2);
            }
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(appCompatDelegateImpl.l0, callback);
            ActionMode actionModeC = appCompatDelegateImpl.C(callbackWrapper);
            if (actionModeC != null) {
                return callbackWrapper.e(actionModeC);
            }
            return null;
        }
    }

    public class AutoBatteryNightModeManager extends AutoNightModeManager {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f3329c;

        public AutoBatteryNightModeManager(Context context) {
            super();
            this.f3329c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final int c() {
            return this.f3329c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final void d() throws IllegalAccessException {
            AppCompatDelegateImpl.this.D(true, true);
        }
    }

    public abstract class AutoNightModeManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f3330a;

        public AutoNightModeManager() {
        }

        public final void a() {
            BroadcastReceiver broadcastReceiver = this.f3330a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.l0.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f3330a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f3330a == null) {
                this.f3330a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.d();
                    }
                };
            }
            AppCompatDelegateImpl.this.l0.registerReceiver(this.f3330a, intentFilterB);
        }
    }

    public class AutoTimeNightModeManager extends AutoNightModeManager {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TwilightManager f3333c;

        public AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.f3333c = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final int c() {
            Location location;
            boolean z2;
            long j;
            Location lastKnownLocation;
            TwilightManager twilightManager = this.f3333c;
            TwilightManager.TwilightState twilightState = twilightManager.f3370c;
            if (twilightState.f3372b > System.currentTimeMillis()) {
                z2 = twilightState.f3371a;
            } else {
                Context context = twilightManager.f3368a;
                int iA = PermissionChecker.a(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation2 = null;
                LocationManager locationManager = twilightManager.f3369b;
                if (iA == 0) {
                    try {
                        lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                    location = lastKnownLocation;
                } else {
                    location = null;
                }
                if (PermissionChecker.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e3) {
                        Log.d("TwilightManager", "Failed to get last known location", e3);
                    }
                }
                if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                    location = lastKnownLocation2;
                }
                z2 = false;
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (TwilightCalculator.d == null) {
                        TwilightCalculator.d = new TwilightCalculator();
                    }
                    TwilightCalculator twilightCalculator = TwilightCalculator.d;
                    twilightCalculator.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    twilightCalculator.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    z2 = twilightCalculator.f3367c == 1;
                    long j2 = twilightCalculator.f3366b;
                    long j3 = twilightCalculator.f3365a;
                    twilightCalculator.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    long j4 = twilightCalculator.f3366b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j3) {
                            j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                        }
                        j = j4 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                    }
                    twilightState.f3371a = z2;
                    twilightState.f3372b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i2 = Calendar.getInstance().get(11);
                    if (i2 < 6 || i2 >= 22) {
                        z2 = true;
                    }
                }
            }
            return z2 ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public final void d() throws IllegalAccessException {
            AppCompatDelegateImpl.this.D(true, true);
        }
    }

    public static class ContextThemeWrapperCompatApi17Impl {
    }

    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.I(appCompatDelegateImpl.P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i2) {
            setBackgroundDrawable(AppCompatResources.a(getContext(), i2));
        }
    }

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3336c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f3337e;
        public View f;
        public View g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public MenuBuilder f3338h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ListMenuPresenter f3339i;
        public ContextThemeWrapper j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f3340l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f3341n;
        public boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Bundle f3342p;

        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
            public int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public boolean f3343Y;
            public Bundle Z;

            /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1, reason: invalid class name */
            public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i2) {
                    return new SavedState[i2];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.X = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                savedState.f3343Y = z2;
                if (z2) {
                    savedState.Z = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.X);
                parcel.writeInt(this.f3343Y ? 1 : 0);
                if (this.f3343Y) {
                    parcel.writeBundle(this.Z);
                }
            }
        }
    }

    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        public PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void b(MenuBuilder menuBuilder, boolean z2) {
            PanelFeatureState panelFeatureState;
            MenuBuilder menuBuilderK = menuBuilder.k();
            int i2 = 0;
            boolean z3 = menuBuilderK != menuBuilder;
            if (z3) {
                menuBuilder = menuBuilderK;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.N0;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i2 < length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                    if (panelFeatureState != null && panelFeatureState.f3338h == menuBuilder) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z3) {
                    appCompatDelegateImpl.I(panelFeatureState, z2);
                } else {
                    appCompatDelegateImpl.G(panelFeatureState.f3334a, panelFeatureState, menuBuilderK);
                    appCompatDelegateImpl.I(panelFeatureState, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean c(MenuBuilder menuBuilder) {
            Window.Callback callback;
            if (menuBuilder != menuBuilder.k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.H0 || (callback = appCompatDelegateImpl.m0.getCallback()) == null || appCompatDelegateImpl.S0) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.U0 = -100;
        this.l0 = context;
        this.o0 = appCompatCallback;
        this.k0 = obj;
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
                this.U0 = appCompatActivity.getDelegate().h();
            }
        }
        if (this.U0 == -100) {
            SimpleArrayMap simpleArrayMap = j1;
            Integer num = (Integer) simpleArrayMap.get(this.k0.getClass().getName());
            if (num != null) {
                this.U0 = num.intValue();
                simpleArrayMap.remove(this.k0.getClass().getName());
            }
        }
        if (window != null) {
            E(window);
        }
        AppCompatDrawableManager.d();
    }

    public static LocaleListCompat F(Context context) {
        LocaleListCompat localeListCompat;
        LocaleListCompat localeListCompatA;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AppCompatDelegate.Z) == null) {
            return null;
        }
        LocaleListCompat localeListCompatB = Api24Impl.b(context.getApplicationContext().getResources().getConfiguration());
        if (localeListCompat.d()) {
            localeListCompatA = LocaleListCompat.f4353b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < localeListCompatB.e() + localeListCompat.e()) {
                Locale localeC = i2 < localeListCompat.e() ? localeListCompat.c(i2) : localeListCompatB.c(i2 - localeListCompat.e());
                if (localeC != null) {
                    linkedHashSet.add(localeC);
                }
                i2++;
            }
            localeListCompatA = LocaleListCompat.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return localeListCompatA.d() ? localeListCompatB : localeListCompatA;
    }

    public static Configuration J(Context context, int i2, LocaleListCompat localeListCompat, Configuration configuration, boolean z2) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            Api24Impl.d(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void A(int i2) {
        this.V0 = i2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void B(CharSequence charSequence) {
        this.r0 = charSequence;
        DecorContentParent decorContentParent = this.s0;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.p0;
        if (actionBar != null) {
            actionBar.r(charSequence);
            return;
        }
        TextView textView = this.D0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.appcompat.app.AppCompatCallback, java.lang.Object] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionMode C(ActionMode.Callback callback) {
        ActionMode actionModeOnWindowStartingSupportActionMode;
        boolean z2;
        ViewGroup viewGroup;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.v0;
        if (actionMode != null) {
            actionMode.c();
        }
        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
        Q();
        ActionBar actionBar = this.p0;
        ?? r1 = this.o0;
        if (actionBar != null) {
            ActionMode actionModeS = actionBar.s(actionModeCallbackWrapperV9);
            this.v0 = actionModeS;
            if (actionModeS != null) {
                r1.onSupportActionModeStarted(actionModeS);
            }
        }
        if (this.v0 == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.z0;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            ActionMode actionMode2 = this.v0;
            if (actionMode2 != null) {
                actionMode2.c();
            }
            if (this.S0) {
                actionModeOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    actionModeOnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(actionModeCallbackWrapperV9);
                } catch (AbstractMethodError unused) {
                    actionModeOnWindowStartingSupportActionMode = null;
                }
            }
            if (actionModeOnWindowStartingSupportActionMode != null) {
                this.v0 = actionModeOnWindowStartingSupportActionMode;
            } else {
                if (this.w0 == null) {
                    boolean z3 = this.K0;
                    Context context = this.l0;
                    if (z3) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                        this.w0 = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.charging.screenshow.battery.animations.themes.R.attr.actionModePopupWindowStyle);
                        this.x0 = popupWindow;
                        PopupWindowCompat.b(popupWindow, 2);
                        this.x0.setContentView(this.w0);
                        this.x0.setWidth(-1);
                        context.getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarSize, typedValue, true);
                        this.w0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.x0.setHeight(-2);
                        this.y0 = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6
                            /* JADX WARN: Code duplicated, block: B:12:0x0025  */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z4;
                                ViewGroup viewGroup2;
                                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                appCompatDelegateImpl.x0.showAtLocation(appCompatDelegateImpl.w0, 55, 0, 0);
                                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = appCompatDelegateImpl.z0;
                                if (viewPropertyAnimatorCompat2 != null) {
                                    viewPropertyAnimatorCompat2.b();
                                }
                                if (!appCompatDelegateImpl.B0 || (viewGroup2 = appCompatDelegateImpl.C0) == null) {
                                    z4 = false;
                                } else {
                                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                                    if (viewGroup2.isLaidOut()) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                if (!z4) {
                                    appCompatDelegateImpl.w0.setAlpha(1.0f);
                                    appCompatDelegateImpl.w0.setVisibility(0);
                                    return;
                                }
                                appCompatDelegateImpl.w0.setAlpha(0.0f);
                                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.a(appCompatDelegateImpl.w0);
                                viewPropertyAnimatorCompatA.a(1.0f);
                                appCompatDelegateImpl.z0 = viewPropertyAnimatorCompatA;
                                viewPropertyAnimatorCompatA.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6.1
                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public final void b() {
                                        AppCompatDelegateImpl.this.w0.setVisibility(0);
                                    }

                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public final void c() {
                                        AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                                        appCompatDelegateImpl2.w0.setAlpha(1.0f);
                                        appCompatDelegateImpl2.z0.d(null);
                                        appCompatDelegateImpl2.z0 = null;
                                    }
                                });
                            }
                        };
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.C0.findViewById(com.charging.screenshow.battery.animations.themes.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            Q();
                            ActionBar actionBar2 = this.p0;
                            Context contextI = actionBar2 != null ? actionBar2.i() : null;
                            if (contextI != null) {
                                context = contextI;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.w0 = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.w0 != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = this.z0;
                    if (viewPropertyAnimatorCompat2 != null) {
                        viewPropertyAnimatorCompat2.b();
                    }
                    this.w0.g();
                    Context context2 = this.w0.getContext();
                    ActionBarContextView actionBarContextView = this.w0;
                    StandaloneActionMode standaloneActionMode = new StandaloneActionMode();
                    standaloneActionMode.Z = context2;
                    standaloneActionMode.e0 = actionBarContextView;
                    standaloneActionMode.f0 = actionModeCallbackWrapperV9;
                    MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
                    menuBuilder.f3484l = 1;
                    standaloneActionMode.i0 = menuBuilder;
                    menuBuilder.f3481e = standaloneActionMode;
                    if (actionModeCallbackWrapperV9.f3325a.b(standaloneActionMode, menuBuilder)) {
                        standaloneActionMode.i();
                        this.w0.e(standaloneActionMode);
                        this.v0 = standaloneActionMode;
                        if (this.B0 && (viewGroup = this.C0) != null) {
                            WeakHashMap weakHashMap = ViewCompat.f4466a;
                            z2 = viewGroup.isLaidOut();
                        }
                        if (z2) {
                            this.w0.setAlpha(0.0f);
                            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatA = ViewCompat.a(this.w0);
                            viewPropertyAnimatorCompatA.a(1.0f);
                            this.z0 = viewPropertyAnimatorCompatA;
                            viewPropertyAnimatorCompatA.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                                @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                public final void b() {
                                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                    appCompatDelegateImpl.w0.setVisibility(0);
                                    if (appCompatDelegateImpl.w0.getParent() instanceof View) {
                                        ViewCompat.x((View) appCompatDelegateImpl.w0.getParent());
                                    }
                                }

                                @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                public final void c() {
                                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                    appCompatDelegateImpl.w0.setAlpha(1.0f);
                                    appCompatDelegateImpl.z0.d(null);
                                    appCompatDelegateImpl.z0 = null;
                                }
                            });
                        } else {
                            this.w0.setAlpha(1.0f);
                            this.w0.setVisibility(0);
                            if (this.w0.getParent() instanceof View) {
                                ViewCompat.x((View) this.w0.getParent());
                            }
                        }
                        if (this.x0 != null) {
                            this.m0.getDecorView().post(this.y0);
                        }
                    } else {
                        this.v0 = null;
                    }
                }
            }
            ActionMode actionMode3 = this.v0;
            if (actionMode3 != null) {
                r1.onSupportActionModeStarted(actionMode3);
            }
            Y();
            this.v0 = this.v0;
        }
        Y();
        return this.v0;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(boolean z2, boolean z3) throws IllegalAccessException {
        int i2;
        boolean z4;
        Object obj;
        Object obj2;
        if (this.S0) {
            return false;
        }
        int i3 = this.U0;
        if (i3 == -100) {
            i3 = AppCompatDelegate.f3321Y;
        }
        int i4 = i3;
        Context context = this.l0;
        int iS = S(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        LocaleListCompat localeListCompatF = i5 < 33 ? F(context) : null;
        if (!z3 && localeListCompatF != null) {
            localeListCompatF = Api24Impl.b(context.getResources().getConfiguration());
        }
        Configuration configurationJ = J(context, iS, localeListCompatF, null, false);
        boolean z5 = this.X0;
        Object obj3 = this.k0;
        boolean z6 = true;
        if (z5 || !(obj3 instanceof Activity)) {
            this.X0 = true;
            i2 = this.W0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i5 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.W0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.W0 = 0;
                }
                this.X0 = true;
                i2 = this.W0;
            }
        }
        Configuration configuration = this.T0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i6 = configuration.uiMode & 48;
        int i7 = configurationJ.uiMode & 48;
        LocaleListCompat localeListCompatB = Api24Impl.b(configuration);
        LocaleListCompat localeListCompatB2 = localeListCompatF == null ? null : Api24Impl.b(configurationJ);
        int i8 = i6 != i7 ? 512 : 0;
        if (localeListCompatB2 != null && !localeListCompatB.equals(localeListCompatB2)) {
            i8 |= 8196;
        }
        if (((~i2) & i8) != 0 && z2 && this.Q0 && ((l1 || this.R0) && (obj3 instanceof Activity))) {
            final Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z4 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r12v0, types: [android.os.Handler] */
                        /* JADX WARN: Type inference failed for: r3v10 */
                        /* JADX WARN: Type inference failed for: r3v11 */
                        /* JADX WARN: Type inference failed for: r3v12 */
                        /* JADX WARN: Type inference failed for: r3v2 */
                        /* JADX WARN: Type inference failed for: r3v3 */
                        /* JADX WARN: Type inference failed for: r3v4 */
                        /* JADX WARN: Type inference failed for: r3v5, types: [android.app.Application] */
                        /* JADX WARN: Type inference failed for: r3v6 */
                        /* JADX WARN: Type inference failed for: r4v0 */
                        /* JADX WARN: Type inference failed for: r4v1 */
                        /* JADX WARN: Type inference failed for: r4v2, types: [androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks] */
                        /* JADX WARN: Type inference failed for: r4v3 */
                        /* JADX WARN: Type inference failed for: r4v4 */
                        /* JADX WARN: Type inference failed for: r5v0 */
                        /* JADX WARN: Type inference failed for: r5v1 */
                        /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Handler] */
                        /* JADX WARN: Type inference failed for: r5v3 */
                        /* JADX WARN: Type inference failed for: r5v4 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj4;
                            ?? r5;
                            ?? r4;
                            ?? r3;
                            Activity activity2 = activity;
                            if (activity2.isFinishing()) {
                                return;
                            }
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 28) {
                                Class cls = ActivityRecreator.f4166a;
                                activity2.recreate();
                                return;
                            }
                            Class cls2 = ActivityRecreator.f4166a;
                            Application application = 1;
                            application = 1;
                            ActivityRecreator.LifecycleCheckCallbacks lifecycleCheckCallbacks = 27;
                            ?? r6 = 26;
                            boolean z7 = i9 == 26 || i9 == 27;
                            Method method = ActivityRecreator.f;
                            if ((!z7 || method != null) && (ActivityRecreator.f4169e != null || ActivityRecreator.d != null)) {
                                try {
                                    Object obj5 = ActivityRecreator.f4168c.get(activity2);
                                    if (obj5 != null && (obj4 = ActivityRecreator.f4167b.get(activity2)) != null) {
                                        application = activity2.getApplication();
                                        lifecycleCheckCallbacks = new ActivityRecreator.LifecycleCheckCallbacks(activity2);
                                        application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                                        r6 = ActivityRecreator.g;
                                        r6.post(new Runnable() { // from class: androidx.core.app.ActivityRecreator.1

                                            /* JADX INFO: renamed from: Y */
                                            public final /* synthetic */ Object f4170Y;

                                            public AnonymousClass1() {
                                                obj = obj5;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                lifecycleCheckCallbacks.X = obj;
                                            }
                                        });
                                        if (i9 != 26 && i9 != 27) {
                                            application = 0;
                                        }
                                        try {
                                            if (application != 0) {
                                                try {
                                                    Boolean bool = Boolean.FALSE;
                                                    method.invoke(obj4, obj5, null, null, 0, bool, null, null, bool, bool);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r3 = application;
                                                    r4 = lifecycleCheckCallbacks;
                                                    r5 = r6;
                                                    r5.post(new Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                                                        public final /* synthetic */ Application X;

                                                        /* JADX INFO: renamed from: Y */
                                                        public final /* synthetic */ LifecycleCheckCallbacks f4171Y;

                                                        public AnonymousClass2() {
                                                            application = r3;
                                                            lifecycleCheckCallbacks = r4;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                                                        }
                                                    });
                                                    throw th;
                                                }
                                            } else {
                                                activity2.recreate();
                                            }
                                            r6.post(new Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                                                public final /* synthetic */ Application X;

                                                /* JADX INFO: renamed from: Y */
                                                public final /* synthetic */ LifecycleCheckCallbacks f4171Y;

                                                public AnonymousClass2() {
                                                    application = application;
                                                    lifecycleCheckCallbacks = lifecycleCheckCallbacks;
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                                                }
                                            });
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r3 = application;
                                            r4 = lifecycleCheckCallbacks;
                                            r5 = r6;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity2.recreate();
                        }
                    });
                }
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (z4 || i8 == 0) {
            z6 = z4;
        } else {
            boolean z7 = (i2 & i8) == i8;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
            if (localeListCompatB2 != null) {
                Api24Impl.d(configuration2, localeListCompatB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (!ResourcesFlusher.f3355h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        ResourcesFlusher.g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
                    }
                    ResourcesFlusher.f3355h = true;
                }
                Field field = ResourcesFlusher.g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!ResourcesFlusher.f3352b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                ResourcesFlusher.f3351a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
                            }
                            ResourcesFlusher.f3352b = true;
                        }
                        Field field2 = ResourcesFlusher.f3351a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e6) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!ResourcesFlusher.d) {
                                try {
                                    ResourcesFlusher.f3353c = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e7) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
                                }
                                ResourcesFlusher.d = true;
                            }
                            Class cls = ResourcesFlusher.f3353c;
                            if (cls != null) {
                                if (!ResourcesFlusher.f) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        ResourcesFlusher.f3354e = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
                                    }
                                    ResourcesFlusher.f = true;
                                }
                                Field field3 = ResourcesFlusher.f3354e;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
                                    }
                                    if (longSparseArray != null) {
                                        ResourcesFlusher.Api16Impl.a(longSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i10 = this.V0;
            if (i10 != 0) {
                context.setTheme(i10);
                context.getTheme().applyStyle(this.V0, true);
            }
            if (z7 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity2).getLifecycle().getD().compareTo(Lifecycle.State.Z) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.R0 && !this.S0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z6 && (obj3 instanceof AppCompatActivity)) {
            if ((i8 & 512) != 0) {
                ((AppCompatActivity) obj3).onNightModeChanged(iS);
            }
            if ((i8 & 4) != 0) {
                ((AppCompatActivity) obj3).onLocalesChanged(localeListCompatF);
            }
        }
        if (z6 && localeListCompatB2 != null) {
            Api24Impl.c(Api24Impl.b(context.getResources().getConfiguration()));
        }
        if (i4 == 0) {
            O(context).e();
        } else {
            AutoTimeNightModeManager autoTimeNightModeManager = this.Y0;
            if (autoTimeNightModeManager != null) {
                autoTimeNightModeManager.a();
            }
        }
        if (i4 == 3) {
            if (this.Z0 == null) {
                this.Z0 = new AutoBatteryNightModeManager(context);
            }
            this.Z0.e();
        } else {
            AutoBatteryNightModeManager autoBatteryNightModeManager = this.Z0;
            if (autoBatteryNightModeManager != null) {
                autoBatteryNightModeManager.a();
            }
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final void E(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.m0 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.n0 = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        int[] iArr = k1;
        Context context = this.l0;
        TintTypedArray tintTypedArray = new TintTypedArray(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        Drawable drawableC = tintTypedArray.c(0);
        if (drawableC != null) {
            window.setBackgroundDrawable(drawableC);
        }
        tintTypedArray.f();
        this.m0 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.h1) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.i1) != null) {
            Api33Impl.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.i1 = null;
        }
        Object obj = this.k0;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.h1 = Api33Impl.a(activity);
            } else {
                this.h1 = null;
            }
        } else {
            this.h1 = null;
        }
        Y();
    }

    public final void G(int i2, PanelFeatureState panelFeatureState, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.N0;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menuBuilder = panelFeatureState.f3338h;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.m) && !this.S0) {
            AppCompatWindowCallback appCompatWindowCallback = this.n0;
            Window.Callback callback = this.m0.getCallback();
            appCompatWindowCallback.getClass();
            try {
                appCompatWindowCallback.f0 = true;
                callback.onPanelClosed(i2, menuBuilder);
            } finally {
                appCompatWindowCallback.f0 = false;
            }
        }
    }

    public final void H(MenuBuilder menuBuilder) {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        this.s0.l();
        Window.Callback callback = this.m0.getCallback();
        if (callback != null && !this.S0) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.M0 = false;
    }

    public final void I(PanelFeatureState panelFeatureState, boolean z2) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z2 && panelFeatureState.f3334a == 0 && (decorContentParent = this.s0) != null && decorContentParent.e()) {
            H(panelFeatureState.f3338h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.l0.getSystemService("window");
        if (windowManager != null && panelFeatureState.m && (viewGroup = panelFeatureState.f3337e) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                G(panelFeatureState.f3334a, panelFeatureState, null);
            }
        }
        panelFeatureState.k = false;
        panelFeatureState.f3340l = false;
        panelFeatureState.m = false;
        panelFeatureState.f = null;
        panelFeatureState.f3341n = true;
        if (this.O0 == panelFeatureState) {
            this.O0 = null;
        }
        if (panelFeatureState.f3334a == 0) {
            Y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[RETURN] */
    public final boolean K(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        PanelFeatureState panelFeatureStateP;
        DecorContentParent decorContentParent;
        Context context;
        boolean z2;
        boolean zC;
        boolean zW;
        AudioManager audioManager;
        PanelFeatureState panelFeatureStateP2;
        Object obj = this.k0;
        if ((!(obj instanceof KeyEventDispatcher.Component) && !(obj instanceof AppCompatDialog)) || (decorView = this.m0.getDecorView()) == null || !KeyEventDispatcher.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                AppCompatWindowCallback appCompatWindowCallback = this.n0;
                Window.Callback callback = this.m0.getCallback();
                appCompatWindowCallback.getClass();
                try {
                    appCompatWindowCallback.e0 = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    appCompatWindowCallback.e0 = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.P0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    panelFeatureStateP2 = P(0);
                                    if (!panelFeatureStateP2.m) {
                                        W(panelFeatureStateP2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.v0 == null) {
                                    panelFeatureStateP = P(0);
                                    decorContentParent = this.s0;
                                    context = this.l0;
                                    if (decorContentParent != null || !decorContentParent.a() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z2 = panelFeatureStateP.m;
                                        if (!z2 || panelFeatureStateP.f3340l) {
                                            I(panelFeatureStateP, true);
                                            zC = z2;
                                        } else if (panelFeatureStateP.k) {
                                            if (panelFeatureStateP.o) {
                                                panelFeatureStateP.k = false;
                                                zW = W(panelFeatureStateP, keyEvent);
                                            } else {
                                                zW = true;
                                            }
                                            if (zW) {
                                                U(panelFeatureStateP, keyEvent);
                                                zC = true;
                                            } else {
                                                zC = false;
                                            }
                                        } else {
                                            zC = false;
                                        }
                                    } else if (this.s0.e()) {
                                        zC = this.s0.c();
                                    } else if (this.S0 || !W(panelFeatureStateP, keyEvent)) {
                                        zC = false;
                                    } else {
                                        zC = this.s0.d();
                                    }
                                    if (zC) {
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
                        if (T()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    appCompatWindowCallback.e0 = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.P0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            panelFeatureStateP2 = P(0);
                            if (!panelFeatureStateP2.m) {
                                W(panelFeatureStateP2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.v0 == null) {
                            panelFeatureStateP = P(0);
                            decorContentParent = this.s0;
                            context = this.l0;
                            if (decorContentParent != null) {
                                z2 = panelFeatureStateP.m;
                                if (z2) {
                                    I(panelFeatureStateP, true);
                                    zC = z2;
                                } else {
                                    I(panelFeatureStateP, true);
                                    zC = z2;
                                }
                            } else {
                                z2 = panelFeatureStateP.m;
                                if (z2) {
                                    I(panelFeatureStateP, true);
                                    zC = z2;
                                } else {
                                    I(panelFeatureStateP, true);
                                    zC = z2;
                                }
                            }
                            if (zC) {
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
                if (T()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void L(int i2) {
        PanelFeatureState panelFeatureStateP = P(i2);
        if (panelFeatureStateP.f3338h != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateP.f3338h.t(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateP.f3342p = bundle;
            }
            panelFeatureStateP.f3338h.w();
            panelFeatureStateP.f3338h.clear();
        }
        panelFeatureStateP.o = true;
        panelFeatureStateP.f3341n = true;
        if ((i2 == 108 || i2 == 0) && this.s0 != null) {
            PanelFeatureState panelFeatureStateP2 = P(0);
            panelFeatureStateP2.k = false;
            W(panelFeatureStateP2, null);
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        if (this.B0) {
            return;
        }
        int[] iArr = androidx.appcompat.R.styleable.j;
        Context context = this.l0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            v(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            v(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            v(10);
        }
        this.K0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        N();
        this.m0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.L0) {
            viewGroup = this.J0 ? (ViewGroup) layoutInflaterFrom.inflate(com.charging.screenshow.battery.animations.themes.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.charging.screenshow.battery.animations.themes.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.K0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.charging.screenshow.battery.animations.themes.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.I0 = false;
            this.H0 = false;
        } else if (this.H0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(com.charging.screenshow.battery.animations.themes.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(com.charging.screenshow.battery.animations.themes.R.id.decor_content_parent);
            this.s0 = decorContentParent;
            decorContentParent.setWindowCallback(this.m0.getCallback());
            if (this.I0) {
                this.s0.h(109);
            }
            if (this.F0) {
                this.s0.h(2);
            }
            if (this.G0) {
                this.s0.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.H0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.I0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.K0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.J0);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(android.support.v4.media.a.t(sb, this.L0, " }"));
        }
        ViewCompat.G(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                boolean z2;
                boolean z3;
                int iJ = windowInsetsCompat.j();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.getClass();
                int iJ2 = windowInsetsCompat.j();
                ActionBarContextView actionBarContextView = appCompatDelegateImpl.w0;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z2 = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.w0.getLayoutParams();
                    boolean z4 = true;
                    if (appCompatDelegateImpl.w0.isShown()) {
                        if (appCompatDelegateImpl.e1 == null) {
                            appCompatDelegateImpl.e1 = new Rect();
                            appCompatDelegateImpl.f1 = new Rect();
                        }
                        Rect rect = appCompatDelegateImpl.e1;
                        Rect rect2 = appCompatDelegateImpl.f1;
                        rect.set(windowInsetsCompat.h(), windowInsetsCompat.j(), windowInsetsCompat.i(), windowInsetsCompat.g());
                        ViewGroup viewGroup2 = appCompatDelegateImpl.C0;
                        Method method = ViewUtils.f3669a;
                        if (method != null) {
                            try {
                                method.invoke(viewGroup2, rect, rect2);
                            } catch (Exception e2) {
                                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                            }
                        }
                        int i2 = rect.top;
                        int i3 = rect.left;
                        int i4 = rect.right;
                        WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(appCompatDelegateImpl.C0);
                        int iH = windowInsetsCompatN == null ? 0 : windowInsetsCompatN.h();
                        int i5 = windowInsetsCompatN == null ? 0 : windowInsetsCompatN.i();
                        if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                            z3 = false;
                        } else {
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i4;
                            z3 = true;
                        }
                        Context context2 = appCompatDelegateImpl.l0;
                        if (i2 <= 0 || appCompatDelegateImpl.E0 != null) {
                            View view2 = appCompatDelegateImpl.E0;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i6 = marginLayoutParams2.height;
                                int i7 = marginLayoutParams.topMargin;
                                if (i6 != i7 || marginLayoutParams2.leftMargin != iH || marginLayoutParams2.rightMargin != i5) {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = iH;
                                    marginLayoutParams2.rightMargin = i5;
                                    appCompatDelegateImpl.E0.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context2);
                            appCompatDelegateImpl.E0 = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iH;
                            layoutParams.rightMargin = i5;
                            appCompatDelegateImpl.C0.addView(appCompatDelegateImpl.E0, -1, layoutParams);
                        }
                        View view4 = appCompatDelegateImpl.E0;
                        z4 = view4 != null;
                        if (z4 && view4.getVisibility() != 0) {
                            View view5 = appCompatDelegateImpl.E0;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Segment.SIZE) != 0 ? ContextCompat.getColor(context2, com.charging.screenshow.battery.animations.themes.R.color.abc_decor_view_status_guard_light) : ContextCompat.getColor(context2, com.charging.screenshow.battery.animations.themes.R.color.abc_decor_view_status_guard));
                        }
                        if (!appCompatDelegateImpl.J0 && z4) {
                            iJ2 = 0;
                        }
                        z2 = z4;
                        z4 = z3;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z2 = false;
                    } else {
                        z2 = false;
                        z4 = false;
                    }
                    if (z4) {
                        appCompatDelegateImpl.w0.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = appCompatDelegateImpl.E0;
                if (view6 != null) {
                    view6.setVisibility(z2 ? 0 : 8);
                }
                return ViewCompat.t(view, iJ != iJ2 ? windowInsetsCompat.n(windowInsetsCompat.h(), iJ2, windowInsetsCompat.i(), windowInsetsCompat.g()) : windowInsetsCompat);
            }
        });
        if (this.s0 == null) {
            this.D0 = (TextView) viewGroup.findViewById(com.charging.screenshow.battery.animations.themes.R.id.title);
        }
        Method method = ViewUtils.f3669a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.charging.screenshow.battery.animations.themes.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.m0.findViewById(R.id.content);
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
        this.m0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
            public final void onDetachedFromWindow() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                DecorContentParent decorContentParent2 = appCompatDelegateImpl.s0;
                if (decorContentParent2 != null) {
                    decorContentParent2.l();
                }
                if (appCompatDelegateImpl.x0 != null) {
                    appCompatDelegateImpl.m0.getDecorView().removeCallbacks(appCompatDelegateImpl.y0);
                    if (appCompatDelegateImpl.x0.isShowing()) {
                        try {
                            appCompatDelegateImpl.x0.dismiss();
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    appCompatDelegateImpl.x0 = null;
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.z0;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.b();
                }
                MenuBuilder menuBuilder = appCompatDelegateImpl.P(0).f3338h;
                if (menuBuilder != null) {
                    menuBuilder.c(true);
                }
            }
        });
        this.C0 = viewGroup;
        Object obj = this.k0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.r0;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.s0;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.p0;
                if (actionBar != null) {
                    actionBar.r(title);
                } else {
                    TextView textView = this.D0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C0.findViewById(R.id.content);
        View decorView = this.m0.getDecorView();
        contentFrameLayout2.k0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap = ViewCompat.f4466a;
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
        this.B0 = true;
        PanelFeatureState panelFeatureStateP = P(0);
        if (this.S0 || panelFeatureStateP.f3338h != null) {
            return;
        }
        R(108);
    }

    public final void N() {
        if (this.m0 == null) {
            Object obj = this.k0;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.m0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AutoNightModeManager O(Context context) {
        if (this.Y0 == null) {
            if (TwilightManager.d == null) {
                Context applicationContext = context.getApplicationContext();
                TwilightManager.d = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Y0 = new AutoTimeNightModeManager(TwilightManager.d);
        }
        return this.Y0;
    }

    public final PanelFeatureState P(int i2) {
        PanelFeatureState[] panelFeatureStateArr = this.N0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.N0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState();
        panelFeatureState2.f3334a = i2;
        panelFeatureState2.f3341n = false;
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final void Q() {
        M();
        if (this.H0 && this.p0 == null) {
            Object obj = this.k0;
            if (obj instanceof Activity) {
                this.p0 = new WindowDecorActionBar((Activity) obj, this.I0);
            } else if (obj instanceof Dialog) {
                this.p0 = new WindowDecorActionBar((Dialog) obj);
            }
            ActionBar actionBar = this.p0;
            if (actionBar != null) {
                actionBar.p(this.d1);
            }
        }
    }

    public final void R(int i2) {
        this.b1 = (1 << i2) | this.b1;
        if (this.a1) {
            return;
        }
        View decorView = this.m0.getDecorView();
        Runnable runnable = this.c1;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        decorView.postOnAnimation(runnable);
        this.a1 = true;
    }

    public final int S(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.Z0 == null) {
                            this.Z0 = new AutoBatteryNightModeManager(context);
                        }
                        return this.Z0.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return O(context).c();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean T() {
        boolean z2 = this.P0;
        this.P0 = false;
        PanelFeatureState panelFeatureStateP = P(0);
        if (!panelFeatureStateP.m) {
            ActionMode actionMode = this.v0;
            if (actionMode != null) {
                actionMode.c();
                return true;
            }
            Q();
            ActionBar actionBar = this.p0;
            if (actionBar == null || !actionBar.f()) {
                return false;
            }
        } else if (!z2) {
            I(panelFeatureStateP, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public final void U(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.m || this.S0) {
            return;
        }
        int i3 = panelFeatureState.f3334a;
        Context context = this.l0;
        if (i3 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.m0.getCallback();
        if (callback != null && !callback.onMenuOpened(i3, panelFeatureState.f3338h)) {
            I(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && W(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f3337e;
            if (viewGroup != null && !panelFeatureState.f3341n) {
                View view = panelFeatureState.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                panelFeatureState.f3340l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f3336c;
                layoutParams2.windowAnimations = panelFeatureState.d;
                windowManager.addView(panelFeatureState.f3337e, layoutParams2);
                panelFeatureState.m = true;
                if (i3 == 0) {
                    Y();
                }
            }
            if (viewGroup == null) {
                Q();
                ActionBar actionBar = this.p0;
                Context contextI = actionBar != null ? actionBar.i() : null;
                if (contextI != null) {
                    context = contextI;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarPopupTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                }
                themeNewTheme.resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.panelMenuListTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    themeNewTheme.applyStyle(i5, true);
                } else {
                    themeNewTheme.applyStyle(com.charging.screenshow.battery.animations.themes.R.style.Theme_AppCompat_CompactMenu, true);
                }
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                panelFeatureState.j = contextThemeWrapper;
                TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.appcompat.R.styleable.j);
                panelFeatureState.f3335b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                panelFeatureState.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                panelFeatureState.f3337e = new ListMenuDecorView(panelFeatureState.j);
                panelFeatureState.f3336c = 81;
            } else if (panelFeatureState.f3341n && viewGroup.getChildCount() > 0) {
                panelFeatureState.f3337e.removeAllViews();
            }
            View view2 = panelFeatureState.g;
            if (view2 == null) {
                if (panelFeatureState.f3338h != null) {
                    if (this.u0 == null) {
                        this.u0 = new PanelMenuPresenterCallback();
                    }
                    PanelMenuPresenterCallback panelMenuPresenterCallback = this.u0;
                    if (panelFeatureState.f3339i == null) {
                        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(panelFeatureState.j);
                        panelFeatureState.f3339i = listMenuPresenter;
                        listMenuPresenter.f0 = panelMenuPresenterCallback;
                        MenuBuilder menuBuilder = panelFeatureState.f3338h;
                        menuBuilder.b(listMenuPresenter, menuBuilder.f3478a);
                    }
                    View view3 = (View) panelFeatureState.f3339i.j(panelFeatureState.f3337e);
                    panelFeatureState.f = view3;
                    if (view3 != null) {
                    }
                }
                panelFeatureState.f3341n = true;
                return;
            }
            panelFeatureState.f = view2;
            if (panelFeatureState.f != null && (panelFeatureState.g != null || panelFeatureState.f3339i.a().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.f3337e.setBackgroundResource(panelFeatureState.f3335b);
                ViewParent parent = panelFeatureState.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(panelFeatureState.f);
                }
                panelFeatureState.f3337e.addView(panelFeatureState.f, layoutParams3);
                if (!panelFeatureState.f.hasFocus()) {
                    panelFeatureState.f.requestFocus();
                }
            }
            panelFeatureState.f3341n = true;
            return;
            i2 = -2;
            panelFeatureState.f3340l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f3336c;
            layoutParams4.windowAnimations = panelFeatureState.d;
            windowManager.addView(panelFeatureState.f3337e, layoutParams4);
            panelFeatureState.m = true;
            if (i3 == 0) {
                Y();
            }
        }
    }

    public final boolean V(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.k || W(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.f3338h) != null) {
            return menuBuilder.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    public final boolean W(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme themeNewTheme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (!this.S0) {
            if (panelFeatureState.k) {
                return true;
            }
            PanelFeatureState panelFeatureState2 = this.O0;
            if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
                I(panelFeatureState2, false);
            }
            Window.Callback callback = this.m0.getCallback();
            int i2 = panelFeatureState.f3334a;
            if (callback != null) {
                panelFeatureState.g = callback.onCreatePanelView(i2);
            }
            boolean z2 = i2 == 0 || i2 == 108;
            if (z2 && (decorContentParent4 = this.s0) != null) {
                decorContentParent4.f();
            }
            if (panelFeatureState.g == null && (!z2 || !(this.p0 instanceof ToolbarActionBar))) {
                MenuBuilder menuBuilder2 = panelFeatureState.f3338h;
                if (menuBuilder2 == null || panelFeatureState.o) {
                    if (menuBuilder2 == null) {
                        Context context = this.l0;
                        if ((i2 == 0 || i2 == 108) && this.s0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                                context = contextThemeWrapper;
                            }
                        }
                        MenuBuilder menuBuilder3 = new MenuBuilder(context);
                        menuBuilder3.f3481e = this;
                        MenuBuilder menuBuilder4 = panelFeatureState.f3338h;
                        if (menuBuilder3 != menuBuilder4) {
                            if (menuBuilder4 != null) {
                                menuBuilder4.r(panelFeatureState.f3339i);
                            }
                            panelFeatureState.f3338h = menuBuilder3;
                            ListMenuPresenter listMenuPresenter = panelFeatureState.f3339i;
                            if (listMenuPresenter != null) {
                                menuBuilder3.b(listMenuPresenter, menuBuilder3.f3478a);
                            }
                        }
                        if (panelFeatureState.f3338h != null) {
                            if (z2 && (decorContentParent2 = this.s0) != null) {
                                if (this.t0 == null) {
                                    this.t0 = new ActionMenuPresenterCallback();
                                }
                                decorContentParent2.b(panelFeatureState.f3338h, this.t0);
                            }
                            panelFeatureState.f3338h.w();
                            if (callback.onCreatePanelMenu(i2, panelFeatureState.f3338h)) {
                                panelFeatureState.o = false;
                            } else {
                                menuBuilder = panelFeatureState.f3338h;
                                if (menuBuilder != null) {
                                    if (menuBuilder != null) {
                                        menuBuilder.r(panelFeatureState.f3339i);
                                    }
                                    panelFeatureState.f3338h = null;
                                }
                                if (z2 && (decorContentParent = this.s0) != null) {
                                    decorContentParent.b(null, this.t0);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.t0 == null) {
                                this.t0 = new ActionMenuPresenterCallback();
                            }
                            decorContentParent2.b(panelFeatureState.f3338h, this.t0);
                        }
                        panelFeatureState.f3338h.w();
                        if (callback.onCreatePanelMenu(i2, panelFeatureState.f3338h)) {
                            menuBuilder = panelFeatureState.f3338h;
                            if (menuBuilder != null) {
                                if (menuBuilder != null) {
                                    menuBuilder.r(panelFeatureState.f3339i);
                                }
                                panelFeatureState.f3338h = null;
                            }
                            if (z2) {
                                decorContentParent.b(null, this.t0);
                            }
                        } else {
                            panelFeatureState.o = false;
                        }
                    }
                }
                panelFeatureState.f3338h.w();
                Bundle bundle = panelFeatureState.f3342p;
                if (bundle != null) {
                    panelFeatureState.f3338h.s(bundle);
                    panelFeatureState.f3342p = null;
                }
                if (!callback.onPreparePanel(0, panelFeatureState.g, panelFeatureState.f3338h)) {
                    if (z2 && (decorContentParent3 = this.s0) != null) {
                        decorContentParent3.b(null, this.t0);
                    }
                    panelFeatureState.f3338h.v();
                    return false;
                }
                panelFeatureState.f3338h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                panelFeatureState.f3338h.v();
            }
            panelFeatureState.k = true;
            panelFeatureState.f3340l = false;
            this.O0 = panelFeatureState;
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.B0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.h1 != null && (P(0).m || this.v0 != null)) {
                z2 = true;
            }
            if (z2 && this.i1 == null) {
                this.i1 = Api33Impl.b(this.h1, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.i1) == null) {
                    return;
                }
                Api33Impl.c(this.h1, onBackInvokedCallback);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.m0.getCallback();
        if (callback != null && !this.S0) {
            MenuBuilder menuBuilderK = menuBuilder.k();
            PanelFeatureState[] panelFeatureStateArr = this.N0;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            for (int i2 = 0; i2 < length; i2++) {
                panelFeatureState = panelFeatureStateArr[i2];
                if (panelFeatureState != null && panelFeatureState.f3338h == menuBuilderK) {
                    if (panelFeatureState != null) {
                        return callback.onMenuItemSelected(panelFeatureState.f3334a, menuItem);
                    }
                }
            }
            panelFeatureState = null;
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.f3334a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void b(MenuBuilder menuBuilder) {
        DecorContentParent decorContentParent = this.s0;
        if (decorContentParent == null || !decorContentParent.a() || (ViewConfiguration.get(this.l0).hasPermanentMenuKey() && !this.s0.g())) {
            PanelFeatureState panelFeatureStateP = P(0);
            panelFeatureStateP.f3341n = true;
            I(panelFeatureStateP, false);
            U(panelFeatureStateP, null);
            return;
        }
        Window.Callback callback = this.m0.getCallback();
        if (this.s0.e()) {
            this.s0.c();
            if (this.S0) {
                return;
            }
            callback.onPanelClosed(108, P(0).f3338h);
            return;
        }
        if (callback == null || this.S0) {
            return;
        }
        if (this.a1 && (1 & this.b1) != 0) {
            View decorView = this.m0.getDecorView();
            Runnable runnable = this.c1;
            decorView.removeCallbacks(runnable);
            ((AnonymousClass2) runnable).run();
        }
        PanelFeatureState panelFeatureStateP2 = P(0);
        MenuBuilder menuBuilder2 = panelFeatureStateP2.f3338h;
        if (menuBuilder2 == null || panelFeatureStateP2.o || !callback.onPreparePanel(0, panelFeatureStateP2.g, menuBuilder2)) {
            return;
        }
        callback.onMenuOpened(108, panelFeatureStateP2.f3338h);
        this.s0.d();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.C0.findViewById(R.id.content)).addView(view, layoutParams);
        this.n0.a(this.m0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context d(final Context context) {
        this.Q0 = true;
        int i2 = this.U0;
        if (i2 == -100) {
            i2 = AppCompatDelegate.f3321Y;
        }
        int iS = S(context, i2);
        if (AppCompatDelegate.m(context) && AppCompatDelegate.m(context)) {
            if (!BuildCompat.c()) {
                synchronized (AppCompatDelegate.j0) {
                    try {
                        LocaleListCompat localeListCompat = AppCompatDelegate.Z;
                        if (localeListCompat == null) {
                            if (AppCompatDelegate.e0 == null) {
                                AppCompatDelegate.e0 = LocaleListCompat.b(AppLocalesStorageHelper.b(context));
                            }
                            if (!AppCompatDelegate.e0.d()) {
                                AppCompatDelegate.Z = AppCompatDelegate.e0;
                            }
                        } else if (!localeListCompat.equals(AppCompatDelegate.e0)) {
                            LocaleListCompat localeListCompat2 = AppCompatDelegate.Z;
                            AppCompatDelegate.e0 = localeListCompat2;
                            AppLocalesStorageHelper.a(context, localeListCompat2.f());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AppCompatDelegate.g0) {
                AppCompatDelegate.X.execute(new Runnable() { // from class: androidx.appcompat.app.a
                    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocaleListCompat localeListCompatG;
                        Object systemService;
                        Context contextF;
                        if (Build.VERSION.SDK_INT >= 33) {
                            AppLocalesStorageHelper.SerialExecutor serialExecutor = AppCompatDelegate.X;
                            Context context2 = context;
                            ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                            if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                                if (BuildCompat.c()) {
                                    Iterator it = AppCompatDelegate.h0.iterator();
                                    while (true) {
                                        IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                                        if (!indexBasedArrayIterator.hasNext()) {
                                            systemService = null;
                                            break;
                                        }
                                        AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                                        if (appCompatDelegate != null && (contextF = appCompatDelegate.f()) != null) {
                                            systemService = contextF.getSystemService("locale");
                                            break;
                                        }
                                    }
                                    if (systemService != null) {
                                        localeListCompatG = LocaleListCompat.g(AppCompatDelegate.Api33Impl.a(systemService));
                                    } else {
                                        localeListCompatG = LocaleListCompat.f4353b;
                                    }
                                } else {
                                    localeListCompatG = AppCompatDelegate.Z;
                                    if (localeListCompatG == null) {
                                        localeListCompatG = LocaleListCompat.f4353b;
                                    }
                                }
                                if (localeListCompatG.d()) {
                                    String strB = AppLocalesStorageHelper.b(context2);
                                    Object systemService2 = context2.getSystemService("locale");
                                    if (systemService2 != null) {
                                        AppCompatDelegate.Api33Impl.b(systemService2, AppCompatDelegate.Api24Impl.a(strB));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                        }
                        AppCompatDelegate.g0 = true;
                    }
                });
            }
        }
        LocaleListCompat localeListCompatF = F(context);
        Configuration configuration = null;
        if (m1 && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(J(context, iS, localeListCompatF, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).a(J(context, iS, localeListCompatF, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!l1) {
            return context;
        }
        int i3 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i4 = configuration3.mcc;
                int i5 = configuration4.mcc;
                if (i4 != i5) {
                    configuration.mcc = i5;
                }
                int i6 = configuration3.mnc;
                int i7 = configuration4.mnc;
                if (i6 != i7) {
                    configuration.mnc = i7;
                }
                Api24Impl.a(configuration3, configuration4, configuration);
                int i8 = configuration3.touchscreen;
                int i9 = configuration4.touchscreen;
                if (i8 != i9) {
                    configuration.touchscreen = i9;
                }
                int i10 = configuration3.keyboard;
                int i11 = configuration4.keyboard;
                if (i10 != i11) {
                    configuration.keyboard = i11;
                }
                int i12 = configuration3.keyboardHidden;
                int i13 = configuration4.keyboardHidden;
                if (i12 != i13) {
                    configuration.keyboardHidden = i13;
                }
                int i14 = configuration3.navigation;
                int i15 = configuration4.navigation;
                if (i14 != i15) {
                    configuration.navigation = i15;
                }
                int i16 = configuration3.navigationHidden;
                int i17 = configuration4.navigationHidden;
                if (i16 != i17) {
                    configuration.navigationHidden = i17;
                }
                int i18 = configuration3.orientation;
                int i19 = configuration4.orientation;
                if (i18 != i19) {
                    configuration.orientation = i19;
                }
                int i20 = configuration3.screenLayout & 15;
                int i21 = configuration4.screenLayout & 15;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & PsExtractor.AUDIO_STREAM;
                int i23 = configuration4.screenLayout & PsExtractor.AUDIO_STREAM;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 48;
                int i25 = configuration4.screenLayout & 48;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.screenLayout & 768;
                int i27 = configuration4.screenLayout & 768;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                if (i3 >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                int i28 = configuration3.uiMode & 15;
                int i29 = configuration4.uiMode & 15;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.uiMode & 48;
                int i31 = configuration4.uiMode & 48;
                if (i30 != i31) {
                    configuration.uiMode |= i31;
                }
                int i32 = configuration3.screenWidthDp;
                int i33 = configuration4.screenWidthDp;
                if (i32 != i33) {
                    configuration.screenWidthDp = i33;
                }
                int i34 = configuration3.screenHeightDp;
                int i35 = configuration4.screenHeightDp;
                if (i34 != i35) {
                    configuration.screenHeightDp = i35;
                }
                int i36 = configuration3.smallestScreenWidthDp;
                int i37 = configuration4.smallestScreenWidthDp;
                if (i36 != i37) {
                    configuration.smallestScreenWidthDp = i37;
                }
                int i38 = configuration3.densityDpi;
                int i39 = configuration4.densityDpi;
                if (i38 != i39) {
                    configuration.densityDpi = i39;
                }
            }
        }
        Configuration configurationJ = J(context, iS, localeListCompatF, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.charging.screenshow.battery.animations.themes.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.a(configurationJ);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.a(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return contextThemeWrapper;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View e(int i2) {
        M();
        return this.m0.findViewById(i2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context f() {
        return this.l0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate g() {
        return new ActionBarDrawableToggleImpl();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int h() {
        return this.U0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater i() {
        if (this.q0 == null) {
            Q();
            ActionBar actionBar = this.p0;
            this.q0 = new SupportMenuInflater(actionBar != null ? actionBar.i() : this.l0);
        }
        return this.q0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar j() {
        Q();
        return this.p0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.l0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void l() {
        if (this.p0 != null) {
            Q();
            if (this.p0.j()) {
                return;
            }
            R(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void n(Configuration configuration) throws IllegalAccessException {
        if (this.H0 && this.B0) {
            Q();
            ActionBar actionBar = this.p0;
            if (actionBar != null) {
                actionBar.k();
            }
        }
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        Context context = this.l0;
        synchronized (appCompatDrawableManagerA) {
            ResourceManagerInternal resourceManagerInternal = appCompatDrawableManagerA.f3556a;
            synchronized (resourceManagerInternal) {
                androidx.collection.LongSparseArray longSparseArray = (androidx.collection.LongSparseArray) resourceManagerInternal.f3617b.get(context);
                if (longSparseArray != null) {
                    longSparseArray.b();
                }
            }
        }
        this.T0 = new Configuration(this.l0.getResources().getConfiguration());
        D(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void o() throws IllegalAccessException {
        String strC;
        this.Q0 = true;
        D(false, true);
        N();
        Object obj = this.k0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = NavUtils.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                ActionBar actionBar = this.p0;
                if (actionBar == null) {
                    this.d1 = true;
                } else {
                    actionBar.p(true);
                }
            }
            synchronized (AppCompatDelegate.i0) {
                AppCompatDelegate.u(this);
                AppCompatDelegate.h0.add(new WeakReference(this));
            }
        }
        this.T0 = new Configuration(this.l0.getResources().getConfiguration());
        this.R0 = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        if (this.g1 == null) {
            int[] iArr = androidx.appcompat.R.styleable.j;
            Context context2 = this.l0;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.g1 = new AppCompatViewInflater();
            } else {
                try {
                    this.g1 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.g1 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.g1;
        int i2 = VectorEnabledTintResources.f3668a;
        appCompatViewInflater.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f3288z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context contextThemeWrapper = (resourceId == 0 || ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).f3421a == resourceId)) ? context : new ContextThemeWrapper(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str) {
            case "RatingBar":
                appCompatRatingBar = new AppCompatRatingBar(contextThemeWrapper, attributeSet);
                break;
            case "CheckedTextView":
                appCompatRatingBar = new AppCompatCheckedTextView(contextThemeWrapper, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(contextThemeWrapper, attributeSet);
                break;
            case "TextView":
                appCompatRatingBar = appCompatViewInflater.e(contextThemeWrapper, attributeSet);
                break;
            case "ImageButton":
                appCompatRatingBar = new AppCompatImageButton(contextThemeWrapper, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                appCompatRatingBar = new AppCompatSeekBar(contextThemeWrapper, attributeSet);
                break;
            case "Spinner":
                appCompatRatingBar = new AppCompatSpinner(contextThemeWrapper, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.spinnerStyle);
                break;
            case "RadioButton":
                appCompatRatingBar = appCompatViewInflater.d(contextThemeWrapper, attributeSet);
                break;
            case "ToggleButton":
                appCompatRatingBar = new AppCompatToggleButton(contextThemeWrapper, attributeSet);
                break;
            case "ImageView":
                appCompatRatingBar = new AppCompatImageView(contextThemeWrapper, attributeSet);
                break;
            case "AutoCompleteTextView":
                appCompatRatingBar = appCompatViewInflater.a(contextThemeWrapper, attributeSet);
                break;
            case "CheckBox":
                appCompatRatingBar = appCompatViewInflater.c(contextThemeWrapper, attributeSet);
                break;
            case "EditText":
                appCompatRatingBar = new AppCompatEditText(contextThemeWrapper, attributeSet);
                break;
            case "Button":
                appCompatRatingBar = appCompatViewInflater.b(contextThemeWrapper, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != contextThemeWrapper) {
            Object[] objArr = appCompatViewInflater.f3348a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = contextThemeWrapper;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = AppCompatViewInflater.g;
                        if (i3 < 3) {
                            View viewF = appCompatViewInflater.f(contextThemeWrapper, str, strArr[i3]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i3++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = appCompatViewInflater.f(contextThemeWrapper, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                if (appCompatRatingBar.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f3345c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        appCompatRatingBar.setOnClickListener(new AppCompatViewInflater.DeclaredOnClickListener(appCompatRatingBar, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = contextThemeWrapper.obtainStyledAttributes(attributeSet, AppCompatViewInflater.d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    ViewCompat.A(appCompatRatingBar, typedArrayObtainStyledAttributes3.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f3346e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    ViewCompat.B(appCompatRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = contextThemeWrapper.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    ViewCompat.I(appCompatRatingBar, typedArrayObtainStyledAttributes5.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return appCompatRatingBar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void p() {
        if (this.k0 instanceof Activity) {
            synchronized (AppCompatDelegate.i0) {
                AppCompatDelegate.u(this);
            }
        }
        if (this.a1) {
            this.m0.getDecorView().removeCallbacks(this.c1);
        }
        this.S0 = true;
        if (this.U0 != -100) {
            Object obj = this.k0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                j1.put(this.k0.getClass().getName(), Integer.valueOf(this.U0));
            } else {
                j1.remove(this.k0.getClass().getName());
            }
        } else {
            j1.remove(this.k0.getClass().getName());
        }
        ActionBar actionBar = this.p0;
        if (actionBar != null) {
            actionBar.l();
        }
        AutoTimeNightModeManager autoTimeNightModeManager = this.Y0;
        if (autoTimeNightModeManager != null) {
            autoTimeNightModeManager.a();
        }
        AutoBatteryNightModeManager autoBatteryNightModeManager = this.Z0;
        if (autoBatteryNightModeManager != null) {
            autoBatteryNightModeManager.a();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void q() {
        M();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void r() {
        Q();
        ActionBar actionBar = this.p0;
        if (actionBar != null) {
            actionBar.q(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void s() throws IllegalAccessException {
        D(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void t() {
        Q();
        ActionBar actionBar = this.p0;
        if (actionBar != null) {
            actionBar.q(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean v(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.L0 && i2 == 108) {
            return false;
        }
        if (this.H0 && i2 == 1) {
            this.H0 = false;
        }
        if (i2 == 1) {
            X();
            this.L0 = true;
            return true;
        }
        if (i2 == 2) {
            X();
            this.F0 = true;
            return true;
        }
        if (i2 == 5) {
            X();
            this.G0 = true;
            return true;
        }
        if (i2 == 10) {
            X();
            this.J0 = true;
            return true;
        }
        if (i2 == 108) {
            X();
            this.H0 = true;
            return true;
        }
        if (i2 != 109) {
            return this.m0.requestFeature(i2);
        }
        X();
        this.I0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void w(int i2) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.C0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.l0).inflate(i2, viewGroup);
        this.n0.a(this.m0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void x(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.C0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n0.a(this.m0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void y(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.C0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n0.a(this.m0.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void z(Toolbar toolbar) {
        Object obj = this.k0;
        if (obj instanceof Activity) {
            Q();
            ActionBar actionBar = this.p0;
            if (actionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.q0 = null;
            if (actionBar != null) {
                actionBar.l();
            }
            this.p0 = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.r0, this.n0);
                this.p0 = toolbarActionBar;
                this.n0.f3328Y = toolbarActionBar.f3358c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.n0.f3328Y = null;
            }
            l();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
