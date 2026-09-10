package vinyl;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "seen", "goldenMask", "Lbristol/beachfront;", "descriptor", "", "attabal", "(IILbristol/beachfront;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hardpan {
    public static final void attabal(int i, int i2, bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.marial(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.impromptu());
    }
}
