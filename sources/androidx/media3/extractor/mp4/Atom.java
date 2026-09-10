package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class Atom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7053a;

    public static final class ContainerAtom extends Atom {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f7055c;
        public final ArrayList d;

        public ContainerAtom(int i2, long j) {
            super(i2);
            this.f7054b = j;
            this.f7055c = new ArrayList();
            this.d = new ArrayList();
        }

        public final ContainerAtom c(int i2) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ContainerAtom containerAtom = (ContainerAtom) arrayList.get(i3);
                if (containerAtom.f7053a == i2) {
                    return containerAtom;
                }
            }
            return null;
        }

        public final LeafAtom d(int i2) {
            ArrayList arrayList = this.f7055c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                LeafAtom leafAtom = (LeafAtom) arrayList.get(i3);
                if (leafAtom.f7053a == i2) {
                    return leafAtom;
                }
            }
            return null;
        }

        @Override // androidx.media3.extractor.mp4.Atom
        public final String toString() {
            return Atom.a(this.f7053a) + " leaves: " + Arrays.toString(this.f7055c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    public static final class LeafAtom extends Atom {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsableByteArray f7056b;

        public LeafAtom(int i2, ParsableByteArray parsableByteArray) {
            super(i2);
            this.f7056b = parsableByteArray;
        }
    }

    public Atom(int i2) {
        this.f7053a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.f7053a);
    }
}
