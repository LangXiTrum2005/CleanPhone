package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.util.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JobRunnable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/vungle/ads/internal/task/wireman;", "Lcom/vungle/ads/internal/task/competently;", "Lcom/vungle/ads/internal/task/dern;", "jobinfo", "Lcom/vungle/ads/internal/task/saneness;", "creator", "Lcom/vungle/ads/internal/task/marial;", "jobRunner", "Lcom/vungle/ads/internal/task/impromptu;", "threadPriorityHelper", "<init>", "(Lcom/vungle/ads/internal/task/dern;Lcom/vungle/ads/internal/task/saneness;Lcom/vungle/ads/internal/task/marial;Lcom/vungle/ads/internal/task/impromptu;)V", "", "run", "()V", "Lcom/vungle/ads/internal/task/dern;", "Lcom/vungle/ads/internal/task/saneness;", "Lcom/vungle/ads/internal/task/marial;", "Lcom/vungle/ads/internal/task/impromptu;", "", "getPriority", "()I", "getPriority$annotations", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class wireman extends competently {
    private static final String TAG = wireman.class.getSimpleName();
    private final saneness creator;
    private final marial jobRunner;
    private final dern jobinfo;
    private final impromptu threadPriorityHelper;

    public wireman(dern jobinfo, saneness creator, marial jobRunner, impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(jobinfo, "jobinfo");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = impromptuVar;
    }

    @Override // com.vungle.ads.internal.task.competently
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        impromptu impromptuVar = this.threadPriorityHelper;
        if (impromptuVar != null) {
            try {
                int iMakeAndroidThreadPriority = impromptuVar.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.d(TAG2, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                arytenoidectomy.Companion companion2 = arytenoidectomy.INSTANCE;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                companion2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            arytenoidectomy.Companion companion3 = arytenoidectomy.INSTANCE;
            String TAG4 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.d(TAG4, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    companion3.d(TAG4, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e) {
            arytenoidectomy.Companion companion4 = arytenoidectomy.INSTANCE;
            String TAG5 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            companion4.e(TAG5, "Cannot create job" + e.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
