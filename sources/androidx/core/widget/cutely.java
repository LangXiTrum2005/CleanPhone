package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: compiled from: ListViewAutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely extends attabal {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final ListView f9502kattegat;

    public cutely(ListView listView) {
        super(listView);
        this.f9502kattegat = listView;
    }

    @Override // androidx.core.widget.attabal
    public boolean attabal(int i) {
        return false;
    }

    @Override // androidx.core.widget.attabal
    public void cutely(int i, int i2) {
        this.f9502kattegat.scrollListBy(i2);
    }

    @Override // androidx.core.widget.attabal
    public boolean saneness(int i) {
        ListView listView = this.f9502kattegat;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
