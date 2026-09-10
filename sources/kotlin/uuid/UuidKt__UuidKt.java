package kotlin.uuid;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    public static final void b(int i2, String str) {
        Intrinsics.f(str, "<this>");
        if (str.charAt(i2) == '-') {
            return;
        }
        StringBuilder sbU = a.u(i2, "Expected '-' (hyphen) at index ", ", but was '");
        sbU.append(str.charAt(i2));
        sbU.append('\'');
        throw new IllegalArgumentException(sbU.toString().toString());
    }
}
