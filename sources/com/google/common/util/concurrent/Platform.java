package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Platform {
    public static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
