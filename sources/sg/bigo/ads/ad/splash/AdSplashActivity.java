package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.p004ironsource.sv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* JADX INFO: loaded from: classes7.dex */
public class AdSplashActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, b> f46780a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f46781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f46782c = new AtomicBoolean(false);

    public static void a(Context context, b bVar) {
        Intent intent = new Intent(context, (Class<?>) (bVar.getStyle() == SplashAd.Style.HORIZONTAL ? LandscapeAdSplashActivity.class : AdSplashActivity.class));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        int iHashCode = bVar.hashCode();
        intent.putExtra("splash_hash", iHashCode);
        f46780a.put(Integer.valueOf(iHashCode), bVar);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            if (this.f46781b == null || !this.f46782c.compareAndSet(false, true)) {
                return;
            }
            this.f46781b.f46926z.onAdClosed();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
            }
            Intent intent = getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra("splash_hash", -1);
                Map<Integer, b> map = f46780a;
                b bVar = map.get(Integer.valueOf(intExtra));
                if (bVar != null) {
                    map.remove(Integer.valueOf(intExtra));
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setBackgroundColor(-1);
                    setContentView(frameLayout);
                    this.f46781b = bVar;
                    bVar.f46926z.f46956c = new SplashAdInteractionListener() { // from class: sg.bigo.ads.ad.splash.AdSplashActivity.1
                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdClicked() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", sv.f);
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdClosed() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", sv.g);
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdError(AdError adError) {
                            if (adError == null) {
                                return;
                            }
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdError: " + adError.getCode() + " " + adError.getMessage());
                        }

                        @Override // sg.bigo.ads.api.SplashAdInteractionListener
                        public final void onAdFinished() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdFinished");
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdImpression() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdImpression");
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdOpened() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", sv.f27215c);
                        }

                        @Override // sg.bigo.ads.api.SplashAdInteractionListener
                        public final void onAdSkipped() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdSkipped");
                            AdSplashActivity.this.finish();
                        }
                    };
                    bVar.a(frameLayout);
                    b bVar2 = this.f46781b;
                    if (bVar2 != null) {
                        bVar2.f46926z.onAdOpened();
                        return;
                    }
                    return;
                }
            }
            finish();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f46781b != null && this.f46782c.compareAndSet(false, true)) {
                this.f46781b.f46926z.onAdClosed();
            }
            b bVar = this.f46781b;
            if (bVar != null) {
                bVar.destroy();
                this.f46781b = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        b bVar = this.f46781b;
        if (bVar == null || !bVar.isSkippable()) {
            return true;
        }
        this.f46781b.d(8);
        return true;
    }

    @Override // android.app.Activity
    public void onResume() {
        View decorView;
        super.onResume();
        try {
            Window window = getWindow();
            if (window == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.setSystemUiVisibility(4098);
        } catch (Throwable unused) {
            finish();
        }
    }
}
