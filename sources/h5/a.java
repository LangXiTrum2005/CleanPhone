package h5;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.internal.measurement.f2;
import d5.c;
import d5.o;
import m5.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42209b = o.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f42210a;

    public a(Context context) {
        this.f42210a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public final JobInfo a(i iVar, int i10) {
        int i11;
        d5.b bVar = iVar.f45891j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f45882a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f42210a).setRequiresCharging(bVar.f38677b).setRequiresDeviceIdle(bVar.f38678c).setExtras(persistableBundle);
        int i12 = bVar.f38676a;
        if (i12 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int iC = v0.i.c(i12);
            if (iC == 0) {
                i11 = 0;
            } else if (iC == 1) {
                i11 = 1;
            } else if (iC != 2) {
                i11 = 3;
                if (iC != 3) {
                    i11 = 4;
                    if (iC != 4) {
                        o.g().e(f42209b, "API version too low. Cannot convert network type value ".concat(f2.C(i12)), new Throwable[0]);
                        i11 = 1;
                    }
                }
            } else {
                i11 = 2;
            }
            extras.setRequiredNetworkType(i11);
        }
        if (!bVar.f38678c) {
            extras.setBackoffCriteria(iVar.f45893m, iVar.l == 2 ? 0 : 1);
        }
        long jMax = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!iVar.f45897q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.f38683h.f38686a.size() > 0) {
            for (c cVar : bVar.f38683h.f38686a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f38684a, cVar.f38685b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(bVar.f38681f);
            extras.setTriggerContentMaxDelay(bVar.f38682g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(bVar.f38679d);
        extras.setRequiresStorageNotLow(bVar.f38680e);
        boolean z10 = iVar.f45892k > 0;
        if (i0.c.b() && iVar.f45897q && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
