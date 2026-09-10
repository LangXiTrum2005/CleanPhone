package ocellation;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: WorkSpec.java */
/* JADX INFO: loaded from: classes.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f33997apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long f33998arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f33999attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.work.wireman f34000beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f34001competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public androidx.work.saneness f34002cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f34003dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public BackoffPolicy f34004formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f34005impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f34006impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f34007kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public androidx.work.wireman f34008marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f34009monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public OutOfQuotaPolicy f34010polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public WorkInfo.State f34011saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f34012taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f34013triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f34014wireman;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final String f33996molybdenite = androidx.work.apical.beachfront("WorkSpec");

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final triweekly.attabal<List<dern>, List<WorkInfo>> f33995graveside = new attabal();

    /* JADX INFO: compiled from: WorkSpec.java */
    public class attabal implements triweekly.attabal<List<dern>, List<WorkInfo>> {
        @Override // triweekly.attabal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public List<WorkInfo> apply(List<dern> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<dern> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().attabal());
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: WorkSpec.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f34015attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public List<androidx.work.wireman> f34016beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public androidx.work.wireman f34017dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public List<String> f34018marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public WorkInfo.State f34019saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f34020wireman;

        public WorkInfo attabal() {
            List<androidx.work.wireman> list = this.f34016beachfront;
            return new WorkInfo(UUID.fromString(this.f34015attabal), this.f34019saneness, this.f34017dern, this.f34018marial, (list == null || list.isEmpty()) ? androidx.work.wireman.f14222dern : this.f34016beachfront.get(0), this.f34020wireman);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dern)) {
                return false;
            }
            dern dernVar = (dern) obj;
            if (this.f34020wireman != dernVar.f34020wireman) {
                return false;
            }
            String str = this.f34015attabal;
            if (str == null ? dernVar.f34015attabal != null : !str.equals(dernVar.f34015attabal)) {
                return false;
            }
            if (this.f34019saneness != dernVar.f34019saneness) {
                return false;
            }
            androidx.work.wireman wiremanVar = this.f34017dern;
            if (wiremanVar == null ? dernVar.f34017dern != null : !wiremanVar.equals(dernVar.f34017dern)) {
                return false;
            }
            List<String> list = this.f34018marial;
            if (list == null ? dernVar.f34018marial != null : !list.equals(dernVar.f34018marial)) {
                return false;
            }
            List<androidx.work.wireman> list2 = this.f34016beachfront;
            List<androidx.work.wireman> list3 = dernVar.f34016beachfront;
            if (list2 != null) {
                return list2.equals(list3);
            }
            return list3 == null;
        }

        public int hashCode() {
            String str = this.f34015attabal;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.f34019saneness;
            int iHashCode2 = (iHashCode + (state != null ? state.hashCode() : 0)) * 31;
            androidx.work.wireman wiremanVar = this.f34017dern;
            int iHashCode3 = (((iHashCode2 + (wiremanVar != null ? wiremanVar.hashCode() : 0)) * 31) + this.f34020wireman) * 31;
            List<String> list = this.f34018marial;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.wireman> list2 = this.f34016beachfront;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: WorkSpec.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f34021attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public WorkInfo.State f34022saneness;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            if (this.f34022saneness != sanenessVar.f34022saneness) {
                return false;
            }
            return this.f34021attabal.equals(sanenessVar.f34021attabal);
        }

        public int hashCode() {
            return (this.f34021attabal.hashCode() * 31) + this.f34022saneness.hashCode();
        }
    }

    public arytenoidectomy(String str, String str2) {
        this.f34011saneness = WorkInfo.State.ENQUEUED;
        androidx.work.wireman wiremanVar = androidx.work.wireman.f14222dern;
        this.f34008marial = wiremanVar;
        this.f34000beachfront = wiremanVar;
        this.f34002cutely = androidx.work.saneness.f14205taiyuan;
        this.f34004formularize = BackoffPolicy.EXPONENTIAL;
        this.f34005impassible = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f33998arytenoidectomy = -1L;
        this.f34010polloi = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f33999attabal = str;
        this.f34003dern = str2;
    }

    public long attabal() {
        if (dern()) {
            return this.f34013triweekly + Math.min(18000000L, this.f34004formularize == BackoffPolicy.LINEAR ? this.f34005impassible * ((long) this.f33997apical) : (long) Math.scalb(this.f34005impassible, this.f33997apical - 1));
        }
        if (!wireman()) {
            long jCurrentTimeMillis = this.f34013triweekly;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f34001competently;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f34013triweekly;
        long j2 = j == 0 ? jCurrentTimeMillis2 + this.f34001competently : j;
        long j3 = this.f34012taiyuan;
        long j4 = this.f34006impromptu;
        if (j3 != j4) {
            return j2 + j4 + (j == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j != 0 ? j4 : 0L);
    }

    public boolean dern() {
        return this.f34011saneness == WorkInfo.State.ENQUEUED && this.f33997apical > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && arytenoidectomy.class == obj.getClass()) {
            arytenoidectomy arytenoidectomyVar = (arytenoidectomy) obj;
            if (this.f34001competently != arytenoidectomyVar.f34001competently || this.f34006impromptu != arytenoidectomyVar.f34006impromptu || this.f34012taiyuan != arytenoidectomyVar.f34012taiyuan || this.f33997apical != arytenoidectomyVar.f33997apical || this.f34005impassible != arytenoidectomyVar.f34005impassible || this.f34013triweekly != arytenoidectomyVar.f34013triweekly || this.f34007kowloon != arytenoidectomyVar.f34007kowloon || this.f33998arytenoidectomy != arytenoidectomyVar.f33998arytenoidectomy || this.f34009monoploid != arytenoidectomyVar.f34009monoploid || !this.f33999attabal.equals(arytenoidectomyVar.f33999attabal) || this.f34011saneness != arytenoidectomyVar.f34011saneness || !this.f34003dern.equals(arytenoidectomyVar.f34003dern)) {
                return false;
            }
            String str = this.f34014wireman;
            if (str == null ? arytenoidectomyVar.f34014wireman != null : !str.equals(arytenoidectomyVar.f34014wireman)) {
                return false;
            }
            if (this.f34008marial.equals(arytenoidectomyVar.f34008marial) && this.f34000beachfront.equals(arytenoidectomyVar.f34000beachfront) && this.f34002cutely.equals(arytenoidectomyVar.f34002cutely) && this.f34004formularize == arytenoidectomyVar.f34004formularize && this.f34010polloi == arytenoidectomyVar.f34010polloi) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f33999attabal.hashCode() * 31) + this.f34011saneness.hashCode()) * 31) + this.f34003dern.hashCode()) * 31;
        String str = this.f34014wireman;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f34008marial.hashCode()) * 31) + this.f34000beachfront.hashCode()) * 31;
        long j = this.f34001competently;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f34006impromptu;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f34012taiyuan;
        int iHashCode3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f34002cutely.hashCode()) * 31) + this.f33997apical) * 31) + this.f34004formularize.hashCode()) * 31;
        long j4 = this.f34005impassible;
        int i3 = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f34013triweekly;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f34007kowloon;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f33998arytenoidectomy;
        return ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f34009monoploid ? 1 : 0)) * 31) + this.f34010polloi.hashCode();
    }

    public boolean saneness() {
        return !androidx.work.saneness.f14205taiyuan.equals(this.f34002cutely);
    }

    public String toString() {
        return "{WorkSpec: " + this.f33999attabal + "}";
    }

    public boolean wireman() {
        return this.f34006impromptu != 0;
    }

    public arytenoidectomy(arytenoidectomy arytenoidectomyVar) {
        this.f34011saneness = WorkInfo.State.ENQUEUED;
        androidx.work.wireman wiremanVar = androidx.work.wireman.f14222dern;
        this.f34008marial = wiremanVar;
        this.f34000beachfront = wiremanVar;
        this.f34002cutely = androidx.work.saneness.f14205taiyuan;
        this.f34004formularize = BackoffPolicy.EXPONENTIAL;
        this.f34005impassible = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f33998arytenoidectomy = -1L;
        this.f34010polloi = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f33999attabal = arytenoidectomyVar.f33999attabal;
        this.f34003dern = arytenoidectomyVar.f34003dern;
        this.f34011saneness = arytenoidectomyVar.f34011saneness;
        this.f34014wireman = arytenoidectomyVar.f34014wireman;
        this.f34008marial = new androidx.work.wireman(arytenoidectomyVar.f34008marial);
        this.f34000beachfront = new androidx.work.wireman(arytenoidectomyVar.f34000beachfront);
        this.f34001competently = arytenoidectomyVar.f34001competently;
        this.f34006impromptu = arytenoidectomyVar.f34006impromptu;
        this.f34012taiyuan = arytenoidectomyVar.f34012taiyuan;
        this.f34002cutely = new androidx.work.saneness(arytenoidectomyVar.f34002cutely);
        this.f33997apical = arytenoidectomyVar.f33997apical;
        this.f34004formularize = arytenoidectomyVar.f34004formularize;
        this.f34005impassible = arytenoidectomyVar.f34005impassible;
        this.f34013triweekly = arytenoidectomyVar.f34013triweekly;
        this.f34007kowloon = arytenoidectomyVar.f34007kowloon;
        this.f33998arytenoidectomy = arytenoidectomyVar.f33998arytenoidectomy;
        this.f34009monoploid = arytenoidectomyVar.f34009monoploid;
        this.f34010polloi = arytenoidectomyVar.f34010polloi;
    }
}
