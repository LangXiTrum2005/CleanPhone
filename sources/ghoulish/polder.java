package ghoulish;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public interface polder {

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f27032attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final byte[] f27033dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f27034saneness;

        public attabal(String str, int i, byte[] bArr) {
            this.f27032attabal = str;
            this.f27034saneness = i;
            this.f27033dern = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface dern {
        polder attabal(int i, saneness sanenessVar);

        SparseArray<polder> createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f27035attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f27036dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final byte[] f27037marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f27038saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<attabal> f27039wireman;

        public saneness(int i, String str, int i2, List<attabal> list, byte[] bArr) {
            this.f27035attabal = i;
            this.f27038saneness = str;
            this.f27036dern = i2;
            this.f27039wireman = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f27037marial = bArr;
        }

        public int attabal() {
            int i = this.f27036dern;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f27040attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f27041dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public String f27042marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f27043saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f27044wireman;

        public wireman(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void attabal() {
            int i = this.f27044wireman;
            this.f27044wireman = i == Integer.MIN_VALUE ? this.f27043saneness : i + this.f27041dern;
            this.f27042marial = this.f27040attabal + this.f27044wireman;
        }

        public int dern() {
            wireman();
            return this.f27044wireman;
        }

        public String saneness() {
            wireman();
            return this.f27042marial;
        }

        public final void wireman() {
            if (this.f27044wireman == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public wireman(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f27040attabal = str;
            this.f27043saneness = i2;
            this.f27041dern = i3;
            this.f27044wireman = Integer.MIN_VALUE;
            this.f27042marial = "";
        }
    }

    void attabal(decarock.stratoscope stratoscopeVar, int i) throws ParserException;

    void saneness(decarock.kattegat kattegatVar, cybernatic.polloi polloiVar, wireman wiremanVar);

    void seek();
}
