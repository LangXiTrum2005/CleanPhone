package com.p004ironsource;

import android.os.Handler;
import android.os.Message;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: loaded from: classes5.dex */
class tu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f27339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final db f27340b;

    public tu(db dbVar, Handler handler) {
        this.f27340b = dbVar;
        this.f27339a = handler;
    }

    public Message a() {
        return new Message();
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        int iB;
        vh vhVar = new vh(this.f27340b.b().getParent(), this.f27340b.b().getName());
        Message messageA = a();
        messageA.obj = vhVar;
        String strA = a(vhVar.getParent());
        if (strA == null) {
            iB = 1020;
        } else {
            eb ebVarCall = a(new db(vhVar, this.f27340b.e(), this.f27340b.a(), this.f27340b.c(), this.f27340b.f(), this.f27340b.d()), strA, 3L).call();
            iB = ebVarCall.b() == 200 ? f9.f24993l : ebVarCall.b();
        }
        messageA.what = iB;
        this.f27339a.sendMessage(messageA);
    }

    public zc a(db dbVar, String str, long j) {
        return new zc(dbVar, str, j);
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
