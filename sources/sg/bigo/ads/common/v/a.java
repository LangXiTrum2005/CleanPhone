package sg.bigo.ads.common.v;

import android.app.KeyguardManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import sg.bigo.ads.common.f.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f47550a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f47551b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f47552c = 2;
    public static int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f47553e = 4;
    public static int f = 5;
    public int g = f47550a;

    public static boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null) {
            return false;
        }
        while (true) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    layoutParams = null;
                    break;
                }
                view = (View) parent;
            } else {
                layoutParams = (WindowManager.LayoutParams) layoutParams2;
                break;
            }
        }
        if (layoutParams == null) {
            return false;
        }
        int i2 = layoutParams.type;
        return i2 == 2002 || i2 == 2003 || i2 == 2006 || i2 == 2007 || i2 == 2010 || i2 == 2038;
    }

    public final int a() {
        int i2;
        int iC = b.c();
        if (iC != 1) {
            i2 = iC != 2 ? f47550a : f47553e;
        } else {
            i2 = f47551b;
        }
        this.g = i2;
        return this.g;
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) view.getContext().getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardLocked();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
