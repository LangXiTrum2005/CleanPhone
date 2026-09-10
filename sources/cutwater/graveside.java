package cutwater;

import kotlinx.serialization.json.internal.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcutwater/graveside;", "Lcutwater/attabal;", "Lcutwater/beachfront;", "configuration", "Lcerebral/dern;", "module", "<init>", "(Lcutwater/beachfront;Lcerebral/dern;)V", "", "competently", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class graveside extends attabal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public graveside(JsonConfiguration configuration, cerebral.dern module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        competently();
    }

    public final void competently() {
        if (Intrinsics.wireman(getSerializersModule(), cerebral.wireman.attabal())) {
            return;
        }
        getSerializersModule().attabal(new saran(getConfiguration().getUseArrayPolymorphism(), getConfiguration().getClassDiscriminator()));
    }
}
