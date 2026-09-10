package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r20 implements ox1, a02 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicInteger f19281u = new AtomicInteger(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f19282v = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l20 f19284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f19285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j10 f19286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f19287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vc f19288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xz1 f19289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f19290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e10 f19292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19293k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f19294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f19295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f19296o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f19298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f19299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile m20 f19300s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f19297p = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f19301t = new HashSet();

    /* JADX WARN: Code duplicated, block: B:24:0x0112  */
    /* JADX WARN: Code duplicated, block: B:27:0x0117  */
    public r20(Context context, j10 j10Var, b30 b30Var, Integer num) {
        jk1 jk1Var;
        jk1 md0Var;
        this.f19283a = context;
        this.f19286d = j10Var;
        this.f19298q = num;
        this.f19287e = new WeakReference(b30Var);
        l20 l20Var = new l20();
        this.f19284b = l20Var;
        m mVar = new m(context);
        this.f19285c = mVar;
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        f19281u.incrementAndGet();
        fy1 fy1Var = new fy1(context, new b21(this, 11));
        final boolean z10 = true;
        ps1.c0(!fy1Var.f14596v);
        fy1Var.f14580e = new wv0(mVar, 9);
        ps1.c0(!fy1Var.f14596v);
        fy1Var.f14581f = new uo0(l20Var, 14);
        ps1.c0(!fy1Var.f14596v);
        fy1Var.f14596v = true;
        xz1 xz1Var = new xz1(fy1Var);
        this.f19289g = xz1Var;
        xz1Var.f22051d.b();
        xz1Var.f22050c.Y0(this);
        this.f19293k = 0;
        this.f19294m = 0L;
        this.l = 0;
        this.f19299r = new ArrayList();
        this.f19300s = null;
        String strZzn = b30Var != null ? b30Var.zzn() : null;
        this.f19295n = (String) (strZzn == null ? w71.f21439a : new k81(strZzn)).d();
        this.f19296o = b30Var != null ? b30Var.zzp() : 0;
        final String strZze = zzt.zzc().zze(context, b30Var.zzs().afmaVersion);
        if (!this.f19291i || this.f19290h.limit() <= 0) {
            if (((Boolean) zzba.zzc().a(am.O2)).booleanValue()) {
                if (!((Boolean) zzba.zzc().a(am.G2)).booleanValue()) {
                    if (j10Var.f15904i) {
                        z10 = false;
                    }
                }
            } else if (j10Var.f15904i) {
                z10 = false;
            }
            if (j10Var.l) {
                final int i10 = 0;
                jk1Var = new jk1(this) { // from class: com.google.android.gms.internal.ads.p20

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r20 f18445b;

                    {
                        this.f18445b = this;
                    }

                    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
                    /* JADX INFO: renamed from: zza */
                    public final wk1 mo166zza() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                r20 r20Var = this.f18445b;
                                r20 r20Var2 = true != z11 ? null : r20Var;
                                j10 j10Var2 = r20Var.f19286d;
                                return new t20(strZze, r20Var2, j10Var2.f15899d, j10Var2.f15900e, j10Var2.f15907m, j10Var2.f15908n);
                            case 1:
                                iw0 iw0Var = new iw0(10);
                                r20 r20Var3 = this.f18445b;
                                r20 r20Var4 = true != z10 ? null : r20Var3;
                                j10 j10Var3 = r20Var3.f19286d;
                                jr1 jr1Var = new jr1(strZze, j10Var3.f15899d, j10Var3.f15900e, true, iw0Var);
                                if (r20Var4 != null) {
                                    jr1Var.n(r20Var4);
                                }
                                return jr1Var;
                            default:
                                boolean z12 = z10;
                                r20 r20Var5 = this.f18445b;
                                r20 r20Var6 = true != z12 ? null : r20Var5;
                                j10 j10Var4 = r20Var5.f19286d;
                                k20 k20Var = new k20(strZze, r20Var6, j10Var4.f15899d, j10Var4.f15900e, j10Var4.f15903h);
                                r20Var5.f19301t.add(new WeakReference(k20Var));
                                return k20Var;
                        }
                    }
                };
            } else if (j10Var.f15903h > 0) {
                final int i11 = 2;
                jk1Var = new jk1(this) { // from class: com.google.android.gms.internal.ads.p20

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r20 f18445b;

                    {
                        this.f18445b = this;
                    }

                    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
                    /* JADX INFO: renamed from: zza */
                    public final wk1 mo166zza() {
                        switch (i11) {
                            case 0:
                                boolean z11 = z10;
                                r20 r20Var = this.f18445b;
                                r20 r20Var2 = true != z11 ? null : r20Var;
                                j10 j10Var2 = r20Var.f19286d;
                                return new t20(strZze, r20Var2, j10Var2.f15899d, j10Var2.f15900e, j10Var2.f15907m, j10Var2.f15908n);
                            case 1:
                                iw0 iw0Var = new iw0(10);
                                r20 r20Var3 = this.f18445b;
                                r20 r20Var4 = true != z10 ? null : r20Var3;
                                j10 j10Var3 = r20Var3.f19286d;
                                jr1 jr1Var = new jr1(strZze, j10Var3.f15899d, j10Var3.f15900e, true, iw0Var);
                                if (r20Var4 != null) {
                                    jr1Var.n(r20Var4);
                                }
                                return jr1Var;
                            default:
                                boolean z12 = z10;
                                r20 r20Var5 = this.f18445b;
                                r20 r20Var6 = true != z12 ? null : r20Var5;
                                j10 j10Var4 = r20Var5.f19286d;
                                k20 k20Var = new k20(strZze, r20Var6, j10Var4.f15899d, j10Var4.f15900e, j10Var4.f15903h);
                                r20Var5.f19301t.add(new WeakReference(k20Var));
                                return k20Var;
                        }
                    }
                };
            } else {
                final int i12 = 1;
                jk1Var = new jk1(this) { // from class: com.google.android.gms.internal.ads.p20

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r20 f18445b;

                    {
                        this.f18445b = this;
                    }

                    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
                    /* JADX INFO: renamed from: zza */
                    public final wk1 mo166zza() {
                        switch (i12) {
                            case 0:
                                boolean z11 = z10;
                                r20 r20Var = this.f18445b;
                                r20 r20Var2 = true != z11 ? null : r20Var;
                                j10 j10Var2 = r20Var.f19286d;
                                return new t20(strZze, r20Var2, j10Var2.f15899d, j10Var2.f15900e, j10Var2.f15907m, j10Var2.f15908n);
                            case 1:
                                iw0 iw0Var = new iw0(10);
                                r20 r20Var3 = this.f18445b;
                                r20 r20Var4 = true != z10 ? null : r20Var3;
                                j10 j10Var3 = r20Var3.f19286d;
                                jr1 jr1Var = new jr1(strZze, j10Var3.f15899d, j10Var3.f15900e, true, iw0Var);
                                if (r20Var4 != null) {
                                    jr1Var.n(r20Var4);
                                }
                                return jr1Var;
                            default:
                                boolean z12 = z10;
                                r20 r20Var5 = this.f18445b;
                                r20 r20Var6 = true != z12 ? null : r20Var5;
                                j10 j10Var4 = r20Var5.f19286d;
                                k20 k20Var = new k20(strZze, r20Var6, j10Var4.f15899d, j10Var4.f15900e, j10Var4.f15903h);
                                r20Var5.f19301t.add(new WeakReference(k20Var));
                                return k20Var;
                        }
                    }
                };
            }
            md0Var = j10Var.f15904i ? new md0(12, this, jk1Var) : jk1Var;
            ByteBuffer byteBuffer = this.f19290h;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr = new byte[this.f19290h.limit()];
                this.f19290h.get(bArr);
                md0Var = new lj1((Object) md0Var, false, (Object) bArr, 13);
            }
        } else {
            byte[] bArr2 = new byte[this.f19290h.limit()];
            this.f19290h.get(bArr2);
            md0Var = new o20(bArr2);
        }
        z61 z61Var = new z61(((Boolean) zzba.zzc().a(am.f12308q)).booleanValue() ? jq.f16136f : jq.f16135e);
        s6 s6Var = new s6(9);
        vc vcVar = new vc();
        vcVar.f21149b = md0Var;
        vcVar.f21150c = z61Var;
        vcVar.f21151d = s6Var;
        vcVar.f21148a = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.f19288f = vcVar;
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void a(int i10) {
        e10 e10Var = this.f19292j;
        if (e10Var != null) {
            e10Var.zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void b(lt ltVar) {
        e10 e10Var = this.f19292j;
        if (e10Var != null) {
            e10Var.b(ltVar.f17122a, ltVar.f17123b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final void d(po1 po1Var, boolean z10, int i10) {
        this.f19293k += i10;
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void e(IOException iOException) {
        e10 e10Var = this.f19292j;
        if (e10Var != null) {
            if (this.f19286d.f15905j) {
                e10Var.e(iOException);
            } else {
                e10Var.c("onLoadError", iOException);
            }
        }
    }

    public final void finalize() {
        f19281u.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void h(int i10) {
        this.l += i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ox1
    public final void i(yg1 yg1Var, po1 po1Var, boolean z10) {
        if (yg1Var instanceof vv1) {
            synchronized (this.f19297p) {
                this.f19299r.add((vv1) yg1Var);
            }
        } else if (yg1Var instanceof m20) {
            this.f19300s = (m20) yg1Var;
            b30 b30Var = (b30) this.f19287e.get();
            if (((Boolean) zzba.zzc().a(am.G2)).booleanValue() && b30Var != null && this.f19300s.f17223o) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f19300s.f17225q));
                map.put("gcacheDownloaded", String.valueOf(this.f19300s.f17226r));
                zzs.zza.post(new zd1(14, b30Var, map));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void k(dy1 dy1Var) {
        e10 e10Var = this.f19292j;
        if (e10Var != null) {
            e10Var.c("onPlayerError", dy1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void l(g22 g22Var) {
        b30 b30Var = (b30) this.f19287e.get();
        if (!((Boolean) zzba.zzc().a(am.G2)).booleanValue() || b30Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = g22Var.f14677n;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = g22Var.f14678o;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = g22Var.f14675k;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        b30Var.e("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void n(g22 g22Var) {
        b30 b30Var = (b30) this.f19287e.get();
        if (!((Boolean) zzba.zzc().a(am.G2)).booleanValue() || b30Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(g22Var.f14689z));
        map.put("bitRate", String.valueOf(g22Var.f14674j));
        int i10 = g22Var.f14685v;
        int i11 = g22Var.f14686w;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        map.put("resolution", sb2.toString());
        String str = g22Var.f14677n;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = g22Var.f14678o;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = g22Var.f14675k;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        b30Var.e("onMetadataEvent", map);
    }

    public final long p() {
        if (this.f19300s != null && this.f19300s.f17224p && this.f19300s.f17225q) {
            return Math.min(this.f19293k, this.f19300s.f17227s);
        }
        return 0L;
    }

    public final long q() {
        if (this.f19300s != null && this.f19300s.f17224p) {
            m20 m20Var = this.f19300s;
            if (m20Var.f17222n != null) {
                AtomicLong atomicLong = m20Var.f17229u;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (m20Var) {
                    try {
                        if (m20Var.f17228t == null) {
                            m20Var.f17228t = l00.f16608a.b(new sf(m20Var, 3));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (m20Var.f17228t.isDone()) {
                    try {
                        m20Var.f17229u.compareAndSet(-1L, ((Long) m20Var.f17228t.get()).longValue());
                        return m20Var.f17229u.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f19297p) {
            while (true) {
                ArrayList arrayList = this.f19299r;
                if (!arrayList.isEmpty()) {
                    long j10 = this.f19294m;
                    Map mapZzj = ((vv1) arrayList.remove(0)).zzj();
                    long j11 = 0;
                    if (mapZzj != null) {
                        for (Map.Entry entry : mapZzj.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && x10.y("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f19294m = j10 + j11;
                }
            }
        }
        return this.f19294m;
    }

    public final void r(boolean z10) {
        h hVar;
        boolean zEquals;
        if (this.f19289g == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            xz1 xz1Var = this.f19289g;
            xz1Var.f22051d.b();
            ry1 ry1Var = xz1Var.f22050c;
            ry1Var.l0();
            int length = ry1Var.f19717h.length;
            if (i10 >= 2) {
                return;
            }
            m mVar = this.f19285c;
            synchronized (mVar.f17173c) {
                hVar = mVar.f17175e;
            }
            hVar.getClass();
            g gVar = new g(hVar);
            boolean z11 = !z10;
            SparseBooleanArray sparseBooleanArray = gVar.E;
            if (sparseBooleanArray.get(i10) != z11) {
                if (z10) {
                    sparseBooleanArray.delete(i10);
                } else {
                    sparseBooleanArray.put(i10, true);
                }
            }
            h hVar2 = new h(gVar);
            synchronized (mVar.f17173c) {
                zEquals = mVar.f17175e.equals(hVar2);
                mVar.f17175e = hVar2;
            }
            if (!zEquals) {
                if (hVar2.A && mVar.f17174d == null) {
                    v71.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                wy1 wy1Var = mVar.f17171a;
                if (wy1Var != null) {
                    wy1Var.f21632g.c(10);
                }
            }
            i10++;
        }
    }

    public final j42 s(Uri uri) {
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        List list = Collections.EMPTY_LIST;
        ya1 ya1Var2 = ya1.f22208e;
        t3 t3Var = t3.f20138a;
        f5 f5Var = new f5("", new b0(), uri != null ? new l2(uri, ya1Var2) : null, new w1(), f7.B);
        int i10 = this.f19286d.f15901f;
        vc vcVar = this.f19288f;
        vcVar.f21148a = i10;
        f5Var.f14214b.getClass();
        return new j42(f5Var, (jk1) vcVar.f21149b, (z61) vcVar.f21150c, (s6) vcVar.f21151d, vcVar.f21148a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t(Uri[] uriArr, ByteBuffer byteBuffer, boolean z10) {
        Object z32Var;
        if (this.f19289g != null) {
            this.f19290h = byteBuffer;
            this.f19291i = z10;
            int length = uriArr.length;
            if (length == 1) {
                z32Var = s(uriArr[0]);
            } else {
                a32[] a32VarArr = new a32[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    a32VarArr[i10] = s(uriArr[i10]);
                }
                z32Var = new z32(new b02(28), a32VarArr);
            }
            xz1 xz1Var = this.f19289g;
            xz1Var.f22051d.b();
            ry1 ry1Var = xz1Var.f22050c;
            ry1Var.l0();
            List listSingletonList = Collections.singletonList(z32Var);
            ry1Var.l0();
            ry1Var.l0();
            ry1Var.c1(ry1Var.f19708a0);
            ry1Var.T0();
            ry1Var.G++;
            ArrayList arrayList = ry1Var.f19725q;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
                lz1 lz1Var = new lz1((a32) listSingletonList.get(i11), ry1Var.f19726r);
                arrayList2.add(lz1Var);
                arrayList.add(i11, new oy1(lz1Var.f17166b, lz1Var.f17165a));
            }
            ry1Var.f19713d0 = new q42(new Random(ry1Var.f19713d0.f18926a.nextLong())).a(arrayList2.size());
            sz1 sz1Var = new sz1(arrayList, ry1Var.f19713d0);
            boolean zG = sz1Var.g();
            int i12 = sz1Var.f20095d;
            if (!zG && i12 < 0) {
                throw new u22();
            }
            int iK = sz1Var.k(false);
            nz1 nz1VarH1 = ry1Var.h1(ry1Var.f19708a0, sz1Var, ry1Var.j1(sz1Var, iK, C.TIME_UNSET));
            int i13 = nz1VarH1.f18042e;
            if (i13 == 1) {
                i13 = 1;
            } else if (sz1Var.g()) {
                i13 = 4;
            } else if (iK != -1) {
                if (iK >= i12) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
            }
            nz1 nz1VarI1 = ry1.i1(nz1VarH1, i13);
            wy1 wy1Var = ry1Var.f19721m;
            long jT = uu0.t(C.TIME_UNSET);
            q42 q42Var = ry1Var.f19713d0;
            wy1Var.getClass();
            wy1Var.f21632g.b(17, new uy1(arrayList2, q42Var, iK, jT)).a();
            ry1Var.f1(nz1VarI1, 0, (ry1Var.f19708a0.f18039b.f19359a.equals(nz1VarI1.f18039b.f19359a) || ry1Var.f19708a0.f18038a.g()) ? false : true, 4, ry1Var.e1(nz1VarI1), -1);
            xz1 xz1Var2 = this.f19289g;
            xz1Var2.f22051d.b();
            ry1 ry1Var2 = xz1Var2.f22050c;
            ry1Var2.l0();
            nz1 nz1Var = ry1Var2.f19708a0;
            if (nz1Var.f18042e == 1) {
                nz1 nz1VarE = nz1Var.e(null);
                nz1 nz1VarI2 = ry1.i1(nz1VarE, true != nz1VarE.f18038a.g() ? 2 : 4);
                ry1Var2.G++;
                Handler handler = ry1Var2.f19721m.f21632g.f22362a;
                ss0 ss0VarG = ys0.g();
                ss0VarG.f20047a = handler.obtainMessage(29);
                ss0VarG.a();
                ry1Var2.f1(nz1VarI2, 1, false, 5, C.TIME_UNSET, -1);
            }
            f19282v.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public final void zzo() {
        e10 e10Var = this.f19292j;
        if (e10Var != null) {
            e10Var.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final void f(po1 po1Var, boolean z10) {
    }
}
