package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f3344b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f3345c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f3346e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleArrayMap f3347h = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3348a = new Object[2];

    public static class DeclaredOnClickListener implements View.OnClickListener {
        public final View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final String f3349Y;
        public Method Z;
        public Context e0;

        public DeclaredOnClickListener(View view, String str) {
            this.X = view;
            this.f3349Y = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.Z != null) {
                break;
            }
            View view2 = this.X;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3349Y;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbY = android.support.v4.media.a.y("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbY.append(view2.getClass());
                    sbY.append(str);
                    throw new IllegalStateException(sbY.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.Z = method;
                        this.e0 = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.Z.invoke(this.e0, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.buttonStyle);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.checkboxStyle);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        SimpleArrayMap simpleArrayMap = f3347h;
        Constructor constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3344b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3348a);
    }
}
