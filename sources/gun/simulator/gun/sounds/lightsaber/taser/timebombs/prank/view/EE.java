package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class EE implements Cloneable {
    public static final DE Companion = new DE(null);
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

    public EE(String str) {
        AbstractC2995aW.q(str, "jobTag");
        this.jobTag = str;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public Object clone() {
        return super.clone();
    }

    public final EE copy() {
        try {
            Object objClone = super.clone();
            AbstractC2995aW.o(objClone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (EE) objClone;
        } catch (CloneNotSupportedException e) {
            C4917wJ.Companion.e(TAG, "Cannot copy JobInfo " + this, e);
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

    public final EE setDelay(long j) {
        this.delay = j;
        return this;
    }

    public final EE setExtras(Bundle bundle) {
        AbstractC2995aW.q(bundle, "extras");
        this.extras = bundle;
        return this;
    }

    public final EE setPriority(int i) {
        this.priority = i;
        return this;
    }

    public final EE setRequiredNetworkType(int i) {
        this.requiredNetworkType = i;
        return this;
    }

    public final EE setReschedulePolicy(long j, int i) {
        this.rescheduleTimeout = j;
        this.reschedulePolicy = i;
        return this;
    }

    public final EE setUpdateCurrent(boolean z) {
        this.updateCurrent = z;
        return this;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }
}
