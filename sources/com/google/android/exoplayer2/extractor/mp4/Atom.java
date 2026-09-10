package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
abstract class Atom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17750a;

    public static final class ContainerAtom extends Atom {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f17752c;
        public final ArrayList d;

        public ContainerAtom(int i2, long j) {
            super(i2);
            this.f17751b = j;
            this.f17752c = new ArrayList();
            this.d = new ArrayList();
        }

        public final ContainerAtom c(int i2) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ContainerAtom containerAtom = (ContainerAtom) arrayList.get(i3);
                if (containerAtom.f17750a == i2) {
                    return containerAtom;
                }
            }
            return null;
        }

        public final LeafAtom d(int i2) {
            ArrayList arrayList = this.f17752c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                LeafAtom leafAtom = (LeafAtom) arrayList.get(i3);
                if (leafAtom.f17750a == i2) {
                    return leafAtom;
                }
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.Atom
        public final String toString() {
            return Atom.a(this.f17750a) + " leaves: " + Arrays.toString(this.f17752c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    public static final class LeafAtom extends Atom {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsableByteArray f17753b;

        public LeafAtom(int i2, ParsableByteArray parsableByteArray) {
            super(i2);
            this.f17753b = parsableByteArray;
        }
    }

    public Atom(int i2) {
        this.f17750a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.f17750a);
    }
}
