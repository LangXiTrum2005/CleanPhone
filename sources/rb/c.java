package rb;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.PointerIcon;
import android.widget.TextView;
import androidx.lifecycle.g0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.qx1;
import com.google.android.gms.internal.ads.z8;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.storage.androidcleaner.R;
import defpackage.e;
import f2.d1;
import f2.e1;
import f2.k1;
import i1.q0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import k3.l;
import k3.m;
import l1.g;
import l1.q;
import l1.y;
import mi.s;
import oa.k0;
import rl.k;
import sl.d;
import t.x;
import t.z;
import ud.c1;
import ud.w0;
import v1.r;
import wi.j;
import xi.n;
import xi.o;
import xi.p;
import xi.v;
import yl.f;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements j0, r4.b, k, g0, m, wd.b, d1, ph.b, n, y1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f49529b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f49528a = i10;
        this.f49529b = obj;
    }

    public static c n(Object obj) {
        if (obj != null) {
            return new c(obj, 14);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // androidx.lifecycle.g0
    public void A(Object obj) {
        Integer num = (Integer) obj;
        z zVar = (z) this.f49529b;
        Handler handler = zVar.f50322q;
        q5.a aVar = zVar.f50323r;
        handler.removeCallbacks(aVar);
        int iIntValue = num.intValue();
        if (zVar.f50327v != null) {
            int i10 = zVar.f50324s.f50319s;
            Context context = zVar.getContext();
            Drawable drawable = null;
            if (context == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 == 0 && iIntValue == 1) {
                    drawable = context.getDrawable(i11);
                } else {
                    if (i10 == 1 && iIntValue == 2) {
                        i11 = 2131230918;
                    } else if ((i10 == 2 && iIntValue == 1) || (i10 == 1 && iIntValue == 3)) {
                    }
                    drawable = context.getDrawable(i11);
                }
            }
            if (drawable != null) {
                zVar.f50327v.setImageDrawable(drawable);
                if ((i10 != 0 || iIntValue != 1) && ((i10 == 1 && iIntValue == 2) || (i10 == 2 && iIntValue == 1))) {
                    x.a(drawable);
                }
                zVar.f50324s.f50319s = iIntValue;
            }
        }
        int iIntValue2 = num.intValue();
        TextView textView = zVar.f50328w;
        if (textView != null) {
            textView.setTextColor(iIntValue2 == 2 ? zVar.f50325t : zVar.f50326u);
        }
        handler.postDelayed(aVar, 2000L);
    }

    @Override // y1.k
    public void b(Bundle bundle) {
        ((MediaCodec) this.f49529b).setParameters(bundle);
    }

    @Override // y1.k
    public void c(int i10, qx1 qx1Var, long j10, int i11) {
        ((MediaCodec) this.f49529b).queueSecureInputBuffer(i10, 0, qx1Var.f19238i, j10, i11);
    }

    @Override // y1.k
    public void d(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f49529b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // k3.m
    public void e(byte[] bArr, int i10, int i11, l lVar, g gVar) {
        k1.b bVarA;
        q qVar = (q) this.f49529b;
        qVar.K(bArr, i11 + i10);
        qVar.M(i10);
        ArrayList arrayList = new ArrayList();
        while (qVar.a() > 0) {
            go.k.h("Incomplete Mp4Webvtt Top Level box header found.", qVar.a() >= 8);
            int iM = qVar.m();
            if (qVar.m() == 1987343459) {
                int i12 = iM - 8;
                CharSequence charSequenceF = null;
                k1.a aVarA = null;
                while (i12 > 0) {
                    go.k.h("Incomplete vtt cue box header found.", i12 >= 8);
                    int iM2 = qVar.m();
                    int iM3 = qVar.m();
                    int i13 = iM2 - 8;
                    byte[] bArr2 = qVar.f44813a;
                    int i14 = qVar.f44814b;
                    String str = y.f44830a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    qVar.N(i13);
                    i12 = (i12 - 8) - i13;
                    if (iM3 == 1937011815) {
                        z8 z8Var = new z8();
                        t3.g.e(str2, z8Var);
                        aVarA = z8Var.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = t3.g.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.f44201a = charSequenceF;
                    aVarA.f44202b = null;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = t3.g.f50474a;
                    z8 z8Var2 = new z8();
                    z8Var2.f22550c = charSequenceF;
                    bVarA = z8Var2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                qVar.N(iM - 8);
            }
        }
        gVar.accept(new k3.a(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // vj.a
    public Object get() {
        switch (this.f49528a) {
            case 11:
                return new w0((c1) ((wd.c) this.f49529b).get());
            default:
                return this.f49529b;
        }
    }

    @Override // f2.d1
    public void h(e1 e1Var) {
        v1.l lVar = (v1.l) this.f49529b;
        lVar.f52363q.h(lVar);
    }

    @Override // k3.m
    public int i() {
        return 2;
    }

    @Override // rl.k
    public rl.l l(f fVar) {
        String strB = fVar.b();
        if ("d1".equals(strB)) {
            return new sl.b(this, 0);
        }
        if ("d2".equals(strB)) {
            return new sl.b(this, 1);
        }
        return null;
    }

    public void m(String str) {
        zi.b bVar = (zi.b) ((wi.b) this.f49529b).f53211a;
        if (wi.b.f53210c == null) {
            zi.a aVar = new zi.a();
            aVar.put("alias", 1010);
            Integer numValueOf = Integer.valueOf(Z3.f28072i);
            aVar.put("allScroll", numValueOf);
            aVar.put("basic", 1000);
            aVar.put("cell", 1006);
            aVar.put("click", 1002);
            aVar.put("contextMenu", 1001);
            aVar.put("copy", 1011);
            aVar.put("forbidden", 1012);
            aVar.put("grab", 1020);
            aVar.put("grabbing", Integer.valueOf(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT));
            aVar.put("help", 1003);
            aVar.put("move", numValueOf);
            aVar.put("none", 0);
            aVar.put("noDrop", 1012);
            aVar.put("precise", 1007);
            aVar.put("text", 1008);
            Integer numValueOf2 = Integer.valueOf(Z3.f28073j);
            aVar.put("resizeColumn", numValueOf2);
            aVar.put("resizeDown", 1015);
            Integer numValueOf3 = Integer.valueOf(Z3.l);
            aVar.put("resizeUpLeft", numValueOf3);
            aVar.put("resizeDownRight", 1017);
            aVar.put("resizeLeft", numValueOf2);
            aVar.put("resizeLeftRight", numValueOf2);
            aVar.put("resizeRight", numValueOf2);
            aVar.put("resizeRow", 1015);
            aVar.put("resizeUp", 1015);
            aVar.put("resizeUpDown", 1015);
            aVar.put("resizeUpLeft", 1017);
            aVar.put("resizeUpRight", numValueOf3);
            aVar.put("resizeUpLeftDownRight", 1017);
            aVar.put("resizeUpRightDownLeft", numValueOf3);
            aVar.put("verticalText", 1009);
            aVar.put("wait", 1004);
            aVar.put("zoomIn", 1018);
            aVar.put("zoomOut", 1019);
            wi.b.f53210c = aVar;
        }
        bVar.setPointerIcon(PointerIcon.getSystemIcon(((s) bVar).getContext(), ((Integer) wi.b.f53210c.getOrDefault(str, 1000)).intValue()));
    }

    public String o(String str, String str2) {
        yi.a aVar = (yi.a) this.f49529b;
        Context contextCreateConfigurationContext = aVar.f54402b;
        if (str2 != null) {
            Locale localeA = yi.a.a(str2);
            Configuration configuration = new Configuration(aVar.f54402b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = aVar.f54402b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", aVar.f54402b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    @Override // ph.b
    public void onAdLoaded() {
        m0 m0Var = (m0) this.f49529b;
        ((ConcurrentHashMap) ((rh.a) m0Var.f11736d).f38583b).put(((ph.c) m0Var.f11734b).f48371a, (xh.c) m0Var.f11735c);
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, o oVar) {
        int i10 = 2;
        switch (this.f49528a) {
            case 17:
                wi.b bVar = (wi.b) this.f49529b;
                if (((aj.a) bVar.f53212b) == null) {
                    return;
                }
                String str = mVar.f53822a;
                Object obj = mVar.f53823b;
                str.getClass();
                if (str.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj;
                        ((aj.a) bVar.f53212b).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (j) oVar);
                        return;
                    } catch (IllegalStateException e10) {
                        ((j) oVar).b("error", e10.getMessage(), null);
                        return;
                    }
                }
                if (!str.equals("ProcessText.queryTextActions")) {
                    ((j) oVar).c();
                    return;
                }
                try {
                    ((j) oVar).a(((aj.a) bVar.f53212b).b());
                    return;
                } catch (IllegalStateException e11) {
                    ((j) oVar).b("error", e11.getMessage(), null);
                    return;
                }
            default:
                k0 k0Var = (k0) this.f49529b;
                if (((bj.a) k0Var.f47269b) == null) {
                    return;
                }
                String str2 = mVar.f53822a;
                str2.getClass();
                switch (str2) {
                    case "SensitiveContent.getContentSensitivity":
                        try {
                            int iA = ((bj.a) k0Var.f47269b).a();
                            if (iA == 0) {
                                i10 = 0;
                            } else if (iA == 1) {
                                i10 = 1;
                            } else if (iA != 2) {
                                i10 = 3;
                            }
                            ((j) oVar).a(Integer.valueOf(i10));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e12) {
                            ((j) oVar).b("error", e12.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.setContentSensitivity":
                        int iIntValue = ((Integer) mVar.f53823b).intValue();
                        try {
                            bj.a aVar = (bj.a) k0Var.f47269b;
                            if (iIntValue == 0) {
                                i10 = 0;
                            } else if (iIntValue == 1) {
                                i10 = 1;
                            } else if (iIntValue != 2) {
                                throw new IllegalArgumentException(e.h(iIntValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                            }
                            aVar.b(i10);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e13) {
                            ((j) oVar).b("error", e13.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.isSupported":
                        ((bj.a) k0Var.f47269b).getClass();
                        ((j) oVar).a(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        ((j) oVar).c();
                        return;
                }
        }
    }

    @Override // rl.k
    public void p(f fVar, Object obj) {
        d dVar = (d) this.f49529b;
        String strB = fVar.b();
        if (CampaignEx.JSON_KEY_AD_K.equals(strB)) {
            if (obj instanceof Integer) {
                sl.a aVar = (sl.a) sl.a.f50257b.get((Integer) obj);
                if (aVar == null) {
                    aVar = sl.a.UNKNOWN;
                }
                dVar.f50278g = aVar;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                dVar.f50272a = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    dVar.f50273b = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                dVar.f50274c = ((Integer) obj).intValue();
            }
        }
    }

    public void q() {
        long j10;
        s1.f fVar = (s1.f) this.f49529b;
        synchronized (k2.b.f44265b) {
            try {
                j10 = k2.b.f44266c ? k2.b.f44267d : C.TIME_UNSET;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fVar.K = j10;
        fVar.B(true);
    }

    public void r() {
        v1.l lVar = (v1.l) this.f49529b;
        int i10 = lVar.f52364r - 1;
        lVar.f52364r = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (r rVar : lVar.f52366t) {
            rVar.i();
            i11 += rVar.I.f40386a;
        }
        q0[] q0VarArr = new q0[i11];
        int i12 = 0;
        for (r rVar2 : lVar.f52366t) {
            rVar2.i();
            int i13 = rVar2.I.f40386a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.i();
                q0VarArr[i12] = rVar2.I.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.f52365s = new k1(q0VarArr);
        lVar.f52363q.j(lVar);
    }

    public String toString() {
        switch (this.f49528a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                ml.r rVar = (ml.r) this.f49529b;
                sb2.append(rVar);
                sb2.append(": ");
                sb2.append(((Map) j1.f.w(rVar.f46234i, ml.r.f46231m[0])).keySet());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // rl.k
    public k z(yl.b bVar, f fVar) {
        return null;
    }

    public c(AppMeasurementSdk appMeasurementSdk, v6.c cVar) {
        this.f49528a = 0;
        this.f49529b = cVar;
        appMeasurementSdk.a(new b(this, 1));
    }

    public c(n.j jVar, int i10) {
        this.f49528a = i10;
        switch (i10) {
            case 19:
                this.f49529b = new k5.g(jVar, "flutter/system", xi.j.f53820a, (Object) null);
                break;
            default:
                v1.j jVar2 = new v1.j(4);
                p pVar = new p(jVar, "flutter/navigation", xi.k.f53821a);
                this.f49529b = pVar;
                pVar.b(jVar2);
                break;
        }
    }

    public c(xi.f fVar) {
        this.f49528a = 15;
        v6.c cVar = new v6.c();
        cVar.f52488b = this;
        cVar.f52487a = new HashMap();
        new p(fVar, "flutter/keyboard", v.f53830b).b(cVar);
    }

    public c(int i10) {
        this.f49528a = i10;
        switch (i10) {
            case 8:
                this.f49529b = new yg.b();
                break;
            case 9:
                this.f49529b = new ConcurrentHashMap(16);
                break;
            default:
                this.f49529b = new q();
                break;
        }
    }

    @Override // y1.k
    public void a() {
    }

    @Override // y1.k
    public void flush() {
    }

    @Override // rl.k
    public void k() {
    }

    @Override // y1.k
    public void shutdown() {
    }

    @Override // y1.k
    public void start() {
    }

    public c(TextView textView) {
        this.f49528a = 22;
        this.f49529b = new z0.g(textView);
    }

    @Override // rl.k
    public void u(f fVar, dm.f fVar2) {
    }

    @Override // rl.k
    public void w(f fVar, yl.b bVar, f fVar2) {
    }
}
