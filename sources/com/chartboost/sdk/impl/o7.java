package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7 f14757a;

    public o7(h7 downloadManager) {
        Intrinsics.f(downloadManager, "downloadManager");
        this.f14757a = downloadManager;
    }

    public final MediaItem a(oi asset) {
        Download downloadA;
        DownloadRequest downloadRequest;
        Intrinsics.f(asset, "asset");
        i6 i6VarB = this.f14757a.b(asset.d());
        if (i6VarB == null || (downloadA = i6VarB.a()) == null || (downloadRequest = downloadA.f18255a) == null) {
            return null;
        }
        MediaItem.Builder builder = new MediaItem.Builder();
        String str = downloadRequest.X;
        str.getClass();
        builder.f17096a = str;
        builder.f17097b = downloadRequest.f18282Y;
        builder.g = downloadRequest.g0;
        builder.f17098c = downloadRequest.Z;
        List list = downloadRequest.e0;
        builder.f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
        return builder.a();
    }
}
