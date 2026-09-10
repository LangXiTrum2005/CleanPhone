package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.evenfall;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ yi0 d;
    public final /* synthetic */ tl1 e;
    public final /* synthetic */ JsonObject f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(yi0 yi0Var, tl1 tl1Var, JsonObject jsonObject, String str, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = yi0Var;
        this.e = tl1Var;
        this.f = jsonObject;
        this.g = str;
        this.h = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new qi0(this.d, this.e, this.f, this.g, this.h, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qi0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[Catch: all -> 0x002d, TryCatch #5 {all -> 0x002d, blocks: (B:14:0x0028, B:37:0x00f8, B:39:0x00fe, B:40:0x0103), top: B:112:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0115 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0120 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0124 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0127 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012d A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0135 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013d A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #0 {all -> 0x0125, blocks: (B:45:0x010e, B:47:0x0115, B:49:0x011c, B:51:0x0120, B:53:0x0124, B:56:0x0127, B:57:0x012c, B:58:0x012d, B:59:0x0134, B:60:0x0135, B:61:0x013c, B:62:0x013d), top: B:104:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x016d A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:7:0x0014, B:72:0x0167, B:74:0x016d, B:75:0x0172), top: B:106:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0185 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x018c A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0194 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0197 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x019d A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a5 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #1 {all -> 0x0195, blocks: (B:82:0x017e, B:84:0x0185, B:86:0x018c, B:88:0x0190, B:90:0x0194, B:93:0x0197, B:94:0x019c, B:95:0x019d, B:96:0x01a4, B:97:0x01a5, B:98:0x01ac, B:99:0x01ad), top: B:105:0x017e }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03VarA;
        w03 w03Var;
        w03 w03Var2;
        w03 w03VarA2;
        w03 w03Var3;
        w03 w03Var4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            JsonObject jsonObject = new JsonObject();
            yi0 yi0Var = this.d;
            tl1 tl1Var = this.e;
            JsonObject jsonObject2 = this.f;
            String str = this.g;
            boolean z = this.h;
            jsonObject.add("ad", yi0Var.g);
            if (tl1Var != null) {
                jsonObject.add("asset_view_signal", tl1Var.a);
                jsonObject.add("ad_view_signal", tl1Var.b);
                jsonObject.add("scroll_view_signal", tl1Var.c);
                jsonObject.add("lock_screen_signal", tl1Var.d);
                jsonObject.add("screen", tl1Var.e);
            }
            if (jsonObject2 != null) {
                jsonObject.add("provided_signals", jsonObject2);
            }
            if (str != null) {
                jsonObject.addProperty("view_signals", str);
            }
            jsonObject.addProperty("policy_validator_enabled", igo.attabal.attabal(z));
            jk0 jk0Var = yi0Var.z;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:enable_placement_id:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:enable_placement_id:enabled", Boolean.TRUE, zk.b)).booleanValue() && yi0Var.D.a.get() > 0) {
                jsonObject.addProperty("placement_id", igo.attabal.marial(yi0Var.D.a.get()));
            }
            yi0 yi0Var2 = this.d;
            ri2 ri2Var = yi0Var2.n;
            no0 no0Var = no0.CUI_NAME_NATIVE_AD_HANDLE_MEDIA_VIEW_READY;
            l13 l13Var = yi0Var2.o;
            List listFormularize = adultoid.formularize();
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    carport carportVar = yi0Var2.q;
                    this.a = w03VarA2;
                    this.b = w03VarA2;
                    this.c = 1;
                    carportVar.getClass();
                    String string = jsonObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    obj = carportVar.a("google.afma.nativeAds.handleNativeAdSignalsLogging", string, this);
                    if (obj != objBeachfront) {
                        w03Var3 = w03VarA2;
                        w03Var4 = w03Var3;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    w03Var3 = w03VarA2;
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            } else {
                w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    carport carportVar2 = yi0Var2.q;
                    this.a = w03VarA;
                    this.b = w03VarA;
                    this.c = 2;
                    carportVar2.getClass();
                    String string2 = jsonObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    obj = carportVar2.a("google.afma.nativeAds.handleNativeAdSignalsLogging", string2, this);
                    if (obj != objBeachfront) {
                        w03Var = w03VarA;
                        w03Var2 = w03Var;
                        spartacistVar2 = (spartacist) obj;
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                        }
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    w03Var = w03VarA;
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            }
            return objBeachfront;
        }
        if (i == 1) {
            w03Var3 = this.b;
            w03Var4 = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar = (spartacist) obj;
                if (spartacistVar instanceof nn0) {
                    y13.a((nn0) spartacistVar, false);
                }
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var3, null);
            } catch (Throwable th3) {
                th = th3;
                w03VarA2 = w03Var4;
                try {
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var3, th4);
                        throw th5;
                    }
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = this.b;
            w03Var2 = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar2 = (spartacist) obj;
                if (spartacistVar2 instanceof nn0) {
                    y13.a((nn0) spartacistVar2, false);
                }
                Unit unit4 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
            } catch (Throwable th6) {
                th = th6;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        interaction.saneness.attabal(w03Var, th7);
                        throw th8;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }
}
