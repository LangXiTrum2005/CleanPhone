package com.p004ironsource;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.AdapterUtils;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0005\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0014R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006 "}, d2 = {"Lcom/ironsource/l6;", "Lcom/ironsource/n1;", "Lcom/ironsource/mediationsdk/ISBannerSize;", "m", k6.f25513u, "a", "Lcom/ironsource/xw;", "viewBinder", "Lcom/ironsource/w1;", "displayListener", "", "Lcom/ironsource/c0;", "Lcom/ironsource/p1;", "b", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/o6;", "kotlin.jvm.PlatformType", "k", "Ljava/lang/ref/WeakReference;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/l6$a;", "l", "Lcom/ironsource/l6$a;", "adInstanceListener", "Lcom/ironsource/m6;", "Lcom/ironsource/m6;", "bannerAdUnitData", "Lcom/ironsource/m1;", "tools", "adUnitData", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/m6;Lcom/ironsource/o6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class l6 extends n1 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final WeakReference<o6> listener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a adInstanceListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final m6 bannerAdUnitData;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ironsource/l6$a;", "Lcom/ironsource/n1$a;", "Lcom/ironsource/n1;", "Lcom/ironsource/z5;", "Lcom/ironsource/z;", m5.f25675p, "", "b", "Lcom/ironsource/x5;", "c", "a", "<init>", "(Lcom/ironsource/l6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public final class a extends n1.a implements z5 {
        public a() {
            super();
        }

        @Override // com.p004ironsource.z5
        public void a(x5 instance) {
            Intrinsics.f(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.getInstanceSignature()));
            o6 o6Var = (o6) l6.this.listener.get();
            if (o6Var != null) {
                o6Var.j();
            }
        }

        @Override // com.p004ironsource.z5
        public void b(x5 instance) {
            Intrinsics.f(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.getInstanceSignature()));
            o6 o6Var = (o6) l6.this.listener.get();
            if (o6Var != null) {
                o6Var.m();
            }
        }

        @Override // com.p004ironsource.z5
        public void c(x5 instance) {
            Intrinsics.f(instance, "instance");
            IronLog.INTERNAL.verbose(l6.this.a(instance.getInstanceSignature()));
            o6 o6Var = (o6) l6.this.listener.get();
            if (o6Var != null) {
                o6Var.k();
            }
        }

        @Override // com.ironsource.n1.a, com.p004ironsource.InterfaceC3350d0
        public void b(AbstractC3389z instance) {
            Intrinsics.f(instance, "instance");
            super.b(instance);
            w1 displayListener = l6.this.getDisplayListener();
            if (displayListener != null) {
                displayListener.b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m1 tools, m6 adUnitData, o6 listener) {
        String str;
        int iB;
        super(tools, adUnitData, listener, null, 8, null);
        Intrinsics.f(tools, "tools");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(listener, "listener");
        this.listener = new WeakReference<>(listener);
        this.adInstanceListener = new a();
        this.bannerAdUnitData = adUnitData;
        Placement placementG = g();
        IronLog.INTERNAL.verbose("placement = " + placementG);
        if (placementG == null || TextUtils.isEmpty(placementG.getPlacementName())) {
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{placementG == null ? "placement is null" : "placement name is empty"}, 1));
            iB = y1.b(adUnitData.getAdProperties().getAdFormat());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    @Override // com.p004ironsource.n1
    public InterfaceC3348c0 a() {
        return new O(this, 1);
    }

    @Override // com.p004ironsource.n1
    public p1 b() {
        return new s6(this.bannerAdUnitData.getAdProperties(), a(m()));
    }

    private final ISBannerSize a(ISBannerSize bannerSize) {
        if (bannerSize.isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? l.a() : ISBannerSize.BANNER;
        }
        return bannerSize;
    }

    private final ISBannerSize m() {
        return getAdUnitTools().a(this.bannerAdUnitData.getAdProperties().getAdSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3389z a(l6 this$0, C3344a0 instanceData, C3357g0 adInstancePayload) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(instanceData, "instanceData");
        Intrinsics.f(adInstancePayload, "adInstancePayload");
        return new x5(new u2(this$0.getAdUnitTools(), c2.b.PROVIDER), instanceData, adInstancePayload, this$0.adInstanceListener);
    }

    public final void a(xw viewBinder, w1 displayListener) {
        Intrinsics.f(displayListener, "displayListener");
        if (viewBinder != null) {
            a(new b6(viewBinder), displayListener);
        }
    }
}
