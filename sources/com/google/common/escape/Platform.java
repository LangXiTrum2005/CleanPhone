package com.google.common.escape;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Platform {

    /* JADX INFO: renamed from: com.google.common.escape.Platform$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        public final char[] initialValue() {
            return new char[1024];
        }
    }

    static {
        new AnonymousClass1();
    }
}
