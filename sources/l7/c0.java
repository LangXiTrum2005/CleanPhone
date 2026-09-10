package l7;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f45100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Exception f45101b;

    public c0(d0 d0Var) {
        this.f45100a = d0Var;
    }

    public final void a(List result) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.n.f(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f45101b;
                if (exc != null) {
                    q7.e0.B("l7.c0", String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)));
                    return;
                }
                return;
            } catch (Throwable th2) {
                v7.a.a(this, th2);
                return;
            }
            v7.a.a(this, th);
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (!v7.a.b(this)) {
            try {
                boolean zB = v7.a.b(this);
                this = this;
                if (!zB) {
                    try {
                        Void[] params = (Void[]) objArr;
                        boolean zB2 = v7.a.b(this);
                        this = this;
                        if (!zB2) {
                            try {
                                boolean zB3 = v7.a.b(this);
                                this = this;
                                if (!zB3) {
                                    try {
                                        kotlin.jvm.internal.n.f(params, "params");
                                        try {
                                            d0 d0Var = this.f45100a;
                                            d0Var.getClass();
                                            String str = b0.f45085j;
                                            this = j2.n.n(d0Var);
                                            return this;
                                        } catch (Exception e10) {
                                            this.f45101b = e10;
                                            this = this;
                                            return null;
                                        }
                                    } catch (Throwable th2) {
                                        v7.a.a(this, th2);
                                        this = this;
                                    }
                                }
                            } catch (Throwable th3) {
                                v7.a.a(this, th3);
                                this = this;
                            }
                        }
                    } catch (Throwable th4) {
                        v7.a.a(this, th4);
                        this = this;
                    }
                }
            } catch (Throwable th5) {
                v7.a.a(this, th5);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                a((List) obj);
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                super.onPreExecute();
                if (s.f45219h) {
                    q7.e0.B("l7.c0", String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1)));
                }
                if (this.f45100a.f45104a == null) {
                    this.f45100a.f45104a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f45100a + "}";
        kotlin.jvm.internal.n.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
