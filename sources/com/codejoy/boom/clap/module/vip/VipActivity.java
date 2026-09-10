package com.codejoy.boom.clap.module.vip;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.czestochowa;
import androidx.fragment.app.FragmentManager;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.helper.VersionHelper;
import com.codejoy.boom.clap.module.WebViewActivity;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.ui.AdActivity;
import fright.VerifySubRequest;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.premeiotic;
import loungewear.PurchaseItem;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: VipActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0007*\u0001*\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/VipActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/formularize;", "<init>", "()V", "", "achondroplasia", "czestochowa", "lightstruck", "claque", "julian", "monroe", "()Lsonnetize/formularize;", "privatdozent", "saran", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "", "cord", "Lpatroclinal/taiyuan;", "empress", "()Ljava/lang/String;", "entrance", "Lcom/codejoy/boom/clap/module/vip/gintrap;", "cuirassed", "coi", "()Lcom/codejoy/boom/clap/module/vip/gintrap;", "vipListAdapter", "Landroid/text/style/ClickableSpan;", "stratoscope", "Landroid/text/style/ClickableSpan;", "clickableSpan", "Lloungewear/marial;", "trm", "Lloungewear/marial;", "currentPurchaseItem", "", "oilcan", "Ljava/util/List;", "currentPurchaseList", "com/codejoy/boom/clap/module/vip/VipActivity$dern", "yemenite", "Lcom/codejoy/boom/clap/module/vip/VipActivity$dern;", "iapPayListener", "sealless", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VipActivity extends BaseActivity<sonnetize.formularize> {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public List<PurchaseItem> currentPurchaseList;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public PurchaseItem currentPurchaseItem;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final int f18511kattegat = 8;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan entrance = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.vip.dern
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VipActivity.sayid(this.f18541kowloon);
        }
    });

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan vipListAdapter = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.vip.marial
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VipActivity.unconsolidated();
        }
    });

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final ClickableSpan clickableSpan = new saneness();

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public final dern iapPayListener = new dern();

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.vip.VipActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: VipActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/codejoy/boom/clap/module/vip/VipActivity$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/codejoy/boom/clap/module/vip/VipEntranceSource;", "entrance", "", "attabal", "(Landroid/content/Context;Lcom/codejoy/boom/clap/module/vip/VipEntranceSource;)V", "", "KEY_VIP_ENTRANCE", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(Context context, VipEntranceSource entrance) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
            Intent intent = new Intent(context, (Class<?>) VipActivity.class);
            String lowerCase = entrance.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            intent.putExtra("vip_entrance", lowerCase);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: VipActivity.kt */
    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"com/codejoy/boom/clap/module/vip/VipActivity$dern", "Lmagenta/dern;", "", X3.i.m, InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "beachfront", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/android/billingclient/api/BillingResult;", "result", "Lcom/android/billingclient/api/Purchase;", "purchase", "Lcom/android/billingclient/api/ProductDetails;", "productDetail", "purchaseType", "formularize", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/Purchase;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "", IronSourceConstants.EVENTS_ERROR_CODE, "errorMsg", "", "isAcknowledged", "saneness", "(ILjava/lang/String;Ljava/lang/String;Z)V", "productDetails", "taiyuan", "(Lcom/android/billingclient/api/ProductDetails;Lcom/android/billingclient/api/Purchase;Ljava/lang/String;)V", "impromptu", "(ILjava/lang/String;Ljava/lang/String;)V", "Lfright/attabal;", AdActivity.REQUEST_KEY_EXTRA, "attabal", "(ILjava/lang/String;Lfright/attabal;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern extends magenta.dern {
        public dern() {
        }

        public static final void molybdenite(int i, VipActivity vipActivity) {
            if (i == 1) {
                ToastUtils.polloi(vipActivity.getString(com.codejoy.boom.clap.arytenoidectomy.user_cancel), new Object[0]);
            } else {
                ToastUtils.polloi(vipActivity.getString(com.codejoy.boom.clap.arytenoidectomy.purchase_fail), new Object[0]);
            }
        }

        public static final void monoploid() {
            ToastUtils.polloi("Google Play connect fail, please try again later.", new Object[0]);
        }

        public static final void polloi(int i, VipActivity vipActivity) {
            if (i == 1) {
                ToastUtils.polloi(vipActivity.getString(com.codejoy.boom.clap.arytenoidectomy.user_cancel), new Object[0]);
            } else {
                ToastUtils.polloi(vipActivity.getString(com.codejoy.boom.clap.arytenoidectomy.purchase_fail), new Object[0]);
            }
        }

        @Override // reuter.preprohormone
        public void attabal(int errorCode, String errorMsg, VerifySubRequest request, ProductDetails productDetails, String purchaseType) {
            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            if (errorCode == 0) {
                VipActivity.this.claque();
                return;
            }
            switch (errorCode) {
                case -1004:
                    ToastUtils.polloi(VipActivity.this.getString(com.codejoy.boom.clap.arytenoidectomy.error), new Object[0]);
                    break;
                case -1003:
                case -1001:
                    ToastUtils.polloi(VipActivity.this.getString(com.codejoy.boom.clap.arytenoidectomy.error), new Object[0]);
                    break;
                case -1002:
                    ToastUtils.polloi(VipActivity.this.getString(com.codejoy.boom.clap.arytenoidectomy.network_no_connect), new Object[0]);
                    break;
            }
        }

        @Override // magenta.dern
        public void beachfront(String productType, String productId) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(productId, "productId");
            super.beachfront(productType, productId);
            ThreadUtils.marial(new Runnable() { // from class: com.codejoy.boom.clap.module.vip.arytenoidectomy
                @Override // java.lang.Runnable
                public final void run() {
                    VipActivity.dern.monoploid();
                }
            });
        }

        @Override // magenta.dern
        public void formularize(BillingResult result, Purchase purchase, ProductDetails productDetail, String purchaseType) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            Intrinsics.checkNotNullParameter(productDetail, "productDetail");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            super.formularize(result, purchase, productDetail, purchaseType);
        }

        @Override // magenta.dern
        public void impromptu(final int errorCode, String errorMsg, String productId) {
            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
            Intrinsics.checkNotNullParameter(productId, "productId");
            super.impromptu(errorCode, errorMsg, productId);
            final VipActivity vipActivity = VipActivity.this;
            ThreadUtils.marial(new Runnable() { // from class: com.codejoy.boom.clap.module.vip.triweekly
                @Override // java.lang.Runnable
                public final void run() {
                    VipActivity.dern.polloi(errorCode, vipActivity);
                }
            });
        }

        @Override // magenta.dern, reuter.preprohormone
        public void saneness(final int errorCode, String errorMsg, String productId, boolean isAcknowledged) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            super.saneness(errorCode, errorMsg, productId, isAcknowledged);
            final VipActivity vipActivity = VipActivity.this;
            ThreadUtils.marial(new Runnable() { // from class: com.codejoy.boom.clap.module.vip.kowloon
                @Override // java.lang.Runnable
                public final void run() {
                    VipActivity.dern.molybdenite(errorCode, vipActivity);
                }
            });
        }

        @Override // magenta.dern
        public void taiyuan(ProductDetails productDetails, Purchase purchase, String purchaseType) {
            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
            super.taiyuan(productDetails, purchase, purchaseType);
        }
    }

    /* JADX INFO: compiled from: VipActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/codejoy/boom/clap/module/vip/VipActivity$saneness", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness extends ClickableSpan {
        public saneness() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Object objM3351constructorimpl;
            Intrinsics.checkNotNullParameter(widget, "widget");
            VipActivity vipActivity = VipActivity.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                vipActivity.startActivity(intent);
                objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            if (Result.m3354exceptionOrNullimpl(objM3351constructorimpl) != null) {
                ToastUtils.polloi("Please install Google Play first", new Object[0]);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(Color.parseColor("#99FFFFFF"));
            ds.setUnderlineText(true);
        }
    }

    /* JADX INFO: compiled from: VipActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/codejoy/boom/clap/module/vip/VipActivity$wireman", "Landroidx/lifecycle/marial;", "Landroidx/lifecycle/arytenoidectomy;", "owner", "", "dern", "(Landroidx/lifecycle/arytenoidectomy;)V", "onDestroy", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class wireman implements androidx.p001lifecycle.marial {
        public wireman() {
        }

        @Override // androidx.p001lifecycle.marial
        public void dern(androidx.p001lifecycle.arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            reuter.molybdenite.f36681attabal.itchy(VipActivity.this.iapPayListener);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void dovishness(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
            super.dovishness(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void monoploid(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
            super.monoploid(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public void onDestroy(androidx.p001lifecycle.arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            reuter.molybdenite.f36681attabal.coi(VipActivity.this.iapPayListener);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onStart(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
            super.onStart(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onStop(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
            super.onStop(arytenoidectomyVar);
        }
    }

    private final void czestochowa() {
        getLifecycle().attabal(new wireman());
    }

    private final String empress() {
        return (String) this.entrance.getValue();
    }

    public static final Unit gusty(VipActivity vipActivity, boolean z) {
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(vipActivity), premeiotic.dern(), null, new VipActivity$initView$5$1$1(z, vipActivity, null), 2, null);
        return Unit.f29295attabal;
    }

    public static final Unit hardpan(VipActivity vipActivity) {
        vipActivity.finish();
        return Unit.f29295attabal;
    }

    public static final void igbo(final VipActivity vipActivity, View view) {
        nestlike.marial marialVar = nestlike.marial.f33872attabal;
        Context applicationContext = vipActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        nestlike.marial.marial(marialVar, applicationContext, 40, null, null, 0, null, 60, null);
        reuter.molybdenite.f36681attabal.coffeecake(new Function1() { // from class: com.codejoy.boom.clap.module.vip.impassible
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VipActivity.gusty(this.f18548kowloon, ((Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit palmyra(VipActivity vipActivity, PurchaseItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vipActivity.currentPurchaseItem = it;
        vipActivity.achondroplasia();
        return Unit.f29295attabal;
    }

    public static final void picketboat(VipActivity vipActivity, View view) {
        Intrinsics.beachfront(view);
        if (vintage.taiyuan.taiyuan(view)) {
            return;
        }
        vipActivity.lightstruck();
    }

    public static final void preterite(VipActivity vipActivity, View view) {
        nestlike.marial marialVar = nestlike.marial.f33872attabal;
        Context applicationContext = vipActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        nestlike.marial.marial(marialVar, applicationContext, 51, null, null, 0, null, 60, null);
        WebViewActivity.Companion attabalVar = WebViewActivity.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String string = vipActivity.getString(com.codejoy.boom.clap.arytenoidectomy.privacy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        attabalVar.attabal(context, string, "https://boomclap.codejoys.net/privacy_policy.html");
    }

    public static final String sayid(VipActivity vipActivity) {
        String stringExtra = vipActivity.getIntent().getStringExtra("vip_entrance");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final Unit sensatory(VipActivity vipActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        if (!VersionHelper.f18244attabal.marial()) {
            couple.wireman.f24115attabal.saneness().gintrap(vipActivity, "ad_scenes_close_purchase_page", new transpositive.attabal(null, null, null, null, 15, null));
        }
        vipActivity.finish();
        return Unit.f29295attabal;
    }

    public static final gintrap unconsolidated() {
        return new gintrap();
    }

    public static final void underbelly(VipActivity vipActivity, View view) {
        vipActivity.getOnBackPressedDispatcher().formularize();
    }

    public static final void wostteth(VipActivity vipActivity, View view) {
        nestlike.marial marialVar = nestlike.marial.f33872attabal;
        Context applicationContext = vipActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        nestlike.marial.marial(marialVar, applicationContext, 52, null, null, 0, null, 60, null);
        WebViewActivity.Companion attabalVar = WebViewActivity.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String string = vipActivity.getString(com.codejoy.boom.clap.arytenoidectomy.terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        attabalVar.attabal(context, string, "https://boomclap.codejoys.net/terms_of_use.html");
    }

    public final void achondroplasia() {
        Number rawPrice;
        StringBuilder sb;
        String string;
        PurchaseItem purchaseItem = this.currentPurchaseItem;
        if (purchaseItem != null) {
            if (!Intrinsics.wireman(purchaseItem.getType(), "week")) {
                grimness().f37824kowloon.setText(getString(com.codejoy.boom.clap.arytenoidectomy.annual_tip));
                return;
            }
            if (purchaseItem.getOpenOffer()) {
                string = purchaseItem.getLocalFormattedPrice();
                if (string.length() == 0) {
                    rawPrice = purchaseItem.getRawPrice();
                    sb = new StringBuilder();
                }
                grimness().f37824kowloon.setText(getString(com.codejoy.boom.clap.arytenoidectomy.weekly_tip, string));
            }
            rawPrice = purchaseItem.getRawPrice();
            sb = new StringBuilder();
            sb.append("$");
            sb.append(rawPrice);
            string = sb.toString();
            grimness().f37824kowloon.setText(getString(com.codejoy.boom.clap.arytenoidectomy.weekly_tip, string));
        }
    }

    public final void claque() {
        PurchaseSuccessDialog purchaseSuccessDialog = new PurchaseSuccessDialog();
        purchaseSuccessDialog.impromptu(new Function0() { // from class: com.codejoy.boom.clap.module.vip.wireman
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VipActivity.hardpan(this.f18557kowloon);
            }
        });
        FragmentManager fragmentManagerPolloi = polloi();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
        vintage.saneness.attabal(purchaseSuccessDialog, fragmentManagerPolloi);
    }

    public final gintrap coi() {
        return (gintrap) this.vipListAdapter.getValue();
    }

    public final void julian() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(com.codejoy.boom.clap.impassible.btnLight);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, "translationX", -appCompatImageView.getWidth(), ((FrameLayout) findViewById(com.codejoy.boom.clap.impassible.purchaseButton)).getWidth());
        objectAnimatorOfFloat.setDuration(1800L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public final void lightstruck() {
        nestlike.marial marialVar = nestlike.marial.f33872attabal;
        BoomClapApplication.Companion companion = BoomClapApplication.INSTANCE;
        nestlike.marial.marial(marialVar, companion.attabal(), 20, null, null, 0, null, 60, null);
        if (!NetworkUtils.dern()) {
            ToastUtils.polloi(getString(com.codejoy.boom.clap.arytenoidectomy.network_no_connect), new Object[0]);
            return;
        }
        PurchaseItem purchaseItem = this.currentPurchaseItem;
        if (purchaseItem == null) {
            return;
        }
        nestlike.marial.marial(marialVar, companion.attabal(), 30, Intrinsics.wireman(purchaseItem.beachfront(), "subs") ? "subs" : "inapp", purchaseItem.getProductId(), 0, null, 48, null);
        reuter.molybdenite.f36681attabal.mathsort(this, purchaseItem.beachfront(), purchaseItem.getProductId());
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: monroe, reason: merged with bridge method [inline-methods] */
    public sonnetize.formularize starveling() {
        sonnetize.formularize formularizeVarDern = sonnetize.formularize.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(formularizeVarDern, "inflate(...)");
        return formularizeVarDern;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            julian();
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        Object objM3351constructorimpl;
        supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.codejoy.boom.clap.module.vip.beachfront
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VipActivity.sensatory(this.f18538kowloon, (sealless) obj);
            }
        }, 2, null);
        czestochowa.attabal(getWindow(), getWindow().getDecorView()).wireman(false);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        ParkinsansFontText tvTitle = grimness().f37815arytenoidectomy;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        com.codejoy.boom.clap.helper.apical.dern(tvTitle);
        ParkinsansFontText fullAccess = grimness().f37823impromptu;
        Intrinsics.checkNotNullExpressionValue(fullAccess, "fullAccess");
        com.codejoy.boom.clap.helper.apical.dern(fullAccess);
        ParkinsansFontText removeAds = grimness().f37821formularize;
        Intrinsics.checkNotNullExpressionValue(removeAds, "removeAds");
        com.codejoy.boom.clap.helper.apical.dern(removeAds);
        grimness().f37818competently.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.vip.competently
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActivity.underbelly(this.f18539kowloon, view);
            }
        });
        grimness().f37828taiyuan.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.vip.impromptu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActivity.preterite(this.f18549kowloon, view);
            }
        });
        grimness().f37829triweekly.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.vip.taiyuan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActivity.wostteth(this.f18554kowloon, view);
            }
        });
        grimness().f37822impassible.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.vip.cutely
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActivity.igbo(this.f18540kowloon, view);
            }
        });
        CardView purchaseButton = grimness().f37819cutely;
        Intrinsics.checkNotNullExpressionValue(purchaseButton, "purchaseButton");
        vintage.taiyuan.competently(purchaseButton);
        grimness().f37819cutely.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.vip.apical
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VipActivity.picketboat(this.f18536kowloon, view);
            }
        });
        grimness().f37814apical.setAdapter(coi());
        coi().taiyuan(new Function1() { // from class: com.codejoy.boom.clap.module.vip.formularize
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VipActivity.palmyra(this.f18542kowloon, (PurchaseItem) obj);
            }
        });
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = getString(com.codejoy.boom.clap.arytenoidectomy.vip_tip);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int iLotta = StringsKt.lotta(string, "{g}", 0, false, 6, null);
            int iLotta2 = StringsKt.lotta(string, "{/g}", 0, false, 6, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p002kotlin.text.dovishness.polder(p002kotlin.text.dovishness.polder(string, "{g}", "", false, 4, null), "{/g}", "", false, 4, null));
            spannableStringBuilder.setSpan(this.clickableSpan, iLotta, iLotta2 - 3, 33);
            AppCompatTextView appCompatTextView = grimness().f37826monoploid;
            appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
            appCompatTextView.setText(spannableStringBuilder);
            appCompatTextView.setHighlightColor(0);
            objM3351constructorimpl = Result.m3351constructorimpl(appCompatTextView);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            eia.impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        nestlike.marial marialVar = nestlike.marial.f33872attabal;
        marialVar.impromptu(empress());
        nestlike.marial.marial(marialVar, BoomClapApplication.INSTANCE.attabal(), 10, null, null, 0, null, 60, null);
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), premeiotic.saneness(), null, new VipActivity$initData$1(this, null), 2, null);
        czestochowa();
    }
}
