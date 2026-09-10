package dumb;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: DrawableResource.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cutely<T extends Drawable> implements endosteum.cutely<T>, endosteum.competently {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final T f25375kowloon;

    public cutely(T t) {
        this.f25375kowloon = (T) com.bumptech.glide.util.apical.wireman(t);
    }

    @Override // endosteum.cutely
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f25375kowloon.getConstantState();
        return constantState == null ? this.f25375kowloon : (T) constantState.newDrawable();
    }

    @Override // endosteum.competently
    public void initialize() {
        T t = this.f25375kowloon;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof sevenfold.dern) {
            ((sevenfold.dern) t).marial().prepareToDraw();
        }
    }
}
