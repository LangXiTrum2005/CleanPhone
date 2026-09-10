package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Iterator;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3362y0 extends SuspendLambda implements Function2 {
    public AdConfig a;
    public A0 b;
    public Iterator c;
    public AdQualityResult d;
    public int e;
    public final /* synthetic */ A0 f;
    public final /* synthetic */ AdConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3362y0(A0 a0, AdConfig adConfig, dern dernVar) {
        super(2, dernVar);
        this.f = a0;
        this.g = adConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3362y0(this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3362y0(this.f, this.g, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:18|80|19|(2:78|21)|24|(1:26)|27|28|74|29|(1:31)|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:78|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:70|41|76|42|(1:44)|45|46) */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2 A[Catch: all -> 0x00a9, FileNotFoundException -> 0x00dd, TryCatch #7 {FileNotFoundException -> 0x00dd, all -> 0x00a9, blocks: (B:21:0x009d, B:24:0x00ac, B:26:0x00b2, B:27:0x00bb), top: B:78:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r3 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r13 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        r13.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        if (r15 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r15.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
    
        if (r5 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011f -> B:49:0x0122). Please report as a decompilation issue!!! */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3362y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
