package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 implements d2, com.google.android.gms.common.api.internal.k, ta.y, OnCompleteListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile q6 f23887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1 f23888d = new f1(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ch f23889e = new ch();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23891b;

    public /* synthetic */ q6(Object obj, int i10) {
        this.f23890a = i10;
        this.f23891b = obj;
    }

    public static void d(String str, bh bhVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(bhVar.f23326b))));
        sb2.append(": logging error [");
        ih ihVar = bhVar.f23328d;
        if (ihVar == null) {
            throw new IllegalStateException("cannot request log site information prior to postProcess()");
        }
        yg.e(1, ihVar, sb2);
        sb2.append("]: ");
        sb2.append(str);
        System.err.println(sb2);
        System.err.flush();
    }

    @Override // com.google.android.gms.internal.measurement.d2
    public boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((d2[]) this.f23891b)[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        int i10 = this.f23890a;
        Object obj3 = this.f23891b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        db dbVar = (db) obj;
        switch (i10) {
            case 7:
                int i11 = bb.l;
                za zaVar = new za(taskCompletionSource);
                cb cbVar = (cb) dbVar.getService();
                byte[] bArrA = ((bc) obj3).a();
                Parcel parcelU1 = cbVar.u1();
                m6.c(parcelU1, zaVar);
                parcelU1.writeByteArray(bArrA);
                cbVar.w1(parcelU1, 31);
                break;
            default:
                cb cbVar2 = (cb) dbVar.getService();
                za zaVar2 = new za((bb) obj3, taskCompletionSource);
                Parcel parcelU2 = cbVar2.u1();
                m6.c(parcelU2, zaVar2);
                cbVar2.w1(parcelU2, 27);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d2
    public n2 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            d2 d2Var = ((d2[]) this.f23891b)[i10];
            if (d2Var.a(cls)) {
                return d2Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public fd c(String str, boolean z10) {
        return new fd(str, (i9.i) this.f23891b, z10);
    }

    @Override // ta.y
    public ListenableFuture call() {
        switch (this.f23890a) {
            case 9:
                ta.x0 x0Var = new ta.x0((Callable) this.f23891b);
                ta.c0.f50592a.execute(x0Var);
                return x0Var;
            default:
                return (ta.r) this.f23891b;
        }
    }

    public void e(int i10, Object obj, o2 o2Var) {
        x0 x0Var = (x0) this.f23891b;
        l0 l0Var = (l0) obj;
        x0Var.r(i10, 2);
        x0Var.F(l0Var.c(o2Var));
        o2Var.d(l0Var, this);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        hb hbVar = (hb) this.f23891b;
        if (task.isCanceled()) {
            hbVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            hbVar.l(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        hbVar.n(exception);
    }

    public q6(int i10) {
        this.f23890a = i10;
        switch (i10) {
            case 1:
                int i11 = n0.f23760a;
                this.f23891b = new q6(new d2[]{f1.f23446b, f23888d}, 4);
                break;
            case 5:
                this.f23891b = new HashMap();
                break;
            case 13:
                this.f23891b = new ConcurrentHashMap();
                break;
            case 14:
                this.f23891b = new AtomicInteger();
                break;
            default:
                this.f23891b = new CopyOnWriteArrayList();
                break;
        }
    }

    public q6(Context context) {
        this.f23890a = 15;
        new ConcurrentHashMap();
        h.e(context != null, "Context cannot be null", new Object[0]);
        this.f23891b = context.getApplicationContext();
    }

    public q6(x0 x0Var) {
        this.f23890a = 3;
        this.f23891b = x0Var;
        x0Var.f24138c = this;
    }

    public q6(za zaVar, byte[] bArr) {
        this.f23890a = 6;
        this.f23891b = bArr;
    }
}
