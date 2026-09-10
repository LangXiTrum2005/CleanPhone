package earstone;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: GhostViewPlatform.java */
/* JADX INFO: loaded from: classes.dex */
public class competently implements marial {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static boolean f25514adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static Class<?> f25515arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static Method f25516graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static boolean f25517molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static boolean f25518monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static Method f25519polloi;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final View f25520kowloon;

    public competently(View view) {
        this.f25520kowloon = view;
    }

    public static void beachfront(View view) {
        marial();
        Method method = f25516graveside;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public static void dern() {
        if (f25517molybdenite) {
            return;
        }
        try {
            wireman();
            Method declaredMethod = f25515arytenoidectomy.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f25519polloi = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f25517molybdenite = true;
    }

    public static void marial() {
        if (f25514adultoid) {
            return;
        }
        try {
            wireman();
            Method declaredMethod = f25515arytenoidectomy.getDeclaredMethod("removeGhost", View.class);
            f25516graveside = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f25514adultoid = true;
    }

    public static marial saneness(View view, ViewGroup viewGroup, Matrix matrix) {
        dern();
        Method method = f25519polloi;
        if (method != null) {
            try {
                return new competently((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    public static void wireman() {
        if (f25518monoploid) {
            return;
        }
        try {
            f25515arytenoidectomy = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        f25518monoploid = true;
    }

    @Override // earstone.marial
    public void setVisibility(int i) {
        this.f25520kowloon.setVisibility(i);
    }

    @Override // earstone.marial
    public void attabal(ViewGroup viewGroup, View view) {
    }
}
