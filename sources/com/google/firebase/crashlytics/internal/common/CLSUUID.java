package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import com.applovin.impl.Z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
class CLSUUID {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20307b = CommonUtils.h(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f20308c = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20309a;

    public CLSUUID() {
        long jF = Z.f();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (jF / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b2 = bArrArray[0];
        byte b3 = bArrArray[1];
        byte b4 = bArrArray[2];
        byte b5 = bArrArray[3];
        byte[] bArrA = a(jF % 1000);
        byte b6 = bArrA[0];
        byte b7 = bArrA[1];
        byte[] bArrA2 = a(f20308c.incrementAndGet());
        byte b8 = bArrA2[0];
        byte b9 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String strE = CommonUtils.e(new byte[]{b2, b3, b4, b5, b6, b7, b8, b9, bArrA3[0], bArrA3[1]});
        Locale locale = Locale.US;
        this.f20309a = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), f20307b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f20309a;
    }
}
