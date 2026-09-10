package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: KeyEventDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f9302attabal = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f9303dern = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Method f9304saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static Field f9305wireman;

    /* JADX INFO: compiled from: KeyEventDispatcher.java */
    public interface attabal {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean attabal(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f9302attabal) {
            try {
                f9304saneness = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f9302attabal = true;
        }
        Method method = f9304saneness;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    public static DialogInterface.OnKeyListener beachfront(Dialog dialog) {
        if (!f9303dern) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f9305wireman = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9303dern = true;
        }
        Field field = f9305wireman;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    public static boolean dern(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerBeachfront = beachfront(dialog);
        if (onKeyListenerBeachfront != null && onKeyListenerBeachfront.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (premeiotic.impromptu(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean marial(attabal attabalVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (attabalVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return attabalVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return saneness((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return dern((Dialog) callback, keyEvent);
        }
        return (view != null && premeiotic.impromptu(view, keyEvent)) || attabalVar.superDispatchKeyEvent(keyEvent);
    }

    public static boolean saneness(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && attabal(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (premeiotic.impromptu(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    public static boolean wireman(View view, KeyEvent keyEvent) {
        return premeiotic.taiyuan(view, keyEvent);
    }
}
