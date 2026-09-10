package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: ViewConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class treadless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Method f9453attabal;

    /* JADX INFO: compiled from: ViewConfigurationCompat.java */
    public static class attabal {
        public static float attabal(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float saneness(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: compiled from: ViewConfigurationCompat.java */
    public static class dern {
        public static int attabal(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        public static int saneness(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    /* JADX INFO: compiled from: ViewConfigurationCompat.java */
    public static class saneness {
        public static int attabal(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean saneness(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f9453attabal = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean apical(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static int attabal(Resources resources, int i, technofreak.apical<Integer> apicalVar, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return apicalVar.get().intValue();
    }

    public static float beachfront(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? attabal.attabal(viewConfiguration) : saneness(viewConfiguration, context);
    }

    public static int competently(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? saneness.attabal(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static float cutely(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? attabal.saneness(viewConfiguration) : saneness(viewConfiguration, context);
    }

    public static int dern(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static boolean formularize(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return saneness.saneness(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iDern = dern(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iDern != 0 && resources.getBoolean(iDern);
    }

    public static int impromptu(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dern.attabal(viewConfiguration, i, i2, i3);
        }
        if (!apical(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iWireman = wireman(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return attabal(resources, iWireman, new technofreak.apical() { // from class: androidx.core.view.timberyard
            @Override // technofreak.apical
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int marial(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return dern(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float saneness(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f9453attabal) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true) ? typedValue.getDimension(context.getResources().getDisplayMetrics()) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static int taiyuan(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dern.saneness(viewConfiguration, i, i2, i3);
        }
        if (!apical(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iMarial = marial(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return attabal(resources, iMarial, new technofreak.apical() { // from class: androidx.core.view.milliradian
            @Override // technofreak.apical
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static int wireman(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return dern(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }
}
