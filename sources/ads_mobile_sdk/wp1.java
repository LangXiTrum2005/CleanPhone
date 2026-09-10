package ads_mobile_sdk;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.thomist;

/* JADX INFO: loaded from: classes.dex */
public final class wp1 {
    public final ri2 a;
    public final g83 b;
    public final thomist c;
    public gq0 d;

    public wp1(ri2 rootTraceCreator, g83 webViewFactory, thomist nativeOnePointFiveClickOverlayConfigurator) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(nativeOnePointFiveClickOverlayConfigurator, "nativeOnePointFiveClickOverlayConfigurator");
        this.a = rootTraceCreator;
        this.b = webViewFactory;
        this.c = nativeOnePointFiveClickOverlayConfigurator;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0199 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a9 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7 A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010a A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0110 A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0118 A[Catch: all -> 0x0107, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0120 A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #6 {all -> 0x0107, blocks: (B:51:0x00f0, B:53:0x00f7, B:55:0x00fe, B:57:0x0102, B:59:0x0106, B:62:0x010a, B:63:0x010f, B:64:0x0110, B:65:0x0117, B:66:0x0118, B:67:0x011f, B:68:0x0120), top: B:123:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0187 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x018b A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x018f A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:90:0x0179, B:92:0x0180, B:94:0x0187, B:96:0x018b, B:98:0x018f, B:101:0x0193, B:102:0x0198, B:103:0x0199, B:104:0x01a0, B:105:0x01a1, B:106:0x01a8, B:107:0x01a9), top: B:112:0x0179 }] */
    public static Object a(wp1 wp1Var, wretchedly.dern dernVar) {
        up1 up1Var;
        w03 w03VarA;
        Closeable closeable;
        w03 w03Var;
        w03 w03VarA2;
        Closeable closeable2;
        w03 w03Var2;
        gq0 gq0Var;
        thomist thomistVar;
        gerenuk gerenukVarC;
        wp1 wp1Var2;
        gq0 gq0Var2;
        Closeable closeable3;
        w03 w03Var3;
        gq0 gq0Var3;
        thomist thomistVar2;
        gerenuk gerenukVarC2;
        wp1 wp1Var3;
        gq0 gq0Var4;
        Closeable closeable4;
        w03 w03Var4;
        wp1 wp1Var4 = wp1Var;
        if (dernVar instanceof up1) {
            up1Var = (up1) dernVar;
            int i = up1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                up1Var.g = i - Integer.MIN_VALUE;
            } else {
                up1Var = new up1(wp1Var4, dernVar);
            }
        } else {
            up1Var = new up1(wp1Var4, dernVar);
        }
        Object obj = up1Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = up1Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = wp1Var4.a;
            no0 no0Var = no0.CUI_NAME_NATIVE_1_5_CLICK_WEBVIEW_CREATE;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    g83 g83Var = wp1Var4.b;
                    ia3 ia3Var = new ia3(ha3.DEFAULT, 0, 0, 14);
                    up1Var.a = wp1Var4;
                    up1Var.b = w03VarA2;
                    up1Var.c = w03VarA2;
                    up1Var.g = 1;
                    Object objA = g83Var.a(ia3Var, null, up1Var);
                    if (objA != objBeachfront) {
                        w03Var2 = w03VarA2;
                        obj = objA;
                        closeable2 = w03Var2;
                        gq0Var = (gq0) obj;
                        thomistVar = wp1Var4.c;
                        gerenukVarC = gq0Var.c();
                        up1Var.a = wp1Var4;
                        up1Var.b = w03Var2;
                        up1Var.c = closeable2;
                        up1Var.d = gq0Var;
                        up1Var.g = 2;
                        if (thomistVar.a(gerenukVarC, up1Var) != objBeachfront) {
                            wp1Var2 = wp1Var4;
                            gq0Var2 = gq0Var;
                            closeable3 = closeable2;
                            w03Var3 = w03Var2;
                            gq0Var2.setVisibility(8);
                            wp1Var2.d = gq0Var2;
                            interaction.saneness.attabal(closeable3, null);
                            return gq0Var2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = w03VarA2;
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
                w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    g83 g83Var2 = wp1Var4.b;
                    ia3 ia3Var2 = new ia3(ha3.DEFAULT, 0, 0, 14);
                    up1Var.a = wp1Var4;
                    up1Var.b = w03VarA;
                    up1Var.c = w03VarA;
                    up1Var.g = 3;
                    Object objA2 = g83Var2.a(ia3Var2, null, up1Var);
                    if (objA2 != objBeachfront) {
                        w03Var = w03VarA;
                        obj = objA2;
                        closeable = w03Var;
                        gq0Var3 = (gq0) obj;
                        thomistVar2 = wp1Var4.c;
                        gerenukVarC2 = gq0Var3.c();
                        up1Var.a = wp1Var4;
                        up1Var.b = w03Var;
                        up1Var.c = closeable;
                        up1Var.d = gq0Var3;
                        up1Var.g = 4;
                        if (thomistVar2.a(gerenukVarC2, up1Var) != objBeachfront) {
                            wp1Var3 = wp1Var4;
                            gq0Var4 = gq0Var3;
                            closeable4 = closeable;
                            w03Var4 = w03Var;
                            gq0Var4.setVisibility(8);
                            wp1Var3.d = gq0Var4;
                            interaction.saneness.attabal(closeable4, null);
                            return gq0Var4;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = w03VarA;
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
        if (i2 == 1) {
            closeable2 = up1Var.c;
            w03Var2 = up1Var.b;
            wp1Var4 = up1Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                gq0Var = (gq0) obj;
                thomistVar = wp1Var4.c;
                gerenukVarC = gq0Var.c();
                up1Var.a = wp1Var4;
                up1Var.b = w03Var2;
                up1Var.c = closeable2;
                up1Var.d = gq0Var;
                up1Var.g = 2;
                if (thomistVar.a(gerenukVarC, up1Var) != objBeachfront) {
                    wp1Var2 = wp1Var4;
                    gq0Var2 = gq0Var;
                    closeable3 = closeable2;
                    w03Var3 = w03Var2;
                    gq0Var2.setVisibility(8);
                    wp1Var2.d = gq0Var2;
                    interaction.saneness.attabal(closeable3, null);
                    return gq0Var2;
                }
                return objBeachfront;
            } catch (Throwable th3) {
                th = th3;
                w03VarA2 = w03Var2;
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
        if (i2 == 2) {
            gq0Var2 = up1Var.d;
            closeable3 = up1Var.c;
            w03Var3 = up1Var.b;
            wp1Var2 = up1Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                gq0Var2.setVisibility(8);
                wp1Var2.d = gq0Var2;
                interaction.saneness.attabal(closeable3, null);
                return gq0Var2;
            } catch (Throwable th4) {
                th = th4;
                w03VarA2 = w03Var3;
                closeable2 = closeable3;
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
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(closeable2, th5);
                        throw th6;
                    }
                }
            }
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0Var4 = up1Var.d;
            closeable4 = up1Var.c;
            w03Var4 = up1Var.b;
            wp1Var3 = up1Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                gq0Var4.setVisibility(8);
                wp1Var3.d = gq0Var4;
                interaction.saneness.attabal(closeable4, null);
                return gq0Var4;
            } catch (Throwable th7) {
                th = th7;
                w03VarA = w03Var4;
                closeable = closeable4;
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
                } catch (Throwable th8) {
                    try {
                        throw th8;
                    } catch (Throwable th9) {
                        interaction.saneness.attabal(closeable, th8);
                        throw th9;
                    }
                }
            }
        }
        closeable = up1Var.c;
        w03Var = up1Var.b;
        wp1Var4 = up1Var.a;
        try {
            p002kotlin.dern.saneness(obj);
            gq0Var3 = (gq0) obj;
            thomistVar2 = wp1Var4.c;
            gerenukVarC2 = gq0Var3.c();
            up1Var.a = wp1Var4;
            up1Var.b = w03Var;
            up1Var.c = closeable;
            up1Var.d = gq0Var3;
            up1Var.g = 4;
            if (thomistVar2.a(gerenukVarC2, up1Var) != objBeachfront) {
                wp1Var3 = wp1Var4;
                gq0Var4 = gq0Var3;
                closeable4 = closeable;
                w03Var4 = w03Var;
                gq0Var4.setVisibility(8);
                wp1Var3.d = gq0Var4;
                interaction.saneness.attabal(closeable4, null);
                return gq0Var4;
            }
            return objBeachfront;
        } catch (Throwable th10) {
            th = th10;
            w03VarA = w03Var;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(wp1 wp1Var, wretchedly.dern dernVar) {
        vp1 vp1Var;
        if (dernVar instanceof vp1) {
            vp1Var = (vp1) dernVar;
            int i = vp1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vp1Var.d = i - Integer.MIN_VALUE;
            } else {
                vp1Var = new vp1(wp1Var, dernVar);
            }
        } else {
            vp1Var = new vp1(wp1Var, dernVar);
        }
        Object obj = vp1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vp1Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            gq0 gq0Var = wp1Var.d;
            if (gq0Var != null) {
                vp1Var.a = wp1Var;
                vp1Var.d = 1;
                if (gq0Var.a(vp1Var) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wp1Var = vp1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        wp1Var.d = null;
        return Unit.f29295attabal;
    }
}
