package ads_mobile_sdk;

import android.content.Context;
import com.ironsource.X3;
import formularization.beachfront;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.blighty;

/* JADX INFO: loaded from: classes.dex */
public final class k63 implements blighty {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int f3287attabal = 0;
    public final Context a;
    public final String b;
    public final sj0 c;
    public saran d;
    public saran e;
    public ri2 f;
    public jk0 g;
    public final formularization.attabal h;
    public final cord i;
    public String j;

    public k63(Context context, String afmaVersion, sj0 flagDataStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.a = context;
        this.b = afmaVersion;
        this.c = flagDataStore;
        this.h = beachfront.saneness(false, 1, null);
        this.i = JobKt__JobKt.saneness(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(k63 k63Var, wretchedly.dern dernVar) {
        j63 j63Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof j63) {
            j63Var = (j63) dernVar;
            int i = j63Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j63Var.e = i - Integer.MIN_VALUE;
            } else {
                j63Var = new j63(k63Var, dernVar);
            }
        } else {
            j63Var = new j63(k63Var, dernVar);
        }
        Object obj = j63Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = j63Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = k63Var.h;
            j63Var.a = k63Var;
            j63Var.b = attabalVar;
            j63Var.e = 1;
            if (attabalVar.attabal(null, j63Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = j63Var.b;
            k63 k63Var2 = j63Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            k63Var = k63Var2;
        }
        try {
            return k63Var.j;
        } finally {
            attabalVar.wireman(null);
        }
    }

    @Override // saneness.blighty
    public final Object a(ContinuationImpl continuationImpl) {
        return a(this, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1 A[Catch: all -> 0x0162, TRY_ENTER, TryCatch #1 {all -> 0x0162, blocks: (B:39:0x00a9, B:43:0x00b1, B:45:0x00b5, B:46:0x00bb, B:48:0x00d5, B:50:0x00d9, B:56:0x00eb, B:52:0x00e1, B:54:0x00e5), top: B:84:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:39:0x00a9, B:43:0x00b1, B:45:0x00b5, B:46:0x00bb, B:48:0x00d5, B:50:0x00d9, B:56:0x00eb, B:52:0x00e1, B:54:0x00e5), top: B:84:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:39:0x00a9, B:43:0x00b1, B:45:0x00b5, B:46:0x00bb, B:48:0x00d5, B:50:0x00d9, B:56:0x00eb, B:52:0x00e1, B:54:0x00e5), top: B:84:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:39:0x00a9, B:43:0x00b1, B:45:0x00b5, B:46:0x00bb, B:48:0x00d5, B:50:0x00d9, B:56:0x00eb, B:52:0x00e1, B:54:0x00e5), top: B:84:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00df A[PHI: r0
  0x00df: PHI (r0v12 kotlinx.coroutines.saran) = (r0v10 kotlinx.coroutines.saran), (r0v15 kotlinx.coroutines.saran) binds: [B:53:0x00e3, B:49:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:39:0x00a9, B:43:0x00b1, B:45:0x00b5, B:46:0x00bb, B:48:0x00d5, B:50:0x00d9, B:56:0x00eb, B:52:0x00e1, B:54:0x00e5), top: B:84:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5 A[Catch: all -> 0x0162, TryCatch #1 {all -> 0x0162, blocks: (B:39:0x00a9, B:43:0x00b1, B:45:0x00b5, B:46:0x00bb, B:48:0x00d5, B:50:0x00d9, B:56:0x00eb, B:52:0x00e1, B:54:0x00e5), top: B:84:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135 A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #3 {all -> 0x015f, blocks: (B:60:0x0126, B:62:0x0135, B:65:0x013d), top: B:88:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013d A[Catch: all -> 0x015f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x015f, blocks: (B:60:0x0126, B:62:0x0135, B:65:0x013d), top: B:88:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static Object a(k63 k63Var, wretchedly.dern dernVar) throws Throwable {
        g63 g63Var;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        k63 k63Var2;
        formularization.attabal attabalVar3;
        String str;
        jk0 jk0Var;
        saran saranVar;
        saran saranVar2;
        walach walachVarSaneness;
        Object objA;
        formularization.attabal attabalVar4;
        String strO;
        k63 k63Var3;
        formularization.attabal attabalVar5;
        k63 k63Var4 = k63Var;
        if (dernVar instanceof g63) {
            g63Var = (g63) dernVar;
            int i = g63Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g63Var.f = i - Integer.MIN_VALUE;
            } else {
                g63Var = new g63(k63Var4, dernVar);
            }
        } else {
            g63Var = new g63(k63Var4, dernVar);
        }
        Object objDent = g63Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = g63Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objDent);
                attabalVar = k63Var4.h;
                g63Var.a = k63Var4;
                g63Var.b = attabalVar;
                g63Var.f = 1;
                if (attabalVar.attabal(null, g63Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar6 = (formularization.attabal) g63Var.b;
                k63 k63Var5 = (k63) g63Var.a;
                p002kotlin.dern.saneness(objDent);
                attabalVar = attabalVar6;
                k63Var4 = k63Var5;
            } else {
                if (i2 == 2) {
                    formularization.attabal attabalVar7 = (formularization.attabal) g63Var.b;
                    k63Var2 = (k63) g63Var.a;
                    p002kotlin.dern.saneness(objDent);
                    attabalVar2 = attabalVar7;
                    try {
                        str = k63Var2.j;
                        if (str != null) {
                            attabalVar2.wireman(null);
                            return str;
                        }
                        jk0Var = k63Var2.g;
                        if (jk0Var == null) {
                            Intrinsics.preprohormone("flags");
                            jk0Var = null;
                        }
                        jk0Var.getClass();
                        Intrinsics.checkNotNullParameter("gads:webview_initialization_executor:enabled", X3.i.W);
                        if (((Boolean) jk0Var.a("gads:webview_initialization_executor:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                            saranVar = k63Var2.e;
                            if (saranVar == null) {
                                Intrinsics.preprohormone("webViewInitializationScope");
                                saranVar2 = null;
                            } else {
                                saranVar2 = saranVar;
                            }
                        } else {
                            saranVar = k63Var2.d;
                            if (saranVar == null) {
                                Intrinsics.preprohormone("backgroundScope");
                                saranVar2 = null;
                            } else {
                                saranVar2 = saranVar;
                            }
                        }
                        i63 block = new i63(k63Var2, saranVar2, null);
                        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                        Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        walachVarSaneness = cutely.saneness(saranVar2, context, null, new w13(block, null), 2, null);
                        sj0 sj0Var = k63Var2.c;
                        g63Var.a = k63Var2;
                        g63Var.b = attabalVar2;
                        g63Var.c = walachVarSaneness;
                        g63Var.f = 3;
                        sj0Var.getClass();
                        objA = sj0.a(sj0Var, g63Var);
                        if (objA != objBeachfront) {
                            attabalVar4 = attabalVar2;
                            objDent = objA;
                            strO = ((gj0) objDent).o();
                            Intrinsics.beachfront(strO);
                            if (strO.length() > 0) {
                                String strA = k63Var2.a(strO);
                                attabalVar4.wireman(null);
                                return strA;
                            }
                            g63Var.a = attabalVar4;
                            g63Var.b = k63Var2;
                            g63Var.c = null;
                            g63Var.f = 4;
                            objDent = walachVarSaneness.dent(g63Var);
                            if (objDent != objBeachfront) {
                                k63Var3 = k63Var2;
                                attabalVar5 = attabalVar4;
                                Intrinsics.checkNotNullExpressionValue(objDent, "await(...)");
                                String strA2 = k63Var3.a((String) objDent);
                                attabalVar5.wireman(null);
                                return strA2;
                            }
                        }
                        return objBeachfront;
                    } catch (Throwable th) {
                        th = th;
                        attabalVar3 = attabalVar2;
                    }
                    attabalVar3.wireman(null);
                    throw th;
                }
                if (i2 == 3) {
                    walachVarSaneness = g63Var.c;
                    attabalVar3 = (formularization.attabal) g63Var.b;
                    k63 k63Var6 = (k63) g63Var.a;
                    try {
                        p002kotlin.dern.saneness(objDent);
                        attabalVar4 = attabalVar3;
                        k63Var2 = k63Var6;
                        try {
                            strO = ((gj0) objDent).o();
                            Intrinsics.beachfront(strO);
                            if (strO.length() > 0) {
                                String strA3 = k63Var2.a(strO);
                                attabalVar4.wireman(null);
                                return strA3;
                            }
                            g63Var.a = attabalVar4;
                            g63Var.b = k63Var2;
                            g63Var.c = null;
                            g63Var.f = 4;
                            objDent = walachVarSaneness.dent(g63Var);
                            if (objDent != objBeachfront) {
                                k63Var3 = k63Var2;
                                attabalVar5 = attabalVar4;
                                Intrinsics.checkNotNullExpressionValue(objDent, "await(...)");
                                String strA4 = k63Var3.a((String) objDent);
                                attabalVar5.wireman(null);
                                return strA4;
                            }
                            return objBeachfront;
                        } catch (Throwable th2) {
                            th = th2;
                            attabalVar3 = attabalVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k63Var3 = (k63) g63Var.b;
                    attabalVar5 = (formularization.attabal) g63Var.a;
                    try {
                        p002kotlin.dern.saneness(objDent);
                        Intrinsics.checkNotNullExpressionValue(objDent, "await(...)");
                        String strA5 = k63Var3.a((String) objDent);
                        attabalVar5.wireman(null);
                        return strA5;
                    } catch (Throwable th4) {
                        th = th4;
                        attabalVar3 = attabalVar5;
                    }
                }
            }
            String str2 = k63Var4.j;
            attabalVar.wireman(null);
            if (str2 != null) {
                return str2;
            }
            attabalVar2 = k63Var4.h;
            g63Var.a = k63Var4;
            g63Var.b = attabalVar2;
            g63Var.f = 2;
            if (attabalVar2.attabal(null, g63Var) != objBeachfront) {
                k63Var2 = k63Var4;
                str = k63Var2.j;
                if (str != null) {
                    attabalVar2.wireman(null);
                    return str;
                }
                jk0Var = k63Var2.g;
                if (jk0Var == null) {
                    Intrinsics.preprohormone("flags");
                    jk0Var = null;
                }
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:webview_initialization_executor:enabled", X3.i.W);
                if (((Boolean) jk0Var.a("gads:webview_initialization_executor:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                    saranVar = k63Var2.e;
                    if (saranVar == null) {
                        Intrinsics.preprohormone("webViewInitializationScope");
                        saranVar2 = null;
                    } else {
                        saranVar2 = saranVar;
                    }
                } else {
                    saranVar = k63Var2.d;
                    if (saranVar == null) {
                        Intrinsics.preprohormone("backgroundScope");
                        saranVar2 = null;
                    } else {
                        saranVar2 = saranVar;
                    }
                }
                i63 block2 = new i63(k63Var2, saranVar2, null);
                EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(block2, "block");
                walachVarSaneness = cutely.saneness(saranVar2, context2, null, new w13(block2, null), 2, null);
                sj0 sj0Var2 = k63Var2.c;
                g63Var.a = k63Var2;
                g63Var.b = attabalVar2;
                g63Var.c = walachVarSaneness;
                g63Var.f = 3;
                sj0Var2.getClass();
                objA = sj0.a(sj0Var2, g63Var);
                if (objA != objBeachfront) {
                    attabalVar4 = attabalVar2;
                    objDent = objA;
                    strO = ((gj0) objDent).o();
                    Intrinsics.beachfront(strO);
                    if (strO.length() > 0) {
                        String strA6 = k63Var2.a(strO);
                        attabalVar4.wireman(null);
                        return strA6;
                    }
                    g63Var.a = attabalVar4;
                    g63Var.b = k63Var2;
                    g63Var.c = null;
                    g63Var.f = 4;
                    objDent = walachVarSaneness.dent(g63Var);
                    if (objDent != objBeachfront) {
                        k63Var3 = k63Var2;
                        attabalVar5 = attabalVar4;
                        Intrinsics.checkNotNullExpressionValue(objDent, "await(...)");
                        String strA7 = k63Var3.a((String) objDent);
                        attabalVar5.wireman(null);
                        return strA7;
                    }
                }
                attabalVar3.wireman(null);
                throw th;
            }
            return objBeachfront;
        } catch (Throwable th5) {
            attabalVar.wireman(null);
            throw th5;
        }
    }

    @Override // saneness.blighty
    public final Object b(ContinuationImpl continuationImpl) {
        Object objStarveling = this.i.starveling(continuationImpl);
        return objStarveling == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objStarveling : Unit.f29295attabal;
    }

    @Override // saneness.blighty
    public final Object a(e63 e63Var) {
        return b(this, e63Var);
    }

    public final String a(String str) {
        String str2 = str + " (Mobile; " + this.b + ")";
        this.j = str2;
        return str2;
    }
}
