package c2;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Locale;
import k9.n;
import l1.q;
import l1.y;
import n2.a0;
import n2.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5908e;

    public j(com.google.android.gms.common.api.internal.e eVar, int i10, com.google.android.gms.common.api.internal.a aVar, long j10, long j11) {
        this.f5907d = eVar;
        this.f5904a = i10;
        this.f5908e = aVar;
        this.f5905b = j10;
        this.f5906c = j11;
    }

    public static k9.g d(r rVar, k9.f fVar, int i10) {
        k9.g telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f44431b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f44433d;
        int i11 = 0;
        if (iArr != null) {
            while (i11 < iArr.length) {
                if (iArr[i11] != i10) {
                    i11++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f44435f;
        if (iArr2 != null) {
            while (i11 < iArr2.length) {
                if (iArr2[i11] == i10) {
                    return null;
                }
                i11++;
            }
        }
        if (rVar.l < telemetryConfiguration.f44434e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // c2.i
    public void a(m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 1);
        this.f5908e = a0VarTrack;
        a0VarTrack.b(((b2.m) this.f5907d).f5327c);
    }

    @Override // c2.i
    public void b(q qVar, long j10, int i10, boolean z10) {
        int iA;
        ((a0) this.f5908e).getClass();
        int i11 = this.f5904a;
        if (i11 != -1 && i10 != (iA = b2.i.a(i11))) {
            String str = y.f44830a;
            Locale locale = Locale.US;
            l1.a.s("RtpPcmReader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, "."));
        }
        long jB = r9.b.B(((b2.m) this.f5907d).f5326b, this.f5906c, j10, this.f5905b);
        int iA2 = qVar.a();
        ((a0) this.f5908e).g(iA2, qVar);
        ((a0) this.f5908e).a(jB, 1, iA2, 0, null);
        this.f5904a = i10;
    }

    @Override // c2.i
    public void c(long j10) {
        this.f5905b = j10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int iElapsedRealtime;
        com.google.android.gms.common.api.internal.e eVar = (com.google.android.gms.common.api.internal.e) this.f5907d;
        if (eVar.f()) {
            n nVar = (n) k9.m.b().f44477a;
            if (nVar == null || nVar.f44486b) {
                r rVar = (r) eVar.f11702j.get((com.google.android.gms.common.api.internal.a) this.f5908e);
                if (rVar != null) {
                    Object obj = rVar.f11752b;
                    if (obj instanceof k9.f) {
                        k9.f fVar = (k9.f) obj;
                        long j12 = this.f5905b;
                        boolean z10 = j12 > 0;
                        int gCoreServiceId = fVar.getGCoreServiceId();
                        if (nVar != null) {
                            z10 &= nVar.f44487c;
                            int i16 = nVar.f44488d;
                            int i17 = nVar.f44489e;
                            i10 = nVar.f44485a;
                            if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                                k9.g gVarD = d(rVar, fVar, this.f5904a);
                                if (gVarD == null) {
                                    return;
                                }
                                boolean z11 = gVarD.f44432c && j12 > 0;
                                i17 = gVarD.f44434e;
                                z10 = z11;
                            }
                            i12 = i16;
                            i11 = i17;
                        } else {
                            i10 = 0;
                            i11 = 100;
                            i12 = 5000;
                        }
                        if (task.isSuccessful()) {
                            i15 = 0;
                            i14 = 0;
                        } else if (task.isCanceled()) {
                            i14 = -1;
                            i15 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof j9.e) {
                                Status status = ((j9.e) exception).f43728a;
                                i13 = status.f11654a;
                                ConnectionResult connectionResult = status.f11657d;
                                if (connectionResult != null) {
                                    i14 = connectionResult.f11641b;
                                }
                                i15 = i13;
                            } else {
                                i13 = InterfaceC0435l1.d.b.f29105b;
                            }
                            i14 = -1;
                            i15 = i13;
                        }
                        if (z10) {
                            long j13 = this.f5906c;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            j10 = j12;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = jCurrentTimeMillis;
                        } else {
                            j10 = 0;
                            j11 = 0;
                            iElapsedRealtime = -1;
                        }
                        x xVar = new x(new k9.k(this.f5904a, i15, i14, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), i10, i12, i11);
                        u6 u6Var = eVar.f11705n;
                        u6Var.sendMessage(u6Var.obtainMessage(18, xVar));
                    }
                }
            }
        }
    }

    @Override // c2.i
    public void seek(long j10, long j11) {
        this.f5905b = j10;
        this.f5906c = j11;
    }

    public j(b2.m mVar) {
        this.f5907d = mVar;
        this.f5905b = C.TIME_UNSET;
        this.f5906c = 0L;
        this.f5904a = -1;
    }
}
