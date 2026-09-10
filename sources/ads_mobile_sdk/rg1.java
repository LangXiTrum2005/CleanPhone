package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.delouse;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class rg1 implements hemolysin {
    public final delouse a;
    public final delouse b;
    public final delouse c;
    public final delouse d;
    public final delouse e;
    public final x f;
    public final gk2 g;

    public rg1(delouse mraidSetOrientationPropertiesHandler, delouse mraidResizeHandler, delouse mraidCalendarEventHandler, delouse mraidStorePictureHandler, delouse mraidUnloadHandler, x activityTracker, gk2 safeBrowsingManager) {
        Intrinsics.checkNotNullParameter(mraidSetOrientationPropertiesHandler, "mraidSetOrientationPropertiesHandler");
        Intrinsics.checkNotNullParameter(mraidResizeHandler, "mraidResizeHandler");
        Intrinsics.checkNotNullParameter(mraidCalendarEventHandler, "mraidCalendarEventHandler");
        Intrinsics.checkNotNullParameter(mraidStorePictureHandler, "mraidStorePictureHandler");
        Intrinsics.checkNotNullParameter(mraidUnloadHandler, "mraidUnloadHandler");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        this.a = mraidSetOrientationPropertiesHandler;
        this.b = mraidResizeHandler;
        this.c = mraidCalendarEventHandler;
        this.d = mraidStorePictureHandler;
        this.e = mraidUnloadHandler;
        this.f = activityTracker;
        this.g = safeBrowsingManager;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r13.a(r11, r12) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
    
        if (r13.a(r12, r11) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        if (r13.a(r11, r12) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        if (r11.a(r0) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016c, code lost:
    
        if (r11.a(r12, r0) == r1) goto L78;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0187, please report this as an issue */
    @Override // saneness.hemolysin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gq0 r11, java.util.Map r12, wretchedly.dern r13) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rg1.a(ads_mobile_sdk.gq0, java.util.Map, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_MRAID;
    }
}
