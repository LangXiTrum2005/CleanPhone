package collectively;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible extends cutely {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15829arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ cutely f15830monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final /* synthetic */ graveside f15831polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public impassible(graveside gravesideVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, cutely cutelyVar) {
        super(taskCompletionSource);
        this.f15829arytenoidectomy = taskCompletionSource2;
        this.f15830monoploid = cutelyVar;
        this.f15831polloi = gravesideVar;
    }

    @Override // collectively.cutely
    public final void attabal() {
        synchronized (this.f15831polloi.f15818beachfront) {
            try {
                graveside.triweekly(this.f15831polloi, this.f15829arytenoidectomy);
                if (this.f15831polloi.f15816apical.getAndIncrement() > 0) {
                    this.f15831polloi.f15826saneness.dern("Already connected to the service.", new Object[0]);
                }
                graveside.arytenoidectomy(this.f15831polloi, this.f15830monoploid);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
