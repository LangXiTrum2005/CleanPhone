package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23302b;

    public /* synthetic */ ae(Object obj, int i10) {
        this.f23301a = i10;
        this.f23302b = obj;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f23301a) {
            case 0:
                throw new RuntimeException(((ExecutionException) this.f23302b).getCause());
            case 1:
                try {
                    ta.k0.b((ListenableFuture) this.f23302b);
                    return;
                } catch (ExecutionException e10) {
                    mb.g().post(new ae(e10, 0));
                    return;
                }
            case 2:
                try {
                    ta.k0.b((ta.f0) this.f23302b);
                    return;
                } catch (Exception e11) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e11);
                    return;
                }
            case 3:
                if (((Boolean) ((fe) this.f23302b).f23466c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    ta.k0.b((ta.g0) this.f23302b);
                    return;
                } catch (Exception e12) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e12);
                        return;
                    }
                    return;
                }
        }
    }
}
