package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import com.gyf.immersionbar.OSUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes3.dex */
public final class S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3703a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final float f;

    public S8(Activity activity) {
        int iA;
        this.e = activity.getResources().getConfiguration().orientation == 1;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        this.f = Math.min(f / f2, displayMetrics.heightPixels / f2);
        this.f3703a = a(activity, "status_bar_height");
        View viewFindViewById = activity.getWindow().findViewById(R.id.action_bar_container);
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
        this.c = iA;
        this.d = b(activity) ? a(activity, "navigation_bar_width") : 0;
        this.b = iA > 0;
    }

    public static int a(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize && (Build.VERSION.SDK_INT < 29 || str.equals("status_bar_height"))) {
                    return dimensionPixelSize2;
                }
                float f = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                return (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0056 A[PHI: r3
  0x0056: PHI (r3v11 int) = 
  (r3v5 int)
  (r3v5 int)
  (r3v15 int)
  (r3v15 int)
  (r3v20 int)
  (r3v20 int)
  (r3v24 int)
  (r3v24 int)
  (r3v27 int)
  (r3v31 int)
  (r3v31 int)
  (r3v29 int)
  (r3v29 int)
 binds: [B:69:0x00c1, B:71:0x00c4, B:59:0x00a2, B:61:0x00a5, B:52:0x0093, B:56:0x0099, B:44:0x0082, B:49:0x008a, B:42:0x007a, B:38:0x0073, B:40:0x0076, B:30:0x0054, B:32:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[PHI: r3
  0x0069: PHI (r3v16 int) = (r3v15 int), (r3v29 int) binds: [B:63:0x00ad, B:34:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[PHI: r3
  0x0078: PHI (r3v7 int) = (r3v5 int), (r3v15 int), (r3v20 int), (r3v20 int), (r3v24 int), (r3v24 int), (r3v24 int), (r3v31 int), (r3v29 int) binds: [B:71:0x00c4, B:63:0x00ad, B:54:0x0096, B:56:0x0099, B:46:0x0085, B:47:0x0087, B:49:0x008a, B:40:0x0076, B:34:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    public static boolean b(Activity activity) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        if (activity != null && activity.getContentResolver() != null) {
            ContentResolver contentResolver = activity.getContentResolver();
            if (OSUtils.isHuaWei() || OSUtils.isEMUI()) {
                i = !OSUtils.isEMUI3_x() ? Settings.Global.getInt(contentResolver, "navigationbar_is_min", -1) : Settings.System.getInt(contentResolver, "navigationbar_is_min", -1);
                if (i != 0 && i == 1) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (i == -1) {
                    i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                    if (i2 == 0 && i2 != 1) {
                        if (i2 == 2) {
                            z = true;
                            z2 = true;
                        }
                    }
                }
            } else if (OSUtils.isXiaoMi() || OSUtils.isMIUI()) {
                i = Settings.Global.getInt(contentResolver, "force_fsg_nav_bar", -1);
                if (i != 0 && i == 1) {
                    if (Settings.Global.getInt(contentResolver, "hide_gesture_line", -1) != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (i == -1) {
                    i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                    if (i2 == 0) {
                        if (i2 == 2) {
                            z = true;
                            z2 = true;
                        }
                    }
                }
            } else if (OSUtils.isVivo() || OSUtils.isFuntouchOrOriginOs()) {
                i = Settings.Secure.getInt(contentResolver, "navigation_gesture_on", -1);
                if (i != 0 && (i == 1 || i == 2)) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (i == -1) {
                    i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                    if (i2 == 0) {
                        if (i2 == 2) {
                            z = true;
                            z2 = true;
                        }
                    }
                }
            } else if (OSUtils.isOppo() || OSUtils.isColorOs()) {
                i = Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", -1);
                if (i != 0 && (i == 1 || i == 2 || i == 3)) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (i == -1) {
                    i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                    if (i2 == 0) {
                        if (i2 == 2) {
                            z = true;
                            z2 = true;
                        }
                    }
                }
            } else {
                if (OSUtils.isSamsung()) {
                    i = Settings.Global.getInt(contentResolver, "navigation_bar_gesture_while_hidden", -1);
                    if (i != -1) {
                        if (i != 0 && i == 1) {
                            Settings.Global.getInt(contentResolver, "navigation_bar_gesture_detail_type", 1);
                            if (Settings.Global.getInt(contentResolver, "navigation_bar_gesture_hint", 1) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = true;
                        }
                        if (i == -1) {
                            i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                            if (i2 == 0) {
                                if (i2 == 2) {
                                    z = true;
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        i = Settings.Global.getInt(contentResolver, "navigationbar_hide_bar_enabled", -1);
                        if (i != 0 && i == 1) {
                            z = false;
                            z2 = true;
                        }
                        if (i == -1) {
                            i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                            if (i2 == 0) {
                                if (i2 == 2) {
                                    z = true;
                                    z2 = true;
                                }
                            }
                        }
                    }
                } else {
                    i = -1;
                }
                z = false;
                z2 = false;
                if (i == -1) {
                    i2 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                    if (i2 == 0) {
                        if (i2 == 2) {
                            z = true;
                            z2 = true;
                        }
                    }
                }
            }
            if (z && z2) {
                return false;
            }
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i3 = displayMetrics.heightPixels;
            int i4 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            return i4 - displayMetrics2.widthPixels > 0 || i3 - displayMetrics2.heightPixels > 0;
        }
        z = false;
        z2 = false;
        if (z) {
        }
        Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics3 = new DisplayMetrics();
        defaultDisplay2.getRealMetrics(displayMetrics3);
        int i5 = displayMetrics3.heightPixels;
        int i6 = displayMetrics3.widthPixels;
        DisplayMetrics displayMetrics4 = new DisplayMetrics();
        defaultDisplay2.getMetrics(displayMetrics4);
        if (i6 - displayMetrics4.widthPixels > 0) {
            return true;
        }
    }

    public final boolean c() {
        return this.f >= 600.0f || this.e;
    }
}
