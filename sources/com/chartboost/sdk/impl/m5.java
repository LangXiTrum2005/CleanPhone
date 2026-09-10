package com.chartboost.sdk.impl;

import java.io.File;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3 f14445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f14446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f14447c;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14449c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f14450e;
        public Object f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f14451h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ m5 f14452i;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.m5$a$a, reason: collision with other inner class name */
        public static final class C0171a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.a(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, m5 m5Var, Continuation continuation) {
            super(2, continuation);
            this.f14451h = j;
            this.f14452i = m5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f14451h, this.f14452i, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[Catch: Exception -> 0x0052, TryCatch #5 {Exception -> 0x0052, blocks: (B:35:0x00b3, B:37:0x00b9, B:39:0x00c5, B:43:0x00f2, B:45:0x00f6, B:15:0x0048, B:20:0x0067, B:23:0x0070, B:34:0x00a3), top: B:91:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[Catch: Exception -> 0x0052, TryCatch #5 {Exception -> 0x0052, blocks: (B:35:0x00b3, B:37:0x00b9, B:39:0x00c5, B:43:0x00f2, B:45:0x00f6, B:15:0x0048, B:20:0x0067, B:23:0x0070, B:34:0x00a3), top: B:91:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #5 {Exception -> 0x0052, blocks: (B:35:0x00b3, B:37:0x00b9, B:39:0x00c5, B:43:0x00f2, B:45:0x00f6, B:15:0x0048, B:20:0x0067, B:23:0x0070, B:34:0x00a3), top: B:91:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:50:0x0117  */
        /* JADX WARN: Code duplicated, block: B:51:0x0118 A[Catch: Exception -> 0x01b8, PHI: r2 r5 r10 r12 r14 r15 r16
  0x0118: PHI (r2v13 java.lang.Object) = (r2v29 java.lang.Object), (r2v39 java.lang.Object) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r5v2 java.io.File) = (r5v8 java.io.File), (r5v17 java.io.File) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r10v1 long) = (r10v4 long), (r10v8 long) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r12v7 long) = (r12v13 long), (r12v18 long) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r14v1 java.util.Iterator) = (r14v2 java.util.Iterator), (r14v8 java.util.Iterator) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r15v0 java.lang.String) = (r15v4 java.lang.String), (r15v10 java.lang.String) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r16v4 long) = (r16v5 long), (r16v8 long) binds: [B:49:0x0115, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {Exception -> 0x01b8, blocks: (B:48:0x00ff, B:51:0x0118, B:62:0x016e, B:68:0x019f), top: B:89:0x00ff }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0120  */
        /* JADX WARN: Code duplicated, block: B:64:0x0183 A[Catch: Exception -> 0x019c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x019c, blocks: (B:54:0x0122, B:64:0x0183), top: B:85:0x0122 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x019f A[Catch: Exception -> 0x01b8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x01b8, blocks: (B:48:0x00ff, B:51:0x0118, B:62:0x016e, B:68:0x019f), top: B:89:0x00ff }] */
        /* JADX WARN: Code duplicated, block: B:83:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x019f -> B:60:0x0168). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 476
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.m5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m5(o3 storage, m3 notifier, CoroutineDispatcher ioDispatcher) {
        Intrinsics.f(storage, "storage");
        Intrinsics.f(notifier, "notifier");
        Intrinsics.f(ioDispatcher, "ioDispatcher");
        this.f14445a = storage;
        this.f14446b = notifier;
        this.f14447c = ioDispatcher;
    }

    @Override // com.chartboost.sdk.impl.n3
    public Object a(Function0 function0, long j, Continuation continuation) {
        return BuildersKt.f(this.f14447c, new a(j, this, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.n3
    public boolean a(l3 l3Var) {
        if (l3Var != null) {
            return System.currentTimeMillis() > l3Var.a();
        }
        za.e("Cannot check expiry: Metadata is null.", null, 2, null);
        return false;
    }
}
