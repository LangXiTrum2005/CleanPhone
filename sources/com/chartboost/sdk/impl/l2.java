package com.chartboost.sdk.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f14389a = new l2();

    public static final String a(String input) {
        Intrinsics.f(input, "input");
        byte[] bytes = input.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "getBytes(...)");
        l2 l2Var = f14389a;
        return l2Var.a(l2Var.b(bytes));
    }

    public final byte[] b(byte[] bArr) {
        return MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr);
    }

    public final String a(byte[] bArr) {
        return String.format(androidx.datastore.preferences.protobuf.a.k("%0", bArr.length << 1, "x"), Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
    }
}
