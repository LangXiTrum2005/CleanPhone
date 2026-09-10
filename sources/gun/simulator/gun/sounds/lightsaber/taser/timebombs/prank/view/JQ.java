package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class JQ extends WG implements InterfaceC2766Sw {
    final /* synthetic */ ImageView $imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQ(ImageView imageView) {
        super(1);
        this.$imageView = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m182invoke$lambda0(ImageView imageView, Bitmap bitmap) {
        AbstractC2995aW.q(bitmap, "$it");
        imageView.setImageBitmap(bitmap);
    }

    public final void invoke(Bitmap bitmap) {
        AbstractC2995aW.q(bitmap, "it");
        ImageView imageView = this.$imageView;
        if (imageView != null) {
            C3622hc0.INSTANCE.runOnUiThread(new Ff0(9, imageView, bitmap));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return C5033xf0.f5238a;
    }
}
