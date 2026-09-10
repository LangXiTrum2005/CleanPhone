package com.inmobi.media;

import A.RunnableC0883c;
import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes5.dex */
public final class A7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22686c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f22687e;
    public final String f = "A7";
    public N9 g;

    public A7(String str, int i2, int i3, long j, InterfaceC3333z5 interfaceC3333z5) {
        this.f22684a = str;
        this.f22685b = i2;
        this.f22686c = i3;
        this.d = j;
        this.f22687e = interfaceC3333z5;
    }

    public final void a() {
        String str = this.f22684a;
        if (str == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f22687e;
            if (interfaceC3333z5 != null) {
                String TAG = this.f;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).b(TAG, "MRAID Js Url provided is invalid.");
                return;
            }
            return;
        }
        N9 n9 = new N9(str, this.f22687e);
        n9.t = false;
        n9.f23014u = false;
        n9.x = false;
        this.g = n9;
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).submit(new RunnableC0883c(this, 1));
    }

    public static final void a(A7 this$0) {
        byte[] bArr;
        Intrinsics.f(this$0, "this$0");
        N9 n9 = this$0.g;
        Context contextD = Uc.d();
        if (contextD != null) {
            if ((System.currentTimeMillis() / ((long) 1000)) - new Sa(contextD, "mraid_js_store").b() <= this$0.d || n9 == null) {
                return;
            }
            int i2 = 0;
            while (i2 <= this$0.f22685b) {
                InterfaceC3333z5 interfaceC3333z5 = this$0.f22687e;
                if (interfaceC3333z5 != null) {
                    String TAG = this$0.f;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "Attempting to get MRAID Js.");
                }
                P9 p9B = n9.b();
                Context contextD2 = Uc.d();
                if (p9B.b()) {
                    InterfaceC3333z5 interfaceC3333z6 = this$0.f22687e;
                    if (interfaceC3333z6 != null) {
                        String TAG2 = this$0.f;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z6).b(TAG2, "Getting MRAID Js from server failed.");
                    }
                    i2++;
                    if (i2 > this$0.f22685b) {
                        return;
                    }
                    try {
                        Thread.sleep(this$0.f22686c * 1000);
                    } catch (InterruptedException e2) {
                        InterfaceC3333z5 interfaceC3333z7 = this$0.f22687e;
                        if (interfaceC3333z7 != null) {
                            String TAG3 = this$0.f;
                            Intrinsics.e(TAG3, "TAG");
                            ((A5) interfaceC3333z7).a(TAG3, "MRAID Js client interrupted while sleeping.", e2);
                        }
                    }
                } else if (contextD2 != null) {
                    Sa sa = new Sa(contextD2, "mraid_js_store");
                    Map map = p9B.f;
                    String strA = null;
                    List list = map != null ? (List) map.get("Content-Encoding") : null;
                    if (Intrinsics.a(list != null ? (String) list.get(0) : null, com.smartdigimkt.o0.b.d)) {
                        InterfaceC3333z5 interfaceC3333z8 = this$0.f22687e;
                        if (interfaceC3333z8 != null) {
                            String TAG4 = this$0.f;
                            Intrinsics.e(TAG4, "TAG");
                            ((A5) interfaceC3333z8).a(TAG4, "Response is GZIP-compressed, uncompressing it");
                        }
                        boolean z2 = T9.f23231a;
                        byte[] bArr2 = p9B.f23071b;
                        if (bArr2 != null && bArr2.length != 0) {
                            bArr = new byte[bArr2.length];
                            Intrinsics.c(bArr2);
                            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                        } else {
                            bArr = new byte[0];
                        }
                        byte[] bArrA = T9.a(bArr);
                        if (bArrA != null) {
                            try {
                                String str = new String(bArrA, Charsets.f44691a);
                                InterfaceC3333z5 interfaceC3333z9 = this$0.f22687e;
                                if (interfaceC3333z9 != null) {
                                    String TAG5 = this$0.f;
                                    Intrinsics.e(TAG5, "TAG");
                                    ((A5) interfaceC3333z9).a(TAG5, "Getting MRAID Js from server succeeded.");
                                }
                                strA = str;
                            } catch (UnsupportedEncodingException e3) {
                                InterfaceC3333z5 interfaceC3333z10 = this$0.f22687e;
                                if (interfaceC3333z10 != null) {
                                    String str2 = this$0.f;
                                    StringBuilder sbA = H6.a(str2, "TAG", "Failed to get MRAID JS \n");
                                    sbA.append(e3.getMessage());
                                    ((A5) interfaceC3333z10).b(str2, sbA.toString());
                                }
                            }
                        }
                    } else {
                        InterfaceC3333z5 interfaceC3333z11 = this$0.f22687e;
                        if (interfaceC3333z11 != null) {
                            String TAG6 = this$0.f;
                            Intrinsics.e(TAG6, "TAG");
                            ((A5) interfaceC3333z11).a(TAG6, "Getting MRAID Js from server succeeded.");
                        }
                        strA = p9B.a();
                    }
                    if (strA != null) {
                        sa.b("mraid_js_string", strA);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
