package bb;

import eb.c0;
import eb.d0;
import eb.j0;
import eb.o;
import fb.j;
import g9.k;
import java.security.GeneralSecurityException;
import jb.a1;
import jb.s1;
import jb.v0;
import jb.w0;
import jb.x0;
import jb.z0;
import qk.i0;
import r1.s;
import va.i;
import wa.b0;
import wa.f0;
import wa.h0;
import wa.k0;
import wa.l;
import wa.r;
import wa.u;
import wa.y;
import wa.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5515a;

    public final i0 a(i iVar, Integer num) throws GeneralSecurityException {
        switch (this.f5515a) {
            case 0:
                e eVar = (e) iVar;
                c.a(eVar);
                k kVar = new k(3);
                kVar.f41771c = null;
                kVar.f41770b = eVar;
                kVar.f41772d = num;
                kVar.f41771c = s4.i.o(eVar.f5524a);
                return kVar.d();
            case 1:
                a1 a1Var = (a1) ((eb.i) iVar).f39989a.f39977c;
                eb.a aVar = eb.a.f39960d;
                eb.f fVarB = aVar.b(a1Var.D());
                if (!((Boolean) aVar.f39962b.get(a1Var.D())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                com.google.crypto.tink.shaded.protobuf.i iVarE = a1Var.E();
                fVarB.getClass();
                z0 z0VarF = a1.F();
                z0VarF.i(fVarB.f39979a);
                z0VarF.j(iVarE);
                z0VarF.h(s1.RAW);
                a1 a1Var2 = (a1) z0VarF.a();
                d0 d0Var = new d0(0, a1Var2, j0.a(a1Var2.D()));
                o oVar = o.f40004b;
                c0 c0Var = (c0) oVar.g(eb.k.f39996b.b(oVar.b(d0Var), null));
                v0 v0VarF = x0.F();
                String str = c0Var.f39967a;
                v0VarF.e();
                x0.y((x0) v0VarF.f24645b, str);
                com.google.crypto.tink.shaded.protobuf.i iVar2 = c0Var.f39969c;
                v0VarF.e();
                x0.z((x0) v0VarF.f24645b, iVar2);
                w0 w0Var = c0Var.f39970d;
                v0VarF.e();
                x0.A((x0) v0VarF.f24645b, w0Var);
                x0 x0Var = (x0) v0VarF.a();
                return new eb.h(c0.a(x0Var.D(), x0Var.E(), x0Var.C(), a1Var.C(), num));
            case 2:
                fb.d dVar = (fb.d) iVar;
                int i10 = dVar.f40731a;
                if (i10 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                v9.e eVar2 = new v9.e(14, false);
                eVar2.f52504c = null;
                eVar2.f52505d = null;
                eVar2.f52503b = dVar;
                eVar2.f52504c = s4.i.o(i10);
                eVar2.f52505d = num;
                return eVar2.w();
            case 3:
                j jVar = (j) iVar;
                v9.e eVar3 = new v9.e(15, false);
                eVar3.f52504c = null;
                eVar3.f52505d = null;
                eVar3.f52503b = jVar;
                eVar3.f52504c = s4.i.o(jVar.f40759a);
                eVar3.f52505d = num;
                return eVar3.x();
            case 4:
                wa.i iVar3 = (wa.i) iVar;
                int i11 = iVar3.f53072a;
                if (i11 != 16 && i11 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                k5.g gVar = new k5.g();
                gVar.f44326b = null;
                gVar.f44327c = null;
                gVar.f44325a = iVar3;
                gVar.f44328d = num;
                gVar.f44326b = s4.i.o(i11);
                gVar.f44327c = s4.i.o(iVar3.f53073b);
                return gVar.j();
            case 5:
                l lVar = (l) iVar;
                int i12 = lVar.f53094a;
                if (i12 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                s sVar = new s(7);
                sVar.f49339c = null;
                sVar.f49338b = lVar;
                sVar.f49340d = num;
                sVar.f49339c = s4.i.o(i12);
                return sVar.d();
            case 6:
                wa.o oVar2 = (wa.o) iVar;
                int i13 = oVar2.f53107a;
                if (i13 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                qd.i iVar4 = new qd.i();
                iVar4.f48981c = null;
                iVar4.f48980b = oVar2;
                iVar4.f48982d = num;
                iVar4.f48981c = s4.i.o(i13);
                return iVar4.k();
            case 7:
                r rVar = (r) iVar;
                s sVar2 = new s(8);
                sVar2.f49339c = null;
                sVar2.f49338b = rVar;
                sVar2.f49340d = num;
                sVar2.f49339c = s4.i.o(rVar.f53119a);
                return sVar2.e();
            case 8:
                return wa.s.u0(((u) iVar).f53128a, s4.i.o(32), num);
            case 9:
                return y.u0((z) iVar, num);
            case 10:
                return b0.u0((wa.c0) iVar, num);
            case 11:
                return f0.u0((h0) iVar, s4.i.o(32), num);
            default:
                return wa.i0.u0(((k0) iVar).f53093a, s4.i.o(32), num);
        }
    }
}
