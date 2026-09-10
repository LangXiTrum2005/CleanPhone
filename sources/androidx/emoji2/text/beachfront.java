package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import claque.impassible;
import java.io.IOException;
import java.nio.ByteBuffer;
import sakeen.cutely;
import sakeen.impromptu;

/* JADX INFO: compiled from: MetadataRepo.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final immediately.saneness f9971attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f9972dern = new attabal(1024);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final char[] f9973saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Typeface f9974wireman;

    /* JADX INFO: compiled from: MetadataRepo.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final SparseArray<attabal> f9975attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public cutely f9976saneness;

        public attabal() {
            this(1);
        }

        public attabal attabal(int i) {
            SparseArray<attabal> sparseArray = this.f9975attabal;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public void dern(cutely cutelyVar, int i, int i2) {
            attabal attabalVarAttabal = attabal(cutelyVar.saneness(i));
            if (attabalVarAttabal == null) {
                attabalVarAttabal = new attabal();
                this.f9975attabal.put(cutelyVar.saneness(i), attabalVarAttabal);
            }
            if (i2 > i) {
                attabalVarAttabal.dern(cutelyVar, i + 1, i2);
            } else {
                attabalVarAttabal.f9976saneness = cutelyVar;
            }
        }

        public final cutely saneness() {
            return this.f9976saneness;
        }

        public attabal(int i) {
            this.f9975attabal = new SparseArray<>(i);
        }
    }

    public beachfront(Typeface typeface, immediately.saneness sanenessVar) {
        this.f9974wireman = typeface;
        this.f9971attabal = sanenessVar;
        this.f9973saneness = new char[sanenessVar.apical() * 2];
        attabal(sanenessVar);
    }

    public static beachfront saneness(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            impassible.attabal("EmojiCompat.MetadataRepo.create");
            return new beachfront(typeface, impromptu.saneness(byteBuffer));
        } finally {
            impassible.saneness();
        }
    }

    public final void attabal(immediately.saneness sanenessVar) {
        int iApical = sanenessVar.apical();
        for (int i = 0; i < iApical; i++) {
            cutely cutelyVar = new cutely(this, i);
            Character.toChars(cutelyVar.beachfront(), this.f9973saneness, i * 2);
            impromptu(cutelyVar);
        }
    }

    public attabal beachfront() {
        return this.f9972dern;
    }

    public Typeface competently() {
        return this.f9974wireman;
    }

    public char[] dern() {
        return this.f9973saneness;
    }

    public void impromptu(cutely cutelyVar) {
        technofreak.cutely.impromptu(cutelyVar, "emoji metadata cannot be null");
        technofreak.cutely.saneness(cutelyVar.dern() > 0, "invalid metadata codepoint length");
        this.f9972dern.dern(cutelyVar, 0, cutelyVar.dern() - 1);
    }

    public int marial() {
        return this.f9971attabal.formularize();
    }

    public immediately.saneness wireman() {
        return this.f9971attabal;
    }
}
