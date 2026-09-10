package com.facebook.share.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LikeBoxCountView extends FrameLayout {
    public LikeBoxCountViewCaretPosition e0;

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeBoxCountView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16577a;

        static {
            int[] iArr = new int[LikeBoxCountViewCaretPosition.values().length];
            f16577a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16577a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16577a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16577a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LikeBoxCountViewCaretPosition {
        public static final LikeBoxCountViewCaretPosition X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final LikeBoxCountViewCaretPosition f16578Y;
        public static final LikeBoxCountViewCaretPosition Z;
        public static final LikeBoxCountViewCaretPosition e0;
        public static final /* synthetic */ LikeBoxCountViewCaretPosition[] f0;

        static {
            LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition = new LikeBoxCountViewCaretPosition("LEFT", 0);
            X = likeBoxCountViewCaretPosition;
            LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition2 = new LikeBoxCountViewCaretPosition("TOP", 1);
            f16578Y = likeBoxCountViewCaretPosition2;
            LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition3 = new LikeBoxCountViewCaretPosition("RIGHT", 2);
            Z = likeBoxCountViewCaretPosition3;
            LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition4 = new LikeBoxCountViewCaretPosition("BOTTOM", 3);
            e0 = likeBoxCountViewCaretPosition4;
            f0 = new LikeBoxCountViewCaretPosition[]{likeBoxCountViewCaretPosition, likeBoxCountViewCaretPosition2, likeBoxCountViewCaretPosition3, likeBoxCountViewCaretPosition4};
        }

        public static LikeBoxCountViewCaretPosition valueOf(String str) {
            return (LikeBoxCountViewCaretPosition) Enum.valueOf(LikeBoxCountViewCaretPosition.class, str);
        }

        public static LikeBoxCountViewCaretPosition[] values() {
            return (LikeBoxCountViewCaretPosition[]) f0.clone();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int iOrdinal = this.e0.ordinal();
        if (iOrdinal == 0) {
            paddingLeft = (int) (paddingLeft + 0.0f);
        } else if (iOrdinal == 1) {
            paddingTop = (int) (paddingTop + 0.0f);
        } else if (iOrdinal == 2) {
            width = (int) (width - 0.0f);
        } else if (iOrdinal == 3) {
            height = (int) (height - 0.0f);
        }
        float f = paddingLeft;
        float f2 = paddingTop;
        float f3 = width;
        float f4 = height;
        Path path = new Path();
        float f5 = f + 0.0f;
        float f6 = f2 + 0.0f;
        path.addArc(new RectF(f, f2, f5, f6), -180.0f, 90.0f);
        if (this.e0 == LikeBoxCountViewCaretPosition.f16578Y) {
            float f7 = f3 - f;
            path.lineTo(((f7 - 0.0f) / 2.0f) + f, f2);
            path.lineTo((f7 / 2.0f) + f, f2 - 0.0f);
            path.lineTo(((f7 + 0.0f) / 2.0f) + f, f2);
        }
        float f8 = f3 - 0.0f;
        path.lineTo(f8, f2);
        path.addArc(new RectF(f8, f2, f3, f6), -90.0f, 90.0f);
        if (this.e0 == LikeBoxCountViewCaretPosition.Z) {
            float f9 = f4 - f2;
            path.lineTo(f3, ((f9 - 0.0f) / 2.0f) + f2);
            path.lineTo(f3 + 0.0f, (f9 / 2.0f) + f2);
            path.lineTo(f3, ((f9 + 0.0f) / 2.0f) + f2);
        }
        float f10 = f4 - 0.0f;
        path.lineTo(f3, f10);
        path.addArc(new RectF(f8, f10, f3, f4), 0.0f, 90.0f);
        if (this.e0 == LikeBoxCountViewCaretPosition.e0) {
            float f11 = f3 - f;
            path.lineTo(((f11 + 0.0f) / 2.0f) + f, f4);
            path.lineTo((f11 / 2.0f) + f, f4 + 0.0f);
            path.lineTo(((f11 - 0.0f) / 2.0f) + f, f4);
        }
        path.lineTo(f5, f4);
        path.addArc(new RectF(f, f10, f5, f4), 90.0f, 90.0f);
        if (this.e0 == LikeBoxCountViewCaretPosition.X) {
            float f12 = f4 - f2;
            path.lineTo(f, ((f12 + 0.0f) / 2.0f) + f2);
            path.lineTo(f - 0.0f, (f12 / 2.0f) + f2);
            path.lineTo(f, ((f12 - 0.0f) / 2.0f) + f2);
        }
        path.lineTo(f, f6);
        canvas.drawPath(path, null);
    }

    @Deprecated
    public void setCaretPosition(LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition) {
        this.e0 = likeBoxCountViewCaretPosition;
        int iOrdinal = likeBoxCountViewCaretPosition.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            throw null;
        }
    }

    @Deprecated
    public void setText(String str) {
        throw null;
    }
}
