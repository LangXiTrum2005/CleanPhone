package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class RandomFidGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f20851a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte f20852b = Byte.parseByte("00001111", 2);

    public static String a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b2 = bArrArray[0];
        bArrArray[16] = b2;
        bArrArray[0] = (byte) ((b2 & f20852b) | f20851a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
