package com.google.android.exoplayer2.ui;

import android.app.Notification;
import androidx.core.app.NotificationCompat;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadNotificationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationCompat.Builder f18720a;

    public static final class Api31 {
        public static void a(NotificationCompat.Builder builder) {
            builder.s = 1;
        }
    }

    public DownloadNotificationHelper(VideoRepositoryDownloadService videoRepositoryDownloadService) {
        this.f18720a = new NotificationCompat.Builder(videoRepositoryDownloadService.getApplicationContext(), "chartboost");
    }

    public final Notification a(VideoRepositoryDownloadService videoRepositoryDownloadService) {
        NotificationCompat.Builder builder = this.f18720a;
        builder.f4215u.icon = 0;
        builder.f4209e = NotificationCompat.Builder.b(null);
        builder.g = null;
        builder.d(null);
        builder.f4212l = 100;
        builder.m = 0;
        builder.f4213n = true;
        builder.c(2);
        builder.j = false;
        if (Util.f18979a >= 31) {
            Api31.a(builder);
        }
        return builder.a();
    }
}
