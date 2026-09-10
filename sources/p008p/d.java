package p008p;

import android.view.View;
import com.chartboost.sdk.impl.bk;
import com.chartboost.sdk.impl.sc;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Function0 f45282Y;

    public /* synthetic */ d(Function0 function0, int i2) {
        this.X = i2;
        this.f45282Y = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.X) {
            case 0:
                bk.a(this.f45282Y, view);
                break;
            default:
                sc.a(this.f45282Y, view);
                break;
        }
    }
}
