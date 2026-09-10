package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal extends marial {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f19321beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f19322dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f19323marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f19324saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f19325wireman;

    /* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
    public static final class saneness extends marial.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Long f19326attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Integer f19327dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Integer f19328marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Integer f19329saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Long f19330wireman;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial.attabal
        public marial attabal() {
            String str = "";
            if (this.f19326attabal == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f19329saneness == null) {
                str = str + " loadBatchSize";
            }
            if (this.f19327dern == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f19330wireman == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f19328marial == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new attabal(this.f19326attabal.longValue(), this.f19329saneness.intValue(), this.f19327dern.intValue(), this.f19330wireman.longValue(), this.f19328marial.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial.attabal
        public marial.attabal beachfront(long j) {
            this.f19326attabal = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial.attabal
        public marial.attabal dern(long j) {
            this.f19330wireman = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial.attabal
        public marial.attabal marial(int i) {
            this.f19328marial = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial.attabal
        public marial.attabal saneness(int i) {
            this.f19327dern = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial.attabal
        public marial.attabal wireman(int i) {
            this.f19329saneness = Integer.valueOf(i);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial
    public long beachfront() {
        return this.f19324saneness;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial
    public long dern() {
        return this.f19323marial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof marial) {
            marial marialVar = (marial) obj;
            if (this.f19324saneness == marialVar.beachfront() && this.f19322dern == marialVar.wireman() && this.f19325wireman == marialVar.saneness() && this.f19323marial == marialVar.dern() && this.f19321beachfront == marialVar.marial()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f19324saneness;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19322dern) * 1000003) ^ this.f19325wireman) * 1000003;
        long j2 = this.f19323marial;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19321beachfront;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial
    public int marial() {
        return this.f19321beachfront;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial
    public int saneness() {
        return this.f19325wireman;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f19324saneness + ", loadBatchSize=" + this.f19322dern + ", criticalSectionEnterTimeoutMs=" + this.f19325wireman + ", eventCleanUpAge=" + this.f19323marial + ", maxBlobByteSizePerRow=" + this.f19321beachfront + "}";
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.marial
    public int wireman() {
        return this.f19322dern;
    }

    public attabal(long j, int i, int i2, long j2, int i3) {
        this.f19324saneness = j;
        this.f19322dern = i;
        this.f19325wireman = i2;
        this.f19323marial = j2;
        this.f19321beachfront = i3;
    }
}
