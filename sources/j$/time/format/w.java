package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateTimeFormatter f43133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43134b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43135c = true;
    private final ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f43136e;

    w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f43136e = null;
        this.f43133a = dateTimeFormatter;
        arrayList.add(new E());
    }

    final w d() {
        w wVar = new w(this.f43133a);
        wVar.f43134b = this.f43134b;
        wVar.f43135c = this.f43135c;
        return wVar;
    }

    final Locale i() {
        return this.f43133a.d();
    }

    final D g() {
        return this.f43133a.c();
    }

    final j$.time.chrono.m h() {
        j$.time.chrono.m mVar = e().f43078c;
        if (mVar != null) {
            return mVar;
        }
        j$.time.chrono.m mVarB = this.f43133a.b();
        return mVarB == null ? j$.time.chrono.t.d : mVarB;
    }

    final boolean b(char c2, char c3) {
        if (this.f43134b) {
            return c2 == c3;
        }
        return c(c2, c3);
    }

    final boolean k() {
        return this.f43134b;
    }

    final void m(boolean z2) {
        this.f43134b = z2;
    }

    final boolean s(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 + i4 <= charSequence.length() && i3 + i4 <= charSequence2.length()) {
            if (this.f43134b) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (charSequence.charAt(i2 + i5) == charSequence2.charAt(i3 + i5)) {
                    }
                }
                return true;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                char cCharAt = charSequence.charAt(i2 + i6);
                char cCharAt2 = charSequence2.charAt(i3 + i6);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    static boolean c(char c2, char c3) {
        return c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    final boolean l() {
        return this.f43135c;
    }

    final void q(boolean z2) {
        this.f43135c = z2;
    }

    final void r() {
        ArrayList arrayList = this.d;
        E e2 = e();
        e2.getClass();
        E e3 = new E();
        e3.f43076a.putAll(e2.f43076a);
        e3.f43077b = e2.f43077b;
        e3.f43078c = e2.f43078c;
        e3.d = e2.d;
        arrayList.add(e3);
    }

    final void f(boolean z2) {
        ArrayList arrayList = this.d;
        if (z2) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private E e() {
        ArrayList arrayList = this.d;
        return (E) arrayList.get(arrayList.size() - 1);
    }

    final TemporalAccessor t(F f) {
        E e2 = e();
        e2.f43078c = h();
        ZoneId zoneId = e2.f43077b;
        if (zoneId == null) {
            this.f43133a.getClass();
            zoneId = null;
        }
        e2.f43077b = zoneId;
        e2.r(f);
        return e2;
    }

    final Long j(j$.time.temporal.a aVar) {
        return (Long) e().f43076a.get(aVar);
    }

    final int o(j$.time.temporal.r rVar, long j, int i2, int i3) {
        Objects.requireNonNull(rVar, "field");
        Long l2 = (Long) e().f43076a.put(rVar, Long.valueOf(j));
        return (l2 == null || l2.longValue() == j) ? i3 : ~i2;
    }

    final void a(o oVar) {
        if (this.f43136e == null) {
            this.f43136e = new ArrayList();
        }
        this.f43136e.add(oVar);
    }

    final void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().f43077b = zoneId;
    }

    final void p() {
        e().d = true;
    }

    public final String toString() {
        return e().toString();
    }
}
