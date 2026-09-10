package ea;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.i7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f39255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i7 f39257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f39259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f39260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39261h;

    public b2(Context context, i7 i7Var, Long l, Long l10) {
        this.f39258e = true;
        k9.c0.h(context);
        Context applicationContext = context.getApplicationContext();
        k9.c0.h(applicationContext);
        this.f39254a = applicationContext;
        this.f39259f = l;
        this.f39260g = l10;
        if (i7Var != null) {
            this.f39257d = i7Var;
            this.f39258e = i7Var.f23578c;
            this.f39256c = i7Var.f23577b;
            this.f39261h = i7Var.f23580e;
            Bundle bundle = i7Var.f23579d;
            if (bundle != null) {
                this.f39255b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
