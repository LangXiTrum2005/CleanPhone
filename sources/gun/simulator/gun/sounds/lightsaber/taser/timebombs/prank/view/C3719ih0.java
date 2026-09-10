package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.net.URL;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ih0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3719ih0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4515a;
    public final URL b;
    public final String c;

    public C3719ih0(String str, URL url, String str2) {
        this.f4515a = str;
        this.b = url;
        this.c = str2;
    }

    public static C3719ih0 a(String str, URL url, String str2) {
        AbstractC2995aW.e(str, "VendorKey is null or empty");
        AbstractC2995aW.e(str2, "VerificationParameters is null or empty");
        return new C3719ih0(str, url, str2);
    }
}
