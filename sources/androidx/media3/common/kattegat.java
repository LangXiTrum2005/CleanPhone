package androidx.media3.common;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import decarock.grimness;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: TrackSelectionParameters.java */
/* JADX INFO: loaded from: classes.dex */
public class kattegat {

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public static final String f10979clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public static final String f10980coffeecake;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public static final String f10981creditor;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public static final String f10982cultivated;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public static final String f10983dent;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public static final String f10984grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public static final String f10985hydrovane;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public static final String f10986itchy;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final String f10987kattegat;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public static final String f10988lerp;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public static final String f10989mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final String f10990merc;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public static final String f10991milliradian;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public static final String f10992nosophobia;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    @Deprecated
    public static final kattegat f10993oilcan;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public static final String f10994overspeculate;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public static final String f10995peridotite;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public static final String f10996permissivist;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final String f10997polder;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public static final String f10998premeiotic;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public static final String f10999privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public static final String f11000restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public static final String f11001saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final String f11002sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final String f11003seminary;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public static final String f11004splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public static final String f11005starveling;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static final String f11006supplicat;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public static final String f11007timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public static final String f11008treadless;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final kattegat f11009trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public static final String f11010walach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final String f11011yemenite;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final int f11012adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final boolean f11013apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f11014arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11015attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f11016beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f11017competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final boolean f11018cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final ImmutableMap<yemenite, sealless> f11019cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int f11020cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11021dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final int f11022dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final ImmutableList<String> f11023formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final boolean f11024gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final ImmutableList<String> f11025graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final int f11026impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f11027impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f11028kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f11029marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final saneness f11030molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f11031monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final ImmutableList<String> f11032polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final boolean f11033preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final boolean f11034rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f11035saneness;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final ImmutableSet<Integer> f11036stratoscope;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f11037taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final ImmutableList<String> f11038triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f11039wireman;

    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f11072attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f11073dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f11074saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final saneness f11071wireman = new attabal().wireman();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final String f11070marial = grimness.igbo(1);

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final String f11068beachfront = grimness.igbo(2);

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final String f11069competently = grimness.igbo(3);

        /* JADX INFO: compiled from: TrackSelectionParameters.java */
        public static final class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public int f11075attabal = 0;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public boolean f11077saneness = false;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public boolean f11076dern = false;

            public saneness wireman() {
                return new saneness(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && saneness.class == obj.getClass()) {
                saneness sanenessVar = (saneness) obj;
                if (this.f11072attabal == sanenessVar.f11072attabal && this.f11074saneness == sanenessVar.f11074saneness && this.f11073dern == sanenessVar.f11073dern) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f11072attabal + 31) * 31) + (this.f11074saneness ? 1 : 0)) * 31) + (this.f11073dern ? 1 : 0);
        }

        public saneness(attabal attabalVar) {
            this.f11072attabal = attabalVar.f11075attabal;
            this.f11074saneness = attabalVar.f11077saneness;
            this.f11073dern = attabalVar.f11076dern;
        }
    }

    static {
        kattegat kattegatVarTrm = new dern().trm();
        f11009trm = kattegatVarTrm;
        f10993oilcan = kattegatVarTrm;
        f11011yemenite = grimness.igbo(1);
        f11002sealless = grimness.igbo(2);
        f10987kattegat = grimness.igbo(3);
        f11006supplicat = grimness.igbo(4);
        f11000restrictive = grimness.igbo(5);
        f10990merc = grimness.igbo(6);
        f10997polder = grimness.igbo(7);
        f11003seminary = grimness.igbo(8);
        f10984grimness = grimness.igbo(9);
        f11001saran = grimness.igbo(10);
        f10999privatdozent = grimness.igbo(11);
        f10981creditor = grimness.igbo(12);
        f11005starveling = grimness.igbo(13);
        f10985hydrovane = grimness.igbo(14);
        f11010walach = grimness.igbo(15);
        f10995peridotite = grimness.igbo(16);
        f10989mathsort = grimness.igbo(17);
        f11004splinterproof = grimness.igbo(18);
        f10994overspeculate = grimness.igbo(19);
        f10979clubfoot = grimness.igbo(20);
        f10983dent = grimness.igbo(21);
        f10996permissivist = grimness.igbo(22);
        f10982cultivated = grimness.igbo(23);
        f10998premeiotic = grimness.igbo(24);
        f11007timberyard = grimness.igbo(25);
        f10991milliradian = grimness.igbo(26);
        f11008treadless = grimness.igbo(27);
        f10986itchy = grimness.igbo(28);
        f10980coffeecake = grimness.igbo(29);
        f10988lerp = grimness.igbo(30);
        f10992nosophobia = grimness.igbo(31);
    }

    public kattegat(dern dernVar) {
        this.f11015attabal = dernVar.f11043attabal;
        this.f11035saneness = dernVar.f11063saneness;
        this.f11021dern = dernVar.f11049dern;
        this.f11039wireman = dernVar.f11067wireman;
        this.f11029marial = dernVar.f11057marial;
        this.f11016beachfront = dernVar.f11044beachfront;
        this.f11017competently = dernVar.f11045competently;
        this.f11027impromptu = dernVar.f11055impromptu;
        this.f11037taiyuan = dernVar.f11065taiyuan;
        this.f11020cutely = dernVar.f11048cutely;
        this.f11013apical = dernVar.f11041apical;
        this.f11023formularize = dernVar.f11051formularize;
        this.f11026impassible = dernVar.f11054impassible;
        this.f11038triweekly = dernVar.f11066triweekly;
        this.f11028kowloon = dernVar.f11056kowloon;
        this.f11014arytenoidectomy = dernVar.f11042arytenoidectomy;
        this.f11031monoploid = dernVar.f11059monoploid;
        this.f11032polloi = dernVar.f11060polloi;
        this.f11030molybdenite = dernVar.f11058molybdenite;
        this.f11025graveside = dernVar.f11053graveside;
        this.f11012adultoid = dernVar.f11040adultoid;
        this.f11022dovishness = dernVar.f11050dovishness;
        this.f11024gintrap = dernVar.f11052gintrap;
        this.f11034rotuma = dernVar.f11062rotuma;
        this.f11033preprohormone = dernVar.f11061preprohormone;
        this.f11018cord = dernVar.f11046cord;
        this.f11019cuirassed = ImmutableMap.copyOf((Map) dernVar.f11047cuirassed);
        this.f11036stratoscope = ImmutableSet.copyOf((Collection) dernVar.f11064stratoscope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kattegat kattegatVar = (kattegat) obj;
            if (this.f11015attabal == kattegatVar.f11015attabal && this.f11035saneness == kattegatVar.f11035saneness && this.f11021dern == kattegatVar.f11021dern && this.f11039wireman == kattegatVar.f11039wireman && this.f11029marial == kattegatVar.f11029marial && this.f11016beachfront == kattegatVar.f11016beachfront && this.f11017competently == kattegatVar.f11017competently && this.f11027impromptu == kattegatVar.f11027impromptu && this.f11013apical == kattegatVar.f11013apical && this.f11037taiyuan == kattegatVar.f11037taiyuan && this.f11020cutely == kattegatVar.f11020cutely && this.f11023formularize.equals(kattegatVar.f11023formularize) && this.f11026impassible == kattegatVar.f11026impassible && this.f11038triweekly.equals(kattegatVar.f11038triweekly) && this.f11028kowloon == kattegatVar.f11028kowloon && this.f11014arytenoidectomy == kattegatVar.f11014arytenoidectomy && this.f11031monoploid == kattegatVar.f11031monoploid && this.f11032polloi.equals(kattegatVar.f11032polloi) && this.f11030molybdenite.equals(kattegatVar.f11030molybdenite) && this.f11025graveside.equals(kattegatVar.f11025graveside) && this.f11012adultoid == kattegatVar.f11012adultoid && this.f11022dovishness == kattegatVar.f11022dovishness && this.f11024gintrap == kattegatVar.f11024gintrap && this.f11034rotuma == kattegatVar.f11034rotuma && this.f11033preprohormone == kattegatVar.f11033preprohormone && this.f11018cord == kattegatVar.f11018cord && this.f11019cuirassed.equals(kattegatVar.f11019cuirassed) && this.f11036stratoscope.equals(kattegatVar.f11036stratoscope)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f11015attabal + 31) * 31) + this.f11035saneness) * 31) + this.f11021dern) * 31) + this.f11039wireman) * 31) + this.f11029marial) * 31) + this.f11016beachfront) * 31) + this.f11017competently) * 31) + this.f11027impromptu) * 31) + (this.f11013apical ? 1 : 0)) * 31) + this.f11037taiyuan) * 31) + this.f11020cutely) * 31) + this.f11023formularize.hashCode()) * 31) + this.f11026impassible) * 31) + this.f11038triweekly.hashCode()) * 31) + this.f11028kowloon) * 31) + this.f11014arytenoidectomy) * 31) + this.f11031monoploid) * 31) + this.f11032polloi.hashCode()) * 31) + this.f11030molybdenite.hashCode()) * 31) + this.f11025graveside.hashCode()) * 31) + this.f11012adultoid) * 31) + this.f11022dovishness) * 31) + (this.f11024gintrap ? 1 : 0)) * 31) + (this.f11034rotuma ? 1 : 0)) * 31) + (this.f11033preprohormone ? 1 : 0)) * 31) + (this.f11018cord ? 1 : 0)) * 31) + this.f11019cuirassed.hashCode()) * 31) + this.f11036stratoscope.hashCode();
    }

    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static class dern {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f11040adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public boolean f11041apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f11042arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f11043attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f11044beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f11045competently;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public boolean f11046cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public HashMap<yemenite, sealless> f11047cuirassed;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f11048cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f11049dern;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public int f11050dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public ImmutableList<String> f11051formularize;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public boolean f11052gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public ImmutableList<String> f11053graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f11054impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f11055impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f11056kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f11057marial;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public saneness f11058molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f11059monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public ImmutableList<String> f11060polloi;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public boolean f11061preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public boolean f11062rotuma;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f11063saneness;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public HashSet<Integer> f11064stratoscope;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f11065taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public ImmutableList<String> f11066triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f11067wireman;

        @Deprecated
        public dern() {
            this.f11043attabal = Integer.MAX_VALUE;
            this.f11063saneness = Integer.MAX_VALUE;
            this.f11049dern = Integer.MAX_VALUE;
            this.f11067wireman = Integer.MAX_VALUE;
            this.f11065taiyuan = Integer.MAX_VALUE;
            this.f11048cutely = Integer.MAX_VALUE;
            this.f11041apical = true;
            this.f11051formularize = ImmutableList.of();
            this.f11054impassible = 0;
            this.f11066triweekly = ImmutableList.of();
            this.f11056kowloon = 0;
            this.f11042arytenoidectomy = Integer.MAX_VALUE;
            this.f11059monoploid = Integer.MAX_VALUE;
            this.f11060polloi = ImmutableList.of();
            this.f11058molybdenite = saneness.f11071wireman;
            this.f11053graveside = ImmutableList.of();
            this.f11040adultoid = 0;
            this.f11050dovishness = 0;
            this.f11052gintrap = false;
            this.f11062rotuma = false;
            this.f11061preprohormone = false;
            this.f11046cord = false;
            this.f11047cuirassed = new HashMap<>();
            this.f11064stratoscope = new HashSet<>();
        }

        public dern kattegat(int i, int i2, boolean z) {
            this.f11065taiyuan = i;
            this.f11048cutely = i2;
            this.f11041apical = z;
            return this;
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        public final void oilcan(kattegat kattegatVar) {
            this.f11043attabal = kattegatVar.f11015attabal;
            this.f11063saneness = kattegatVar.f11035saneness;
            this.f11049dern = kattegatVar.f11021dern;
            this.f11067wireman = kattegatVar.f11039wireman;
            this.f11057marial = kattegatVar.f11029marial;
            this.f11044beachfront = kattegatVar.f11016beachfront;
            this.f11045competently = kattegatVar.f11017competently;
            this.f11055impromptu = kattegatVar.f11027impromptu;
            this.f11065taiyuan = kattegatVar.f11037taiyuan;
            this.f11048cutely = kattegatVar.f11020cutely;
            this.f11041apical = kattegatVar.f11013apical;
            this.f11051formularize = kattegatVar.f11023formularize;
            this.f11054impassible = kattegatVar.f11026impassible;
            this.f11066triweekly = kattegatVar.f11038triweekly;
            this.f11056kowloon = kattegatVar.f11028kowloon;
            this.f11042arytenoidectomy = kattegatVar.f11014arytenoidectomy;
            this.f11059monoploid = kattegatVar.f11031monoploid;
            this.f11060polloi = kattegatVar.f11032polloi;
            this.f11058molybdenite = kattegatVar.f11030molybdenite;
            this.f11053graveside = kattegatVar.f11025graveside;
            this.f11040adultoid = kattegatVar.f11012adultoid;
            this.f11050dovishness = kattegatVar.f11022dovishness;
            this.f11052gintrap = kattegatVar.f11024gintrap;
            this.f11062rotuma = kattegatVar.f11034rotuma;
            this.f11061preprohormone = kattegatVar.f11033preprohormone;
            this.f11046cord = kattegatVar.f11018cord;
            this.f11064stratoscope = new HashSet<>(kattegatVar.f11036stratoscope);
            this.f11047cuirassed = new HashMap<>(kattegatVar.f11019cuirassed);
        }

        public dern sealless(Context context) {
            CaptioningManager captioningManager;
            if ((grimness.f25080attabal >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f11040adultoid = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f11053graveside = ImmutableList.of(grimness.overspeculate(locale));
                }
            }
            return this;
        }

        public dern supplicat(Context context, boolean z) {
            Point pointCreditor = grimness.creditor(context);
            return kattegat(pointCreditor.x, pointCreditor.y, z);
        }

        public kattegat trm() {
            return new kattegat(this);
        }

        public dern yemenite(kattegat kattegatVar) {
            oilcan(kattegatVar);
            return this;
        }

        public dern(Context context) {
            this();
            sealless(context);
            supplicat(context, true);
        }

        public dern(kattegat kattegatVar) {
            oilcan(kattegatVar);
        }
    }
}
