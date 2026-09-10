package co;

import com.ironsource.C3414a2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lco/attabal;", "Lco/saneness;", "", "start", "endInclusive", "<init>", "(FF)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "beachfront", "(FF)Z", "isEmpty", "()Z", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "F", "_start", "arytenoidectomy", "_endInclusive", "dern", "()Ljava/lang/Float;", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal implements saneness<Float> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final float _endInclusive;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final float _start;

    public attabal(float f, float f2) {
        this._start = f;
        this._endInclusive = f2;
    }

    @Override // co.dern
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public Float marial() {
        return Float.valueOf(this._endInclusive);
    }

    public boolean beachfront(float a, float b) {
        return a <= b;
    }

    @Override // co.dern
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public Float wireman() {
        return Float.valueOf(this._start);
    }

    public boolean equals(Object other) {
        if (!(other instanceof attabal)) {
            return false;
        }
        if (isEmpty() && ((attabal) other).isEmpty()) {
            return true;
        }
        attabal attabalVar = (attabal) other;
        return this._start == attabalVar._start && this._endInclusive == attabalVar._endInclusive;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endInclusive);
    }

    @Override // co.saneness, co.dern
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // co.saneness
    public /* bridge */ /* synthetic */ boolean saneness(Comparable comparable, Comparable comparable2) {
        return beachfront(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
