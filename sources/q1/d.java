package q1;

import android.media.AudioProfile;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.dm0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import l1.k;
import l2.v;
import qj.x;
import r1.a0;
import r1.c0;
import r1.l;
import r1.t;
import r1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48527a;

    public /* synthetic */ d(int i10) {
        this.f48527a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioProfile a(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager c(Object obj) {
        return (MediaMetricsManager) obj;
    }

    @Override // l1.k
    public void invoke(Object obj) {
        long jS;
        switch (this.f48527a) {
            case 0:
                ((b) obj).getClass();
                break;
            case 1:
                ((b) obj).getClass();
                break;
            case 2:
                ((b) obj).getClass();
                break;
            case 3:
                ((b) obj).getClass();
                break;
            case 4:
                ((b) obj).getClass();
                break;
            case 5:
                ((b) obj).getClass();
                break;
            case 6:
                ((b) obj).getClass();
                break;
            case 7:
                ((b) obj).getClass();
                break;
            case 8:
                ((b) obj).getClass();
                break;
            case 9:
                ((b) obj).getClass();
                break;
            case 10:
                ((b) obj).getClass();
                break;
            case 11:
                ((b) obj).getClass();
                break;
            case 12:
                ((b) obj).getClass();
                break;
            case 13:
                ((b) obj).getClass();
                break;
            case 14:
                ((b) obj).getClass();
                break;
            case 15:
                ((b) obj).getClass();
                break;
            case 16:
                ((b) obj).getClass();
                break;
            case 17:
                ((b) obj).getClass();
                break;
            case 18:
                ((b) obj).getClass();
                break;
            case 19:
                ((b) obj).getClass();
                break;
            case 20:
                ((b) obj).getClass();
                break;
            case 21:
                ((b) obj).getClass();
                break;
            case 22:
                ((b) obj).getClass();
                break;
            case 23:
                ((b) obj).getClass();
                break;
            case 24:
                ((b) obj).getClass();
                break;
            case 25:
                ((b) obj).getClass();
                break;
            default:
                y yVar = (y) obj;
                a0 a0Var = yVar.f49397b;
                if (yVar.equals(a0Var.f49234j) && a0Var.f49237n != null) {
                    dm0 dm0Var = a0Var.f49239p;
                    int i10 = dm0Var.f13584b;
                    if (i10 != -1) {
                        long j10 = ((r1.j) dm0Var.f13587e).f49315f / i10;
                        t tVar = a0Var.f49243t;
                        tVar.getClass();
                        jS = l1.y.S(tVar.f49344a.getSampleRate(), j10);
                    } else {
                        jS = C.TIME_UNSET;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a0Var.W;
                    x xVar = a0Var.f49237n;
                    int i11 = ((r1.j) a0Var.f49239p.f13587e).f49315f;
                    long jZ = l1.y.Z(jS);
                    v vVar = ((c0) xVar.f49096b).F0;
                    Handler handler = vVar.f44941a;
                    if (handler != null) {
                        handler.post(new l(vVar, i11, jZ, jElapsedRealtime));
                    }
                }
                break;
        }
    }
}
