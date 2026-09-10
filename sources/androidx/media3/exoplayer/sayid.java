package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import incorrectly.ctenidium;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class sayid implements Handler.Callback, androidx.media3.exoplayer.source.apical.attabal, hydromechanics.trm.attabal, vesuvio.wireman, molybdenite.attabal, mastfed.attabal {

    /* JADX INFO: renamed from: empress, reason: collision with root package name */
    public static final long f12315empress = decarock.grimness.sultanate(Ua.s);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final polyfoil.wireman f12316adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Set<homozygous> f12317arytenoidectomy;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public boolean f12318clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public ExoPlaybackException f12319coffeecake;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final androidx.media3.common.oilcan.saneness f12320cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public boolean f12321creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final long f12322cuirassed;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public int f12323cultivated;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public boolean f12324dent;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final decarock.cutely f12325dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final HandlerThread f12326gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final czestochowa f12327graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public molet f12328grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public boolean f12329hydrovane;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public boolean f12330itchy;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final gusty f12331kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final homozygous[] f12332kowloon;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public long f12333lerp;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name */
    public adultoid.dern f12334lotta;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public boolean f12335mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final long f12336merc;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public long f12337milliradian;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final hydromechanics.oilcan f12338molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final lampshade[] f12339monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final ArrayList<wireman> f12341oilcan;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public boolean f12342overspeculate;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public boolean f12344permissivist;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final ctenidium f12345polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final hydromechanics.trm f12346polloi;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public impromptu f12347premeiotic;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final androidx.media3.common.oilcan.dern f12348preprohormone;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public marial f12349privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final coi f12350restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final Looper f12351rotuma;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public setterwort f12352saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final beachfront f12354sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public final boolean f12355seminary;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public int f12356splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public boolean f12357starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final boolean f12358stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final vesuvio f12359supplicat;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public long f12360timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public int f12361treadless;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final molybdenite f12362trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public boolean f12363walach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final decarock.wireman f12364yemenite;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public long f12340nosophobia = C.TIME_UNSET;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public long f12343peridotite = C.TIME_UNSET;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public androidx.media3.common.oilcan f12353sayid = androidx.media3.common.oilcan.f11093attabal;

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public class attabal implements homozygous.attabal {
        public attabal() {
        }

        @Override // androidx.media3.exoplayer.homozygous.attabal
        public void attabal() {
            sayid.this.f12324dent = true;
        }

        @Override // androidx.media3.exoplayer.homozygous.attabal
        public void saneness() {
            if (sayid.this.f12355seminary || sayid.this.f12344permissivist) {
                sayid.this.f12325dovishness.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public interface beachfront {
        void attabal(marial marialVar);
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.formularize.saneness f12366attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final boolean f12367beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f12368dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean f12369marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f12370saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final boolean f12371wireman;

        public competently(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f12366attabal = sanenessVar;
            this.f12370saneness = j;
            this.f12368dern = j2;
            this.f12371wireman = z;
            this.f12369marial = z2;
            this.f12367beachfront = z3;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f12372attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f12373dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f12374saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final ethene.oilcan f12375wireman;
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.media3.common.oilcan f12376attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f12377dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f12378saneness;

        public impromptu(androidx.media3.common.oilcan oilcanVar, int i, long j) {
            this.f12376attabal = oilcanVar;
            this.f12378saneness = i;
            this.f12377dern = j;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f12379attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f12380dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f12381marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public setterwort f12382saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f12383wireman;

        public marial(setterwort setterwortVar) {
            this.f12382saneness = setterwortVar;
        }

        public void dern(setterwort setterwortVar) {
            this.f12379attabal |= this.f12382saneness != setterwortVar;
            this.f12382saneness = setterwortVar;
        }

        public void saneness(int i) {
            this.f12379attabal |= i > 0;
            this.f12380dern += i;
        }

        public void wireman(int i) {
            if (this.f12383wireman && this.f12381marial != 5) {
                decarock.attabal.attabal(i == 5);
                return;
            }
            this.f12379attabal = true;
            this.f12383wireman = true;
            this.f12381marial = i;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<vesuvio.dern> f12384attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f12385dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final ethene.oilcan f12386saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f12387wireman;

        public /* synthetic */ saneness(List list, ethene.oilcan oilcanVar, int i, long j, attabal attabalVar) {
            this(list, oilcanVar, i, j);
        }

        public saneness(List<vesuvio.dern> list, ethene.oilcan oilcanVar, int i, long j) {
            this.f12384attabal = list;
            this.f12386saneness = oilcanVar;
            this.f12385dern = i;
            this.f12387wireman = j;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class wireman implements Comparable<wireman> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f12388arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final mastfed f12389kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public long f12390monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public Object f12391polloi;

        public wireman(mastfed mastfedVar) {
            this.f12389kowloon = mastfedVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(wireman wiremanVar) {
            Object obj = this.f12391polloi;
            if ((obj == null) != (wiremanVar.f12391polloi == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f12388arytenoidectomy - wiremanVar.f12388arytenoidectomy;
            return i != 0 ? i : decarock.grimness.impassible(this.f12390monoploid, wiremanVar.f12390monoploid);
        }

        public void dern(int i, long j, Object obj) {
            this.f12388arytenoidectomy = i;
            this.f12390monoploid = j;
            this.f12391polloi = obj;
        }
    }

    public sayid(homozygous[] homozygousVarArr, hydromechanics.trm trmVar, hydromechanics.oilcan oilcanVar, czestochowa czestochowaVar, polyfoil.wireman wiremanVar, int i, boolean z, incorrectly.attabal attabalVar, molet moletVar, coi coiVar, long j, boolean z2, boolean z3, Looper looper, decarock.wireman wiremanVar2, beachfront beachfrontVar, ctenidium ctenidiumVar, Looper looper2, adultoid.dern dernVar) {
        this.f12354sealless = beachfrontVar;
        this.f12332kowloon = homozygousVarArr;
        this.f12346polloi = trmVar;
        this.f12338molybdenite = oilcanVar;
        this.f12327graveside = czestochowaVar;
        this.f12316adultoid = wiremanVar;
        this.f12356splinterproof = i;
        this.f12342overspeculate = z;
        this.f12328grimness = moletVar;
        this.f12350restrictive = coiVar;
        this.f12336merc = j;
        this.f12333lerp = j;
        this.f12357starveling = z2;
        this.f12355seminary = z3;
        this.f12364yemenite = wiremanVar2;
        this.f12345polder = ctenidiumVar;
        this.f12334lotta = dernVar;
        this.f12322cuirassed = czestochowaVar.marial(ctenidiumVar);
        this.f12358stratoscope = czestochowaVar.wireman(ctenidiumVar);
        setterwort setterwortVarApical = setterwort.apical(oilcanVar);
        this.f12352saran = setterwortVarApical;
        this.f12349privatdozent = new marial(setterwortVarApical);
        this.f12339monoploid = new lampshade[homozygousVarArr.length];
        lampshade.attabal attabalVarDern = trmVar.dern();
        for (int i2 = 0; i2 < homozygousVarArr.length; i2++) {
            homozygousVarArr[i2].impromptu(i2, ctenidiumVar, wiremanVar2);
            this.f12339monoploid[i2] = homozygousVarArr[i2].getCapabilities();
            if (attabalVarDern != null) {
                this.f12339monoploid[i2].dovishness(attabalVarDern);
            }
        }
        this.f12362trm = new molybdenite(this, wiremanVar2);
        this.f12341oilcan = new ArrayList<>();
        this.f12317arytenoidectomy = Sets.taiyuan();
        this.f12348preprohormone = new androidx.media3.common.oilcan.dern();
        this.f12320cord = new androidx.media3.common.oilcan.saneness();
        trmVar.wireman(this, wiremanVar);
        this.f12330itchy = true;
        decarock.cutely cutelyVarCreateHandler = wiremanVar2.createHandler(looper, null);
        this.f12331kattegat = new gusty(attabalVar, cutelyVarCreateHandler, new preterite.attabal() { // from class: androidx.media3.exoplayer.lotta
            @Override // androidx.media3.exoplayer.preterite.attabal
            public final preterite attabal(wostteth wosttethVar, long j2) {
                return this.f11965attabal.arytenoidectomy(wosttethVar, j2);
            }
        }, dernVar);
        this.f12359supplicat = new vesuvio(this, attabalVar, cutelyVarCreateHandler, ctenidiumVar);
        if (looper2 != null) {
            this.f12326gintrap = null;
            this.f12351rotuma = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f12326gintrap = handlerThread;
            handlerThread.start();
            this.f12351rotuma = handlerThread.getLooper();
        }
        this.f12325dovishness = wiremanVar2.createHandler(this.f12351rotuma, this);
    }

    public static boolean achondroplasia(wireman wiremanVar, androidx.media3.common.oilcan oilcanVar, androidx.media3.common.oilcan oilcanVar2, int i, boolean z, androidx.media3.common.oilcan.dern dernVar, androidx.media3.common.oilcan.saneness sanenessVar) {
        Object obj = wiremanVar.f12391polloi;
        if (obj == null) {
            Pair<Object, Long> pairHardpan = hardpan(oilcanVar, new impromptu(wiremanVar.f12389kowloon.impromptu(), wiremanVar.f12389kowloon.wireman(), wiremanVar.f12389kowloon.beachfront() == Long.MIN_VALUE ? C.TIME_UNSET : decarock.grimness.outmarry(wiremanVar.f12389kowloon.beachfront())), false, i, z, dernVar, sanenessVar);
            if (pairHardpan == null) {
                return false;
            }
            wiremanVar.dern(oilcanVar.saneness(pairHardpan.first), ((Long) pairHardpan.second).longValue(), pairHardpan.first);
            if (wiremanVar.f12389kowloon.beachfront() == Long.MIN_VALUE) {
                julian(oilcanVar, wiremanVar, dernVar, sanenessVar);
            }
            return true;
        }
        int iSaneness = oilcanVar.saneness(obj);
        if (iSaneness == -1) {
            return false;
        }
        if (wiremanVar.f12389kowloon.beachfront() == Long.MIN_VALUE) {
            julian(oilcanVar, wiremanVar, dernVar, sanenessVar);
            return true;
        }
        wiremanVar.f12388arytenoidectomy = iSaneness;
        oilcanVar2.impromptu(wiremanVar.f12391polloi, sanenessVar);
        if (sanenessVar.f11135beachfront && oilcanVar2.triweekly(sanenessVar.f11137dern, dernVar).f11127triweekly == oilcanVar2.saneness(wiremanVar.f12391polloi)) {
            Pair<Object, Long> pairCutely = oilcanVar.cutely(dernVar, sanenessVar, oilcanVar.impromptu(wiremanVar.f12391polloi, sanenessVar).f11137dern, wiremanVar.f12390monoploid + sanenessVar.triweekly());
            wiremanVar.dern(oilcanVar.saneness(pairCutely.first), ((Long) pairCutely.second).longValue(), pairCutely.first);
        }
        return true;
    }

    public static competently claque(androidx.media3.common.oilcan oilcanVar, setterwort setterwortVar, impromptu impromptuVar, gusty gustyVar, int i, boolean z, androidx.media3.common.oilcan.dern dernVar, androidx.media3.common.oilcan.saneness sanenessVar) {
        int i2;
        long j;
        int iAttabal;
        long jLongValue;
        boolean z2;
        boolean z3;
        boolean z4;
        int iAttabal2;
        boolean z5;
        androidx.media3.common.oilcan oilcanVar2;
        androidx.media3.common.oilcan.saneness sanenessVar2;
        long j2;
        int i3;
        long jLongValue2;
        int iAttabal3;
        boolean z6;
        boolean z7;
        boolean z8;
        if (oilcanVar.monoploid()) {
            return new competently(setterwort.formularize(), 0L, C.TIME_UNSET, false, true, false);
        }
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = setterwortVar.f12419saneness;
        Object obj = sanenessVar3.f12518attabal;
        boolean zSplinterproof = splinterproof(setterwortVar, sanenessVar);
        long jCompetently = (setterwortVar.f12419saneness.saneness() || zSplinterproof) ? setterwortVar.f12409dern : setterwortVar.f12416molybdenite;
        if (impromptuVar != null) {
            i2 = -1;
            j = C.TIME_UNSET;
            Pair<Object, Long> pairHardpan = hardpan(oilcanVar, impromptuVar, true, i, z, dernVar, sanenessVar);
            if (pairHardpan == null) {
                iAttabal3 = oilcanVar.attabal(z);
                jLongValue2 = jCompetently;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                if (impromptuVar.f12377dern == C.TIME_UNSET) {
                    iAttabal3 = oilcanVar.impromptu(pairHardpan.first, sanenessVar).f11137dern;
                    jLongValue2 = jCompetently;
                    z6 = false;
                } else {
                    obj = pairHardpan.first;
                    jLongValue2 = ((Long) pairHardpan.second).longValue();
                    iAttabal3 = -1;
                    z6 = true;
                }
                z7 = setterwortVar.f12415marial == 4;
                z8 = false;
            }
            iAttabal = iAttabal3;
            jCompetently = jLongValue2;
            z4 = z6;
            z2 = z7;
            z3 = z8;
        } else {
            i2 = -1;
            j = C.TIME_UNSET;
            if (setterwortVar.f12405attabal.monoploid()) {
                iAttabal = oilcanVar.attabal(z);
            } else if (oilcanVar.saneness(obj) == -1) {
                int iHerdbook = herdbook(dernVar, sanenessVar, i, z, obj, setterwortVar.f12405attabal, oilcanVar);
                if (iHerdbook == -1) {
                    iAttabal2 = oilcanVar.attabal(z);
                    z5 = true;
                } else {
                    iAttabal2 = iHerdbook;
                    z5 = false;
                }
                iAttabal = iAttabal2;
                obj = obj;
                jCompetently = jCompetently;
                z3 = z5;
                z2 = false;
                z4 = false;
            } else if (jCompetently == C.TIME_UNSET) {
                iAttabal = oilcanVar.impromptu(obj, sanenessVar).f11137dern;
                obj = obj;
            } else if (zSplinterproof) {
                setterwortVar.f12405attabal.impromptu(sanenessVar3.f12518attabal, sanenessVar);
                if (setterwortVar.f12405attabal.triweekly(sanenessVar.f11137dern, dernVar).f11127triweekly == setterwortVar.f12405attabal.saneness(sanenessVar3.f12518attabal)) {
                    Pair<Object, Long> pairCutely = oilcanVar.cutely(dernVar, sanenessVar, oilcanVar.impromptu(obj, sanenessVar).f11137dern, sanenessVar.triweekly() + jCompetently);
                    obj = pairCutely.first;
                    jLongValue = ((Long) pairCutely.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jCompetently;
                }
                jCompetently = jLongValue;
                iAttabal = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                obj = obj;
                iAttabal = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (iAttabal != i2) {
            sanenessVar2 = sanenessVar;
            Pair<Object, Long> pairCutely2 = oilcanVar.cutely(dernVar, sanenessVar2, iAttabal, C.TIME_UNSET);
            oilcanVar2 = oilcanVar;
            obj = pairCutely2.first;
            jCompetently = ((Long) pairCutely2.second).longValue();
            j2 = j;
        } else {
            oilcanVar2 = oilcanVar;
            sanenessVar2 = sanenessVar;
            j2 = jCompetently;
        }
        androidx.media3.exoplayer.source.formularize.saneness sanenessVarPolder = gustyVar.polder(oilcanVar2, obj, jCompetently);
        int i4 = sanenessVarPolder.f12520marial;
        boolean z9 = sanenessVar3.f12518attabal.equals(obj) && !sanenessVar3.saneness() && !sanenessVarPolder.saneness() && (i4 == i2 || ((i3 = sanenessVar3.f12520marial) != i2 && i4 >= i3));
        long j3 = j2;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar4 = sanenessVarPolder;
        boolean zHydrovane = hydrovane(zSplinterproof, sanenessVar3, jCompetently, sanenessVar4, oilcanVar2.impromptu(obj, sanenessVar2), j3);
        if (z9 || zHydrovane) {
            sanenessVar4 = sanenessVar3;
        }
        if (sanenessVar4.saneness()) {
            if (sanenessVar4.equals(sanenessVar3)) {
                jCompetently = setterwortVar.f12416molybdenite;
            } else {
                oilcanVar2.impromptu(sanenessVar4.f12518attabal, sanenessVar2);
                jCompetently = sanenessVar4.f12519dern == sanenessVar2.apical(sanenessVar4.f12521saneness) ? sanenessVar2.competently() : 0L;
            }
        }
        return new competently(sanenessVar4, jCompetently, j3, z2, z3, z4);
    }

    public static /* synthetic */ void competently(sayid sayidVar, mastfed mastfedVar) {
        sayidVar.getClass();
        try {
            sayidVar.monoploid(mastfedVar);
        } catch (ExoPlaybackException e) {
            decarock.triweekly.wireman("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    public static androidx.media3.common.polloi[] cuirassed(hydromechanics.rotuma rotumaVar) {
        int length = rotumaVar != null ? rotumaVar.length() : 0;
        androidx.media3.common.polloi[] polloiVarArr = new androidx.media3.common.polloi[length];
        for (int i = 0; i < length; i++) {
            polloiVarArr[i] = rotumaVar.getFormat(i);
        }
        return polloiVarArr;
    }

    public static Pair<Object, Long> hardpan(androidx.media3.common.oilcan oilcanVar, impromptu impromptuVar, boolean z, int i, boolean z2, androidx.media3.common.oilcan.dern dernVar, androidx.media3.common.oilcan.saneness sanenessVar) {
        androidx.media3.common.oilcan oilcanVar2;
        int iHerdbook;
        androidx.media3.common.oilcan oilcanVar3 = impromptuVar.f12376attabal;
        if (oilcanVar.monoploid()) {
            return null;
        }
        if (oilcanVar3.monoploid()) {
            oilcanVar2 = oilcanVar3;
            oilcanVar2 = oilcanVar;
        }
        try {
            oilcanVar2 = oilcanVar3;
            Pair<Object, Long> pairCutely = oilcanVar2.cutely(dernVar, sanenessVar, impromptuVar.f12378saneness, impromptuVar.f12377dern);
            androidx.media3.common.oilcan oilcanVar4 = oilcanVar2;
            if (oilcanVar.equals(oilcanVar4)) {
                return pairCutely;
            }
            if (oilcanVar.saneness(pairCutely.first) != -1) {
                return (oilcanVar4.impromptu(pairCutely.first, sanenessVar).f11135beachfront && oilcanVar4.triweekly(sanenessVar.f11137dern, dernVar).f11127triweekly == oilcanVar4.saneness(pairCutely.first)) ? oilcanVar.cutely(dernVar, sanenessVar, oilcanVar.impromptu(pairCutely.first, sanenessVar).f11137dern, impromptuVar.f12377dern) : pairCutely;
            }
            if (z && (iHerdbook = herdbook(dernVar, sanenessVar, i, z2, pairCutely.first, oilcanVar4, oilcanVar)) != -1) {
                return oilcanVar.cutely(dernVar, sanenessVar, iHerdbook, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static int herdbook(androidx.media3.common.oilcan.dern dernVar, androidx.media3.common.oilcan.saneness sanenessVar, int i, boolean z, Object obj, androidx.media3.common.oilcan oilcanVar, androidx.media3.common.oilcan oilcanVar2) {
        androidx.media3.common.oilcan.saneness sanenessVar2;
        Object obj2 = oilcanVar.triweekly(oilcanVar.impromptu(obj, sanenessVar).f11137dern, dernVar).f11115attabal;
        int i2 = 0;
        for (int i3 = 0; i3 < oilcanVar2.arytenoidectomy(); i3++) {
            if (oilcanVar2.triweekly(i3, dernVar).f11115attabal.equals(obj2)) {
                return i3;
            }
        }
        int iSaneness = oilcanVar.saneness(obj);
        int iTaiyuan = oilcanVar.taiyuan();
        int iWireman = iSaneness;
        int iSaneness2 = -1;
        while (i2 < iTaiyuan && iSaneness2 == -1) {
            androidx.media3.common.oilcan.dern dernVar2 = dernVar;
            sanenessVar2 = sanenessVar;
            int i4 = i;
            boolean z2 = z;
            androidx.media3.common.oilcan oilcanVar3 = oilcanVar;
            iWireman = oilcanVar3.wireman(iWireman, sanenessVar2, dernVar2, i4, z2);
            if (iWireman == -1) {
                if (iSaneness2 == -1) {
                    return -1;
                }
                return oilcanVar2.beachfront(iSaneness2, sanenessVar2).f11137dern;
            }
            iSaneness2 = oilcanVar2.saneness(oilcanVar3.impassible(iWireman));
            i2++;
            oilcanVar = oilcanVar3;
            sanenessVar = sanenessVar2;
            dernVar = dernVar2;
            i = i4;
            z = z2;
        }
        sanenessVar2 = sanenessVar;
        if (iSaneness2 == -1) {
            return -1;
        }
        return oilcanVar2.beachfront(iSaneness2, sanenessVar2).f11137dern;
    }

    public static boolean hydrovane(boolean z, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, androidx.media3.exoplayer.source.formularize.saneness sanenessVar2, androidx.media3.common.oilcan.saneness sanenessVar3, long j2) {
        if (!z && j == j2 && sanenessVar.f12518attabal.equals(sanenessVar2.f12518attabal)) {
            if (sanenessVar.saneness() && sanenessVar3.polloi(sanenessVar.f12521saneness)) {
                return (sanenessVar3.impromptu(sanenessVar.f12521saneness, sanenessVar.f12519dern) == 4 || sanenessVar3.impromptu(sanenessVar.f12521saneness, sanenessVar.f12519dern) == 2) ? false : true;
            }
            if (sanenessVar2.saneness() && sanenessVar3.polloi(sanenessVar2.f12521saneness)) {
                return true;
            }
        }
        return false;
    }

    public static void julian(androidx.media3.common.oilcan oilcanVar, wireman wiremanVar, androidx.media3.common.oilcan.dern dernVar, androidx.media3.common.oilcan.saneness sanenessVar) {
        int i = oilcanVar.triweekly(oilcanVar.impromptu(wiremanVar.f12391polloi, sanenessVar).f11137dern, dernVar).f11123kowloon;
        Object obj = oilcanVar.competently(i, sanenessVar, true).f11139saneness;
        long j = sanenessVar.f11140wireman;
        wiremanVar.dern(i, j != C.TIME_UNSET ? j - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean peridotite(homozygous homozygousVar) {
        return homozygousVar.getState() != 0;
    }

    public static boolean splinterproof(setterwort setterwortVar, androidx.media3.common.oilcan.saneness sanenessVar) {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = setterwortVar.f12419saneness;
        androidx.media3.common.oilcan oilcanVar = setterwortVar.f12405attabal;
        return oilcanVar.monoploid() || oilcanVar.impromptu(sanenessVar2.f12518attabal, sanenessVar).f11135beachfront;
    }

    public final void adultoid() throws ExoPlaybackException {
        dovishness(new boolean[this.f12332kowloon.length], this.f12331kattegat.adultoid().triweekly());
    }

    public final preterite arytenoidectomy(wostteth wosttethVar, long j) {
        return new preterite(this.f12339monoploid, j, this.f12346polloi, this.f12327graveside.getAllocator(), this.f12359supplicat, wosttethVar, this.f12338molybdenite);
    }

    @Override // hydromechanics.trm.attabal
    public void attabal(homozygous homozygousVar) {
        this.f12325dovishness.sendEmptyMessage(26);
    }

    public final void attendance(mastfed mastfedVar) throws ExoPlaybackException {
        if (mastfedVar.beachfront() == C.TIME_UNSET) {
            homozygous(mastfedVar);
            return;
        }
        if (this.f12352saran.f12405attabal.monoploid()) {
            this.f12341oilcan.add(new wireman(mastfedVar));
            return;
        }
        wireman wiremanVar = new wireman(mastfedVar);
        androidx.media3.common.oilcan oilcanVar = this.f12352saran.f12405attabal;
        if (!achondroplasia(wiremanVar, oilcanVar, oilcanVar, this.f12356splinterproof, this.f12342overspeculate, this.f12348preprohormone, this.f12320cord)) {
            mastfedVar.apical(false);
        } else {
            this.f12341oilcan.add(wiremanVar);
            Collections.sort(this.f12341oilcan);
        }
    }

    public void basify(List<vesuvio.dern> list, int i, long j, ethene.oilcan oilcanVar) {
        this.f12325dovishness.obtainMessage(17, new saneness(list, oilcanVar, i, j, null)).attabal();
    }

    public final void cig(ethene.oilcan oilcanVar) throws Throwable {
        this.f12349privatdozent.saneness(1);
        polder(this.f12359supplicat.oilcan(oilcanVar), false);
    }

    public final void clubfoot() {
        this.f12349privatdozent.dern(this.f12352saran);
        if (this.f12349privatdozent.f12379attabal) {
            this.f12354sealless.attabal(this.f12349privatdozent);
            this.f12349privatdozent = new marial(this.f12352saran);
        }
    }

    public final void coffeecake(dern dernVar) throws Throwable {
        this.f12349privatdozent.saneness(1);
        polder(this.f12359supplicat.dovishness(dernVar.f12372attabal, dernVar.f12374saneness, dernVar.f12373dern, dernVar.f12375wireman), false);
    }

    public final void coi() {
        this.f12349privatdozent.saneness(1);
        palmyra(false, false, false, true);
        this.f12327graveside.dern(this.f12345polder);
        demilitarize(this.f12352saran.f12405attabal.monoploid() ? 4 : 2);
        this.f12359supplicat.gintrap(this.f12316adultoid.dern());
        this.f12325dovishness.sendEmptyMessage(2);
    }

    public final long cord() {
        setterwort setterwortVar = this.f12352saran;
        return stratoscope(setterwortVar.f12405attabal, setterwortVar.f12419saneness.f12518attabal, setterwortVar.f12416molybdenite);
    }

    public final void cosy(int i) throws ExoPlaybackException {
        this.f12356splinterproof = i;
        if (!this.f12331kattegat.hydrovane(this.f12352saran.f12405attabal, i)) {
            dhss(true);
        }
        merc(false);
    }

    public final boolean creditor(homozygous homozygousVar, preterite preteriteVar) {
        preterite preteriteVarApical = preteriteVar.apical();
        if (preteriteVar.f12288beachfront.f13004beachfront && preteriteVarApical.f12300wireman) {
            return (homozygousVar instanceof microanalysis.taiyuan) || (homozygousVar instanceof tout.dern) || homozygousVar.cord() >= preteriteVarApical.triweekly();
        }
        return false;
    }

    public final void ctenidium() throws ExoPlaybackException {
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        if (preteriteVarGraveside == null) {
            return;
        }
        long discontinuity = preteriteVarGraveside.f12300wireman ? preteriteVarGraveside.f12287attabal.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            if (!preteriteVarGraveside.molybdenite()) {
                this.f12331kattegat.supplicat(preteriteVarGraveside);
                merc(false);
                overspeculate();
            }
            monroe(discontinuity);
            if (discontinuity != this.f12352saran.f12416molybdenite) {
                setterwort setterwortVar = this.f12352saran;
                long j = discontinuity;
                this.f12352saran = privatdozent(setterwortVar.f12419saneness, j, setterwortVar.f12409dern, j, true, 5);
            }
        } else {
            long jImpromptu = this.f12362trm.impromptu(preteriteVarGraveside != this.f12331kattegat.adultoid());
            this.f12360timberyard = jImpromptu;
            long jCuirassed = preteriteVarGraveside.cuirassed(jImpromptu);
            dent(this.f12352saran.f12416molybdenite, jCuirassed);
            if (this.f12362trm.impassible()) {
                boolean z = !this.f12349privatdozent.f12383wireman;
                setterwort setterwortVar2 = this.f12352saran;
                this.f12352saran = privatdozent(setterwortVar2.f12419saneness, jCuirassed, setterwortVar2.f12409dern, jCuirassed, z, 6);
            } else {
                this.f12352saran.kowloon(jCuirassed);
            }
        }
        this.f12352saran.f12417monoploid = this.f12331kattegat.impassible().cutely();
        this.f12352saran.f12418polloi = sealless();
        setterwort setterwortVar3 = this.f12352saran;
        if (setterwortVar3.f12410formularize && setterwortVar3.f12415marial == 3 && decarock(setterwortVar3.f12405attabal, setterwortVar3.f12419saneness) && this.f12352saran.f12414kowloon.f11261attabal == 1.0f) {
            float fSaneness = this.f12350restrictive.saneness(cord(), sealless());
            if (this.f12362trm.getPlaybackParameters().f11261attabal != fSaneness) {
                sakeen(this.f12352saran.f12414kowloon.saneness(fSaneness));
                grimness(this.f12352saran.f12414kowloon, this.f12362trm.getPlaybackParameters().f11261attabal, false, false);
            }
        }
    }

    public final void cultivated() {
        boolean z;
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        if (preteriteVarGraveside != null) {
            hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarGraveside.arytenoidectomy();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.f12332kowloon.length) {
                    z = true;
                    break;
                }
                if (oilcanVarArytenoidectomy.dern(i)) {
                    if (this.f12332kowloon[i].getTrackType() != 1) {
                        z = false;
                        break;
                    } else if (oilcanVarArytenoidectomy.f28180saneness[i].f11959attabal != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            tectonization(z2);
        }
    }

    public synchronized boolean czestochowa() {
        if (!this.f12321creditor && this.f12351rotuma.getThread().isAlive()) {
            this.f12325dovishness.sendEmptyMessage(7);
            ethene(new com.google.common.base.arytenoidectomy() { // from class: androidx.media3.exoplayer.lerp
                @Override // com.google.common.base.arytenoidectomy
                public final Object get() {
                    return Boolean.valueOf(this.f11957kowloon.f12321creditor);
                }
            }, this.f12336merc);
            return this.f12321creditor;
        }
        return true;
    }

    public final void deadwork(homozygous homozygousVar, long j) {
        homozygousVar.setCurrentStreamFinal();
        if (homozygousVar instanceof microanalysis.taiyuan) {
            ((microanalysis.taiyuan) homozygousVar).sensatory(j);
        }
    }

    public final boolean decarock(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        if (!sanenessVar.saneness() && !oilcanVar.monoploid()) {
            oilcanVar.triweekly(oilcanVar.impromptu(sanenessVar.f12518attabal, this.f12320cord).f11137dern, this.f12348preprohormone);
            if (this.f12348preprohormone.beachfront()) {
                androidx.media3.common.oilcan.dern dernVar = this.f12348preprohormone;
                if (dernVar.f11126taiyuan && dernVar.f11116beachfront != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void demilitarize(int i) {
        setterwort setterwortVar = this.f12352saran;
        if (setterwortVar.f12415marial != i) {
            if (i != 2) {
                this.f12340nosophobia = C.TIME_UNSET;
            }
            this.f12352saran = setterwortVar.impromptu(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dent(long r9, long r11) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.sayid.dent(long, long):void");
    }

    @Override // androidx.media3.exoplayer.source.apical.attabal
    public void dern(androidx.media3.exoplayer.source.apical apicalVar) {
        this.f12325dovishness.obtainMessage(8, apicalVar).attabal();
    }

    public final void dhss(boolean z) throws ExoPlaybackException {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = this.f12331kattegat.graveside().f12288beachfront.f13003attabal;
        long jMastfed = mastfed(sanenessVar, this.f12352saran.f12416molybdenite, true, false);
        if (jMastfed != this.f12352saran.f12416molybdenite) {
            setterwort setterwortVar = this.f12352saran;
            this.f12352saran = privatdozent(sanenessVar, jMastfed, setterwortVar.f12409dern, setterwortVar.f12422wireman, z, 5);
        }
    }

    public final void dovishness(boolean[] zArr, long j) throws ExoPlaybackException {
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarAdultoid.arytenoidectomy();
        for (int i = 0; i < this.f12332kowloon.length; i++) {
            if (!oilcanVarArytenoidectomy.dern(i) && this.f12317arytenoidectomy.remove(this.f12332kowloon[i])) {
                this.f12332kowloon[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f12332kowloon.length; i2++) {
            if (oilcanVarArytenoidectomy.dern(i2)) {
                graveside(i2, zArr[i2], j);
            }
        }
        preteriteVarAdultoid.f12289competently = true;
    }

    public void empress() {
        this.f12325dovishness.obtainMessage(29).attabal();
    }

    public final synchronized void ethene(com.google.common.base.arytenoidectomy<Boolean> arytenoidectomyVar, long j) {
        long jElapsedRealtime = this.f12364yemenite.elapsedRealtime() + j;
        boolean z = false;
        while (!arytenoidectomyVar.get().booleanValue() && j > 0) {
            try {
                this.f12364yemenite.attabal();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f12364yemenite.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void fastrack(adultoid.dern dernVar) {
        this.f12334lotta = dernVar;
        this.f12331kattegat.creditor(this.f12352saran.f12405attabal, dernVar);
    }

    public final void gintrap(homozygous homozygousVar) {
        if (homozygousVar.getState() == 2) {
            homozygousVar.stop();
        }
    }

    public final void graveside(int i, boolean z, long j) throws ExoPlaybackException {
        homozygous homozygousVar = this.f12332kowloon[i];
        if (peridotite(homozygousVar)) {
            return;
        }
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        boolean z2 = preteriteVarAdultoid == this.f12331kattegat.graveside();
        hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarAdultoid.arytenoidectomy();
        libyan libyanVar = oilcanVarArytenoidectomy.f28180saneness[i];
        androidx.media3.common.polloi[] polloiVarArrCuirassed = cuirassed(oilcanVarArytenoidectomy.f28178dern[i]);
        boolean z3 = stupefactive() && this.f12352saran.f12415marial == 3;
        boolean z4 = !z && z3;
        this.f12323cultivated++;
        this.f12317arytenoidectomy.add(homozygousVar);
        homozygousVar.preprohormone(libyanVar, polloiVarArrCuirassed, preteriteVarAdultoid.f12291dern[i], this.f12360timberyard, z4, z2, j, preteriteVarAdultoid.impassible(), preteriteVarAdultoid.f12288beachfront.f13003attabal);
        homozygousVar.handleMessage(11, new attabal());
        this.f12362trm.dern(homozygousVar);
        if (z3 && z2) {
            homozygousVar.start();
        }
    }

    public final void grimness(androidx.media3.common.preprohormone preprohormoneVar, float f, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.f12349privatdozent.saneness(1);
            }
            this.f12352saran = this.f12352saran.competently(preprohormoneVar);
        }
        undecorated(preprohormoneVar.f11261attabal);
        for (homozygous homozygousVar : this.f12332kowloon) {
            if (homozygousVar != null) {
                homozygousVar.gintrap(f, preprohormoneVar.f11261attabal);
            }
        }
    }

    public final void gusty() throws ExoPlaybackException {
        float f = this.f12362trm.getPlaybackParameters().f11261attabal;
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        hydromechanics.oilcan oilcanVar = null;
        boolean z = true;
        for (preterite preteriteVarGraveside = this.f12331kattegat.graveside(); preteriteVarGraveside != null && preteriteVarGraveside.f12300wireman; preteriteVarGraveside = preteriteVarGraveside.apical()) {
            hydromechanics.oilcan oilcanVarRotuma = preteriteVarGraveside.rotuma(f, this.f12352saran.f12405attabal);
            if (preteriteVarGraveside == this.f12331kattegat.graveside()) {
                oilcanVar = oilcanVarRotuma;
            }
            int i = 0;
            if (!oilcanVarRotuma.attabal(preteriteVarGraveside.arytenoidectomy())) {
                if (z) {
                    preterite preteriteVarGraveside2 = this.f12331kattegat.graveside();
                    boolean zSupplicat = this.f12331kattegat.supplicat(preteriteVarGraveside2);
                    boolean[] zArr = new boolean[this.f12332kowloon.length];
                    long jSaneness = preteriteVarGraveside2.saneness((hydromechanics.oilcan) decarock.attabal.marial(oilcanVar), this.f12352saran.f12416molybdenite, zSupplicat, zArr);
                    setterwort setterwortVar = this.f12352saran;
                    boolean z2 = (setterwortVar.f12415marial == 4 || jSaneness == setterwortVar.f12416molybdenite) ? false : true;
                    setterwort setterwortVar2 = this.f12352saran;
                    this.f12352saran = privatdozent(setterwortVar2.f12419saneness, jSaneness, setterwortVar2.f12409dern, setterwortVar2.f12422wireman, z2, 5);
                    if (z2) {
                        monroe(jSaneness);
                    }
                    boolean[] zArr2 = new boolean[this.f12332kowloon.length];
                    while (true) {
                        homozygous[] homozygousVarArr = this.f12332kowloon;
                        if (i >= homozygousVarArr.length) {
                            break;
                        }
                        homozygous homozygousVar = homozygousVarArr[i];
                        boolean zPeridotite = peridotite(homozygousVar);
                        zArr2[i] = zPeridotite;
                        ethene.trm trmVar = preteriteVarGraveside2.f12291dern[i];
                        if (zPeridotite) {
                            if (trmVar != homozygousVar.getStream()) {
                                polloi(homozygousVar);
                            } else if (zArr[i]) {
                                homozygousVar.resetPosition(this.f12360timberyard);
                            }
                        }
                        i++;
                    }
                    dovishness(zArr2, this.f12360timberyard);
                } else {
                    this.f12331kattegat.supplicat(preteriteVarGraveside);
                    if (preteriteVarGraveside.f12300wireman) {
                        preteriteVarGraveside.attabal(oilcanVarRotuma, Math.max(preteriteVarGraveside.f12288beachfront.f13009saneness, preteriteVarGraveside.cuirassed(this.f12360timberyard)), false);
                    }
                }
                merc(true);
                if (this.f12352saran.f12415marial != 4) {
                    overspeculate();
                    ctenidium();
                    this.f12325dovishness.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (preteriteVarGraveside == preteriteVarAdultoid) {
                z = false;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i;
        preterite preteriteVarAdultoid;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    licking(z, i4 >> 4, true, i4 & 15);
                    break;
                case 2:
                    molybdenite();
                    break;
                case 3:
                    vesuvio((impromptu) message.obj);
                    break;
                case 4:
                    microchemistry((androidx.media3.common.preprohormone) message.obj);
                    break;
                case 5:
                    pruinose((molet) message.obj);
                    break;
                case 6:
                    vir(false, true);
                    break;
                case 7:
                    sensatory();
                    return true;
                case 8:
                    seminary((androidx.media3.exoplayer.source.apical) message.obj);
                    break;
                case 9:
                    supplicat((androidx.media3.exoplayer.source.apical) message.obj);
                    break;
                case 10:
                    gusty();
                    break;
                case 11:
                    cosy(message.arg1);
                    break;
                case 12:
                    tarboosh(message.arg1 != 0);
                    break;
                case 13:
                    molet(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    attendance((mastfed) message.obj);
                    break;
                case 15:
                    lampshade((mastfed) message.obj);
                    break;
                case 16:
                    saran((androidx.media3.common.preprohormone) message.obj, false);
                    break;
                case 17:
                    immediately((saneness) message.obj);
                    break;
                case 18:
                    impassible((saneness) message.obj, message.arg1);
                    break;
                case 19:
                    coffeecake((dern) message.obj);
                    break;
                case 20:
                    preterite(message.arg1, message.arg2, (ethene.oilcan) message.obj);
                    break;
                case 21:
                    cig((ethene.oilcan) message.obj);
                    break;
                case 22:
                    itchy();
                    break;
                case 23:
                    prefect(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    kowloon();
                    break;
                case 26:
                    picketboat();
                    break;
                case 27:
                    hyalinization(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    fastrack((adultoid.dern) message.obj);
                    break;
                case 29:
                    coi();
                    break;
            }
        } catch (ParserException e) {
            int i5 = e.dataType;
            if (i5 == 1) {
                i2 = e.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = e.contentIsMalformed ? 3002 : 3004;
                }
                restrictive(e, i3);
            }
            i3 = i2;
            restrictive(e, i3);
        } catch (DataSourceException e2) {
            restrictive(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            e = e3;
            if (e.type == 1 && (preteriteVarAdultoid = this.f12331kattegat.adultoid()) != null) {
                e = e.copyWithMediaPeriodId(preteriteVarAdultoid.f12288beachfront.f13003attabal);
            }
            if (e.isRecoverable && (this.f12319coffeecake == null || (i = e.errorCode) == 5004 || i == 5003)) {
                decarock.triweekly.taiyuan("ExoPlayerImplInternal", "Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.f12319coffeecake;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f12319coffeecake;
                } else {
                    this.f12319coffeecake = e;
                }
                decarock.cutely cutelyVar = this.f12325dovishness;
                cutelyVar.saneness(cutelyVar.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.f12319coffeecake;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.f12319coffeecake;
                }
                decarock.triweekly.wireman("ExoPlayerImplInternal", "Playback error", e);
                if (e.type == 1 && this.f12331kattegat.graveside() != this.f12331kattegat.adultoid()) {
                    while (this.f12331kattegat.graveside() != this.f12331kattegat.adultoid()) {
                        this.f12331kattegat.saneness();
                    }
                    preterite preteriteVar = (preterite) decarock.attabal.marial(this.f12331kattegat.graveside());
                    clubfoot();
                    wostteth wosttethVar = preteriteVar.f12288beachfront;
                    androidx.media3.exoplayer.source.formularize.saneness sanenessVar = wosttethVar.f13003attabal;
                    long j = wosttethVar.f13009saneness;
                    this.f12352saran = privatdozent(sanenessVar, j, wosttethVar.f13006dern, j, true, 0);
                }
                vir(true, false);
                this.f12352saran = this.f12352saran.beachfront(e);
            }
        } catch (DrmSession.DrmSessionException e4) {
            restrictive(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            restrictive(e5, 1002);
        } catch (IOException e6) {
            restrictive(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            decarock.triweekly.wireman("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForUnexpected);
            vir(true, false);
            this.f12352saran = this.f12352saran.beachfront(exoPlaybackExceptionCreateForUnexpected);
        }
        clubfoot();
        return true;
    }

    public final void homozygous(mastfed mastfedVar) throws ExoPlaybackException {
        if (mastfedVar.dern() != this.f12351rotuma) {
            this.f12325dovishness.obtainMessage(15, mastfedVar).attabal();
            return;
        }
        monoploid(mastfedVar);
        int i = this.f12352saran.f12415marial;
        if (i == 3 || i == 2) {
            this.f12325dovishness.sendEmptyMessage(2);
        }
    }

    public final void hyalinization(int i, int i2, List<androidx.media3.common.adultoid> list) throws Throwable {
        this.f12349privatdozent.saneness(1);
        polder(this.f12359supplicat.yemenite(i, i2, list), false);
    }

    public final boolean igbo() throws ExoPlaybackException {
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarAdultoid.arytenoidectomy();
        int i = 0;
        boolean z = false;
        while (true) {
            homozygous[] homozygousVarArr = this.f12332kowloon;
            if (i >= homozygousVarArr.length) {
                return !z;
            }
            homozygous homozygousVar = homozygousVarArr[i];
            if (peridotite(homozygousVar)) {
                boolean z2 = homozygousVar.getStream() != preteriteVarAdultoid.f12291dern[i];
                if (!oilcanVarArytenoidectomy.dern(i) || z2) {
                    if (!homozygousVar.isCurrentStreamFinal()) {
                        homozygousVar.triweekly(cuirassed(oilcanVarArytenoidectomy.f28178dern[i]), preteriteVarAdultoid.f12291dern[i], preteriteVarAdultoid.triweekly(), preteriteVarAdultoid.impassible(), preteriteVarAdultoid.f12288beachfront.f13003attabal);
                        if (this.f12344permissivist) {
                            tectonization(false);
                        }
                    } else if (homozygousVar.isEnded()) {
                        polloi(homozygousVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    public final void immediately(saneness sanenessVar) throws Throwable {
        this.f12349privatdozent.saneness(1);
        if (sanenessVar.f12385dern != -1) {
            this.f12347premeiotic = new impromptu(new attendance(sanenessVar.f12384attabal, sanenessVar.f12386saneness), sanenessVar.f12385dern, sanenessVar.f12387wireman);
        }
        polder(this.f12359supplicat.trm(sanenessVar.f12384attabal, sanenessVar.f12386saneness), false);
    }

    public final void impassible(saneness sanenessVar, int i) throws Throwable {
        this.f12349privatdozent.saneness(1);
        vesuvio vesuvioVar = this.f12359supplicat;
        if (i == -1) {
            i = vesuvioVar.polloi();
        }
        polder(vesuvioVar.beachfront(i, sanenessVar.f12384attabal, sanenessVar.f12386saneness), false);
    }

    public final void incorrectly(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, ethene.restrictive restrictiveVar, hydromechanics.oilcan oilcanVar) {
        this.f12327graveside.impassible(this.f12345polder, this.f12352saran.f12405attabal, sanenessVar, this.f12332kowloon, restrictiveVar, oilcanVar.f28178dern);
    }

    public final void itchy() throws Throwable {
        polder(this.f12359supplicat.taiyuan(), true);
    }

    public final long kattegat(long j) {
        preterite preteriteVarImpassible = this.f12331kattegat.impassible();
        if (preteriteVarImpassible == null) {
            return 0L;
        }
        return Math.max(0L, j - preteriteVarImpassible.cuirassed(this.f12360timberyard));
    }

    public final void kowloon() throws ExoPlaybackException {
        picketboat();
    }

    public final void lampshade(final mastfed mastfedVar) {
        Looper looperDern = mastfedVar.dern();
        if (looperDern.getThread().isAlive()) {
            this.f12364yemenite.createHandler(looperDern, null).post(new Runnable() { // from class: androidx.media3.exoplayer.nosophobia
                @Override // java.lang.Runnable
                public final void run() {
                    sayid.competently(this.f12155kowloon, mastfedVar);
                }
            });
        } else {
            decarock.triweekly.impromptu("TAG", "Trying to send message on a dead thread.");
            mastfedVar.apical(false);
        }
    }

    public final void lerp() {
        for (preterite preteriteVarGraveside = this.f12331kattegat.graveside(); preteriteVarGraveside != null; preteriteVarGraveside = preteriteVarGraveside.apical()) {
            for (hydromechanics.rotuma rotumaVar : preteriteVarGraveside.arytenoidectomy().f28178dern) {
                if (rotumaVar != null) {
                    rotumaVar.attabal();
                }
            }
        }
    }

    public void liable() {
        this.f12325dovishness.obtainMessage(6).attabal();
    }

    public final boolean libya(boolean z) {
        if (this.f12323cultivated == 0) {
            return mathsort();
        }
        if (!z) {
            return false;
        }
        if (!this.f12352saran.f12407competently) {
            return true;
        }
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        long jDern = decarock(this.f12352saran.f12405attabal, preteriteVarGraveside.f12288beachfront.f13003attabal) ? this.f12350restrictive.dern() : C.TIME_UNSET;
        preterite preteriteVarImpassible = this.f12331kattegat.impassible();
        return (preteriteVarImpassible.molybdenite() && preteriteVarImpassible.f12288beachfront.f13010taiyuan) || (preteriteVarImpassible.f12288beachfront.f13003attabal.saneness() && !preteriteVarImpassible.f12300wireman) || this.f12327graveside.attabal(new czestochowa.attabal(this.f12345polder, this.f12352saran.f12405attabal, preteriteVarGraveside.f12288beachfront.f13003attabal, preteriteVarGraveside.cuirassed(this.f12360timberyard), sealless(), this.f12362trm.getPlaybackParameters().f11261attabal, this.f12352saran.f12410formularize, this.f12363walach, jDern));
    }

    public final void libyan(long j) {
        for (homozygous homozygousVar : this.f12332kowloon) {
            if (homozygousVar.getStream() != null) {
                deadwork(homozygousVar, j);
            }
        }
    }

    public final void licking(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f12349privatdozent.saneness(z2 ? 1 : 0);
        this.f12352saran = this.f12352saran.marial(z, i2, i);
        tout(false, false);
        nosophobia(z);
        if (!stupefactive()) {
            twybill();
            ctenidium();
            return;
        }
        int i3 = this.f12352saran.f12415marial;
        if (i3 == 3) {
            this.f12362trm.beachfront();
            tailoring();
            this.f12325dovishness.sendEmptyMessage(2);
        } else if (i3 == 2) {
            this.f12325dovishness.sendEmptyMessage(2);
        }
    }

    public final void lightstruck() {
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        this.f12329hydrovane = preteriteVarGraveside != null && preteriteVarGraveside.f12288beachfront.f13007impromptu && this.f12357starveling;
    }

    public final boolean linendraper() {
        if (!walach()) {
            return false;
        }
        preterite preteriteVarImpassible = this.f12331kattegat.impassible();
        long jKattegat = kattegat(preteriteVarImpassible.formularize());
        czestochowa.attabal attabalVar = new czestochowa.attabal(this.f12345polder, this.f12352saran.f12405attabal, preteriteVarImpassible.f12288beachfront.f13003attabal, preteriteVarImpassible == this.f12331kattegat.graveside() ? preteriteVarImpassible.cuirassed(this.f12360timberyard) : preteriteVarImpassible.cuirassed(this.f12360timberyard) - preteriteVarImpassible.f12288beachfront.f13009saneness, jKattegat, this.f12362trm.getPlaybackParameters().f11261attabal, this.f12352saran.f12410formularize, this.f12363walach, decarock(this.f12352saran.f12405attabal, preteriteVarImpassible.f12288beachfront.f13003attabal) ? this.f12350restrictive.dern() : C.TIME_UNSET);
        boolean zImpromptu = this.f12327graveside.impromptu(attabalVar);
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        if (zImpromptu || !preteriteVarGraveside.f12300wireman || jKattegat >= 500000) {
            return zImpromptu;
        }
        if (this.f12322cuirassed <= 0 && !this.f12358stratoscope) {
            return zImpromptu;
        }
        preteriteVarGraveside.f12287attabal.discardBuffer(this.f12352saran.f12416molybdenite, false);
        return this.f12327graveside.impromptu(attabalVar);
    }

    public final void lotta() {
        for (preterite preteriteVarGraveside = this.f12331kattegat.graveside(); preteriteVarGraveside != null; preteriteVarGraveside = preteriteVarGraveside.apical()) {
            for (hydromechanics.rotuma rotumaVar : preteriteVarGraveside.arytenoidectomy().f28178dern) {
                if (rotumaVar != null) {
                    rotumaVar.dern();
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mastfed.attabal
    public synchronized void marial(mastfed mastfedVar) {
        if (!this.f12321creditor && this.f12351rotuma.getThread().isAlive()) {
            this.f12325dovishness.obtainMessage(14, mastfedVar).attabal();
            return;
        }
        decarock.triweekly.impromptu("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        mastfedVar.apical(false);
    }

    public final long mastfed(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        twybill();
        tout(false, true);
        if (z2 || this.f12352saran.f12415marial == 3) {
            demilitarize(2);
        }
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        preterite preteriteVarApical = preteriteVarGraveside;
        while (preteriteVarApical != null && !sanenessVar.equals(preteriteVarApical.f12288beachfront.f13003attabal)) {
            preteriteVarApical = preteriteVarApical.apical();
        }
        if (z || preteriteVarGraveside != preteriteVarApical || (preteriteVarApical != null && preteriteVarApical.stratoscope(j) < 0)) {
            for (homozygous homozygousVar : this.f12332kowloon) {
                polloi(homozygousVar);
            }
            if (preteriteVarApical != null) {
                while (this.f12331kattegat.graveside() != preteriteVarApical) {
                    this.f12331kattegat.saneness();
                }
                this.f12331kattegat.supplicat(preteriteVarApical);
                preteriteVarApical.cord(1000000000000L);
                adultoid();
            }
        }
        if (preteriteVarApical != null) {
            this.f12331kattegat.supplicat(preteriteVarApical);
            if (!preteriteVarApical.f12300wireman) {
                preteriteVarApical.f12288beachfront = preteriteVarApical.f12288beachfront.saneness(j);
            } else if (preteriteVarApical.f12296marial) {
                j = preteriteVarApical.f12287attabal.seekToUs(j);
                preteriteVarApical.f12287attabal.discardBuffer(j - this.f12322cuirassed, this.f12358stratoscope);
            }
            monroe(j);
            overspeculate();
        } else {
            this.f12331kattegat.beachfront();
            monroe(j);
        }
        merc(false);
        this.f12325dovishness.sendEmptyMessage(2);
        return j;
    }

    public final boolean mathsort() {
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        long j = preteriteVarGraveside.f12288beachfront.f13008marial;
        if (preteriteVarGraveside.f12300wireman) {
            return j == C.TIME_UNSET || this.f12352saran.f12416molybdenite < j || !stupefactive();
        }
        return false;
    }

    public final void merc(boolean z) {
        preterite preteriteVarImpassible = this.f12331kattegat.impassible();
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = preteriteVarImpassible == null ? this.f12352saran.f12419saneness : preteriteVarImpassible.f12288beachfront.f13003attabal;
        boolean zEquals = this.f12352saran.f12403apical.equals(sanenessVar);
        if (!zEquals) {
            this.f12352saran = this.f12352saran.dern(sanenessVar);
        }
        setterwort setterwortVar = this.f12352saran;
        setterwortVar.f12417monoploid = preteriteVarImpassible == null ? setterwortVar.f12416molybdenite : preteriteVarImpassible.cutely();
        this.f12352saran.f12418polloi = sealless();
        if ((!zEquals || z) && preteriteVarImpassible != null && preteriteVarImpassible.f12300wireman) {
            incorrectly(preteriteVarImpassible.f12288beachfront.f13003attabal, preteriteVarImpassible.kowloon(), preteriteVarImpassible.arytenoidectomy());
        }
    }

    public final void microchemistry(androidx.media3.common.preprohormone preprohormoneVar) throws ExoPlaybackException {
        sakeen(preprohormoneVar);
        saran(this.f12362trm.getPlaybackParameters(), true);
    }

    public final void miliaria() {
        preterite preteriteVarImpassible = this.f12331kattegat.impassible();
        boolean z = this.f12335mathsort || (preteriteVarImpassible != null && preteriteVarImpassible.f12287attabal.isLoading());
        setterwort setterwortVar = this.f12352saran;
        if (z != setterwortVar.f12407competently) {
            this.f12352saran = setterwortVar.saneness(z);
        }
    }

    public final void milliradian() throws ExoPlaybackException {
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        if (preteriteVarAdultoid == null) {
            return;
        }
        int i = 0;
        if (preteriteVarAdultoid.apical() != null && !this.f12329hydrovane) {
            if (starveling()) {
                if (preteriteVarAdultoid.apical().f12300wireman || this.f12360timberyard >= preteriteVarAdultoid.apical().triweekly()) {
                    hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarAdultoid.arytenoidectomy();
                    preterite preteriteVarDern = this.f12331kattegat.dern();
                    hydromechanics.oilcan oilcanVarArytenoidectomy2 = preteriteVarDern.arytenoidectomy();
                    androidx.media3.common.oilcan oilcanVar = this.f12352saran.f12405attabal;
                    rajahship(oilcanVar, preteriteVarDern.f12288beachfront.f13003attabal, oilcanVar, preteriteVarAdultoid.f12288beachfront.f13003attabal, C.TIME_UNSET, false);
                    if (preteriteVarDern.f12300wireman && preteriteVarDern.f12287attabal.readDiscontinuity() != C.TIME_UNSET) {
                        libyan(preteriteVarDern.triweekly());
                        if (preteriteVarDern.molybdenite()) {
                            return;
                        }
                        this.f12331kattegat.supplicat(preteriteVarDern);
                        merc(false);
                        overspeculate();
                        return;
                    }
                    for (int i2 = 0; i2 < this.f12332kowloon.length; i2++) {
                        boolean zDern = oilcanVarArytenoidectomy.dern(i2);
                        boolean zDern2 = oilcanVarArytenoidectomy2.dern(i2);
                        if (zDern && !this.f12332kowloon[i2].isCurrentStreamFinal()) {
                            boolean z = this.f12339monoploid[i2].getTrackType() == -2;
                            libyan libyanVar = oilcanVarArytenoidectomy.f28180saneness[i2];
                            libyan libyanVar2 = oilcanVarArytenoidectomy2.f28180saneness[i2];
                            if (!zDern2 || !libyanVar2.equals(libyanVar) || z) {
                                deadwork(this.f12332kowloon[i2], preteriteVarDern.triweekly());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!preteriteVarAdultoid.f12288beachfront.f13010taiyuan && !this.f12329hydrovane) {
            return;
        }
        while (true) {
            homozygous[] homozygousVarArr = this.f12332kowloon;
            if (i >= homozygousVarArr.length) {
                return;
            }
            homozygous homozygousVar = homozygousVarArr[i];
            ethene.trm trmVar = preteriteVarAdultoid.f12291dern[i];
            if (trmVar != null && homozygousVar.getStream() == trmVar && homozygousVar.hasReadStreamToEnd()) {
                long j = preteriteVarAdultoid.f12288beachfront.f13008marial;
                deadwork(homozygousVar, (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? -9223372036854775807L : preteriteVarAdultoid.impassible() + preteriteVarAdultoid.f12288beachfront.f13008marial);
            }
            i++;
        }
    }

    public final void molet(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f12318clubfoot != z) {
            this.f12318clubfoot = z;
            if (!z) {
                for (homozygous homozygousVar : this.f12332kowloon) {
                    if (!peridotite(homozygousVar) && this.f12317arytenoidectomy.remove(homozygousVar)) {
                        homozygousVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x01af  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0173 A[EDGE_INSN: B:151:0x0173->B:103:0x0173 BREAK  A[LOOP:1: B:95:0x014e->B:102:0x0170], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0170 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    public final void molybdenite() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        boolean z5;
        setterwort setterwortVar;
        int i;
        int i2;
        homozygous[] homozygousVarArr;
        setterwort setterwortVar2;
        long jUptimeMillis = this.f12364yemenite.uptimeMillis();
        this.f12325dovishness.removeMessages(2);
        puffin();
        int i3 = this.f12352saran.f12415marial;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        if (preteriteVarGraveside == null) {
            technofreak(jUptimeMillis);
            return;
        }
        decarock.supplicat.attabal("doSomeWork");
        ctenidium();
        if (preteriteVarGraveside.f12300wireman) {
            this.f12337milliradian = decarock.grimness.outmarry(this.f12364yemenite.elapsedRealtime());
            preteriteVarGraveside.f12287attabal.discardBuffer(this.f12352saran.f12416molybdenite - this.f12322cuirassed, this.f12358stratoscope);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                homozygous[] homozygousVarArr2 = this.f12332kowloon;
                if (i4 >= homozygousVarArr2.length) {
                    break;
                }
                homozygous homozygousVar = homozygousVarArr2[i4];
                if (peridotite(homozygousVar)) {
                    homozygousVar.render(this.f12360timberyard, this.f12337milliradian);
                    z = z && homozygousVar.isEnded();
                    boolean z6 = preteriteVarGraveside.f12291dern[i4] != homozygousVar.getStream();
                    boolean z7 = z6 || (!z6 && homozygousVar.hasReadStreamToEnd()) || homozygousVar.isReady() || homozygousVar.isEnded();
                    z2 = z2 && z7;
                    if (!z7) {
                        homozygousVar.maybeThrowStreamError();
                    }
                }
                i4++;
            }
        } else {
            preteriteVarGraveside.f12287attabal.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j2 = preteriteVarGraveside.f12288beachfront.f13008marial;
        if (z && preteriteVarGraveside.f12300wireman) {
            if (j2 != C.TIME_UNSET) {
                j = -9223372036854775807L;
                if (j2 <= this.f12352saran.f12416molybdenite) {
                }
                if (z3 && this.f12329hydrovane) {
                    this.f12329hydrovane = false;
                    licking(false, this.f12352saran.f12421triweekly, false, 5);
                }
                if (!z3 && preteriteVarGraveside.f12288beachfront.f13010taiyuan) {
                    demilitarize(4);
                    twybill();
                } else if (this.f12352saran.f12415marial != 2 && libya(z2)) {
                    demilitarize(3);
                    this.f12319coffeecake = null;
                    if (stupefactive()) {
                        tout(false, false);
                        this.f12362trm.beachfront();
                        tailoring();
                    }
                } else if (this.f12352saran.f12415marial == 3 && (this.f12323cultivated != 0 ? !z2 : !mathsort())) {
                    tout(stupefactive(), false);
                    demilitarize(2);
                    if (this.f12363walach) {
                        lotta();
                        this.f12350restrictive.wireman();
                    }
                    twybill();
                }
                if (this.f12352saran.f12415marial == 2) {
                    i2 = 0;
                    while (true) {
                        homozygousVarArr = this.f12332kowloon;
                        if (i2 >= homozygousVarArr.length) {
                            break;
                        }
                        if (!peridotite(homozygousVarArr[i2]) && this.f12332kowloon[i2].getStream() == preteriteVarGraveside.f12291dern[i2]) {
                            this.f12332kowloon[i2].maybeThrowStreamError();
                        }
                        i2++;
                    }
                    setterwortVar2 = this.f12352saran;
                    if (!setterwortVar2.f12407competently || setterwortVar2.f12418polloi >= 500000 || !walach()) {
                        this.f12340nosophobia = j;
                    } else if (this.f12340nosophobia == j) {
                        this.f12340nosophobia = this.f12364yemenite.elapsedRealtime();
                    } else if (this.f12364yemenite.elapsedRealtime() - this.f12340nosophobia >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                } else {
                    this.f12340nosophobia = j;
                }
                if (stupefactive() || this.f12352saran.f12415marial != 3) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                z5 = !this.f12344permissivist && this.f12324dent && z4;
                setterwortVar = this.f12352saran;
                if (setterwortVar.f12404arytenoidectomy != z5) {
                    this.f12352saran = setterwortVar.taiyuan(z5);
                }
                this.f12324dent = false;
                if (!z5 && (i = this.f12352saran.f12415marial) != 4 && (z4 || i == 2 || (i == 3 && this.f12323cultivated != 0))) {
                    technofreak(jUptimeMillis);
                }
                decarock.supplicat.saneness();
            }
            j = -9223372036854775807L;
            z3 = true;
            if (z3) {
                this.f12329hydrovane = false;
                licking(false, this.f12352saran.f12421triweekly, false, 5);
            }
            if (!z3) {
                if (this.f12352saran.f12415marial != 2) {
                    if (this.f12352saran.f12415marial == 3) {
                        tout(stupefactive(), false);
                        demilitarize(2);
                        if (this.f12363walach) {
                            lotta();
                            this.f12350restrictive.wireman();
                        }
                        twybill();
                    }
                } else if (this.f12352saran.f12415marial == 3) {
                    tout(stupefactive(), false);
                    demilitarize(2);
                    if (this.f12363walach) {
                        lotta();
                        this.f12350restrictive.wireman();
                    }
                    twybill();
                }
            } else if (this.f12352saran.f12415marial != 2) {
                if (this.f12352saran.f12415marial == 3) {
                    tout(stupefactive(), false);
                    demilitarize(2);
                    if (this.f12363walach) {
                        lotta();
                        this.f12350restrictive.wireman();
                    }
                    twybill();
                }
            } else if (this.f12352saran.f12415marial == 3) {
                tout(stupefactive(), false);
                demilitarize(2);
                if (this.f12363walach) {
                    lotta();
                    this.f12350restrictive.wireman();
                }
                twybill();
            }
            if (this.f12352saran.f12415marial == 2) {
                i2 = 0;
                while (true) {
                    homozygousVarArr = this.f12332kowloon;
                    if (i2 >= homozygousVarArr.length) {
                        break;
                        break;
                    } else {
                        if (!peridotite(homozygousVarArr[i2])) {
                        }
                        i2++;
                    }
                }
                setterwortVar2 = this.f12352saran;
                if (!setterwortVar2.f12407competently) {
                    this.f12340nosophobia = j;
                } else {
                    this.f12340nosophobia = j;
                }
            } else {
                this.f12340nosophobia = j;
            }
            if (stupefactive()) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (this.f12344permissivist) {
            }
            setterwortVar = this.f12352saran;
            if (setterwortVar.f12404arytenoidectomy != z5) {
                this.f12352saran = setterwortVar.taiyuan(z5);
            }
            this.f12324dent = false;
            if (!z5) {
                technofreak(jUptimeMillis);
            }
            decarock.supplicat.saneness();
        }
        j = -9223372036854775807L;
        z3 = false;
        if (z3) {
            this.f12329hydrovane = false;
            licking(false, this.f12352saran.f12421triweekly, false, 5);
        }
        if (!z3) {
            if (this.f12352saran.f12415marial != 2) {
                if (this.f12352saran.f12415marial == 3) {
                    tout(stupefactive(), false);
                    demilitarize(2);
                    if (this.f12363walach) {
                        lotta();
                        this.f12350restrictive.wireman();
                    }
                    twybill();
                }
            } else if (this.f12352saran.f12415marial == 3) {
                tout(stupefactive(), false);
                demilitarize(2);
                if (this.f12363walach) {
                    lotta();
                    this.f12350restrictive.wireman();
                }
                twybill();
            }
        } else if (this.f12352saran.f12415marial != 2) {
            if (this.f12352saran.f12415marial == 3) {
                tout(stupefactive(), false);
                demilitarize(2);
                if (this.f12363walach) {
                    lotta();
                    this.f12350restrictive.wireman();
                }
                twybill();
            }
        } else if (this.f12352saran.f12415marial == 3) {
            tout(stupefactive(), false);
            demilitarize(2);
            if (this.f12363walach) {
                lotta();
                this.f12350restrictive.wireman();
            }
            twybill();
        }
        if (this.f12352saran.f12415marial == 2) {
            i2 = 0;
            while (true) {
                homozygousVarArr = this.f12332kowloon;
                if (i2 >= homozygousVarArr.length) {
                    break;
                    break;
                } else {
                    if (!peridotite(homozygousVarArr[i2])) {
                    }
                    i2++;
                }
            }
            setterwortVar2 = this.f12352saran;
            if (!setterwortVar2.f12407competently) {
                this.f12340nosophobia = j;
            } else {
                this.f12340nosophobia = j;
            }
        } else {
            this.f12340nosophobia = j;
        }
        if (stupefactive()) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (this.f12344permissivist) {
        }
        setterwortVar = this.f12352saran;
        if (setterwortVar.f12404arytenoidectomy != z5) {
            this.f12352saran = setterwortVar.taiyuan(z5);
        }
        this.f12324dent = false;
        if (!z5) {
            technofreak(jUptimeMillis);
        }
        decarock.supplicat.saneness();
    }

    public final void monoploid(mastfed mastfedVar) throws ExoPlaybackException {
        if (mastfedVar.cutely()) {
            return;
        }
        try {
            mastfedVar.competently().handleMessage(mastfedVar.taiyuan(), mastfedVar.marial());
        } finally {
            mastfedVar.apical(true);
        }
    }

    public final void monroe(long j) throws ExoPlaybackException {
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        long jStratoscope = preteriteVarGraveside == null ? j + 1000000000000L : preteriteVarGraveside.stratoscope(j);
        this.f12360timberyard = jStratoscope;
        this.f12362trm.wireman(jStratoscope);
        for (homozygous homozygousVar : this.f12332kowloon) {
            if (peridotite(homozygousVar)) {
                homozygousVar.resetPosition(this.f12360timberyard);
            }
        }
        lerp();
    }

    public final void nosophobia(boolean z) {
        for (preterite preteriteVarGraveside = this.f12331kattegat.graveside(); preteriteVarGraveside != null; preteriteVarGraveside = preteriteVarGraveside.apical()) {
            for (hydromechanics.rotuma rotumaVar : preteriteVarGraveside.arytenoidectomy().f28178dern) {
                if (rotumaVar != null) {
                    rotumaVar.saneness(z);
                }
            }
        }
    }

    public final Pair<androidx.media3.exoplayer.source.formularize.saneness, Long> oilcan(androidx.media3.common.oilcan oilcanVar) {
        if (oilcanVar.monoploid()) {
            return Pair.create(setterwort.formularize(), 0L);
        }
        Pair<Object, Long> pairCutely = oilcanVar.cutely(this.f12348preprohormone, this.f12320cord, oilcanVar.attabal(this.f12342overspeculate), C.TIME_UNSET);
        androidx.media3.exoplayer.source.formularize.saneness sanenessVarPolder = this.f12331kattegat.polder(oilcanVar, pairCutely.first, 0L);
        long jLongValue = ((Long) pairCutely.second).longValue();
        if (sanenessVarPolder.saneness()) {
            oilcanVar.impromptu(sanenessVarPolder.f12518attabal, this.f12320cord);
            jLongValue = sanenessVarPolder.f12519dern == this.f12320cord.apical(sanenessVarPolder.f12521saneness) ? this.f12320cord.competently() : 0L;
        }
        return Pair.create(sanenessVarPolder, Long.valueOf(jLongValue));
    }

    @Override // androidx.media3.exoplayer.molybdenite.attabal
    public void onPlaybackParametersChanged(androidx.media3.common.preprohormone preprohormoneVar) {
        this.f12325dovishness.obtainMessage(16, preprohormoneVar).attabal();
    }

    @Override // hydromechanics.trm.attabal
    public void onTrackSelectionsInvalidated() {
        this.f12325dovishness.sendEmptyMessage(10);
    }

    public void osteal(boolean z, int i, int i2) {
        this.f12325dovishness.obtainMessage(1, z ? 1 : 0, i | (i2 << 4)).attabal();
    }

    public void outmarry(androidx.media3.common.oilcan oilcanVar, int i, long j) {
        this.f12325dovishness.obtainMessage(3, new impromptu(oilcanVar, i, j)).attabal();
    }

    public final void overspeculate() {
        boolean zLinendraper = linendraper();
        this.f12335mathsort = zLinendraper;
        if (zLinendraper) {
            this.f12331kattegat.impassible().marial(this.f12360timberyard, this.f12362trm.getPlaybackParameters().f11261attabal, this.f12343peridotite);
        }
        miliaria();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r5 r6 r8
  0x00a4: PHI (r5v3 androidx.media3.exoplayer.source.formularize$saneness) = 
  (r5v2 androidx.media3.exoplayer.source.formularize$saneness)
  (r5v6 androidx.media3.exoplayer.source.formularize$saneness)
 binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r8v3 long) = (r8v2 long), (r8v8 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[PHI: r0
  0x00eb: PHI (r0v10 androidx.media3.common.oilcan) = 
  (r0v9 androidx.media3.common.oilcan)
  (r0v9 androidx.media3.common.oilcan)
  (r0v20 androidx.media3.common.oilcan)
  (r0v20 androidx.media3.common.oilcan)
 binds: [B:36:0x00b1, B:38:0x00b5, B:40:0x00c6, B:42:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    public final void palmyra(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        androidx.media3.common.oilcan oilcanVar;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar;
        this.f12325dovishness.removeMessages(2);
        this.f12319coffeecake = null;
        tout(false, true);
        this.f12362trm.competently();
        this.f12360timberyard = 1000000000000L;
        for (homozygous homozygousVar : this.f12332kowloon) {
            try {
                polloi(homozygousVar);
            } catch (ExoPlaybackException | RuntimeException e) {
                decarock.triweekly.wireman("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            for (homozygous homozygousVar2 : this.f12332kowloon) {
                if (this.f12317arytenoidectomy.remove(homozygousVar2)) {
                    try {
                        homozygousVar2.reset();
                    } catch (RuntimeException e2) {
                        decarock.triweekly.wireman("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.f12323cultivated = 0;
        setterwort setterwortVar = this.f12352saran;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = setterwortVar.f12419saneness;
        long jLongValue = setterwortVar.f12416molybdenite;
        long j = (this.f12352saran.f12419saneness.saneness() || splinterproof(this.f12352saran, this.f12320cord)) ? this.f12352saran.f12409dern : this.f12352saran.f12416molybdenite;
        if (z2) {
            this.f12347premeiotic = null;
            Pair<androidx.media3.exoplayer.source.formularize.saneness, Long> pairOilcan = oilcan(this.f12352saran.f12405attabal);
            sanenessVar2 = (androidx.media3.exoplayer.source.formularize.saneness) pairOilcan.first;
            jLongValue = ((Long) pairOilcan.second).longValue();
            boolean zEquals = sanenessVar2.equals(this.f12352saran.f12419saneness);
            j = C.TIME_UNSET;
            z5 = zEquals ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.f12331kattegat.beachfront();
        this.f12335mathsort = false;
        androidx.media3.common.oilcan oilcanVarYemenite = this.f12352saran.f12405attabal;
        if (z3 && (oilcanVarYemenite instanceof attendance)) {
            oilcanVarYemenite = ((attendance) oilcanVarYemenite).yemenite(this.f12359supplicat.monoploid());
            if (sanenessVar2.f12521saneness != -1) {
                oilcanVarYemenite.impromptu(sanenessVar2.f12518attabal, this.f12320cord);
                if (oilcanVarYemenite.triweekly(this.f12320cord.f11137dern, this.f12348preprohormone).beachfront()) {
                    oilcanVar = oilcanVarYemenite;
                    sanenessVar = new androidx.media3.exoplayer.source.formularize.saneness(sanenessVar2.f12518attabal, sanenessVar2.f12522wireman);
                } else {
                    oilcanVar = oilcanVarYemenite;
                    sanenessVar = sanenessVar2;
                }
            } else {
                oilcanVar = oilcanVarYemenite;
                sanenessVar = sanenessVar2;
            }
        } else {
            oilcanVar = oilcanVarYemenite;
            sanenessVar = sanenessVar2;
        }
        setterwort setterwortVar2 = this.f12352saran;
        int i = setterwortVar2.f12415marial;
        ExoPlaybackException exoPlaybackException = z4 ? null : setterwortVar2.f12406beachfront;
        ethene.restrictive restrictiveVar = z5 ? ethene.restrictive.f26058wireman : setterwortVar2.f12413impromptu;
        hydromechanics.oilcan oilcanVar2 = z5 ? this.f12338molybdenite : setterwortVar2.f12420taiyuan;
        List listOf = z5 ? ImmutableList.of() : setterwortVar2.f12408cutely;
        setterwort setterwortVar3 = this.f12352saran;
        this.f12352saran = new setterwort(oilcanVar, sanenessVar, j3, j2, i, exoPlaybackException, false, restrictiveVar, oilcanVar2, listOf, sanenessVar, setterwortVar3.f12410formularize, setterwortVar3.f12412impassible, setterwortVar3.f12421triweekly, setterwortVar3.f12414kowloon, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f12331kattegat.kattegat();
            this.f12359supplicat.preprohormone();
        }
    }

    public final boolean permissivist() throws ExoPlaybackException {
        wostteth wosttethVarMolybdenite;
        this.f12331kattegat.yemenite(this.f12360timberyard);
        boolean z = false;
        if (this.f12331kattegat.saran() && (wosttethVarMolybdenite = this.f12331kattegat.molybdenite(this.f12360timberyard, this.f12352saran)) != null) {
            preterite preteriteVarCompetently = this.f12331kattegat.competently(wosttethVarMolybdenite);
            preteriteVarCompetently.f12287attabal.competently(this, wosttethVarMolybdenite.f13009saneness);
            if (this.f12331kattegat.graveside() == preteriteVarCompetently) {
                monroe(wosttethVarMolybdenite.f13009saneness);
            }
            merc(false);
            z = true;
        }
        if (!this.f12335mathsort) {
            overspeculate();
            return z;
        }
        this.f12335mathsort = walach();
        miliaria();
        return z;
    }

    public final void picketboat() throws ExoPlaybackException {
        gusty();
        dhss(true);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
    public final void polder(androidx.media3.common.oilcan oilcanVar, boolean z) throws Throwable {
        int i;
        androidx.media3.common.oilcan oilcanVar2;
        long j;
        Object obj;
        boolean z2;
        int i2;
        oilcanVar = oilcanVar;
        competently competentlyVarClaque = claque(oilcanVar, this.f12352saran, this.f12347premeiotic, this.f12331kattegat, this.f12356splinterproof, this.f12342overspeculate, this.f12348preprohormone, this.f12320cord);
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = competentlyVarClaque.f12366attabal;
        long j2 = competentlyVarClaque.f12368dern;
        boolean z3 = competentlyVarClaque.f12371wireman;
        long j3 = competentlyVarClaque.f12370saneness;
        int i3 = 1;
        boolean z4 = (this.f12352saran.f12419saneness.equals(sanenessVar) && j3 == this.f12352saran.f12416molybdenite) ? false : true;
        try {
            if (competentlyVarClaque.f12369marial) {
                if (this.f12352saran.f12415marial != 1) {
                    demilitarize(4);
                }
                palmyra(false, false, false, true);
            }
            for (homozygous homozygousVar : this.f12332kowloon) {
                homozygousVar.graveside(oilcanVar);
            }
            try {
                if (z4) {
                    i = 4;
                    i3 = -1;
                    if (!oilcanVar.monoploid()) {
                        for (preterite preteriteVarGraveside = this.f12331kattegat.graveside(); preteriteVarGraveside != null; preteriteVarGraveside = preteriteVarGraveside.apical()) {
                            if (preteriteVarGraveside.f12288beachfront.f13003attabal.equals(sanenessVar)) {
                                preteriteVarGraveside.f12288beachfront = this.f12331kattegat.dovishness(oilcanVar, preteriteVarGraveside.f12288beachfront);
                                preteriteVarGraveside.trm();
                            }
                        }
                        j3 = setterwort(sanenessVar, j3, z3);
                    }
                } else {
                    try {
                        try {
                            i = 4;
                            i3 = -1;
                            try {
                                oilcanVar = oilcanVar;
                                if (!this.f12331kattegat.starveling(oilcanVar, this.f12360timberyard, trm())) {
                                    dhss(false);
                                }
                            } catch (Throwable th) {
                                th = th;
                                oilcanVar = oilcanVar;
                                oilcanVar2 = oilcanVar;
                                setterwort setterwortVar = this.f12352saran;
                                androidx.media3.common.oilcan oilcanVar3 = setterwortVar.f12405attabal;
                                androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = setterwortVar.f12419saneness;
                                if (competentlyVarClaque.f12367beachfront) {
                                    j = j3;
                                } else {
                                    j = -9223372036854775807L;
                                }
                                rajahship(oilcanVar2, sanenessVar, oilcanVar3, sanenessVar2, j, false);
                                if (z4 || j2 != this.f12352saran.f12409dern) {
                                    setterwort setterwortVar2 = this.f12352saran;
                                    obj = setterwortVar2.f12419saneness.f12518attabal;
                                    androidx.media3.common.oilcan oilcanVar4 = setterwortVar2.f12405attabal;
                                    if (z4 || !z || oilcanVar4.monoploid() || oilcanVar4.impromptu(obj, this.f12320cord).f11135beachfront) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    long j4 = this.f12352saran.f12422wireman;
                                    if (oilcanVar2.saneness(obj) == i3) {
                                        i2 = i;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.f12352saran = privatdozent(sanenessVar, j3, j2, j4, z2, i2);
                                }
                                lightstruck();
                                unconsolidated(oilcanVar2, this.f12352saran.f12405attabal);
                                this.f12352saran = this.f12352saran.cutely(oilcanVar2);
                                if (!oilcanVar2.monoploid()) {
                                    this.f12347premeiotic = null;
                                }
                                merc(false);
                                this.f12325dovishness.sendEmptyMessage(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i = 4;
                            i3 = -1;
                            oilcanVar2 = oilcanVar;
                            setterwort setterwortVar3 = this.f12352saran;
                            androidx.media3.common.oilcan oilcanVar5 = setterwortVar3.f12405attabal;
                            androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = setterwortVar3.f12419saneness;
                            if (competentlyVarClaque.f12367beachfront) {
                                j = j3;
                            } else {
                                j = -9223372036854775807L;
                            }
                            rajahship(oilcanVar2, sanenessVar, oilcanVar5, sanenessVar3, j, false);
                            if (z4) {
                                setterwort setterwortVar4 = this.f12352saran;
                                obj = setterwortVar4.f12419saneness.f12518attabal;
                                androidx.media3.common.oilcan oilcanVar6 = setterwortVar4.f12405attabal;
                                if (z4) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                long j5 = this.f12352saran.f12422wireman;
                                if (oilcanVar2.saneness(obj) == i3) {
                                    i2 = i;
                                } else {
                                    i2 = 3;
                                }
                                this.f12352saran = privatdozent(sanenessVar, j3, j2, j5, z2, i2);
                            } else {
                                setterwort setterwortVar5 = this.f12352saran;
                                obj = setterwortVar5.f12419saneness.f12518attabal;
                                androidx.media3.common.oilcan oilcanVar7 = setterwortVar5.f12405attabal;
                                if (z4) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                long j6 = this.f12352saran.f12422wireman;
                                if (oilcanVar2.saneness(obj) == i3) {
                                    i2 = i;
                                } else {
                                    i2 = 3;
                                }
                                this.f12352saran = privatdozent(sanenessVar, j3, j2, j6, z2, i2);
                            }
                            lightstruck();
                            unconsolidated(oilcanVar2, this.f12352saran.f12405attabal);
                            this.f12352saran = this.f12352saran.cutely(oilcanVar2);
                            if (!oilcanVar2.monoploid()) {
                                this.f12347premeiotic = null;
                            }
                            merc(false);
                            this.f12325dovishness.sendEmptyMessage(2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = 4;
                    }
                }
                setterwort setterwortVar6 = this.f12352saran;
                rajahship(oilcanVar, sanenessVar, setterwortVar6.f12405attabal, setterwortVar6.f12419saneness, competentlyVarClaque.f12367beachfront ? j3 : -9223372036854775807L, false);
                if (z4 || j2 != this.f12352saran.f12409dern) {
                    setterwort setterwortVar7 = this.f12352saran;
                    Object obj2 = setterwortVar7.f12419saneness.f12518attabal;
                    androidx.media3.common.oilcan oilcanVar8 = setterwortVar7.f12405attabal;
                    this.f12352saran = privatdozent(sanenessVar, j3, j2, this.f12352saran.f12422wireman, z4 && z && !oilcanVar8.monoploid() && !oilcanVar8.impromptu(obj2, this.f12320cord).f11135beachfront, oilcanVar.saneness(obj2) == i3 ? i : 3);
                }
                lightstruck();
                unconsolidated(oilcanVar, this.f12352saran.f12405attabal);
                this.f12352saran = this.f12352saran.cutely(oilcanVar);
                if (!oilcanVar.monoploid()) {
                    this.f12347premeiotic = null;
                }
                merc(false);
                this.f12325dovishness.sendEmptyMessage(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            i = 4;
            i3 = -1;
        }
    }

    public final void polloi(homozygous homozygousVar) throws ExoPlaybackException {
        if (peridotite(homozygousVar)) {
            this.f12362trm.attabal(homozygousVar);
            gintrap(homozygousVar);
            homozygousVar.disable();
            this.f12323cultivated--;
        }
    }

    public final void prefect(boolean z) throws ExoPlaybackException {
        this.f12357starveling = z;
        lightstruck();
        if (!this.f12329hydrovane || this.f12331kattegat.adultoid() == this.f12331kattegat.graveside()) {
            return;
        }
        dhss(true);
        merc(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final void premeiotic() throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        while (sultanate()) {
            if (z2) {
                clubfoot();
            }
            preterite preteriteVar = (preterite) decarock.attabal.marial(this.f12331kattegat.saneness());
            if (this.f12352saran.f12419saneness.f12518attabal.equals(preteriteVar.f12288beachfront.f13003attabal.f12518attabal)) {
                androidx.media3.exoplayer.source.formularize.saneness sanenessVar = this.f12352saran.f12419saneness;
                if (sanenessVar.f12521saneness == -1) {
                    androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = preteriteVar.f12288beachfront.f13003attabal;
                    if (sanenessVar2.f12521saneness != -1 || sanenessVar.f12520marial == sanenessVar2.f12520marial) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            wostteth wosttethVar = preteriteVar.f12288beachfront;
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = wosttethVar.f13003attabal;
            long j = wosttethVar.f13009saneness;
            this.f12352saran = privatdozent(sanenessVar3, j, wosttethVar.f13006dern, j, !z, 0);
            lightstruck();
            ctenidium();
            if (this.f12352saran.f12415marial == 3) {
                tailoring();
            }
            triweekly();
            z2 = true;
        }
    }

    public final ImmutableList<Metadata> preprohormone(hydromechanics.rotuma[] rotumaVarArr) {
        ImmutableList.attabal attabalVar = new ImmutableList.attabal();
        boolean z = false;
        for (hydromechanics.rotuma rotumaVar : rotumaVarArr) {
            if (rotumaVar != null) {
                Metadata metadata = rotumaVar.getFormat(0).f11185apical;
                if (metadata == null) {
                    attabalVar.attabal(new Metadata(new Metadata.Entry[0]));
                } else {
                    attabalVar.attabal(metadata);
                    z = true;
                }
            }
        }
        return z ? attabalVar.impassible() : ImmutableList.of();
    }

    public final void preterite(int i, int i2, ethene.oilcan oilcanVar) throws Throwable {
        this.f12349privatdozent.saneness(1);
        polder(this.f12359supplicat.cuirassed(i, i2, oilcanVar), false);
    }

    public final setterwort privatdozent(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, long j2, long j3, boolean z, int i) {
        List<Metadata> list;
        ethene.restrictive restrictiveVar;
        hydromechanics.oilcan oilcanVar;
        this.f12330itchy = (!this.f12330itchy && j == this.f12352saran.f12416molybdenite && sanenessVar.equals(this.f12352saran.f12419saneness)) ? false : true;
        lightstruck();
        setterwort setterwortVar = this.f12352saran;
        ethene.restrictive restrictiveVar2 = setterwortVar.f12413impromptu;
        hydromechanics.oilcan oilcanVar2 = setterwortVar.f12420taiyuan;
        List<Metadata> listOf = setterwortVar.f12408cutely;
        if (this.f12359supplicat.graveside()) {
            preterite preteriteVarGraveside = this.f12331kattegat.graveside();
            ethene.restrictive restrictiveVarKowloon = preteriteVarGraveside == null ? ethene.restrictive.f26058wireman : preteriteVarGraveside.kowloon();
            hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarGraveside == null ? this.f12338molybdenite : preteriteVarGraveside.arytenoidectomy();
            ImmutableList<Metadata> immutableListPreprohormone = preprohormone(oilcanVarArytenoidectomy.f28178dern);
            if (preteriteVarGraveside != null) {
                wostteth wosttethVar = preteriteVarGraveside.f12288beachfront;
                if (wosttethVar.f13006dern != j2) {
                    preteriteVarGraveside.f12288beachfront = wosttethVar.attabal(j2);
                }
            }
            cultivated();
            restrictiveVar = restrictiveVarKowloon;
            oilcanVar = oilcanVarArytenoidectomy;
            list = immutableListPreprohormone;
        } else {
            if (!sanenessVar.equals(this.f12352saran.f12419saneness)) {
                restrictiveVar2 = ethene.restrictive.f26058wireman;
                oilcanVar2 = this.f12338molybdenite;
                listOf = ImmutableList.of();
            }
            list = listOf;
            restrictiveVar = restrictiveVar2;
            oilcanVar = oilcanVar2;
        }
        if (z) {
            this.f12349privatdozent.wireman(i);
        }
        return this.f12352saran.wireman(sanenessVar, j, j2, j3, sealless(), restrictiveVar, oilcanVar, list);
    }

    public final void pruinose(molet moletVar) {
        this.f12328grimness = moletVar;
    }

    public final void puffin() throws ExoPlaybackException {
        if (this.f12352saran.f12405attabal.monoploid() || !this.f12359supplicat.graveside()) {
            return;
        }
        boolean zPermissivist = permissivist();
        milliradian();
        treadless();
        premeiotic();
        timberyard(zPermissivist);
    }

    public final void rajahship(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan oilcanVar2, androidx.media3.exoplayer.source.formularize.saneness sanenessVar2, long j, boolean z) throws ExoPlaybackException {
        if (!decarock(oilcanVar, sanenessVar)) {
            androidx.media3.common.preprohormone preprohormoneVar = sanenessVar.saneness() ? androidx.media3.common.preprohormone.f11260wireman : this.f12352saran.f12414kowloon;
            if (this.f12362trm.getPlaybackParameters().equals(preprohormoneVar)) {
                return;
            }
            sakeen(preprohormoneVar);
            grimness(this.f12352saran.f12414kowloon, preprohormoneVar.f11261attabal, false, false);
            return;
        }
        oilcanVar.triweekly(oilcanVar.impromptu(sanenessVar.f12518attabal, this.f12320cord).f11137dern, this.f12348preprohormone);
        this.f12350restrictive.attabal((androidx.media3.common.adultoid.competently) decarock.grimness.impromptu(this.f12348preprohormone.f11118cutely));
        if (j != C.TIME_UNSET) {
            this.f12350restrictive.marial(stratoscope(oilcanVar, sanenessVar.f12518attabal, j));
            return;
        }
        if (!decarock.grimness.dern(!oilcanVar2.monoploid() ? oilcanVar2.triweekly(oilcanVar2.impromptu(sanenessVar2.f12518attabal, this.f12320cord).f11137dern, this.f12348preprohormone).f11115attabal : null, this.f12348preprohormone.f11115attabal) || z) {
            this.f12350restrictive.marial(C.TIME_UNSET);
        }
    }

    public final void restrictive(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i);
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        if (preteriteVarGraveside != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(preteriteVarGraveside.f12288beachfront.f13003attabal);
        }
        decarock.triweekly.wireman("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForSource);
        vir(false, false);
        this.f12352saran = this.f12352saran.beachfront(exoPlaybackExceptionCreateForSource);
    }

    public void rotuma(long j) {
        this.f12333lerp = j;
    }

    public final void sakeen(androidx.media3.common.preprohormone preprohormoneVar) {
        this.f12325dovishness.removeMessages(16);
        this.f12362trm.saneness(preprohormoneVar);
    }

    @Override // androidx.media3.exoplayer.vesuvio.wireman
    public void saneness() {
        this.f12325dovishness.removeMessages(2);
        this.f12325dovishness.sendEmptyMessage(22);
    }

    public final void saran(androidx.media3.common.preprohormone preprohormoneVar, boolean z) throws ExoPlaybackException {
        grimness(preprohormoneVar, preprohormoneVar.f11261attabal, true, z);
    }

    @Override // androidx.media3.exoplayer.source.adultoid.attabal
    /* JADX INFO: renamed from: sayid, reason: merged with bridge method [inline-methods] */
    public void wireman(androidx.media3.exoplayer.source.apical apicalVar) {
        this.f12325dovishness.obtainMessage(9, apicalVar).attabal();
    }

    public final long sealless() {
        return kattegat(this.f12352saran.f12417monoploid);
    }

    public final void seminary(androidx.media3.exoplayer.source.apical apicalVar) throws ExoPlaybackException {
        if (this.f12331kattegat.stratoscope(apicalVar)) {
            preterite preteriteVarImpassible = this.f12331kattegat.impassible();
            preteriteVarImpassible.monoploid(this.f12362trm.getPlaybackParameters().f11261attabal, this.f12352saran.f12405attabal);
            incorrectly(preteriteVarImpassible.f12288beachfront.f13003attabal, preteriteVarImpassible.kowloon(), preteriteVarImpassible.arytenoidectomy());
            if (preteriteVarImpassible == this.f12331kattegat.graveside()) {
                monroe(preteriteVarImpassible.f12288beachfront.f13009saneness);
                adultoid();
                setterwort setterwortVar = this.f12352saran;
                androidx.media3.exoplayer.source.formularize.saneness sanenessVar = setterwortVar.f12419saneness;
                long j = preteriteVarImpassible.f12288beachfront.f13009saneness;
                this.f12352saran = privatdozent(sanenessVar, j, setterwortVar.f12409dern, j, false, 5);
            }
            overspeculate();
        }
    }

    public final void sensatory() {
        try {
            palmyra(true, false, true, false);
            underbelly();
            this.f12327graveside.beachfront(this.f12345polder);
            demilitarize(1);
            HandlerThread handlerThread = this.f12326gintrap;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f12321creditor = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f12326gintrap;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f12321creditor = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final long setterwort(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, boolean z) throws ExoPlaybackException {
        return mastfed(sanenessVar, j, this.f12331kattegat.graveside() != this.f12331kattegat.adultoid(), z);
    }

    public final boolean starveling() {
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        if (!preteriteVarAdultoid.f12300wireman) {
            return false;
        }
        int i = 0;
        while (true) {
            homozygous[] homozygousVarArr = this.f12332kowloon;
            if (i >= homozygousVarArr.length) {
                return true;
            }
            homozygous homozygousVar = homozygousVarArr[i];
            ethene.trm trmVar = preteriteVarAdultoid.f12291dern[i];
            if (homozygousVar.getStream() != trmVar || (trmVar != null && !homozygousVar.hasReadStreamToEnd() && !creditor(homozygousVar, preteriteVarAdultoid))) {
                return false;
            }
            i++;
        }
    }

    public final long stratoscope(androidx.media3.common.oilcan oilcanVar, Object obj, long j) {
        oilcanVar.triweekly(oilcanVar.impromptu(obj, this.f12320cord).f11137dern, this.f12348preprohormone);
        androidx.media3.common.oilcan.dern dernVar = this.f12348preprohormone;
        if (dernVar.f11116beachfront != C.TIME_UNSET && dernVar.beachfront()) {
            androidx.media3.common.oilcan.dern dernVar2 = this.f12348preprohormone;
            if (dernVar2.f11126taiyuan) {
                return decarock.grimness.outmarry(dernVar2.attabal() - this.f12348preprohormone.f11116beachfront) - (j + this.f12320cord.triweekly());
            }
        }
        return C.TIME_UNSET;
    }

    public final boolean stupefactive() {
        setterwort setterwortVar = this.f12352saran;
        return setterwortVar.f12410formularize && setterwortVar.f12421triweekly == 0;
    }

    public final boolean sultanate() {
        preterite preteriteVarGraveside;
        preterite preteriteVarApical;
        return stupefactive() && !this.f12329hydrovane && (preteriteVarGraveside = this.f12331kattegat.graveside()) != null && (preteriteVarApical = preteriteVarGraveside.apical()) != null && this.f12360timberyard >= preteriteVarApical.triweekly() && preteriteVarApical.f12289competently;
    }

    public final void supplicat(androidx.media3.exoplayer.source.apical apicalVar) {
        if (this.f12331kattegat.stratoscope(apicalVar)) {
            this.f12331kattegat.yemenite(this.f12360timberyard);
            overspeculate();
        }
    }

    public final void tailoring() throws ExoPlaybackException {
        preterite preteriteVarGraveside = this.f12331kattegat.graveside();
        if (preteriteVarGraveside == null) {
            return;
        }
        hydromechanics.oilcan oilcanVarArytenoidectomy = preteriteVarGraveside.arytenoidectomy();
        for (int i = 0; i < this.f12332kowloon.length; i++) {
            if (oilcanVarArytenoidectomy.dern(i) && this.f12332kowloon[i].getState() == 1) {
                this.f12332kowloon[i].start();
            }
        }
    }

    public final void tarboosh(boolean z) throws ExoPlaybackException {
        this.f12342overspeculate = z;
        if (!this.f12331kattegat.walach(this.f12352saran.f12405attabal, z)) {
            dhss(true);
        }
        merc(false);
    }

    public final void technofreak(long j) {
        long jMin = (this.f12352saran.f12415marial != 3 || (!this.f12355seminary && stupefactive())) ? f12315empress : 1000L;
        if (this.f12355seminary && stupefactive()) {
            for (homozygous homozygousVar : this.f12332kowloon) {
                if (peridotite(homozygousVar)) {
                    jMin = Math.min(jMin, decarock.grimness.sultanate(homozygousVar.molybdenite(this.f12360timberyard, this.f12337milliradian)));
                }
            }
        }
        this.f12325dovishness.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void tectonization(boolean z) {
        if (z == this.f12344permissivist) {
            return;
        }
        this.f12344permissivist = z;
        if (z || !this.f12352saran.f12404arytenoidectomy) {
            return;
        }
        this.f12325dovishness.sendEmptyMessage(2);
    }

    public final void timberyard(boolean z) {
        if (this.f12334lotta.f11495attabal != C.TIME_UNSET) {
            if (z || !this.f12352saran.f12405attabal.equals(this.f12353sayid)) {
                androidx.media3.common.oilcan oilcanVar = this.f12352saran.f12405attabal;
                this.f12353sayid = oilcanVar;
                this.f12331kattegat.rotuma(oilcanVar);
            }
        }
    }

    public final void tout(boolean z, boolean z2) {
        this.f12363walach = z;
        this.f12343peridotite = (!z || z2) ? C.TIME_UNSET : this.f12364yemenite.elapsedRealtime();
    }

    public final void treadless() throws ExoPlaybackException {
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        if (preteriteVarAdultoid == null || this.f12331kattegat.graveside() == preteriteVarAdultoid || preteriteVarAdultoid.f12289competently || !igbo()) {
            return;
        }
        adultoid();
    }

    public final void triweekly() {
        hydromechanics.oilcan oilcanVarArytenoidectomy = this.f12331kattegat.graveside().arytenoidectomy();
        for (int i = 0; i < this.f12332kowloon.length; i++) {
            if (oilcanVarArytenoidectomy.dern(i)) {
                this.f12332kowloon[i].dern();
            }
        }
    }

    public final long trm() {
        preterite preteriteVarAdultoid = this.f12331kattegat.adultoid();
        if (preteriteVarAdultoid == null) {
            return 0L;
        }
        long jImpassible = preteriteVarAdultoid.impassible();
        if (!preteriteVarAdultoid.f12300wireman) {
            return jImpassible;
        }
        int i = 0;
        while (true) {
            homozygous[] homozygousVarArr = this.f12332kowloon;
            if (i >= homozygousVarArr.length) {
                return jImpassible;
            }
            if (peridotite(homozygousVarArr[i]) && this.f12332kowloon[i].getStream() == preteriteVarAdultoid.f12291dern[i]) {
                long jCord = this.f12332kowloon[i].cord();
                if (jCord == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jImpassible = Math.max(jCord, jImpassible);
            }
            i++;
        }
    }

    public final void twybill() throws ExoPlaybackException {
        this.f12362trm.competently();
        for (homozygous homozygousVar : this.f12332kowloon) {
            if (peridotite(homozygousVar)) {
                gintrap(homozygousVar);
            }
        }
    }

    public final void unconsolidated(androidx.media3.common.oilcan oilcanVar, androidx.media3.common.oilcan oilcanVar2) {
        if (oilcanVar.monoploid() && oilcanVar2.monoploid()) {
            return;
        }
        int size = this.f12341oilcan.size() - 1;
        while (size >= 0) {
            androidx.media3.common.oilcan oilcanVar3 = oilcanVar;
            androidx.media3.common.oilcan oilcanVar4 = oilcanVar2;
            if (!achondroplasia(this.f12341oilcan.get(size), oilcanVar3, oilcanVar4, this.f12356splinterproof, this.f12342overspeculate, this.f12348preprohormone, this.f12320cord)) {
                this.f12341oilcan.get(size).f12389kowloon.apical(false);
                this.f12341oilcan.remove(size);
            }
            size--;
            oilcanVar = oilcanVar3;
            oilcanVar2 = oilcanVar4;
        }
        Collections.sort(this.f12341oilcan);
    }

    public final void undecorated(float f) {
        for (preterite preteriteVarGraveside = this.f12331kattegat.graveside(); preteriteVarGraveside != null; preteriteVarGraveside = preteriteVarGraveside.apical()) {
            for (hydromechanics.rotuma rotumaVar : preteriteVarGraveside.arytenoidectomy().f28178dern) {
                if (rotumaVar != null) {
                    rotumaVar.onPlaybackSpeed(f);
                }
            }
        }
    }

    public final void underbelly() {
        for (int i = 0; i < this.f12332kowloon.length; i++) {
            this.f12339monoploid[i].wireman();
            this.f12332kowloon[i].release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void vesuvio(impromptu impromptuVar) throws Throwable {
        long jLongValue;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVarPolder;
        long j;
        boolean z;
        long j2;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar;
        long j3;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2;
        preterite preteriteVarGraveside;
        long jMarial;
        setterwort setterwortVar;
        int i;
        int i2;
        long j4;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar3;
        long j5;
        boolean z2;
        long j6;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar4;
        long j7;
        sayid sayidVar = this;
        sayidVar.f12349privatdozent.saneness(1);
        Pair<Object, Long> pairHardpan = hardpan(sayidVar.f12352saran.f12405attabal, impromptuVar, true, sayidVar.f12356splinterproof, sayidVar.f12342overspeculate, sayidVar.f12348preprohormone, sayidVar.f12320cord);
        try {
            if (pairHardpan != null) {
                Object obj = pairHardpan.first;
                jLongValue = ((Long) pairHardpan.second).longValue();
                long j8 = impromptuVar.f12377dern == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                sanenessVarPolder = sayidVar.f12331kattegat.polder(sayidVar.f12352saran.f12405attabal, obj, jLongValue);
                if (sanenessVarPolder.saneness()) {
                    sayidVar.f12352saran.f12405attabal.impromptu(sanenessVarPolder.f12518attabal, sayidVar.f12320cord);
                    jLongValue = sayidVar.f12320cord.apical(sanenessVarPolder.f12521saneness) == sanenessVarPolder.f12519dern ? sayidVar.f12320cord.competently() : 0L;
                    z = true;
                    j2 = j8;
                } else {
                    j = 0;
                    z = impromptuVar.f12377dern == C.TIME_UNSET;
                    j2 = j8;
                }
                if (sayidVar.f12352saran.f12405attabal.monoploid()) {
                    if (pairHardpan == null) {
                        if (sayidVar.f12352saran.f12415marial != 1) {
                            sayidVar.demilitarize(4);
                        }
                        sayidVar.palmyra(false, true, false, true);
                    } else {
                        if (sanenessVarPolder.equals(sayidVar.f12352saran.f12419saneness)) {
                            try {
                                preteriteVarGraveside = sayidVar.f12331kattegat.graveside();
                                if (preteriteVarGraveside == null && preteriteVarGraveside.f12300wireman && jLongValue != j) {
                                    jMarial = preteriteVarGraveside.f12287attabal.marial(jLongValue, sayidVar.f12328grimness);
                                } else {
                                    jMarial = jLongValue;
                                }
                                sanenessVar2 = sanenessVarPolder;
                                try {
                                    if (decarock.grimness.sultanate(jMarial) != decarock.grimness.sultanate(sayidVar.f12352saran.f12416molybdenite) && ((i = (setterwortVar = sayidVar.f12352saran).f12415marial) == 2 || i == 3)) {
                                        long j9 = setterwortVar.f12416molybdenite;
                                        i2 = 2;
                                        z = z;
                                        j4 = j9;
                                        sanenessVar3 = sanenessVar2;
                                        j5 = j9;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = z;
                                    sanenessVar = sanenessVar2;
                                    j3 = jLongValue;
                                    sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar, j3, j2, j3, z, 2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z = z;
                                sanenessVar2 = sanenessVarPolder;
                            }
                        } else {
                            sanenessVar2 = sanenessVarPolder;
                            jMarial = jLongValue;
                        }
                        try {
                            if (sayidVar.f12352saran.f12415marial == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            j6 = sayidVar.setterwort(sanenessVar2, jMarial, z2);
                            z |= jLongValue != j6;
                            try {
                                setterwort setterwortVar2 = sayidVar.f12352saran;
                                androidx.media3.common.oilcan oilcanVar = setterwortVar2.f12405attabal;
                                sanenessVar4 = sanenessVar2;
                                j7 = j2;
                                try {
                                    sayidVar.rajahship(oilcanVar, sanenessVar4, oilcanVar, setterwortVar2.f12419saneness, j7, true);
                                    sanenessVar3 = sanenessVar4;
                                    j2 = j7;
                                    j5 = j6;
                                    i2 = 2;
                                    j4 = j5;
                                    sayidVar = this;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sanenessVar = sanenessVar4;
                                    j2 = j7;
                                    j3 = j6;
                                    sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar, j3, j2, j3, z, 2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sanenessVar = sanenessVar2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            sanenessVar = sanenessVar2;
                            j3 = jLongValue;
                            sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar, j3, j2, j3, z, 2);
                            throw th;
                        }
                    }
                    sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar3, j5, j2, j4, z, i2);
                    return;
                }
                sayidVar.f12347premeiotic = impromptuVar;
                z = z;
                sanenessVar3 = sanenessVarPolder;
                j5 = jLongValue;
                i2 = 2;
                j4 = j5;
                sayidVar = this;
                sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar3, j5, j2, j4, z, i2);
                return;
            }
            Pair<androidx.media3.exoplayer.source.formularize.saneness, Long> pairOilcan = sayidVar.oilcan(sayidVar.f12352saran.f12405attabal);
            sanenessVarPolder = (androidx.media3.exoplayer.source.formularize.saneness) pairOilcan.first;
            jLongValue = ((Long) pairOilcan.second).longValue();
            z = !sayidVar.f12352saran.f12405attabal.monoploid();
            j2 = -9223372036854775807L;
            if (sayidVar.f12352saran.f12405attabal.monoploid()) {
                if (pairHardpan == null) {
                    if (sayidVar.f12352saran.f12415marial != 1) {
                        sayidVar.demilitarize(4);
                    }
                    sayidVar.palmyra(false, true, false, true);
                } else {
                    if (sanenessVarPolder.equals(sayidVar.f12352saran.f12419saneness)) {
                        preteriteVarGraveside = sayidVar.f12331kattegat.graveside();
                        if (preteriteVarGraveside == null) {
                            jMarial = jLongValue;
                        } else {
                            jMarial = jLongValue;
                        }
                        sanenessVar2 = sanenessVarPolder;
                        if (decarock.grimness.sultanate(jMarial) != decarock.grimness.sultanate(sayidVar.f12352saran.f12416molybdenite)) {
                        }
                    } else {
                        sanenessVar2 = sanenessVarPolder;
                        jMarial = jLongValue;
                    }
                    if (sayidVar.f12352saran.f12415marial == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    j6 = sayidVar.setterwort(sanenessVar2, jMarial, z2);
                    z |= jLongValue != j6;
                    setterwort setterwortVar3 = sayidVar.f12352saran;
                    androidx.media3.common.oilcan oilcanVar2 = setterwortVar3.f12405attabal;
                    sanenessVar4 = sanenessVar2;
                    j7 = j2;
                    sayidVar.rajahship(oilcanVar2, sanenessVar4, oilcanVar2, setterwortVar3.f12419saneness, j7, true);
                    sanenessVar3 = sanenessVar4;
                    j2 = j7;
                    j5 = j6;
                    i2 = 2;
                    j4 = j5;
                    sayidVar = this;
                }
                sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar3, j5, j2, j4, z, i2);
                return;
            }
            sayidVar.f12347premeiotic = impromptuVar;
            z = z;
            sanenessVar3 = sanenessVarPolder;
            j5 = jLongValue;
            i2 = 2;
            j4 = j5;
            sayidVar = this;
            sayidVar.f12352saran = sayidVar.privatdozent(sanenessVar3, j5, j2, j4, z, i2);
            return;
        } catch (Throwable th6) {
            th = th6;
            z = z;
            sanenessVar = sanenessVarPolder;
        }
        j = 0;
    }

    public final void vir(boolean z, boolean z2) {
        palmyra(z || !this.f12318clubfoot, false, true, false);
        this.f12349privatdozent.saneness(z2 ? 1 : 0);
        this.f12327graveside.cutely(this.f12345polder);
        demilitarize(1);
    }

    public final boolean walach() {
        preterite preteriteVarImpassible = this.f12331kattegat.impassible();
        return (preteriteVarImpassible == null || preteriteVarImpassible.polloi() || preteriteVarImpassible.formularize() == Long.MIN_VALUE) ? false : true;
    }

    public void wostteth(int i, int i2, ethene.oilcan oilcanVar) {
        this.f12325dovishness.obtainMessage(20, i, i2, oilcanVar).attabal();
    }

    public Looper yemenite() {
        return this.f12351rotuma;
    }
}
