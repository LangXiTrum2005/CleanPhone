package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3550a implements j$.time.temporal.t {
    @Override // j$.time.temporal.t
    public final Object i(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.a(j$.time.temporal.s.g());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
