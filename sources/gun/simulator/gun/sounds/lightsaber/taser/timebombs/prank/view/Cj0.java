package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes4.dex */
public final class Cj0 extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj0(Context context, String str) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, MBridgeConstans.EXTRA_KEY_WM);
        byte[] bArrDecode = Base64.decode(str, 0);
        AbstractC2995aW.p(bArrDecode, "overlayBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
