package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class u extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ConcurrentHashMap f43124i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H f43125e;
    private final boolean f;
    private final HashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f43126h;

    u(H h2, boolean z2) {
        super(j$.time.temporal.s.f(), "ZoneText(" + h2 + ")");
        this.g = new HashMap();
        this.f43126h = new HashMap();
        Objects.requireNonNull(h2, "textStyle");
        this.f43125e = h2;
        this.f = z2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.t, j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        boolean zH;
        String[] strArr;
        ZoneId zoneId = (ZoneId) zVar.f(j$.time.temporal.s.g());
        if (zoneId == null) {
            return false;
        }
        String strS = zoneId.s();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessorD = zVar.d();
            String str = null;
            Map concurrentHashMap = null;
            if (this.f) {
                zH = 2;
            } else if (temporalAccessorD.d(j$.time.temporal.a.INSTANT_SECONDS)) {
                zH = zoneId.C().h(Instant.from(temporalAccessorD));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessorD.d(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (temporalAccessorD.d(aVar2)) {
                        LocalDateTime localDateTimeE0 = LocalDateTime.e0(j$.time.h.j0(temporalAccessorD.e(aVar)), j$.time.k.e0(temporalAccessorD.e(aVar2)));
                        if (zoneId.C().f(localDateTimeE0) == null) {
                            j$.time.zone.f fVarC = zoneId.C();
                            ZonedDateTime zonedDateTimeU = ZonedDateTime.U(localDateTimeE0, zoneId, null);
                            zH = fVarC.h(Instant.V(zonedDateTimeU.Q(), zonedDateTimeU.n().Y()));
                        } else {
                            zH = 2;
                        }
                    } else {
                        zH = 2;
                    }
                } else {
                    zH = 2;
                }
            }
            Locale localeC = zVar.c();
            H h2 = H.NARROW;
            H h3 = this.f43125e;
            if (h3 != h2) {
                ConcurrentHashMap concurrentHashMap2 = f43124i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strS);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(localeC)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strS);
                    String[] strArr2 = {strS, timeZone.getDisplayName(false, 1, localeC), timeZone.getDisplayName(false, 0, localeC), timeZone.getDisplayName(true, 1, localeC), timeZone.getDisplayName(true, 0, localeC), strS, strS};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(localeC, strArr2);
                    concurrentHashMap2.put(strS, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zH == 0) {
                    str = strArr[h3.p() + 1];
                } else if (zH == 1) {
                    str = strArr[h3.p() + 3];
                } else {
                    str = strArr[h3.p() + 5];
                }
            }
            if (str != null) {
                strS = str;
            }
        }
        sb.append(strS);
        return true;
    }

    @Override // j$.time.format.t
    protected final n a(w wVar) {
        n nVar;
        H h2 = H.NARROW;
        H h3 = this.f43125e;
        if (h3 == h2) {
            return super.a(wVar);
        }
        Locale localeI = wVar.i();
        boolean zK = wVar.k();
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        HashMap map = zK ? this.g : this.f43126h;
        Map.Entry entry = (Map.Entry) map.get(localeI);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar;
        }
        n nVarF = n.f(wVar);
        String[][] zoneStrings = DateFormatSymbols.getInstance(localeI).getZoneStrings();
        int length = zoneStrings.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (setA.contains(str)) {
                    nVarF.a(str, str);
                    String strA = I.a(str, localeI);
                    for (int i3 = h3 != H.FULL ? 2 : 1; i3 < strArr.length; i3 += 2) {
                        nVarF.a(strArr[i3], strA);
                    }
                }
                i2++;
            } else {
                map.put(localeI, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVarF)));
                return nVarF;
            }
        }
    }
}
