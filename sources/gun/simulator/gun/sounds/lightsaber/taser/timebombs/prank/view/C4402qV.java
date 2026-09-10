package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.airbnb.lottie.LottieAnimationView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4402qV extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f4884a;
    public final Rect b;
    public final LottieAnimationView c;
    public View d;
    public InterfaceC2714Qw e;

    public C4402qV(MainActivity mainActivity) {
        super(mainActivity, null, 0);
        this.f4884a = new Paint(1);
        this.b = new Rect();
        LottieAnimationView lottieAnimationView = new LottieAnimationView(mainActivity);
        this.c = lottieAnimationView;
        setWillNotDraw(false);
        int iX = AbstractC3375el.x((getResources().getConfiguration().screenWidthDp / 360.0f) * 100.0f);
        lottieAnimationView.setAnimation("highlight/data.json");
        lottieAnimationView.setImageAssetsFolder("highlight/images");
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.e();
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(iX, iX));
        lottieAnimationView.setClickable(false);
        addView(lottieAnimationView);
    }

    public final InterfaceC2714Qw getOnHighLightClicked() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        View view = this.d;
        if (view == null) {
            return;
        }
        Rect rect = this.b;
        view.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawColor(Color.parseColor("#CC000000"));
        Paint paint = this.f4884a;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawRoundRect(new RectF(rect), AbstractC3375el.x(15.0f), AbstractC3375el.x(15.0f), paint);
        paint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
        float f2 = rect.right;
        LottieAnimationView lottieAnimationView = this.c;
        lottieAnimationView.setX((f2 - lottieAnimationView.getWidth()) - AbstractC3375el.x(5.0f));
        lottieAnimationView.setY(rect.top + AbstractC3375el.x(5.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC2995aW.q(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.d == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() != 1 || !this.b.contains(x, y)) {
            return true;
        }
        InterfaceC2714Qw interfaceC2714Qw = this.e;
        if (interfaceC2714Qw != null) {
            interfaceC2714Qw.invoke();
        }
        postDelayed(new P0(this, 14), 200L);
        return false;
    }

    public final void setOnHighLightClicked(InterfaceC2714Qw interfaceC2714Qw) {
        this.e = interfaceC2714Qw;
    }
}
