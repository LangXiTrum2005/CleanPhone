package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public final class FE implements InterfaceC3466fm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3059a;
    public final InterfaceC3562gs b;
    public final C3849k8 c;

    public FE(Context context, InterfaceC3562gs interfaceC3562gs, C3849k8 c3849k8) {
        this.f3059a = context;
        this.b = interfaceC3562gs;
        this.c = c3849k8;
    }

    public final void a(Sd0 sd0, int i, boolean z) {
        boolean z2;
        Context context = this.f3059a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME)));
        C4289p8 c4289p8 = (C4289p8) sd0;
        adler32.update(c4289p8.f4824a.getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(JV.a(c4289p8.c)).array());
        byte[] bArr = c4289p8.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    AbstractC2871Wx.X("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sd0);
                    return;
                }
            }
        }
        Long l = (Long) E20.p(((E20) this.b).h().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{c4289p8.f4824a, String.valueOf(JV.a(c4289p8.c))}), new Nd0(12));
        long jLongValue = l.longValue();
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        C4289p8 c4289p9 = (C4289p8) sd0;
        C3849k8 c3849k8 = this.c;
        HV hv = c4289p9.c;
        builder.setMinimumLatency(c3849k8.a(hv, jLongValue, i));
        Set set = ((C3937l8) c3849k8.b.get(hv)).c;
        if (set.contains(EnumC3314e30.f4305a)) {
            builder.setRequiredNetworkType(2);
            z2 = true;
        } else {
            z2 = true;
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC3314e30.c)) {
            builder.setRequiresCharging(z2);
        }
        if (set.contains(EnumC3314e30.b)) {
            builder.setRequiresDeviceIdle(z2);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", c4289p9.f4824a);
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, JV.a(hv));
        byte[] bArr2 = c4289p9.b;
        if (bArr2 != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sd0, Integer.valueOf(value), Long.valueOf(c3849k8.a(hv, jLongValue, i)), l, Integer.valueOf(i)};
        if (Log.isLoggable(AbstractC2871Wx.f0("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
