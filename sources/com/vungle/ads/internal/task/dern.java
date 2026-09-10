package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.util.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JobInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\u0018\u0000 62\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R$\u0010\u000b\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u00100R*\u0010\u0017\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010.\u0012\u0004\b3\u00100\u001a\u0004\b1\u00102R*\u0010\u001e\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00138\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010.\u0012\u0004\b5\u00100\u001a\u0004\b4\u00102¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/task/dern;", "", "", "jobTag", "<init>", "(Ljava/lang/String;)V", "", "updateCurrent", "setUpdateCurrent", "(Z)Lcom/vungle/ads/internal/task/dern;", "Landroid/os/Bundle;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Landroid/os/Bundle;)Lcom/vungle/ads/internal/task/dern;", "", "delay", "setDelay", "(J)Lcom/vungle/ads/internal/task/dern;", "rescheduleTimeout", "", "delayCriteria", "setReschedulePolicy", "(JI)Lcom/vungle/ads/internal/task/dern;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "setPriority", "(I)Lcom/vungle/ads/internal/task/dern;", "makeNextRescedule", "()J", "copy", "()Lcom/vungle/ads/internal/task/dern;", "requiredNetworkType", "setRequiredNetworkType", "Ljava/lang/String;", "getJobTag", "()Ljava/lang/String;", "<set-?>", "Z", "getUpdateCurrent", "()Z", "J", "getDelay", "nextRescheduleTimeout", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "reschedulePolicy", "I", "getReschedulePolicy$annotations", "()V", "getPriority", "()I", "getPriority$annotations", "getRequiredNetworkType", "getRequiredNetworkType$annotations", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class dern implements Cloneable {
    private static final String TAG = "JobInfo";
    private long delay;
    private Bundle extras;
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    public dern(String jobTag) {
        Intrinsics.checkNotNullParameter(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public Object clone() {
        return super.clone();
    }

    public final dern copy() {
        try {
            Object objClone = super.clone();
            Intrinsics.competently(objClone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (dern) objClone;
        } catch (CloneNotSupportedException e) {
            arytenoidectomy.INSTANCE.e(TAG, "Cannot copy JobInfo " + this, e);
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j = this.rescheduleTimeout;
        if (j == 0) {
            return 0L;
        }
        long j2 = this.nextRescheduleTimeout;
        if (j2 == 0) {
            this.nextRescheduleTimeout = j;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j2 * ((long) 2);
        }
        return this.nextRescheduleTimeout;
    }

    public final dern setDelay(long delay) {
        this.delay = delay;
        return this;
    }

    public final dern setExtras(Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.extras = extras;
        return this;
    }

    public final dern setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public final dern setRequiredNetworkType(int requiredNetworkType) {
        this.requiredNetworkType = requiredNetworkType;
        return this;
    }

    public final dern setReschedulePolicy(long rescheduleTimeout, int delayCriteria) {
        this.rescheduleTimeout = rescheduleTimeout;
        this.reschedulePolicy = delayCriteria;
        return this;
    }

    public final dern setUpdateCurrent(boolean updateCurrent) {
        this.updateCurrent = updateCurrent;
        return this;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }
}
