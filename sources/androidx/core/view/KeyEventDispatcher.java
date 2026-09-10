package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class KeyEventDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4441a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f4442b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4443c = false;
    public static Field d;

    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = ViewCompat.UnhandledKeyEventManager.d;
        ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager = (ViewCompat.UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (unhandledKeyEventManager == null) {
            unhandledKeyEventManager = new ViewCompat.UnhandledKeyEventManager();
            unhandledKeyEventManager.f4477a = null;
            unhandledKeyEventManager.f4478b = null;
            unhandledKeyEventManager.f4479c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
        }
        WeakReference weakReference2 = unhandledKeyEventManager.f4479c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        unhandledKeyEventManager.f4479c = new WeakReference(keyEvent);
        if (unhandledKeyEventManager.f4478b == null) {
            unhandledKeyEventManager.f4478b = new SparseArray();
        }
        SparseArray sparseArray = unhandledKeyEventManager.f4478b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            ViewCompat.UnhandledKeyEventManager.b(view2, keyEvent);
        }
        return true;
    }

    public static boolean b(Component component, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (component != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return component.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f4441a) {
                            try {
                                f4442b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f4441a = true;
                        }
                        Method method = f4442b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (ViewCompat.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f4443c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f4443c = true;
                }
                Field field = d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (ViewCompat.d(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && ViewCompat.d(view, keyEvent)) || component.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
