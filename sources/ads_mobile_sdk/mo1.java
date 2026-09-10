package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.gson.JsonObject;
import java.io.Closeable;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class mo1 extends SuspendLambda implements Function1 {
    public Object a;
    public Closeable b;
    public Closeable c;
    public Object d;
    public Object e;
    public w03 f;
    public int g;
    public final /* synthetic */ JsonObject h;
    public final /* synthetic */ so1 i;
    public final /* synthetic */ a22 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo1(a22 a22Var, so1 so1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.h = jsonObject;
        this.i = so1Var;
        this.j = a22Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        JsonObject jsonObject = this.h;
        return new mo1(this.j, this.i, jsonObject, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((mo1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0139 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:42:0x0133, B:44:0x0139), top: B:114:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x014a A[Catch: all -> 0x0167, TryCatch #7 {all -> 0x0167, blocks: (B:48:0x0143, B:50:0x014a, B:53:0x0169), top: B:126:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0169 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #7 {all -> 0x0167, blocks: (B:48:0x0143, B:50:0x014a, B:53:0x0169), top: B:126:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0196 A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x019d A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1 A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a5 A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9 A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01af A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7 A[Catch: all -> 0x01a6, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #5 {all -> 0x01a6, blocks: (B:65:0x018f, B:67:0x0196, B:69:0x019d, B:71:0x01a1, B:73:0x01a5, B:76:0x01a9, B:77:0x01ae, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01be, B:82:0x01bf), top: B:123:0x018f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v42, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        so1 so1Var;
        Closeable closeable;
        ?? r2;
        String strA;
        ia3 ia3Var;
        Object objA;
        Closeable closeable2;
        Closeable closeable3;
        String str;
        gq0 gq0Var;
        w03 w03VarA;
        w03 w03Var;
        Closeable closeable4;
        Object objA2;
        Closeable closeable5;
        spartacist spartacistVar;
        Object objA3;
        gq0 gq0Var2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.g;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_NATIVE_AD_MEDIA_LOAD;
            JsonObject jsonObject = this.h;
            so1Var = this.i;
            a22 a22Var = this.j;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA2 = j13.a(no0Var, adultoid.formularize(), true);
            try {
                String strA2 = cb1.a(jsonObject, "base_url", "");
                strA = cb1.a(jsonObject, "html", "");
                int iA = cb1.a(jsonObject, "width", 0);
                int iA2 = cb1.a(jsonObject, "height", 0);
                if (iA <= 0 || iA2 <= 0) {
                    ia3Var = new ia3(ha3.DEFAULT, 0, 0, 14);
                } else {
                    Context context = so1Var.a;
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
                    int iApplyDimension = (int) TypedValue.applyDimension(1, iA, displayMetrics);
                    Context context2 = so1Var.a;
                    Intrinsics.checkNotNullParameter(context2, "<this>");
                    Intrinsics.checkNotNullParameter(context2, "<this>");
                    DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
                    ia3Var = new ia3(ha3.FIXED_RECTANGLE, iApplyDimension, (int) TypedValue.applyDimension(1, iA2, displayMetrics2), 8);
                }
                this.a = so1Var;
                this.b = w03VarA2;
                this.c = w03VarA2;
                this.d = strA2;
                this.e = strA;
                this.g = 1;
                objA = so1.a(so1Var, ia3Var, a22Var, this);
                if (objA != objBeachfront) {
                    closeable2 = w03VarA2;
                    closeable3 = closeable2;
                    str = strA2;
                    gq0Var = (gq0) objA;
                    no0 no0Var2 = no0.CUI_NAME_CREATIVE_WEBVIEW_LOAD;
                    WeakHashMap weakHashMap2 = j13.a;
                    w03VarA = j13.a(no0Var2, adultoid.formularize(), true);
                    this.a = so1Var;
                    this.b = closeable3;
                    this.c = closeable2;
                    this.d = gq0Var;
                    this.e = w03VarA;
                    this.f = w03VarA;
                    this.g = 2;
                    objA2 = gq0.a(gq0Var, strA, str, true, (wretchedly.dern) this, 12);
                    if (objA2 != objBeachfront) {
                        closeable5 = closeable2;
                        w03Var = w03VarA;
                        closeable4 = closeable3;
                        spartacistVar = (spartacist) objA2;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(w03VarA, null);
                        if (!(spartacistVar instanceof nn0)) {
                            cutely.wireman(so1Var.b, dhss.f32190kowloon, null, new lo1(gq0Var, null), 2, null);
                            y13.a((nn0) spartacistVar, false);
                            gq0Var2 = null;
                        } else {
                            this.a = closeable4;
                            this.b = closeable5;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = 3;
                            objA3 = so1.a(so1Var, gq0Var, this);
                            if (objA3 != objBeachfront) {
                                closeable = closeable5;
                                r2 = closeable4;
                                gq0Var2 = (gq0) objA3;
                                closeable5 = closeable;
                            }
                        }
                        interaction.saneness.attabal(closeable5, null);
                        return gq0Var2;
                    }
                }
                return objBeachfront;
            } catch (Throwable th) {
                th = th;
                closeable = w03VarA2;
                r2 = closeable;
            }
        } else if (i == 1) {
            String str2 = (String) this.e;
            String str3 = (String) this.d;
            Closeable closeable6 = this.c;
            w03 w03Var2 = (w03) this.b;
            so1 so1Var2 = (so1) this.a;
            try {
                p002kotlin.dern.saneness(obj);
                closeable2 = closeable6;
                so1Var = so1Var2;
                str = str3;
                closeable3 = w03Var2;
                strA = str2;
                objA = obj;
                try {
                    gq0Var = (gq0) objA;
                    no0 no0Var3 = no0.CUI_NAME_CREATIVE_WEBVIEW_LOAD;
                    WeakHashMap weakHashMap3 = j13.a;
                    w03VarA = j13.a(no0Var3, adultoid.formularize(), true);
                    try {
                        this.a = so1Var;
                        this.b = closeable3;
                        this.c = closeable2;
                        this.d = gq0Var;
                        this.e = w03VarA;
                        this.f = w03VarA;
                        this.g = 2;
                        objA2 = gq0.a(gq0Var, strA, str, true, (wretchedly.dern) this, 12);
                        if (objA2 != objBeachfront) {
                            closeable5 = closeable2;
                            w03Var = w03VarA;
                            closeable4 = closeable3;
                            spartacistVar = (spartacist) objA2;
                            if (spartacistVar instanceof nn0) {
                                y13.a((nn0) spartacistVar, false);
                            }
                            interaction.saneness.attabal(w03VarA, null);
                            if (!(spartacistVar instanceof nn0)) {
                                cutely.wireman(so1Var.b, dhss.f32190kowloon, null, new lo1(gq0Var, null), 2, null);
                                y13.a((nn0) spartacistVar, false);
                                gq0Var2 = null;
                            } else {
                                this.a = closeable4;
                                this.b = closeable5;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.g = 3;
                                objA3 = so1.a(so1Var, gq0Var, this);
                                if (objA3 != objBeachfront) {
                                    closeable = closeable5;
                                    r2 = closeable4;
                                    gq0Var2 = (gq0) objA3;
                                    closeable5 = closeable;
                                }
                            }
                            interaction.saneness.attabal(closeable5, null);
                            return gq0Var2;
                        }
                        return objBeachfront;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = closeable2;
                        w03Var = w03VarA;
                        closeable4 = closeable3;
                        w03Var.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        w03Var.a(th);
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
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable = closeable2;
                    r2 = closeable3;
                }
            } catch (Throwable th4) {
                th = th4;
                closeable = closeable6;
                r2 = w03Var2;
            }
        } else if (i == 2) {
            w03 w03Var3 = this.f;
            w03Var = (w03) this.e;
            gq0Var = (gq0) this.d;
            closeable5 = this.c;
            closeable4 = (w03) this.b;
            so1 so1Var3 = (so1) this.a;
            try {
                p002kotlin.dern.saneness(obj);
                so1Var = so1Var3;
                w03VarA = w03Var3;
                objA2 = obj;
                try {
                    spartacistVar = (spartacist) objA2;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    try {
                        interaction.saneness.attabal(w03VarA, null);
                        if (!(spartacistVar instanceof nn0)) {
                            this.a = closeable4;
                            this.b = closeable5;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.g = 3;
                            objA3 = so1.a(so1Var, gq0Var, this);
                            if (objA3 != objBeachfront) {
                                closeable = closeable5;
                                r2 = closeable4;
                                gq0Var2 = (gq0) objA3;
                                closeable5 = closeable;
                            }
                            return objBeachfront;
                        }
                        cutely.wireman(so1Var.b, dhss.f32190kowloon, null, new lo1(gq0Var, null), 2, null);
                        y13.a((nn0) spartacistVar, false);
                        gq0Var2 = null;
                        interaction.saneness.attabal(closeable5, null);
                        return gq0Var2;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = closeable5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    closeable = closeable5;
                    try {
                        w03Var.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        w03Var.a(th);
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
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            try {
                                interaction.saneness.attabal(w03VarA, th7);
                                throw th8;
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                w03VarA = w03Var3;
                closeable = closeable5;
                w03Var.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03Var.a(th);
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
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = this.b;
            r2 = (w03) this.a;
            try {
                p002kotlin.dern.saneness(obj);
                objA3 = obj;
                r2 = r2;
                gq0Var2 = (gq0) objA3;
                closeable5 = closeable;
                interaction.saneness.attabal(closeable5, null);
                return gq0Var2;
            } catch (Throwable th11) {
                th = th11;
            }
        }
        r2 = closeable4;
        try {
            r2.b(th);
            if (th instanceof evenfall) {
                throw th;
            }
            r2.a(th);
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
        } catch (Throwable th12) {
            try {
                throw th12;
            } catch (Throwable th13) {
                interaction.saneness.attabal(closeable, th12);
                throw th13;
            }
        }
    }
}
