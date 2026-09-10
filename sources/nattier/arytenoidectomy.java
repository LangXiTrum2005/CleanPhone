package nattier;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import cybernatic.restrictive;
import decarock.stratoscope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SefReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f33693dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.common.base.triweekly f33691wireman = com.google.common.base.triweekly.competently(':');

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final com.google.common.base.triweekly f33690marial = com.google.common.base.triweekly.competently('*');

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<attabal> f33692attabal = new ArrayList();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f33694saneness = 0;

    /* JADX INFO: compiled from: SefReader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f33695attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f33696dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f33697saneness;

        public attabal(int i, long j, int i2) {
            this.f33695attabal = i;
            this.f33697saneness = j;
            this.f33696dern = i2;
        }
    }

    public static SlowMotionData beachfront(stratoscope stratoscopeVar, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listCutely = f33690marial.cutely(stratoscopeVar.yemenite(i));
        for (int i2 = 0; i2 < listCutely.size(); i2++) {
            List<String> listCutely2 = f33691wireman.cutely(listCutely.get(i2));
            if (listCutely2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listCutely2.get(0)), Long.parseLong(listCutely2.get(1)), 1 << (Integer.parseInt(listCutely2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedContainer(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public static int saneness(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    public final void attabal(cybernatic.monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        stratoscope stratoscopeVar = new stratoscope(8);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, 8);
        this.f33693dern = stratoscopeVar.adultoid() + 8;
        if (stratoscopeVar.monoploid() != 1397048916) {
            restrictiveVar.f24743attabal = 0L;
        } else {
            restrictiveVar.f24743attabal = monoploidVar.getPosition() - ((long) (this.f33693dern - 12));
            this.f33694saneness = 2;
        }
    }

    public void competently() {
        this.f33692attabal.clear();
        this.f33694saneness = 0;
    }

    public int dern(cybernatic.monoploid monoploidVar, restrictive restrictiveVar, List<Metadata.Entry> list) throws IOException {
        int i = this.f33694saneness;
        long j = 0;
        if (i == 0) {
            long length = monoploidVar.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            restrictiveVar.f24743attabal = j;
            this.f33694saneness = 1;
        } else if (i == 1) {
            attabal(monoploidVar, restrictiveVar);
        } else if (i == 2) {
            wireman(monoploidVar, restrictiveVar);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            marial(monoploidVar, list);
            restrictiveVar.f24743attabal = 0L;
        }
        return 1;
    }

    public final void marial(cybernatic.monoploid monoploidVar, List<Metadata.Entry> list) throws IOException {
        long position = monoploidVar.getPosition();
        int length = (int) ((monoploidVar.getLength() - monoploidVar.getPosition()) - ((long) this.f33693dern));
        stratoscope stratoscopeVar = new stratoscope(length);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, length);
        for (int i = 0; i < this.f33692attabal.size(); i++) {
            attabal attabalVar = this.f33692attabal.get(i);
            stratoscopeVar.mathsort((int) (attabalVar.f33697saneness - position));
            stratoscopeVar.splinterproof(4);
            int iAdultoid = stratoscopeVar.adultoid();
            int iSaneness = saneness(stratoscopeVar.yemenite(iAdultoid));
            int i2 = attabalVar.f33696dern - (iAdultoid + 8);
            if (iSaneness == 2192) {
                list.add(beachfront(stratoscopeVar, i2));
            } else if (iSaneness != 2816 && iSaneness != 2817 && iSaneness != 2819 && iSaneness != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public final void wireman(cybernatic.monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        long length = monoploidVar.getLength();
        int i = this.f33693dern - 20;
        stratoscope stratoscopeVar = new stratoscope(i);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            stratoscopeVar.splinterproof(2);
            short sGintrap = stratoscopeVar.gintrap();
            if (sGintrap == 2192 || sGintrap == 2816 || sGintrap == 2817 || sGintrap == 2819 || sGintrap == 2820) {
                this.f33692attabal.add(new attabal(sGintrap, (length - ((long) this.f33693dern)) - ((long) stratoscopeVar.adultoid()), stratoscopeVar.adultoid()));
            } else {
                stratoscopeVar.splinterproof(8);
            }
        }
        if (this.f33692attabal.isEmpty()) {
            restrictiveVar.f24743attabal = 0L;
        } else {
            this.f33694saneness = 3;
            restrictiveVar.f24743attabal = this.f33692attabal.get(0).f33697saneness;
        }
    }
}
