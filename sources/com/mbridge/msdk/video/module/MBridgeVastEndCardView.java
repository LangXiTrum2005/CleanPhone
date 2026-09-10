package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f37674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f37675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f37676o;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVastEndCardView.this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.widget.a {
        public b() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
            mBridgeVastEndCardView.notifyListener.a(108, mBridgeVastEndCardView.c());
        }
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    private boolean e() {
        this.f37674m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
        this.f37675n = findViewById(findID("mbridge_iv_vastclose"));
        View viewFindViewById = findViewById(findID("mbridge_iv_vastok"));
        this.f37676o = viewFindViewById;
        return isNotNULL(this.f37674m, this.f37675n, viewFindViewById);
    }

    private void f() {
        if (this.f37563e) {
            setMatchParent();
            setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f37674m.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f37563e) {
            this.f37675n.setOnClickListener(new a());
            this.f37676o.setOnClickListener(new b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_vast");
        if (i0.a(iFindLayout)) {
            this.f37561c.inflate(iFindLayout, this);
            this.f37563e = e();
            d();
            f();
        }
    }

    public void notifyShowListener() {
        this.notifyListener.a(InterfaceC0435l1.d.b.f29112i, "");
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
    }
}
