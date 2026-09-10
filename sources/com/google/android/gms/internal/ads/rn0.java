package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.ironsource.Y3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rn0 implements nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd0 f19622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f19623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hz f19624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xu0 f19625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rg0 f19626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wh0 f19627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f19628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f19629h;

    public rn0(pd0 pd0Var, fe1 fe1Var, hz hzVar, xu0 xu0Var, rg0 rg0Var, wh0 wh0Var, VersionInfoParcel versionInfoParcel, Context context, jq jqVar) {
        this.f19628g = versionInfoParcel;
        this.f19629h = context;
        this.f19622a = pd0Var;
        this.f19623b = fe1Var;
        this.f19624c = hzVar;
        this.f19625d = xu0Var;
        this.f19626e = rg0Var;
        this.f19627f = wh0Var;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), this.f19627f, "rendering-native-ads-native-js-webview-start");
        }
        ListenableFuture listenableFutureB = this.f19625d.b();
        ht htVar = new ht(11, this, du0Var);
        fe1 fe1Var = this.f19623b;
        return zw1.x(zw1.x(listenableFutureB, htVar, fe1Var), new q80(this, ju0Var, du0Var, 8), fe1Var);
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        hu0 hu0Var = du0Var.f13708s;
        return (hu0Var == null || hu0Var.f15396c == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03cc A[PHI: r25
  0x03cc: PHI (r25v7 com.google.android.gms.internal.ads.wh0) = 
  (r25v6 com.google.android.gms.internal.ads.wh0)
  (r25v6 com.google.android.gms.internal.ads.wh0)
  (r25v6 com.google.android.gms.internal.ads.wh0)
  (r25v6 com.google.android.gms.internal.ads.wh0)
  (r25v8 com.google.android.gms.internal.ads.wh0)
  (r25v8 com.google.android.gms.internal.ads.wh0)
  (r25v8 com.google.android.gms.internal.ads.wh0)
 binds: [B:96:0x03b2, B:98:0x03b8, B:100:0x03c4, B:102:0x03ca, B:171:0x03cc, B:168:0x03cc, B:112:0x03f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0457  */
    /* JADX WARN: Code duplicated, block: B:124:0x0466  */
    /* JADX WARN: Code duplicated, block: B:126:0x047a  */
    /* JADX WARN: Code duplicated, block: B:127:0x048c  */
    /* JADX WARN: Code duplicated, block: B:130:0x049a  */
    /* JADX WARN: Code duplicated, block: B:132:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:137:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:140:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:142:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:143:0x0506  */
    /* JADX WARN: Code duplicated, block: B:148:0x0537 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:149:0x053a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0551  */
    /* JADX WARN: Code duplicated, block: B:155:0x0554  */
    /* JADX WARN: Code duplicated, block: B:157:0x0566  */
    /* JADX WARN: Code duplicated, block: B:160:0x0590  */
    /* JADX WARN: Code duplicated, block: B:163:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:165:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x020b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0213  */
    /* JADX WARN: Code duplicated, block: B:55:0x0216  */
    /* JADX WARN: Code duplicated, block: B:59:0x0262  */
    /* JADX WARN: Code duplicated, block: B:60:0x0267  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0303  */
    /* JADX WARN: Code duplicated, block: B:83:0x0315  */
    /* JADX WARN: Code duplicated, block: B:85:0x0331  */
    /* JADX WARN: Code duplicated, block: B:86:0x0341  */
    /* JADX WARN: Code duplicated, block: B:90:0x0379  */
    /* JADX WARN: Code duplicated, block: B:92:0x037d  */
    /* JADX WARN: Code duplicated, block: B:94:0x038a  */
    /* JADX WARN: Code duplicated, block: B:97:0x03b4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final sd1 c(final ju0 ju0Var, final du0 du0Var, final JSONObject jSONObject) {
        zzb zzbVar;
        zy zyVar;
        ListenableFuture listenableFuture;
        Executor executor;
        String str;
        ListenableFuture listenableFutureX;
        int i10;
        zzr zzrVar;
        ListenableFuture listenableFutureB;
        ListenableFuture listenableFutureB2;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        ListenableFuture listenableFutureE;
        JSONObject jSONObjectZzi;
        String str2;
        ListenableFuture listenableFutureD;
        tf0 tf0Var;
        ListenableFuture listenableFutureE2;
        wh0 wh0Var;
        ListenableFuture listenableFutureD2;
        vu0 vu0Var;
        Executor executor2;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList;
        int length;
        int i11;
        ListenableFuture listenableFuture2;
        ListenableFuture listenableFutureZ;
        JSONObject jSONObjectOptJSONObject3;
        JSONArray jSONArray;
        String strOptString;
        int i12;
        String strOptString2;
        ListenableFuture listenableFuture3;
        Future futureZ;
        JSONObject jSONObjectOptJSONObject4;
        String strOptString3;
        ListenableFuture listenableFutureX2;
        ArrayList arrayList2;
        JSONArray jSONArrayOptJSONArray3;
        JSONObject jSONObjectOptJSONObject5;
        String strOptString4;
        tf0 tf0Var2;
        boolean z10;
        tf0 tf0Var3;
        bg0 bg0Var;
        fd1 fd1VarX;
        String str3;
        zy zyVar2;
        if (((Boolean) zzba.zzc().a(am.V2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), this.f19627f, "rendering-webview-creation-start");
        }
        final ListenableFuture listenableFutureB3 = this.f19625d.b();
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12352sf)).booleanValue();
        Context context = this.f19629h;
        if (zBooleanValue) {
            az azVar = du0Var.A;
            if (azVar != null) {
                hu0 hu0Var = du0Var.f13708s;
                zyVar2 = new zy(context, this.f19628g, azVar, hu0Var == null ? null : hu0Var.f15395b);
            } else {
                zyVar2 = null;
            }
            zzbVar = new zzb(context, zyVar2, null);
            zyVar = zyVar2;
        } else {
            zzbVar = new zzb(context, null, null);
            zyVar = null;
        }
        zzb zzbVar2 = zzbVar;
        final hz hzVar = this.f19624c;
        fe1 fe1Var = (fe1) hzVar.f15433b;
        tf0 tf0Var4 = (tf0) hzVar.f15434c;
        eo eoVar = tf0Var4.f20351h;
        if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) hzVar.f15436e, "rendering-native-assets-loading-start");
        }
        ListenableFuture listenableFutureB4 = ((k00) fe1Var).b(new of0(hzVar, ju0Var, du0Var, jSONObject, 0));
        hzVar.q(46, listenableFutureB4);
        Executor executor3 = tf0Var4.f20350g;
        wh0 wh0Var2 = tf0Var4.f20360r;
        String str4 = "images";
        ListenableFuture listenableFutureA = tf0Var4.a(jSONObject.optJSONArray("images"), eoVar.f14031b, eoVar.f14033d, 47);
        hzVar.q(48, listenableFutureA);
        fu0 fu0Var = (fu0) ju0Var.f16196b.f20920d;
        if (((Boolean) zzba.zzc().a(am.Gb)).booleanValue()) {
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("images");
            if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                listenableFutureA = listenableFutureA;
                listenableFuture = listenableFutureB4;
                wh0Var2 = wh0Var2;
                str4 = "images";
                fu0Var = fu0Var;
                zzbVar2 = zzbVar2;
                zyVar = zyVar;
                tf0Var4 = tf0Var4;
                fe1Var = fe1Var;
                executor = executor3;
                str = "html";
                listenableFutureX = be1.f12743b;
            } else {
                listenableFuture = listenableFutureB4;
                JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray4.optJSONObject(0);
                if (jSONObjectOptJSONObject6 == null) {
                    listenableFutureX = be1.f12743b;
                    executor = executor3;
                } else if (((Boolean) zzba.zzc().a(am.X4)).booleanValue() && jSONObjectOptJSONObject6.has((String) zzba.zzc().a(am.Y4))) {
                    listenableFutureX = be1.f12743b;
                    executor = executor3;
                } else {
                    String strOptString5 = jSONObjectOptJSONObject6.optString("base_url");
                    String strOptString6 = jSONObjectOptJSONObject6.optString("html");
                    int iOptInt = jSONObjectOptJSONObject6.optInt("width", 0);
                    int iOptInt2 = jSONObjectOptJSONObject6.optInt("height", 0);
                    if (iOptInt == 0) {
                        if (iOptInt2 != 0) {
                            i10 = 0;
                        } else {
                            zzrVar = zzr.zzb();
                        }
                        if (TextUtils.isEmpty(strOptString6)) {
                            wh0Var2 = wh0Var2;
                            fu0Var = fu0Var;
                            zzbVar2 = zzbVar2;
                            zyVar = zyVar;
                            tf0Var4 = tf0Var4;
                            listenableFuture = listenableFuture;
                            executor = executor3;
                            listenableFutureA = listenableFutureA;
                            fe1Var = fe1Var;
                            str4 = str4;
                            str = "html";
                            listenableFutureX = be1.f12743b;
                        } else {
                            if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                                com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var2, "native-assets-loading-image-composition-start");
                            }
                            be1 be1Var = be1.f12743b;
                            wh0Var2 = wh0Var2;
                            zy zyVar3 = zyVar;
                            listenableFuture = listenableFuture;
                            listenableFutureA = listenableFutureA;
                            fe1Var = fe1Var;
                            str4 = "images";
                            str = "html";
                            rf0 rf0Var = new rf0(tf0Var4, zzrVar, du0Var, fu0Var, zzbVar2, zyVar3, strOptString5, strOptString6, 0);
                            tf0Var4 = tf0Var4;
                            fu0Var = fu0Var;
                            zzbVar2 = zzbVar2;
                            zyVar = zyVar3;
                            fd1 fd1VarX2 = zw1.x(be1Var, rf0Var, l00.f16613f);
                            listenableFutureX = zw1.x(fd1VarX2, new sf0(fd1VarX2, 0), l00.f16615h);
                            if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
                                executor = executor3;
                                v71.j(listenableFutureX, "NativeAssetsLoader.loadImageHtml", executor);
                            } else {
                                executor = executor3;
                            }
                        }
                    } else {
                        i10 = iOptInt;
                    }
                    zzrVar = new zzr(tf0Var4.f20344a, new AdSize(i10, iOptInt2));
                    if (TextUtils.isEmpty(strOptString6)) {
                        if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var2, "native-assets-loading-image-composition-start");
                        }
                        be1 be1Var2 = be1.f12743b;
                        wh0Var2 = wh0Var2;
                        zy zyVar4 = zyVar;
                        listenableFuture = listenableFuture;
                        listenableFutureA = listenableFutureA;
                        fe1Var = fe1Var;
                        str4 = "images";
                        str = "html";
                        rf0 rf0Var2 = new rf0(tf0Var4, zzrVar, du0Var, fu0Var, zzbVar2, zyVar4, strOptString5, strOptString6, 0);
                        tf0Var4 = tf0Var4;
                        fu0Var = fu0Var;
                        zzbVar2 = zzbVar2;
                        zyVar = zyVar4;
                        fd1 fd1VarX3 = zw1.x(be1Var2, rf0Var2, l00.f16613f);
                        listenableFutureX = zw1.x(fd1VarX3, new sf0(fd1VarX3, 0), l00.f16615h);
                        if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
                            executor = executor3;
                            v71.j(listenableFutureX, "NativeAssetsLoader.loadImageHtml", executor);
                        } else {
                            executor = executor3;
                        }
                    } else {
                        wh0Var2 = wh0Var2;
                        fu0Var = fu0Var;
                        zzbVar2 = zzbVar2;
                        zyVar = zyVar;
                        tf0Var4 = tf0Var4;
                        listenableFuture = listenableFuture;
                        executor = executor3;
                        listenableFutureA = listenableFutureA;
                        fe1Var = fe1Var;
                        str4 = str4;
                        str = "html";
                        listenableFutureX = be1.f12743b;
                    }
                }
            }
            hzVar.q(50, listenableFutureX);
            listenableFutureB = tf0Var4.b(jSONObject.optJSONObject("secondary_image"), eoVar.f14031b, 51);
            hzVar.q(52, listenableFutureB);
            listenableFutureB2 = tf0Var4.b(jSONObject.optJSONObject("app_icon"), eoVar.f14031b, 53);
            hzVar.q(54, listenableFutureB2);
            jSONObjectOptJSONObject = jSONObject.optJSONObject(Y3.f27960c);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureE = be1.f12743b;
            } else {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str4);
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
                if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
                }
                listenableFutureE = tf0Var4.e("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zw1.z(tf0Var4.a(jSONArrayOptJSONArray, false, true, 55), new jt(1, tf0Var4, jSONObjectOptJSONObject), executor));
            }
            hzVar.q(56, listenableFutureE);
            jSONObjectZzi = zzbp.zzi(jSONObject, "html_containers", "instream");
            str2 = "video";
            if (jSONObjectZzi == null) {
                jSONObjectOptJSONObject5 = jSONObject.optJSONObject("video");
                if (jSONObjectOptJSONObject5 == null) {
                    listenableFutureE = listenableFutureE;
                    str2 = "video";
                    zzbVar2 = zzbVar2;
                    listenableFutureB2 = listenableFutureB2;
                    tf0Var = tf0Var4;
                    listenableFutureE2 = be1.f12743b;
                    zyVar = zyVar;
                } else {
                    strOptString4 = jSONObjectOptJSONObject5.optString("vast_xml");
                    tf0Var2 = tf0Var4;
                    if (((Boolean) zzba.zzc().a(am.Fb)).booleanValue() || !jSONObjectOptJSONObject5.has(str)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (TextUtils.isEmpty(strOptString4) || z10) {
                        if (z10) {
                            tf0Var3 = tf0Var2;
                            fd1VarX = tf0Var3.d(jSONObjectOptJSONObject5, du0Var, fu0Var, zzbVar2, zyVar);
                            listenableFutureB2 = listenableFutureB2;
                        } else {
                            tf0Var3 = tf0Var2;
                            bg0Var = tf0Var3.f20352i;
                            bg0Var.getClass();
                            if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                                com.applovin.impl.ca.s((p9.b) zzt.zzk(), bg0Var.f12773i, "native-assets-loading-video-start");
                            }
                            be1 be1Var3 = be1.f12743b;
                            q80 q80Var = new q80(bg0Var, zzbVar2, zyVar, 1);
                            Executor executor4 = bg0Var.f12766b;
                            fd1VarX = zw1.x(zw1.x(be1Var3, q80Var, executor4), new ht(4, bg0Var, jSONObjectOptJSONObject5), executor4);
                        }
                        ListenableFuture listenableFutureV = zw1.v(fd1VarX, ((Integer) zzba.zzc().a(am.P4)).intValue(), TimeUnit.SECONDS, tf0Var3.f20354k);
                        if (true != z10) {
                            str3 = "NativeAssetsLoader.loadVideoView";
                        } else {
                            str3 = "NativeAssetsLoader.loadVideoHtml";
                        }
                        tf0Var = tf0Var3;
                        listenableFutureE2 = tf0Var3.e(str3, false, listenableFutureV);
                        zyVar = zyVar;
                        zzbVar2 = zzbVar2;
                    } else {
                        int i13 = zze.zza;
                        zzo.zzi("Required field 'vast_xml' or 'html' is missing");
                        listenableFutureD = be1.f12743b;
                        tf0Var = tf0Var2;
                    }
                }
                hzVar.q(58, listenableFutureE2);
                int i14 = 3;
                if (((Boolean) zzba.zzc().a(am.Ie)).booleanValue() || !jSONObject.has(str2)) {
                    wh0Var = wh0Var2;
                    listenableFutureD2 = zw1.d(new Bundle());
                } else {
                    JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject(str2);
                    if (!jSONObjectOptJSONObject7.has("flags") || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject7.optJSONArray("flags")) == null) {
                        wh0Var = wh0Var2;
                        listenableFutureD2 = zw1.d(new Bundle());
                    } else {
                        int i15 = 0;
                        while (true) {
                            if (i15 < jSONArrayOptJSONArray3.length()) {
                                JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray3.optJSONObject(i15);
                                if (jSONObjectOptJSONObject8 == null || !jSONObjectOptJSONObject8.optString(X3.i.W).equals("afma_video_player_type")) {
                                    i15++;
                                    wh0Var2 = wh0Var2;
                                    i14 = 3;
                                } else {
                                    try {
                                        if (Integer.parseInt(jSONObjectOptJSONObject8.optString(X3.i.X)) == i14) {
                                            if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                                                wh0Var = wh0Var2;
                                                com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "native-assets-loading-media-start");
                                            } else {
                                                wh0Var = wh0Var2;
                                            }
                                            m00 m00Var = new m00();
                                            listenableFutureE2.addListener(new zd1(0, listenableFutureE2, new gt(tf0Var, m00Var)), l00.f16613f);
                                            hzVar.q(61, m00Var);
                                            listenableFutureD2 = m00Var;
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            wh0Var = wh0Var2;
                            listenableFutureD2 = zw1.d(new Bundle());
                        }
                    }
                }
                final ListenableFuture listenableFuture4 = listenableFutureD2;
                vu0Var = (vu0) hzVar.f15435d;
                executor2 = (Executor) vu0Var.f21274b;
                jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
                if (jSONArrayOptJSONArray2 == null) {
                    listenableFutureZ = zw1.d(Collections.EMPTY_LIST);
                    listenableFuture2 = listenableFutureB;
                    listenableFutureE2 = listenableFutureE2;
                } else {
                    if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) vu0Var.f21276d, "native-assets-loading-custom-start");
                    }
                    arrayList = new ArrayList();
                    length = jSONArrayOptJSONArray2.length();
                    i11 = 0;
                    while (i11 < length) {
                        int i16 = length;
                        jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                        if (jSONObjectOptJSONObject3 == null) {
                            futureZ = be1.f12743b;
                            jSONArray = jSONArrayOptJSONArray2;
                        } else {
                            jSONArray = jSONArrayOptJSONArray2;
                            strOptString = jSONObjectOptJSONObject3.optString("name");
                            if (strOptString == null) {
                                futureZ = be1.f12743b;
                            } else {
                                i12 = i11;
                                strOptString2 = jSONObjectOptJSONObject3.optString("type");
                                listenableFuture3 = listenableFutureB;
                                if ("string".equals(strOptString2)) {
                                    futureZ = zw1.d(new vf0(strOptString, jSONObjectOptJSONObject3.optString("string_value")));
                                    vu0Var = vu0Var;
                                } else if ("image".equals(strOptString2)) {
                                    tf0 tf0Var5 = (tf0) vu0Var.f21275c;
                                    vu0Var = vu0Var;
                                    futureZ = zw1.z(tf0Var5.b(jSONObjectOptJSONObject3.optJSONObject("image_value"), tf0Var5.f20351h.f14031b, 0), new kq(strOptString, 2), executor2);
                                } else {
                                    vu0Var = vu0Var;
                                    futureZ = be1.f12743b;
                                }
                            }
                            arrayList.add(futureZ);
                            i11 = i12 + 1;
                            length = i16;
                            jSONArrayOptJSONArray2 = jSONArray;
                            listenableFutureB = listenableFuture3;
                            vu0Var = vu0Var;
                        }
                        listenableFuture3 = listenableFutureB;
                        i12 = i11;
                        arrayList.add(futureZ);
                        i11 = i12 + 1;
                        length = i16;
                        jSONArrayOptJSONArray2 = jSONArray;
                        listenableFutureB = listenableFuture3;
                        vu0Var = vu0Var;
                    }
                    listenableFuture2 = listenableFutureB;
                    listenableFutureZ = zw1.z(new pd1(ca1.y(arrayList), true), i6.f15610j, executor2);
                }
                hzVar.q(63, listenableFutureZ);
                if (jSONObject.optBoolean("enable_omid") || (jSONObjectOptJSONObject4 = jSONObject.optJSONObject("omid_settings")) == null) {
                    listenableFutureX2 = be1.f12743b;
                } else {
                    strOptString3 = jSONObjectOptJSONObject4.optString("omid_html");
                    if (TextUtils.isEmpty(strOptString3)) {
                        listenableFutureX2 = be1.f12743b;
                    } else {
                        if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "native-assets-loading-omid-start");
                        }
                        listenableFutureX2 = zw1.x(be1.f12743b, new ft(tf0Var, strOptString3, zyVar, zzbVar2), l00.f16613f);
                        if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
                            v71.j(listenableFutureX2, "NativeAssetsLoader.omidWebView", executor);
                        }
                    }
                }
                hzVar.q(65, listenableFutureX2);
                arrayList2 = new ArrayList();
                final ListenableFuture listenableFuture5 = listenableFuture;
                arrayList2.add(listenableFuture5);
                final ListenableFuture listenableFuture6 = listenableFutureA;
                arrayList2.add(listenableFuture6);
                arrayList2.add(listenableFutureX);
                final ListenableFuture listenableFuture7 = listenableFuture2;
                arrayList2.add(listenableFuture7);
                final ListenableFuture listenableFuture8 = listenableFutureB2;
                arrayList2.add(listenableFuture8);
                final ListenableFuture listenableFuture9 = listenableFutureE;
                arrayList2.add(listenableFuture9);
                final ListenableFuture listenableFuture10 = listenableFutureE2;
                arrayList2.add(listenableFuture10);
                arrayList2.add(listenableFuture4);
                arrayList2.add(listenableFutureZ);
                final zzb zzbVar3 = zzbVar2;
                if (((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue() || jSONObject.optInt("template_id") == 3) {
                    arrayList2.add(listenableFutureX2);
                }
                ca1 ca1VarY = ca1.y(arrayList2);
                final zy zyVar5 = zyVar;
                final ListenableFuture listenableFuture11 = listenableFutureZ;
                final ListenableFuture listenableFuture12 = listenableFutureX2;
                final ListenableFuture listenableFuture13 = listenableFutureX;
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.nf0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        JSONArray jSONArrayOptJSONArray5;
                        List listY;
                        JSONObject jSONObjectOptJSONObject9;
                        hz hzVar2 = hzVar;
                        ListenableFuture listenableFuture14 = listenableFuture5;
                        ListenableFuture listenableFuture15 = listenableFuture6;
                        ListenableFuture listenableFuture16 = listenableFuture8;
                        ListenableFuture listenableFuture17 = listenableFuture7;
                        ListenableFuture listenableFuture18 = listenableFuture9;
                        JSONObject jSONObject2 = jSONObject;
                        ListenableFuture listenableFuture19 = listenableFuture10;
                        ListenableFuture listenableFuture20 = listenableFuture4;
                        ListenableFuture listenableFuture21 = listenableFuture13;
                        ListenableFuture listenableFuture22 = listenableFuture12;
                        ListenableFuture listenableFuture23 = listenableFuture11;
                        if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) hzVar2.f15436e, "rendering-native-assets-loading-end");
                        }
                        je0 je0Var = (je0) listenableFuture14.get();
                        List list = (List) listenableFuture15.get();
                        synchronized (je0Var) {
                            je0Var.f16054e = list;
                        }
                        mo moVar = (mo) listenableFuture16.get();
                        synchronized (je0Var) {
                            je0Var.f16067s = moVar;
                        }
                        mo moVar2 = (mo) listenableFuture17.get();
                        synchronized (je0Var) {
                            je0Var.f16068t = moVar2;
                        }
                        ho hoVar = (ho) listenableFuture18.get();
                        synchronized (je0Var) {
                            je0Var.f16052c = hoVar;
                        }
                        JSONObject jSONObjectOptJSONObject10 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                        if (jSONObjectOptJSONObject10 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject10.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                            aa1 aa1Var = ca1.f13122b;
                            listY = ya1.f22208e;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i17 = 0; i17 < jSONArrayOptJSONArray5.length(); i17++) {
                                zzew zzewVarF = tf0.f(jSONArrayOptJSONArray5.optJSONObject(i17));
                                if (zzewVarF != null) {
                                    arrayList3.add(zzewVarF);
                                }
                            }
                            listY = ca1.y(arrayList3);
                        }
                        synchronized (je0Var) {
                            je0Var.f16055f = listY;
                        }
                        JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                        zzew zzewVarF2 = (jSONObjectOptJSONObject11 == null || (jSONObjectOptJSONObject9 = jSONObjectOptJSONObject11.optJSONObject("default_reason")) == null) ? null : tf0.f(jSONObjectOptJSONObject9);
                        synchronized (je0Var) {
                            je0Var.f16056g = zzewVarF2;
                        }
                        b30 b30Var = (b30) listenableFuture19.get();
                        if (b30Var != null) {
                            synchronized (je0Var) {
                                je0Var.f16058i = b30Var;
                            }
                            View viewZzE = b30Var.zzE();
                            synchronized (je0Var) {
                                je0Var.f16063o = viewZzE;
                            }
                            t30 t30VarZzh = b30Var.zzh();
                            synchronized (je0Var) {
                                je0Var.f16051b = t30VarZzh;
                            }
                        }
                        je0Var.d().putAll((Bundle) listenableFuture20.get());
                        b30 b30Var2 = (b30) listenableFuture21.get();
                        if (b30Var2 != null) {
                            synchronized (je0Var) {
                                je0Var.f16059j = b30Var2;
                            }
                            View viewZzE2 = b30Var2.zzE();
                            synchronized (je0Var) {
                                je0Var.f16064p = viewZzE2;
                            }
                        }
                        if (!((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                            b30 b30Var3 = (b30) listenableFuture22.get();
                            if (b30Var3 != null) {
                                synchronized (je0Var) {
                                    je0Var.f16060k = b30Var3;
                                }
                            }
                        } else {
                            synchronized (je0Var) {
                                je0Var.f16061m = listenableFuture22;
                            }
                            m00 m00Var2 = new m00();
                            synchronized (je0Var) {
                                je0Var.f16062n = m00Var2;
                            }
                        }
                        for (vf0 vf0Var : (List) listenableFuture23.get()) {
                            if (vf0Var.f21158a != 1) {
                                String str5 = vf0Var.f21159b;
                                yn ynVar = vf0Var.f21161d;
                                synchronized (je0Var) {
                                    if (ynVar == null) {
                                        je0Var.f16070v.remove(str5);
                                    } else {
                                        je0Var.f16070v.put(str5, ynVar);
                                    }
                                }
                            } else {
                                je0Var.o(vf0Var.f21159b, vf0Var.f21160c);
                            }
                        }
                        return je0Var;
                    }
                };
                final sd1 sd1Var = new sd1(ca1VarY, false, false);
                sd1Var.f19937p = new rd1(sd1Var, callable, fe1Var);
                sd1Var.v();
                ya1 ya1VarZ = ca1.z(new ListenableFuture[]{listenableFutureB3, sd1Var});
                Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.qn0
                    /* JADX WARN: Code duplicated, block: B:52:0x0934  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v13 */
                    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.ads.ul0, com.google.android.gms.internal.ads.yh0] */
                    /* JADX WARN: Type inference failed for: r3v22 */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        rn0 rn0Var;
                        ?? r3;
                        final int i17;
                        rn0 rn0Var2 = this.f19130a;
                        sd1 sd1Var2 = sd1Var;
                        ListenableFuture listenableFuture14 = listenableFutureB3;
                        ju0 ju0Var2 = ju0Var;
                        du0 du0Var2 = du0Var;
                        JSONObject jSONObject2 = jSONObject;
                        zzb zzbVar4 = zzbVar3;
                        bz bzVar = zyVar5;
                        je0 je0Var = (je0) sd1Var2.get();
                        ng0 ng0Var = (ng0) listenableFuture14.get();
                        ul ulVar = am.V2;
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var2.f19627f, "rendering-webview-creation-end");
                        }
                        pd0 pd0Var = rn0Var2.f19622a;
                        vu0 vu0Var2 = new vu0(ju0Var2, du0Var2, (String) null);
                        so0 so0Var = new so0(je0Var, 21);
                        uw uwVar = new uw(jSONObject2, ng0Var, zzbVar4, bzVar, 6);
                        y40 y40Var = (y40) pd0Var;
                        a50 a50Var = y40Var.f22103b;
                        y40 y40Var2 = y40Var.f22104c;
                        fx1 fx1VarA = fx1.a(new v50(a50Var.H0, 12));
                        t80 t80Var = new t80(vu0Var2, 0);
                        vd0 vd0Var = new vd0(uwVar, 0);
                        g90 g90Var = new g90(fx1.a(new oz(t80Var, vd0Var, 14)), 29);
                        fx1 fx1VarA2 = fx1.a(new e60(g90Var, 11));
                        u40 u40Var = a50Var.f11865h;
                        qd0 qd0Var = ps1.f18800h;
                        fx1 fx1VarA3 = fx1.a(new fz(u40Var, fx1VarA2, qd0Var, 1));
                        fx1 fx1VarA4 = fx1.a(new e70(fx1VarA, fx1.a(new a70(a50Var.f11864g, fx1VarA3, 0)), a50Var.f11856c, fx1.a(new g40(fx1VarA3, fx1VarA, 3)), a50Var.f11862f));
                        fx1 fx1VarA5 = fx1.a(new g40(fx1VarA4, fx1VarA2, 5));
                        fx1 fx1VarA6 = fx1.a(new p60(y40Var2.f22109h, t80Var, 1));
                        fx1 fx1VarA7 = fx1.a(new g90(fx1VarA6, 7));
                        int i18 = lx1.f17149c;
                        ArrayList arrayList3 = new ArrayList(1);
                        ArrayList arrayList4 = new ArrayList(3);
                        arrayList4.add(y40Var2.f22117q);
                        arrayList4.add(y40Var2.f22118r);
                        arrayList4.add(fx1VarA5);
                        arrayList3.add(fx1VarA7);
                        fx1 fx1VarA8 = fx1.a(new ca0(new lx1(arrayList3, arrayList4), 3));
                        fx1 fx1VarA9 = fx1.a(ps1.f18799g);
                        fx1 fx1Var = a50Var.f11856c;
                        fx1 fx1VarA10 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 4));
                        t80 t80Var2 = new t80(vu0Var2, 3);
                        t80 t80Var3 = new t80(vu0Var2, 2);
                        o40 o40Var = a50Var.f11864g;
                        fx1 fx1VarA11 = fx1.a(new v50(o40Var, 24));
                        fx1 fx1VarA12 = fx1.a(rb0.f19504g);
                        fx1 fx1VarA13 = fx1.a(new n60(o40Var, a50Var.F, fx1VarA11, fx1VarA12, a50Var.E0, a50Var.f11858d));
                        fx1 fx1VarA14 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1VarA13, y40Var2.f22106e));
                        qd0 qd0Var2 = new qd0(4);
                        qd0 qd0Var3 = new qd0(2);
                        fx1 fx1VarA15 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 9));
                        fx1 fx1VarA16 = fx1.a(dv.f13735g);
                        wd0 wd0Var = new wd0(fx1VarA16, 2);
                        ArrayList arrayList5 = new ArrayList(2);
                        ArrayList arrayList6 = new ArrayList(1);
                        arrayList6.add(y40Var2.f22123w);
                        arrayList5.add(fx1VarA15);
                        arrayList5.add(wd0Var);
                        fx1 fx1VarA17 = fx1.a(new fz(new lx1(arrayList5, arrayList6), t80Var, t80Var2, 5));
                        fx1 fx1VarA18 = fx1.a(new e60(t80Var2, 8));
                        fx1 fx1VarA19 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, y40Var2.f22113m, fx1VarA14, qd0Var2, qd0Var3, a50Var.J, y40Var2.f22114n, y40Var2.f22106e, y40Var2.f22122v, fx1VarA17, fx1VarA18, y40Var2.f22112k));
                        r40 r40Var = new r40(fx1VarA19, 24);
                        g90 g90Var2 = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
                        ArrayList arrayList7 = new ArrayList(4);
                        ArrayList arrayList8 = new ArrayList(2);
                        arrayList7.add(y40Var2.f22119s);
                        arrayList8.add(y40Var2.f22120t);
                        arrayList8.add(y40Var2.f22121u);
                        arrayList7.add(fx1VarA10);
                        arrayList7.add(r40Var);
                        arrayList7.add(g90Var2);
                        fx1 fx1VarA20 = fx1.a(new ca0(new lx1(arrayList7, arrayList8), 4));
                        fx1 fx1VarA21 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, qd0Var));
                        fx1 fx1VarA22 = fx1.a(new g90(fx1VarA21, 5));
                        fx1 fx1VarA23 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 3));
                        fx1 fx1VarA24 = fx1.a(new g90(fx1.a(new w70(a50Var.f11899z0, y40Var2.f22105d, 1)), 3));
                        r40 r40Var2 = new r40(fx1VarA19, 23);
                        ArrayList arrayList9 = new ArrayList(5);
                        ArrayList arrayList10 = new ArrayList(3);
                        arrayList9.add(y40Var2.f22124x);
                        arrayList9.add(y40Var2.f22125y);
                        arrayList10.add(y40Var2.f22126z);
                        arrayList10.add(y40Var2.A);
                        arrayList9.add(fx1VarA22);
                        arrayList9.add(fx1VarA23);
                        arrayList10.add(fx1VarA24);
                        arrayList9.add(r40Var2);
                        fx1 fx1VarA25 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 0));
                        fx1 fx1VarA26 = fx1.a(new g40(fx1VarA4, fx1VarA2, 4));
                        int i19 = 6;
                        fx1 fx1VarA27 = fx1.a(new g90(fx1VarA21, i19));
                        fx1 fx1Var2 = a50Var.f11856c;
                        fx1 fx1VarA28 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, i19));
                        fx1 fx1VarA29 = fx1.a(new v50(y40Var2.f22108g, 14));
                        r40 r40Var3 = new r40(fx1VarA17, 12);
                        r40 r40Var4 = new r40(fx1VarA19, 26);
                        e60 e60Var = new e60(so0Var, 13);
                        wd0 wd0Var2 = new wd0(fx1.a(new fz(e60Var, g90Var, fx1Var2, 7)), 1);
                        ArrayList arrayList11 = new ArrayList(8);
                        ArrayList arrayList12 = new ArrayList(3);
                        arrayList11.add(y40Var2.B);
                        arrayList11.add(y40Var2.C);
                        arrayList12.add(y40Var2.D);
                        arrayList12.add(y40Var2.E);
                        arrayList12.add(fx1VarA26);
                        arrayList11.add(fx1VarA27);
                        arrayList11.add(fx1VarA28);
                        arrayList11.add(fx1VarA29);
                        arrayList11.add(r40Var3);
                        arrayList11.add(r40Var4);
                        arrayList11.add(wd0Var2);
                        fx1 fx1VarA30 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 2));
                        r40 r40Var5 = new r40(fx1VarA19, 29);
                        ArrayList arrayList13 = new ArrayList(1);
                        ArrayList arrayList14 = new ArrayList(1);
                        arrayList14.add(y40Var2.F);
                        arrayList13.add(r40Var5);
                        fx1 fx1VarA31 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 19));
                        r40 r40Var6 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
                        ArrayList arrayList15 = new ArrayList(1);
                        new ArrayList(1).add(y40Var2.G);
                        arrayList15.add(r40Var6);
                        fx1 fx1VarA32 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 10));
                        ArrayList arrayList16 = new ArrayList(1);
                        ArrayList arrayList17 = new ArrayList(1);
                        arrayList17.add(y40Var2.H);
                        arrayList16.add(fx1VarA32);
                        fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList16, arrayList17), 20));
                        fx1 fx1VarA34 = fx1.a(new g90(fx1VarA6, 8));
                        r40 r40Var7 = new r40(fx1VarA19, 27);
                        ArrayList arrayList18 = new ArrayList(7);
                        ArrayList arrayList19 = new ArrayList(4);
                        arrayList18.add(y40Var2.I);
                        arrayList19.add(y40Var2.J);
                        arrayList18.add(y40Var2.K);
                        arrayList18.add(y40Var2.L);
                        arrayList19.add(y40Var2.M);
                        arrayList19.add(y40Var2.N);
                        arrayList19.add(y40Var2.O);
                        arrayList18.add(y40Var2.P);
                        arrayList18.add(y40Var2.Q);
                        arrayList18.add(fx1VarA34);
                        arrayList18.add(r40Var7);
                        fx1 fx1VarA35 = fx1.a(new ca0(new lx1(arrayList18, arrayList19), 5));
                        g90 g90Var3 = new g90(fx1.a(new r40(fx1VarA20, 11)), 1);
                        fx1 fx1VarA36 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 8));
                        ArrayList arrayList20 = new ArrayList(2);
                        ArrayList arrayList21 = new ArrayList(1);
                        arrayList21.add(y40Var2.S);
                        arrayList20.add(g90Var3);
                        arrayList20.add(fx1VarA36);
                        fx1 fx1VarA37 = fx1.a(new ca0(new lx1(arrayList20, arrayList21), 9));
                        List list = Collections.EMPTY_LIST;
                        new ArrayList(1).add(y40Var2.T);
                        fx1 fx1VarA38 = fx1.a(new g90(fx1VarA21, 4));
                        ArrayList arrayList22 = new ArrayList(1);
                        List list2 = Collections.EMPTY_LIST;
                        arrayList22.add(fx1VarA38);
                        fx1 fx1VarA39 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 5));
                        r40 r40Var8 = new r40(fx1VarA19, 25);
                        ArrayList arrayList23 = new ArrayList(2);
                        new ArrayList(1).add(y40Var2.U);
                        arrayList23.add(fx1VarA39);
                        arrayList23.add(r40Var8);
                        fx1 fx1VarA40 = fx1.a(new g90(fx1VarA21, 0));
                        ArrayList arrayList24 = new ArrayList(1);
                        List list3 = Collections.EMPTY_LIST;
                        arrayList24.add(fx1VarA40);
                        t80 t80Var4 = new t80(vu0Var2, 1);
                        d80 d80Var = new d80(t80Var, t80Var4, y40Var2.f22110i, t80Var3, y40Var2.f22107f);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList26.add(y40Var2.W);
                        arrayList25.add(y40Var2.X);
                        w80 w80Var = new w80(t80Var2, t80Var, fx1VarA8, fx1VarA35, y40Var2.V, d80Var, fx1VarA9, new ca0(new lx1(arrayList25, arrayList26), 6), fx1VarA31, fx1VarA18, a50Var.f11879o0);
                        vd0 vd0Var2 = new vd0(uwVar, 1);
                        fx1 fx1VarA41 = fx1.a(new xe0(vd0Var2, a50Var.f11862f));
                        fx1 fx1VarA42 = fx1.a(new g40(fx1VarA4, fx1VarA2, 6));
                        List list4 = Collections.EMPTY_LIST;
                        ArrayList arrayList27 = new ArrayList(2);
                        arrayList27.add(y40Var2.Y);
                        arrayList27.add(fx1VarA42);
                        lx1 lx1Var = new lx1(list4, arrayList27);
                        fx1 fx1Var3 = y40Var2.f22109h;
                        fx1 fx1VarA43 = fx1.a(new fz(fx1Var3, lx1Var, t80Var, 6));
                        fx1 fx1VarA44 = fx1.a(new vd0(uwVar, 2));
                        fx1 fx1VarA45 = fx1.a(new vd0(uwVar, 3));
                        od0 od0Var = y40Var2.f22111j;
                        fx1 fx1Var4 = a50Var.J;
                        u40 u40Var2 = a50Var.f11865h;
                        z90 z90Var = y40Var2.f22105d;
                        fx1 fx1Var5 = a50Var.f11862f;
                        wd0 wd0Var3 = new wd0(fx1.a(new ud0(fx1Var3, od0Var, vd0Var, vd0Var2, e60Var, fx1Var4, fx1VarA30, fx1VarA25, fx1VarA33, t80Var, u40Var2, z90Var, fx1VarA4, fx1VarA41, fx1Var5, fx1VarA43, a50Var.N, y40Var2.f22106e, a50Var.O, fx1VarA12, a50Var.M0, fx1VarA17, fx1VarA44, fx1VarA45, fx1VarA18)), 0);
                        fx1 fx1VarA46 = fx1.a(new v50(u40Var2, 18));
                        fx1 fx1Var6 = a50Var.f11856c;
                        fx1 fx1VarA47 = fx1.a(new xd0(fx1VarA46, fx1Var6, fx1Var3, fx1Var5, 0));
                        fx1 fx1Var7 = y40Var2.f22115o;
                        l40 l40Var = new l40(fx1Var7, vd0Var2, fx1VarA47, wd0Var3);
                        xe0 xe0Var = new xe0(fx1Var7, vd0Var2);
                        fx1 fx1VarA48 = fx1.a(new e60(new zd0(e60Var, 0), 12));
                        te0 te0Var = new te0(a50Var.F, z90Var, g90Var, e60Var, l40Var, xe0Var, fx1Var6, fx1VarA48);
                        er0 er0Var = new er0();
                        fx1 fx1VarA49 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 1));
                        fx1 fx1VarA50 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 0));
                        fx1 fx1VarA51 = fx1.a(new l40((kx1) t80Var4, (kx1) er0Var, (kx1) e60Var, (kx1) a50Var.f11874m, 8));
                        fx1 fx1VarA52 = fx1.a(new oz(er0Var, e60Var, 16));
                        o40 o40Var2 = a50Var.f11864g;
                        fx1 fx1VarA53 = fx1.a(new l40(o40Var2, e60Var, te0Var, er0Var, 7));
                        er0.a(er0Var, fx1.a(new fe0(w80Var, fx1Var6, e60Var, wd0Var3, te0Var, g90Var, od0Var, fx1VarA49, fx1VarA50, fx1VarA51, fx1VarA52, fx1VarA53, new oe0(o40Var2, z90Var), fx1Var4, u40Var2, o40Var2, fx1VarA48, fx1VarA16, a50Var.N0)));
                        fx1 fx1Var8 = y40Var2.Z;
                        fx1 fx1Var9 = y40Var2.R;
                        fx1 fx1VarA54 = fx1.a(new te0(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, t80Var, t80Var3, fx1VarA13));
                        fx1 fx1VarA55 = fx1.a(new d80(a50Var.f11856c, fx1VarA47, fx1.a(new p60(y40Var2.f22109h, t80Var, 3)), fx1VarA13, fx1VarA18, 6));
                        fx1 fx1VarA56 = fx1.a(new q70(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, fx1VarA33, a50Var.f11874m, a50Var.N, a50Var.L, fx1VarA13));
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            ((p9.b) zzt.zzk()).getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            rn0Var = rn0Var2;
                            wh0 wh0Var3 = rn0Var.f19627f;
                            wh0Var3.c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                            wh0Var3.c(jCurrentTimeMillis, "rendering-configure-webview-start");
                        } else {
                            rn0Var = rn0Var2;
                        }
                        ne0 ne0Var = (ne0) y40Var2.f22101a.f17399b;
                        ic1.h(ne0Var);
                        ic1.h(je0Var);
                        ic1.h(ng0Var);
                        ps psVar = new ps(ne0Var, je0Var, ng0Var, fx1.b(fx1VarA53));
                        if (((ip) psVar.f18789b) != null) {
                            ((ng0) psVar.f18790c).b("/nativeAdCustomClick", psVar);
                        }
                        lg0 lg0Var = (lg0) fx1VarA54.zzb();
                        qa0 qa0Var = lg0Var.f16979b;
                        jg0 jg0Var = ng0Var.f17811a;
                        Objects.requireNonNull(qa0Var);
                        kg0 kg0Var = new kg0(qa0Var, 0);
                        ba0 ba0Var = lg0Var.f16978a;
                        wa0 wa0Var = lg0Var.f16980c;
                        bb0 bb0Var = lg0Var.f16981d;
                        tb0 tb0Var = lg0Var.f16982e;
                        synchronized (jg0Var) {
                            jg0Var.f16087a = ba0Var;
                            jg0Var.f16088b = wa0Var;
                            jg0Var.f16089c = bb0Var;
                            jg0Var.f16090d = tb0Var;
                            jg0Var.f16091e = kg0Var;
                        }
                        du0 du0Var3 = lg0Var.f16983f;
                        fu0 fu0Var2 = lg0Var.f16984g;
                        m60 m60Var = lg0Var.f16985h;
                        synchronized (ng0Var) {
                            try {
                                gd1 gd1Var = ng0Var.f17822m;
                                if (gd1Var == null) {
                                    r3 = 0;
                                } else {
                                    r3 = 0;
                                    try {
                                        uw uwVar2 = new uw(ng0Var, du0Var3, fu0Var2, m60Var, 7, false);
                                        gd1Var.addListener(new zd1(0, gd1Var, uwVar2), ng0Var.f17815e);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ng0Var = ng0Var;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        final yf0 yf0Var = (yf0) fx1VarA55.zzb();
                        b30 b30VarH = je0Var.h();
                        if (b30VarH == null) {
                            yf0Var.getClass();
                        } else {
                            oc0 oc0Var = yf0Var.f22225c;
                            oc0Var.X0(b30VarH.zzE());
                            wf0 wf0Var = new wf0(b30VarH, 1);
                            Executor executor5 = yf0Var.f22223a;
                            oc0Var.P0(wf0Var, executor5);
                            oc0Var.P0(new wf0(b30VarH, 0), executor5);
                            f70 f70Var = yf0Var.f22224b;
                            oc0Var.P0(f70Var, executor5);
                            f70Var.f14297a = b30VarH;
                            g30 g30VarZzP = b30VarH.zzP();
                            if (!((Boolean) zzba.zzc().a(am.Mb)).booleanValue() || g30VarZzP == 0) {
                                i17 = 0;
                            } else {
                                m60 m60Var2 = yf0Var.f22226d;
                                g30VarZzP.e("/click");
                                qc0 qc0Var = g30VarZzP.f14704k;
                                iq iqVar = nq.f17890a;
                                i17 = 0;
                                g30VarZzP.b("/click", new lq(0, qc0Var, m60Var2));
                                g30VarZzP.u0(m60Var2, r3, r3);
                            }
                            b30VarH.D("/trackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                                @Override // com.google.android.gms.internal.ads.oq
                                public final void b(Object obj, Map map) {
                                    switch (i17) {
                                        case 0:
                                            f70 f70Var2 = yf0Var.f22224b;
                                            f70Var2.f14301e = true;
                                            f70Var2.a();
                                            break;
                                        default:
                                            yf0Var.f22224b.f14301e = false;
                                            break;
                                    }
                                }
                            });
                            final int i20 = 1;
                            b30VarH.D("/untrackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                                @Override // com.google.android.gms.internal.ads.oq
                                public final void b(Object obj, Map map) {
                                    switch (i20) {
                                        case 0:
                                            f70 f70Var2 = yf0Var.f22224b;
                                            f70Var2.f14301e = true;
                                            f70Var2.a();
                                            break;
                                        default:
                                            yf0Var.f22224b.f14301e = false;
                                            break;
                                    }
                                }
                            });
                            b30VarH.zzP().A = yf0Var.f22227e;
                        }
                        qg0 qg0Var = (qg0) fx1VarA56.zzb();
                        rg0 rg0Var = rn0Var.f19626e;
                        b30 b30VarI = je0Var.i();
                        qg0Var.getClass();
                        pg0 pg0Var = rg0Var.f19585a;
                        qa0 qa0Var2 = qg0Var.f19063b;
                        Objects.requireNonNull(qa0Var2);
                        kg0 kg0Var2 = new kg0(qa0Var2, 1);
                        ba0 ba0Var2 = qg0Var.f19062a;
                        wa0 wa0Var2 = qg0Var.f19064c;
                        bb0 bb0Var2 = qg0Var.f19065d;
                        tb0 tb0Var2 = qg0Var.f19066e;
                        pc0 pc0Var = qg0Var.f19067f;
                        synchronized (pg0Var) {
                            synchronized (pg0Var) {
                                pg0Var.f16087a = ba0Var2;
                                pg0Var.f16088b = wa0Var2;
                                pg0Var.f16089c = bb0Var2;
                                pg0Var.f16090d = tb0Var2;
                                pg0Var.f16091e = kg0Var2;
                            }
                            if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue() && b30VarI != null && b30VarI.zzP() != null) {
                                g30 g30VarZzP2 = b30VarI.zzP();
                                m60 m60Var3 = qg0Var.f19071j;
                                ul0 ul0Var = qg0Var.f19070i;
                                g30VarZzP2.q0(m60Var3, ul0Var, qg0Var.f19069h);
                                g30VarZzP2.u0(m60Var3, ul0Var, qg0Var.f19068g);
                            }
                            if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                                com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                            }
                            return (ee0) er0Var.zzb();
                        }
                        pg0Var.f18645f = pc0Var;
                        if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue()) {
                            g30 g30VarZzP3 = b30VarI.zzP();
                            m60 m60Var4 = qg0Var.f19071j;
                            ul0 ul0Var2 = qg0Var.f19070i;
                            g30VarZzP3.q0(m60Var4, ul0Var2, qg0Var.f19069h);
                            g30VarZzP3.u0(m60Var4, ul0Var2, qg0Var.f19068g);
                        }
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                        }
                        return (ee0) er0Var.zzb();
                    }
                };
                sd1 sd1Var2 = new sd1(ya1VarZ, true, false);
                sd1Var2.f19937p = new rd1(sd1Var2, callable2, this.f19623b);
                sd1Var2.v();
                return sd1Var2;
            }
            listenableFutureD = tf0Var4.d(jSONObjectZzi, du0Var, fu0Var, zzbVar2, zyVar);
            tf0Var = tf0Var4;
            listenableFutureE2 = listenableFutureD;
            hzVar.q(58, listenableFutureE2);
            int i17 = 3;
            if (((Boolean) zzba.zzc().a(am.Ie)).booleanValue()) {
                wh0Var = wh0Var2;
                listenableFutureD2 = zw1.d(new Bundle());
            } else {
                wh0Var = wh0Var2;
                listenableFutureD2 = zw1.d(new Bundle());
            }
            final ListenableFuture listenableFuture14 = listenableFutureD2;
            vu0Var = (vu0) hzVar.f15435d;
            executor2 = (Executor) vu0Var.f21274b;
            jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
            if (jSONArrayOptJSONArray2 == null) {
                listenableFutureZ = zw1.d(Collections.EMPTY_LIST);
                listenableFuture2 = listenableFutureB;
                listenableFutureE2 = listenableFutureE2;
            } else {
                if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) vu0Var.f21276d, "native-assets-loading-custom-start");
                }
                arrayList = new ArrayList();
                length = jSONArrayOptJSONArray2.length();
                i11 = 0;
                while (i11 < length) {
                    int i18 = length;
                    jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject3 == null) {
                        futureZ = be1.f12743b;
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        strOptString = jSONObjectOptJSONObject3.optString("name");
                        if (strOptString == null) {
                            futureZ = be1.f12743b;
                        } else {
                            i12 = i11;
                            strOptString2 = jSONObjectOptJSONObject3.optString("type");
                            listenableFuture3 = listenableFutureB;
                            if ("string".equals(strOptString2)) {
                                futureZ = zw1.d(new vf0(strOptString, jSONObjectOptJSONObject3.optString("string_value")));
                                vu0Var = vu0Var;
                            } else if ("image".equals(strOptString2)) {
                                tf0 tf0Var6 = (tf0) vu0Var.f21275c;
                                vu0Var = vu0Var;
                                futureZ = zw1.z(tf0Var6.b(jSONObjectOptJSONObject3.optJSONObject("image_value"), tf0Var6.f20351h.f14031b, 0), new kq(strOptString, 2), executor2);
                            } else {
                                vu0Var = vu0Var;
                                futureZ = be1.f12743b;
                            }
                        }
                        arrayList.add(futureZ);
                        i11 = i12 + 1;
                        length = i18;
                        jSONArrayOptJSONArray2 = jSONArray;
                        listenableFutureB = listenableFuture3;
                        vu0Var = vu0Var;
                    }
                    listenableFuture3 = listenableFutureB;
                    i12 = i11;
                    arrayList.add(futureZ);
                    i11 = i12 + 1;
                    length = i18;
                    jSONArrayOptJSONArray2 = jSONArray;
                    listenableFutureB = listenableFuture3;
                    vu0Var = vu0Var;
                }
                listenableFuture2 = listenableFutureB;
                listenableFutureZ = zw1.z(new pd1(ca1.y(arrayList), true), i6.f15610j, executor2);
            }
            hzVar.q(63, listenableFutureZ);
            if (jSONObject.optBoolean("enable_omid")) {
                listenableFutureX2 = be1.f12743b;
            } else {
                strOptString3 = jSONObjectOptJSONObject4.optString("omid_html");
                if (TextUtils.isEmpty(strOptString3)) {
                    listenableFutureX2 = be1.f12743b;
                } else {
                    if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "native-assets-loading-omid-start");
                    }
                    listenableFutureX2 = zw1.x(be1.f12743b, new ft(tf0Var, strOptString3, zyVar, zzbVar2), l00.f16613f);
                    if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
                        v71.j(listenableFutureX2, "NativeAssetsLoader.omidWebView", executor);
                    }
                }
            }
            hzVar.q(65, listenableFutureX2);
            arrayList2 = new ArrayList();
            final ListenableFuture listenableFuture15 = listenableFuture;
            arrayList2.add(listenableFuture15);
            final ListenableFuture listenableFuture16 = listenableFutureA;
            arrayList2.add(listenableFuture16);
            arrayList2.add(listenableFutureX);
            final ListenableFuture listenableFuture17 = listenableFuture2;
            arrayList2.add(listenableFuture17);
            final ListenableFuture listenableFuture18 = listenableFutureB2;
            arrayList2.add(listenableFuture18);
            final ListenableFuture listenableFuture19 = listenableFutureE;
            arrayList2.add(listenableFuture19);
            final ListenableFuture listenableFuture110 = listenableFutureE2;
            arrayList2.add(listenableFuture110);
            arrayList2.add(listenableFuture14);
            arrayList2.add(listenableFutureZ);
            final zzb zzbVar4 = zzbVar2;
            if (((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue()) {
                arrayList2.add(listenableFutureX2);
            } else {
                arrayList2.add(listenableFutureX2);
            }
            ca1 ca1VarY2 = ca1.y(arrayList2);
            final zy zyVar6 = zyVar;
            final ListenableFuture listenableFuture111 = listenableFutureZ;
            final ListenableFuture listenableFuture112 = listenableFutureX2;
            final ListenableFuture listenableFuture113 = listenableFutureX;
            Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.nf0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONArray jSONArrayOptJSONArray5;
                    List listY;
                    JSONObject jSONObjectOptJSONObject9;
                    hz hzVar2 = hzVar;
                    ListenableFuture listenableFuture114 = listenableFuture15;
                    ListenableFuture listenableFuture115 = listenableFuture16;
                    ListenableFuture listenableFuture116 = listenableFuture18;
                    ListenableFuture listenableFuture117 = listenableFuture17;
                    ListenableFuture listenableFuture118 = listenableFuture19;
                    JSONObject jSONObject2 = jSONObject;
                    ListenableFuture listenableFuture119 = listenableFuture110;
                    ListenableFuture listenableFuture20 = listenableFuture14;
                    ListenableFuture listenableFuture21 = listenableFuture113;
                    ListenableFuture listenableFuture22 = listenableFuture112;
                    ListenableFuture listenableFuture23 = listenableFuture111;
                    if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) hzVar2.f15436e, "rendering-native-assets-loading-end");
                    }
                    je0 je0Var = (je0) listenableFuture114.get();
                    List list = (List) listenableFuture115.get();
                    synchronized (je0Var) {
                        je0Var.f16054e = list;
                    }
                    mo moVar = (mo) listenableFuture116.get();
                    synchronized (je0Var) {
                        je0Var.f16067s = moVar;
                    }
                    mo moVar2 = (mo) listenableFuture117.get();
                    synchronized (je0Var) {
                        je0Var.f16068t = moVar2;
                    }
                    ho hoVar = (ho) listenableFuture118.get();
                    synchronized (je0Var) {
                        je0Var.f16052c = hoVar;
                    }
                    JSONObject jSONObjectOptJSONObject10 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    if (jSONObjectOptJSONObject10 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject10.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                        aa1 aa1Var = ca1.f13122b;
                        listY = ya1.f22208e;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i19 = 0; i19 < jSONArrayOptJSONArray5.length(); i19++) {
                            zzew zzewVarF = tf0.f(jSONArrayOptJSONArray5.optJSONObject(i19));
                            if (zzewVarF != null) {
                                arrayList3.add(zzewVarF);
                            }
                        }
                        listY = ca1.y(arrayList3);
                    }
                    synchronized (je0Var) {
                        je0Var.f16055f = listY;
                    }
                    JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    zzew zzewVarF2 = (jSONObjectOptJSONObject11 == null || (jSONObjectOptJSONObject9 = jSONObjectOptJSONObject11.optJSONObject("default_reason")) == null) ? null : tf0.f(jSONObjectOptJSONObject9);
                    synchronized (je0Var) {
                        je0Var.f16056g = zzewVarF2;
                    }
                    b30 b30Var = (b30) listenableFuture119.get();
                    if (b30Var != null) {
                        synchronized (je0Var) {
                            je0Var.f16058i = b30Var;
                        }
                        View viewZzE = b30Var.zzE();
                        synchronized (je0Var) {
                            je0Var.f16063o = viewZzE;
                        }
                        t30 t30VarZzh = b30Var.zzh();
                        synchronized (je0Var) {
                            je0Var.f16051b = t30VarZzh;
                        }
                    }
                    je0Var.d().putAll((Bundle) listenableFuture20.get());
                    b30 b30Var2 = (b30) listenableFuture21.get();
                    if (b30Var2 != null) {
                        synchronized (je0Var) {
                            je0Var.f16059j = b30Var2;
                        }
                        View viewZzE2 = b30Var2.zzE();
                        synchronized (je0Var) {
                            je0Var.f16064p = viewZzE2;
                        }
                    }
                    if (!((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        b30 b30Var3 = (b30) listenableFuture22.get();
                        if (b30Var3 != null) {
                            synchronized (je0Var) {
                                je0Var.f16060k = b30Var3;
                            }
                        }
                    } else {
                        synchronized (je0Var) {
                            je0Var.f16061m = listenableFuture22;
                        }
                        m00 m00Var2 = new m00();
                        synchronized (je0Var) {
                            je0Var.f16062n = m00Var2;
                        }
                    }
                    for (vf0 vf0Var : (List) listenableFuture23.get()) {
                        if (vf0Var.f21158a != 1) {
                            String str5 = vf0Var.f21159b;
                            yn ynVar = vf0Var.f21161d;
                            synchronized (je0Var) {
                                if (ynVar == null) {
                                    je0Var.f16070v.remove(str5);
                                } else {
                                    je0Var.f16070v.put(str5, ynVar);
                                }
                            }
                        } else {
                            je0Var.o(vf0Var.f21159b, vf0Var.f21160c);
                        }
                    }
                    return je0Var;
                }
            };
            final sd1 sd1Var3 = new sd1(ca1VarY2, false, false);
            sd1Var3.f19937p = new rd1(sd1Var3, callable3, fe1Var);
            sd1Var3.v();
            ya1 ya1VarZ2 = ca1.z(new ListenableFuture[]{listenableFutureB3, sd1Var3});
            Callable callable4 = new Callable() { // from class: com.google.android.gms.internal.ads.qn0
                /* JADX WARN: Code duplicated, block: B:52:0x0934  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v13 */
                /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.ads.ul0, com.google.android.gms.internal.ads.yh0] */
                /* JADX WARN: Type inference failed for: r3v22 */
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    rn0 rn0Var;
                    ?? r3;
                    final int i19;
                    rn0 rn0Var2 = this.f19130a;
                    sd1 sd1Var4 = sd1Var3;
                    ListenableFuture listenableFuture114 = listenableFutureB3;
                    ju0 ju0Var2 = ju0Var;
                    du0 du0Var2 = du0Var;
                    JSONObject jSONObject2 = jSONObject;
                    zzb zzbVar5 = zzbVar4;
                    bz bzVar = zyVar6;
                    je0 je0Var = (je0) sd1Var4.get();
                    ng0 ng0Var = (ng0) listenableFuture114.get();
                    ul ulVar = am.V2;
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var2.f19627f, "rendering-webview-creation-end");
                    }
                    pd0 pd0Var = rn0Var2.f19622a;
                    vu0 vu0Var2 = new vu0(ju0Var2, du0Var2, (String) null);
                    so0 so0Var = new so0(je0Var, 21);
                    uw uwVar = new uw(jSONObject2, ng0Var, zzbVar5, bzVar, 6);
                    y40 y40Var = (y40) pd0Var;
                    a50 a50Var = y40Var.f22103b;
                    y40 y40Var2 = y40Var.f22104c;
                    fx1 fx1VarA = fx1.a(new v50(a50Var.H0, 12));
                    t80 t80Var = new t80(vu0Var2, 0);
                    vd0 vd0Var = new vd0(uwVar, 0);
                    g90 g90Var = new g90(fx1.a(new oz(t80Var, vd0Var, 14)), 29);
                    fx1 fx1VarA2 = fx1.a(new e60(g90Var, 11));
                    u40 u40Var = a50Var.f11865h;
                    qd0 qd0Var = ps1.f18800h;
                    fx1 fx1VarA3 = fx1.a(new fz(u40Var, fx1VarA2, qd0Var, 1));
                    fx1 fx1VarA4 = fx1.a(new e70(fx1VarA, fx1.a(new a70(a50Var.f11864g, fx1VarA3, 0)), a50Var.f11856c, fx1.a(new g40(fx1VarA3, fx1VarA, 3)), a50Var.f11862f));
                    fx1 fx1VarA5 = fx1.a(new g40(fx1VarA4, fx1VarA2, 5));
                    fx1 fx1VarA6 = fx1.a(new p60(y40Var2.f22109h, t80Var, 1));
                    fx1 fx1VarA7 = fx1.a(new g90(fx1VarA6, 7));
                    int i110 = lx1.f17149c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(y40Var2.f22117q);
                    arrayList4.add(y40Var2.f22118r);
                    arrayList4.add(fx1VarA5);
                    arrayList3.add(fx1VarA7);
                    fx1 fx1VarA8 = fx1.a(new ca0(new lx1(arrayList3, arrayList4), 3));
                    fx1 fx1VarA9 = fx1.a(ps1.f18799g);
                    fx1 fx1Var = a50Var.f11856c;
                    fx1 fx1VarA10 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 4));
                    t80 t80Var2 = new t80(vu0Var2, 3);
                    t80 t80Var3 = new t80(vu0Var2, 2);
                    o40 o40Var = a50Var.f11864g;
                    fx1 fx1VarA11 = fx1.a(new v50(o40Var, 24));
                    fx1 fx1VarA12 = fx1.a(rb0.f19504g);
                    fx1 fx1VarA13 = fx1.a(new n60(o40Var, a50Var.F, fx1VarA11, fx1VarA12, a50Var.E0, a50Var.f11858d));
                    fx1 fx1VarA14 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1VarA13, y40Var2.f22106e));
                    qd0 qd0Var2 = new qd0(4);
                    qd0 qd0Var3 = new qd0(2);
                    fx1 fx1VarA15 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 9));
                    fx1 fx1VarA16 = fx1.a(dv.f13735g);
                    wd0 wd0Var = new wd0(fx1VarA16, 2);
                    ArrayList arrayList5 = new ArrayList(2);
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(y40Var2.f22123w);
                    arrayList5.add(fx1VarA15);
                    arrayList5.add(wd0Var);
                    fx1 fx1VarA17 = fx1.a(new fz(new lx1(arrayList5, arrayList6), t80Var, t80Var2, 5));
                    fx1 fx1VarA18 = fx1.a(new e60(t80Var2, 8));
                    fx1 fx1VarA19 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, y40Var2.f22113m, fx1VarA14, qd0Var2, qd0Var3, a50Var.J, y40Var2.f22114n, y40Var2.f22106e, y40Var2.f22122v, fx1VarA17, fx1VarA18, y40Var2.f22112k));
                    r40 r40Var = new r40(fx1VarA19, 24);
                    g90 g90Var2 = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
                    ArrayList arrayList7 = new ArrayList(4);
                    ArrayList arrayList8 = new ArrayList(2);
                    arrayList7.add(y40Var2.f22119s);
                    arrayList8.add(y40Var2.f22120t);
                    arrayList8.add(y40Var2.f22121u);
                    arrayList7.add(fx1VarA10);
                    arrayList7.add(r40Var);
                    arrayList7.add(g90Var2);
                    fx1 fx1VarA20 = fx1.a(new ca0(new lx1(arrayList7, arrayList8), 4));
                    fx1 fx1VarA21 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, qd0Var));
                    fx1 fx1VarA22 = fx1.a(new g90(fx1VarA21, 5));
                    fx1 fx1VarA23 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 3));
                    fx1 fx1VarA24 = fx1.a(new g90(fx1.a(new w70(a50Var.f11899z0, y40Var2.f22105d, 1)), 3));
                    r40 r40Var2 = new r40(fx1VarA19, 23);
                    ArrayList arrayList9 = new ArrayList(5);
                    ArrayList arrayList10 = new ArrayList(3);
                    arrayList9.add(y40Var2.f22124x);
                    arrayList9.add(y40Var2.f22125y);
                    arrayList10.add(y40Var2.f22126z);
                    arrayList10.add(y40Var2.A);
                    arrayList9.add(fx1VarA22);
                    arrayList9.add(fx1VarA23);
                    arrayList10.add(fx1VarA24);
                    arrayList9.add(r40Var2);
                    fx1 fx1VarA25 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 0));
                    fx1 fx1VarA26 = fx1.a(new g40(fx1VarA4, fx1VarA2, 4));
                    int i111 = 6;
                    fx1 fx1VarA27 = fx1.a(new g90(fx1VarA21, i111));
                    fx1 fx1Var2 = a50Var.f11856c;
                    fx1 fx1VarA28 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, i111));
                    fx1 fx1VarA29 = fx1.a(new v50(y40Var2.f22108g, 14));
                    r40 r40Var3 = new r40(fx1VarA17, 12);
                    r40 r40Var4 = new r40(fx1VarA19, 26);
                    e60 e60Var = new e60(so0Var, 13);
                    wd0 wd0Var2 = new wd0(fx1.a(new fz(e60Var, g90Var, fx1Var2, 7)), 1);
                    ArrayList arrayList11 = new ArrayList(8);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(y40Var2.B);
                    arrayList11.add(y40Var2.C);
                    arrayList12.add(y40Var2.D);
                    arrayList12.add(y40Var2.E);
                    arrayList12.add(fx1VarA26);
                    arrayList11.add(fx1VarA27);
                    arrayList11.add(fx1VarA28);
                    arrayList11.add(fx1VarA29);
                    arrayList11.add(r40Var3);
                    arrayList11.add(r40Var4);
                    arrayList11.add(wd0Var2);
                    fx1 fx1VarA30 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 2));
                    r40 r40Var5 = new r40(fx1VarA19, 29);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(y40Var2.F);
                    arrayList13.add(r40Var5);
                    fx1 fx1VarA31 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 19));
                    r40 r40Var6 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(y40Var2.G);
                    arrayList15.add(r40Var6);
                    fx1 fx1VarA32 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 10));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(y40Var2.H);
                    arrayList16.add(fx1VarA32);
                    fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList16, arrayList17), 20));
                    fx1 fx1VarA34 = fx1.a(new g90(fx1VarA6, 8));
                    r40 r40Var7 = new r40(fx1VarA19, 27);
                    ArrayList arrayList18 = new ArrayList(7);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(y40Var2.I);
                    arrayList19.add(y40Var2.J);
                    arrayList18.add(y40Var2.K);
                    arrayList18.add(y40Var2.L);
                    arrayList19.add(y40Var2.M);
                    arrayList19.add(y40Var2.N);
                    arrayList19.add(y40Var2.O);
                    arrayList18.add(y40Var2.P);
                    arrayList18.add(y40Var2.Q);
                    arrayList18.add(fx1VarA34);
                    arrayList18.add(r40Var7);
                    fx1 fx1VarA35 = fx1.a(new ca0(new lx1(arrayList18, arrayList19), 5));
                    g90 g90Var3 = new g90(fx1.a(new r40(fx1VarA20, 11)), 1);
                    fx1 fx1VarA36 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 8));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(y40Var2.S);
                    arrayList20.add(g90Var3);
                    arrayList20.add(fx1VarA36);
                    fx1 fx1VarA37 = fx1.a(new ca0(new lx1(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(y40Var2.T);
                    fx1 fx1VarA38 = fx1.a(new g90(fx1VarA21, 4));
                    ArrayList arrayList22 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList22.add(fx1VarA38);
                    fx1 fx1VarA39 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 5));
                    r40 r40Var8 = new r40(fx1VarA19, 25);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(y40Var2.U);
                    arrayList23.add(fx1VarA39);
                    arrayList23.add(r40Var8);
                    fx1 fx1VarA40 = fx1.a(new g90(fx1VarA21, 0));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(fx1VarA40);
                    t80 t80Var4 = new t80(vu0Var2, 1);
                    d80 d80Var = new d80(t80Var, t80Var4, y40Var2.f22110i, t80Var3, y40Var2.f22107f);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(y40Var2.W);
                    arrayList25.add(y40Var2.X);
                    w80 w80Var = new w80(t80Var2, t80Var, fx1VarA8, fx1VarA35, y40Var2.V, d80Var, fx1VarA9, new ca0(new lx1(arrayList25, arrayList26), 6), fx1VarA31, fx1VarA18, a50Var.f11879o0);
                    vd0 vd0Var2 = new vd0(uwVar, 1);
                    fx1 fx1VarA41 = fx1.a(new xe0(vd0Var2, a50Var.f11862f));
                    fx1 fx1VarA42 = fx1.a(new g40(fx1VarA4, fx1VarA2, 6));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(y40Var2.Y);
                    arrayList27.add(fx1VarA42);
                    lx1 lx1Var = new lx1(list4, arrayList27);
                    fx1 fx1Var3 = y40Var2.f22109h;
                    fx1 fx1VarA43 = fx1.a(new fz(fx1Var3, lx1Var, t80Var, 6));
                    fx1 fx1VarA44 = fx1.a(new vd0(uwVar, 2));
                    fx1 fx1VarA45 = fx1.a(new vd0(uwVar, 3));
                    od0 od0Var = y40Var2.f22111j;
                    fx1 fx1Var4 = a50Var.J;
                    u40 u40Var2 = a50Var.f11865h;
                    z90 z90Var = y40Var2.f22105d;
                    fx1 fx1Var5 = a50Var.f11862f;
                    wd0 wd0Var3 = new wd0(fx1.a(new ud0(fx1Var3, od0Var, vd0Var, vd0Var2, e60Var, fx1Var4, fx1VarA30, fx1VarA25, fx1VarA33, t80Var, u40Var2, z90Var, fx1VarA4, fx1VarA41, fx1Var5, fx1VarA43, a50Var.N, y40Var2.f22106e, a50Var.O, fx1VarA12, a50Var.M0, fx1VarA17, fx1VarA44, fx1VarA45, fx1VarA18)), 0);
                    fx1 fx1VarA46 = fx1.a(new v50(u40Var2, 18));
                    fx1 fx1Var6 = a50Var.f11856c;
                    fx1 fx1VarA47 = fx1.a(new xd0(fx1VarA46, fx1Var6, fx1Var3, fx1Var5, 0));
                    fx1 fx1Var7 = y40Var2.f22115o;
                    l40 l40Var = new l40(fx1Var7, vd0Var2, fx1VarA47, wd0Var3);
                    xe0 xe0Var = new xe0(fx1Var7, vd0Var2);
                    fx1 fx1VarA48 = fx1.a(new e60(new zd0(e60Var, 0), 12));
                    te0 te0Var = new te0(a50Var.F, z90Var, g90Var, e60Var, l40Var, xe0Var, fx1Var6, fx1VarA48);
                    er0 er0Var = new er0();
                    fx1 fx1VarA49 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 1));
                    fx1 fx1VarA50 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 0));
                    fx1 fx1VarA51 = fx1.a(new l40((kx1) t80Var4, (kx1) er0Var, (kx1) e60Var, (kx1) a50Var.f11874m, 8));
                    fx1 fx1VarA52 = fx1.a(new oz(er0Var, e60Var, 16));
                    o40 o40Var2 = a50Var.f11864g;
                    fx1 fx1VarA53 = fx1.a(new l40(o40Var2, e60Var, te0Var, er0Var, 7));
                    er0.a(er0Var, fx1.a(new fe0(w80Var, fx1Var6, e60Var, wd0Var3, te0Var, g90Var, od0Var, fx1VarA49, fx1VarA50, fx1VarA51, fx1VarA52, fx1VarA53, new oe0(o40Var2, z90Var), fx1Var4, u40Var2, o40Var2, fx1VarA48, fx1VarA16, a50Var.N0)));
                    fx1 fx1Var8 = y40Var2.Z;
                    fx1 fx1Var9 = y40Var2.R;
                    fx1 fx1VarA54 = fx1.a(new te0(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, t80Var, t80Var3, fx1VarA13));
                    fx1 fx1VarA55 = fx1.a(new d80(a50Var.f11856c, fx1VarA47, fx1.a(new p60(y40Var2.f22109h, t80Var, 3)), fx1VarA13, fx1VarA18, 6));
                    fx1 fx1VarA56 = fx1.a(new q70(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, fx1VarA33, a50Var.f11874m, a50Var.N, a50Var.L, fx1VarA13));
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        ((p9.b) zzt.zzk()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        rn0Var = rn0Var2;
                        wh0 wh0Var3 = rn0Var.f19627f;
                        wh0Var3.c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                        wh0Var3.c(jCurrentTimeMillis, "rendering-configure-webview-start");
                    } else {
                        rn0Var = rn0Var2;
                    }
                    ne0 ne0Var = (ne0) y40Var2.f22101a.f17399b;
                    ic1.h(ne0Var);
                    ic1.h(je0Var);
                    ic1.h(ng0Var);
                    ps psVar = new ps(ne0Var, je0Var, ng0Var, fx1.b(fx1VarA53));
                    if (((ip) psVar.f18789b) != null) {
                        ((ng0) psVar.f18790c).b("/nativeAdCustomClick", psVar);
                    }
                    lg0 lg0Var = (lg0) fx1VarA54.zzb();
                    qa0 qa0Var = lg0Var.f16979b;
                    jg0 jg0Var = ng0Var.f17811a;
                    Objects.requireNonNull(qa0Var);
                    kg0 kg0Var = new kg0(qa0Var, 0);
                    ba0 ba0Var = lg0Var.f16978a;
                    wa0 wa0Var = lg0Var.f16980c;
                    bb0 bb0Var = lg0Var.f16981d;
                    tb0 tb0Var = lg0Var.f16982e;
                    synchronized (jg0Var) {
                        jg0Var.f16087a = ba0Var;
                        jg0Var.f16088b = wa0Var;
                        jg0Var.f16089c = bb0Var;
                        jg0Var.f16090d = tb0Var;
                        jg0Var.f16091e = kg0Var;
                    }
                    du0 du0Var3 = lg0Var.f16983f;
                    fu0 fu0Var2 = lg0Var.f16984g;
                    m60 m60Var = lg0Var.f16985h;
                    synchronized (ng0Var) {
                        try {
                            gd1 gd1Var = ng0Var.f17822m;
                            if (gd1Var == null) {
                                r3 = 0;
                            } else {
                                r3 = 0;
                                try {
                                    uw uwVar2 = new uw(ng0Var, du0Var3, fu0Var2, m60Var, 7, false);
                                    gd1Var.addListener(new zd1(0, gd1Var, uwVar2), ng0Var.f17815e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    ng0Var = ng0Var;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    final yf0 yf0Var = (yf0) fx1VarA55.zzb();
                    b30 b30VarH = je0Var.h();
                    if (b30VarH == null) {
                        yf0Var.getClass();
                    } else {
                        oc0 oc0Var = yf0Var.f22225c;
                        oc0Var.X0(b30VarH.zzE());
                        wf0 wf0Var = new wf0(b30VarH, 1);
                        Executor executor5 = yf0Var.f22223a;
                        oc0Var.P0(wf0Var, executor5);
                        oc0Var.P0(new wf0(b30VarH, 0), executor5);
                        f70 f70Var = yf0Var.f22224b;
                        oc0Var.P0(f70Var, executor5);
                        f70Var.f14297a = b30VarH;
                        g30 g30VarZzP = b30VarH.zzP();
                        if (!((Boolean) zzba.zzc().a(am.Mb)).booleanValue() || g30VarZzP == 0) {
                            i19 = 0;
                        } else {
                            m60 m60Var2 = yf0Var.f22226d;
                            g30VarZzP.e("/click");
                            qc0 qc0Var = g30VarZzP.f14704k;
                            iq iqVar = nq.f17890a;
                            i19 = 0;
                            g30VarZzP.b("/click", new lq(0, qc0Var, m60Var2));
                            g30VarZzP.u0(m60Var2, r3, r3);
                        }
                        b30VarH.D("/trackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                            @Override // com.google.android.gms.internal.ads.oq
                            public final void b(Object obj, Map map) {
                                switch (i19) {
                                    case 0:
                                        f70 f70Var2 = yf0Var.f22224b;
                                        f70Var2.f14301e = true;
                                        f70Var2.a();
                                        break;
                                    default:
                                        yf0Var.f22224b.f14301e = false;
                                        break;
                                }
                            }
                        });
                        final int i20 = 1;
                        b30VarH.D("/untrackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                            @Override // com.google.android.gms.internal.ads.oq
                            public final void b(Object obj, Map map) {
                                switch (i20) {
                                    case 0:
                                        f70 f70Var2 = yf0Var.f22224b;
                                        f70Var2.f14301e = true;
                                        f70Var2.a();
                                        break;
                                    default:
                                        yf0Var.f22224b.f14301e = false;
                                        break;
                                }
                            }
                        });
                        b30VarH.zzP().A = yf0Var.f22227e;
                    }
                    qg0 qg0Var = (qg0) fx1VarA56.zzb();
                    rg0 rg0Var = rn0Var.f19626e;
                    b30 b30VarI = je0Var.i();
                    qg0Var.getClass();
                    pg0 pg0Var = rg0Var.f19585a;
                    qa0 qa0Var2 = qg0Var.f19063b;
                    Objects.requireNonNull(qa0Var2);
                    kg0 kg0Var2 = new kg0(qa0Var2, 1);
                    ba0 ba0Var2 = qg0Var.f19062a;
                    wa0 wa0Var2 = qg0Var.f19064c;
                    bb0 bb0Var2 = qg0Var.f19065d;
                    tb0 tb0Var2 = qg0Var.f19066e;
                    pc0 pc0Var = qg0Var.f19067f;
                    synchronized (pg0Var) {
                        synchronized (pg0Var) {
                            pg0Var.f16087a = ba0Var2;
                            pg0Var.f16088b = wa0Var2;
                            pg0Var.f16089c = bb0Var2;
                            pg0Var.f16090d = tb0Var2;
                            pg0Var.f16091e = kg0Var2;
                        }
                        if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue() && b30VarI != null && b30VarI.zzP() != null) {
                            g30 g30VarZzP3 = b30VarI.zzP();
                            m60 m60Var4 = qg0Var.f19071j;
                            ul0 ul0Var2 = qg0Var.f19070i;
                            g30VarZzP3.q0(m60Var4, ul0Var2, qg0Var.f19069h);
                            g30VarZzP3.u0(m60Var4, ul0Var2, qg0Var.f19068g);
                        }
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                        }
                        return (ee0) er0Var.zzb();
                    }
                    pg0Var.f18645f = pc0Var;
                    if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue()) {
                        g30 g30VarZzP4 = b30VarI.zzP();
                        m60 m60Var5 = qg0Var.f19071j;
                        ul0 ul0Var3 = qg0Var.f19070i;
                        g30VarZzP4.q0(m60Var5, ul0Var3, qg0Var.f19069h);
                        g30VarZzP4.u0(m60Var5, ul0Var3, qg0Var.f19068g);
                    }
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                    }
                    return (ee0) er0Var.zzb();
                }
            };
            sd1 sd1Var4 = new sd1(ya1VarZ2, true, false);
            sd1Var4.f19937p = new rd1(sd1Var4, callable4, this.f19623b);
            sd1Var4.v();
            return sd1Var4;
        }
        listenableFutureX = be1.f12743b;
        listenableFutureA = listenableFutureA;
        listenableFuture = listenableFutureB4;
        wh0Var2 = wh0Var2;
        str4 = "images";
        fu0Var = fu0Var;
        zzbVar2 = zzbVar2;
        zyVar = zyVar;
        tf0Var4 = tf0Var4;
        executor = executor3;
        str = "html";
        hzVar.q(50, listenableFutureX);
        listenableFutureB = tf0Var4.b(jSONObject.optJSONObject("secondary_image"), eoVar.f14031b, 51);
        hzVar.q(52, listenableFutureB);
        listenableFutureB2 = tf0Var4.b(jSONObject.optJSONObject("app_icon"), eoVar.f14031b, 53);
        hzVar.q(54, listenableFutureB2);
        jSONObjectOptJSONObject = jSONObject.optJSONObject(Y3.f27960c);
        if (jSONObjectOptJSONObject == null) {
            listenableFutureE = be1.f12743b;
        } else {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str4);
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
            }
            listenableFutureE = tf0Var4.e("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zw1.z(tf0Var4.a(jSONArrayOptJSONArray, false, true, 55), new jt(1, tf0Var4, jSONObjectOptJSONObject), executor));
        }
        hzVar.q(56, listenableFutureE);
        jSONObjectZzi = zzbp.zzi(jSONObject, "html_containers", "instream");
        str2 = "video";
        if (jSONObjectZzi == null) {
            jSONObjectOptJSONObject5 = jSONObject.optJSONObject("video");
            if (jSONObjectOptJSONObject5 == null) {
                listenableFutureE = listenableFutureE;
                str2 = "video";
                zzbVar2 = zzbVar2;
                listenableFutureB2 = listenableFutureB2;
                tf0Var = tf0Var4;
                listenableFutureE2 = be1.f12743b;
                zyVar = zyVar;
            } else {
                strOptString4 = jSONObjectOptJSONObject5.optString("vast_xml");
                tf0Var2 = tf0Var4;
                if (((Boolean) zzba.zzc().a(am.Fb)).booleanValue()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (TextUtils.isEmpty(strOptString4)) {
                }
                if (z10) {
                    tf0Var3 = tf0Var2;
                    fd1VarX = tf0Var3.d(jSONObjectOptJSONObject5, du0Var, fu0Var, zzbVar2, zyVar);
                    listenableFutureB2 = listenableFutureB2;
                } else {
                    tf0Var3 = tf0Var2;
                    bg0Var = tf0Var3.f20352i;
                    bg0Var.getClass();
                    if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), bg0Var.f12773i, "native-assets-loading-video-start");
                    }
                    be1 be1Var4 = be1.f12743b;
                    q80 q80Var2 = new q80(bg0Var, zzbVar2, zyVar, 1);
                    Executor executor5 = bg0Var.f12766b;
                    fd1VarX = zw1.x(zw1.x(be1Var4, q80Var2, executor5), new ht(4, bg0Var, jSONObjectOptJSONObject5), executor5);
                }
                ListenableFuture listenableFutureV2 = zw1.v(fd1VarX, ((Integer) zzba.zzc().a(am.P4)).intValue(), TimeUnit.SECONDS, tf0Var3.f20354k);
                if (true != z10) {
                    str3 = "NativeAssetsLoader.loadVideoView";
                } else {
                    str3 = "NativeAssetsLoader.loadVideoHtml";
                }
                tf0Var = tf0Var3;
                listenableFutureE2 = tf0Var3.e(str3, false, listenableFutureV2);
                zyVar = zyVar;
                zzbVar2 = zzbVar2;
            }
            hzVar.q(58, listenableFutureE2);
            int i19 = 3;
            if (((Boolean) zzba.zzc().a(am.Ie)).booleanValue()) {
                wh0Var = wh0Var2;
                listenableFutureD2 = zw1.d(new Bundle());
            } else {
                wh0Var = wh0Var2;
                listenableFutureD2 = zw1.d(new Bundle());
            }
            final ListenableFuture listenableFuture114 = listenableFutureD2;
            vu0Var = (vu0) hzVar.f15435d;
            executor2 = (Executor) vu0Var.f21274b;
            jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
            if (jSONArrayOptJSONArray2 == null) {
                listenableFutureZ = zw1.d(Collections.EMPTY_LIST);
                listenableFuture2 = listenableFutureB;
                listenableFutureE2 = listenableFutureE2;
            } else {
                if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) vu0Var.f21276d, "native-assets-loading-custom-start");
                }
                arrayList = new ArrayList();
                length = jSONArrayOptJSONArray2.length();
                i11 = 0;
                while (i11 < length) {
                    int i110 = length;
                    jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject3 == null) {
                        futureZ = be1.f12743b;
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        strOptString = jSONObjectOptJSONObject3.optString("name");
                        if (strOptString == null) {
                            futureZ = be1.f12743b;
                        } else {
                            i12 = i11;
                            strOptString2 = jSONObjectOptJSONObject3.optString("type");
                            listenableFuture3 = listenableFutureB;
                            if ("string".equals(strOptString2)) {
                                futureZ = zw1.d(new vf0(strOptString, jSONObjectOptJSONObject3.optString("string_value")));
                                vu0Var = vu0Var;
                            } else if ("image".equals(strOptString2)) {
                                tf0 tf0Var7 = (tf0) vu0Var.f21275c;
                                vu0Var = vu0Var;
                                futureZ = zw1.z(tf0Var7.b(jSONObjectOptJSONObject3.optJSONObject("image_value"), tf0Var7.f20351h.f14031b, 0), new kq(strOptString, 2), executor2);
                            } else {
                                vu0Var = vu0Var;
                                futureZ = be1.f12743b;
                            }
                        }
                        arrayList.add(futureZ);
                        i11 = i12 + 1;
                        length = i110;
                        jSONArrayOptJSONArray2 = jSONArray;
                        listenableFutureB = listenableFuture3;
                        vu0Var = vu0Var;
                    }
                    listenableFuture3 = listenableFutureB;
                    i12 = i11;
                    arrayList.add(futureZ);
                    i11 = i12 + 1;
                    length = i110;
                    jSONArrayOptJSONArray2 = jSONArray;
                    listenableFutureB = listenableFuture3;
                    vu0Var = vu0Var;
                }
                listenableFuture2 = listenableFutureB;
                listenableFutureZ = zw1.z(new pd1(ca1.y(arrayList), true), i6.f15610j, executor2);
            }
            hzVar.q(63, listenableFutureZ);
            if (jSONObject.optBoolean("enable_omid")) {
                listenableFutureX2 = be1.f12743b;
            } else {
                strOptString3 = jSONObjectOptJSONObject4.optString("omid_html");
                if (TextUtils.isEmpty(strOptString3)) {
                    listenableFutureX2 = be1.f12743b;
                } else {
                    if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "native-assets-loading-omid-start");
                    }
                    listenableFutureX2 = zw1.x(be1.f12743b, new ft(tf0Var, strOptString3, zyVar, zzbVar2), l00.f16613f);
                    if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
                        v71.j(listenableFutureX2, "NativeAssetsLoader.omidWebView", executor);
                    }
                }
            }
            hzVar.q(65, listenableFutureX2);
            arrayList2 = new ArrayList();
            final ListenableFuture listenableFuture115 = listenableFuture;
            arrayList2.add(listenableFuture115);
            final ListenableFuture listenableFuture116 = listenableFutureA;
            arrayList2.add(listenableFuture116);
            arrayList2.add(listenableFutureX);
            final ListenableFuture listenableFuture117 = listenableFuture2;
            arrayList2.add(listenableFuture117);
            final ListenableFuture listenableFuture118 = listenableFutureB2;
            arrayList2.add(listenableFuture118);
            final ListenableFuture listenableFuture119 = listenableFutureE;
            arrayList2.add(listenableFuture119);
            final ListenableFuture listenableFuture1110 = listenableFutureE2;
            arrayList2.add(listenableFuture1110);
            arrayList2.add(listenableFuture114);
            arrayList2.add(listenableFutureZ);
            final zzb zzbVar5 = zzbVar2;
            if (((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue()) {
                arrayList2.add(listenableFutureX2);
            } else {
                arrayList2.add(listenableFutureX2);
            }
            ca1 ca1VarY3 = ca1.y(arrayList2);
            final zy zyVar7 = zyVar;
            final ListenableFuture listenableFuture1111 = listenableFutureZ;
            final ListenableFuture listenableFuture1112 = listenableFutureX2;
            final ListenableFuture listenableFuture1113 = listenableFutureX;
            Callable callable5 = new Callable() { // from class: com.google.android.gms.internal.ads.nf0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONArray jSONArrayOptJSONArray5;
                    List listY;
                    JSONObject jSONObjectOptJSONObject9;
                    hz hzVar2 = hzVar;
                    ListenableFuture listenableFuture1114 = listenableFuture115;
                    ListenableFuture listenableFuture1115 = listenableFuture116;
                    ListenableFuture listenableFuture1116 = listenableFuture118;
                    ListenableFuture listenableFuture1117 = listenableFuture117;
                    ListenableFuture listenableFuture1118 = listenableFuture119;
                    JSONObject jSONObject2 = jSONObject;
                    ListenableFuture listenableFuture1119 = listenableFuture1110;
                    ListenableFuture listenableFuture20 = listenableFuture114;
                    ListenableFuture listenableFuture21 = listenableFuture1113;
                    ListenableFuture listenableFuture22 = listenableFuture1112;
                    ListenableFuture listenableFuture23 = listenableFuture1111;
                    if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) hzVar2.f15436e, "rendering-native-assets-loading-end");
                    }
                    je0 je0Var = (je0) listenableFuture1114.get();
                    List list = (List) listenableFuture1115.get();
                    synchronized (je0Var) {
                        je0Var.f16054e = list;
                    }
                    mo moVar = (mo) listenableFuture1116.get();
                    synchronized (je0Var) {
                        je0Var.f16067s = moVar;
                    }
                    mo moVar2 = (mo) listenableFuture1117.get();
                    synchronized (je0Var) {
                        je0Var.f16068t = moVar2;
                    }
                    ho hoVar = (ho) listenableFuture1118.get();
                    synchronized (je0Var) {
                        je0Var.f16052c = hoVar;
                    }
                    JSONObject jSONObjectOptJSONObject10 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    if (jSONObjectOptJSONObject10 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject10.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                        aa1 aa1Var = ca1.f13122b;
                        listY = ya1.f22208e;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i111 = 0; i111 < jSONArrayOptJSONArray5.length(); i111++) {
                            zzew zzewVarF = tf0.f(jSONArrayOptJSONArray5.optJSONObject(i111));
                            if (zzewVarF != null) {
                                arrayList3.add(zzewVarF);
                            }
                        }
                        listY = ca1.y(arrayList3);
                    }
                    synchronized (je0Var) {
                        je0Var.f16055f = listY;
                    }
                    JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                    zzew zzewVarF2 = (jSONObjectOptJSONObject11 == null || (jSONObjectOptJSONObject9 = jSONObjectOptJSONObject11.optJSONObject("default_reason")) == null) ? null : tf0.f(jSONObjectOptJSONObject9);
                    synchronized (je0Var) {
                        je0Var.f16056g = zzewVarF2;
                    }
                    b30 b30Var = (b30) listenableFuture1119.get();
                    if (b30Var != null) {
                        synchronized (je0Var) {
                            je0Var.f16058i = b30Var;
                        }
                        View viewZzE = b30Var.zzE();
                        synchronized (je0Var) {
                            je0Var.f16063o = viewZzE;
                        }
                        t30 t30VarZzh = b30Var.zzh();
                        synchronized (je0Var) {
                            je0Var.f16051b = t30VarZzh;
                        }
                    }
                    je0Var.d().putAll((Bundle) listenableFuture20.get());
                    b30 b30Var2 = (b30) listenableFuture21.get();
                    if (b30Var2 != null) {
                        synchronized (je0Var) {
                            je0Var.f16059j = b30Var2;
                        }
                        View viewZzE2 = b30Var2.zzE();
                        synchronized (je0Var) {
                            je0Var.f16064p = viewZzE2;
                        }
                    }
                    if (!((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        b30 b30Var3 = (b30) listenableFuture22.get();
                        if (b30Var3 != null) {
                            synchronized (je0Var) {
                                je0Var.f16060k = b30Var3;
                            }
                        }
                    } else {
                        synchronized (je0Var) {
                            je0Var.f16061m = listenableFuture22;
                        }
                        m00 m00Var2 = new m00();
                        synchronized (je0Var) {
                            je0Var.f16062n = m00Var2;
                        }
                    }
                    for (vf0 vf0Var : (List) listenableFuture23.get()) {
                        if (vf0Var.f21158a != 1) {
                            String str5 = vf0Var.f21159b;
                            yn ynVar = vf0Var.f21161d;
                            synchronized (je0Var) {
                                if (ynVar == null) {
                                    je0Var.f16070v.remove(str5);
                                } else {
                                    je0Var.f16070v.put(str5, ynVar);
                                }
                            }
                        } else {
                            je0Var.o(vf0Var.f21159b, vf0Var.f21160c);
                        }
                    }
                    return je0Var;
                }
            };
            final sd1 sd1Var5 = new sd1(ca1VarY3, false, false);
            sd1Var5.f19937p = new rd1(sd1Var5, callable5, fe1Var);
            sd1Var5.v();
            ya1 ya1VarZ3 = ca1.z(new ListenableFuture[]{listenableFutureB3, sd1Var5});
            Callable callable6 = new Callable() { // from class: com.google.android.gms.internal.ads.qn0
                /* JADX WARN: Code duplicated, block: B:52:0x0934  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v13 */
                /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.ads.ul0, com.google.android.gms.internal.ads.yh0] */
                /* JADX WARN: Type inference failed for: r3v22 */
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    rn0 rn0Var;
                    ?? r3;
                    final int i111;
                    rn0 rn0Var2 = this.f19130a;
                    sd1 sd1Var6 = sd1Var5;
                    ListenableFuture listenableFuture1114 = listenableFutureB3;
                    ju0 ju0Var2 = ju0Var;
                    du0 du0Var2 = du0Var;
                    JSONObject jSONObject2 = jSONObject;
                    zzb zzbVar6 = zzbVar5;
                    bz bzVar = zyVar7;
                    je0 je0Var = (je0) sd1Var6.get();
                    ng0 ng0Var = (ng0) listenableFuture1114.get();
                    ul ulVar = am.V2;
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var2.f19627f, "rendering-webview-creation-end");
                    }
                    pd0 pd0Var = rn0Var2.f19622a;
                    vu0 vu0Var2 = new vu0(ju0Var2, du0Var2, (String) null);
                    so0 so0Var = new so0(je0Var, 21);
                    uw uwVar = new uw(jSONObject2, ng0Var, zzbVar6, bzVar, 6);
                    y40 y40Var = (y40) pd0Var;
                    a50 a50Var = y40Var.f22103b;
                    y40 y40Var2 = y40Var.f22104c;
                    fx1 fx1VarA = fx1.a(new v50(a50Var.H0, 12));
                    t80 t80Var = new t80(vu0Var2, 0);
                    vd0 vd0Var = new vd0(uwVar, 0);
                    g90 g90Var = new g90(fx1.a(new oz(t80Var, vd0Var, 14)), 29);
                    fx1 fx1VarA2 = fx1.a(new e60(g90Var, 11));
                    u40 u40Var = a50Var.f11865h;
                    qd0 qd0Var = ps1.f18800h;
                    fx1 fx1VarA3 = fx1.a(new fz(u40Var, fx1VarA2, qd0Var, 1));
                    fx1 fx1VarA4 = fx1.a(new e70(fx1VarA, fx1.a(new a70(a50Var.f11864g, fx1VarA3, 0)), a50Var.f11856c, fx1.a(new g40(fx1VarA3, fx1VarA, 3)), a50Var.f11862f));
                    fx1 fx1VarA5 = fx1.a(new g40(fx1VarA4, fx1VarA2, 5));
                    fx1 fx1VarA6 = fx1.a(new p60(y40Var2.f22109h, t80Var, 1));
                    fx1 fx1VarA7 = fx1.a(new g90(fx1VarA6, 7));
                    int i112 = lx1.f17149c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(y40Var2.f22117q);
                    arrayList4.add(y40Var2.f22118r);
                    arrayList4.add(fx1VarA5);
                    arrayList3.add(fx1VarA7);
                    fx1 fx1VarA8 = fx1.a(new ca0(new lx1(arrayList3, arrayList4), 3));
                    fx1 fx1VarA9 = fx1.a(ps1.f18799g);
                    fx1 fx1Var = a50Var.f11856c;
                    fx1 fx1VarA10 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 4));
                    t80 t80Var2 = new t80(vu0Var2, 3);
                    t80 t80Var3 = new t80(vu0Var2, 2);
                    o40 o40Var = a50Var.f11864g;
                    fx1 fx1VarA11 = fx1.a(new v50(o40Var, 24));
                    fx1 fx1VarA12 = fx1.a(rb0.f19504g);
                    fx1 fx1VarA13 = fx1.a(new n60(o40Var, a50Var.F, fx1VarA11, fx1VarA12, a50Var.E0, a50Var.f11858d));
                    fx1 fx1VarA14 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1VarA13, y40Var2.f22106e));
                    qd0 qd0Var2 = new qd0(4);
                    qd0 qd0Var3 = new qd0(2);
                    fx1 fx1VarA15 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 9));
                    fx1 fx1VarA16 = fx1.a(dv.f13735g);
                    wd0 wd0Var = new wd0(fx1VarA16, 2);
                    ArrayList arrayList5 = new ArrayList(2);
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(y40Var2.f22123w);
                    arrayList5.add(fx1VarA15);
                    arrayList5.add(wd0Var);
                    fx1 fx1VarA17 = fx1.a(new fz(new lx1(arrayList5, arrayList6), t80Var, t80Var2, 5));
                    fx1 fx1VarA18 = fx1.a(new e60(t80Var2, 8));
                    fx1 fx1VarA19 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, y40Var2.f22113m, fx1VarA14, qd0Var2, qd0Var3, a50Var.J, y40Var2.f22114n, y40Var2.f22106e, y40Var2.f22122v, fx1VarA17, fx1VarA18, y40Var2.f22112k));
                    r40 r40Var = new r40(fx1VarA19, 24);
                    g90 g90Var2 = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
                    ArrayList arrayList7 = new ArrayList(4);
                    ArrayList arrayList8 = new ArrayList(2);
                    arrayList7.add(y40Var2.f22119s);
                    arrayList8.add(y40Var2.f22120t);
                    arrayList8.add(y40Var2.f22121u);
                    arrayList7.add(fx1VarA10);
                    arrayList7.add(r40Var);
                    arrayList7.add(g90Var2);
                    fx1 fx1VarA20 = fx1.a(new ca0(new lx1(arrayList7, arrayList8), 4));
                    fx1 fx1VarA21 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, qd0Var));
                    fx1 fx1VarA22 = fx1.a(new g90(fx1VarA21, 5));
                    fx1 fx1VarA23 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 3));
                    fx1 fx1VarA24 = fx1.a(new g90(fx1.a(new w70(a50Var.f11899z0, y40Var2.f22105d, 1)), 3));
                    r40 r40Var2 = new r40(fx1VarA19, 23);
                    ArrayList arrayList9 = new ArrayList(5);
                    ArrayList arrayList10 = new ArrayList(3);
                    arrayList9.add(y40Var2.f22124x);
                    arrayList9.add(y40Var2.f22125y);
                    arrayList10.add(y40Var2.f22126z);
                    arrayList10.add(y40Var2.A);
                    arrayList9.add(fx1VarA22);
                    arrayList9.add(fx1VarA23);
                    arrayList10.add(fx1VarA24);
                    arrayList9.add(r40Var2);
                    fx1 fx1VarA25 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 0));
                    fx1 fx1VarA26 = fx1.a(new g40(fx1VarA4, fx1VarA2, 4));
                    int i113 = 6;
                    fx1 fx1VarA27 = fx1.a(new g90(fx1VarA21, i113));
                    fx1 fx1Var2 = a50Var.f11856c;
                    fx1 fx1VarA28 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, i113));
                    fx1 fx1VarA29 = fx1.a(new v50(y40Var2.f22108g, 14));
                    r40 r40Var3 = new r40(fx1VarA17, 12);
                    r40 r40Var4 = new r40(fx1VarA19, 26);
                    e60 e60Var = new e60(so0Var, 13);
                    wd0 wd0Var2 = new wd0(fx1.a(new fz(e60Var, g90Var, fx1Var2, 7)), 1);
                    ArrayList arrayList11 = new ArrayList(8);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(y40Var2.B);
                    arrayList11.add(y40Var2.C);
                    arrayList12.add(y40Var2.D);
                    arrayList12.add(y40Var2.E);
                    arrayList12.add(fx1VarA26);
                    arrayList11.add(fx1VarA27);
                    arrayList11.add(fx1VarA28);
                    arrayList11.add(fx1VarA29);
                    arrayList11.add(r40Var3);
                    arrayList11.add(r40Var4);
                    arrayList11.add(wd0Var2);
                    fx1 fx1VarA30 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 2));
                    r40 r40Var5 = new r40(fx1VarA19, 29);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(y40Var2.F);
                    arrayList13.add(r40Var5);
                    fx1 fx1VarA31 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 19));
                    r40 r40Var6 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(y40Var2.G);
                    arrayList15.add(r40Var6);
                    fx1 fx1VarA32 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 10));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(y40Var2.H);
                    arrayList16.add(fx1VarA32);
                    fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList16, arrayList17), 20));
                    fx1 fx1VarA34 = fx1.a(new g90(fx1VarA6, 8));
                    r40 r40Var7 = new r40(fx1VarA19, 27);
                    ArrayList arrayList18 = new ArrayList(7);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(y40Var2.I);
                    arrayList19.add(y40Var2.J);
                    arrayList18.add(y40Var2.K);
                    arrayList18.add(y40Var2.L);
                    arrayList19.add(y40Var2.M);
                    arrayList19.add(y40Var2.N);
                    arrayList19.add(y40Var2.O);
                    arrayList18.add(y40Var2.P);
                    arrayList18.add(y40Var2.Q);
                    arrayList18.add(fx1VarA34);
                    arrayList18.add(r40Var7);
                    fx1 fx1VarA35 = fx1.a(new ca0(new lx1(arrayList18, arrayList19), 5));
                    g90 g90Var3 = new g90(fx1.a(new r40(fx1VarA20, 11)), 1);
                    fx1 fx1VarA36 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 8));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(y40Var2.S);
                    arrayList20.add(g90Var3);
                    arrayList20.add(fx1VarA36);
                    fx1 fx1VarA37 = fx1.a(new ca0(new lx1(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(y40Var2.T);
                    fx1 fx1VarA38 = fx1.a(new g90(fx1VarA21, 4));
                    ArrayList arrayList22 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList22.add(fx1VarA38);
                    fx1 fx1VarA39 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 5));
                    r40 r40Var8 = new r40(fx1VarA19, 25);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(y40Var2.U);
                    arrayList23.add(fx1VarA39);
                    arrayList23.add(r40Var8);
                    fx1 fx1VarA40 = fx1.a(new g90(fx1VarA21, 0));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(fx1VarA40);
                    t80 t80Var4 = new t80(vu0Var2, 1);
                    d80 d80Var = new d80(t80Var, t80Var4, y40Var2.f22110i, t80Var3, y40Var2.f22107f);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(y40Var2.W);
                    arrayList25.add(y40Var2.X);
                    w80 w80Var = new w80(t80Var2, t80Var, fx1VarA8, fx1VarA35, y40Var2.V, d80Var, fx1VarA9, new ca0(new lx1(arrayList25, arrayList26), 6), fx1VarA31, fx1VarA18, a50Var.f11879o0);
                    vd0 vd0Var2 = new vd0(uwVar, 1);
                    fx1 fx1VarA41 = fx1.a(new xe0(vd0Var2, a50Var.f11862f));
                    fx1 fx1VarA42 = fx1.a(new g40(fx1VarA4, fx1VarA2, 6));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(y40Var2.Y);
                    arrayList27.add(fx1VarA42);
                    lx1 lx1Var = new lx1(list4, arrayList27);
                    fx1 fx1Var3 = y40Var2.f22109h;
                    fx1 fx1VarA43 = fx1.a(new fz(fx1Var3, lx1Var, t80Var, 6));
                    fx1 fx1VarA44 = fx1.a(new vd0(uwVar, 2));
                    fx1 fx1VarA45 = fx1.a(new vd0(uwVar, 3));
                    od0 od0Var = y40Var2.f22111j;
                    fx1 fx1Var4 = a50Var.J;
                    u40 u40Var2 = a50Var.f11865h;
                    z90 z90Var = y40Var2.f22105d;
                    fx1 fx1Var5 = a50Var.f11862f;
                    wd0 wd0Var3 = new wd0(fx1.a(new ud0(fx1Var3, od0Var, vd0Var, vd0Var2, e60Var, fx1Var4, fx1VarA30, fx1VarA25, fx1VarA33, t80Var, u40Var2, z90Var, fx1VarA4, fx1VarA41, fx1Var5, fx1VarA43, a50Var.N, y40Var2.f22106e, a50Var.O, fx1VarA12, a50Var.M0, fx1VarA17, fx1VarA44, fx1VarA45, fx1VarA18)), 0);
                    fx1 fx1VarA46 = fx1.a(new v50(u40Var2, 18));
                    fx1 fx1Var6 = a50Var.f11856c;
                    fx1 fx1VarA47 = fx1.a(new xd0(fx1VarA46, fx1Var6, fx1Var3, fx1Var5, 0));
                    fx1 fx1Var7 = y40Var2.f22115o;
                    l40 l40Var = new l40(fx1Var7, vd0Var2, fx1VarA47, wd0Var3);
                    xe0 xe0Var = new xe0(fx1Var7, vd0Var2);
                    fx1 fx1VarA48 = fx1.a(new e60(new zd0(e60Var, 0), 12));
                    te0 te0Var = new te0(a50Var.F, z90Var, g90Var, e60Var, l40Var, xe0Var, fx1Var6, fx1VarA48);
                    er0 er0Var = new er0();
                    fx1 fx1VarA49 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 1));
                    fx1 fx1VarA50 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 0));
                    fx1 fx1VarA51 = fx1.a(new l40((kx1) t80Var4, (kx1) er0Var, (kx1) e60Var, (kx1) a50Var.f11874m, 8));
                    fx1 fx1VarA52 = fx1.a(new oz(er0Var, e60Var, 16));
                    o40 o40Var2 = a50Var.f11864g;
                    fx1 fx1VarA53 = fx1.a(new l40(o40Var2, e60Var, te0Var, er0Var, 7));
                    er0.a(er0Var, fx1.a(new fe0(w80Var, fx1Var6, e60Var, wd0Var3, te0Var, g90Var, od0Var, fx1VarA49, fx1VarA50, fx1VarA51, fx1VarA52, fx1VarA53, new oe0(o40Var2, z90Var), fx1Var4, u40Var2, o40Var2, fx1VarA48, fx1VarA16, a50Var.N0)));
                    fx1 fx1Var8 = y40Var2.Z;
                    fx1 fx1Var9 = y40Var2.R;
                    fx1 fx1VarA54 = fx1.a(new te0(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, t80Var, t80Var3, fx1VarA13));
                    fx1 fx1VarA55 = fx1.a(new d80(a50Var.f11856c, fx1VarA47, fx1.a(new p60(y40Var2.f22109h, t80Var, 3)), fx1VarA13, fx1VarA18, 6));
                    fx1 fx1VarA56 = fx1.a(new q70(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, fx1VarA33, a50Var.f11874m, a50Var.N, a50Var.L, fx1VarA13));
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        ((p9.b) zzt.zzk()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        rn0Var = rn0Var2;
                        wh0 wh0Var3 = rn0Var.f19627f;
                        wh0Var3.c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                        wh0Var3.c(jCurrentTimeMillis, "rendering-configure-webview-start");
                    } else {
                        rn0Var = rn0Var2;
                    }
                    ne0 ne0Var = (ne0) y40Var2.f22101a.f17399b;
                    ic1.h(ne0Var);
                    ic1.h(je0Var);
                    ic1.h(ng0Var);
                    ps psVar = new ps(ne0Var, je0Var, ng0Var, fx1.b(fx1VarA53));
                    if (((ip) psVar.f18789b) != null) {
                        ((ng0) psVar.f18790c).b("/nativeAdCustomClick", psVar);
                    }
                    lg0 lg0Var = (lg0) fx1VarA54.zzb();
                    qa0 qa0Var = lg0Var.f16979b;
                    jg0 jg0Var = ng0Var.f17811a;
                    Objects.requireNonNull(qa0Var);
                    kg0 kg0Var = new kg0(qa0Var, 0);
                    ba0 ba0Var = lg0Var.f16978a;
                    wa0 wa0Var = lg0Var.f16980c;
                    bb0 bb0Var = lg0Var.f16981d;
                    tb0 tb0Var = lg0Var.f16982e;
                    synchronized (jg0Var) {
                        jg0Var.f16087a = ba0Var;
                        jg0Var.f16088b = wa0Var;
                        jg0Var.f16089c = bb0Var;
                        jg0Var.f16090d = tb0Var;
                        jg0Var.f16091e = kg0Var;
                    }
                    du0 du0Var3 = lg0Var.f16983f;
                    fu0 fu0Var2 = lg0Var.f16984g;
                    m60 m60Var = lg0Var.f16985h;
                    synchronized (ng0Var) {
                        try {
                            gd1 gd1Var = ng0Var.f17822m;
                            if (gd1Var == null) {
                                r3 = 0;
                            } else {
                                r3 = 0;
                                try {
                                    uw uwVar2 = new uw(ng0Var, du0Var3, fu0Var2, m60Var, 7, false);
                                    gd1Var.addListener(new zd1(0, gd1Var, uwVar2), ng0Var.f17815e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    ng0Var = ng0Var;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    final yf0 yf0Var = (yf0) fx1VarA55.zzb();
                    b30 b30VarH = je0Var.h();
                    if (b30VarH == null) {
                        yf0Var.getClass();
                    } else {
                        oc0 oc0Var = yf0Var.f22225c;
                        oc0Var.X0(b30VarH.zzE());
                        wf0 wf0Var = new wf0(b30VarH, 1);
                        Executor executor6 = yf0Var.f22223a;
                        oc0Var.P0(wf0Var, executor6);
                        oc0Var.P0(new wf0(b30VarH, 0), executor6);
                        f70 f70Var = yf0Var.f22224b;
                        oc0Var.P0(f70Var, executor6);
                        f70Var.f14297a = b30VarH;
                        g30 g30VarZzP = b30VarH.zzP();
                        if (!((Boolean) zzba.zzc().a(am.Mb)).booleanValue() || g30VarZzP == 0) {
                            i111 = 0;
                        } else {
                            m60 m60Var2 = yf0Var.f22226d;
                            g30VarZzP.e("/click");
                            qc0 qc0Var = g30VarZzP.f14704k;
                            iq iqVar = nq.f17890a;
                            i111 = 0;
                            g30VarZzP.b("/click", new lq(0, qc0Var, m60Var2));
                            g30VarZzP.u0(m60Var2, r3, r3);
                        }
                        b30VarH.D("/trackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                            @Override // com.google.android.gms.internal.ads.oq
                            public final void b(Object obj, Map map) {
                                switch (i111) {
                                    case 0:
                                        f70 f70Var2 = yf0Var.f22224b;
                                        f70Var2.f14301e = true;
                                        f70Var2.a();
                                        break;
                                    default:
                                        yf0Var.f22224b.f14301e = false;
                                        break;
                                }
                            }
                        });
                        final int i20 = 1;
                        b30VarH.D("/untrackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                            @Override // com.google.android.gms.internal.ads.oq
                            public final void b(Object obj, Map map) {
                                switch (i20) {
                                    case 0:
                                        f70 f70Var2 = yf0Var.f22224b;
                                        f70Var2.f14301e = true;
                                        f70Var2.a();
                                        break;
                                    default:
                                        yf0Var.f22224b.f14301e = false;
                                        break;
                                }
                            }
                        });
                        b30VarH.zzP().A = yf0Var.f22227e;
                    }
                    qg0 qg0Var = (qg0) fx1VarA56.zzb();
                    rg0 rg0Var = rn0Var.f19626e;
                    b30 b30VarI = je0Var.i();
                    qg0Var.getClass();
                    pg0 pg0Var = rg0Var.f19585a;
                    qa0 qa0Var2 = qg0Var.f19063b;
                    Objects.requireNonNull(qa0Var2);
                    kg0 kg0Var2 = new kg0(qa0Var2, 1);
                    ba0 ba0Var2 = qg0Var.f19062a;
                    wa0 wa0Var2 = qg0Var.f19064c;
                    bb0 bb0Var2 = qg0Var.f19065d;
                    tb0 tb0Var2 = qg0Var.f19066e;
                    pc0 pc0Var = qg0Var.f19067f;
                    synchronized (pg0Var) {
                        synchronized (pg0Var) {
                            pg0Var.f16087a = ba0Var2;
                            pg0Var.f16088b = wa0Var2;
                            pg0Var.f16089c = bb0Var2;
                            pg0Var.f16090d = tb0Var2;
                            pg0Var.f16091e = kg0Var2;
                        }
                        if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue() && b30VarI != null && b30VarI.zzP() != null) {
                            g30 g30VarZzP4 = b30VarI.zzP();
                            m60 m60Var5 = qg0Var.f19071j;
                            ul0 ul0Var3 = qg0Var.f19070i;
                            g30VarZzP4.q0(m60Var5, ul0Var3, qg0Var.f19069h);
                            g30VarZzP4.u0(m60Var5, ul0Var3, qg0Var.f19068g);
                        }
                        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                            com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                        }
                        return (ee0) er0Var.zzb();
                    }
                    pg0Var.f18645f = pc0Var;
                    if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue()) {
                        g30 g30VarZzP5 = b30VarI.zzP();
                        m60 m60Var6 = qg0Var.f19071j;
                        ul0 ul0Var4 = qg0Var.f19070i;
                        g30VarZzP5.q0(m60Var6, ul0Var4, qg0Var.f19069h);
                        g30VarZzP5.u0(m60Var6, ul0Var4, qg0Var.f19068g);
                    }
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                    }
                    return (ee0) er0Var.zzb();
                }
            };
            sd1 sd1Var6 = new sd1(ya1VarZ3, true, false);
            sd1Var6.f19937p = new rd1(sd1Var6, callable6, this.f19623b);
            sd1Var6.v();
            return sd1Var6;
        }
        listenableFutureD = tf0Var4.d(jSONObjectZzi, du0Var, fu0Var, zzbVar2, zyVar);
        tf0Var = tf0Var4;
        listenableFutureE2 = listenableFutureD;
        hzVar.q(58, listenableFutureE2);
        int i111 = 3;
        if (((Boolean) zzba.zzc().a(am.Ie)).booleanValue()) {
            wh0Var = wh0Var2;
            listenableFutureD2 = zw1.d(new Bundle());
        } else {
            wh0Var = wh0Var2;
            listenableFutureD2 = zw1.d(new Bundle());
        }
        final ListenableFuture listenableFuture1114 = listenableFutureD2;
        vu0Var = (vu0) hzVar.f15435d;
        executor2 = (Executor) vu0Var.f21274b;
        jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray2 == null) {
            listenableFutureZ = zw1.d(Collections.EMPTY_LIST);
            listenableFuture2 = listenableFutureB;
            listenableFutureE2 = listenableFutureE2;
        } else {
            if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) vu0Var.f21276d, "native-assets-loading-custom-start");
            }
            arrayList = new ArrayList();
            length = jSONArrayOptJSONArray2.length();
            i11 = 0;
            while (i11 < length) {
                int i112 = length;
                jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject3 == null) {
                    futureZ = be1.f12743b;
                    jSONArray = jSONArrayOptJSONArray2;
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    strOptString = jSONObjectOptJSONObject3.optString("name");
                    if (strOptString == null) {
                        futureZ = be1.f12743b;
                    } else {
                        i12 = i11;
                        strOptString2 = jSONObjectOptJSONObject3.optString("type");
                        listenableFuture3 = listenableFutureB;
                        if ("string".equals(strOptString2)) {
                            futureZ = zw1.d(new vf0(strOptString, jSONObjectOptJSONObject3.optString("string_value")));
                            vu0Var = vu0Var;
                        } else if ("image".equals(strOptString2)) {
                            tf0 tf0Var8 = (tf0) vu0Var.f21275c;
                            vu0Var = vu0Var;
                            futureZ = zw1.z(tf0Var8.b(jSONObjectOptJSONObject3.optJSONObject("image_value"), tf0Var8.f20351h.f14031b, 0), new kq(strOptString, 2), executor2);
                        } else {
                            vu0Var = vu0Var;
                            futureZ = be1.f12743b;
                        }
                    }
                    arrayList.add(futureZ);
                    i11 = i12 + 1;
                    length = i112;
                    jSONArrayOptJSONArray2 = jSONArray;
                    listenableFutureB = listenableFuture3;
                    vu0Var = vu0Var;
                }
                listenableFuture3 = listenableFutureB;
                i12 = i11;
                arrayList.add(futureZ);
                i11 = i12 + 1;
                length = i112;
                jSONArrayOptJSONArray2 = jSONArray;
                listenableFutureB = listenableFuture3;
                vu0Var = vu0Var;
            }
            listenableFuture2 = listenableFutureB;
            listenableFutureZ = zw1.z(new pd1(ca1.y(arrayList), true), i6.f15610j, executor2);
        }
        hzVar.q(63, listenableFutureZ);
        if (jSONObject.optBoolean("enable_omid")) {
            listenableFutureX2 = be1.f12743b;
        } else {
            strOptString3 = jSONObjectOptJSONObject4.optString("omid_html");
            if (TextUtils.isEmpty(strOptString3)) {
                listenableFutureX2 = be1.f12743b;
            } else {
                if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "native-assets-loading-omid-start");
                }
                listenableFutureX2 = zw1.x(be1.f12743b, new ft(tf0Var, strOptString3, zyVar, zzbVar2), l00.f16613f);
                if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
                    v71.j(listenableFutureX2, "NativeAssetsLoader.omidWebView", executor);
                }
            }
        }
        hzVar.q(65, listenableFutureX2);
        arrayList2 = new ArrayList();
        final ListenableFuture listenableFuture1115 = listenableFuture;
        arrayList2.add(listenableFuture1115);
        final ListenableFuture listenableFuture1116 = listenableFutureA;
        arrayList2.add(listenableFuture1116);
        arrayList2.add(listenableFutureX);
        final ListenableFuture listenableFuture1117 = listenableFuture2;
        arrayList2.add(listenableFuture1117);
        final ListenableFuture listenableFuture1118 = listenableFutureB2;
        arrayList2.add(listenableFuture1118);
        final ListenableFuture listenableFuture1119 = listenableFutureE;
        arrayList2.add(listenableFuture1119);
        final ListenableFuture listenableFuture11110 = listenableFutureE2;
        arrayList2.add(listenableFuture11110);
        arrayList2.add(listenableFuture1114);
        arrayList2.add(listenableFutureZ);
        final zzb zzbVar6 = zzbVar2;
        if (((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue()) {
            arrayList2.add(listenableFutureX2);
        } else {
            arrayList2.add(listenableFutureX2);
        }
        ca1 ca1VarY4 = ca1.y(arrayList2);
        final zy zyVar8 = zyVar;
        final ListenableFuture listenableFuture11111 = listenableFutureZ;
        final ListenableFuture listenableFuture11112 = listenableFutureX2;
        final ListenableFuture listenableFuture11113 = listenableFutureX;
        Callable callable7 = new Callable() { // from class: com.google.android.gms.internal.ads.nf0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArrayOptJSONArray5;
                List listY;
                JSONObject jSONObjectOptJSONObject9;
                hz hzVar2 = hzVar;
                ListenableFuture listenableFuture11114 = listenableFuture1115;
                ListenableFuture listenableFuture11115 = listenableFuture1116;
                ListenableFuture listenableFuture11116 = listenableFuture1118;
                ListenableFuture listenableFuture11117 = listenableFuture1117;
                ListenableFuture listenableFuture11118 = listenableFuture1119;
                JSONObject jSONObject2 = jSONObject;
                ListenableFuture listenableFuture11119 = listenableFuture11110;
                ListenableFuture listenableFuture20 = listenableFuture1114;
                ListenableFuture listenableFuture21 = listenableFuture11113;
                ListenableFuture listenableFuture22 = listenableFuture11112;
                ListenableFuture listenableFuture23 = listenableFuture11111;
                if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), (wh0) hzVar2.f15436e, "rendering-native-assets-loading-end");
                }
                je0 je0Var = (je0) listenableFuture11114.get();
                List list = (List) listenableFuture11115.get();
                synchronized (je0Var) {
                    je0Var.f16054e = list;
                }
                mo moVar = (mo) listenableFuture11116.get();
                synchronized (je0Var) {
                    je0Var.f16067s = moVar;
                }
                mo moVar2 = (mo) listenableFuture11117.get();
                synchronized (je0Var) {
                    je0Var.f16068t = moVar2;
                }
                ho hoVar = (ho) listenableFuture11118.get();
                synchronized (je0Var) {
                    je0Var.f16052c = hoVar;
                }
                JSONObject jSONObjectOptJSONObject10 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                if (jSONObjectOptJSONObject10 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject10.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                    aa1 aa1Var = ca1.f13122b;
                    listY = ya1.f22208e;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i113 = 0; i113 < jSONArrayOptJSONArray5.length(); i113++) {
                        zzew zzewVarF = tf0.f(jSONArrayOptJSONArray5.optJSONObject(i113));
                        if (zzewVarF != null) {
                            arrayList3.add(zzewVarF);
                        }
                    }
                    listY = ca1.y(arrayList3);
                }
                synchronized (je0Var) {
                    je0Var.f16055f = listY;
                }
                JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                zzew zzewVarF2 = (jSONObjectOptJSONObject11 == null || (jSONObjectOptJSONObject9 = jSONObjectOptJSONObject11.optJSONObject("default_reason")) == null) ? null : tf0.f(jSONObjectOptJSONObject9);
                synchronized (je0Var) {
                    je0Var.f16056g = zzewVarF2;
                }
                b30 b30Var = (b30) listenableFuture11119.get();
                if (b30Var != null) {
                    synchronized (je0Var) {
                        je0Var.f16058i = b30Var;
                    }
                    View viewZzE = b30Var.zzE();
                    synchronized (je0Var) {
                        je0Var.f16063o = viewZzE;
                    }
                    t30 t30VarZzh = b30Var.zzh();
                    synchronized (je0Var) {
                        je0Var.f16051b = t30VarZzh;
                    }
                }
                je0Var.d().putAll((Bundle) listenableFuture20.get());
                b30 b30Var2 = (b30) listenableFuture21.get();
                if (b30Var2 != null) {
                    synchronized (je0Var) {
                        je0Var.f16059j = b30Var2;
                    }
                    View viewZzE2 = b30Var2.zzE();
                    synchronized (je0Var) {
                        je0Var.f16064p = viewZzE2;
                    }
                }
                if (!((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                    b30 b30Var3 = (b30) listenableFuture22.get();
                    if (b30Var3 != null) {
                        synchronized (je0Var) {
                            je0Var.f16060k = b30Var3;
                        }
                    }
                } else {
                    synchronized (je0Var) {
                        je0Var.f16061m = listenableFuture22;
                    }
                    m00 m00Var2 = new m00();
                    synchronized (je0Var) {
                        je0Var.f16062n = m00Var2;
                    }
                }
                for (vf0 vf0Var : (List) listenableFuture23.get()) {
                    if (vf0Var.f21158a != 1) {
                        String str5 = vf0Var.f21159b;
                        yn ynVar = vf0Var.f21161d;
                        synchronized (je0Var) {
                            if (ynVar == null) {
                                je0Var.f16070v.remove(str5);
                            } else {
                                je0Var.f16070v.put(str5, ynVar);
                            }
                        }
                    } else {
                        je0Var.o(vf0Var.f21159b, vf0Var.f21160c);
                    }
                }
                return je0Var;
            }
        };
        final sd1 sd1Var7 = new sd1(ca1VarY4, false, false);
        sd1Var7.f19937p = new rd1(sd1Var7, callable7, fe1Var);
        sd1Var7.v();
        ya1 ya1VarZ4 = ca1.z(new ListenableFuture[]{listenableFutureB3, sd1Var7});
        Callable callable8 = new Callable() { // from class: com.google.android.gms.internal.ads.qn0
            /* JADX WARN: Code duplicated, block: B:52:0x0934  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.ads.ul0, com.google.android.gms.internal.ads.yh0] */
            /* JADX WARN: Type inference failed for: r3v22 */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                rn0 rn0Var;
                ?? r3;
                final int i113;
                rn0 rn0Var2 = this.f19130a;
                sd1 sd1Var8 = sd1Var7;
                ListenableFuture listenableFuture11114 = listenableFutureB3;
                ju0 ju0Var2 = ju0Var;
                du0 du0Var2 = du0Var;
                JSONObject jSONObject2 = jSONObject;
                zzb zzbVar7 = zzbVar6;
                bz bzVar = zyVar8;
                je0 je0Var = (je0) sd1Var8.get();
                ng0 ng0Var = (ng0) listenableFuture11114.get();
                ul ulVar = am.V2;
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var2.f19627f, "rendering-webview-creation-end");
                }
                pd0 pd0Var = rn0Var2.f19622a;
                vu0 vu0Var2 = new vu0(ju0Var2, du0Var2, (String) null);
                so0 so0Var = new so0(je0Var, 21);
                uw uwVar = new uw(jSONObject2, ng0Var, zzbVar7, bzVar, 6);
                y40 y40Var = (y40) pd0Var;
                a50 a50Var = y40Var.f22103b;
                y40 y40Var2 = y40Var.f22104c;
                fx1 fx1VarA = fx1.a(new v50(a50Var.H0, 12));
                t80 t80Var = new t80(vu0Var2, 0);
                vd0 vd0Var = new vd0(uwVar, 0);
                g90 g90Var = new g90(fx1.a(new oz(t80Var, vd0Var, 14)), 29);
                fx1 fx1VarA2 = fx1.a(new e60(g90Var, 11));
                u40 u40Var = a50Var.f11865h;
                qd0 qd0Var = ps1.f18800h;
                fx1 fx1VarA3 = fx1.a(new fz(u40Var, fx1VarA2, qd0Var, 1));
                fx1 fx1VarA4 = fx1.a(new e70(fx1VarA, fx1.a(new a70(a50Var.f11864g, fx1VarA3, 0)), a50Var.f11856c, fx1.a(new g40(fx1VarA3, fx1VarA, 3)), a50Var.f11862f));
                fx1 fx1VarA5 = fx1.a(new g40(fx1VarA4, fx1VarA2, 5));
                fx1 fx1VarA6 = fx1.a(new p60(y40Var2.f22109h, t80Var, 1));
                fx1 fx1VarA7 = fx1.a(new g90(fx1VarA6, 7));
                int i114 = lx1.f17149c;
                ArrayList arrayList3 = new ArrayList(1);
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(y40Var2.f22117q);
                arrayList4.add(y40Var2.f22118r);
                arrayList4.add(fx1VarA5);
                arrayList3.add(fx1VarA7);
                fx1 fx1VarA8 = fx1.a(new ca0(new lx1(arrayList3, arrayList4), 3));
                fx1 fx1VarA9 = fx1.a(ps1.f18799g);
                fx1 fx1Var = a50Var.f11856c;
                fx1 fx1VarA10 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 4));
                t80 t80Var2 = new t80(vu0Var2, 3);
                t80 t80Var3 = new t80(vu0Var2, 2);
                o40 o40Var = a50Var.f11864g;
                fx1 fx1VarA11 = fx1.a(new v50(o40Var, 24));
                fx1 fx1VarA12 = fx1.a(rb0.f19504g);
                fx1 fx1VarA13 = fx1.a(new n60(o40Var, a50Var.F, fx1VarA11, fx1VarA12, a50Var.E0, a50Var.f11858d));
                fx1 fx1VarA14 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1VarA13, y40Var2.f22106e));
                qd0 qd0Var2 = new qd0(4);
                qd0 qd0Var3 = new qd0(2);
                fx1 fx1VarA15 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var, 9));
                fx1 fx1VarA16 = fx1.a(dv.f13735g);
                wd0 wd0Var = new wd0(fx1VarA16, 2);
                ArrayList arrayList5 = new ArrayList(2);
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(y40Var2.f22123w);
                arrayList5.add(fx1VarA15);
                arrayList5.add(wd0Var);
                fx1 fx1VarA17 = fx1.a(new fz(new lx1(arrayList5, arrayList6), t80Var, t80Var2, 5));
                fx1 fx1VarA18 = fx1.a(new e60(t80Var2, 8));
                fx1 fx1VarA19 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, y40Var2.f22113m, fx1VarA14, qd0Var2, qd0Var3, a50Var.J, y40Var2.f22114n, y40Var2.f22106e, y40Var2.f22122v, fx1VarA17, fx1VarA18, y40Var2.f22112k));
                r40 r40Var = new r40(fx1VarA19, 24);
                g90 g90Var2 = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
                ArrayList arrayList7 = new ArrayList(4);
                ArrayList arrayList8 = new ArrayList(2);
                arrayList7.add(y40Var2.f22119s);
                arrayList8.add(y40Var2.f22120t);
                arrayList8.add(y40Var2.f22121u);
                arrayList7.add(fx1VarA10);
                arrayList7.add(r40Var);
                arrayList7.add(g90Var2);
                fx1 fx1VarA20 = fx1.a(new ca0(new lx1(arrayList7, arrayList8), 4));
                fx1 fx1VarA21 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, qd0Var));
                fx1 fx1VarA22 = fx1.a(new g90(fx1VarA21, 5));
                fx1 fx1VarA23 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 3));
                fx1 fx1VarA24 = fx1.a(new g90(fx1.a(new w70(a50Var.f11899z0, y40Var2.f22105d, 1)), 3));
                r40 r40Var2 = new r40(fx1VarA19, 23);
                ArrayList arrayList9 = new ArrayList(5);
                ArrayList arrayList10 = new ArrayList(3);
                arrayList9.add(y40Var2.f22124x);
                arrayList9.add(y40Var2.f22125y);
                arrayList10.add(y40Var2.f22126z);
                arrayList10.add(y40Var2.A);
                arrayList9.add(fx1VarA22);
                arrayList9.add(fx1VarA23);
                arrayList10.add(fx1VarA24);
                arrayList9.add(r40Var2);
                fx1 fx1VarA25 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 0));
                fx1 fx1VarA26 = fx1.a(new g40(fx1VarA4, fx1VarA2, 4));
                int i115 = 6;
                fx1 fx1VarA27 = fx1.a(new g90(fx1VarA21, i115));
                fx1 fx1Var2 = a50Var.f11856c;
                fx1 fx1VarA28 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, i115));
                fx1 fx1VarA29 = fx1.a(new v50(y40Var2.f22108g, 14));
                r40 r40Var3 = new r40(fx1VarA17, 12);
                r40 r40Var4 = new r40(fx1VarA19, 26);
                e60 e60Var = new e60(so0Var, 13);
                wd0 wd0Var2 = new wd0(fx1.a(new fz(e60Var, g90Var, fx1Var2, 7)), 1);
                ArrayList arrayList11 = new ArrayList(8);
                ArrayList arrayList12 = new ArrayList(3);
                arrayList11.add(y40Var2.B);
                arrayList11.add(y40Var2.C);
                arrayList12.add(y40Var2.D);
                arrayList12.add(y40Var2.E);
                arrayList12.add(fx1VarA26);
                arrayList11.add(fx1VarA27);
                arrayList11.add(fx1VarA28);
                arrayList11.add(fx1VarA29);
                arrayList11.add(r40Var3);
                arrayList11.add(r40Var4);
                arrayList11.add(wd0Var2);
                fx1 fx1VarA30 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 2));
                r40 r40Var5 = new r40(fx1VarA19, 29);
                ArrayList arrayList13 = new ArrayList(1);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add(y40Var2.F);
                arrayList13.add(r40Var5);
                fx1 fx1VarA31 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 19));
                r40 r40Var6 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
                ArrayList arrayList15 = new ArrayList(1);
                new ArrayList(1).add(y40Var2.G);
                arrayList15.add(r40Var6);
                fx1 fx1VarA32 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 10));
                ArrayList arrayList16 = new ArrayList(1);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add(y40Var2.H);
                arrayList16.add(fx1VarA32);
                fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList16, arrayList17), 20));
                fx1 fx1VarA34 = fx1.a(new g90(fx1VarA6, 8));
                r40 r40Var7 = new r40(fx1VarA19, 27);
                ArrayList arrayList18 = new ArrayList(7);
                ArrayList arrayList19 = new ArrayList(4);
                arrayList18.add(y40Var2.I);
                arrayList19.add(y40Var2.J);
                arrayList18.add(y40Var2.K);
                arrayList18.add(y40Var2.L);
                arrayList19.add(y40Var2.M);
                arrayList19.add(y40Var2.N);
                arrayList19.add(y40Var2.O);
                arrayList18.add(y40Var2.P);
                arrayList18.add(y40Var2.Q);
                arrayList18.add(fx1VarA34);
                arrayList18.add(r40Var7);
                fx1 fx1VarA35 = fx1.a(new ca0(new lx1(arrayList18, arrayList19), 5));
                g90 g90Var3 = new g90(fx1.a(new r40(fx1VarA20, 11)), 1);
                fx1 fx1VarA36 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 8));
                ArrayList arrayList20 = new ArrayList(2);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(y40Var2.S);
                arrayList20.add(g90Var3);
                arrayList20.add(fx1VarA36);
                fx1 fx1VarA37 = fx1.a(new ca0(new lx1(arrayList20, arrayList21), 9));
                List list = Collections.EMPTY_LIST;
                new ArrayList(1).add(y40Var2.T);
                fx1 fx1VarA38 = fx1.a(new g90(fx1VarA21, 4));
                ArrayList arrayList22 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList22.add(fx1VarA38);
                fx1 fx1VarA39 = fx1.a(new a70(fx1VarA9, (kx1) a50Var.f11856c, 5));
                r40 r40Var8 = new r40(fx1VarA19, 25);
                ArrayList arrayList23 = new ArrayList(2);
                new ArrayList(1).add(y40Var2.U);
                arrayList23.add(fx1VarA39);
                arrayList23.add(r40Var8);
                fx1 fx1VarA40 = fx1.a(new g90(fx1VarA21, 0));
                ArrayList arrayList24 = new ArrayList(1);
                List list3 = Collections.EMPTY_LIST;
                arrayList24.add(fx1VarA40);
                t80 t80Var4 = new t80(vu0Var2, 1);
                d80 d80Var = new d80(t80Var, t80Var4, y40Var2.f22110i, t80Var3, y40Var2.f22107f);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add(y40Var2.W);
                arrayList25.add(y40Var2.X);
                w80 w80Var = new w80(t80Var2, t80Var, fx1VarA8, fx1VarA35, y40Var2.V, d80Var, fx1VarA9, new ca0(new lx1(arrayList25, arrayList26), 6), fx1VarA31, fx1VarA18, a50Var.f11879o0);
                vd0 vd0Var2 = new vd0(uwVar, 1);
                fx1 fx1VarA41 = fx1.a(new xe0(vd0Var2, a50Var.f11862f));
                fx1 fx1VarA42 = fx1.a(new g40(fx1VarA4, fx1VarA2, 6));
                List list4 = Collections.EMPTY_LIST;
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add(y40Var2.Y);
                arrayList27.add(fx1VarA42);
                lx1 lx1Var = new lx1(list4, arrayList27);
                fx1 fx1Var3 = y40Var2.f22109h;
                fx1 fx1VarA43 = fx1.a(new fz(fx1Var3, lx1Var, t80Var, 6));
                fx1 fx1VarA44 = fx1.a(new vd0(uwVar, 2));
                fx1 fx1VarA45 = fx1.a(new vd0(uwVar, 3));
                od0 od0Var = y40Var2.f22111j;
                fx1 fx1Var4 = a50Var.J;
                u40 u40Var2 = a50Var.f11865h;
                z90 z90Var = y40Var2.f22105d;
                fx1 fx1Var5 = a50Var.f11862f;
                wd0 wd0Var3 = new wd0(fx1.a(new ud0(fx1Var3, od0Var, vd0Var, vd0Var2, e60Var, fx1Var4, fx1VarA30, fx1VarA25, fx1VarA33, t80Var, u40Var2, z90Var, fx1VarA4, fx1VarA41, fx1Var5, fx1VarA43, a50Var.N, y40Var2.f22106e, a50Var.O, fx1VarA12, a50Var.M0, fx1VarA17, fx1VarA44, fx1VarA45, fx1VarA18)), 0);
                fx1 fx1VarA46 = fx1.a(new v50(u40Var2, 18));
                fx1 fx1Var6 = a50Var.f11856c;
                fx1 fx1VarA47 = fx1.a(new xd0(fx1VarA46, fx1Var6, fx1Var3, fx1Var5, 0));
                fx1 fx1Var7 = y40Var2.f22115o;
                l40 l40Var = new l40(fx1Var7, vd0Var2, fx1VarA47, wd0Var3);
                xe0 xe0Var = new xe0(fx1Var7, vd0Var2);
                fx1 fx1VarA48 = fx1.a(new e60(new zd0(e60Var, 0), 12));
                te0 te0Var = new te0(a50Var.F, z90Var, g90Var, e60Var, l40Var, xe0Var, fx1Var6, fx1VarA48);
                er0 er0Var = new er0();
                fx1 fx1VarA49 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 1));
                fx1 fx1VarA50 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 0));
                fx1 fx1VarA51 = fx1.a(new l40((kx1) t80Var4, (kx1) er0Var, (kx1) e60Var, (kx1) a50Var.f11874m, 8));
                fx1 fx1VarA52 = fx1.a(new oz(er0Var, e60Var, 16));
                o40 o40Var2 = a50Var.f11864g;
                fx1 fx1VarA53 = fx1.a(new l40(o40Var2, e60Var, te0Var, er0Var, 7));
                er0.a(er0Var, fx1.a(new fe0(w80Var, fx1Var6, e60Var, wd0Var3, te0Var, g90Var, od0Var, fx1VarA49, fx1VarA50, fx1VarA51, fx1VarA52, fx1VarA53, new oe0(o40Var2, z90Var), fx1Var4, u40Var2, o40Var2, fx1VarA48, fx1VarA16, a50Var.N0)));
                fx1 fx1Var8 = y40Var2.Z;
                fx1 fx1Var9 = y40Var2.R;
                fx1 fx1VarA54 = fx1.a(new te0(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, t80Var, t80Var3, fx1VarA13));
                fx1 fx1VarA55 = fx1.a(new d80(a50Var.f11856c, fx1VarA47, fx1.a(new p60(y40Var2.f22109h, t80Var, 3)), fx1VarA13, fx1VarA18, 6));
                fx1 fx1VarA56 = fx1.a(new q70(fx1VarA25, fx1VarA20, fx1Var8, fx1VarA37, fx1Var9, fx1VarA33, a50Var.f11874m, a50Var.N, a50Var.L, fx1VarA13));
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    ((p9.b) zzt.zzk()).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    rn0Var = rn0Var2;
                    wh0 wh0Var3 = rn0Var.f19627f;
                    wh0Var3.c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                    wh0Var3.c(jCurrentTimeMillis, "rendering-configure-webview-start");
                } else {
                    rn0Var = rn0Var2;
                }
                ne0 ne0Var = (ne0) y40Var2.f22101a.f17399b;
                ic1.h(ne0Var);
                ic1.h(je0Var);
                ic1.h(ng0Var);
                ps psVar = new ps(ne0Var, je0Var, ng0Var, fx1.b(fx1VarA53));
                if (((ip) psVar.f18789b) != null) {
                    ((ng0) psVar.f18790c).b("/nativeAdCustomClick", psVar);
                }
                lg0 lg0Var = (lg0) fx1VarA54.zzb();
                qa0 qa0Var = lg0Var.f16979b;
                jg0 jg0Var = ng0Var.f17811a;
                Objects.requireNonNull(qa0Var);
                kg0 kg0Var = new kg0(qa0Var, 0);
                ba0 ba0Var = lg0Var.f16978a;
                wa0 wa0Var = lg0Var.f16980c;
                bb0 bb0Var = lg0Var.f16981d;
                tb0 tb0Var = lg0Var.f16982e;
                synchronized (jg0Var) {
                    jg0Var.f16087a = ba0Var;
                    jg0Var.f16088b = wa0Var;
                    jg0Var.f16089c = bb0Var;
                    jg0Var.f16090d = tb0Var;
                    jg0Var.f16091e = kg0Var;
                }
                du0 du0Var3 = lg0Var.f16983f;
                fu0 fu0Var2 = lg0Var.f16984g;
                m60 m60Var = lg0Var.f16985h;
                synchronized (ng0Var) {
                    try {
                        gd1 gd1Var = ng0Var.f17822m;
                        if (gd1Var == null) {
                            r3 = 0;
                        } else {
                            r3 = 0;
                            try {
                                uw uwVar2 = new uw(ng0Var, du0Var3, fu0Var2, m60Var, 7, false);
                                gd1Var.addListener(new zd1(0, gd1Var, uwVar2), ng0Var.f17815e);
                            } catch (Throwable th2) {
                                th = th2;
                                ng0Var = ng0Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                final yf0 yf0Var = (yf0) fx1VarA55.zzb();
                b30 b30VarH = je0Var.h();
                if (b30VarH == null) {
                    yf0Var.getClass();
                } else {
                    oc0 oc0Var = yf0Var.f22225c;
                    oc0Var.X0(b30VarH.zzE());
                    wf0 wf0Var = new wf0(b30VarH, 1);
                    Executor executor6 = yf0Var.f22223a;
                    oc0Var.P0(wf0Var, executor6);
                    oc0Var.P0(new wf0(b30VarH, 0), executor6);
                    f70 f70Var = yf0Var.f22224b;
                    oc0Var.P0(f70Var, executor6);
                    f70Var.f14297a = b30VarH;
                    g30 g30VarZzP = b30VarH.zzP();
                    if (!((Boolean) zzba.zzc().a(am.Mb)).booleanValue() || g30VarZzP == 0) {
                        i113 = 0;
                    } else {
                        m60 m60Var2 = yf0Var.f22226d;
                        g30VarZzP.e("/click");
                        qc0 qc0Var = g30VarZzP.f14704k;
                        iq iqVar = nq.f17890a;
                        i113 = 0;
                        g30VarZzP.b("/click", new lq(0, qc0Var, m60Var2));
                        g30VarZzP.u0(m60Var2, r3, r3);
                    }
                    b30VarH.D("/trackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                        @Override // com.google.android.gms.internal.ads.oq
                        public final void b(Object obj, Map map) {
                            switch (i113) {
                                case 0:
                                    f70 f70Var2 = yf0Var.f22224b;
                                    f70Var2.f14301e = true;
                                    f70Var2.a();
                                    break;
                                default:
                                    yf0Var.f22224b.f14301e = false;
                                    break;
                            }
                        }
                    });
                    final int i20 = 1;
                    b30VarH.D("/untrackActiveViewUnit", new oq() { // from class: com.google.android.gms.internal.ads.xf0
                        @Override // com.google.android.gms.internal.ads.oq
                        public final void b(Object obj, Map map) {
                            switch (i20) {
                                case 0:
                                    f70 f70Var2 = yf0Var.f22224b;
                                    f70Var2.f14301e = true;
                                    f70Var2.a();
                                    break;
                                default:
                                    yf0Var.f22224b.f14301e = false;
                                    break;
                            }
                        }
                    });
                    b30VarH.zzP().A = yf0Var.f22227e;
                }
                qg0 qg0Var = (qg0) fx1VarA56.zzb();
                rg0 rg0Var = rn0Var.f19626e;
                b30 b30VarI = je0Var.i();
                qg0Var.getClass();
                pg0 pg0Var = rg0Var.f19585a;
                qa0 qa0Var2 = qg0Var.f19063b;
                Objects.requireNonNull(qa0Var2);
                kg0 kg0Var2 = new kg0(qa0Var2, 1);
                ba0 ba0Var2 = qg0Var.f19062a;
                wa0 wa0Var2 = qg0Var.f19064c;
                bb0 bb0Var2 = qg0Var.f19065d;
                tb0 tb0Var2 = qg0Var.f19066e;
                pc0 pc0Var = qg0Var.f19067f;
                synchronized (pg0Var) {
                    synchronized (pg0Var) {
                        pg0Var.f16087a = ba0Var2;
                        pg0Var.f16088b = wa0Var2;
                        pg0Var.f16089c = bb0Var2;
                        pg0Var.f16090d = tb0Var2;
                        pg0Var.f16091e = kg0Var2;
                    }
                    if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue() && b30VarI != null && b30VarI.zzP() != null) {
                        g30 g30VarZzP5 = b30VarI.zzP();
                        m60 m60Var6 = qg0Var.f19071j;
                        ul0 ul0Var4 = qg0Var.f19070i;
                        g30VarZzP5.q0(m60Var6, ul0Var4, qg0Var.f19069h);
                        g30VarZzP5.u0(m60Var6, ul0Var4, qg0Var.f19068g);
                    }
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                    }
                    return (ee0) er0Var.zzb();
                }
                pg0Var.f18645f = pc0Var;
                if (((Boolean) zzba.zzc().a(am.Nb)).booleanValue()) {
                    g30 g30VarZzP6 = b30VarI.zzP();
                    m60 m60Var7 = qg0Var.f19071j;
                    ul0 ul0Var5 = qg0Var.f19070i;
                    g30VarZzP6.q0(m60Var7, ul0Var5, qg0Var.f19069h);
                    g30VarZzP6.u0(m60Var7, ul0Var5, qg0Var.f19068g);
                }
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), rn0Var.f19627f, "rendering-configure-webview-end");
                }
                return (ee0) er0Var.zzb();
            }
        };
        sd1 sd1Var8 = new sd1(ya1VarZ4, true, false);
        sd1Var8.f19937p = new rd1(sd1Var8, callable8, this.f19623b);
        sd1Var8.v();
        return sd1Var8;
    }
}
