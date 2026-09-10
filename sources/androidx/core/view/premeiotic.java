package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class premeiotic {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static WeakHashMap<View, lotta> f9387attabal = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static boolean f9389dern = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Field f9391saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f9392wireman = {wostteth.marial.accessibility_custom_action_0, wostteth.marial.accessibility_custom_action_1, wostteth.marial.accessibility_custom_action_2, wostteth.marial.accessibility_custom_action_3, wostteth.marial.accessibility_custom_action_4, wostteth.marial.accessibility_custom_action_5, wostteth.marial.accessibility_custom_action_6, wostteth.marial.accessibility_custom_action_7, wostteth.marial.accessibility_custom_action_8, wostteth.marial.accessibility_custom_action_9, wostteth.marial.accessibility_custom_action_10, wostteth.marial.accessibility_custom_action_11, wostteth.marial.accessibility_custom_action_12, wostteth.marial.accessibility_custom_action_13, wostteth.marial.accessibility_custom_action_14, wostteth.marial.accessibility_custom_action_15, wostteth.marial.accessibility_custom_action_16, wostteth.marial.accessibility_custom_action_17, wostteth.marial.accessibility_custom_action_18, wostteth.marial.accessibility_custom_action_19, wostteth.marial.accessibility_custom_action_20, wostteth.marial.accessibility_custom_action_21, wostteth.marial.accessibility_custom_action_22, wostteth.marial.accessibility_custom_action_23, wostteth.marial.accessibility_custom_action_24, wostteth.marial.accessibility_custom_action_25, wostteth.marial.accessibility_custom_action_26, wostteth.marial.accessibility_custom_action_27, wostteth.marial.accessibility_custom_action_28, wostteth.marial.accessibility_custom_action_29, wostteth.marial.accessibility_custom_action_30, wostteth.marial.accessibility_custom_action_31};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final merc f9390marial = new merc() { // from class: androidx.core.view.cultivated
        @Override // androidx.core.view.merc
        public final wireman onReceiveContent(wireman wiremanVar) {
            return premeiotic.attabal(wiremanVar);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final marial f9388beachfront = new marial();

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class apical {
        public static int attabal(View view) {
            return view.getImportantForAutofill();
        }

        public static void saneness(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public interface arytenoidectomy {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class attabal extends beachfront<Boolean> {
        public attabal(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public boolean competently(Boolean bool, Boolean bool2) {
            return !attabal(bool, bool2);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public Boolean dern(View view) {
            return Boolean.valueOf(formularize.dern(view));
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void wireman(View view, Boolean bool) {
            formularize.beachfront(view, bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static abstract class beachfront<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f9393attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f9394dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<T> f9395saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f9396wireman;

        public beachfront(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean attabal(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public void beachfront(View view, T t) {
            if (saneness()) {
                wireman(view, t);
            } else if (competently(marial(view), t)) {
                premeiotic.cutely(view);
                view.setTag(this.f9393attabal, t);
                premeiotic.peridotite(view, this.f9396wireman);
            }
        }

        public abstract boolean competently(T t, T t2);

        public abstract T dern(View view);

        public T marial(View view) {
            if (saneness()) {
                return dern(view);
            }
            T t = (T) view.getTag(this.f9393attabal);
            if (this.f9395saneness.isInstance(t)) {
                return t;
            }
            return null;
        }

        public final boolean saneness() {
            return Build.VERSION.SDK_INT >= this.f9394dern;
        }

        public abstract void wireman(View view, T t);

        public beachfront(int i, Class<T> cls, int i2, int i3) {
            this.f9393attabal = i;
            this.f9395saneness = cls;
            this.f9396wireman = i2;
            this.f9394dern = i3;
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class competently {
        public static WindowInsets attabal(View view, WindowInsets windowInsets) {
            return coffeecake.f9293saneness ? coffeecake.saneness(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        public static void dern(View view) {
            view.requestApplyInsets();
        }

        public static WindowInsets saneness(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class cutely {
        public static void attabal(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class dern extends beachfront<CharSequence> {
        public dern(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public boolean competently(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public CharSequence dern(View view) {
            return triweekly.saneness(view);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void wireman(View view, CharSequence charSequence) {
            triweekly.wireman(view, charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class formularize {
        public static CharSequence attabal(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static void beachfront(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        public static boolean dern(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void marial(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static boolean saneness(View view) {
            return view.isAccessibilityHeading();
        }

        public static void wireman(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class impassible {
        public static View.AccessibilityDelegate attabal(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void saneness(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class impromptu {

        /* JADX INFO: compiled from: ViewCompat.java */
        public class attabal implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public hardpan f9397attabal = null;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final /* synthetic */ supplicat f9398dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ View f9399saneness;

            public attabal(View view, supplicat supplicatVar) {
                this.f9399saneness = view;
                this.f9398dern = supplicatVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                hardpan hardpanVarCord = hardpan.cord(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    impromptu.attabal(windowInsets, this.f9399saneness);
                    if (hardpanVarCord.equals(this.f9397attabal)) {
                        return this.f9398dern.attabal(view, hardpanVarCord).rotuma();
                    }
                }
                this.f9397attabal = hardpanVarCord;
                hardpan hardpanVarAttabal = this.f9398dern.attabal(view, hardpanVarCord);
                if (i >= 30) {
                    return hardpanVarAttabal.rotuma();
                }
                premeiotic.lerp(view);
                return hardpanVarAttabal.rotuma();
            }
        }

        public static void apical(View view, float f) {
            view.setElevation(f);
        }

        public static void arytenoidectomy(View view) {
            view.stopNestedScroll();
        }

        public static void attabal(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(wostteth.marial.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static String beachfront(View view) {
            return view.getTransitionName();
        }

        public static float competently(View view) {
            return view.getTranslationZ();
        }

        public static void cutely(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static ColorStateList dern(View view) {
            return view.getBackgroundTintList();
        }

        public static void formularize(View view, supplicat supplicatVar) {
            attabal attabalVar = supplicatVar != null ? new attabal(view, supplicatVar) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(wostteth.marial.tag_on_apply_window_listener, attabalVar);
            }
            if (view.getTag(wostteth.marial.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (attabalVar != null) {
                view.setOnApplyWindowInsetsListener(attabalVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(wostteth.marial.tag_window_insets_animation_callback));
            }
        }

        public static void impassible(View view, String str) {
            view.setTransitionName(str);
        }

        public static float impromptu(View view) {
            return view.getZ();
        }

        public static void kowloon(View view, float f) {
            view.setZ(f);
        }

        public static float marial(View view) {
            return view.getElevation();
        }

        public static hardpan saneness(View view, hardpan hardpanVar, Rect rect) {
            WindowInsets windowInsetsRotuma = hardpanVar.rotuma();
            if (windowInsetsRotuma != null) {
                return hardpan.cord(view.computeSystemWindowInsets(windowInsetsRotuma, rect), view);
            }
            rect.setEmpty();
            return hardpanVar;
        }

        public static void taiyuan(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void triweekly(View view, float f) {
            view.setTranslationZ(f);
        }

        public static PorterDuff.Mode wireman(View view) {
            return view.getBackgroundTintMode();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static final class kowloon {
        public static String[] attabal(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.wireman saneness(View view, androidx.core.view.wireman wiremanVar) {
            ContentInfo contentInfoBeachfront = wiremanVar.beachfront();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoBeachfront);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoBeachfront ? wiremanVar : androidx.core.view.wireman.competently(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class monoploid {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f9401wireman = new ArrayList<>();

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f9402attabal = null;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f9404saneness = null;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public WeakReference<KeyEvent> f9403dern = null;

        public static monoploid attabal(View view) {
            monoploid monoploidVar = (monoploid) view.getTag(wostteth.marial.tag_unhandled_key_event_manager);
            if (monoploidVar != null) {
                return monoploidVar;
            }
            monoploid monoploidVar2 = new monoploid();
            view.setTag(wostteth.marial.tag_unhandled_key_event_manager, monoploidVar2);
            return monoploidVar2;
        }

        public boolean beachfront(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f9403dern;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f9403dern = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayWireman = wireman();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayWireman.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayWireman.valueAt(iIndexOfKey);
                sparseArrayWireman.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayWireman.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                marial(view, keyEvent);
            }
            return true;
        }

        public final void competently() {
            WeakHashMap<View, Boolean> weakHashMap = this.f9402attabal;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f9401wireman;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f9402attabal == null) {
                        this.f9402attabal = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f9401wireman;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f9402attabal.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f9402attabal.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final View dern(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f9402attabal;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewDern = dern(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewDern != null) {
                            return viewDern;
                        }
                    }
                }
                if (marial(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean marial(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(wostteth.marial.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((arytenoidectomy) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean saneness(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                competently();
            }
            View viewDern = dern(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewDern != null && !KeyEvent.isModifierKey(keyCode)) {
                    wireman().put(keyCode, new WeakReference<>(viewDern));
                }
            }
            return viewDern != null;
        }

        public final SparseArray<WeakReference<View>> wireman() {
            if (this.f9404saneness == null) {
                this.f9404saneness = new SparseArray<>();
            }
            return this.f9404saneness;
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class saneness extends beachfront<CharSequence> {
        public saneness(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public boolean competently(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public CharSequence dern(View view) {
            return formularize.attabal(view);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void wireman(View view, CharSequence charSequence) {
            formularize.marial(view, charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class taiyuan {
        public static hardpan attabal(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            hardpan hardpanVarPreprohormone = hardpan.preprohormone(rootWindowInsets);
            hardpanVarPreprohormone.adultoid(hardpanVarPreprohormone);
            hardpanVarPreprohormone.wireman(view.getRootView());
            return hardpanVarPreprohormone;
        }

        public static void saneness(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class triweekly {
        public static WindowInsets attabal(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static cig dern(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return cig.competently(windowInsetsController);
            }
            return null;
        }

        public static CharSequence saneness(View view) {
            return view.getStateDescription();
        }

        public static void wireman(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public class wireman extends beachfront<Boolean> {
        public wireman(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public boolean competently(Boolean bool, Boolean bool2) {
            return !attabal(bool, bool2);
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public Boolean dern(View view) {
            return Boolean.valueOf(formularize.saneness(view));
        }

        @Override // androidx.core.view.premeiotic.beachfront
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void wireman(View view, Boolean bool) {
            formularize.wireman(view, bool.booleanValue());
        }
    }

    public static void achondroplasia(View view, String str) {
        impromptu.impassible(view, str);
    }

    public static float adultoid(View view) {
        return impromptu.marial(view);
    }

    @Deprecated
    public static int apical() {
        return View.generateViewId();
    }

    public static List<outmarry.rotuma.attabal> arytenoidectomy(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(wostteth.marial.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(wostteth.marial.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static hardpan beachfront(View view, hardpan hardpanVar, Rect rect) {
        return impromptu.saneness(view, hardpanVar, rect);
    }

    public static void claque(View view, sensatory.saneness sanenessVar) {
        sensatory.marial(view, sanenessVar);
    }

    @Deprecated
    public static void clubfoot(View view, outmarry.rotuma rotumaVar) {
        view.onInitializeAccessibilityNodeInfo(rotumaVar.linendraper());
    }

    public static void coffeecake(View view, outmarry.rotuma.attabal attabalVar, CharSequence charSequence, outmarry.cuirassed cuirassedVar) {
        if (cuirassedVar == null && charSequence == null) {
            treadless(view, attabalVar.saneness());
        } else {
            wireman(view, attabalVar.attabal(charSequence, cuirassedVar));
        }
    }

    public static void coi(View view, CharSequence charSequence) {
        dent().beachfront(view, charSequence);
        if (charSequence != null) {
            f9388beachfront.attabal(view);
        } else {
            f9388beachfront.wireman(view);
        }
    }

    public static hardpan competently(View view, hardpan hardpanVar) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsRotuma = hardpanVar.rotuma();
        if (windowInsetsRotuma != null) {
            WindowInsets windowInsetsAttabal = i >= 30 ? triweekly.attabal(view, windowInsetsRotuma) : competently.attabal(view, windowInsetsRotuma);
            if (!windowInsetsAttabal.equals(windowInsetsRotuma)) {
                return hardpan.cord(windowInsetsAttabal, view);
            }
        }
        return hardpanVar;
    }

    @Deprecated
    public static int cord(View view) {
        return view.getLayoutDirection();
    }

    public static boolean creditor(View view) {
        Boolean boolMarial = saneness().marial(view);
        return boolMarial != null && boolMarial.booleanValue();
    }

    @Deprecated
    public static int cuirassed(View view) {
        return view.getMinimumHeight();
    }

    public static androidx.core.view.wireman cultivated(View view, androidx.core.view.wireman wiremanVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(wiremanVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return kowloon.saneness(view, wiremanVar);
        }
        restrictive restrictiveVar = (restrictive) view.getTag(wostteth.marial.tag_on_receive_content_listener);
        if (restrictiveVar == null) {
            return dovishness(view).onReceiveContent(wiremanVar);
        }
        androidx.core.view.wireman wiremanVarAttabal = restrictiveVar.attabal(view, wiremanVar);
        if (wiremanVarAttabal == null) {
            return null;
        }
        return dovishness(view).onReceiveContent(wiremanVarAttabal);
    }

    public static void cutely(View view) {
        androidx.core.view.attabal attabalVarFormularize = formularize(view);
        if (attabalVarFormularize == null) {
            attabalVarFormularize = new androidx.core.view.attabal();
        }
        sayid(view, attabalVarFormularize);
    }

    @Deprecated
    public static void czestochowa(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static beachfront<CharSequence> dent() {
        return new saneness(wostteth.marial.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static int dern(View view, CharSequence charSequence, outmarry.cuirassed cuirassedVar) {
        int iMonoploid = monoploid(view, charSequence);
        if (iMonoploid != -1) {
            wireman(view, new outmarry.rotuma.attabal(iMonoploid, charSequence, cuirassedVar));
        }
        return iMonoploid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static merc dovishness(View view) {
        return view instanceof merc ? (merc) view : f9390marial;
    }

    public static void empress(View view, boolean z) {
        saneness().beachfront(view, Boolean.valueOf(z));
    }

    public static androidx.core.view.attabal formularize(View view) {
        View.AccessibilityDelegate accessibilityDelegateImpassible = impassible(view);
        if (accessibilityDelegateImpassible == null) {
            return null;
        }
        return accessibilityDelegateImpassible instanceof androidx.core.view.attabal.C0059attabal ? ((androidx.core.view.attabal.C0059attabal) accessibilityDelegateImpassible).f9280attabal : new androidx.core.view.attabal(accessibilityDelegateImpassible);
    }

    @Deprecated
    public static boolean gintrap(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static Display graveside(View view) {
        return view.getDisplay();
    }

    public static float grimness(View view) {
        return impromptu.impromptu(view);
    }

    public static void gusty(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            apical.saneness(view, i);
        }
    }

    public static void hardpan(View view, float f) {
        impromptu.kowloon(view, f);
    }

    public static beachfront<CharSequence> herdbook() {
        return new dern(wostteth.marial.tag_state_description, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static boolean hydrovane(View view) {
        return view.isLaidOut();
    }

    public static void igbo(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static View.AccessibilityDelegate impassible(View view) {
        return Build.VERSION.SDK_INT >= 29 ? impassible.attabal(view) : triweekly(view);
    }

    public static boolean impromptu(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return monoploid.attabal(view).saneness(view, keyEvent);
    }

    public static void itchy(int i, View view) {
        List<outmarry.rotuma.attabal> listArytenoidectomy = arytenoidectomy(view);
        for (int i2 = 0; i2 < listArytenoidectomy.size(); i2++) {
            if (listArytenoidectomy.get(i2).saneness() == i) {
                listArytenoidectomy.remove(i2);
                return;
            }
        }
    }

    public static void julian(View view, CharSequence charSequence) {
        herdbook().beachfront(view, charSequence);
    }

    public static hardpan kattegat(View view) {
        return taiyuan.attabal(view);
    }

    public static CharSequence kowloon(View view) {
        return dent().marial(view);
    }

    public static void lerp(View view) {
        competently.dern(view);
    }

    public static void lightstruck(View view, boolean z) {
        lotta().beachfront(view, Boolean.valueOf(z));
    }

    public static beachfront<Boolean> lotta() {
        return new attabal(wostteth.marial.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @Deprecated
    public static lotta marial(View view) {
        if (f9387attabal == null) {
            f9387attabal = new WeakHashMap<>();
        }
        lotta lottaVar = f9387attabal.get(view);
        if (lottaVar != null) {
            return lottaVar;
        }
        lotta lottaVar2 = new lotta(view);
        f9387attabal.put(view, lottaVar2);
        return lottaVar2;
    }

    public static void mathsort(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public static float merc(View view) {
        return impromptu.competently(view);
    }

    @Deprecated
    public static void milliradian(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static PorterDuff.Mode molybdenite(View view) {
        return impromptu.wireman(view);
    }

    public static int monoploid(View view, CharSequence charSequence) {
        List<outmarry.rotuma.attabal> listArytenoidectomy = arytenoidectomy(view);
        for (int i = 0; i < listArytenoidectomy.size(); i++) {
            if (TextUtils.equals(charSequence, listArytenoidectomy.get(i).dern())) {
                return listArytenoidectomy.get(i).saneness();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f9392wireman;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < listArytenoidectomy.size(); i5++) {
                z &= listArytenoidectomy.get(i5).saneness() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void monroe(View view, int i, int i2) {
        taiyuan.saneness(view, i, i2);
    }

    public static void nosophobia(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            impassible.saneness(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @Deprecated
    public static int oilcan(View view) {
        return view.getPaddingEnd();
    }

    public static hardpan overspeculate(View view, hardpan hardpanVar) {
        WindowInsets windowInsetsRotuma = hardpanVar.rotuma();
        if (windowInsetsRotuma != null) {
            WindowInsets windowInsetsSaneness = competently.saneness(view, windowInsetsRotuma);
            if (!windowInsetsSaneness.equals(windowInsetsRotuma)) {
                return hardpan.cord(windowInsetsSaneness, view);
            }
        }
        return hardpanVar;
    }

    public static void palmyra(View view, seminary seminaryVar) {
        cutely.attabal(view, (PointerIcon) (seminaryVar != null ? seminaryVar.attabal() : null));
    }

    public static void peridotite(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = kowloon(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(kowloon(view));
                    igbo(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(kowloon(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @Deprecated
    public static boolean permissivist(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static void picketboat(View view, supplicat supplicatVar) {
        impromptu.formularize(view, supplicatVar);
    }

    @Deprecated
    public static cig polder(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return triweekly.dern(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return czestochowa.attabal(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static ColorStateList polloi(View view) {
        return impromptu.dern(view);
    }

    @Deprecated
    public static void premeiotic(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int preprohormone(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return apical.attabal(view);
        }
        return 0;
    }

    public static void preterite(View view, float f) {
        impromptu.apical(view, f);
    }

    @Deprecated
    public static boolean privatdozent(View view) {
        return view.hasTransientState();
    }

    public static String restrictive(View view) {
        return impromptu.beachfront(view);
    }

    @Deprecated
    public static int rotuma(View view) {
        return view.getImportantForAccessibility();
    }

    public static beachfront<Boolean> saneness() {
        return new wireman(wostteth.marial.tag_accessibility_heading, Boolean.class, 28);
    }

    public static boolean saran(View view) {
        return impassible(view) != null;
    }

    public static void sayid(View view, androidx.core.view.attabal attabalVar) {
        if (attabalVar == null && (impassible(view) instanceof androidx.core.view.attabal.C0059attabal)) {
            attabalVar = new androidx.core.view.attabal();
        }
        igbo(view);
        view.setAccessibilityDelegate(attabalVar == null ? null : attabalVar.wireman());
    }

    @Deprecated
    public static ViewParent sealless(View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static int seminary(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void sensatory(View view, ColorStateList colorStateList) {
        impromptu.taiyuan(view, colorStateList);
    }

    public static void splinterproof(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @Deprecated
    public static boolean starveling(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static int stratoscope(View view) {
        return view.getMinimumWidth();
    }

    public static CharSequence supplicat(View view) {
        return herdbook().marial(view);
    }

    public static boolean taiyuan(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return monoploid.attabal(view).beachfront(keyEvent);
    }

    public static void technofreak(View view) {
        impromptu.arytenoidectomy(view);
    }

    @Deprecated
    public static void timberyard(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void treadless(View view, int i) {
        itchy(i, view);
        peridotite(view, 0);
    }

    public static View.AccessibilityDelegate triweekly(View view) {
        if (f9389dern) {
            return null;
        }
        if (f9391saneness == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f9391saneness = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f9389dern = true;
                return null;
            }
        }
        try {
            Object obj = f9391saneness.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f9389dern = true;
            return null;
        }
    }

    public static String[] trm(View view) {
        return Build.VERSION.SDK_INT >= 31 ? kowloon.attabal(view) : (String[]) view.getTag(wostteth.marial.tag_on_receive_content_mime_types);
    }

    public static void unconsolidated(View view, float f) {
        impromptu.triweekly(view, f);
    }

    public static void underbelly(View view, PorterDuff.Mode mode) {
        impromptu.cutely(view, mode);
    }

    public static boolean walach(View view) {
        Boolean boolMarial = lotta().marial(view);
        return boolMarial != null && boolMarial.booleanValue();
    }

    public static void wireman(View view, outmarry.rotuma.attabal attabalVar) {
        cutely(view);
        itchy(attabalVar.saneness(), view);
        arytenoidectomy(view).add(attabalVar);
        peridotite(view, 0);
    }

    @Deprecated
    public static void wostteth(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Deprecated
    public static int yemenite(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public static class marial implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f9400kowloon = new WeakHashMap<>();

        public void attabal(View view) {
            this.f9400kowloon.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                dern(view);
            }
        }

        public final void dern(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void marial(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f9400kowloon.entrySet().iterator();
                while (it.hasNext()) {
                    saneness(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            dern(view);
        }

        public final void saneness(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                premeiotic.peridotite(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        public void wireman(View view) {
            this.f9400kowloon.remove(view);
            view.removeOnAttachStateChangeListener(this);
            marial(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ androidx.core.view.wireman attabal(androidx.core.view.wireman wiremanVar) {
        return wiremanVar;
    }
}
