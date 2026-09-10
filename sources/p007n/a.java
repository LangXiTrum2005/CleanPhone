package p007n;

import com.charging.screenshow.battery.animations.themes.download.DownloadManager;
import com.charging.screenshow.battery.animations.themes.download.DownloadTask;
import com.charging.screenshow.battery.animations.themes.view.dialog.DownloadDialog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ DownloadDialog f45126Y;

    public /* synthetic */ a(DownloadDialog downloadDialog, int i2) {
        this.X = i2;
        this.f45126Y = downloadDialog;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        DownloadDialog downloadDialog = this.f45126Y;
        switch (this.X) {
            case 0:
                int i2 = DownloadDialog.k0;
                DownloadManager downloadManager = (DownloadManager) DownloadManager.f13236b.getX();
                ArrayList<String> urls = downloadDialog.Z;
                downloadManager.getClass();
                Intrinsics.f(urls, "urls");
                for (String str : urls) {
                    LinkedHashMap linkedHashMap = downloadManager.f13237a;
                    if (linkedHashMap.containsKey(str)) {
                        Object obj = linkedHashMap.get(str);
                        Intrinsics.c(obj);
                        ((DownloadTask) obj).b();
                    }
                }
                break;
            default:
                downloadDialog.dismiss();
                Function0 function0 = downloadDialog.h0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
