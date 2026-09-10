package ads_mobile_sdk;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.p000activity.ComponentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.aesthesia;

/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends aesthesia {
    public final /* synthetic */ pz1 a;
    public final /* synthetic */ d41 b;

    public lz1(pz1 pz1Var, d41 d41Var) {
        this.a = pz1Var;
        this.b = d41Var;
    }

    @Override // saneness.aesthesia
    public final void a(ComponentActivity activity, LinearLayout layout) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(layout, "layout");
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setTag(TtmlNode.TAG_LAYOUT);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        String str = this.a.l;
        if (Intrinsics.wireman(str, "TOP")) {
            i = 49;
        } else {
            i = Intrinsics.wireman(str, "BOTTOM") ? 81 : 17;
        }
        layoutParams.gravity = i;
        int i2 = this.a.o;
        if (i2 > 0) {
            layoutParams.width = (int) TypedValue.applyDimension(1, i2, activity.getResources().getDisplayMetrics());
        }
        View view = this.b.k;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        frameLayout.addView(view, layoutParams);
        layout.setBackgroundColor(-1);
        layout.addView(frameLayout);
    }

    @Override // saneness.sunback
    public final void onDestroy() {
        this.b.destroy();
    }
}
