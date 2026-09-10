package escorial;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_LogRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu extends kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f25902attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final List<triweekly> f25903beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final QosTier f25904competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ClientInfo f25905dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f25906marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f25907saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Integer f25908wireman;

    /* JADX INFO: compiled from: AutoValue_LogRequest.java */
    public static final class saneness extends kowloon.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Long f25909attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public List<triweekly> f25910beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public QosTier f25911competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ClientInfo f25912dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public String f25913marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Long f25914saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Integer f25915wireman;

        @Override // escorial.kowloon.attabal
        public kowloon attabal() {
            String str = "";
            if (this.f25909attabal == null) {
                str = " requestTimeMs";
            }
            if (this.f25914saneness == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new impromptu(this.f25909attabal.longValue(), this.f25914saneness.longValue(), this.f25912dern, this.f25915wireman, this.f25913marial, this.f25910beachfront, this.f25911competently);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal beachfront(QosTier qosTier) {
            this.f25911competently = qosTier;
            return this;
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal competently(long j) {
            this.f25909attabal = Long.valueOf(j);
            return this;
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal dern(List<triweekly> list) {
            this.f25910beachfront = list;
            return this;
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal impromptu(long j) {
            this.f25914saneness = Long.valueOf(j);
            return this;
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal marial(String str) {
            this.f25913marial = str;
            return this;
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal saneness(ClientInfo clientInfo) {
            this.f25912dern = clientInfo;
            return this;
        }

        @Override // escorial.kowloon.attabal
        public kowloon.attabal wireman(Integer num) {
            this.f25915wireman = num;
            return this;
        }
    }

    @Override // escorial.kowloon
    public QosTier beachfront() {
        return this.f25904competently;
    }

    @Override // escorial.kowloon
    public long competently() {
        return this.f25902attabal;
    }

    @Override // escorial.kowloon
    public List<triweekly> dern() {
        return this.f25903beachfront;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<triweekly> list;
        QosTier qosTier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kowloon) {
            kowloon kowloonVar = (kowloon) obj;
            if (this.f25902attabal == kowloonVar.competently() && this.f25907saneness == kowloonVar.impromptu() && ((clientInfo = this.f25905dern) != null ? clientInfo.equals(kowloonVar.saneness()) : kowloonVar.saneness() == null) && ((num = this.f25908wireman) != null ? num.equals(kowloonVar.wireman()) : kowloonVar.wireman() == null) && ((str = this.f25906marial) != null ? str.equals(kowloonVar.marial()) : kowloonVar.marial() == null) && ((list = this.f25903beachfront) != null ? list.equals(kowloonVar.dern()) : kowloonVar.dern() == null) && ((qosTier = this.f25904competently) != null ? qosTier.equals(kowloonVar.beachfront()) : kowloonVar.beachfront() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f25902attabal;
        long j2 = this.f25907saneness;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f25905dern;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f25908wireman;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f25906marial;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<triweekly> list = this.f25903beachfront;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f25904competently;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    @Override // escorial.kowloon
    public long impromptu() {
        return this.f25907saneness;
    }

    @Override // escorial.kowloon
    public String marial() {
        return this.f25906marial;
    }

    @Override // escorial.kowloon
    public ClientInfo saneness() {
        return this.f25905dern;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f25902attabal + ", requestUptimeMs=" + this.f25907saneness + ", clientInfo=" + this.f25905dern + ", logSource=" + this.f25908wireman + ", logSourceName=" + this.f25906marial + ", logEvents=" + this.f25903beachfront + ", qosTier=" + this.f25904competently + "}";
    }

    @Override // escorial.kowloon
    public Integer wireman() {
        return this.f25908wireman;
    }

    public impromptu(long j, long j2, ClientInfo clientInfo, Integer num, String str, List<triweekly> list, QosTier qosTier) {
        this.f25902attabal = j;
        this.f25907saneness = j2;
        this.f25905dern = clientInfo;
        this.f25908wireman = num;
        this.f25906marial = str;
        this.f25903beachfront = list;
        this.f25904competently = qosTier;
    }
}
