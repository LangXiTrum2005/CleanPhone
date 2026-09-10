package canephora;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: canephora.marial, reason: from toString */
/* JADX INFO: compiled from: OldUser.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcanephora/marial;", "", "Lcanephora/attabal;", "common", "Lcanephora/marial$attabal;", "rule", "<init>", "(Lcanephora/attabal;Lcanephora/marial$attabal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lcanephora/attabal;", "()Lcanephora/attabal;", "setCommon", "(Lcanephora/attabal;)V", "saneness", "Lcanephora/marial$attabal;", "()Lcanephora/marial$attabal;", "setRule", "(Lcanephora/marial$attabal;)V", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OldUser {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("common")
    private CommonLimit common;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("rules")
    private Rule rule;

    /* JADX INFO: renamed from: canephora.marial$attabal, reason: from toString */
    /* JADX INFO: compiled from: OldUser.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcanephora/marial$attabal;", "", "", "gpSourceLimit", "notGpSourceLimit", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "I", "setGpSourceLimit", "(I)V", "saneness", "setNotGpSourceLimit", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Rule {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("gp_source")
        private int gpSourceLimit;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("not_gp_source")
        private int notGpSourceLimit;

        /* JADX WARN: Illegal instructions before constructor call */
        public Rule() {
            int i = 0;
            this(i, i, 3, null);
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final int getGpSourceLimit() {
            return this.gpSourceLimit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) other;
            return this.gpSourceLimit == rule.gpSourceLimit && this.notGpSourceLimit == rule.notGpSourceLimit;
        }

        public int hashCode() {
            return (Integer.hashCode(this.gpSourceLimit) * 31) + Integer.hashCode(this.notGpSourceLimit);
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final int getNotGpSourceLimit() {
            return this.notGpSourceLimit;
        }

        public String toString() {
            return "Rule(gpSourceLimit=" + this.gpSourceLimit + ", notGpSourceLimit=" + this.notGpSourceLimit + ')';
        }

        public Rule(int i, int i2) {
            this.gpSourceLimit = i;
            this.notGpSourceLimit = i2;
        }

        public /* synthetic */ Rule(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 7 : i, (i3 & 2) != 0 ? 7 : i2);
        }
    }

    public OldUser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final CommonLimit getCommon() {
        return this.common;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldUser)) {
            return false;
        }
        OldUser oldUser = (OldUser) other;
        return Intrinsics.wireman(this.common, oldUser.common) && Intrinsics.wireman(this.rule, oldUser.rule);
    }

    public int hashCode() {
        return (this.common.hashCode() * 31) + this.rule.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Rule getRule() {
        return this.rule;
    }

    public String toString() {
        return "OldUser(common=" + this.common + ", rule=" + this.rule + ')';
    }

    public OldUser(CommonLimit common, Rule rule) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.common = common;
        this.rule = rule;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OldUser(CommonLimit commonLimit, Rule rule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 0;
        this((i & 1) != 0 ? new CommonLimit(null, 0, 3, null) : commonLimit, (i & 2) != 0 ? new Rule(i2, i2, 3, null) : rule);
    }
}
