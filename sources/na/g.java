package na;

import android.hardware.biometrics.BiometricManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.x0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import b2.z;
import com.adjust.sdk.LicenseData;
import com.adjust.sdk.google.lvl.LicenseRawCallback;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.i0;
import i1.e0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m0.s1;
import n1.y;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import qj.x;
import ud.o0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements xi.f, org.chromium.net.c, o.k, OnSuccessListener, OnFailureListener, OnCanceledListener, ph.b, j2.h, rl.k, g0, s0.c, OnUserEarnedRewardListener, wd.b, LicenseRawCallback, Continuation, xi.n, xb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46631b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f46630a = i10;
        this.f46631b = obj;
    }

    public static CharSequence G(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // androidx.lifecycle.g0
    public void A(Object obj) {
        t.l lVar = (t.l) this.f46631b;
        if (((Boolean) obj).booleanValue()) {
            lVar.F();
            t.t tVar = lVar.f50295a;
            if (tVar.f50312k) {
                Executor uVar = tVar.f50305d;
                if (uVar == null) {
                    uVar = new com.google.android.gms.common.api.internal.u(4);
                }
                uVar.execute(new t.f(lVar));
            } else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            t.t tVar2 = lVar.f50295a;
            if (tVar2.f50316p == null) {
                tVar2.f50316p = new f0();
            }
            t.t.g(tVar2.f50316p, Boolean.FALSE);
        }
    }

    public int B() {
        return 1;
    }

    public String C(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        s(sb2, it);
        return sb2.toString();
    }

    public boolean E(String str) {
        return false;
    }

    public void F(boolean z10) {
        ((WebSettingsBoundaryInterface) this.f46631b).setPaymentRequestEnabled(z10);
    }

    @Override // xi.f
    public void a(String str, xi.d dVar) {
        ((oi.h) this.f46631b).e(str, dVar, null);
    }

    @Override // j2.h
    public void b(j2.j jVar, long j10, long j11, boolean z10) {
        ((s1.f) this.f46631b).z((j2.q) jVar, j10, j11);
    }

    @Override // o.k
    public boolean c(o.m mVar, MenuItem menuItem) {
        ((Toolbar) this.f46631b).getClass();
        return false;
    }

    @Override // j2.h
    public a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        a0 a0Var;
        j2.q qVar = (j2.q) jVar;
        s1.f fVar = (s1.f) this.f46631b;
        long j12 = qVar.f43678a;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        int i11 = qVar.f43680c;
        fVar.f50017m.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof e0) || (cause instanceof FileNotFoundException) || (cause instanceof n1.r) || (cause instanceof j2.l) || ((cause instanceof n1.i) && ((n1.i) cause).f46362a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == C.TIME_UNSET) {
            a0Var = j2.m.f43673f;
        } else {
            a0Var = new a0(jMin, 0, false);
        }
        fVar.f50021q.g(uVar, i11, iOException, !a0Var.a());
        return a0Var;
    }

    @Override // xi.f
    public void e(String str, xi.d dVar, ne.c cVar) {
        ((oi.h) this.f46631b).e(str, dVar, cVar);
    }

    @Override // s0.c
    public Object f(s0.b bVar) {
        return ((jk.b) this.f46631b).invoke(bVar);
    }

    @Override // org.chromium.net.c
    public FileChannel g() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f46631b;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }

    @Override // vj.a
    public Object get() {
        mb.g firebaseApp = (mb.g) ((rb.c) this.f46631b).f49529b;
        kotlin.jvm.internal.n.f(firebaseApp, "firebaseApp");
        o0 o0Var = o0.f52132a;
        return o0.a(firebaseApp);
    }

    @Override // xi.f
    public ne.c h(xi.k kVar) {
        return ((oi.h) this.f46631b).h(kVar);
    }

    @Override // xi.f
    public void i(String str, ByteBuffer byteBuffer) {
        ((oi.h) this.f46631b).m(str, byteBuffer, null);
    }

    @Override // j2.h
    public void j(j2.j jVar, long j10, long j11) {
        j2.q qVar = (j2.q) jVar;
        s1.f fVar = (s1.f) this.f46631b;
        long j12 = qVar.f43678a;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        fVar.f50017m.getClass();
        fVar.f50021q.d(uVar, qVar.f43680c);
        t1.c cVar = (t1.c) qVar.f43683f;
        t1.c cVar2 = fVar.G;
        int size = cVar2 == null ? 0 : cVar2.f50350m.size();
        long j13 = cVar.a(0).f50373b;
        int i10 = 0;
        while (i10 < size && fVar.G.a(i10).f50373b < j13) {
            i10++;
        }
        if (cVar.f50342d) {
            if (size - i10 > cVar.f50350m.size()) {
                l1.a.s("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = fVar.M;
                if (j14 == C.TIME_UNSET || cVar.f50346h * 1000 > j14) {
                    fVar.L = 0;
                } else {
                    l1.a.s("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f50346h + ", " + fVar.M);
                }
            }
            int i11 = fVar.L;
            fVar.L = i11 + 1;
            if (i11 < fVar.f50017m.j(qVar.f43680c)) {
                fVar.D.postDelayed(fVar.f50026v, Math.min((fVar.L - 1) * 1000, 5000));
                return;
            } else {
                fVar.C = new z();
                return;
            }
        }
        fVar.G = cVar;
        fVar.H = cVar.f50342d & fVar.H;
        fVar.I = j10 - j11;
        fVar.J = j10;
        fVar.N += i10;
        synchronized (fVar.f50024t) {
            if (qVar.f43679b.f46369a.equals(fVar.E)) {
                Uri uriB = fVar.G.f50349k;
                if (uriB == null) {
                    uriB = com.bumptech.glide.c.B(qVar.f43681d.f46418c);
                }
                fVar.E = uriB;
            }
        }
        t1.c cVar3 = fVar.G;
        if (!cVar3.f50342d || fVar.K != C.TIME_UNSET) {
            fVar.B(true);
            return;
        }
        s1 s1Var = cVar3.f50347i;
        if (s1Var == null) {
            fVar.y();
            return;
        }
        String str = (String) s1Var.f45751b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                fVar.K = l1.y.P((String) s1Var.f45752c) - fVar.J;
                fVar.B(true);
                return;
            } catch (e0 e10) {
                fVar.A(e10);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            fVar.C(s1Var, new s1.e());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            fVar.C(s1Var, new ne.a(13));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            fVar.y();
        } else {
            fVar.A(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // rl.k
    public rl.l l(yl.f fVar) {
        String strB = fVar.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new sl.c(this, 0);
        }
        if ("strings".equals(strB)) {
            return new sl.c(this, 1);
        }
        return null;
    }

    @Override // xi.f
    public void m(String str, ByteBuffer byteBuffer, xi.e eVar) {
        ((oi.h) this.f46631b).m(str, byteBuffer, eVar);
    }

    @Override // j2.h
    public void n(j2.j jVar, long j10, long j11, int i10) {
        f2.u uVar;
        j2.q qVar = (j2.q) jVar;
        s1.f fVar = (s1.f) this.f46631b;
        if (i10 == 0) {
            long j12 = qVar.f43678a;
            uVar = new f2.u(qVar.f43679b, j10);
        } else {
            long j13 = qVar.f43678a;
            n1.k kVar = qVar.f43679b;
            y yVar = qVar.f43681d;
            uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        }
        fVar.f50021q.h(uVar, qVar.f43680c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i10);
    }

    @Override // xb.a
    public void o(Bundle bundle) {
        ((qb.c) ((qb.b) this.f46631b)).a("clx", "_ae", bundle);
    }

    @Override // ph.b
    public void onAdLoaded() {
        m0 m0Var = (m0) this.f46631b;
        ((ConcurrentHashMap) ((rh.a) m0Var.f11736d).f38583b).put(((ph.c) m0Var.f11734b).f48371a, (th.e) m0Var.f11735c);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f46631b).countDown();
    }

    @Override // com.adjust.sdk.google.lvl.LicenseRawCallback
    public void onError(int i10) {
        ((LinkedBlockingQueue) this.f46631b).offer(new LicenseData(null, null, i10));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f46631b).countDown();
    }

    @Override // com.adjust.sdk.google.lvl.LicenseRawCallback
    public void onLicenseDataReceived(int i10, String str, String str2) {
        ((LinkedBlockingQueue) this.f46631b).offer(new LicenseData(str, str2, i10));
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, xi.o oVar) {
        int i10 = this.f46630a;
        boolean z10 = false;
        Object obj = this.f46631b;
        switch (i10) {
            case 24:
                ((un.a) obj).getClass();
                return;
            case 25:
                x xVar = (x) obj;
                if (((rb.c) xVar.f49096b) == null) {
                    return;
                }
                String str = mVar.f53822a;
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        try {
                            ((rb.c) xVar.f49096b).m((String) ((HashMap) mVar.f53823b).get("kind"));
                            ((wi.j) oVar).a(Boolean.TRUE);
                        } catch (Exception e10) {
                            ((wi.j) oVar).b("error", "Error when setting cursors: " + e10.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e11) {
                    ((wi.j) oVar).b("error", "Unhandled error: " + e11.getMessage(), null);
                    return;
                }
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                v6.c cVar = (v6.c) obj;
                if (((wi.i) cVar.f52488b) == null) {
                    return;
                }
                String str2 = mVar.f53822a;
                Object obj2 = mVar.f53823b;
                str2.getClass();
                switch (str2) {
                    case "create":
                        Map map = (Map) obj2;
                        boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (z11) {
                                ((wi.i) cVar.f52488b).m(new wi.f(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, byteBufferWrap));
                                ((wi.j) oVar).a(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z10 = true;
                            }
                            long jB = ((wi.i) cVar.f52488b).b(new wi.f(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey(ViewHierarchyConstants.DIMENSION_TOP_KEY) ? ((Double) map.get(ViewHierarchyConstants.DIMENSION_TOP_KEY)).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z10 ? 2 : 1, byteBufferWrap));
                            if (jB != -2) {
                                ((wi.j) oVar).a(Long.valueOf(jB));
                                return;
                            } else {
                                if (!z10) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((wi.j) oVar).a(null);
                                return;
                            }
                        } catch (IllegalStateException e12) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj2;
                        try {
                            ((wi.i) cVar.f52488b).y0(((Double) map2.get(ViewHierarchyConstants.DIMENSION_TOP_KEY)).doubleValue(), ((Double) map2.get("left")).doubleValue(), ((Integer) map2.get("id")).intValue());
                            ((wi.j) oVar).a(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj2;
                        try {
                            ((wi.i) cVar.f52488b).x0(new wi.h(((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue(), ((Integer) map3.get("id")).intValue()), new b6.a((wi.j) oVar, 6));
                            return;
                        } catch (IllegalStateException e14) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((wi.i) cVar.f52488b).B0(((Integer) obj2).intValue());
                            ((wi.j) oVar).a(null);
                            return;
                        } catch (IllegalStateException e15) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((wi.i) cVar.f52488b).c(((Boolean) obj2).booleanValue());
                            ((wi.j) oVar).a(null);
                            return;
                        } catch (IllegalStateException e16) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj2;
                        try {
                            ((wi.i) cVar.f52488b).g(new wi.g(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((wi.j) oVar).a(null);
                            return;
                        } catch (IllegalStateException e17) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj2;
                        try {
                            ((wi.i) cVar.f52488b).f(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((wi.j) oVar).a(null);
                            return;
                        } catch (IllegalStateException e18) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e18), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((wi.i) cVar.f52488b).K(((Integer) ((Map) obj2).get("id")).intValue());
                            ((wi.j) oVar).a(null);
                            return;
                        } catch (IllegalStateException e19) {
                            ((wi.j) oVar).b("error", Log.getStackTraceString(e19), null);
                            return;
                        }
                    default:
                        ((wi.j) oVar).c();
                        return;
                }
            case 27:
                x xVar2 = (x) obj;
                if (((io.flutter.plugin.editing.g) xVar2.f49096b) == null) {
                    return;
                }
                String str3 = mVar.f53822a;
                str3.getClass();
                switch (str3.hashCode()) {
                    case -705821951:
                        if (str3.equals("Scribe.isFeatureAvailable")) {
                        }
                        break;
                    case 1759284829:
                        if (str3.equals("Scribe.startStylusHandwriting")) {
                        }
                        break;
                    case 2119738044:
                        if (str3.equals("Scribe.isStylusHandwritingAvailable")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                    */
                /*
                    Method dump skipped, instruction units count: 1434
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: na.g.onMethodCall(xi.m, xi.o):void");
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                ((CountDownLatch) this.f46631b).countDown();
            }

            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public void onUserEarnedReward(RewardItem rewardItem) {
                ((th.j) this.f46631b).f50783c.onUserEarnedReward();
            }

            @Override // rl.k
            public void p(yl.f fVar, Object obj) {
                sl.d dVar = (sl.d) this.f46631b;
                String strB = fVar.b();
                if ("version".equals(strB)) {
                    if (obj instanceof int[]) {
                        dVar.f50272a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(strB)) {
                    dVar.f50273b = obj instanceof String ? (String) obj : null;
                }
            }

            @Override // o.k
            public void q(o.m mVar) {
                Toolbar toolbar = (Toolbar) this.f46631b;
                p.j jVar = toolbar.f3970a.f3923t;
                if (jVar == null || !jVar.k()) {
                    Iterator it = toolbar.G.f45737b.iterator();
                    while (it.hasNext()) {
                        ((x0) ((m0.r) it.next())).f4504a.t(mVar);
                    }
                }
            }

            public void s(StringBuilder sb2, Iterator it) {
                try {
                    if (it.hasNext()) {
                        sb2.append(G(it.next()));
                        while (it.hasNext()) {
                            sb2.append((CharSequence) this.f46631b);
                            sb2.append(G(it.next()));
                        }
                    }
                } catch (IOException e10) {
                    throw new AssertionError(e10);
                }
            }

            public int t(int i10) {
                BiometricManager biometricManager = (BiometricManager) this.f46631b;
                if (biometricManager != null) {
                    return t.n.a(biometricManager, i10);
                }
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                v6.c cVar = (v6.c) this.f46631b;
                if (!task.isSuccessful() && !task.isCanceled()) {
                    Exception exception = task.getException();
                    if (exception instanceof j9.e) {
                        int i10 = ((j9.e) exception).f43728a.f11654a;
                        if (i10 == 43001 || i10 == 43002 || i10 == 43003 || i10 == 17) {
                            return ((v9.e) cVar.f52488b).getAppSetIdInfo();
                        }
                        if (i10 == 43000) {
                            return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                        }
                        if (i10 == 15) {
                            return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                        }
                    }
                }
                return task;
            }

            public o1.a v() {
                return null;
            }

            public u1.c x() {
                return (u1.c) this.f46631b;
            }

            public UUID y() {
                return i1.g.f42538a;
            }

            @Override // rl.k
            public rl.k z(yl.b bVar, yl.f fVar) {
                return null;
            }

            public g(jk.b produceNewData) {
                this.f46630a = 16;
                kotlin.jvm.internal.n.f(produceNewData, "produceNewData");
                this.f46631b = produceNewData;
            }

            public g(boolean z10) {
                this.f46630a = 23;
                this.f46631b = new AtomicBoolean(z10);
            }

            public g(String str) {
                this.f46630a = 0;
                str.getClass();
                this.f46631b = str;
            }

            public g(Field field) {
                this.f46630a = 2;
                this.f46631b = field;
                field.setAccessible(true);
            }

            public g(int i10) {
                this.f46630a = i10;
                switch (i10) {
                    case 10:
                        this.f46631b = new AtomicInteger(0);
                        break;
                    default:
                        this.f46631b = new CountDownLatch(1);
                        break;
                }
            }

            public g(i6.d dVar) {
                this.f46630a = 15;
                this.f46631b = t.m.a(dVar.f42896a);
            }

            @Override // rl.k
            public void k() {
            }

            public void D(i0 i0Var) {
            }

            public void r(i0 i0Var) {
            }

            @Override // rl.k
            public void u(yl.f fVar, dm.f fVar2) {
            }

            @Override // rl.k
            public void w(yl.f fVar, yl.b bVar, yl.f fVar2) {
            }
        }
