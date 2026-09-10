package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.common.base.formularize;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import saneness.delouse;
import saneness.glutethimide;
import saneness.skyjacking;

/* JADX INFO: loaded from: classes.dex */
public final class f5 {
    public final rx0 a;
    public final lt2 b;
    public final av2 c;
    public final u13 d;
    public final skyjacking e;
    public final long f;
    public final delouse g;
    public final long h;
    public final long i = System.currentTimeMillis();
    public final boolean j;
    public final long k;

    public f5(rx0 rx0Var, lt2 lt2Var, av2 av2Var, u13 u13Var, skyjacking skyjackingVar, delouse delouseVar, j5 j5Var) {
        this.a = rx0Var;
        this.b = lt2Var;
        this.c = av2Var;
        this.d = u13Var;
        this.e = skyjackingVar;
        this.f = j5Var.L();
        this.g = delouseVar;
        this.h = j5Var.q();
        this.j = j5Var.x();
        this.k = j5Var.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a8: IGET (r11 I:saneness.skyjacking) = (r4 I:ads_mobile_sdk.f5) (LINE:33) ads_mobile_sdk.f5.e saneness.skyjacking, block:B:46:0x00a5 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.f5] */
    public final String a(final Context context, final String str, final View view, final Activity activity) {
        ?? r4;
        adultoid adultoidVar;
        u13 u13Var = this.d;
        v03 v03Var = new v03(gf0.EVENT_ID_SIGNAL_CLICK, u13Var.b, u13Var.a);
        try {
            try {
                v03Var.b();
                rx0 rx0Var = this.a;
                try {
                    synchronized (rx0Var) {
                        adultoidVar = (adultoid) formularize.triweekly(rx0Var.e);
                    }
                    String str2 = (String) arytenoidectomy.impassible(adultoidVar, new impromptu() { // from class: saneness.arugula
                        @Override // com.google.common.util.concurrent.impromptu
                        public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                            return this.f37061attabal.a(context, str, view, activity, (Void) obj);
                        }
                    }, rotuma.attabal()).get(this.f, TimeUnit.MILLISECONDS);
                    v03Var.a();
                    this.e.a();
                    return str2;
                } catch (InterruptedException e) {
                    e = e;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    v03Var.a(interruptedException);
                    v03Var.a();
                    this.e.a();
                    return "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    v03Var.a(th);
                    String string = Integer.toString(3);
                    v03Var.a();
                    this.e.a();
                    return string;
                } catch (TimeoutException unused) {
                    this.d.b(gf0.EVENT_ID_CLICK_SIGNAL_TIMEOUT);
                    String string2 = Integer.toString(17);
                    v03Var.a();
                    this.e.a();
                    return string2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    v03Var.a(th3);
                    throw th3;
                }
            } catch (InterruptedException e3) {
                e = e3;
            } catch (ExecutionException e4) {
                e = e4;
            } catch (TimeoutException unused2) {
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            v03Var.a();
            r4.e.a();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a8: IGET (r11 I:saneness.skyjacking) = (r4 I:ads_mobile_sdk.f5) (LINE:33) ads_mobile_sdk.f5.e saneness.skyjacking, block:B:46:0x00a5 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.f5] */
    public final String b(final Context context, final String str, final View view, final Activity activity) {
        ?? r4;
        adultoid adultoidVar;
        u13 u13Var = this.d;
        v03 v03Var = new v03(gf0.EVENT_ID_SIGNAL_VIEW, u13Var.b, u13Var.a);
        try {
            try {
                v03Var.b();
                rx0 rx0Var = this.a;
                try {
                    synchronized (rx0Var) {
                        adultoidVar = (adultoid) formularize.triweekly(rx0Var.e);
                    }
                    String str2 = (String) arytenoidectomy.impassible(adultoidVar, new impromptu() { // from class: saneness.talweg
                        @Override // com.google.common.util.concurrent.impromptu
                        public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                            return this.f37327attabal.b(context, str, view, activity, (Void) obj);
                        }
                    }, rotuma.attabal()).get(this.f, TimeUnit.MILLISECONDS);
                    v03Var.a();
                    this.e.a();
                    return str2;
                } catch (InterruptedException e) {
                    e = e;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    v03Var.a(interruptedException);
                    v03Var.a();
                    this.e.a();
                    return "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    v03Var.a(th);
                    String string = Integer.toString(3);
                    v03Var.a();
                    this.e.a();
                    return string;
                } catch (TimeoutException unused) {
                    this.d.b(gf0.EVENT_ID_VIEW_SIGNAL_TIMEOUT);
                    String string2 = Integer.toString(17);
                    v03Var.a();
                    this.e.a();
                    return string2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    v03Var.a(th3);
                    throw th3;
                }
            } catch (InterruptedException e3) {
                e = e3;
            } catch (ExecutionException e4) {
                e = e4;
            } catch (TimeoutException unused2) {
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            v03Var.a();
            r4.e.a();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(final Context context) {
        adultoid adultoidVar;
        long j;
        boolean z = this.j && System.currentTimeMillis() - this.i <= this.k;
        u13 u13Var = this.d;
        v03 v03Var = new v03(gf0.EVENT_ID_SIGNAL_QUERY, u13Var.b, u13Var.a);
        try {
            try {
                try {
                    try {
                        try {
                            v03Var.b();
                            rx0 rx0Var = this.a;
                            synchronized (rx0Var) {
                                adultoidVar = (adultoid) formularize.triweekly(rx0Var.e);
                            }
                            adultoid adultoidVarImpassible = arytenoidectomy.impassible(adultoidVar, new impromptu() { // from class: saneness.ocellation
                                @Override // com.google.common.util.concurrent.impromptu
                                public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                                    return this.f37231attabal.a(context, (Void) obj);
                                }
                            }, rotuma.attabal());
                            if (z) {
                                j = this.h;
                            } else {
                                j = this.f;
                            }
                            String str = (String) adultoidVarImpassible.get(j, TimeUnit.MILLISECONDS);
                            v03Var.a();
                            this.e.a();
                            return str;
                        } catch (TimeoutException unused) {
                            String strA = a(z);
                            v03Var.a();
                            this.e.a();
                            return strA;
                        }
                    } catch (ExecutionException e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        v03Var.a(e);
                        String string = Integer.toString(3);
                        v03Var.a();
                        this.e.a();
                        return string;
                    }
                } catch (Throwable th) {
                    v03Var.a(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                v03Var.a(e2);
                v03Var.a();
                this.e.a();
                return "";
            }
        } catch (Throwable th2) {
            v03Var.a();
            this.e.a();
            throw th2;
        }
    }

    public final adultoid b(Context context, String str, View view, Activity activity, Void r5) {
        return ((glutethimide) this.b.f.get()).a(context, str, view, activity);
    }

    public final String a(boolean z) {
        if (z) {
            of1 of1Var = (of1) this.g.get();
            long j = this.i;
            u13 u13Var = of1Var.b;
            v03 v03Var = new v03(gf0.EVENT_ID_MINIMAL_SIGNAL_QUERY, u13Var.b, u13Var.a);
            try {
                v03Var.b();
                String strA = of1Var.a(j);
                v03Var.a();
                return strA;
            } catch (Throwable th) {
                try {
                    v03Var.a(th);
                    throw th;
                } catch (Throwable th2) {
                    v03Var.a();
                    throw th2;
                }
            }
        }
        this.d.b(gf0.EVENT_ID_QUERY_SIGNAL_TIMEOUT);
        return Integer.toString(17);
    }

    public final adultoid a(Context context, String str, View view, Activity activity, Void r5) {
        return ((glutethimide) this.b.f.get()).b(context, str, view, activity);
    }

    public final adultoid a(Context context, Void r2) {
        return ((glutethimide) this.b.f.get()).a(context);
    }
}
