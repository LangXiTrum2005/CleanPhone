package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f35079b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f35080a;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0154a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseView f35081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35082b;

        public RunnableC0154a(BaseView baseView, boolean z10) {
            this.f35081a = baseView;
            this.f35082b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35081a.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
            this.f35081a.getmAnimationPlayer().getBackground().setAlpha(this.f35082b ? 200 : 255);
            a.this.a(this.f35081a.getmAnimationPlayer());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35084a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f35084a = iArr;
            try {
                iArr[BaseView.a.FULL_TOP_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35084a[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private a(Context context) {
        this.f35080a = new WeakReference<>(context);
    }

    public void b(boolean z10, boolean z11, BaseView baseView) {
        if (z11) {
            new Handler().postDelayed(new RunnableC0154a(baseView, z10), 1000L);
        }
    }

    public static a a(Context context) {
        if (f35079b == null) {
            synchronized (a.class) {
                try {
                    if (f35079b == null) {
                        f35079b = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35079b;
    }

    public void a(BaseView.a aVar, CampaignEx campaignEx, BaseView baseView) {
        int i10 = b.f35084a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            return;
        }
        MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
        if (mBridgeTopFullView != null) {
            Context context = this.f35080a.get();
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).a(campaignEx.getIconUrl(), new c(mBridgeTopFullView));
            }
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
            mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
        }
    }

    public void a(boolean z10, BaseView baseView) {
        if (baseView instanceof MBridgeTopFullView) {
            MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
            int i10 = z10 ? 0 : 8;
            mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i10);
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i10);
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i10);
            mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i10);
        }
    }

    public void a(boolean z10, BaseView baseView, int i10) {
        RelativeLayout.LayoutParams layoutParams;
        int iA;
        Context context = this.f35080a.get();
        if (context != null) {
            if (z10) {
                layoutParams = new RelativeLayout.LayoutParams((int) (a(z10) / 3.0f), v0.a(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = v0.a(context, 10.0f);
                if (f.a(context) && i10 == 0) {
                    iA = v0.a(context, 8.0f) + v0.c(context);
                } else {
                    iA = v0.a(context, 8.0f);
                }
                layoutParams.rightMargin = iA;
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    private float a(boolean z10) {
        try {
            Context context = this.f35080a.get();
            if (context == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float fI = v0.i(context);
            return z10 ? fI + v0.c(context) : fI;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public void a(boolean z10, boolean z11, BaseView baseView) {
        int color = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(color);
        Context context = this.f35080a.get();
        if (!z10) {
            if (baseView.style == BaseView.a.FULL_MIDDLE_VIEW) {
                b(z10, z11, baseView);
                return;
            } else {
                if (context != null) {
                    baseView.getmAnimationContent().setBackgroundResource(i0.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    baseView.getmAnimationPlayer().setBackgroundResource(i0.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    return;
                }
                return;
            }
        }
        if (baseView.style == BaseView.a.FULL_TOP_VIEW && context != null) {
            baseView.getmAnimationContent().setBackgroundResource(i0.a(context, "mbridge_nativex_fullview_background", "drawable"));
            baseView.getmAnimationPlayer().setBackgroundColor(color);
        }
        if (z11) {
            baseView.getmAnimationPlayer().getBackground().setAlpha(80);
        } else {
            baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
            baseView.getmAnimationPlayer().getBackground().setAlpha(200);
        }
        b(z10, z11, baseView);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MBridgeTopFullView> f35085a;

        public c(MBridgeTopFullView mBridgeTopFullView) {
            this.f35085a = new WeakReference<>(mBridgeTopFullView);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.f35085a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f35085a.get().getMBridgeFullViewDisplayIcon().setImageBitmap(a.this.a(bitmap, 25));
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }

    public void a(BaseView baseView) {
        baseView.getmAnimationPlayer().clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(2);
        alphaAnimation.setRepeatMode(1);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Bitmap bitmap, int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f10 = i10;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public void a(View view, BaseView baseView) {
        if (view == null || baseView == null) {
            return;
        }
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        baseView.f35072i.addView(view);
    }

    public void a(BaseView baseView, boolean z10) {
        if (baseView != null) {
            baseView.setSystemUiVisibility(z10 ? 0 : 4098);
        }
    }
}
