package w1;

import android.app.job.JobParameters;
import android.net.Uri;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.e22;
import com.google.android.gms.internal.ads.i22;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.store.core.api.Store;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52744c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f52742a = i10;
        this.f52743b = obj;
        this.f52744c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zEquals = false;
        switch (this.f52742a) {
            case 0:
                c cVar = (c) this.f52743b;
                Uri uri = (Uri) this.f52744c;
                cVar.f52753i = false;
                cVar.f(uri);
                return;
            case 1:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.f52743b, (IronSourceError) this.f52744c);
                return;
            case 2:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f52743b;
                JobParameters jobParameters = (JobParameters) this.f52744c;
                int i10 = JobInfoSchedulerService.f10615a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 3:
                e22 e22Var = (e22) this.f52743b;
                b bVar = (b) this.f52744c;
                ((y1.k) e22Var.f13814e).a();
                i22 i22Var = (i22) e22Var.f13813d;
                synchronized (i22Var.f15534b) {
                    i22Var.b();
                    bVar.run();
                    break;
                }
                return;
            case 4:
                y1.p pVar = (y1.p) this.f52743b;
                pVar.D.set(pVar.v((s1) this.f52744c, pVar.f54173x, 0));
                return;
            case 5:
                ((wi.j) ((wi.j) this.f52743b).f53247b).a(this.f52744c);
                return;
            case 6:
                ((zb.l) this.f52743b).d((String) this.f52744c, Boolean.FALSE);
                return;
            case 7:
                zb.r rVar = (zb.r) this.f52743b;
                String str = (String) this.f52744c;
                fc.f fVar = rVar.f54743h.f54707d;
                fVar.getClass();
                String strA = bc.e.a(1024, str);
                synchronized (((AtomicMarkableReference) fVar.f40786h)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) fVar.f40786h).getReference();
                        if (strA != null) {
                            zEquals = strA.equals(str2);
                        } else if (str2 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) fVar.f40786h).set(strA, true);
                        ((ac.g) fVar.f40782d).f3463b.a(new androidx.fragment.app.n(fVar, 5));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 8:
                zc.p pVar2 = (zc.p) this.f52743b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f52744c;
                try {
                    taskCompletionSource.setResult(pVar2.d());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            default:
                Store.lambda$isFeatureSupported$0((Integer) this.f52743b, (String) this.f52744c);
                return;
        }
    }
}
