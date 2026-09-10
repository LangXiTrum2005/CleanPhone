package com.p004ironsource;

import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0014J\b\u0010\u0007\u001a\u00020\nH\u0014J$\u0010\u0012\u001a\u00020\n2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0010H\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/kq;", "Lcom/ironsource/u7;", "Lcom/ironsource/zb;", "event", "", "j", "currentEvent", "d", "", "c", "", f.j, "eventId", "", "e", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "combinedEvents", "a", g.f40227p, h.f36614b, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class kq extends u7 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final kq f25536P;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/ironsource/kq$a;", "", "", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public final void a() {
            new hk().b(ContextProvider.getInstance().getApplicationContext());
            kq.f25536P.a(new zb(ac.INIT_DEFERRED_DATA, new vi().a()));
        }
    }

    static {
        kq kqVar = new kq();
        f25536P = kqVar;
        kqVar.H = "outcome";
        kqVar.G = 0;
        kqVar.f27380I = IronSourceConstants.PIXEL_EVENT_TYPE;
        kqVar.e();
    }

    private kq() {
    }

    @Override // com.p004ironsource.u7
    public void a(ArrayList<zb> combinedEvents) {
    }

    @Override // com.p004ironsource.u7
    public int c(zb event) {
        return 1;
    }

    @Override // com.p004ironsource.u7
    public void d() {
    }

    @Override // com.p004ironsource.u7
    public String e(int eventId) {
        return "";
    }

    @Override // com.p004ironsource.u7
    public void f(zb event) {
    }

    @Override // com.p004ironsource.u7
    public boolean g(zb event) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean h(zb event) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean j(zb event) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean d(zb currentEvent) {
        return true;
    }
}
