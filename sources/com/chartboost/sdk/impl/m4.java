package com.chartboost.sdk.impl;

import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m4 f14443a = new m4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f14444b = new byte[0];

    public final int a(InputStream input, OutputStream output) {
        Intrinsics.f(input, "input");
        Intrinsics.f(output, "output");
        long jB = b(input, output);
        if (jB > 2147483647L) {
            return -1;
        }
        return (int) jB;
    }

    public final long b(InputStream input, OutputStream output) {
        Intrinsics.f(input, "input");
        Intrinsics.f(output, "output");
        return a(input, output, Segment.SIZE);
    }

    public final long a(InputStream input, OutputStream output, int i2) {
        Intrinsics.f(input, "input");
        Intrinsics.f(output, "output");
        return a(input, output, new byte[i2]);
    }

    public final long a(InputStream input, OutputStream output, byte[] buffer) throws IOException {
        Intrinsics.f(input, "input");
        Intrinsics.f(output, "output");
        Intrinsics.f(buffer, "buffer");
        long j = 0;
        while (true) {
            int i2 = input.read(buffer);
            if (i2 == -1) {
                return j;
            }
            output.write(buffer, 0, i2);
            j += (long) i2;
        }
    }

    public final byte[] a(InputStream input) throws IOException {
        Intrinsics.f(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f14443a.a(input, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.e(byteArray, "toByteArray(...)");
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }
}
