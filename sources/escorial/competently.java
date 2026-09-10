package escorial;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_LogEvent.java */
/* JADX INFO: loaded from: classes2.dex */
public final class competently extends triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f25883attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f25884beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final long f25885competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ComplianceData f25886dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final NetworkConnectionInfo f25887impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final byte[] f25888marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Integer f25889saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final apical f25890taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f25891wireman;

    /* JADX INFO: compiled from: AutoValue_LogEvent.java */
    public static final class saneness extends triweekly.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Long f25892attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f25893beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public Long f25894competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ComplianceData f25895dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public NetworkConnectionInfo f25896impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public byte[] f25897marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Integer f25898saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public apical f25899taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Long f25900wireman;

        @Override // escorial.triweekly.attabal
        public triweekly attabal() {
            String str = "";
            if (this.f25892attabal == null) {
                str = " eventTimeMs";
            }
            if (this.f25900wireman == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f25894competently == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new competently(this.f25892attabal.longValue(), this.f25898saneness, this.f25895dern, this.f25900wireman.longValue(), this.f25897marial, this.f25893beachfront, this.f25894competently.longValue(), this.f25896impromptu, this.f25899taiyuan);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal beachfront(apical apicalVar) {
            this.f25899taiyuan = apicalVar;
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal competently(NetworkConnectionInfo networkConnectionInfo) {
            this.f25896impromptu = networkConnectionInfo;
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal cutely(long j) {
            this.f25894competently = Long.valueOf(j);
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal dern(Integer num) {
            this.f25898saneness = num;
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal impromptu(byte[] bArr) {
            this.f25897marial = bArr;
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal marial(long j) {
            this.f25900wireman = Long.valueOf(j);
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal saneness(ComplianceData complianceData) {
            this.f25895dern = complianceData;
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal taiyuan(String str) {
            this.f25893beachfront = str;
            return this;
        }

        @Override // escorial.triweekly.attabal
        public triweekly.attabal wireman(long j) {
            this.f25892attabal = Long.valueOf(j);
            return this;
        }
    }

    @Override // escorial.triweekly
    public apical beachfront() {
        return this.f25890taiyuan;
    }

    @Override // escorial.triweekly
    public NetworkConnectionInfo competently() {
        return this.f25887impromptu;
    }

    @Override // escorial.triweekly
    public long cutely() {
        return this.f25885competently;
    }

    @Override // escorial.triweekly
    public Integer dern() {
        return this.f25889saneness;
    }

    public boolean equals(Object obj) {
        Integer num;
        ComplianceData complianceData;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        apical apicalVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof triweekly) {
            triweekly triweeklyVar = (triweekly) obj;
            if (this.f25883attabal == triweeklyVar.wireman() && ((num = this.f25889saneness) != null ? num.equals(triweeklyVar.dern()) : triweeklyVar.dern() == null) && ((complianceData = this.f25886dern) != null ? complianceData.equals(triweeklyVar.saneness()) : triweeklyVar.saneness() == null) && this.f25891wireman == triweeklyVar.marial()) {
                if (Arrays.equals(this.f25888marial, triweeklyVar instanceof competently ? ((competently) triweeklyVar).f25888marial : triweeklyVar.impromptu()) && ((str = this.f25884beachfront) != null ? str.equals(triweeklyVar.taiyuan()) : triweeklyVar.taiyuan() == null) && this.f25885competently == triweeklyVar.cutely() && ((networkConnectionInfo = this.f25887impromptu) != null ? networkConnectionInfo.equals(triweeklyVar.competently()) : triweeklyVar.competently() == null) && ((apicalVar = this.f25890taiyuan) != null ? apicalVar.equals(triweeklyVar.beachfront()) : triweeklyVar.beachfront() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f25883attabal;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f25889saneness;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.f25886dern;
        int iHashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j2 = this.f25891wireman;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f25888marial)) * 1000003;
        String str = this.f25884beachfront;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.f25885competently;
        int i2 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f25887impromptu;
        int iHashCode5 = (i2 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        apical apicalVar = this.f25890taiyuan;
        return iHashCode5 ^ (apicalVar != null ? apicalVar.hashCode() : 0);
    }

    @Override // escorial.triweekly
    public byte[] impromptu() {
        return this.f25888marial;
    }

    @Override // escorial.triweekly
    public long marial() {
        return this.f25891wireman;
    }

    @Override // escorial.triweekly
    public ComplianceData saneness() {
        return this.f25886dern;
    }

    @Override // escorial.triweekly
    public String taiyuan() {
        return this.f25884beachfront;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f25883attabal + ", eventCode=" + this.f25889saneness + ", complianceData=" + this.f25886dern + ", eventUptimeMs=" + this.f25891wireman + ", sourceExtension=" + Arrays.toString(this.f25888marial) + ", sourceExtensionJsonProto3=" + this.f25884beachfront + ", timezoneOffsetSeconds=" + this.f25885competently + ", networkConnectionInfo=" + this.f25887impromptu + ", experimentIds=" + this.f25890taiyuan + "}";
    }

    @Override // escorial.triweekly
    public long wireman() {
        return this.f25883attabal;
    }

    public competently(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, apical apicalVar) {
        this.f25883attabal = j;
        this.f25889saneness = num;
        this.f25886dern = complianceData;
        this.f25891wireman = j2;
        this.f25888marial = bArr;
        this.f25884beachfront = str;
        this.f25885competently = j3;
        this.f25887impromptu = networkConnectionInfo;
        this.f25890taiyuan = apicalVar;
    }
}
