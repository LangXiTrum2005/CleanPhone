package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.sealless;
import androidx.collection.splinterproof;
import androidx.core.view.premeiotic;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AppCompatViewInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object[] f4757attabal = new Object[2];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Class<?>[] f4755saneness = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f4752dern = {R.attr.onClick};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f4756wireman = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f4754marial = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int[] f4750beachfront = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final String[] f4751competently = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final splinterproof<String, Constructor<? extends View>> f4753impromptu = new splinterproof<>();

    /* JADX INFO: compiled from: AppCompatViewInflater.java */
    public static class attabal implements View.OnClickListener {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final String f4758arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final View f4759kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Method f4760monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public Context f4761polloi;

        public attabal(View view, String str) {
            this.f4759kowloon = view;
            this.f4758arytenoidectomy = str;
        }

        public final void attabal(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f4758arytenoidectomy, View.class)) != null) {
                        this.f4760monoploid = method;
                        this.f4761polloi = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f4759kowloon.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f4759kowloon.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f4758arytenoidectomy + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f4759kowloon.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f4760monoploid == null) {
                attabal(this.f4759kowloon.getContext());
            }
            try {
                this.f4760monoploid.invoke(this.f4761polloi, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public static Context adultoid(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, beachfront.cutely.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(beachfront.cutely.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(beachfront.cutely.View_theme, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof apical.wireman) && ((apical.wireman) context).dern() == resourceId)) ? context : new apical.wireman(context, resourceId);
    }

    public AppCompatRadioButton apical(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatToggleButton arytenoidectomy(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    public final void attabal(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4756wireman);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            premeiotic.empress(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4754marial);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            premeiotic.coi(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4750beachfront);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            premeiotic.lightstruck(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    public AppCompatCheckedTextView beachfront(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    public AppCompatEditText competently(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    public AppCompatMultiAutoCompleteTextView cutely(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatAutoCompleteTextView dern(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public final void dovishness(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public AppCompatRatingBar formularize(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    public final View graveside(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f4757attabal;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return molybdenite(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f4751competently;
                if (i >= strArr.length) {
                    return null;
                }
                View viewMolybdenite = molybdenite(context, str, strArr[i]);
                if (viewMolybdenite != null) {
                    return viewMolybdenite;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f4757attabal;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public AppCompatSeekBar impassible(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    public AppCompatImageButton impromptu(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    public AppCompatTextView kowloon(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public AppCompatCheckBox marial(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public final View molybdenite(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        splinterproof<String, Constructor<? extends View>> splinterproofVar = f4753impromptu;
        Constructor<? extends View> constructor = splinterproofVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4755saneness);
            splinterproofVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f4757attabal);
    }

    public View monoploid(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View polloi(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewFormularize;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = adultoid(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = sealless.saneness(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewFormularize = formularize(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "CheckedTextView":
                viewFormularize = beachfront(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "MultiAutoCompleteTextView":
                viewFormularize = cutely(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "TextView":
                viewFormularize = kowloon(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "ImageButton":
                viewFormularize = impromptu(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "SeekBar":
                viewFormularize = impassible(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "Spinner":
                viewFormularize = triweekly(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "RadioButton":
                viewFormularize = apical(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "ToggleButton":
                viewFormularize = arytenoidectomy(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "ImageView":
                viewFormularize = taiyuan(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "AutoCompleteTextView":
                viewFormularize = dern(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "CheckBox":
                viewFormularize = marial(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "EditText":
                viewFormularize = competently(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            case "Button":
                viewFormularize = wireman(context2, attributeSet);
                dovishness(viewFormularize, str);
                break;
            default:
                viewFormularize = monoploid(context2, str, attributeSet);
                break;
        }
        if (viewFormularize == null && context != context2) {
            viewFormularize = graveside(context2, str, attributeSet);
        }
        if (viewFormularize != null) {
            saneness(viewFormularize, attributeSet);
            attabal(context2, viewFormularize, attributeSet);
        }
        return viewFormularize;
    }

    public final void saneness(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4752dern);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new attabal(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppCompatImageView taiyuan(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public AppCompatSpinner triweekly(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AppCompatButton wireman(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }
}
