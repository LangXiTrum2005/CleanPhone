package ads_mobile_sdk;

import acidy.taiyuan;
import android.os.Build;
import android.view.View;
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
public final class ni0 extends SuspendLambda implements Function2 {
    public w03 a;
    public w03 b;
    public int c;
    public final /* synthetic */ yi0 d;
    public final /* synthetic */ tl1 e;
    public final /* synthetic */ JsonObject f;
    public final /* synthetic */ JsonObject g;
    public final /* synthetic */ String h;
    public final /* synthetic */ View i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni0(yi0 yi0Var, tl1 tl1Var, JsonObject jsonObject, JsonObject jsonObject2, String str, View view, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = yi0Var;
        this.e = tl1Var;
        this.f = jsonObject;
        this.g = jsonObject2;
        this.h = str;
        this.i = view;
        this.j = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ni0(this.d, this.e, this.f, this.g, this.h, this.i, this.j, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ni0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0261 A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0268 A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:106:0x026c A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0270 A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0274 A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:113:0x027a A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0282 A[Catch: all -> 0x0271, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:117:0x028a A[Catch: all -> 0x0271, TRY_LEAVE, TryCatch #10 {all -> 0x0271, blocks: (B:100:0x025a, B:102:0x0261, B:104:0x0268, B:106:0x026c, B:108:0x0270, B:111:0x0274, B:112:0x0279, B:113:0x027a, B:114:0x0281, B:115:0x0282, B:116:0x0289, B:117:0x028a), top: B:205:0x025a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02be A[Catch: all -> 0x02c4, TryCatch #3 {all -> 0x02c4, blocks: (B:127:0x02b8, B:129:0x02be, B:132:0x02c7), top: B:192:0x02b8 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02da A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e1 A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02e5 A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02e9 A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ed A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02f3 A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02fb A[Catch: all -> 0x02ea, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0303 A[Catch: all -> 0x02ea, TRY_LEAVE, TryCatch #6 {all -> 0x02ea, blocks: (B:139:0x02d3, B:141:0x02da, B:143:0x02e1, B:145:0x02e5, B:147:0x02e9, B:150:0x02ed, B:151:0x02f2, B:152:0x02f3, B:153:0x02fa, B:154:0x02fb, B:155:0x0302, B:156:0x0303), top: B:198:0x02d3 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0246 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:90:0x0240, B:92:0x0246, B:95:0x024f), top: B:201:0x0240 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        taiyuan taiyuanVar;
        String strA;
        w03 w03VarA;
        w03 w03Var;
        Object objA;
        w03 w03Var2;
        w03 w03VarA2;
        w03 w03Var3;
        Object objA2;
        w03 w03Var4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                w03Var3 = this.b;
                w03Var4 = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03VarA2 = w03Var3;
                    objA2 = obj;
                    try {
                        spartacistVar = (spartacist) objA2;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA2, null);
                        return Unit.f29295attabal;
                    } catch (Throwable th) {
                        th = th;
                        w03Var3 = w03VarA2;
                        w03VarA2 = w03Var4;
                        try {
                            w03VarA2.b(th);
                            if (th instanceof evenfall) {
                                throw th;
                            }
                            w03VarA2.a(th);
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
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                interaction.saneness.attabal(w03Var3, th2);
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    w03VarA2 = w03Var4;
                    w03VarA2.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    w03VarA2.a(th);
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
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = this.b;
            w03Var2 = this.a;
            try {
                p002kotlin.dern.saneness(obj);
                w03VarA = w03Var;
                objA = obj;
                try {
                    spartacistVar2 = (spartacist) objA;
                    if (spartacistVar2 instanceof nn0) {
                        y13.a((nn0) spartacistVar2, false);
                    }
                    Unit unit2 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA, null);
                    return Unit.f29295attabal;
                } catch (Throwable th5) {
                    th = th5;
                    w03Var = w03VarA;
                    w03VarA = w03Var2;
                    try {
                        w03VarA.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        w03VarA.a(th);
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
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            interaction.saneness.attabal(w03Var, th6);
                            throw th7;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                w03VarA = w03Var2;
                w03VarA.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03VarA.a(th);
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
        }
        p002kotlin.dern.saneness(obj);
        jk0 jk0Var = this.d.z;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:native_click_protection:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:native_click_protection:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            this.d.A.g.set(true);
        }
        JsonObject jsonObject = new JsonObject();
        yi0 yi0Var = this.d;
        tl1 tl1Var = this.e;
        JsonObject jsonObject2 = this.f;
        JsonObject jsonObject3 = this.g;
        jsonObject.add("ad", yi0Var.g);
        if (tl1Var != null) {
            jsonObject.add("asset_view_signal", tl1Var.a);
            jsonObject.add("ad_view_signal", tl1Var.b);
            jsonObject.add("scroll_view_signal", tl1Var.c);
            jsonObject.add("lock_screen_signal", tl1Var.d);
        }
        if (jsonObject2 != null) {
            jsonObject.add("click_signal", jsonObject2);
        }
        wb0 wb0Var = yi0Var.t;
        synchronized (wb0Var) {
            taiyuanVar = wb0Var.l;
        }
        jsonObject.addProperty("has_custom_click_handler", igo.attabal.attabal(taiyuanVar != null));
        if (jsonObject3 != null) {
            jsonObject.add("provided_signals", jsonObject3);
        }
        JsonObject jsonObject4 = new JsonObject();
        String str = this.h;
        yi0 yi0Var2 = this.d;
        View view = this.i;
        boolean z = this.j;
        jsonObject4.addProperty("asset_id", str);
        jsonObject4.addProperty("template", igo.attabal.wireman(yi0Var2.k.a));
        jsonObject4.addProperty("view_aware_api_used", igo.attabal.attabal(false));
        jsonObject4.addProperty("custom_mute_requested", igo.attabal.attabal(yi0Var2.m.getF19448adultoid()));
        jsonObject4.addProperty("custom_mute_enabled", igo.attabal.attabal(yi0Var2.k()));
        jsonObject4.addProperty("has_custom_click_handler", igo.attabal.attabal(yi0Var2.t.b() != null));
        String strA2 = cb1.a(cb1.a(yi0Var2.g, "tracking_urls_and_actions", new JsonObject()), "click_string", "");
        ri2 ri2Var = yi0Var2.n;
        no0 no0Var = no0.CUI_NAME_CLICK_SIGNALS;
        l13 l13Var = yi0Var2.o;
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                strA = yi0Var2.j.a(view, strA2);
                interaction.saneness.attabal(v62VarA, null);
            } catch (Throwable th9) {
                try {
                    v62VarA.b(th9);
                    if (th9 instanceof evenfall) {
                        throw th9;
                    }
                    v62VarA.a(th9);
                    if (th9 instanceof TimeoutCancellationException) {
                        throw new cp0(th9);
                    }
                    if (th9 instanceof CancellationException) {
                        throw new bn0(th9);
                    }
                    if (th9 instanceof yn0) {
                        throw th9;
                    }
                    throw new gn0(th9);
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        interaction.saneness.attabal(v62VarA, th10);
                        throw th11;
                    }
                }
            }
        } else {
            w03 w03VarA3 = j13.a(no0Var, adultoid.formularize(), true);
            try {
                strA = yi0Var2.j.a(view, strA2);
                interaction.saneness.attabal(w03VarA3, null);
            } catch (Throwable th12) {
                try {
                    w03VarA3.b(th12);
                    if (th12 instanceof evenfall) {
                        throw th12;
                    }
                    w03VarA3.a(th12);
                    if (th12 instanceof TimeoutCancellationException) {
                        throw new cp0(th12);
                    }
                    if (th12 instanceof CancellationException) {
                        throw new bn0(th12);
                    }
                    if (th12 instanceof yn0) {
                        throw th12;
                    }
                    throw new gn0(th12);
                } catch (Throwable th13) {
                    try {
                        throw th13;
                    } catch (Throwable th14) {
                        interaction.saneness.attabal(w03VarA3, th13);
                        throw th14;
                    }
                }
            }
        }
        if (strA != null) {
            jsonObject4.addProperty("click_signals", strA);
        }
        jsonObject4.addProperty("open_chrome_custom_tab", igo.attabal.attabal(true));
        if (Build.VERSION.SDK_INT >= 30) {
            jsonObject4.addProperty("try_fallback_for_deep_link", igo.attabal.attabal(true));
            jsonObject4.addProperty("in_app_link_handling_for_android_11_enabled", igo.attabal.attabal(true));
        }
        if (yi0Var2.I.get() && yi0Var2.j()) {
            jsonObject4.addProperty("custom_click_gesture_eligible", igo.attabal.attabal(true));
        }
        if (z) {
            jsonObject4.addProperty("is_custom_click_gesture", igo.attabal.attabal(true));
        }
        jsonObject.add("click", jsonObject4);
        JsonObject jsonObject5 = new JsonObject();
        yi0 yi0Var3 = this.d;
        yi0Var3.p.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        jsonObject5.addProperty("time_from_last_touch_down", igo.attabal.marial(jCurrentTimeMillis - yi0Var3.G));
        jsonObject5.addProperty("time_from_last_touch", igo.attabal.marial(jCurrentTimeMillis - yi0Var3.H));
        jsonObject.add("touch_signal", jsonObject5);
        yi0 yi0Var4 = this.d;
        ri2 ri2Var2 = yi0Var4.n;
        no0 no0Var2 = no0.CUI_NAME_NATIVE_AD_HANDLE_CLICK;
        l13 l13Var2 = yi0Var4.o;
        List listFormularize2 = adultoid.formularize();
        if (j13.b().a == null) {
            w03VarA2 = ri2.a(ri2Var2, no0Var2, listFormularize2, l13Var2);
            try {
                carport carportVar = yi0Var4.q;
                this.a = w03VarA2;
                this.b = w03VarA2;
                this.c = 1;
                carportVar.getClass();
                String string = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                objA2 = carportVar.a("google.afma.nativeAds.handleClick", string, this);
                if (objA2 != objBeachfront) {
                    w03Var4 = w03VarA2;
                    spartacistVar = (spartacist) objA2;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    Unit unit3 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA2, null);
                    return Unit.f29295attabal;
                }
            } catch (Throwable th15) {
                th = th15;
                w03Var3 = w03VarA2;
                w03VarA2.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03VarA2.a(th);
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
            w03VarA = j13.a(no0Var2, adultoid.formularize(), true);
            try {
                carport carportVar2 = yi0Var4.q;
                this.a = w03VarA;
                this.b = w03VarA;
                this.c = 2;
                carportVar2.getClass();
                String string2 = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                objA = carportVar2.a("google.afma.nativeAds.handleClick", string2, this);
                if (objA != objBeachfront) {
                    w03Var2 = w03VarA;
                    spartacistVar2 = (spartacist) objA;
                    if (spartacistVar2 instanceof nn0) {
                        y13.a((nn0) spartacistVar2, false);
                    }
                    Unit unit4 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA, null);
                    return Unit.f29295attabal;
                }
            } catch (Throwable th16) {
                th = th16;
                w03Var = w03VarA;
                w03VarA.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03VarA.a(th);
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
        }
        return objBeachfront;
    }
}
