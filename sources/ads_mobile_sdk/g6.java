package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.time.DurationUnit;
import saneness.capsulated;
import saneness.dagger;
import saneness.darlene;
import saneness.evenfall;
import saneness.improviser;
import saneness.inceptive;
import saneness.swimathon;
import saneness.taiyuan;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends ox0 {
    public final Context c;
    public final jk0 d;
    public final ip0 e;
    public final x f;
    public final ns g;
    public final String h;
    public final ri2 i;
    public c5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context applicationContext, jk0 flags, ip0 gmaUtil, x activityTracker, ns concurrencyObjects, String afmaVersion, ri2 rootTraceCreator) {
        super(no0.CUI_NAME_SDKINIT_INIT_SPAM, 2);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.c = applicationContext;
        this.d = flags;
        this.e = gmaUtil;
        this.f = activityTracker;
        this.g = concurrencyObjects;
        this.h = afmaVersion;
        this.i = rootTraceCreator;
    }

    public final String a(View view, String clickString) {
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        c5 c5VarB = b();
        String strA = c5VarB.a.a(c(), clickString, view, this.f.b());
        Intrinsics.checkNotNullExpressionValue(strA, "getClickSignals(...)");
        return strA;
    }

    public final c5 b() {
        c5 c5Var = this.j;
        if (c5Var != null) {
            return c5Var;
        }
        Intrinsics.preprohormone("adShieldClient");
        return null;
    }

    public final Context c() {
        Activity activityB = this.f.b();
        return activityB != null ? activityB : this.c;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        c5 c5Var;
        Context context = this.c;
        ms msVar = this.g.c;
        capsulated flags = this.d.u;
        Intrinsics.checkNotNullParameter(flags, "flags");
        swimathon builder = j5.M();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(i5.GMA, "value");
        builder.kowloon();
        flags.getClass();
        Intrinsics.checkNotNullParameter("gads:ad_spam_gass_call:enabled", X3.i.W);
        Boolean bool = Boolean.TRUE;
        jk jkVar = zk.b;
        builder.polloi(((Boolean) flags.a("gads:ad_spam_gass_call:enabled", bool, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_af:enabled", X3.i.W);
        builder.competently(((Boolean) flags.a("gads:as_af:enabled", bool, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_afsp:enabled", X3.i.W);
        Boolean bool2 = Boolean.FALSE;
        builder.apical(((Boolean) flags.a("gads:as_afsp:enabled", bool2, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_fisp:enabled", X3.i.W);
        builder.preprohormone(((Boolean) flags.a("gads:as_fisp:enabled", bool2, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_rav", X3.i.W);
        y5 value = y5.a(((Number) flags.a("gads:as_rav", 1, zk.f)).intValue());
        if (value == null) {
            value = y5.ADSHIELD_VERSION_1;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        builder.marial(value);
        inceptive builder2 = nc1.t();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        Intrinsics.checkNotNullParameter("gads:as_rcs", X3.i.W);
        Intrinsics.checkNotNullParameter("https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", "defaultValue");
        xk xkVar = zk.o;
        String value2 = (String) flags.a("gads:as_rcs", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", xkVar);
        Intrinsics.checkNotNullParameter(value2, "value");
        builder2.wireman(value2);
        Intrinsics.checkNotNullParameter("gads:as_lsr", X3.i.W);
        builder2.attabal(((Number) flags.a("gads:as_lsr", Float.valueOf(0.01f), zk.e)).floatValue());
        Intrinsics.checkNotNullParameter("gads:as_lbs", X3.i.W);
        sk skVar = zk.d;
        builder2.dern(((Number) flags.a("gads:as_lbs", 1000L, skVar)).longValue());
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        long jAdultoid = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(1, durationUnit));
        Intrinsics.checkNotNullParameter("gads:as_li_ms", X3.i.W);
        builder2.marial(((Number) flags.a("gads:as_li_ms", Long.valueOf(jAdultoid), skVar)).longValue());
        xm0 xm0VarA = builder2.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        nc1 value3 = (nc1) xm0VarA;
        Intrinsics.checkNotNullParameter(value3, "value");
        builder.dern(value3);
        Intrinsics.checkNotNullParameter("gads:as_vsb:enabled", X3.i.W);
        builder.rotuma(((Boolean) flags.a("gads:as_vsb:enabled", bool2, jkVar)).booleanValue());
        DurationUnit durationUnit2 = DurationUnit.SECONDS;
        long jAdultoid2 = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(1, durationUnit2));
        Intrinsics.checkNotNullParameter("gads:as_st_ms", X3.i.W);
        builder.gintrap(((Number) flags.a("gads:as_st_ms", Long.valueOf(jAdultoid2), skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_asqs_ms", X3.i.W);
        builder.attabal(((Number) flags.a("gads:as_asqs_ms", 100L, skVar)).longValue());
        long jAdultoid3 = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(5, durationUnit2));
        Intrinsics.checkNotNullParameter("gads:as_asw_ms", X3.i.W);
        builder.taiyuan(((Number) flags.a("gads:as_asw_ms", Long.valueOf(jAdultoid3), skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_emassqs:enabled", X3.i.W);
        builder.dovishness(((Boolean) flags.a("gads:as_emassqs:enabled", bool, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_gst_ms", X3.i.W);
        builder.formularize(((Number) flags.a("gads:as_gst_ms", 200L, skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_list_ms", X3.i.W);
        builder.molybdenite(((Number) flags.a("gads:as_list_ms", 200L, skVar)).longValue());
        long jAdultoid4 = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(10, durationUnit));
        Intrinsics.checkNotNullParameter("gads:as_hrt_ms", X3.i.W);
        builder.monoploid(((Number) flags.a("gads:as_hrt_ms", Long.valueOf(jAdultoid4), skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_pic", X3.i.W);
        Intrinsics.checkNotNullParameter("", "defaultValue");
        String value4 = (String) flags.a("gads:as_pic", "", xkVar);
        Intrinsics.checkNotNullParameter(value4, "value");
        builder.impassible(value4);
        Intrinsics.checkNotNullParameter("gads:as_dic", X3.i.W);
        Intrinsics.checkNotNullParameter("", "defaultValue");
        String value5 = (String) flags.a("gads:as_dic", "", xkVar);
        Intrinsics.checkNotNullParameter(value5, "value");
        builder.beachfront(value5);
        long jAdultoid5 = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(500, DurationUnit.MILLISECONDS));
        Intrinsics.checkNotNullParameter("gads:as_mt_ms", X3.i.W);
        builder.adultoid(((Number) flags.a("gads:as_mt_ms", Long.valueOf(jAdultoid5), skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_caau:enabled", X3.i.W);
        builder.triweekly(((Boolean) flags.a("gads:as_caau:enabled", bool, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_ls:enabled", X3.i.W);
        builder.graveside(((Boolean) flags.a("gads:as_ls:enabled", bool2, jkVar)).booleanValue());
        improviser builder3 = t72.w();
        Intrinsics.checkNotNullExpressionValue(builder3, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder3, "builder");
        Intrinsics.checkNotNullParameter("gads:as_ubi:enabled", X3.i.W);
        builder3.beachfront(((Boolean) flags.a("gads:as_ubi:enabled", bool2, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_aspud_ms", X3.i.W);
        builder3.attabal(((Number) flags.a("gads:as_aspud_ms", 0L, skVar)).longValue());
        long jAdultoid6 = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(1, DurationUnit.HOURS));
        Intrinsics.checkNotNullParameter("gads:as_pae_ms", X3.i.W);
        builder3.competently(((Number) flags.a("gads:as_pae_ms", Long.valueOf(jAdultoid6), skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_pru", X3.i.W);
        Intrinsics.checkNotNullParameter("https://pagead2.googlesyndication.com/mads/asp", "defaultValue");
        String value6 = (String) flags.a("gads:as_pru", "https://pagead2.googlesyndication.com/mads/asp", xkVar);
        Intrinsics.checkNotNullParameter(value6, "value");
        builder3.dern(value6);
        Intrinsics.checkNotNullParameter("gads:as_rpd:enabled", X3.i.W);
        builder3.wireman(((Boolean) flags.a("gads:as_rpd:enabled", bool2, jkVar)).booleanValue());
        Intrinsics.checkNotNullParameter("gads:as_mrpda", X3.i.W);
        builder3.marial(((Number) flags.a("gads:as_mrpda", 5L, skVar)).longValue());
        Intrinsics.checkNotNullParameter("gads:as_rbi_ms", X3.i.W);
        builder3.impromptu(((Number) flags.a("gads:as_rbi_ms", Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS), skVar)).longValue());
        xm0 xm0VarA2 = builder3.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
        t72 value7 = (t72) xm0VarA2;
        Intrinsics.checkNotNullParameter(value7, "value");
        builder.wireman(value7);
        xm0 xm0VarA3 = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA3, "build(...)");
        j5 j5Var = (j5) ((swimathon) ((j5) xm0VarA3).n()).impromptu(this.h).a();
        synchronized (c5.b) {
            try {
                if (c5.c == null) {
                    context.getClass();
                    msVar.getClass();
                    c5.c = new c5(new d40(new dagger(), new darlene(), new taiyuan(), msVar, context, j5Var));
                }
                c5Var = c5.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Intrinsics.checkNotNullExpressionValue(c5Var, "getInstance(...)");
        Intrinsics.checkNotNullParameter(c5Var, "<set-?>");
        this.j = c5Var;
        b().a.a.a();
        return new tn0(Unit.f29295attabal);
    }

    public final String b(List viewUris, View view) {
        String strB;
        Intrinsics.checkNotNullParameter(viewUris, "viewUris");
        if ((viewUris instanceof Collection) && viewUris.isEmpty()) {
            return "";
        }
        Iterator it = viewUris.iterator();
        while (it.hasNext()) {
            if (this.e.b((Uri) it.next())) {
                ri2 ri2Var = this.i;
                no0 no0Var = no0.CUI_NAME_VIEW_SIGNALS;
                List listFormularize = adultoid.formularize();
                l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                if (j13.b().a == null) {
                    v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                    try {
                        c5 c5VarB = b();
                        strB = c5VarB.a.b(c(), a(viewUris), view, this.f.b());
                        interaction.saneness.attabal(v62VarA, null);
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
                } else {
                    w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                    try {
                        c5 c5VarB2 = b();
                        strB = c5VarB2.a.b(c(), a(viewUris), view, this.f.b());
                        interaction.saneness.attabal(w03VarA, null);
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
                Intrinsics.beachfront(strB);
                return strB;
            }
        }
        return "";
    }

    public final String a(ViewGroup viewGroup) {
        c5 c5VarB = b();
        String strB = c5VarB.a.b(c(), null, viewGroup, this.f.b());
        Intrinsics.checkNotNullExpressionValue(strB, "getViewSignals(...)");
        return strB;
    }

    public final String a(gq0 gq0Var, a22 a22Var) {
        AtomicLong atomicLongA;
        String strA = a(gq0Var);
        long j = (a22Var == null || (atomicLongA = a22Var.a()) == null) ? 0L : atomicLongA.get();
        if (j > 0) {
            return "{\"ms\": \"" + strA + "\", \"plcmtid\": " + j + "}";
        }
        return "{\"ms\": \"" + strA + "\"}";
    }

    public final Uri a(Uri uri, View view) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(view, "view");
        String strA = a(graveside.marial(uri), view);
        if (StringsKt.empress(strA)) {
            return uri;
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter("ms", strA).build();
        Intrinsics.beachfront(uriBuild);
        return uriBuild;
    }

    public final String a(List clickUris, View view) {
        String strA;
        Intrinsics.checkNotNullParameter(clickUris, "clickUris");
        if (!(clickUris instanceof Collection) || !clickUris.isEmpty()) {
            Iterator it = clickUris.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                ip0 ip0Var = this.e;
                ip0Var.getClass();
                Intrinsics.checkNotNullParameter(uri, "uri");
                if (ip0Var.b(uri) && ip0Var.a(uri)) {
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    String queryParameter = uri.getQueryParameter("ms");
                    if (queryParameter == null || StringsKt.empress(queryParameter)) {
                        ri2 ri2Var = this.i;
                        no0 no0Var = no0.CUI_NAME_CLICK_SIGNALS;
                        List listFormularize = adultoid.formularize();
                        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                        if (j13.b().a == null) {
                            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                            try {
                                c5 c5VarB = b();
                                strA = c5VarB.a.a(c(), a(clickUris), view, this.f.b());
                                interaction.saneness.attabal(v62VarA, null);
                            } catch (Throwable th) {
                                try {
                                    v62VarA.b(th);
                                    if (!(th instanceof evenfall)) {
                                        v62VarA.a(th);
                                        if (!(th instanceof TimeoutCancellationException)) {
                                            if (!(th instanceof CancellationException)) {
                                                if (th instanceof yn0) {
                                                    throw th;
                                                }
                                                throw new gn0(th);
                                            }
                                            throw new bn0(th);
                                        }
                                        throw new cp0(th);
                                    }
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        interaction.saneness.attabal(v62VarA, th2);
                                        throw th3;
                                    }
                                }
                            }
                        } else {
                            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                            try {
                                c5 c5VarB2 = b();
                                strA = c5VarB2.a.a(c(), a(clickUris), view, this.f.b());
                                interaction.saneness.attabal(w03VarA, null);
                            } catch (Throwable th4) {
                                try {
                                    w03VarA.b(th4);
                                    if (!(th4 instanceof evenfall)) {
                                        w03VarA.a(th4);
                                        if (!(th4 instanceof TimeoutCancellationException)) {
                                            if (!(th4 instanceof CancellationException)) {
                                                if (th4 instanceof yn0) {
                                                    throw th4;
                                                }
                                                throw new gn0(th4);
                                            }
                                            throw new bn0(th4);
                                        }
                                        throw new cp0(th4);
                                    }
                                    throw th4;
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
                        Intrinsics.beachfront(strA);
                        return strA;
                    }
                }
            }
            return "";
        }
        return "";
    }

    public final void b(List stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        vu2 vu2Var = b().a.c.b;
        synchronized (vu2Var) {
            vu2Var.a.clear();
            vu2Var.a.addAll(stackTrace);
        }
    }

    public final String a(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Uri uri = (Uri) next;
            if (this.e.b(uri) && uri.getQueryParameter("ai") != null) {
                break;
            }
        }
        Uri uri2 = (Uri) next;
        if (uri2 == null) {
            return null;
        }
        return uri2.getQueryParameter("ai");
    }
}
