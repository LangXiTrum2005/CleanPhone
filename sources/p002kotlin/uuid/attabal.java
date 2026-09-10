package p002kotlin.uuid;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/uuid/Uuid;", "uuid", "", "saneness", "(Lkotlin/uuid/Uuid;)Ljava/lang/Object;", "", "", "dst", "", "dstOffset", "startIndex", "endIndex", "", "attabal", "(J[BIII)V", "index", "value", "dern", "([BIJ)V", "", "hexDashString", "marial", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "hexString", "wireman", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
public class attabal {
    public static final void attabal(long j, byte[] dst, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        saneness.impromptu(j, dst, i, i2, i3);
    }

    public static final void dern(byte[] bArr, int i, long j) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        saneness.taiyuan(bArr, i, j);
    }

    public static final Uuid marial(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return saneness.formularize(hexDashString);
    }

    public static final Object saneness(Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final Uuid wireman(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return saneness.apical(hexString);
    }
}
