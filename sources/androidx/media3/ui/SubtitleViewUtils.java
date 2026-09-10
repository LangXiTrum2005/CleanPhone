package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;

/* JADX INFO: loaded from: classes.dex */
final class SubtitleViewUtils {
    public static void a(Cue.Builder builder) {
        builder.k = -3.4028235E38f;
        builder.j = Integer.MIN_VALUE;
        CharSequence charSequence = builder.f5604a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                builder.f5604a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = builder.f5604a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(int i2, float f, int i3, int i4) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f2 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i3;
        }
        return f * f2;
    }
}
