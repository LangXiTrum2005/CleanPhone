package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import saneness.compiler;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class tc1 {
    public final Context a;
    public final String b;
    public final iv c;
    public final ip0 d;
    public final jk0 e;

    public tc1(Context applicationContext, String afmaVersion, iv consentManager, ip0 gmaUtil, jk0 flags) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = applicationContext;
        this.b = afmaVersion;
        this.c = consentManager;
        this.d = gmaUtil;
        this.e = flags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(Uri uri, jm2 jm2Var, h1 h1Var, Integer num, String str, p002kotlin.time.saneness sanenessVar, String str2, a22 a22Var, hv0 hv0Var, wretchedly.dern dernVar) {
        sc1 sc1Var;
        String str3;
        Boolean bool;
        jk jkVar;
        String strPolder;
        String parameterValue;
        Uri uri2;
        tc1 tc1Var;
        p002kotlin.time.saneness sanenessVar2;
        h1 h1Var2;
        String str4;
        String string;
        String str5;
        String str6;
        String string2;
        String string3;
        String string4;
        String str7;
        String string5;
        if (dernVar instanceof sc1) {
            sc1Var = (sc1) dernVar;
            int i = sc1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                sc1Var.j = i - Integer.MIN_VALUE;
            } else {
                sc1Var = new sc1(this, dernVar);
            }
        } else {
            sc1Var = new sc1(this, dernVar);
        }
        Object obj = sc1Var.h;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = sc1Var.j;
        String str8 = "";
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            String string6 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:app_status_logging_for_presentation:enabled", X3.i.W);
            Boolean bool2 = Boolean.TRUE;
            jk jkVar2 = zk.b;
            if (((Boolean) jk0Var.a("gads:app_status_logging_for_presentation:enabled", bool2, jkVar2)).booleanValue()) {
                String str9 = compiler.attabal(this.a) ? "1" : "0";
                bool = bool2;
                str3 = X3.i.W;
                jkVar = jkVar2;
                string6 = dovishness.polder(string6, "@gw_aps@", str9, false, 4, null);
            } else {
                str3 = X3.i.W;
                bool = bool2;
                jkVar = jkVar2;
            }
            String strPolder2 = string6;
            jk0 jk0Var2 = this.e;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:enable_placement_id:enabled", str3);
            if (((Boolean) jk0Var2.a("gads:enable_placement_id:enabled", bool, jkVar)).booleanValue()) {
                strPolder2 = (a22Var == null || a22Var.a.get() <= 0) ? dovishness.polder(strPolder2, "@gw_placement_id@", "", false, 4, null) : dovishness.polder(strPolder2, "@gw_placement_id@", String.valueOf(a22Var.a.get()), false, 4, null);
            }
            String strPolder3 = strPolder2;
            jk0 jk0Var3 = this.e;
            jk0Var3.getClass();
            Intrinsics.checkNotNullParameter("gads:enable_impression_sequence:enabled", str3);
            if (((Boolean) jk0Var3.a("gads:enable_impression_sequence:enabled", Boolean.FALSE, jkVar)).booleanValue() && hv0Var != null) {
                Integer num2 = hv0Var.a;
                String strPolder4 = dovishness.polder(strPolder3, "@gw_is@", (num2 == null || (string4 = num2.toString()) == null) ? "" : string4, false, 4, null);
                Integer num3 = hv0Var.b;
                String strPolder5 = dovishness.polder(strPolder4, "@gw_fis@", (num3 == null || (string3 = num3.toString()) == null) ? "" : string3, false, 4, null);
                Integer num4 = hv0Var.c;
                strPolder3 = dovishness.polder(strPolder5, "@gw_sfis@", (num4 == null || (string2 = num4.toString()) == null) ? "" : string2, false, 4, null);
            }
            String str10 = strPolder3;
            String adUnitId = jm2Var.a.a.getAdUnitId();
            strPolder = dovishness.polder(dovishness.polder(dovishness.polder(dovishness.polder(dovishness.polder(dovishness.polder(dovishness.polder(str10, "@gw_adlocid@", adUnitId == null ? "" : adUnitId, false, 4, null), "@gw_adnetid@", (h1Var == null || (str6 = h1Var.E) == null) ? "" : str6, false, 4, null), "@gw_adnetrefresh@", "0", false, 4, null), "@gw_adnetstatus@", String.valueOf(str), false, 4, null), "@gw_allocid@", (h1Var == null || (str5 = h1Var.n) == null) ? "" : str5, false, 4, null), "@gw_sdkver@", this.b, false, 4, null), "@gw_seqnum@", (num == null || (string = num.toString()) == null) ? "" : string, false, 4, null);
            iv ivVar = this.c;
            sc1Var.a = this;
            sc1Var.b = uri;
            sc1Var.c = h1Var;
            sc1Var.d = sanenessVar;
            sc1Var.e = str2;
            sc1Var.f = strPolder;
            sc1Var.g = "@gw_sessid@";
            sc1Var.j = 1;
            ivVar.getClass();
            Object objF = iv.f(ivVar, sc1Var);
            if (objF == objBeachfront) {
                return objBeachfront;
            }
            obj = objF;
            parameterValue = str2;
            uri2 = uri;
            tc1Var = this;
            sanenessVar2 = sanenessVar;
            h1Var2 = h1Var;
            str4 = "@gw_sessid@";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = sc1Var.g;
            strPolder = sc1Var.f;
            parameterValue = sc1Var.e;
            sanenessVar2 = sc1Var.d;
            h1Var2 = sc1Var.c;
            uri2 = sc1Var.b;
            tc1Var = sc1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        String str11 = (String) obj;
        if (str11 == null) {
            str11 = "";
        }
        String strPolder6 = dovishness.polder(strPolder, str4, str11, false, 4, null);
        if (h1Var2 == null || (str7 = h1Var2.W) == null) {
            str7 = "";
        }
        String strPolder7 = dovishness.polder(strPolder6, "@gw_qdata@", str7, false, 4, null);
        if (sanenessVar2 != null && (string5 = igo.attabal.marial(p002kotlin.time.saneness.adultoid(sanenessVar2.getRawValue())).toString()) != null) {
            str8 = string5;
        }
        Uri uri3 = Uri.parse(dovishness.polder(strPolder7, "@gw_ttr@", str8, false, 4, null));
        if (StringsKt.empress(parameterValue) || !tc1Var.d.b(uri2)) {
            return uri3;
        }
        laky lakyVar = ip0.f;
        Intrinsics.checkNotNullParameter(uri3, "<this>");
        Intrinsics.checkNotNullParameter("ms", "parameterName");
        Intrinsics.checkNotNullParameter(parameterValue, "parameterValue");
        Uri uriBuild = uri3.buildUpon().appendQueryParameter("ms", parameterValue).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ba -> B:21:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r18, ads_mobile_sdk.jm2 r19, ads_mobile_sdk.h1 r20, java.lang.Integer r21, java.lang.String r22, p002kotlin.time.saneness r23, java.lang.String r24, ads_mobile_sdk.a22 r25, ads_mobile_sdk.hv0 r26, wretchedly.dern r27) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tc1.a(java.util.List, ads_mobile_sdk.jm2, ads_mobile_sdk.h1, java.lang.Integer, java.lang.String, kotlin.time.saneness, java.lang.String, ads_mobile_sdk.a22, ads_mobile_sdk.hv0, wretchedly.dern):java.lang.Object");
    }

    public static /* synthetic */ Object a(tc1 tc1Var, List list, jm2 jm2Var, h1 h1Var, Integer num, String str, p002kotlin.time.saneness sanenessVar, String str2, a22 a22Var, hv0 hv0Var, wretchedly.dern dernVar, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            sanenessVar = null;
        }
        if ((i & 64) != 0) {
            str2 = "";
        }
        if ((i & 128) != 0) {
            a22Var = null;
        }
        if ((i & 256) != 0) {
            hv0Var = null;
        }
        return tc1Var.a(list, jm2Var, h1Var, num, str, sanenessVar, str2, a22Var, hv0Var, dernVar);
    }
}
