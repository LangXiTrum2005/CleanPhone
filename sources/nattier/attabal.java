package nattier;

import decarock.stratoscope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Atom.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f33698attabal;

    /* JADX INFO: renamed from: nattier.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Atom.java */
    public static final class C0751attabal extends attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<saneness> f33699dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f33700saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<C0751attabal> f33701wireman;

        public C0751attabal(int i, long j) {
            super(i);
            this.f33700saneness = j;
            this.f33699dern = new ArrayList();
            this.f33701wireman = new ArrayList();
        }

        public C0751attabal beachfront(int i) {
            int size = this.f33701wireman.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0751attabal c0751attabal = this.f33701wireman.get(i2);
                if (c0751attabal.f33698attabal == i) {
                    return c0751attabal;
                }
            }
            return null;
        }

        public saneness competently(int i) {
            int size = this.f33699dern.size();
            for (int i2 = 0; i2 < size; i2++) {
                saneness sanenessVar = this.f33699dern.get(i2);
                if (sanenessVar.f33698attabal == i) {
                    return sanenessVar;
                }
            }
            return null;
        }

        public void marial(saneness sanenessVar) {
            this.f33699dern.add(sanenessVar);
        }

        @Override // nattier.attabal
        public String toString() {
            return attabal.attabal(this.f33698attabal) + " leaves: " + Arrays.toString(this.f33699dern.toArray()) + " containers: " + Arrays.toString(this.f33701wireman.toArray());
        }

        public void wireman(C0751attabal c0751attabal) {
            this.f33701wireman.add(c0751attabal);
        }
    }

    /* JADX INFO: compiled from: Atom.java */
    public static final class saneness extends attabal {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final stratoscope f33702saneness;

        public saneness(int i, stratoscope stratoscopeVar) {
            super(i);
            this.f33702saneness = stratoscopeVar;
        }
    }

    public attabal(int i) {
        this.f33698attabal = i;
    }

    public static String attabal(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int dern(int i) {
        return (i >> 24) & 255;
    }

    public static int saneness(int i) {
        return i & 16777215;
    }

    public String toString() {
        return attabal(this.f33698attabal);
    }
}
