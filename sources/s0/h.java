package s0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f49813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f49814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f49815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f49817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f49818k;
    public final /* synthetic */ ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, ArrayList arrayList, ak.f fVar) {
        super(2, fVar);
        this.f49818k = list;
        this.l = arrayList;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        h hVar = new h(this.f49818k, this.l, fVar);
        hVar.f49817j = obj;
        return hVar;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create(obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ck.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f49816i
            r1 = 2
            r2 = 1
            bk.a r3 = bk.a.f5708a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            java.util.Iterator r0 = r10.f49813f
            java.lang.Object r4 = r10.f49817j
            java.util.List r4 = (java.util.List) r4
            t9.e.z(r11)
            goto L3e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1e:
            java.lang.Object r0 = r10.f49815h
            s0.e r4 = r10.f49814g
            java.util.Iterator r5 = r10.f49813f
            java.lang.Object r6 = r10.f49817j
            java.util.List r6 = (java.util.List) r6
            t9.e.z(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L60
        L2f:
            t9.e.z(r11)
            java.lang.Object r11 = r10.f49817j
            java.util.List r0 = r10.f49818k
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r4 = r10.l
        L3e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L87
            java.lang.Object r5 = r0.next()
            s0.e r5 = (s0.e) r5
            r10.f49817j = r4
            r10.f49813f = r0
            r10.f49814g = r5
            r10.f49815h = r11
            r10.f49816i = r2
            java.lang.Object r6 = r5.shouldMigrate(r11, r10)
            if (r6 != r3) goto L5b
            goto L82
        L5b:
            r9 = r0
            r0 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L85
            s0.g r11 = new s0.g
            r7 = 0
            r8 = 0
            r11.<init>(r6, r8, r7)
            r4.add(r11)
            r10.f49817j = r4
            r10.f49813f = r5
            r10.f49814g = r8
            r10.f49815h = r8
            r10.f49816i = r1
            java.lang.Object r11 = r6.migrate(r0, r10)
            if (r11 != r3) goto L83
        L82:
            return r3
        L83:
            r0 = r5
            goto L3e
        L85:
            r11 = r0
            goto L83
        L87:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
