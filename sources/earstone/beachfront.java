package earstone;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: GhostViewHolder.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends FrameLayout {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f25512arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public ViewGroup f25513kowloon;

    /* JADX INFO: compiled from: GhostViewHolder.java */
    public static class attabal {
        public static float attabal(View view) {
            return view.getZ();
        }
    }

    public beachfront(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f25513kowloon = viewGroup;
        viewGroup.setTag(triweekly.ghost_view_holder, this);
        this.f25513kowloon.getOverlay().add(this);
        this.f25512arytenoidectomy = true;
    }

    public static boolean beachfront(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < iMin; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return marial(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    public static boolean marial(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (attabal.attabal(view) != attabal.attabal(view2)) {
            return attabal.attabal(view) > attabal.attabal(view2);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(yemenite.attabal(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    public static beachfront saneness(ViewGroup viewGroup) {
        return (beachfront) viewGroup.getTag(triweekly.ghost_view_holder);
    }

    public static void wireman(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            wireman((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public void attabal(impromptu impromptuVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        wireman(impromptuVar.f25530monoploid, arrayList);
        int iDern = dern(arrayList);
        if (iDern < 0 || iDern >= getChildCount()) {
            addView(impromptuVar);
        } else {
            addView(impromptuVar, iDern);
        }
    }

    public void competently() {
        if (!this.f25512arytenoidectomy) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f25513kowloon.getOverlay().remove(this);
        this.f25513kowloon.getOverlay().add(this);
    }

    public final int dern(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            wireman(((impromptu) getChildAt(i2)).f25530monoploid, arrayList2);
            if (beachfront(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f25512arytenoidectomy) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f25513kowloon.setTag(triweekly.ghost_view_holder, null);
            this.f25513kowloon.getOverlay().remove(this);
            this.f25512arytenoidectomy = false;
        }
    }
}
