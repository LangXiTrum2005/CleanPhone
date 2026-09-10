package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class RunnableC3642mf implements Runnable {
    private final Handler a;
    private final C3417a5 b;

    public RunnableC3642mf(C3417a5 c3417a5, Handler handler) {
        this.b = c3417a5;
        this.a = handler;
    }

    public W5 a(C3417a5 c3417a5, String str, long j) {
        return new W5(c3417a5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C3824x8 c3824x8 = new C3824x8(this.b.b().getParent(), this.b.b().getName());
        Message messageA = a();
        messageA.obj = c3824x8;
        String strA = a(c3824x8.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.a.sendMessage(messageA);
        } else {
            C3435b5 c3435b5Call = a(new C3417a5(c3824x8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), strA, 3L).call();
            messageA.what = c3435b5Call.b() == 200 ? Z3.l : c3435b5Call.b();
            this.a.sendMessage(messageA);
        }
    }

    public Message a() {
        return new Message();
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
