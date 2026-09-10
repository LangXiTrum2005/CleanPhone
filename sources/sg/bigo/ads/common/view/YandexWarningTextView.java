package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public class YandexWarningTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f47659c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47660e;
    private float f;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f47662i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f47663l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f47657a = 25;
        this.f47658b = 10;
        this.f47659c = 35.0f;
        this.f47660e = 1;
        this.f = 50.0f;
        this.g = false;
        this.f47661h = 0;
        this.f47662i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        this.f47663l = 1000;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.YandexWarningTextView);
            this.f47657a = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_maxTextSize, this.f47657a));
            this.f47658b = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_minTextSize, this.f47658b));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.j = e.c(getContext());
        this.k = e.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i2 = this.f47660e;
        if (i2 > 2) {
            i2 = 2;
        }
        canvas.save();
        float f = (this.d * 1.0f) / i2;
        float f2 = f / this.f;
        sg.bigo.ads.common.t.a.a("yandexWarn", "onDraw...singleLineHeight:" + f + "...scaleY:" + f2 + "...mPy:" + this.f47662i);
        canvas.scale(1.0f, f2, 0.0f, this.f47662i);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6;
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i2 - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i3 - getPaddingTop()) - getPaddingBottom();
            this.d = paddingTop;
            float f = this.f47657a;
            float f2 = paddingTop * 0.5f;
            this.f47659c = f2;
            setLineSpacing(f2, 0.0f);
            setTextSize(2, f);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f47659c, true);
            while (true) {
                if ((staticLayout.getHeight() <= this.d && staticLayout.getWidth() <= paddingLeft) || f <= this.f47658b) {
                    break;
                }
                f -= 1.0f;
                setTextSize(2, f);
                staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f47659c, true);
            }
            this.f47660e = staticLayout.getLineCount();
            this.f47661h = staticLayout.getLineAscent(0);
            this.f = e.b(getContext(), Math.round(f));
            int iAbs = Math.abs(this.f47661h);
            boolean z2 = this.g;
            if (z2 || 1 == (i6 = this.f47660e)) {
                if (!z2 || f <= 20.0f) {
                    this.f47662i = iAbs / 2.0f;
                } else {
                    this.f47662i = iAbs * 1.1f;
                }
            } else if (i6 >= 3) {
                this.f47662i = 0.0f;
            } else if (f > 36.0f) {
                this.f47662i = iAbs * 1.1f;
            } else {
                this.f47662i = (iAbs * 1.0f) / i6;
            }
            if (this.k <= 1000 && this.j <= 1000) {
                this.f47662i = 0.0f;
            }
            setLineSpacing(this.f, 0.0f);
            sg.bigo.ads.common.t.a.a("yandexWarn", "adjust...line " + this.f47660e + "...TextSizeSP:" + f + "...TextSizePx:" + this.f + "...TotalHeight:" + this.d + "..lineSpace:" + this.f47659c + "...scaleX:" + getPaint().getTextScaleX() + "...mSecondLineAscentHeight:" + this.f47661h + "...secondLineTopH:" + staticLayout.getLineTop(0) + "...mPy:" + this.f47662i);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z2) {
        this.g = z2;
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47657a = 25;
        this.f47658b = 10;
        this.f47659c = 35.0f;
        this.f47660e = 1;
        this.f = 50.0f;
        this.g = false;
        this.f47661h = 0;
        this.f47662i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        this.f47663l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47657a = 25;
        this.f47658b = 10;
        this.f47659c = 35.0f;
        this.f47660e = 1;
        this.f = 50.0f;
        this.g = false;
        this.f47661h = 0;
        this.f47662i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        this.f47663l = 1000;
        a(attributeSet);
    }
}
