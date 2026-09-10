package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class BaseRoomConnectionManager$DriverWrapper$openLocked$2 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.f(error, "error");
        throw new IllegalStateException(android.support.v4.media.a.r(new StringBuilder("Unable to open database '"), null, "'. Was a proper path / name used in Room's database builder?"), error);
    }
}
