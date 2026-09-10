package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f41383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f41384b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f41385c = null;
    public boolean d = false;

    public q2(x2 x2Var) {
        this.f41383a = x2Var;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f41385c = null;
        this.d = false;
        x2 x2Var = this.f41383a;
        x2Var.getClass();
        MetaData metaDataE = MetaData.E();
        if (metaDataE.f0() && x2Var.f41663w < metaDataE.Y()) {
            x2Var.f41663w++;
            x2Var.a(null, null, true, false, null);
        } else {
            m mVar = x2Var.f41664z;
            if (mVar != null) {
                mVar.a(x2Var);
            }
        }
    }

    public final void d() {
        if (this.d) {
            return;
        }
        if (this.f41385c == null) {
            this.f41385c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.f41384b == null) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    looperMyLooper = Looper.getMainLooper();
                }
                this.f41384b = new Handler(looperMyLooper);
            }
            long jB = b();
            if (jB >= 0) {
                this.d = true;
                this.f41384b.postDelayed(new p2(this), jB);
            }
        }
    }

    public final void e() {
        Handler handler = this.f41384b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f41385c = null;
        this.d = false;
    }
}
