package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, DownloadManagerHelper> downloadManagerHelpers = new HashMap<>();
    private DownloadManagerHelper downloadManagerHelper;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater = null;
    private final String channelId = null;
    private final int channelNameResourceId = 0;
    private final int channelDescriptionResourceId = 0;

    public static final class DownloadManagerHelper implements DownloadManager.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DownloadManager f18288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18289c;
        public final Scheduler d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class f18290e;
        public DownloadService f;
        public Requirements g;

        public DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z2, Scheduler scheduler, Class cls) {
            this.f18287a = context;
            this.f18288b = downloadManager;
            this.f18289c = z2;
            this.d = scheduler;
            this.f18290e = cls;
            downloadManager.f18264e.add(this);
            c();
        }

        public final void a() {
            Requirements requirements = new Requirements(0);
            if (Util.a(this.g, requirements)) {
                return;
            }
            this.d.cancel();
            this.g = requirements;
        }

        public final void b() {
            Class cls = this.f18290e;
            boolean z2 = this.f18289c;
            Context context = this.f18287a;
            if (z2) {
                try {
                    Util.H(context, DownloadService.access$900(context, cls, DownloadService.ACTION_RESTART));
                } catch (IllegalStateException unused) {
                    Log.g(DownloadService.TAG, "Failed to restart (foreground launch restriction)");
                }
            } else {
                try {
                    context.startService(DownloadService.access$900(context, cls, "com.google.android.exoplayer.downloadService.action.INIT"));
                } catch (IllegalStateException unused2) {
                    Log.g(DownloadService.TAG, "Failed to restart (process is idle)");
                }
            }
        }

        public final boolean c() {
            DownloadManager downloadManager = this.f18288b;
            boolean z2 = downloadManager.f18267l;
            Scheduler scheduler = this.d;
            if (scheduler == null) {
                return !z2;
            }
            if (!z2) {
                a();
                return true;
            }
            Requirements requirements = downloadManager.f18268n.f18308c;
            if (!scheduler.b(requirements).equals(requirements)) {
                a();
                return false;
            }
            if (Util.a(this.g, requirements)) {
                return true;
            }
            if (scheduler.a(requirements, this.f18287a.getPackageName())) {
                this.g = requirements;
                return true;
            }
            Log.g(DownloadService.TAG, "Failed to schedule restart");
            a();
            return false;
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                DownloadService.access$400(downloadService, download);
            }
            DownloadService downloadService2 = this.f;
            if ((downloadService2 == null || downloadService2.isStopped) && DownloadService.access$500(download.f18256b)) {
                Log.g(DownloadService.TAG, "DownloadService wasn't running. Restarting.");
                b();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onDownloadRemoved(DownloadManager downloadManager, Download download) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                DownloadService.access$600(downloadService);
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                downloadService.b();
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onInitialized(DownloadManager downloadManager) {
            DownloadService downloadService = this.f;
            if (downloadService != null) {
                DownloadService.access$300(downloadService, downloadManager.m);
            }
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
            c();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z2) {
            if (z2 || downloadManager.f18266i) {
                return;
            }
            DownloadService downloadService = this.f;
            if (downloadService == null || downloadService.isStopped) {
                List list = downloadManager.m;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((Download) list.get(i2)).f18256b == 0) {
                        b();
                        return;
                    }
                }
            }
        }
    }

    public final class ForegroundNotificationUpdater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18292b;

        public final void a() {
            null.downloadManagerHelper.getClass();
            throw null;
        }
    }

    public static Intent a(Context context, Class cls, String str, boolean z2) {
        return new Intent(context, (Class<?>) cls).setAction(str).putExtra("foreground", z2);
    }

    public static void access$300(DownloadService downloadService, List list) {
        if (downloadService.foregroundNotificationUpdater != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int i3 = ((Download) list.get(i2)).f18256b;
                if (i3 == 2 || i3 == 5 || i3 == 7) {
                    ForegroundNotificationUpdater foregroundNotificationUpdater = downloadService.foregroundNotificationUpdater;
                    foregroundNotificationUpdater.f18291a = true;
                    foregroundNotificationUpdater.a();
                    return;
                }
            }
        }
    }

    public static void access$400(DownloadService downloadService, Download download) {
        ForegroundNotificationUpdater foregroundNotificationUpdater = downloadService.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            int i2 = download.f18256b;
            if (i2 == 2 || i2 == 5 || i2 == 7) {
                foregroundNotificationUpdater.f18291a = true;
                foregroundNotificationUpdater.a();
            } else if (foregroundNotificationUpdater.f18292b) {
                foregroundNotificationUpdater.a();
            }
        }
    }

    public static boolean access$500(int i2) {
        return i2 == 2 || i2 == 5 || i2 == 7;
    }

    public static void access$600(DownloadService downloadService) {
        ForegroundNotificationUpdater foregroundNotificationUpdater = downloadService.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater == null || !foregroundNotificationUpdater.f18292b) {
            return;
        }
        foregroundNotificationUpdater.a();
    }

    public static Intent access$900(Context context, Class cls, String str) {
        return new Intent(context, (Class<?>) cls).setAction(str);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z2) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z2);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z2) {
        return a(context, cls, ACTION_PAUSE_DOWNLOADS, z2);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z2) {
        return a(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z2);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z2) {
        return a(context, cls, ACTION_REMOVE_DOWNLOAD, z2).putExtra("content_id", str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z2) {
        return a(context, cls, ACTION_RESUME_DOWNLOADS, z2);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z2) {
        return a(context, cls, ACTION_SET_REQUIREMENTS, z2).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i2, boolean z2) {
        return a(context, cls, ACTION_SET_STOP_REASON, z2).putExtra("content_id", str).putExtra(KEY_STOP_REASON, i2);
    }

    public static void c(Context context, Intent intent, boolean z2) {
        if (z2) {
            Util.H(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static void clearDownloadManagerHelpers() {
        downloadManagerHelpers.clear();
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z2) {
        c(context, buildAddDownloadIntent(context, cls, downloadRequest, z2), z2);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z2) {
        c(context, buildPauseDownloadsIntent(context, cls, z2), z2);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z2) {
        c(context, buildRemoveAllDownloadsIntent(context, cls, z2), z2);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z2) {
        c(context, buildRemoveDownloadIntent(context, cls, str, z2), z2);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z2) {
        c(context, buildResumeDownloadsIntent(context, cls, z2), z2);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z2) {
        c(context, buildSetRequirementsIntent(context, cls, requirements, z2), z2);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i2, boolean z2) {
        c(context, buildSetStopReasonIntent(context, cls, str, i2, z2), z2);
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(new Intent(context, cls).setAction("com.google.android.exoplayer.downloadService.action.INIT"));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.H(context, a(context, cls, "com.google.android.exoplayer.downloadService.action.INIT", true));
    }

    public final void b() {
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.f18291a = false;
            throw null;
        }
        DownloadManagerHelper downloadManagerHelper = this.downloadManagerHelper;
        downloadManagerHelper.getClass();
        if (downloadManagerHelper.c()) {
            if (Util.f18979a >= 28 || !this.taskRemoved) {
                this.isStopped |= stopSelfResult(this.lastStartId);
            } else {
                stopSelf();
                this.isStopped = true;
            }
        }
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(List list, int i2);

    public abstract Scheduler getScheduler();

    public final void invalidateForegroundNotification() {
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater == null || this.isDestroyed || !foregroundNotificationUpdater.f18292b) {
            return;
        }
        foregroundNotificationUpdater.a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.channelId;
        if (str != null) {
            int i2 = this.channelNameResourceId;
            int i3 = this.channelDescriptionResourceId;
            if (Util.f18979a >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                p006i.a.x();
                NotificationChannel notificationChannelD = com.google.android.exoplayer2.scheduler.a.d(str, getString(i2));
                if (i3 != 0) {
                    notificationChannelD.setDescription(getString(i3));
                }
                notificationManager.createNotificationChannel(notificationChannelD);
            }
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, DownloadManagerHelper> map = downloadManagerHelpers;
        final DownloadManagerHelper downloadManagerHelper = map.get(cls);
        if (downloadManagerHelper == null) {
            boolean z2 = this.foregroundNotificationUpdater != null;
            Scheduler scheduler = (z2 && (Util.f18979a < 31)) ? getScheduler() : null;
            DownloadManager downloadManager = getDownloadManager();
            downloadManager.c(false);
            DownloadManagerHelper downloadManagerHelper2 = new DownloadManagerHelper(getApplicationContext(), downloadManager, z2, scheduler, cls);
            map.put((Class<? extends DownloadService>) cls, downloadManagerHelper2);
            downloadManagerHelper = downloadManagerHelper2;
        }
        this.downloadManagerHelper = downloadManagerHelper;
        Assertions.d(downloadManagerHelper.f == null);
        downloadManagerHelper.f = this;
        if (downloadManagerHelper.f18288b.f18265h) {
            Util.m(null).postAtFrontOfQueue(new Runnable() { // from class: com.google.android.exoplayer2.offline.c
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadService.access$300(this, downloadManagerHelper.f18288b.m);
                }
            });
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        DownloadManagerHelper downloadManagerHelper = this.downloadManagerHelper;
        downloadManagerHelper.getClass();
        Assertions.d(downloadManagerHelper.f == this);
        downloadManagerHelper.f = null;
        ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater == null) {
            return;
        }
        foregroundNotificationUpdater.f18291a = false;
        throw null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        String action;
        String stringExtra;
        ForegroundNotificationUpdater foregroundNotificationUpdater;
        this.lastStartId = i3;
        this.taskRemoved = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.startedInForeground |= intent.getBooleanExtra("foreground", false) || ACTION_RESTART.equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        DownloadManagerHelper downloadManagerHelper = this.downloadManagerHelper;
        downloadManagerHelper.getClass();
        DownloadManager downloadManager = downloadManagerHelper.f18288b;
        DownloadManager.InternalHandler internalHandler = downloadManager.f18263c;
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                DownloadRequest downloadRequest = (DownloadRequest) intent.getParcelableExtra(KEY_DOWNLOAD_REQUEST);
                if (downloadRequest == null) {
                    Log.c(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra(KEY_STOP_REASON, 0);
                    downloadManager.f++;
                    internalHandler.obtainMessage(6, intExtra, 0, downloadRequest).sendToTarget();
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.c(false);
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.f++;
                internalHandler.obtainMessage(8).sendToTarget();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                Requirements requirements = (Requirements) intent.getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements == null) {
                    Log.c(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    if (!requirements.equals(downloadManager.f18268n.f18308c)) {
                        RequirementsWatcher requirementsWatcher = downloadManager.f18268n;
                        RequirementsWatcher.DeviceStatusChangeReceiver deviceStatusChangeReceiver = requirementsWatcher.f18309e;
                        deviceStatusChangeReceiver.getClass();
                        Context context = requirementsWatcher.f18306a;
                        context.unregisterReceiver(deviceStatusChangeReceiver);
                        requirementsWatcher.f18309e = null;
                        if (Util.f18979a >= 24 && requirementsWatcher.g != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            RequirementsWatcher.NetworkCallback networkCallback = requirementsWatcher.g;
                            networkCallback.getClass();
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                            requirementsWatcher.g = null;
                        }
                        RequirementsWatcher requirementsWatcher2 = new RequirementsWatcher(downloadManager.f18261a, downloadManager.d, requirements);
                        downloadManager.f18268n = requirementsWatcher2;
                        downloadManager.b(downloadManager.f18268n, requirementsWatcher2.b());
                    }
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.c(true);
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (intent.hasExtra(KEY_STOP_REASON)) {
                    int intExtra2 = intent.getIntExtra(KEY_STOP_REASON, 0);
                    downloadManager.f++;
                    internalHandler.obtainMessage(3, intExtra2, 0, stringExtra).sendToTarget();
                    break;
                } else {
                    Log.c(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra == null) {
                    Log.c(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    downloadManager.f++;
                    internalHandler.obtainMessage(7, stringExtra).sendToTarget();
                    break;
                }
                break;
            default:
                Log.c(TAG, "Ignored unrecognized action: ".concat(action));
                break;
        }
        if (Util.f18979a >= 26 && this.startedInForeground && (foregroundNotificationUpdater = this.foregroundNotificationUpdater) != null && !foregroundNotificationUpdater.f18292b) {
            foregroundNotificationUpdater.a();
        }
        this.isStopped = false;
        if (downloadManager.g == 0 && downloadManager.f == 0) {
            b();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i2, boolean z2) {
        return a(context, cls, ACTION_ADD_DOWNLOAD, z2).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i2);
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i2, boolean z2) {
        c(context, buildAddDownloadIntent(context, cls, downloadRequest, i2, z2), z2);
    }
}
