package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tt0 implements et0, Continuation, q81, p81, ye1, ij1, fj1, yi1, ii1, gi1, aj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20501k;
    public static final /* synthetic */ tt0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20510u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ tt0 f20513x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20514a;

    static {
        byte b10 = 0;
        f20492b = new tt0(b10, 0);
        f20493c = new tt0(b10, 1);
        f20494d = new tt0(b10, 2);
        f20495e = new tt0(b10, 9);
        f20496f = new tt0(b10, 11);
        f20497g = new tt0(b10, 12);
        f20498h = new tt0(b10, 13);
        f20499i = new tt0(b10, 14);
        f20500j = new tt0(b10, 15);
        f20501k = new tt0(b10, 16);
        l = new tt0(b10, 17);
        f20502m = new tt0(b10, 18);
        f20503n = new tt0(b10, 19);
        f20504o = new tt0(b10, 20);
        f20505p = new tt0(b10, 21);
        f20506q = new tt0(b10, 22);
        f20507r = new tt0(b10, 23);
        f20508s = new tt0(b10, 24);
        f20509t = new tt0(b10, 25);
        f20510u = new tt0(b10, 26);
        f20511v = new tt0(b10, 27);
        f20512w = new tt0(b10, 28);
        f20513x = new tt0(b10, 29);
    }

    public /* synthetic */ tt0(byte b10, int i10) {
        this.f20514a = i10;
    }

    @Override // com.google.android.gms.internal.ads.ye1
    public Object a(iw0 iw0Var, Class cls) throws GeneralSecurityException {
        switch (this.f20514a) {
            case 8:
                hj1 hj1Var = (hj1) ui1.f20803b.f20804a.get();
                HashMap map = hj1Var.f15315b;
                if (!map.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                }
                jj1 jj1Var = (jj1) map.get(cls);
                return jj1Var.a(iw0Var, new iw0(8, hj1Var, jj1Var));
            default:
                if (cls == xe1.class) {
                    return cls.cast(ic1.a(iw0Var, f20495e));
                }
                throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
        }
    }

    @Override // com.google.android.gms.internal.ads.fj1, com.google.android.gms.internal.ads.ii1
    public kj1 c(jc1 jc1Var) {
        switch (this.f20514a) {
            case 20:
                kg1 kg1Var = (kg1) jc1Var;
                zi1 zi1Var = mg1.f17441a;
                gn1 gn1VarC = hn1.C();
                in1 in1VarB = jn1.B();
                String str = kg1Var.f16441b.f16986a;
                in1VarB.b();
                ((jn1) in1VarB.f19193b).D(str);
                jn1 jn1Var = (jn1) in1VarB.e();
                gn1VarC.b();
                ((hn1) gn1VarC.f19193b).E(jn1Var);
                return kj1.t("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((hn1) gn1VarC.e()).a(), 5, mg1.a(kg1Var.f16441b.f16987b), kg1Var.f16443d);
            default:
                ng1 ng1Var = (ng1) jc1Var;
                zi1 zi1Var2 = pg1.f18646a;
                kn1 kn1VarC = ln1.C();
                nn1 nn1VarB = pg1.b(ng1Var.f17823b);
                kn1VarC.b();
                ((ln1) kn1VarC.f19193b).E(nn1VarB);
                return kj1.t("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((ln1) kn1VarC.e()).a(), 5, pg1.a(ng1Var.f17823b.f18267a), ng1Var.f17825d);
        }
    }

    @Override // com.google.android.gms.internal.ads.gi1
    public jc1 d(kj1 kj1Var) throws GeneralSecurityException {
        switch (this.f20514a) {
            case 21:
                zi1 zi1Var = mg1.f17441a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var = (cs1) kj1Var.f16465d;
                    ks1 ks1Var = ks1.f16518a;
                    int i10 = tr1.f20473a;
                    hn1 hn1VarB = hn1.B(cs1Var, ks1.f16519b);
                    if (hn1VarB.z() == 0) {
                        return kg1.k(new lg1(hn1VarB.A().z(), mg1.b((on1) kj1Var.f16466e)), (Integer) kj1Var.f16467f);
                    }
                    String strValueOf = String.valueOf(hn1VarB);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                    sb2.append("KmsAeadKey are only accepted with version 0, got ");
                    sb2.append(strValueOf);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (et1 e10) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
                }
            default:
                zi1 zi1Var2 = pg1.f18646a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var2 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var2 = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    ln1 ln1VarB = ln1.B(cs1Var2, ks1.f16519b);
                    if (ln1VarB.z() == 0) {
                        return ng1.k(pg1.c(ln1VarB.A(), (on1) kj1Var.f16466e), (Integer) kj1Var.f16467f);
                    }
                    String strValueOf2 = String.valueOf(ln1VarB);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 58);
                    sb3.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb3.append(strValueOf2);
                    throw new GeneralSecurityException(sb3.toString());
                } catch (et1 e11) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public Iterator e(t6.l lVar, CharSequence charSequence) {
        return new m81(lVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.ij1
    public Object f(cf1 cf1Var) throws GeneralSecurityException {
        jc1 jc1Var = cf1Var.f13153a;
        if (jc1Var instanceof of1) {
            return oq1.b((of1) jc1Var);
        }
        if (jc1Var instanceof zf1) {
            zf1 zf1Var = (zf1) jc1Var;
            return new lh1(((zq1) zf1Var.f22599c.f20839b).b(), zf1Var.f22600d);
        }
        if (jc1Var instanceof cg1) {
            return sh1.b((cg1) jc1Var);
        }
        if (jc1Var instanceof vf1) {
            return jq1.b((vf1) jc1Var);
        }
        if (jc1Var instanceof fg1) {
            fg1 fg1Var = (fg1) jc1Var;
            zq1 zq1Var = fg1Var.f14407d;
            uo0 uo0Var = fg1Var.f14406c;
            try {
                fh1.b();
                return new fh1(((zq1) uo0Var.f20839b).b(), zq1Var.b(), fh1.b().getProvider());
            } catch (GeneralSecurityException unused) {
                return new lh1(((zq1) uo0Var.f20839b).b(), 2, zq1Var.b());
            }
        }
        if (!(jc1Var instanceof ug1)) {
            if (!(jc1Var instanceof rg1)) {
                throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(jc1Var.getClass())));
            }
            rg1 rg1Var = (rg1) jc1Var;
            return new oh1(((zq1) rg1Var.f19587c.f20839b).b(), rg1Var.f19588d, rg1Var.f19586b.f20381b);
        }
        ug1 ug1Var = (ug1) jc1Var;
        zq1 zq1Var2 = ug1Var.f20789d;
        uo0 uo0Var2 = ug1Var.f20788c;
        try {
            fh1.b();
            return new qh1(((zq1) uo0Var2.f20839b).b(), zq1Var2.b(), fh1.b().getProvider());
        } catch (GeneralSecurityException unused2) {
            return new lh1(((zq1) uo0Var2.f20839b).b(), 3, zq1Var2.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.yi1
    public ff1 g(lj1 lj1Var) throws GeneralSecurityException {
        switch (this.f20514a) {
            case 19:
                zi1 zi1Var = mg1.f17441a;
                wm1 wm1Var = (wm1) lj1Var.f17037c;
                if (!wm1Var.z().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var.z())));
                }
                try {
                    cs1 cs1VarA = wm1Var.A();
                    ks1 ks1Var = ks1.f16518a;
                    int i10 = tr1.f20473a;
                    return new lg1(jn1.A(cs1VarA, ks1.f16519b).z(), mg1.b(wm1Var.B()));
                } catch (et1 e10) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
                }
            case 23:
                zi1 zi1Var2 = pg1.f18646a;
                wm1 wm1Var2 = (wm1) lj1Var.f17037c;
                if (!wm1Var2.z().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var2.z())));
                }
                try {
                    cs1 cs1VarA2 = wm1Var2.A();
                    ks1 ks1Var2 = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    return pg1.c(nn1.B(cs1VarA2, ks1.f16519b), wm1Var2.B());
                } catch (et1 e11) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e11);
                }
            default:
                zi1 zi1Var3 = zg1.f22604a;
                wm1 wm1Var3 = (wm1) lj1Var.f17037c;
                if (!wm1Var3.z().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var3.z())));
                }
                try {
                    cs1 cs1VarA3 = wm1Var3.A();
                    ks1 ks1Var3 = ks1.f16518a;
                    int i12 = tr1.f20473a;
                    al1 al1VarB = al1.B(cs1VarA3, ks1.f16519b);
                    if (al1VarB.A().B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    v90 v90Var = new v90();
                    v90Var.b(al1VarB.z().A());
                    v90Var.f(al1VarB.A().A());
                    v90Var.h(al1VarB.z().z().z());
                    v90Var.i(al1VarB.A().z().A());
                    v90Var.f21139e = zg1.c(al1VarB.A().z().z());
                    v90Var.f21140f = zg1.b(wm1Var3.B());
                    return v90Var.j();
                } catch (et1 e12) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.aj1
    public lj1 h(ff1 ff1Var) {
        switch (this.f20514a) {
            case 22:
                lg1 lg1Var = (lg1) ff1Var;
                zi1 zi1Var = mg1.f17441a;
                vm1 vm1VarD = wm1.D();
                vm1VarD.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                in1 in1VarB = jn1.B();
                String str = lg1Var.f16986a;
                in1VarB.b();
                ((jn1) in1VarB.f19193b).D(str);
                vm1VarD.i(((jn1) in1VarB.e()).a());
                vm1VarD.j(mg1.a(lg1Var.f16987b));
                return lj1.f((wm1) vm1VarD.e());
            default:
                og1 og1Var = (og1) ff1Var;
                zi1 zi1Var2 = pg1.f18646a;
                vm1 vm1VarD2 = wm1.D();
                vm1VarD2.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                vm1VarD2.i(pg1.b(og1Var).a());
                vm1VarD2.j(pg1.a(og1Var.f18267a));
                return lj1.f((wm1) vm1VarD2.e());
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }

    @Override // com.google.android.gms.internal.ads.et0
    public /* synthetic */ void zza(Object obj) {
        ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
    }

    public tt0(int i10) {
        this.f20514a = 5;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        switch (this.f20514a) {
            case 2:
                return -1;
            case 3:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    @Override // com.google.android.gms.internal.ads.fj1, com.google.android.gms.internal.ads.ii1
    public Object c(jc1 jc1Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f20514a) {
            case 11:
                kj1 kj1Var = ((ni1) jc1Var).f17836b;
                int[] iArr = li1.f17010b;
                int i10 = kj1Var.f16462a;
                Integer num = (Integer) kj1Var.f16467f;
                int i11 = iArr[v0.i.c(i10)];
                xe1 xe1Var = (xe1) ei1.f13985d.b(xe1.class, (String) kj1Var.f16463b).a((cs1) kj1Var.f16465d);
                on1 on1Var = (on1) kj1Var.f16466e;
                int iOrdinal = on1Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = wi1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = wi1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    bArrB = wi1.f21526a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(on1Var)));
                    }
                    bArrB = wi1.a(num.intValue()).b();
                }
                return new lh1(xe1Var, bArrB);
            case 12:
                return oq1.b((of1) jc1Var);
            case 13:
                return jq1.b((vf1) jc1Var);
            case 14:
                zf1 zf1Var = (zf1) jc1Var;
                zf1Var.getClass();
                return new lh1(((zq1) zf1Var.f22599c.f20839b).b(), zf1Var.f22600d);
            case 15:
                return sh1.b((cg1) jc1Var);
            case 16:
                fg1 fg1Var = (fg1) jc1Var;
                ej1 ej1Var = gg1.f14854a;
                try {
                    fh1.b();
                    return new fh1(((zq1) fg1Var.f14406c.f20839b).b(), fg1Var.f14407d.b(), fh1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new lh1(((zq1) fg1Var.f14406c.f20839b).b(), 2, fg1Var.f14407d.b());
                }
            case 17:
                ej1 ej1Var2 = ig1.f15739a;
                df1.a(((kg1) jc1Var).f16441b.f16986a);
                throw null;
            case 18:
                ki1 ki1Var = jg1.f16092a;
                df1.a(((ng1) jc1Var).f17823b.f18268b);
                throw null;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            default:
                ug1 ug1Var = (ug1) jc1Var;
                ej1 ej1Var3 = vg1.f21167a;
                try {
                    fh1.b();
                    return new qh1(((zq1) ug1Var.f20788c.f20839b).b(), ug1Var.f20789d.b(), fh1.b().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new lh1(((zq1) ug1Var.f20788c.f20839b).b(), 3, ug1Var.f20789d.b());
                }
            case 27:
                rg1 rg1Var = (rg1) jc1Var;
                rg1Var.getClass();
                return new oh1(((zq1) rg1Var.f19587c.f20839b).b(), rg1Var.f19588d, rg1Var.f19586b.f20381b);
        }
    }
}
