package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l7.z;
import p.h1;
import p.n2;
import p.o;
import p.o2;
import p.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final o mBackgroundTintHelper;
    private boolean mHasLevel;
    private final y mImageHelper;

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.a();
        }
        y yVar = this.mImageHelper;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        z zVar;
        y yVar = this.mImageHelper;
        if (yVar == null || (zVar = yVar.f47869b) == null) {
            return null;
        }
        return (ColorStateList) zVar.f45238c;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        z zVar;
        y yVar = this.mImageHelper;
        if (yVar == null || (zVar = yVar.f47869b) == null) {
            return null;
        }
        return (PorterDuff.Mode) zVar.f45239d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f47868a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        y yVar = this.mImageHelper;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        y yVar = this.mImageHelper;
        if (yVar != null && drawable != null && !this.mHasLevel) {
            yVar.f47870c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        y yVar2 = this.mImageHelper;
        if (yVar2 != null) {
            yVar2.a();
            if (this.mHasLevel) {
                return;
            }
            y yVar3 = this.mImageHelper;
            ImageView imageView = yVar3.f47868a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(yVar3.f47870c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        y yVar = this.mImageHelper;
        if (yVar != null) {
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
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        y yVar = this.mImageHelper;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        y yVar = this.mImageHelper;
        if (yVar != null) {
            if (yVar.f47869b == null) {
                yVar.f47869b = new z();
            }
            z zVar = yVar.f47869b;
            zVar.f45238c = colorStateList;
            zVar.f45237b = true;
            yVar.a();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        y yVar = this.mImageHelper;
        if (yVar != null) {
            if (yVar.f47869b == null) {
                yVar.f47869b = new z();
            }
            z zVar = yVar.f47869b;
            zVar.f45239d = mode;
            zVar.f45236a = true;
            yVar.a();
        }
    }

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        o2.a(context);
        this.mHasLevel = false;
        n2.a(getContext(), this);
        o oVar = new o(this);
        this.mBackgroundTintHelper = oVar;
        oVar.d(attributeSet, i10);
        y yVar = new y(this);
        this.mImageHelper = yVar;
        yVar.b(attributeSet, i10);
    }
}
