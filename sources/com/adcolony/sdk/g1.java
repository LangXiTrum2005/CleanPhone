package com.adcolony.sdk;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9167c;
    private static int d;

    public static class a {
        public static int a(WindowManager windowManager) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.y;
        }
    }

    public static class b {
        public static int a(WindowManager windowManager) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.x;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    public static float a(View view, Context context, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        float f;
        int i3;
        if (view == null || context == null || view.getVisibility() != 0 || b(view) == 0.0f || !z2) {
            return 0.0f;
        }
        if (z4 && (context instanceof Activity) && !((Activity) context).hasWindowFocus() && !z5) {
            return 0.0f;
        }
        if (view.getHeight() > 0 && view.getWidth() > 0) {
            float width = view.getWidth() * view.getHeight();
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            int[] iArr = {-1, -1};
            view.getLocationInWindow(iArr);
            int[] iArr2 = {-1, -1};
            iArr2[0] = view.getWidth() + iArr[0];
            iArr2[1] = view.getHeight() + iArr[1];
            int iA = a(context);
            int iB = b(context);
            if (iArr2[0] >= 0 && iArr2[1] >= 0 && iArr[0] <= iB && (i3 = iArr[1]) <= iA && ((rect.top != 0 || i3 <= iA / 2) && globalVisibleRect)) {
                float fWidth = rect.width() * rect.height();
                if (fWidth > 0.0f) {
                    if (z3) {
                        try {
                            float fA = a(view, rect, fWidth, false);
                            if (fA > 0.0f && fA <= fWidth) {
                                fWidth -= fA;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    float f2 = (fWidth / width) * 100.0f;
                    if (f2 < 0.0f) {
                        return 0.0f;
                    }
                    if (f2 > 100.0f) {
                        return 100.0f;
                    }
                    return f2;
                }
            }
        } else if (view.getWidth() > 0 && view.getLayoutParams().height == -2) {
            int[] iArr3 = {-1, -1};
            view.getLocationInWindow(iArr3);
            int[] iArr4 = {-1, -1};
            iArr4[0] = view.getWidth() + iArr3[0];
            iArr4[1] = iArr3[1] + 1;
            Rect rect2 = new Rect(iArr3[0], iArr3[1], iArr4[0], iArr4[1]);
            int iA2 = a(context);
            int iB2 = b(context);
            if (iArr4[0] >= 0 && iArr4[1] >= 0 && iArr3[0] <= iB2 && (i2 = iArr3[1]) <= iA2 && (rect2.top != 0 || i2 <= iA2 / 2)) {
                float fWidth2 = rect2.width() * rect2.height();
                if (z3) {
                    try {
                        float fA2 = a(view, rect2, fWidth2, true);
                        if (fA2 <= 0.0f || fA2 > fWidth2) {
                            f = fWidth2;
                        } else {
                            f = fWidth2 - fA2;
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    f = fWidth2;
                }
                float f3 = (f / fWidth2) * 100.0f;
                if (f3 < 0.0f) {
                    return 0.0f;
                }
                if (f3 > 100.0f) {
                    return 100.0f;
                }
                return f3;
            }
        }
        return 0.0f;
    }

    private static float b(View view) {
        if (view == null) {
            return 0.0f;
        }
        if (a() < 11) {
            return 1.0f;
        }
        return view.getAlpha();
    }

    private static boolean c(View view) {
        if (view == null) {
            return false;
        }
        if (view.getBackground() != null) {
            return a() > 18 && view.getBackground().getAlpha() == 0;
        }
        return true;
    }

    private static int b(Context context) {
        int width;
        int i2;
        int i3;
        int i4 = context != null ? context.getResources().getConfiguration().orientation : -1;
        if (i4 == 2 && (i3 = f9166b) > 0) {
            return i3;
        }
        if (i4 == 1 && (i2 = d) > 0) {
            return i2;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
            if (a() >= 13) {
                width = b.a(windowManager);
            } else {
                width = windowManager.getDefaultDisplay().getWidth();
            }
            if (i4 == 2) {
                f9166b = width;
                return width;
            }
            if (i4 == 1) {
                d = width;
            }
            return width;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static float a(View view, Rect rect, float f, boolean z2) {
        View viewFindViewById;
        float fHeight;
        boolean z3;
        LinkedList<View> linkedList = new LinkedList();
        LinkedList<Rect> linkedList2 = new LinkedList();
        LinkedList<Rect> linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList3.add(rect);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        View rootView = view.getRootView();
        try {
            viewFindViewById = ((Activity) view.getContext()).findViewById(R.id.content);
            while (true) {
                fHeight = 0.0f;
                if (viewGroup == null || viewGroup.getParent() == rootView) {
                    break;
                }
                if (viewGroup.getVisibility() == 0 && b(viewGroup) != 0.0f && (viewFindViewById == null || !z2 || viewGroup == viewFindViewById || (viewGroup.getLayoutParams().height != 0 && viewGroup.getLayoutParams().width != 0))) {
                    linkedList.addFirst(viewGroup);
                    viewGroup = (ViewGroup) viewGroup.getParent();
                }
                return f;
            }
        } catch (Exception unused) {
            viewFindViewById = null;
        }
        if (viewGroup != null) {
            for (View view2 : linkedList) {
                ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                if (viewGroup2 != null) {
                    if (!"viewpager".equalsIgnoreCase(viewGroup2.getClass().getSimpleName()) && (iIndexOfChild = viewGroup2.indexOfChild(view2)) < viewGroup2.getChildCount() - 1) {
                        while (true) {
                            int iIndexOfChild = iIndexOfChild + 1;
                            if (iIndexOfChild < viewGroup2.getChildCount()) {
                                View childAt = viewGroup2.getChildAt(iIndexOfChild);
                                if (!c(childAt)) {
                                    if (childAt.getVisibility() == 0 && b(childAt) != 0.0f) {
                                        linkedList4.addFirst(childAt);
                                    }
                                } else {
                                    ArrayList<View> arrayListA = a(childAt);
                                    if (arrayListA != null) {
                                        linkedList4.addAll(0, arrayListA);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Iterator it = linkedList4.iterator();
            float fHeight2 = 0.0f;
            while (true) {
                if (it.hasNext()) {
                    View view3 = (View) it.next();
                    if (fHeight2 < f) {
                        if (view3 != null) {
                            try {
                                if (view3.getTag() == null || !((String) view3.getTag()).contains("BTN_CLOSE")) {
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        Rect rect2 = new Rect();
                        if (view3.getGlobalVisibleRect(rect2)) {
                            if (z2) {
                                rect2.top++;
                            }
                            if (rect2.intersect(rect)) {
                                linkedList2.add(rect2);
                                fHeight2 = rect2.height() * rect2.width();
                                if (fHeight2 >= f) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z3 = false;
                break;
            }
            if (!z3) {
                if (!linkedList2.isEmpty() && linkedList2.size() != 1) {
                    for (Rect rect3 : linkedList2) {
                        arrayList.clear();
                        arrayList.addAll(linkedList3);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            Rect rect4 = (Rect) arrayList.get(i2);
                            if (rect3.intersect(rect4)) {
                                linkedList3.remove(arrayList.get(i2));
                                for (int i3 = 1; i3 < 9; i3++) {
                                    Rect rectA = a(rect4, rect3, i3);
                                    if (rectA.height() > 0 && rectA.width() > 0) {
                                        linkedList3.add(rectA);
                                    }
                                }
                            }
                        }
                    }
                    if (!linkedList3.isEmpty()) {
                        for (Rect rect5 : linkedList3) {
                            fHeight += rect5.height() * rect5.width();
                        }
                        if (fHeight < f) {
                            return f - fHeight;
                        }
                    }
                }
                return fHeight2;
            }
        }
        return f;
    }

    private static Rect a(Rect rect, Rect rect2, int i2) {
        Rect rect3 = new Rect();
        switch (i2) {
            case 1:
                rect3.set(rect.left, rect.top, rect2.left, rect2.top);
                break;
            case 2:
                rect3.set(rect2.left, rect.top, rect2.right, rect2.top);
                break;
            case 3:
                rect3.set(rect2.right, rect.top, rect.right, rect2.top);
                break;
            case 4:
                rect3.set(rect2.right, rect2.top, rect.right, rect2.bottom);
                break;
            case 5:
                rect3.set(rect2.right, rect2.bottom, rect.right, rect.bottom);
                break;
            case 6:
                rect3.set(rect2.left, rect2.bottom, rect2.right, rect.bottom);
                break;
            case 7:
                rect3.set(rect.left, rect2.bottom, rect2.left, rect.bottom);
                break;
            case 8:
                rect3.set(rect.left, rect2.top, rect2.left, rect2.bottom);
                break;
        }
        return rect3;
    }

    private static ArrayList<View> a(View view) {
        if ((view instanceof ViewGroup) && view.getVisibility() == 0 && b(view) != 0.0f) {
            LinkedList linkedList = new LinkedList();
            ArrayList<View> arrayList = new ArrayList<>();
            linkedList.add((ViewGroup) view);
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                ViewGroup viewGroup = (ViewGroup) listIterator.next();
                listIterator.remove();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0 && b(childAt) != 0.0f) {
                        if (childAt instanceof ViewGroup) {
                            if (c(childAt)) {
                                listIterator.add((ViewGroup) childAt);
                                listIterator.previous();
                            } else {
                                arrayList.add(childAt);
                            }
                        } else if (!c(childAt)) {
                            arrayList.add(childAt);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    private static int a(Context context) {
        int height;
        int i2;
        int i3;
        int i4 = context != null ? context.getResources().getConfiguration().orientation : -1;
        if (i4 == 2 && (i3 = f9165a) > 0) {
            return i3;
        }
        if (i4 == 1 && (i2 = f9167c) > 0) {
            return i2;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
            if (a() >= 13) {
                height = a.a(windowManager);
            } else {
                height = windowManager.getDefaultDisplay().getHeight();
            }
            if (i4 == 2) {
                f9165a = height;
                return height;
            }
            if (i4 == 1) {
                f9167c = height;
            }
            return height;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int a() {
        return Build.VERSION.SDK_INT;
    }
}
