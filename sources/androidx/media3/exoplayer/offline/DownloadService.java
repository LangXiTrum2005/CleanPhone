package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownloadService extends Service {
    public static final HashMap e0 = new HashMap();
    public DownloadManagerHelper X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f6330Y;
    public boolean Z;

    public static final class DownloadManagerHelper implements DownloadManager.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DownloadManager f6332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DownloadService f6333c;

        public DownloadManagerHelper(Context context, DownloadManager downloadManager, Class cls) {
            this.f6331a = context;
            this.f6332b = downloadManager;
            throw null;
        }
    }

    public final class ForegroundNotificationUpdater {
    }

    public abstract DownloadManager a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        Class<?> cls = getClass();
        DownloadManagerHelper downloadManagerHelper = (DownloadManagerHelper) e0.get(cls);
        if (downloadManagerHelper != null) {
            this.X = downloadManagerHelper;
            Assertions.e(downloadManagerHelper.f6333c == null);
            downloadManagerHelper.f6333c = this;
        } else {
            int i2 = Util.f5683a;
            DownloadManager downloadManagerA = a();
            downloadManagerA.a(false);
            new DownloadManagerHelper(getApplicationContext(), downloadManagerA, cls);
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        DownloadManagerHelper downloadManagerHelper = this.X;
        downloadManagerHelper.getClass();
        Assertions.e(downloadManagerHelper.f6333c == this);
        downloadManagerHelper.f6333c = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        String action;
        String stringExtra;
        this.f6330Y = i3;
        this.Z = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        DownloadManager downloadManager = this.X.f6332b;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra(com.google.android.exoplayer2.offline.DownloadService.KEY_STOP_REASON)) {
                    Log.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra(com.google.android.exoplayer2.offline.DownloadService.KEY_STOP_REASON, 0);
                    downloadManager.f6327a++;
                    throw null;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    downloadManager.f6327a++;
                    throw null;
                }
                Log.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.a(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.f6327a++;
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra(com.google.android.exoplayer2.offline.DownloadService.KEY_DOWNLOAD_REQUEST)) != null) {
                    intent.getIntExtra(com.google.android.exoplayer2.offline.DownloadService.KEY_STOP_REASON, 0);
                    downloadManager.f6327a++;
                    throw null;
                }
                Log.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra(com.google.android.exoplayer2.offline.DownloadService.KEY_REQUIREMENTS)) != null) {
                    throw null;
                }
                Log.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.a(true);
                break;
            default:
                Log.c("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i4 = Util.f5683a;
        if (downloadManager.f6327a == 0) {
            if (i4 < 28 && this.Z) {
                stopSelf();
                return 1;
            }
            stopSelfResult(this.f6330Y);
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.Z = true;
    }
}
