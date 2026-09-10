package b4;

import ak.f;
import android.net.Uri;
import ck.i;
import cn.a0;
import com.google.android.gms.internal.ads.w11;
import fn.e;
import fn.u0;
import java.util.List;
import oa.k0;
import org.json.JSONObject;
import s0.e0;
import s0.m;
import s0.q0;
import ud.c1;
import ud.i0;
import ud.o;
import ud.w0;
import wj.r;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, f fVar, int i10) {
        super(2, fVar);
        this.f5486f = i10;
        this.f5489i = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [ck.i, jk.c] */
    @Override // ck.a
    public final f create(Object obj, f fVar) {
        switch (this.f5486f) {
            case 0:
                return new c((d) this.f5488h, (Uri) this.f5489i, fVar, 0);
            case 1:
                return new c((w11) this.f5488h, (String) this.f5489i, fVar, 1);
            case 2:
                return new c((List) this.f5488h, (ah.d) this.f5489i, fVar, 2);
            case 3:
                return new c((e) this.f5488h, (u0) this.f5489i, fVar, 3);
            case 4:
                c cVar = new c((fn.d) this.f5489i, fVar, 4);
                cVar.f5488h = obj;
                return cVar;
            case 5:
                c cVar2 = new c((fn.d) this.f5489i, fVar, 5);
                cVar2.f5488h = obj;
                return cVar2;
            case 6:
                c cVar3 = new c((fn.f) this.f5489i, fVar, 6);
                cVar3.f5488h = obj;
                return cVar3;
            case 7:
                return new c((jc.c) this.f5488h, (jk.b) this.f5489i, fVar, 7);
            case 8:
                c cVar4 = new c((List) this.f5489i, fVar, 8);
                cVar4.f5488h = obj;
                return cVar4;
            case 9:
                return new c((jk.c) this.f5488h, (s0.d) this.f5489i, fVar);
            case 10:
                c cVar5 = new c((e0) this.f5489i, fVar, 10);
                cVar5.f5488h = obj;
                return cVar5;
            case 11:
                return new c((u) this.f5489i, fVar, 11);
            case 12:
                return new c((k0) this.f5488h, (String) this.f5489i, this.f5487g, fVar);
            case 13:
                return new c((o) this.f5488h, (w0) this.f5489i, fVar, 13);
            case 14:
                return new c((c1) this.f5488h, (i0) this.f5489i, fVar, 14);
            case 15:
                return new c((e) this.f5488h, (l0.a) this.f5489i, fVar, 15);
            default:
                c cVar6 = new c((xd.c) this.f5489i, fVar, 16);
                cVar6.f5488h = obj;
                return cVar6;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5486f) {
            case 0:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 1:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 2:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 3:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 4:
                return ((c) create((en.r) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 5:
                return ((c) create((fn.f) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 6:
                return ((c) create(obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 7:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 8:
                return ((c) create((m) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 9:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 10:
                return ((c) create((q0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 11:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 12:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 13:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 14:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 15:
                return ((c) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            default:
                return ((c) create((JSONObject) obj, (f) obj2)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x027f  */
    /* JADX WARN: Code duplicated, block: B:166:0x031b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0331  */
    /* JADX WARN: Code duplicated, block: B:171:0x033b  */
    /* JADX WARN: Code duplicated, block: B:172:0x033d  */
    /* JADX WARN: Code duplicated, block: B:175:0x034a  */
    /* JADX WARN: Code duplicated, block: B:177:0x034e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0356  */
    /* JADX WARN: Code duplicated, block: B:183:0x035f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0377  */
    /* JADX WARN: Code duplicated, block: B:191:0x0379 A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0381 A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:198:0x039d A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:200:0x03b0 A[Catch: all -> 0x0374, TRY_LEAVE, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03cd A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:213:0x03d1 A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03d9 A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:219:0x03e2 A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:220:0x03ea A[Catch: all -> 0x0374, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:224:0x03f4 A[Catch: all -> 0x0374, TRY_LEAVE, TryCatch #3 {all -> 0x0374, blocks: (B:187:0x036f, B:191:0x0379, B:193:0x0381, B:194:0x0384, B:195:0x038a, B:197:0x0390, B:198:0x039d, B:200:0x03b0, B:208:0x03c5, B:210:0x03c9, B:211:0x03cd, B:213:0x03d1, B:215:0x03d9, B:217:0x03de, B:219:0x03e2, B:220:0x03ea, B:221:0x03ef, B:224:0x03f4), top: B:378:0x036f }] */
    /* JADX WARN: Code duplicated, block: B:228:0x0404  */
    /* JADX WARN: Code duplicated, block: B:231:0x040b  */
    /* JADX WARN: Code duplicated, block: B:378:0x036f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e8, code lost:
    
        if (r2.b(r18) == r9) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0415, code lost:
    
        if (r0.invoke(r2, r18) == r9) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
    
        if (r0.a(r8, r18) == r9) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ak.f] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:233:0x0415 -> B:235:0x0419). Please report as a decompilation issue!!! */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, f fVar, int i10) {
        super(2, fVar);
        this.f5486f = i10;
        this.f5488h = obj;
        this.f5489i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(jk.c cVar, s0.d dVar, f fVar) {
        super(2, fVar);
        this.f5486f = 9;
        this.f5488h = (i) cVar;
        this.f5489i = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k0 k0Var, String str, int i10, f fVar) {
        super(2, fVar);
        this.f5486f = 12;
        this.f5488h = k0Var;
        this.f5489i = str;
        this.f5487g = i10;
    }
}
