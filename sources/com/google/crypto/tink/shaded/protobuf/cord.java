package com.google.crypto.tink.shaded.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord {
    public static void attabal(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void dern(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void saneness(Buffer buffer) {
        buffer.mark();
    }

    public static void wireman(Buffer buffer) {
        buffer.reset();
    }
}
