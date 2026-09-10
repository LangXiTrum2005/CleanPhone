package sg.bigo.ads.api;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public final class AdSize extends p {
    public static final String ADAPTIVE = "adaptive";
    private static p d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46958a;
    public static final AdSize BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250");
    public static final AdSize LARGE_BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, "320x90");
    public static final AdSize MOBILE_LARGE_LEADERBOARD = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90");

    private AdSize(int i2, int i3, String str) {
        super(i2, i3);
        this.f46958a = str;
    }

    public static int dp2px(Context context, int i2) {
        if (context == null) {
            return 0;
        }
        return e.a(context, i2);
    }

    public static AdSize getAdaptiveAdSize(Context context, int i2) {
        float f;
        float f2;
        int iRound;
        if (context == null || i2 == 0) {
            return BANNER;
        }
        if (d == null) {
            d = e.e(context);
        }
        int height = d.getHeight();
        if (height <= 0) {
            return BANNER;
        }
        int iMin = Math.min(90, Math.round(height * 0.15f));
        if (i2 < 0) {
            i2 = d.getWidth();
        }
        if (i2 <= 655) {
            if (i2 > 632) {
                iRound = 81;
            } else if (i2 > 526) {
                f = i2 / 468.0f;
                f2 = 60.0f;
            } else if (i2 > 432) {
                iRound = 68;
            } else {
                f = i2 / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i2, Math.max(Math.min(iRound, iMin), 50), ADAPTIVE);
        }
        f = i2 / 728.0f;
        f2 = 90.0f;
        iRound = Math.round(f * f2);
        return new AdSize(i2, Math.max(Math.min(iRound, iMin), 50), ADAPTIVE);
    }

    @Override // sg.bigo.ads.common.p
    public final int getHeight() {
        return super.getHeight();
    }

    @Override // sg.bigo.ads.common.p
    public final int getWidth() {
        return super.getWidth();
    }
}
