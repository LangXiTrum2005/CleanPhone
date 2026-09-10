package com.codejoy.boom.clap.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.codejoy.boom.clap.polloi;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: GradientTextView2.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ#\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/codejoy/boom/clap/widget/GradientTextView2;", "Lcom/codejoy/boom/clap/widget/ParkinsansFontText;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", X3.a.f, "", "array", "", "isBorder", "setGradient", "([IZ)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "colorArray", "setTextColorArray", "([I)V", "", "strokeWidth", "setBorderColorArray", "([IF)V", "setStrokeWidth", "(F)V", "mStrokeWidth", "F", "borderColorArray", "[I", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "mTextGradientOrientation", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "textColorArray", "Landroid/graphics/Rect;", "bounds", "Landroid/graphics/Rect;", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GradientTextView2 extends ParkinsansFontText {
    public static final int $stable = 8;
    private int[] borderColorArray;
    private final Rect bounds;
    private float mStrokeWidth;
    private attabal mTextGradientOrientation;
    private int[] textColorArray;

    /* JADX INFO: compiled from: GradientTextView2.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "", "", "value", "<init>", "(I)V", "I", "getValue", "()I", "attabal", "dern", "saneness", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal$saneness;", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal$dern;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        /* JADX INFO: renamed from: com.codejoy.boom.clap.widget.GradientTextView2$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: GradientTextView2.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal$attabal;", "", "<init>", "()V", "", "value", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "attabal", "(I)Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final attabal attabal(int value) {
                if (value != 0) {
                    return value != 1 ? dern.f18661saneness : saneness.f18662saneness;
                }
                return dern.f18661saneness;
            }

            public Companion() {
            }
        }

        /* JADX INFO: compiled from: GradientTextView2.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal$dern;", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class dern extends attabal {

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public static final dern f18661saneness = new dern();

            public dern() {
                super(0, null);
            }
        }

        /* JADX INFO: compiled from: GradientTextView2.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal$saneness;", "Lcom/codejoy/boom/clap/widget/GradientTextView2$attabal;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class saneness extends attabal {

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public static final saneness f18662saneness = new saneness();

            public saneness() {
                super(1, null);
            }
        }

        public /* synthetic */ attabal(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public attabal(int i) {
            this.value = i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientTextView2(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    private final void init(Context context, AttributeSet attrs) {
        int[] iArrDeadwork;
        if (attrs != null) {
            int[] GradientTextView2 = polloi.GradientTextView2;
            Intrinsics.checkNotNullExpressionValue(GradientTextView2, "GradientTextView2");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, GradientTextView2, 0, 0);
            this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(polloi.GradientTextView2_text_border_width, 0) * 2;
            String string = typedArrayObtainStyledAttributes.getString(polloi.GradientTextView2_text_border_color_array);
            int[] iArrDeadwork2 = null;
            if (string != null) {
                List listSplit$default = StringsKt.split$default(string, new String[]{","}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList(dovishness.gintrap(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    iArrDeadwork = CollectionsKt.deadwork(arrayList);
                } else {
                    iArrDeadwork = null;
                }
            } else {
                iArrDeadwork = null;
            }
            this.borderColorArray = iArrDeadwork;
            String string2 = typedArrayObtainStyledAttributes.getString(polloi.GradientTextView2_text_color_array);
            if (string2 != null) {
                List listSplit$default2 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, null);
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(listSplit$default2, 10));
                Iterator it2 = listSplit$default2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(Color.parseColor((String) it2.next())));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    iArrDeadwork2 = CollectionsKt.deadwork(arrayList2);
                }
            }
            this.textColorArray = iArrDeadwork2;
            this.mTextGradientOrientation = attabal.INSTANCE.attabal(typedArrayObtainStyledAttributes.getInt(polloi.GradientTextView2_text_gradient_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void setGradient(int[] array, boolean isBorder) {
        float f;
        float fWidth;
        float f2;
        float f3;
        if (array == null) {
            return;
        }
        if (array.length == 1) {
            array = p002kotlin.collections.polloi.gusty(new Integer[]{Integer.valueOf(array[0]), Integer.valueOf(array[0])});
        }
        int[] iArr = array;
        if (!isBorder) {
            setTextColor(-1);
        }
        if ((iArr.length > 1 ? iArr : null) == null) {
            return;
        }
        float f4 = getPaint().getFontMetrics().top;
        getPaint().getTextBounds(getText().toString(), 0, getText().toString().length(), this.bounds);
        int iHeight = this.bounds.height();
        attabal attabalVar = this.mTextGradientOrientation;
        if (Intrinsics.wireman(attabalVar, attabal.dern.f18661saneness)) {
            float f5 = -f4;
            f3 = f5;
            f2 = f5 - iHeight;
            f = 0.0f;
            fWidth = 0.0f;
        } else {
            if (!Intrinsics.wireman(attabalVar, attabal.saneness.f18662saneness)) {
                throw new NoWhenBranchMatchedException();
            }
            float lineLeft = getLayout().getLineLeft(getLineCount() - 1) + getCompoundPaddingLeft();
            f = lineLeft;
            fWidth = this.bounds.width() + lineLeft;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        getPaint().setShader(new LinearGradient(f, f2, fWidth, f3, iArr, (float[]) null, Shader.TileMode.CLAMP));
    }

    public static /* synthetic */ void setGradient$default(GradientTextView2 gradientTextView2, int[] iArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        gradientTextView2.setGradient(iArr, z);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getPaint().setShader(null);
        if (this.mStrokeWidth > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(this.mStrokeWidth);
            setGradient$default(this, this.borderColorArray, false, 2, null);
            super.onDraw(canvas);
        }
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setGradient$default(this, this.textColorArray, false, 2, null);
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mStrokeWidth > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            String string = getText().toString();
            if (!p002kotlin.text.dovishness.starveling(string, " ", false, 2, null)) {
                string = " " + string;
            }
            if (!p002kotlin.text.dovishness.cuirassed(string, " ", false, 2, null)) {
                string = string + " ";
            }
            if (!Intrinsics.wireman(string, getText().toString())) {
                setText(string);
            }
        }
        float f = 2;
        setPadding(getPaddingStart(), Math.max((int) (this.mStrokeWidth / f), getPaddingTop()), getPaddingEnd(), Math.max((int) (this.mStrokeWidth / f), getPaddingBottom()));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setBorderColorArray(int[] colorArray, float strokeWidth) {
        this.mStrokeWidth = strokeWidth * 2;
        this.borderColorArray = colorArray;
        invalidate();
    }

    public final void setStrokeWidth(float strokeWidth) {
        this.mStrokeWidth = strokeWidth * 2;
        invalidate();
    }

    public final void setTextColorArray(int[] colorArray) {
        Intrinsics.checkNotNullParameter(colorArray, "colorArray");
        this.textColorArray = colorArray;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientTextView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTextGradientOrientation = attabal.dern.f18661saneness;
        this.bounds = new Rect();
        init(context, attributeSet);
    }
}
