package androidx.media3.common;

import android.util.SparseBooleanArray;
import decarock.grimness;

/* JADX INFO: compiled from: FlagSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SparseBooleanArray f11078attabal;

    /* JADX INFO: compiled from: FlagSet.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final SparseBooleanArray f11079attabal = new SparseBooleanArray();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f11080saneness;

        public saneness attabal(int i) {
            decarock.attabal.competently(!this.f11080saneness);
            this.f11079attabal.append(i, true);
            return this;
        }

        public saneness dern(int... iArr) {
            for (int i : iArr) {
                attabal(i);
            }
            return this;
        }

        public kowloon marial() {
            decarock.attabal.competently(!this.f11080saneness);
            this.f11080saneness = true;
            return new kowloon(this.f11079attabal);
        }

        public saneness saneness(kowloon kowloonVar) {
            for (int i = 0; i < kowloonVar.dern(); i++) {
                attabal(kowloonVar.saneness(i));
            }
            return this;
        }

        public saneness wireman(int i, boolean z) {
            return z ? attabal(i) : this;
        }
    }

    public boolean attabal(int i) {
        return this.f11078attabal.get(i);
    }

    public int dern() {
        return this.f11078attabal.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kowloon)) {
            return false;
        }
        kowloon kowloonVar = (kowloon) obj;
        if (grimness.f25080attabal >= 24) {
            return this.f11078attabal.equals(kowloonVar.f11078attabal);
        }
        if (dern() != kowloonVar.dern()) {
            return false;
        }
        for (int i = 0; i < dern(); i++) {
            if (saneness(i) != kowloonVar.saneness(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (grimness.f25080attabal >= 24) {
            return this.f11078attabal.hashCode();
        }
        int iDern = dern();
        for (int i = 0; i < dern(); i++) {
            iDern = (iDern * 31) + saneness(i);
        }
        return iDern;
    }

    public int saneness(int i) {
        decarock.attabal.dern(i, 0, dern());
        return this.f11078attabal.keyAt(i);
    }

    public kowloon(SparseBooleanArray sparseBooleanArray) {
        this.f11078attabal = sparseBooleanArray;
    }
}
