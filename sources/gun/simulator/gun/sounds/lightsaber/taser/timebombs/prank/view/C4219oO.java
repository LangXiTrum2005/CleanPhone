package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4219oO implements InterfaceC3579h4, FU {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4788a;
    public final C2446Gn b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public CU n;
    public A70 o;
    public A70 p;
    public A70 q;
    public C4619sw r;
    public C4619sw s;
    public C4619sw t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final Fc0 e = new Fc0();
    public final Ec0 f = new Ec0();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public C4219oO(Context context, PlaybackSession playbackSession) {
        this.f4788a = context.getApplicationContext();
        this.c = playbackSession;
        C2446Gn c2446Gn = new C2446Gn();
        this.b = c2446Gn;
        c2446Gn.d = this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void a(Ih0 ih0) {
        A70 a70 = this.o;
        if (a70 != null) {
            C4619sw c4619sw = (C4619sw) a70.c;
            if (c4619sw.r == -1) {
                C4531rw c4531rwA = c4619sw.a();
                c4531rwA.p = ih0.f3234a;
                c4531rwA.q = ih0.b;
                this.o = new A70(new C4619sw(c4531rwA), a70.b, (String) a70.d, 1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0417  */
    /* JADX WARN: Code duplicated, block: B:249:0x0462  */
    /* JADX WARN: Code duplicated, block: B:250:0x0464  */
    /* JADX WARN: Code duplicated, block: B:258:0x047e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0480  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void c(LU lu, C3491g4 c3491g4) {
        int i;
        boolean z;
        C4131nO c4131nO;
        int i2;
        int i3;
        int i4;
        int i5;
        C4619sw c4619sw;
        int i6;
        int i7;
        DrmInitData drmInitData;
        int i8;
        if (((C3125bv) c3491g4.b).f4194a.size() == 0) {
            return;
        }
        for (int i9 = 0; i9 < ((C3125bv) c3491g4.b).f4194a.size(); i9++) {
            int iA = ((C3125bv) c3491g4.b).a(i9);
            C3403f4 c3403f4 = (C3403f4) ((SparseArray) c3491g4.c).get(iA);
            c3403f4.getClass();
            if (iA == 0) {
                C2446Gn c2446Gn = this.b;
                synchronized (c2446Gn) {
                    try {
                        c2446Gn.d.getClass();
                        Gc0 gc0 = c2446Gn.e;
                        c2446Gn.e = c3403f4.b;
                        Iterator it = c2446Gn.c.values().iterator();
                        while (it.hasNext()) {
                            C2420Fn c2420Fn = (C2420Fn) it.next();
                            if (!c2420Fn.b(gc0, c2446Gn.e) || c2420Fn.a(c3403f4)) {
                                it.remove();
                                if (c2420Fn.e) {
                                    if (c2420Fn.f3087a.equals(c2446Gn.f)) {
                                        c2446Gn.f = null;
                                    }
                                    ((C4219oO) c2446Gn.d).m(c3403f4, c2420Fn.f3087a);
                                }
                            }
                        }
                        c2446Gn.d(c3403f4);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA == 11) {
                this.b.f(c3403f4, this.k);
            } else {
                this.b.e(c3403f4);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c3491g4.s(0)) {
            C3403f4 c3403f5 = (C3403f4) ((SparseArray) c3491g4.c).get(0);
            c3403f5.getClass();
            if (this.j != null) {
                l(c3403f5.b, c3403f5.d);
            }
        }
        if (c3491g4.s(2) && this.j != null) {
            C2736Rs c2736Rs = (C2736Rs) lu;
            c2736Rs.Q();
            C5086yC c5086yCListIterator = c2736Rs.h0.i.d.f5285a.listIterator(0);
            loop2: while (true) {
                if (!c5086yCListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                C5029xd0 c5029xd0 = (C5029xd0) c5086yCListIterator.next();
                for (int i10 = 0; i10 < c5029xd0.f5234a; i10++) {
                    if (c5029xd0.e[i10] && (drmInitData = c5029xd0.b.d[i10].o) != null) {
                        break loop2;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.j;
                int i11 = Ug0.f3833a;
                PlaybackMetrics.Builder builderG = MM.g(builder);
                int i12 = 0;
                while (true) {
                    if (i12 >= drmInitData.schemeDataCount) {
                        i8 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.d(i12).uuid;
                    if (uuid.equals(AbstractC4147nc.d)) {
                        i8 = 3;
                        break;
                    } else if (uuid.equals(AbstractC4147nc.e)) {
                        i8 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC4147nc.c)) {
                            i8 = 6;
                            break;
                        }
                        i12++;
                    }
                }
                builderG.setDrmType(i8);
            }
        }
        if (c3491g4.s(1011)) {
            this.z++;
        }
        CU cu = this.n;
        if (cu == null) {
            i2 = 2;
        } else {
            boolean z2 = this.v == 4;
            int i13 = cu.f2923a;
            if (i13 == 1001) {
                c4131nO = new C4131nO(20, 0);
            } else {
                if (cu instanceof C2321Bs) {
                    C2321Bs c2321Bs = (C2321Bs) cu;
                    z = c2321Bs.h == 1;
                    i = c2321Bs.l;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = cu.getCause();
                cause.getClass();
                int i14 = 27;
                if (!(cause instanceof IOException)) {
                    int i15 = 24;
                    if (z && (i == 0 || i == 1)) {
                        c4131nO = new C4131nO(35, 0);
                    } else if (z && i == 3) {
                        c4131nO = new C4131nO(15, 0);
                    } else if (z && i == 2) {
                        c4131nO = new C4131nO(23, 0);
                    } else if (cause instanceof C4921wN) {
                        c4131nO = new C4131nO(13, Ug0.v(((C4921wN) cause).d));
                    } else if (cause instanceof C4569sN) {
                        c4131nO = new C4131nO(14, Ug0.v(((C4569sN) cause).f4976a));
                    } else if (cause instanceof OutOfMemoryError) {
                        c4131nO = new C4131nO(14, 0);
                    } else if (cause instanceof C4462r7) {
                        c4131nO = new C4131nO(17, ((C4462r7) cause).f4917a);
                    } else if (cause instanceof C4638t7) {
                        c4131nO = new C4131nO(18, ((C4638t7) cause).f5017a);
                    } else if (Ug0.f3833a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                        c4131nO = new C4131nO(22, 0);
                    } else {
                        int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                        switch (Ug0.u(errorCode)) {
                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                break;
                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                i15 = 28;
                                break;
                            case 6004:
                                i15 = 25;
                                break;
                            case 6005:
                                i15 = 26;
                                break;
                            default:
                                i15 = 27;
                                break;
                        }
                        c4131nO = new C4131nO(i15, errorCode);
                    }
                } else if (cause instanceof SA) {
                    c4131nO = new C4131nO(5, ((SA) cause).d);
                } else if ((cause instanceof RA) || (cause instanceof KT)) {
                    c4131nO = new C4131nO(z2 ? 10 : 11, 0);
                } else {
                    boolean z3 = cause instanceof QA;
                    if (z3 || (cause instanceof C3540gf0)) {
                        if (BR.d(this.f4788a).e() == 1) {
                            c4131nO = new C4131nO(3, 0);
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                c4131nO = new C4131nO(6, 0);
                            } else if (cause2 instanceof SocketTimeoutException) {
                                c4131nO = new C4131nO(7, 0);
                            } else {
                                c4131nO = (z3 && ((QA) cause).c == 1) ? new C4131nO(4, 0) : new C4131nO(8, 0);
                            }
                        }
                    } else if (i13 == 1002) {
                        c4131nO = new C4131nO(21, 0);
                    } else if (cause instanceof C2863Wp) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        int i16 = Ug0.f3833a;
                        if (i16 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                            int iV = Ug0.v(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            switch (Ug0.u(iV)) {
                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                    i14 = 24;
                                    break;
                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                    i14 = 28;
                                    break;
                                case 6004:
                                    i14 = 25;
                                    break;
                                case 6005:
                                    i14 = 26;
                                    break;
                            }
                            c4131nO = new C4131nO(i14, iV);
                        } else if (i16 >= 23 && YB.z(cause3)) {
                            c4131nO = new C4131nO(27, 0);
                        } else if (i16 >= 18 && (cause3 instanceof NotProvisionedException)) {
                            c4131nO = new C4131nO(24, 0);
                        } else if (i16 >= 18 && (cause3 instanceof DeniedByServerException)) {
                            c4131nO = new C4131nO(29, 0);
                        } else if (cause3 instanceof C3278dg0) {
                            c4131nO = new C4131nO(23, 0);
                        } else {
                            c4131nO = cause3 instanceof C2756Sm ? new C4131nO(28, 0) : new C4131nO(30, 0);
                        }
                    } else if ((cause instanceof C2659Ot) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        c4131nO = (Ug0.f3833a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new C4131nO(32, 0) : new C4131nO(31, 0);
                    } else {
                        c4131nO = new C4131nO(9, 0);
                    }
                }
                this.c.reportPlaybackErrorEvent(MM.b().setTimeSinceCreatedMillis(jElapsedRealtime - this.d).setErrorCode(c4131nO.f4741a).setSubErrorCode(c4131nO.b).setException(cu).build());
                this.A = true;
                this.n = null;
                i2 = 2;
            }
            this.c.reportPlaybackErrorEvent(MM.b().setTimeSinceCreatedMillis(jElapsedRealtime - this.d).setErrorCode(c4131nO.f4741a).setSubErrorCode(c4131nO.b).setException(cu).build());
            this.A = true;
            this.n = null;
            i2 = 2;
        }
        if (c3491g4.s(i2)) {
            C2736Rs c2736Rs2 = (C2736Rs) lu;
            c2736Rs2.Q();
            C5117yd0 c5117yd0 = c2736Rs2.h0.i.d;
            boolean zA = c5117yd0.a(i2);
            boolean zA2 = c5117yd0.a(1);
            boolean zA3 = c5117yd0.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    i3 = 10;
                    c4619sw = null;
                } else {
                    c4619sw = null;
                    if (Ug0.a(this.r, null)) {
                        i3 = 10;
                    } else {
                        int i17 = this.r == null ? 1 : 0;
                        this.r = null;
                        i3 = 10;
                        n(1, jElapsedRealtime, null, i17);
                    }
                    if (!zA2 && !Ug0.a(this.s, c4619sw)) {
                        if (this.s == null) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        this.s = c4619sw;
                        n(0, jElapsedRealtime, c4619sw, i7);
                    }
                    if (!zA3 && !Ug0.a(this.t, c4619sw)) {
                        if (this.t == null) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.t = c4619sw;
                        n(2, jElapsedRealtime, c4619sw, i6);
                    }
                }
                if (!zA2) {
                    if (this.s == null) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    this.s = c4619sw;
                    n(0, jElapsedRealtime, c4619sw, i7);
                }
                if (!zA3) {
                    if (this.t == null) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    this.t = c4619sw;
                    n(2, jElapsedRealtime, c4619sw, i6);
                }
            } else {
                i3 = 10;
            }
        } else {
            i3 = 10;
        }
        if (j(this.o)) {
            A70 a70 = this.o;
            C4619sw c4619sw2 = (C4619sw) a70.c;
            if (c4619sw2.r != -1) {
                int i18 = a70.b;
                if (!Ug0.a(this.r, c4619sw2)) {
                    int i19 = (this.r == null && i18 == 0) ? 1 : i18;
                    this.r = c4619sw2;
                    n(1, jElapsedRealtime, c4619sw2, i19);
                }
                this.o = null;
            }
        }
        if (j(this.p)) {
            A70 a71 = this.p;
            C4619sw c4619sw3 = (C4619sw) a71.c;
            int i20 = a71.b;
            if (!Ug0.a(this.s, c4619sw3)) {
                int i21 = (this.s == null && i20 == 0) ? 1 : i20;
                this.s = c4619sw3;
                n(0, jElapsedRealtime, c4619sw3, i21);
            }
            this.p = null;
        }
        if (j(this.q)) {
            A70 a72 = this.q;
            C4619sw c4619sw4 = (C4619sw) a72.c;
            int i22 = a72.b;
            if (!Ug0.a(this.t, c4619sw4)) {
                int i23 = (this.t == null && i22 == 0) ? 1 : i22;
                this.t = c4619sw4;
                n(2, jElapsedRealtime, c4619sw4, i23);
            }
            this.q = null;
        }
        switch (BR.d(this.f4788a).e()) {
            case 0:
                i4 = 0;
                break;
            case 1:
                i4 = 9;
                break;
            case 2:
                i4 = 2;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
            case 8:
            default:
                i4 = 1;
                break;
            case 7:
                i4 = 3;
                break;
            case 9:
                i4 = 8;
                break;
            case 10:
                i4 = 7;
                break;
        }
        if (i4 != this.m) {
            this.m = i4;
            this.c.reportNetworkEvent(AbstractC4043mO.c().setNetworkType(i4).setTimeSinceCreatedMillis(jElapsedRealtime - this.d).build());
        }
        C2736Rs c2736Rs3 = (C2736Rs) lu;
        if (c2736Rs3.w() != 2) {
            this.u = false;
        }
        c2736Rs3.Q();
        if (c2736Rs3.h0.f == null) {
            this.w = false;
        } else if (c3491g4.s(i3)) {
            this.w = true;
        }
        int iW = c2736Rs3.w();
        if (this.u) {
            i5 = 5;
        } else if (this.w) {
            i5 = 13;
        } else if (iW == 4) {
            i5 = 11;
        } else if (iW == 2) {
            int i24 = this.l;
            if (i24 == 0 || i24 == 2) {
                i5 = 2;
            } else if (c2736Rs3.v()) {
                c2736Rs3.Q();
                i5 = c2736Rs3.h0.m != 0 ? 10 : 6;
            } else {
                i5 = 7;
            }
        } else if (iW != 3) {
            i5 = (iW != 1 || this.l == 0) ? this.l : 12;
        } else if (c2736Rs3.v()) {
            c2736Rs3.Q();
            i5 = c2736Rs3.h0.m != 0 ? 9 : 3;
        } else {
            i5 = 4;
        }
        if (this.l != i5) {
            this.l = i5;
            this.A = true;
            this.c.reportPlaybackStateEvent(MM.i().setState(this.l).setTimeSinceCreatedMillis(jElapsedRealtime - this.d).build());
        }
        if (c3491g4.s(GL20.GL_FRONT)) {
            C2446Gn c2446Gn2 = this.b;
            C3403f4 c3403f6 = (C3403f4) ((SparseArray) c3491g4.c).get(GL20.GL_FRONT);
            c3403f6.getClass();
            c2446Gn2.a(c3403f6);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void d(C3779jO c3779jO) {
        this.v = c3779jO.f4552a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void e(C3403f4 c3403f4, C3779jO c3779jO) {
        if (c3403f4.d == null) {
            return;
        }
        C4619sw c4619sw = c3779jO.c;
        c4619sw.getClass();
        C5186zO c5186zO = c3403f4.d;
        c5186zO.getClass();
        A70 a70 = new A70(c4619sw, c3779jO.d, this.b.c(c3403f4.b, c5186zO), 1);
        int i = c3779jO.b;
        if (i != 0) {
            if (i == 1) {
                this.p = a70;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.q = a70;
                return;
            }
        }
        this.o = a70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void f(C3403f4 c3403f4, int i, long j) {
        C5186zO c5186zO = c3403f4.d;
        if (c5186zO != null) {
            String strC = this.b.c(c3403f4.b, c5186zO);
            HashMap map = this.h;
            Long l = (Long) map.get(strC);
            HashMap map2 = this.g;
            Long l2 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void g(CU cu) {
        this.n = cu;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void h(C2599Ml c2599Ml) {
        this.x += c2599Ml.g;
        this.y += c2599Ml.e;
    }

    public final boolean j(A70 a70) {
        String str;
        if (a70 != null) {
            String str2 = (String) a70.d;
            C2446Gn c2446Gn = this.b;
            synchronized (c2446Gn) {
                str = c2446Gn.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void l(Gc0 gc0, C5186zO c5186zO) {
        int iB;
        PlaybackMetrics.Builder builder = this.j;
        if (c5186zO == null || (iB = gc0.b(c5186zO.f4977a)) == -1) {
            return;
        }
        Ec0 ec0 = this.f;
        int i = 0;
        gc0.g(iB, ec0, false);
        int i2 = ec0.c;
        Fc0 fc0 = this.e;
        gc0.o(i2, fc0);
        C3341eO c3341eO = fc0.c.b;
        if (c3341eO != null) {
            int iG = Ug0.G(c3341eO.f4269a, c3341eO.b);
            if (iG == 0) {
                i = 3;
            } else if (iG != 1) {
                i = iG != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (fc0.n != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && !fc0.l && !fc0.i && !fc0.a()) {
            builder.setMediaDurationMillis(Ug0.W(fc0.n));
        }
        builder.setPlaybackType(fc0.a() ? 2 : 1);
        this.A = true;
    }

    public final void m(C3403f4 c3403f4, String str) {
        C5186zO c5186zO = c3403f4.d;
        if ((c5186zO == null || !c5186zO.a()) && str.equals(this.i)) {
            k();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void n(int i, long j, C4619sw c4619sw, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = MM.j(i).setTimeSinceCreatedMillis(j - this.d);
        if (c4619sw != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c4619sw.k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c4619sw.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c4619sw.i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c4619sw.h;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c4619sw.q;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c4619sw.r;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c4619sw.y;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c4619sw.z;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c4619sw.c;
            if (str4 != null) {
                int i9 = Ug0.f3833a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c4619sw.s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final void onPositionDiscontinuity(int i) {
        if (i == 1) {
            this.u = true;
        }
        this.k = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void b(C3693iO c3693iO) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3579h4
    public final /* synthetic */ void i(int i) {
    }
}
