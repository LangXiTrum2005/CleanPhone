package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class CardViewApi21Impl implements CardViewImpl {
    public final void a(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) ((CardView.AnonymousClass1) cardViewDelegate).f3724a;
        CardView cardView = CardView.this;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != roundRectDrawable.f3729e || roundRectDrawable.f != useCompatPadding || roundRectDrawable.g != preventCornerOverlap) {
            roundRectDrawable.f3729e = f;
            roundRectDrawable.f = useCompatPadding;
            roundRectDrawable.g = preventCornerOverlap;
            roundRectDrawable.b(null);
            roundRectDrawable.invalidateSelf();
        }
        b(cardViewDelegate);
    }

    public final void b(CardViewDelegate cardViewDelegate) {
        if (!CardView.this.getUseCompatPadding()) {
            ((CardView.AnonymousClass1) cardViewDelegate).a(0, 0, 0, 0);
            return;
        }
        CardView.AnonymousClass1 anonymousClass1 = (CardView.AnonymousClass1) cardViewDelegate;
        Drawable drawable = anonymousClass1.f3724a;
        float f = ((RoundRectDrawable) drawable).f3729e;
        float f2 = ((RoundRectDrawable) drawable).f3726a;
        CardView cardView = CardView.this;
        int iCeil = (int) Math.ceil(RoundRectDrawableWithShadow.a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(RoundRectDrawableWithShadow.b(f, f2, cardView.getPreventCornerOverlap()));
        anonymousClass1.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
