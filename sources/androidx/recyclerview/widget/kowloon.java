package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: ViewBoundsCheck.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f13451attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f13452saneness = new attabal();

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f13453attabal = 0;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f13454dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f13455marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f13456saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f13457wireman;

        public void attabal(int i) {
            this.f13453attabal = i | this.f13453attabal;
        }

        public int dern(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void marial(int i, int i2, int i3, int i4) {
            this.f13456saneness = i;
            this.f13454dern = i2;
            this.f13457wireman = i3;
            this.f13455marial = i4;
        }

        public boolean saneness() {
            int i = this.f13453attabal;
            if ((i & 7) != 0 && (i & dern(this.f13457wireman, this.f13456saneness)) == 0) {
                return false;
            }
            int i2 = this.f13453attabal;
            if ((i2 & 112) != 0 && (i2 & (dern(this.f13457wireman, this.f13454dern) << 4)) == 0) {
                return false;
            }
            int i3 = this.f13453attabal;
            if ((i3 & 1792) != 0 && (i3 & (dern(this.f13455marial, this.f13456saneness) << 8)) == 0) {
                return false;
            }
            int i4 = this.f13453attabal;
            return (i4 & 28672) == 0 || (i4 & (dern(this.f13455marial, this.f13454dern) << 12)) != 0;
        }

        public void wireman() {
            this.f13453attabal = 0;
        }
    }

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    public interface saneness {
        View attabal(int i);

        int dern();

        int marial(View view);

        int saneness(View view);

        int wireman();
    }

    public kowloon(saneness sanenessVar) {
        this.f13451attabal = sanenessVar;
    }

    public View attabal(int i, int i2, int i3, int i4) {
        int iDern = this.f13451attabal.dern();
        int iWireman = this.f13451attabal.wireman();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewAttabal = this.f13451attabal.attabal(i);
            this.f13452saneness.marial(iDern, iWireman, this.f13451attabal.saneness(viewAttabal), this.f13451attabal.marial(viewAttabal));
            if (i3 != 0) {
                this.f13452saneness.wireman();
                this.f13452saneness.attabal(i3);
                if (this.f13452saneness.saneness()) {
                    return viewAttabal;
                }
            }
            if (i4 != 0) {
                this.f13452saneness.wireman();
                this.f13452saneness.attabal(i4);
                if (this.f13452saneness.saneness()) {
                    view = viewAttabal;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean saneness(View view, int i) {
        this.f13452saneness.marial(this.f13451attabal.dern(), this.f13451attabal.wireman(), this.f13451attabal.saneness(view), this.f13451attabal.marial(view));
        if (i == 0) {
            return false;
        }
        this.f13452saneness.wireman();
        this.f13452saneness.attabal(i);
        return this.f13452saneness.saneness();
    }
}
