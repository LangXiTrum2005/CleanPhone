package incorrectly;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class czestochowa implements puffin {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.common.oilcan.dern f28653attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.media3.common.oilcan f28654beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public String f28655competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final HashMap<String, attabal> f28656dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f28657impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public puffin.attabal f28658marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.common.oilcan.saneness f28659saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final com.google.common.base.arytenoidectomy<String> f28660wireman;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final com.google.common.base.arytenoidectomy<String> f28652taiyuan = new com.google.common.base.arytenoidectomy() { // from class: incorrectly.coi
        @Override // com.google.common.base.arytenoidectomy
        public final Object get() {
            return czestochowa.impassible();
        }
    };

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Random f28651cutely = new Random();

    /* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
    public final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f28661attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f28662beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f28664dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f28665marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f28666saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public androidx.media3.exoplayer.source.formularize.saneness f28667wireman;

        public attabal(String str, int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
            this.f28661attabal = str;
            this.f28666saneness = i;
            this.f28664dern = sanenessVar == null ? -1L : sanenessVar.f12522wireman;
            if (sanenessVar == null || !sanenessVar.saneness()) {
                return;
            }
            this.f28667wireman = sanenessVar;
        }

        public void apical(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
            if (this.f28664dern != -1 || i != this.f28666saneness || sanenessVar == null || sanenessVar.f12522wireman < czestochowa.this.triweekly()) {
                return;
            }
            this.f28664dern = sanenessVar.f12522wireman;
        }

        public boolean cutely(saneness.attabal attabalVar) {
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar = attabalVar.f28799wireman;
            if (sanenessVar == null) {
                return this.f28666saneness != attabalVar.f28794dern;
            }
            long j = this.f28664dern;
            if (j == -1) {
                return false;
            }
            if (sanenessVar.f12522wireman > j) {
                return true;
            }
            if (this.f28667wireman == null) {
                return false;
            }
            int iSaneness = attabalVar.f28797saneness.saneness(sanenessVar.f12518attabal);
            int iSaneness2 = attabalVar.f28797saneness.saneness(this.f28667wireman.f12518attabal);
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = attabalVar.f28799wireman;
            if (sanenessVar2.f12522wireman < this.f28667wireman.f12522wireman || iSaneness < iSaneness2) {
                return false;
            }
            if (iSaneness > iSaneness2) {
                return true;
            }
            if (!sanenessVar2.saneness()) {
                int i = attabalVar.f28799wireman.f12520marial;
                return i == -1 || i > this.f28667wireman.f12521saneness;
            }
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = attabalVar.f28799wireman;
            int i2 = sanenessVar3.f12521saneness;
            int i3 = sanenessVar3.f12519dern;
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar4 = this.f28667wireman;
            int i4 = sanenessVar4.f12521saneness;
            return i2 > i4 || (i2 == i4 && i3 > sanenessVar4.f12519dern);
        }

        public final int formularize(androidx.media3.common.oilcan oilcanVar, androidx.media3.common.oilcan oilcanVar2, int i) {
            if (i >= oilcanVar.arytenoidectomy()) {
                if (i < oilcanVar2.arytenoidectomy()) {
                    return i;
                }
                return -1;
            }
            oilcanVar.triweekly(i, czestochowa.this.f28653attabal);
            for (int i2 = czestochowa.this.f28653attabal.f11127triweekly; i2 <= czestochowa.this.f28653attabal.f11123kowloon; i2++) {
                int iSaneness = oilcanVar2.saneness(oilcanVar.impassible(i2));
                if (iSaneness != -1) {
                    return oilcanVar2.beachfront(iSaneness, czestochowa.this.f28659saneness).f11137dern;
                }
            }
            return -1;
        }

        public boolean impassible(androidx.media3.common.oilcan oilcanVar, androidx.media3.common.oilcan oilcanVar2) {
            int iFormularize = formularize(oilcanVar, oilcanVar2, this.f28666saneness);
            this.f28666saneness = iFormularize;
            if (iFormularize == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar = this.f28667wireman;
            return sanenessVar == null || oilcanVar2.saneness(sanenessVar.f12518attabal) != -1;
        }

        public boolean taiyuan(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
            if (sanenessVar == null) {
                return i == this.f28666saneness;
            }
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = this.f28667wireman;
            if (sanenessVar2 == null) {
                return !sanenessVar.saneness() && sanenessVar.f12522wireman == this.f28664dern;
            }
            return sanenessVar.f12522wireman == sanenessVar2.f12522wireman && sanenessVar.f12521saneness == sanenessVar2.f12521saneness && sanenessVar.f12519dern == sanenessVar2.f12519dern;
        }
    }

    public czestochowa() {
        this(f28652taiyuan);
    }

    public static String impassible() {
        byte[] bArr = new byte[12];
        f28651cutely.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    public final void arytenoidectomy(saneness.attabal attabalVar) {
        if (attabalVar.f28797saneness.monoploid()) {
            String str = this.f28655competently;
            if (str != null) {
                formularize((attabal) decarock.attabal.marial(this.f28656dern.get(str)));
                return;
            }
            return;
        }
        attabal attabalVar2 = this.f28656dern.get(this.f28655competently);
        attabal attabalVarKowloon = kowloon(attabalVar.f28794dern, attabalVar.f28799wireman);
        this.f28655competently = attabalVarKowloon.f28661attabal;
        beachfront(attabalVar);
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = attabalVar.f28799wireman;
        if (sanenessVar == null || !sanenessVar.saneness()) {
            return;
        }
        if (attabalVar2 != null && attabalVar2.f28664dern == attabalVar.f28799wireman.f12522wireman && attabalVar2.f28667wireman != null && attabalVar2.f28667wireman.f12521saneness == attabalVar.f28799wireman.f12521saneness && attabalVar2.f28667wireman.f12519dern == attabalVar.f28799wireman.f12519dern) {
            return;
        }
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = attabalVar.f28799wireman;
        this.f28658marial.premeiotic(attabalVar, kowloon(attabalVar.f28794dern, new androidx.media3.exoplayer.source.formularize.saneness(sanenessVar2.f12518attabal, sanenessVar2.f12522wireman)).f28661attabal, attabalVarKowloon.f28661attabal);
    }

    @Override // incorrectly.puffin
    public synchronized String attabal() {
        return this.f28655competently;
    }

    @Override // incorrectly.puffin
    public synchronized void beachfront(saneness.attabal attabalVar) {
        decarock.attabal.marial(this.f28658marial);
        if (attabalVar.f28797saneness.monoploid()) {
            return;
        }
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = attabalVar.f28799wireman;
        if (sanenessVar != null) {
            if (sanenessVar.f12522wireman < triweekly()) {
                return;
            }
            attabal attabalVar2 = this.f28656dern.get(this.f28655competently);
            if (attabalVar2 != null && attabalVar2.f28664dern == -1 && attabalVar2.f28666saneness != attabalVar.f28794dern) {
                return;
            }
        }
        attabal attabalVarKowloon = kowloon(attabalVar.f28794dern, attabalVar.f28799wireman);
        if (this.f28655competently == null) {
            this.f28655competently = attabalVarKowloon.f28661attabal;
        }
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = attabalVar.f28799wireman;
        if (sanenessVar2 != null && sanenessVar2.saneness()) {
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = attabalVar.f28799wireman;
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar4 = new androidx.media3.exoplayer.source.formularize.saneness(sanenessVar3.f12518attabal, sanenessVar3.f12522wireman, sanenessVar3.f12521saneness);
            attabal attabalVarKowloon2 = kowloon(attabalVar.f28794dern, sanenessVar4);
            if (!attabalVarKowloon2.f28665marial) {
                attabalVarKowloon2.f28665marial = true;
                attabalVar.f28797saneness.impromptu(attabalVar.f28799wireman.f12518attabal, this.f28659saneness);
                this.f28658marial.beachfront(new saneness.attabal(attabalVar.f28790attabal, attabalVar.f28797saneness, attabalVar.f28794dern, sanenessVar4, Math.max(0L, decarock.grimness.sultanate(this.f28659saneness.beachfront(attabalVar.f28799wireman.f12521saneness)) + this.f28659saneness.impassible()), attabalVar.f28791beachfront, attabalVar.f28792competently, attabalVar.f28795impromptu, attabalVar.f28798taiyuan, attabalVar.f28793cutely), attabalVarKowloon2.f28661attabal);
            }
        }
        if (!attabalVarKowloon.f28665marial) {
            attabalVarKowloon.f28665marial = true;
            this.f28658marial.beachfront(attabalVar, attabalVarKowloon.f28661attabal);
        }
        if (attabalVarKowloon.f28661attabal.equals(this.f28655competently) && !attabalVarKowloon.f28662beachfront) {
            attabalVarKowloon.f28662beachfront = true;
            this.f28658marial.hydrovane(attabalVar, attabalVarKowloon.f28661attabal);
        }
    }

    @Override // incorrectly.puffin
    public void competently(puffin.attabal attabalVar) {
        this.f28658marial = attabalVar;
    }

    @Override // incorrectly.puffin
    public synchronized String dern(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        return kowloon(oilcanVar.impromptu(sanenessVar.f12518attabal, this.f28659saneness).f11137dern, sanenessVar).f28661attabal;
    }

    public final void formularize(attabal attabalVar) {
        if (attabalVar.f28664dern != -1) {
            this.f28657impromptu = attabalVar.f28664dern;
        }
        this.f28655competently = null;
    }

    public final attabal kowloon(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        attabal attabalVar = null;
        long j = Long.MAX_VALUE;
        for (attabal attabalVar2 : this.f28656dern.values()) {
            attabalVar2.apical(i, sanenessVar);
            if (attabalVar2.taiyuan(i, sanenessVar)) {
                long j2 = attabalVar2.f28664dern;
                if (j2 == -1 || j2 < j) {
                    attabalVar = attabalVar2;
                    j = j2;
                } else if (j2 == j && ((attabal) decarock.grimness.impromptu(attabalVar)).f28667wireman != null && attabalVar2.f28667wireman != null) {
                    attabalVar = attabalVar2;
                }
            }
        }
        if (attabalVar != null) {
            return attabalVar;
        }
        String str = this.f28660wireman.get();
        attabal attabalVar3 = new attabal(str, i, sanenessVar);
        this.f28656dern.put(str, attabalVar3);
        return attabalVar3;
    }

    @Override // incorrectly.puffin
    public synchronized void marial(saneness.attabal attabalVar) {
        try {
            decarock.attabal.marial(this.f28658marial);
            androidx.media3.common.oilcan oilcanVar = this.f28654beachfront;
            this.f28654beachfront = attabalVar.f28797saneness;
            Iterator<attabal> it = this.f28656dern.values().iterator();
            while (it.hasNext()) {
                attabal next = it.next();
                if (!next.impassible(oilcanVar, this.f28654beachfront) || next.cutely(attabalVar)) {
                    it.remove();
                    if (next.f28665marial) {
                        if (next.f28661attabal.equals(this.f28655competently)) {
                            formularize(next);
                        }
                        this.f28658marial.competently(attabalVar, next.f28661attabal, false);
                    }
                }
            }
            arytenoidectomy(attabalVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // incorrectly.puffin
    public synchronized void saneness(saneness.attabal attabalVar) {
        puffin.attabal attabalVar2;
        try {
            String str = this.f28655competently;
            if (str != null) {
                formularize((attabal) decarock.attabal.marial(this.f28656dern.get(str)));
            }
            Iterator<attabal> it = this.f28656dern.values().iterator();
            while (it.hasNext()) {
                attabal next = it.next();
                it.remove();
                if (next.f28665marial && (attabalVar2 = this.f28658marial) != null) {
                    attabalVar2.competently(attabalVar, next.f28661attabal, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long triweekly() {
        attabal attabalVar = this.f28656dern.get(this.f28655competently);
        return (attabalVar == null || attabalVar.f28664dern == -1) ? this.f28657impromptu + 1 : attabalVar.f28664dern;
    }

    @Override // incorrectly.puffin
    public synchronized void wireman(saneness.attabal attabalVar, int i) {
        try {
            decarock.attabal.marial(this.f28658marial);
            boolean z = i == 0;
            Iterator<attabal> it = this.f28656dern.values().iterator();
            while (it.hasNext()) {
                attabal next = it.next();
                if (next.cutely(attabalVar)) {
                    it.remove();
                    if (next.f28665marial) {
                        boolean zEquals = next.f28661attabal.equals(this.f28655competently);
                        boolean z2 = z && zEquals && next.f28662beachfront;
                        if (zEquals) {
                            formularize(next);
                        }
                        this.f28658marial.competently(attabalVar, next.f28661attabal, z2);
                    }
                }
            }
            arytenoidectomy(attabalVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public czestochowa(com.google.common.base.arytenoidectomy<String> arytenoidectomyVar) {
        this.f28660wireman = arytenoidectomyVar;
        this.f28653attabal = new androidx.media3.common.oilcan.dern();
        this.f28659saneness = new androidx.media3.common.oilcan.saneness();
        this.f28656dern = new HashMap<>();
        this.f28654beachfront = androidx.media3.common.oilcan.f11093attabal;
        this.f28657impromptu = -1L;
    }
}
