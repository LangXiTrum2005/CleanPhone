package l3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f44950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44955h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f44948a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f44949b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f44950c = sb2;
        this.f44954g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f44951d = 15;
        this.f44952e = 0;
        this.f44953f = 0;
        this.f44955h = i11;
    }

    public final void a(char c4) {
        StringBuilder sb2 = this.f44950c;
        if (sb2.length() < 32) {
            sb2.append(c4);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f44950c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f44948a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f44947c;
                if (i10 != length) {
                    return;
                }
                aVar.f44947c = i10 - 1;
            }
        }
    }

    public final k1.b c(int i10) {
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f44949b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.f44952e + this.f44953f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        int i14 = i10;
        if (i14 == Integer.MIN_VALUE) {
            if (this.f44954g != 2 || (Math.abs(i13) >= 3 && length >= 0)) {
                i14 = (this.f44954g != 2 || i13 <= 0) ? 0 : 2;
            } else {
                i14 = 1;
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                i12 = 32 - length;
            }
            f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        int i15 = this.f44951d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f44954g == 1) {
            i15 -= this.f44955h - 1;
        }
        return new k1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f10, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f44950c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f44948a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z11 = aVar.f44946b;
            int i16 = aVar.f44945a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = c.B[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.f44947c;
            i14++;
            if (i17 != (i14 < arrayList.size() ? ((a) arrayList.get(i14)).f44947c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    l1.d.m(2, spannableStringBuilder, i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            l1.d.m(2, spannableStringBuilder, i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f44948a.isEmpty() && this.f44949b.isEmpty() && this.f44950c.length() == 0;
    }
}
