package x0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import com.google.android.gms.internal.play_billing.q1;
import java.nio.ByteBuffer;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f53547b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextPaint f53550e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f53546a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f53548c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f53549d = 1.0f;

    public r(q qVar) {
        q1.e(qVar, "rasterizer cannot be null");
        this.f53547b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f53550e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f53550e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i12, f10 + this.f53548c, i14, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        g.a().getClass();
        float f11 = i13;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        q qVar = this.f53547b;
        u uVar = qVar.f53544b;
        Typeface typeface = (Typeface) uVar.f54882e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) uVar.f54880c, qVar.f53543a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f53546a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        q qVar = this.f53547b;
        y0.a aVarB = qVar.b();
        int iA = aVarB.a(14);
        this.f53549d = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f45720d).getShort(iA + aVarB.f45717a) : (short) 0);
        y0.a aVarB2 = qVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f45720d).getShort(iA2 + aVarB2.f45717a);
        }
        y0.a aVarB3 = qVar.b();
        int iA3 = aVarB3.a(12);
        short s10 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f45720d).getShort(iA3 + aVarB3.f45717a) : (short) 0) * this.f53549d);
        this.f53548c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
