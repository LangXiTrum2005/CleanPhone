package amount;

import java.util.List;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern extends sealless.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f4196attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f4197beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final long f4198competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f4199dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f4200impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f4201marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4202saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final List<sealless.attabal.AbstractC0007attabal> f4203taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f4204wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    public static final class saneness extends sealless.attabal.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f4205attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f4206beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f4207competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public byte f4208cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f4209dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public String f4210impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f4211marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4212saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public List<sealless.attabal.AbstractC0007attabal> f4213taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f4214wireman;

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal attabal() {
            String str;
            if (this.f4208cutely == 63 && (str = this.f4212saneness) != null) {
                return new dern(this.f4205attabal, str, this.f4209dern, this.f4214wireman, this.f4211marial, this.f4206beachfront, this.f4207competently, this.f4210impromptu, this.f4213taiyuan);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f4208cutely & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f4212saneness == null) {
                sb.append(" processName");
            }
            if ((this.f4208cutely & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f4208cutely & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f4208cutely & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f4208cutely & ExecutionDataWriter.BLOCK_SESSIONINFO) == 0) {
                sb.append(" rss");
            }
            if ((this.f4208cutely & RemoteControlWriter.BLOCK_CMDOK) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness beachfront(long j) {
            this.f4211marial = j;
            this.f4208cutely = (byte) (this.f4208cutely | 8);
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness competently(int i) {
            this.f4209dern = i;
            this.f4208cutely = (byte) (this.f4208cutely | 2);
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness cutely(String str) {
            this.f4210impromptu = str;
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness dern(int i) {
            this.f4214wireman = i;
            this.f4208cutely = (byte) (this.f4208cutely | 4);
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness impromptu(long j) {
            this.f4206beachfront = j;
            this.f4208cutely = (byte) (this.f4208cutely | ExecutionDataWriter.BLOCK_SESSIONINFO);
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness marial(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f4212saneness = str;
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness saneness(List<sealless.attabal.AbstractC0007attabal> list) {
            this.f4213taiyuan = list;
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness taiyuan(long j) {
            this.f4207competently = j;
            this.f4208cutely = (byte) (this.f4208cutely | RemoteControlWriter.BLOCK_CMDOK);
            return this;
        }

        @Override // amount.sealless.attabal.saneness
        public sealless.attabal.saneness wireman(int i) {
            this.f4205attabal = i;
            this.f4208cutely = (byte) (this.f4208cutely | 1);
            return this;
        }
    }

    @Override // amount.sealless.attabal
    public long beachfront() {
        return this.f4201marial;
    }

    @Override // amount.sealless.attabal
    public int competently() {
        return this.f4199dern;
    }

    @Override // amount.sealless.attabal
    public String cutely() {
        return this.f4200impromptu;
    }

    @Override // amount.sealless.attabal
    public int dern() {
        return this.f4204wireman;
    }

    public boolean equals(Object obj) {
        String str;
        List<sealless.attabal.AbstractC0007attabal> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.attabal) {
            sealless.attabal attabalVar = (sealless.attabal) obj;
            if (this.f4196attabal == attabalVar.wireman() && this.f4202saneness.equals(attabalVar.marial()) && this.f4199dern == attabalVar.competently() && this.f4204wireman == attabalVar.dern() && this.f4201marial == attabalVar.beachfront() && this.f4197beachfront == attabalVar.impromptu() && this.f4198competently == attabalVar.taiyuan() && ((str = this.f4200impromptu) != null ? str.equals(attabalVar.cutely()) : attabalVar.cutely() == null) && ((list = this.f4203taiyuan) != null ? list.equals(attabalVar.saneness()) : attabalVar.saneness() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f4196attabal ^ 1000003) * 1000003) ^ this.f4202saneness.hashCode()) * 1000003) ^ this.f4199dern) * 1000003) ^ this.f4204wireman) * 1000003;
        long j = this.f4201marial;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f4197beachfront;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f4198competently;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f4200impromptu;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<sealless.attabal.AbstractC0007attabal> list = this.f4203taiyuan;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // amount.sealless.attabal
    public long impromptu() {
        return this.f4197beachfront;
    }

    @Override // amount.sealless.attabal
    public String marial() {
        return this.f4202saneness;
    }

    @Override // amount.sealless.attabal
    public List<sealless.attabal.AbstractC0007attabal> saneness() {
        return this.f4203taiyuan;
    }

    @Override // amount.sealless.attabal
    public long taiyuan() {
        return this.f4198competently;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f4196attabal + ", processName=" + this.f4202saneness + ", reasonCode=" + this.f4199dern + ", importance=" + this.f4204wireman + ", pss=" + this.f4201marial + ", rss=" + this.f4197beachfront + ", timestamp=" + this.f4198competently + ", traceFile=" + this.f4200impromptu + ", buildIdMappingForArch=" + this.f4203taiyuan + "}";
    }

    @Override // amount.sealless.attabal
    public int wireman() {
        return this.f4196attabal;
    }

    public dern(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List<sealless.attabal.AbstractC0007attabal> list) {
        this.f4196attabal = i;
        this.f4202saneness = str;
        this.f4199dern = i2;
        this.f4204wireman = i3;
        this.f4201marial = j;
        this.f4197beachfront = j2;
        this.f4198competently = j3;
        this.f4200impromptu = str2;
        this.f4203taiyuan = list;
    }
}
