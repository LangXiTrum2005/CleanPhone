package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o41 extends u41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f18118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(xd xdVar, h41 h41Var, Context context, a71 a71Var, int i10) {
        super("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", xdVar, h41Var, a71Var.a(115));
        this.f18117f = i10;
        switch (i10) {
            case 1:
                super("i8dIMUuFazx2QmSkfzNlM975x3JumPrUee1RASXGMNDJH8RWJsPNqbpEpnJFa4Hi", "5davCcWMx5wzne2F0dLFbMr5/cylOtU7FK3CcX7bJPU=", xdVar, h41Var, a71Var.a(119));
                this.f18118g = context;
                break;
            default:
                this.f18118g = context;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final void a(Method method, xd xdVar) {
        switch (this.f18117f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f18118g);
                objArr.getClass();
                synchronized (xdVar) {
                    try {
                        long jIntValue = ((Integer) objArr[0]).intValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).X(jIntValue);
                        int i10 = 1;
                        long jIntValue2 = ((Integer) objArr[1]).intValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).F0(jIntValue2);
                        long jIntValue3 = ((Integer) objArr[2]).intValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).G0(jIntValue3);
                        long jIntValue4 = ((Integer) objArr[3]).intValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).l0(jIntValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            xdVar.b();
                            ((je) xdVar.f19193b).p0(3);
                        } else {
                            int i11 = true != bool.booleanValue() ? 1 : 2;
                            xdVar.b();
                            ((je) xdVar.f19193b).p0(i11);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            xdVar.h(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i10 = 2;
                            }
                            xdVar.h(i10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                Object[] objArr2 = (Object[]) method.invoke("", this.f18118g);
                objArr2.getClass();
                synchronized (xdVar) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).E0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).Y(jLongValue2);
                    break;
                }
                return;
            default:
                Long l = -1L;
                try {
                    Long l10 = (Long) method.invoke("", this.f18118g);
                    if (l10 == null) {
                        throw null;
                    }
                    l = l10;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (xdVar) {
                    long jLongValue3 = l.longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).b0(jLongValue3);
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(xd xdVar, h41 h41Var, Map map, Context context, a71 a71Var) {
        super("I4xYlccqZe8KvMWrizW1s/OekBI2YfU7UNZwq9dr0dp7B5I0B1zvHWlOnn7y8ubq", "k7BIphhpl3j5W4f9W8N9gMUD+i5xBlP2tWz8eVUQlQQ=", xdVar, h41Var, a71Var.a(120));
        this.f18117f = 2;
        this.f18118g = context;
    }
}
