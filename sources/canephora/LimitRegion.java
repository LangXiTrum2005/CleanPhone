package canephora;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: canephora.dern, reason: from toString */
/* JADX INFO: compiled from: LimitRegion.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcanephora/dern;", "", "Lcanephora/attabal;", "common", "Lcanephora/dern$attabal;", "rule", "<init>", "(Lcanephora/attabal;Lcanephora/dern$attabal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lcanephora/attabal;", "()Lcanephora/attabal;", "setCommon", "(Lcanephora/attabal;)V", "saneness", "Lcanephora/dern$attabal;", "()Lcanephora/dern$attabal;", "setRule", "(Lcanephora/dern$attabal;)V", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LimitRegion {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("common")
    private CommonLimit common;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("rules")
    private Rule rule;

    /* JADX INFO: renamed from: canephora.dern$attabal, reason: from toString */
    /* JADX INFO: compiled from: LimitRegion.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcanephora/dern$attabal;", "", "", "", "limitMcc", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/util/List;", "()Ljava/util/List;", "setLimitMcc", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Rule {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("mccs")
        private List<String> limitMcc;

        public Rule() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final List<String> attabal() {
            return this.limitMcc;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rule) && Intrinsics.wireman(this.limitMcc, ((Rule) other).limitMcc);
        }

        public int hashCode() {
            return this.limitMcc.hashCode();
        }

        public String toString() {
            return "Rule(limitMcc=" + this.limitMcc + ')';
        }

        public Rule(List<String> limitMcc) {
            Intrinsics.checkNotNullParameter(limitMcc, "limitMcc");
            this.limitMcc = limitMcc;
        }

        public /* synthetic */ Rule(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? adultoid.formularize() : list);
        }
    }

    public LimitRegion() {
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
        if (!(other instanceof LimitRegion)) {
            return false;
        }
        LimitRegion limitRegion = (LimitRegion) other;
        return Intrinsics.wireman(this.common, limitRegion.common) && Intrinsics.wireman(this.rule, limitRegion.rule);
    }

    public int hashCode() {
        return (this.common.hashCode() * 31) + this.rule.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Rule getRule() {
        return this.rule;
    }

    public String toString() {
        return "LimitRegion(common=" + this.common + ", rule=" + this.rule + ')';
    }

    public LimitRegion(CommonLimit common, Rule rule) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.common = common;
        this.rule = rule;
    }

    public /* synthetic */ LimitRegion(CommonLimit commonLimit, Rule rule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CommonLimit(null, 0, 3, null) : commonLimit, (i & 2) != 0 ? new Rule(null, 1, 0 == true ? 1 : 0) : rule);
    }
}
