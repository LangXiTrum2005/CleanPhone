package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f23458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23460e;

    public /* synthetic */ fb(Object obj, Serializable serializable, Object obj2, Object obj3, int i10) {
        this.f23456a = i10;
        this.f23457b = obj;
        this.f23458c = serializable;
        this.f23459d = obj2;
        this.f23460e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23456a) {
            case 0:
                ta.v0 v0Var = (ta.v0) this.f23457b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f23458c;
                Context context = (Context) this.f23459d;
                eb ebVar = (eb) this.f23460e;
                if ((v0Var.f50646a instanceof ta.d) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(ebVar);
                    } catch (IllegalArgumentException e10) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e10);
                        return;
                    }
                    break;
                }
                break;
            default:
                q6 q6Var = wb.f24117a;
                Level level = (Level) this.f23457b;
                y2 y2Var = (y2) q6Var.f23891b;
                boolean zE = y2Var.e(level);
                String str = (String) y2Var.f24166a;
                ((i) d.f23368a).getClass();
                n.f23758b.a(str, level, zE);
                ((ah) ((ah) (!zE ? q6.f23889e : new bh(q6Var, level)).a((Throwable) this.f23458c)).zzn()).b((String) this.f23459d, (Object[]) this.f23460e);
                break;
        }
    }
}
