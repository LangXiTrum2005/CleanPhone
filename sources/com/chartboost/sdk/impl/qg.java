package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qg extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f14953h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14954i = -436207617;
    public static final int j = -1711276033;
    public static final int k = -15262682;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f14955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f14957c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f14958e;
    public float f;
    public float g;

    public static final class a {
        public a() {
        }

        public final int a() {
            return qg.f14954i;
        }

        public final int b() {
            return qg.j;
        }

        public final int c() {
            return qg.k;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            qg qgVar = qg.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(qgVar.f14955a.a(2));
            paint.setColor(qg.f14953h.b());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14960b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(qg.f14953h.c());
            return paint;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint(1);
            qg qgVar = qg.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(qgVar.f14955a.a(2));
            paint.setColor(qg.f14953h.a());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(Context context, AttributeSet attributeSet, int i2, t5 densityProvider) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        Intrinsics.f(densityProvider, "densityProvider");
        this.f14955a = densityProvider;
        this.f14956b = LazyKt.b(c.f14960b);
        this.f14957c = LazyKt.b(new b());
        this.d = LazyKt.b(new d());
        this.f14958e = new RectF();
        this.f = 1.0f;
        this.g = -1.0f;
    }

    private final Paint getArcBackgroundPaint() {
        return (Paint) this.f14957c.getX();
    }

    public final int getArcColor() {
        return getProgressPaint().getColor();
    }

    public final Paint getBackgroundPaint() {
        return (Paint) this.f14956b.getX();
    }

    public final int getBackgroundPaintColor() {
        return getBackgroundPaint().getColor();
    }

    public final float getProgress() {
        return this.f;
    }

    public final Paint getProgressPaint() {
        return (Paint) this.d.getX();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.f(canvas, "canvas");
        canvas.drawCircle(this.f14958e.centerX(), this.f14958e.centerY(), this.f14958e.width() / 2, getBackgroundPaint());
        canvas.drawArc(this.f14958e, 0.0f, 360.0f, false, getArcBackgroundPaint());
        float f = this.f;
        if (f > 0.0f) {
            canvas.drawArc(this.f14958e, -90.0f, f * 360.0f, false, getProgressPaint());
        }
        this.g = this.f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float strokeWidth = getProgressPaint().getStrokeWidth() / 2;
        this.f14958e.set(strokeWidth, strokeWidth, i2 - strokeWidth, i3 - strokeWidth);
    }

    public final void setArcColor(int i2) {
        getProgressPaint().setColor(i2);
        invalidate();
    }

    public final void setBackgroundPaintColor(int i2) {
        getBackgroundPaint().setColor(i2);
        invalidate();
    }

    public final void setProgress(float f) {
        float fA = RangesKt.a(f);
        if (fA != this.f || this.g == -1.0f) {
            this.f = fA;
            this.g = fA;
            invalidate();
        }
    }
}
