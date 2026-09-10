package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.io.Closeable;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qo1 extends SuspendLambda implements Function1 {
    public Object a;
    public Object b;
    public Closeable c;
    public Object d;
    public w03 e;
    public w03 f;
    public int g;
    public final /* synthetic */ so1 h;
    public final /* synthetic */ a22 i;
    public final /* synthetic */ JsonObject j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo1(a22 a22Var, so1 so1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.h = so1Var;
        this.i = a22Var;
        this.j = jsonObject;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new qo1(this.i, this.h, this.j, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qo1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:40:0x011d A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #4 {all -> 0x0124, blocks: (B:38:0x0117, B:40:0x011d), top: B:109:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0131 A[Catch: all -> 0x006d, TryCatch #9 {all -> 0x006d, blocks: (B:50:0x0172, B:44:0x012a, B:46:0x0131, B:47:0x015d, B:20:0x0066, B:33:0x00c6), top: B:119:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x015d A[Catch: all -> 0x006d, TryCatch #9 {all -> 0x006d, blocks: (B:50:0x0172, B:44:0x012a, B:46:0x0131, B:47:0x015d, B:20:0x0066, B:33:0x00c6), top: B:119:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0183 A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x018a A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x018e A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0192 A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0196 A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019c A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4 A[Catch: all -> 0x0193, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #2 {all -> 0x0193, blocks: (B:55:0x017c, B:57:0x0183, B:59:0x018a, B:61:0x018e, B:63:0x0192, B:66:0x0196, B:67:0x019b, B:68:0x019c, B:69:0x01a3, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac), top: B:106:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c0 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e1 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9 A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01b9, B:83:0x01c0, B:85:0x01c7, B:87:0x01cb, B:89:0x01cf, B:92:0x01d3, B:93:0x01d8, B:94:0x01d9, B:95:0x01e0, B:96:0x01e1, B:97:0x01e8, B:98:0x01e9), top: B:103:0x01b9 }] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016f, code lost:
    
        if (r3 == r0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
