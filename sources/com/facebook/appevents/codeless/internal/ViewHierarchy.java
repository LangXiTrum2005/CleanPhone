package com.facebook.appevents.codeless.internal;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.logger.IronSourceError;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0016J\u001b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b)\u0010*J%\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u001cJ\u001b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u0003J\u001d\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u0001072\u0006\u00106\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010;R\u001c\u0010=\u001a\n <*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/facebook/appevents/codeless/internal/ViewHierarchy;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "getParentOfView", "(Landroid/view/View;)Landroid/view/ViewGroup;", "", "getChildrenOfView", "(Landroid/view/View;)Ljava/util/List;", "Lorg/json/JSONObject;", "json", "Lwj/r;", "updateBasicInfoOfView", "(Landroid/view/View;Lorg/json/JSONObject;)V", "", "displayDensity", "updateAppearanceOfView", "(Landroid/view/View;Lorg/json/JSONObject;F)V", "getDictionaryOfView", "(Landroid/view/View;)Lorg/json/JSONObject;", "", "getClassTypeBitmask", "(Landroid/view/View;)I", "", "isAdapterViewItem", "(Landroid/view/View;)Z", "", "getTextOfView", "(Landroid/view/View;)Ljava/lang/String;", "getHintOfView", "getDimensionOfView", "Landroid/view/View$OnClickListener;", "getExistingOnClickListener", "(Landroid/view/View;)Landroid/view/View$OnClickListener;", "newListener", "setOnClickListener", "(Landroid/view/View;Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnTouchListener;", "getExistingOnTouchListener", "(Landroid/view/View;)Landroid/view/View$OnTouchListener;", "", "location", "RCTRootView", "getTouchReactView", "([FLandroid/view/View;)Landroid/view/View;", "isRCTRootView", "findRCTRootView", "(Landroid/view/View;)Landroid/view/View;", "getViewLocationOnScreen", "(Landroid/view/View;)[F", "initTouchTargetHelperMethods", "className", "Ljava/lang/Class;", "getExistingClass", "(Ljava/lang/String;)Ljava/lang/Class;", "isRCTButton", "(Landroid/view/View;Landroid/view/View;)Z", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "CLASS_RCTROOTVIEW", "CLASS_RCTVIEWGROUP", "CLASS_TOUCHTARGETHELPER", "METHOD_FIND_TOUCHTARGET_VIEW", "ICON_MAX_EDGE_LENGTH", "I", "Ljava/lang/ref/WeakReference;", "RCTRootViewReference", "Ljava/lang/ref/WeakReference;", "Ljava/lang/reflect/Method;", "methodFindTouchTargetView", "Ljava/lang/reflect/Method;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ViewHierarchy {
    private static final String CLASS_RCTROOTVIEW = "com.facebook.react.ReactRootView";
    private static final String CLASS_RCTVIEWGROUP = "com.facebook.react.views.view.ReactViewGroup";
    private static final String CLASS_TOUCHTARGETHELPER = "com.facebook.react.uimanager.TouchTargetHelper";
    private static final int ICON_MAX_EDGE_LENGTH = 44;
    private static final String METHOD_FIND_TOUCHTARGET_VIEW = "findTouchTargetView";
    private static Method methodFindTouchTargetView;
    public static final ViewHierarchy INSTANCE = new ViewHierarchy();
    private static final String TAG = ViewHierarchy.class.getCanonicalName();
    private static WeakReference<View> RCTRootViewReference = new WeakReference<>(null);

    private ViewHierarchy() {
    }

    public static final View findRCTRootView(View view) {
        if (a.b(ViewHierarchy.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!INSTANCE.isRCTRootView(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                a.a(ViewHierarchy.class, th2);
            }
        }
        return null;
    }

    public static final List<View> getChildrenOfView(View view) {
        if (a.b(ViewHierarchy.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    public static final int getClassTypeBitmask(View view) {
        if (a.b(ViewHierarchy.class)) {
            return 0;
        }
        try {
            n.f(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (isAdapterViewItem(view)) {
                i10 |= 512;
            }
            if (view instanceof TextView) {
                int i11 = i10 | IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                if (view instanceof Button) {
                    i11 = i10 | IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID;
                    if (view instanceof Switch) {
                        i11 = i10 | 9221;
                    } else if (view instanceof CheckBox) {
                        i11 = 33797 | i10;
                    }
                }
                return view instanceof EditText ? i11 | com.ironsource.mediationsdk.metadata.a.f29616n : i11;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return 65536 | i10;
                }
                if (view instanceof RadioGroup) {
                    return i10 | Http2.INITIAL_MAX_FRAME_SIZE;
                }
                return ((view instanceof ViewGroup) && INSTANCE.isRCTButton(view, RCTRootViewReference.get())) ? i10 | 64 : i10;
            }
            return i10 | 4096;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return 0;
        }
    }

    public static final JSONObject getDictionaryOfView(View view) {
        if (a.b(ViewHierarchy.class)) {
            return null;
        }
        try {
            n.f(view, "view");
            if (view.getClass().getName().equals(CLASS_RCTROOTVIEW)) {
                RCTRootViewReference = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                updateBasicInfoOfView(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> childrenOfView = getChildrenOfView(view);
                int size = childrenOfView.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(getDictionaryOfView(childrenOfView.get(i10)));
                }
                jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to create JSONObject for view.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    private final JSONObject getDimensionOfView(View view) {
        if (a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_SCROLL_X_KEY, view.getScrollX());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_SCROLL_Y_KEY, view.getScrollY());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, view.getVisibility());
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(TAG, "Failed to create JSONObject for dimension.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    private final Class<?> getExistingClass(String className) {
        if (a.b(this)) {
            return null;
        }
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public static final View.OnClickListener getExistingOnClickListener(View view) {
        if (a.b(ViewHierarchy.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            n.d(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener getExistingOnTouchListener(View view) {
        try {
            if (!a.b(ViewHierarchy.class)) {
                try {
                    Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(view);
                    if (obj != null) {
                        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        n.d(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                        return (View.OnTouchListener) obj2;
                    }
                } catch (ClassNotFoundException e10) {
                    e0.A(TAG, e10);
                } catch (IllegalAccessException e11) {
                    e0.A(TAG, e11);
                } catch (NoSuchFieldException e12) {
                    e0.A(TAG, e12);
                }
            }
            return null;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    public static final String getHintOfView(View view) {
        CharSequence hint;
        String string;
        if (a.b(ViewHierarchy.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    public static final ViewGroup getParentOfView(View view) {
        if (a.b(ViewHierarchy.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[EDGE_INSN: B:42:0x00f6->B:43:0x00f7 BREAK  A[LOOP:0: B:32:0x00ca->B:38:0x00e4]] */
    public static final String getTextOfView(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (a.b(ViewHierarchy.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i10);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            n.e(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            n.e(currentMinute, "view.currentMinute");
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(currentMinute.intValue())}, 2));
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return null;
        }
    }

    private final View getTouchReactView(float[] location, View RCTRootView) {
        if (!a.b(this)) {
            try {
                initTouchTargetHelperMethods();
                Method method = methodFindTouchTargetView;
                if (method != null && RCTRootView != null) {
                    try {
                        Object objInvoke = method.invoke(null, location, RCTRootView);
                        n.d(objInvoke, "null cannot be cast to non-null type android.view.View");
                        View view = (View) objInvoke;
                        if (view.getId() > 0) {
                            Object parent = view.getParent();
                            n.d(parent, "null cannot be cast to non-null type android.view.View");
                            return (View) parent;
                        }
                    } catch (IllegalAccessException e10) {
                        e0.A(TAG, e10);
                    } catch (InvocationTargetException e11) {
                        e0.A(TAG, e11);
                    }
                }
            } catch (Throwable th2) {
                a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    private final float[] getViewLocationOnScreen(View view) {
        if (a.b(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    private final void initTouchTargetHelperMethods() {
        if (a.b(this)) {
            return;
        }
        try {
            if (methodFindTouchTargetView != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName(CLASS_TOUCHTARGETHELPER).getDeclaredMethod(METHOD_FIND_TOUCHTARGET_VIEW, float[].class, ViewGroup.class);
                methodFindTouchTargetView = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                e0.A(TAG, e10);
            } catch (NoSuchMethodException e11) {
                e0.A(TAG, e11);
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private static final boolean isAdapterViewItem(View view) {
        if (a.b(ViewHierarchy.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            ViewHierarchy viewHierarchy = INSTANCE;
            Class<?> existingClass = viewHierarchy.getExistingClass("android.support.v4.view.NestedScrollingChild");
            if (existingClass != null && existingClass.isInstance(parent)) {
                return true;
            }
            Class<?> existingClass2 = viewHierarchy.getExistingClass("androidx.core.view.NestedScrollingChild");
            return existingClass2 != null && existingClass2.isInstance(parent);
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
            return false;
        }
    }

    private final boolean isRCTRootView(View view) {
        if (a.b(this)) {
            return false;
        }
        try {
            return view.getClass().getName().equals(CLASS_RCTROOTVIEW);
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    public static final void setOnClickListener(View view, View.OnClickListener newListener) {
        Field declaredField;
        Field declaredField2;
        if (a.b(ViewHierarchy.class)) {
            return;
        }
        try {
            n.f(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(newListener);
                    return;
                }
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                try {
                    declaredField.setAccessible(true);
                    obj = declaredField.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(newListener);
                } else {
                    declaredField2.set(obj, newListener);
                }
            } catch (Exception unused4) {
            }
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
        }
    }

    public static final void updateAppearanceOfView(View view, JSONObject json, float displayDensity) {
        Bitmap bitmap;
        Typeface typeface;
        if (a.b(ViewHierarchy.class)) {
            return;
        }
        try {
            n.f(view, "view");
            n.f(json, "json");
            try {
                JSONObject jSONObject = new JSONObject();
                if ((view instanceof TextView) && (typeface = ((TextView) view).getTypeface()) != null) {
                    jSONObject.put(ViewHierarchyConstants.TEXT_SIZE, ((TextView) view).getTextSize());
                    jSONObject.put(ViewHierarchyConstants.TEXT_IS_BOLD, typeface.isBold());
                    jSONObject.put(ViewHierarchyConstants.TEXT_IS_ITALIC, typeface.isItalic());
                    json.put(ViewHierarchyConstants.TEXT_STYLE, jSONObject);
                }
                if (view instanceof ImageView) {
                    Drawable drawable = ((ImageView) view).getDrawable();
                    if (!(drawable instanceof BitmapDrawable) || view.getHeight() / displayDensity > 44.0f || view.getWidth() / displayDensity > 44.0f || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
                        return;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    json.put(ViewHierarchyConstants.ICON_BITMAP, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                }
            } catch (JSONException e10) {
                e0.A(TAG, e10);
            }
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
        }
    }

    public static final void updateBasicInfoOfView(View view, JSONObject json) {
        if (a.b(ViewHierarchy.class)) {
            return;
        }
        try {
            n.f(view, "view");
            n.f(json, "json");
            try {
                String textOfView = getTextOfView(view);
                String hintOfView = getHintOfView(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put(ViewHierarchyConstants.CLASS_NAME_KEY, view.getClass().getCanonicalName());
                json.put(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY, getClassTypeBitmask(view));
                json.put("id", view.getId());
                if (SensitiveUserDataUtils.isSensitiveUserData(view)) {
                    json.put("text", "");
                    json.put(ViewHierarchyConstants.IS_USER_INPUT_KEY, true);
                } else {
                    json.put("text", e0.d(e0.J(textOfView)));
                }
                json.put(ViewHierarchyConstants.HINT_KEY, e0.d(e0.J(hintOfView)));
                if (tag != null) {
                    json.put(ViewHierarchyConstants.TAG_KEY, e0.d(e0.J(tag.toString())));
                }
                if (contentDescription != null) {
                    json.put("description", e0.d(e0.J(contentDescription.toString())));
                }
                json.put(ViewHierarchyConstants.DIMENSION_KEY, INSTANCE.getDimensionOfView(view));
            } catch (JSONException e10) {
                e0.A(TAG, e10);
            }
        } catch (Throwable th2) {
            a.a(ViewHierarchy.class, th2);
        }
    }

    public final boolean isRCTButton(View view, View RCTRootView) {
        View touchReactView;
        if (a.b(this)) {
            return false;
        }
        try {
            n.f(view, "view");
            return view.getClass().getName().equals(CLASS_RCTVIEWGROUP) && (touchReactView = getTouchReactView(getViewLocationOnScreen(view), RCTRootView)) != null && touchReactView.getId() == view.getId();
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }
}
