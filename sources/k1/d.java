package k1;

import android.os.Bundle;
import android.text.Spanned;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44248e;

    static {
        String str = y.f44830a;
        f44244a = Integer.toString(0, 36);
        f44245b = Integer.toString(1, 36);
        f44246c = Integer.toString(2, 36);
        f44247d = Integer.toString(3, 36);
        f44248e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f44244a, spanned.getSpanStart(obj));
        bundle2.putInt(f44245b, spanned.getSpanEnd(obj));
        bundle2.putInt(f44246c, spanned.getSpanFlags(obj));
        bundle2.putInt(f44247d, i10);
        if (bundle != null) {
            bundle2.putBundle(f44248e, bundle);
        }
        return bundle2;
    }
}
