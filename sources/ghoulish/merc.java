package ghoulish;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class merc implements cybernatic.arytenoidectomy {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    @Deprecated
    public static final cybernatic.adultoid f26954dovishness = new cybernatic.adultoid() { // from class: ghoulish.restrictive
        @Override // cybernatic.adultoid
        public final cybernatic.arytenoidectomy[] createExtractors() {
            return merc.dern();
        }
    };

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f26955adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final SparseBooleanArray f26956apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f26957arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f26958attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final SparseIntArray f26959beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final polder.dern f26960competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final SparseBooleanArray f26961cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f26962dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final supplicat f26963formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f26964graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public kattegat f26965impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final strother.polloi.attabal f26966impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f26967kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final decarock.stratoscope f26968marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public polder f26969molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f26970monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f26971polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f26972saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final SparseArray<polder> f26973taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public cybernatic.polloi f26974triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<decarock.kattegat> f26975wireman;

    public merc(int i, strother.polloi.attabal attabalVar) {
        this(1, i, attabalVar, new decarock.kattegat(0L), new cutely(0), 112800);
    }

    public static /* synthetic */ cybernatic.arytenoidectomy[] dern() {
        return new cybernatic.arytenoidectomy[]{new merc(1, strother.polloi.attabal.f38202attabal)};
    }

    public static /* synthetic */ int formularize(merc mercVar) {
        int i = mercVar.f26967kowloon;
        mercVar.f26967kowloon = i + 1;
        return i;
    }

    private void rotuma(long j) {
        if (this.f26970monoploid) {
            return;
        }
        this.f26970monoploid = true;
        if (this.f26963formularize.saneness() == C.TIME_UNSET) {
            this.f26974triweekly.beachfront(new cybernatic.merc.saneness(this.f26963formularize.saneness()));
            return;
        }
        kattegat kattegatVar = new kattegat(this.f26963formularize.dern(), this.f26963formularize.saneness(), j, this.f26955adultoid, this.f26962dern);
        this.f26965impassible = kattegatVar;
        this.f26974triweekly.beachfront(kattegatVar.saneness());
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(cybernatic.monoploid monoploidVar) throws IOException {
        byte[] bArrMarial = this.f26968marial.marial();
        monoploidVar.peekFully(bArrMarial, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    monoploidVar.skipFully(i);
                    return true;
                }
                if (bArrMarial[(i2 * Opcodes.NEWARRAY) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        int i;
        long length = monoploidVar.getLength();
        boolean z = this.f26958attabal == 2;
        if (this.f26957arytenoidectomy) {
            if (length != -1 && !z && !this.f26963formularize.wireman()) {
                return this.f26963formularize.marial(monoploidVar, restrictiveVar, this.f26955adultoid);
            }
            rotuma(length);
            if (this.f26971polloi) {
                this.f26971polloi = false;
                seek(0L, 0L);
                if (monoploidVar.getPosition() != 0) {
                    restrictiveVar.f24743attabal = 0L;
                    return 1;
                }
            }
            kattegat kattegatVar = this.f26965impassible;
            if (kattegatVar != null && kattegatVar.wireman()) {
                return this.f26965impassible.dern(monoploidVar, restrictiveVar);
            }
        }
        if (!dovishness(monoploidVar)) {
            for (int i2 = 0; i2 < this.f26973taiyuan.size(); i2++) {
                polder polderVarValueAt = this.f26973taiyuan.valueAt(i2);
                if (polderVarValueAt instanceof preprohormone) {
                    preprohormone preprohormoneVar = (preprohormone) polderVarValueAt;
                    if (preprohormoneVar.dern(z)) {
                        preprohormoneVar.attabal(new decarock.stratoscope(), 1);
                    }
                }
            }
            return -1;
        }
        int iGintrap = gintrap();
        int iCompetently = this.f26968marial.competently();
        if (iGintrap > iCompetently) {
            return 0;
        }
        int iMonoploid = this.f26968marial.monoploid();
        if ((8388608 & iMonoploid) != 0) {
            this.f26968marial.mathsort(iGintrap);
            return 0;
        }
        int i3 = (4194304 & iMonoploid) != 0 ? 1 : 0;
        int i4 = (2096896 & iMonoploid) >> 8;
        boolean z2 = (iMonoploid & 32) != 0;
        polder polderVar = (iMonoploid & 16) != 0 ? this.f26973taiyuan.get(i4) : null;
        if (polderVar == null) {
            this.f26968marial.mathsort(iGintrap);
            return 0;
        }
        if (this.f26958attabal != 2) {
            int i5 = iMonoploid & 15;
            i = 0;
            int i6 = this.f26959beachfront.get(i4, i5 - 1);
            this.f26959beachfront.put(i4, i5);
            if (i6 == i5) {
                this.f26968marial.mathsort(iGintrap);
                return 0;
            }
            if (i5 != ((i6 + 1) & 15)) {
                polderVar.seek();
            }
        } else {
            i = 0;
        }
        if (z2) {
            int iSupplicat = this.f26968marial.supplicat();
            i3 |= (this.f26968marial.supplicat() & 64) != 0 ? 2 : i;
            this.f26968marial.splinterproof(iSupplicat - 1);
        }
        boolean z3 = this.f26957arytenoidectomy;
        if (cord(i4)) {
            this.f26968marial.peridotite(iGintrap);
            polderVar.attabal(this.f26968marial, i3);
            this.f26968marial.peridotite(iCompetently);
        }
        if (this.f26958attabal != 2 && !z3 && this.f26957arytenoidectomy && length != -1) {
            this.f26971polloi = true;
        }
        this.f26968marial.mathsort(iGintrap);
        return i;
    }

    public final boolean cord(int i) {
        return this.f26958attabal == 2 || this.f26957arytenoidectomy || !this.f26956apical.get(i, false);
    }

    public final boolean dovishness(cybernatic.monoploid monoploidVar) throws IOException {
        byte[] bArrMarial = this.f26968marial.marial();
        if (9400 - this.f26968marial.beachfront() < 188) {
            int iAttabal = this.f26968marial.attabal();
            if (iAttabal > 0) {
                System.arraycopy(bArrMarial, this.f26968marial.beachfront(), bArrMarial, 0, iAttabal);
            }
            this.f26968marial.walach(bArrMarial, iAttabal);
        }
        while (this.f26968marial.attabal() < 188) {
            int iCompetently = this.f26968marial.competently();
            int i = monoploidVar.read(bArrMarial, iCompetently, 9400 - iCompetently);
            if (i == -1) {
                return false;
            }
            this.f26968marial.peridotite(iCompetently + i);
        }
        return true;
    }

    public final int gintrap() throws ParserException {
        int iBeachfront = this.f26968marial.beachfront();
        int iCompetently = this.f26968marial.competently();
        int iAttabal = seminary.attabal(this.f26968marial.marial(), iBeachfront, iCompetently);
        this.f26968marial.mathsort(iAttabal);
        int i = iAttabal + Opcodes.NEWARRAY;
        if (i <= iCompetently) {
            this.f26964graveside = 0;
            return i;
        }
        int i2 = this.f26964graveside + (iAttabal - iBeachfront);
        this.f26964graveside = i2;
        if (this.f26958attabal != 2 || i2 <= 376) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(cybernatic.polloi polloiVar) {
        if ((this.f26972saneness & 1) == 0) {
            polloiVar = new strother.graveside(polloiVar, this.f26966impromptu);
        }
        this.f26974triweekly = polloiVar;
    }

    public final void preprohormone() {
        this.f26961cutely.clear();
        this.f26973taiyuan.clear();
        SparseArray<polder> sparseArrayCreateInitialPayloadReaders = this.f26960competently.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.f26973taiyuan.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
        }
        this.f26973taiyuan.put(0, new yemenite(new attabal()));
        this.f26969molybdenite = null;
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        kattegat kattegatVar;
        decarock.attabal.competently(this.f26958attabal != 2);
        int size = this.f26975wireman.size();
        for (int i = 0; i < size; i++) {
            decarock.kattegat kattegatVar2 = this.f26975wireman.get(i);
            boolean z = kattegatVar2.beachfront() == C.TIME_UNSET;
            if (!z) {
                long jWireman = kattegatVar2.wireman();
                z = (jWireman == C.TIME_UNSET || jWireman == 0 || jWireman == j2) ? false : true;
            }
            if (z) {
                kattegatVar2.taiyuan(j2);
            }
        }
        if (j2 != 0 && (kattegatVar = this.f26965impassible) != null) {
            kattegatVar.impromptu(j2);
        }
        this.f26968marial.starveling(0);
        this.f26959beachfront.clear();
        for (int i2 = 0; i2 < this.f26973taiyuan.size(); i2++) {
            this.f26973taiyuan.valueAt(i2).seek();
        }
        this.f26964graveside = 0;
    }

    public merc(int i, int i2, strother.polloi.attabal attabalVar, decarock.kattegat kattegatVar, polder.dern dernVar, int i3) {
        this.f26960competently = (polder.dern) decarock.attabal.marial(dernVar);
        this.f26962dern = i3;
        this.f26958attabal = i;
        this.f26972saneness = i2;
        this.f26966impromptu = attabalVar;
        if (i == 1 || i == 2) {
            this.f26975wireman = Collections.singletonList(kattegatVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f26975wireman = arrayList;
            arrayList.add(kattegatVar);
        }
        this.f26968marial = new decarock.stratoscope(new byte[9400], 0);
        this.f26961cutely = new SparseBooleanArray();
        this.f26956apical = new SparseBooleanArray();
        this.f26973taiyuan = new SparseArray<>();
        this.f26959beachfront = new SparseIntArray();
        this.f26963formularize = new supplicat(i3);
        this.f26974triweekly = cybernatic.polloi.f24724beachfront;
        this.f26955adultoid = -1;
        preprohormone();
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class attabal implements oilcan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final decarock.cuirassed f26976attabal = new decarock.cuirassed(new byte[4]);

        public attabal() {
        }

        @Override // ghoulish.oilcan
        public void attabal(decarock.stratoscope stratoscopeVar) {
            if (stratoscopeVar.supplicat() == 0 && (stratoscopeVar.supplicat() & 128) != 0) {
                stratoscopeVar.splinterproof(6);
                int iAttabal = stratoscopeVar.attabal() / 4;
                for (int i = 0; i < iAttabal; i++) {
                    stratoscopeVar.apical(this.f26976attabal, 4);
                    int iImpromptu = this.f26976attabal.impromptu(16);
                    this.f26976attabal.polloi(3);
                    if (iImpromptu == 0) {
                        this.f26976attabal.polloi(13);
                    } else {
                        int iImpromptu2 = this.f26976attabal.impromptu(13);
                        if (merc.this.f26973taiyuan.get(iImpromptu2) == null) {
                            merc.this.f26973taiyuan.put(iImpromptu2, new yemenite(merc.this.new saneness(iImpromptu2)));
                            merc.formularize(merc.this);
                        }
                    }
                }
                if (merc.this.f26958attabal != 2) {
                    merc.this.f26973taiyuan.remove(0);
                }
            }
        }

        @Override // ghoulish.oilcan
        public void saneness(decarock.kattegat kattegatVar, cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        }
    }

    /* JADX INFO: compiled from: TsExtractor.java */
    public class saneness implements oilcan {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f26982wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final decarock.cuirassed f26978attabal = new decarock.cuirassed(new byte[5]);

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final SparseArray<polder> f26981saneness = new SparseArray<>();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final SparseIntArray f26979dern = new SparseIntArray();

        public saneness(int i) {
            this.f26982wireman = i;
        }

        @Override // ghoulish.oilcan
        public void attabal(decarock.stratoscope stratoscopeVar) {
            decarock.kattegat kattegatVar;
            if (stratoscopeVar.supplicat() != 2) {
                return;
            }
            if (merc.this.f26958attabal == 1 || merc.this.f26958attabal == 2 || merc.this.f26967kowloon == 1) {
                kattegatVar = (decarock.kattegat) merc.this.f26975wireman.get(0);
            } else {
                kattegatVar = new decarock.kattegat(((decarock.kattegat) merc.this.f26975wireman.get(0)).wireman());
                merc.this.f26975wireman.add(kattegatVar);
            }
            if ((stratoscopeVar.supplicat() & 128) == 0) {
                return;
            }
            stratoscopeVar.splinterproof(1);
            int iSaran = stratoscopeVar.saran();
            int i = 3;
            stratoscopeVar.splinterproof(3);
            stratoscopeVar.apical(this.f26978attabal, 2);
            this.f26978attabal.polloi(3);
            int i2 = 13;
            merc.this.f26955adultoid = this.f26978attabal.impromptu(13);
            stratoscopeVar.apical(this.f26978attabal, 2);
            int i3 = 4;
            this.f26978attabal.polloi(4);
            stratoscopeVar.splinterproof(this.f26978attabal.impromptu(12));
            if (merc.this.f26958attabal == 2 && merc.this.f26969molybdenite == null) {
                polder.saneness sanenessVar = new polder.saneness(21, null, 0, null, decarock.grimness.f25081beachfront);
                merc mercVar = merc.this;
                mercVar.f26969molybdenite = mercVar.f26960competently.attabal(21, sanenessVar);
                if (merc.this.f26969molybdenite != null) {
                    merc.this.f26969molybdenite.saneness(kattegatVar, merc.this.f26974triweekly, new polder.wireman(iSaran, 21, 8192));
                }
            }
            this.f26981saneness.clear();
            this.f26979dern.clear();
            int iAttabal = stratoscopeVar.attabal();
            while (iAttabal > 0) {
                stratoscopeVar.apical(this.f26978attabal, 5);
                int iImpromptu = this.f26978attabal.impromptu(8);
                this.f26978attabal.polloi(i);
                int iImpromptu2 = this.f26978attabal.impromptu(i2);
                this.f26978attabal.polloi(i3);
                int iImpromptu3 = this.f26978attabal.impromptu(12);
                polder.saneness sanenessVarDern = dern(stratoscopeVar, iImpromptu3);
                if (iImpromptu == 6 || iImpromptu == 5) {
                    iImpromptu = sanenessVarDern.f27035attabal;
                }
                iAttabal -= iImpromptu3 + 5;
                int i4 = merc.this.f26958attabal == 2 ? iImpromptu : iImpromptu2;
                if (!merc.this.f26961cutely.get(i4)) {
                    polder polderVarAttabal = (merc.this.f26958attabal == 2 && iImpromptu == 21) ? merc.this.f26969molybdenite : merc.this.f26960competently.attabal(iImpromptu, sanenessVarDern);
                    if (merc.this.f26958attabal != 2 || iImpromptu2 < this.f26979dern.get(i4, 8192)) {
                        this.f26979dern.put(i4, iImpromptu2);
                        this.f26981saneness.put(i4, polderVarAttabal);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f26979dern.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f26979dern.keyAt(i5);
                int iValueAt = this.f26979dern.valueAt(i5);
                merc.this.f26961cutely.put(iKeyAt, true);
                merc.this.f26956apical.put(iValueAt, true);
                polder polderVarValueAt = this.f26981saneness.valueAt(i5);
                if (polderVarValueAt != null) {
                    if (polderVarValueAt != merc.this.f26969molybdenite) {
                        polderVarValueAt.saneness(kattegatVar, merc.this.f26974triweekly, new polder.wireman(iSaran, iKeyAt, 8192));
                    }
                    merc.this.f26973taiyuan.put(iValueAt, polderVarValueAt);
                }
            }
            if (merc.this.f26958attabal == 2) {
                if (merc.this.f26957arytenoidectomy) {
                    return;
                }
                merc.this.f26974triweekly.endTracks();
                merc.this.f26967kowloon = 0;
                merc.this.f26957arytenoidectomy = true;
                return;
            }
            merc.this.f26973taiyuan.remove(this.f26982wireman);
            merc mercVar2 = merc.this;
            mercVar2.f26967kowloon = mercVar2.f26958attabal == 1 ? 0 : merc.this.f26967kowloon - 1;
            if (merc.this.f26967kowloon == 0) {
                merc.this.f26974triweekly.endTracks();
                merc.this.f26957arytenoidectomy = true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        public final polder.saneness dern(decarock.stratoscope stratoscopeVar, int i) {
            int i2;
            int iBeachfront = stratoscopeVar.beachfront();
            int i3 = iBeachfront + i;
            int i4 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iSupplicat = 0;
            while (stratoscopeVar.beachfront() < i3) {
                int iSupplicat2 = stratoscopeVar.supplicat();
                int iBeachfront2 = stratoscopeVar.beachfront() + stratoscopeVar.supplicat();
                if (iBeachfront2 > i3) {
                    break;
                }
                if (iSupplicat2 == 5) {
                    long jMerc = stratoscopeVar.merc();
                    if (jMerc == 1094921523) {
                        i4 = 129;
                    } else if (jMerc == 1161904947) {
                        i4 = 135;
                    } else if (jMerc == 1094921524) {
                        i4 = 172;
                    } else if (jMerc == 1212503619) {
                        i4 = 36;
                    }
                } else if (iSupplicat2 == 106) {
                    i4 = 129;
                } else if (iSupplicat2 == 122) {
                    i4 = 135;
                } else if (iSupplicat2 == 127) {
                    int iSupplicat3 = stratoscopeVar.supplicat();
                    if (iSupplicat3 == 21) {
                        i4 = 172;
                    } else if (iSupplicat3 == 14) {
                        i4 = 136;
                    } else if (iSupplicat3 == 33) {
                        i4 = Opcodes.F2I;
                    }
                } else {
                    if (iSupplicat2 == 123) {
                        i2 = 138;
                    } else if (iSupplicat2 == 10) {
                        String strTrim = stratoscopeVar.yemenite(3).trim();
                        iSupplicat = stratoscopeVar.supplicat();
                        str = strTrim;
                    } else if (iSupplicat2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (stratoscopeVar.beachfront() < iBeachfront2) {
                            String strTrim2 = stratoscopeVar.yemenite(3).trim();
                            int iSupplicat4 = stratoscopeVar.supplicat();
                            byte[] bArr = new byte[4];
                            stratoscopeVar.formularize(bArr, 0, 4);
                            arrayList2.add(new polder.attabal(strTrim2, iSupplicat4, bArr));
                        }
                        arrayList = arrayList2;
                        i4 = 89;
                    } else if (iSupplicat2 == 111) {
                        i2 = 257;
                    }
                    i4 = i2;
                }
                stratoscopeVar.splinterproof(iBeachfront2 - stratoscopeVar.beachfront());
            }
            stratoscopeVar.mathsort(i3);
            return new polder.saneness(i4, str, iSupplicat, arrayList, Arrays.copyOfRange(stratoscopeVar.marial(), iBeachfront, i3));
        }

        @Override // ghoulish.oilcan
        public void saneness(decarock.kattegat kattegatVar, cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        }
    }
}
