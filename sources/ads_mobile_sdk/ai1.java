package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.triweekly;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.evenfall;
import saneness.hobby;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ai1 extends SuspendLambda implements Function2 {
    public String a;
    public bi1 b;
    public gq0 c;
    public String d;
    public String e;
    public Context f;
    public w03 g;
    public w03 h;
    public int i;
    public final /* synthetic */ bi1 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ gq0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Context o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai1(bi1 bi1Var, String str, gq0 gq0Var, String str2, String str3, Context context, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.j = bi1Var;
        this.k = str;
        this.l = gq0Var;
        this.m = str2;
        this.n = str3;
        this.o = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ai1(this.j, this.k, this.l, this.m, this.n, this.o, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ai1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0247 A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x024e A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0252 A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0256 A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x025a A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0260 A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0268 A[Catch: all -> 0x0257, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0270 A[Catch: all -> 0x0257, TRY_LEAVE, TryCatch #8 {all -> 0x0257, blocks: (B:110:0x0240, B:112:0x0247, B:114:0x024e, B:116:0x0252, B:118:0x0256, B:121:0x025a, B:122:0x025f, B:123:0x0260, B:124:0x0267, B:125:0x0268, B:126:0x026f, B:127:0x0270), top: B:140:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc A[Catch: all -> 0x005f, Exception -> 0x00e0, TryCatch #4 {Exception -> 0x00e0, blocks: (B:29:0x00c6, B:31:0x00cc, B:34:0x00e4, B:36:0x00e8, B:38:0x0100, B:41:0x0109, B:42:0x011f), top: B:136:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4 A[Catch: all -> 0x005f, Exception -> 0x00e0, TryCatch #4 {Exception -> 0x00e0, blocks: (B:29:0x00c6, B:31:0x00cc, B:34:0x00e4, B:36:0x00e8, B:38:0x0100, B:41:0x0109, B:42:0x011f), top: B:136:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8 A[Catch: all -> 0x005f, Exception -> 0x00e0, TryCatch #4 {Exception -> 0x00e0, blocks: (B:29:0x00c6, B:31:0x00cc, B:34:0x00e4, B:36:0x00e8, B:38:0x0100, B:41:0x0109, B:42:0x011f), top: B:136:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0100 A[Catch: all -> 0x005f, Exception -> 0x00e0, TryCatch #4 {Exception -> 0x00e0, blocks: (B:29:0x00c6, B:31:0x00cc, B:34:0x00e4, B:36:0x00e8, B:38:0x0100, B:41:0x0109, B:42:0x011f), top: B:136:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109 A[Catch: all -> 0x005f, Exception -> 0x00e0, TryCatch #4 {Exception -> 0x00e0, blocks: (B:29:0x00c6, B:31:0x00cc, B:34:0x00e4, B:36:0x00e8, B:38:0x0100, B:41:0x0109, B:42:0x011f), top: B:136:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x011f A[Catch: all -> 0x005f, Exception -> 0x00e0, TRY_LEAVE, TryCatch #4 {Exception -> 0x00e0, blocks: (B:29:0x00c6, B:31:0x00cc, B:34:0x00e4, B:36:0x00e8, B:38:0x0100, B:41:0x0109, B:42:0x011f), top: B:136:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0150 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0157 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015f A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0169 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0171 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0179 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x0149, B:57:0x0150, B:59:0x0157, B:61:0x015b, B:63:0x015f, B:66:0x0163, B:67:0x0168, B:68:0x0169, B:69:0x0170, B:70:0x0171, B:71:0x0178, B:72:0x0179), top: B:132:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2 A[Catch: all -> 0x0034, Exception -> 0x01d6, TryCatch #3 {Exception -> 0x01d6, blocks: (B:82:0x01bc, B:84:0x01c2, B:87:0x01da, B:89:0x01de, B:91:0x01f6, B:94:0x01ff, B:95:0x0215), top: B:135:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01da A[Catch: all -> 0x0034, Exception -> 0x01d6, TryCatch #3 {Exception -> 0x01d6, blocks: (B:82:0x01bc, B:84:0x01c2, B:87:0x01da, B:89:0x01de, B:91:0x01f6, B:94:0x01ff, B:95:0x0215), top: B:135:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01de A[Catch: all -> 0x0034, Exception -> 0x01d6, TryCatch #3 {Exception -> 0x01d6, blocks: (B:82:0x01bc, B:84:0x01c2, B:87:0x01da, B:89:0x01de, B:91:0x01f6, B:94:0x01ff, B:95:0x0215), top: B:135:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f6 A[Catch: all -> 0x0034, Exception -> 0x01d6, TryCatch #3 {Exception -> 0x01d6, blocks: (B:82:0x01bc, B:84:0x01c2, B:87:0x01da, B:89:0x01de, B:91:0x01f6, B:94:0x01ff, B:95:0x0215), top: B:135:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff A[Catch: all -> 0x0034, Exception -> 0x01d6, TryCatch #3 {Exception -> 0x01d6, blocks: (B:82:0x01bc, B:84:0x01c2, B:87:0x01da, B:89:0x01de, B:91:0x01f6, B:94:0x01ff, B:95:0x0215), top: B:135:0x01bc }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0215 A[Catch: all -> 0x0034, Exception -> 0x01d6, TRY_LEAVE, TryCatch #3 {Exception -> 0x01d6, blocks: (B:82:0x01bc, B:84:0x01c2, B:87:0x01da, B:89:0x01de, B:91:0x01f6, B:94:0x01ff, B:95:0x0215), top: B:135:0x01bc }] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00cc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0109, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x01c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x01ff, please report this as an issue */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bi1 bi1Var;
        gq0 gq0Var;
        w03 w03VarA;
        w03 w03Var;
        w03 w03Var2;
        Object objAttabal;
        String str;
        String str2;
        String str3;
        Context context;
        bi1 bi1Var2;
        gq0 gq0Var2;
        w03 w03VarA2;
        w03 w03Var3;
        w03 w03Var4;
        Object objAttabal2;
        String str4;
        String str5;
        String str6;
        Context context2;
        bi1 bi1Var3;
        gq0 gq0Var3;
        spartacist spartacistVar;
        dg2 dg2VarA;
        ByteArrayInputStream byteArrayInputStreamA;
        spartacist spartacistVar2;
        dg2 dg2VarA2;
        ByteArrayInputStream byteArrayInputStreamA2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.i;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = this.j.g;
            no0 no0Var = no0.CUI_NAME_MRAID_STORE_PICTURE;
            List listFormularize = adultoid.formularize();
            l13 l13Var = this.j.h;
            String str7 = this.k;
            bi1Var = this.j;
            gq0Var = this.l;
            String str8 = this.m;
            String str9 = this.n;
            Context context3 = this.o;
            if (j13.c() == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    URL url = new URL(Uri.parse(str7).toString());
                    hobby hobbyVar = bi1Var.e;
                    this.a = str7;
                    this.b = bi1Var;
                    this.c = gq0Var;
                    this.d = str8;
                    this.e = str9;
                    this.f = context3;
                    this.g = w03VarA2;
                    this.h = w03VarA2;
                    this.i = 1;
                    objAttabal2 = hobby.attabal(hobbyVar, url, null, this, 14);
                    if (objAttabal2 != objBeachfront) {
                        str4 = str9;
                        str5 = str7;
                        str6 = str8;
                        w03Var4 = w03VarA2;
                        context2 = context3;
                        bi1Var3 = bi1Var;
                        gq0Var3 = gq0Var;
                        spartacistVar = (spartacist) objAttabal2;
                        if (spartacistVar instanceof nn0) {
                            bi1Var3.a("Unable to download image: " + str5, gq0Var3, true);
                        } else if (spartacistVar instanceof tn0) {
                            triweekly triweeklyVar = kn0.a;
                            kn0.a(new zh1(str5));
                            dg2VarA = ((zt0) ((tn0) spartacistVar).a()).a();
                            if (dg2VarA != null) {
                                byteArrayInputStreamA = dg2VarA.a();
                            } else {
                                byteArrayInputStreamA = null;
                            }
                            if (byteArrayInputStreamA == null) {
                                bi1Var3.a("Unable to download image: " + str5 + ", no responseBody", gq0Var3, true);
                            } else {
                                bi1Var3.a(byteArrayInputStreamA, str6, str4, context2, gq0Var3);
                            }
                        }
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA2, null);
                    }
                } catch (Exception e) {
                    e = e;
                    w03Var4 = w03VarA2;
                    bi1Var.a("Could not store picture: " + e, gq0Var, true);
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
                    URL url2 = new URL(Uri.parse(str7).toString());
                    hobby hobbyVar2 = bi1Var.e;
                    this.a = str7;
                    this.b = bi1Var;
                    this.c = gq0Var;
                    this.d = str8;
                    this.e = str9;
                    this.f = context3;
                    this.g = w03VarA;
                    this.h = w03VarA;
                    this.i = 2;
                    objAttabal = hobby.attabal(hobbyVar2, url2, null, this, 14);
                    if (objAttabal != objBeachfront) {
                        str = str9;
                        str2 = str7;
                        str3 = str8;
                        w03Var2 = w03VarA;
                        context = context3;
                        bi1Var2 = bi1Var;
                        gq0Var2 = gq0Var;
                        spartacistVar2 = (spartacist) objAttabal;
                        if (spartacistVar2 instanceof nn0) {
                            bi1Var2.a("Unable to download image: " + str2, gq0Var2, true);
                        } else if (spartacistVar2 instanceof tn0) {
                            triweekly triweeklyVar2 = kn0.a;
                            kn0.a(new zh1(str2));
                            dg2VarA2 = ((zt0) ((tn0) spartacistVar2).a()).a();
                            if (dg2VarA2 != null) {
                                byteArrayInputStreamA2 = dg2VarA2.a();
                            } else {
                                byteArrayInputStreamA2 = null;
                            }
                            if (byteArrayInputStreamA2 == null) {
                                bi1Var2.a("Unable to download image: " + str2 + ", no responseBody", gq0Var2, true);
                            } else {
                                bi1Var2.a(byteArrayInputStreamA2, str3, str, context, gq0Var2);
                            }
                        }
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA, null);
                    }
                } catch (Exception e2) {
                    e = e2;
                    w03Var2 = w03VarA;
                    bi1Var.a("Could not store picture: " + e, gq0Var, true);
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
            w03VarA2 = this.h;
            w03Var4 = this.g;
            Context context4 = this.f;
            String str10 = this.e;
            String str11 = this.d;
            gq0 gq0Var4 = this.c;
            bi1 bi1Var4 = this.b;
            String str12 = this.a;
            try {
                try {
                    p002kotlin.dern.saneness(obj);
                    context2 = context4;
                    str5 = str12;
                    gq0Var3 = gq0Var4;
                    bi1Var3 = bi1Var4;
                    str4 = str10;
                    str6 = str11;
                    objAttabal2 = obj;
                    try {
                        spartacistVar = (spartacist) objAttabal2;
                        if (spartacistVar instanceof nn0) {
                            bi1Var3.a("Unable to download image: " + str5, gq0Var3, true);
                        } else if (spartacistVar instanceof tn0) {
                            triweekly triweeklyVar3 = kn0.a;
                            kn0.a(new zh1(str5));
                            dg2VarA = ((zt0) ((tn0) spartacistVar).a()).a();
                            if (dg2VarA != null) {
                                byteArrayInputStreamA = dg2VarA.a();
                            } else {
                                byteArrayInputStreamA = null;
                            }
                            if (byteArrayInputStreamA == null) {
                                bi1Var3.a("Unable to download image: " + str5 + ", no responseBody", gq0Var3, true);
                            } else {
                                bi1Var3.a(byteArrayInputStreamA, str6, str4, context2, gq0Var3);
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bi1Var4 = bi1Var3;
                        gq0Var4 = gq0Var3;
                        gq0Var = gq0Var4;
                        bi1Var = bi1Var4;
                        bi1Var.a("Could not store picture: " + e, gq0Var, true);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    w03Var3 = w03VarA2;
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
            } catch (Exception e4) {
                e = e4;
                gq0Var = gq0Var4;
                bi1Var = bi1Var4;
                bi1Var.a("Could not store picture: " + e, gq0Var, true);
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03VarA2, null);
                return Unit.f29295attabal;
            }
            Unit unit4 = Unit.f29295attabal;
            interaction.saneness.attabal(w03VarA2, null);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03VarA = this.h;
            w03Var2 = this.g;
            Context context5 = this.f;
            String str13 = this.e;
            String str14 = this.d;
            gq0 gq0Var5 = this.c;
            bi1 bi1Var5 = this.b;
            String str15 = this.a;
            try {
                try {
                    p002kotlin.dern.saneness(obj);
                    context = context5;
                    str2 = str15;
                    gq0Var2 = gq0Var5;
                    bi1Var2 = bi1Var5;
                    str = str13;
                    str3 = str14;
                    objAttabal = obj;
                    try {
                        spartacistVar2 = (spartacist) objAttabal;
                        if (spartacistVar2 instanceof nn0) {
                            bi1Var2.a("Unable to download image: " + str2, gq0Var2, true);
                        } else if (spartacistVar2 instanceof tn0) {
                            triweekly triweeklyVar4 = kn0.a;
                            kn0.a(new zh1(str2));
                            dg2VarA2 = ((zt0) ((tn0) spartacistVar2).a()).a();
                            if (dg2VarA2 != null) {
                                byteArrayInputStreamA2 = dg2VarA2.a();
                            } else {
                                byteArrayInputStreamA2 = null;
                            }
                            if (byteArrayInputStreamA2 == null) {
                                bi1Var2.a("Unable to download image: " + str2 + ", no responseBody", gq0Var2, true);
                            } else {
                                bi1Var2.a(byteArrayInputStreamA2, str3, str, context, gq0Var2);
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        bi1Var5 = bi1Var2;
                        gq0Var5 = gq0Var2;
                        gq0Var = gq0Var5;
                        bi1Var = bi1Var5;
                        bi1Var.a("Could not store picture: " + e, gq0Var, true);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    w03Var = w03VarA;
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
            } catch (Exception e6) {
                e = e6;
                gq0Var = gq0Var5;
                bi1Var = bi1Var5;
                bi1Var.a("Could not store picture: " + e, gq0Var, true);
                Unit unit5 = Unit.f29295attabal;
                interaction.saneness.attabal(w03VarA, null);
                return Unit.f29295attabal;
            }
            Unit unit6 = Unit.f29295attabal;
            interaction.saneness.attabal(w03VarA, null);
        }
        return Unit.f29295attabal;
    }
}
