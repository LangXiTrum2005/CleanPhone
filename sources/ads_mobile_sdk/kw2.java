package ads_mobile_sdk;

import com.google.common.base.formularize;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import saneness.kamptulicon;
import saneness.redevelopment;

/* JADX INFO: loaded from: classes.dex */
public final class kw2 implements kamptulicon {
    public final x62 a;
    public final ExecutorService b;
    public final u13 c;

    public kw2(x62 x62Var, ExecutorService executorService, u13 u13Var) {
        this.a = x62Var;
        this.b = executorService;
        this.c = u13Var;
    }

    @Override // saneness.demented
    public final adultoid a() {
        return this.c.a(gf0.EVENT_ID_DG_STORAGE_GET_METADATA, arytenoidectomy.apical(new Callable() { // from class: saneness.lavolta
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37185kowloon.d();
            }
        }, this.b));
    }

    @Override // saneness.kamptulicon
    public final adultoid b() {
        return this.c.a(gf0.EVENT_ID_DG_STORAGE_GET_PROGRAM, arytenoidectomy.apical(new Callable() { // from class: saneness.friedmanite
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37153kowloon.e();
            }
        }, this.b));
    }

    @Override // saneness.demented
    public final adultoid c() {
        return arytenoidectomy.impromptu(Boolean.TRUE);
    }

    public final i72 d() {
        i72 i72VarA = this.a.a(1);
        return i72VarA == null ? i72.q() : i72VarA;
    }

    public final w62 e() {
        x62 x62Var = this.a;
        i72 i72VarA = x62Var.a(1);
        if (i72VarA == null) {
            x62Var.e.b(gf0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_GET_PROGRAM_BYTECODE_NOT_FOUND);
            return null;
        }
        String strR = i72VarA.r().r();
        File file = (File) formularize.triweekly(redevelopment.attabal(x62Var.a(), strR, "pcam.jar"));
        if (!file.exists()) {
            file = (File) formularize.triweekly(redevelopment.attabal(x62Var.a(), strR, "pcam"));
        }
        File file2 = (File) formularize.triweekly(redevelopment.attabal(x62Var.a(), strR, "pcopt"));
        return new w62(i72VarA.r(), file, (File) formularize.triweekly(redevelopment.attabal(x62Var.a(), strR, "pcbc")), file2);
    }

    @Override // saneness.demented
    public final adultoid a(final i72 i72Var, final byte[] bArr) {
        return this.c.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE, arytenoidectomy.apical(new Callable() { // from class: saneness.silty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37311kowloon.b(i72Var, bArr);
            }
        }, this.b));
    }

    public final /* synthetic */ Void b(i72 i72Var, byte[] bArr) {
        this.a.a(i72Var, null, bArr);
        return null;
    }

    public final /* synthetic */ Void b(i72 i72Var, byte[] bArr, byte[] bArr2) {
        this.a.a(i72Var, bArr, bArr2);
        return null;
    }

    @Override // saneness.demented
    public final adultoid a(final i72 i72Var, final byte[] bArr, final byte[] bArr2) {
        return this.c.a(gf0.EVENT_ID_DG_STORAGE_UPDATE_VM_AND_PROGRAM_BYTECODE, arytenoidectomy.apical(new Callable() { // from class: saneness.polonize
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37256kowloon.b(i72Var, bArr, bArr2);
            }
        }, this.b));
    }
}
