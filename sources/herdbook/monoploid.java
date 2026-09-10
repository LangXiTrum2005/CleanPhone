package herdbook;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: PrecomputedTextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid implements Spannable {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final Object f27701polloi = new Object();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final attabal f27702arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Spannable f27703kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PrecomputedText f27704monoploid;

    public attabal attabal() {
        return this.f27702arytenoidectomy;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f27703kowloon.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f27703kowloon.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f27703kowloon.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f27703kowloon.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f27704monoploid.getSpans(i, i2, cls) : (T[]) this.f27703kowloon.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f27703kowloon.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f27703kowloon.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27704monoploid.removeSpan(obj);
        } else {
            this.f27703kowloon.removeSpan(obj);
        }
    }

    public PrecomputedText saneness() {
        if (saneness.attabal(this.f27703kowloon)) {
            return dern.attabal(this.f27703kowloon);
        }
        return null;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27704monoploid.setSpan(obj, i, i2, i3);
        } else {
            this.f27703kowloon.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f27703kowloon.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f27703kowloon.toString();
    }

    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final TextPaint f27705attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f27706dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final PrecomputedText.Params f27707marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final TextDirectionHeuristic f27708saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f27709wireman;

        /* JADX INFO: renamed from: herdbook.monoploid$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        public static class C0633attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final TextPaint f27710attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public int f27711dern = 1;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public int f27713wireman = 1;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public TextDirectionHeuristic f27712saneness = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0633attabal(TextPaint textPaint) {
                this.f27710attabal = textPaint;
            }

            public attabal attabal() {
                return new attabal(this.f27710attabal, this.f27712saneness, this.f27711dern, this.f27713wireman);
            }

            public C0633attabal dern(int i) {
                this.f27713wireman = i;
                return this;
            }

            public C0633attabal saneness(int i) {
                this.f27711dern = i;
                return this;
            }

            public C0633attabal wireman(TextDirectionHeuristic textDirectionHeuristic) {
                this.f27712saneness = textDirectionHeuristic;
                return this;
            }
        }

        public attabal(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f27707marial = arytenoidectomy.attabal(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f27707marial = null;
            }
            this.f27705attabal = textPaint;
            this.f27708saneness = textDirectionHeuristic;
            this.f27706dern = i;
            this.f27709wireman = i2;
        }

        public boolean attabal(attabal attabalVar) {
            if (this.f27706dern != attabalVar.saneness() || this.f27709wireman != attabalVar.dern() || this.f27705attabal.getTextSize() != attabalVar.marial().getTextSize() || this.f27705attabal.getTextScaleX() != attabalVar.marial().getTextScaleX() || this.f27705attabal.getTextSkewX() != attabalVar.marial().getTextSkewX() || this.f27705attabal.getLetterSpacing() != attabalVar.marial().getLetterSpacing() || !TextUtils.equals(this.f27705attabal.getFontFeatureSettings(), attabalVar.marial().getFontFeatureSettings()) || this.f27705attabal.getFlags() != attabalVar.marial().getFlags() || !this.f27705attabal.getTextLocales().equals(attabalVar.marial().getTextLocales())) {
                return false;
            }
            if (this.f27705attabal.getTypeface() == null) {
                return attabalVar.marial().getTypeface() == null;
            }
            return this.f27705attabal.getTypeface().equals(attabalVar.marial().getTypeface());
        }

        public int dern() {
            return this.f27709wireman;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return attabal(attabalVar) && this.f27708saneness == attabalVar.wireman();
        }

        public int hashCode() {
            return technofreak.marial.saneness(Float.valueOf(this.f27705attabal.getTextSize()), Float.valueOf(this.f27705attabal.getTextScaleX()), Float.valueOf(this.f27705attabal.getTextSkewX()), Float.valueOf(this.f27705attabal.getLetterSpacing()), Integer.valueOf(this.f27705attabal.getFlags()), this.f27705attabal.getTextLocales(), this.f27705attabal.getTypeface(), Boolean.valueOf(this.f27705attabal.isElegantTextHeight()), this.f27708saneness, Integer.valueOf(this.f27706dern), Integer.valueOf(this.f27709wireman));
        }

        public TextPaint marial() {
            return this.f27705attabal;
        }

        public int saneness() {
            return this.f27706dern;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f27705attabal.getTextSize());
            sb.append(", textScaleX=" + this.f27705attabal.getTextScaleX());
            sb.append(", textSkewX=" + this.f27705attabal.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f27705attabal.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f27705attabal.isElegantTextHeight());
            sb.append(", textLocale=" + this.f27705attabal.getTextLocales());
            sb.append(", typeface=" + this.f27705attabal.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f27705attabal.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f27708saneness);
            sb.append(", breakStrategy=" + this.f27706dern);
            sb.append(", hyphenationFrequency=" + this.f27709wireman);
            sb.append("}");
            return sb.toString();
        }

        public TextDirectionHeuristic wireman() {
            return this.f27708saneness;
        }

        public attabal(PrecomputedText.Params params) {
            this.f27705attabal = params.getTextPaint();
            this.f27708saneness = params.getTextDirection();
            this.f27706dern = params.getBreakStrategy();
            this.f27709wireman = params.getHyphenationFrequency();
            this.f27707marial = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
