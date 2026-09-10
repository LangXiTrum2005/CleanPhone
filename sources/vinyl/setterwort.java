package vinyl;

import java.util.Arrays;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbristol/beachfront;", "", "typeParams", "", "attabal", "(Lbristol/beachfront;[Lbristol/beachfront;)I", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setterwort {
    public static final int attabal(bristol.beachfront beachfrontVar, bristol.beachfront[] typeParams) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (beachfrontVar.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<bristol.beachfront> iterableAttabal = bristol.cutely.attabal(beachfrontVar);
        Iterator<bristol.beachfront> it = iterableAttabal.iterator();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i = i2 + iHashCode3;
        }
        Iterator<bristol.beachfront> it2 = iterableAttabal.iterator();
        while (it2.hasNext()) {
            int i3 = iHashCode2 * 31;
            bristol.impassible kind = it2.next().getKind();
            iHashCode2 = i3 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }
}
