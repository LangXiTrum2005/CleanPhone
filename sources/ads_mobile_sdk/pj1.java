package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.nuque;

/* JADX INFO: loaded from: classes.dex */
public final class pj1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ vj1 b;
    public final /* synthetic */ JsonObject c;
    public final /* synthetic */ hj1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = vj1Var;
        this.c = jsonObject;
        this.d = hj1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new pj1(this.d, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0047  */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JsonObject json;
        zx1 mediaType;
        String str;
        JsonObject jsonObject;
        Object objSaneness;
        JsonObject json2;
        boolean z;
        zx1 zx1Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hn1 hn1Var = this.b.c;
            JsonObject jsonObject2 = this.c;
            this.a = 1;
            hn1Var.getClass();
            Intrinsics.checkNotNullParameter("enable_omid", X3.i.W);
            if (jsonObject2 == null) {
                str = "omid_html";
                jsonObject = null;
                objSaneness = null;
            } else {
                try {
                    Intrinsics.checkNotNullParameter(jsonObject2, "<this>");
                    Intrinsics.checkNotNullParameter("enable_omid", X3.i.W);
                    if (jsonObject2.get("enable_omid").getAsBoolean()) {
                        Intrinsics.checkNotNullParameter("omid_settings", X3.i.W);
                        try {
                            json = jsonObject2.getAsJsonObject("omid_settings");
                        } catch (Exception unused) {
                            json = null;
                        }
                        if (json == null) {
                            str = "omid_html";
                        } else {
                            Intrinsics.checkNotNullParameter(json, "json");
                            int iA = cb1.a(json, "media_type", -1);
                            if (iA != 0) {
                                mediaType = iA != 1 ? zx1.UNKNOWN : zx1.VIDEO;
                            } else {
                                mediaType = zx1.DISPLAY;
                            }
                            sz1 videoEventsOwner = nuque.f37229attabal[mediaType.ordinal()] == 1 ? sz1.d : sz1.c;
                            cb1.a(json, "javascript_session_service_enabled", true);
                            String omidPartnerName = cb1.a(json, "omid_partner_name", "");
                            String omidHtml = cb1.a(json, "omid_html", "");
                            str = "omid_html";
                            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                            Intrinsics.checkNotNullParameter(videoEventsOwner, "videoEventsOwner");
                            Intrinsics.checkNotNullParameter(omidPartnerName, "omidPartnerName");
                            Intrinsics.checkNotNullParameter(omidHtml, "omidHtml");
                            if (omidHtml.length() != 0) {
                                saran saranVar = hn1Var.f;
                                jsonObject = null;
                                gn1 block = new gn1(hn1Var, omidHtml, null);
                                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                                Intrinsics.checkNotNullParameter(context, "context");
                                Intrinsics.checkNotNullParameter(block, "block");
                                objSaneness = cutely.saneness(saranVar, context, null, new w13(block, null), 2, null);
                            }
                        }
                        jsonObject = null;
                        objSaneness = null;
                    } else {
                        str = "omid_html";
                        jsonObject = null;
                        objSaneness = null;
                    }
                } catch (Exception unused2) {
                }
            }
            if (objSaneness == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            objSaneness = obj;
            str = "omid_html";
            jsonObject = null;
        }
        walach walachVar = (walach) objSaneness;
        if (walachVar != null) {
            this.d.o = walachVar;
        }
        JsonObject jsonObject3 = this.c;
        Intrinsics.checkNotNullParameter("omid_settings", X3.i.W);
        if (jsonObject3 == null) {
            json2 = jsonObject;
        } else {
            try {
                json2 = jsonObject3.getAsJsonObject("omid_settings");
            } catch (Exception unused3) {
                json2 = jsonObject;
            }
        }
        if (json2 != null) {
            hj1 hj1Var = this.d;
            Intrinsics.checkNotNullParameter(json2, "json");
            int iA2 = cb1.a(json2, "media_type", -1);
            if (iA2 != 0) {
                z = true;
                zx1Var = iA2 != 1 ? zx1.UNKNOWN : zx1.VIDEO;
            } else {
                z = true;
                zx1Var = zx1.DISPLAY;
            }
            zx1 zx1Var2 = zx1Var;
            hj1Var.n = new ay1(zx1Var2, nuque.f37229attabal[zx1Var2.ordinal()] == z ? sz1.d : sz1.c, cb1.a(json2, "javascript_session_service_enabled", z), cb1.a(json2, "omid_partner_name", ""), cb1.a(json2, str, ""));
        }
        return Unit.f29295attabal;
    }
}
