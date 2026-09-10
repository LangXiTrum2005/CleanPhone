package b0;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f5110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f5111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0[] f5112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f5118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PendingIntent f5119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5120k;

    public g(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent, bundle, q0VarArr, z10, i11, z11, z12, z13);
    }

    public final IconCompat a() {
        int i10;
        if (this.f5111b == null && (i10 = this.f5117h) != 0) {
            this.f5111b = IconCompat.d(null, "", i10);
        }
        return this.f5111b;
    }

    public g(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f5114e = true;
        this.f5111b = iconCompat;
        if (iconCompat != null) {
            int i11 = iconCompat.f4015a;
            if ((i11 == -1 ? ((Icon) iconCompat.f4016b).getType() : i11) == 2) {
                this.f5117h = iconCompat.e();
            }
        }
        this.f5118i = p.b(charSequence);
        this.f5119j = pendingIntent;
        this.f5110a = bundle == null ? new Bundle() : bundle;
        this.f5112c = q0VarArr;
        this.f5113d = z10;
        this.f5115f = i10;
        this.f5114e = z11;
        this.f5116g = z12;
        this.f5120k = z13;
    }
}
