package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        EmojiCompat.a().getClass();
        EmojiMetadata emojiMetadata = this.f4987Y;
        MetadataRepo metadataRepo = emojiMetadata.f4979b;
        Typeface typeface = metadataRepo.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(metadataRepo.f4996b, emojiMetadata.f4978a * 2, 2, f, i5, paint);
        paint.setTypeface(typeface2);
    }
}
