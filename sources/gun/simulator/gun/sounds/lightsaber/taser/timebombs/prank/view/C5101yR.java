package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5101yR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4661tR f5276a;
    public final InterfaceC3601hK b;

    public C5101yR(C4661tR c4661tR, C4872vn c4872vn) {
        this.f5276a = c4661tR;
        this.b = c4872vn;
    }

    public final C3775jK a(Context context, String str, InputStream inputStream, String str2, String str3) {
        C3775jK c3775jKF;
        EnumC2815Ut enumC2815Ut;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C4661tR c4661tR = this.f5276a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC5005xJ.a();
            EnumC2815Ut enumC2815Ut2 = EnumC2815Ut.ZIP;
            c3775jKF = (str3 == null || c4661tR == null) ? RJ.f(context, new ZipInputStream(inputStream), null) : RJ.f(context, new ZipInputStream(new FileInputStream(c4661tR.d(str, inputStream, enumC2815Ut2))), str);
            enumC2815Ut = enumC2815Ut2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC5005xJ.a();
            enumC2815Ut = EnumC2815Ut.GZIP;
            c3775jKF = (str3 == null || c4661tR == null) ? RJ.c(new GZIPInputStream(inputStream), null) : RJ.c(new GZIPInputStream(new FileInputStream(c4661tR.d(str, inputStream, enumC2815Ut))), str);
        } else {
            AbstractC5005xJ.a();
            enumC2815Ut = EnumC2815Ut.JSON;
            c3775jKF = (str3 == null || c4661tR == null) ? RJ.c(inputStream, null) : RJ.c(new FileInputStream(c4661tR.d(str, inputStream, enumC2815Ut).getAbsolutePath()), str);
        }
        if (str3 != null && c3775jKF.f4549a != null && c4661tR != null) {
            File file = new File(c4661tR.c(), C4661tR.a(str, enumC2815Ut, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC5005xJ.a();
            if (!zRenameTo) {
                AbstractC5005xJ.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c3775jKF;
    }
}
