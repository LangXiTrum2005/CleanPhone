package l3;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import b2.j;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f44974c = new j(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1.b f44975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44976b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        this.f44975a = new k1.b(spannableStringBuilder, alignment, null, null, f10, 0, i10, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, z10 ? i12 : -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.f44976b = i13;
    }
}
