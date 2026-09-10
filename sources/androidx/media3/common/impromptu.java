package androidx.media3.common;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import decarock.grimness;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f10966attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f10967beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f10968competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f10969dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f10970marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f10971saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f10972wireman;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final impromptu f10962impromptu = new saneness().wireman(1).dern(2).marial(3).attabal();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final impromptu f10964taiyuan = new saneness().wireman(1).dern(1).marial(2).attabal();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f10959cutely = grimness.igbo(0);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final String f10958apical = grimness.igbo(1);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final String f10960formularize = grimness.igbo(2);

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final String f10961impassible = grimness.igbo(3);

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final String f10965triweekly = grimness.igbo(4);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final String f10963kowloon = grimness.igbo(5);

    /* JADX INFO: compiled from: ColorInfo.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f10973attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f10974beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f10975dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f10976marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f10977saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public byte[] f10978wireman;

        public impromptu attabal() {
            return new impromptu(this.f10973attabal, this.f10977saneness, this.f10975dern, this.f10978wireman, this.f10976marial, this.f10974beachfront);
        }

        public saneness beachfront(byte[] bArr) {
            this.f10978wireman = bArr;
            return this;
        }

        public saneness competently(int i) {
            this.f10976marial = i;
            return this;
        }

        public saneness dern(int i) {
            this.f10977saneness = i;
            return this;
        }

        public saneness marial(int i) {
            this.f10975dern = i;
            return this;
        }

        public saneness saneness(int i) {
            this.f10974beachfront = i;
            return this;
        }

        public saneness wireman(int i) {
            this.f10973attabal = i;
            return this;
        }

        public saneness() {
            this.f10973attabal = -1;
            this.f10977saneness = -1;
            this.f10975dern = -1;
            this.f10976marial = -1;
            this.f10974beachfront = -1;
        }

        public saneness(impromptu impromptuVar) {
            this.f10973attabal = impromptuVar.f10966attabal;
            this.f10977saneness = impromptuVar.f10971saneness;
            this.f10975dern = impromptuVar.f10969dern;
            this.f10978wireman = impromptuVar.f10972wireman;
            this.f10976marial = impromptuVar.f10970marial;
            this.f10974beachfront = impromptuVar.f10967beachfront;
        }
    }

    @Pure
    public static int apical(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static impromptu beachfront(Bundle bundle) {
        return new impromptu(bundle.getInt(f10959cutely, -1), bundle.getInt(f10958apical, -1), bundle.getInt(f10960formularize, -1), bundle.getByteArray(f10961impassible), bundle.getInt(f10965triweekly, -1), bundle.getInt(f10963kowloon, -1));
    }

    public static String dern(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i;
    }

    @Pure
    public static int formularize(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String impassible(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Luma";
    }

    public static String marial(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i;
    }

    public static String saneness(int i) {
        if (i == -1) {
            return "NA";
        }
        return i + "bit Chroma";
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean taiyuan(impromptu impromptuVar) {
        if (impromptuVar == null) {
            return true;
        }
        int i = impromptuVar.f10966attabal;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = impromptuVar.f10971saneness;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = impromptuVar.f10969dern;
        if ((i3 != -1 && i3 != 3) || impromptuVar.f10972wireman != null) {
            return false;
        }
        int i4 = impromptuVar.f10967beachfront;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = impromptuVar.f10970marial;
        return i5 == -1 || i5 == 8;
    }

    public static String wireman(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space " + i;
    }

    public saneness attabal() {
        return new saneness();
    }

    public boolean competently() {
        return (this.f10970marial == -1 || this.f10967beachfront == -1) ? false : true;
    }

    public boolean cutely() {
        return competently() || impromptu();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && impromptu.class == obj.getClass()) {
            impromptu impromptuVar = (impromptu) obj;
            if (this.f10966attabal == impromptuVar.f10966attabal && this.f10971saneness == impromptuVar.f10971saneness && this.f10969dern == impromptuVar.f10969dern && Arrays.equals(this.f10972wireman, impromptuVar.f10972wireman) && this.f10970marial == impromptuVar.f10970marial && this.f10967beachfront == impromptuVar.f10967beachfront) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f10968competently == 0) {
            this.f10968competently = ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10966attabal) * 31) + this.f10971saneness) * 31) + this.f10969dern) * 31) + Arrays.hashCode(this.f10972wireman)) * 31) + this.f10970marial) * 31) + this.f10967beachfront;
        }
        return this.f10968competently;
    }

    public boolean impromptu() {
        return (this.f10966attabal == -1 || this.f10971saneness == -1 || this.f10969dern == -1) ? false : true;
    }

    public String kowloon() {
        String str;
        String strSealless = impromptu() ? grimness.sealless("%s/%s/%s", wireman(this.f10966attabal), dern(this.f10971saneness), marial(this.f10969dern)) : "NA/NA/NA";
        if (competently()) {
            str = this.f10970marial + "/" + this.f10967beachfront;
        } else {
            str = "NA/NA";
        }
        return strSealless + "/" + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(wireman(this.f10966attabal));
        sb.append(", ");
        sb.append(dern(this.f10971saneness));
        sb.append(", ");
        sb.append(marial(this.f10969dern));
        sb.append(", ");
        sb.append(this.f10972wireman != null);
        sb.append(", ");
        sb.append(impassible(this.f10970marial));
        sb.append(", ");
        sb.append(saneness(this.f10967beachfront));
        sb.append(")");
        return sb.toString();
    }

    public Bundle triweekly() {
        Bundle bundle = new Bundle();
        bundle.putInt(f10959cutely, this.f10966attabal);
        bundle.putInt(f10958apical, this.f10971saneness);
        bundle.putInt(f10960formularize, this.f10969dern);
        bundle.putByteArray(f10961impassible, this.f10972wireman);
        bundle.putInt(f10965triweekly, this.f10970marial);
        bundle.putInt(f10963kowloon, this.f10967beachfront);
        return bundle;
    }

    public impromptu(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f10966attabal = i;
        this.f10971saneness = i2;
        this.f10969dern = i3;
        this.f10972wireman = bArr;
        this.f10970marial = i4;
        this.f10967beachfront = i5;
    }
}
