package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InterfaceC0098saneness f13473attabal;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public View f13475marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f13477wireman = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f13476saneness = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<View> f13474dern = new ArrayList();

    /* JADX INFO: compiled from: ChildHelper.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f13478attabal = 0;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public attabal f13479saneness;

        public void attabal(int i) {
            if (i < 64) {
                this.f13478attabal &= ~(1 << i);
                return;
            }
            attabal attabalVar = this.f13479saneness;
            if (attabalVar != null) {
                attabalVar.attabal(i - 64);
            }
        }

        public boolean beachfront(int i) {
            if (i >= 64) {
                dern();
                return this.f13479saneness.beachfront(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f13478attabal;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f13478attabal = j3;
            long j4 = j - 1;
            this.f13478attabal = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            attabal attabalVar = this.f13479saneness;
            if (attabalVar != null) {
                if (attabalVar.wireman(0)) {
                    impromptu(63);
                }
                this.f13479saneness.beachfront(0);
            }
            return z;
        }

        public void competently() {
            this.f13478attabal = 0L;
            attabal attabalVar = this.f13479saneness;
            if (attabalVar != null) {
                attabalVar.competently();
            }
        }

        public final void dern() {
            if (this.f13479saneness == null) {
                this.f13479saneness = new attabal();
            }
        }

        public void impromptu(int i) {
            if (i < 64) {
                this.f13478attabal |= 1 << i;
            } else {
                dern();
                this.f13479saneness.impromptu(i - 64);
            }
        }

        public void marial(int i, boolean z) {
            if (i >= 64) {
                dern();
                this.f13479saneness.marial(i - 64, z);
                return;
            }
            long j = this.f13478attabal;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f13478attabal = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                impromptu(i);
            } else {
                attabal(i);
            }
            if (z2 || this.f13479saneness != null) {
                dern();
                this.f13479saneness.marial(0, z2);
            }
        }

        public int saneness(int i) {
            attabal attabalVar = this.f13479saneness;
            if (attabalVar == null) {
                return i >= 64 ? Long.bitCount(this.f13478attabal) : Long.bitCount(this.f13478attabal & ((1 << i) - 1));
            }
            return i < 64 ? Long.bitCount(this.f13478attabal & ((1 << i) - 1)) : attabalVar.saneness(i - 64) + Long.bitCount(this.f13478attabal);
        }

        public String toString() {
            if (this.f13479saneness == null) {
                return Long.toBinaryString(this.f13478attabal);
            }
            return this.f13479saneness.toString() + "xx" + Long.toBinaryString(this.f13478attabal);
        }

        public boolean wireman(int i) {
            if (i < 64) {
                return (this.f13478attabal & (1 << i)) != 0;
            }
            dern();
            return this.f13479saneness.wireman(i - 64);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChildHelper.java */
    public interface InterfaceC0098saneness {
        void addView(View view, int i);

        View attabal(int i);

        void beachfront();

        int competently(View view);

        void cutely(View view, int i, ViewGroup.LayoutParams layoutParams);

        int dern();

        void impromptu(View view);

        void marial(int i);

        void saneness(View view);

        void taiyuan(int i);

        RecyclerView.stratoscope wireman(View view);
    }

    public saneness(InterfaceC0098saneness interfaceC0098saneness) {
        this.f13473attabal = interfaceC0098saneness;
    }

    public void apical(View view) {
        int iCompetently = this.f13473attabal.competently(view);
        if (iCompetently >= 0) {
            this.f13476saneness.impromptu(iCompetently);
            formularize(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void arytenoidectomy(View view) {
        int i = this.f13477wireman;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f13477wireman = 1;
            this.f13475marial = view;
            int iCompetently = this.f13473attabal.competently(view);
            if (iCompetently >= 0) {
                if (this.f13476saneness.beachfront(iCompetently)) {
                    graveside(view);
                }
                this.f13473attabal.taiyuan(iCompetently);
            }
        } finally {
            this.f13477wireman = 0;
            this.f13475marial = null;
        }
    }

    public void attabal(View view, int i, boolean z) {
        int iDern = i < 0 ? this.f13473attabal.dern() : impromptu(i);
        this.f13476saneness.marial(iDern, z);
        if (z) {
            formularize(view);
        }
        this.f13473attabal.addView(view, iDern);
    }

    public View beachfront(int i) {
        return this.f13473attabal.attabal(impromptu(i));
    }

    public int competently() {
        return this.f13473attabal.dern() - this.f13474dern.size();
    }

    public int cutely() {
        return this.f13473attabal.dern();
    }

    public void dern(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iDern = i < 0 ? this.f13473attabal.dern() : impromptu(i);
        this.f13476saneness.marial(iDern, z);
        if (z) {
            formularize(view);
        }
        this.f13473attabal.cutely(view, iDern, layoutParams);
    }

    public final void formularize(View view) {
        this.f13474dern.add(view);
        this.f13473attabal.saneness(view);
    }

    public final boolean graveside(View view) {
        if (!this.f13474dern.remove(view)) {
            return false;
        }
        this.f13473attabal.impromptu(view);
        return true;
    }

    public int impassible(View view) {
        int iCompetently = this.f13473attabal.competently(view);
        if (iCompetently == -1 || this.f13476saneness.wireman(iCompetently)) {
            return -1;
        }
        return iCompetently - this.f13476saneness.saneness(iCompetently);
    }

    public final int impromptu(int i) {
        if (i < 0) {
            return -1;
        }
        int iDern = this.f13473attabal.dern();
        int i2 = i;
        while (i2 < iDern) {
            int iSaneness = i - (i2 - this.f13476saneness.saneness(i2));
            if (iSaneness == 0) {
                while (this.f13476saneness.wireman(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iSaneness;
        }
        return -1;
    }

    public void kowloon() {
        this.f13476saneness.competently();
        for (int size = this.f13474dern.size() - 1; size >= 0; size--) {
            this.f13473attabal.impromptu(this.f13474dern.get(size));
            this.f13474dern.remove(size);
        }
        this.f13473attabal.beachfront();
    }

    public View marial(int i) {
        int size = this.f13474dern.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f13474dern.get(i2);
            RecyclerView.stratoscope stratoscopeVarWireman = this.f13473attabal.wireman(view);
            if (stratoscopeVarWireman.getLayoutPosition() == i && !stratoscopeVarWireman.isInvalid() && !stratoscopeVarWireman.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public void molybdenite(View view) {
        int iCompetently = this.f13473attabal.competently(view);
        if (iCompetently < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f13476saneness.wireman(iCompetently)) {
            this.f13476saneness.attabal(iCompetently);
            graveside(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public void monoploid(int i) {
        int i2 = this.f13477wireman;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iImpromptu = impromptu(i);
            View viewAttabal = this.f13473attabal.attabal(iImpromptu);
            if (viewAttabal != null) {
                this.f13477wireman = 1;
                this.f13475marial = viewAttabal;
                if (this.f13476saneness.beachfront(iImpromptu)) {
                    graveside(viewAttabal);
                }
                this.f13473attabal.taiyuan(iImpromptu);
            }
        } finally {
            this.f13477wireman = 0;
            this.f13475marial = null;
        }
    }

    public boolean polloi(View view) {
        int i = this.f13477wireman;
        if (i == 1) {
            if (this.f13475marial == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f13477wireman = 2;
            int iCompetently = this.f13473attabal.competently(view);
            if (iCompetently == -1) {
                graveside(view);
                return true;
            }
            if (!this.f13476saneness.wireman(iCompetently)) {
                return false;
            }
            this.f13476saneness.beachfront(iCompetently);
            graveside(view);
            this.f13473attabal.taiyuan(iCompetently);
            return true;
        } finally {
            this.f13477wireman = 0;
        }
    }

    public void saneness(View view, boolean z) {
        attabal(view, -1, z);
    }

    public View taiyuan(int i) {
        return this.f13473attabal.attabal(i);
    }

    public String toString() {
        return this.f13476saneness.toString() + ", hidden list:" + this.f13474dern.size();
    }

    public boolean triweekly(View view) {
        return this.f13474dern.contains(view);
    }

    public void wireman(int i) {
        int iImpromptu = impromptu(i);
        this.f13476saneness.beachfront(iImpromptu);
        this.f13473attabal.marial(iImpromptu);
    }
}
