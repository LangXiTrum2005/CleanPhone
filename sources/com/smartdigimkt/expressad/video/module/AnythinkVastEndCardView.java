package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.x2.f;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements f {
    private static final String v0 = "sdm_reward_endcard_vast";
    private ViewGroup s0;
    private View t0;
    private View u0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.t2.a aVar = AnythinkVastEndCardView.this.i0;
            if (aVar != null) {
                aVar.a(104, "");
            }
        }
    }

    public class b extends com.smartdigimkt.g3.a {
        public b() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
            com.smartdigimkt.t2.a aVar = anythinkVastEndCardView.i0;
            if (aVar != null) {
                aVar.a(108, anythinkVastEndCardView.b());
            }
        }
    }

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    private boolean d() {
        this.s0 = (ViewGroup) findViewById(findID("sdm_rl_content"));
        this.t0 = findViewById(findID("sdm_iv_vastclose"));
        View viewFindViewById = findViewById(findID("sdm_iv_vastok"));
        this.u0 = viewFindViewById;
        return isNotNULL(this.s0, this.t0, viewFindViewById);
    }

    private void e() {
        if (this.j0) {
            setMatchParent();
            setBackgroundResource(findColor("sdm_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.s0.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void c() {
        super.c();
        if (this.j0) {
            this.t0.setOnClickListener(new a());
            this.u0.setOnClickListener(new b());
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int iFindLayout = findLayout(v0);
        if (iFindLayout >= 0) {
            this.g0.inflate(iFindLayout, this);
            this.j0 = d();
            c();
            e();
        }
    }

    public void notifyShowListener() {
        this.i0.a(111, "");
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
