package com.chartboost.sdk.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc f14359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db f14360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f14361c;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14363c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return kg.this.a(null, null, null, null, null, this);
        }
    }

    public kg(tc networkClient, db macroProcessor, m1 applicationComponent) {
        Intrinsics.f(networkClient, "networkClient");
        Intrinsics.f(macroProcessor, "macroProcessor");
        Intrinsics.f(applicationComponent, "applicationComponent");
        this.f14359a = networkClient;
        this.f14360b = macroProcessor;
        this.f14361c = applicationComponent;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        if (r4 == r6) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.String r19, com.chartboost.sdk.impl.ig r20, java.lang.String r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.kg.a(java.lang.String, java.lang.String, java.lang.String, com.chartboost.sdk.impl.ig, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ kg(tc tcVar, db dbVar, m1 m1Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tcVar, dbVar, (i2 & 4) != 0 ? w3.f15454b.a() : m1Var);
    }
}
