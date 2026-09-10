package k0;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f44197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f44198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44200d;

    public a(PrecomputedText.Params params) {
        this.f44197a = params.getTextPaint();
        this.f44198b = params.getTextDirection();
        this.f44199c = params.getBreakStrategy();
        this.f44200d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f44199c;
        TextPaint textPaint = aVar.f44197a;
        if (this.f44199c != i10 || this.f44200d != aVar.f44200d) {
            return false;
        }
        TextPaint textPaint2 = this.f44197a;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f44198b == aVar.f44198b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f44197a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f44198b, Integer.valueOf(this.f44199c), Integer.valueOf(this.f44200d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f44197a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb2.append(", textDir=" + this.f44198b);
        sb2.append(", breakStrategy=" + this.f44199c);
        sb2.append(", hyphenationFrequency=" + this.f44200d);
        sb2.append("}");
        return sb2.toString();
    }
}
