package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible extends sealless.marial.wireman.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final sealless.marial.wireman.attabal.saneness f4248attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final List<sealless.marial.wireman.attabal.dern> f4249beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f4250competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<sealless.dern> f4251dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final sealless.marial.wireman.attabal.dern f4252marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<sealless.dern> f4253saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Boolean f4254wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class saneness extends sealless.marial.wireman.attabal.AbstractC0011attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public sealless.marial.wireman.attabal.saneness f4255attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public List<sealless.marial.wireman.attabal.dern> f4256beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f4257competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public List<sealless.dern> f4258dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public byte f4259impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public sealless.marial.wireman.attabal.dern f4260marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public List<sealless.dern> f4261saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Boolean f4262wireman;

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal attabal() {
            sealless.marial.wireman.attabal.saneness sanenessVar;
            if (this.f4259impromptu == 1 && (sanenessVar = this.f4255attabal) != null) {
                return new impassible(sanenessVar, this.f4261saneness, this.f4258dern, this.f4262wireman, this.f4260marial, this.f4256beachfront, this.f4257competently);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4255attabal == null) {
                sb.append(" execution");
            }
            if ((1 & this.f4259impromptu) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal beachfront(sealless.marial.wireman.attabal.saneness sanenessVar) {
            if (sanenessVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f4255attabal = sanenessVar;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal competently(List<sealless.dern> list) {
            this.f4258dern = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal dern(Boolean bool) {
            this.f4262wireman = bool;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal impromptu(int i) {
            this.f4257competently = i;
            this.f4259impromptu = (byte) (this.f4259impromptu | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal marial(List<sealless.dern> list) {
            this.f4261saneness = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal saneness(List<sealless.marial.wireman.attabal.dern> list) {
            this.f4256beachfront = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.AbstractC0011attabal
        public sealless.marial.wireman.attabal.AbstractC0011attabal wireman(sealless.marial.wireman.attabal.dern dernVar) {
            this.f4260marial = dernVar;
            return this;
        }

        public saneness() {
        }

        public saneness(sealless.marial.wireman.attabal attabalVar) {
            this.f4255attabal = attabalVar.beachfront();
            this.f4261saneness = attabalVar.marial();
            this.f4258dern = attabalVar.competently();
            this.f4262wireman = attabalVar.dern();
            this.f4260marial = attabalVar.wireman();
            this.f4256beachfront = attabalVar.saneness();
            this.f4257competently = attabalVar.impromptu();
            this.f4259impromptu = (byte) 1;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal
    public sealless.marial.wireman.attabal.saneness beachfront() {
        return this.f4248attabal;
    }

    @Override // amount.sealless.marial.wireman.attabal
    public List<sealless.dern> competently() {
        return this.f4251dern;
    }

    @Override // amount.sealless.marial.wireman.attabal
    public Boolean dern() {
        return this.f4254wireman;
    }

    public boolean equals(Object obj) {
        List<sealless.dern> list;
        List<sealless.dern> list2;
        Boolean bool;
        sealless.marial.wireman.attabal.dern dernVar;
        List<sealless.marial.wireman.attabal.dern> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal) {
            sealless.marial.wireman.attabal attabalVar = (sealless.marial.wireman.attabal) obj;
            if (this.f4248attabal.equals(attabalVar.beachfront()) && ((list = this.f4253saneness) != null ? list.equals(attabalVar.marial()) : attabalVar.marial() == null) && ((list2 = this.f4251dern) != null ? list2.equals(attabalVar.competently()) : attabalVar.competently() == null) && ((bool = this.f4254wireman) != null ? bool.equals(attabalVar.dern()) : attabalVar.dern() == null) && ((dernVar = this.f4252marial) != null ? dernVar.equals(attabalVar.wireman()) : attabalVar.wireman() == null) && ((list3 = this.f4249beachfront) != null ? list3.equals(attabalVar.saneness()) : attabalVar.saneness() == null) && this.f4250competently == attabalVar.impromptu()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f4248attabal.hashCode() ^ 1000003) * 1000003;
        List<sealless.dern> list = this.f4253saneness;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<sealless.dern> list2 = this.f4251dern;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f4254wireman;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        sealless.marial.wireman.attabal.dern dernVar = this.f4252marial;
        int iHashCode5 = (iHashCode4 ^ (dernVar == null ? 0 : dernVar.hashCode())) * 1000003;
        List<sealless.marial.wireman.attabal.dern> list3 = this.f4249beachfront;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f4250competently;
    }

    @Override // amount.sealless.marial.wireman.attabal
    public int impromptu() {
        return this.f4250competently;
    }

    @Override // amount.sealless.marial.wireman.attabal
    public List<sealless.dern> marial() {
        return this.f4253saneness;
    }

    @Override // amount.sealless.marial.wireman.attabal
    public List<sealless.marial.wireman.attabal.dern> saneness() {
        return this.f4249beachfront;
    }

    @Override // amount.sealless.marial.wireman.attabal
    public sealless.marial.wireman.attabal.AbstractC0011attabal taiyuan() {
        return new saneness(this);
    }

    public String toString() {
        return "Application{execution=" + this.f4248attabal + ", customAttributes=" + this.f4253saneness + ", internalKeys=" + this.f4251dern + ", background=" + this.f4254wireman + ", currentProcessDetails=" + this.f4252marial + ", appProcessDetails=" + this.f4249beachfront + ", uiOrientation=" + this.f4250competently + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal
    public sealless.marial.wireman.attabal.dern wireman() {
        return this.f4252marial;
    }

    public impassible(sealless.marial.wireman.attabal.saneness sanenessVar, List<sealless.dern> list, List<sealless.dern> list2, Boolean bool, sealless.marial.wireman.attabal.dern dernVar, List<sealless.marial.wireman.attabal.dern> list3, int i) {
        this.f4248attabal = sanenessVar;
        this.f4253saneness = list;
        this.f4251dern = list2;
        this.f4254wireman = bool;
        this.f4252marial = dernVar;
        this.f4249beachfront = list3;
        this.f4250competently = i;
    }
}
