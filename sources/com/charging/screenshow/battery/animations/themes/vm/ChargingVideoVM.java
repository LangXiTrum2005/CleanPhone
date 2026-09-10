package com.charging.screenshow.battery.animations.themes.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.charging.screenshow.battery.animations.themes.download.DownloadListener;
import com.charging.screenshow.battery.animations.themes.download.DownloadManager;
import com.charging.screenshow.battery.animations.themes.download.DownloadTask;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/vm/ChargingVideoVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingVideoVM extends ViewModel {
    public String f;
    public final MutableLiveData d = new MutableLiveData();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f13351e = new MutableLiveData();
    public String g = "";

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(String url, String tag) {
        Intrinsics.f(url, "url");
        Intrinsics.f(tag, "tag");
        this.f = url;
        this.g = tag;
        if (DownloadUtil.c(url, tag)) {
            this.f13351e.k(Boolean.TRUE);
            return;
        }
        ?? r4 = DownloadManager.f13236b;
        DownloadManager downloadManager = (DownloadManager) r4.getX();
        String str = this.f;
        Intrinsics.c(str);
        downloadManager.a(str, this.g, new DownloadListener() { // from class: com.charging.screenshow.battery.animations.themes.vm.ChargingVideoVM$startDownload$1
            @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
            public final void a(String url2) {
                Intrinsics.f(url2, "url");
                this.f13352a.f13351e.k(Boolean.FALSE);
            }

            @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
            public final void b(String url2) {
                Intrinsics.f(url2, "url");
                this.f13352a.f13351e.k(Boolean.TRUE);
            }

            @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
            public final void c(float f, String url2) {
                Intrinsics.f(url2, "url");
                this.f13352a.d.k(Float.valueOf(f * 100));
            }

            @Override // com.charging.screenshow.battery.animations.themes.download.DownloadListener
            public final void d(String url2) {
                Intrinsics.f(url2, "url");
            }
        });
        DownloadManager downloadManager2 = (DownloadManager) r4.getX();
        String str2 = this.f;
        Intrinsics.c(str2);
        downloadManager2.getClass();
        String str3 = new String[]{str2}[0];
        LinkedHashMap linkedHashMap = downloadManager2.f13237a;
        if (linkedHashMap.containsKey(str3)) {
            Object obj = linkedHashMap.get(str3);
            Intrinsics.c(obj);
            ((DownloadTask) obj).b();
        }
    }
}
