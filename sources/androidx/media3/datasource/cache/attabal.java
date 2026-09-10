package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import decarock.grimness;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import twybill.impromptu;
import twybill.marial;
import twybill.taiyuan;
import twybill.wireman;
import vir.arytenoidectomy;
import vir.competently;
import vir.impassible;
import vir.kowloon;

/* JADX INFO: compiled from: CacheDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public competently f11391apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public marial f11392arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Cache f11393attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f11394beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f11395competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public competently f11396cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f11397dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11398formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f11399graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f11400impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f11401impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f11402kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final wireman f11403marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public long f11404molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f11405monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f11406polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f11407saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public Uri f11408taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f11409triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f11410wireman;

    /* JADX INFO: compiled from: CacheDataSource.java */
    public static final class dern implements androidx.media3.datasource.attabal.InterfaceC0080attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Cache f11411attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public androidx.media3.datasource.attabal.InterfaceC0080attabal f11412beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public PriorityTaskManager f11413competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public vir.wireman.attabal f11414dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f11415impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f11416marial;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f11418taiyuan;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public androidx.media3.datasource.attabal.InterfaceC0080attabal f11417saneness = new FileDataSource.saneness();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public wireman f11419wireman = wireman.f39043attabal;

        @Override // androidx.media3.datasource.attabal.InterfaceC0080attabal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public attabal createDataSource() {
            androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal = this.f11412beachfront;
            return saneness(interfaceC0080attabal != null ? interfaceC0080attabal.createDataSource() : null, this.f11418taiyuan, this.f11415impromptu);
        }

        public dern beachfront(int i) {
            this.f11418taiyuan = i;
            return this;
        }

        public dern competently(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
            this.f11412beachfront = interfaceC0080attabal;
            return this;
        }

        public dern dern(Cache cache) {
            this.f11411attabal = cache;
            return this;
        }

        public dern marial(vir.wireman.attabal attabalVar) {
            this.f11414dern = attabalVar;
            this.f11416marial = attabalVar == null;
            return this;
        }

        public final attabal saneness(androidx.media3.datasource.attabal attabalVar, int i, int i2) {
            vir.wireman wiremanVarCreateDataSink;
            Cache cache = (Cache) decarock.attabal.marial(this.f11411attabal);
            if (this.f11416marial || attabalVar == null) {
                wiremanVarCreateDataSink = null;
            } else {
                vir.wireman.attabal attabalVar2 = this.f11414dern;
                wiremanVarCreateDataSink = attabalVar2 != null ? attabalVar2.createDataSink() : new CacheDataSink.attabal().attabal(cache).createDataSink();
            }
            return new attabal(cache, attabalVar, this.f11417saneness.createDataSource(), wiremanVarCreateDataSink, this.f11419wireman, i, this.f11413competently, i2, null);
        }

        public dern wireman(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
            this.f11417saneness = interfaceC0080attabal;
            return this;
        }
    }

    /* JADX INFO: compiled from: CacheDataSource.java */
    public interface saneness {
    }

    public static Uri marial(Cache cache, String str, Uri uri) {
        Uri uriAttabal = impromptu.attabal(cache.getContentMetadata(str));
        return uriAttabal != null ? uriAttabal : uri;
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        try {
            String strSaneness = this.f11403marial.saneness(competentlyVar);
            competently competentlyVarAttabal = competentlyVar.attabal().beachfront(strSaneness).attabal();
            this.f11396cutely = competentlyVarAttabal;
            this.f11408taiyuan = marial(this.f11393attabal, strSaneness, competentlyVarAttabal.f39544attabal);
            this.f11409triweekly = competentlyVar.f39546competently;
            int iKowloon = kowloon(competentlyVar);
            boolean z = iKowloon != -1;
            this.f11406polloi = z;
            if (z) {
                formularize(iKowloon);
            }
            if (this.f11406polloi) {
                this.f11402kowloon = -1L;
            } else {
                long jSaneness = impromptu.saneness(this.f11393attabal.getContentMetadata(strSaneness));
                this.f11402kowloon = jSaneness;
                if (jSaneness != -1) {
                    long j = jSaneness - competentlyVar.f39546competently;
                    this.f11402kowloon = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = competentlyVar.f39549impromptu;
            if (jMin != -1) {
                long j2 = this.f11402kowloon;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f11402kowloon = jMin;
            }
            long j3 = this.f11402kowloon;
            if (j3 > 0 || j3 == -1) {
                impassible(competentlyVarAttabal, false);
            }
            long j4 = competentlyVar.f39549impromptu;
            return j4 != -1 ? j4 : this.f11402kowloon;
        } catch (Throwable th) {
            beachfront(th);
            throw th;
        }
    }

    public final void beachfront(Throwable th) {
        if (impromptu() || (th instanceof Cache.CacheException)) {
            this.f11405monoploid = true;
        }
    }

    @Override // androidx.media3.datasource.attabal
    public void close() throws IOException {
        this.f11396cutely = null;
        this.f11408taiyuan = null;
        this.f11409triweekly = 0L;
        apical();
        try {
            wireman();
        } catch (Throwable th) {
            beachfront(th);
            throw th;
        }
    }

    public final boolean competently() {
        return this.f11398formularize == this.f11410wireman;
    }

    public final boolean cutely() {
        return this.f11398formularize == this.f11397dern;
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        this.f11407saneness.dern(arytenoidectomyVar);
        this.f11410wireman.dern(arytenoidectomyVar);
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        return taiyuan() ? this.f11410wireman.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        return this.f11408taiyuan;
    }

    public final void impassible(competently competentlyVar, boolean z) throws IOException {
        marial marialVarMarial;
        long jMin;
        competently competentlyVarAttabal;
        androidx.media3.datasource.attabal attabalVar;
        String str = (String) grimness.impromptu(competentlyVar.f39552taiyuan);
        if (this.f11406polloi) {
            marialVarMarial = null;
        } else if (this.f11394beachfront) {
            try {
                marialVarMarial = this.f11393attabal.marial(str, this.f11409triweekly, this.f11402kowloon);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            marialVarMarial = this.f11393attabal.attabal(str, this.f11409triweekly, this.f11402kowloon);
        }
        if (marialVarMarial == null) {
            attabalVar = this.f11410wireman;
            competentlyVarAttabal = competentlyVar.attabal().impromptu(this.f11409triweekly).competently(this.f11402kowloon).attabal();
        } else if (marialVarMarial.f39034polloi) {
            Uri uriFromFile = Uri.fromFile((File) grimness.impromptu(marialVarMarial.f39032molybdenite));
            long j = marialVarMarial.f39029arytenoidectomy;
            long j2 = this.f11409triweekly - j;
            long jMin2 = marialVarMarial.f39033monoploid - j2;
            long j3 = this.f11402kowloon;
            if (j3 != -1) {
                jMin2 = Math.min(jMin2, j3);
            }
            competentlyVarAttabal = competentlyVar.attabal().taiyuan(uriFromFile).apical(j).impromptu(j2).competently(jMin2).attabal();
            attabalVar = this.f11407saneness;
        } else {
            if (marialVarMarial.wireman()) {
                jMin = this.f11402kowloon;
            } else {
                jMin = marialVarMarial.f39033monoploid;
                long j4 = this.f11402kowloon;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            competentlyVarAttabal = competentlyVar.attabal().impromptu(this.f11409triweekly).competently(jMin).attabal();
            attabalVar = this.f11397dern;
            if (attabalVar == null) {
                attabalVar = this.f11410wireman;
                this.f11393attabal.dern(marialVarMarial);
                marialVarMarial = null;
            }
        }
        this.f11399graveside = (this.f11406polloi || attabalVar != this.f11410wireman) ? Long.MAX_VALUE : this.f11409triweekly + 102400;
        if (z) {
            decarock.attabal.competently(competently());
            if (attabalVar == this.f11410wireman) {
                return;
            }
            try {
                wireman();
            } catch (Throwable th) {
                if (((marial) grimness.impromptu(marialVarMarial)).dern()) {
                    this.f11393attabal.dern(marialVarMarial);
                }
                throw th;
            }
        }
        if (marialVarMarial != null && marialVarMarial.dern()) {
            this.f11392arytenoidectomy = marialVarMarial;
        }
        this.f11398formularize = attabalVar;
        this.f11391apical = competentlyVarAttabal;
        this.f11400impassible = 0L;
        long jAttabal = attabalVar.attabal(competentlyVarAttabal);
        taiyuan taiyuanVar = new taiyuan();
        if (competentlyVarAttabal.f39549impromptu == -1 && jAttabal != -1) {
            this.f11402kowloon = jAttabal;
            taiyuan.competently(taiyuanVar, this.f11409triweekly + jAttabal);
        }
        if (taiyuan()) {
            Uri uri = attabalVar.getUri();
            this.f11408taiyuan = uri;
            taiyuan.impromptu(taiyuanVar, competentlyVar.f39544attabal.equals(uri) ? null : this.f11408taiyuan);
        }
        if (cutely()) {
            this.f11393attabal.wireman(str, taiyuanVar);
        }
    }

    public final boolean impromptu() {
        return this.f11398formularize == this.f11407saneness;
    }

    public final int kowloon(competently competentlyVar) {
        if (this.f11395competently && this.f11405monoploid) {
            return 0;
        }
        return (this.f11401impromptu && competentlyVar.f39549impromptu == -1) ? 1 : -1;
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f11402kowloon == 0) {
            return -1;
        }
        competently competentlyVar = (competently) decarock.attabal.marial(this.f11396cutely);
        competently competentlyVar2 = (competently) decarock.attabal.marial(this.f11391apical);
        try {
            if (this.f11409triweekly >= this.f11399graveside) {
                impassible(competentlyVar, true);
            }
            int i3 = ((androidx.media3.datasource.attabal) decarock.attabal.marial(this.f11398formularize)).read(bArr, i, i2);
            if (i3 == -1) {
                if (taiyuan()) {
                    long j = competentlyVar2.f39549impromptu;
                    if (j == -1 || this.f11400impassible < j) {
                        triweekly((String) grimness.impromptu(competentlyVar.f39552taiyuan));
                        return i3;
                    }
                }
                long j2 = this.f11402kowloon;
                if (j2 <= 0) {
                    if (j2 == -1) {
                    }
                }
                wireman();
                impassible(competentlyVar, false);
                return read(bArr, i, i2);
            }
            if (impromptu()) {
                this.f11404molybdenite += (long) i3;
            }
            long j3 = i3;
            this.f11409triweekly += j3;
            this.f11400impassible += j3;
            long j4 = this.f11402kowloon;
            if (j4 != -1) {
                this.f11402kowloon = j4 - j3;
                return i3;
            }
            return i3;
        } catch (Throwable th) {
            beachfront(th);
            throw th;
        }
    }

    public final boolean taiyuan() {
        return !impromptu();
    }

    public final void triweekly(String str) throws IOException {
        this.f11402kowloon = 0L;
        if (cutely()) {
            taiyuan taiyuanVar = new taiyuan();
            taiyuan.competently(taiyuanVar, this.f11409triweekly);
            this.f11393attabal.wireman(str, taiyuanVar);
        }
    }

    public final void wireman() throws IOException {
        androidx.media3.datasource.attabal attabalVar = this.f11398formularize;
        if (attabalVar == null) {
            return;
        }
        try {
            attabalVar.close();
        } finally {
            this.f11391apical = null;
            this.f11398formularize = null;
            marial marialVar = this.f11392arytenoidectomy;
            if (marialVar != null) {
                this.f11393attabal.dern(marialVar);
                this.f11392arytenoidectomy = null;
            }
        }
    }

    public attabal(Cache cache, androidx.media3.datasource.attabal attabalVar, androidx.media3.datasource.attabal attabalVar2, vir.wireman wiremanVar, wireman wiremanVar2, int i, PriorityTaskManager priorityTaskManager, int i2, saneness sanenessVar) {
        this.f11393attabal = cache;
        this.f11407saneness = attabalVar2;
        this.f11403marial = wiremanVar2 == null ? wireman.f39043attabal : wiremanVar2;
        this.f11394beachfront = (i & 1) != 0;
        this.f11395competently = (i & 2) != 0;
        this.f11401impromptu = (i & 4) != 0;
        if (attabalVar == null) {
            this.f11410wireman = androidx.media3.datasource.wireman.f11474attabal;
            this.f11397dern = null;
        } else {
            attabalVar = priorityTaskManager != null ? new impassible(attabalVar, priorityTaskManager, i2) : attabalVar;
            this.f11410wireman = attabalVar;
            this.f11397dern = wiremanVar != null ? new kowloon(attabalVar, wiremanVar) : null;
        }
    }

    public final void apical() {
    }

    public final void formularize(int i) {
    }
}
