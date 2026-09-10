package amount;

import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class apical extends sealless.marial.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f3999attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f4000beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f4001competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f4002dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f4003impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f4004marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4005saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final String f4006taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f4007wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class saneness extends sealless.marial.dern.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f4008attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f4009beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f4010competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public byte f4011cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f4012dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public String f4013impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f4014marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4015saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public String f4016taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f4017wireman;

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern attabal() {
            String str;
            String str2;
            String str3;
            if (this.f4011cutely == 63 && (str = this.f4015saneness) != null && (str2 = this.f4013impromptu) != null && (str3 = this.f4016taiyuan) != null) {
                return new apical(this.f4008attabal, str, this.f4012dern, this.f4017wireman, this.f4014marial, this.f4009beachfront, this.f4010competently, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f4011cutely & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f4015saneness == null) {
                sb.append(" model");
            }
            if ((this.f4011cutely & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f4011cutely & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f4011cutely & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f4011cutely & ExecutionDataWriter.BLOCK_SESSIONINFO) == 0) {
                sb.append(" simulator");
            }
            if ((this.f4011cutely & RemoteControlWriter.BLOCK_CMDOK) == 0) {
                sb.append(" state");
            }
            if (this.f4013impromptu == null) {
                sb.append(" manufacturer");
            }
            if (this.f4016taiyuan == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal beachfront(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f4015saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal competently(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f4016taiyuan = str;
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal cutely(int i) {
            this.f4010competently = i;
            this.f4011cutely = (byte) (this.f4011cutely | RemoteControlWriter.BLOCK_CMDOK);
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal dern(int i) {
            this.f4012dern = i;
            this.f4011cutely = (byte) (this.f4011cutely | 2);
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal impromptu(long j) {
            this.f4017wireman = j;
            this.f4011cutely = (byte) (this.f4011cutely | 4);
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal marial(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f4013impromptu = str;
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal saneness(int i) {
            this.f4008attabal = i;
            this.f4011cutely = (byte) (this.f4011cutely | 1);
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal taiyuan(boolean z) {
            this.f4009beachfront = z;
            this.f4011cutely = (byte) (this.f4011cutely | ExecutionDataWriter.BLOCK_SESSIONINFO);
            return this;
        }

        @Override // amount.sealless.marial.dern.attabal
        public sealless.marial.dern.attabal wireman(long j) {
            this.f4014marial = j;
            this.f4011cutely = (byte) (this.f4011cutely | 8);
            return this;
        }
    }

    @Override // amount.sealless.marial.dern
    public String beachfront() {
        return this.f4005saneness;
    }

    @Override // amount.sealless.marial.dern
    public String competently() {
        return this.f4006taiyuan;
    }

    @Override // amount.sealless.marial.dern
    public boolean cutely() {
        return this.f4000beachfront;
    }

    @Override // amount.sealless.marial.dern
    public int dern() {
        return this.f4002dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.dern) {
            sealless.marial.dern dernVar = (sealless.marial.dern) obj;
            if (this.f3999attabal == dernVar.saneness() && this.f4005saneness.equals(dernVar.beachfront()) && this.f4002dern == dernVar.dern() && this.f4007wireman == dernVar.impromptu() && this.f4004marial == dernVar.wireman() && this.f4000beachfront == dernVar.cutely() && this.f4001competently == dernVar.taiyuan() && this.f4003impromptu.equals(dernVar.marial()) && this.f4006taiyuan.equals(dernVar.competently())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f3999attabal ^ 1000003) * 1000003) ^ this.f4005saneness.hashCode()) * 1000003) ^ this.f4002dern) * 1000003;
        long j = this.f4007wireman;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f4004marial;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f4000beachfront ? 1231 : 1237)) * 1000003) ^ this.f4001competently) * 1000003) ^ this.f4003impromptu.hashCode()) * 1000003) ^ this.f4006taiyuan.hashCode();
    }

    @Override // amount.sealless.marial.dern
    public long impromptu() {
        return this.f4007wireman;
    }

    @Override // amount.sealless.marial.dern
    public String marial() {
        return this.f4003impromptu;
    }

    @Override // amount.sealless.marial.dern
    public int saneness() {
        return this.f3999attabal;
    }

    @Override // amount.sealless.marial.dern
    public int taiyuan() {
        return this.f4001competently;
    }

    public String toString() {
        return "Device{arch=" + this.f3999attabal + ", model=" + this.f4005saneness + ", cores=" + this.f4002dern + ", ram=" + this.f4007wireman + ", diskSpace=" + this.f4004marial + ", simulator=" + this.f4000beachfront + ", state=" + this.f4001competently + ", manufacturer=" + this.f4003impromptu + ", modelClass=" + this.f4006taiyuan + "}";
    }

    @Override // amount.sealless.marial.dern
    public long wireman() {
        return this.f4004marial;
    }

    public apical(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f3999attabal = i;
        this.f4005saneness = str;
        this.f4002dern = i2;
        this.f4007wireman = j;
        this.f4004marial = j2;
        this.f4000beachfront = z;
        this.f4001competently = i3;
        this.f4003impromptu = str2;
        this.f4006taiyuan = str3;
    }
}
