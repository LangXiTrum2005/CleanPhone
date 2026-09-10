package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17137c;

    public void a() {
        synchronized (this) {
            try {
                if (this.f17135a) {
                    return;
                }
                this.f17135a = true;
                this.f17136b = true;
                am.e eVar = (am.e) this.f17137c;
                if (eVar != null) {
                    try {
                        ((o4.r) eVar.f3698b).cancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f17136b = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f17136b = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
