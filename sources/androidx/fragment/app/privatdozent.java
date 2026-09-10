package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class privatdozent {

    /* JADX INFO: compiled from: FragmentTransitionImpl.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10365arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ int f10367kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10368molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10369monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10370polloi;

        public attabal(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f10367kowloon = i;
            this.f10365arytenoidectomy = arrayList;
            this.f10369monoploid = arrayList2;
            this.f10370polloi = arrayList3;
            this.f10368molybdenite = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f10367kowloon; i++) {
                premeiotic.achondroplasia((View) this.f10365arytenoidectomy.get(i), (String) this.f10369monoploid.get(i));
                premeiotic.achondroplasia((View) this.f10370polloi.get(i), (String) this.f10368molybdenite.get(i));
            }
        }
    }

    public static void beachfront(List<View> list, View view) {
        int size = list.size();
        if (taiyuan(list, view, size)) {
            return;
        }
        if (premeiotic.restrictive(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!taiyuan(list, childAt, size) && premeiotic.restrictive(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean formularize(List list) {
        return list == null || list.isEmpty();
    }

    public static boolean taiyuan(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract void adultoid(Object obj, Rect rect);

    public void apical(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object arytenoidectomy(Object obj, Object obj2, Object obj3);

    public abstract void attabal(Object obj, View view);

    public abstract boolean competently(Object obj);

    public abstract void cord(Object obj, View view, ArrayList<View> arrayList);

    public abstract void cuirassed(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public Object cutely(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract void dovishness(Object obj, View view);

    public void gintrap(Fragment fragment, Object obj, claque.marial marialVar, Runnable runnable) {
        rotuma(fragment, obj, marialVar, null, runnable);
    }

    public boolean impassible() {
        FragmentManager.deadwork(4);
        return false;
    }

    public abstract Object impromptu(Object obj);

    public abstract Object kowloon(Object obj, Object obj2, Object obj3);

    public abstract void marial(ViewGroup viewGroup, Object obj);

    public abstract void molybdenite(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public ArrayList<String> monoploid(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(premeiotic.restrictive(view));
            premeiotic.achondroplasia(view, null);
        }
        return arrayList2;
    }

    public abstract void polloi(Object obj, View view, ArrayList<View> arrayList);

    public void preprohormone(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strRestrictive = premeiotic.restrictive(view2);
            arrayList4.add(strRestrictive);
            if (strRestrictive != null) {
                premeiotic.achondroplasia(view2, null);
                String str = map.get(strRestrictive);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        premeiotic.achondroplasia(arrayList2.get(i2), strRestrictive);
                        break;
                    }
                }
            }
        }
        androidx.core.view.polder.attabal(view, new attabal(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public void rotuma(Fragment fragment, Object obj, claque.marial marialVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public abstract void saneness(Object obj, ArrayList<View> arrayList);

    public abstract Object stratoscope(Object obj);

    public boolean triweekly(Object obj) {
        return false;
    }

    public void dern(Object obj) {
    }

    public void graveside(Object obj, float f) {
    }

    public void wireman(Object obj, Runnable runnable) {
    }
}
