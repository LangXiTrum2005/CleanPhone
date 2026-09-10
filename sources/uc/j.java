package uc;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f52001b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f52002c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f52003d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.j f52004a;

    public j(v1.j jVar) {
        this.f52004a = jVar;
    }

    public final boolean a(vc.b bVar) {
        if (TextUtils.isEmpty(bVar.f52545c)) {
            return true;
        }
        long j10 = bVar.f52548f + bVar.f52547e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f52004a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f52001b;
    }
}
