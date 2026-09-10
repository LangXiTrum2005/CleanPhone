package ads_mobile_sdk;

import android.app.ActivityManager;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xj extends SuspendLambda implements Function2 {
    public ActivityManager a;
    public int b;
    public final /* synthetic */ ik c;
    public final /* synthetic */ saran d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(ik ikVar, saran saranVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = ikVar;
        this.d = saranVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xj(this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xj(this.c, this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:13:0x0029, B:18:0x0033, B:34:0x00cc, B:36:0x00d6, B:40:0x00e8, B:41:0x00ea, B:49:0x0126, B:52:0x0135, B:54:0x0161, B:56:0x0165, B:58:0x017c, B:60:0x0187, B:63:0x0194, B:44:0x00fd, B:46:0x0115, B:47:0x011d, B:31:0x00b9), top: B:76:0x0011, outer: #2, inners: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01de, code lost:
    
        if (r0.a(r18) == r2) goto L67;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
