package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import complexometry.competently;
import complexometry.dovishness;
import complexometry.formularize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import liquory.marial;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.belongingness;
import saneness.delores;
import saneness.ginshop;
import saneness.hemolysin;
import saneness.loun;
import saneness.pitchy;
import saneness.spartacist;
import saneness.vilification;
import saneness.winner;

/* JADX INFO: loaded from: classes.dex */
public final class qz1 implements hemolysin {
    public final nz1 a;
    public final loun b;
    public final jk0 c;
    public final Gson d;
    public final xl1 e;
    public final Context f;

    public qz1(nz1 outOfContextTester, loun traceLogger, jk0 flags, Gson gson, xl1 nativeAdUtil, Context applicationContext) {
        Intrinsics.checkNotNullParameter(outOfContextTester, "outOfContextTester");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.a = outOfContextTester;
        this.b = traceLogger;
        this.c = flags;
        this.d = gson;
        this.e = nativeAdUtil;
        this.f = applicationContext;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r1.equals("INLINE_ADAPTIVE_PORTRAIT") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r5 = "INLINE_ADAPTIVE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1.equals("LARGE_ANCHORED_ADAPTIVE_LANDSCAPE") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r1.equals("ANCHORED_ADAPTIVE") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r1.equals("LARGE_ANCHORED_ADAPTIVE_PORTRAIT") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r1.equals("LARGE_ANCHORED_ADAPTIVE") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r1.equals("FIXED") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r1.equals("ANCHORED_ADAPTIVE_LANDSCAPE") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        if (r1.equals("INLINE_ADAPTIVE_MAX_HEIGHT") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r17 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r16 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (p002kotlin.jvm.internal.Intrinsics.wireman(r1, "FIXED") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        return new liquory.attabal(r17.intValue(), r16.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        return liquory.attabal.INSTANCE.beachfront(r17.intValue(), r16.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        r3 = r19.b;
        r4 = new java.lang.NumberFormatException("Width (" + r2 + ") or height (" + r5 + ") is not a number.");
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to create ");
        r2.append(r1);
        r2.append(" ad size.");
        ((ads_mobile_sdk.d13) r3).a(r2.toString(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        return liquory.attabal.f33065impromptu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if (r1.equals("INLINE_ADAPTIVE_LANDSCAPE") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        if (r1.equals("ANCHORED_ADAPTIVE_PORTRAIT") == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final liquory.attabal a(java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qz1.a(java.util.Map):liquory.attabal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final spartacist b(Map map) {
        liquory.attabal attabalVar;
        NativeAd.NativeMediaAspectRatio nativeMediaAspectRatioB;
        competently competentlyVar;
        boolean zWireman;
        boolean zWireman2;
        dovishness dovishnessVarAttabal;
        boolean z;
        Integer intOrNull;
        String str;
        String str2 = (String) map.get("adUnitId");
        if (str2 == null || StringsKt.empress(str2)) {
            return new rn0("No OOCT ad unit ID specified.");
        }
        String str3 = (String) map.get("format");
        if (str3 != null) {
            yf2.b.getClass();
            yf2 yf2VarAttabal = ginshop.attabal(str3);
            if (yf2VarAttabal != null) {
                if (yf2VarAttabal == yf2.d) {
                    return new rn0("No OOCT format specified.");
                }
                liquory.attabal attabalVar2 = liquory.attabal.f33065impromptu;
                NativeAd.NativeMediaAspectRatio nativeMediaAspectRatio = NativeAd.NativeMediaAspectRatio.UNKNOWN;
                AdChoicesPlacement adChoicesPlacementA = AdChoicesPlacement.TOP_RIGHT;
                ImageView.ScaleType scaleTypeValueOf = ImageView.ScaleType.CENTER_INSIDE;
                String str4 = (String) map.get("serverSideVerificationUserId");
                scarbroite.saneness sanenessVar = (str4 == null || (str = (String) map.get("serverSideVerificationRewardString")) == null) ? null : new scarbroite.saneness(str4, str);
                if (this.c.T()) {
                    Object obj = map.get("adUnitId");
                    Intrinsics.beachfront(obj);
                    competently.attabal attabalVar3 = new competently.attabal((String) obj);
                    String str5 = (String) map.get("keywords");
                    if (str5 != null) {
                        Iterator it = a(str5, "keywords").iterator();
                        while (it.hasNext()) {
                            attabalVar3.dern((String) it.next());
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("request_origin", "inspector_ooct");
                    String str6 = (String) map.get("networkExtras");
                    if (str6 != null) {
                        try {
                            bundle.putAll(cb1.a(str6));
                        } catch (JsonSyntaxException e) {
                            ((d13) this.b).a("Failed to parse OOCT network extras.", e);
                        }
                    }
                    attabalVar3.monoploid(bundle);
                    String str7 = (String) map.get("customTargeting");
                    if (str7 != null) {
                        try {
                            for (Map.Entry<String, JsonElement> entry : ((JsonObject) this.d.fromJson(str7, JsonObject.class)).entrySet()) {
                                Intrinsics.beachfront(entry);
                                String key = entry.getKey();
                                JsonElement value = entry.getValue();
                                if (value.isJsonPrimitive() && value.getAsJsonPrimitive().isString()) {
                                    Intrinsics.beachfront(key);
                                    String asString = value.getAsJsonPrimitive().getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                                    attabalVar3.triweekly(key, asString);
                                }
                            }
                        } catch (JsonSyntaxException e2) {
                            ((d13) this.b).a("Failed to parse OOCT custom targeting.", e2);
                        }
                    }
                    String str8 = (String) map.get("contentUrl");
                    if (str8 != null) {
                    }
                    String str9 = (String) map.get("neighboringContentUrlStrings");
                    if (str9 != null) {
                    }
                    String str10 = (String) map.get("publisherProvidedId");
                    if (str10 != null) {
                    }
                    String str11 = (String) map.get("categoryExclusions");
                    if (str11 != null) {
                        Iterator it2 = a(str11, "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            attabalVar3.saneness((String) it2.next());
                        }
                    }
                    competently competentlyVarGraveside = attabalVar3.graveside();
                    liquory.attabal attabalVarA = a(map);
                    nativeMediaAspectRatioB = this.e.b((String) map.get("mediaAspectRatio"));
                    adChoicesPlacementA = this.e.a((String) map.get("preferredAdChoicesPosition"));
                    if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                        dovishness.attabal attabalVar4 = new dovishness.attabal();
                        String str12 = (String) map.get("startMuted");
                        if (str12 != null) {
                            attabalVar4.wireman(Intrinsics.wireman(str12, "1"));
                        }
                        String str13 = (String) map.get("customControlsRequested");
                        if (str13 != null) {
                            attabalVar4.dern(Intrinsics.wireman(str13, "1"));
                        }
                        String str14 = (String) map.get("clickToExpandRequested");
                        if (str14 != null) {
                            attabalVar4.saneness(Intrinsics.wireman(str14, "1"));
                        }
                        dovishnessVarAttabal = attabalVar4.attabal();
                    } else {
                        dovishnessVarAttabal = null;
                    }
                    String str15 = (String) map.get("disableImageLoading");
                    zWireman2 = str15 != null ? Intrinsics.wireman(str15, "1") : false;
                    String str16 = (String) map.get("customMuteThisAdRequested");
                    zWireman = str16 != null ? Intrinsics.wireman(str16, "1") : false;
                    attabalVar = attabalVarA;
                    competentlyVar = competentlyVarGraveside;
                } else {
                    attabalVar = attabalVar2;
                    nativeMediaAspectRatioB = nativeMediaAspectRatio;
                    competentlyVar = null;
                    zWireman = false;
                    zWireman2 = false;
                    dovishnessVarAttabal = null;
                }
                String str17 = (String) map.get("bannerPosition");
                String str18 = "CENTER";
                competently competentlyVar2 = competentlyVar;
                if (str17 != null) {
                    int iHashCode = str17.hashCode();
                    z = zWireman;
                    if (iHashCode == 83253 ? str17.equals("TOP") : iHashCode == 1965067819 ? str17.equals("BOTTOM") : !(iHashCode != 1984282709 || !str17.equals("CENTER"))) {
                        str18 = str17;
                    }
                } else {
                    z = zWireman;
                }
                String str19 = (String) map.get(X3.j.Q);
                boolean zWireman3 = str19 != null ? Intrinsics.wireman(str19, "1") : false;
                String str20 = (String) map.get("customNativeTemplates");
                List listA = str20 != null ? a(str20, "customNativeTemplates") : null;
                String str21 = (String) map.get("imageScaleType");
                if (str21 != null) {
                    try {
                        scaleTypeValueOf = ImageView.ScaleType.valueOf(str21);
                    } catch (IllegalArgumentException e3) {
                        ((d13) this.b).a("Failed to parse OOCT image scale type: " + str21, e3);
                    }
                }
                String str22 = (String) map.get("bannerWidthConstraint");
                return new tn0(new pz1(str2, yf2VarAttabal, adChoicesPlacementA, competentlyVar2, attabalVar, z, listA, zWireman2, nativeMediaAspectRatioB, sanenessVar, dovishnessVarAttabal, str18, zWireman3, scaleTypeValueOf, (str22 == null || (intOrNull = StringsKt.toIntOrNull(str22)) == null) ? 0 : intOrNull.intValue()));
            }
        }
        return new rn0("No OOCT format specified.");
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) throws Throwable {
        Object objA;
        List listMarial;
        String str = (String) map.get("action");
        if (str == null) {
            return Unit.f29295attabal;
        }
        if (StringsKt.empress(str)) {
            y13.a("No OOCT action specified.", null, 6);
            return Unit.f29295attabal;
        }
        spartacist spartacistVarB = b(map);
        if (spartacistVarB instanceof nn0) {
            y13.a((nn0) spartacistVarB, false);
            return Unit.f29295attabal;
        }
        Intrinsics.competently(spartacistVarB, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        pz1 pz1Var = (pz1) ((tn0) spartacistVarB).b;
        if (Intrinsics.wireman(str, "load")) {
            nz1 nz1Var = this.a;
            nz1Var.getClass();
            int iOrdinal = pz1Var.b.ordinal();
            if (iOrdinal == 1) {
                competently competentlyVarGraveside = pz1Var.d;
                if (competentlyVarGraveside == null) {
                    competentlyVarGraveside = new competently.attabal(pz1Var.a).graveside();
                }
                winner winnerVar = (winner) nz1Var.e.get();
                yf2 yf2Var = yf2.e;
                d80 d80Var = (d80) winnerVar;
                d80Var.getClass();
                d80Var.d = yf2Var;
                d80 d80Var2 = (d80) ((winner) d80Var.a(competentlyVarGraveside));
                d80Var2.c = competentlyVarGraveside;
                d80 d80Var3 = (d80) ((winner) ((d80) ((winner) d80Var2.b(true))).a(false));
                vilification.saneness(d80Var3.b, competently.class);
                vilification.saneness(d80Var3.c, formularize.class);
                vilification.saneness(d80Var3.d, yf2.class);
                vilification.saneness(d80Var3.e, Boolean.class);
                vilification.saneness(d80Var3.f, Boolean.class);
                objA = nz1Var.a(new e80(d80Var3.a, d80Var3.b, d80Var3.c, d80Var3.d, d80Var3.e, d80Var3.f), pz1Var, dernVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
            } else if (iOrdinal == 2) {
                marial.attabal attabalVar = new marial.attabal(pz1Var.a, pz1Var.e);
                dovishness dovishnessVar = pz1Var.k;
                if (dovishnessVar != null) {
                    attabalVar.dovishness(dovishnessVar);
                }
                competently competentlyVar = pz1Var.d;
                if (competentlyVar != null) {
                    nz1.a(competentlyVar, attabalVar);
                }
                marial marialVarGraveside = attabalVar.graveside();
                delores deloresVar = (delores) nz1Var.f.get();
                yf2 yf2Var2 = yf2.f;
                g80 g80Var = (g80) deloresVar;
                g80Var.getClass();
                g80Var.d = yf2Var2;
                g80 g80Var2 = (g80) ((delores) g80Var.a((competently) marialVarGraveside));
                g80Var2.c = marialVarGraveside;
                g80Var2.g = marialVarGraveside;
                g80Var2.h = marialVarGraveside;
                objA = nz1Var.a(((g80) ((delores) ((g80) ((delores) g80Var2.b(true))).a(false))).b(), pz1Var, dernVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
            } else if (iOrdinal == 4) {
                competently competentlyVarGraveside2 = pz1Var.d;
                if (competentlyVarGraveside2 == null) {
                    competentlyVarGraveside2 = new competently.attabal(pz1Var.a).graveside();
                }
                belongingness belongingnessVar = (belongingness) nz1Var.g.get();
                yf2 yf2Var3 = yf2.h;
                m80 m80Var = (m80) belongingnessVar;
                m80Var.getClass();
                m80Var.d = yf2Var3;
                m80 m80Var2 = (m80) ((belongingness) m80Var.a(competentlyVarGraveside2));
                m80Var2.c = competentlyVarGraveside2;
                objA = nz1Var.a(((m80) ((belongingness) ((m80) ((belongingness) m80Var2.b(true))).a(false))).b(), pz1Var, dernVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
            } else if (iOrdinal == 5) {
                List list = pz1Var.g;
                if (list != null && !list.isEmpty()) {
                    listMarial = graveside.marial(NativeAd.NativeAdType.CUSTOM_NATIVE);
                } else {
                    listMarial = graveside.marial(NativeAd.NativeAdType.NATIVE);
                }
                com.google.android.libraries.ads.mobile.sdk.nativead.saneness.attabal attabalVar2 = new com.google.android.libraries.ads.mobile.sdk.nativead.saneness.attabal(pz1Var.a, listMarial);
                attabalVar2.cord(pz1Var.i);
                attabalVar2.rotuma(pz1Var.c);
                attabalVar2.graveside(pz1Var.f);
                dovishness dovishnessVar2 = pz1Var.k;
                if (dovishnessVar2 != null) {
                    attabalVar2.cuirassed(dovishnessVar2);
                }
                competently competentlyVar2 = pz1Var.d;
                if (competentlyVar2 != null) {
                    nz1.a(competentlyVar2, attabalVar2);
                }
                List<String> list2 = pz1Var.g;
                if (list2 != null) {
                    attabalVar2.preprohormone(list2);
                }
                if (pz1Var.h) {
                    attabalVar2.dovishness();
                }
                com.google.android.libraries.ads.mobile.sdk.nativead.saneness sanenessVarAdultoid = attabalVar2.adultoid();
                objA = nz1Var.a(((pitchy) ((pitchy) ((pitchy) ((pitchy) ((pitchy) ((pitchy) nz1Var.h.get()).a(yf2.i)).a((competently) sanenessVarAdultoid)).a((formularize) sanenessVarAdultoid)).a((com.google.android.libraries.ads.mobile.sdk.nativead.dern) sanenessVarAdultoid).a(sanenessVarAdultoid).b(true)).a(false)).a(1).a(), pz1Var, dernVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
            } else if (iOrdinal == 6) {
                objA = nz1Var.a(pz1Var, dernVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
            } else if (iOrdinal != 7 || (objA = nz1Var.a(pz1Var, dernVar)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        if (Intrinsics.wireman(str, C3700q2.v)) {
            nz1 nz1Var2 = this.a;
            nz1Var2.getClass();
            Object objA2 = nz1.a(nz1Var2, pz1Var, dernVar);
            return objA2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA2 : Unit.f29295attabal;
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_OUT_OF_CONTEXT_TESTING;
    }

    public final List a(String str, String str2) {
        try {
            JsonArray jsonArray = (JsonArray) this.d.fromJson(str, JsonArray.class);
            ArrayList arrayList = new ArrayList();
            if (jsonArray != null) {
                int i = 0;
                for (JsonElement jsonElement : jsonArray) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement2 = jsonElement;
                    Intrinsics.beachfront(jsonElement2);
                    String asString = jsonElement2.getAsString();
                    if (asString != null) {
                        arrayList.add(asString);
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (JsonSyntaxException e) {
            ((d13) this.b).a("Failed to parse OOCT string array: " + str2 + ".", e);
            return adultoid.formularize();
        }
    }
}
