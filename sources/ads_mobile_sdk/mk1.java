package ads_mobile_sdk;

import com.google.gson.JsonArray;
import java.io.Closeable;
import kotlinx.coroutines.channels.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public w03 e;
    public Closeable f;
    public Object g;
    public Object h;
    public int i;
    public final /* synthetic */ qk1 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ JsonArray m;
    public final /* synthetic */ kowloon n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk1(qk1 qk1Var, int i, int i2, JsonArray jsonArray, kowloon kowloonVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.j = qk1Var;
        this.k = i;
        this.l = i2;
        this.m = jsonArray;
        this.n = kowloonVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new mk1(this.j, this.k, this.l, this.m, this.n, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mk1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281 A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0285 A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0289 A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:108:0x028f A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0297 A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:112:0x029f A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02e6 A[Catch: all -> 0x0305, TRY_LEAVE, TryCatch #7 {all -> 0x0305, blocks: (B:127:0x02e0, B:129:0x02e6), top: B:196:0x02e0 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0344  */
    /* JADX WARN: Code duplicated, block: B:142:0x0366  */
    /* JADX WARN: Code duplicated, block: B:146:0x037b  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b0 A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x03b7 A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03bb A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03bf A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03c3 A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x03c9 A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03d1 A[Catch: all -> 0x03c0, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03d9 A[Catch: all -> 0x03c0, TRY_LEAVE, TryCatch #1 {all -> 0x03c0, blocks: (B:163:0x03a9, B:165:0x03b0, B:167:0x03b7, B:169:0x03bb, B:171:0x03bf, B:174:0x03c3, B:175:0x03c8, B:176:0x03c9, B:177:0x03d0, B:178:0x03d1, B:179:0x03d8, B:180:0x03d9), top: B:187:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b0 A[Catch: all -> 0x01ce, TRY_LEAVE, TryCatch #14 {all -> 0x01ce, blocks: (B:62:0x01aa, B:64:0x01b0), top: B:207:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:73:0x020c  */
    /* JADX WARN: Code duplicated, block: B:77:0x022e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0243  */
    /* JADX WARN: Code duplicated, block: B:97:0x0276 A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x027d A[Catch: all -> 0x0286, TryCatch #9 {all -> 0x0286, blocks: (B:95:0x026f, B:97:0x0276, B:99:0x027d, B:101:0x0281, B:103:0x0285, B:106:0x0289, B:107:0x028e, B:108:0x028f, B:109:0x0296, B:110:0x0297, B:111:0x029e, B:112:0x029f), top: B:200:0x026f }] */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0301, code lost:
    
        if (r9.wireman((ads_mobile_sdk.nn0) r5, r17) == r0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ca, code lost:
    
        if (r9.wireman((ads_mobile_sdk.nn0) r5, r17) == r0) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ads_mobile_sdk.v62, ads_mobile_sdk.w03, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v9, types: [ads_mobile_sdk.w03, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v20, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
