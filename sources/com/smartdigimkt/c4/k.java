package com.smartdigimkt.c4;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    private static final String f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.smartdigimkt.b4.m.a f34281c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f34282e;

    public k(boolean z2, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        com.smartdigimkt.p4.a.a((bArr2 == null) ^ (i2 == 0));
        this.f34279a = z2;
        this.f34280b = str;
        this.d = i2;
        this.f34282e = bArr2;
        this.f34281c = new com.smartdigimkt.b4.m.a(a(str), bArr, i3, i4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b2 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b2 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b2 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
