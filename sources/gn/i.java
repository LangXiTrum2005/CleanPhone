package gn;

import cn.a0;
import fn.l0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f42000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public en.i f42001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f42002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42005k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f42006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fn.e[] f42007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0 f42008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ fn.f f42009p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fn.e[] eVarArr, l0 l0Var, fn.f fVar, ak.f fVar2) {
        super(2, fVar2);
        this.f42007n = eVarArr;
        this.f42008o = l0Var;
        this.f42009p = fVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        i iVar = new i(this.f42007n, this.f42008o, this.f42009p, fVar);
        iVar.f42006m = obj;
        return iVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[DONT_INVERT, EDGE_INSN: B:40:0x00c0->B:18:0x0079 BREAK  A[LOOP:0: B:29:0x009f->B:46:?]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:29:0x009f->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00da -> B:18:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ck.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
