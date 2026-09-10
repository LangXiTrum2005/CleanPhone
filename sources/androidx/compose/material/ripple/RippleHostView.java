package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.material.ripple.RippleHostView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010%\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pressed", "", "setRippleState", "(Z)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lsupplicat/impassible;", "size", "Lrestrictive/overspeculate;", "color", "", "alpha", "setRippleProperties-07v42R4", "(JJF)V", "setRippleProperties", "", "kowloon", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "arytenoidectomy", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lkotlin/Function0;", "monoploid", "Lkotlin/jvm/functions/Function0;", "onInvalidateRipple", "polloi", "attabal", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Runnable resetRippleRunnable;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public Long lastRippleStateChangeTimeMillis;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> onInvalidateRipple;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final int f5771molybdenite = 8;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final int[] f5770graveside = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final int[] f5769adultoid = new int[0];

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (!pressed && jLongValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: graveside.saneness
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f27428kowloon);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        rippleHostView.getClass();
        rippleHostView.resetRippleRunnable = null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Function0<Unit> function0 = this.onInvalidateRipple;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    /* JADX INFO: renamed from: setRippleProperties-07v42R4, reason: not valid java name */
    public final void m0setRippleProperties07v42R4(long size, long color, float alpha) {
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
