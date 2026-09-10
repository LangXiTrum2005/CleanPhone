package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b02 implements li0, y22 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b02 f12585b = new b02(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b02 f12586c = new b02(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b02 f12587d = new b02(22);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b02 f12588e = new b02(23);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b02 f12589f = new b02(24);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b02 f12590g = new b02(25);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b02 f12591h = new b02(26);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b02 f12592i = new b02(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12593a;

    public /* synthetic */ b02(int i10) {
        this.f12593a = i10;
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo161zza(Object obj) {
        long jU;
        m mVar;
        switch (this.f12593a) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                return;
            case 9:
                return;
            case 10:
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                return;
            case 14:
                return;
            case 15:
                return;
            case 16:
                return;
            case 17:
                return;
            case 18:
                return;
            case 19:
            default:
                uo0 uo0Var = ((r12) obj).f19277a.l;
                if (uo0Var != null) {
                    w12 w12Var = (w12) uo0Var.f20839b;
                    synchronized (w12Var.f20941a) {
                        mVar = w12Var.f20958s;
                        break;
                    }
                    if (mVar != null) {
                        synchronized (mVar.f17173c) {
                            mVar.f17175e.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                o12 o12Var = (o12) obj;
                o12Var.getClass();
                u12.Y.getAndDecrement();
                uo0 uo0Var2 = o12Var.f18090b.l;
                if (uo0Var2 != null) {
                    int i10 = o12Var.f18089a.f21354a;
                    b02 b02Var = new b02(19);
                    iw0 iw0Var = ((w12) uo0Var2.f20839b).A0;
                    Handler handler = (Handler) iw0Var.f15864b;
                    if (handler != null) {
                        handler.post(new x02(iw0Var, b02Var, 1));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                o12 o12Var2 = (o12) obj;
                u12 u12Var = o12Var2.f18090b;
                if (o12Var2.equals(u12Var.f20578h) && u12Var.l != null) {
                    q12 q12Var = u12Var.f20583n;
                    int i11 = q12Var.f18881b;
                    if (i11 != -1) {
                        long j10 = ((w02) q12Var.f18884e).f21357d / i11;
                        j12 j12Var = u12Var.f20587r;
                        j12Var.getClass();
                        jU = uu0.u(j12Var.f15917a.getSampleRate(), j10);
                    } else {
                        jU = C.TIME_UNSET;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - u12Var.T;
                    uo0 uo0Var3 = u12Var.l;
                    int i12 = ((w02) u12Var.f20583n.f18884e).f21357d;
                    iw0 iw0Var2 = ((w12) uo0Var3.f20839b).A0;
                    long jS = uu0.s(jU);
                    Handler handler2 = (Handler) iw0Var2.f15864b;
                    if (handler2 != null) {
                        handler2.post(new x02(iw0Var2, i12, jS, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 22:
                o12 o12Var3 = (o12) obj;
                u12 u12Var2 = o12Var3.f18090b;
                if (o12Var3.equals(u12Var2.f20578h) && u12Var2.L) {
                    u12Var2.M = true;
                    return;
                }
                return;
            case 23:
                ((o12) obj).a();
                return;
            case 24:
                ((o12) obj).a();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.y22
    public /* synthetic */ int zza(Object obj) {
        HashMap map = z22.f22480a;
        String str = ((p22) obj).f18452a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }
}
