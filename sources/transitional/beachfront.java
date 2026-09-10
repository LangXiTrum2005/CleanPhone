package transitional;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.apical;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: SystemJobInfoConverter.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f38916saneness = apical.beachfront("SystemJobInfoConverter");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ComponentName f38917attabal;

    /* JADX INFO: compiled from: SystemJobInfoConverter.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f38918attabal;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f38918attabal = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38918attabal[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38918attabal[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38918attabal[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38918attabal[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public beachfront(Context context) {
        this.f38917attabal = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public static int dern(NetworkType networkType) {
        int i = attabal.f38918attabal[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        apical.dern().attabal(f38916saneness, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
        return 1;
    }

    public static JobInfo.TriggerContentUri saneness(androidx.work.dern.attabal attabalVar) {
        return new JobInfo.TriggerContentUri(attabalVar.attabal(), attabalVar.saneness() ? 1 : 0);
    }

    public static void wireman(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(dern(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo attabal(arytenoidectomy arytenoidectomyVar, int i) {
        androidx.work.saneness sanenessVar = arytenoidectomyVar.f34002cutely;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", arytenoidectomyVar.f33999attabal);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", arytenoidectomyVar.wireman());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f38917attabal).setRequiresCharging(sanenessVar.competently()).setRequiresDeviceIdle(sanenessVar.impromptu()).setExtras(persistableBundle);
        wireman(extras, sanenessVar.saneness());
        if (!sanenessVar.impromptu()) {
            extras.setBackoffCriteria(arytenoidectomyVar.f34005impassible, arytenoidectomyVar.f34004formularize == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(arytenoidectomyVar.attabal() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!arytenoidectomyVar.f34009monoploid) {
            extras.setImportantWhileForeground(true);
        }
        if (sanenessVar.marial()) {
            Iterator<androidx.work.dern.attabal> it = sanenessVar.attabal().saneness().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(saneness(it.next()));
            }
            extras.setTriggerContentUpdateDelay(sanenessVar.dern());
            extras.setTriggerContentMaxDelay(sanenessVar.wireman());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(sanenessVar.beachfront());
            extras.setRequiresStorageNotLow(sanenessVar.taiyuan());
        }
        boolean z = arytenoidectomyVar.f33997apical > 0;
        if (claque.attabal.dern() && arytenoidectomyVar.f34009monoploid && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
