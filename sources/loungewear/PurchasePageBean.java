package loungewear;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import com.unity3d.ads.BuildConfig;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: loungewear.beachfront, reason: from toString */
/* JADX INFO: compiled from: PurchasePageBean.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lloungewear/beachfront;", "", "Lloungewear/attabal;", "holiday", "newUser", BuildConfig.FLAVOR, "<init>", "(Lloungewear/attabal;Lloungewear/attabal;Lloungewear/attabal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lloungewear/attabal;", "saneness", "()Lloungewear/attabal;", "dern", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PurchasePageBean {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("holiday")
    private final ComboInfo holiday;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    @SerializedName(BuildConfig.FLAVOR)
    private final ComboInfo default;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("new_user")
    private final ComboInfo newUser;

    public PurchasePageBean() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final ComboInfo getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final ComboInfo getNewUser() {
        return this.newUser;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasePageBean)) {
            return false;
        }
        PurchasePageBean purchasePageBean = (PurchasePageBean) other;
        return Intrinsics.wireman(this.holiday, purchasePageBean.holiday) && Intrinsics.wireman(this.newUser, purchasePageBean.newUser) && Intrinsics.wireman(this.default, purchasePageBean.default);
    }

    public int hashCode() {
        return (((this.holiday.hashCode() * 31) + this.newUser.hashCode()) * 31) + this.default.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final ComboInfo getHoliday() {
        return this.holiday;
    }

    public String toString() {
        return "PurchasePageBean(holiday=" + this.holiday + ", newUser=" + this.newUser + ", default=" + this.default + ')';
    }

    public PurchasePageBean(ComboInfo holiday, ComboInfo newUser, ComboInfo comboInfo) {
        Intrinsics.checkNotNullParameter(holiday, "holiday");
        Intrinsics.checkNotNullParameter(newUser, "newUser");
        Intrinsics.checkNotNullParameter(comboInfo, "default");
        this.holiday = holiday;
        this.newUser = newUser;
        this.default = comboInfo;
    }

    public /* synthetic */ PurchasePageBean(ComboInfo comboInfo, ComboInfo comboInfo2, ComboInfo comboInfo3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ComboInfo(null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0, 131071, null) : comboInfo, (i & 2) != 0 ? new ComboInfo(null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0, 131071, null) : comboInfo2, (i & 4) != 0 ? new ComboInfo(null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0, 131071, null) : comboInfo3);
    }
}
