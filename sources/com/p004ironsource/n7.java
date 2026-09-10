package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.p004ironsource.mediationsdk.h;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.o7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n7<Smash extends o7<?>, Listener extends AdapterAdInteractionListener> extends p7<Smash, Listener> implements h2 {

    public class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f26238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Placement f26239b;

        public a(Activity activity, Placement placement) {
            this.f26238a = activity;
            this.f26239b = placement;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            n7.this.b(this.f26238a, this.f26239b);
        }
    }

    public n7(fg fgVar, eg egVar, t0 t0Var, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(fgVar, egVar, t0Var, xkVar, ironSourceSegment);
    }

    private String a(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb.append(smash.c());
                sb.append(":");
                sb.append(smash.e());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, Placement placement) {
        o7 o7Var;
        IronSourceError ironSourceError;
        String strA;
        IronLog.INTERNAL.verbose(b("state = " + this.f26467p));
        synchronized (this.x) {
            try {
                this.f26464i = placement;
                this.s.f24488i.a(activity, n());
                p7.f fVar = this.f26467p;
                p7.f fVar2 = p7.f.SHOWING;
                o7Var = null;
                if (fVar == fVar2) {
                    ironSourceError = new IronSourceError(y1.g(this.o.getAdUnit()), "can't show ad while an ad is already showing");
                } else if (fVar != p7.f.READY_TO_SHOW) {
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
                } else if (placement == null) {
                    ironSourceError = new IronSourceError(y1.b(this.o.getAdUnit()), "empty default placement");
                } else if (this.f26455E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.o.getAdUnit())) {
                    ironSourceError = new IronSourceError(y1.f(this.o.getAdUnit()), "placement " + placement.getPlacementName() + " is capped");
                } else {
                    ironSourceError = null;
                }
                if (ironSourceError != null) {
                    IronLog.API.error(b(ironSourceError.getErrorMessage()));
                    strA = "";
                } else {
                    List listB = this.f26459a.b();
                    px pxVar = new px(this.o);
                    o7Var = (o7) pxVar.c(listB);
                    a(o7Var, (List<o7>) pxVar.b(listB));
                    if (o7Var != null) {
                        a(fVar2);
                        i(o7Var);
                    } else {
                        ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.o.getAdUnit().toString());
                        strA = a(listB);
                    }
                }
                a(ironSourceError, strA);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o7Var != null) {
            a(activity, (o7<?>) o7Var, this.f26464i);
        }
    }

    @Override // com.p004ironsource.h2
    public void c(o7<?> o7Var) {
        IronLog.INTERNAL.verbose(b(o7Var.k()));
        this.t.a();
    }

    @Override // com.p004ironsource.h2
    public String d() {
        StringBuilder sb = new StringBuilder();
        if (this.f26467p == p7.f.READY_TO_SHOW) {
            for (o7 o7Var : this.f26459a.b()) {
                if (o7Var.y()) {
                    sb.append(o7Var.c());
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.p004ironsource.p7
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.j && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f26459a.b().iterator();
        while (it.hasNext()) {
            if (((o7) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p004ironsource.p7
    public boolean v() {
        return false;
    }

    public n7(t0 t0Var, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(t0Var, xkVar, ironSourceSegment);
    }

    public void a(Activity activity, Placement placement) {
        if (c()) {
            a(new a(activity, placement));
        } else {
            b(activity, placement);
        }
    }

    @Override // com.p004ironsource.h2
    public void b(o7<?> o7Var) {
        IronLog.INTERNAL.verbose(b(o7Var.k()));
        this.t.g(o7Var.f());
    }

    @Override // com.p004ironsource.h2
    public void d(o7<?> o7Var) {
        IronLog.INTERNAL.verbose(b(o7Var.k()));
        this.t.b();
    }

    private void a(Activity activity, o7<?> o7Var, Placement placement) {
        if (this.o.getLoadingData().e()) {
            this.r.a();
        }
        o7Var.a(activity, placement);
    }

    @Override // com.p004ironsource.h2
    public void a(IronSourceError ironSourceError, o7<?> o7Var) {
        IronLog.INTERNAL.verbose(b(o7Var.k() + " - error = " + ironSourceError));
        this.f26460b.put(o7Var.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(p7.f.READY_TO_LOAD);
        a(ironSourceError, o7Var, "");
    }

    private void a(IronSourceError ironSourceError, o7<?> o7Var, String str) {
        this.s.f24488i.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.q.g();
        this.t.a(ironSourceError, o7Var != null ? o7Var.f() : null);
        if (this.o.getLoadingData().e()) {
            b(false);
        }
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (o7<?>) null, str);
    }

    @Override // com.p004ironsource.h2
    public void a(o7<?> o7Var) {
        IronLog.INTERNAL.verbose(b(o7Var.k()));
        if (this.f26467p == p7.f.SHOWING) {
            a(p7.f.READY_TO_LOAD);
        }
        this.q.f();
        this.t.a(o7Var.f());
    }

    private void a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }
}
