package com.gyf.immersionbar;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class NotchUtils {
    private static final String NOTCH_HUA_WEI = "com.huawei.android.util.HwNotchSizeUtil";
    private static final String NOTCH_LENOVO = "config_screen_has_notch";
    private static final String NOTCH_MEIZU = "flyme.config.FlymeFeature";
    private static final String NOTCH_OPPO = "com.oppo.feature.screen.heteromorphism";
    private static final String NOTCH_VIVO = "android.util.FtFeature";
    private static final String NOTCH_XIAO_MI = "ro.miui.notch";
    private static final String SYSTEM_PROPERTIES = "android.os.SystemProperties";

    private static int dp2px(Context context, int i2) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    private static DisplayCutout getDisplayCutout(Activity activity) {
        return getDisplayCutout(activity.getWindow().getDecorView());
    }

    private static int[] getHuaWeiNotchSize(Context context) {
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(NOTCH_HUA_WEI);
            return (int[]) clsLoadClass.getMethod("getNotchSize", new Class[0]).invoke(clsLoadClass, new Object[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return iArr;
        }
    }

    private static int getLenovoNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("notch_h", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static int getMeizuNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("fringe_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d A[PHI: r1
  0x006d: PHI (r1v4 int) = (r1v3 int), (r1v7 int) binds: [B:30:0x0066, B:32:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public static int getNotchHeight(Activity activity) {
        if (!hasNotchScreen(activity)) {
            return 0;
        }
        BarConfig barConfig = new BarConfig(activity);
        DisplayCutout displayCutout = getDisplayCutout(activity);
        if (Build.VERSION.SDK_INT >= 28 && displayCutout != null) {
            if (activity.getResources().getConfiguration().orientation == 1) {
                return displayCutout.getSafeInsetTop();
            }
            return displayCutout.getSafeInsetLeft() == 0 ? displayCutout.getSafeInsetRight() : displayCutout.getSafeInsetLeft();
        }
        int xiaoMiNotchHeight = hasNotchAtXiaoMi(activity) ? getXiaoMiNotchHeight(activity) : 0;
        if (hasNotchAtHuaWei(activity)) {
            xiaoMiNotchHeight = getHuaWeiNotchSize(activity)[1];
        }
        boolean zHasNotchAtVIVO = hasNotchAtVIVO(activity);
        int lenovoNotchHeight = barConfig.f21422a;
        if (zHasNotchAtVIVO && (xiaoMiNotchHeight = dp2px(activity, 32)) < lenovoNotchHeight) {
            xiaoMiNotchHeight = lenovoNotchHeight;
        }
        if (hasNotchAtOPPO(activity)) {
            xiaoMiNotchHeight = 80;
            if (80 >= lenovoNotchHeight) {
                lenovoNotchHeight = xiaoMiNotchHeight;
            }
        } else {
            lenovoNotchHeight = xiaoMiNotchHeight;
        }
        if (hasNotchAtLenovo(activity)) {
            lenovoNotchHeight = getLenovoNotchHeight(activity);
        }
        return hasNotchAtMeiZu() ? getMeizuNotchHeight(activity) : lenovoNotchHeight;
    }

    private static int getXiaoMiNotchHeight(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean hasNotchAtAndroidP(View view) {
        return getDisplayCutout(view) != null;
    }

    private static boolean hasNotchAtHuaWei(Context context) {
        if (OSUtils.isHuaWei()) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass(NOTCH_HUA_WEI);
                return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
            } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            }
        }
        return false;
    }

    private static boolean hasNotchAtLenovo(Context context) {
        int identifier;
        if (!OSUtils.isLenovo() || (identifier = context.getResources().getIdentifier(NOTCH_LENOVO, "bool", "android")) <= 0) {
            return false;
        }
        return context.getResources().getBoolean(identifier);
    }

    private static boolean hasNotchAtMeiZu() {
        if (OSUtils.isMeizu()) {
            try {
                return ((Boolean) Class.forName(NOTCH_MEIZU).getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean hasNotchAtOPPO(Context context) {
        if (OSUtils.isOppo()) {
            try {
                return context.getPackageManager().hasSystemFeature(NOTCH_OPPO);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean hasNotchAtVIVO(Context context) {
        if (!OSUtils.isVivo()) {
            return false;
        }
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(NOTCH_VIVO);
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    private static boolean hasNotchAtXiaoMi(Context context) {
        int iIntValue;
        if (OSUtils.isXiaoMi()) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass(SYSTEM_PROPERTIES);
                Object objInvoke = clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, NOTCH_XIAO_MI, 0);
                if (objInvoke != null) {
                    iIntValue = ((Integer) objInvoke).intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } else {
            iIntValue = 0;
        }
        return iIntValue == 1;
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return hasNotchAtAndroidP(activity);
        }
        return hasNotchAtXiaoMi(activity) || hasNotchAtHuaWei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVIVO(activity) || hasNotchAtLenovo(activity) || hasNotchAtMeiZu();
    }

    private static DisplayCutout getDisplayCutout(View view) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 28 || view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getDisplayCutout();
    }

    private static boolean hasNotchAtAndroidP(Activity activity) {
        return getDisplayCutout(activity) != null;
    }

    public static boolean hasNotchScreen(View view) {
        if (view == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return hasNotchAtAndroidP(view);
        }
        return hasNotchAtXiaoMi(view.getContext()) || hasNotchAtHuaWei(view.getContext()) || hasNotchAtOPPO(view.getContext()) || hasNotchAtVIVO(view.getContext());
    }

    public static void getNotchHeight(final Activity activity, final NotchCallback notchCallback) {
        activity.getWindow().getDecorView().post(new Runnable() { // from class: com.gyf.immersionbar.NotchUtils.1
            @Override // java.lang.Runnable
            public final void run() {
                NotchCallback notchCallback2 = notchCallback;
                if (notchCallback2 != null) {
                    NotchUtils.getNotchHeight(activity);
                    notchCallback2.a();
                }
            }
        });
    }
}
