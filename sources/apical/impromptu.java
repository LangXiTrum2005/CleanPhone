package apical;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.empress;
import androidx.core.view.lotta;
import androidx.core.view.sayid;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Interpolator f14283dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f14284marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public sayid f14286wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f14285saneness = -1;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final empress f14282beachfront = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<lotta> f14281attabal = new ArrayList<>();

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
    public class attabal extends empress {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f14287attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f14289saneness = 0;

        public attabal() {
        }

        @Override // androidx.core.view.empress, androidx.core.view.sayid
        public void dern(View view) {
            if (this.f14287attabal) {
                return;
            }
            this.f14287attabal = true;
            sayid sayidVar = impromptu.this.f14286wireman;
            if (sayidVar != null) {
                sayidVar.dern(null);
            }
        }

        @Override // androidx.core.view.sayid
        public void saneness(View view) {
            int i = this.f14289saneness + 1;
            this.f14289saneness = i;
            if (i == impromptu.this.f14281attabal.size()) {
                sayid sayidVar = impromptu.this.f14286wireman;
                if (sayidVar != null) {
                    sayidVar.saneness(null);
                }
                wireman();
            }
        }

        public void wireman() {
            this.f14289saneness = 0;
            this.f14287attabal = false;
            impromptu.this.saneness();
        }
    }

    public void attabal() {
        if (this.f14284marial) {
            Iterator<lotta> it = this.f14281attabal.iterator();
            while (it.hasNext()) {
                it.next().dern();
            }
            this.f14284marial = false;
        }
    }

    public impromptu beachfront(Interpolator interpolator) {
        if (!this.f14284marial) {
            this.f14283dern = interpolator;
        }
        return this;
    }

    public impromptu competently(sayid sayidVar) {
        if (!this.f14284marial) {
            this.f14286wireman = sayidVar;
        }
        return this;
    }

    public impromptu dern(lotta lottaVar) {
        if (!this.f14284marial) {
            this.f14281attabal.add(lottaVar);
        }
        return this;
    }

    public void impromptu() {
        if (this.f14284marial) {
            return;
        }
        for (lotta lottaVar : this.f14281attabal) {
            long j = this.f14285saneness;
            if (j >= 0) {
                lottaVar.competently(j);
            }
            Interpolator interpolator = this.f14283dern;
            if (interpolator != null) {
                lottaVar.impromptu(interpolator);
            }
            if (this.f14286wireman != null) {
                lottaVar.taiyuan(this.f14282beachfront);
            }
            lottaVar.impassible();
        }
        this.f14284marial = true;
    }

    public impromptu marial(long j) {
        if (!this.f14284marial) {
            this.f14285saneness = j;
        }
        return this;
    }

    public void saneness() {
        this.f14284marial = false;
    }

    public impromptu wireman(lotta lottaVar, lotta lottaVar2) {
        this.f14281attabal.add(lottaVar);
        lottaVar2.apical(lottaVar.wireman());
        this.f14281attabal.add(lottaVar2);
        return this;
    }
}
