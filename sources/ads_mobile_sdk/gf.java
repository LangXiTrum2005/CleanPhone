package ads_mobile_sdk;

import android.os.SystemClock;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gf implements OnCompleteListener {
    public final /* synthetic */ hf a;
    public final /* synthetic */ impassible b;

    public gf(hf hfVar, kowloon kowloonVar) {
        this.a = hfVar;
        this.b = kowloonVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task appSetIdInfoTask) {
        Intrinsics.checkNotNullParameter(appSetIdInfoTask, "appSetIdInfoTask");
        if (appSetIdInfoTask.isSuccessful()) {
            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) appSetIdInfoTask.getResult();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.a.c.getClass();
            ln lnVar = new ln(appSetIdInfo, p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS));
            impassible impassibleVar = this.b;
            Result.Companion companion2 = Result.INSTANCE;
            impassibleVar.resumeWith(Result.m3351constructorimpl(new tn0(lnVar)));
            return;
        }
        if (appSetIdInfoTask.isCanceled()) {
            ((d13) this.a.b).a("AppSet Id task was cancelled", new CancellationException("AppSet Id task was cancelled"));
            impassible impassibleVar2 = this.b;
            Result.Companion companion3 = Result.INSTANCE;
            impassibleVar2.resumeWith(Result.m3351constructorimpl(new rn0("Gms Task for getting AppSetId was cancelled", k41.INTERNAL_ERROR)));
            return;
        }
        Exception exception = appSetIdInfoTask.getException();
        if (exception == null) {
            exception = new Exception("AppSet Id task wasn't successful or cancelled, but had no exception.");
        }
        ((d13) this.a.b).a("Task failed while getting AppSet Id", exception);
        impassible impassibleVar3 = this.b;
        Result.Companion companion4 = Result.INSTANCE;
        impassibleVar3.resumeWith(Result.m3351constructorimpl(new on0(exception, null, null, 6)));
    }
}
