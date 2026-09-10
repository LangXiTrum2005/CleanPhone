package com.google.android.gms.internal.ads;

import android.view.View;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mu1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f17549b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17550a;

    public mu1(int i10) {
        switch (i10) {
            case 5:
                this.f17550a = new ih();
                break;
            default:
                this.f17550a = new Object();
                break;
        }
    }

    public MessageDigest A0() {
        synchronized (this.f17550a) {
            MessageDigest messageDigest = f17549b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f17549b = MessageDigest.getInstance(SameMD5.TAG);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f17549b;
        }
    }

    public abstract boolean B0(long j10, Object obj);

    public abstract void C0(int i10, long j10);

    public abstract void D0(Object obj, long j10, boolean z10);

    public abstract float E0(long j10, Object obj);

    public abstract void F0(Object obj, long j10, float f10);

    public abstract double G0(long j10, Object obj);

    public abstract void H0(Object obj, long j10, double d10);

    public abstract byte I0(long j10);

    public abstract int J0();

    public abstract int K0();

    public abstract boolean L0();

    public abstract void M0();

    public abstract yo N0();

    public abstract ci O0();

    public synchronized void P0(Object obj, Executor executor) {
        ((HashMap) this.f17550a).put(obj, executor);
    }

    public abstract int Q0();

    public abstract int R0();

    public synchronized void S0(zb0 zb0Var) {
        for (Map.Entry entry : ((HashMap) this.f17550a).entrySet()) {
            ((Executor) entry.getValue()).execute(new zd1(20, zb0Var, entry.getKey()));
        }
    }

    public abstract long T0();

    public abstract long U0();

    public abstract boolean V0();

    public abstract int W0();

    public abstract int c();

    public abstract long y0();

    public abstract void z0(Object obj, long j10, byte b10);

    public abstract void zzl();

    public mu1(View view) {
        this.f17550a = new WeakReference(view);
    }

    public mu1(Set set) {
        this.f17550a = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                nc0 nc0Var = (nc0) it.next();
                synchronized (this) {
                    P0(nc0Var.f17748a, nc0Var.f17749b);
                }
            }
        }
    }
}
