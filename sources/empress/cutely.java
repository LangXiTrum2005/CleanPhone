package empress;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.ironsource.X3;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: WidgetGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static int f25654competently;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f25659saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f25660wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f25655attabal = new ArrayList<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f25657dern = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ArrayList<attabal> f25658marial = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f25656beachfront = -1;

    /* JADX INFO: compiled from: WidgetGroup.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public WeakReference<ConstraintWidget> f25661attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f25662beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f25663competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f25664dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f25665marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f25666saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f25667wireman;

        public attabal(ConstraintWidget constraintWidget, androidx.constraintlayout.core.dern dernVar, int i) {
            this.f25661attabal = new WeakReference<>(constraintWidget);
            this.f25666saneness = dernVar.preprohormone(constraintWidget.f8164starveling);
            this.f25664dern = dernVar.preprohormone(constraintWidget.f8116hydrovane);
            this.f25667wireman = dernVar.preprohormone(constraintWidget.f8177walach);
            this.f25665marial = dernVar.preprohormone(constraintWidget.f8144peridotite);
            this.f25662beachfront = dernVar.preprohormone(constraintWidget.f8132mathsort);
            this.f25663competently = i;
        }
    }

    public cutely(int i) {
        int i2 = f25654competently;
        f25654competently = i2 + 1;
        this.f25659saneness = i2;
        this.f25660wireman = i;
    }

    public boolean attabal(ConstraintWidget constraintWidget) {
        if (this.f25655attabal.contains(constraintWidget)) {
            return false;
        }
        this.f25655attabal.add(constraintWidget);
        return true;
    }

    public int beachfront(androidx.constraintlayout.core.dern dernVar, int i) {
        if (this.f25655attabal.size() == 0) {
            return 0;
        }
        return cutely(dernVar, this.f25655attabal, i);
    }

    public void competently(int i, cutely cutelyVar) {
        for (ConstraintWidget constraintWidget : this.f25655attabal) {
            cutelyVar.attabal(constraintWidget);
            if (i == 0) {
                constraintWidget.f8089basify = cutelyVar.dern();
            } else {
                constraintWidget.f8169tectonization = cutelyVar.dern();
            }
        }
        this.f25656beachfront = cutelyVar.f25659saneness;
    }

    public final int cutely(androidx.constraintlayout.core.dern dernVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int iPreprohormone;
        int iPreprohormone2;
        androidx.constraintlayout.core.widgets.wireman wiremanVar = (androidx.constraintlayout.core.widgets.wireman) arrayList.get(0).grimness();
        dernVar.yemenite();
        wiremanVar.competently(dernVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).competently(dernVar, false);
        }
        if (i == 0 && wiremanVar.f8327stupefactive > 0) {
            androidx.constraintlayout.core.widgets.saneness.saneness(wiremanVar, dernVar, arrayList, 0);
        }
        if (i == 1 && wiremanVar.f8317libya > 0) {
            androidx.constraintlayout.core.widgets.saneness.saneness(wiremanVar, dernVar, arrayList, 1);
        }
        try {
            dernVar.cuirassed();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            e.toString();
            Arrays.toString(e.getStackTrace()).replace(X3.j.d, "   at ").replace(",", "\n   at").replace(X3.j.e, "");
            printStream.getClass();
        }
        this.f25658marial = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f25658marial.add(new attabal(arrayList.get(i3), dernVar, i));
        }
        if (i == 0) {
            iPreprohormone = dernVar.preprohormone(wiremanVar.f8164starveling);
            iPreprohormone2 = dernVar.preprohormone(wiremanVar.f8177walach);
            dernVar.yemenite();
        } else {
            iPreprohormone = dernVar.preprohormone(wiremanVar.f8116hydrovane);
            iPreprohormone2 = dernVar.preprohormone(wiremanVar.f8144peridotite);
            dernVar.yemenite();
        }
        return iPreprohormone2 - iPreprohormone;
    }

    public int dern() {
        return this.f25659saneness;
    }

    public void impromptu(boolean z) {
        this.f25657dern = z;
    }

    public final String marial() {
        int i = this.f25660wireman;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    public void saneness(ArrayList<cutely> arrayList) {
        int size = this.f25655attabal.size();
        if (this.f25656beachfront != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                cutely cutelyVar = arrayList.get(i);
                if (this.f25656beachfront == cutelyVar.f25659saneness) {
                    competently(this.f25660wireman, cutelyVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void taiyuan(int i) {
        this.f25660wireman = i;
    }

    public String toString() {
        String str = marial() + " [" + this.f25659saneness + "] <";
        Iterator<ConstraintWidget> it = this.f25655attabal.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().dovishness();
        }
        return str + " >";
    }

    public int wireman() {
        return this.f25660wireman;
    }
}
