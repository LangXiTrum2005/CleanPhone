package ads_mobile_sdk;

import ads_mobile_sdk.i72;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kaif.competently;
import saneness.delouse;
import saneness.kamptulicon;
import saneness.redevelopment;

/* JADX INFO: loaded from: classes.dex */
public final class sv2 implements kamptulicon {
    public final pv2 a;
    public final pv2 b;
    public final pv2 c;
    public final pv2 d;
    public final delouse e;
    public final delouse f;
    public final File g;
    public final ExecutorService h;
    public final u13 i;

    public sv2(pv2 pv2Var, pv2 pv2Var2, delouse delouseVar, pv2 pv2Var3, pv2 pv2Var4, delouse delouseVar2, File file, ExecutorService executorService, u13 u13Var) {
        this.a = pv2Var;
        this.c = pv2Var2;
        this.e = delouseVar;
        this.b = pv2Var3;
        this.d = pv2Var4;
        this.f = delouseVar2;
        this.g = file;
        this.h = executorService;
        this.i = u13Var;
    }

    @Override // saneness.demented
    public final adultoid a() {
        return this.i.a(gf0.EVENT_ID_DG_STORAGE_GET_METADATA, this.a.a());
    }

    @Override // saneness.kamptulicon
    public final adultoid b() {
        return this.i.a(gf0.EVENT_ID_DG_STORAGE_GET_PROGRAM, cutely.restrictive(this.a.a()).merc(new marial() { // from class: saneness.federative
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37149kowloon.a((i72) obj);
            }
        }, rotuma.attabal()));
    }

    @Override // saneness.demented
    public final adultoid c() {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.sorbian
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f37316kowloon.d());
            }
        }, this.h);
    }

    public final boolean d() {
        try {
            File file = this.b.a;
            if (!file.exists()) {
                return false;
            }
            File file2 = ((pv2) this.f.get()).a;
            File file3 = ((pv2) this.e.get()).a;
            try {
                if (file2.exists()) {
                    File parentFile = file3.getParentFile();
                    if (parentFile != null) {
                        redevelopment.dern(parentFile);
                    }
                    competently.wireman(file3);
                    competently.marial(file2, file3);
                }
                File file4 = this.d.a;
                File file5 = this.c.a;
                try {
                    if (file4.exists()) {
                        competently.wireman(file5);
                        competently.marial(file4, file5);
                    }
                    File file6 = this.a.a;
                    try {
                        if (file.exists()) {
                            competently.wireman(file6);
                            competently.marial(file, file6);
                        }
                        return true;
                    } catch (IOException | SecurityException e) {
                        u13 u13Var = this.i;
                        gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
                        ((kc1) u13Var.a).a(15312, -1L, e, null);
                        return false;
                    }
                } catch (IOException | SecurityException e2) {
                    u13 u13Var2 = this.i;
                    gf0 gf0Var2 = gf0.EVENT_ID_UNSPECIFIED;
                    ((kc1) u13Var2.a).a(15311, -1L, e2, null);
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
                Throwable th = e;
                u13 u13Var3 = this.i;
                gf0 gf0Var3 = gf0.EVENT_ID_UNSPECIFIED;
                ((kc1) u13Var3.a).a(15310, -1L, th, null);
                return false;
            } catch (SecurityException e4) {
                e = e4;
                Throwable th2 = e;
                u13 u13Var4 = this.i;
                gf0 gf0Var4 = gf0.EVENT_ID_UNSPECIFIED;
                ((kc1) u13Var4.a).a(15310, -1L, th2, null);
                return false;
            }
        } finally {
            this.b.a.delete();
            ((pv2) this.f.get()).a.delete();
            this.d.a.delete();
        }
    }

    public final w62 a(i72 i72Var) {
        if (i72Var == null || i72Var.equals(i72.q())) {
            return null;
        }
        return new w62(i72Var.r(), ((pv2) this.e.get()).a, this.c.a, this.g);
    }

    public final adultoid a(i72 i72Var, Void r4) {
        return this.i.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_METADATA, this.b.a(i72Var));
    }

    public final adultoid a(i72 i72Var, List list) {
        return this.i.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_METADATA, this.b.a(i72Var));
    }

    @Override // saneness.demented
    public final adultoid a(final i72 i72Var, byte[] bArr) {
        return cutely.restrictive(this.i.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE, this.d.a(bArr))).polder(new impromptu() { // from class: saneness.aptotic
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37057attabal.a(i72Var, (Void) obj);
            }
        }, rotuma.attabal());
    }

    @Override // saneness.demented
    public final adultoid a(final i72 i72Var, byte[] bArr, byte[] bArr2) {
        return cutely.restrictive(arytenoidectomy.dern(this.i.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_VM, ((pv2) this.f.get()).a(bArr)), this.i.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE, this.d.a(bArr2)))).polder(new impromptu() { // from class: saneness.pangene
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37242attabal.a(i72Var, (List) obj);
            }
        }, rotuma.attabal());
    }
}
