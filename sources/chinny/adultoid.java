package chinny;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: ShapeableDelegateV33.java */
/* JADX INFO: loaded from: classes3.dex */
public class adultoid extends molybdenite {

    /* JADX INFO: compiled from: ShapeableDelegateV33.java */
    public class attabal extends ViewOutlineProvider {
        public attabal() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (adultoid.this.f15515marial.isEmpty()) {
                return;
            }
            outline.setPath(adultoid.this.f15515marial);
        }
    }

    public adultoid(View view) {
        formularize(view);
    }

    private void formularize(View view) {
        view.setOutlineProvider(new attabal());
    }

    @Override // chinny.molybdenite
    public boolean cutely() {
        return this.f15513attabal;
    }

    @Override // chinny.molybdenite
    public void saneness(View view) {
        view.setClipToOutline(!cutely());
        if (cutely()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
