package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import decarock.grimness;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes.dex */
public final class adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f10613attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final wireman f10614beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    @Deprecated
    public final marial f10615competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Deprecated
    public final impromptu f10616dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final taiyuan f10617impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final gintrap f10618marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final impromptu f10619saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final competently f10620wireman;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final adultoid f10611taiyuan = new dern().attabal();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f10607cutely = grimness.igbo(0);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final String f10606apical = grimness.igbo(1);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final String f10608formularize = grimness.igbo(2);

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final String f10609impassible = grimness.igbo(3);

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final String f10612triweekly = grimness.igbo(4);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final String f10610kowloon = grimness.igbo(5);

    /* JADX INFO: compiled from: MediaItem.java */
    public static class apical {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Uri f10628attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final String f10629beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final String f10630competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String f10631dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f10632marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f10633saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f10634wireman;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final String f10625impromptu = grimness.igbo(0);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final String f10626taiyuan = grimness.igbo(1);

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final String f10622cutely = grimness.igbo(2);

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static final String f10621apical = grimness.igbo(3);

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static final String f10623formularize = grimness.igbo(4);

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static final String f10624impassible = grimness.igbo(5);

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public static final String f10627triweekly = grimness.igbo(6);

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public Uri f10635attabal;

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public String f10636beachfront;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public String f10637competently;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public String f10638dern;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public int f10639marial;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public String f10640saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public int f10641wireman;

            public final cutely taiyuan() {
                return new cutely(this);
            }

            public attabal(apical apicalVar) {
                this.f10635attabal = apicalVar.f10628attabal;
                this.f10640saneness = apicalVar.f10633saneness;
                this.f10638dern = apicalVar.f10631dern;
                this.f10641wireman = apicalVar.f10634wireman;
                this.f10639marial = apicalVar.f10632marial;
                this.f10636beachfront = apicalVar.f10629beachfront;
                this.f10637competently = apicalVar.f10630competently;
            }
        }

        public attabal attabal() {
            return new attabal();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof apical)) {
                return false;
            }
            apical apicalVar = (apical) obj;
            return this.f10628attabal.equals(apicalVar.f10628attabal) && grimness.dern(this.f10633saneness, apicalVar.f10633saneness) && grimness.dern(this.f10631dern, apicalVar.f10631dern) && this.f10634wireman == apicalVar.f10634wireman && this.f10632marial == apicalVar.f10632marial && grimness.dern(this.f10629beachfront, apicalVar.f10629beachfront) && grimness.dern(this.f10630competently, apicalVar.f10630competently);
        }

        public int hashCode() {
            int iHashCode = this.f10628attabal.hashCode() * 31;
            String str = this.f10633saneness;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10631dern;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f10634wireman) * 31) + this.f10632marial) * 31;
            String str3 = this.f10629beachfront;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f10630competently;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public apical(attabal attabalVar) {
            this.f10628attabal = attabalVar.f10635attabal;
            this.f10633saneness = attabalVar.f10640saneness;
            this.f10631dern = attabalVar.f10638dern;
            this.f10634wireman = attabalVar.f10641wireman;
            this.f10632marial = attabalVar.f10639marial;
            this.f10629beachfront = attabalVar.f10636beachfront;
            this.f10630competently = attabalVar.f10637competently;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class beachfront {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final byte[] f10650apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final UUID f10651attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final boolean f10652beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final boolean f10653competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final ImmutableList<Integer> f10654cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Uri f10655dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final boolean f10656impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final ImmutableMap<String, String> f10657marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Deprecated
        public final UUID f10658saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        @Deprecated
        public final ImmutableList<Integer> f10659taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Deprecated
        public final ImmutableMap<String, String> f10660wireman;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static final String f10643formularize = grimness.igbo(0);

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static final String f10644impassible = grimness.igbo(1);

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public static final String f10649triweekly = grimness.igbo(2);

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final String f10645kowloon = grimness.igbo(3);

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final String f10642arytenoidectomy = grimness.igbo(4);

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final String f10647monoploid = grimness.igbo(5);

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public static final String f10648polloi = grimness.igbo(6);

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public static final String f10646molybdenite = grimness.igbo(7);

        public byte[] dern() {
            byte[] bArr = this.f10650apical;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof beachfront)) {
                return false;
            }
            beachfront beachfrontVar = (beachfront) obj;
            return this.f10651attabal.equals(beachfrontVar.f10651attabal) && grimness.dern(this.f10655dern, beachfrontVar.f10655dern) && grimness.dern(this.f10657marial, beachfrontVar.f10657marial) && this.f10652beachfront == beachfrontVar.f10652beachfront && this.f10656impromptu == beachfrontVar.f10656impromptu && this.f10653competently == beachfrontVar.f10653competently && this.f10654cutely.equals(beachfrontVar.f10654cutely) && Arrays.equals(this.f10650apical, beachfrontVar.f10650apical);
        }

        public int hashCode() {
            int iHashCode = this.f10651attabal.hashCode() * 31;
            Uri uri = this.f10655dern;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f10657marial.hashCode()) * 31) + (this.f10652beachfront ? 1 : 0)) * 31) + (this.f10656impromptu ? 1 : 0)) * 31) + (this.f10653competently ? 1 : 0)) * 31) + this.f10654cutely.hashCode()) * 31) + Arrays.hashCode(this.f10650apical);
        }

        public attabal saneness() {
            return new attabal();
        }

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public UUID f10661attabal;

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public boolean f10662beachfront;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public ImmutableList<Integer> f10663competently;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public ImmutableMap<String, String> f10664dern;

            /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
            public byte[] f10665impromptu;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public boolean f10666marial;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public Uri f10667saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public boolean f10668wireman;

            public beachfront taiyuan() {
                return new beachfront(this);
            }

            @Deprecated
            public attabal() {
                this.f10664dern = ImmutableMap.of();
                this.f10666marial = true;
                this.f10663competently = ImmutableList.of();
            }

            public attabal(beachfront beachfrontVar) {
                this.f10661attabal = beachfrontVar.f10651attabal;
                this.f10667saneness = beachfrontVar.f10655dern;
                this.f10664dern = beachfrontVar.f10657marial;
                this.f10668wireman = beachfrontVar.f10652beachfront;
                this.f10666marial = beachfrontVar.f10653competently;
                this.f10662beachfront = beachfrontVar.f10656impromptu;
                this.f10663competently = beachfrontVar.f10654cutely;
                this.f10665impromptu = beachfrontVar.f10650apical;
            }
        }

        public beachfront(attabal attabalVar) {
            decarock.attabal.competently((attabalVar.f10662beachfront && attabalVar.f10667saneness == null) ? false : true);
            UUID uuid = (UUID) decarock.attabal.marial(attabalVar.f10661attabal);
            this.f10651attabal = uuid;
            this.f10658saneness = uuid;
            this.f10655dern = attabalVar.f10667saneness;
            this.f10660wireman = attabalVar.f10664dern;
            this.f10657marial = attabalVar.f10664dern;
            this.f10652beachfront = attabalVar.f10668wireman;
            this.f10656impromptu = attabalVar.f10662beachfront;
            this.f10653competently = attabalVar.f10666marial;
            this.f10659taiyuan = attabalVar.f10663competently;
            this.f10654cutely = attabalVar.f10663competently;
            this.f10650apical = attabalVar.f10665impromptu != null ? Arrays.copyOf(attabalVar.f10665impromptu, attabalVar.f10665impromptu.length) : null;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f10675attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f10676dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final float f10677marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f10678saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final float f10679wireman;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final competently f10670beachfront = new attabal().beachfront();

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final String f10671competently = grimness.igbo(0);

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final String f10673impromptu = grimness.igbo(1);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final String f10674taiyuan = grimness.igbo(2);

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final String f10672cutely = grimness.igbo(3);

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static final String f10669apical = grimness.igbo(4);

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public long f10680attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public long f10681dern;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public float f10682marial;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public long f10683saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public float f10684wireman;

            public attabal apical(long j) {
                this.f10680attabal = j;
                return this;
            }

            public competently beachfront() {
                return new competently(this);
            }

            public attabal competently(long j) {
                this.f10681dern = j;
                return this;
            }

            public attabal cutely(float f) {
                this.f10684wireman = f;
                return this;
            }

            public attabal impromptu(float f) {
                this.f10682marial = f;
                return this;
            }

            public attabal taiyuan(long j) {
                this.f10683saneness = j;
                return this;
            }

            public attabal() {
                this.f10680attabal = C.TIME_UNSET;
                this.f10683saneness = C.TIME_UNSET;
                this.f10681dern = C.TIME_UNSET;
                this.f10684wireman = -3.4028235E38f;
                this.f10682marial = -3.4028235E38f;
            }

            public attabal(competently competentlyVar) {
                this.f10680attabal = competentlyVar.f10675attabal;
                this.f10683saneness = competentlyVar.f10678saneness;
                this.f10681dern = competentlyVar.f10676dern;
                this.f10684wireman = competentlyVar.f10679wireman;
                this.f10682marial = competentlyVar.f10677marial;
            }
        }

        public attabal attabal() {
            return new attabal();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof competently)) {
                return false;
            }
            competently competentlyVar = (competently) obj;
            return this.f10675attabal == competentlyVar.f10675attabal && this.f10678saneness == competentlyVar.f10678saneness && this.f10676dern == competentlyVar.f10676dern && this.f10679wireman == competentlyVar.f10679wireman && this.f10677marial == competentlyVar.f10677marial;
        }

        public int hashCode() {
            long j = this.f10675attabal;
            long j2 = this.f10678saneness;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f10676dern;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f10679wireman;
            int iFloatToIntBits = (i2 + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f10677marial;
            return iFloatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0);
        }

        public competently(attabal attabalVar) {
            this(attabalVar.f10680attabal, attabalVar.f10683saneness, attabalVar.f10681dern, attabalVar.f10684wireman, attabalVar.f10682marial);
        }

        @Deprecated
        public competently(long j, long j2, long j3, float f, float f2) {
            this.f10675attabal = j;
            this.f10678saneness = j2;
            this.f10676dern = j3;
            this.f10679wireman = f;
            this.f10677marial = f2;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class cutely extends apical {
        public cutely(apical.attabal attabalVar) {
            super(attabalVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class dern {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public gintrap f10685apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f10686attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public List<StreamKey> f10687beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public String f10688competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public long f10689cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f10690dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public competently.attabal f10691formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public taiyuan f10692impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public ImmutableList<apical> f10693impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public beachfront.attabal f10694marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Uri f10695saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public Object f10696taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public wireman.attabal f10697wireman;

        public adultoid attabal() {
            impromptu impromptuVar;
            decarock.attabal.competently(this.f10694marial.f10667saneness == null || this.f10694marial.f10661attabal != null);
            Uri uri = this.f10695saneness;
            if (uri != null) {
                impromptuVar = new impromptu(uri, this.f10690dern, this.f10694marial.f10661attabal != null ? this.f10694marial.taiyuan() : null, null, this.f10687beachfront, this.f10688competently, this.f10693impromptu, this.f10696taiyuan, this.f10689cutely);
            } else {
                impromptuVar = null;
            }
            String str = this.f10686attabal;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            marial marialVarCompetently = this.f10697wireman.competently();
            competently competentlyVarBeachfront = this.f10691formularize.beachfront();
            gintrap gintrapVar = this.f10685apical;
            if (gintrapVar == null) {
                gintrapVar = gintrap.f10885supplicat;
            }
            return new adultoid(str2, marialVarCompetently, impromptuVar, competentlyVarBeachfront, gintrapVar, this.f10692impassible);
        }

        public dern beachfront(Object obj) {
            this.f10696taiyuan = obj;
            return this;
        }

        public dern competently(Uri uri) {
            this.f10695saneness = uri;
            return this;
        }

        public dern dern(competently competentlyVar) {
            this.f10691formularize = competentlyVar.attabal();
            return this;
        }

        public dern impromptu(String str) {
            return competently(str == null ? null : Uri.parse(str));
        }

        public dern marial(List<apical> list) {
            this.f10693impromptu = ImmutableList.copyOf((Collection) list);
            return this;
        }

        public dern saneness(String str) {
            this.f10688competently = str;
            return this;
        }

        public dern wireman(String str) {
            this.f10686attabal = (String) decarock.attabal.marial(str);
            return this;
        }

        public dern() {
            this.f10697wireman = new wireman.attabal();
            this.f10694marial = new beachfront.attabal();
            this.f10687beachfront = Collections.EMPTY_LIST;
            this.f10693impromptu = ImmutableList.of();
            this.f10691formularize = new competently.attabal();
            this.f10692impassible = taiyuan.f10719wireman;
            this.f10689cutely = C.TIME_UNSET;
        }

        public dern(adultoid adultoidVar) {
            beachfront.attabal attabalVar;
            this();
            this.f10697wireman = adultoidVar.f10614beachfront.attabal();
            this.f10686attabal = adultoidVar.f10613attabal;
            this.f10685apical = adultoidVar.f10618marial;
            this.f10691formularize = adultoidVar.f10620wireman.attabal();
            this.f10692impassible = adultoidVar.f10617impromptu;
            impromptu impromptuVar = adultoidVar.f10619saneness;
            if (impromptuVar != null) {
                this.f10688competently = impromptuVar.f10711marial;
                this.f10690dern = impromptuVar.f10712saneness;
                this.f10695saneness = impromptuVar.f10706attabal;
                this.f10687beachfront = impromptuVar.f10714wireman;
                this.f10693impromptu = impromptuVar.f10707beachfront;
                this.f10696taiyuan = impromptuVar.f10710impromptu;
                beachfront beachfrontVar = impromptuVar.f10709dern;
                if (beachfrontVar != null) {
                    attabalVar = beachfrontVar.saneness();
                } else {
                    attabalVar = new beachfront.attabal();
                }
                this.f10694marial = attabalVar;
                this.f10689cutely = impromptuVar.f10713taiyuan;
            }
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Uri f10706attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final ImmutableList<apical> f10707beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        @Deprecated
        public final List<cutely> f10708competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final beachfront f10709dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final Object f10710impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final String f10711marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f10712saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final long f10713taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<StreamKey> f10714wireman;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final String f10700cutely = grimness.igbo(0);

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static final String f10698apical = grimness.igbo(1);

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static final String f10701formularize = grimness.igbo(2);

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static final String f10702impassible = grimness.igbo(3);

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public static final String f10705triweekly = grimness.igbo(4);

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final String f10703kowloon = grimness.igbo(5);

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final String f10699arytenoidectomy = grimness.igbo(6);

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final String f10704monoploid = grimness.igbo(7);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof impromptu)) {
                return false;
            }
            impromptu impromptuVar = (impromptu) obj;
            return this.f10706attabal.equals(impromptuVar.f10706attabal) && grimness.dern(this.f10712saneness, impromptuVar.f10712saneness) && grimness.dern(this.f10709dern, impromptuVar.f10709dern) && grimness.dern(null, null) && this.f10714wireman.equals(impromptuVar.f10714wireman) && grimness.dern(this.f10711marial, impromptuVar.f10711marial) && this.f10707beachfront.equals(impromptuVar.f10707beachfront) && grimness.dern(this.f10710impromptu, impromptuVar.f10710impromptu) && grimness.dern(Long.valueOf(this.f10713taiyuan), Long.valueOf(impromptuVar.f10713taiyuan));
        }

        public int hashCode() {
            int iHashCode = this.f10706attabal.hashCode() * 31;
            String str = this.f10712saneness;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            beachfront beachfrontVar = this.f10709dern;
            int iHashCode3 = (((iHashCode2 + (beachfrontVar == null ? 0 : beachfrontVar.hashCode())) * 961) + this.f10714wireman.hashCode()) * 31;
            String str2 = this.f10711marial;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f10707beachfront.hashCode()) * 31;
            Object obj = this.f10710impromptu;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f10713taiyuan);
        }

        public impromptu(Uri uri, String str, beachfront beachfrontVar, saneness sanenessVar, List<StreamKey> list, String str2, ImmutableList<apical> immutableList, Object obj, long j) {
            this.f10706attabal = uri;
            this.f10712saneness = rotuma.formularize(str);
            this.f10709dern = beachfrontVar;
            this.f10714wireman = list;
            this.f10711marial = str2;
            this.f10707beachfront = immutableList;
            ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                attabalVarBuilder.attabal(immutableList.get(i).attabal().taiyuan());
            }
            this.f10708competently = attabalVarBuilder.impassible();
            this.f10710impromptu = obj;
            this.f10713taiyuan = j;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class marial extends wireman {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final marial f10715arytenoidectomy = new wireman.attabal().competently();

        public marial(wireman.attabal attabalVar) {
            super(attabalVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class saneness {
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Uri f10720attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Bundle f10721dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f10722saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final taiyuan f10719wireman = new attabal().wireman();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final String f10718marial = grimness.igbo(0);

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final String f10716beachfront = grimness.igbo(1);

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final String f10717competently = grimness.igbo(2);

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public Uri f10723attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public Bundle f10724dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public String f10725saneness;

            public taiyuan wireman() {
                return new taiyuan(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof taiyuan)) {
                return false;
            }
            taiyuan taiyuanVar = (taiyuan) obj;
            if (grimness.dern(this.f10720attabal, taiyuanVar.f10720attabal) && grimness.dern(this.f10722saneness, taiyuanVar.f10722saneness)) {
                if ((this.f10721dern == null) == (taiyuanVar.f10721dern == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f10720attabal;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f10722saneness;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f10721dern != null ? 1 : 0);
        }

        public taiyuan(attabal attabalVar) {
            this.f10720attabal = attabalVar.f10723attabal;
            this.f10722saneness = attabalVar.f10725saneness;
            this.f10721dern = attabalVar.f10724dern;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f10734attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final boolean f10735beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final boolean f10736competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f10737dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean f10738marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f10739saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f10740wireman;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final wireman f10730impromptu = new attabal().beachfront();

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final String f10732taiyuan = grimness.igbo(0);

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final String f10727cutely = grimness.igbo(1);

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static final String f10726apical = grimness.igbo(2);

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static final String f10728formularize = grimness.igbo(3);

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static final String f10729impassible = grimness.igbo(4);

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public static final String f10733triweekly = grimness.igbo(5);

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final String f10731kowloon = grimness.igbo(6);

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public long f10741attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public boolean f10742dern;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public boolean f10743marial;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public long f10744saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public boolean f10745wireman;

            public wireman beachfront() {
                return new wireman(this);
            }

            @Deprecated
            public marial competently() {
                return new marial(this);
            }

            public attabal() {
                this.f10744saneness = Long.MIN_VALUE;
            }

            public attabal(wireman wiremanVar) {
                this.f10741attabal = wiremanVar.f10739saneness;
                this.f10744saneness = wiremanVar.f10740wireman;
                this.f10742dern = wiremanVar.f10738marial;
                this.f10745wireman = wiremanVar.f10735beachfront;
                this.f10743marial = wiremanVar.f10736competently;
            }
        }

        public attabal attabal() {
            return new attabal();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wireman)) {
                return false;
            }
            wireman wiremanVar = (wireman) obj;
            return this.f10739saneness == wiremanVar.f10739saneness && this.f10740wireman == wiremanVar.f10740wireman && this.f10738marial == wiremanVar.f10738marial && this.f10735beachfront == wiremanVar.f10735beachfront && this.f10736competently == wiremanVar.f10736competently;
        }

        public int hashCode() {
            long j = this.f10739saneness;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f10740wireman;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f10738marial ? 1 : 0)) * 31) + (this.f10735beachfront ? 1 : 0)) * 31) + (this.f10736competently ? 1 : 0);
        }

        public wireman(attabal attabalVar) {
            this.f10734attabal = grimness.sultanate(attabalVar.f10741attabal);
            this.f10737dern = grimness.sultanate(attabalVar.f10744saneness);
            this.f10739saneness = attabalVar.f10741attabal;
            this.f10740wireman = attabalVar.f10744saneness;
            this.f10738marial = attabalVar.f10742dern;
            this.f10735beachfront = attabalVar.f10745wireman;
            this.f10736competently = attabalVar.f10743marial;
        }
    }

    public static adultoid saneness(String str) {
        return new dern().impromptu(str).attabal();
    }

    public dern attabal() {
        return new dern();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adultoid)) {
            return false;
        }
        adultoid adultoidVar = (adultoid) obj;
        return grimness.dern(this.f10613attabal, adultoidVar.f10613attabal) && this.f10614beachfront.equals(adultoidVar.f10614beachfront) && grimness.dern(this.f10619saneness, adultoidVar.f10619saneness) && grimness.dern(this.f10620wireman, adultoidVar.f10620wireman) && grimness.dern(this.f10618marial, adultoidVar.f10618marial) && grimness.dern(this.f10617impromptu, adultoidVar.f10617impromptu);
    }

    public int hashCode() {
        int iHashCode = this.f10613attabal.hashCode() * 31;
        impromptu impromptuVar = this.f10619saneness;
        return ((((((((iHashCode + (impromptuVar != null ? impromptuVar.hashCode() : 0)) * 31) + this.f10620wireman.hashCode()) * 31) + this.f10614beachfront.hashCode()) * 31) + this.f10618marial.hashCode()) * 31) + this.f10617impromptu.hashCode();
    }

    public adultoid(String str, marial marialVar, impromptu impromptuVar, competently competentlyVar, gintrap gintrapVar, taiyuan taiyuanVar) {
        this.f10613attabal = str;
        this.f10619saneness = impromptuVar;
        this.f10616dern = impromptuVar;
        this.f10620wireman = competentlyVar;
        this.f10618marial = gintrapVar;
        this.f10614beachfront = marialVar;
        this.f10615competently = marialVar;
        this.f10617impromptu = taiyuanVar;
    }
}
