package ea;

import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements v, vj.a, f4.c, k9.l, b7.a, gg.a, SuccessContinuation, hc.d, he.d, i3.d, ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b0 f39240b = new b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b0 f39241c = new b0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0 f39242d = new b0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0 f39243e = new b0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b0 f39244f = new b0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b0 f39245g = new b0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b0 f39246h = new b0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b0 f39247i = new b0(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b0 f39248j = new b0(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b0 f39249k = new b0(9);
    public static final /* synthetic */ b0 l = new b0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39250a;

    public /* synthetic */ b0(int i10) {
        this.f39250a = i10;
    }

    public static hc.b b(v1.j jVar) {
        return new hc.b(System.currentTimeMillis() + ((long) Constants.ONE_HOUR), new d5.o(8, 11), new f6(true, false, false), 10.0d, 1.2d, 60);
    }

    public static com.google.android.gms.internal.ads.a0 c(bq0 bq0Var, b2.w wVar) {
        IOException iOException = (IOException) wVar.f5411c;
        if (!(iOException instanceof n1.u)) {
            return null;
        }
        int i10 = ((n1.u) iOException).f46407c;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (bq0Var.a(1)) {
            return new com.google.android.gms.internal.ads.a0(1, 300000L);
        }
        if (bq0Var.a(2)) {
            return new com.google.android.gms.internal.ads.a0(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    public static long k(b2.w wVar) {
        for (Throwable cause = (IOException) wVar.f5411c; cause != null; cause = cause.getCause()) {
            if ((cause instanceof i1.e0) || (cause instanceof FileNotFoundException) || (cause instanceof n1.r) || (cause instanceof j2.l)) {
                return C.TIME_UNSET;
            }
            if ((cause instanceof n1.i) && ((n1.i) cause).f46362a == 2008) {
                return C.TIME_UNSET;
            }
        }
        return Math.min((wVar.f5410b - 1) * 1000, 5000);
    }

    @Override // i3.d
    public long a(n2.l lVar) {
        return -1L;
    }

    @Override // i3.d
    public n2.t createSeekMap() {
        return new n2.o(C.TIME_UNSET);
    }

    @Override // k9.l
    public Object d(j9.o oVar) {
        return ((f9.c) oVar).f40712b;
    }

    @Override // b7.a
    public Object e() {
        switch (this.f39250a) {
            case 17:
                return new g6.z();
            default:
                try {
                    return new i6.g(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    @Override // f4.c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // f4.c
    public void g(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // vj.a
    public Object get() {
        switch (this.f39250a) {
            case 10:
                dd.a aVarE = dd.a.e();
                com.bumptech.glide.d.j(aVarE);
                return aVarE;
            default:
                SessionManager sessionManager = SessionManager.getInstance();
                com.bumptech.glide.d.j(sessionManager);
                return sessionManager;
        }
    }

    @Override // hc.d
    public hc.b h(v1.j jVar, JSONObject jSONObject) {
        return b(jVar);
    }

    @Override // he.d
    public ke.b i(String str, int i10, EnumMap enumMap) {
        he.d a0Var;
        switch (v0.i.c(i10)) {
            case 0:
                a0Var = new a0(29);
                break;
            case 1:
                a0Var = new oe.b();
                break;
            case 2:
                a0Var = new oe.g(2);
                break;
            case 3:
                a0Var = new oe.g(3);
                break;
            case 4:
                a0Var = new oe.g(1);
                break;
            case 5:
                a0Var = new j2.n(24);
                break;
            case 6:
                a0Var = new oe.f(1);
                break;
            case 7:
                a0Var = new oe.f(0);
                break;
            case 8:
                a0Var = new oe.g(0);
                break;
            case 9:
            case 12:
            case 13:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(d5.u.A(i10)));
            case 10:
                a0Var = new ne.a(7);
                break;
            case 11:
                a0Var = new ne.a(12);
                break;
            case 14:
                a0Var = new od.c(24);
                break;
            case 15:
                a0Var = new oe.f(2);
                break;
        }
        return a0Var.i(str, i10, enumMap);
    }

    public int j(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // ic.a
    public StackTraceElement[] j0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i11 - iIntValue;
            if (i11 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i11 - num.intValue();
                        if (i13 < 10) {
                            System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, iIntValue2);
                            i12 += iIntValue2;
                            i13++;
                        }
                        i10 = (iIntValue2 - 1) + i11;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                        i12++;
                        i13 = 1;
                        i10 = i11;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // gg.a
    public void m(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        switch (this.f39250a) {
            case 18:
                if (i10 < i11) {
                    gg.a.f41891k9.m(shortBuffer, i10, shortBuffer2, i11, i12);
                    return;
                } else if (i10 > i11) {
                    gg.a.f41890j9.m(shortBuffer, i10, shortBuffer2, i11, i12);
                    return;
                } else {
                    if (i10 != i11) {
                        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
                    }
                    shortBuffer2.put(shortBuffer);
                    return;
                }
            default:
                if (i10 != i11) {
                    throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
                }
                shortBuffer2.put(shortBuffer);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = h9.c.f42255h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    @Override // ea.v
    public Object zza() {
        switch (this.f39250a) {
            case 0:
                List list = d0.f39287a;
                return (Boolean) j5.f23615a.get();
            case 1:
                List list2 = d0.f39287a;
                return (Boolean) p5.f23838a.get();
            case 2:
                List list3 = d0.f39287a;
                v4.f24075b.get();
                return (Boolean) x4.f24140a.b(1, "measurement.rb.attribution.client2", true).get();
            case 3:
                List list4 = d0.f39287a;
                v4.f24075b.get();
                return (Boolean) x4.f24140a.b(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            case 4:
                List list5 = d0.f39287a;
                return (Boolean) a5.f23292a.get();
            case 5:
                List list6 = d0.f39287a;
                return (Boolean) d5.f23382b.get();
            case 6:
                List list7 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            case 7:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.k4.f23633a.get()).booleanValue());
            case 8:
                return new Boolean(((Boolean) r4.f23916a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) m5.f23728a.get()).booleanValue());
        }
    }

    public /* synthetic */ b0(k5.g gVar, int i10) {
        this.f39250a = i10;
    }

    public b0(om.l lVar) {
        this.f39250a = 25;
        String str = om.l.f47581d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // i3.d
    public void startSeek(long j10) {
    }
}
