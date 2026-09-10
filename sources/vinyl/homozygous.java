package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvinyl/homozygous;", "Lvinyl/milliradian;", "Lbristol/beachfront;", "primitive", "<init>", "(Lbristol/beachfront;)V", "", "dern", "Ljava/lang/String;", "impromptu", "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class homozygous extends milliradian {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public homozygous(bristol.beachfront primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.serialName = primitive.getSerialName() + "Array";
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }
}
