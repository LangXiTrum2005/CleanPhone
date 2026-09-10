package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h02 implements a02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15019a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f02 f15021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f15022d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f15029k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public dy1 f15031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f81 f15032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f81 f15033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f81 f15034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g22 f15035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g22 f15036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g22 f15037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15043z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f15020b = rb0.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ih f15024f = new ih();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ug f15025g = new ug();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f15027i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f15026h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15023e = SystemClock.elapsedRealtime();
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15030m = 0;

    public h02(Context context, PlaybackSession playbackSession) {
        this.f15019a = context.getApplicationContext();
        this.f15022d = playbackSession;
        f02 f02Var = new f02();
        this.f15021c = f02Var;
        f02Var.f14152d = this;
    }

    public static h02 p(Context context) {
        MediaMetricsManager mediaMetricsManagerC = q1.d.c(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerC == null) {
            return null;
        }
        return new h02(context, mediaMetricsManagerC.createPlaybackSession());
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void b(lt ltVar) {
        f81 f81Var = this.f15032o;
        if (f81Var != null) {
            g22 g22Var = (g22) f81Var.f14317b;
            if (g22Var.f14686w == -1) {
                i12 i12Var = new i12(g22Var);
                i12Var.f15518u = ltVar.f17122a;
                i12Var.f15519v = ltVar.f17123b;
                this.f15032o = new f81(10, new g22(i12Var), (String) f81Var.f14318c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void c(zz1 zz1Var, int i10, long j10) {
        r32 r32Var = zz1Var.f22778d;
        if (r32Var != null) {
            String strA = this.f15021c.a(zz1Var.f22776b, r32Var);
            HashMap map = this.f15027i;
            Long l = (Long) map.get(strA);
            HashMap map2 = this.f15026h;
            Long l10 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l == null ? 0L : l.longValue()) + j10));
            map2.put(strA, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) i10)));
        }
    }

    public final void d(int i10, long j10, g22 g22Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f15023e);
        if (g22Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = g22Var.f14677n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = g22Var.f14678o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = g22Var.f14675k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = g22Var.f14674j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = g22Var.f14685v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = g22Var.f14686w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = g22Var.G;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = g22Var.I;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = g22Var.f14668d;
            if (str4 != null) {
                String str5 = uu0.f20901a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = g22Var.f14689z;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f15043z = true;
        this.f15020b.execute(new gm0(24, this, timeSinceCreatedMillis.build()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    public final void f(ci ciVar, r32 r32Var) {
        int iE;
        Matcher matcher;
        String strGroup;
        int i10;
        PlaybackMetrics.Builder builder = this.f15029k;
        if (r32Var == null || (iE = ciVar.e(r32Var.f19359a)) == -1) {
            return;
        }
        ug ugVar = this.f15025g;
        int i11 = 0;
        ciVar.d(iE, ugVar, false);
        int i12 = ugVar.f20772c;
        ih ihVar = this.f15024f;
        ciVar.b(i12, ihVar, 0L);
        l2 l2Var = ihVar.f15745b.f14214b;
        if (l2Var != null) {
            Uri uri = l2Var.f16671a;
            String str = uu0.f20901a;
            String scheme = uri.getScheme();
            if (scheme == null || !(x10.y("rtsp", scheme) || x10.y("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        switch (x10.e(lastPathSegment.substring(iLastIndexOf + 1))) {
                            case "ism":
                                i10 = 1;
                                break;
                            case "mpd":
                                i10 = 0;
                                break;
                            case "isml":
                                i10 = 1;
                                break;
                            case "m3u8":
                                i10 = 2;
                                break;
                            default:
                                i10 = 4;
                                break;
                        }
                        if (i10 == 4) {
                            Pattern pattern = uu0.f20903c;
                            String path = uri.getPath();
                            path.getClass();
                            matcher = pattern.matcher(path);
                            if (matcher.matches()) {
                                strGroup = matcher.group(2);
                                if (strGroup == null) {
                                    i11 = 1;
                                } else if (!strGroup.contains("format=mpd-time-csf")) {
                                    if (strGroup.contains("format=m3u8-aapl")) {
                                        i11 = 2;
                                    } else {
                                        i11 = 1;
                                    }
                                }
                            } else {
                                i11 = 4;
                            }
                        } else {
                            i11 = i10;
                        }
                    } else {
                        Pattern pattern2 = uu0.f20903c;
                        String path2 = uri.getPath();
                        path2.getClass();
                        matcher = pattern2.matcher(path2);
                        if (matcher.matches()) {
                            strGroup = matcher.group(2);
                            if (strGroup == null) {
                                i11 = 1;
                            } else if (!strGroup.contains("format=mpd-time-csf")) {
                                if (strGroup.contains("format=m3u8-aapl")) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                }
                            }
                        } else {
                            i11 = 4;
                        }
                    }
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
            if (i11 == 0) {
                i11 = 3;
            } else if (i11 != 1) {
                i11 = i11 != 2 ? 1 : 4;
            } else {
                i11 = 5;
            }
        }
        builder.setStreamType(i11);
        long j10 = ihVar.f15753j;
        if (j10 != C.TIME_UNSET && !ihVar.f15752i && !ihVar.f15750g && !ihVar.b()) {
            builder.setMediaDurationMillis(uu0.s(j10));
        }
        builder.setPlaybackType(true != ihVar.b() ? 1 : 2);
        this.f15043z = true;
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void g(int i10) {
        if (i10 == 1) {
            this.f15038u = true;
        }
    }

    public final void i() {
        PlaybackMetrics.Builder builder = this.f15029k;
        if (builder != null && this.f15043z) {
            builder.setAudioUnderrunCount(this.f15042y);
            this.f15029k.setVideoFramesDropped(this.f15040w);
            this.f15029k.setVideoFramesPlayed(this.f15041x);
            Long l = (Long) this.f15026h.get(this.f15028j);
            this.f15029k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l10 = (Long) this.f15027i.get(this.f15028j);
            this.f15029k.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f15029k.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f15020b.execute(new gm0(25, this, this.f15029k.build()));
        }
        this.f15029k = null;
        this.f15028j = null;
        this.f15042y = 0;
        this.f15040w = 0;
        this.f15041x = 0;
        this.f15035r = null;
        this.f15036s = null;
        this.f15037t = null;
        this.f15043z = false;
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void j(zz1 zz1Var, o32 o32Var) {
        r32 r32Var = zz1Var.f22778d;
        if (r32Var == null) {
            return;
        }
        g22 g22Var = o32Var.f18113b;
        g22Var.getClass();
        f81 f81Var = new f81(10, g22Var, this.f15021c.a(zz1Var.f22776b, r32Var));
        int i10 = o32Var.f18112a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f15033p = f81Var;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f15034q = f81Var;
                return;
            }
        }
        this.f15032o = f81Var;
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void k(dy1 dy1Var) {
        this.f15031n = dy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x020a A[PHI: r5
  0x020a: PHI (r5v49 int) = (r5v31 int), (r5v80 int) binds: [B:208:0x02f7, B:135:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x020d A[PHI: r5
  0x020d: PHI (r5v48 int) = (r5v31 int), (r5v80 int) binds: [B:208:0x02f7, B:135:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x0210 A[PHI: r5
  0x0210: PHI (r5v47 int) = (r5v31 int), (r5v80 int) binds: [B:208:0x02f7, B:135:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0213 A[PHI: r5
  0x0213: PHI (r5v46 int) = (r5v31 int), (r5v80 int) binds: [B:208:0x02f7, B:135:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x0233  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262 A[PHI: r8
  0x0262: PHI (r8v20 int) = (r8v19 int), (r8v24 int), (r8v24 int) binds: [B:197:0x02ce, B:159:0x0254, B:161:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:187:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:196:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:204:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:219:0x0349  */
    @Override // com.google.android.gms.internal.ads.a02
    public final void m(mu1 mu1Var, iw0 iw0Var) {
        int i10;
        int i11;
        int i12;
        h02 h02Var;
        boolean z10;
        int i13;
        int i14;
        int errorCode;
        g02 g02Var;
        int i15;
        int i16;
        if (((z02) iw0Var.f15864b).f22445a.size() == 0) {
            return;
        }
        int iK = 0;
        for (int i17 = 0; i17 < ((z02) iw0Var.f15864b).f22445a.size(); i17++) {
            int iA = ((z02) iw0Var.f15864b).a(i17);
            zz1 zz1Var = (zz1) ((SparseArray) iw0Var.f15865c).get(iA);
            zz1Var.getClass();
            if (iA == 0) {
                f02 f02Var = this.f15021c;
                synchronized (f02Var) {
                    try {
                        if (f02Var.f14152d == null) {
                            throw null;
                        }
                        ci ciVar = f02Var.f14153e;
                        f02Var.f14153e = zz1Var.f22776b;
                        Iterator it = f02Var.f14151c.values().iterator();
                        while (it.hasNext()) {
                            e02 e02Var = (e02) it.next();
                            if (!e02Var.a(ciVar, f02Var.f14153e) || e02Var.b(zz1Var)) {
                                it.remove();
                                if (e02Var.f13794a.equals(f02Var.f14154f)) {
                                    f02Var.d(e02Var);
                                }
                                if (e02Var.f13798e) {
                                    f02Var.f14152d.s(zz1Var, e02Var.f13794a);
                                }
                            }
                        }
                        f02Var.c(zz1Var);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (iA == 11) {
                f02 f02Var2 = this.f15021c;
                synchronized (f02Var2) {
                    try {
                        if (f02Var2.f14152d == null) {
                            throw null;
                        }
                        Iterator it2 = f02Var2.f14151c.values().iterator();
                        while (it2.hasNext()) {
                            e02 e02Var2 = (e02) it2.next();
                            if (e02Var2.b(zz1Var)) {
                                it2.remove();
                                if (e02Var2.f13794a.equals(f02Var2.f14154f)) {
                                    f02Var2.d(e02Var2);
                                }
                                if (e02Var2.f13798e) {
                                    f02Var2.f14152d.s(zz1Var, e02Var2.f13794a);
                                }
                            }
                        }
                        f02Var2.c(zz1Var);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                this.f15021c.b(zz1Var);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (iw0Var.q(0)) {
            zz1 zz1Var2 = (zz1) ((SparseArray) iw0Var.f15865c).get(0);
            zz1Var2.getClass();
            if (this.f15029k != null) {
                f(zz1Var2.f22776b, zz1Var2.f22778d);
            }
        }
        if (iw0Var.q(2) && this.f15029k != null) {
            ca1 ca1Var = mu1Var.N0().f22330a;
            int size = ca1Var.size();
            int i18 = 0;
            loop3: while (true) {
                if (i18 >= size) {
                    g02Var = null;
                    break;
                }
                co coVar = (co) ca1Var.get(i18);
                int i19 = 0;
                while (true) {
                    i16 = i18 + 1;
                    if (i19 < coVar.f13215a) {
                        if (coVar.f13219e[i19] && (g02Var = coVar.f13216b.f17832d[i19].f14682s) != null) {
                            break loop3;
                        } else {
                            i19++;
                        }
                    }
                }
                i18 = i16;
            }
            if (g02Var != null) {
                PlaybackMetrics.Builder builder = this.f15029k;
                String str = uu0.f20901a;
                int i20 = 0;
                while (true) {
                    if (i20 >= g02Var.f14648d) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = g02Var.f14645a[i20].f12968b;
                    if (uuid.equals(v01.f20991d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(v01.f20992e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(v01.f20990c)) {
                            i15 = 6;
                            break;
                        }
                        i20++;
                    }
                }
                builder.setDrmType(i15);
            }
        }
        if (iw0Var.q(1011)) {
            this.f15042y++;
        }
        dy1 dy1Var = this.f15031n;
        if (dy1Var != null) {
            Context context = this.f15019a;
            int i21 = dy1Var.f13758a;
            int i22 = 26;
            if (i21 == 1001) {
                i14 = 20;
            } else {
                boolean z11 = dy1Var.f13760c == 1;
                int i23 = dy1Var.f13764g;
                Throwable cause = dy1Var.getCause();
                cause.getClass();
                int i24 = 24;
                if (cause instanceof IOException) {
                    if (cause instanceof su1) {
                        iK = ((su1) cause).f20053c;
                        i14 = 5;
                    } else {
                        if (cause instanceof ab) {
                            i14 = 11;
                        } else {
                            boolean z12 = cause instanceof ot1;
                            if (z12 || (cause instanceof px1)) {
                                if (wo0.a(context).b() == 1) {
                                    i14 = 3;
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i14 = 6;
                                    } else if (cause2 instanceof SocketTimeoutException) {
                                        i14 = 7;
                                    } else {
                                        i14 = (z12 && ((ot1) cause).f18358b == 1) ? 4 : 8;
                                    }
                                }
                            } else if (i21 == 1002) {
                                i14 = 21;
                            } else if (cause instanceof a22) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    errorCode = uu0.k(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (uu0.g(errorCode)) {
                                        case 6002:
                                            break;
                                        case 6003:
                                            i24 = 28;
                                            break;
                                        case 6004:
                                            i24 = 25;
                                            break;
                                        case 6005:
                                            i24 = 26;
                                            break;
                                        default:
                                            i24 = 27;
                                            break;
                                    }
                                    iK = errorCode;
                                    i14 = i24;
                                } else if (cause3 instanceof MediaDrmResetException) {
                                    i14 = 27;
                                } else if (cause3 instanceof NotProvisionedException) {
                                    i14 = 24;
                                } else if (cause3 instanceof DeniedByServerException) {
                                    i14 = 29;
                                } else if (cause3 instanceof d22) {
                                    i14 = 23;
                                } else {
                                    i14 = 30;
                                }
                            } else if ((cause instanceof vr1) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                i13 = 31;
                                if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                    i14 = 32;
                                } else {
                                    i14 = i13;
                                }
                            } else {
                                i14 = 9;
                            }
                        }
                        iK = 0;
                    }
                } else if (z11) {
                    i14 = 35;
                    if (i23 == 0 || i23 == 1) {
                        iK = 0;
                    } else {
                        if (!z11 && i23 == 3) {
                            i14 = 15;
                        } else if (!z11 && i23 == 2) {
                            i14 = 23;
                        } else if (cause instanceof q22) {
                            iK = uu0.k(((q22) cause).f18902c);
                            i14 = 13;
                        } else {
                            i13 = 14;
                            if (cause instanceof o22) {
                                iK = ((o22) cause).f18092a;
                                i14 = 14;
                            } else if (cause instanceof OutOfMemoryError) {
                                i14 = i13;
                            } else if (cause instanceof b12) {
                                i14 = 17;
                            } else if (cause instanceof c12) {
                                iK = ((c12) cause).f12990a;
                                i14 = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (uu0.g(errorCode)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i24 = 28;
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                    default:
                                        i24 = 27;
                                        break;
                                }
                                iK = errorCode;
                                i14 = i24;
                            } else {
                                i14 = 22;
                            }
                        }
                        iK = 0;
                    }
                } else if (!z11) {
                    if (!z11) {
                    }
                    if (cause instanceof q22) {
                        iK = uu0.k(((q22) cause).f18902c);
                        i14 = 13;
                    } else {
                        i13 = 14;
                        if (cause instanceof o22) {
                            iK = ((o22) cause).f18092a;
                            i14 = 14;
                        } else {
                            if (cause instanceof OutOfMemoryError) {
                                i14 = i13;
                            } else if (cause instanceof b12) {
                                i14 = 17;
                            } else if (cause instanceof c12) {
                                iK = ((c12) cause).f12990a;
                                i14 = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (uu0.g(errorCode)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i24 = 28;
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                    default:
                                        i24 = 27;
                                        break;
                                }
                                iK = errorCode;
                                i14 = i24;
                            } else {
                                i14 = 22;
                            }
                            iK = 0;
                        }
                    }
                } else {
                    if (!z11) {
                    }
                    if (cause instanceof q22) {
                        iK = uu0.k(((q22) cause).f18902c);
                        i14 = 13;
                    } else {
                        i13 = 14;
                        if (cause instanceof o22) {
                            iK = ((o22) cause).f18092a;
                            i14 = 14;
                        } else {
                            if (cause instanceof OutOfMemoryError) {
                                i14 = i13;
                            } else if (cause instanceof b12) {
                                i14 = 17;
                            } else if (cause instanceof c12) {
                                iK = ((c12) cause).f12990a;
                                i14 = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (uu0.g(errorCode)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i24 = 28;
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                    default:
                                        i24 = 27;
                                        break;
                                }
                                iK = errorCode;
                                i14 = i24;
                            } else {
                                i14 = 22;
                            }
                            iK = 0;
                        }
                    }
                }
            }
            this.f15020b.execute(new gm0(i22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f15023e).setErrorCode(i14).setSubErrorCode(iK).setException(dy1Var).build()));
            this.f15043z = true;
            this.f15031n = null;
        }
        if (iw0Var.q(2)) {
            yo yoVarN0 = mu1Var.N0();
            boolean zA = yoVarN0.a(2);
            boolean zA2 = yoVarN0.a(1);
            boolean zA3 = yoVarN0.a(3);
            if (zA || zA2) {
                z10 = zA3;
            } else if (zA3) {
                z10 = true;
            } else {
                i10 = 4;
            }
            if (zA || Objects.equals(this.f15035r, null)) {
                i10 = 4;
            } else {
                int i25 = this.f15035r == null ? 1 : 0;
                this.f15035r = null;
                i10 = 4;
                d(1, jElapsedRealtime, null, i25);
            }
            if (!zA2 && !Objects.equals(this.f15036s, null)) {
                int i26 = this.f15036s == null ? 1 : 0;
                this.f15036s = null;
                d(0, jElapsedRealtime, null, i26);
            }
            if (!z10 && !Objects.equals(this.f15037t, null)) {
                int i27 = this.f15037t == null ? 1 : 0;
                this.f15037t = null;
                d(2, jElapsedRealtime, null, i27);
            }
        } else {
            i10 = 4;
        }
        if (y(this.f15032o)) {
            g22 g22Var = (g22) this.f15032o.f14317b;
            if (g22Var.f14686w != -1) {
                if (!Objects.equals(this.f15035r, g22Var)) {
                    int i28 = this.f15035r == null ? 1 : 0;
                    this.f15035r = g22Var;
                    d(1, jElapsedRealtime, g22Var, i28);
                }
                this.f15032o = 0;
            }
        }
        if (y(this.f15033p)) {
            g22 g22Var2 = (g22) this.f15033p.f14317b;
            if (!Objects.equals(this.f15036s, g22Var2)) {
                int i29 = this.f15036s == null ? 1 : 0;
                this.f15036s = g22Var2;
                d(0, jElapsedRealtime, g22Var2, i29);
            }
            this.f15033p = r4;
        }
        if (y(this.f15034q)) {
            g22 g22Var3 = (g22) this.f15034q.f14317b;
            if (!Objects.equals(this.f15037t, g22Var3)) {
                int i30 = this.f15037t == null ? 1 : 0;
                this.f15037t = g22Var3;
                d(2, jElapsedRealtime, g22Var3, i30);
            }
            this.f15034q = r4;
        }
        switch (wo0.a(this.f15019a).b()) {
            case 0:
                i11 = 0;
                break;
            case 1:
                i11 = 9;
                break;
            case 2:
                i11 = 2;
                break;
            case 3:
                i11 = i10;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
            case 8:
            default:
                i11 = 1;
                break;
            case 7:
                i11 = 3;
                break;
            case 9:
                i11 = 8;
                break;
            case 10:
                i11 = 7;
                break;
        }
        if (i11 != this.f15030m) {
            this.f15030m = i11;
            this.f15020b.execute(new gm0(22, this, new NetworkEvent.Builder().setNetworkType(i11).setTimeSinceCreatedMillis(jElapsedRealtime - this.f15023e).build()));
        }
        if (mu1Var.J0() != 2) {
            this.f15038u = false;
        }
        xz1 xz1Var = (xz1) mu1Var;
        xz1Var.f22051d.b();
        ry1 ry1Var = xz1Var.f22050c;
        ry1Var.l0();
        if (ry1Var.f19708a0.f18043f == null) {
            this.f15039v = false;
        } else if (iw0Var.q(10)) {
            this.f15039v = true;
        }
        int iJ0 = mu1Var.J0();
        if (this.f15038u) {
            i12 = 5;
        } else if (this.f15039v) {
            i12 = 13;
        } else if (iJ0 == i10) {
            i12 = 11;
        } else {
            i12 = 12;
            if (iJ0 == 2) {
                int i31 = this.l;
                if (i31 == 0 || i31 == 2 || i31 == 12) {
                    i12 = 2;
                } else if (mu1Var.L0()) {
                    i12 = mu1Var.K0() != 0 ? 10 : 6;
                } else {
                    i12 = 7;
                }
            } else if (iJ0 == 3) {
                i12 = mu1Var.L0() ? mu1Var.K0() != 0 ? 9 : 3 : i10;
            } else if (iJ0 != 1 || this.l == 0) {
                i12 = this.l;
            }
        }
        if (this.l != i12) {
            this.l = i12;
            this.f15043z = true;
            this.f15020b.execute(new gm0(23, this, new PlaybackStateEvent.Builder().setState(this.l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f15023e).build()));
        }
        if (iw0Var.q(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            f02 f02Var3 = this.f15021c;
            zz1 zz1Var3 = (zz1) ((SparseArray) iw0Var.f15865c).get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
            zz1Var3.getClass();
            synchronized (f02Var3) {
                try {
                    String str2 = f02Var3.f14154f;
                    if (str2 != null) {
                        e02 e02Var3 = (e02) f02Var3.f14151c.get(str2);
                        if (e02Var3 == null) {
                            throw r4;
                        }
                        f02Var3.d(e02Var3);
                    }
                    Iterator it3 = f02Var3.f14151c.values().iterator();
                    while (it3.hasNext()) {
                        e02 e02Var4 = (e02) it3.next();
                        it3.remove();
                        if (e02Var4.f13798e && (h02Var = f02Var3.f14152d) != null) {
                            h02Var.s(zz1Var3, e02Var4.f13794a);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void o(xx1 xx1Var) {
        this.f15040w += xx1Var.f22029h;
        this.f15041x += xx1Var.f22027f;
    }

    public final LogSessionId q() {
        return this.f15022d.getSessionId();
    }

    public final void r(zz1 zz1Var, String str) {
        r32 r32Var = zz1Var.f22778d;
        if (r32Var == null || !r32Var.b()) {
            i();
            this.f15028j = str;
            this.f15029k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
            f(zz1Var.f22776b, r32Var);
        }
    }

    public final void s(zz1 zz1Var, String str) {
        r32 r32Var = zz1Var.f22778d;
        if ((r32Var == null || !r32Var.b()) && str.equals(this.f15028j)) {
            i();
        }
        this.f15026h.remove(str);
        this.f15027i.remove(str);
    }

    public final /* synthetic */ void t(PlaybackErrorEvent playbackErrorEvent) {
        this.f15022d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void u(NetworkEvent networkEvent) {
        this.f15022d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void v(PlaybackStateEvent playbackStateEvent) {
        this.f15022d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void w(TrackChangeEvent trackChangeEvent) {
        this.f15022d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void x(PlaybackMetrics playbackMetrics) {
        this.f15022d.reportPlaybackMetrics(playbackMetrics);
    }

    public final boolean y(f81 f81Var) {
        String str;
        if (f81Var == null) {
            return false;
        }
        f02 f02Var = this.f15021c;
        String str2 = (String) f81Var.f14318c;
        synchronized (f02Var) {
            str = f02Var.f14154f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void e(IOException iOException) {
    }
}
