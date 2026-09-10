package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.Requirements;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.Scheduler;
import com.mbridge.msdk.playercommon.exoplayer2.util.NotificationUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD = "com.google.android.exoplayer.downloadService.action.ADD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    private static final String ACTION_START_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS";
    private static final String ACTION_STOP_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS";
    private static final boolean DEBUG = false;
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final String KEY_DOWNLOAD_ACTION = "download_action";
    public static final String KEY_FOREGROUND = "foreground";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, RequirementsHelper> requirementsHelpers = new HashMap<>();

    @Nullable
    private final String channelId;
    private final int channelName;
    private DownloadManager downloadManager;
    private DownloadManagerListener downloadManagerListener;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class DownloadManagerListener implements DownloadManager.Listener {
        private DownloadManagerListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService.this.stop();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
            DownloadService.this.maybeStartWatchingRequirements();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public void onTaskStateChanged(DownloadManager downloadManager, DownloadManager.TaskState taskState) {
            DownloadService.this.onTaskStateChanged(taskState);
            if (taskState.state == 1) {
                DownloadService.this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                DownloadService.this.foregroundNotificationUpdater.update();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class ForegroundNotificationUpdater implements Runnable {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i10, long j10) {
            this.notificationId = i10;
            this.updateInterval = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            update();
        }

        public void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }

        public void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacks(this);
        }

        public void update() {
            DownloadManager.TaskState[] allTaskStates = DownloadService.this.downloadManager.getAllTaskStates();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.notificationId, downloadService.getForegroundNotification(allTaskStates));
            this.notificationDisplayed = true;
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacks(this);
                this.handler.postDelayed(this, this.updateInterval);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class RequirementsHelper implements RequirementsWatcher.Listener {
        private final Context context;
        private final Requirements requirements;
        private final RequirementsWatcher requirementsWatcher;

        @Nullable
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        private void startServiceWithAction(String str) {
            Util.startForegroundService(this.context, new Intent(this.context, this.serviceClass).setAction(str).putExtra(DownloadService.KEY_FOREGROUND, true));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher.Listener
        public void requirementsMet(RequirementsWatcher requirementsWatcher) {
            startServiceWithAction(DownloadService.ACTION_START_DOWNLOADS);
            Scheduler scheduler = this.scheduler;
            if (scheduler != null) {
                scheduler.cancel();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher.Listener
        public void requirementsNotMet(RequirementsWatcher requirementsWatcher) {
            startServiceWithAction(DownloadService.ACTION_STOP_DOWNLOADS);
            if (this.scheduler != null) {
                String strI = c.n().i();
                if (TextUtils.isEmpty(strI)) {
                    strI = this.context.getPackageName();
                }
                if (this.scheduler.schedule(this.requirements, strI, DownloadService.ACTION_RESTART)) {
                    return;
                }
                Log.e(DownloadService.TAG, "Scheduling downloads failed.");
            }
        }

        public void start() {
            this.requirementsWatcher.start();
        }

        public void stop() {
            this.requirementsWatcher.stop();
            Scheduler scheduler = this.scheduler;
            if (scheduler != null) {
                scheduler.cancel();
            }
        }

        private RequirementsHelper(Context context, Requirements requirements, @Nullable Scheduler scheduler, Class<? extends DownloadService> cls) {
            this.context = context;
            this.requirements = requirements;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            this.requirementsWatcher = new RequirementsWatcher(context, this, requirements);
        }
    }

    public DownloadService(int i10) {
        this(i10, 1000L);
    }

    public static Intent buildAddActionIntent(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z10) {
        return new Intent(context, cls).setAction(ACTION_ADD).putExtra(KEY_DOWNLOAD_ACTION, downloadAction.toByteArray()).putExtra(KEY_FOREGROUND, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartWatchingRequirements() {
        if (this.downloadManager.getDownloadCount() == 0) {
            return;
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, RequirementsHelper> map = requirementsHelpers;
        if (map.get(cls) == null) {
            RequirementsHelper requirementsHelper = new RequirementsHelper(this, getRequirements(), getScheduler(), cls);
            map.put((Class<? extends DownloadService>) cls, requirementsHelper);
            requirementsHelper.start();
            logd("started watching requirements");
        }
    }

    private void maybeStopWatchingRequirements() {
        RequirementsHelper requirementsHelperRemove;
        if (this.downloadManager.getDownloadCount() <= 0 && (requirementsHelperRemove = requirementsHelpers.remove(getClass())) != null) {
            requirementsHelperRemove.stop();
            logd("stopped watching requirements");
        }
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(new Intent(context, cls).setAction(ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.startForegroundService(context, new Intent(context, cls).setAction(ACTION_INIT).putExtra(KEY_FOREGROUND, true));
    }

    public static void startWithAction(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z10) {
        Intent intentBuildAddActionIntent = buildAddActionIntent(context, cls, downloadAction, z10);
        if (z10) {
            Util.startForegroundService(context, intentBuildAddActionIntent);
        } else {
            context.startService(intentBuildAddActionIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        this.foregroundNotificationUpdater.stopPeriodicUpdates();
        if (this.startedInForeground && Util.SDK_INT >= 26) {
            this.foregroundNotificationUpdater.showNotificationIfNotAlready();
        }
        if (Util.SDK_INT < 28 && this.taskRemoved) {
            stopSelf();
            logd("stopSelf()");
            return;
        }
        logd("stopSelf(" + this.lastStartId + ") result: " + stopSelfResult(this.lastStartId));
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(DownloadManager.TaskState[] taskStateArr);

    public Requirements getRequirements() {
        return new Requirements(1, false, false);
    }

    @Nullable
    public abstract Scheduler getScheduler();

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        logd("onCreate");
        String str = this.channelId;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.channelName, 2);
        }
        this.downloadManager = getDownloadManager();
        DownloadManagerListener downloadManagerListener = new DownloadManagerListener();
        this.downloadManagerListener = downloadManagerListener;
        this.downloadManager.addListener(downloadManagerListener);
    }

    @Override // android.app.Service
    public void onDestroy() {
        logd("onDestroy");
        this.foregroundNotificationUpdater.stopPeriodicUpdates();
        this.downloadManager.removeListener(this.downloadManagerListener);
        maybeStopWatchingRequirements();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        this.lastStartId = i11;
        byte b10 = 0;
        this.taskRemoved = false;
        if (intent != null) {
            action = intent.getAction();
            this.startedInForeground |= intent.getBooleanExtra(KEY_FOREGROUND, false) || ACTION_RESTART.equals(action);
        } else {
            action = null;
        }
        if (action == null) {
            action = ACTION_INIT;
        }
        logd("onStartCommand action: " + action + " startId: " + i11);
        switch (action.hashCode()) {
            case -871181424:
                if (!action.equals(ACTION_RESTART)) {
                    b10 = -1;
                }
                break;
            case -382886238:
                b10 = !action.equals(ACTION_ADD) ? (byte) -1 : (byte) 1;
                break;
            case -337334865:
                b10 = !action.equals(ACTION_START_DOWNLOADS) ? (byte) -1 : (byte) 2;
                break;
            case 1015676687:
                b10 = !action.equals(ACTION_INIT) ? (byte) -1 : (byte) 3;
                break;
            case 1286088717:
                b10 = !action.equals(ACTION_STOP_DOWNLOADS) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 3:
                break;
            case 1:
                byte[] byteArrayExtra = intent.getByteArrayExtra(KEY_DOWNLOAD_ACTION);
                if (byteArrayExtra != null) {
                    try {
                        this.downloadManager.handleAction(byteArrayExtra);
                    } catch (IOException e10) {
                        Log.e(TAG, "Failed to handle ADD action", e10);
                    }
                } else {
                    Log.e(TAG, "Ignoring ADD action with no action data");
                }
                break;
            case 2:
                this.downloadManager.startDownloads();
                break;
            case 4:
                this.downloadManager.stopDownloads();
                break;
            default:
                Log.e(TAG, "Ignoring unrecognized action: ".concat(action));
                break;
        }
        maybeStartWatchingRequirements();
        if (this.downloadManager.isIdle()) {
            stop();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        logd("onTaskRemoved rootIntent: " + intent);
        this.taskRemoved = true;
    }

    public DownloadService(int i10, long j10) {
        this(i10, j10, null, 0);
    }

    public DownloadService(int i10, long j10, @Nullable String str, int i11) {
        this.foregroundNotificationUpdater = new ForegroundNotificationUpdater(i10, j10);
        this.channelId = str;
        this.channelName = i11;
    }

    private void logd(String str) {
    }

    public void onTaskStateChanged(DownloadManager.TaskState taskState) {
    }
}
