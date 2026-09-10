package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class QuestionDialogG2CV2View extends BaseG2CV2View {
    private TextView l0;
    private TextView m0;
    private String n0;
    private String o0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w5.c.a aVar = QuestionDialogG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 17);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w5.c.a aVar = QuestionDialogG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 17);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public QuestionDialogG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_question_dialog", "layout"), this);
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_question_answer1", "id"));
        this.l0 = textView;
        textView.setOnClickListener(new a());
        TextView textView2 = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_question_answer2", "id"));
        this.m0 = textView2;
        textView2.setOnClickListener(new b());
        if (!TextUtils.isEmpty(this.n0)) {
            this.l0.setText(this.n0);
        }
        if (!TextUtils.isEmpty(this.o0)) {
            this.m0.setText(this.o0);
        }
        setOnClickListener(new c());
    }

    public void setQuestionAnswer(String str, String str2) {
        this.n0 = str;
        this.o0 = str2;
    }
}
