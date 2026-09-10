package androidx.media3.common;

import com.google.common.collect.ImmutableList;
import decarock.grimness;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Tracks.java */
/* JADX INFO: loaded from: classes.dex */
public final class supplicat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ImmutableList<attabal> f11294attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final supplicat f11293saneness = new supplicat(ImmutableList.of());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f11292dern = grimness.igbo(0);

    /* JADX INFO: compiled from: Tracks.java */
    public static final class attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final String f11295beachfront = grimness.igbo(0);

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final String f11296competently = grimness.igbo(1);

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final String f11297impromptu = grimness.igbo(3);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final String f11298taiyuan = grimness.igbo(4);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f11299attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f11300dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean[] f11301marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final yemenite f11302saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int[] f11303wireman;

        public attabal(yemenite yemeniteVar, boolean z, int[] iArr, boolean[] zArr) {
            int i = yemeniteVar.f11332attabal;
            this.f11299attabal = i;
            boolean z2 = false;
            decarock.attabal.attabal(i == iArr.length && i == zArr.length);
            this.f11302saneness = yemeniteVar;
            if (z && i > 1) {
                z2 = true;
            }
            this.f11300dern = z2;
            this.f11303wireman = (int[]) iArr.clone();
            this.f11301marial = (boolean[]) zArr.clone();
        }

        public yemenite attabal() {
            return this.f11302saneness;
        }

        public int dern() {
            return this.f11302saneness.f11333dern;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && attabal.class == obj.getClass()) {
                attabal attabalVar = (attabal) obj;
                if (this.f11300dern == attabalVar.f11300dern && this.f11302saneness.equals(attabalVar.f11302saneness) && Arrays.equals(this.f11303wireman, attabalVar.f11303wireman) && Arrays.equals(this.f11301marial, attabalVar.f11301marial)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f11302saneness.hashCode() * 31) + (this.f11300dern ? 1 : 0)) * 31) + Arrays.hashCode(this.f11303wireman)) * 31) + Arrays.hashCode(this.f11301marial);
        }

        public boolean marial(int i) {
            return this.f11301marial[i];
        }

        public polloi saneness(int i) {
            return this.f11302saneness.attabal(i);
        }

        public boolean wireman() {
            return com.google.common.primitives.attabal.saneness(this.f11301marial, true);
        }
    }

    public supplicat(List<attabal> list) {
        this.f11294attabal = ImmutableList.copyOf((Collection) list);
    }

    public ImmutableList<attabal> attabal() {
        return this.f11294attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || supplicat.class != obj.getClass()) {
            return false;
        }
        return this.f11294attabal.equals(((supplicat) obj).f11294attabal);
    }

    public int hashCode() {
        return this.f11294attabal.hashCode();
    }

    public boolean saneness(int i) {
        for (int i2 = 0; i2 < this.f11294attabal.size(); i2++) {
            attabal attabalVar = this.f11294attabal.get(i2);
            if (attabalVar.wireman() && attabalVar.dern() == i) {
                return true;
            }
        }
        return false;
    }
}
