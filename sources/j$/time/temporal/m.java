package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends TemporalAccessor {
    m h(long j, r rVar);

    /* JADX INFO: renamed from: i */
    m m(j$.time.h hVar);

    m l(long j, u uVar);

    default m c(long j, u uVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j, uVar);
    }
}
