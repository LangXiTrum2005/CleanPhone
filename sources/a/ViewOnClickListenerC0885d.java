package A;

import android.view.View;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.charging.screenshow.battery.animations.themes.activity.Charging3DShowAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingVideoPreviewAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingVideoShowAct;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct$initViews$1;
import com.charging.screenshow.battery.animations.themes.activity.PrivacyAct;
import com.charging.screenshow.battery.animations.themes.adapter.ImagePagerAdapter;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.chartboost.sdk.impl.b9;
import com.chartboost.sdk.impl.m8;
import com.chartboost.sdk.impl.wj;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.inmobi.media.A2;
import com.inmobi.media.C3002e9;
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

/* JADX INFO: renamed from: A.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC0885d implements View.OnClickListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3170Y;

    public /* synthetic */ ViewOnClickListenerC0885d(ImagePagerAdapter imagePagerAdapter, int i2) {
        this.X = 22;
        this.f3170Y = imagePagerAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f3170Y;
        switch (this.X) {
            case 0:
                A2.a((A2) obj, view);
                break;
            case 1:
                C3002e9.a((C3002e9) obj, view);
                break;
            case 2:
                ((ComponentButton) obj).a(view);
                break;
            case 3:
                ((ComponentFrameLayout) obj).a(view);
                break;
            case 4:
                ((ComponentGridView) obj).a(view);
                break;
            case 5:
                ((ComponentHorizontalScrollView) obj).a(view);
                break;
            case 6:
                ((ComponentImageView) obj).a(view);
                break;
            case 7:
                ((ComponentInduceClickView) obj).a(view);
                break;
            case 8:
                ((ComponentLinearLayout) obj).a(view);
                break;
            case 9:
                ((ComponentListView) obj).a(view);
                break;
            case 10:
                ((ComponentRelativeLayout) obj).a(view);
                break;
            case 11:
                ((ComponentScrollView) obj).a(view);
                break;
            case 12:
                ((ComponentTextView) obj).a(view);
                break;
            case 13:
                ((ComponentWebView) obj).a(view);
                break;
            case 14:
                ((MaxNativeAd) obj).performClick();
                break;
            case 15:
                int i2 = Charging3DShowAct.n0;
                Charging3DShowAct charging3DShowAct = (Charging3DShowAct) obj;
                if (AppPreferences.a() != 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - charging3DShowAct.l0 < 1500.0d) {
                        charging3DShowAct.finish();
                    }
                    charging3DShowAct.l0 = jCurrentTimeMillis;
                } else {
                    charging3DShowAct.finish();
                }
                break;
            case 16:
                int i3 = ChargingVideoPreviewAct.o0;
                ChargingVideoPreviewAct chargingVideoPreviewAct = (ChargingVideoPreviewAct) obj;
                if (AppPreferences.a() != 1) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - chargingVideoPreviewAct.n0 < 1500.0d) {
                        chargingVideoPreviewAct.finish();
                    }
                    chargingVideoPreviewAct.n0 = jCurrentTimeMillis2;
                } else {
                    chargingVideoPreviewAct.finish();
                }
                break;
            case 17:
                int i4 = ChargingVideoShowAct.n0;
                ChargingVideoShowAct chargingVideoShowAct = (ChargingVideoShowAct) obj;
                if (AppPreferences.a() != 1) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    if (jCurrentTimeMillis3 - chargingVideoShowAct.j0 < 1500.0d) {
                        chargingVideoShowAct.finish();
                    }
                    chargingVideoShowAct.j0 = jCurrentTimeMillis3;
                } else {
                    chargingVideoShowAct.finish();
                }
                break;
            case 18:
                int i5 = PrivacyAct.j0;
                ((PrivacyAct) obj).onBackPressed();
                break;
            case 19:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) obj;
                materialDatePicker.B0.setEnabled(materialDatePicker.c().C0());
                materialDatePicker.z0.toggle();
                materialDatePicker.o0 = materialDatePicker.o0 == 1 ? 0 : 1;
                materialDatePicker.g(materialDatePicker.z0);
                materialDatePicker.f();
                break;
            case 20:
                ((MoreOfferContainerView) obj).b(view);
                break;
            case 21:
                ((SoundImageView) obj).a(view);
                break;
            case 22:
                ImagePreviewAct$initViews$1 imagePreviewAct$initViews$1 = ((ImagePagerAdapter) obj).k;
                break;
            case 23:
                b9.b.a((b9) obj, view);
                break;
            case 24:
                m8.a((m8) obj, view);
                break;
            default:
                wj.a((wj) obj, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0885d(Object obj, int i2) {
        this.X = i2;
        this.f3170Y = obj;
    }
}
