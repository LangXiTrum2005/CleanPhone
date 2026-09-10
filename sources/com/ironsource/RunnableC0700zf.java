package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC0700zf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f31361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0260b5 f31362b;

    public RunnableC0700zf(C0260b5 c0260b5, Handler handler) {
        this.f31362b = c0260b5;
        this.f31361a = handler;
    }

    public Z5 a(C0260b5 c0260b5, String str, long j10) {
        return new Z5(c0260b5, str, j10);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C0693z8 c0693z8 = new C0693z8(this.f31362b.b().getParent(), this.f31362b.b().getName());
        Message messageA = a();
        messageA.obj = c0693z8;
        String strA = a(c0693z8.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.f31361a.sendMessage(messageA);
        } else {
            C0278c5 c0278c5Call = a(new C0260b5(c0693z8, this.f31362b.e(), this.f31362b.a(), this.f31362b.c(), this.f31362b.f(), this.f31362b.d()), strA, 3L).call();
            messageA.what = c0278c5Call.b() == 200 ? Z3.l : c0278c5Call.b();
            this.f31361a.sendMessage(messageA);
        }
    }

    public Message a() {
        return new Message();
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
