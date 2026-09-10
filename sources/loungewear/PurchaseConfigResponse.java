package loungewear;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: loungewear.wireman, reason: from toString */
/* JADX INFO: compiled from: PurchaseConfigResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lloungewear/wireman;", "", "Lloungewear/dern;", "popUpBean", "Lloungewear/beachfront;", "purchasePageBean", "Lloungewear/attabal;", "randomDiscountBean", "<init>", "(Lloungewear/dern;Lloungewear/beachfront;Lloungewear/attabal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lloungewear/dern;", "()Lloungewear/dern;", "saneness", "Lloungewear/beachfront;", "()Lloungewear/beachfront;", "dern", "Lloungewear/attabal;", "()Lloungewear/attabal;", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PurchaseConfigResponse {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("pop_up")
    private final PopUpBean popUpBean;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("random_discount")
    private final ComboInfo randomDiscountBean;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("subscription_page")
    private final PurchasePageBean purchasePageBean;

    public PurchaseConfigResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final PopUpBean getPopUpBean() {
        return this.popUpBean;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final ComboInfo getRandomDiscountBean() {
        return this.randomDiscountBean;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseConfigResponse)) {
            return false;
        }
        PurchaseConfigResponse purchaseConfigResponse = (PurchaseConfigResponse) other;
        return Intrinsics.wireman(this.popUpBean, purchaseConfigResponse.popUpBean) && Intrinsics.wireman(this.purchasePageBean, purchaseConfigResponse.purchasePageBean) && Intrinsics.wireman(this.randomDiscountBean, purchaseConfigResponse.randomDiscountBean);
    }

    public int hashCode() {
        return (((this.popUpBean.hashCode() * 31) + this.purchasePageBean.hashCode()) * 31) + this.randomDiscountBean.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final PurchasePageBean getPurchasePageBean() {
        return this.purchasePageBean;
    }

    public String toString() {
        return "PurchaseConfigResponse(popUpBean=" + this.popUpBean + ", purchasePageBean=" + this.purchasePageBean + ", randomDiscountBean=" + this.randomDiscountBean + ')';
    }

    public PurchaseConfigResponse(PopUpBean popUpBean, PurchasePageBean purchasePageBean, ComboInfo randomDiscountBean) {
        Intrinsics.checkNotNullParameter(popUpBean, "popUpBean");
        Intrinsics.checkNotNullParameter(purchasePageBean, "purchasePageBean");
        Intrinsics.checkNotNullParameter(randomDiscountBean, "randomDiscountBean");
        this.popUpBean = popUpBean;
        this.purchasePageBean = purchasePageBean;
        this.randomDiscountBean = randomDiscountBean;
    }

    public /* synthetic */ PurchaseConfigResponse(PopUpBean popUpBean, PurchasePageBean purchasePageBean, ComboInfo comboInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PopUpBean(null, null, null, 7, null) : popUpBean, (i & 2) != 0 ? new PurchasePageBean(null, null, null, 7, null) : purchasePageBean, (i & 4) != 0 ? new ComboInfo(null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0, 131071, null) : comboInfo);
    }
}
