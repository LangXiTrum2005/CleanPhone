package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class qz0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f19245e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f19247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Task f19248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19249d;

    public qz0(Context context, Executor executor, Task task, boolean z10) {
        this.f19246a = context;
        this.f19247b = executor;
        this.f19248c = task;
        this.f19249d = z10;
    }

    public static qz0 a(Context context, Executor executor, boolean z10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new gm0(17, context, taskCompletionSource));
        } else {
            executor.execute(new ry0(taskCompletionSource, 3));
        }
        return new qz0(context, executor, taskCompletionSource.getTask(), z10);
    }

    public void b(int i10, long j10) {
        e(i10, j10, null, null, null);
    }

    public void c(int i10, long j10, Exception exc) {
        e(i10, j10, exc, null, null);
    }

    public void d(int i10, String str) {
        e(i10, 0L, null, null, str);
    }

    public final Task e(int i10, long j10, Exception exc, String str, String str2) {
        if (!this.f19249d) {
            return this.f19248c.continueWith(this.f19247b, tt0.f20493c);
        }
        Context context = this.f19246a;
        od odVarZ = sd.z();
        String packageName = context.getPackageName();
        odVarZ.b();
        ((sd) odVarZ.f19193b).A(packageName);
        odVarZ.b();
        ((sd) odVarZ.f19193b).B(j10);
        int i11 = f19245e;
        odVarZ.b();
        ((sd) odVarZ.f19193b).G(i11);
        if (exc != null) {
            Object obj = t81.f20241a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            odVarZ.b();
            ((sd) odVarZ.f19193b).C(string);
            String name = exc.getClass().getName();
            odVarZ.b();
            ((sd) odVarZ.f19193b).D(name);
        }
        if (str2 != null) {
            odVarZ.b();
            ((sd) odVarZ.f19193b).E(str2);
        }
        if (str != null) {
            odVarZ.b();
            ((sd) odVarZ.f19193b).F(str);
        }
        return this.f19248c.continueWith(this.f19247b, new b2.w(i10, 8, odVarZ));
    }
}
