package ads_mobile_sdk;

import acidy.beachfront;
import acidy.competently;
import acidy.impromptu;
import acidy.marial;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.orthocephalic;
import saneness.powdery;
import saneness.truantry;
import saneness.unbalanced;

/* JADX INFO: loaded from: classes.dex */
public final class l61 extends orthocephalic {
    public static final powdery b = new powdery();
    public final impromptu a;

    public l61(impromptu loadCallback) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        this.a = loadCallback;
    }

    @Override // saneness.orthocephalic
    public final void a(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.onAdFailedToLoad(error);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.orthocephalic
    public final Object a(truantry truantryVar, wretchedly.dern dernVar) {
        k61 k61Var;
        impromptu impromptuVar;
        Object competentlyVar;
        Object beachfrontVar;
        if (dernVar instanceof k61) {
            k61Var = (k61) dernVar;
            int i = k61Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k61Var.d = i - Integer.MIN_VALUE;
            } else {
                k61Var = new k61(this, dernVar);
            }
        } else {
            k61Var = new k61(this, dernVar);
        }
        Object obj = k61Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = k61Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (truantryVar instanceof li1) {
                InternalNativeAd ad = ((li1) truantryVar).a;
                Intrinsics.checkNotNullParameter(ad, "ad");
                fj1 fj1Var = ad.getF19437saneness().b;
                int i3 = fj1Var == null ? -1 : unbalanced.f37348attabal[fj1Var.ordinal()];
                if (i3 == 1) {
                    competentlyVar = new competently(new ak1(ad));
                } else {
                    if (i3 != 2) {
                        beachfrontVar = new beachfront(new LoadAdError(LoadAdError.ErrorCode.INTERNAL_ERROR, "Invalid native ad response.", null));
                    } else {
                        competentlyVar = new marial(new k30(ad));
                    }
                    if (beachfrontVar instanceof competently) {
                        this.a.attabal(((competently) beachfrontVar).getAd());
                    } else if (beachfrontVar instanceof marial) {
                        this.a.saneness(((marial) beachfrontVar).getAd());
                    } else {
                        this.a.onAdFailedToLoad(new LoadAdError(LoadAdError.ErrorCode.INTERNAL_ERROR, "Invalid native ad response.", null));
                    }
                }
                beachfrontVar = competentlyVar;
                if (beachfrontVar instanceof competently) {
                    this.a.attabal(((competently) beachfrontVar).getAd());
                } else if (beachfrontVar instanceof marial) {
                    this.a.saneness(((marial) beachfrontVar).getAd());
                } else {
                    this.a.onAdFailedToLoad(new LoadAdError(LoadAdError.ErrorCode.INTERNAL_ERROR, "Invalid native ad response.", null));
                }
            } else if (truantryVar instanceof ki1) {
                impromptu impromptuVar2 = this.a;
                powdery powderyVar = b;
                d41 d41Var = ((ki1) truantryVar).a;
                k61Var.a = impromptuVar2;
                k61Var.d = 1;
                Object objAttabal = powderyVar.attabal(d41Var, k61Var);
                if (objAttabal == objBeachfront) {
                    return objBeachfront;
                }
                obj = objAttabal;
                impromptuVar = impromptuVar2;
            }
            return Unit.f29295attabal;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        impromptuVar = k61Var.a;
        p002kotlin.dern.saneness(obj);
        impromptuVar.wireman(((acidy.wireman) obj).getAd());
        return Unit.f29295attabal;
    }

    @Override // saneness.orthocephalic
    public final void a() {
        this.a.dern();
    }
}
