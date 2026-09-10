package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.ironsource.X3;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.taiyuan;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class u41 {
    public final gq0 a;
    public final l13 b;
    public final a22 c;
    public final ri2 d;
    public final g6 e;
    public final jk0 f;

    public u41(gq0 webView, l13 traceMetaSet, a22 a22Var, ri2 rootTraceCreator, g6 adSpamClient, jk0 flags) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = webView;
        this.b = traceMetaSet;
        this.c = a22Var;
        this.d = rootTraceCreator;
        this.e = adSpamClient;
        this.f = flags;
    }

    @JavascriptInterface
    public final String getClickSignals(String clickString) {
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        if (clickString.length() == 0) {
            return "";
        }
        ri2 ri2Var = this.d;
        no0 no0Var = no0.CUI_NAME_CLICK_SIGNALS;
        l13 l13Var = this.b;
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                String strA = this.e.a(this.a, clickString);
                interaction.saneness.attabal(v62VarA, null);
                return strA;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
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
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            String strA2 = this.e.a(this.a, clickString);
            interaction.saneness.attabal(w03VarA, null);
            return strA2;
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (th4 instanceof evenfall) {
                    throw th4;
                }
                w03VarA.a(th4);
                if (th4 instanceof TimeoutCancellationException) {
                    throw new cp0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new bn0(th4);
                }
                if (th4 instanceof yn0) {
                    throw th4;
                }
                throw new gn0(th4);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }

    @JavascriptInterface
    public final String getViewSignals() {
        ri2 ri2Var = this.d;
        no0 no0Var = no0.CUI_NAME_VIEW_SIGNALS;
        l13 l13Var = this.b;
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                String strA = this.e.a(this.a);
                interaction.saneness.attabal(v62VarA, null);
                return strA;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
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
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            String strA2 = this.e.a(this.a);
            interaction.saneness.attabal(w03VarA, null);
            return strA2;
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (th4 instanceof evenfall) {
                    throw th4;
                }
                w03VarA.a(th4);
                if (th4 instanceof TimeoutCancellationException) {
                    throw new cp0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new bn0(th4);
                }
                if (th4 instanceof yn0) {
                    throw th4;
                }
                throw new gn0(th4);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }

    @JavascriptInterface
    public final String getViewSignalsJson() {
        ri2 ri2Var = this.d;
        no0 no0Var = no0.CUI_NAME_VIEW_SIGNALS;
        l13 l13Var = this.b;
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                jk0 jk0Var = this.f;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:add_placement_id_in_view_signals:enabled", X3.i.W);
                if (((Boolean) jk0Var.a("gads:add_placement_id_in_view_signals:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                    String strA = this.e.a(this.a, this.c);
                    interaction.saneness.attabal(v62VarA, null);
                    return strA;
                }
                String strA2 = this.e.a(this.a);
                interaction.saneness.attabal(v62VarA, null);
                return strA2;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
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
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            jk0 jk0Var2 = this.f;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:add_placement_id_in_view_signals:enabled", X3.i.W);
            if (((Boolean) jk0Var2.a("gads:add_placement_id_in_view_signals:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                String strA3 = this.e.a(this.a, this.c);
                interaction.saneness.attabal(w03VarA, null);
                return strA3;
            }
            String strA4 = this.e.a(this.a);
            interaction.saneness.attabal(w03VarA, null);
            return strA4;
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (th4 instanceof evenfall) {
                    throw th4;
                }
                w03VarA.a(th4);
                if (th4 instanceof TimeoutCancellationException) {
                    throw new cp0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new bn0(th4);
                }
                if (th4 instanceof yn0) {
                    throw th4;
                }
                throw new gn0(th4);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }

    @JavascriptInterface
    public final void notify(String url) throws InterruptedException {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0) {
            return;
        }
        pq0 pq0VarB = this.a.b();
        Uri uri = Uri.parse(url);
        pq0VarB.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        taiyuan.saneness(null, new iq0(pq0VarB, uri, null), 1, null);
    }

    @JavascriptInterface
    public final void notifyResult(String resultJsonString) throws InterruptedException {
        Intrinsics.checkNotNullParameter(resultJsonString, "resultJsonString");
        pq0 pq0VarB = this.a.b();
        pq0VarB.getClass();
        Intrinsics.checkNotNullParameter(resultJsonString, "resultJsonString");
        taiyuan.saneness(null, new jq0(pq0VarB, resultJsonString, null), 1, null);
    }
}
