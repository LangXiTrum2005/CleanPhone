package sg.bigo.ads.ad.interstitial.multi_img;

import android.view.View;
import android.widget.TextView;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static int a(int i2) {
        return i2;
    }

    public static void a(final View view, TextView textView, int i2, final boolean[] zArr, final boolean z2, final long j) {
        if (k.a(zArr) || zArr.length < 2) {
            return;
        }
        sg.bigo.ads.ad.interstitial.d.a(textView, i2, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.e.1
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                return j;
            }

            @Override // sg.bigo.ads.common.w.b.a
            public final void b(int i3) {
                boolean[] zArr2 = zArr;
                zArr2[1] = true;
                e.a(view, zArr2[0], true, z2);
            }
        });
    }

    public static void a(View view, boolean z2, boolean z3, boolean z4) {
        if (z4 && z2 && z3 && view != null) {
            sg.bigo.ads.ad.interstitial.c.e(view);
        }
    }
}
