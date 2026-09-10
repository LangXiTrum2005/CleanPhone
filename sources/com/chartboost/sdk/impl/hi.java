package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di f14117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14118b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14119a = new a();

        public final void a(String str, int i2, ii context) {
            Intrinsics.f(context, "context");
            List<dh> listB = context.b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                for (dh dhVar : listB) {
                    if (Intrinsics.a(dhVar.a(), "error") && dhVar.c() == context.c() && Intrinsics.a(dhVar.e(), str) && Intrinsics.a(dhVar.b().get("VAST_ERROR_CODE"), Integer.valueOf(i2))) {
                        return;
                    }
                }
            }
            context.b().add(new dh("error", str, context.c(), null, MapsKt.i(new Pair("VAST_ERROR_CODE", Integer.valueOf(i2))), 8, null));
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14120b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14120b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = hi.this.a(null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14123c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f14124e;
        public Object f;
        public Object g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f14125h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f14126i;
        public /* synthetic */ Object j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f14127l;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.f14127l |= Integer.MIN_VALUE;
            Object objA = hi.this.a(null, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public hi(di vastFetcher, int i2) {
        Intrinsics.f(vastFetcher, "vastFetcher");
        this.f14117a = vastFetcher;
        this.f14118b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f14120b;
        Object obj2 = CoroutineSingletons.X;
        int i3 = bVar.d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return ((Result) obj).X;
        }
        ResultKt.b(obj);
        ii iiVar = new ii(this.f14117a, this.f14118b, 0, null, null, 24, null);
        bVar.d = 1;
        Object objA = a(str, iiVar, bVar);
        return objA == obj2 ? obj2 : objA;
    }

    public /* synthetic */ hi(di diVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(diVar, (i3 & 2) != 0 ? 10 : i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0346  */
    /* JADX WARN: Code duplicated, block: B:103:0x035a A[LOOP:8: B:101:0x0354->B:103:0x035a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x03a7 A[EDGE_INSN: B:107:0x03a7->B:108:0x03af BREAK  A[LOOP:2: B:53:0x01b7->B:139:0x04fb]] */
    /* JADX WARN: Code duplicated, block: B:154:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0200  */
    /* JADX WARN: Code duplicated, block: B:66:0x020c A[LOOP:3: B:64:0x0206->B:66:0x020c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x022d  */
    /* JADX WARN: Code duplicated, block: B:76:0x023b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0258  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x026d A[LOOP:4: B:79:0x0267->B:81:0x026d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x029c  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0305 A[LOOP:6: B:91:0x02ff->B:93:0x0305, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x032e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0332  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0420 -> B:13:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r31, com.chartboost.sdk.impl.ii r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.hi.a(java.lang.String, com.chartboost.sdk.impl.ii, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
