package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.du1;
import com.google.android.gms.internal.ads.eu1;
import com.google.android.gms.internal.consent_sdk.u6;
import com.google.android.gms.internal.consent_sdk.v6;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.r2;
import com.google.protobuf.z3;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f4099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f4100e;

    public /* synthetic */ h1(AbstractMap abstractMap, int i10) {
        this.f4096a = i10;
        this.f4100e = abstractMap;
        this.f4097b = -1;
    }

    public Iterator a() {
        switch (this.f4096a) {
            case 0:
                if (this.f4099d == null) {
                    this.f4099d = ((f1) this.f4100e).f4075b.entrySet().iterator();
                }
                break;
            case 4:
                if (this.f4099d == null) {
                    this.f4099d = ((z3) this.f4100e).f25061c.entrySet().iterator();
                }
                break;
            default:
                if (this.f4099d == null) {
                    this.f4099d = ((zl.x) this.f4100e).f55091c.entrySet().iterator();
                }
                break;
        }
        return this.f4099d;
    }

    public Iterator b() {
        switch (this.f4096a) {
            case 1:
                if (this.f4099d == null) {
                    this.f4099d = ((du1) this.f4100e).f13725c.entrySet().iterator();
                }
                break;
            case 2:
                if (this.f4099d == null) {
                    this.f4099d = ((u6) this.f4100e).f23215c.entrySet().iterator();
                }
                break;
            default:
                if (this.f4099d == null) {
                    this.f4099d = ((q2) this.f4100e).f23880c.entrySet().iterator();
                }
                break;
        }
        return this.f4099d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4096a) {
            case 0:
                int i10 = this.f4097b + 1;
                f1 f1Var = (f1) this.f4100e;
                if (i10 >= f1Var.f4074a.size()) {
                    return !f1Var.f4075b.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i11 = this.f4097b + 1;
                du1 du1Var = (du1) this.f4100e;
                if (i11 >= du1Var.f13724b) {
                    return !du1Var.f13725c.isEmpty() && b().hasNext();
                }
                return true;
            case 2:
                int i12 = this.f4097b + 1;
                u6 u6Var = (u6) this.f4100e;
                if (i12 >= u6Var.f23214b) {
                    return !u6Var.f23215c.isEmpty() && b().hasNext();
                }
                return true;
            case 3:
                int i13 = this.f4097b + 1;
                q2 q2Var = (q2) this.f4100e;
                if (i13 >= q2Var.f23879b) {
                    return !q2Var.f23880c.isEmpty() && b().hasNext();
                }
                return true;
            case 4:
                int i14 = this.f4097b + 1;
                z3 z3Var = (z3) this.f4100e;
                if (i14 >= z3Var.f25060b.size()) {
                    return !z3Var.f25061c.isEmpty() && a().hasNext();
                }
                return true;
            default:
                return this.f4097b + 1 < ((zl.x) this.f4100e).f55090b.size() || a().hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4096a) {
            case 0:
                this.f4098c = true;
                int i10 = this.f4097b + 1;
                this.f4097b = i10;
                f1 f1Var = (f1) this.f4100e;
                return i10 < f1Var.f4074a.size() ? (Map.Entry) f1Var.f4074a.get(this.f4097b) : (Map.Entry) a().next();
            case 1:
                this.f4098c = true;
                int i11 = this.f4097b + 1;
                this.f4097b = i11;
                du1 du1Var = (du1) this.f4100e;
                return i11 < du1Var.f13724b ? (eu1) du1Var.f13723a[i11] : (Map.Entry) b().next();
            case 2:
                this.f4098c = true;
                int i12 = this.f4097b + 1;
                this.f4097b = i12;
                u6 u6Var = (u6) this.f4100e;
                return i12 < u6Var.f23214b ? (v6) u6Var.f23213a[i12] : (Map.Entry) b().next();
            case 3:
                this.f4098c = true;
                int i13 = this.f4097b + 1;
                this.f4097b = i13;
                q2 q2Var = (q2) this.f4100e;
                return i13 < q2Var.f23879b ? (r2) q2Var.f23878a[i13] : (Map.Entry) b().next();
            case 4:
                this.f4098c = true;
                int i14 = this.f4097b + 1;
                this.f4097b = i14;
                z3 z3Var = (z3) this.f4100e;
                return i14 < z3Var.f25060b.size() ? (Map.Entry) z3Var.f25060b.get(this.f4097b) : (Map.Entry) a().next();
            default:
                this.f4098c = true;
                int i15 = this.f4097b + 1;
                this.f4097b = i15;
                zl.x xVar = (zl.x) this.f4100e;
                return i15 < xVar.f55090b.size() ? (Map.Entry) xVar.f55090b.get(this.f4097b) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f4096a;
        AbstractMap abstractMap = this.f4100e;
        switch (i10) {
            case 0:
                f1 f1Var = (f1) abstractMap;
                if (!this.f4098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4098c = false;
                int i11 = f1.f4073f;
                f1Var.b();
                if (this.f4097b >= f1Var.f4074a.size()) {
                    a().remove();
                    return;
                }
                int i12 = this.f4097b;
                this.f4097b = i12 - 1;
                f1Var.h(i12);
                return;
            case 1:
                if (!this.f4098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4098c = false;
                du1 du1Var = (du1) abstractMap;
                du1Var.f();
                int i13 = this.f4097b;
                if (i13 >= du1Var.f13724b) {
                    b().remove();
                    return;
                } else {
                    this.f4097b = i13 - 1;
                    du1Var.d(i13);
                    return;
                }
            case 2:
                if (!this.f4098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4098c = false;
                u6 u6Var = (u6) abstractMap;
                int i14 = u6.f23212g;
                u6Var.g();
                int i15 = this.f4097b;
                if (i15 >= u6Var.f23214b) {
                    b().remove();
                    return;
                } else {
                    this.f4097b = i15 - 1;
                    u6Var.e(i15);
                    return;
                }
            case 3:
                if (!this.f4098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4098c = false;
                q2 q2Var = (q2) abstractMap;
                q2Var.f();
                int i16 = this.f4097b;
                if (i16 >= q2Var.f23879b) {
                    b().remove();
                    return;
                } else {
                    this.f4097b = i16 - 1;
                    q2Var.d(i16);
                    return;
                }
            case 4:
                z3 z3Var = (z3) abstractMap;
                if (!this.f4098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4098c = false;
                int i17 = z3.f25058h;
                z3Var.b();
                if (this.f4097b >= z3Var.f25060b.size()) {
                    a().remove();
                    return;
                }
                int i18 = this.f4097b;
                this.f4097b = i18 - 1;
                z3Var.g(i18);
                return;
            default:
                zl.x xVar = (zl.x) abstractMap;
                if (!this.f4098c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4098c = false;
                int i19 = zl.x.f55088f;
                xVar.b();
                if (this.f4097b >= xVar.f55090b.size()) {
                    a().remove();
                    return;
                }
                int i20 = this.f4097b;
                this.f4097b = i20 - 1;
                xVar.f(i20);
                return;
        }
    }

    public /* synthetic */ h1(du1 du1Var) {
        this.f4096a = 1;
        Objects.requireNonNull(du1Var);
        this.f4100e = du1Var;
        this.f4097b = -1;
    }

    public /* synthetic */ h1(u6 u6Var) {
        this.f4096a = 2;
        Objects.requireNonNull(u6Var);
        this.f4100e = u6Var;
        this.f4097b = -1;
    }

    public /* synthetic */ h1(q2 q2Var) {
        this.f4096a = 3;
        Objects.requireNonNull(q2Var);
        this.f4100e = q2Var;
        this.f4097b = -1;
    }
}
