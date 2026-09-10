package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q21 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18893a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18899g;

    public /* synthetic */ q21(s21 s21Var, String str, z.i iVar, boolean z10, String str2, byte[] bArr) {
        this.f18895c = s21Var;
        this.f18896d = str;
        this.f18898f = iVar;
        this.f18894b = z10;
        this.f18897e = str2;
        this.f18899g = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th2;
        SocketTimeoutException socketTimeoutException;
        byte[] byteArray;
        Throwable th3;
        RemoteException remoteException;
        ea.l4 l4Var;
        AtomicReference atomicReference;
        switch (this.f18893a) {
            case 0:
                s21 s21Var = (s21) this.f18895c;
                String str = (String) this.f18896d;
                z.i iVar = (z.i) this.f18898f;
                boolean z10 = this.f18894b;
                String str2 = (String) this.f18897e;
                byte[] bArr = (byte[]) this.f18899g;
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) URI.create(str).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection2);
                            ry0 ry0Var = new ry0(httpURLConnection2, 4);
                            ExecutorService executorService = s21Var.f19779a;
                            z.m mVar = iVar.f54592c;
                            if (mVar != null) {
                                mVar.addListener(ry0Var, executorService);
                            }
                            httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, s21Var.f19780b);
                            int i10 = (int) s21Var.f19781c;
                            httpURLConnection2.setConnectTimeout(i10);
                            httpURLConnection2.setReadTimeout(i10);
                            if (z10) {
                                httpURLConnection2.setDoOutput(true);
                                httpURLConnection2.setRequestMethod(C0375hc.f28789b);
                                if (str2 != null) {
                                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    bufferedOutputStream.close();
                                } catch (Throwable th4) {
                                    try {
                                        bufferedOutputStream.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            }
                            int responseCode = httpURLConnection2.getResponseCode();
                            InputStream inputStream = responseCode < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    if (inputStream == null) {
                                        byteArray = new byte[0];
                                        byteArrayOutputStream.close();
                                    } else {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int i11 = inputStream.read(bArr2);
                                            if (i11 != -1) {
                                                byteArrayOutputStream.write(bArr2, 0, i11);
                                            } else {
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                inputStream.close();
                                            }
                                        }
                                    }
                                    iVar.a(new r21(responseCode, byteArray));
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th6) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                        throw th6;
                                    }
                                }
                            } catch (Throwable th8) {
                                if (inputStream == null) {
                                    throw th8;
                                }
                                try {
                                    inputStream.close();
                                    throw th8;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                    return;
                                }
                                return;
                            }
                        } catch (SocketTimeoutException e10) {
                            socketTimeoutException = e10;
                            httpURLConnection = httpURLConnection2;
                            String message = socketTimeoutException.getMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 9);
                            sb2.append("Timeout: ");
                            sb2.append(message);
                            iVar.b(new TimeoutException(sb2.toString()));
                            httpURLConnection2 = httpURLConnection;
                            break;
                        } catch (Throwable th10) {
                            th2 = th10;
                            httpURLConnection = httpURLConnection2;
                            iVar.b(th2);
                            httpURLConnection2 = httpURLConnection;
                            break;
                        }
                    } catch (SocketTimeoutException e11) {
                        socketTimeoutException = e11;
                    } catch (Throwable th11) {
                        th2 = th11;
                    }
                } catch (Throwable th12) {
                    if (httpURLConnection == null) {
                        throw th12;
                    }
                    httpURLConnection.disconnect();
                    throw th12;
                }
                break;
            case 1:
                Pair pair = (Pair) this.f18896d;
                ((d02) ((jz1) this.f18895c).f16227b.f17089j).e(((Integer) pair.first).intValue(), (r32) pair.second, (j32) this.f18897e, (o32) this.f18898f, (IOException) this.f18899g, this.f18894b);
                return;
            case 2:
                String str3 = (String) this.f18897e;
                String str4 = (String) this.f18896d;
                com.google.android.gms.internal.measurement.a7 a7Var = (com.google.android.gms.internal.measurement.a7) this.f18898f;
                ea.h3 h3Var = (ea.h3) this.f18899g;
                Bundle bundle = new Bundle();
                try {
                    try {
                        ea.g0 g0Var = h3Var.f39458d;
                        ea.m1 m1Var = (ea.m1) h3Var.f3623a;
                        if (g0Var == null) {
                            ea.s0 s0Var = m1Var.f39587f;
                            ea.m1.h(s0Var);
                            s0Var.f39753f.d("Failed to get user properties; not connected to service", str4, str3);
                            l4Var = m1Var.f39590i;
                            ea.m1.f(l4Var);
                            l4Var.x1(a7Var, bundle);
                            return;
                        }
                        List<ea.i4> listJ1 = g0Var.j1(str4, str3, this.f18894b, (ea.n4) this.f18895c);
                        Bundle bundle2 = new Bundle();
                        if (listJ1 != null) {
                            for (ea.i4 i4Var : listJ1) {
                                String str5 = i4Var.f39488e;
                                String str6 = i4Var.f39485b;
                                if (str5 != null) {
                                    bundle2.putString(str6, str5);
                                } else {
                                    Long l = i4Var.f39487d;
                                    if (l != null) {
                                        bundle2.putLong(str6, l.longValue());
                                    } else {
                                        Double d10 = i4Var.f39490g;
                                        if (d10 != null) {
                                            bundle2.putDouble(str6, d10.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            h3Var.T0();
                            ea.l4 l4Var2 = m1Var.f39590i;
                            ea.m1.f(l4Var2);
                            l4Var2.x1(a7Var, bundle2);
                            return;
                        } catch (RemoteException e12) {
                            remoteException = e12;
                            bundle = bundle2;
                            ea.s0 s0Var2 = ((ea.m1) h3Var.f3623a).f39587f;
                            ea.m1.h(s0Var2);
                            s0Var2.f39753f.d("Failed to get user properties; remote exception", str4, remoteException);
                            l4Var = ((ea.m1) h3Var.f3623a).f39590i;
                            ea.m1.f(l4Var);
                            l4Var.x1(a7Var, bundle);
                            return;
                        } catch (Throwable th13) {
                            th3 = th13;
                            bundle = bundle2;
                            ea.l4 l4Var3 = ((ea.m1) h3Var.f3623a).f39590i;
                            ea.m1.f(l4Var3);
                            l4Var3.x1(a7Var, bundle);
                            throw th3;
                        }
                    } catch (RemoteException e13) {
                        remoteException = e13;
                    }
                } catch (Throwable th14) {
                    th3 = th14;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f18895c;
                synchronized (atomicReference2) {
                    try {
                        try {
                            ea.h3 h3Var2 = (ea.h3) this.f18899g;
                            ea.g0 g0Var2 = h3Var2.f39458d;
                            if (g0Var2 == null) {
                                ea.s0 s0Var3 = ((ea.m1) h3Var2.f3623a).f39587f;
                                ea.m1.h(s0Var3);
                                s0Var3.f39753f.e("(legacy) Failed to get user properties; not connected to service", null, (String) this.f18896d, (String) this.f18897e);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(g0Var2.j1((String) this.f18896d, (String) this.f18897e, this.f18894b, (ea.n4) this.f18898f));
                            } else {
                                atomicReference2.set(g0Var2.t(null, (String) this.f18896d, (String) this.f18897e, this.f18894b));
                            }
                            h3Var2.T0();
                            atomicReference = (AtomicReference) this.f18895c;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e14) {
                            ea.s0 s0Var4 = ((ea.m1) ((ea.h3) this.f18899g).f3623a).f39587f;
                            ea.m1.h(s0Var4);
                            s0Var4.f39753f.e("(legacy) Failed to get user properties; remote exception", null, (String) this.f18896d, e14);
                            ((AtomicReference) this.f18895c).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f18895c;
                        }
                    } catch (Throwable th15) {
                        ((AtomicReference) this.f18895c).notify();
                        throw th15;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q21(jz1 jz1Var, Pair pair, j32 j32Var, o32 o32Var, IOException iOException, boolean z10) {
        this.f18895c = jz1Var;
        this.f18896d = pair;
        this.f18897e = j32Var;
        this.f18898f = o32Var;
        this.f18899g = iOException;
        this.f18894b = z10;
    }

    public q21(ea.h3 h3Var, String str, String str2, ea.n4 n4Var, boolean z10, com.google.android.gms.internal.measurement.a7 a7Var) {
        this.f18896d = str;
        this.f18897e = str2;
        this.f18895c = n4Var;
        this.f18894b = z10;
        this.f18898f = a7Var;
        this.f18899g = h3Var;
    }

    public q21(ea.h3 h3Var, AtomicReference atomicReference, String str, String str2, ea.n4 n4Var, boolean z10) {
        this.f18895c = atomicReference;
        this.f18896d = str;
        this.f18897e = str2;
        this.f18898f = n4Var;
        this.f18894b = z10;
        this.f18899g = h3Var;
    }
}
