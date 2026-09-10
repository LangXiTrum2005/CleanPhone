package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.util.timer.a;
import com.mbridge.msdk.util.timer.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBCountDownView extends MBTextView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f32841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBCountDownView f32842g;

    public MBCountDownView(Context context) {
        super(context);
        this.f32842g = this;
    }

    public void initView(final String str, final String str2, int i10) {
        this.f32841f = new b().b(i10 * 1000).a(1000L).a(new a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.util.timer.a
            public void onFinish() {
                MBCountDownView.this.f32841f.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.util.timer.a
            public void onTick(long j10) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.f32842g.setText((j10 / 1000) + "s" + str);
                    return;
                }
                MBCountDownView.this.f32842g.setText(MBCountDownView.this.f32842g + " " + (j10 / 1000) + "s");
            }
        });
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f32841f;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f32841f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32842g = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32842g = this;
    }
}
