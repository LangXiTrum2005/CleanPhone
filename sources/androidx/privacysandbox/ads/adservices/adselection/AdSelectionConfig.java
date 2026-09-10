package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionConfig {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AdSelectionConfig f7905e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdTechIdentifier f7906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdSelectionSignals f7907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdSelectionSignals f7908c;
    public final Map d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        AdTechIdentifier adTechIdentifier = new AdTechIdentifier();
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.e(EMPTY, "EMPTY");
        f7905e = new AdSelectionConfig(adTechIdentifier, new AdSelectionSignals(), new AdSelectionSignals(), EmptyMap.X);
    }

    public AdSelectionConfig(AdTechIdentifier adTechIdentifier, AdSelectionSignals adSelectionSignals, AdSelectionSignals adSelectionSignals2, Map map) {
        Uri trustedScoringSignalsUri = Uri.EMPTY;
        Intrinsics.f(trustedScoringSignalsUri, "decisionLogicUri");
        Intrinsics.f(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.f7906a = adTechIdentifier;
        this.f7907b = adSelectionSignals;
        this.f7908c = adSelectionSignals2;
        this.d = map;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        if (!this.f7906a.equals(adSelectionConfig.f7906a)) {
            return false;
        }
        Uri uri = Uri.EMPTY;
        if (!Intrinsics.a(uri, uri)) {
            return false;
        }
        EmptyList emptyList = EmptyList.X;
        return emptyList.equals(emptyList) && this.f7907b.equals(adSelectionConfig.f7907b) && this.f7908c.equals(adSelectionConfig.f7908c) && this.d.equals(adSelectionConfig.d) && Intrinsics.a(uri, uri);
    }

    public final int hashCode() {
        Uri uri = Uri.EMPTY;
        return uri.hashCode() + (((uri.hashCode() * 31) + 1) * 923521);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSelectionConfig: seller=");
        sb.append(this.f7906a);
        sb.append(", decisionLogicUri='");
        Uri uri = Uri.EMPTY;
        sb.append(uri);
        sb.append("', customAudienceBuyers=");
        sb.append(EmptyList.X);
        sb.append(", adSelectionSignals=");
        sb.append(this.f7907b);
        sb.append(", sellerSignals=");
        sb.append(this.f7908c);
        sb.append(", perBuyerSignals=");
        sb.append(this.d);
        sb.append(", trustedScoringSignalsUri=");
        sb.append(uri);
        return sb.toString();
    }
}
