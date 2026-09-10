package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class EmojiSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final EmojiMetadata f4987Y;
    public final Paint.FontMetricsInt X = new Paint.FontMetricsInt();
    public float Z = 1.0f;

    public EmojiSpan(EmojiMetadata emojiMetadata) {
        Preconditions.d(emojiMetadata, "metadata cannot be null");
        this.f4987Y = emojiMetadata;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.X;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        EmojiMetadata emojiMetadata = this.f4987Y;
        MetadataItem metadataItemB = emojiMetadata.b();
        int iA = metadataItemB.a(14);
        this.Z = fAbs / (iA != 0 ? metadataItemB.f5017b.getShort(iA + metadataItemB.f5016a) : (short) 0);
        MetadataItem metadataItemB2 = emojiMetadata.b();
        int iA2 = metadataItemB2.a(14);
        if (iA2 != 0) {
            metadataItemB2.f5017b.getShort(iA2 + metadataItemB2.f5016a);
        }
        MetadataItem metadataItemB3 = emojiMetadata.b();
        int iA3 = metadataItemB3.a(12);
        short s = (short) ((iA3 != 0 ? metadataItemB3.f5017b.getShort(iA3 + metadataItemB3.f5016a) : (short) 0) * this.Z);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
