package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu extends sealless.marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final List<sealless.marial.wireman> f4263apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4264attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f4265beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final sealless.marial.attabal f4266competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final sealless.marial.dern f4267cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4268dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final int f4269formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final sealless.marial.beachfront f4270impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Long f4271marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4272saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final sealless.marial.AbstractC0010marial f4273taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f4274wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class saneness extends sealless.marial.saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public List<sealless.marial.wireman> f4275apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4276attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f4277beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public sealless.marial.attabal f4278competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public sealless.marial.dern f4279cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4280dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f4281formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public byte f4282impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public sealless.marial.beachfront f4283impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Long f4284marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4285saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public sealless.marial.AbstractC0010marial f4286taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f4287wireman;

        @Override // amount.sealless.marial.saneness
        public sealless.marial attabal() {
            String str;
            String str2;
            sealless.marial.attabal attabalVar;
            if (this.f4282impassible == 7 && (str = this.f4276attabal) != null && (str2 = this.f4285saneness) != null && (attabalVar = this.f4278competently) != null) {
                return new impromptu(str, str2, this.f4280dern, this.f4287wireman, this.f4284marial, this.f4277beachfront, attabalVar, this.f4283impromptu, this.f4286taiyuan, this.f4279cutely, this.f4275apical, this.f4281formularize);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4276attabal == null) {
                sb.append(" generator");
            }
            if (this.f4285saneness == null) {
                sb.append(" identifier");
            }
            if ((this.f4282impassible & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f4282impassible & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f4278competently == null) {
                sb.append(" app");
            }
            if ((this.f4282impassible & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness beachfront(Long l) {
            this.f4284marial = l;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness competently(List<sealless.marial.wireman> list) {
            this.f4275apical = list;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness cutely(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f4285saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness dern(String str) {
            this.f4280dern = str;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness formularize(sealless.marial.AbstractC0010marial abstractC0010marial) {
            this.f4286taiyuan = abstractC0010marial;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness impassible(long j) {
            this.f4287wireman = j;
            this.f4282impassible = (byte) (this.f4282impassible | 1);
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness impromptu(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f4276attabal = str;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness marial(sealless.marial.dern dernVar) {
            this.f4279cutely = dernVar;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness saneness(sealless.marial.attabal attabalVar) {
            if (attabalVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f4278competently = attabalVar;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness taiyuan(int i) {
            this.f4281formularize = i;
            this.f4282impassible = (byte) (this.f4282impassible | 4);
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness triweekly(sealless.marial.beachfront beachfrontVar) {
            this.f4283impromptu = beachfrontVar;
            return this;
        }

        @Override // amount.sealless.marial.saneness
        public sealless.marial.saneness wireman(boolean z) {
            this.f4277beachfront = z;
            this.f4282impassible = (byte) (this.f4282impassible | 2);
            return this;
        }

        public saneness() {
        }

        public saneness(sealless.marial marialVar) {
            this.f4276attabal = marialVar.competently();
            this.f4285saneness = marialVar.taiyuan();
            this.f4280dern = marialVar.dern();
            this.f4287wireman = marialVar.formularize();
            this.f4284marial = marialVar.marial();
            this.f4277beachfront = marialVar.triweekly();
            this.f4278competently = marialVar.saneness();
            this.f4283impromptu = marialVar.impassible();
            this.f4286taiyuan = marialVar.apical();
            this.f4279cutely = marialVar.wireman();
            this.f4275apical = marialVar.beachfront();
            this.f4281formularize = marialVar.impromptu();
            this.f4282impassible = (byte) 7;
        }
    }

    @Override // amount.sealless.marial
    public sealless.marial.AbstractC0010marial apical() {
        return this.f4273taiyuan;
    }

    @Override // amount.sealless.marial
    public List<sealless.marial.wireman> beachfront() {
        return this.f4263apical;
    }

    @Override // amount.sealless.marial
    public String competently() {
        return this.f4264attabal;
    }

    @Override // amount.sealless.marial
    public String dern() {
        return this.f4268dern;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        sealless.marial.beachfront beachfrontVar;
        sealless.marial.AbstractC0010marial abstractC0010marial;
        sealless.marial.dern dernVar;
        List<sealless.marial.wireman> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial) {
            sealless.marial marialVar = (sealless.marial) obj;
            if (this.f4264attabal.equals(marialVar.competently()) && this.f4272saneness.equals(marialVar.taiyuan()) && ((str = this.f4268dern) != null ? str.equals(marialVar.dern()) : marialVar.dern() == null) && this.f4274wireman == marialVar.formularize() && ((l = this.f4271marial) != null ? l.equals(marialVar.marial()) : marialVar.marial() == null) && this.f4265beachfront == marialVar.triweekly() && this.f4266competently.equals(marialVar.saneness()) && ((beachfrontVar = this.f4270impromptu) != null ? beachfrontVar.equals(marialVar.impassible()) : marialVar.impassible() == null) && ((abstractC0010marial = this.f4273taiyuan) != null ? abstractC0010marial.equals(marialVar.apical()) : marialVar.apical() == null) && ((dernVar = this.f4267cutely) != null ? dernVar.equals(marialVar.wireman()) : marialVar.wireman() == null) && ((list = this.f4263apical) != null ? list.equals(marialVar.beachfront()) : marialVar.beachfront() == null) && this.f4269formularize == marialVar.impromptu()) {
                return true;
            }
        }
        return false;
    }

    @Override // amount.sealless.marial
    public long formularize() {
        return this.f4274wireman;
    }

    public int hashCode() {
        int iHashCode = (((this.f4264attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4272saneness.hashCode()) * 1000003;
        String str = this.f4268dern;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f4274wireman;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f4271marial;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f4265beachfront ? 1231 : 1237)) * 1000003) ^ this.f4266competently.hashCode()) * 1000003;
        sealless.marial.beachfront beachfrontVar = this.f4270impromptu;
        int iHashCode4 = (iHashCode3 ^ (beachfrontVar == null ? 0 : beachfrontVar.hashCode())) * 1000003;
        sealless.marial.AbstractC0010marial abstractC0010marial = this.f4273taiyuan;
        int iHashCode5 = (iHashCode4 ^ (abstractC0010marial == null ? 0 : abstractC0010marial.hashCode())) * 1000003;
        sealless.marial.dern dernVar = this.f4267cutely;
        int iHashCode6 = (iHashCode5 ^ (dernVar == null ? 0 : dernVar.hashCode())) * 1000003;
        List<sealless.marial.wireman> list = this.f4263apical;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f4269formularize;
    }

    @Override // amount.sealless.marial
    public sealless.marial.beachfront impassible() {
        return this.f4270impromptu;
    }

    @Override // amount.sealless.marial
    public int impromptu() {
        return this.f4269formularize;
    }

    @Override // amount.sealless.marial
    public sealless.marial.saneness kowloon() {
        return new saneness(this);
    }

    @Override // amount.sealless.marial
    public Long marial() {
        return this.f4271marial;
    }

    @Override // amount.sealless.marial
    public sealless.marial.attabal saneness() {
        return this.f4266competently;
    }

    @Override // amount.sealless.marial
    public String taiyuan() {
        return this.f4272saneness;
    }

    public String toString() {
        return "Session{generator=" + this.f4264attabal + ", identifier=" + this.f4272saneness + ", appQualitySessionId=" + this.f4268dern + ", startedAt=" + this.f4274wireman + ", endedAt=" + this.f4271marial + ", crashed=" + this.f4265beachfront + ", app=" + this.f4266competently + ", user=" + this.f4270impromptu + ", os=" + this.f4273taiyuan + ", device=" + this.f4267cutely + ", events=" + this.f4263apical + ", generatorType=" + this.f4269formularize + "}";
    }

    @Override // amount.sealless.marial
    public boolean triweekly() {
        return this.f4265beachfront;
    }

    @Override // amount.sealless.marial
    public sealless.marial.dern wireman() {
        return this.f4267cutely;
    }

    public impromptu(String str, String str2, String str3, long j, Long l, boolean z, sealless.marial.attabal attabalVar, sealless.marial.beachfront beachfrontVar, sealless.marial.AbstractC0010marial abstractC0010marial, sealless.marial.dern dernVar, List<sealless.marial.wireman> list, int i) {
        this.f4264attabal = str;
        this.f4272saneness = str2;
        this.f4268dern = str3;
        this.f4274wireman = j;
        this.f4271marial = l;
        this.f4265beachfront = z;
        this.f4266competently = attabalVar;
        this.f4270impromptu = beachfrontVar;
        this.f4273taiyuan = abstractC0010marial;
        this.f4267cutely = dernVar;
        this.f4263apical = list;
        this.f4269formularize = i;
    }
}
