package androidx.collection.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RuntimeHelpersKt {
    public static final void a(String message) {
        Intrinsics.f(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        Intrinsics.f(message, "message");
        throw new IndexOutOfBoundsException(message);
    }
}
