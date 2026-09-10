package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public final class ToastUtils {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final ToastUtils f17442formularize = triweekly();

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static WeakReference<marial> f17443impassible;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f17445attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f17452saneness = -1;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f17449dern = -1;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f17454wireman = -1;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f17451marial = -16777217;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f17446beachfront = -1;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f17447competently = -16777217;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f17450impromptu = -1;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f17453taiyuan = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public Drawable[] f17448cutely = new Drawable[4];

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f17444apical = false;

    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {
        private static final int SPACING = rotuma.dern(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context) {
            super(context);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(rotuma.competently() - SPACING, Integer.MIN_VALUE), i2);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public class attabal implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (ToastUtils.f17443impassible != null) {
                marial marialVar = (marial) ToastUtils.f17443impassible.get();
                if (marialVar != null) {
                    marialVar.cancel();
                }
                WeakReference unused = ToastUtils.f17443impassible = null;
            }
        }
    }

    public static final class beachfront extends dern {

        public static class attabal extends Handler {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public Handler f17455attabal;

            public attabal(Handler handler) {
                this.f17455attabal = handler;
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                try {
                    this.f17455attabal.dispatchMessage(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                this.f17455attabal.handleMessage(message);
            }
        }

        public beachfront(ToastUtils toastUtils) {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f17459attabal);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new attabal((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.marial
        public void show(int i) {
            Toast toast = this.f17459attabal;
            if (toast == null) {
                return;
            }
            toast.setDuration(i);
            this.f17459attabal.show();
        }
    }

    public static abstract class dern implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Toast f17459attabal = new Toast(adultoid.attabal());

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public View f17460dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ToastUtils f17461saneness;

        public dern(ToastUtils toastUtils) {
            this.f17461saneness = toastUtils;
            if (toastUtils.f17452saneness == -1 && this.f17461saneness.f17449dern == -1 && this.f17461saneness.f17454wireman == -1) {
                return;
            }
            this.f17459attabal.setGravity(this.f17461saneness.f17452saneness, this.f17461saneness.f17449dern, this.f17461saneness.f17454wireman);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.marial
        public void attabal(View view) {
            this.f17460dern = view;
            this.f17459attabal.setView(view);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.marial
        public void cancel() {
            Toast toast = this.f17459attabal;
            if (toast != null) {
                toast.cancel();
            }
            this.f17459attabal = null;
            this.f17460dern = null;
        }

        public View dern(int i) {
            Bitmap bitmapTrm = rotuma.trm(this.f17460dern);
            ImageView imageView = new ImageView(adultoid.attabal());
            imageView.setTag("TAG_TOAST" + i);
            imageView.setImageBitmap(bitmapTrm);
            return imageView;
        }

        public final void marial(TextView textView) {
            if (this.f17461saneness.f17446beachfront != -1) {
                this.f17460dern.setBackgroundResource(this.f17461saneness.f17446beachfront);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.f17461saneness.f17451marial != -16777217) {
                Drawable background = this.f17460dern.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f17461saneness.f17451marial, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f17461saneness.f17451marial, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.f17461saneness.f17451marial, PorterDuff.Mode.SRC_IN));
                } else {
                    this.f17460dern.setBackgroundColor(this.f17461saneness.f17451marial);
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.marial
        public void saneness(CharSequence charSequence) {
            View viewGraveside = this.f17461saneness.graveside(charSequence);
            if (viewGraveside != null) {
                attabal(viewGraveside);
                wireman();
                return;
            }
            View view = this.f17459attabal.getView();
            this.f17460dern = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                attabal(rotuma.dovishness(don.saneness.utils_toast_view));
            }
            TextView textView = (TextView) this.f17460dern.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.f17461saneness.f17447competently != -16777217) {
                textView.setTextColor(this.f17461saneness.f17447competently);
            }
            if (this.f17461saneness.f17450impromptu != -1) {
                textView.setTextSize(this.f17461saneness.f17450impromptu);
            }
            marial(textView);
            wireman();
        }

        public final void wireman() {
            if (rotuma.graveside()) {
                attabal(dern(-1));
            }
        }
    }

    public interface marial {
        void attabal(View view);

        void cancel();

        void saneness(CharSequence charSequence);

        void show(int i);
    }

    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ View f17462arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ CharSequence f17464monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ int f17465polloi;

        public saneness(View view, CharSequence charSequence, int i) {
            this.f17462arytenoidectomy = view;
            this.f17464monoploid = charSequence;
            this.f17465polloi = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastUtils.formularize();
            marial marialVarKowloon = ToastUtils.kowloon(ToastUtils.this);
            WeakReference unused = ToastUtils.f17443impassible = new WeakReference(marialVarKowloon);
            View view = this.f17462arytenoidectomy;
            if (view != null) {
                marialVarKowloon.attabal(view);
            } else {
                marialVarKowloon.saneness(this.f17464monoploid);
            }
            marialVarKowloon.show(this.f17465polloi);
        }
    }

    public static final class wireman extends dern {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static int f17466beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public marial f17467marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public adultoid.attabal f17468wireman;

        public class attabal implements Runnable {
            public attabal() {
            }

            @Override // java.lang.Runnable
            public void run() {
                wireman.this.cancel();
            }
        }

        public class saneness extends adultoid.attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ int f17470attabal;

            public saneness(int i) {
                this.f17470attabal = i;
            }

            @Override // com.blankj.utilcode.util.adultoid.attabal
            public void attabal(Activity activity) {
                if (wireman.this.impromptu()) {
                    wireman.this.apical(activity, this.f17470attabal, false);
                }
            }
        }

        public wireman(ToastUtils toastUtils) {
            super(toastUtils);
        }

        public final void apical(Activity activity, int i, boolean z) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.f17459attabal.getGravity();
                layoutParams.bottomMargin = this.f17459attabal.getYOffset() + rotuma.apical();
                layoutParams.topMargin = this.f17459attabal.getYOffset() + rotuma.triweekly();
                layoutParams.leftMargin = this.f17459attabal.getXOffset();
                View viewDern = dern(i);
                if (z) {
                    viewDern.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    viewDern.animate().alpha(1.0f).setDuration(200L).start();
                }
                viewGroup.addView(viewDern, layoutParams);
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.dern, com.blankj.utilcode.util.ToastUtils.marial
        public void cancel() {
            Window window;
            if (impromptu()) {
                impassible();
                for (Activity activity : rotuma.beachfront()) {
                    if (rotuma.arytenoidectomy(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append("TAG_TOAST");
                        sb.append(f17466beachfront - 1);
                        View viewFindViewWithTag = viewGroup.findViewWithTag(sb.toString());
                        if (viewFindViewWithTag != null) {
                            try {
                                viewGroup.removeView(viewFindViewWithTag);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            marial marialVar = this.f17467marial;
            if (marialVar != null) {
                marialVar.cancel();
                this.f17467marial = null;
            }
            super.cancel();
        }

        public final marial cutely(int i) {
            beachfront beachfrontVar = new beachfront(this.f17461saneness);
            beachfrontVar.f17459attabal = this.f17459attabal;
            beachfrontVar.show(i);
            return beachfrontVar;
        }

        public final marial formularize(Activity activity, int i) {
            competently competentlyVar = new competently(this.f17461saneness, activity.getWindowManager(), 99);
            competentlyVar.f17460dern = dern(-1);
            competentlyVar.f17459attabal = this.f17459attabal;
            competentlyVar.show(i);
            return competentlyVar;
        }

        public final void impassible() {
            rotuma.preprohormone(this.f17468wireman);
            this.f17468wireman = null;
        }

        public final boolean impromptu() {
            return this.f17468wireman != null;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.marial
        public void show(int i) {
            if (this.f17459attabal == null) {
                return;
            }
            if (!rotuma.monoploid()) {
                this.f17467marial = cutely(i);
                return;
            }
            boolean z = false;
            for (Activity activity : rotuma.beachfront()) {
                if (rotuma.arytenoidectomy(activity)) {
                    if (z) {
                        apical(activity, f17466beachfront, true);
                    } else {
                        this.f17467marial = formularize(activity, i);
                        z = true;
                    }
                }
            }
            if (!z) {
                this.f17467marial = cutely(i);
                return;
            }
            taiyuan();
            rotuma.cuirassed(new attabal(), i == 0 ? 2000L : 3500L);
            f17466beachfront++;
        }

        public final void taiyuan() {
            saneness sanenessVar = new saneness(f17466beachfront);
            this.f17468wireman = sanenessVar;
            rotuma.attabal(sanenessVar);
        }
    }

    public static void arytenoidectomy(View view, CharSequence charSequence, int i, ToastUtils toastUtils) {
        rotuma.cord(toastUtils.new saneness(view, charSequence, i));
    }

    public static void formularize() {
        rotuma.cord(new attabal());
    }

    public static CharSequence impassible(CharSequence charSequence) {
        if (charSequence == null) {
            return "toast null";
        }
        return charSequence.length() == 0 ? "toast nothing" : charSequence;
    }

    public static marial kowloon(ToastUtils toastUtils) {
        if (!toastUtils.f17444apical && igbo.polloi.saneness(adultoid.attabal()).attabal() && !rotuma.polloi()) {
            return new beachfront(toastUtils);
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            return new competently(toastUtils, 2005);
        }
        if (rotuma.polloi()) {
            return i >= 26 ? new competently(toastUtils, 2038) : new competently(toastUtils, 2002);
        }
        return new wireman(toastUtils);
    }

    public static void molybdenite(String str, Object... objArr) {
        monoploid(rotuma.marial(str, objArr), 0, f17442formularize);
    }

    public static void monoploid(CharSequence charSequence, int i, ToastUtils toastUtils) {
        arytenoidectomy(null, impassible(charSequence), i, toastUtils);
    }

    public static void polloi(String str, Object... objArr) {
        monoploid(rotuma.marial(str, objArr), 1, f17442formularize);
    }

    public static ToastUtils triweekly() {
        return new ToastUtils();
    }

    public final View graveside(CharSequence charSequence) {
        if (!"dark".equals(this.f17445attabal) && !"light".equals(this.f17445attabal)) {
            Drawable[] drawableArr = this.f17448cutely;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View viewDovishness = rotuma.dovishness(don.saneness.utils_toast_view);
        TextView textView = (TextView) viewDovishness.findViewById(R.id.message);
        if ("dark".equals(this.f17445attabal)) {
            ((GradientDrawable) viewDovishness.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.f17448cutely[0] != null) {
            View viewFindViewById = viewDovishness.findViewById(don.attabal.utvLeftIconView);
            premeiotic.czestochowa(viewFindViewById, this.f17448cutely[0]);
            viewFindViewById.setVisibility(0);
        }
        if (this.f17448cutely[1] != null) {
            View viewFindViewById2 = viewDovishness.findViewById(don.attabal.utvTopIconView);
            premeiotic.czestochowa(viewFindViewById2, this.f17448cutely[1]);
            viewFindViewById2.setVisibility(0);
        }
        if (this.f17448cutely[2] != null) {
            View viewFindViewById3 = viewDovishness.findViewById(don.attabal.utvRightIconView);
            premeiotic.czestochowa(viewFindViewById3, this.f17448cutely[2]);
            viewFindViewById3.setVisibility(0);
        }
        if (this.f17448cutely[3] != null) {
            View viewFindViewById4 = viewDovishness.findViewById(don.attabal.utvBottomIconView);
            premeiotic.czestochowa(viewFindViewById4, this.f17448cutely[3]);
            viewFindViewById4.setVisibility(0);
        }
        return viewDovishness;
    }

    public static final class competently extends dern {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public WindowManager.LayoutParams f17456marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public WindowManager f17457wireman;

        public class attabal implements Runnable {
            public attabal() {
            }

            @Override // java.lang.Runnable
            public void run() {
                competently.this.cancel();
            }
        }

        public competently(ToastUtils toastUtils, int i) {
            super(toastUtils);
            this.f17456marial = new WindowManager.LayoutParams();
            this.f17457wireman = (WindowManager) adultoid.attabal().getSystemService("window");
            this.f17456marial.type = i;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.dern, com.blankj.utilcode.util.ToastUtils.marial
        public void cancel() {
            try {
                WindowManager windowManager = this.f17457wireman;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f17460dern);
                    this.f17457wireman = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }

        @Override // com.blankj.utilcode.util.ToastUtils.marial
        public void show(int i) {
            if (this.f17459attabal == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.f17456marial;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.f17456marial;
            layoutParams2.flags = Opcodes.DCMPG;
            layoutParams2.packageName = adultoid.attabal().getPackageName();
            this.f17456marial.gravity = this.f17459attabal.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.f17456marial;
            int i2 = layoutParams3.gravity;
            if ((i2 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i2 & 112) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.f17459attabal.getXOffset();
            this.f17456marial.y = this.f17459attabal.getYOffset();
            this.f17456marial.horizontalMargin = this.f17459attabal.getHorizontalMargin();
            this.f17456marial.verticalMargin = this.f17459attabal.getVerticalMargin();
            try {
                WindowManager windowManager = this.f17457wireman;
                if (windowManager != null) {
                    windowManager.addView(this.f17460dern, this.f17456marial);
                }
            } catch (Exception unused) {
            }
            rotuma.cuirassed(new attabal(), i == 0 ? 2000L : 3500L);
        }

        public competently(ToastUtils toastUtils, WindowManager windowManager, int i) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f17456marial = layoutParams;
            this.f17457wireman = windowManager;
            layoutParams.type = i;
        }
    }
}
