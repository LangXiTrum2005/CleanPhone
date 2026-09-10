package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uz1 extends hv2 {
    public final Context d;
    public final int e;

    public uz1(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
        this.e = i;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.PACKAGE_INFO;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x006e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // saneness.portwide
    public final java.lang.Object c(wretchedly.dern r12) {
        /*
            r11 = this;
            ads_mobile_sdk.tn0 r12 = new ads_mobile_sdk.tn0
            ads_mobile_sdk.tz1 r0 = new ads_mobile_sdk.tz1
            android.content.Context r1 = r11.d
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "getPackageName(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.content.Context r2 = r11.d
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.Context r3 = r11.d
            java.lang.String r3 = r3.getPackageName()
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)
            java.lang.String r2 = r2.versionName
            int r3 = r11.e
            java.lang.Integer r3 = igo.attabal.wireman(r3)
            android.content.Context r4 = r11.d
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Context r5 = r11.d
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            java.lang.CharSequence r4 = r4.getApplicationLabel(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            r6 = 30
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6e
            if (r7 < r6) goto L5b
            android.content.Context r7 = r11.d     // Catch: java.lang.Throwable -> L6e
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L6e
            android.content.Context r8 = r11.d     // Catch: java.lang.Throwable -> L6e
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.packageName     // Catch: java.lang.Throwable -> L6e
            android.content.pm.InstallSourceInfo r7 = saneness.lystrosaurus.attabal(r7, r8)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = saneness.marriageability.attabal(r7)     // Catch: java.lang.Throwable -> L6e
            goto L6f
        L5b:
            android.content.Context r7 = r11.d     // Catch: java.lang.Throwable -> L6e
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L6e
            android.content.Context r8 = r11.d     // Catch: java.lang.Throwable -> L6e
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.packageName     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = r7.getInstallerPackageName(r8)     // Catch: java.lang.Throwable -> L6e
            goto L6f
        L6e:
            r7 = r5
        L6f:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89
            if (r8 < r6) goto L89
            android.content.Context r6 = r11.d     // Catch: java.lang.Throwable -> L89
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L89
            android.content.Context r8 = r11.d     // Catch: java.lang.Throwable -> L89
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.packageName     // Catch: java.lang.Throwable -> L89
            android.content.pm.InstallSourceInfo r6 = saneness.lystrosaurus.attabal(r6, r8)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = saneness.rhatany.attabal(r6)     // Catch: java.lang.Throwable -> L89
        L89:
            r6 = r5
            int r5 = r11.e
            android.content.Context r8 = r11.d
            java.lang.String r8 = r8.getPackageName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = ".android."
            r9.append(r5)
            r9.append(r8)
            java.lang.String r5 = r9.toString()
            r10 = r7
            r7 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.<init>(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uz1.c(wretchedly.dern):java.lang.Object");
    }
}
