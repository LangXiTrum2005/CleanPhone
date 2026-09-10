package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import complexometry.dovishness;
import complexometry.formularize;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import saneness.potboil;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements portwide {
    public final saran a;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern b;
    public final gl1 c;
    public final formularize d;
    public final ip0 e;
    public final int f;

    public ql1(saran backgroundScope, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, jk0 flags, gl1 nativeAdSettingsDataStore, formularize baseRequest, ip0 gmaUtil, int i) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(nativeAdSettingsDataStore, "nativeAdSettingsDataStore");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.a = backgroundScope;
        this.b = nativeRequest;
        this.c = nativeAdSettingsDataStore;
        this.d = baseRequest;
        this.e = gmaUtil;
        this.f = i;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.NATIVE_AD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(wretchedly.dern dernVar) {
        ol1 ol1Var;
        String adUnitId;
        long jA;
        ql1 ql1Var;
        long j;
        if (dernVar instanceof ol1) {
            ol1Var = (ol1) dernVar;
            int i = ol1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ol1Var.g = i - Integer.MIN_VALUE;
            } else {
                ol1Var = new ol1(this, dernVar);
            }
        } else {
            ol1Var = new ol1(this, dernVar);
        }
        Object objF = ol1Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ol1Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objF);
            adUnitId = this.d.getAdUnitId();
            if (adUnitId == null) {
                return null;
            }
            jA = this.e.a();
            gl1 gl1Var = this.c;
            ol1Var.a = this;
            ol1Var.b = adUnitId;
            ol1Var.c = jA;
            ol1Var.d = jA;
            ol1Var.g = 1;
            objF = gl1Var.f(ol1Var);
            if (objF != objBeachfront) {
                ql1Var = this;
                j = jA;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objF);
            return objF;
        }
        jA = ol1Var.d;
        j = ol1Var.c;
        adUnitId = ol1Var.b;
        ql1Var = ol1Var.a;
        p002kotlin.dern.saneness(objF);
        if (jA == ((Number) objF).longValue()) {
            gl1 gl1Var2 = ql1Var.c;
            ol1Var.a = null;
            ol1Var.b = null;
            ol1Var.g = 2;
            Object objA = gl1Var2.a(adUnitId, ol1Var);
            return objA == objBeachfront ? objBeachfront : objA;
        }
        saran saranVar = ql1Var.a;
        pl1 block = new pl1(ql1Var, j, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        nl1 nl1Var;
        Boolean bool;
        Integer num;
        List list;
        ArrayList arrayList;
        Integer num2;
        Boolean bool2;
        String str;
        Boolean bool3;
        Integer num3;
        dovishness dovishnessVar;
        Boolean bool4;
        ql1 ql1Var;
        if (dernVar instanceof nl1) {
            nl1Var = (nl1) dernVar;
            int i = nl1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                nl1Var.o = i - Integer.MIN_VALUE;
            } else {
                nl1Var = new nl1(this, dernVar);
            }
        } else {
            nl1Var = new nl1(this, dernVar);
        }
        Object obj = nl1Var.m;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = nl1Var.o;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar2 = this.b;
            String lowerCase = dernVar2.getMediaAspectRatio().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String str2 = dernVar2.getMediaAspectRatio() != NativeAd.NativeMediaAspectRatio.UNKNOWN ? lowerCase : null;
            Integer numWireman = igo.attabal.wireman(3);
            List<NativeAd.NativeAdType> listWireman = dernVar2.wireman();
            ArrayList arrayList2 = new ArrayList();
            for (NativeAd.NativeAdType nativeAdType : listWireman) {
                Intrinsics.checkNotNullParameter(nativeAdType, "<this>");
                int i3 = potboil.f37260attabal[nativeAdType.ordinal()];
                String str3 = i3 != 1 ? i3 != 2 ? null : "6" : "3";
                if (str3 != null) {
                    arrayList2.add(str3);
                }
            }
            List listAttabal = dernVar2.attabal();
            Boolean boolAttabal = igo.attabal.attabal(true);
            Boolean boolAttabal2 = igo.attabal.attabal(dernVar2.getF19448adultoid());
            NativeAd.SwipeGestureDirection customClickGestureDirection = dernVar2.getCustomClickGestureDirection();
            Integer numWireman2 = customClickGestureDirection != null ? igo.attabal.wireman(customClickGestureDirection.getValue()) : null;
            Boolean boolAttabal3 = dernVar2.getCustomClickGestureDirection() != null ? igo.attabal.attabal(dernVar2.getCustomClickGestureAllowTaps()) : null;
            dovishness videoOptions = dernVar2.getVideoOptions();
            Boolean boolAttabal4 = igo.attabal.attabal(dernVar2.getIsImageLoadingDisabled());
            Integer numWireman3 = igo.attabal.wireman(dernVar2.getAdChoicesPlacement().getValue());
            nl1Var.a = this;
            nl1Var.b = numWireman;
            nl1Var.c = arrayList2;
            nl1Var.d = numWireman2;
            nl1Var.e = boolAttabal2;
            nl1Var.f = str2;
            nl1Var.g = boolAttabal;
            nl1Var.h = listAttabal;
            nl1Var.i = boolAttabal3;
            nl1Var.j = numWireman3;
            nl1Var.k = boolAttabal4;
            nl1Var.l = videoOptions;
            nl1Var.o = 1;
            Object objB = b(nl1Var);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
            bool = boolAttabal3;
            num = numWireman;
            list = listAttabal;
            arrayList = arrayList2;
            num2 = numWireman2;
            bool2 = boolAttabal2;
            str = str2;
            bool3 = boolAttabal;
            num3 = numWireman3;
            obj = objB;
            dovishnessVar = videoOptions;
            bool4 = boolAttabal4;
            ql1Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dovishness dovishnessVar2 = nl1Var.l;
            Boolean bool5 = nl1Var.k;
            Integer num4 = nl1Var.j;
            Boolean bool6 = nl1Var.i;
            List list2 = nl1Var.h;
            Boolean bool7 = nl1Var.g;
            String str4 = nl1Var.f;
            Boolean bool8 = nl1Var.e;
            Integer num5 = nl1Var.d;
            ArrayList arrayList3 = nl1Var.c;
            Integer num6 = nl1Var.b;
            ql1Var = nl1Var.a;
            p002kotlin.dern.saneness(obj);
            bool = bool6;
            num = num6;
            list = list2;
            arrayList = arrayList3;
            num2 = num5;
            bool2 = bool8;
            str = str4;
            bool3 = bool7;
            dovishnessVar = dovishnessVar2;
            bool4 = bool5;
            num3 = num4;
        }
        Boolean bool9 = (Boolean) obj;
        Integer numWireman4 = igo.attabal.wireman(ql1Var.f);
        return new tn0(new ll1(num, arrayList, list, bool3, str, bool2, num2, bool, dovishnessVar, bool4, num3, bool9, numWireman4.intValue() > 1 ? numWireman4 : null));
    }
}
