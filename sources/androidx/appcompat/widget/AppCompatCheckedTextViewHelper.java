package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatCheckedTextView f3546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f3547b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f3548c = null;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3549e = false;
    public boolean f;

    public AppCompatCheckedTextViewHelper(AppCompatCheckedTextView appCompatCheckedTextView) {
        this.f3546a = appCompatCheckedTextView;
    }

    public final void a() {
        AppCompatCheckedTextView appCompatCheckedTextView = this.f3546a;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.f3549e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    DrawableCompat.j(drawableMutate, this.f3547b);
                }
                if (this.f3549e) {
                    DrawableCompat.k(drawableMutate, this.f3548c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
