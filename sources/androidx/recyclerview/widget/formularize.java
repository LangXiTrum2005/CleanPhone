package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: ScrollbarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize {
    public static int attabal(RecyclerView.rotuma rotumaVar, taiyuan taiyuanVar, View view, View view2, RecyclerView.kowloon kowloonVar, boolean z) {
        if (kowloonVar.getChildCount() == 0 || rotumaVar.saneness() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(kowloonVar.getPosition(view) - kowloonVar.getPosition(view2)) + 1;
        }
        return Math.min(taiyuanVar.kowloon(), taiyuanVar.wireman(view2) - taiyuanVar.competently(view));
    }

    public static int dern(RecyclerView.rotuma rotumaVar, taiyuan taiyuanVar, View view, View view2, RecyclerView.kowloon kowloonVar, boolean z) {
        if (kowloonVar.getChildCount() == 0 || rotumaVar.saneness() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return rotumaVar.saneness();
        }
        return (int) (((taiyuanVar.wireman(view2) - taiyuanVar.competently(view)) / (Math.abs(kowloonVar.getPosition(view) - kowloonVar.getPosition(view2)) + 1)) * rotumaVar.saneness());
    }

    public static int saneness(RecyclerView.rotuma rotumaVar, taiyuan taiyuanVar, View view, View view2, RecyclerView.kowloon kowloonVar, boolean z, boolean z2) {
        if (kowloonVar.getChildCount() == 0 || rotumaVar.saneness() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (rotumaVar.saneness() - Math.max(kowloonVar.getPosition(view), kowloonVar.getPosition(view2))) - 1) : Math.max(0, Math.min(kowloonVar.getPosition(view), kowloonVar.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(taiyuanVar.wireman(view2) - taiyuanVar.competently(view)) / (Math.abs(kowloonVar.getPosition(view) - kowloonVar.getPosition(view2)) + 1))) + (taiyuanVar.triweekly() - taiyuanVar.competently(view)));
        }
        return iMax;
    }
}
