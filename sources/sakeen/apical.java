package sakeen;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: TypefaceEmojiSpan.java */
/* JADX INFO: loaded from: classes.dex */
public final class apical extends beachfront {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static Paint f37023adultoid;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public TextPaint f37024graveside;

    public apical(cutely cutelyVar) {
        super(cutelyVar);
    }

    public static Paint marial() {
        if (f37023adultoid == null) {
            TextPaint textPaint = new TextPaint();
            f37023adultoid = textPaint;
            textPaint.setColor(androidx.emoji2.text.dern.dern().wireman());
            f37023adultoid.setStyle(Paint.Style.FILL);
        }
        return f37023adultoid;
    }

    public final TextPaint dern(CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f37024graveside;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f37024graveside = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaintDern = dern(charSequence, i, i2, paint);
        if (textPaintDern != null && textPaintDern.bgColor != 0) {
            wireman(canvas, textPaintDern, f, f + saneness(), i3, i5);
        }
        Paint paint2 = textPaintDern;
        if (androidx.emoji2.text.dern.dern().cutely()) {
            canvas.drawRect(f, i3, f + saneness(), i5, marial());
        }
        cutely cutelyVarAttabal = attabal();
        float f2 = i4;
        if (paint2 == null) {
            paint2 = paint;
        }
        cutelyVarAttabal.attabal(canvas, f, f2, paint2);
    }

    public void wireman(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
