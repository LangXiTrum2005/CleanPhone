package xa;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.ironsource.InterfaceC0435l1;
import eb.c0;
import eb.f0;
import eb.r;
import eb.t;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import jb.a0;
import jb.a1;
import jb.a2;
import jb.b0;
import jb.b2;
import jb.c2;
import jb.j0;
import jb.l0;
import jb.u1;
import jb.v;
import jb.v1;
import jb.w;
import jb.w0;
import jb.w1;
import jb.x;
import jb.x1;
import jb.y;
import jb.y1;
import jb.z;
import jb.z0;
import jb.z1;
import qk.i0;
import r1.s;
import wa.h0;
import wa.k0;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements r, eb.e, eb.c, t, y8.f, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53682a;

    public /* synthetic */ b(int i10) {
        this.f53682a = i10;
    }

    public static Cipher c() {
        try {
            Cipher cipher = (Cipher) ya.a.f54353a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }

    @Override // eb.c
    public i0 a(f0 f0Var) throws GeneralSecurityException {
        c0 c0Var = (c0) f0Var;
        switch (this.f53682a) {
            case 2:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    jb.r rVarE = jb.r.E(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (rVarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    u uVarB = wa.l.b();
                    uVarB.G(rVarE.A().size());
                    uVarB.F(rVarE.B().A());
                    uVarB.H();
                    uVarB.f54882e = c.c(c0Var.f39971e);
                    wa.l lVarM = uVarB.m();
                    s sVar = new s(7);
                    sVar.f49339c = null;
                    sVar.f49340d = null;
                    sVar.f49338b = lVarM;
                    sVar.f49339c = new s4.i(lb.a.a(rVarE.A().q()));
                    sVar.f49340d = c0Var.f39972f;
                    return sVar.d();
                } catch (d0 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            case 6:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    x xVarC = x.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (xVarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    k5.g gVarB = wa.o.b();
                    gVarB.B(xVarC.z().size());
                    gVarB.A();
                    gVarB.D();
                    gVarB.f44328d = e.b(c0Var.f39971e);
                    wa.o oVarM = gVarB.m();
                    qd.i iVar = new qd.i();
                    iVar.f48981c = null;
                    iVar.f48982d = null;
                    iVar.f48980b = oVarM;
                    iVar.f48981c = new s4.i(lb.a.a(xVarC.z().q()));
                    iVar.f48982d = c0Var.f39972f;
                    return iVar.k();
                } catch (d0 unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 10:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    b0 b0VarC = b0.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (b0VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    v6.c cVarB = wa.r.b();
                    cVarB.q(b0VarC.z().size());
                    cVarB.f52488b = g.b(c0Var.f39971e);
                    wa.r rVarN = cVarB.n();
                    s sVar2 = new s(8);
                    sVar2.f49339c = null;
                    sVar2.f49340d = null;
                    sVar2.f49338b = rVarN;
                    sVar2.f49339c = new s4.i(lb.a.a(b0VarC.z().q()));
                    sVar2.f49340d = c0Var.f39972f;
                    return sVar2.e();
                } catch (d0 unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 14:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    j0 j0VarC = j0.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (j0VarC.A() == 0) {
                        return wa.s.u0(i.b(c0Var.f39971e), new s4.i(lb.a.a(j0VarC.z().q())), c0Var.f39972f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (d0 unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 18:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    v1 v1VarE = v1.E(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (v1VarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (v1VarE.A().size() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    return wa.f0.u0(h0.b(v1VarE.B().A(), o.b(c0Var.f39971e)), new s4.i(lb.a.a(v1VarE.A().q())), c0Var.f39972f);
                } catch (d0 unused5) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            default:
                if (!c0Var.f39967a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    b2 b2VarC = b2.C(c0Var.f39969c, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (b2VarC.A() == 0) {
                        return wa.i0.u0(q.b(c0Var.f39971e), new s4.i(lb.a.a(b2VarC.z().q())), c0Var.f39972f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (d0 unused6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // y8.f
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            Cursor cursor = cursorRawQuery;
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                s sVarA = r8.i.a();
                sVarA.n(cursor.getString(1));
                sVarA.f49340d = b9.a.b(cursor.getInt(2));
                String string = cursor.getString(3);
                sVarA.f49339c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(sVarA.c());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // eb.r
    public va.i b(eb.d0 d0Var) throws GeneralSecurityException {
        switch (this.f53682a) {
            case 0:
                a1 a1Var = (a1) d0Var.f39977c;
                if (!a1Var.D().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + a1Var.D());
                }
                try {
                    jb.t tVarD = jb.t.D(a1Var.E(), com.google.crypto.tink.shaded.protobuf.p.a());
                    u uVarB = wa.l.b();
                    uVarB.G(tVarD.A());
                    uVarB.F(tVarD.B().A());
                    uVarB.H();
                    uVarB.f54882e = c.c(a1Var.C());
                    return uVarB.m();
                } catch (d0 e10) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
                }
            case 4:
                a1 a1Var2 = (a1) d0Var.f39977c;
                if (!a1Var2.D().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + a1Var2.D());
                }
                try {
                    z zVarC = z.C(a1Var2.E(), com.google.crypto.tink.shaded.protobuf.p.a());
                    if (zVarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    k5.g gVarB = wa.o.b();
                    gVarB.B(zVarC.z());
                    gVarB.A();
                    gVarB.D();
                    gVarB.f44328d = e.b(a1Var2.C());
                    return gVarB.m();
                } catch (d0 e11) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e11);
                }
            case 8:
                a1 a1Var3 = (a1) d0Var.f39977c;
                if (!a1Var3.D().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + a1Var3.D());
                }
                try {
                    jb.d0 d0VarC = jb.d0.C(a1Var3.E(), com.google.crypto.tink.shaded.protobuf.p.a());
                    if (d0VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    v6.c cVarB = wa.r.b();
                    cVarB.q(d0VarC.z());
                    cVarB.f52488b = g.b(a1Var3.C());
                    return cVarB.n();
                } catch (d0 e12) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e12);
                }
            case 12:
                a1 a1Var4 = (a1) d0Var.f39977c;
                if (!a1Var4.D().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + a1Var4.D());
                }
                try {
                    l0.z(a1Var4.E(), com.google.crypto.tink.shaded.protobuf.p.a());
                    return new wa.u(i.b(a1Var4.C()));
                } catch (d0 e13) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e13);
                }
            case 16:
                a1 a1Var5 = (a1) d0Var.f39977c;
                if (!a1Var5.D().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + a1Var5.D());
                }
                try {
                    x1 x1VarC = x1.C(a1Var5.E(), com.google.crypto.tink.shaded.protobuf.p.a());
                    if (x1VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    return h0.b(x1VarC.z().A(), o.b(a1Var5.C()));
                } catch (d0 e14) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e14);
                }
            default:
                a1 a1Var6 = (a1) d0Var.f39977c;
                if (!a1Var6.D().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + a1Var6.D());
                }
                try {
                    if (c2.A(a1Var6.E(), com.google.crypto.tink.shaded.protobuf.p.a()).z() == 0) {
                        return new k0(q.b(a1Var6.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (d0 e15) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e15);
                }
        }
    }

    @Override // eb.t
    public eb.d0 f(va.i iVar) {
        switch (this.f53682a) {
            case 3:
                wa.o oVar = (wa.o) iVar;
                e.c(oVar);
                z0 z0VarF = a1.F();
                z0VarF.i("type.googleapis.com/google.crypto.tink.AesGcmKey");
                y yVarB = z.B();
                int i10 = oVar.f53107a;
                yVarB.e();
                z.y((z) yVarB.f24645b, i10);
                z0VarF.j(((z) yVarB.a()).e());
                z0VarF.h(e.a(oVar.f53110d));
                return eb.d0.R0((a1) z0VarF.a());
            case 7:
                wa.r rVar = (wa.r) iVar;
                z0 z0VarF2 = a1.F();
                z0VarF2.i("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                jb.c0 c0VarB = jb.d0.B();
                int i11 = rVar.f53119a;
                c0VarB.e();
                jb.d0.y((jb.d0) c0VarB.f24645b, i11);
                z0VarF2.j(((jb.d0) c0VarB.a()).e());
                z0VarF2.h(g.a(rVar.f53120b));
                return eb.d0.R0((a1) z0VarF2.a());
            case 11:
                z0 z0VarF3 = a1.F();
                z0VarF3.i("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                z0VarF3.j(l0.y().e());
                z0VarF3.h(i.a(((wa.u) iVar).f53128a));
                return eb.d0.R0((a1) z0VarF3.a());
            case 15:
                h0 h0Var = (h0) iVar;
                z0 z0VarF4 = a1.F();
                z0VarF4.i("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                w1 w1VarB = x1.B();
                y1 y1VarB = z1.B();
                int i12 = h0Var.f53071b;
                y1VarB.e();
                z1.y((z1) y1VarB.f24645b, i12);
                z1 z1Var = (z1) y1VarB.a();
                w1VarB.e();
                x1.y((x1) w1VarB.f24645b, z1Var);
                z0VarF4.j(((x1) w1VarB.a()).e());
                z0VarF4.h(o.a(h0Var.f53070a));
                return eb.d0.R0((a1) z0VarF4.a());
            default:
                z0 z0VarF5 = a1.F();
                z0VarF5.i("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                z0VarF5.j(c2.y().e());
                z0VarF5.h(q.a(((k0) iVar).f53093a));
                return eb.d0.R0((a1) z0VarF5.a());
        }
    }

    @Override // eb.e
    public c0 h(i0 i0Var) {
        switch (this.f53682a) {
            case 1:
                wa.j jVar = (wa.j) i0Var;
                jb.q qVarD = jb.r.D();
                v vVarA = c.a(jVar.f53082b);
                qVarD.e();
                jb.r.y((jb.r) qVarD.f24645b, vVarA);
                byte[] bArrB = ((lb.a) jVar.f53083c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM = com.google.crypto.tink.shaded.protobuf.i.m(bArrB, 0, bArrB.length);
                qVarD.e();
                jb.r.z((jb.r) qVarD.f24645b, hVarM);
                return c0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((jb.r) qVarD.a()).e(), w0.SYMMETRIC, c.b(jVar.f53082b.f53097d), jVar.f53085e);
            case 5:
                wa.m mVar = (wa.m) i0Var;
                e.c(mVar.f53098b);
                w wVarB = x.B();
                byte[] bArrB2 = ((lb.a) mVar.f53099c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM2 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB2, 0, bArrB2.length);
                wVarB.e();
                x.y((x) wVarB.f24645b, hVarM2);
                return c0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((x) wVarB.a()).e(), w0.SYMMETRIC, e.a(mVar.f53098b.f53110d), mVar.f53101e);
            case 9:
                wa.p pVar = (wa.p) i0Var;
                a0 a0VarB = b0.B();
                byte[] bArrB3 = ((lb.a) pVar.f53112c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM3 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB3, 0, bArrB3.length);
                a0VarB.e();
                b0.y((b0) a0VarB.f24645b, hVarM3);
                return c0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((b0) a0VarB.a()).e(), w0.SYMMETRIC, g.a(pVar.f53111b.f53120b), pVar.f53114e);
            case 13:
                wa.s sVar = (wa.s) i0Var;
                jb.i0 i0VarB = j0.B();
                byte[] bArrB4 = ((lb.a) sVar.f53122c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM4 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB4, 0, bArrB4.length);
                i0VarB.e();
                j0.y((j0) i0VarB.f24645b, hVarM4);
                return c0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((j0) i0VarB.a()).e(), w0.SYMMETRIC, i.a(sVar.f53121b.f53128a), sVar.f53124e);
            case 17:
                wa.f0 f0Var = (wa.f0) i0Var;
                u1 u1VarD = v1.D();
                byte[] bArrB5 = ((lb.a) f0Var.f53035c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM5 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB5, 0, bArrB5.length);
                u1VarD.e();
                v1.z((v1) u1VarD.f24645b, hVarM5);
                y1 y1VarB = z1.B();
                h0 h0Var = f0Var.f53034b;
                int i10 = h0Var.f53071b;
                y1VarB.e();
                z1.y((z1) y1VarB.f24645b, i10);
                z1 z1Var = (z1) y1VarB.a();
                u1VarD.e();
                v1.y((v1) u1VarD.f24645b, z1Var);
                return c0.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((v1) u1VarD.a()).e(), w0.SYMMETRIC, o.a(h0Var.f53070a), f0Var.f53037e);
            default:
                wa.i0 i0Var2 = (wa.i0) i0Var;
                a2 a2VarB = b2.B();
                byte[] bArrB6 = ((lb.a) i0Var2.f53079c.f50111a).b();
                com.google.crypto.tink.shaded.protobuf.h hVarM6 = com.google.crypto.tink.shaded.protobuf.i.m(bArrB6, 0, bArrB6.length);
                a2VarB.e();
                b2.y((b2) a2VarB.f24645b, hVarM6);
                return c0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((b2) a2VarB.a()).e(), w0.SYMMETRIC, q.a(i0Var2.f53078b.f53093a), i0Var2.f53081e);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        switch (this.f53682a) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                if (task.isSuccessful()) {
                    zb.a aVar = (zb.a) task.getResult();
                    String str = "Crashlytics report successfully enqueued to DataTransport: " + aVar.f54670b;
                    wb.c cVar = wb.c.f53149a;
                    cVar.b(str);
                    File file = aVar.f54671c;
                    z10 = true;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return Integer.valueOf(InterfaceC0435l1.a.b.f29083c);
        }
    }

    public /* synthetic */ b(fc.f fVar) {
        this.f53682a = 28;
    }
}
