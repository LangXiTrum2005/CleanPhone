package saneness;

import ads_mobile_sdk.bn0;
import ads_mobile_sdk.cp0;
import ads_mobile_sdk.gn0;
import ads_mobile_sdk.j13;
import ads_mobile_sdk.l13;
import ads_mobile_sdk.no0;
import ads_mobile_sdk.ri2;
import ads_mobile_sdk.tl1;
import ads_mobile_sdk.v62;
import ads_mobile_sdk.w03;
import ads_mobile_sdk.xl1;
import ads_mobile_sdk.yn0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class lymphoblast {
    public static tl1 attabal(ri2 rootTraceCreator, l13 traceMetaSet, xl1 nativeAdUtil, FrameLayout frameLayout, Map assetViews, ImageView.ScaleType mediaviewScaleType) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        no0 no0Var = no0.CUI_NAME_NATIVE_AD_SIGNAL;
        List listFormularize = p002kotlin.collections.adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(rootTraceCreator, no0Var, listFormularize, traceMetaSet);
            try {
                tl1 tl1Var = new tl1(nativeAdUtil.a(frameLayout, mediaviewScaleType, assetViews), nativeAdUtil.c(frameLayout), nativeAdUtil.b(frameLayout), nativeAdUtil.a(frameLayout), nativeAdUtil.a());
                interaction.saneness.attabal(v62VarA, null);
                return tl1Var;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
                    if (th instanceof TimeoutCancellationException) {
                        throw new cp0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
        try {
            tl1 tl1Var2 = new tl1(nativeAdUtil.a(frameLayout, mediaviewScaleType, assetViews), nativeAdUtil.c(frameLayout), nativeAdUtil.b(frameLayout), nativeAdUtil.a(frameLayout), nativeAdUtil.a());
            interaction.saneness.attabal(w03VarA, null);
            return tl1Var2;
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (th4 instanceof evenfall) {
                    throw th4;
                }
                w03VarA.a(th4);
                if (th4 instanceof TimeoutCancellationException) {
                    throw new cp0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new bn0(th4);
                }
                if (th4 instanceof yn0) {
                    throw th4;
                }
                throw new gn0(th4);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }
}
