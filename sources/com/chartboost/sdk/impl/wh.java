package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadCursor;
import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wh {
    public static final List a(DownloadCursor downloadCursor) {
        Intrinsics.f(downloadCursor, "<this>");
        ArrayList arrayList = new ArrayList();
        while (downloadCursor.moveToNext()) {
            arrayList.add(j6.a(downloadCursor.W()));
        }
        return arrayList;
    }

    public static final i6 a(DownloadManager downloadManager, String id) throws DatabaseIOException {
        Intrinsics.f(downloadManager, "<this>");
        Intrinsics.f(id, "id");
        Download downloadD = downloadManager.f18262b.d(id);
        if (downloadD != null) {
            return j6.a(downloadD);
        }
        return null;
    }

    public static final List a(DownloadManager downloadManager) {
        Intrinsics.f(downloadManager, "<this>");
        return a(downloadManager.f18262b.g(new int[0]));
    }
}
