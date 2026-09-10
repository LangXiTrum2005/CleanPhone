package com.charging.screenshow.battery.animations.themes.download;

import android.text.TextUtils;
import androidx.room.e;
import java.util.LinkedHashMap;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/DownloadManager;", "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DownloadManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f13236b = LazyKt.a(LazyThreadSafetyMode.X, new e(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f13237a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/DownloadManager$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(String url, String tag, DownloadListener downloadListener) {
        Intrinsics.f(url, "url");
        Intrinsics.f(tag, "tag");
        String strA = TextUtils.isEmpty(null) ? FileUtil.a() : null;
        String strA2 = TextUtils.isEmpty(null) ? DownloadUtil.a(url, tag) : null;
        LinkedHashMap linkedHashMap = this.f13237a;
        FilePoint filePoint = new FilePoint();
        filePoint.f13252a = url;
        filePoint.f13253b = strA;
        filePoint.f13254c = strA2;
        linkedHashMap.put(url, new DownloadTask(filePoint, downloadListener));
    }
}
