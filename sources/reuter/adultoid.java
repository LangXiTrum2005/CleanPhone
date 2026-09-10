package reuter;

import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import loungewear.PurchaseConfigResponse;
import loungewear.PurchaseItem;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: IapPurchaseConfigHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR2\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001f0\u001ej\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001f` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020$0\u001ej\b\u0012\u0004\u0012\u00020$` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006)"}, d2 = {"Lreuter/adultoid;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "formularize", "(Landroid/content/Context;)V", "impromptu", "Lloungewear/wireman;", "marial", "()Lloungewear/wireman;", "", "boolean", "cutely", "(Z)V", "wireman", "taiyuan", "", "beachfront", "()J", "apical", "()Z", "purchaseListResponse", "competently", "(Lloungewear/wireman;)V", "saneness", "Lloungewear/wireman;", "purchaseConfig", "Ljava/util/ArrayList;", "Lmagenta/wireman;", "Lkotlin/collections/ArrayList;", "dern", "Ljava/util/ArrayList;", "purchaseListenerList", "", "lifetimePurchaseTokenList", "Z", "forceUpdatePurchase", "isLoading", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class adultoid {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static boolean isLoading;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static boolean forceUpdatePurchase;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static PurchaseConfigResponse purchaseConfig;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final adultoid f36626attabal = new adultoid();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static ArrayList<magenta.wireman<PurchaseConfigResponse>> purchaseListenerList = new ArrayList<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final ArrayList<String> lifetimePurchaseTokenList = new ArrayList<>();

    /* JADX INFO: compiled from: IapPurchaseConfigHelper.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"reuter/adultoid$attabal", "Lreuter/molybdenite$saneness;", "", "code", "", PglCryptUtils.KEY_MESSAGE, "", "attabal", "(ILjava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal implements molybdenite.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ PurchaseConfigResponse f36632attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f36633dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f36634saneness;

        public attabal(PurchaseConfigResponse purchaseConfigResponse, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2) {
            this.f36632attabal = purchaseConfigResponse;
            this.f36634saneness = ref$BooleanRef;
            this.f36633dern = ref$BooleanRef2;
        }

        @Override // reuter.molybdenite.saneness
        public void attabal(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            adultoid adultoidVar = adultoid.f36626attabal;
            adultoid.purchaseConfig = this.f36632attabal;
            this.f36634saneness.element = true;
            if (this.f36633dern.element) {
                babyless.beachfront.formularize("sp_iap_purchase_config_data_cipher_copy", this.f36632attabal, true);
                adultoid.f36626attabal.competently(this.f36632attabal);
            }
        }
    }

    /* JADX INFO: compiled from: IapPurchaseConfigHelper.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"reuter/adultoid$saneness", "Lreuter/molybdenite$saneness;", "", "code", "", PglCryptUtils.KEY_MESSAGE, "", "attabal", "(ILjava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness implements molybdenite.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ PurchaseConfigResponse f36635attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f36636dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f36637saneness;

        public saneness(PurchaseConfigResponse purchaseConfigResponse, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2) {
            this.f36635attabal = purchaseConfigResponse;
            this.f36637saneness = ref$BooleanRef;
            this.f36636dern = ref$BooleanRef2;
        }

        @Override // reuter.molybdenite.saneness
        public void attabal(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            adultoid adultoidVar = adultoid.f36626attabal;
            adultoid.purchaseConfig = this.f36635attabal;
            this.f36637saneness.element = true;
            if (this.f36636dern.element) {
                babyless.beachfront.formularize("sp_iap_purchase_config_data_cipher_copy", this.f36635attabal, true);
                adultoid.f36626attabal.competently(this.f36635attabal);
            }
        }
    }

    public static final void impassible(pancuronium.saneness response) {
        PurchaseItem purchaseItemPrevious;
        String localFormattedPrice;
        PurchaseItem purchaseItemPrevious2;
        String localFormattedPrice2;
        PurchaseItem purchaseItemPrevious3;
        String localFormattedPrice3;
        PurchaseItem purchaseItemPrevious4;
        String localFormattedPrice4;
        PurchaseItem purchaseItemPrevious5;
        String localFormattedPrice5;
        PurchaseItem purchaseItemPrevious6;
        String localFormattedPrice6;
        String localFormattedPrice7;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.attabal() != 0 || response.dern() == null) {
            return;
        }
        isLoading = false;
        Object objDern = response.dern();
        Intrinsics.checkNotNullExpressionValue(objDern, "getResult(...)");
        PurchaseConfigResponse purchaseConfigResponse = (PurchaseConfigResponse) objDern;
        PurchaseConfigResponse purchaseConfigResponse2 = (PurchaseConfigResponse) babyless.beachfront.beachfront("sp_iap_purchase_config_data_cipher_copy", new PurchaseConfigResponse(null, null, null, 7, null), PurchaseConfigResponse.class);
        Iterator<T> it = purchaseConfigResponse.getPurchasePageBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal().iterator();
        while (true) {
            String str = "";
            PurchaseItem purchaseItem = null;
            if (!it.hasNext()) {
                break;
            }
            PurchaseItem purchaseItem2 = (PurchaseItem) it.next();
            List<PurchaseItem> listAttabal = purchaseConfigResponse2.getPurchasePageBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal();
            ListIterator<PurchaseItem> listIterator = listAttabal.listIterator(listAttabal.size());
            while (listIterator.hasPrevious()) {
                PurchaseItem purchaseItemPrevious7 = listIterator.previous();
                if (Intrinsics.wireman(purchaseItemPrevious7.getProductId(), purchaseItem2.getProductId())) {
                    purchaseItem = purchaseItemPrevious7;
                    break;
                }
            }
            PurchaseItem purchaseItem3 = purchaseItem;
            if (purchaseItem3 != null && (localFormattedPrice7 = purchaseItem3.getLocalFormattedPrice()) != null) {
                str = localFormattedPrice7;
            }
            purchaseItem2.cutely(str);
        }
        for (PurchaseItem purchaseItem4 : purchaseConfigResponse.getPurchasePageBean().getHoliday().attabal()) {
            List<PurchaseItem> listAttabal2 = purchaseConfigResponse2.getPurchasePageBean().getHoliday().attabal();
            ListIterator<PurchaseItem> listIterator2 = listAttabal2.listIterator(listAttabal2.size());
            do {
                if (!listIterator2.hasPrevious()) {
                    purchaseItemPrevious6 = null;
                    break;
                }
                purchaseItemPrevious6 = listIterator2.previous();
            } while (!Intrinsics.wireman(purchaseItemPrevious6.getProductId(), purchaseItem4.getProductId()));
            PurchaseItem purchaseItem5 = purchaseItemPrevious6;
            if (purchaseItem5 == null || (localFormattedPrice6 = purchaseItem5.getLocalFormattedPrice()) == null) {
                localFormattedPrice6 = "";
            }
            purchaseItem4.cutely(localFormattedPrice6);
        }
        for (PurchaseItem purchaseItem6 : purchaseConfigResponse.getPurchasePageBean().getNewUser().attabal()) {
            List<PurchaseItem> listAttabal3 = purchaseConfigResponse2.getPurchasePageBean().getNewUser().attabal();
            ListIterator<PurchaseItem> listIterator3 = listAttabal3.listIterator(listAttabal3.size());
            do {
                if (!listIterator3.hasPrevious()) {
                    purchaseItemPrevious5 = null;
                    break;
                }
                purchaseItemPrevious5 = listIterator3.previous();
            } while (!Intrinsics.wireman(purchaseItemPrevious5.getProductId(), purchaseItem6.getProductId()));
            PurchaseItem purchaseItem7 = purchaseItemPrevious5;
            if (purchaseItem7 == null || (localFormattedPrice5 = purchaseItem7.getLocalFormattedPrice()) == null) {
                localFormattedPrice5 = "";
            }
            purchaseItem6.cutely(localFormattedPrice5);
        }
        for (PurchaseItem purchaseItem8 : purchaseConfigResponse.getPopUpBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal()) {
            List<PurchaseItem> listAttabal4 = purchaseConfigResponse2.getPopUpBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal();
            ListIterator<PurchaseItem> listIterator4 = listAttabal4.listIterator(listAttabal4.size());
            do {
                if (!listIterator4.hasPrevious()) {
                    purchaseItemPrevious4 = null;
                    break;
                }
                purchaseItemPrevious4 = listIterator4.previous();
            } while (!Intrinsics.wireman(purchaseItemPrevious4.getProductId(), purchaseItem8.getProductId()));
            PurchaseItem purchaseItem9 = purchaseItemPrevious4;
            if (purchaseItem9 == null || (localFormattedPrice4 = purchaseItem9.getLocalFormattedPrice()) == null) {
                localFormattedPrice4 = "";
            }
            purchaseItem8.cutely(localFormattedPrice4);
        }
        for (PurchaseItem purchaseItem10 : purchaseConfigResponse.getPopUpBean().getHoliday().attabal()) {
            List<PurchaseItem> listAttabal5 = purchaseConfigResponse2.getPopUpBean().getHoliday().attabal();
            ListIterator<PurchaseItem> listIterator5 = listAttabal5.listIterator(listAttabal5.size());
            do {
                if (!listIterator5.hasPrevious()) {
                    purchaseItemPrevious3 = null;
                    break;
                }
                purchaseItemPrevious3 = listIterator5.previous();
            } while (!Intrinsics.wireman(purchaseItemPrevious3.getProductId(), purchaseItem10.getProductId()));
            PurchaseItem purchaseItem11 = purchaseItemPrevious3;
            if (purchaseItem11 == null || (localFormattedPrice3 = purchaseItem11.getLocalFormattedPrice()) == null) {
                localFormattedPrice3 = "";
            }
            purchaseItem10.cutely(localFormattedPrice3);
        }
        for (PurchaseItem purchaseItem12 : purchaseConfigResponse.getPopUpBean().getNewUser().attabal()) {
            List<PurchaseItem> listAttabal6 = purchaseConfigResponse2.getPopUpBean().getNewUser().attabal();
            ListIterator<PurchaseItem> listIterator6 = listAttabal6.listIterator(listAttabal6.size());
            do {
                if (!listIterator6.hasPrevious()) {
                    purchaseItemPrevious2 = null;
                    break;
                }
                purchaseItemPrevious2 = listIterator6.previous();
            } while (!Intrinsics.wireman(purchaseItemPrevious2.getProductId(), purchaseItem12.getProductId()));
            PurchaseItem purchaseItem13 = purchaseItemPrevious2;
            if (purchaseItem13 == null || (localFormattedPrice2 = purchaseItem13.getLocalFormattedPrice()) == null) {
                localFormattedPrice2 = "";
            }
            purchaseItem12.cutely(localFormattedPrice2);
        }
        for (PurchaseItem purchaseItem14 : purchaseConfigResponse.getRandomDiscountBean().attabal()) {
            List<PurchaseItem> listAttabal7 = purchaseConfigResponse2.getRandomDiscountBean().attabal();
            ListIterator<PurchaseItem> listIterator7 = listAttabal7.listIterator(listAttabal7.size());
            do {
                if (!listIterator7.hasPrevious()) {
                    purchaseItemPrevious = null;
                    break;
                }
                purchaseItemPrevious = listIterator7.previous();
            } while (!Intrinsics.wireman(purchaseItemPrevious.getProductId(), purchaseItem14.getProductId()));
            PurchaseItem purchaseItem15 = purchaseItemPrevious;
            if (purchaseItem15 == null || (localFormattedPrice = purchaseItem15.getLocalFormattedPrice()) == null) {
                localFormattedPrice = "";
            }
            purchaseItem14.cutely(localFormattedPrice);
        }
        purchaseConfig = purchaseConfigResponse;
        babyless.beachfront.formularize("sp_iap_purchase_config_data_cipher_copy", purchaseConfigResponse, true);
        adultoid adultoidVar = f36626attabal;
        adultoidVar.competently(purchaseConfigResponse);
        adultoidVar.impromptu();
        adultoidVar.taiyuan();
    }

    public final boolean apical() {
        return forceUpdatePurchase || System.currentTimeMillis() - beachfront() > SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    }

    public final long beachfront() {
        return babyless.beachfront.impromptu(reuter.attabal.f36643attabal.attabal(), 0L);
    }

    public final void competently(PurchaseConfigResponse purchaseListResponse) {
        Iterator<T> it = purchaseListenerList.iterator();
        while (it.hasNext()) {
            ((magenta.wireman) it.next()).attabal(purchaseListResponse);
        }
    }

    public final void cutely(boolean z) {
        forceUpdatePurchase = z;
    }

    public final void formularize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (apical() && !isLoading) {
            isLoading = true;
            panocha.wireman.marial().impromptu(dextrorotary.attabal.f25229attabal.saneness("/prod/api/subscription/cfg"), new panocha.attabal(), PurchaseConfigResponse.class, new pancuronium.attabal() { // from class: reuter.graveside
                @Override // pancuronium.attabal
                public final void attabal(pancuronium.saneness sanenessVar) {
                    adultoid.impassible(sanenessVar);
                }
            });
        }
    }

    public final void impromptu() {
        PurchaseConfigResponse purchaseConfigResponseMarial = marial();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(purchaseConfigResponseMarial.getPopUpBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal());
        arrayList.addAll(purchaseConfigResponseMarial.getPopUpBean().getNewUser().attabal());
        arrayList.addAll(purchaseConfigResponseMarial.getPopUpBean().getHoliday().attabal());
        arrayList.addAll(purchaseConfigResponseMarial.getPurchasePageBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal());
        arrayList.addAll(purchaseConfigResponseMarial.getPurchasePageBean().getNewUser().attabal());
        arrayList.addAll(purchaseConfigResponseMarial.getPurchasePageBean().getHoliday().attabal());
        arrayList.addAll(purchaseConfigResponseMarial.getRandomDiscountBean().attabal());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.wireman(((PurchaseItem) obj).beachfront(), "inapp")) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Intrinsics.wireman(((PurchaseItem) obj2).beachfront(), "subs")) {
                arrayList3.add(obj2);
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        if (arrayList2.isEmpty()) {
            ref$BooleanRef.element = true;
        } else {
            molybdenite.f36681attabal.clubfoot(arrayList2, 0, 0, new attabal(purchaseConfigResponseMarial, ref$BooleanRef, ref$BooleanRef2));
        }
        if (arrayList3.isEmpty()) {
            ref$BooleanRef2.element = true;
        } else {
            molybdenite.f36681attabal.clubfoot(arrayList3, 0, 0, new saneness(purchaseConfigResponseMarial, ref$BooleanRef2, ref$BooleanRef));
        }
    }

    public final PurchaseConfigResponse marial() {
        PurchaseConfigResponse purchaseConfigResponse = purchaseConfig;
        if (purchaseConfigResponse != null) {
            Intrinsics.competently(purchaseConfigResponse, "null cannot be cast to non-null type com.yolo.iap.server.response.purchase.PurchaseConfigResponse");
            return purchaseConfigResponse;
        }
        Object objBeachfront = babyless.beachfront.beachfront("sp_iap_purchase_config_data_cipher_copy", new PurchaseConfigResponse(null, null, null, 7, null), PurchaseConfigResponse.class);
        Intrinsics.checkNotNullExpressionValue(objBeachfront, "getData(...)");
        PurchaseConfigResponse purchaseConfigResponse2 = (PurchaseConfigResponse) objBeachfront;
        if (purchaseConfigResponse2.getPurchasePageBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal().isEmpty()) {
            return wireman();
        }
        purchaseConfig = purchaseConfigResponse2;
        return purchaseConfigResponse2;
    }

    public final void taiyuan() {
        babyless.beachfront.apical(reuter.attabal.f36643attabal.attabal(), Long.valueOf(System.currentTimeMillis()));
    }

    public final PurchaseConfigResponse wireman() {
        String strAttabal = ampleness.attabal.attabal(molybdenite.f36681attabal.merc(), "iap_purchase_config.json");
        if (strAttabal.length() == 0) {
            throw new RuntimeException("DefaultPurchaseConfig is null,please init!!!");
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objWireman = com.blankj.utilcode.util.impromptu.wireman(strAttabal, PurchaseConfigResponse.class);
            Intrinsics.checkNotNullExpressionValue(objWireman, "fromJson(...)");
            return (PurchaseConfigResponse) objWireman;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            return new PurchaseConfigResponse(null, null, null, 7, null);
        }
    }
}
