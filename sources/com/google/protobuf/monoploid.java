package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid {
    private monoploid() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
