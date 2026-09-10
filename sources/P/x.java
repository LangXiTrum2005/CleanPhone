package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f47844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f47845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        o2.a(context);
        this.f47846c = false;
        n2.a(getContext(), this);
        o oVar = new o(this);
        this.f47844a = oVar;
        oVar.d(attributeSet, i10);
        y yVar = new y(this);
        this.f47845b = yVar;
        yVar.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f47844a;
        if (oVar != null) {
            oVar.a();
        }
        y yVar = this.f47845b;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f47844a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f47844a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        l7.z zVar;
        y yVar = this.f47845b;
        if (yVar == null || (zVar = yVar.f47869b) == null) {
            return null;
        }
        return (ColorStateList) zVar.f45238c;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        l7.z zVar;
        y yVar = this.f47845b;
        if (yVar == null || (zVar = yVar.f47869b) == null) {
            return null;
        }
        return (PorterDuff.Mode) zVar.f45239d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f47845b.f47868a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f47844a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        o oVar = this.f47844a;
        if (oVar != null) {
            oVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        y yVar = this.f47845b;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        y yVar = this.f47845b;
        if (yVar != null && drawable != null && !this.f47846c) {
            yVar.f47870c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (yVar != null) {
            yVar.a();
            if (this.f47846c) {
                return;
            }
            ImageView imageView = yVar.f47868a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(yVar.f47870c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f47846c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        y yVar = this.f47845b;
        ImageView imageView = yVar.f47868a;
        if (i10 != 0) {
            Drawable drawableI = com.google.android.gms.internal.auth.o.i(imageView.getContext(), i10);
            if (drawableI != null) {
                h1.a(drawableI);
            }
            imageView.setImageDrawable(drawableI);
        } else {
            imageView.setImageDrawable(null);
        }
        yVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        y yVar = this.f47845b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f47844a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f47844a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        y yVar = this.f47845b;
        if (yVar != null) {
            if (yVar.f47869b == null) {
                yVar.f47869b = new l7.z();
            }
            l7.z zVar = yVar.f47869b;
            zVar.f45238c = colorStateList;
            zVar.f45237b = true;
            yVar.a();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        y yVar = this.f47845b;
        if (yVar != null) {
            if (yVar.f47869b == null) {
                yVar.f47869b = new l7.z();
            }
            l7.z zVar = yVar.f47869b;
            zVar.f45239d = mode;
            zVar.f45236a = true;
            yVar.a();
        }
    }
}
