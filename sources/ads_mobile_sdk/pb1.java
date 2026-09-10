package ads_mobile_sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class pb1 implements hemolysin {
    public final yj1 a;
    public final carport b;
    public final AtomicBoolean c;

    public pb1(yj1 nativeAdCore, carport nativeJavascriptEngine) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        this.a = nativeAdCore;
        this.b = nativeJavascriptEngine;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:40:0x00ba, B:42:0x00c5, B:45:0x00dd), top: B:82:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #2 {all -> 0x00da, blocks: (B:40:0x00ba, B:42:0x00c5, B:45:0x00dd), top: B:82:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0129 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x012d A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0131 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0135 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:70:0x013b A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0143 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:74:0x014b A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x011b, B:59:0x0122, B:61:0x0129, B:63:0x012d, B:65:0x0131, B:68:0x0135, B:69:0x013a, B:70:0x013b, B:71:0x0142, B:72:0x0143, B:73:0x014a, B:74:0x014b), top: B:79:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (r13.a(r15, "sendMessageToNativeJs", r5) == r0) goto L47;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00c5, please report this as an issue */
    @Override // saneness.hemolysin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gq0 r13, java.util.Map r14, wretchedly.dern r15) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pb1.a(ads_mobile_sdk.gq0, java.util.Map, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_LOAD_OVERLAY_HTML;
    }
}
