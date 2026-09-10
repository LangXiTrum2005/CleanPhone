package ads_mobile_sdk;

import ads_mobile_sdk.vb1;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import org.objectweb.asm.Opcodes;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements hemolysin {
    public final jk0 a;
    public final yj1 b;
    public final carport c;
    public final xl1 d;
    public final saran e;
    public final oq1 f;

    public vb1(jk0 flags, yj1 nativeAdCore, carport nativeJavascriptEngine, xl1 nativeAdUtil, saran uiScope, oq1 nativePolicyValidatorState) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(nativePolicyValidatorState, "nativePolicyValidatorState");
        this.a = flags;
        this.b = nativeAdCore;
        this.c = nativeJavascriptEngine;
        this.d = nativeAdUtil;
        this.e = uiScope;
        this.f = nativePolicyValidatorState;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x015b A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0162 A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0166 A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0173 A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x017b A[Catch: all -> 0x016b, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0183 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #5 {all -> 0x016b, blocks: (B:70:0x0154, B:72:0x015b, B:74:0x0162, B:76:0x0166, B:78:0x016a, B:81:0x016d, B:82:0x0172, B:83:0x0173, B:84:0x017a, B:85:0x017b, B:86:0x0182, B:87:0x0183), top: B:103:0x0154 }] */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (r12.a(r14, "sendMessageToNativeJs", r0) == r1) goto L61;
     */
    @Override // saneness.hemolysin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gq0 r12, java.util.Map r13, wretchedly.dern r14) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vb1.a(ads_mobile_sdk.gq0, java.util.Map, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_LOAD_NATIVE_AD_POLICY_VIOLATIONS;
    }

    public final void a(final FrameLayout frameLayout, final gq0 gq0Var, Map map, final WindowManager windowManager) {
        int i;
        int i2;
        Context context = frameLayout.getContext();
        Intrinsics.beachfront(context);
        String str = (String) map.get("validator_width");
        jk0 jk0Var = this.a;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:policy_validator_overlay_width:dp", X3.i.W);
        ok okVar = zk.f;
        int iIntValue = ((Number) jk0Var.a("gads:policy_validator_overlay_width:dp", 350, okVar)).intValue();
        if (str != null) {
            try {
                iIntValue = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int iApplyDimension = (int) TypedValue.applyDimension(1, iIntValue, displayMetrics);
        String str2 = (String) map.get("validator_height");
        jk0 jk0Var2 = this.a;
        jk0Var2.getClass();
        Intrinsics.checkNotNullParameter("gads:policy_validator_overlay_height:dp", X3.i.W);
        int iIntValue2 = ((Number) jk0Var2.a("gads:policy_validator_overlay_height:dp", Integer.valueOf(Opcodes.F2L), okVar)).intValue();
        if (str2 != null) {
            try {
                iIntValue2 = Integer.parseInt(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        float f = iIntValue2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, f, displayMetrics2);
        String str3 = (String) map.get("validator_x");
        int i3 = 0;
        if (str3 == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(str3);
            } catch (NumberFormatException unused3) {
                i = 0;
            }
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, i, displayMetrics3);
        String str4 = (String) map.get("validator_y");
        if (str4 != null) {
            try {
                i3 = Integer.parseInt(str4);
            } catch (NumberFormatException unused4) {
            }
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "getDisplayMetrics(...)");
        int iApplyDimension4 = (int) TypedValue.applyDimension(1, i3, displayMetrics4);
        cutely.wireman(this.e, null, null, new sb1(gq0Var, iApplyDimension, iApplyDimension2, this, null), 3, null);
        xl1 xl1Var = this.d;
        xl1Var.getClass();
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        jk0 jk0Var3 = xl1Var.b;
        jk0Var3.getClass();
        Intrinsics.checkNotNullParameter("gads:policy_validator_layoutparam:flags", X3.i.W);
        layoutParams.flags = ((Number) jk0Var3.a("gads:policy_validator_layoutparam:flags", 808, zk.f)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        layoutParams.x = iApplyDimension3;
        layoutParams.y = iApplyDimension4;
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        cutely.wireman(this.e, null, null, new tb1(windowManager, gq0Var, layoutParams, null), 3, null);
        final String str5 = (String) map.get("orientation");
        Rect rect = new Rect();
        if (frameLayout.getGlobalVisibleRect(rect)) {
            if (!Intrinsics.wireman("1", str5) && !Intrinsics.wireman("2", str5)) {
                i2 = rect.top;
            } else {
                i2 = rect.bottom;
            }
            final int i4 = i2 - iApplyDimension4;
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: saneness.quotable
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    vb1.a(frameLayout, gq0Var, str5, layoutParams, i4, this, windowManager);
                }
            };
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            oq1 oq1Var = this.f;
            WeakReference weakReference = new WeakReference(onScrollChangedListener);
            oq1Var.getClass();
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            oq1Var.c = weakReference;
            oq1 oq1Var2 = this.f;
            WeakReference weakReference2 = new WeakReference(viewTreeObserver);
            oq1Var2.getClass();
            Intrinsics.checkNotNullParameter(weakReference2, "<set-?>");
            oq1Var2.b = weakReference2;
        }
    }

    public static final void a(View overlayFrame, gq0 validatorOverlay, String str, WindowManager.LayoutParams layoutParams, int i, vb1 this$0, WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(overlayFrame, "$overlayFrame");
        Intrinsics.checkNotNullParameter(validatorOverlay, "$validatorOverlay");
        Intrinsics.checkNotNullParameter(layoutParams, "$layoutParams");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(windowManager, "$windowManager");
        Rect rect = new Rect();
        if (!overlayFrame.getGlobalVisibleRect(rect) || validatorOverlay.getWindowToken() == null) {
            return;
        }
        if (!Intrinsics.wireman("1", str) && !Intrinsics.wireman("2", str)) {
            layoutParams.y = rect.top - i;
        } else {
            layoutParams.y = rect.bottom - i;
        }
        cutely.wireman(this$0.e, null, null, new ub1(windowManager, validatorOverlay, layoutParams, null), 3, null);
    }
}
