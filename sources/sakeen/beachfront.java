package sakeen;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: EmojiSpan.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class beachfront extends ReplacementSpan {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final cutely f37026arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Paint.FontMetricsInt f37027kowloon = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public short f37029monoploid = -1;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public short f37030polloi = -1;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f37028molybdenite = 1.0f;

    public beachfront(cutely cutelyVar) {
        technofreak.cutely.impromptu(cutelyVar, "rasterizer cannot be null");
        this.f37026arytenoidectomy = cutelyVar;
    }

    public final cutely attabal() {
        return this.f37026arytenoidectomy;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f37027kowloon);
        Paint.FontMetricsInt fontMetricsInt2 = this.f37027kowloon;
        this.f37028molybdenite = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f37026arytenoidectomy.marial();
        this.f37030polloi = (short) (this.f37026arytenoidectomy.marial() * this.f37028molybdenite);
        short sTaiyuan = (short) (this.f37026arytenoidectomy.taiyuan() * this.f37028molybdenite);
        this.f37029monoploid = sTaiyuan;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f37027kowloon;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sTaiyuan;
    }

    public final int saneness() {
        return this.f37029monoploid;
    }
}
