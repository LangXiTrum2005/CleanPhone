package vir;

import android.net.Uri;
import androidx.media3.common.dovishness;
import com.ironsource.C3460cc;
import com.ironsource.X3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final Object f39543apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Uri f39544attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Deprecated
    public final long f39545beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final long f39546competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int f39547cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f39548dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final long f39549impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Map<String, String> f39550marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f39551saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final String f39552taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f39553wireman;

    /* JADX INFO: compiled from: DataSpec.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Uri f39554attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f39555beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f39556competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public Object f39557cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f39558dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public String f39559impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Map<String, String> f39560marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f39561saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f39562taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public byte[] f39563wireman;

        public saneness apical(long j) {
            this.f39561saneness = j;
            return this;
        }

        public competently attabal() {
            decarock.attabal.cutely(this.f39554attabal, "The uri must be set.");
            return new competently(this.f39554attabal, this.f39561saneness, this.f39558dern, this.f39563wireman, this.f39560marial, this.f39555beachfront, this.f39556competently, this.f39559impromptu, this.f39562taiyuan, this.f39557cutely);
        }

        public saneness beachfront(String str) {
            this.f39559impromptu = str;
            return this;
        }

        public saneness competently(long j) {
            this.f39556competently = j;
            return this;
        }

        public saneness cutely(String str) {
            this.f39554attabal = Uri.parse(str);
            return this;
        }

        public saneness dern(byte[] bArr) {
            this.f39563wireman = bArr;
            return this;
        }

        public saneness impromptu(long j) {
            this.f39555beachfront = j;
            return this;
        }

        public saneness marial(Map<String, String> map) {
            this.f39560marial = map;
            return this;
        }

        public saneness saneness(int i) {
            this.f39562taiyuan = i;
            return this;
        }

        public saneness taiyuan(Uri uri) {
            this.f39554attabal = uri;
            return this;
        }

        public saneness wireman(int i) {
            this.f39558dern = i;
            return this;
        }

        public saneness() {
            this.f39558dern = 1;
            this.f39560marial = Collections.EMPTY_MAP;
            this.f39556competently = -1L;
        }

        public saneness(competently competentlyVar) {
            this.f39554attabal = competentlyVar.f39544attabal;
            this.f39561saneness = competentlyVar.f39551saneness;
            this.f39558dern = competentlyVar.f39548dern;
            this.f39563wireman = competentlyVar.f39553wireman;
            this.f39560marial = competentlyVar.f39550marial;
            this.f39555beachfront = competentlyVar.f39546competently;
            this.f39556competently = competentlyVar.f39549impromptu;
            this.f39559impromptu = competentlyVar.f39552taiyuan;
            this.f39562taiyuan = competentlyVar.f39547cutely;
            this.f39557cutely = competentlyVar.f39543apical;
        }
    }

    static {
        dovishness.attabal("media3.datasource");
    }

    public static String dern(int i) {
        if (i == 1) {
            return C3460cc.a;
        }
        if (i == 2) {
            return C3460cc.b;
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public saneness attabal() {
        return new saneness();
    }

    public competently marial(long j, long j2) {
        return (j == 0 && this.f39549impromptu == j2) ? this : new competently(this.f39544attabal, this.f39551saneness, this.f39548dern, this.f39553wireman, this.f39550marial, this.f39546competently + j, j2, this.f39552taiyuan, this.f39547cutely, this.f39543apical);
    }

    public final String saneness() {
        return dern(this.f39548dern);
    }

    public String toString() {
        return "DataSpec[" + saneness() + " " + this.f39544attabal + ", " + this.f39546competently + ", " + this.f39549impromptu + ", " + this.f39552taiyuan + ", " + this.f39547cutely + X3.j.e;
    }

    public boolean wireman(int i) {
        return (this.f39547cutely & i) == i;
    }

    public competently(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        decarock.attabal.attabal(j4 >= 0);
        decarock.attabal.attabal(j2 >= 0);
        decarock.attabal.attabal(j3 > 0 || j3 == -1);
        this.f39544attabal = (Uri) decarock.attabal.marial(uri);
        this.f39551saneness = j;
        this.f39548dern = i;
        this.f39553wireman = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f39550marial = Collections.unmodifiableMap(new HashMap(map));
        this.f39546competently = j2;
        this.f39545beachfront = j4;
        this.f39549impromptu = j3;
        this.f39552taiyuan = str;
        this.f39547cutely = i2;
        this.f39543apical = obj;
    }
}
