package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f17790c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile q01 f17791d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Random f17792e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg f17793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f17794b;

    public nf(fg fgVar) {
        this.f17793a = fgVar;
        fgVar.f14388b.execute(new d(this, 5));
    }

    public final void a(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f17790c.block();
            if (!this.f17794b.booleanValue() || f17791d == null) {
                return;
            }
            od odVarZ = sd.z();
            String packageName = this.f17793a.f14387a.getPackageName();
            odVarZ.b();
            ((sd) odVarZ.f19193b).A(packageName);
            odVarZ.b();
            ((sd) odVarZ.f19193b).B(j10);
            if (str != null) {
                odVarZ.b();
                ((sd) odVarZ.f19193b).E(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                odVarZ.b();
                ((sd) odVarZ.f19193b).C(string);
                String name = exc.getClass().getName();
                odVarZ.b();
                ((sd) odVarZ.f19193b).D(name);
            }
            q01 q01Var = f17791d;
            byte[] bArrB = ((sd) odVarZ.e()).b();
            q01Var.getClass();
            k3 k3Var = new k3(q01Var, bArrB);
            k3Var.f16294b = i10;
            if (i11 != -1) {
                k3Var.f16293a = i11;
            }
            k3Var.D();
        } catch (Exception unused) {
        }
    }
}
