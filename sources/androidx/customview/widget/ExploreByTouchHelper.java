package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f4580n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final FocusStrategy.BoundsAdapter o = new AnonymousClass1();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final FocusStrategy.CollectionAdapter f4581p = new AnonymousClass2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f4583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Chip f4584i;
    public MyNodeProvider j;
    public final Rect d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f4582e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4585l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.customview.widget.ExploreByTouchHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        public final void a(Object obj, Rect rect) {
            ((AccessibilityNodeInfoCompat) obj).f(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.ExploreByTouchHelper$2, reason: invalid class name */
    public class AnonymousClass2 implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
    }

    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        public MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat a(int i2) {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.n(i2).f4534a));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat b(int i2) {
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            int i3 = i2 == 2 ? exploreByTouchHelper.k : exploreByTouchHelper.f4585l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i3);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final boolean c(int i2, int i3, Bundle bundle) {
            int i4;
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            Chip chip = exploreByTouchHelper.f4584i;
            if (i2 == -1) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                return chip.performAccessibilityAction(i3, bundle);
            }
            if (i3 == 1) {
                return exploreByTouchHelper.s(i2);
            }
            if (i3 == 2) {
                return exploreByTouchHelper.j(i2);
            }
            if (i3 != 64) {
                if (i3 != 128) {
                    return exploreByTouchHelper.o(i2, i3);
                }
                if (exploreByTouchHelper.k != i2) {
                    return false;
                }
                exploreByTouchHelper.k = Integer.MIN_VALUE;
                chip.invalidate();
                exploreByTouchHelper.t(i2, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = exploreByTouchHelper.f4583h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = exploreByTouchHelper.k) == i2) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                exploreByTouchHelper.k = Integer.MIN_VALUE;
                exploreByTouchHelper.f4584i.invalidate();
                exploreByTouchHelper.t(i4, 65536);
            }
            exploreByTouchHelper.k = i2;
            chip.invalidate();
            exploreByTouchHelper.t(i2, 32768);
            return true;
        }
    }

    public ExploreByTouchHelper(Chip chip) {
        this.f4584i = chip;
        this.f4583h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat b(View view) {
        if (this.j == null) {
            this.j = new MyNodeProvider();
        }
        return this.j;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
        p(accessibilityNodeInfoCompat);
    }

    public final boolean j(int i2) {
        if (this.f4585l != i2) {
            return false;
        }
        this.f4585l = Integer.MIN_VALUE;
        r(i2, false);
        t(i2, 8);
        return true;
    }

    public final AccessibilityNodeInfoCompat k(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoCompat.j("android.view.View");
        Rect rect = f4580n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f4584i;
        accessibilityNodeInfoObtain.setParent(chip);
        q(i2, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4582e;
        accessibilityNodeInfoCompat.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        accessibilityNodeInfoCompat.f4535b = i2;
        accessibilityNodeInfoObtain.setSource(chip, i2);
        if (this.k == i2) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.a(64);
        }
        boolean z2 = this.f4585l == i2;
        if (z2) {
            accessibilityNodeInfoCompat.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            accessibilityNodeInfoCompat.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoCompat.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoCompat.f4534a.setVisibleToUser(true);
                    }
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:115:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    public final boolean m(int i2, Rect rect) {
        int i3;
        int i4;
        Object obj;
        Object obj2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int i5;
        Rect rect2;
        int i6;
        Rect rect3;
        int i7;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        int i8;
        int iD;
        int iE;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            sparseArrayCompat.e(((Integer) arrayList.get(i9)).intValue(), k(((Integer) arrayList.get(i9)).intValue()));
        }
        int i10 = this.f4585l;
        int i11 = Integer.MIN_VALUE;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = i10 == Integer.MIN_VALUE ? null : (AccessibilityNodeInfoCompat) sparseArrayCompat.d(i10);
        FocusStrategy.BoundsAdapter boundsAdapter = o;
        FocusStrategy.CollectionAdapter collectionAdapter = f4581p;
        Chip chip = this.f4584i;
        if (i2 == 1 || i2 == 2) {
            i3 = 0;
            i4 = -1;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            boolean z2 = chip.getLayoutDirection() == 1;
            ((AnonymousClass2) collectionAdapter).getClass();
            int i12 = sparseArrayCompat.Z;
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList2.add((AccessibilityNodeInfoCompat) sparseArrayCompat.f(i13));
            }
            Collections.sort(arrayList2, new FocusStrategy.SequentialComparator(z2, boundsAdapter));
            if (i2 == 1) {
                int size = arrayList2.size();
                if (accessibilityNodeInfoCompat3 != null) {
                    size = arrayList2.indexOf(accessibilityNodeInfoCompat3);
                }
                int i14 = size - 1;
                if (i14 >= 0) {
                    obj = arrayList2.get(i14);
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (accessibilityNodeInfoCompat3 == null ? -1 : arrayList2.lastIndexOf(accessibilityNodeInfoCompat3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i15 = this.f4585l;
            if (i15 != Integer.MIN_VALUE) {
                n(i15).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i2 == 17) {
                        i4 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i2 == 33) {
                        i4 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i2 == 66) {
                        rect4.set(-1, 0, -1, height);
                        i4 = -1;
                    } else {
                        if (i2 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i4 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i2 != 17) {
                    i3 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i2 != 33) {
                    i3 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i2 != 66) {
                    i3 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i2 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i3 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                ((AnonymousClass2) collectionAdapter).getClass();
                i6 = sparseArrayCompat.Z;
                rect3 = new Rect();
                accessibilityNodeInfoCompat = null;
                for (i7 = i3; i7 < i6; i7++) {
                    accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) sparseArrayCompat.f(i7);
                    if (accessibilityNodeInfoCompat2 == accessibilityNodeInfoCompat3) {
                        ((AnonymousClass1) boundsAdapter).getClass();
                        accessibilityNodeInfoCompat2.f(rect3);
                        if (FocusStrategy.c(rect4, rect3, i2)) {
                            if (FocusStrategy.c(rect4, rect2, i2) || FocusStrategy.a(i2, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                accessibilityNodeInfoCompat = accessibilityNodeInfoCompat2;
                            } else if (FocusStrategy.a(i2, rect4, rect2, rect3)) {
                                int iD2 = FocusStrategy.d(rect4, rect3, i2);
                                int iE2 = FocusStrategy.e(rect4, rect3, i2);
                                i8 = (iE2 * iE2) + (iD2 * 13 * iD2);
                                iD = FocusStrategy.d(rect4, rect2, i2);
                                iE = FocusStrategy.e(rect4, rect2, i2);
                                if (i8 < (iE * iE) + (iD * 13 * iD)) {
                                    rect2.set(rect3);
                                    accessibilityNodeInfoCompat = accessibilityNodeInfoCompat2;
                                }
                            }
                        }
                    }
                }
            }
            i4 = -1;
            rect2 = new Rect(rect4);
            if (i2 != 17) {
                i3 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i2 != 33) {
                i3 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i2 != 66) {
                i3 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i2 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i3 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            ((AnonymousClass2) collectionAdapter).getClass();
            i6 = sparseArrayCompat.Z;
            rect3 = new Rect();
            accessibilityNodeInfoCompat = null;
            while (i7 < i6) {
                accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) sparseArrayCompat.f(i7);
                if (accessibilityNodeInfoCompat2 == accessibilityNodeInfoCompat3) {
                    ((AnonymousClass1) boundsAdapter).getClass();
                    accessibilityNodeInfoCompat2.f(rect3);
                    if (FocusStrategy.c(rect4, rect3, i2)) {
                        if (FocusStrategy.c(rect4, rect2, i2)) {
                            rect2.set(rect3);
                            accessibilityNodeInfoCompat = accessibilityNodeInfoCompat2;
                        } else if (FocusStrategy.a(i2, rect4, rect2, rect3)) {
                            int iD3 = FocusStrategy.d(rect4, rect3, i2);
                            int iE3 = FocusStrategy.e(rect4, rect3, i2);
                            i8 = (iE3 * iE3) + (iD3 * 13 * iD3);
                            iD = FocusStrategy.d(rect4, rect2, i2);
                            iE = FocusStrategy.e(rect4, rect2, i2);
                            if (i8 < (iE * iE) + (iD * 13 * iD)) {
                                rect2.set(rect3);
                                accessibilityNodeInfoCompat = accessibilityNodeInfoCompat2;
                            }
                        }
                    }
                }
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat4 = accessibilityNodeInfoCompat;
        if (accessibilityNodeInfoCompat4 != null) {
            int i16 = sparseArrayCompat.Z;
            int i17 = i3;
            while (true) {
                if (i17 >= i16) {
                    i5 = i4;
                    break;
                }
                if (sparseArrayCompat.f3772Y[i17] == accessibilityNodeInfoCompat4) {
                    i5 = i17;
                    break;
                }
                i17++;
            }
            i11 = sparseArrayCompat.X[i5];
        }
        return s(i11);
    }

    public final AccessibilityNodeInfoCompat n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        Chip chip = this.f4584i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            accessibilityNodeInfoCompat.f4534a.addChild(chip, ((Integer) arrayList.get(i3)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    public abstract boolean o(int i2, int i3);

    public void p(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void q(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void r(int i2, boolean z2) {
    }

    public final boolean s(int i2) {
        int i3;
        Chip chip = this.f4584i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i3 = this.f4585l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f4585l = i2;
        r(i2, true);
        t(i2, 8);
        return true;
    }

    public final void t(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i2 == Integer.MIN_VALUE || !this.f4583h.isEnabled() || (parent = (view = this.f4584i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatN = n(i2);
            accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompatN.f4534a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i2);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
