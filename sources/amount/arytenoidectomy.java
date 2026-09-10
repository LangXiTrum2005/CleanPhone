package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* JADX INFO: loaded from: classes3.dex */
public final class arytenoidectomy extends sealless.marial.wireman.attabal.saneness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4018attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> f4019dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f4020marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4021saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sealless.marial.wireman.attabal.saneness.dern f4022wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    public static final class saneness extends sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4023attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public byte f4024beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> f4025dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f4026marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4027saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public sealless.marial.wireman.attabal.saneness.dern f4028wireman;

        @Override // amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal
        public sealless.marial.wireman.attabal.saneness.dern attabal() {
            String str;
            List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> list;
            if (this.f4024beachfront == 1 && (str = this.f4023attabal) != null && (list = this.f4025dern) != null) {
                return new arytenoidectomy(str, this.f4027saneness, list, this.f4028wireman, this.f4026marial);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4023attabal == null) {
                sb.append(" type");
            }
            if (this.f4025dern == null) {
                sb.append(" frames");
            }
            if ((1 & this.f4024beachfront) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal
        public sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal beachfront(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f4023attabal = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal
        public sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal dern(List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f4025dern = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal
        public sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal marial(String str) {
            this.f4027saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal
        public sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal saneness(sealless.marial.wireman.attabal.saneness.dern dernVar) {
            this.f4028wireman = dernVar;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal
        public sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal wireman(int i) {
            this.f4026marial = i;
            this.f4024beachfront = (byte) (this.f4024beachfront | 1);
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.dern
    public String beachfront() {
        return this.f4018attabal;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.dern
    public List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> dern() {
        return this.f4019dern;
    }

    public boolean equals(Object obj) {
        String str;
        sealless.marial.wireman.attabal.saneness.dern dernVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.saneness.dern) {
            sealless.marial.wireman.attabal.saneness.dern dernVar2 = (sealless.marial.wireman.attabal.saneness.dern) obj;
            if (this.f4018attabal.equals(dernVar2.beachfront()) && ((str = this.f4021saneness) != null ? str.equals(dernVar2.marial()) : dernVar2.marial() == null) && this.f4019dern.equals(dernVar2.dern()) && ((dernVar = this.f4022wireman) != null ? dernVar.equals(dernVar2.saneness()) : dernVar2.saneness() == null) && this.f4020marial == dernVar2.wireman()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f4018attabal.hashCode() ^ 1000003) * 1000003;
        String str = this.f4021saneness;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f4019dern.hashCode()) * 1000003;
        sealless.marial.wireman.attabal.saneness.dern dernVar = this.f4022wireman;
        return ((iHashCode2 ^ (dernVar != null ? dernVar.hashCode() : 0)) * 1000003) ^ this.f4020marial;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.dern
    public String marial() {
        return this.f4021saneness;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.dern
    public sealless.marial.wireman.attabal.saneness.dern saneness() {
        return this.f4022wireman;
    }

    public String toString() {
        return "Exception{type=" + this.f4018attabal + ", reason=" + this.f4021saneness + ", frames=" + this.f4019dern + ", causedBy=" + this.f4022wireman + ", overflowCount=" + this.f4020marial + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.dern
    public int wireman() {
        return this.f4020marial;
    }

    public arytenoidectomy(String str, String str2, List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> list, sealless.marial.wireman.attabal.saneness.dern dernVar, int i) {
        this.f4018attabal = str;
        this.f4021saneness = str2;
        this.f4019dern = list;
        this.f4022wireman = dernVar;
        this.f4020marial = i;
    }
}
