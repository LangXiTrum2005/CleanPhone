package com.gyf.immersionbar;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class BarConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21424c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21425e;
    public final float f;

    public BarConfig(Activity activity) {
        int iA;
        this.f21425e = activity.getResources().getConfiguration().orientation == 1;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        this.f = Math.min(f / f2, displayMetrics.heightPixels / f2);
        this.f21422a = a(activity, "status_bar_height");
        View viewFindViewById = activity.getWindow().findViewById(com.charging.screenshow.battery.animations.themes.R.id.action_bar_container);
        if ((viewFindViewById != null ? viewFindViewById.getMeasuredHeight() : 0) == 0) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
            TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        if (b(activity)) {
            iA = a(activity, activity.getResources().getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape");
        } else {
            iA = 0;
        }
        this.f21424c = iA;
        this.d = b(activity) ? a(activity, "navigation_bar_width") : 0;
        this.f21423b = iA > 0;
    }

    public static int a(Activity activity, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(identifier);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
            if (dimensionPixelSize2 >= dimensionPixelSize && (Build.VERSION.SDK_INT < 29 || str.equals("status_bar_height"))) {
                return dimensionPixelSize2;
            }
            float f = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / activity.getResources().getDisplayMetrics().density;
            return (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[PHI: r5
  0x0068: PHI (r5v10 int) = (r5v3 int), (r5v14 int), (r5v18 int), (r5v22 int), (r5v29 int), (r5v27 int) binds: [B:76:0x00e9, B:66:0x00c9, B:59:0x00b7, B:51:0x00a6, B:44:0x0092, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0088 A[PHI: r5
  0x0088: PHI (r5v7 int) = (r5v3 int), (r5v14 int), (r5v18 int), (r5v22 int), (r5v29 int), (r5v27 int) binds: [B:78:0x00ed, B:68:0x00cc, B:63:0x00c0, B:56:0x00ae, B:46:0x0095, B:32:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097 A[PHI: r5
  0x0097: PHI (r5v6 int) = (r5v3 int), (r5v14 int), (r5v18 int), (r5v22 int), (r5v22 int), (r5v22 int), (r5v29 int) binds: [B:78:0x00ed, B:70:0x00d4, B:63:0x00c0, B:53:0x00a9, B:54:0x00ab, B:56:0x00ae, B:46:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    public static boolean b(Activity activity) {
        int i2;
        boolean z2;
        boolean z3;
        GestureUtils.GestureBean gestureBean = new GestureUtils.GestureBean();
        gestureBean.f21431a = false;
        gestureBean.f21432b = false;
        if (activity != null && activity.getContentResolver() != null) {
            ContentResolver contentResolver = activity.getContentResolver();
            NavigationBarType navigationBarType = NavigationBarType.f0;
            boolean zIsHuaWei = OSUtils.isHuaWei();
            NavigationBarType navigationBarType2 = NavigationBarType.f21439Y;
            NavigationBarType navigationBarType3 = NavigationBarType.X;
            if (zIsHuaWei || OSUtils.isEMUI()) {
                i2 = !OSUtils.isEMUI3_x() ? Settings.Global.getInt(contentResolver, "navigationbar_is_min", -1) : Settings.System.getInt(contentResolver, "navigationbar_is_min", -1);
                if (i2 == 0) {
                    z2 = false;
                    z3 = false;
                    navigationBarType = navigationBarType3;
                } else if (i2 == 1) {
                    z2 = false;
                    z3 = true;
                    navigationBarType = navigationBarType2;
                } else {
                    z2 = false;
                    z3 = false;
                }
            } else if (OSUtils.isXiaoMi() || OSUtils.isMIUI()) {
                i2 = Settings.Global.getInt(contentResolver, "force_fsg_nav_bar", -1);
                if (i2 == 0) {
                    z2 = false;
                    z3 = false;
                    navigationBarType = navigationBarType3;
                } else if (i2 == 1) {
                    if (Settings.Global.getInt(contentResolver, "hide_gesture_line", -1) != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = true;
                    navigationBarType = navigationBarType2;
                } else {
                    z2 = false;
                    z3 = false;
                }
            } else {
                boolean zIsVivo = OSUtils.isVivo();
                NavigationBarType navigationBarType4 = NavigationBarType.Z;
                if (zIsVivo || OSUtils.isFuntouchOrOriginOs()) {
                    i2 = Settings.Secure.getInt(contentResolver, "navigation_gesture_on", -1);
                    if (i2 == 0) {
                        z2 = false;
                        z3 = false;
                        navigationBarType = navigationBarType3;
                    } else if (i2 == 1) {
                        z3 = true;
                        navigationBarType = navigationBarType4;
                        z2 = false;
                    } else if (i2 == 2) {
                        z2 = false;
                        z3 = true;
                        navigationBarType = navigationBarType2;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (OSUtils.isOppo() || OSUtils.isColorOs()) {
                    i2 = Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", -1);
                    if (i2 == 0) {
                        z2 = false;
                        z3 = false;
                        navigationBarType = navigationBarType3;
                    } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                        z2 = false;
                        z3 = true;
                        navigationBarType = navigationBarType2;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (OSUtils.isSamsung()) {
                    i2 = Settings.Global.getInt(contentResolver, "navigation_bar_gesture_while_hidden", -1);
                    if (i2 == -1) {
                        i2 = Settings.Global.getInt(contentResolver, "navigationbar_hide_bar_enabled", -1);
                        if (i2 == 0) {
                            z2 = false;
                            z3 = false;
                            navigationBarType = navigationBarType3;
                        } else if (i2 == 1) {
                            z2 = false;
                            z3 = true;
                            navigationBarType = navigationBarType2;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                    } else if (i2 == 0) {
                        z2 = false;
                        z3 = false;
                        navigationBarType = navigationBarType3;
                    } else if (i2 == 1) {
                        navigationBarType = Settings.Global.getInt(contentResolver, "navigation_bar_gesture_detail_type", 1) == 1 ? navigationBarType2 : navigationBarType4;
                        z2 = Settings.Global.getInt(contentResolver, "navigation_bar_gesture_hint", 1) == 1;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else {
                    z2 = false;
                    z3 = false;
                    i2 = -1;
                }
            }
            if (i2 != -1) {
                navigationBarType2 = navigationBarType;
            } else {
                int i3 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                if (i3 == 0) {
                    z3 = false;
                    navigationBarType2 = navigationBarType3;
                } else if (i3 == 1) {
                    navigationBarType2 = NavigationBarType.e0;
                    z3 = false;
                } else if (i3 == 2) {
                    z2 = true;
                    z3 = true;
                } else {
                    navigationBarType2 = navigationBarType;
                }
            }
            gestureBean.f21431a = z3;
            gestureBean.f21432b = z2;
            gestureBean.f21433c = navigationBarType2;
        }
        if (gestureBean.f21432b || !gestureBean.f21431a) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i4 = displayMetrics.heightPixels;
            int i5 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            int i6 = displayMetrics2.heightPixels;
            if (i5 - displayMetrics2.widthPixels > 0 || i4 - i6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.f >= 600.0f || this.f21425e;
    }
}
