package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE, 60, 65, 67, 71, 74, TsExtractor.TS_STREAM_TYPE_DVBSUBS, 92, 100, InterfaceC0435l1.d.b.f29107d, 106}, m = "invokeSuspend")
public final class InitializeSDK$doWork$2 extends i implements c {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, f fVar) {
        super(2, fVar);
        this.this$0 = initializeSDK;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, fVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeSDK$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x028a  */
    /* JADX WARN: Code duplicated, block: B:105:0x028c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0293 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b3 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02da  */
    /* JADX WARN: Code duplicated, block: B:117:0x02db  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e1 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f4 A[Catch: all -> 0x031f, CancellationException -> 0x0339, PHI: r0 r1
  0x02f4: PHI (r0v32 java.lang.Object) = (r0v30 java.lang.Object), (r0v30 java.lang.Object), (r0v35 java.lang.Object) binds: [B:119:0x02df, B:121:0x02f1, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x02f4: PHI (r1v31 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r1v28 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v28 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v34 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:119:0x02df, B:121:0x02f1, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0317 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[PHI: r0 r1 r3 r11
  0x009f: PHI (r0v9 com.unity3d.services.core.configuration.Configuration) = 
  (r0v6 com.unity3d.services.core.configuration.Configuration)
  (r0v11 com.unity3d.services.core.configuration.Configuration)
 binds: [B:75:0x01c8, B:31:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r1v11 com.unity3d.services.core.domain.task.InitializeSDK) = (r1v8 com.unity3d.services.core.domain.task.InitializeSDK), (r1v14 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:75:0x01c8, B:31:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r3v9 cn.a0) = (r3v5 cn.a0), (r3v12 cn.a0) binds: [B:75:0x01c8, B:31:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r11v27 java.lang.Object) = (r11v21 java.lang.Object), (r11v32 java.lang.Object) binds: [B:75:0x01c8, B:31:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[Catch: all -> 0x031f, CancellationException -> 0x0339, PHI: r1 r6
  0x0127: PHI (r1v2 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r1v1 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v1 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v4 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:47:0x0104, B:49:0x0123, B:43:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r6v2 cn.a0) = (r6v1 cn.a0), (r6v1 cn.a0), (r6v4 cn.a0) binds: [B:47:0x0104, B:49:0x0123, B:43:0x00dd] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184 A[Catch: all -> 0x031f, CancellationException -> 0x0339, PHI: r0 r1 r3 r11
  0x0184: PHI (r0v6 com.unity3d.services.core.configuration.Configuration) = 
  (r0v3 com.unity3d.services.core.configuration.Configuration)
  (r0v8 com.unity3d.services.core.configuration.Configuration)
 binds: [B:62:0x0180, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0184: PHI (r1v8 com.unity3d.services.core.domain.task.InitializeSDK) = (r1v5 com.unity3d.services.core.domain.task.InitializeSDK), (r1v10 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:62:0x0180, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0184: PHI (r3v5 cn.a0) = (r3v2 cn.a0), (r3v8 cn.a0) binds: [B:62:0x0180, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0184: PHI (r11v19 java.lang.Object) = (r11v15 java.lang.Object), (r11v23 java.lang.Object) binds: [B:62:0x0180, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0188 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7 A[Catch: all -> 0x031f, CancellationException -> 0x0339, PHI: r0 r1 r3 r6
  0x01e7: PHI (r0v12 com.unity3d.services.core.configuration.Configuration) = 
  (r0v9 com.unity3d.services.core.configuration.Configuration)
  (r0v9 com.unity3d.services.core.configuration.Configuration)
  (r0v14 com.unity3d.services.core.configuration.Configuration)
 binds: [B:78:0x01ce, B:80:0x01e3, B:28:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r1v15 java.lang.Object) = (r1v12 java.lang.Object), (r1v12 java.lang.Object), (r1v16 java.lang.Object) binds: [B:78:0x01ce, B:80:0x01e3, B:28:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r3v13 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v10 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v10 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:78:0x01ce, B:80:0x01e3, B:28:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r6v11 cn.a0) = (r6v10 cn.a0), (r6v10 cn.a0), (r6v13 cn.a0) binds: [B:78:0x01ce, B:80:0x01e3, B:28:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0207  */
    /* JADX WARN: Code duplicated, block: B:85:0x0209 A[Catch: all -> 0x031f, CancellationException -> 0x0339, PHI: r0 r1 r3 r6 r11
  0x0209: PHI (r0v15 com.unity3d.services.core.configuration.Configuration) = 
  (r0v12 com.unity3d.services.core.configuration.Configuration)
  (r0v22 com.unity3d.services.core.configuration.Configuration)
 binds: [B:83:0x0205, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r1v17 java.lang.Object) = (r1v15 java.lang.Object), (r1v19 java.lang.Object) binds: [B:83:0x0205, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r3v16 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v13 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v18 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:83:0x0205, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r6v14 cn.a0) = (r6v11 cn.a0), (r6v16 cn.a0) binds: [B:83:0x0205, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x0209: PHI (r11v35 java.lang.Object) = (r11v34 java.lang.Object), (r11v43 java.lang.Object) binds: [B:83:0x0205, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x020d A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0225  */
    /* JADX WARN: Code duplicated, block: B:90:0x0227  */
    /* JADX WARN: Code duplicated, block: B:93:0x022e A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x023a A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0245 A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x024f A[Catch: all -> 0x031f, CancellationException -> 0x0339, TryCatch #2 {CancellationException -> 0x0339, all -> 0x031f, blocks: (B:6:0x0014, B:126:0x0311, B:9:0x0023, B:123:0x02f4, B:12:0x002e, B:118:0x02dd, B:120:0x02e1, B:15:0x003f, B:111:0x02a8, B:114:0x02b9, B:18:0x004a, B:106:0x028f, B:108:0x0293, B:22:0x0058, B:91:0x0228, B:93:0x022e, B:94:0x0239, B:25:0x0070, B:85:0x0209, B:87:0x020d, B:95:0x023a, B:97:0x0245, B:99:0x024f, B:101:0x0255, B:102:0x0269, B:112:0x02b3, B:127:0x0317, B:128:0x031e, B:28:0x0087, B:82:0x01e7, B:31:0x0098, B:77:0x01cc, B:79:0x01d0, B:34:0x00a6, B:70:0x01a0, B:72:0x01a6, B:73:0x01b1, B:37:0x00bc, B:64:0x0184, B:66:0x0188, B:74:0x01b2, B:40:0x00cd, B:55:0x0144, B:57:0x014a, B:58:0x015d, B:61:0x0167, B:43:0x00dd, B:51:0x0127, B:46:0x00eb, B:48:0x0106), top: B:141:0x0009 }] */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x030e, code lost:
    
        if (r10 == r5) goto L125;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x014a, please report this as an issue */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
