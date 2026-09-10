package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/trm;", "Lkotlinx/serialization/json/internal/dern;", "Lcutwater/attabal;", "json", "Lcutwater/impromptu;", "value", "", "polymorphicDiscriminator", "<init>", "(Lcutwater/attabal;Lcutwater/impromptu;Ljava/lang/String;)V", "Lbristol/beachfront;", "descriptor", "", "impassible", "(Lbristol/beachfront;)I", "tag", "empress", "(Ljava/lang/String;)Lcutwater/impromptu;", "Lcutwater/impromptu;", "achondroplasia", "()Lcutwater/impromptu;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class trm extends dern {
    private final cutwater.impromptu value;

    public /* synthetic */ trm(cutwater.attabal attabalVar, cutwater.impromptu impromptuVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, impromptuVar, (i & 4) != 0 ? null : str);
    }

    @Override // kotlinx.serialization.json.internal.dern
    /* JADX INFO: renamed from: achondroplasia, reason: from getter */
    public cutwater.impromptu getValue() {
        return this.value;
    }

    @Override // kotlinx.serialization.json.internal.dern
    public cutwater.impromptu empress(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // fastidiously.dern
    public int impassible(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trm(cutwater.attabal json, cutwater.impromptu value, String str) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        timberyard("primitive");
    }
}
