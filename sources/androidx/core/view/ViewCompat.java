package androidx.core.view;

import A.AbstractC0912t;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.Insets;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.charging.screenshow.battery.animations.themes.R;
import com.p004ironsource.d9;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f4466a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f4467b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4468c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f4469e = new e();
    public static final AccessibilityPaneVisibilityManager f = new AccessibilityPaneVisibilityManager();

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$1, reason: invalid class name */
    class AnonymousClass1 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.d(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.j(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$2, reason: invalid class name */
    class AnonymousClass2 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api28Impl.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.h(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$3, reason: invalid class name */
    class AnonymousClass3 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api30Impl.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api30Impl.e(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$4, reason: invalid class name */
    class AnonymousClass4 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.c(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.g(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap X = new WeakHashMap();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.X.entrySet()) {
                    View view = (View) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
                    if (zBooleanValue != z2) {
                        ViewCompat.s(z2 ? 16 : 32, view);
                        entry.setValue(Boolean.valueOf(z2));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class AccessibilityViewProperty<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f4471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4472c;
        public final int d;

        public AccessibilityViewProperty(int i2, Class cls, int i3, int i4) {
            this.f4470a = i2;
            this.f4471b = cls;
            this.d = i3;
            this.f4472c = i4;
        }

        public abstract Object a(View view);

        public abstract void b(View view, Object obj);

        public final Object c(View view) {
            if (Build.VERSION.SDK_INT >= this.f4472c) {
                return a(view);
            }
            Object tag = view.getTag(this.f4470a);
            if (this.f4471b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void d(View view, Object obj) {
            if (Build.VERSION.SDK_INT >= this.f4472c) {
                b(view, obj);
                return;
            }
            if (e(c(view), obj)) {
                AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                if (accessibilityDelegateCompatE == null) {
                    accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
                }
                ViewCompat.z(view, accessibilityDelegateCompatE);
                view.setTag(this.f4470a, obj);
                ViewCompat.s(this.d, view);
            }
        }

        public boolean e(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }
    }

    public static class Api20Impl {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class Api21Impl {
        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsO = windowInsetsCompat.o();
            if (windowInsetsO != null) {
                return WindowInsetsCompat.p(view, view.computeSystemWindowInsets(windowInsetsO, rect));
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static boolean c(View view, float f, float f2, boolean z2) {
            return view.dispatchNestedFling(f, f2, z2);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static WindowInsetsCompat j(View view) {
            if (!WindowInsetsCompat.Api21ReflectionHolder.d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = WindowInsetsCompat.Api21ReflectionHolder.f4506a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) WindowInsetsCompat.Api21ReflectionHolder.f4507b.get(obj);
                Rect rect2 = (Rect) WindowInsetsCompat.Api21ReflectionHolder.f4508c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                WindowInsetsCompat.BuilderImpl builderImpl = new WindowInsetsCompat.Builder().f4509a;
                builderImpl.e(Insets.b(rect.left, rect.top, rect.right, rect.bottom));
                builderImpl.g(Insets.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                WindowInsetsCompat windowInsetsCompatB = builderImpl.b();
                windowInsetsCompatB.f4505a.r(windowInsetsCompatB);
                windowInsetsCompatB.f4505a.d(view.getRootView());
                return windowInsetsCompatB;
            } catch (IllegalAccessException e2) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        public static void u(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public WindowInsetsCompat f4473a = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat windowInsetsCompatP = WindowInsetsCompat.p(view2, windowInsets);
                        int i2 = Build.VERSION.SDK_INT;
                        OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                        if (i2 < 30) {
                            Api21Impl.a(windowInsets, view);
                            if (windowInsetsCompatP.equals(this.f4473a)) {
                                return onApplyWindowInsetsListener2.d(view2, windowInsetsCompatP).o();
                            }
                        }
                        this.f4473a = windowInsetsCompatP;
                        WindowInsetsCompat windowInsetsCompatD = onApplyWindowInsetsListener2.d(view2, windowInsetsCompatP);
                        if (i2 >= 30) {
                            return windowInsetsCompatD.o();
                        }
                        WeakHashMap weakHashMap = ViewCompat.f4466a;
                        Api20Impl.c(view2);
                        return windowInsetsCompatD.o();
                    }
                });
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class Api23Impl {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatP = WindowInsetsCompat.p(null, rootWindowInsets);
            WindowInsetsCompat.Impl impl = windowInsetsCompatP.f4505a;
            impl.r(windowInsetsCompatP);
            impl.d(view.getRootView());
            return windowInsetsCompatP;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        public static void d(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static class Api24Impl {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class Api26Impl {
        public static void a(View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z2) {
            view.setFocusedByDefault(z2);
        }

        public static void m(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        public static void n(View view, boolean z2) {
            view.setKeyboardNavigationCluster(z2);
        }

        public static void o(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class Api28Impl {
        public static void a(View view, final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap(0);
                view.setTag(R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.f
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return onUnhandledKeyEventListenerCompat.a();
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        public static void g(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillIdCompat autofillIdCompat) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    public static class Api29Impl {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        public static void e(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class Api30Impl {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i2) {
            view.setImportantForContentCapture(i2);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class Api31Impl {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat b(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoG = contentInfoCompat.f4423a.g();
            Objects.requireNonNull(contentInfoG);
            ContentInfo contentInfoL = AbstractC0912t.l(contentInfoG);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoL);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoL ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfoPerformReceiveContent));
        }

        public static void c(View view, String[] strArr, OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OnReceiveContentListener f4476a;

        public OnReceiveContentListenerAdapter(OnReceiveContentListener onReceiveContentListener) {
            this.f4476a = onReceiveContentListener;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfo));
            ContentInfoCompat contentInfoCompatA = this.f4476a.a(view, contentInfoCompat);
            if (contentInfoCompatA == null) {
                return null;
            }
            if (contentInfoCompatA == contentInfoCompat) {
                return contentInfo;
            }
            ContentInfo contentInfoG = contentInfoCompatA.f4423a.g();
            Objects.requireNonNull(contentInfoG);
            return AbstractC0912t.l(contentInfoG);
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean a();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    public static class UnhandledKeyEventManager {
        public static final ArrayList d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakHashMap f4477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray f4478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference f4479c;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f4477a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    public static void A(View view, boolean z2) {
        new AnonymousClass4(R.id.tag_accessibility_heading, Boolean.class, 0, 28).d(view, Boolean.valueOf(z2));
    }

    public static void B(View view, CharSequence charSequence) {
        new AnonymousClass2(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view, charSequence);
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = f;
        if (charSequence == null) {
            accessibilityPaneVisibilityManager.X.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
        } else {
            accessibilityPaneVisibilityManager.X.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
            }
        }
    }

    public static void C(View view, ColorStateList colorStateList) {
        Api21Impl.q(view, colorStateList);
    }

    public static void D(View view, PorterDuff.Mode mode) {
        Api21Impl.r(view, mode);
    }

    public static void E(View view, float f2) {
        Api21Impl.s(view, f2);
    }

    public static void F(ViewGroup viewGroup, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m(viewGroup, i2);
        }
    }

    public static void G(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.u(view, onApplyWindowInsetsListener);
    }

    public static void H(ViewGroup viewGroup, PointerIconCompat pointerIconCompat) {
        Api24Impl.d(viewGroup, pointerIconCompat != null ? pointerIconCompat.f4456a : null);
    }

    public static void I(View view, boolean z2) {
        new AnonymousClass1(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).d(view, Boolean.valueOf(z2));
    }

    public static void J(ViewGroup viewGroup, int i2) {
        Api23Impl.d(viewGroup, i2, 3);
    }

    public static void K(SwitchCompat switchCompat, CharSequence charSequence) {
        new AnonymousClass3(R.id.tag_state_description, CharSequence.class, 64, 30).d(switchCompat, charSequence);
    }

    public static void L(View view, String str) {
        Api21Impl.v(view, str);
    }

    public static void M(View view, float f2) {
        Api21Impl.w(view, f2);
    }

    public static void N(View view, WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback));
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.Impl21.f4494e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        View.OnApplyWindowInsetsListener impl21OnApplyWindowInsetsListener = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(view, callback);
        view.setTag(R.id.tag_window_insets_animation_callback, impl21OnApplyWindowInsetsListener);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(impl21OnApplyWindowInsetsListener);
        }
    }

    public static ViewPropertyAnimatorCompat a(View view) {
        if (f4466a == null) {
            f4466a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f4466a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f4466a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static void b(ActionBarOverlayLayout actionBarOverlayLayout, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        Api21Impl.b(actionBarOverlayLayout, windowInsetsCompat, rect);
    }

    public static WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsO = windowInsetsCompat.o();
        if (windowInsetsO != null) {
            WindowInsets windowInsetsA = Api20Impl.a(view, windowInsetsO);
            if (!windowInsetsA.equals(windowInsetsO)) {
                return WindowInsetsCompat.p(view, windowInsetsA);
            }
        }
        return windowInsetsCompat;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = UnhandledKeyEventManager.d;
        UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (unhandledKeyEventManager == null) {
            unhandledKeyEventManager = new UnhandledKeyEventManager();
            unhandledKeyEventManager.f4477a = null;
            unhandledKeyEventManager.f4478b = null;
            unhandledKeyEventManager.f4479c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = unhandledKeyEventManager.f4477a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = UnhandledKeyEventManager.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (unhandledKeyEventManager.f4477a == null) {
                            unhandledKeyEventManager.f4477a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = UnhandledKeyEventManager.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                unhandledKeyEventManager.f4477a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    unhandledKeyEventManager.f4477a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = unhandledKeyEventManager.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (unhandledKeyEventManager.f4478b == null) {
                    unhandledKeyEventManager.f4478b = new SparseArray();
                }
                unhandledKeyEventManager.f4478b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static AccessibilityDelegateCompat e(View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateF).f4419a : new AccessibilityDelegateCompat(accessibilityDelegateF);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(view);
        }
        if (f4468c) {
            return null;
        }
        if (f4467b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4467b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4468c = true;
                return null;
            }
        }
        try {
            Object obj = f4467b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4468c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        return (CharSequence) new AnonymousClass2(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view);
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static ColorStateList i(View view) {
        return Api21Impl.g(view);
    }

    public static PorterDuff.Mode j(View view) {
        return Api21Impl.h(view);
    }

    public static float k(View view) {
        return Api21Impl.i(view);
    }

    public static int l(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.c(recyclerView);
        }
        return 0;
    }

    public static String[] m(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static WindowInsetsCompat n(View view) {
        return Api23Impl.a(view);
    }

    public static String o(View view) {
        return Api21Impl.k(view);
    }

    public static float p(View view) {
        return Api21Impl.l(view);
    }

    public static float q(View view) {
        return Api21Impl.m(view);
    }

    public static boolean r(View view) {
        return Api21Impl.p(view);
    }

    public static void s(int i2, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : com.p004ironsource.mediationsdk.metadata.a.f25965n);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    accessibilityEventObtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static WindowInsetsCompat t(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsO = windowInsetsCompat.o();
        if (windowInsetsO != null) {
            WindowInsets windowInsetsB = Api20Impl.b(view, windowInsetsO);
            if (!windowInsetsB.equals(windowInsetsO)) {
                return WindowInsetsCompat.p(view, windowInsetsB);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContentInfoCompat u(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + d9.i.d + view.getId() + d9.i.f24752e);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = f4469e;
        if (onReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.a(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = onReceiveContentListener.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.a(contentInfoCompatA);
    }

    public static void v(int i2, View view) {
        ArrayList arrayListH = h(view);
        for (int i3 = 0; i3 < arrayListH.size(); i3++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i3)).a() == i2) {
                arrayListH.remove(i3);
                return;
            }
        }
    }

    public static void w(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null) {
            v(accessibilityActionCompat.a(), view);
            s(0, view);
            return;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.f4542b, null, accessibilityViewCommand, accessibilityActionCompat.f4543c);
        AccessibilityDelegateCompat accessibilityDelegateCompatE = e(view);
        if (accessibilityDelegateCompatE == null) {
            accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
        }
        z(view, accessibilityDelegateCompatE);
        v(accessibilityActionCompat2.a(), view);
        h(view).add(accessibilityActionCompat2);
        s(0, view);
    }

    public static void x(View view) {
        Api20Impl.c(view);
    }

    public static void y(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void z(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (f(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.f4418b);
    }
}
