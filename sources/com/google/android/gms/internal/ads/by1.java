package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 implements zy1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ya1 f12925p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih f12926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ug f12927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.n f12928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f12936k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final db1 f12937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f12938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12939o;

    static {
        aa1 aa1Var = ca1.f13122b;
        Object[] objArr = {X3.i.f27782b, "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset"};
        ps1.s(6, objArr);
        f12925p = ca1.A(6, objArr);
    }

    public by1() {
        androidx.datastore.preferences.protobuf.n nVar = new androidx.datastore.preferences.protobuf.n();
        j(1000, 0, "bufferForPlaybackMs", "0");
        j(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        j(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "minBufferMs", "bufferForPlaybackMs");
        j(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        j(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.f12926a = new ih();
        this.f12927b = new ug();
        this.f12928c = nVar;
        long jT = uu0.t(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.f12929d = jT;
        long jT2 = uu0.t(1000L);
        this.f12930e = jT2;
        this.f12931f = jT;
        this.f12932g = jT;
        this.f12933h = jT2;
        this.f12934i = jT2;
        this.f12935j = uu0.t(2000L);
        this.f12936k = jT2;
        this.l = uu0.t(0L);
        this.f12938n = new ConcurrentHashMap();
        this.f12937m = db1.a(db1.f13484g);
        this.f12939o = -1L;
    }

    public static void j(int i10, int i11, String str, String str2) {
        if (!(i10 >= i11)) {
            throw new IllegalArgumentException(dv.B("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void a(xy1 xy1Var, p[] pVarArr) {
        j02 j02Var = xy1Var.f22039a;
        Integer num = (Integer) this.f12937m.get(j02Var.f15893a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        ay1 ay1Var = (ay1) this.f12938n.get(j02Var);
        ay1Var.getClass();
        if (iIntValue == -1) {
            boolean zI = i(xy1Var);
            int length = pVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 >= length) {
                    break;
                }
                p pVar = pVarArr[i10];
                if (pVar != null) {
                    int i13 = pVar.zza().f17831c;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            i12 = 144310272;
                        } else if (i13 != 1) {
                            if (i13 != 2) {
                                i12 = i13 != 4 ? 131072 : 26214400;
                            } else {
                                i12 = zI ? 19660800 : 131072000;
                            }
                        }
                    }
                    i11 += i12;
                }
                i10++;
            }
            String str = uu0.f20901a;
            iIntValue = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, Math.min(i11, 210239488));
        }
        ay1Var.f12542c = iIntValue;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final boolean b(xy1 xy1Var) {
        long jMin;
        boolean z10;
        int i10;
        boolean z11 = xy1Var.f22044f;
        long jRound = xy1Var.f22042d;
        float f10 = xy1Var.f22043e;
        boolean zI = i(xy1Var);
        String str = uu0.f20901a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        if (z11) {
            if (zI) {
                jMin = this.f12936k;
                z10 = true;
            } else {
                jMin = this.f12935j;
                z10 = false;
            }
        } else if (zI) {
            jMin = this.f12934i;
            z10 = true;
        } else {
            jMin = this.f12933h;
            z10 = false;
        }
        long j10 = xy1Var.f22045g;
        if (j10 != C.TIME_UNSET) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin > 0 && jRound < jMin) {
            if (!z10) {
                j02 j02Var = xy1Var.f22039a;
                ay1 ay1Var = (ay1) this.f12938n.get(j02Var);
                ay1Var.getClass();
                synchronized (ay1Var) {
                    i10 = ay1Var.f12543d;
                }
                int i11 = i10 * C.DEFAULT_BUFFER_SEGMENT_SIZE;
                ay1 ay1Var2 = (ay1) this.f12938n.get(j02Var);
                ay1Var2.getClass();
                if (i11 >= ay1Var2.f12542c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final boolean c(xy1 xy1Var) {
        int i10;
        long j10;
        boolean z10;
        boolean z11;
        int i11;
        ConcurrentHashMap concurrentHashMap = this.f12938n;
        j02 j02Var = xy1Var.f22039a;
        ay1 ay1Var = (ay1) concurrentHashMap.get(j02Var);
        ay1Var.getClass();
        ay1 ay1Var2 = (ay1) this.f12938n.get(j02Var);
        ay1Var2.getClass();
        synchronized (ay1Var2) {
            i10 = ay1Var2.f12543d;
        }
        int i12 = i10 * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        ay1 ay1Var3 = (ay1) this.f12938n.get(j02Var);
        ay1Var3.getClass();
        int i13 = ay1Var3.f12542c;
        if (j02Var.equals(j02.f15892c)) {
            return i12 < i13;
        }
        boolean zI = i(xy1Var);
        long jMin = zI ? this.f12930e : this.f12929d;
        long j11 = zI ? this.f12932g : this.f12931f;
        float f10 = xy1Var.f22043e;
        if (f10 > 1.0f) {
            jMin = Math.min(uu0.x(jMin, f10), j11);
        }
        long j12 = xy1Var.f22042d;
        if (j12 < Math.max(jMin, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= jMaxMemory) {
                long jFreeMemory = runtime.freeMemory();
                androidx.datastore.preferences.protobuf.n nVar = this.f12928c;
                synchronized (nVar) {
                    i11 = nVar.f4136d * C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
                j10 = 500000;
                if (jFreeMemory + ((long) i11) < jMaxMemory / 25) {
                    z10 = false;
                }
                z11 = zI ? i12 < i13 : !(!z10 && i12 >= i13);
                ay1Var.f12541b = z11;
                if (!z11 && zI && !z10) {
                    v71.r("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                }
                if (!ay1Var.f12541b && j12 < j10) {
                    v71.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else {
                j10 = 500000;
            }
            z10 = true;
            if (zI) {
            }
            ay1Var.f12541b = z11;
            if (!z11) {
                v71.r("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!ay1Var.f12541b) {
                v71.y("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= j11 || i12 >= i13) {
            ay1Var.f12541b = false;
        }
        return ay1Var.f12541b;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void d(j02 j02Var) {
        ConcurrentHashMap concurrentHashMap = this.f12938n;
        ay1 ay1Var = (ay1) concurrentHashMap.get(j02Var);
        if (ay1Var != null) {
            int i10 = ay1Var.f12540a - 1;
            ay1Var.f12540a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(j02Var);
                h();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f12939o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void e(j02 j02Var) {
        ConcurrentHashMap concurrentHashMap = this.f12938n;
        ay1 ay1Var = (ay1) concurrentHashMap.get(j02Var);
        if (ay1Var != null) {
            int i10 = ay1Var.f12540a - 1;
            ay1Var.f12540a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(j02Var);
                h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final u f(j02 j02Var) {
        return new ay0(this, j02Var);
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final void g(j02 j02Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f12939o;
        ps1.d0("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        this.f12939o = id2;
        ConcurrentHashMap concurrentHashMap = this.f12938n;
        ay1 ay1Var = (ay1) concurrentHashMap.get(j02Var);
        if (ay1Var == null) {
            ay1 ay1Var2 = new ay1();
            ay1Var2.f12540a = 1;
            concurrentHashMap.put(j02Var, ay1Var2);
        } else {
            ay1Var.f12540a++;
        }
        ay1 ay1Var3 = (ay1) concurrentHashMap.get(j02Var);
        ay1Var3.getClass();
        Integer num = (Integer) this.f12937m.get(j02Var.f15893a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        ay1Var3.f12542c = iIntValue;
        ay1Var3.f12541b = false;
    }

    public final void h() {
        androidx.datastore.preferences.protobuf.n nVar = this.f12928c;
        ConcurrentHashMap concurrentHashMap = this.f12938n;
        int i10 = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (nVar) {
                nVar.S0(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i10 += ((ay1) it.next()).f12542c;
            }
            nVar.S0(i10);
        }
    }

    public final boolean i(xy1 xy1Var) {
        ci ciVar = xy1Var.f22040b;
        l2 l2Var = ciVar.b(ciVar.o(xy1Var.f22041c.f19359a, this.f12927b).f20772c, this.f12926a, 0L).f15745b.f14214b;
        if (l2Var == null) {
            return false;
        }
        String scheme = l2Var.f16671a.getScheme();
        return TextUtils.isEmpty(scheme) || f12925p.contains(scheme);
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final long zzf() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.zy1
    public final boolean zzj() {
        Iterator it = this.f12938n.values().iterator();
        while (it.hasNext()) {
            if (((ay1) it.next()).f12541b) {
                return false;
            }
        }
        return true;
    }
}
