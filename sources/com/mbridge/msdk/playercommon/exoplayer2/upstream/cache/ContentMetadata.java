package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface ContentMetadata {
    public static final String INTERNAL_METADATA_NAME_PREFIX = "exo_";

    boolean contains(String str);

    long get(String str, long j10);

    String get(String str, String str2);

    byte[] get(String str, byte[] bArr);
}
