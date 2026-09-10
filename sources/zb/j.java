package zb;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f54694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f54695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f54696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f54697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f54698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f54699f;

    public j(l lVar, long j10, Throwable th2, Thread thread, com.google.android.gms.internal.consent_sdk.d dVar, boolean z10) {
        this.f54699f = lVar;
        this.f54694a = j10;
        this.f54695b = th2;
        this.f54696c = thread;
        this.f54697d = dVar;
        this.f54698e = z10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j10 = this.f54694a;
        long j11 = j10 / 1000;
        l lVar = this.f54699f;
        String strG = lVar.g();
        if (strG == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        lVar.f54706c.a();
        fc.f fVar = lVar.f54715m;
        fVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strG);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        fVar.y(this.f54695b, this.f54696c, "crash", new bc.c(strG, xj.w.f53867a, j11), true);
        try {
            fc.f fVar2 = lVar.f54710g;
            String str = ".ae" + j10;
            fVar2.getClass();
            if (!new File((File) fVar2.f40782d, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        com.google.android.gms.internal.consent_sdk.d dVar = this.f54697d;
        lVar.c(false, dVar, false);
        lVar.d(new d().f54680a, Boolean.valueOf(this.f54698e));
        return !lVar.f54705b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) dVar.f22989i).get()).getTask().onSuccessTask(lVar.f54708e.f3462a, new wi.b(this, strG));
    }
}
