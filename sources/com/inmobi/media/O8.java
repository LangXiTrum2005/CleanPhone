package com.inmobi.media;

import android.media.MediaMetadataRetriever;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23043c;
    public final C3177p8 d;

    public O8(long j, long j2, String referencedAssetId, C3177p8 nativeDataModel) {
        Intrinsics.f(referencedAssetId, "referencedAssetId");
        Intrinsics.f(nativeDataModel, "nativeDataModel");
        this.f23041a = j;
        this.f23042b = j2;
        this.f23043c = referencedAssetId;
        this.d = nativeDataModel;
    }

    public final long a() {
        long j = this.f23041a;
        C2984d8 c2984d8M = this.d.m(this.f23043c);
        try {
            if (c2984d8M instanceof C2968c9) {
                Ve veD = ((C2968c9) c2984d8M).d();
                String strB = veD != null ? ((Ue) veD).b() : null;
                if (strB != null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(strB);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    j += (long) ((this.f23042b / 100.0d) * ((strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L) / ((long) 1000)));
                    mediaMetadataRetriever.release();
                }
            }
        } catch (Exception unused) {
        }
        return Math.max(j, 0L);
    }
}
