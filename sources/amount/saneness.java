package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends sealless {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final sealless.marial f4333apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f4334beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String f4335competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final String f4336cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4337dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final sealless.wireman f4338formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final sealless.attabal f4339impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f4340impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f4341marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4342saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final String f4343taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f4344wireman;

    /* JADX INFO: renamed from: amount.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
    public static final class C0006saneness extends sealless.saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public sealless.wireman f4345apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4346attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f4347beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public String f4348competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public sealless.marial f4349cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f4350dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public sealless.attabal f4351formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public byte f4352impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public String f4353impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public String f4354marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4355saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public String f4356taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f4357wireman;

        @Override // amount.sealless.saneness
        public sealless.saneness apical(int i) {
            this.f4350dern = i;
            this.f4352impassible = (byte) (this.f4352impassible | 1);
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless attabal() {
            if (this.f4352impassible == 1 && this.f4346attabal != null && this.f4355saneness != null && this.f4357wireman != null && this.f4353impromptu != null && this.f4356taiyuan != null) {
                return new saneness(this.f4346attabal, this.f4355saneness, this.f4350dern, this.f4357wireman, this.f4354marial, this.f4347beachfront, this.f4348competently, this.f4353impromptu, this.f4356taiyuan, this.f4349cutely, this.f4345apical, this.f4351formularize);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4346attabal == null) {
                sb.append(" sdkVersion");
            }
            if (this.f4355saneness == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f4352impassible) == 0) {
                sb.append(" platform");
            }
            if (this.f4357wireman == null) {
                sb.append(" installationUuid");
            }
            if (this.f4353impromptu == null) {
                sb.append(" buildVersion");
            }
            if (this.f4356taiyuan == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.saneness
        public sealless.saneness beachfront(String str) {
            this.f4347beachfront = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness competently(String str) {
            this.f4354marial = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness cutely(sealless.wireman wiremanVar) {
            this.f4345apical = wiremanVar;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness dern(String str) {
            this.f4348competently = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness formularize(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f4346attabal = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness impassible(sealless.marial marialVar) {
            this.f4349cutely = marialVar;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness impromptu(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f4355saneness = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness marial(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f4356taiyuan = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness saneness(sealless.attabal attabalVar) {
            this.f4351formularize = attabalVar;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness taiyuan(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f4357wireman = str;
            return this;
        }

        @Override // amount.sealless.saneness
        public sealless.saneness wireman(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f4353impromptu = str;
            return this;
        }

        public C0006saneness() {
        }

        public C0006saneness(sealless seallessVar) {
            this.f4346attabal = seallessVar.impassible();
            this.f4355saneness = seallessVar.taiyuan();
            this.f4350dern = seallessVar.formularize();
            this.f4357wireman = seallessVar.cutely();
            this.f4354marial = seallessVar.impromptu();
            this.f4347beachfront = seallessVar.competently();
            this.f4348competently = seallessVar.wireman();
            this.f4353impromptu = seallessVar.marial();
            this.f4356taiyuan = seallessVar.beachfront();
            this.f4349cutely = seallessVar.triweekly();
            this.f4345apical = seallessVar.apical();
            this.f4351formularize = seallessVar.dern();
            this.f4352impassible = (byte) 1;
        }
    }

    @Override // amount.sealless
    public sealless.wireman apical() {
        return this.f4338formularize;
    }

    @Override // amount.sealless
    public String beachfront() {
        return this.f4336cutely;
    }

    @Override // amount.sealless
    public String competently() {
        return this.f4335competently;
    }

    @Override // amount.sealless
    public String cutely() {
        return this.f4341marial;
    }

    @Override // amount.sealless
    public sealless.attabal dern() {
        return this.f4339impassible;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        sealless.marial marialVar;
        sealless.wireman wiremanVar;
        sealless.attabal attabalVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless) {
            sealless seallessVar = (sealless) obj;
            if (this.f4342saneness.equals(seallessVar.impassible()) && this.f4337dern.equals(seallessVar.taiyuan()) && this.f4344wireman == seallessVar.formularize() && this.f4341marial.equals(seallessVar.cutely()) && ((str = this.f4334beachfront) != null ? str.equals(seallessVar.impromptu()) : seallessVar.impromptu() == null) && ((str2 = this.f4335competently) != null ? str2.equals(seallessVar.competently()) : seallessVar.competently() == null) && ((str3 = this.f4340impromptu) != null ? str3.equals(seallessVar.wireman()) : seallessVar.wireman() == null) && this.f4343taiyuan.equals(seallessVar.marial()) && this.f4336cutely.equals(seallessVar.beachfront()) && ((marialVar = this.f4333apical) != null ? marialVar.equals(seallessVar.triweekly()) : seallessVar.triweekly() == null) && ((wiremanVar = this.f4338formularize) != null ? wiremanVar.equals(seallessVar.apical()) : seallessVar.apical() == null) && ((attabalVar = this.f4339impassible) != null ? attabalVar.equals(seallessVar.dern()) : seallessVar.dern() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // amount.sealless
    public int formularize() {
        return this.f4344wireman;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f4342saneness.hashCode() ^ 1000003) * 1000003) ^ this.f4337dern.hashCode()) * 1000003) ^ this.f4344wireman) * 1000003) ^ this.f4341marial.hashCode()) * 1000003;
        String str = this.f4334beachfront;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f4335competently;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4340impromptu;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f4343taiyuan.hashCode()) * 1000003) ^ this.f4336cutely.hashCode()) * 1000003;
        sealless.marial marialVar = this.f4333apical;
        int iHashCode5 = (iHashCode4 ^ (marialVar == null ? 0 : marialVar.hashCode())) * 1000003;
        sealless.wireman wiremanVar = this.f4338formularize;
        int iHashCode6 = (iHashCode5 ^ (wiremanVar == null ? 0 : wiremanVar.hashCode())) * 1000003;
        sealless.attabal attabalVar = this.f4339impassible;
        return iHashCode6 ^ (attabalVar != null ? attabalVar.hashCode() : 0);
    }

    @Override // amount.sealless
    public String impassible() {
        return this.f4342saneness;
    }

    @Override // amount.sealless
    public String impromptu() {
        return this.f4334beachfront;
    }

    @Override // amount.sealless
    public sealless.saneness kowloon() {
        return new C0006saneness(this);
    }

    @Override // amount.sealless
    public String marial() {
        return this.f4343taiyuan;
    }

    @Override // amount.sealless
    public String taiyuan() {
        return this.f4337dern;
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f4342saneness + ", gmpAppId=" + this.f4337dern + ", platform=" + this.f4344wireman + ", installationUuid=" + this.f4341marial + ", firebaseInstallationId=" + this.f4334beachfront + ", firebaseAuthenticationToken=" + this.f4335competently + ", appQualitySessionId=" + this.f4340impromptu + ", buildVersion=" + this.f4343taiyuan + ", displayVersion=" + this.f4336cutely + ", session=" + this.f4333apical + ", ndkPayload=" + this.f4338formularize + ", appExitInfo=" + this.f4339impassible + "}";
    }

    @Override // amount.sealless
    public sealless.marial triweekly() {
        return this.f4333apical;
    }

    @Override // amount.sealless
    public String wireman() {
        return this.f4340impromptu;
    }

    public saneness(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, sealless.marial marialVar, sealless.wireman wiremanVar, sealless.attabal attabalVar) {
        this.f4342saneness = str;
        this.f4337dern = str2;
        this.f4344wireman = i;
        this.f4341marial = str3;
        this.f4334beachfront = str4;
        this.f4335competently = str5;
        this.f4340impromptu = str6;
        this.f4343taiyuan = str7;
        this.f4336cutely = str8;
        this.f4333apical = marialVar;
        this.f4338formularize = wiremanVar;
        this.f4339impassible = attabalVar;
    }
}
