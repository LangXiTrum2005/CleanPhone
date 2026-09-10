package polder;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpolder/mathsort;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "target", "", "saneness", "(Landroid/view/View;I)V", "dern", "attabal", "(Landroid/view/View;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class mathsort {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final mathsort f35402attabal = new mathsort();

    public final void attabal(View view) {
        view.resetPivot();
    }

    public final void dern(View view, int target) {
        view.setOutlineSpotShadowColor(target);
    }

    public final void saneness(View view, int target) {
        view.setOutlineAmbientShadowColor(target);
    }
}
