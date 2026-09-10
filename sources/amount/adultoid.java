package amount;

import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class adultoid extends sealless.marial.wireman.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Double f3986attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f3987beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f3988dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f3989marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f3990saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f3991wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    public static final class saneness extends sealless.marial.wireman.dern.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Double f3992attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f3993beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public byte f3994competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f3995dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f3996marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f3997saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f3998wireman;

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern attabal() {
            if (this.f3994competently == 31) {
                return new adultoid(this.f3992attabal, this.f3997saneness, this.f3995dern, this.f3998wireman, this.f3996marial, this.f3993beachfront);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f3994competently & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f3994competently & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f3994competently & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f3994competently & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f3994competently & ExecutionDataWriter.BLOCK_SESSIONINFO) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern.attabal beachfront(boolean z) {
            this.f3995dern = z;
            this.f3994competently = (byte) (this.f3994competently | 2);
            return this;
        }

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern.attabal competently(long j) {
            this.f3996marial = j;
            this.f3994competently = (byte) (this.f3994competently | 8);
            return this;
        }

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern.attabal dern(int i) {
            this.f3997saneness = i;
            this.f3994competently = (byte) (this.f3994competently | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern.attabal marial(int i) {
            this.f3998wireman = i;
            this.f3994competently = (byte) (this.f3994competently | 4);
            return this;
        }

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern.attabal saneness(Double d) {
            this.f3992attabal = d;
            return this;
        }

        @Override // amount.sealless.marial.wireman.dern.attabal
        public sealless.marial.wireman.dern.attabal wireman(long j) {
            this.f3993beachfront = j;
            this.f3994competently = (byte) (this.f3994competently | ExecutionDataWriter.BLOCK_SESSIONINFO);
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.dern
    public long beachfront() {
        return this.f3989marial;
    }

    @Override // amount.sealless.marial.wireman.dern
    public boolean competently() {
        return this.f3988dern;
    }

    @Override // amount.sealless.marial.wireman.dern
    public int dern() {
        return this.f3990saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.dern) {
            sealless.marial.wireman.dern dernVar = (sealless.marial.wireman.dern) obj;
            Double d = this.f3986attabal;
            if (d != null ? d.equals(dernVar.saneness()) : dernVar.saneness() == null) {
                if (this.f3990saneness == dernVar.dern() && this.f3988dern == dernVar.competently() && this.f3991wireman == dernVar.marial() && this.f3989marial == dernVar.beachfront() && this.f3987beachfront == dernVar.wireman()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Double d = this.f3986attabal;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f3990saneness) * 1000003) ^ (this.f3988dern ? 1231 : 1237)) * 1000003) ^ this.f3991wireman) * 1000003;
        long j = this.f3989marial;
        long j2 = this.f3987beachfront;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // amount.sealless.marial.wireman.dern
    public int marial() {
        return this.f3991wireman;
    }

    @Override // amount.sealless.marial.wireman.dern
    public Double saneness() {
        return this.f3986attabal;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f3986attabal + ", batteryVelocity=" + this.f3990saneness + ", proximityOn=" + this.f3988dern + ", orientation=" + this.f3991wireman + ", ramUsed=" + this.f3989marial + ", diskUsed=" + this.f3987beachfront + "}";
    }

    @Override // amount.sealless.marial.wireman.dern
    public long wireman() {
        return this.f3987beachfront;
    }

    public adultoid(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f3986attabal = d;
        this.f3990saneness = i;
        this.f3988dern = z;
        this.f3991wireman = i2;
        this.f3989marial = j;
        this.f3987beachfront = j2;
    }
}
