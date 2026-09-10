package ads_mobile_sdk;

import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import saneness.delouse;
import saneness.fatness;
import saneness.isoparametric;
import saneness.patty;

/* JADX INFO: loaded from: classes.dex */
public final class mw2 implements isoparametric {
    public final pv2 a;
    public final pv2 b;
    public final delouse c;
    public final patty d;
    public final u13 e;
    public final ExecutorService f;

    public mw2(pv2 pv2Var, pv2 pv2Var2, delouse delouseVar, patty pattyVar, ExecutorService executorService, u13 u13Var) {
        this.a = pv2Var;
        this.b = pv2Var2;
        this.c = delouseVar;
        this.d = pattyVar;
        this.e = u13Var;
        this.f = executorService;
    }

    @Override // saneness.demented
    public final adultoid a() {
        return this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_GET_METADATA, this.a.a());
    }

    @Override // saneness.demented
    public final adultoid c() {
        return arytenoidectomy.impromptu(Boolean.TRUE);
    }

    public final adultoid d() {
        return this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_BYTECODE, arytenoidectomy.apical(new Callable() { // from class: saneness.neanderthalian
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37219kowloon.e();
            }
        }, this.f));
    }

    public final /* synthetic */ byte[] e() {
        this.d.getClass();
        return fatness.saneness("", false);
    }

    public final adultoid a(i72 i72Var, Void r4) {
        return this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA, this.a.a(i72Var));
    }

    public final adultoid a(i72 i72Var, List list) {
        return this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA, this.a.a(i72Var));
    }

    @Override // saneness.demented
    public final adultoid a(final i72 i72Var, byte[] bArr) {
        return cutely.restrictive(this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE, this.b.a(bArr))).polder(new impromptu() { // from class: saneness.sabbathbreaker
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37300attabal.a(i72Var, (Void) obj);
            }
        }, rotuma.attabal());
    }

    @Override // saneness.demented
    public final adultoid a(final i72 i72Var, byte[] bArr, byte[] bArr2) {
        return cutely.restrictive(arytenoidectomy.dern(this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_UPDATE_VM, ((pv2) this.c.get()).a(bArr)), this.e.a(gf0.EVENT_ID_ORCAS_STORAGE_UPDATE_PROGRAM_BYTECODE, this.b.a(bArr2)))).polder(new impromptu() { // from class: saneness.robbia
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37295attabal.a(i72Var, (List) obj);
            }
        }, rotuma.attabal());
    }
}
