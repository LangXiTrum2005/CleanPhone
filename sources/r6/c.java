package r6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f49419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f49421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49422d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49424f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f49426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f49427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f49428j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49423e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49425g = -1;

    public c(b bVar) {
        this.f49419a = bVar;
    }

    public final void a() {
        a7.h.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f49422d);
        g gVar = this.f49419a.f49418a;
        if (gVar.f49437a.l.f38724c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f49420b) {
            return;
        }
        this.f49420b = true;
        ArrayList arrayList = gVar.f49439c;
        if (gVar.f49446j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gVar.f49442f) {
            gVar.f49442f = true;
            gVar.f49446j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f49422d) {
            return;
        }
        if (this.f49426h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f49428j == null) {
                this.f49428j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f49428j);
            this.f49426h = false;
        }
        g gVar = this.f49419a.f49418a;
        e eVar = gVar.f49445i;
        Bitmap bitmap = eVar != null ? eVar.f49436g : gVar.l;
        if (this.f49428j == null) {
            this.f49428j = new Rect();
        }
        Rect rect = this.f49428j;
        if (this.f49427i == null) {
            this.f49427i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f49427i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f49419a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f49419a.f49418a.f49451p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f49419a.f49418a.f49450o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f49420b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f49426h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f49427i == null) {
            this.f49427i = new Paint(2);
        }
        this.f49427i.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f49427i == null) {
            this.f49427i = new Paint(2);
        }
        this.f49427i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        a7.h.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f49422d);
        this.f49423e = z10;
        if (!z10) {
            this.f49420b = false;
            g gVar = this.f49419a.f49418a;
            ArrayList arrayList = gVar.f49439c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f49442f = false;
            }
        } else if (this.f49421c) {
            a();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f49421c = true;
        this.f49424f = 0;
        if (this.f49423e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f49421c = false;
        this.f49420b = false;
        g gVar = this.f49419a.f49418a;
        ArrayList arrayList = gVar.f49439c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f49442f = false;
        }
    }
}
