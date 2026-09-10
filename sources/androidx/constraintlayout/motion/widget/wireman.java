package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import czestochowa.impassible;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewTransitionController.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MotionLayout f8675attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public HashSet<View> f8677dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ArrayList<dern.saneness> f8678marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ArrayList<dern> f8679saneness = new ArrayList<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f8680wireman = "ViewTransitionController";

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ArrayList<dern.saneness> f8676beachfront = new ArrayList<>();

    /* JADX INFO: compiled from: ViewTransitionController.java */
    public class attabal implements androidx.constraintlayout.widget.saneness.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ int f8681arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ dern f8682kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ boolean f8684monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ int f8685polloi;

        public attabal(dern dernVar, int i, boolean z, int i2) {
            this.f8682kowloon = dernVar;
            this.f8681arytenoidectomy = i;
            this.f8684monoploid = z;
            this.f8685polloi = i2;
        }
    }

    public wireman(MotionLayout motionLayout) {
        this.f8675attabal = motionLayout;
    }

    public void attabal(dern dernVar) {
        this.f8679saneness.add(dernVar);
        this.f8677dern = null;
        if (dernVar.taiyuan() == 4) {
            beachfront(dernVar, true);
        } else if (dernVar.taiyuan() == 5) {
            beachfront(dernVar, false);
        }
    }

    public final void beachfront(dern dernVar, boolean z) {
        ConstraintLayout.getSharedValues().attabal(dernVar.impromptu(), new attabal(dernVar, dernVar.impromptu(), z, dernVar.competently()));
    }

    public void competently(dern.saneness sanenessVar) {
        this.f8676beachfront.add(sanenessVar);
    }

    public final void cutely(dern dernVar, View... viewArr) {
        int currentState = this.f8675attabal.getCurrentState();
        if (dernVar.f8614marial == 2) {
            dernVar.dern(this, this.f8675attabal, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            this.f8675attabal.toString();
            return;
        }
        androidx.constraintlayout.widget.attabal attabalVarNosophobia = this.f8675attabal.nosophobia(currentState);
        if (attabalVarNosophobia == null) {
            return;
        }
        dernVar.dern(this, this.f8675attabal, currentState, attabalVarNosophobia, viewArr);
    }

    public void dern() {
        ArrayList<dern.saneness> arrayList = this.f8678marial;
        if (arrayList == null) {
            return;
        }
        Iterator<dern.saneness> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().attabal();
        }
        this.f8678marial.removeAll(this.f8676beachfront);
        this.f8676beachfront.clear();
        if (this.f8678marial.isEmpty()) {
            this.f8678marial = null;
        }
    }

    public void impromptu(MotionEvent motionEvent) {
        int currentState = this.f8675attabal.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f8677dern == null) {
            this.f8677dern = new HashSet<>();
            for (dern dernVar : this.f8679saneness) {
                int childCount = this.f8675attabal.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f8675attabal.getChildAt(i);
                    if (dernVar.cutely(childAt)) {
                        childAt.getId();
                        this.f8677dern.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<dern.saneness> arrayList = this.f8678marial;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<dern.saneness> it = this.f8678marial.iterator();
            while (it.hasNext()) {
                it.next().wireman(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.attabal attabalVarNosophobia = this.f8675attabal.nosophobia(currentState);
            for (dern dernVar2 : this.f8679saneness) {
                if (dernVar2.formularize(action)) {
                    for (View view : this.f8677dern) {
                        if (dernVar2.cutely(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                dernVar2.dern(this, this.f8675attabal, currentState, attabalVarNosophobia, view);
                            }
                        }
                    }
                }
            }
        }
    }

    public void marial() {
        this.f8675attabal.invalidate();
    }

    public void saneness(dern.saneness sanenessVar) {
        if (this.f8678marial == null) {
            this.f8678marial = new ArrayList<>();
        }
        this.f8678marial.add(sanenessVar);
    }

    public void taiyuan(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (dern dernVar : this.f8679saneness) {
            if (dernVar.marial() == i) {
                for (View view : viewArr) {
                    if (dernVar.wireman(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    cutely(dernVar, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    public boolean wireman(int i, impassible impassibleVar) {
        for (dern dernVar : this.f8679saneness) {
            if (dernVar.marial() == i) {
                dernVar.f8604beachfront.attabal(impassibleVar);
                return true;
            }
        }
        return false;
    }
}
