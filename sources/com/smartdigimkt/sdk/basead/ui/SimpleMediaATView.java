package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.smartdigimkt.d7.b;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.j7.c;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleMediaATView extends FrameLayout {
    private int e0;
    private int f0;
    private int g0;
    ImageView h0;
    ImageView i0;
    private Bitmap j0;

    public class a implements b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38406a;

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.SimpleMediaATView$a$a, reason: collision with other inner class name */
        public class RunnableC0600a implements Runnable {
            final /* synthetic */ Bitmap X;

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.SimpleMediaATView$a$a$a, reason: collision with other inner class name */
            public class C0601a implements com.smartdigimkt.o8.b.InterfaceC0563b {
                public C0601a() {
                }

                @Override // com.smartdigimkt.o8.b.InterfaceC0563b
                public void a() {
                }

                @Override // com.smartdigimkt.o8.b.InterfaceC0563b
                public void a(Bitmap bitmap) {
                    SimpleMediaATView.this.i0.setImageBitmap(bitmap);
                    SimpleMediaATView.this.i0.setVisibility(0);
                }
            }

            public RunnableC0600a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                SimpleMediaATView.this.j0 = this.X;
                SimpleMediaATView.this.a(this.X);
                SimpleMediaATView.this.h0.setImageBitmap(this.X);
                SimpleMediaATView.this.h0.setVisibility(0);
                com.smartdigimkt.o8.b.a(SimpleMediaATView.this.getContext(), this.X, new C0601a());
            }
        }

        public a(String str) {
            this.f38406a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38406a)) {
                SimpleMediaATView.this.post(new RunnableC0600a(bitmap));
            }
        }
    }

    public SimpleMediaATView(Context context) {
        this(context, null);
    }

    public void initView(f fVar) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_simple_media_ad_view", "layout"), this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.g0 = iMax;
        this.e0 = iMax;
        this.f0 = iMax;
        this.i0 = (ImageView) findViewById(h.a(getContext(), "myoffer_simple_background", "id"));
        ImageView imageView = (ImageView) findViewById(h.a(getContext(), "myoffer_simple_main_image", "id"));
        this.h0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String strS = fVar.s();
        try {
            b.a(getContext()).a(new e(1, strS), new a(strS));
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z2;
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        Bitmap bitmap = this.j0;
        if (bitmap == null) {
            if (size != 0 && size < this.e0) {
                this.e0 = size;
            }
            if (size2 == 0 || size2 >= this.f0) {
                return;
            }
            this.f0 = size2;
            return;
        }
        if (size == 0 || size >= this.e0) {
            z2 = false;
        } else {
            this.e0 = size;
            z2 = true;
        }
        if (size2 != 0 && size2 < this.f0) {
            this.f0 = size2;
        } else if (!z2) {
            return;
        }
        a(bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:22:0x0031 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z2;
        int i2;
        Bitmap bitmap;
        super.setLayoutParams(layoutParams);
        int i3 = layoutParams.width;
        boolean z3 = true;
        if (i3 != -1 && i3 != -2) {
            if (this.e0 != i3) {
                this.e0 = i3;
                z2 = true;
            }
            i2 = layoutParams.height;
            if (i2 == -1 && i2 != -2) {
                if (this.f0 != i2) {
                    this.f0 = i2;
                }
                bitmap = this.j0;
                if (bitmap == null && z3) {
                    a(bitmap);
                    return;
                }
            }
            this.f0 = this.g0;
            z3 = z2;
            bitmap = this.j0;
            if (bitmap == null) {
            }
        }
        this.e0 = this.g0;
        z2 = false;
        i2 = layoutParams.height;
        if (i2 == -1) {
            this.f0 = this.g0;
            z3 = z2;
        } else {
            this.f0 = this.g0;
            z3 = z2;
        }
        bitmap = this.j0;
        if (bitmap == null) {
        }
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        int[] iArrA = c.a(this.e0, this.f0, bitmap.getWidth() / bitmap.getHeight());
        ViewGroup.LayoutParams layoutParams = this.h0.getLayoutParams();
        layoutParams.width = iArrA[0];
        layoutParams.height = iArrA[1];
        this.h0.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            int i2 = layoutParams2.width == -2 ? iArrA[0] : this.e0;
            int i3 = layoutParams2.height == -2 ? iArrA[1] : this.f0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.h0)) {
                    b(childAt, i2);
                    a(childAt, i3);
                }
            }
        }
    }

    private void b(View view, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void a(View view, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }
}
