package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/internal/gintrap;", "sb", "Lcutwater/attabal;", "json", "Lkotlinx/serialization/json/internal/triweekly;", "attabal", "(Lkotlinx/serialization/json/internal/gintrap;Lcutwater/attabal;)Lkotlinx/serialization/json/internal/triweekly;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class graveside {
    public static final triweekly attabal(gintrap sb, cutwater.attabal json) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.getConfiguration().getPrettyPrint() ? new molybdenite(sb, json) : new triweekly(sb);
    }
}
