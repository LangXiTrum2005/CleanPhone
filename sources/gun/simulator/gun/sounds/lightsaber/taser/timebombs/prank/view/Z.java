package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class Z {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4051a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public Z(String str, String str2, String str3, Date date, long j, long j2) {
        this.f4051a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public final C3138c4 a(String str) {
        C3138c4 c3138c4 = new C3138c4();
        c3138c4.f4202a = str;
        c3138c4.m = this.d.getTime();
        c3138c4.b = this.f4051a;
        c3138c4.c = this.b;
        String str2 = this.c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        c3138c4.d = str2;
        c3138c4.e = this.e;
        c3138c4.j = this.f;
        return c3138c4;
    }
}
