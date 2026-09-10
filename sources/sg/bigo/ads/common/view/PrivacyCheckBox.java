package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class PrivacyCheckBox extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47593c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f47594e;
    private float f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47596i;
    private int j;
    private PorterDuffXfermode k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f47597l;
    private a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f47598n;

    public class a {
        private a() {
        }

        public void a(Canvas canvas) {
            Paint paint;
            int i2;
            if (PrivacyCheckBox.this.f47591a) {
                paint = PrivacyCheckBox.this.f47594e;
                i2 = PrivacyCheckBox.this.g;
            } else {
                paint = PrivacyCheckBox.this.f47594e;
                i2 = PrivacyCheckBox.this.f47595h;
            }
            paint.setColor(i2);
            canvas.drawCircle(0.0f, 0.0f, PrivacyCheckBox.this.d, PrivacyCheckBox.this.f47594e);
        }

        public void b(Canvas canvas) {
            Paint paint;
            int i2;
            if (PrivacyCheckBox.this.f47591a) {
                paint = PrivacyCheckBox.this.f47594e;
                i2 = PrivacyCheckBox.this.f47596i;
            } else {
                paint = PrivacyCheckBox.this.f47594e;
                i2 = PrivacyCheckBox.this.j;
            }
            paint.setColor(i2);
            PrivacyCheckBox.this.f47594e.setStyle(Paint.Style.STROKE);
            canvas.save();
            canvas.translate(-(PrivacyCheckBox.this.d / 8.0f), PrivacyCheckBox.this.d / 3.0f);
            canvas.rotate(-45.0f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(PrivacyCheckBox.this.f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (-PrivacyCheckBox.this.f) / 2.0f);
            canvas.drawPath(path, PrivacyCheckBox.this.f47594e);
            canvas.restore();
        }

        public /* synthetic */ a(PrivacyCheckBox privacyCheckBox, byte b2) {
            this();
        }
    }

    public class b extends a {
        private b() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void a(Canvas canvas) {
            Paint paint;
            Paint.Style style;
            if (PrivacyCheckBox.this.f47591a) {
                paint = PrivacyCheckBox.this.f47594e;
                style = Paint.Style.FILL;
            } else {
                paint = PrivacyCheckBox.this.f47594e;
                style = Paint.Style.STROKE;
            }
            paint.setStyle(style);
            super.a(canvas);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void b(Canvas canvas) {
            if (PrivacyCheckBox.this.f47591a) {
                PrivacyCheckBox.this.f47594e.setXfermode(PrivacyCheckBox.this.k);
                super.b(canvas);
                PrivacyCheckBox.this.f47594e.setXfermode(null);
            }
        }

        public /* synthetic */ b(PrivacyCheckBox privacyCheckBox, byte b2) {
            this();
        }
    }

    public class c extends a {
        private c() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void a(Canvas canvas) {
            PrivacyCheckBox.this.f47594e.setStyle(Paint.Style.FILL);
            super.a(canvas);
        }

        public /* synthetic */ c(PrivacyCheckBox privacyCheckBox, byte b2) {
            this();
        }
    }

    public interface d {
        void a(boolean z2);
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View.OnClickListener f47604b;

        public e(View.OnClickListener onClickListener) {
            this.f47604b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PrivacyCheckBox privacyCheckBox = PrivacyCheckBox.this;
            privacyCheckBox.f47591a = !privacyCheckBox.f47591a;
            PrivacyCheckBox.this.invalidate();
            if (PrivacyCheckBox.this.f47598n != null) {
                PrivacyCheckBox.this.f47598n.a(PrivacyCheckBox.this.f47591a);
            }
            View.OnClickListener onClickListener = this.f47604b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public PrivacyCheckBox(Context context) {
        this(context, null);
    }

    private static int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(80, size);
        }
        return 80;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer((-this.f47592b) / 2.0f, (-this.f47593c) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f47592b / 2, this.f47593c / 2);
        this.m.a(canvas);
        this.m.b(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(a(i2), a(i3));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f47592b = i2;
        this.f47593c = i3;
        this.d = (Math.min(i2, i3) / 2.0f) * 0.9f;
        this.f = (Math.min(this.f47592b, this.f47593c) / 2.0f) * 0.8f;
    }

    public void setOnCheckChangeListener(d dVar) {
        this.f47598n = dVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new e(onClickListener));
    }

    public PrivacyCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final PrivacyCheckBox a(boolean z2) {
        this.f47591a = z2;
        d dVar = this.f47598n;
        if (dVar != null) {
            dVar.a(z2);
        }
        invalidate();
        return this;
    }

    public PrivacyCheckBox(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        a cVar;
        super(context, attributeSet, i2);
        float f = (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        byte b2 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PrivacyCheckBox, i2, 0);
            this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_circle_color, -16736769);
            this.f47595h = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_circle_color, -1);
            this.f47596i = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_hook_color, -16777216);
            this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_hook_color, -1);
            i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.PrivacyCheckBox_bigo_ad_hcb_style, 1);
            this.f47591a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PrivacyCheckBox_bigo_ad_hcb_is_check, false);
            this.f47597l = typedArrayObtainStyledAttributes.getDimension(R.styleable.PrivacyCheckBox_bigo_ad_hcb_line_width, f);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.g = -16736769;
            this.f47595h = -1;
            this.f47596i = -16777216;
            this.j = -1;
            this.f47597l = f;
            this.f47591a = false;
            i3 = 1;
        }
        if (i3 != 2) {
            cVar = i3 == 1 ? new c(this, b2) : cVar;
            Paint paint = new Paint();
            this.f47594e = paint;
            paint.setAntiAlias(true);
            this.f47594e.setStyle(Paint.Style.FILL);
            this.f47594e.setColor(this.f47595h);
            this.f47594e.setStrokeWidth(this.f47597l);
            this.f47594e.setStrokeJoin(Paint.Join.ROUND);
            this.f47594e.setStrokeCap(Paint.Cap.ROUND);
            setLayerType(1, null);
            this.k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
            setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        cVar = new b(this, b2);
        this.m = cVar;
        Paint paint2 = new Paint();
        this.f47594e = paint2;
        paint2.setAntiAlias(true);
        this.f47594e.setStyle(Paint.Style.FILL);
        this.f47594e.setColor(this.f47595h);
        this.f47594e.setStrokeWidth(this.f47597l);
        this.f47594e.setStrokeJoin(Paint.Join.ROUND);
        this.f47594e.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
