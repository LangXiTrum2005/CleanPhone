package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3535gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4422a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public C3535gd(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f4422a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f4422a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C3447fd c3447fd = (C3447fd) arrayList.get(size);
                int i = c3447fd.c;
                if (i != length) {
                    return;
                }
                c3447fd.c = i - 1;
            }
        }
    }

    public final C2417Fk c(int i) {
        int i2;
        float f;
        int i3 = this.e + this.f;
        int i4 = 32 - i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i5 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i5);
            int i6 = Ug0.f3833a;
            if (charSequenceSubSequence.length() > i4) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i4);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i5++;
        }
        SpannableString spannableStringD = d();
        int i7 = Ug0.f3833a;
        int length = spannableStringD.length();
        SpannableString spannableStringSubSequence = spannableStringD;
        if (length > i4) {
            spannableStringSubSequence = spannableStringD.subSequence(0, i4);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i4 - spannableStringBuilder.length();
        int i8 = i3 - length2;
        if (i != Integer.MIN_VALUE) {
            i2 = i;
        } else if (this.g != 2 || (Math.abs(i8) >= 3 && length2 >= 0)) {
            i2 = (this.g != 2 || i8 <= 0) ? 0 : 2;
        } else {
            i2 = 1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 32 - length2;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i9 = this.d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.g == 1) {
            i9 -= this.h - 1;
        }
        return new C2417Fk(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f4422a;
            if (i >= arrayList.size()) {
                break;
            }
            C3447fd c3447fd = (C3447fd) arrayList.get(i);
            boolean z2 = c3447fd.b;
            int i7 = c3447fd.f4374a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C3623hd.A[i7];
                }
                z = z3;
            }
            int i8 = c3447fd.c;
            i++;
            if (i8 != (i < arrayList.size() ? ((C3447fd) arrayList.get(i)).c : length)) {
                if (i2 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i3 != -1 && !z) {
                    DM.v(2, spannableStringBuilder, i3, i8, 33);
                    i3 = -1;
                } else if (i3 == -1 && z) {
                    i3 = i8;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                    }
                    i5 = i6;
                    i4 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            DM.v(2, spannableStringBuilder, i3, length, 33);
        }
        if (i4 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f4422a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
