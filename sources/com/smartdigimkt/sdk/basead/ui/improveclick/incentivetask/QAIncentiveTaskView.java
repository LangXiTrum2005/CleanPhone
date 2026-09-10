package com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class QAIncentiveTaskView extends BaseIncentiveTaskView {
    private TextView g0;
    private TextView h0;
    private TextView i0;
    private TextView j0;
    private TextView k0;
    private View l0;
    private ImageView m0;
    long n0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (QAIncentiveTaskView.this.m0 != null) {
                QAIncentiveTaskView.this.m0.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements View.OnClickListener {

        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                QAIncentiveTaskView qAIncentiveTaskView = QAIncentiveTaskView.this;
                qAIncentiveTaskView.f0.a(qAIncentiveTaskView.n0);
                QAIncentiveTaskView.this.f0.onClose();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            QAIncentiveTaskView.this.f0.a(1);
            if (QAIncentiveTaskView.this.m0 != null) {
                AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(0.5f, 1.0f, 1000L);
                alphaAnimationE.setAnimationListener(new a());
                if (QAIncentiveTaskView.this.i0 != null) {
                    QAIncentiveTaskView.this.i0.setVisibility(8);
                }
                if (QAIncentiveTaskView.this.j0 != null) {
                    QAIncentiveTaskView.this.j0.setVisibility(8);
                }
                if (QAIncentiveTaskView.this.k0 != null) {
                    QAIncentiveTaskView.this.k0.setVisibility(8);
                }
                QAIncentiveTaskView.this.m0.setVisibility(0);
                QAIncentiveTaskView.this.m0.startAnimation(alphaAnimationE);
                QAIncentiveTaskView.this.b();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toast.makeText(QAIncentiveTaskView.this.getContext().getApplicationContext(), h.a(QAIncentiveTaskView.this.getContext(), "myoffer_inctask_qa_toast_wrong", k.f38992h), 1).show();
            BaseIncentiveTaskView.c cVar = QAIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.a(2);
                QAIncentiveTaskView.this.f0.onClose();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseIncentiveTaskView.c cVar = QAIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.onClose();
            }
        }
    }

    public QAIncentiveTaskView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void initSetting(f fVar, g gVar, long j, BaseIncentiveTaskView.c cVar) {
        String strR;
        super.initSetting(fVar, gVar, j, cVar);
        long jL0 = gVar.l0();
        long jI0 = gVar.I0();
        long jMin = (j > 0 ? Math.min(jI0, j) : jI0) - gVar.k0();
        if (jL0 > jMin) {
            jL0 = jMin;
        }
        if (jL0 == 0) {
            BaseIncentiveTaskView.c cVar2 = this.f0;
            if (cVar2 != null) {
                cVar2.onClose();
                return;
            }
            return;
        }
        this.n0 = (j < jI0 ? jI0 - j : 0L) + jL0;
        double d2 = jL0 / 1000.0d;
        String str = String.format(getContext().getString(h.a(getContext(), "myoffer_inctask_qa_title", k.f38992h)), Integer.valueOf((int) Math.ceil(d2)));
        String str2 = String.format(getContext().getString(h.a(getContext(), "myoffer_inctask_qa_subtitle", k.f38992h)), Integer.valueOf((int) Math.ceil(d2)));
        TextView textView = this.g0;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.h0;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        if (this.j0 != null) {
            if (TextUtils.isEmpty(fVar.g0())) {
                strR = !TextUtils.isEmpty(fVar.r()) ? fVar.r() : "";
            } else {
                strR = fVar.g0();
            }
            if (!TextUtils.isEmpty(strR)) {
                this.j0.setText(strR);
            }
            this.j0.setOnClickListener(new b());
        }
        if (this.k0 != null) {
            if (!TextUtils.isEmpty(gVar.w())) {
                this.k0.setText(gVar.w());
            }
            this.k0.setOnClickListener(new c());
        }
        View view = this.l0;
        if (view != null) {
            view.setOnClickListener(new d());
        }
    }

    public QAIncentiveTaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_inctask_qa", "layout"), this);
        this.g0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_title", "id"));
        this.h0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_subtitle", "id"));
        this.i0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_answer_hint", "id"));
        this.j0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_answer_right", "id"));
        this.k0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_answer_wrong", "id"));
        this.l0 = findViewById(h.a(getContext(), "myoffer_inctask_close_view", "id"));
        ImageView imageView = (ImageView) findViewById(h.a(getContext(), "myoffer_inctask_right_hint", "id"));
        this.m0 = imageView;
        if (imageView != null) {
            String strC = h.a() ? com.smartdigimkt.j5.a.a().c("rv_task_complete_cn") : com.smartdigimkt.j5.a.a().c("rv_task_complete");
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            com.google.firebase.crashlytics.internal.model.a.g().a(new e(3, strC), new a());
        }
    }

    public QAIncentiveTaskView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
