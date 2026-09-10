package com.applovin.mediation.nativeAds;

import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentButton;
import com.mbridge.msdk.config.dynamic.baseview.ComponentFrameLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentGridView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentInduceClickView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentListView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentScrollView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentTextView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.SoundImageView;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import kotlin.jvm.internal.n;
import q7.l0;
import y7.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10395b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f10394a = i10;
        this.f10395b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f10394a;
        Object obj = this.f10395b;
        switch (i10) {
            case 0:
                ((MaxNativeAd) obj).performClick();
                break;
            case 1:
                ((MoreOfferContainerView) obj).b(view);
                break;
            case 2:
                ((SoundImageView) obj).a(view);
                break;
            case 3:
                ((ComponentButton) obj).a(view);
                break;
            case 4:
                ((ComponentFrameLayout) obj).a(view);
                break;
            case 5:
                ((ComponentGridView) obj).a(view);
                break;
            case 6:
                ((ComponentHorizontalScrollView) obj).a(view);
                break;
            case 7:
                ((ComponentImageView) obj).a(view);
                break;
            case 8:
                ((ComponentInduceClickView) obj).a(view);
                break;
            case 9:
                ((ComponentLinearLayout) obj).a(view);
                break;
            case 10:
                ((ComponentListView) obj).a(view);
                break;
            case 11:
                ((ComponentRelativeLayout) obj).a(view);
                break;
            case 12:
                ((ComponentScrollView) obj).a(view);
                break;
            case 13:
                ((ComponentTextView) obj).a(view);
                break;
            case 14:
                ((ComponentWebView) obj).a(view);
                break;
            case 15:
                l0 this$0 = (l0) obj;
                n.f(this$0, "this$0");
                this$0.cancel();
                break;
            default:
                h this$1 = (h) obj;
                n.f(this$1, "this$0");
                this$1.I();
                break;
        }
    }
}
