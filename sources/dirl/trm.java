package dirl;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class trm extends cord {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25282arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ cord f25283monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final /* synthetic */ beachfront f25284polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trm(beachfront beachfrontVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, cord cordVar) {
        super(taskCompletionSource);
        this.f25284polloi = beachfrontVar;
        this.f25282arytenoidectomy = taskCompletionSource2;
        this.f25283monoploid = cordVar;
    }

    @Override // dirl.cord
    public final void saneness() {
        synchronized (this.f25284polloi.f25252beachfront) {
            try {
                beachfront.kowloon(this.f25284polloi, this.f25282arytenoidectomy);
                if (this.f25284polloi.f25256formularize.getAndIncrement() > 0) {
                    this.f25284polloi.f25260saneness.dern("Already connected to the service.", new Object[0]);
                }
                beachfront.monoploid(this.f25284polloi, this.f25283monoploid);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
