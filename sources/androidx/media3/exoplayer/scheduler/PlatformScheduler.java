package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PersistableBundle;
import android.os.PowerManager;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;
import com.google.android.exoplayer2.offline.DownloadService;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformScheduler implements Scheduler {

    public static final class PlatformSchedulerService extends JobService {
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            int i2;
            boolean zIsDeviceIdleMode;
            Intent intentD;
            int intExtra;
            PersistableBundle extras = jobParameters.getExtras();
            int i3 = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).X;
            if ((i3 & 1) != 0) {
                Object systemService = getSystemService("connectivity");
                systemService.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i2 = i3 & 3;
                } else {
                    if (Util.f5683a >= 24) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null) {
                            try {
                                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                                if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                                }
                            } catch (SecurityException unused) {
                            }
                        }
                        i2 = i3 & 3;
                    }
                    if ((i3 & 2) == 0 || !connectivityManager.isActiveNetworkMetered()) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 0;
            }
            if (((i3 & 8) != 0) && ((intentD = a.d("android.intent.action.BATTERY_CHANGED", this, null)) == null || ((intExtra = intentD.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
                i2 |= 8;
            }
            if ((i3 & 4) != 0) {
                Object systemService2 = getSystemService("power");
                systemService2.getClass();
                PowerManager powerManager = (PowerManager) systemService2;
                int i4 = Util.f5683a;
                if (i4 >= 23) {
                    zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                } else {
                    zIsDeviceIdleMode = i4 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
                }
                if (!zIsDeviceIdleMode) {
                    i2 |= 4;
                }
            }
            if ((i3 & 16) != 0) {
                if (!(a.d("android.intent.action.DEVICE_STORAGE_LOW", this, null) == null)) {
                    i2 |= 16;
                }
            }
            if (i2 != 0) {
                a.C(i2, "Requirements not met: ", "PlatformScheduler");
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Intent intent = new Intent(string).setPackage(string2);
            if (Util.f5683a >= 26) {
                startForegroundService(intent);
                return false;
            }
            startService(intent);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i2 = Util.f5683a;
    }
}
