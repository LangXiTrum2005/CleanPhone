package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.InterfaceC0435l1;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 extends u41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f17640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f17641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p21 f17642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f17644j;

    public n41(xd xdVar, h41 h41Var, Map map, Context context, p21 p21Var, h21 h21Var, a71 a71Var) {
        super("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", xdVar, h41Var, a71Var.a(InterfaceC0435l1.d.b.f29114k));
        this.f17641g = context;
        this.f17640f = map;
        this.f17642h = p21Var;
        this.f17643i = h21Var.X();
        this.f17644j = h21Var.Y();
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final void a(Method method, xd xdVar) {
        String strEncodeToString;
        je jeVar;
        Object[] objArr = (Object[]) method.invoke("", this.f17641g, Integer.valueOf(this.f17642h.ordinal()));
        objArr.getClass();
        String strU0 = "E";
        int i10 = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.f17640f.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (jeVar = (je) listenableFuture.get(this.f17643i, TimeUnit.MILLISECONDS)) != null && jeVar.u0().length() > 1)) {
                strU0 = jeVar.u0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strU0.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f17640f.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.f17644j, TimeUnit.MILLISECONDS);
                    if (!pi1.l(str)) {
                        strU0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (xdVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    strEncodeToString = Base64.encodeToString(rb1.f19515f.f().g(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    strEncodeToString = (String) obj;
                }
                long jLongValue = ((Long) objArr[0]).longValue();
                xdVar.b();
                ((je) xdVar.f19193b).E(jLongValue);
                String str2 = (String) objArr[1];
                xdVar.b();
                ((je) xdVar.f19193b).D(str2);
                String str3 = (String) objArr[2];
                xdVar.b();
                ((je) xdVar.f19193b).N(str3);
                String str4 = (String) objArr[3];
                xdVar.b();
                ((je) xdVar.f19193b).O(str4);
                xdVar.b();
                ((je) xdVar.f19193b).z(strEncodeToString);
                xdVar.b();
                ((je) xdVar.f19193b).Q0(strU0);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i10 = 2;
                    }
                    xdVar.b();
                    ((je) xdVar.f19193b).s0(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
