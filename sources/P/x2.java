package p;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f47854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f47856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f47857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f47858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f47859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f47861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f47862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f47863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f47864k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f47865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f47866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f47867o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f47854a;
        int i11 = this.f47855b ^ i10;
        this.f47855b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f47855b & 4) != 0) {
                    Drawable drawable = this.f47859f;
                    if (drawable == null) {
                        drawable = this.f47867o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f47861h);
                    toolbar.setSubtitle(this.f47862i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f47856c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f47854a;
        if ((this.f47855b & 4) != 0) {
            if (TextUtils.isEmpty(this.f47863j)) {
                toolbar.setNavigationContentDescription(this.f47866n);
            } else {
                toolbar.setNavigationContentDescription(this.f47863j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f47855b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f47858e) == null) {
            drawable = this.f47857d;
        }
        this.f47854a.setLogo(drawable);
    }
}
