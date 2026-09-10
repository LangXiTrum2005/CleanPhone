package A;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.inmobi.media.Xb;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class O implements DialogInterface.OnClickListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3153Y;

    public /* synthetic */ O(Object obj, int i2) {
        this.X = i2;
        this.f3153Y = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.X) {
            case 0:
                Xb.b((JsResult) this.f3153Y, dialogInterface, i2);
                break;
            case 1:
                Xb.c((JsResult) this.f3153Y, dialogInterface, i2);
                break;
            case 2:
                Xb.a((JsResult) this.f3153Y, dialogInterface, i2);
                break;
            default:
                NativeAdPresenter.m3241showGdpr$lambda8((NativeAdPresenter) this.f3153Y, dialogInterface, i2);
                break;
        }
    }
}
