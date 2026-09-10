package i6;

import android.app.ActivityManager;
import android.content.Context;
import cn.l;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements uf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f42901d;

    public f(l lVar, String str, float f10, String str2) {
        this.f42899b = lVar;
        this.f42900c = str;
        this.f42898a = f10;
        this.f42901d = str2;
    }

    @Override // uf.a
    public void b() {
        String str = (String) this.f42901d;
        l lVar = (l) this.f42899b;
        if (kh.e.f44649c) {
            lVar.resumeWith(t9.e.c(new ug.a("1006", "Compression was cancelled", "")));
        } else {
            android.support.v4.media.session.a.B(new kh.d((String) this.f42900c, this.f42898a, 100, str, null));
            lVar.resumeWith(str);
        }
    }

    @Override // uf.a
    public void c() {
        ((l) this.f42899b).resumeWith(t9.e.c(new ug.a("1006", "Compression was cancelled", "")));
    }

    @Override // uf.a
    public void d(Exception exc) {
        l lVar = (l) this.f42899b;
        if (kh.e.f44649c) {
            lVar.resumeWith(t9.e.c(new ug.a("1006", "Compression was cancelled", "")));
        } else {
            String message = exc.getMessage();
            lVar.resumeWith(t9.e.c(new ug.a("1004", "Writing error. See the provided details", message != null ? message : "")));
        }
    }

    @Override // uf.a
    public void e(double d10) {
        if (kh.e.f44649c) {
            ((l) this.f42899b).f(new ug.a("1006", "Compression was cancelled", ""));
        } else {
            android.support.v4.media.session.a.B(new kh.d((String) this.f42900c, this.f42898a, (int) (d10 * ((double) 100)), "", null));
        }
    }

    public f(Context context) {
        this.f42898a = 1;
        this.f42899b = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f42900c = activityManager;
        this.f42901d = new am.e(context.getResources().getDisplayMetrics(), 10);
        if (activityManager.isLowRamDevice()) {
            this.f42898a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }
}
